package com.workBack.demo.Utils;

public class Info<T> {
    private String message;
    private String errorMessage;
    private  T data; //dados que estamos enviando e recebendo entre back e front
    private boolean success;

    public Info() {}
    public Info(String message, String errorMessage, T data, boolean success) {
        this.message = message;
        this.errorMessage = errorMessage;
        this.data = data;
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}


