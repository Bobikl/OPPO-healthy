package com.oplus.statistics.record;

import android.content.Context;
import com.oplus.statistics.storage.PreferenceHandler;
import java.util.UUID;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class StatIdManager {
    public static final long EXPIRE_TIME_MS = 30000;
    public String a;
    public long b;

    public static class Holder {
        public static final StatIdManager a = new StatIdManager();
    }

    public static StatIdManager getInstance() {
        return Holder.a;
    }

    public final String a() {
        return UUID.randomUUID().toString();
    }

    public final long b(Context context) {
        return PreferenceHandler.getLong(context, "AppExitTime", 0L);
    }

    public final String c(Context context) {
        return PreferenceHandler.getString(context, "AppSessionId", "");
    }

    public final boolean d(Context context) {
        if (this.b == 0) {
            this.b = b(context);
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.b;
        return jCurrentTimeMillis > 0 && jCurrentTimeMillis < 30000;
    }

    public final void e(Context context, long j) {
        PreferenceHandler.setLong(context, "AppExitTime", j);
    }

    public final void f(Context context, String str) {
        PreferenceHandler.setString(context, "AppSessionId", str);
    }

    public String getAppSessionId(Context context) {
        if (this.a == null) {
            refreshAppSessionIdIfNeed(context);
        }
        return this.a;
    }

    public void onAppExit(Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.b = jCurrentTimeMillis;
        e(context, jCurrentTimeMillis);
    }

    public void refreshAppSessionId(Context context) {
        String strA = a();
        this.a = strA;
        f(context, strA);
    }

    public void refreshAppSessionIdIfNeed(Context context) {
        if (d(context)) {
            this.a = c(context);
        } else {
            refreshAppSessionId(context);
        }
    }

    public StatIdManager() {
        this.a = null;
        this.b = 0L;
    }
}
