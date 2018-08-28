package com.cmrh.journey.system.common.exception.auth;


import com.cmrh.journey.system.common.constant.CommonConstants;
import com.cmrh.journey.system.common.exception.BaseException;

/**
 * @author pangbohuan
 * @description ClientTokenException
 * @date 2018-08-20 14:07
 **/
public class ClientTokenException extends BaseException {
    public ClientTokenException(String message) {
        super(message, CommonConstants.EX_CLIENT_INVALID_CODE);
    }
}
