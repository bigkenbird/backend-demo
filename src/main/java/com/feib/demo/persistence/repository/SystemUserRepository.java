package com.feib.demo.persistence.repository;

import com.feib.demo.persistence.entity.SystemUserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SystemUserRepository extends CrudRepository<SystemUserEntity, Integer> {
    List<SystemUserEntity> findByAccount(String account);
}
