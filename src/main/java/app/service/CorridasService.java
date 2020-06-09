package app.service;

import app.config.dto.CorridasDTO;
import app.domain.entities.Corridas;
import org.hibernate.exception.GenericJDBCException;

import java.util.List;

public interface CorridasService {

    public List<CorridasDTO> getCorridas();

    public CorridasDTO getCorrida(int idCorrida);

    public void setCorrida(Corridas corrida) throws GenericJDBCException;

}
