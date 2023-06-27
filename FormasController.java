package br.com.unigoias.formas.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unigoias.formas.model.Circulo;
import br.com.unigoias.formas.model.Retangulo;

@RestController
@RequestMapping("/formas")
public class FormasController {

    @PostMapping("/retangulos/area")
    public String calcularAreaRetangulo(@RequestBody Retangulo retangulo) {
        double area = retangulo.calcularArea();
        return "{\"area\": " + area + "}";
    }

    @PostMapping("/circulo")
    public Circulo getAreaCirculo(@RequestBody Circulo circulo) {
        return circulo;
    }
}
