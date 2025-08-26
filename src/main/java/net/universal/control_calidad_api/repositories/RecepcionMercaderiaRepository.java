package net.universal.control_calidad_api.repositories;

import net.universal.control_calidad_api.entities.RecepcionMercaderia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecepcionMercaderiaRepository extends JpaRepository<RecepcionMercaderia, Long> {
    List<RecepcionMercaderia> findByEstado(String estado);
    List<RecepcionMercaderia> findByOrdenPedidoIdOrdenPedido(Long idOrdenPedido);
}
