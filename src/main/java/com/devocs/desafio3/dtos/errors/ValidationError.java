package com.devocs.desafio3.dtos.errors;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends CustomError {

    public ValidationError(Instant timestamp, Integer status, String error, String path) {
        super(timestamp, status, error, path);
    }

    private List<FieldMessage> errors = new ArrayList<>();

    public List<FieldMessage> getErrors() {
        return errors;
    }

    public void addErrors(String fieldName, String message){
        errors.add(new FieldMessage(fieldName, message));
    }

}
