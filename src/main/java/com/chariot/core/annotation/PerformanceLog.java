package com.chariot.core.annotation;

import java.lang.annotation.*;

/**
 * Annotation for logging performance
 * <p>
 * Created by Trung Vu on 2017/07/03.
 */
@Inherited
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PerformanceLog {
}
