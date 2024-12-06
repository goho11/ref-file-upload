package com.metacoding.upload;

import lombok.AllArgsConstructor;
import lombok.Data;

// 공통DTO
@AllArgsConstructor
@Data
public class Resp<T> {
    private Boolean success;
    private String msg;
    private T data;
}
