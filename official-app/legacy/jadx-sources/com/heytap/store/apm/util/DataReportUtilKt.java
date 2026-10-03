package com.heytap.store.apm.util;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.heytap.store.apm.ApmClient;
import com.heytap.store.apm.Net.data.NetworkTraceBean;
import com.heytap.store.apm.PageFilter;
import com.heytap.store.apm.PageTrackBean;
import com.heytap.store.base.core.ativitylifecycle.ActivityCollectionManager;
import com.heytap.store.base.core.util.GsonUtils;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import com.heytap.store.base.facade.HTStoreFacade;
import com.heytap.store.business.rn.service.RnConstant;
import com.heytap.store.platform.tools.ContextGetterUtils;
import com.heytap.store.platform.tools.NetworkUtils;
import com.heytap.store.platform.track.EventData;
import com.heytap.store.platform.track.IStatistics;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.liulishuo.okdownload.core.breakpoint.BreakpointSQLiteKey;
import java.util.Random;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\b\u0010\u0005\u001a\u00020\u0001H\u0002\u001a\b\u0010\u0006\u001a\u00020\u0001H\u0002\u001a\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u001a\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n\u001a&\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001\u001a&\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0018\u001a\u000e\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001b\u001a\u000e\u0010\u001c\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u001d\u001a\u0016\u0010\u001c\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u001d\u001a\u001e\u0010\u001e\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0001\u001a\u0016\u0010\u001f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"EVENT_API", "", "EVENT_APP_START", "EVENT_EXCEPTION", "EVENT_PAGE_LOAD", "getCurrentPageName", "getCurrentPageUrl", "reportApi", "", "trackBean", "Lcom/heytap/store/apm/Net/data/NetworkTraceBean;", "appId", "", "reportApiError", "url", "httpCode", "", "attachments", "tag", "reportAppStart", "duration", "dpLink", "pageName", "hasAd", "", "reportExceptionEvent", "throwable", "", "reportPageEvent", "Lcom/heytap/store/apm/PageTrackBean;", "reportWebViewError", "samplingReportApi", "apm_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class DataReportUtilKt {

    @NotNull
    public static final String EVENT_API = "api_monitor";

    @NotNull
    public static final String EVENT_APP_START = "app_monitor";

    @NotNull
    public static final String EVENT_EXCEPTION = "exception_monitor";

    @NotNull
    public static final String EVENT_PAGE_LOAD = "dom_monitor";

    private static final String getCurrentPageName() {
        String stringExtra;
        Boolean boolValueOf;
        Activity topActivity = ActivityCollectionManager.INSTANCE.getInstance().getTopActivity();
        Intent intent = topActivity == null ? null : topActivity.getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra(RnConstant.KEY_COMPONENT_NAME)) == null) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(stringExtra.length() > 0);
        }
        if (!Intrinsics.areEqual(boolValueOf, Boolean.TRUE)) {
            Class<?> cls = topActivity != null ? topActivity.getClass() : null;
            return cls == null ? "" : cls.getSimpleName();
        }
        String stringExtra2 = topActivity.getIntent().getStringExtra(RnConstant.KEY_COMPONENT_NAME);
        Intrinsics.checkNotNull(stringExtra2);
        return Intrinsics.stringPlus("RN_", stringExtra2);
    }

    private static final String getCurrentPageUrl() {
        Bundle bundleExtra;
        Intent intent;
        Activity topActivity = ActivityCollectionManager.INSTANCE.getInstance().getTopActivity();
        String stringExtra = null;
        Intent intent2 = topActivity == null ? null : topActivity.getIntent();
        String string = (intent2 == null || (bundleExtra = intent2.getBundleExtra(RnConstant.KEY_INIT_OPTIONS)) == null) ? null : bundleExtra.getString("originalURL");
        if (string != null) {
            stringExtra = string;
        } else if (topActivity != null && (intent = topActivity.getIntent()) != null) {
            stringExtra = intent.getStringExtra("original_link");
        }
        return stringExtra == null ? "" : stringExtra;
    }

    public static final void reportApi(long j2, @NotNull NetworkTraceBean trackBean) {
        IStatistics trackProxy;
        Intrinsics.checkNotNullParameter(trackBean, "trackBean");
        if (j2 == 0) {
            reportApi(trackBean);
            return;
        }
        if (NetworkUtils.INSTANCE.isAvailable(ContextGetterUtils.INSTANCE.getApp())) {
            if (ApmClient.logEnable) {
                Log.d("dataReport", Intrinsics.stringPlus("start reportApi", GsonUtils.toJsonString(trackBean)));
            }
            if (trackBean.getHttpCode() == 0 || TextUtils.isEmpty(trackBean.getUrl()) || PageFilter.isApiFiltered(trackBean.getUrl())) {
                return;
            }
            Long l2 = trackBean.getTraceItemList().get(NetworkTraceBean.TRACE_NAME_TOTAL);
            long jLongValue = l2 != null ? l2.longValue() : 0L;
            if (trackBean.getHttpCode() != 0) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (!TextUtils.isEmpty(trackBean.getBusinessMsg())) {
                        jSONObject.put("msg", trackBean.getBusinessMsg());
                    }
                    jSONObject.put("page_info", getCurrentPageName());
                    jSONObject.put("url", trackBean.getUrl());
                    jSONObject.put("code", trackBean.getHttpCode());
                    jSONObject.put("traceId", trackBean.getTraceId());
                    jSONObject.put(BreakpointSQLiteKey.CONTENT_LENGTH, trackBean.getContentLength());
                    jSONObject.put("business_code", trackBean.getBusinessCode());
                    jSONObject.put(SpeechConstant.KEY_TTS_REQUEST_HEADER, trackBean.getRequestHeadersMap());
                    jSONObject.put("params", trackBean.getRequestParamsMap());
                    jSONObject.put("loading_duration", jLongValue);
                    jSONObject.put("attachments", trackBean.getTraceItemList());
                    jSONObject.put("version", 2);
                    EventData eventData = new EventData();
                    eventData.setData(jSONObject);
                    if (ApmClient.logEnable) {
                        Log.d("dataReport", Intrinsics.stringPlus("reportApi:", jSONObject));
                    }
                    if (ApmClient.reportEnable() && (trackProxy = HTStoreFacade.INSTANCE.getInstance().getTrackProxy(0)) != null) {
                        trackProxy.reportByOBus(j2, "monitor", EVENT_API, eventData);
                    }
                } catch (Exception e2) {
                    Log.d("dataReport", Intrinsics.stringPlus("reportApi error:", e2));
                }
            }
        }
    }

    public static final void reportApiError(@NotNull String url, int i, @NotNull String attachments, @NotNull String tag) {
        IStatistics trackProxy;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(attachments, "attachments");
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (!NetworkUtils.INSTANCE.isAvailable(ContextGetterUtils.INSTANCE.getApp()) || TextUtils.isEmpty(url) || PageFilter.isApiFiltered(url)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("page_info", getCurrentPageName());
        jSONObject.put("url", url);
        jSONObject.put("code", i);
        jSONObject.put("business_code", "");
        jSONObject.put(SpeechConstant.KEY_TTS_REQUEST_HEADER, tag);
        jSONObject.put("loading_duration", "0");
        jSONObject.put("attachments", attachments);
        jSONObject.put("version", 2);
        EventData eventData = new EventData();
        eventData.setData(jSONObject);
        if (ApmClient.logEnable) {
            Log.d("dataReport", Intrinsics.stringPlus("reportApi:", jSONObject));
        }
        if (!ApmClient.reportEnable() || (trackProxy = HTStoreFacade.INSTANCE.getInstance().getTrackProxy(0)) == null) {
            return;
        }
        trackProxy.reportByOBus("monitor", EVENT_API, eventData);
    }

    public static final void reportAppStart(long j2, @NotNull String dpLink, @NotNull String pageName, boolean z) {
        IStatistics trackProxy;
        Intrinsics.checkNotNullParameter(dpLink, "dpLink");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("loading_duration", j2);
            jSONObject.put("page_info", pageName);
            jSONObject.put("url", dpLink);
            jSONObject.put("has_ad", z ? "1" : "0");
            jSONObject.put("version", 2);
            EventData eventData = new EventData();
            eventData.setData(jSONObject);
            if (ApmClient.reportEnable() && j2 < 3000 && j2 > 0 && (trackProxy = HTStoreFacade.INSTANCE.getInstance().getTrackProxy(0)) != null) {
                trackProxy.reportByOBus("monitor", EVENT_APP_START, eventData);
            }
            if (ApmClient.logEnable) {
                Log.d("dataReport", Intrinsics.stringPlus("reportAppStart:", jSONObject));
            }
        } catch (Exception e2) {
            Log.d("dataReport", Intrinsics.stringPlus("reportAppStart:", e2));
        }
    }

    public static final void reportExceptionEvent(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
    }

    public static final void reportPageEvent(@NotNull PageTrackBean trackBean) {
        Intrinsics.checkNotNullParameter(trackBean, "trackBean");
        reportPageEvent(0L, trackBean);
    }

    public static final void reportWebViewError(@NotNull String url, int i, @NotNull String attachments) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(attachments, "attachments");
        reportApiError(url, i, attachments, "webview");
    }

    public static final void samplingReportApi(long j2, @NotNull NetworkTraceBean trackBean) {
        Intrinsics.checkNotNullParameter(trackBean, "trackBean");
        int businessCode = trackBean.getBusinessCode();
        if (ApmClient.logEnable) {
            Log.d(ApmClient.TAG, Intrinsics.stringPlus("dataReport：get response code:", Integer.valueOf(businessCode)));
        }
        if (businessCode != 200 && businessCode != 0) {
            reportApi(j2, trackBean);
        }
        if (businessCode == 200) {
            int iNextInt = new Random().nextInt(10000);
            if (ApmClient.logEnable) {
                Log.d(ApmClient.TAG, "dataReport：get successRate:" + (iNextInt / 10000.0f) + ",successRate:" + HttpResponsesTrack.successRate);
            }
            if (iNextInt / 10000.0f <= HttpResponsesTrack.successRate) {
                trackBean.setHttpCode(200);
                trackBean.setBusinessCode(200);
                reportApi(j2, trackBean);
            }
        }
    }

    public static final void reportPageEvent(long j2, @NotNull PageTrackBean trackBean) {
        IStatistics trackProxy;
        Intrinsics.checkNotNullParameter(trackBean, "trackBean");
        if (NetworkUtils.INSTANCE.isAvailable(ContextGetterUtils.INSTANCE.getApp())) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("page_info", trackBean.getPageName());
                jSONObject.put("msg", trackBean.getPageErrorMgs());
                jSONObject.put(SensorsBean.PAGE_URL, getCurrentPageUrl());
                if (!TextUtils.isEmpty(trackBean.getPageId())) {
                    jSONObject.put("page_id", trackBean.getPageId());
                }
                if (ApmClient.logEnable) {
                    Log.d("dataReport", Intrinsics.stringPlus("reportPageEvent:", jSONObject));
                }
                EventData eventData = new EventData();
                eventData.setData(jSONObject);
                if (ApmClient.reportEnable() && (trackProxy = HTStoreFacade.INSTANCE.getInstance().getTrackProxy(0)) != null) {
                    trackProxy.reportByOBus(j2, "monitor", EVENT_PAGE_LOAD, eventData);
                }
            } catch (Exception e2) {
                Log.d("dataReport", Intrinsics.stringPlus("reportPageEvent:", e2));
            }
        }
    }

    public static final void reportApi(@NotNull NetworkTraceBean trackBean) {
        IStatistics trackProxy;
        Intrinsics.checkNotNullParameter(trackBean, "trackBean");
        if (NetworkUtils.INSTANCE.isAvailable(ContextGetterUtils.INSTANCE.getApp())) {
            if (ApmClient.logEnable) {
                Log.d("dataReport", Intrinsics.stringPlus("start reportApi", GsonUtils.toJsonString(trackBean)));
            }
            if (trackBean.getHttpCode() == 0 || TextUtils.isEmpty(trackBean.getUrl()) || PageFilter.isApiFiltered(trackBean.getUrl())) {
                return;
            }
            Long l2 = trackBean.getTraceItemList().get(NetworkTraceBean.TRACE_NAME_TOTAL);
            long jLongValue = l2 == null ? 0L : l2.longValue();
            if (trackBean.getHttpCode() != 0) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (!TextUtils.isEmpty(trackBean.getBusinessMsg())) {
                        jSONObject.put("msg", trackBean.getBusinessMsg());
                    }
                    jSONObject.put("page_info", getCurrentPageName());
                    jSONObject.put("url", trackBean.getUrl());
                    jSONObject.put("code", trackBean.getHttpCode());
                    jSONObject.put("traceId", trackBean.getTraceId());
                    jSONObject.put(BreakpointSQLiteKey.CONTENT_LENGTH, trackBean.getContentLength());
                    jSONObject.put("business_code", trackBean.getBusinessCode());
                    jSONObject.put(SpeechConstant.KEY_TTS_REQUEST_HEADER, trackBean.getRequestHeadersMap());
                    jSONObject.put("params", trackBean.getRequestParamsMap());
                    jSONObject.put("loading_duration", jLongValue);
                    jSONObject.put("attachments", trackBean.getTraceItemList());
                    jSONObject.put("version", 2);
                    EventData eventData = new EventData();
                    eventData.setData(jSONObject);
                    if (ApmClient.logEnable) {
                        Log.d("dataReport", Intrinsics.stringPlus("reportApi:", jSONObject));
                    }
                    if (ApmClient.reportEnable() && (trackProxy = HTStoreFacade.INSTANCE.getInstance().getTrackProxy(0)) != null) {
                        trackProxy.reportByOBus("monitor", EVENT_API, eventData);
                    }
                } catch (Exception e2) {
                    Log.d("dataReport", Intrinsics.stringPlus("reportApi error:", e2));
                }
            }
        }
    }
}
