package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.oplus.statistics.storage.PreferenceHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/ice;", "Lcom/oplus/aiunit/vision/f78;", "Landroid/content/Context;", "p0", "Landroidx/lifecycle/LiveData;", "Lcom/oplus/aiunit/vision/uo3;", "Lorg/json/JSONObject;", "i", "", "c", "Ljava/lang/String;", "userInfoJsonStr", "<init>", "(Ljava/lang/String;)V", "paysdk_web_release"}, k = 1, mv = {1, 8, 0})
public final class ice extends f78 {

    @Nullable
    public final String c;

    public ice(@Nullable String str) {
        this.c = str;
    }

    @Override // com.oplus.aiunit.vision.f78
    @NotNull
    public LiveData<uo3<JSONObject>> i(@Nullable Context p0) {
        MutableLiveData mutableLiveData = new MutableLiveData();
        if (p0 != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                pce.b("PayGetTokenInterceptor userInfoJsonStr: " + this.c);
                String str = this.c;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                JSONObject jSONObject2 = new JSONObject(str);
                String strOptString = jSONObject2.optString(PreferenceHandler.SSOID);
                if (strOptString == null) {
                    strOptString = "";
                } else {
                    Intrinsics.checkNotNullExpressionValue(strOptString, "jsonObjectData.optString…tInfoKey.SSOID_KEY) ?: \"\"");
                }
                jSONObject.put(PreferenceHandler.SSOID, strOptString);
                String strOptString2 = jSONObject2.optString("secondaryToken");
                if (strOptString2 == null) {
                    strOptString2 = "";
                } else {
                    Intrinsics.checkNotNullExpressionValue(strOptString2, "jsonObjectData.optString…ECONDARY_TOKEN_KEY) ?: \"\"");
                }
                jSONObject.put("secondaryToken", strOptString2);
                String strOptString3 = jSONObject2.optString("accountName");
                if (strOptString3 == null) {
                    strOptString3 = "";
                } else {
                    Intrinsics.checkNotNullExpressionValue(strOptString3, "jsonObjectData.optString…y.ACCOUNT_NAME_KEY) ?: \"\"");
                }
                jSONObject.put("accountName", strOptString3);
                String strOptString4 = jSONObject2.optString("country");
                if (strOptString4 == null) {
                    strOptString4 = "";
                } else {
                    Intrinsics.checkNotNullExpressionValue(strOptString4, "jsonObjectData.optString…nfoKey.COUNTRY_KEY) ?: \"\"");
                }
                jSONObject.put("country", strOptString4);
                String strOptString5 = jSONObject2.optString("deviceId");
                if (strOptString5 == null) {
                    strOptString5 = "";
                } else {
                    Intrinsics.checkNotNullExpressionValue(strOptString5, "jsonObjectData.optString…oKey.DEVICE_ID_KEY) ?: \"\"");
                }
                jSONObject.put("deviceId", strOptString5);
                String strOptString6 = jSONObject2.optString("isLogin");
                if (strOptString6 == null) {
                    strOptString6 = "";
                } else {
                    Intrinsics.checkNotNullExpressionValue(strOptString6, "jsonObjectData.optString…y.LOGIN_STATUS_KEY) ?: \"\"");
                }
                jSONObject.put("isLogin", strOptString6);
                String strOptString7 = jSONObject2.optString("classifyByAge");
                if (strOptString7 == null) {
                    strOptString7 = "";
                } else {
                    Intrinsics.checkNotNullExpressionValue(strOptString7, "jsonObjectData.optString…LASSIFY_BY_AGE_KEY) ?: \"\"");
                }
                jSONObject.put("classifyByAge", strOptString7);
                String strOptString8 = jSONObject2.optString(PreferenceHandler.SSOID);
                if (strOptString8 == null) {
                    strOptString8 = "";
                } else {
                    Intrinsics.checkNotNullExpressionValue(strOptString8, "jsonObjectData.optString…tInfoKey.SSOID_KEY) ?: \"\"");
                }
                jSONObject.put(PreferenceHandler.SSOID, strOptString8);
                String strOptString9 = jSONObject2.optString("authToken");
                if (strOptString9 != null) {
                    Intrinsics.checkNotNullExpressionValue(strOptString9, "jsonObjectData.optString…Key.AUTH_TOKEN_KEY) ?: \"\"");
                    str2 = strOptString9;
                }
                jSONObject.put("authToken", str2);
            } catch (Exception unused) {
            }
            mutableLiveData.setValue(uo3.b(jSONObject));
        }
        return mutableLiveData;
    }
}
