package br.com.develcode.data.dao;

import br.com.develcode.common.builder.GiftModelBuilder;
import br.com.develcode.common.model.GiftModel;
import br.com.develcode.common.type.SectionType;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class GiftDao {

    private List<GiftModel> gifts;

    @PostConstruct
    public void init() {
        gifts = new ArrayList<>();
        gifts.add(new GiftModelBuilder().name("Galinha pintadinha").section(SectionType.TOYS.getName()).price(new BigDecimal("506.0")).grade(new BigDecimal("2.0")).build());
        gifts.add(new GiftModelBuilder().name("Lego star wars").section(SectionType.TOYS.getName()).price(new BigDecimal("2894.0")).grade(new BigDecimal("4.0")).build());
        gifts.add(new GiftModelBuilder().name("Carrinho de controle remoto a gasolina").section(SectionType.TOYS.getName()).price(new BigDecimal("1745.0")).grade(new BigDecimal("3.5")).build());
        gifts.add(new GiftModelBuilder().name("Amortecedor para carro rebaixado").section(SectionType.CARS.getName()).price(new BigDecimal("735.0")).grade(new BigDecimal("1.0")).build());
        gifts.add(new GiftModelBuilder().name("Turbo do Vin Diesel").section(SectionType.CARS.getName()).price(new BigDecimal("8691.0")).grade(new BigDecimal("2.8")).build());
        gifts.add(new GiftModelBuilder().name("IPhone 3000 direto do futuro").section(SectionType.ELECTRONIC.getName()).price(new BigDecimal("5799.0")).grade(new BigDecimal("5.0")).build());
        gifts.add(new GiftModelBuilder().name("Óculos de realidade virtual").section(SectionType.ELECTRONIC.getName()).price(new BigDecimal("7536.0")).grade(new BigDecimal("4.9")).build());
        gifts.add(new GiftModelBuilder().name("Geladeira cuspidora de gelo").section(SectionType.KITCHEN.getName()).price(new BigDecimal("6358.0")).grade(new BigDecimal("3.7")).build());
        gifts.add(new GiftModelBuilder().name("Fogão com chamas do inferno").section(SectionType.KITCHEN.getName()).price(new BigDecimal("6475.0")).grade(new BigDecimal("4.3")).build());
        gifts.add(new GiftModelBuilder().name("Privada do Olimpo").section(SectionType.BATHROOM.getName()).price(new BigDecimal("5464.0")).grade(new BigDecimal("1.6")).build());
        gifts.add(new GiftModelBuilder().name("Smart watch maneiro").section(SectionType.ACCESSORIES.getName()).price(new BigDecimal("7653.0")).grade(new BigDecimal("4.1")).build());
    }

    public GiftModel findRandomGift() {

        int size = gifts.size();

        Random random = new Random();
        int index = random.nextInt(size);

        return gifts.get(index);
    }
}
