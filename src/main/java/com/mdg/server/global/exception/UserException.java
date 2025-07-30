package com.mdg.server.global.exception;

import com.mdg.server.global.exception.GeneralException;
import com.mdg.server.global.status.ErrorStatus;

public class UserException extends GeneralException {
  public UserException(ErrorStatus status) {
    super(status);
  }
}
