package net.universal.control_calidad_api.entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "recepcion_mercaderia")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RecepcionMercaderia extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_recepcion")
    private Long idRecepcion;

    @Column(nullable = false)
    private LocalDate fechaRecepcion;

    @Column(length = 20)
    private String estado;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_orden_pedido", nullable = false)
    private OrdenPedido ordenPedido;


    @OneToMany(mappedBy = "recepcionMercaderia", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<DetalleRecepcion> detalles;
}
