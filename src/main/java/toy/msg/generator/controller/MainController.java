package toy.msg.generator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import toy.msg.generator.service.MainService;

@Controller
public class MainController {
	@Autowired 
	MainService service;
}
