package com.lifesense.plugin.ble.device.a.a.a;

import android.os.Handler;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: loaded from: classes5.dex */
public class a extends com.lifesense.plugin.ble.b.a {
    private static a a;
    private Map b = new ConcurrentSkipListMap();

    private a() {
    }

    public static synchronized a a() {
        a aVar = a;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        a = aVar2;
        return aVar2;
    }

    public e a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (e) this.b.get(com.lifesense.plugin.ble.c.b.a(str).replace(":", ""));
    }

    public void a(String str, Handler handler) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strReplace = com.lifesense.plugin.ble.c.b.a(str).replace(":", "");
        if (this.b.containsKey(strReplace)) {
            this.b.remove(strReplace);
        }
        this.b.put(strReplace, new e(str, handler));
    }
}
