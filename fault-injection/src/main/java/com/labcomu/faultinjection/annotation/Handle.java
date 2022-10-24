package com.labcomu.faultinjection.annotation;

import com.labcomu.faultinjection.annotation.internal.Handles;
import com.labcomu.faultinjection.api.Handler;

import java.lang.annotation.*;

@Repeatable(Handles.class)
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Handle {
    @SuppressWarnings("rawtypes")
    Class<? extends Handler> handler();
}
