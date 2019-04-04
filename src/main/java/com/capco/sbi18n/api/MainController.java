/**
 * 
 */
package com.capco.sbi18n.api;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.capco.sbi18n.utils.Messages;

/**
 * @author NSNO
 *
 */
@RestController
public class MainController {

	@Autowired
	Messages messages;
	
	@GetMapping(value="/hello/{locale}")
	public String hello(@PathVariable String locale) {
		
		if(locale.equals("en"))
			return messages.get("english", new Locale(locale));
		else if(locale.equals("th"))
			return messages.get("thai", new Locale(locale));
		else
			return "default";
	}
}
