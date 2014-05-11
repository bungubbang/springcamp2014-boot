package com.springcamp.boot.web;

import com.springcamp.boot.BootSampleApplication;
import com.springcamp.boot.domain.People;
import com.springcamp.boot.service.PeopleRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by bungubbang
 * Email: sungyong.jung@sk.com
 * Date: 5/11/14
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = BootSampleApplication.class)
public class PeopleApiControllerTest {

    @Autowired PeopleRepository peopleRepository;

    @Test
    public void testPeopleList() throws Exception {
        List<People> peoples = peopleRepository.findAll();
        assertTrue(peoples.size() == 2);
    }
}
