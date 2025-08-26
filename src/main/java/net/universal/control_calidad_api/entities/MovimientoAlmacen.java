package net.universal.control_calidad_api.entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "movimiento_almacen")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MovimientoAlmacen extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_movimiento")
    private Long idMovimiento;

    @Column(nullable = false)
    private LocalDate fechaMovimiento;

    @Column(nullable = false, length = 20)
    private String tipoMovimiento; // ENTRADA o SALIDA

    @Column(length = 255)
    private String observaciones;

    // Relación con Producto
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_producto", nullable = false)
    private Producto producto;

    // Relación con Inventario
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_inventario", nullable = false)
    private Inventario inventario;
}
