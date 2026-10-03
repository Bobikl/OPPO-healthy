package io.netty.incubator.codec.quic;

import com.oplus.aiunit.vision.i6b;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelOption;
import io.netty.channel.DefaultChannelId;
import io.netty.channel.socket.nio.NioDatagramChannel;
import io.netty.util.AttributeKey;
import io.netty.util.internal.ClassUtil;
import io.netty.util.internal.ObjectUtil;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class Quic {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int MAX_DATAGRAM_SIZE = 1350;
    private static final Throwable UNAVAILABILITY_CAUSE;
    private static final InternalLogger logger = InternalLoggerFactory.getInstance((Class<?>) Quic.class);
    static final Map.Entry<ChannelOption<?>, Object>[] EMPTY_OPTION_ARRAY = new Map.Entry[0];
    static final Map.Entry<AttributeKey<?>, Object>[] EMPTY_ATTRIBUTE_ARRAY = new Map.Entry[0];

    static {
        ClassUtil.tryLoadClasses(Quic.class, QuicChannel.class, QuicheQuicChannel.class, QuicheQuicStreamChannel.class, QuicCodecBuilder.class, QuicClientCodecBuilder.class, QuicheQuicCodec.class, QuicheQuicClientCodec.class, QuicChannelBootstrap.class, QuicClientSessionCache.class, QuicContext.class, QuicheQuicConnectionStats.class, QuicChannelConfig.class, QuicheQuicChannelConfig.class, DefaultChannelId.class, NioDatagramChannel.class);
        try {
            Quiche.quiche_version();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        UNAVAILABILITY_CAUSE = th;
    }

    private Quic() {
    }

    public static void enable_debug_logging(boolean z) {
        if (z) {
            Quiche.enable_debug_logging(z, new i6b() { // from class: io.netty.incubator.codec.quic.Quic.1
                @Override // com.oplus.aiunit.vision.i6b
                public void info(String str) {
                    if (Quic.logger != null) {
                        Quic.logger.info(str);
                    }
                }
            });
        }
    }

    public static void ensureAvailability() {
        Throwable th = UNAVAILABILITY_CAUSE;
        if (th != null) {
            throw ((Error) new UnsatisfiedLinkError("failed to load the required native library").initCause(th));
        }
    }

    public static boolean isAvailable() {
        return UNAVAILABILITY_CAUSE == null;
    }

    public static boolean isVersionSupported(int i) {
        return isAvailable() && Quiche.quiche_version_is_supported(i);
    }

    public static boolean quiche_conn_is_closed(long j2) {
        return Quiche.quiche_conn_is_closed(j2);
    }

    public static byte[] quiche_conn_trace_id(long j2) {
        return Quiche.quiche_conn_trace_id(j2);
    }

    public static void quiche_preload() {
        Quiche.quiche_preload();
    }

    private static void setAttributes(Channel channel, Map.Entry<AttributeKey<?>, Object>[] entryArr) {
        for (Map.Entry<AttributeKey<?>, Object> entry : entryArr) {
            channel.attr(entry.getKey()).set(entry.getValue());
        }
    }

    private static void setChannelOption(Channel channel, ChannelOption<?> channelOption, Object obj, InternalLogger internalLogger) {
        try {
            if (channel.config().setOption(channelOption, obj)) {
                return;
            }
            internalLogger.warn("Unknown channel option '{}' for channel '{}'", channelOption, channel);
        } catch (Throwable th) {
            internalLogger.warn("Failed to set channel option '{}' with value '{}' for channel '{}'", channelOption, obj, channel, th);
        }
    }

    private static void setChannelOptions(Channel channel, Map.Entry<ChannelOption<?>, Object>[] entryArr, InternalLogger internalLogger) {
        for (Map.Entry<ChannelOption<?>, Object> entry : entryArr) {
            setChannelOption(channel, entry.getKey(), entry.getValue(), internalLogger);
        }
    }

    public static void setupChannel(Channel channel, Map.Entry<ChannelOption<?>, Object>[] entryArr, Map.Entry<AttributeKey<?>, Object>[] entryArr2, ChannelHandler channelHandler, InternalLogger internalLogger) {
        setChannelOptions(channel, entryArr, internalLogger);
        setAttributes(channel, entryArr2);
        if (channelHandler != null) {
            channel.pipeline().addLast(channelHandler);
        }
    }

    public static Map.Entry<AttributeKey<?>, Object>[] toAttributesArray(Map<AttributeKey<?>, Object> map) {
        return (Map.Entry[]) new LinkedHashMap(map).entrySet().toArray(EMPTY_ATTRIBUTE_ARRAY);
    }

    public static Map.Entry<ChannelOption<?>, Object>[] toOptionsArray(Map<ChannelOption<?>, Object> map) {
        return (Map.Entry[]) new HashMap(map).entrySet().toArray(EMPTY_OPTION_ARRAY);
    }

    public static Throwable unavailabilityCause() {
        return UNAVAILABILITY_CAUSE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void updateAttributes(Map<AttributeKey<?>, Object> map, AttributeKey<T> attributeKey, T t) {
        ObjectUtil.checkNotNull(attributeKey, "key");
        if (t == null) {
            map.remove(attributeKey);
        } else {
            map.put(attributeKey, t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void updateOptions(Map<ChannelOption<?>, Object> map, ChannelOption<T> channelOption, T t) {
        ObjectUtil.checkNotNull(channelOption, "option");
        if (t == null) {
            map.remove(channelOption);
        } else {
            map.put(channelOption, t);
        }
    }
}
