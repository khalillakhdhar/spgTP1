package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.classes.Manipulation;
import com.example.demo.classes.Programmation;

@RestController
public class MainController {
@GetMapping("")
ModelAndView accueil()
{
ModelAndView mv =new ModelAndView("index.html");

return mv;
}
@GetMapping("programmation")
String programmer()
{
	Programmation pr=new Programmation(1,"java","software",true,"object oriented","moyenne");
return pr.toString();
}
@GetMapping("manipulation")
String manip()
{
Manipulation man=new Manipulation(1, "mysql", "database", 1, false);
return man.toString();

}

}
