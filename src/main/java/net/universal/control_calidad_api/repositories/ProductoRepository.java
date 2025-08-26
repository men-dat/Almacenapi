package net.universal.control_calidad_api.repositories;

import net.universal.control_calidad_api.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // Buscar productos por estado
    java.util.List<Producto> findByEstado(String estado);
}
