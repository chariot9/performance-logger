package com.chariot.core.log;

import com.chariot.core.Loggable;
import org.aopalliance.intercept.MethodInvocation;

import java.util.Arrays;

/**
 * Class for logging method by using {@link MethodInvocation}
 * <p>
 * Created by Trung Vu on 2017/07/03.
 */
public class MethodLogger implements Loggable {

    private MethodInvocation invocation;

    public MethodLogger(MethodInvocation invocation) {
        this.invocation = invocation;
    }

    @Override
    public Object proceed() {
        try {
            return invocation.proceed();
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

    @Override
    public String getSignature() {
        return invocation.getMethod().toString();
    }

    @Override
    public String getArgs() {
        return Arrays.toString(invocation.getArguments());
    }
}
