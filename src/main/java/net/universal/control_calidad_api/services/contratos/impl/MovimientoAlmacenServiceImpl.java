package net.universal.control_calidad_api.services.contratos.impl;

import net.universal.control_calidad_api.entities.MovimientoAlmacen;
import net.universal.control_calidad_api.repositories.MovimientoAlmacenRepository;
import net.universal.control_calidad_api.services.contratos.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class MovimientoAlmacenServiceImpl implements BaseService<MovimientoAlmacen> {

    private final MovimientoAlmacenRepository movimientoAlmacenRepository;

    public MovimientoAlmacenServiceImpl(MovimientoAlmacenRepository movimientoAlmacenRepository) {
        this.movimientoAlmacenRepository = movimientoAlmacenRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<MovimientoAlmacen> findAll() throws Exception {
        try {
            return movimientoAlmacenRepository.findAll();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public MovimientoAlmacen findById(Long id) throws Exception {
        try {
            Optional<MovimientoAlmacen> entityOptional = movimientoAlmacenRepository.findById(id);
            return entityOptional.get();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    @Transactional
    public MovimientoAlmacen save(MovimientoAlmacen entity) throws Exception {
        try {
            return movimientoAlmacenRepository.save(entity);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    @Transactional
    public MovimientoAlmacen update(Long id, MovimientoAlmacen entity) throws Exception {
        try {
            Optional<MovimientoAlmacen> entityOptional = movimientoAlmacenRepository.findById(id);
            MovimientoAlmacen entityUpdate = entityOptional.get();
            entityUpdate = movimientoAlmacenRepository.save(entity);
            return entityUpdate;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean deleteById(Long id) throws Exception {
        try {
            if (movimientoAlmacenRepository.existsById(id)) {
                movimientoAlmacenRepository.deleteById(id);
                return true;
            } else {
                throw new Exception("No se encontró el registro");
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
