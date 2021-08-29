package com.khotrizwan.angular8.model;

public class ResponseBean {
    String status;
    String errMsg;
    Object data;
    
    public ResponseBean(String status, String errMsg, Object data) {
        this.status = status;
        this.errMsg = errMsg;
        this.data = data;
    }
    
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getErrMsg() {
        return errMsg;
    }
    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseBean [data=" + data + ", errMsg=" + errMsg + ", status=" + status + "]";
    }

    
}
