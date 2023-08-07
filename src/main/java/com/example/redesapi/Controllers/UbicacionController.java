package com.example.redesapi.Controllers;

import com.example.redesapi.Services.UbicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ubicaciones")
public class UbicacionController {

    @Autowired
    UbicacionService ubicacionService;
}
