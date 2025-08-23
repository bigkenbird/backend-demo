/*
 * ===========================================================================
 * IBM Confidential
 * AIS Source Materials
 * (C) Copyright IBM Corp. 2025.
 * ===========================================================================
 */
package com.feib.demo.persistence.repository;

import org.springframework.data.repository.CrudRepository;

import com.feib.demo.persistence.entity.EmployeeEntity;

/**
 * <p>
 * 員工資料DAO
 * </p>
 * @author Eric Wei
 * @version 1.0, 2025年3月7日
 * @see
 * @since
 */
public interface EmployeeRepository extends CrudRepository<EmployeeEntity, String> {

    EmployeeEntity findByCode(String code);

    EmployeeEntity findByName(String name);

    EmployeeEntity findByCodeAndName(String code, String name);

}
