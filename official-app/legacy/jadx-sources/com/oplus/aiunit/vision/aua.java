package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import com.heytap.health.watch.notification.impl.pull.NotificationApiService;
import com.oplus.epona.Call$Callback;
import com.oplus.epona.Response;
import com.oplus.epona.internal.EponaProvider;

/* JADX INFO: loaded from: classes2.dex */
public class aua implements iea {
    @Override // com.oplus.aiunit.vision.iea
    public void a(iea.a aVar) {
        String componentName = aVar.request().getComponentName();
        if (c(componentName)) {
            aVar.a();
            return;
        }
        Call$Callback call$CallbackCallback = aVar.callback();
        ApplicationInfo applicationInfoA = new ta0().a(componentName);
        if (applicationInfoA == null) {
            l7b.c("Epona->LaunchComponentInterceptor", "find component:%s failed", componentName);
            call$CallbackCallback.onReceive(Response.defaultErrorResponse());
        } else if (d(b(applicationInfoA.packageName), componentName)) {
            aVar.a();
        } else {
            l7b.c("Epona->LaunchComponentInterceptor", "launch component:%s failed", componentName);
            call$CallbackCallback.onReceive(Response.defaultErrorResponse());
        }
    }

    public final Uri b(String str) {
        return Uri.parse(NotificationApiService.CONTENT + str + ".oplus.epona");
    }

    public final boolean c(String str) {
        return ep6.m().a(str) != null;
    }

    public boolean d(Uri uri, String str) {
        Context contextG = ep6.g();
        if (contextG == null) {
            return false;
        }
        try {
            Bundle bundleCall = contextG.getContentResolver().call(uri, "launchComponent", (String) null, (Bundle) null);
            boolean z = bundleCall.getBoolean("KEY_LAUNCH_SUCCESS");
            IBinder binder = bundleCall.getBinder(EponaProvider.KEY_REMOTE_TRANSFER);
            if (z && binder != null) {
                le1.c().e(str, binder);
            }
            return z;
        } catch (Exception unused) {
            return false;
        }
    }
}
