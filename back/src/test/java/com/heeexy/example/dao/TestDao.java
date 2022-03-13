package com.heeexy.example.dao;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDao {

    @Autowired
    ArticleDao articleDao ;

    @Test
    public void A(){
        JSONObject jsonObject = new JSONObject();
        //articleDao.listArticle(jsonObject);
        int i = articleDao.countArticle(jsonObject);
        System.out.println(i);
    }
}


