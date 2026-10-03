package com.heytap.upgrade.install;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes19.dex */
public class EventResultDispatcher {
    public static final String EXTRA_ID = "EventResultDispatcher.EXTRA_ID";
    public static final String EXTRA_KEY = "EventResultDispatcher.EXTRA_PATH";
    public static final String EXTRA_LEGACY_STATUS = "android.content.pm.extra.LEGACY_STATUS";
    public static final int f = new Random().nextInt(1000000) - 1000000;
    public final Object a = new Object();
    public final Map<String, b> b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, c> f8345c = new HashMap();
    public final HashMap<String, c> d = new HashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8346e = f + 1;

    public class OutOfIdsException extends Exception {
        public OutOfIdsException() {
        }
    }

    public class b {
        public final int a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f8347c;
        public final Intent d;

        public b(int i, int i2, String str, Intent intent) {
            this.a = i;
            this.b = i2;
            this.f8347c = str;
            this.d = intent;
        }
    }

    public interface c {
        void a(int i, int i2, String str, Intent intent);
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "" + System.currentTimeMillis();
        }
        return str + "_" + System.currentTimeMillis();
    }

    public void a(String str, c cVar) {
        synchronized (this.a) {
            if (this.b.containsKey(str)) {
                b bVarRemove = this.b.remove(str);
                cVar.a(bVarRemove.a, bVarRemove.b, bVarRemove.f8347c, bVarRemove.d);
            } else {
                this.f8345c.put(str, cVar);
            }
        }
    }

    public int c() throws OutOfIdsException {
        int i;
        synchronized (this.a) {
            int i2 = this.f8346e;
            if (i2 == Integer.MAX_VALUE) {
                throw new OutOfIdsException();
            }
            int i3 = i2 + 1;
            this.f8346e = i3;
            i = i3 - 1;
        }
        return i;
    }

    public void d(Context context, Intent intent) {
        if ("oneplus.intent.action.SILENT_INSTALL".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("packageName");
            int intExtra = intent.getIntExtra("status", 1);
            synchronized (this.a) {
                c cVar = this.d.get(stringExtra);
                if (cVar != null) {
                    cVar.a(intExtra, 0, "", intent);
                }
            }
            return;
        }
        int intExtra2 = intent.getIntExtra("android.content.pm.extra.STATUS", 0);
        String stringExtra2 = intent.getStringExtra(EXTRA_KEY);
        if (TextUtils.isEmpty(stringExtra2)) {
            return;
        }
        String stringExtra3 = intent.getStringExtra("android.content.pm.extra.STATUS_MESSAGE");
        int intExtra3 = intent.getIntExtra(EXTRA_LEGACY_STATUS, 0);
        synchronized (this.a) {
            c cVarRemove = this.f8345c.containsKey(stringExtra2) ? this.f8345c.remove(stringExtra2) : null;
            if (cVarRemove != null) {
                cVarRemove.a(intExtra2, intExtra3, stringExtra3, intent);
            } else {
                this.b.put(stringExtra2, new b(intExtra2, intExtra3, stringExtra3, intent));
            }
        }
    }
}
