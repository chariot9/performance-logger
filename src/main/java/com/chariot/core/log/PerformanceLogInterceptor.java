package com.chariot.core.log;

import com.google.common.base.Stopwatch;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * LogInterceptor for logging {@link MethodInvocation}
 * <p>
 * Created by Trung Vu on 2017/07/03.
 */
public class PerformanceLogInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        return new PerformanceLogger(Stopwatch.createStarted()).measure(new MethodLogger(invocation));
    }
}
