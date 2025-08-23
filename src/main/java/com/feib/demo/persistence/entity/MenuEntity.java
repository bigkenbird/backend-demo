package com.feib.demo.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;


@Entity
@Table(name = "MENU")
@Data
public class MenuEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Integer id;

    @Basic
    @Column(name="PARENTID")
    private Integer parentId;

    /** 功能名稱 */
    @Basic
    private String label;

    /** 功能代碼 */
    @Basic
    @Column(name="MENUIXD")
    private String menuIxd;

    /** 功能連結 */
    @Basic
    private String url;

    /** 順序 */
    @Basic
    private int sort;

    /** 功能關閉 */
    @Basic
    private boolean disabled;

}
