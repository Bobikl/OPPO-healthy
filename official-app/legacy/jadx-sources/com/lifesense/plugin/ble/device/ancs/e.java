package com.lifesense.plugin.ble.device.ancs;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends com.lifesense.plugin.ble.b.a {
    public static final int ANCS_DATA_NUMBER = 300;
    public static final int MSG_ON_NEW_MESSAGE_CHANGES = 1;
    private static e a;
    private Context b;
    private m d;
    private l g = new f(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f8744c = new HashMap();
    private HandlerThread f = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Handler f8745e = null;

    @SuppressLint({"UseSparseArrays"})
    private e() {
    }

    public Handler c() {
        if (this.f == null) {
            HandlerThread handlerThread = new HandlerThread("MessageCentreHanlder");
            this.f = handlerThread;
            handlerThread.start();
            this.f8745e = new g(this, this.f.getLooper());
        }
        return this.f8745e;
    }

    public static synchronized e a() {
        if (a == null) {
            a = new e();
        }
        return a;
    }

    public void b() {
        Map map = this.f8744c;
        if (map == null) {
            return;
        }
        map.clear();
    }

    private void b(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context.getPackageName(), NotificationService.class.getName());
            packageManager.setComponentEnabledSetting(componentName, 2, 1);
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @SuppressLint({"NewApi"})
    public void a(Context context) {
        this.b = null;
        this.d = null;
        try {
            p.a(context);
            p.a((l) null);
            n.a(context);
            NotificationService.setPhoneMessageListener(null);
            NAccessService.setPhoneMessageListener(null);
            Handler handler = this.f8745e;
            if (handler != null) {
                handler.getLooper().quitSafely();
                this.f8745e = null;
            }
            HandlerThread handlerThread = this.f;
            if (handlerThread != null) {
                handlerThread.quitSafely();
                this.f = null;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void a(Context context, m mVar) {
        this.b = context;
        this.d = mVar;
        if (this.f == null) {
            HandlerThread handlerThread = new HandlerThread("MessageCentreHanlder");
            this.f = handlerThread;
            handlerThread.start();
            this.f8745e = new g(this, this.f.getLooper());
        }
        NotificationService.setPhoneMessageListener(this.g);
        b(context);
        NAccessService.setPhoneMessageListener(this.g);
        p.a(context, this.f8745e);
        p.a(this.g);
        n.a(context, this.f8745e, this.g);
    }

    public boolean a(int i, a aVar) {
        Map map = this.f8744c;
        if (map == null) {
            return false;
        }
        map.put(Integer.valueOf(i), aVar);
        if (this.f8744c.size() <= 300) {
            return true;
        }
        try {
            this.f8744c.remove(Integer.valueOf(i - 300));
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }
}
