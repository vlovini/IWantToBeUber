package app.service;

import app.config.dto.AluguelDTO;
import app.domain.entities.Aluguel;

import java.sql.SQLException;
import java.util.List;

public interface AluguelService {

    public List<AluguelDTO> getAlugueis();

    public AluguelDTO getAluguel(int idAluguel);

    public void setAluguel(Aluguel aluguel) throws SQLException;

}
