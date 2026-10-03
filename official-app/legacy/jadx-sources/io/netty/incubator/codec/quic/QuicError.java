package io.netty.incubator.codec.quic;

import io.netty.util.collection.IntObjectHashMap;
import io.netty.util.collection.IntObjectMap;

/* JADX INFO: loaded from: classes10.dex */
public enum QuicError {
    BUFFER_TOO_SHORT(Quiche.QUICHE_ERR_BUFFER_TOO_SHORT, "QUICHE_ERR_BUFFER_TOO_SHORT"),
    UNKNOWN_VERSION(Quiche.QUICHE_ERR_UNKNOWN_VERSION, "QUICHE_ERR_UNKNOWN_VERSION"),
    INVALID_FRAME(Quiche.QUICHE_ERR_INVALID_FRAME, "QUICHE_ERR_INVALID_FRAME"),
    INVALID_PACKET(Quiche.QUICHE_ERR_INVALID_PACKET, "QUICHE_ERR_INVALID_PACKET"),
    INVALID_STATE(Quiche.QUICHE_ERR_INVALID_STATE, "QUICHE_ERR_INVALID_STATE"),
    INVALID_STREAM_STATE(Quiche.QUICHE_ERR_INVALID_STREAM_STATE, "QUICHE_ERR_INVALID_STREAM_STATE"),
    INVALID_TRANSPORT_PARAM(Quiche.QUICHE_ERR_INVALID_TRANSPORT_PARAM, "QUICHE_ERR_INVALID_TRANSPORT_PARAM"),
    CRYPTO_FAIL(Quiche.QUICHE_ERR_CRYPTO_FAIL, "QUICHE_ERR_CRYPTO_FAIL"),
    TLS_FAIL(Quiche.QUICHE_ERR_TLS_FAIL, "QUICHE_ERR_TLS_FAIL"),
    FLOW_CONTROL(Quiche.QUICHE_ERR_FLOW_CONTROL, "QUICHE_ERR_FLOW_CONTROL"),
    STREAM_LIMIT(Quiche.QUICHE_ERR_STREAM_LIMIT, "QUICHE_ERR_STREAM_LIMIT"),
    FINAL_SIZE(Quiche.QUICHE_ERR_FINAL_SIZE, "QUICHE_ERR_FINAL_SIZE"),
    CONGESTION_CONTROL(Quiche.QUICHE_ERR_CONGESTION_CONTROL, "QUICHE_ERR_CONGESTION_CONTROL"),
    STREAM_RESET(Quiche.QUICHE_ERR_STREAM_RESET, "STREAM_RESET"),
    STREAM_STOPPED(Quiche.QUICHE_ERR_STREAM_STOPPED, "STREAM_STOPPED");

    private static final IntObjectMap<QuicError> ERROR_MAP = new IntObjectHashMap();
    private final int code;
    private final String message;

    static {
        for (QuicError quicError : values()) {
            ERROR_MAP.put(quicError.code(), quicError);
        }
    }

    QuicError(int i, String str) {
        this.code = i;
        this.message = str;
    }

    public final int code() {
        return this.code;
    }

    public final String message() {
        return this.message;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return String.format("QuicError{code=%d, message=%s}", Integer.valueOf(this.code), this.message);
    }

    public static QuicError valueOf(int i) {
        QuicError quicError = ERROR_MAP.get(i);
        if (quicError != null) {
            return quicError;
        }
        throw new IllegalArgumentException("unknown " + QuicError.class.getSimpleName() + " code: " + i);
    }
}
