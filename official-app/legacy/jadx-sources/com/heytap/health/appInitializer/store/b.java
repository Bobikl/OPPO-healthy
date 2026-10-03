package com.heytap.health.appInitializer.store;

import android.content.Context;
import android.text.TextUtils;
import com.oplus.aiunit.vision.a7b;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public class b {
    public static List<Configuration> a(Context context, String str) {
        String strC = c(context, str);
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(strC)) {
            return new ArrayList();
        }
        try {
            JSONArray jSONArray = new JSONArray(strC);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                Configuration configuration = new Configuration();
                configuration.setClassName(jSONObject.getString("clazz_name"));
                arrayList.add(configuration);
            }
            a7b.f("JsonLoader", "getItems | size = " + arrayList.size());
        } catch (JSONException e2) {
            a7b.b("JsonLoader", "getItems | e is " + e2.getMessage());
        }
        return arrayList;
    }

    public static List<Configuration> b(Context context, String str) {
        return a(context, str);
    }

    public static String c(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            a7b.m("JsonLoader", "getJsonFromAssets fileName is null");
            return "[]";
        }
        if (context == null || context.getResources() == null) {
            a7b.m("JsonLoader", "getJsonFromAssets: context is " + context);
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open(str)));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    return sb.toString();
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
                a7b.c("JsonLoader", "getJsonFromAssets: ", e);
            }
            bufferedReader.close();
        } catch (IOException e2) {
            a7b.c("JsonLoader", "getJsonFromAssets: ", e2);
        }
        return sb.toString();
    }
}
