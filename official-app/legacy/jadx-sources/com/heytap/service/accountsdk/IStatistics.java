package com.heytap.service.accountsdk;

import android.content.Context;
import androidx.annotation.Keep;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public interface IStatistics {
    int getAppCode(Context context);

    void onBaseEvent(Context context, String str, String str2, String str3, String str4, Map<String, String> map);

    void onCommon(Context context, String str, String str2, String str3, String str4, Map<String, String> map);

    void onCommon(Context context, String str, String str2, String str3, String str4, Map<String, String> map, boolean z);

    void onCommon(Context context, String str, String str2, Map<String, String> map, boolean z);

    void onDebug(Context context, boolean z);

    void onError(Context context);

    void onEvent(Context context, String str, String str2, String str3, Map<String, String> map);

    void onKVEvent(Context context, String str, String str2, String str3, Map<String, String> map);

    void onKVEvent(Context context, String str, Map<String, String> map);

    void onKVEventEnd(Context context, String str);

    void onKVEventEnd(Context context, String str, String str2, String str3);

    void onKVEventStart(Context context, String str, String str2, String str3, Map<String, String> map);

    void onKVEventStart(Context context, String str, Map<String, String> map);

    void removeSsoID(Context context);

    void setSsoID(Context context, String str);
}
