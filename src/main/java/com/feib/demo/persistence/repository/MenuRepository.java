package com.feib.demo.persistence.repository;

import com.feib.demo.model.Menu;
import com.feib.demo.persistence.entity.MenuEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MenuRepository extends CrudRepository<MenuEntity, Integer> {

    List<MenuEntity> findByParentId(int i);
}
