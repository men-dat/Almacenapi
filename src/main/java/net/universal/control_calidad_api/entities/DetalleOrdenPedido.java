package net.universal.control_calidad_api.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "detalle_orden_pedido")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DetalleOrdenPedido extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle_orden_pedido")
    private Long idDetalleOrdenPedido;

    @Column(nullable = false)
    private Integer cantidad;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_orden_pedido", nullable = false)
    private OrdenPedido ordenPedido;

//(fetch = FetchType.LAZY) =>cuando cresca el proyecto
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_producto", nullable = false)
    private Producto producto;
}
