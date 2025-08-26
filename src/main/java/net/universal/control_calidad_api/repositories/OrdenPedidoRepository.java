package net.universal.control_calidad_api.repositories;

import net.universal.control_calidad_api.entities.OrdenPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdenPedidoRepository extends JpaRepository<OrdenPedido, Long> {
    List<OrdenPedido> findByEstado(String estado);
    List<OrdenPedido> findByProveedorIdProveedor(Long idProveedor);
}
