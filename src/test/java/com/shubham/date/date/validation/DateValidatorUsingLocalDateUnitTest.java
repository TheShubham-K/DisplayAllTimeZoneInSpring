package com.shubham.date.date.validation;




import java.time.format.DateTimeFormatter;

import com.shubham.Date.validation.DateValidator;
import com.shubham.Date.validation.DateValidatorUsingLocalDate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class DateValidatorUsingLocalDateUnitTest {
    
    @Test
    public void givenValidator_whenValidDatePassed_ThenTrue() {
        DateTimeFormatter dateFormatter = DateTimeFormatter.BASIC_ISO_DATE;
        DateValidator validator = new DateValidatorUsingLocalDate(dateFormatter);
        
        assertTrue(validator.isValid("20190228"));
    }
    
    @Test
    public void givenValidator_whenInValidDatePassed_ThenFalse() {
        DateTimeFormatter dateFormatter = DateTimeFormatter.BASIC_ISO_DATE;
        DateValidator validator = new DateValidatorUsingLocalDate(dateFormatter);
        
        assertFalse(validator.isValid("20190230"));
    }
}
