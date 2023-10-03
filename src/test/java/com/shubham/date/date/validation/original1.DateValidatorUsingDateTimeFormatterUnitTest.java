package com.shubham.date.date.validation;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Locale;

import com.shubham.Date.validation.DateValidator;
import com.shubham.Date.validation.DateValidatorUsingDateTimeFormatter;
import org.junit.jupiter.api.Test;

public class DateValidatorUsingDateTimeFormatterUnitTest {
    
    @Test
    public void givenValidator_whenValidDatePassed_ThenTrue() {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("uuuu-MM-dd", Locale.US)
            .withResolverStyle(ResolverStyle.STRICT);
        DateValidator validator = new DateValidatorUsingDateTimeFormatter(dateFormatter);
        
        assertTrue(validator.isValid("2019-02-28"));
    }
    
    @Test
    public void givenValidator_whenInValidDatePassed_ThenFalse() {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("uuuu-MM-dd", Locale.US)
            .withResolverStyle(ResolverStyle.STRICT);
        DateValidator validator = new DateValidatorUsingDateTimeFormatter(dateFormatter);
        
        assertFalse(validator.isValid("2019-02-30"));
    }

}
