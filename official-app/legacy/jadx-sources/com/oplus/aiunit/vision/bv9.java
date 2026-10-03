package com.oplus.aiunit.vision;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface bv9 {
    default String encodeParam(String str) {
        return str;
    }

    default String getParamValue(String str) {
        Map<String, String> params;
        if (TextUtils.isEmpty(str) || (params = getParams()) == null || params.isEmpty()) {
            return null;
        }
        return params.get(str);
    }

    @NonNull
    Map<String, String> getParams();

    String getSign(Map<String, String> map);
}
