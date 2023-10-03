package com.shubham.regexp.datepattern;

import java.util.regex.Pattern;

public class FormattedDateMatcher implements DateMatcher{
    private static final Pattern DATE_PATTERN = Pattern.compile(
            "^\\d{4}-\\d{2}-\\d{2}$");

    @Override
    public boolean matches(String date) {
        return DATE_PATTERN.matcher(date).matches();
    }
}
