package net.universal.control_calidad_api.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "control_calidad")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ControlCalidad extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_control")
    private Long idControl;

    @Column(length = 20, nullable = false)
    private String resultado;

    @Column(length = 255)
    private String observaciones;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_detalle_recepcion", nullable = false)
    private DetalleRecepcion detalleRecepcion;

    // Rechazados
    @OneToMany(mappedBy = "controlCalidad", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private java.util.List<Rechazados> rechazados;
}
