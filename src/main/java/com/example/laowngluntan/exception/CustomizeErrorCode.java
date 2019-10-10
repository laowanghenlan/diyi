package com.example.laowngluntan.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode{
    QUESTION_NOT_FOUN("你找的问题不在了，要不要换个试试？");

    @Override
    public String getMessage() {

        return message;
    }

    private String message;

    CustomizeErrorCode(String message) {

        this.message = message;
    }
}
