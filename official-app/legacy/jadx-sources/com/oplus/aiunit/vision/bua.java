package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import com.heytap.epona.Response;
import com.heytap.epona.ipc.local.RemoteTransfer;
import com.heytap.health.watch.notification.impl.pull.NotificationApiService;

/* JADX INFO: loaded from: classes15.dex */
public class bua implements fea {
    @Override // com.oplus.aiunit.vision.fea
    public void a(fea.a aVar) {
        String componentName = aVar.request().getComponentName();
        if (c(componentName)) {
            s7b.b("LaunchComponentInterceptor", "RemoteTransfer with componentName = %s found. Proceed", componentName);
            aVar.a();
            return;
        }
        vr2 vr2VarCallback = aVar.callback();
        ApplicationInfo applicationInfoA = new ua0().a(componentName);
        if (applicationInfoA == null) {
            s7b.b("LaunchComponentInterceptor", "find component:%s failed", componentName);
            vr2VarCallback.onReceive(Response.defaultErrorResponse());
        } else if (d(b(applicationInfoA.packageName))) {
            aVar.a();
        } else {
            s7b.b("LaunchComponentInterceptor", "launch component:%s failed", componentName);
            vr2VarCallback.onReceive(Response.defaultErrorResponse());
        }
    }

    public final Uri b(String str) {
        return Uri.parse(NotificationApiService.CONTENT + str + ".epona");
    }

    public final boolean c(String str) {
        return RemoteTransfer.getInstance().findRemoteTransfer(str) != null;
    }

    public final boolean d(Uri uri) {
        Context contextF = fp6.f();
        if (contextF == null) {
            return false;
        }
        try {
            return contextF.getContentResolver().call(uri, "launchComponent", (String) null, (Bundle) null).getBoolean("KEY_LAUNCH_SUCCESS");
        } catch (Exception unused) {
            return false;
        }
    }
}
