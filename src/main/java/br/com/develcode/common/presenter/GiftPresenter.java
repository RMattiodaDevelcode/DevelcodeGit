package br.com.develcode.common.presenter;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class GiftPresenter {

    private String name;
    private String section;
    private BigDecimal price;
    private BigDecimal grade;
}
