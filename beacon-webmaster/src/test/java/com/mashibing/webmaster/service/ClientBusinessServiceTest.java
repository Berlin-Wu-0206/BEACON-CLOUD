package com.mashibing.webmaster.service;

import com.mashibing.webmaster.entity.ClientBusiness;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ClientBusinessServiceTest {

    @Autowired
    private ClientBusinessService clientBusinessService;

    @Test
    public void findAll() {
        List<ClientBusiness> list = clientBusinessService.findAll();
        System.out.println(list);
    }

    @Test
    public void findByUserId() {
    }
}