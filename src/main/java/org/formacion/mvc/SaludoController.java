package org.formacion.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SaludoController {

	
	@RequestMapping(path="/inicio")
	public String estado () {
		return "inicio";
	}
}
