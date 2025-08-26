package net.universal.control_calidad_api.services.contratos.impl;

import net.universal.control_calidad_api.entities.Producto;
import net.universal.control_calidad_api.repositories.ProductoRepository;
import net.universal.control_calidad_api.services.contratos.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements BaseService<Producto> {

    private final ProductoRepository productoRepository;

    public ProductoServiceImpl(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Producto> findAll() throws Exception {
        try {
            return productoRepository.findAll();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Producto findById(Long id) throws Exception {
        try {
            Optional<Producto> entityOptional = productoRepository.findById(id);
            return entityOptional.get();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Producto save(Producto entity) throws Exception {
        try {
            return productoRepository.save(entity);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Producto update(Long id, Producto entity) throws Exception {
        try {
            Optional<Producto> entityOptional = productoRepository.findById(id);
            Producto entityUpdate = entityOptional.get();
            entityUpdate = productoRepository.save(entity);
            return entityUpdate;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean deleteById(Long id) throws Exception {
        try {
            if (productoRepository.existsById(id)) {
                productoRepository.deleteById(id);
                return true;
            } else {
                throw new Exception("No se encontró el registro");
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
