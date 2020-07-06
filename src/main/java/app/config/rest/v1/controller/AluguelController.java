package app.config.rest.v1.controller;

import app.config.dto.AluguelDTO;
import app.domain.entities.Aluguel;
import app.service.AluguelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.sql.SQLException;
import java.util.List;

/*! \brief AluguelController */
/*! \details A classe AluguelController intermedia o acesso do programa ao banco de dados, buscando um ou mais objetos alugueis, com base na estrutura de objeto definida em AluguelDTO.*/
/*! \author Vinícius Lora, José Ricardo Bock */
/*! \since  28/05/2020 */
/*! \date  31/05/2020 */

@RestController
public class AluguelController {

    @Autowired
    AluguelService aluguelService;

    @GetMapping("/alugueis")
    public List<AluguelDTO> getAlugueis() {
/// Este método invoca a classe que trata direto com o banco (aluguelService) e retorna uma lista de objetos do tipo AluguelDTO que contém todos os registros de aluguéis contidos no banco de dados.
        return aluguelService.getAlugueis();
    }

    @GetMapping("/alugueis/{id}")
    public AluguelDTO getAluguel(@PathVariable int id) {
/// Este método invoca a classe que trata direto com o banco (aluguelService) e retorna um objeto do tipo AluguelDTO referente ao ID informado como parâmetro.

        return aluguelService.getAluguel(id);
    }

    @PostMapping("/aluguel")
    public void setAluguel(@Valid @RequestBody Aluguel aluguel) throws SQLException {
/// Este método recebe um objeto Aluguel, e utiliza a classe aluguelService para adicionar este objeto ao banco. <br>
/// Caso não consiga, uma mensagem de erro é apresentada.
        try {
            aluguelService.setAluguel(aluguel);
        }catch (SQLException ex){
            throw ex;
        }
    }
}
