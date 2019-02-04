package ekkel_exceptions;

import ekkel_exceptions.innerclasses.OuterInterFace;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import ekkel_exceptions.innerclasses.OuterInterFace.Inner;

public class CustomException extends Exception {
    private LocalTime date;
    private final static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH : mm");
    public CustomException(String message) {
        super(message);
        date = LocalTime.now();
    }

    @Override
    public String getMessage() {
        Inner inn = new Inner();
        return String.format("s . %s",formatter.format(date),super.getMessage());
    }
}
