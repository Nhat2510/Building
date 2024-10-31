package com.tuannhat.Identify_service.model;

import java.util.ArrayList;
import java.util.List;

public class ErrorResponseDTO {
    private String Error;
    private List<String> details = new ArrayList<>();

    public String getError() {
        return Error;
    }

    public void setError(String error) {
        Error = error;
    }

    public List<String> getDetails() {
        return details;
    }

    public void setDetails(List<String> details) {
        this.details = details;
    }
}
