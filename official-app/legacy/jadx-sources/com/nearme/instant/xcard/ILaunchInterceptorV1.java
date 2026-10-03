package com.nearme.instant.xcard;

import android.content.Intent;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public interface ILaunchInterceptorV1 {
    public static final String KEY_ROUND_CORNER = "__round_corner__";
    public static final String KEY_TAG = "__tag__";
    public static final String KEY_TAG_KEY = "__tag_key__";
    public static final String KEY_VIEW = "__view__";

    void onStartActivity(Intent intent, String str, Map<String, Object> map);
}
