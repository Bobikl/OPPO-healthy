package com.oplus.aiunit.vision;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.core.content.ContextCompat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\"\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¨\u0006\b"}, d2 = {"Landroid/content/Context;", "context", "Lcom/oplus/aiunit/vision/dpc$a;", "listener", "Lcom/oplus/aiunit/vision/x7b;", "logger", "Lcom/oplus/aiunit/vision/dpc;", "a", "coil-base_release"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nNetworkObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkObserver.kt\ncoil/network/NetworkObserverKt\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 Logs.kt\ncoil/util/-Logs\n*L\n1#1,112:1\n31#2:113\n21#3,4:114\n*S KotlinDebug\n*F\n+ 1 NetworkObserver.kt\ncoil/network/NetworkObserverKt\n*L\n26#1:113\n28#1:114,4\n*E\n"})
public final class epc {
    @NotNull
    public static final dpc a(@NotNull Context context, @NotNull dpc.a aVar, @Nullable x7b x7bVar) {
        ConnectivityManager connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(context, ConnectivityManager.class);
        if (connectivityManager == null || !d.e(context, "android.permission.ACCESS_NETWORK_STATE")) {
            if (x7bVar != null && x7bVar.getLevel() <= 5) {
                x7bVar.a("NetworkObserver", 5, "Unable to register network observer.", null);
            }
            return new yl6();
        }
        try {
            return new scf(connectivityManager, aVar);
        } catch (Exception e2) {
            if (x7bVar != null) {
                g.a(x7bVar, "NetworkObserver", new RuntimeException("Failed to register network observer.", e2));
            }
            return new yl6();
        }
    }
}
