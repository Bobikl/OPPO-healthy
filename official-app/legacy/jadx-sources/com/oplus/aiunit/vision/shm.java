package com.oplus.aiunit.vision;

import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import okhttp3.MediaType;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class shm {
    public static final String a = "shm";

    public static com.oplus.ocs.authenticate.info.c a(String str) {
        if (g70.b().c()) {
            Log.e(a, "not need online check");
            return null;
        }
        Log.d(a, "do network");
        HashMap map = new HashMap();
        map.put("authCodes", str);
        map.put(mna.ACCESSKEY, "1000013");
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        map.put("timestamp", sb.toString());
        try {
            return ((obm) g70.b().a(obm.class)).a(gqf.create(MediaType.parse("application/json; charset=utf-8"), new JSONObject(olm.a(map)).toString())).execute().a();
        } catch (IOException e2) {
            e2.printStackTrace();
            Log.e(a, String.format("getting authCode gets an exception that is %s", e2.getMessage()));
            return null;
        }
    }
}
