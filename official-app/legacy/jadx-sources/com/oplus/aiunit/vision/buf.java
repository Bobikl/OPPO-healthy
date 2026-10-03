package com.oplus.aiunit.vision;

import java.net.InetSocketAddress;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0002\u001a\u00020\u0000J\u0010\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/buf;", "", "a", "Lcom/oplus/aiunit/vision/ezj;", "timeStat", "", "b", "Lcom/oplus/aiunit/vision/ezj;", "getTimeStat", "()Lcom/oplus/aiunit/vision/ezj;", "d", "(Lcom/oplus/aiunit/vision/ezj;)V", "Ljava/net/InetSocketAddress;", "Ljava/net/InetSocketAddress;", "getSocket", "()Ljava/net/InetSocketAddress;", "c", "(Ljava/net/InetSocketAddress;)V", "socket", "<init>", "()V", "com.heytap.nearx.common"}, k = 1, mv = {1, 4, 0})
public final class buf {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public ezj timeStat = new ezj();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public InetSocketAddress socket;

    @NotNull
    public final buf a() {
        buf bufVar = new buf();
        bufVar.timeStat.b(this.timeStat);
        bufVar.socket = this.socket;
        return bufVar;
    }

    public final void b(@Nullable ezj timeStat) {
        this.timeStat.b(timeStat);
    }

    public final void c(@Nullable InetSocketAddress inetSocketAddress) {
        this.socket = inetSocketAddress;
    }

    public final void d(@NotNull ezj ezjVar) {
        Intrinsics.checkNotNullParameter(ezjVar, "<set-?>");
        this.timeStat = ezjVar;
    }
}
