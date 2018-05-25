package com.gfi.microservicios.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/dummy")

public class MicroServicioController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	
	@RequestMapping(value="mensaje",method = RequestMethod.GET)
	public String mensaje() {
		logger.info("dummy mensaje invocado");
		return "un mensaje dummy";
	}
	
	
}
