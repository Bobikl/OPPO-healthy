package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Build;
import android.util.ArrayMap;
import androidx.annotation.NonNull;
import com.heytap.connect.config.connectid.ConnectIdLogic;
import com.heytap.health.bandface.watchface.worldclock.cities.CityBean;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.seedling.sdk.statistics.StatisticsTrackUtil;
import com.platform.sdk.center.webview.js.AcCommonApiMethod;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class rb1 extends q51 {
    private static final String TAG = "BasicInfoInterceptor";
    protected Map<String, String> map20;
    protected Map<String, String> map30;
    protected Map<String, String> map80;
    protected Map<String, String> nonSensitiveMap;
    protected qig<String> scoreMap;
    protected Map<String, String> sensitiveMap;

    public rb1() {
        super("vip", AcCommonApiMethod.GET_CLIENT_CONTEXT);
        this.scoreMap = new qig<>();
        this.nonSensitiveMap = null;
        this.map20 = new ArrayMap();
        this.map30 = new ArrayMap();
        this.map80 = new ArrayMap();
        this.sensitiveMap = new ArrayMap(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$intercept$0(int i, kr9 kr9Var) {
        try {
            Map<String, String> basicInfoBySore = getBasicInfoBySore(d94.b(), i);
            if (basicInfoBySore == null) {
                onFailed(kr9Var, 5000, "map is null");
            } else {
                onSuccess(kr9Var, new JSONObject(basicInfoBySore));
            }
        } catch (Throwable th) {
            q7b.f(TAG, "intercept basic info failed!", th);
            onFailed(kr9Var, 5000, th.getMessage());
        }
    }

    public synchronized Map<String, String> getBasicInfoBySore(Context context, int i) throws JSONException {
        handleHighSensitiveInfo(context);
        handleNoneSensitiveInfo(context);
        handleCustomBasicInfo(context);
        handleScoreMap(context);
        return this.scoreMap.c(i);
    }

    public void handleCustomBasicInfo(Context context) {
    }

    public void handleHighSensitiveInfo(Context context) {
    }

    public void handleNoneSensitiveInfo(Context context) throws JSONException {
        if (this.nonSensitiveMap == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.nonSensitiveMap = arrayMap;
            arrayMap.put("model", Build.MODEL);
            this.nonSensitiveMap.put("romBuildOtaVer", xi5.e());
            this.nonSensitiveMap.put("romProductName", xi5.f());
            this.nonSensitiveMap.put("ColorOsVersion", f4d.a());
            this.nonSensitiveMap.put("romBuildDisplay", xi5.d());
            this.nonSensitiveMap.put(StatisticsTrackUtil.KEY_PACKAGE_NAME, context.getPackageName());
            this.nonSensitiveMap.put(SpeechConstant.KEY_APP_VERSION, String.valueOf(b80.a(context)));
        }
        this.nonSensitiveMap.put("language", Locale.getDefault().getLanguage());
        this.nonSensitiveMap.put("languageTag", xi5.c());
        this.nonSensitiveMap.put(CityBean.LOCALE, Locale.getDefault().toString());
        this.nonSensitiveMap.put(ConnectIdLogic.PARAM_TIMEZONE, Calendar.getInstance().getTimeZone().getID());
    }

    public void handleScoreMap(Context context) {
        this.scoreMap.a();
        this.scoreMap.d(0, this.nonSensitiveMap);
        this.scoreMap.d(20, this.map20);
        this.scoreMap.d(30, this.map30);
        this.scoreMap.d(80, this.map80);
        this.scoreMap.d(95, this.sensitiveMap);
    }

    @Override // com.oplus.aiunit.vision.rr9
    public boolean intercept(@NonNull pr9 pr9Var, @NonNull jja jjaVar, @NonNull final kr9 kr9Var) throws Throwable {
        final int score = getScore(pr9Var, 1);
        lwj.k(new Runnable() { // from class: com.oplus.aiunit.vision.pb1
            @Override // java.lang.Runnable
            public final void run() {
                this.i.lambda$intercept$0(score, kr9Var);
            }
        });
        return true;
    }
}
