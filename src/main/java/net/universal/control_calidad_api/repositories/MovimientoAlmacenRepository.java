package net.universal.control_calidad_api.repositories;

import net.universal.control_calidad_api.entities.MovimientoAlmacen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface MovimientoAlmacenRepository extends JpaRepository<MovimientoAlmacen, Long> {
    List<MovimientoAlmacen> findByFechaMovimiento(LocalDate fecha);
    List<MovimientoAlmacen> findByTipoMovimiento(String tipoMovimiento);
}
