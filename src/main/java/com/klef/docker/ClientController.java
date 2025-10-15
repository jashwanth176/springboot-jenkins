package com.klef.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class ClientController {
	@GetMapping("/")
	String home () {
		return ("Test : Jenkins");
	}
}
