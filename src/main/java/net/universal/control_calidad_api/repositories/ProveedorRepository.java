package net.universal.control_calidad_api.repositories;

import net.universal.control_calidad_api.entities.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {

    Optional<Proveedor> findByEmail(String email);
    Optional<Proveedor> findByCodigoEmpleado(String codigoEmpleado);
}
