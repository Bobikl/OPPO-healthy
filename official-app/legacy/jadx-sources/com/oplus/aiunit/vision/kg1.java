package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class kg1 {
    @NonNull
    public static Map<String, String> a(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        HashMap map = new HashMap(8);
        map.put("method_id", "event_id_chrome_client_on_console_message");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_chrome_client_on_console_message");
        map.put("categoryStatId", "20151_WEB_SDK_STAT");
        map.put("code", str);
        map.put("message", str2);
        map.put("url", str3);
        return Collections.unmodifiableMap(map);
    }

    @NonNull
    public static Map<String, String> b(@NonNull String str) {
        HashMap map = new HashMap(6);
        map.put("method_id", "event_id_chrome_client_on_progress_changed");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_chrome_client_on_progress_changed");
        map.put("categoryStatId", "20151_WEB_SDK_STAT");
        map.put("url", str);
        return Collections.unmodifiableMap(map);
    }

    @NonNull
    public static Map<String, String> c(@NonNull String str) {
        HashMap map = new HashMap(6);
        map.put("method_id", "event_id_chrome_client_on_received_icon");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_chrome_client_on_received_icon");
        map.put("categoryStatId", "20151_WEB_SDK_STAT");
        map.put("url", str);
        return Collections.unmodifiableMap(map);
    }

    @NonNull
    public static Map<String, String> d(@NonNull String str, @NonNull String str2) {
        HashMap map = new HashMap(7);
        map.put("method_id", "event_id_chrome_client_on_received_title");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_chrome_client_on_received_title");
        map.put("categoryStatId", "20151_WEB_SDK_STAT");
        map.put("title", str);
        map.put("url", str2);
        return Collections.unmodifiableMap(map);
    }

    @NonNull
    public static Map<String, String> e(@NonNull String str, @NonNull String str2) {
        HashMap map = new HashMap(7);
        map.put("method_id", "event_id_client_detect_white_screen");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_client_detect_white_screen");
        map.put("categoryStatId", "20151_WEB_SDK_STAT");
        map.put("isWhite", str);
        map.put("url", str2);
        return Collections.unmodifiableMap(map);
    }

    @NonNull
    public static Map<String, String> f(@NonNull String str, @NonNull String str2) {
        HashMap map = new HashMap(7);
        map.put("method_id", "event_id_client_load_time");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_client_load_time");
        map.put("categoryStatId", "20151_WEB_SDK_STAT");
        map.put(ClickApiEntity.TIME, str);
        map.put("url", str2);
        return Collections.unmodifiableMap(map);
    }

    @NonNull
    public static Map<String, String> g(@NonNull String str) {
        HashMap map = new HashMap(6);
        map.put("method_id", "event_id_client_on_page_commit_visible");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_client_on_page_commit_visible");
        map.put("categoryStatId", "20151_WEB_SDK_STAT");
        map.put("url", str);
        return Collections.unmodifiableMap(map);
    }

    @NonNull
    public static Map<String, String> h(@NonNull String str) {
        HashMap map = new HashMap(6);
        map.put("method_id", "event_id_client_on_page_started");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_client_on_page_started");
        map.put("categoryStatId", "20151_WEB_SDK_STAT");
        map.put("url", str);
        return Collections.unmodifiableMap(map);
    }

    @NonNull
    public static Map<String, String> i(@NonNull String str) {
        HashMap map = new HashMap(6);
        map.put("method_id", "event_id_client_should_on_page_finished");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_client_should_on_page_finished");
        map.put("categoryStatId", "20151_WEB_SDK_STAT");
        map.put("url", str);
        return Collections.unmodifiableMap(map);
    }

    @NonNull
    public static Map<String, String> j(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        HashMap map = new HashMap(8);
        map.put("method_id", "event_id_client_should_on_received_error");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_client_should_on_received_error");
        map.put("categoryStatId", "20151_WEB_SDK_STAT");
        map.put("err_code", str);
        map.put("err_msg", str2);
        map.put("url", str3);
        return Collections.unmodifiableMap(map);
    }

    @NonNull
    public static Map<String, String> k(@NonNull String str) {
        HashMap map = new HashMap(6);
        map.put("method_id", "event_id_client_should_override_url_loading");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_client_should_override_url_loading");
        map.put("categoryStatId", "20151_WEB_SDK_STAT");
        map.put("url", str);
        return Collections.unmodifiableMap(map);
    }
}
