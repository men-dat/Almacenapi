package net.universal.control_calidad_api.services.contratos.impl;

import net.universal.control_calidad_api.entities.RecepcionMercaderia;
import net.universal.control_calidad_api.repositories.RecepcionMercaderiaRepository;
import net.universal.control_calidad_api.services.contratos.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class RecepcionMercaderiaServiceImpl implements BaseService<RecepcionMercaderia> {

    private final RecepcionMercaderiaRepository recepcionMercaderiaRepository;

    public RecepcionMercaderiaServiceImpl(RecepcionMercaderiaRepository recepcionMercaderiaRepository) {
        this.recepcionMercaderiaRepository = recepcionMercaderiaRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<RecepcionMercaderia> findAll() throws Exception {
        try {
            return recepcionMercaderiaRepository.findAll();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public RecepcionMercaderia findById(Long id) throws Exception {
        try {
            Optional<RecepcionMercaderia> entityOptional = recepcionMercaderiaRepository.findById(id);
            return entityOptional.get();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    @Transactional
    public RecepcionMercaderia save(RecepcionMercaderia entity) throws Exception {
        try {
            return recepcionMercaderiaRepository.save(entity);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    @Transactional
    public RecepcionMercaderia update(Long id, RecepcionMercaderia entity) throws Exception {
        try {
            Optional<RecepcionMercaderia> entityOptional = recepcionMercaderiaRepository.findById(id);
            RecepcionMercaderia entityUpdate = entityOptional.get();
            entityUpdate = recepcionMercaderiaRepository.save(entity);
            return entityUpdate;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean deleteById(Long id) throws Exception {
        try {
            if (recepcionMercaderiaRepository.existsById(id)) {
                recepcionMercaderiaRepository.deleteById(id);
                return true;
            } else {
                throw new Exception("No se encontró el registro");
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
