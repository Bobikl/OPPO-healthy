package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0007*\u0001\u0012\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\f\u0010\t\u001a\u00020\u0006*\u00020\u0004H\u0002R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/scf;", "Lcom/oplus/aiunit/vision/dpc;", "", "shutdown", "Landroid/net/Network;", "network", "", "isOnline", "d", "c", "Landroid/net/ConnectivityManager;", "a", "Landroid/net/ConnectivityManager;", "connectivityManager", "Lcom/oplus/aiunit/vision/dpc$a;", "b", "Lcom/oplus/aiunit/vision/dpc$a;", "listener", "com/oplus/aiunit/vision/scf$a", "Lcom/oplus/aiunit/vision/scf$a;", "networkCallback", "()Z", "<init>", "(Landroid/net/ConnectivityManager;Lcom/oplus/aiunit/vision/dpc$a;)V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"MissingPermission"})
@SourceDebugExtension({"SMAP\nNetworkObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkObserver.kt\ncoil/network/RealNetworkObserver\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,112:1\n12474#2,2:113\n12474#2,2:115\n*S KotlinDebug\n*F\n+ 1 NetworkObserver.kt\ncoil/network/RealNetworkObserver\n*L\n82#1:113,2\n96#1:115,2\n*E\n"})
public final class scf implements dpc {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ConnectivityManager connectivityManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final dpc.a listener;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a networkCallback;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/oplus/aiunit/vision/scf$a", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "", "onAvailable", "onLost", "coil-base_release"}, k = 1, mv = {1, 9, 0})
    public static final class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(@NotNull Network network) {
            scf.this.d(network, true);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@NotNull Network network) {
            scf.this.d(network, false);
        }
    }

    public scf(@NotNull ConnectivityManager connectivityManager, @NotNull dpc.a aVar) {
        this.connectivityManager = connectivityManager;
        this.listener = aVar;
        a aVar2 = new a();
        this.networkCallback = aVar2;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), aVar2);
    }

    @Override // com.oplus.aiunit.vision.dpc
    public boolean a() {
        for (Network network : this.connectivityManager.getAllNetworks()) {
            if (c(network)) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(Network network) {
        NetworkCapabilities networkCapabilities = this.connectivityManager.getNetworkCapabilities(network);
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    public final void d(Network network, boolean isOnline) {
        boolean z = false;
        for (Network network2 : this.connectivityManager.getAllNetworks()) {
            if (Intrinsics.areEqual(network2, network) ? isOnline : c(network2)) {
                z = true;
                break;
            }
        }
        this.listener.a(z);
    }

    @Override // com.oplus.aiunit.vision.dpc
    public void shutdown() {
        this.connectivityManager.unregisterNetworkCallback(this.networkCallback);
    }
}
