package app.config.rest.v1.controller;

import app.config.dto.CorridasDTO;
import app.domain.entities.Corridas;
import app.service.CorridasService;
import org.hibernate.exception.GenericJDBCException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/*! \brief CorridasController */
/*! \details A classe CorridasController intermedia o acesso do programa ao banco de dados, buscando um ou mais objetos corridas, com base na estrutura de objeto definida em CorridasDTO.*/
/*! \author Vinícius Lora, José Ricardo Bock */
/*! \since  28/05/2020 */
/*! \date  31/05/2020 */

@RestController
public class CorridasController {

    @Autowired
    CorridasService corridasService;

    @GetMapping("/corridas")
    public List<CorridasDTO> getCorridas() {
/// Este método invoca a classe que trata direto com o banco (corridasService) e retorna uma lista de objetos do tipo CorridasDTO que contém todos os registros de corridas contidas no banco de dados.
        return corridasService.getCorridas();
    }

    @GetMapping("/corridas/{id}")
    public CorridasDTO getCorrida(@PathVariable int id) {
/// Este método invoca a classe que trata direto com o banco (corridasService) e retorna um objeto do tipo CorridasDTO referente ao ID informado como parâmetro.
        return corridasService.getCorrida(id);
    }

    @PostMapping("/corridas")
    public void setCorrida(@Valid @RequestBody Corridas corrida) throws GenericJDBCException{
/// Este método recebe um objeto do tipo Corridas, e utiliza a classe corridasService para adicionar este objeto ao banco. <br>
/// Caso não consiga, uma mensagem de erro é apresentada.
        try {
            corridasService.setCorrida(corrida);
        }catch (GenericJDBCException ex){
            throw ex;
        }

    }
}
