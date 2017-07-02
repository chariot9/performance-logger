package com.chariot.core.log;

import com.google.common.base.Stopwatch;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * AOP class for logging {@link ProceedingJoinPoint}
 * <p>
 * Created by Trung Vu on 2017/07/03.
 */
@Aspect
public class PerformanceLogAspect {

    @Around("@annotation(com.uzabase.speeda.log.PerformanceLog)")
    public Object measure(ProceedingJoinPoint point) {
        return new PerformanceLogger(Stopwatch.createStarted()).measure(new JoinPointLogger(point));
    }
}
