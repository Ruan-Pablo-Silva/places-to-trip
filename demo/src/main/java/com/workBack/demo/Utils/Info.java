package com.workBack.demo.Utils;

import java.util.List;

public class Info<T> {
    private String message;
    private String errorMessage;
    private  T data; //dados que estamos enviando e recebendo entre back e front
    private List<T> listData; //lista que estamos enviando e recebendo entre back e front
    private Object objectData; //Objeto estamos enviando e recebendo entre back e front
    private boolean success;

    public Info() {}
    public Info(String message, String errorMessage, T data, boolean success) {
        this.message = message;
        this.errorMessage = errorMessage;
        this.data = data;
        this.success = success;
    }

    // Constructor for Object type
    public Info(String message, String errorMessage, List<T> listData, boolean success) {
        this.message = message;
        this.errorMessage = errorMessage;
        this.listData = listData;
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

    public List<T> getListData() {
        return listData;
    }

    public void setListData(List<T> listData) {
        this.listData = listData;
    }

    public Object getObjectData() {
        return objectData;
    }

    public void setObjectData(Object objectData) {
        this.objectData = objectData;
    }
}


