package net.universal.control_calidad_api.controllers;

import net.universal.control_calidad_api.entities.MovimientoAlmacen;
import net.universal.control_calidad_api.services.contratos.impl.MovimientoAlmacenServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/movimientos")
public class MovimientoAlmacenController extends BaseController<MovimientoAlmacen, MovimientoAlmacenServiceImpl> {
    public MovimientoAlmacenController(MovimientoAlmacenServiceImpl movimientoAlmacenService) {
        super(movimientoAlmacenService);
    }
}
