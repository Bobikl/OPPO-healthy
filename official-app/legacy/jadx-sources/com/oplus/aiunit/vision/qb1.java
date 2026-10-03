package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Build;
import android.util.ArrayMap;
import androidx.annotation.NonNull;
import com.heytap.connect.config.connectid.ConnectIdLogic;
import com.heytap.health.bandface.watchface.worldclock.cities.CityBean;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.seedling.sdk.statistics.StatisticsTrackUtil;
import com.oplus.web.container.safe.model.HostSecurityLevel;
import com.platform.sdk.center.webview.js.AcCommonApiMethod;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class qb1 extends p51 {

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

    public qb1() {
        super("vip", AcCommonApiMethod.GET_CLIENT_CONTEXT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(HostSecurityLevel hostSecurityLevel, lr9 lr9Var) {
        try {
            Map<String, String> mapH = h(c94.b(), hostSecurityLevel);
            if (mapH == null) {
                d(lr9Var, 5000, "map is null");
            } else {
                f(lr9Var, new JSONObject(mapH));
            }
        } catch (Throwable th) {
            m7b.f("BasicInfoInterceptor", "intercept basic info failed!", th);
            d(lr9Var, 5000, th.getMessage());
        }
    }

    @Override // com.oplus.aiunit.vision.qr9
    public boolean a(@NonNull or9 or9Var, @NonNull kja kjaVar, @NonNull final lr9 lr9Var) {
        final HostSecurityLevel hostSecurityLevelB = b(or9Var);
        mwj.k(new Runnable() { // from class: com.oplus.aiunit.vision.ob1
            @Override // java.lang.Runnable
            public final void run() {
                this.i.l(hostSecurityLevelB, lr9Var);
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
        arrayMap.put("romBuildOtaVer", wi5.e());
        arrayMap.put("romProductName", wi5.f());
        arrayMap.put("ColorOsVersion", e4d.a());
        arrayMap.put("romBuildDisplay", wi5.d());
        arrayMap.put(StatisticsTrackUtil.KEY_PACKAGE_NAME, context.getPackageName());
        arrayMap.put(SpeechConstant.KEY_APP_VERSION, String.valueOf(z70.a(context)));
        arrayMap.put("language", Locale.getDefault().getLanguage());
        arrayMap.put("languageTag", wi5.c());
        arrayMap.put(CityBean.LOCALE, Locale.getDefault().toString());
        arrayMap.put(ConnectIdLogic.PARAM_TIMEZONE, Calendar.getInstance().getTimeZone().getID());
        return arrayMap;
    }
}
