package com.cmrh.journey.system.common.exception.auth;


import com.cmrh.journey.system.common.constant.CommonConstants;
import com.cmrh.journey.system.common.exception.BaseException;

/**
 * @author pangbohuan
 * @description UserInvalidException
 * @date 2018-08-20 14:06
 **/
public class UserInvalidException extends BaseException {

    public UserInvalidException(String message) {
        super(message, CommonConstants.EX_USER_PASS_INVALID_CODE);
    }
}
