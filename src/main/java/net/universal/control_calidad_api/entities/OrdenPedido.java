package net.universal.control_calidad_api.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "orden_pedido")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrdenPedido extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_orden_pedido")
    private Long idOrdenPedido;

    @Column(nullable = false, length = 20)
    private String numeroPedido;  // Código interno (ej: OP-2025-001)

    @Column(nullable = false)
    private LocalDate fecha;

    @Column(length = 20)
    private String estado;

    // Relación con Proveedor (muchas órdenes pueden ser de un mismo proveedor)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_proveedor", nullable = false)
    private Proveedor proveedor;

    // Relación con detalles de pedido
    @OneToMany(mappedBy = "ordenPedido", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<DetalleOrdenPedido> detalles;
}
