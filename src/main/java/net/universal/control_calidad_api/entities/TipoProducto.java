package net.universal.control_calidad_api.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tipo_producto")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TipoProducto extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_producto")
    private Long idTipoProducto;

    @Column(nullable = false, length = 100)
    private String descripcion;

    @Column(length = 20)
    private String estado;
}
