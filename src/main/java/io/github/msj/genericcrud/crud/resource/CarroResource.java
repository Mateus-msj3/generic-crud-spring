package io.github.msj.genericcrud.crud.resource;

import io.github.msj.genericcrud.crud.domain.Carro;
import io.github.msj.genericcrud.crud.service.CarroService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarroResource {

    private final CarroService carroService;

    public CarroResource(CarroService carroService) {
        this.carroService = carroService;
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Carro>> listaTodos() {
        return ResponseEntity.ok().body(carroService.findAll());
    }

    @PostMapping
    public ResponseEntity<Carro> salvar(@RequestBody Carro carro) {
        Carro carroSave = carroService.save(carro);
        return ResponseEntity.ok().body(carroSave);
    }
}
