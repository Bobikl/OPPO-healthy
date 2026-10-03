package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.oplus.smartenginehelper.ParserTag;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class jg1 {
    @NonNull
    public static Map<String, String> a(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) {
        HashMap map = new HashMap(9);
        map.put("method_id", "event_id_get_fragment_activity_name");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_get_fragment_activity_name");
        map.put("categoryStatId", "20151_WEB_SDK_STAT");
        map.put("countryCode", str);
        map.put("traceId", str2);
        map.put("fragment_name", str3);
        map.put("activity_name", str4);
        return Collections.unmodifiableMap(map);
    }

    @NonNull
    public static Map<String, String> b(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) {
        HashMap map = new HashMap(9);
        map.put("method_id", "event_id_hit_black_list_result");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_hit_black_list_result");
        map.put("categoryStatId", "20151_WEB_SDK_STAT");
        map.put("countryCode", str);
        map.put("traceId", str2);
        map.put(TraceConstants.KEY_PKG_NAME, str3);
        map.put("result", str4);
        return Collections.unmodifiableMap(map);
    }

    @NonNull
    public static Map<String, String> c(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        HashMap map = new HashMap(8);
        map.put("method_id", "event_id_hit_white_list_result");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_hit_white_list_result");
        map.put("categoryStatId", "20151_WEB_SDK_STAT");
        map.put("countryCode", str);
        map.put("traceId", str2);
        map.put("result", str3);
        return Collections.unmodifiableMap(map);
    }

    @NonNull
    public static Map<String, String> d(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        HashMap map = new HashMap(8);
        map.put("method_id", "event_id_pay_web_enter");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_pay_web_enter");
        map.put("categoryStatId", "20151_WEB_SDK_STAT");
        map.put("countryCode", str);
        map.put("traceId", str2);
        map.put("plugin", str3);
        return Collections.unmodifiableMap(map);
    }

    @NonNull
    public static Map<String, String> e(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        HashMap map = new HashMap(8);
        map.put("method_id", "event_id_start_deeplink");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_start_deeplink");
        map.put("categoryStatId", "20151_WEB_SDK_STAT");
        map.put("countryCode", str);
        map.put("traceId", str2);
        map.put(ParserTag.TAG_URI, str3);
        return Collections.unmodifiableMap(map);
    }

    @NonNull
    public static Map<String, String> f(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        HashMap map = new HashMap(8);
        map.put("method_id", "event_id_start_url");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_start_url");
        map.put("categoryStatId", "20151_WEB_SDK_STAT");
        map.put("countryCode", str);
        map.put("traceId", str2);
        map.put(ParserTag.TAG_URI, str3);
        return Collections.unmodifiableMap(map);
    }

    @NonNull
    public static Map<String, String> g(@NonNull String str, @NonNull String str2) {
        HashMap map = new HashMap(7);
        map.put("method_id", "event_id_uri_empty");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_uri_empty");
        map.put("categoryStatId", "20151_WEB_SDK_STAT");
        map.put("countryCode", str);
        map.put("traceId", str2);
        return Collections.unmodifiableMap(map);
    }

    @NonNull
    public static Map<String, String> h() {
        HashMap map = new HashMap(5);
        map.put("method_id", "event_id_web_container_activity_on_back_pressed");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_web_container_activity_on_back_pressed");
        map.put("categoryStatId", "20151_WEB_SDK_STAT");
        return Collections.unmodifiableMap(map);
    }

    @NonNull
    public static Map<String, String> i() {
        HashMap map = new HashMap(5);
        map.put("method_id", "event_id_web_container_activity_on_create");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_web_container_activity_on_create");
        map.put("categoryStatId", "20151_WEB_SDK_STAT");
        return Collections.unmodifiableMap(map);
    }

    @NonNull
    public static Map<String, String> j() {
        HashMap map = new HashMap(5);
        map.put("method_id", "event_id_web_container_activity_on_destroy");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_web_container_activity_on_destroy");
        map.put("categoryStatId", "20151_WEB_SDK_STAT");
        return Collections.unmodifiableMap(map);
    }

    @NonNull
    public static Map<String, String> k(@NonNull String str) {
        HashMap map = new HashMap(6);
        map.put("method_id", "event_id_web_container_fragment_on_page_commit_visible");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_web_container_fragment_on_page_commit_visible");
        map.put("categoryStatId", "20151_WEB_SDK_STAT");
        map.put("url", str);
        return Collections.unmodifiableMap(map);
    }

    @NonNull
    public static Map<String, String> l(@NonNull String str) {
        HashMap map = new HashMap(6);
        map.put("method_id", "event_id_web_container_fragment_on_page_finished");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_web_container_fragment_on_page_finished");
        map.put("categoryStatId", "20151_WEB_SDK_STAT");
        map.put("url", str);
        return Collections.unmodifiableMap(map);
    }

    @NonNull
    public static Map<String, String> m(@NonNull String str) {
        HashMap map = new HashMap(6);
        map.put("method_id", "event_id_web_container_fragment_on_page_started");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_web_container_fragment_on_page_started");
        map.put("categoryStatId", "20151_WEB_SDK_STAT");
        map.put("url", str);
        return Collections.unmodifiableMap(map);
    }

    @NonNull
    public static Map<String, String> n(@NonNull String str) {
        HashMap map = new HashMap(6);
        map.put("method_id", "event_id_web_container_fragment_on_progress_changed");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_web_container_fragment_on_progress_changed");
        map.put("categoryStatId", "20151_WEB_SDK_STAT");
        map.put("newProgress", str);
        return Collections.unmodifiableMap(map);
    }

    @NonNull
    public static Map<String, String> o(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) {
        HashMap map = new HashMap(9);
        map.put("method_id", "event_id_web_container_fragment_on_received_error");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_web_container_fragment_on_received_error");
        map.put("categoryStatId", "20151_WEB_SDK_STAT");
        map.put("errorCode", str);
        map.put(iim.a.f, str2);
        map.put("failingUrl", str3);
        map.put("isForMainFrame", str4);
        return Collections.unmodifiableMap(map);
    }

    @NonNull
    public static Map<String, String> p() {
        HashMap map = new HashMap(5);
        map.put("method_id", "event_id_web_container_fragment_on_received_icon");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_web_container_fragment_on_received_icon");
        map.put("categoryStatId", "20151_WEB_SDK_STAT");
        return Collections.unmodifiableMap(map);
    }

    @NonNull
    public static Map<String, String> q(@NonNull String str) {
        HashMap map = new HashMap(6);
        map.put("method_id", "event_id_web_container_fragment_on_received_ssl_error");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_web_container_fragment_on_received_ssl_error");
        map.put("categoryStatId", "20151_WEB_SDK_STAT");
        map.put("error", str);
        return Collections.unmodifiableMap(map);
    }

    @NonNull
    public static Map<String, String> r(@NonNull String str) {
        HashMap map = new HashMap(6);
        map.put("method_id", "event_id_web_container_fragment_on_received_title");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_web_container_fragment_on_received_title");
        map.put("categoryStatId", "20151_WEB_SDK_STAT");
        map.put("title", str);
        return Collections.unmodifiableMap(map);
    }

    @NonNull
    public static Map<String, String> s(@NonNull String str) {
        HashMap map = new HashMap(6);
        map.put("method_id", "event_id_web_container_fragment_should_override_url_loading");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_web_container_fragment_should_override_url_loading");
        map.put("categoryStatId", "20151_WEB_SDK_STAT");
        map.put("url", str);
        return Collections.unmodifiableMap(map);
    }

    @NonNull
    public static Map<String, String> t() {
        HashMap map = new HashMap(5);
        map.put("method_id", "event_id_webview_is_null");
        map.put("categoryId", rni.DEFAULT_CATEGORY);
        map.put("log_tag", rni.DEFAULT_CATEGORY);
        map.put(of5.ARG_EVENT_ID, "event_id_webview_is_null");
        map.put("categoryStatId", "20151_WEB_SDK_STAT");
        return Collections.unmodifiableMap(map);
    }
}
