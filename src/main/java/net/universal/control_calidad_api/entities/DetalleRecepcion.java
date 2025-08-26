package net.universal.control_calidad_api.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "detalle_recepcion")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DetalleRecepcion extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle_recepcion")
    private Long idDetalleRecepcion;

    @Column(nullable = false)
    private Integer cantidadRecibida;

    // Relación con RecepcionMercaderia
    // cuando crescamos jsjs (fetch = FetchType.LAZY)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_recepcion", nullable = false)
    private RecepcionMercaderia recepcionMercaderia;

    // Relación con Producto
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_producto", nullable = false)
    private Producto producto;

    // Relación con ControlCalidad
    @OneToOne(mappedBy = "detalleRecepcion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private ControlCalidad controlCalidad;
}
