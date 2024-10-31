package com.tuannhat.Identify_service.customException;

public class FieldRequiredException extends RuntimeException{
    public FieldRequiredException(String message) {
        super(message);
    }
}
