package com.heytap.nearx.net.util;

import com.lifesense.android.bluetooth.scale.bean.WeightData_A3;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0087 J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0019\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0082 ¨\u0006\u0012"}, d2 = {"Lcom/heytap/nearx/net/util/RustLog;", "", "()V", "connect", "", "socketAddress", "", "serverName", "timeout", "is0RttConfig", "", "init", "", "tag", "level", "Lcom/heytap/nearx/net/util/RustLog$Level;", "nativeInit", "Level", "quic_extension_release"}, k = 1, mv = {1, 4, 2})
public final class RustLog {

    @NotNull
    public static final RustLog INSTANCE = new RustLog();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/heytap/nearx/net/util/RustLog$Level;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "levelName", WeightData_A3.IMPEDANCE_STATUS_ERROR, "WARN", "INFO", "DEBUG", "TRACE", "quic_extension_release"}, k = 1, mv = {1, 4, 2})
    public enum Level {
        ERROR("Error"),
        WARN("Warn"),
        INFO("Info"),
        DEBUG("Debug"),
        TRACE("Trace");

        private final String value;

        Level(String str) {
            this.value = str;
        }

        @NotNull
        /* JADX INFO: renamed from: levelName, reason: from getter */
        public final String getValue() {
            return this.value;
        }
    }

    static {
        System.loadLibrary("quiche");
    }

    private RustLog() {
    }

    @JvmStatic
    public static final native long connect(@NotNull String socketAddress, @NotNull String serverName, long timeout, boolean is0RttConfig) throws IOException;

    @JvmStatic
    public static final void init(@NotNull String tag, @NotNull Level level) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(level, "level");
        INSTANCE.nativeInit(tag, level.getValue());
    }

    private final native void nativeInit(String tag, String level);
}
