package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface yq9 {
    public static final String METHOD_GET = "GET";
    public static final String METHOD_POST = "POST";

    @NonNull
    Map<String, String> a();

    String getContent();

    String getContentType();

    @NonNull
    String getMethod();

    @NonNull
    String getUrl();
}
