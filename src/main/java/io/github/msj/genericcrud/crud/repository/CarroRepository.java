package io.github.msj.genericcrud.crud.repository;

import io.github.msj.genericcrud.crud.domain.Carro;
import io.github.msj.genericcrud.repository.AbstractBaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends AbstractBaseRepository<Carro, Integer> {
}
