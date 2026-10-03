package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class rma {
    public static boolean a(Context context, String str) {
        try {
            context.startActivity(context.getPackageManager().getLaunchIntentForPackage(str));
            return true;
        } catch (Exception e2) {
            q7b.g("JumpHelper", e2);
            return false;
        }
    }

    public static void b(Context context, String str, String str2, JSONObject jSONObject) throws JSONException {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        Intent intent = new Intent(str);
        if (!TextUtils.isEmpty(str2)) {
            intent.setPackage(str2);
        }
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                intent.putExtra(next, jSONObject.optString(next));
            }
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }
}
