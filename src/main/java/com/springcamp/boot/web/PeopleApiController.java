package com.springcamp.boot.web;

import com.springcamp.boot.domain.People;
import com.springcamp.boot.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Created by bungubbang
 * Email: sungyong.jung@sk.com
 * Date: 5/11/14
 */
@RestController
@RequestMapping(value = "people")
public class PeopleApiController {

    @Autowired PeopleRepository peopleRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<People> peopleList() {
        return peopleRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public People insert(People people) {
        return peopleRepository.save(people);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public People modify(People people) {
        return peopleRepository.save(people);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable Integer id) {
        peopleRepository.delete(id);
        return "delete : " + id;
    }
}
