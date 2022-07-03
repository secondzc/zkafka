package com.zhangcy.zkafka.clients.common;

public class FatalExitError extends Error{
    public FatalExitError(String message, Throwable cause) {
        super(message, cause);
    }
}
