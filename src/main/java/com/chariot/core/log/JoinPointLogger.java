package com.chariot.core.log;

import com.chariot.core.Loggable;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Arrays;

/**
 * Class for logging by JoinPoint by using {@link ProceedingJoinPoint}
 * <p>
 * Created by Trung Vu on 2017/07/03.
 */
public class JoinPointLogger implements Loggable {

    private ProceedingJoinPoint joinPoint;

    public JoinPointLogger(ProceedingJoinPoint joinPoint) {
        this.joinPoint = joinPoint;
    }

    @Override
    public Object proceed() {
        try {
            return joinPoint.proceed();
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

    @Override
    public String getSignature() {
        return joinPoint.getSignature().toString();
    }

    @Override
    public String getArgs() {
        return Arrays.toString(joinPoint.getArgs());
    }
}
