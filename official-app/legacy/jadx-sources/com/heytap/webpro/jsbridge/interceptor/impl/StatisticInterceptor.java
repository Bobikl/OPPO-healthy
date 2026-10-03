package com.heytap.webpro.jsbridge.interceptor.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.heytap.webpro.common.exception.ParamException;
import com.oplus.aiunit.vision.jja;
import com.oplus.aiunit.vision.kr9;
import com.oplus.aiunit.vision.lwj;
import com.oplus.aiunit.vision.pr9;
import com.oplus.aiunit.vision.q51;
import com.platform.sdk.center.webview.js.AcCommonApiMethod;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class StatisticInterceptor extends q51 {
    public StatisticInterceptor() {
        super("vip", AcCommonApiMethod.STATISTICS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$intercept$0(jja jjaVar, kr9 kr9Var) {
        try {
            String strE = jjaVar.e("logTag", "");
            String strE2 = jjaVar.e("eventID", "");
            if (TextUtils.isEmpty(strE2)) {
                strE2 = jjaVar.e("eventId", "");
            }
            if (TextUtils.isEmpty(strE) || TextUtils.isEmpty(strE2)) {
                throw new ParamException("logTag or eventID is empty");
            }
            Map<String, String> map = (Map) new Gson().fromJson(jjaVar.d("logMap"), new TypeToken<Map<String, String>>() { // from class: com.heytap.webpro.jsbridge.interceptor.impl.StatisticInterceptor.1
            }.getType());
            if (map == null) {
                throw new ParamException("map is null");
            }
            onStatistic(strE, strE2, map, false);
            onSuccess(kr9Var);
        } catch (Throwable th) {
            onFailed(kr9Var, th);
        }
    }

    @Override // com.oplus.aiunit.vision.rr9
    public boolean intercept(@NonNull pr9 pr9Var, @NonNull final jja jjaVar, @NonNull final kr9 kr9Var) throws Throwable {
        lwj.k(new Runnable() { // from class: com.oplus.aiunit.vision.mni
            @Override // java.lang.Runnable
            public final void run() {
                this.i.lambda$intercept$0(jjaVar, kr9Var);
            }
        });
        return true;
    }

    public abstract void onStatistic(String str, String str2, @Nullable Map<String, String> map, boolean z);
}
