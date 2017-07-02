package com.chariot.core;

/**
 * Created by Trung Vu on 2017/07/03.
 */
public interface Loggable {

    Object proceed();

    String getSignature();

    String getArgs();
}
