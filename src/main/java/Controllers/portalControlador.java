package Controllers;


import clases.Alquiler;
import clases.Cancha;
import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import servicios.CanchaServicio;

@RestController
@RequestMapping("/api/cancha")
@AllArgsConstructor
public class portalControlador {

    private final CanchaServicio canchaServicio;

    @PostMapping
    public Alquiler saveCancha(@RequestBody Alquiler alquiler){
        return canchaServicio.GuardarCancha(alquiler);

    }




}
