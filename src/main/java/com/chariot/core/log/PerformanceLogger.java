package com.chariot.core.log;

import com.chariot.core.Loggable;
import com.google.common.base.Stopwatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by Trung Vu on 2017/07/03.
 */
public class PerformanceLogger {

    private static final Logger log = LoggerFactory.getLogger(PerformanceLogger.class);
    private Stopwatch stopwatch;

    public PerformanceLogger(Stopwatch stopwatch) {
        this.stopwatch = stopwatch;
    }

    public Object measure(Loggable loggable) {
        Object object = loggable.proceed();
        logging(loggable, stopwatch.elapsed(TimeUnit.MILLISECONDS));
        return object;
    }

    private void logging(Loggable loggable, long times) {
        log.info(String.format("The time is [%s], with the signature is [%s] and the parameters is [%s]", times, loggable.getSignature(), loggable.getArgs()));
    }
}
