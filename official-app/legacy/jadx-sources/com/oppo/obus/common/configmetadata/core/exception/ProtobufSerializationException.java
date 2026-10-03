package com.oppo.obus.common.configmetadata.core.exception;

/* JADX INFO: loaded from: classes9.dex */
public class ProtobufSerializationException extends RuntimeException {
    private static final long serialVersionUID = 1754684646716753250L;

    public ProtobufSerializationException(String str) {
        super(str);
    }

    public ProtobufSerializationException(String str, Throwable th) {
        super(str, th);
    }

    public ProtobufSerializationException(Throwable th) {
        super(th);
    }
}
