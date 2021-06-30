package br.com.develcode.service;

import br.com.develcode.common.model.GiftModel;
import br.com.develcode.common.presenter.GiftPresenter;
import br.com.develcode.common.type.SectionType;
import br.com.develcode.data.dao.GiftDao;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class GiftService {

    @Autowired
    private GiftDao giftDao;

    public GiftPresenter findRandomGift() {
        GiftPresenter presenter = new GiftPresenter();

        GiftModel giftModel = giftDao.findRandomGift();
        BeanUtils.copyProperties(giftModel, presenter);

        if (SectionType.TOYS.getName().equalsIgnoreCase(presenter.getSection())) {
            presenter.setPrice(addDiscount(presenter.getPrice(), BigDecimal.valueOf(0.25)));
        }

        return presenter;
    }

    private BigDecimal addDiscount(BigDecimal price, BigDecimal percentMultiplier) {
        return price.subtract(price.multiply(percentMultiplier));
    }
}
