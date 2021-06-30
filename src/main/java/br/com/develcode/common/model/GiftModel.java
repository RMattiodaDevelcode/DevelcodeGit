package br.com.develcode.common.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "TB_GIFT")
@Getter
@Setter
public class GiftModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SECTION")
    private String section;

    @Column(name = "PRICE")
    private BigDecimal price;

    @Column(name = "GRADE")
    private BigDecimal grade;

}
