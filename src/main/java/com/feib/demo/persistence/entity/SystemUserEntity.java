package com.feib.demo.persistence.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;


@Entity
@Table(name = "SYS_USER")
@Data
public class SystemUserEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Integer id;

    @Basic
    private String account;

    @Basic
    private String password;

    @Basic
    private String authority;

}
