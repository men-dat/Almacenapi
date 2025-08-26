package net.universal.control_calidad_api.controllers;

import net.universal.control_calidad_api.entities.ControlCalidad;
import net.universal.control_calidad_api.services.contratos.impl.ControlCalidadServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/control-calidad")
public class ControlCalidadController extends BaseController<ControlCalidad, ControlCalidadServiceImpl> {
    public ControlCalidadController(ControlCalidadServiceImpl controlCalidadService) {
        super(controlCalidadService);
    }
}
