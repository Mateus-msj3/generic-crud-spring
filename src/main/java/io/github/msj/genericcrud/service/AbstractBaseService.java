package io.github.msj.genericcrud.service;

import io.github.msj.genericcrud.domain.BaseEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface AbstractBaseService<T extends BaseEntity, ID extends Serializable>{
     abstract T save(T entity);

     abstract List<T> findAll();

     abstract Optional<T> findById(ID entityId);

     abstract T update(T entity);

     abstract T updateById(T entity, ID entityId);

     abstract void delete(T entity);

     abstract void deleteById(ID entityId);

    abstract Page<T> findAll(Pageable pageable);

    abstract Optional<T> findOne(Example<T> example);

    abstract List<T> findAll(Example<T> example);

    abstract Iterable<T> findAll(Example<T> example, Sort sort);

    abstract Page<T> findAll(Example<T> example, Pageable pageable);

    abstract long count(Example<T> example);

    abstract long count();

    abstract boolean exists(Example<T> example);

}