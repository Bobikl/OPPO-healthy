package com.oplus.statistics.data;

import android.content.Context;
import android.text.TextUtils;
import android.util.ArrayMap;
import androidx.annotation.NonNull;
import com.oplus.statistics.OTrackContext;
import com.oplus.statistics.data.TrackEvent;
import com.oplus.statistics.record.StatIdManager;
import com.oplus.statistics.storage.PreferenceHandler;
import com.oplus.statistics.util.AccountUtil;
import com.oplus.statistics.util.ApkInfoUtil;
import com.oplus.statistics.util.LogUtil;
import com.oplus.statistics.util.Supplier;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public abstract class TrackEvent {
    public final Context a;
    public final ArrayMap<String, Object> b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public int g;

    public TrackEvent(@NonNull Context context) {
        Objects.requireNonNull(context, "TrackEvent: context is null");
        this.a = context;
        this.b = new ArrayMap<>();
        f(context);
    }

    public static /* synthetic */ String g() {
        return "appId is empty";
    }

    public void b(String str, int i) {
        this.b.put(str, Integer.valueOf(i));
    }

    public void c(String str, long j) {
        this.b.put(str, Long.valueOf(j));
    }

    public void d(String str, String str2) {
        this.b.put(str, str2);
    }

    public void e(String str, boolean z) {
        this.b.put(str, Boolean.valueOf(z));
    }

    public final void f(Context context) {
        this.b.put("dataType", Integer.valueOf(getEventType()));
        this.b.put(PreferenceHandler.SSOID, AccountUtil.getSsoId(context));
        this.b.put("statSId", StatIdManager.getInstance().getAppSessionId(context));
        String appCode = ApkInfoUtil.getAppCode(context);
        if (TextUtils.isEmpty(appCode)) {
            LogUtil.w("TrackEvent", new Supplier() { // from class: com.oplus.aiunit.vision.z9k
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return TrackEvent.g();
                }
            });
        } else {
            setAppId(appCode);
        }
        OTrackContext oTrackContext = OTrackContext.get(appCode);
        if (oTrackContext == null) {
            this.b.put("appVersion", ApkInfoUtil.getVersionName(context));
            this.b.put("appPackage", ApkInfoUtil.getPackageName(context));
            this.b.put("appName", ApkInfoUtil.getAppName(context));
        } else {
            this.b.put("headerFlag", Integer.valueOf(oTrackContext.getConfig().getHeaderFlag()));
            this.b.put("appVersion", oTrackContext.getConfig().getVersionName());
            this.b.put("appPackage", oTrackContext.getConfig().getPackageName());
            this.b.put("appName", oTrackContext.getConfig().getAppName());
        }
    }

    public String getAppId() {
        return this.c;
    }

    public String getAppName() {
        return this.f;
    }

    @NonNull
    public Context getContext() {
        return this.a;
    }

    public abstract int getEventType();

    public String getPackageName() {
        return this.d;
    }

    @NonNull
    public Map<String, Object> getTrackInfo() {
        return new ArrayMap(this.b);
    }

    public String getVersionName() {
        return this.e;
    }

    public void setAppId(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.c = str;
        d("appIdStr", str);
        if (TextUtils.isDigitsOnly(this.c)) {
            b("appId", Integer.parseInt(this.c));
        }
    }

    public void setAppName(String str) {
        this.f = str;
        d("appName", str);
    }

    public void setHeaderFlag(int i) {
        this.g = i;
        b("headerFlag", i);
    }

    public void setPackageName(String str) {
        this.d = str;
        d("appPackage", str);
    }

    public void setVersionName(String str) {
        this.e = str;
        d("appVersion", str);
    }
}
