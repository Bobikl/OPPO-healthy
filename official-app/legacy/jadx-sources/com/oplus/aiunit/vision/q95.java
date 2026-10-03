package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.gson.JsonObject;
import com.oplus.mydevices.sdk.compat.DeviceInfoCompat;

/* JADX INFO: loaded from: classes8.dex */
public class q95 extends k7a {
    public String a = "";
    public String b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f15681c = "";
    public String d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f15682e = "";
    public String f = "phone";

    public static double d(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        return Math.sqrt(Math.pow(displayMetrics.widthPixels, 2.0d) + Math.pow(displayMetrics.heightPixels, 2.0d)) / ((double) displayMetrics.densityDpi);
    }

    public static int e(Context context) {
        return context.getResources().getConfiguration().screenLayout & 192;
    }

    @Override // com.oplus.aiunit.vision.k7a
    public boolean b(Context context) {
        g(context);
        i(context);
        k(context);
        f(context);
        h(context);
        j(context);
        return false;
    }

    @Override // com.oplus.aiunit.vision.k7a
    public void c(JsonObject jsonObject) {
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("buildID", this.a);
        jsonObject2.addProperty("model", this.b);
        jsonObject2.addProperty("product", this.f15681c);
        jsonObject2.addProperty("brand", this.d);
        jsonObject2.addProperty("hwName", this.f15682e);
        jsonObject2.addProperty("platform", this.f);
        jsonObject.add("DevInfo", jsonObject2);
    }

    public final void f(Context context) {
        this.d = Build.BRAND;
    }

    public final void g(Context context) {
        this.a = Build.getRadioVersion();
    }

    public final void h(Context context) {
        this.f15682e = Build.HARDWARE;
    }

    public void i(Context context) {
        this.b = Build.MODEL;
    }

    public final void j(Context context) {
        double d = d(context);
        int iE = e(context);
        boolean z = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")).getIntExtra("plugged", -1) == 1;
        if (d >= 10.0d && iE > 3 && z) {
            this.f = "TV";
        } else if (d <= 2.5d) {
            this.f = DeviceInfoCompat.DeviceType.WATCH;
        } else {
            this.f = "phone";
        }
    }

    public final void k(Context context) {
        this.f15681c = Build.PRODUCT;
    }
}
