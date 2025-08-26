package net.universal.control_calidad_api.controllers;

import net.universal.control_calidad_api.entities.Producto;
import net.universal.control_calidad_api.services.contratos.impl.ProductoServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/productos")
public class ProductoController extends BaseController<Producto, ProductoServiceImpl> {
    public ProductoController(ProductoServiceImpl productoService) {
        super(productoService);
    }
}
