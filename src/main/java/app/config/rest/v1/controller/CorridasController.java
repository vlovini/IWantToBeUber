package app.config.rest.v1.controller;

import app.config.dto.CorridasDTO;
import app.domain.entities.Corridas;
import app.service.CorridasService;
import org.hibernate.exception.GenericJDBCException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CorridasController {

    @Autowired
    CorridasService corridasService;

    @GetMapping("/corridas")
    public List<CorridasDTO> getCorridas() {
        return corridasService.getCorridas();
    }

    @GetMapping("/corridas/{id}")
    public CorridasDTO getCorrida(@PathVariable int id) {
        return corridasService.getCorrida(id);
    }

    @PostMapping("/corridas")
    public void setCorrida(@Valid @RequestBody Corridas corrida) throws GenericJDBCException{
        try {
            corridasService.setCorrida(corrida);
        }catch (GenericJDBCException ex){
            throw ex;
        }

    }
}
