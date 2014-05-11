package com.springcamp.boot.web;

import com.springcamp.boot.service.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by bungubbang
 * Email: sungyong.jung@sk.com
 * Date: 5/11/14
 */
@Controller
public class ThymeLeafController {

    @Autowired PeopleRepository peopleRepository;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("welcome", "Hello!");
        return "index";
    }

    @RequestMapping("/list")
    public String peopleList(Model model) {
        model.addAttribute("peoples", peopleRepository.findAll());
        return "list";
    }

}
