package com.cmrh.journey.system.common.exception.auth;


import com.cmrh.journey.system.common.constant.CommonConstants;
import com.cmrh.journey.system.common.exception.BaseException;

/**
 * @author pangbohuan
 * @description ClientInvalidException
 * @date 2018-08-20 14:08
 **/
public class ClientInvalidException extends BaseException {
    public ClientInvalidException(String message) {
        super(message, CommonConstants.EX_CLIENT_INVALID_CODE);
    }
}
