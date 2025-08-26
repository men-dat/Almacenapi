package net.universal.control_calidad_api.controllers;

import net.universal.control_calidad_api.entities.Inventario;
import net.universal.control_calidad_api.services.contratos.impl.InventarioServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/inventarios")
public class InventarioController extends BaseController<Inventario, InventarioServiceImpl> {
    public InventarioController(InventarioServiceImpl inventarioService) {
        super(inventarioService);
    }
}
