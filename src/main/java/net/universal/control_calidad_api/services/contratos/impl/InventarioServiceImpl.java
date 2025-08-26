package net.universal.control_calidad_api.services.contratos.impl;

import net.universal.control_calidad_api.entities.Inventario;
import net.universal.control_calidad_api.repositories.InventarioRepository;
import net.universal.control_calidad_api.services.contratos.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class InventarioServiceImpl implements BaseService<Inventario> {

    private final InventarioRepository inventarioRepository;

    public InventarioServiceImpl(InventarioRepository inventarioRepository) {
        this.inventarioRepository = inventarioRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Inventario> findAll() throws Exception {
        try {
            return inventarioRepository.findAll();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Inventario findById(Long id) throws Exception {
        try {
            Optional<Inventario> entityOptional = inventarioRepository.findById(id);
            return entityOptional.get();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Inventario save(Inventario entity) throws Exception {
        try {
            return inventarioRepository.save(entity);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Inventario update(Long id, Inventario entity) throws Exception {
        try {
            Optional<Inventario> entityOptional = inventarioRepository.findById(id);
            Inventario entityUpdate = entityOptional.get();
            entityUpdate = inventarioRepository.save(entity);
            return entityUpdate;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean deleteById(Long id) throws Exception {
        try {
            if (inventarioRepository.existsById(id)) {
                inventarioRepository.deleteById(id);
                return true;
            } else {
                throw new Exception("No se encontró el registro");
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
