package com.demotest.utils;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

public class BBException extends RuntimeException {

    public BBException() {}

    public BBException(String errorMessage) {
        Throwable thrown = catchThrowable(() -> {});
        assertThat(thrown).as(errorMessage).isInstanceOf(Exception.class);
    }

    public BBException(String errorMessage, Exception exception) {
        Throwable thrown = catchThrowable(() -> {});
        assertThat(thrown).as(errorMessage + "\n" + Arrays.toString(exception.getStackTrace())).isInstanceOf(Exception.class);
    }
}
