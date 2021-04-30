package com.devracoon.test.controller;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class TestDTO {
    private String id;
    private String name;
}
