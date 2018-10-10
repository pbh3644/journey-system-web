package com.pbh.journey.system.common.exception.auth;


import com.pbh.journey.system.common.constant.CommonConstants;
import com.pbh.journey.system.common.exception.BaseException;

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
