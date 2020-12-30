package com.fitcrew.FitCrewAppConstant.message.type;

public enum SecurityContextErrorType {
    NOT_SUPPORTED_MSG("Not supported yet.");

    private final String msg;

    SecurityContextErrorType(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
