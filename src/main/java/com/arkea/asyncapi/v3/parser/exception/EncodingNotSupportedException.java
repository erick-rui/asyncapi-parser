package com.arkea.asyncapi.v3.parser.exception;

public class EncodingNotSupportedException extends RuntimeException {

    private static final long serialVersionUID = 3686905713011188803L;

    public EncodingNotSupportedException(final String encoding) {
        super(String.format("Encoding `%s` is not supported by JRE", encoding));
    }
}
