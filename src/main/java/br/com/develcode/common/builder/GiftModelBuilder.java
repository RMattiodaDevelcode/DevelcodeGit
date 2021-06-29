package br.com.develcode.common.builder;

import br.com.develcode.common.model.GiftModel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;

@Getter
@Setter
public class GiftModelBuilder {

    private String name;
    private String section;
    private BigDecimal price;
    private BigDecimal grade;

    public GiftModelBuilder name(String name){
        this.name = name;
        return this;
    }

    public GiftModelBuilder section(String section){
        this.section = section;
        return this;
    }

    public GiftModelBuilder price(BigDecimal price){
        this.price = price;
        return this;
    }

    public GiftModelBuilder grade(BigDecimal grade){
        this.grade = grade;
        return this;
    }

    public GiftModel build(){
        GiftModel giftModel = new GiftModel();
        BeanUtils.copyProperties(this, giftModel);
        return giftModel;
    }
}
