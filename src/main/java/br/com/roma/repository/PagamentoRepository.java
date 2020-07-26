package br.com.roma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.roma.domain.Cidade;

@Repository
public interface PagamentoRepository  extends JpaRepository<Cidade, Integer> {

}
