package com.pbh.journey.system.common.exception.auth;


import com.pbh.journey.system.common.constant.CommonConstants;
import com.pbh.journey.system.common.exception.BaseException;

/**
 * @author pangbohuan
 * @description UserTokenException
 * @date 2018-08-20 14:05
 **/
public class UserTokenException extends BaseException {
    public UserTokenException(String message) {
        super(message, CommonConstants.EX_USER_INVALID_CODE);
    }
}
