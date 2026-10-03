package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Build;
import android.util.ArrayMap;
import androidx.annotation.NonNull;
import com.oplus.seedling.sdk.statistics.StatisticsTrackUtil;
import com.oplus.web.container.safe.model.HostSecurityLevel;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class fc1 extends d61 {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[HostSecurityLevel.values().length];
            a = iArr;
            try {
                iArr[HostSecurityLevel.HIGH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[HostSecurityLevel.LOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[HostSecurityLevel.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public fc1() {
        super("vip", "getClientContext");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(HostSecurityLevel hostSecurityLevel, rs9 rs9Var) {
        try {
            Map<String, String> mapH = h(q94.b(), hostSecurityLevel);
            if (mapH == null) {
                d(rs9Var, 5000, "map is null");
            } else {
                f(rs9Var, new JSONObject(mapH));
            }
        } catch (Throwable th) {
            y8b.f("BasicInfoInterceptor", "intercept basic info failed!", th);
            d(rs9Var, 5000, th.getMessage());
        }
    }

    @Override // com.oplus.aiunit.vision.ws9
    public boolean a(@NonNull us9 us9Var, @NonNull ska skaVar, @NonNull final rs9 rs9Var) {
        final HostSecurityLevel hostSecurityLevelB = b(us9Var);
        o0k.k(new Runnable() { // from class: com.oplus.aiunit.vision.dc1
            @Override // java.lang.Runnable
            public final void run() {
                this.i.l(hostSecurityLevelB, rs9Var);
            }
        });
        return true;
    }

    public synchronized Map<String, String> h(Context context, HostSecurityLevel hostSecurityLevel) {
        HashMap map;
        Map<String, String> mapJ = j(context);
        Map<String, String> mapK = k(context);
        Map<String, String> mapI = i(context);
        map = new HashMap(8);
        int i = a.a[hostSecurityLevel.ordinal()];
        if (i == 1) {
            if (mapJ != null) {
                map.putAll(mapJ);
            }
            if (mapK != null) {
                map.putAll(mapK);
            }
            if (mapI != null) {
                map.putAll(mapI);
            }
        } else if (i == 2) {
            if (mapK != null) {
                map.putAll(mapK);
            }
            if (mapI != null) {
                map.putAll(mapI);
            }
        } else if (mapK != null) {
            map.putAll(mapK);
        }
        return map;
    }

    public Map<String, String> i(Context context) {
        return null;
    }

    public Map<String, String> j(Context context) {
        return null;
    }

    public Map<String, String> k(Context context) {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("model", Build.MODEL);
        arrayMap.put("romBuildOtaVer", sj5.e());
        arrayMap.put("romProductName", sj5.f());
        arrayMap.put("ColorOsVersion", w5d.a());
        arrayMap.put("romBuildDisplay", sj5.d());
        arrayMap.put(StatisticsTrackUtil.KEY_PACKAGE_NAME, context.getPackageName());
        arrayMap.put("appVersion", String.valueOf(j80.a(context)));
        arrayMap.put("language", Locale.getDefault().getLanguage());
        arrayMap.put("languageTag", sj5.c());
        arrayMap.put("locale", Locale.getDefault().toString());
        arrayMap.put("timeZone", Calendar.getInstance().getTimeZone().getID());
        return arrayMap;
    }
}
