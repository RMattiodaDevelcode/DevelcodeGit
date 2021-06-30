package br.com.develcode.api.controller;

import br.com.develcode.common.presenter.GiftPresenter;
import br.com.develcode.service.GiftService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "gift")
public class GiftController {

    private Logger LOG = LoggerFactory.getLogger(GiftController.class);

    @Autowired
    private GiftService giftService;

    @GetMapping(value = "my-gift")
    public ResponseEntity<GiftPresenter> searchGift(){
        LOG.info("Buscando sugestão de presente");
        return ResponseEntity.status(HttpStatus.OK).body(giftService.findRandomGift());
    }
}
