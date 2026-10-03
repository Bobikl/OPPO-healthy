package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J,\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J$\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J,\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0007¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/zbe;", "", "", "url", "traceID", "", "a", "code", "msg", "c", MapSchema.FIELD_NAME_ENTRY, "d", "b", "<init>", "()V", "paysdk_web_release"}, k = 1, mv = {1, 8, 0})
public final class zbe {

    @NotNull
    public static final zbe INSTANCE = new zbe();

    @JvmStatic
    @NotNull
    public static final Map<String, String> a(@NotNull String url, @NotNull String traceID) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(traceID, "traceID");
        HashMap map = new HashMap();
        map.put("method_id", "event_id_download_channel_app_get_url");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_download_channel_app_get_url");
        map.put("url", url);
        map.put("traceID", traceID);
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(__arguments)");
        return mapUnmodifiableMap;
    }

    @JvmStatic
    @NotNull
    public static final Map<String, String> b(@NotNull String traceID) {
        Intrinsics.checkNotNullParameter(traceID, "traceID");
        HashMap map = new HashMap();
        map.put("method_id", "event_id_not_send_pay_result");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_not_send_pay_result");
        map.put("traceID", traceID);
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(__arguments)");
        return mapUnmodifiableMap;
    }

    @JvmStatic
    @NotNull
    public static final Map<String, String> c(@NotNull String code, @NotNull String msg, @NotNull String traceID) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(traceID, "traceID");
        HashMap map = new HashMap();
        map.put("method_id", "event_id_open_browser_download_app_result");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_open_browser_download_app_result");
        map.put("code", code);
        map.put("msg", msg);
        map.put("traceID", traceID);
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(__arguments)");
        return mapUnmodifiableMap;
    }

    @JvmStatic
    @NotNull
    public static final Map<String, String> d(@NotNull String code, @NotNull String msg, @NotNull String traceID) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(traceID, "traceID");
        HashMap map = new HashMap();
        map.put("method_id", "event_id_send_pay_result");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_send_pay_result");
        map.put("code", code);
        map.put("msg", msg);
        map.put("traceID", traceID);
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(__arguments)");
        return mapUnmodifiableMap;
    }

    @JvmStatic
    @NotNull
    public static final Map<String, String> e(@NotNull String msg, @NotNull String traceID) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(traceID, "traceID");
        HashMap map = new HashMap();
        map.put("method_id", "event_id_send_pay_result_start");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_send_pay_result_start");
        map.put("msg", msg);
        map.put("traceID", traceID);
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(__arguments)");
        return mapUnmodifiableMap;
    }
}
