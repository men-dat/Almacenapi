package net.universal.control_calidad_api.controllers;

import net.universal.control_calidad_api.entities.Proveedor;
import net.universal.control_calidad_api.services.contratos.impl.ProveedorServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/proveedores")
public class ProveedorController extends BaseController<Proveedor, ProveedorServiceImpl> {
    public ProveedorController(ProveedorServiceImpl proveedorService) {
        super(proveedorService);
    }
}
