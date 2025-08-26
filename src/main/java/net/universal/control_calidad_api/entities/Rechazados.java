package net.universal.control_calidad_api.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "rechazados")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Rechazados extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rechazado")
    private Long idRechazado;

    @Column(nullable = false)
    private Integer cantidadRechazada;

    @Column(length = 100)
    private String motivo;

    // Relación con ControlCalidad
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_control", nullable = false)
    private ControlCalidad controlCalidad;
}
