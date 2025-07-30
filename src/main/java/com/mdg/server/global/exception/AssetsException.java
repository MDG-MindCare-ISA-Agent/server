package com.mdg.server.global.exception;

import com.mdg.server.global.exception.GeneralException;
import com.mdg.server.global.status.ErrorStatus;

public class AssetsException extends GeneralException {
    public AssetsException(ErrorStatus status) {
        super(status);
    }
}
