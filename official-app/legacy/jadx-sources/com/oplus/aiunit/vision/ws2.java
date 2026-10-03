package com.oplus.aiunit.vision;

import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ws2 {

    public static class a {
        public static final int DENIED = -8;
        public static final int ENGINE_VERSION_TOO_LOW = -16;
        public static final int FAIL = -4;
        public static final int SUCCESS = 1;
        public static final int UPDATE_CANCEL = -11;
        public static final String UPDATE_CANCEL_MESSAGE = "platform need update but user canceled";
        public static final int UPDATE_ERROR = -10;
        public static final String UPDATE_ERROR_MESSAGE = "platform need update but error occurred";
        public static final int UPDATE_SUCCESS = 10;
        public static final String UPDATE_SUCCESS_MESSAGE = "platform update success, please call request again";
        public int a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Map<String, Object> f18379c = new HashMap();

        public int a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }

        public void c(Map<String, Object> map) {
            this.f18379c.putAll(map);
        }

        public void d(int i) {
            this.a = i;
        }

        public void e(String str) {
            this.b = str;
        }

        public String toString() {
            return this.a + "#" + this.b;
        }
    }

    public abstract void a(a aVar);

    public void b(Map<String, Object> map, Cursor cursor) {
        Map<String, Object> mapB = k2n.b(cursor);
        a aVar = new a();
        if (mapB != null) {
            aVar.a = Long.valueOf(((Long) mapB.get("code")).longValue()).intValue();
            aVar.b = (String) mapB.get("msg");
            aVar.c(mapB);
        } else {
            aVar.a = -1;
            aVar.b = "fail to get response";
        }
        a(aVar);
    }
}
