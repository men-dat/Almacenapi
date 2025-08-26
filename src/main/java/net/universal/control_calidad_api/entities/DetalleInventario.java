package net.universal.control_calidad_api.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "detalle_inventario")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DetalleInventario extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle_inventario")
    private Long idDetalleInventario;

    @Column(nullable = false)
    private Integer cantidad;

    @Column(nullable = false, length = 20)
    private String tipoMovimiento;

    // Relación con Inventario
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_inventario", nullable = false)
    private Inventario inventario;
}
