package io.netty.incubator.codec.quic.util;

import android.content.Context;
import com.heytap.store.apm.PageTrackBean;
import io.netty.incubator.codec.quic.EventListener;
import io.netty.incubator.codec.quic.QuicheQuicChannel;
import io.netty.incubator.codec.quic.track.TrackHelper;
import io.netty.incubator.codec.quic.track.statistics.StatRateHelper;
import java.net.InetSocketAddress;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\b\u0010\u0015\u001a\u00020\u000bH\u0016J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\rH\u0016J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0013H\u0016J\b\u0010\u001b\u001a\u00020\u000bH\u0016J\u0010\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u001d\u001a\u00020\u000bH\u0016J\b\u0010\u001e\u001a\u00020\u000bH\u0016J\b\u0010\u001f\u001a\u00020\u000bH\u0016J\b\u0010 \u001a\u00020\u000bH\u0016J\u0010\u0010!\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\"\u001a\u00020\u000bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lio/netty/incubator/codec/quic/util/EventListenerStub;", "Lio/netty/incubator/codec/quic/EventListener;", "eventListener", "statRateHelper", "Lio/netty/incubator/codec/quic/track/statistics/StatRateHelper;", "context", "Landroid/content/Context;", "(Lio/netty/incubator/codec/quic/EventListener;Lio/netty/incubator/codec/quic/track/statistics/StatRateHelper;Landroid/content/Context;)V", "trackHelper", "Lio/netty/incubator/codec/quic/track/TrackHelper;", "connectEnd", "", "quicheQuicChannel", "Lio/netty/incubator/codec/quic/QuicheQuicChannel;", "connectFailed", "cause", "", "connectStart", "inetSocketAddress", "Ljava/net/InetSocketAddress;", "dnsEnd", "dnsStart", "firstCallEnd", "channel", "firstCallFailed", "firstCallStart", "inetAddr", "recvEnd", "recvFail", "recvStart", PageTrackBean.PAGE_API_REQUEST_END, PageTrackBean.PAGE_API_REQUEST_START, "sendEnd", "sendFail", "sendStart", "netty-quic_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class EventListenerStub extends EventListener {

    @NotNull
    private final Context context;

    @Nullable
    private final EventListener eventListener;

    @NotNull
    private final StatRateHelper statRateHelper;

    @Nullable
    private final TrackHelper trackHelper;

    public EventListenerStub(@Nullable EventListener eventListener, @NotNull StatRateHelper statRateHelper, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(statRateHelper, "statRateHelper");
        Intrinsics.checkNotNullParameter(context, "context");
        this.eventListener = eventListener;
        this.statRateHelper = statRateHelper;
        this.context = context;
        this.trackHelper = new TrackHelper(context, statRateHelper);
    }

    @Override // io.netty.incubator.codec.quic.EventListener
    public void connectEnd(@NotNull QuicheQuicChannel quicheQuicChannel) {
        Intrinsics.checkNotNullParameter(quicheQuicChannel, "quicheQuicChannel");
        super.connectEnd(quicheQuicChannel);
        EventListener eventListener = this.eventListener;
        if (eventListener != null) {
            eventListener.connectEnd(quicheQuicChannel);
        }
        TrackHelper trackHelper = this.trackHelper;
        if (trackHelper == null) {
            return;
        }
        trackHelper.connectEnd(quicheQuicChannel);
    }

    @Override // io.netty.incubator.codec.quic.EventListener
    public void connectFailed(@NotNull Throwable cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        super.connectFailed(cause);
        EventListener eventListener = this.eventListener;
        if (eventListener != null) {
            eventListener.connectFailed(cause);
        }
        TrackHelper trackHelper = this.trackHelper;
        if (trackHelper == null) {
            return;
        }
        trackHelper.connectFail(cause);
    }

    @Override // io.netty.incubator.codec.quic.EventListener
    public void connectStart(@NotNull InetSocketAddress inetSocketAddress) {
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        super.connectStart(inetSocketAddress);
        EventListener eventListener = this.eventListener;
        if (eventListener != null) {
            eventListener.connectStart(inetSocketAddress);
        }
        TrackHelper trackHelper = this.trackHelper;
        if (trackHelper == null) {
            return;
        }
        trackHelper.connectStart(inetSocketAddress);
    }

    @Override // io.netty.incubator.codec.quic.EventListener
    public void dnsEnd() {
        super.dnsEnd();
        EventListener eventListener = this.eventListener;
        if (eventListener != null) {
            eventListener.dnsEnd();
        }
        TrackHelper trackHelper = this.trackHelper;
        if (trackHelper == null) {
            return;
        }
        trackHelper.dnsEnd();
    }

    @Override // io.netty.incubator.codec.quic.EventListener
    public void dnsStart() {
        super.dnsStart();
        EventListener eventListener = this.eventListener;
        if (eventListener != null) {
            eventListener.dnsStart();
        }
        TrackHelper trackHelper = this.trackHelper;
        if (trackHelper == null) {
            return;
        }
        trackHelper.dnsStart();
    }

    @Override // io.netty.incubator.codec.quic.EventListener
    public void firstCallEnd(@NotNull QuicheQuicChannel channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        super.firstCallEnd(channel);
        EventListener eventListener = this.eventListener;
        if (eventListener != null) {
            eventListener.firstCallEnd(channel);
        }
        TrackHelper trackHelper = this.trackHelper;
        if (trackHelper == null) {
            return;
        }
        trackHelper.firstCallEnd(channel);
    }

    @Override // io.netty.incubator.codec.quic.EventListener
    public void firstCallFailed(@NotNull Throwable cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        super.firstCallFailed(cause);
        EventListener eventListener = this.eventListener;
        if (eventListener != null) {
            eventListener.firstCallFailed(cause);
        }
        TrackHelper trackHelper = this.trackHelper;
        if (trackHelper == null) {
            return;
        }
        trackHelper.firstCallFailed(cause);
    }

    @Override // io.netty.incubator.codec.quic.EventListener
    public void firstCallStart(@NotNull InetSocketAddress inetAddr) {
        Intrinsics.checkNotNullParameter(inetAddr, "inetAddr");
        super.firstCallStart(inetAddr);
        EventListener eventListener = this.eventListener;
        if (eventListener != null) {
            eventListener.firstCallStart(inetAddr);
        }
        TrackHelper trackHelper = this.trackHelper;
        if (trackHelper == null) {
            return;
        }
        trackHelper.firstCallStart(inetAddr);
    }

    @Override // io.netty.incubator.codec.quic.EventListener
    public void recvEnd() {
        super.recvEnd();
        EventListener eventListener = this.eventListener;
        if (eventListener != null) {
            eventListener.recvEnd();
        }
        TrackHelper trackHelper = this.trackHelper;
        if (trackHelper == null) {
            return;
        }
        trackHelper.recvEnd();
    }

    @Override // io.netty.incubator.codec.quic.EventListener
    public void recvFail(@NotNull Throwable cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        super.recvFail(cause);
        EventListener eventListener = this.eventListener;
        if (eventListener != null) {
            eventListener.recvFail(cause);
        }
        TrackHelper trackHelper = this.trackHelper;
        if (trackHelper == null) {
            return;
        }
        trackHelper.recvFail(cause);
    }

    @Override // io.netty.incubator.codec.quic.EventListener
    public void recvStart() {
        super.recvStart();
        EventListener eventListener = this.eventListener;
        if (eventListener != null) {
            eventListener.recvStart();
        }
        TrackHelper trackHelper = this.trackHelper;
        if (trackHelper == null) {
            return;
        }
        trackHelper.recvStart();
    }

    @Override // io.netty.incubator.codec.quic.EventListener
    public void requestEnd() {
        super.requestEnd();
        EventListener eventListener = this.eventListener;
        if (eventListener != null) {
            eventListener.requestEnd();
        }
        TrackHelper trackHelper = this.trackHelper;
        if (trackHelper == null) {
            return;
        }
        trackHelper.requestEnd();
    }

    @Override // io.netty.incubator.codec.quic.EventListener
    public void requestStart() {
        super.requestStart();
        EventListener eventListener = this.eventListener;
        if (eventListener != null) {
            eventListener.requestStart();
        }
        TrackHelper trackHelper = this.trackHelper;
        if (trackHelper == null) {
            return;
        }
        trackHelper.requestStart();
    }

    @Override // io.netty.incubator.codec.quic.EventListener
    public void sendEnd() {
        super.sendEnd();
        EventListener eventListener = this.eventListener;
        if (eventListener != null) {
            eventListener.sendEnd();
        }
        TrackHelper trackHelper = this.trackHelper;
        if (trackHelper == null) {
            return;
        }
        trackHelper.sendEnd();
    }

    @Override // io.netty.incubator.codec.quic.EventListener
    public void sendFail(@NotNull Throwable cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        super.sendFail(cause);
        EventListener eventListener = this.eventListener;
        if (eventListener != null) {
            eventListener.sendFail(cause);
        }
        TrackHelper trackHelper = this.trackHelper;
        if (trackHelper == null) {
            return;
        }
        trackHelper.sendFail(cause);
    }

    @Override // io.netty.incubator.codec.quic.EventListener
    public void sendStart() {
        super.sendStart();
        EventListener eventListener = this.eventListener;
        if (eventListener != null) {
            eventListener.sendStart();
        }
        TrackHelper trackHelper = this.trackHelper;
        if (trackHelper == null) {
            return;
        }
        trackHelper.sendStart();
    }
}
