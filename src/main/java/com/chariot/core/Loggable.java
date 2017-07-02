package com.chariot.core;

/**
 * Interface for processing, getting arguments, signature for logging
 * <p>
 * Created by Trung Vu on 2017/07/03.
 */
public interface Loggable {

    Object proceed();

    String getSignature();

    String getArgs();
}
