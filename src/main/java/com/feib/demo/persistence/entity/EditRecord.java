package com.feib.demo.persistence.entity;

import com.fasterxml.jackson.databind.JsonNode;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.io.Serializable;

@Entity
@Table(name = "EDITRECORD")
@Data
public class EditRecord implements Serializable {

    @Id
    private Long id;

    @Basic
    private String code;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(columnDefinition = "json")
    private JsonNode record;

    @Basic
    private String author;


}
