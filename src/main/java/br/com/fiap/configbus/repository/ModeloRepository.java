package br.com.fiap.configbus.repository;

import br.com.fiap.configbus.model.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModeloRepository extends JpaRepository<Modelo, Long> {
}
