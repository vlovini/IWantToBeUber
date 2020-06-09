package app.repository;

import app.domain.views.DetalhesVeiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalhesVeiculoViewRepository extends JpaRepository<DetalhesVeiculo, String>, JpaSpecificationExecutor<DetalhesVeiculo> {

}
