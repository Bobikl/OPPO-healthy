package com.heytap.health.location;

import android.os.RemoteException;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.ke8;
import com.oplus.aiunit.vision.m3k;
import com.oplus.health.apiprovider.ClientManager;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/heytap/health/location/a;", "", "Lcom/heytap/health/location/ILocationCB;", "callBack", "", "a", "d", "c", "b", "", "LOCATION_SUCCESS", "I", "", "MIN", "D", "<init>", "()V", "location_release"}, k = 1, mv = {1, 8, 0})
public final class a {

    @NotNull
    public static final a INSTANCE = new a();
    public static final int LOCATION_SUCCESS = 0;
    public static final double MIN = 0.0d;

    public void a(@NotNull ILocationCB callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        try {
            if (!m3k.h()) {
                a7b.b("HLocationManager", "not agree health");
                return;
            }
            ILocationAidl iLocationAidl = (ILocationAidl) ClientManager.getInstance().getBuildService("location_provider_path", new ke8());
            if (iLocationAidl != null) {
                iLocationAidl.start(callBack);
            }
        } catch (RemoteException e2) {
            a7b.b("HLocationManager", "start exception: " + e2.getMessage());
        }
    }

    public void b(@NotNull ILocationCB callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        try {
            if (!m3k.h()) {
                a7b.b("HLocationManager", "not agree health");
                return;
            }
            ILocationAidl iLocationAidl = (ILocationAidl) ClientManager.getInstance().getBuildService("location_provider_path", new ke8());
            if (iLocationAidl != null) {
                iLocationAidl.startCoarseOnce(callBack);
            }
        } catch (RemoteException e2) {
            a7b.b("HLocationManager", "startCoarseOnce exception: " + e2.getMessage());
        }
    }

    public void c(@NotNull ILocationCB callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        try {
            if (!m3k.h()) {
                a7b.b("HLocationManager", "not agree health");
                return;
            }
            ILocationAidl iLocationAidl = (ILocationAidl) ClientManager.getInstance().getBuildService("location_provider_path", new ke8());
            if (iLocationAidl != null) {
                iLocationAidl.startOnce(callBack);
            }
        } catch (RemoteException e2) {
            a7b.b("HLocationManager", "startOnce exception: " + e2.getMessage());
        }
    }

    public void d(@NotNull ILocationCB callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        try {
            if (!m3k.h()) {
                a7b.b("HLocationManager", "not agree health");
                return;
            }
            ILocationAidl iLocationAidl = (ILocationAidl) ClientManager.getInstance().getBuildService("location_provider_path", new ke8());
            if (iLocationAidl != null) {
                iLocationAidl.stop(callBack);
            }
        } catch (RemoteException e2) {
            a7b.b("HLocationManager", "stop exception: " + e2.getMessage());
        }
    }
}
