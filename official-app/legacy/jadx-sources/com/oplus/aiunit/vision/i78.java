package com.oplus.aiunit.vision;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0016J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0001J\u0016\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0016R \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/i78;", "Lcom/oplus/aiunit/vision/sx5;", "", "host", "", "ips", "", "notifyIPListChange", "listener", "a", "hosts", "notifyWhiteListChange", "", "Ljava/lang/ref/WeakReference;", "Ljava/util/List;", "dnsEventListeners", "<init>", "()V", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
public final class i78 implements sx5 {
    public static final i78 INSTANCE = new i78();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final List<WeakReference<sx5>> dnsEventListeners = new CopyOnWriteArrayList();

    public final void a(@NotNull sx5 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        dnsEventListeners.add(new WeakReference<>(listener));
    }

    @Override // com.oplus.aiunit.vision.sx5
    public void notifyIPListChange(@NotNull String host, @NotNull List<String> ips) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(ips, "ips");
        Iterator<T> it = dnsEventListeners.iterator();
        while (it.hasNext()) {
            sx5 sx5Var = (sx5) ((WeakReference) it.next()).get();
            if (sx5Var != null) {
                sx5Var.notifyIPListChange(host, ips);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.sx5
    public void notifyWhiteListChange(@NotNull List<String> hosts) {
        Intrinsics.checkNotNullParameter(hosts, "hosts");
        Iterator<T> it = dnsEventListeners.iterator();
        while (it.hasNext()) {
            sx5 sx5Var = (sx5) ((WeakReference) it.next()).get();
            if (sx5Var != null) {
                sx5Var.notifyWhiteListChange(hosts);
            }
        }
    }
}
