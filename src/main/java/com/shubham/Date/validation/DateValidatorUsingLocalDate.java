package com.shubham.Date.validation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateValidatorUsingLocalDate implements DateValidator{

    private DateTimeFormatter dateFormatter;

    public DateValidatorUsingLocalDate(DateTimeFormatter dateFormatter) {
        this.dateFormatter = dateFormatter;
    }

    @Override
    public boolean isValid(String dateStr) {


        try{
            LocalDate.parse(dateStr, this.dateFormatter);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
