package com.amap.api.location;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.autonavi.aps.amapapi.utils.c;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.fum;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;

/* JADX INFO: loaded from: classes12.dex */
public class APSService extends Service {
    fum a;
    int b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f890c = false;

    private void a(Context context) {
        try {
            if (this.a == null) {
                this.a = new fum(context);
            }
            this.a.b();
        } catch (Throwable th) {
            c.a(th, "APSService", "onCreate");
        }
        super.onCreate();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        try {
            return this.a.a(intent);
        } catch (Throwable th) {
            c.a(th, "APSService", "onBind");
            return null;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        a(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        try {
            this.a.d();
            if (this.f890c) {
                stopForeground(true);
            }
        } catch (Throwable th) {
            c.a(th, "APSService", "onDestroy");
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        int i3;
        PushAutoTrackHelper.onServiceStartCommand(this, intent, i, i2);
        if (intent != null) {
            try {
                int intExtra = intent.getIntExtra(b2n.f, 0);
                if (intExtra == 1) {
                    int intExtra2 = intent.getIntExtra("i", 0);
                    Notification notification = (Notification) intent.getParcelableExtra(b2n.g);
                    if (intExtra2 != 0 && notification != null) {
                        startForeground(intExtra2, notification);
                        this.f890c = true;
                        this.b++;
                    }
                } else if (intExtra == 2) {
                    if (intent.getBooleanExtra("j", true) && (i3 = this.b) > 0) {
                        this.b = i3 - 1;
                    }
                    if (this.b <= 0) {
                        stopForeground(true);
                        this.f890c = false;
                    } else {
                        stopForeground(false);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        try {
            return this.a.c();
        } catch (Throwable th) {
            c.a(th, "APSService", "onStartCommand");
            return super.onStartCommand(intent, i, i2);
        }
    }
}
