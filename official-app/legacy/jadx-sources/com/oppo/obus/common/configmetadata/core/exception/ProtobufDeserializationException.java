package com.oppo.obus.common.configmetadata.core.exception;

/* JADX INFO: loaded from: classes9.dex */
public class ProtobufDeserializationException extends RuntimeException {
    private static final long serialVersionUID = -3846244497423379356L;

    public ProtobufDeserializationException(String str) {
        super(str);
    }

    public ProtobufDeserializationException(String str, Throwable th) {
        super(str, th);
    }

    public ProtobufDeserializationException(Throwable th) {
        super(th);
    }
}
