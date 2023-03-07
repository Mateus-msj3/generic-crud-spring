package io.github.msj.genericcrud.repository;

import io.github.msj.genericcrud.domain.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface AbstractBaseRepository<T extends BaseEntity, ID extends Serializable>
        extends JpaRepository<T, ID> {

}
