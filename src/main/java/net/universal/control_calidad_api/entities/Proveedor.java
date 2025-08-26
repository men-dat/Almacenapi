package net.universal.control_calidad_api.entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "proveedor")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Proveedor extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // PK
    @Column(name = "id_proveedor")
    private Long idProveedor;
//como es de  la  misma empresa el almacen central y la  sucursal y no hay externos
//lo conveniente es un codigo quien trae el empleado aveces son dos  o tres que  conducen
//el camion asi que  ponerles un codigo
    @Column(name = "codigo_empleado", unique = true, nullable = false, length = 20)
    private String codigoEmpleado;  // código único del empleado

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, columnDefinition = "varchar(60)")
    private String apellido;

    @Column(length = 15)
    private String telefono;

    @Column(unique = true, length = 100)
    private String email;

    @Column(length = 20)
    private String estado;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;
}
