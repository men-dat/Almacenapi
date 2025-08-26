package net.universal.control_calidad_api.services.contratos.impl;

import net.universal.control_calidad_api.entities.ControlCalidad;
import net.universal.control_calidad_api.repositories.ControlCalidadRepository;
import net.universal.control_calidad_api.services.contratos.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ControlCalidadServiceImpl implements BaseService<ControlCalidad> {

    private final ControlCalidadRepository controlCalidadRepository;

    public ControlCalidadServiceImpl(ControlCalidadRepository controlCalidadRepository) {
        this.controlCalidadRepository = controlCalidadRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<ControlCalidad> findAll() throws Exception {
        try {
            return controlCalidadRepository.findAll();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public ControlCalidad findById(Long id) throws Exception {
        try {
            Optional<ControlCalidad> entityOptional = controlCalidadRepository.findById(id);
            return entityOptional.get();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    @Transactional
    public ControlCalidad save(ControlCalidad entity) throws Exception {
        try {
            return controlCalidadRepository.save(entity);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    @Transactional
    public ControlCalidad update(Long id, ControlCalidad entity) throws Exception {
        try {
            Optional<ControlCalidad> entityOptional = controlCalidadRepository.findById(id);
            ControlCalidad entityUpdate = entityOptional.get();
            entityUpdate = controlCalidadRepository.save(entity);
            return entityUpdate;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean deleteById(Long id) throws Exception {
        try {
            if (controlCalidadRepository.existsById(id)) {
                controlCalidadRepository.deleteById(id);
                return true;
            } else {
                throw new Exception("No se encontró el registro");
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
