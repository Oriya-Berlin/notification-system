package com.impl.notification.util;

import lombok.Data;

/**
 *  General response structure.
 */
@Data
public class CustomResponse {
    private int status;
    private Object results;
    private String description;

    public CustomResponse(int status, Object results, String description) {
        this.status = status;
        this.results = results;
        this.description = description;
    }
}
