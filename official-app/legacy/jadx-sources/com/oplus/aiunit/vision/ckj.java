package com.oplus.aiunit.vision;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.gson.JsonObject;
import com.oplus.mydevices.sdk.compat.DeviceInfoCompat;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;

/* JADX INFO: loaded from: classes8.dex */
public class ckj extends k7a {
    public String a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10132c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f10133e;
    public boolean f;
    public long g;
    public long h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BroadcastReceiver f10134j = new a();

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Bundle extras;
            PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
            try {
                String action = intent.getAction();
                v6b.a("onReceive. action: " + action);
                if (!action.equals("android.hardware.usb.action.USB_STATE") || (extras = intent.getExtras()) == null) {
                    return;
                }
                ckj.this.f = extras.getBoolean(DeviceInfoCompat.DeviceState.CONNECTED);
                v6b.a("usbState, connected: " + ckj.this.f);
            } catch (Exception e2) {
                v6b.b(e2.toString());
            }
        }
    }

    @Override // com.oplus.aiunit.vision.k7a
    public void a(Context context) {
        o(context);
    }

    @Override // com.oplus.aiunit.vision.k7a
    public boolean b(Context context) {
        j(context);
        k(context);
        g(context);
        l(context);
        h(context);
        i(context);
        m(context);
        f(context);
        n(context);
        return false;
    }

    @Override // com.oplus.aiunit.vision.k7a
    public void c(JsonObject jsonObject) {
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("osVersion", this.a);
        jsonObject2.addProperty("romVersion", this.b);
        jsonObject2.addProperty("apiVersion", Integer.valueOf(this.f10132c));
        jsonObject2.addProperty("secVersion", this.d);
        jsonObject2.addProperty("bootloaderVersion", this.f10133e);
        jsonObject2.addProperty("usbStatus", Boolean.valueOf(this.f));
        jsonObject2.addProperty("curTime", Long.valueOf(this.g));
        jsonObject2.addProperty("upTime", Long.valueOf(this.h));
        jsonObject2.addProperty("activeTime", Long.valueOf(this.i));
        jsonObject.add("SysInfo", jsonObject2);
    }

    public final void f(Context context) {
        this.i = SystemClock.uptimeMillis();
    }

    public final void g(Context context) {
        this.f10132c = Build.VERSION.SDK_INT;
    }

    public final void h(Context context) {
        this.f10133e = Build.BOOTLOADER;
    }

    public final void i(Context context) {
        this.g = System.currentTimeMillis();
    }

    public final void j(Context context) {
        this.a = Build.VERSION.INCREMENTAL;
    }

    public final void k(Context context) {
        this.b = Build.DISPLAY;
    }

    public final void l(Context context) {
        this.d = Build.VERSION.SECURITY_PATCH;
    }

    public final void m(Context context) {
        this.h = SystemClock.elapsedRealtime();
    }

    public final void n(Context context) {
        context.registerReceiver(this.f10134j, new IntentFilter("android.hardware.usb.action.USB_STATE"));
        v6b.a("registerReceiver. USB_STATE");
    }

    public final void o(Context context) {
        try {
            context.unregisterReceiver(this.f10134j);
        } catch (Exception e2) {
            v6b.b(e2.toString());
        }
    }
}
