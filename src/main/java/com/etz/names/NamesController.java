 package com.etz.names;

import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NamesController {
	
	@GetMapping("/names")
	public java.util.List<Name> getAllNames() {
		return Arrays.asList(
		new Name("1", "Matthew", "Techlead", "Male"),		
		new Name("2", "Pascal", "Asst", "Male"),		
		new Name("3", "Gbenga", "Staff", "Male"),		
		new Name("4", "Winifred", "Intern", "Female")				

				);
	}

}