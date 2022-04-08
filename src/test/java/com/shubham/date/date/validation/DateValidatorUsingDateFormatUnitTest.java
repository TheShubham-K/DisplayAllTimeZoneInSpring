package com.shubham.date.date.validation;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.shubham.Date.validation.DateValidator;
import com.shubham.Date.validation.DateValidatorUsingDateFormat;
import org.junit.jupiter.api.Test;

public class DateValidatorUsingDateFormatUnitTest {
    
    @Test
    public void givenValidator_whenValidDatePassed_ThenTrue() {
        DateValidator validator = new DateValidatorUsingDateFormat("MM/dd/yyyy");
        
        assertTrue(validator.isValid("02/28/2019"));
    }
    
    @Test
    public void givenValidator_whenInvalidDatePassed_ThenFalse() {
        DateValidator validator = new DateValidatorUsingDateFormat("MM/dd/yyyy");
        
        assertFalse(validator.isValid("02/30/2019"));
    }
}
