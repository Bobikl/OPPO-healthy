package com.heytap.push.codec.mqtt;

import io.netty.handler.codec.DecoderException;

/* JADX INFO: loaded from: classes19.dex */
public final class MqttIdentifierRejectedException extends DecoderException {
    private static final long serialVersionUID = -1323503322689614981L;

    public MqttIdentifierRejectedException() {
    }

    public MqttIdentifierRejectedException(String str, Throwable th) {
        super(str, th);
    }

    public MqttIdentifierRejectedException(String str) {
        super(str);
    }

    public MqttIdentifierRejectedException(Throwable th) {
        super(th);
    }
}
