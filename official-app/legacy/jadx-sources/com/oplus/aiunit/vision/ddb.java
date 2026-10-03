package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0010\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u0003\u0010\f\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0012\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\f\"\u0004\b\u0011\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/ddb;", "", "", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "ip", "", "b", "I", "d", "()I", "port", MapSchema.FIELD_NAME_ENTRY, "(I)V", "hbInterval", "f", "hbTimeout", "<init>", "(Ljava/lang/String;III)V", "device_btnet_impl_release"}, k = 1, mv = {1, 8, 0})
public final class ddb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String ip;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int port;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int hbInterval;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int hbTimeout;

    public ddb(@NotNull String ip, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(ip, "ip");
        this.ip = ip;
        this.port = i;
        this.hbInterval = i2;
        this.hbTimeout = i3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getHbInterval() {
        return this.hbInterval;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getHbTimeout() {
        return this.hbTimeout;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getIp() {
        return this.ip;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getPort() {
        return this.port;
    }

    public final void e(int i) {
        this.hbInterval = i;
    }

    public final void f(int i) {
        this.hbTimeout = i;
    }
}
