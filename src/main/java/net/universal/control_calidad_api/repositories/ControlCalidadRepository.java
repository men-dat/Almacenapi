package net.universal.control_calidad_api.repositories;

import net.universal.control_calidad_api.entities.ControlCalidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ControlCalidadRepository extends JpaRepository<ControlCalidad, Long> {
    List<ControlCalidad> findByResultado(String resultado);
}
