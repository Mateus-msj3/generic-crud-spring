package io.github.msj.genericcrud.repository.impl;

import io.github.msj.genericcrud.domain.BaseEntity;
import io.github.msj.genericcrud.exception.ServiceException;
import io.github.msj.genericcrud.repository.AbstractBaseRepository;
import io.github.msj.genericcrud.service.AbstractBaseService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public abstract class AbstractBaseServiceImpl<T extends BaseEntity, ID extends Serializable>
        implements AbstractBaseService<T, ID> {

    private AbstractBaseRepository<T, ID> abstractBaseRepository;

    public AbstractBaseServiceImpl(AbstractBaseRepository<T, ID> abstractBaseRepository) {
        this.abstractBaseRepository = abstractBaseRepository;
    }

    @Override
    public T save(T entity) {
        return (T) abstractBaseRepository.save(entity);
    }

    @Override
    public List<T> findAll() {
        return abstractBaseRepository.findAll();
    }

    @Override
    public Optional<T> findById(ID entityId) {
        return abstractBaseRepository.findById(entityId);
    }

    @Override
    public T update(T entity) {
        return (T) abstractBaseRepository.save(entity);
    }

    @Override
    public T updateById(T entity, ID entityId) {
        Optional<T> optional = abstractBaseRepository.findById(entityId);
        if(optional.isPresent()){
            return (T) abstractBaseRepository.save(entity);
        }else{
            return null;
        }
    }

    @Override
    public void delete(T entity) {
        abstractBaseRepository.delete(entity);
    }

    @Override
    public void deleteById(ID entityId) {
        abstractBaseRepository.deleteById(entityId);
    }

    protected void validate(T entity) throws ServiceException {
    }

    protected void validateDelete(T entity) throws ServiceException {
    }

    protected void beforeSave(T entity) throws ServiceException {
    }

    protected void afterSave(T entity) throws ServiceException {
    }

    protected void beforeUpdate(T entity) throws ServiceException {
    }

    protected void afterUpdate(T entity) throws ServiceException {
    }

    protected void beforeDelete(T entity) throws ServiceException {
    }

    protected void afterDelete(T entity) throws ServiceException {
    }

    @Override
    public Page<T> findAll(Pageable pageable) {
        return abstractBaseRepository.findAll(pageable);
    }

    @Override
    public Optional<T> findOne(Example<T> example) {
        return abstractBaseRepository.findOne(example);
    }

    @Override
    public List<T> findAll(Example<T> example) {
        return abstractBaseRepository.findAll(example);
    }

    @Override
    public Iterable<T> findAll(Example<T> example, Sort sort) {
        return abstractBaseRepository.findAll(example, sort);
    }

    @Override
    public Page<T> findAll(Example<T> example, Pageable pageable) {
        return abstractBaseRepository.findAll(example, pageable);
    }

    @Override
    public long count(Example<T> example) {
        return abstractBaseRepository.count(example);
    }

    @Override
    public boolean exists(Example<T> example) {
        return abstractBaseRepository.exists(example);
    }


    @Override
    public long count(){
        return abstractBaseRepository.count();
    }

}
