package com.oplus.aiunit.vision;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.oplus.instant.router.callback.Callback;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class mkm {

    public static class a extends Callback {
        @Override // com.oplus.instant.router.callback.Callback
        public void onResponse(Callback.Response response) {
            epm.b("GameUtil", "wrapCallback onResponse=" + response);
        }
    }

    public static class b extends Callback {
        public Callback a;
        public Context b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f14115c;

        public b(Context context, String str, Callback callback) {
            this.a = callback;
            this.b = context;
            this.f14115c = str;
        }

        @Override // com.oplus.instant.router.callback.Callback
        public void onResponse(Callback.Response response) {
            if (response != null && response.getCode() == 1) {
                try {
                    epm.e("GameUtil", "wrapper onResponse " + response);
                    Intent intent = new Intent();
                    intent.setComponent(new ComponentName(zym.j(this.b), lbm.a("Y29tLm5lYXJtZS5pbnN0YW50LnF1aWNrZ2FtZS5hY3Rpdml0eS5HYW1lVHJhbnNmZXJBY3Rpdml0eQ==")));
                    intent.putExtra("req_uri", this.f14115c);
                    this.b.startActivity(intent);
                } catch (Exception e2) {
                    epm.e("GameUtil", "wrapper onResponse ex:" + e2.getMessage());
                    response = new Callback.Response();
                    response.setCode(-4);
                    response.setMsg("start transform page failed");
                }
            }
            Callback callback = this.a;
            if (callback != null) {
                callback.onResponse(response);
            }
        }
    }

    public static Callback a(Context context, String str, Callback callback) {
        if (callback == null) {
            callback = new a();
        }
        return new b(context, str, callback);
    }

    public static boolean b(Context context, String str, Map<String, String> map) {
        if (str == null || !str.startsWith("hap://game") || zym.h(context) < 3100) {
            return false;
        }
        try {
            if ("1".equals(Uri.parse(str).getQueryParameter("in_one_task"))) {
                return true;
            }
        } catch (Exception e2) {
            epm.d("GameUtil", e2);
        }
        return map != null && "1".equals(map.get("in_one_task"));
    }
}
