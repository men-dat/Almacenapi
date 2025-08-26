package net.universal.control_calidad_api.controllers;

import net.universal.control_calidad_api.entities.RecepcionMercaderia;
import net.universal.control_calidad_api.services.contratos.impl.RecepcionMercaderiaServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/recepciones")
public class RecepcionMercaderiaController extends BaseController<RecepcionMercaderia, RecepcionMercaderiaServiceImpl> {
    public RecepcionMercaderiaController(RecepcionMercaderiaServiceImpl recepcionMercaderiaService) {
        super(recepcionMercaderiaService);
    }
}
