package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.gson.JsonObject;
import com.heytap.nearx.tangramconfig.strategy.Fields;

/* JADX INFO: loaded from: classes8.dex */
public class ltd extends k7a {
    public String a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13827c;
    public String d = "1.1.0";

    @Override // com.oplus.aiunit.vision.k7a
    public boolean b(Context context) {
        d(context);
        return false;
    }

    @Override // com.oplus.aiunit.vision.k7a
    public void c(JsonObject jsonObject) {
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("batteryStatus", this.a);
        jsonObject2.addProperty("batteryPresent", Boolean.valueOf(this.f13827c));
        jsonObject2.addProperty("batteryHealth", Integer.valueOf(this.b));
        jsonObject2.addProperty(Fields.SDK_VERSION, this.d);
        jsonObject.add("OtherInfo", jsonObject2);
    }

    public final void d(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
            if (intExtra == 1) {
                this.a = "unknown";
            } else if (intExtra == 2) {
                this.a = "charging";
            } else if (intExtra == 3) {
                this.a = "discharging";
            } else if (intExtra == 4) {
                this.a = "not_charging";
            } else if (intExtra != 5) {
                this.a = "unknown";
            } else {
                this.a = "full";
            }
            this.f13827c = intentRegisterReceiver.getBooleanExtra("present", false);
            this.b = intentRegisterReceiver.getIntExtra("health", 1);
        }
    }
}
