package com.oplus.aiunit.vision;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import com.google.gson.JsonObject;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.omes.srp.sysintegrity.BuildConfig;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;

/* JADX INFO: loaded from: classes12.dex */
public class nnm extends qnm {
    public long a = 0;
    public int b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14569c = 0;
    public int d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f14570e = "";
    public String f = "";

    @Override // com.oplus.aiunit.vision.qnm
    public void a(JsonObject jsonObject) {
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty(Fields.SDK_VERSION, BuildConfig.stdsrpVersion);
        jsonObject2.addProperty("radio", Build.getRadioVersion());
        jsonObject2.addProperty("model", Build.MODEL);
        jsonObject2.addProperty("product", Build.PRODUCT);
        jsonObject2.addProperty("brand", Build.BRAND);
        jsonObject2.addProperty("hardware", Build.HARDWARE);
        jsonObject2.addProperty("manufacturer", Build.MANUFACTURER);
        jsonObject2.addProperty("board", Build.BOARD);
        jsonObject2.addProperty("device", Build.DEVICE);
        jsonObject2.addProperty("display", Build.DISPLAY);
        jsonObject2.addProperty("fingerprint", Build.FINGERPRINT);
        jsonObject2.addProperty("host", Build.HOST);
        jsonObject2.addProperty("id", Build.ID);
        jsonObject2.addProperty(UTraceSQLiteHelperKt.COL_TAGS, Build.TAGS);
        jsonObject2.addProperty("serial", Build.SERIAL);
        jsonObject2.addProperty("user", Build.USER);
        jsonObject2.addProperty("type", Build.TYPE);
        jsonObject2.addProperty("bootloader", Build.BOOTLOADER);
        jsonObject2.addProperty("osVersion", Build.VERSION.INCREMENTAL);
        jsonObject2.addProperty("patch", this.f14570e);
        jsonObject2.addProperty("memSize", Long.valueOf(this.a));
        jsonObject2.addProperty("screenWidth", Integer.valueOf(this.b));
        jsonObject2.addProperty("screenHeight", Integer.valueOf(this.f14569c));
        jsonObject2.addProperty("screenDpi", Integer.valueOf(this.d));
        jsonObject2.addProperty("cpuType", this.f);
        jsonObject.add("DevInfo", jsonObject2);
    }

    @Override // com.oplus.aiunit.vision.qnm
    public boolean b(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        this.a = memoryInfo.totalMem / 1048576;
        this.f14570e = Build.VERSION.SECURITY_PATCH;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            this.b = displayMetrics.widthPixels;
            this.f14569c = displayMetrics.heightPixels;
            this.d = displayMetrics.densityDpi;
        }
        String[] strArr = Build.SUPPORTED_ABIS;
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
            sb.append(",");
        }
        sb.delete(sb.length() - 1, sb.length());
        this.f = sb.toString();
        return false;
    }
}
