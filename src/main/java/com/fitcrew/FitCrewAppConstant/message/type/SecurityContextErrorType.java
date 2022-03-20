package com.fitcrew.FitCrewAppConstant.message.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SecurityContextErrorType {
    NOT_SUPPORTED_MSG("Not supported yet.");

    private final String msg;
}
