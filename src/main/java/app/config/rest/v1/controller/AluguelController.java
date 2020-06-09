package app.config.rest.v1.controller;

import app.config.dto.AluguelDTO;
import app.domain.entities.Aluguel;
import app.service.AluguelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.sql.SQLException;
import java.util.List;

@RestController
public class AluguelController {

    @Autowired
    AluguelService aluguelService;

    @GetMapping("/alugueis")
    public List<AluguelDTO> getAlugueis() {
        return aluguelService.getAlugueis();
    }

    @GetMapping("/alugueis/{id}")
    public AluguelDTO getAluguel(@PathVariable int id) {

        return aluguelService.getAluguel(id);
    }

    @PostMapping("/aluguel")
    public void setCorrida(@Valid @RequestBody Aluguel aluguel) throws SQLException {
        try {
            aluguelService.setAluguel(aluguel);
        }catch (SQLException ex){
            throw ex;
        }
    }
}
