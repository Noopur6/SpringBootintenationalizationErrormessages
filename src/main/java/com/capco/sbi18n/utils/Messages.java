package com.capco.sbi18n.utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Locale;

/**
 * Helper to simplify accessing i18n messages in code.
 * 
 * This finds messages automatically found from src/main/resources (files named messages_*.properties)
 */
@Component
public class Messages {

    @Autowired
    private MessageSource messageSource;

    private MessageSourceAccessor accessor;

    @PostConstruct
    private void init() {
        accessor = new MessageSourceAccessor(messageSource, new Locale("en","EN"));
    }

    public String get(String code) {
        return accessor.getMessage(code);
    }
    
    public String get(String code, Locale locale) {
    	
        return accessor.getMessage(code, locale);
    }
}