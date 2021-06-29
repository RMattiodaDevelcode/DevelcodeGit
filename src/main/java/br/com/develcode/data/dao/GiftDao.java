package br.com.develcode.data.dao;

import br.com.develcode.common.builder.GiftModelBuilder;
import br.com.develcode.common.model.GiftModel;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class GiftDao {

    private List<GiftModel> gifts;

    private static final String TOYS = "brinquedos";
    private static final String CARS = "carros";
    private static final String ELECTRONIC = "eletrônicos";
    private static final String KITCHEN = "cozinha";
    private static final String BATHROOM = "banheiros";
    private static final String ACCESSORIES = "acessórios";

    @PostConstruct
    public void init(){
        gifts = new ArrayList<>();
        gifts.add(new GiftModelBuilder().name("").section(TOYS).price(new BigDecimal("")).grade(new BigDecimal("")).build());
        gifts.add(new GiftModelBuilder().name("").section(TOYS).price(new BigDecimal("")).grade(new BigDecimal("")).build());
        gifts.add(new GiftModelBuilder().name("").section(TOYS).price(new BigDecimal("")).grade(new BigDecimal("")).build());
        gifts.add(new GiftModelBuilder().name("").section(CARS).price(new BigDecimal("")).grade(new BigDecimal("")).build());
        gifts.add(new GiftModelBuilder().name("").section(CARS).price(new BigDecimal("")).grade(new BigDecimal("")).build());
        gifts.add(new GiftModelBuilder().name("").section(ELECTRONIC).price(new BigDecimal("")).grade(new BigDecimal("")).build());
        gifts.add(new GiftModelBuilder().name("").section(ELECTRONIC).price(new BigDecimal("")).grade(new BigDecimal("")).build());
        gifts.add(new GiftModelBuilder().name("").section(KITCHEN).price(new BigDecimal("")).grade(new BigDecimal("")).build());
        gifts.add(new GiftModelBuilder().name("").section(KITCHEN).price(new BigDecimal("")).grade(new BigDecimal("")).build());
        gifts.add(new GiftModelBuilder().name("").section(BATHROOM).price(new BigDecimal("")).grade(new BigDecimal("")).build());
        gifts.add(new GiftModelBuilder().name("").section(ACCESSORIES).price(new BigDecimal("")).grade(new BigDecimal("")).build());

    }

    public GiftModel findRandomGift() {

        int size = gifts.size();

        Random random = new Random();

        return null;
    }
}
