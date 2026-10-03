package com.heytap.nearx.net.quic;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0087 J!\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0087 J)\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0004H\u0087 J\u0011\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0087 J\u0011\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0006H\u0087 J\u0011\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0087 J\u0011\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0087 J5\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u00182\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006H\u0087 J!\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u0006H\u0087 J%\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u00182\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0087 J\u0011\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0087 J\u0019\u0010 \u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0087 J1\u0010!\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006H\u0087 ¨\u0006#"}, d2 = {"Lcom/heytap/nearx/net/quic/QuicHelper;", "", "()V", "checkZeroRttEnable", "", "connection", "", "closeConnection", "", "app", "errorCode", "connect", "socketAddress", "", "serverName", "timeout", "is0RttConfig", "destructConnection", "destructStream", "stream", "isConnectionClosed", "maxCurrentStreams", "newStream", "headers", "", "finished", "readResponseBody", "", "buffer", "Ljava/nio/ByteBuffer;", "readResponseHeaders", "reportInfo", "rstStream", "sendRequestBody", "limit", "quic_extension_release"}, k = 1, mv = {1, 4, 2})
public final class QuicHelper {

    @NotNull
    public static final QuicHelper INSTANCE = new QuicHelper();

    static {
        System.loadLibrary("quiche");
    }

    private QuicHelper() {
    }

    @JvmStatic
    public static final native boolean checkZeroRttEnable(long connection);

    @JvmStatic
    public static final native void closeConnection(long connection, boolean app, long errorCode);

    @JvmStatic
    public static final native long connect(@NotNull String socketAddress, @NotNull String serverName, long timeout, boolean is0RttConfig) throws IOException;

    @JvmStatic
    public static final native void destructConnection(long connection);

    @JvmStatic
    public static final native void destructStream(long stream);

    @JvmStatic
    public static final native boolean isConnectionClosed(long connection);

    @JvmStatic
    public static final native long maxCurrentStreams(long connection);

    @JvmStatic
    public static final native long newStream(long connection, @NotNull Map<String, String> headers, boolean finished, long timeout) throws IOException;

    @JvmStatic
    public static final native int readResponseBody(long stream, @NotNull ByteBuffer buffer, long timeout) throws IOException;

    @JvmStatic
    @NotNull
    public static final native Map<String, String> readResponseHeaders(long stream, long timeout) throws IOException;

    @JvmStatic
    @NotNull
    public static final native String reportInfo(long connection);

    @JvmStatic
    public static final native void rstStream(long stream, long errorCode);

    @JvmStatic
    public static final native void sendRequestBody(long stream, @NotNull ByteBuffer buffer, int limit, boolean finished, long timeout) throws IOException;
}
