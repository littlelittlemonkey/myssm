package com.lyc.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

public class JsonDate<T> {
    private boolean result;
    private String msg;
    private T data;

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public JsonDate(boolean result, String msg) {
        this.result = result;
        this.msg = msg;
    }

    public JsonDate(boolean result, T data) {
        this.result = result;
        this.data = data;
    }

    public JsonDate(boolean result, String msg, T data) {
        this.result = result;
        this.msg = msg;
        this.data = data;
    }
}
