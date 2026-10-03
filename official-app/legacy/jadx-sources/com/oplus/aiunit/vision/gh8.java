package com.oplus.aiunit.vision;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.gson.JsonObject;
import com.heytap.accessory.connectivity.constant.ConnectConstant;
import com.oplusos.vfxmodelviewer.view.Hardware;
import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class gh8 extends k7a {
    public String a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11763c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f11764e;
    public String f;

    @Override // com.oplus.aiunit.vision.k7a
    public boolean b(Context context) {
        i(context);
        h(context);
        f(context);
        g(context);
        e(context);
        return false;
    }

    @Override // com.oplus.aiunit.vision.k7a
    public void c(JsonObject jsonObject) {
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("screenSize", this.a);
        jsonObject2.addProperty("screenDpi", Integer.valueOf(this.b));
        jsonObject2.addProperty("cpuID", this.f11763c);
        jsonObject2.addProperty("cpuType", this.d);
        jsonObject2.addProperty("btName", this.f11764e);
        jsonObject2.addProperty("btMac", this.f);
        jsonObject.add("HardInfo", jsonObject2);
    }

    public final String d() {
        Object objInvoke;
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            Field declaredField = defaultAdapter.getClass().getDeclaredField("mService");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(defaultAdapter);
            return (obj == null || (objInvoke = obj.getClass().getMethod("getAddress", new Class[0]).invoke(obj, new Object[0])) == null || !(objInvoke instanceof String)) ? ConnectConstant.DEFAULT_WIFI_LOCAL_ADDRESS : (String) objInvoke;
        } catch (Exception e2) {
            v6b.b(e2.toString());
            return "ERR";
        }
    }

    public final void e(Context context) {
        if (context.getPackageManager().checkPermission("android.permission.BLUETOOTH", context.getPackageName()) != 0) {
            this.f11764e = "NOP";
            return;
        }
        try {
            this.f11764e = BluetoothAdapter.getDefaultAdapter().getName();
            this.f = d();
        } catch (Exception e2) {
            v6b.b(e2.toString());
            this.f11764e = "ERR";
        }
    }

    public final void f(Context context) {
        String str;
        Map<String, String> mapB = lc4.b();
        if (mapB != null) {
            str = mapB.get("Features") + "," + mapB.get("Processor") + "," + mapB.get("CPU architecture") + "," + mapB.get(Hardware.TAG) + "," + mapB.get("Serial");
        } else {
            str = "";
        }
        this.f11763c = str;
    }

    public final void g(Context context) {
        this.d = a1j.a(Build.SUPPORTED_ABIS);
    }

    public final void h(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.b = displayMetrics != null ? displayMetrics.densityDpi : 0;
    }

    public final void i(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        this.a = displayMetrics.widthPixels + "," + displayMetrics.heightPixels;
    }
}
