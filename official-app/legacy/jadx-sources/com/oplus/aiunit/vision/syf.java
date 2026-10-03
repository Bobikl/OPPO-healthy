package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import java.net.InetSocketAddress;
import java.net.Proxy;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0015\u0012\u0006\u0010\u001e\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010 J\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0005\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\"\u0010\u0010\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\u00118\u0007¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\n\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u00158\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u001e\u001a\u00020\u001a8\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/oplus/aiunit/vision/syf;", "", "", "d", "other", "equals", "", "hashCode", "", "toString", "a", "I", "b", "()I", MapSchema.FIELD_NAME_ENTRY, "(I)V", "dnsType", "Lcom/oplus/aiunit/vision/gq;", "Lcom/oplus/aiunit/vision/gq;", "()Lcom/oplus/aiunit/vision/gq;", "address", "Ljava/net/Proxy;", "c", "Ljava/net/Proxy;", "()Ljava/net/Proxy;", "proxy", "Ljava/net/InetSocketAddress;", "Ljava/net/InetSocketAddress;", "f", "()Ljava/net/InetSocketAddress;", "socketAddress", "<init>", "(Lcom/oplus/aiunit/vision/gq;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final class syf {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int dnsType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final gq address;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Proxy proxy;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InetSocketAddress socketAddress;

    public syf(@NotNull gq address, @NotNull Proxy proxy, @NotNull InetSocketAddress socketAddress) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(socketAddress, "socketAddress");
        this.address = address;
        this.proxy = proxy;
        this.socketAddress = socketAddress;
    }

    @JvmName(name = "address")
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final gq getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getDnsType() {
        return this.dnsType;
    }

    @JvmName(name = "proxy")
    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Proxy getProxy() {
        return this.proxy;
    }

    public final boolean d() {
        return this.address.getSslSocketFactory() != null && this.proxy.type() == Proxy.Type.HTTP;
    }

    public final void e(int i) {
        this.dnsType = i;
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof syf) {
            syf syfVar = (syf) other;
            if (Intrinsics.areEqual(syfVar.address, this.address) && Intrinsics.areEqual(syfVar.proxy, this.proxy) && Intrinsics.areEqual(syfVar.socketAddress, this.socketAddress)) {
                return true;
            }
        }
        return false;
    }

    @JvmName(name = "socketAddress")
    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final InetSocketAddress getSocketAddress() {
        return this.socketAddress;
    }

    public int hashCode() {
        return ((((527 + this.address.hashCode()) * 31) + this.proxy.hashCode()) * 31) + this.socketAddress.hashCode();
    }

    @NotNull
    public String toString() {
        return "Route{" + this.socketAddress + '}';
    }
}
