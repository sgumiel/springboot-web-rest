package com.kairosds.cursospb2.webrest.common;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class ApiError implements Serializable {

    private Integer code;
    private String message;

}