package com.pbh.journey.system.common.exception.auth;


import com.pbh.journey.system.common.constant.CommonConstants;
import com.pbh.journey.system.common.exception.BaseException;

/**
 * @author pangbohuan
 * @description ClientForbiddenException
 * @date 2018-08-20 14:08
 **/
public class ClientForbiddenException extends BaseException {
    public ClientForbiddenException(String message) {
        super(message, CommonConstants.EX_CLIENT_FORBIDDEN_CODE);
    }
}
