package com.feib.demo.persistence.entity;

import com.feib.demo.model.DataGridCell;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;


@Data
@Entity
@Table(name = "REVIEW")
public class ReviewEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SERIAL")
    private Long serial;

    @Basic
    private String tableName;

    @Basic
    private String code;

    @Basic
    private String modifiedData;

    @Basic
    private String reviewer;

    @Basic
    private String submitter;

    @Basic
    private Integer status;

}
