/*
 * ===========================================================================
 * IBM Confidential
 * AIS Source Materials
 * (C) Copyright IBM Corp. 2025.
 * ===========================================================================
 */
package com.feib.demo.persistence.repository;

import com.feib.demo.persistence.entity.ReviewEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

/**
 * <p>
 * 員工資料DAO
 * </p>
 * @author Eric Wei
 * @version 1.0, 2025年3月7日
 * @see
 * @since
 */
public interface ReviewRepository extends CrudRepository<ReviewEntity, Long>, QueryByExampleExecutor<ReviewEntity> {


}
