package net.universal.control_calidad_api.services.contratos;

import java.util.List;

public interface BaseService<E> {
    public List<E> findAll() throws Exception;
    public E findById(Long id) throws Exception;
    public E save(E entity) throws Exception;
    public E update(Long id, E entity) throws Exception;
    public boolean deleteById(Long id) throws Exception;
}
//el crud completo de  nuestro contrato