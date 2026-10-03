package io.netty.incubator.codec.quic.util;

import android.content.Context;
import io.netty.incubator.codec.quic.EventListener;
import io.netty.incubator.codec.quic.track.statistics.StatRateHelper;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lio/netty/incubator/codec/quic/util/EventFactoryStub;", "Lio/netty/incubator/codec/quic/EventListener$Factory;", "factory", "statRateHelper", "Lio/netty/incubator/codec/quic/track/statistics/StatRateHelper;", "context", "Landroid/content/Context;", "(Lio/netty/incubator/codec/quic/EventListener$Factory;Lio/netty/incubator/codec/quic/track/statistics/StatRateHelper;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "getFactory", "()Lio/netty/incubator/codec/quic/EventListener$Factory;", "getStatRateHelper", "()Lio/netty/incubator/codec/quic/track/statistics/StatRateHelper;", "create", "Lio/netty/incubator/codec/quic/EventListener;", "Companion", "netty-quic_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class EventFactoryStub implements EventListener.Factory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Context context;

    @NotNull
    private final EventListener.Factory factory;

    @NotNull
    private final StatRateHelper statRateHelper;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lio/netty/incubator/codec/quic/util/EventFactoryStub$Companion;", "", "()V", "newInstance", "Lio/netty/incubator/codec/quic/EventListener$Factory;", "factory", "context", "Landroid/content/Context;", "statRateHelper", "Lio/netty/incubator/codec/quic/track/statistics/StatRateHelper;", "netty-quic_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final EventListener.Factory newInstance(@NotNull EventListener.Factory factory, @NotNull Context context, @NotNull StatRateHelper statRateHelper) {
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(statRateHelper, "statRateHelper");
            DefaultConstructorMarker defaultConstructorMarker = null;
            return factory instanceof EventFactoryStub ? new EventFactoryStub(((EventFactoryStub) factory).getFactory(), statRateHelper, context, defaultConstructorMarker) : new EventFactoryStub(factory, statRateHelper, context, defaultConstructorMarker);
        }
    }

    public /* synthetic */ EventFactoryStub(EventListener.Factory factory, StatRateHelper statRateHelper, Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(factory, statRateHelper, context);
    }

    @JvmStatic
    @NotNull
    public static final EventListener.Factory newInstance(@NotNull EventListener.Factory factory, @NotNull Context context, @NotNull StatRateHelper statRateHelper) {
        return INSTANCE.newInstance(factory, context, statRateHelper);
    }

    @Override // io.netty.incubator.codec.quic.EventListener.Factory
    @NotNull
    public EventListener create() {
        return new EventListenerStub(this.factory.create(), this.statRateHelper, this.context);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final EventListener.Factory getFactory() {
        return this.factory;
    }

    @NotNull
    public final StatRateHelper getStatRateHelper() {
        return this.statRateHelper;
    }

    private EventFactoryStub(EventListener.Factory factory, StatRateHelper statRateHelper, Context context) {
        this.factory = factory;
        this.statRateHelper = statRateHelper;
        this.context = context;
    }
}
