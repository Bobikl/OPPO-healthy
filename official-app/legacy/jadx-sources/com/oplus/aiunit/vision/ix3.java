package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001b2\u00020\u0001:\u0002\u0003\nB\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR(\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R(\u0010\u0018\u001a\u0004\u0018\u00010\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/oplus/aiunit/vision/ix3;", "", "Lcom/oplus/aiunit/vision/hx3;", "a", "Lcom/oplus/aiunit/vision/hx3;", "f", "()Lcom/oplus/aiunit/vision/hx3;", b2n.g, "(Lcom/oplus/aiunit/vision/hx3;)V", "tcpConfig", "b", MapSchema.FIELD_NAME_ENTRY, b2n.f, "quicConfig", "Lcom/oplus/aiunit/vision/do9;", "<set-?>", "c", "Lcom/oplus/aiunit/vision/do9;", "()Lcom/oplus/aiunit/vision/do9;", "connectListener", "Lcom/oplus/aiunit/vision/rs9;", "d", "Lcom/oplus/aiunit/vision/rs9;", "()Lcom/oplus/aiunit/vision/rs9;", "messageListener", "<init>", "()V", "Companion", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public final class ix3 {
    public static final int DEFAULT_CONNECT_TIMEOUT = 5000;
    public static final int DEFAULT_HEARTBEAT_TIME = 30000;
    public static final int DEFAULT_MQTT_MAX_SIZE = 5242880;
    public static final long DEFAULT_PSK_FILE_TIMEOUT = 2592000000L;

    @NotNull
    public static final String DEFAULT_REGION = "CN";
    public static final int ENV_CUSTOM = 4;
    public static final int ENV_DEV = 3;
    public static final int ENV_RELEASE = 1;
    public static final int ENV_TEST = 2;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public hx3 tcpConfig;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public hx3 quicConfig;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public do9 connectListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public rs9 messageListener;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\t\u001a\u00020\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\rR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/ix3$a;", "", "Lcom/oplus/aiunit/vision/hx3;", "config", "c", "Lcom/oplus/aiunit/vision/do9;", "listener", "b", "Lcom/oplus/aiunit/vision/ix3;", "a", "Lcom/oplus/aiunit/vision/hx3;", "tcpConfig", "quicConfig", "Lcom/oplus/aiunit/vision/do9;", "connectListener", "Lcom/oplus/aiunit/vision/rs9;", "d", "Lcom/oplus/aiunit/vision/rs9;", "messageListener", "<init>", "()V", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public hx3 tcpConfig;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public hx3 quicConfig;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public do9 connectListener;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public rs9 messageListener;

        @NotNull
        public final ix3 a() {
            ix3 ix3Var = new ix3(null);
            ix3Var.g(this.quicConfig);
            ix3Var.h(this.tcpConfig);
            ix3Var.connectListener = this.connectListener;
            ix3Var.messageListener = this.messageListener;
            return ix3Var;
        }

        @NotNull
        public final a b(@Nullable do9 listener) {
            this.connectListener = listener;
            return this;
        }

        @NotNull
        public final a c(@Nullable hx3 config) {
            this.tcpConfig = config;
            return this;
        }
    }

    public ix3() {
    }

    public /* synthetic */ ix3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final do9 getConnectListener() {
        return this.connectListener;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final rs9 getMessageListener() {
        return this.messageListener;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final hx3 getQuicConfig() {
        return this.quicConfig;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final hx3 getTcpConfig() {
        return this.tcpConfig;
    }

    public final void g(@Nullable hx3 hx3Var) {
        this.quicConfig = hx3Var;
    }

    public final void h(@Nullable hx3 hx3Var) {
        this.tcpConfig = hx3Var;
    }
}
