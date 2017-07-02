package com.chariot.core;

import com.chariot.core.annotation.PerformanceLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Trung Vu on 2017/07/03.
 */
public class LogApplication {

    private static final Logger log = LoggerFactory.getLogger(LogApplication.class);

    @PerformanceLog
    public static void main(String[] args) {
        log.info("Trung is here");
    }
}
