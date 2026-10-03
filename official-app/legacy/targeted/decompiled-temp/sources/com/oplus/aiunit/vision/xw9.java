package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.Process;
import android.os.SystemClock;
import com.heytap.health.annotation.ProcessName;
import com.heytap.health.watch.notification.impl.pull.NotificationApiService;
import com.oplus.health.apiprovider.IServiceManager;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public class xw9 {
    public static final String SM_NAME = "ISM";
    public final Context a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProcessName f18781c;
    public r70<IServiceManager> d;

    public xw9(Context context, String str, ProcessName processName) {
        this.a = context;
        this.b = str;
        this.f18781c = processName;
        Intent intent = new Intent();
        intent.setPackage(str);
        intent.setAction(str + ".apiprovider.SERVICE_ACTION" + processName.mPName);
        StringBuilder sb = new StringBuilder();
        sb.append("ISM");
        sb.append(processName.mTag);
        r70<IServiceManager> r70Var = new r70<>(sb.toString(), context, intent, new r70.e() { // from class: com.oplus.aiunit.vision.uw9
            @Override // com.oplus.aiunit.vision.r70.e
            public final Object a(IBinder iBinder) {
                return IServiceManager.Stub.asInterface(iBinder);
            }
        });
        this.d = r70Var;
        r70Var.x(30000);
    }

    public final IServiceManager c() {
        if (this.a == null) {
            throw new NullPointerException("ClientManager context cannot be null");
        }
        Uri uri = Uri.parse(NotificationApiService.CONTENT + this.b + ".apiprovider.authorities" + this.f18781c.mPName);
        long jUptimeMillis = SystemClock.uptimeMillis();
        String str = "query: provider proc=" + this.f18781c.mPName + " myPid=" + Process.myPid();
        gwj.b(xx0.SCROLL_DELAYED, str);
        try {
            Cursor cursorQuery = this.a.getContentResolver().query(uri, null, "ISM", null, null);
            try {
                gwj.d();
                a7b.f("ISMRequester", str + " delay=" + (SystemClock.uptimeMillis() - jUptimeMillis));
                if (cursorQuery == null) {
                    a7b.f("ISMRequester", str + " query=null");
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
                try {
                    IServiceManager iServiceManagerAsInterface = IServiceManager.Stub.asInterface(cursorQuery.getExtras().getBinder("ISM"));
                    cursorQuery.close();
                    return iServiceManagerAsInterface;
                } catch (Exception e2) {
                    a7b.m("ISMRequester", str + " getExtras exception " + e2);
                    cursorQuery.close();
                    return null;
                }
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            a7b.m("ISMRequester", str + " exception=" + th3);
            return null;
        }
    }

    public final IServiceManager d() {
        String str = "query: service proc=" + this.f18781c.mPName + " myPid=" + Process.myPid();
        long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            return (IServiceManager) this.d.u();
        } finally {
            a7b.f("ISMRequester", str + " delay=" + (SystemClock.uptimeMillis() - jUptimeMillis));
        }
    }

    public synchronized IServiceManager e() {
        IServiceManager iServiceManager;
        f7e f7eVar = new f7e(new Callable() { // from class: com.oplus.aiunit.vision.vw9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.i.c();
            }
        }, new Callable() { // from class: com.oplus.aiunit.vision.ww9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.i.d();
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        iServiceManager = (IServiceManager) f7eVar.c(2000L, 5000L);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        StringBuilder sb = new StringBuilder();
        sb.append("getISM: cost ");
        sb.append(jCurrentTimeMillis2);
        sb.append(" success=");
        sb.append(iServiceManager != null);
        a7b.f("ISMRequester", sb.toString());
        return iServiceManager;
    }
}
