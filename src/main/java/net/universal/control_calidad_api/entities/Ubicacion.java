package net.universal.control_calidad_api.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ubicacion")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ubicacion extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ubicacion")
    private Long idUbicacion;

    @Column(nullable = false, length = 100)
    private String descripcion;

    @Column(length = 20)
    private String estado;

    @Column(length = 20)
    private String estante;

    @Column(length = 20)
    private String seccion;

    @Column(length = 20)
    private String pasillo;

    @Column(length = 20)
    private String posicion;
}
