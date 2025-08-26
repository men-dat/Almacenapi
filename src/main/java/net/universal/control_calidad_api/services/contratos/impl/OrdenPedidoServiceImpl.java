package net.universal.control_calidad_api.services.contratos.impl;

import net.universal.control_calidad_api.entities.OrdenPedido;
import net.universal.control_calidad_api.repositories.OrdenPedidoRepository;
import net.universal.control_calidad_api.services.contratos.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class OrdenPedidoServiceImpl implements BaseService<OrdenPedido> {

    private final OrdenPedidoRepository ordenPedidoRepository;

    public OrdenPedidoServiceImpl(OrdenPedidoRepository ordenPedidoRepository) {
        this.ordenPedidoRepository = ordenPedidoRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<OrdenPedido> findAll() throws Exception {
        try {
            return ordenPedidoRepository.findAll();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public OrdenPedido findById(Long id) throws Exception {
        try {
            Optional<OrdenPedido> entityOptional = ordenPedidoRepository.findById(id);
            return entityOptional.get();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    @Transactional
    public OrdenPedido save(OrdenPedido entity) throws Exception {
        try {
            return ordenPedidoRepository.save(entity);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    @Transactional
    public OrdenPedido update(Long id, OrdenPedido entity) throws Exception {
        try {
            Optional<OrdenPedido> entityOptional = ordenPedidoRepository.findById(id);
            OrdenPedido entityUpdate = entityOptional.get();
            entityUpdate = ordenPedidoRepository.save(entity);
            return entityUpdate;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean deleteById(Long id) throws Exception {
        try {
            if (ordenPedidoRepository.existsById(id)) {
                ordenPedidoRepository.deleteById(id);
                return true;
            } else {
                throw new Exception("No se encontró el registro");
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
