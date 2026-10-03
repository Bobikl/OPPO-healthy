package com.oplus.aiunit.vision;

import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/nj9;", "Lcom/oplus/aiunit/vision/sx5;", "", "", "hosts", "", "notifyWhiteListChange", "host", "ips", "notifyIPListChange", "Lcom/oplus/aiunit/vision/efd;", "a", "Lcom/oplus/aiunit/vision/efd;", "getClient", "()Lcom/oplus/aiunit/vision/efd;", "client", "<init>", "(Lcom/oplus/aiunit/vision/efd;)V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final class nj9 implements sx5 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final efd client;

    public nj9(@NotNull efd client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
        i78.INSTANCE.a(this);
    }

    @Override // com.oplus.aiunit.vision.sx5
    public void notifyIPListChange(@NotNull String host, @NotNull List<String> ips) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(ips, "ips");
        this.client.getConnectionPool().b(host);
    }

    @Override // com.oplus.aiunit.vision.sx5
    public void notifyWhiteListChange(@NotNull List<String> hosts) {
        Intrinsics.checkNotNullParameter(hosts, "hosts");
        Iterator<T> it = hosts.iterator();
        while (it.hasNext()) {
            this.client.getConnectionPool().b((String) it.next());
        }
    }
}
