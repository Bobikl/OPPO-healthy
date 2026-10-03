package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class knm {
    public static void a(final Context context, final String str) {
        Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: com.oplus.aiunit.vision.dnm
            @Override // java.lang.Runnable
            public final void run() {
                knm.b(context, str);
            }
        });
    }

    public static String b(Context context, String str) {
        String string = "";
        try {
            JSONObject jSONObject = new JSONObject(rnm.c_c.b(context).toString());
            if (str != null && str.length() > 0) {
                JSONObject jSONObject2 = new JSONObject(str);
                if (jSONObject2.has("cliEnv")) {
                    jSONObject.put("cliEnv", jSONObject2.get("cliEnv"));
                }
            }
            string = jSONObject.toString();
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("srpcfg", 0).edit();
            editorEdit.putString("cliInfo1", string != null ? Base64.encodeToString(string.getBytes(), 2) : null);
            editorEdit.apply();
        } catch (JSONException e2) {
            gnm.a(e2.toString());
        }
        return string;
    }
}
