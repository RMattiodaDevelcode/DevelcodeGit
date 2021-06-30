package br.com.develcode.service;

import br.com.develcode.common.model.GiftModel;
import br.com.develcode.common.presenter.GiftPresenter;
import br.com.develcode.data.dao.GiftDao;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class GiftService {

    @Autowired
    private GiftDao giftDao;

    public GiftPresenter findRandomGift(){
        GiftPresenter presenter = new GiftPresenter();

        GiftModel giftModel = giftDao.findRandomGift();
        BeanUtils.copyProperties(giftModel, presenter);

        if(new BigDecimal(3.0).compareTo(giftModel.getGrade()) < 3.0){
            return this.findRandomGift();
        }

        return presenter;
    }
}
