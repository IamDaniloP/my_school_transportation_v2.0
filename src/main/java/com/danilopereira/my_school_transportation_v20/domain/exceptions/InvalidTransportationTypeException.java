package com.danilopereira.my_school_transportation_v20.domain.exceptions;

public class InvalidTransportationTypeException extends RuntimeException {
    public InvalidTransportationTypeException() {
        super("Invalid Transportation Type Exception");
    }
}
