package io.github.msj.genericcrud.crud.service.impl;

import io.github.msj.genericcrud.crud.domain.Carro;
import io.github.msj.genericcrud.crud.repository.CarroRepository;
import io.github.msj.genericcrud.crud.service.CarroService;
import io.github.msj.genericcrud.repository.impl.AbstractBaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CarroServiceImpl extends AbstractBaseServiceImpl<Carro, Integer> implements CarroService {

    private CarroRepository carroRepository;

    public CarroServiceImpl(CarroRepository carroRepository) {
        super(carroRepository);
    }
}
