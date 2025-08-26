package net.universal.control_calidad_api.services.contratos.impl;

import net.universal.control_calidad_api.entities.Proveedor;
import net.universal.control_calidad_api.repositories.ProveedorRepository;
import net.universal.control_calidad_api.services.contratos.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service

public class ProveedorServiceImpl implements BaseService<Proveedor> {
 // isimos  nuestra inyeccion de dependencias   con ProveedorRepository
    private final ProveedorRepository proveedorRepository;
    public ProveedorServiceImpl(ProveedorRepository proveedorRepository) {
        this.proveedorRepository = proveedorRepository;

    }






    @Override
    @Transactional(readOnly = true) //solo lectura no ingresar datos
    public List<Proveedor> findAll() throws Exception {
        try {
            List<Proveedor> entities = proveedorRepository.findAll();//lista
            return entities;

        }catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }




//busqueda individual
    @Override
    @Transactional(readOnly = true)
    public Proveedor findById(Long id) throws Exception {
        try {//uno o ninguno
            Optional<Proveedor> entityOptional = proveedorRepository.findById(id);
            return entityOptional.get();//que nos proporcione  los datos que tiene
        }catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }






//aqui se  va crear el registro ya  no va el readonly
    @Override
    @Transactional
    public Proveedor save(Proveedor entity) throws Exception {
        try {//grabar un registro en cualquier entidad
            entity = proveedorRepository.save(entity);
            return entity;
        }catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }





    @Override
    @Transactional
    public Proveedor update(Long id, Proveedor entity) throws Exception {
        try {
            Optional<Proveedor> entityOptional = proveedorRepository.findById(id);
            Proveedor entityUpdate = entityOptional.get();
            entityUpdate = proveedorRepository.save(entity);
            return entityUpdate;
        }catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }









    @Override
    @Transactional
    public boolean deleteById(Long id) throws Exception {
        try {
            if(proveedorRepository.existsById(id)) {
                proveedorRepository.deleteById(id);
                return true;
            } else {
                throw new Exception("No se encontro el registro");
            }
        }catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
