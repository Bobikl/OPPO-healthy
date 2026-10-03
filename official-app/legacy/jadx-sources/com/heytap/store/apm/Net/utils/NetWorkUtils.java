package com.heytap.store.apm.Net.utils;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.widget.Toast;
import com.heytap.store.apm.IDataPoolHandleImpl;
import com.heytap.store.apm.Net.data.NetworkTraceBean;
import com.heytap.store.apm.R;
import com.oplus.aiunit.vision.c8l;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public final class NetWorkUtils {
    public static final long DAY = 86400000;
    public static final long HOUR = 3600000;
    public static final long MINUTE = 60000;
    public static final long SECOND = 1000;

    private static void check(String str, String str2, Map<String, Long> map) throws Throwable {
        if (NetworkTool.getInstance().getApplication() == null) {
            NetLogUtils.d("OkNetworkMonitor", "context is null.");
        } else {
            map.get(str);
        }
    }

    public static void copyToClipBoard(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        ClipData clipDataNewPlainText = ClipData.newPlainText("", str);
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(clipDataNewPlainText);
            Toast.makeText(context, "复制成功", 0).show();
        }
    }

    public static int dp2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static SpannableString formatTime(Context context, long j2) {
        SpannableString spannableString;
        if (j2 == 0) {
            RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(0.5f);
            SpannableString spannableString2 = new SpannableString(context.getString(R.string.network_summary_total_time_default));
            spannableString2.setSpan(relativeSizeSpan, spannableString2.length() - 1, spannableString2.length(), 17);
            return spannableString2;
        }
        if (j2 < 100000) {
            RelativeSizeSpan relativeSizeSpan2 = new RelativeSizeSpan(0.5f);
            SpannableString spannableString3 = new SpannableString(context.getString(R.string.network_summary_total_time_second, Long.valueOf(j2 / 1000)));
            spannableString3.setSpan(relativeSizeSpan2, spannableString3.length() - 1, spannableString3.length(), 17);
            return spannableString3;
        }
        if (j2 < 6000000) {
            long j3 = j2 / 60000;
            spannableString = new SpannableString(context.getString(R.string.network_summary_total_time_minute, Long.valueOf(j3), Long.valueOf((j2 % 60000) / 1000)));
            spannableString.setSpan(new RelativeSizeSpan(0.5f), String.valueOf(j3).length(), String.valueOf(j3).length() + 1, 17);
            spannableString.setSpan(new RelativeSizeSpan(0.5f), spannableString.length() - 1, spannableString.length(), 17);
        } else if (j2 < 360000000) {
            long j4 = j2 / 3600000;
            spannableString = new SpannableString(context.getString(R.string.network_summary_total_time_hour, Long.valueOf(j4), Long.valueOf((j2 % 3600000) / 60000)));
            spannableString.setSpan(new RelativeSizeSpan(0.5f), String.valueOf(j4).length(), String.valueOf(j4).length() + 2, 17);
            spannableString.setSpan(new RelativeSizeSpan(0.5f), spannableString.length() - 1, spannableString.length(), 17);
        } else {
            long j5 = j2 / 86400000;
            spannableString = new SpannableString(context.getString(R.string.network_summary_total_time_day, Long.valueOf(j5), Long.valueOf((j2 % 86400000) / 3600000)));
            spannableString.setSpan(new RelativeSizeSpan(0.5f), String.valueOf(j5).length(), String.valueOf(j5).length() + 1, 17);
            spannableString.setSpan(new RelativeSizeSpan(0.5f), spannableString.length() - 2, spannableString.length(), 17);
        }
        return spannableString;
    }

    public static long getEventCostTime(Map<String, Long> map, String str, String str2) {
        if (!map.containsKey(str) || !map.containsKey(str2)) {
            return 0L;
        }
        long jLongValue = map.get(str2).longValue() - map.get(str).longValue();
        if (jLongValue < 0) {
            return 0L;
        }
        return jLongValue;
    }

    public static SpannableString getPrintSizeForSpannable(long j2) {
        RelativeSizeSpan relativeSizeSpan = new RelativeSizeSpan(0.5f);
        if (j2 < 1024) {
            SpannableString spannableString = new SpannableString(String.valueOf(j2) + c8l.KEY_B);
            spannableString.setSpan(relativeSizeSpan, spannableString.length() + (-1), spannableString.length(), 17);
            return spannableString;
        }
        long j3 = j2 / 1024;
        if (j3 < 1024) {
            SpannableString spannableString2 = new SpannableString(String.valueOf(j3) + "KB");
            spannableString2.setSpan(relativeSizeSpan, spannableString2.length() + (-2), spannableString2.length(), 17);
            return spannableString2;
        }
        long j4 = j3 / 1024;
        if (j4 < 1024) {
            long j5 = j4 * 100;
            SpannableString spannableString3 = new SpannableString(String.valueOf(j5 / 100) + "." + String.valueOf(j5 % 100) + "MB");
            spannableString3.setSpan(relativeSizeSpan, spannableString3.length() + (-2), spannableString3.length(), 17);
            return spannableString3;
        }
        long j6 = (j4 * 100) / 1024;
        SpannableString spannableString4 = new SpannableString(String.valueOf(j6 / 100) + "." + String.valueOf(j6 % 100) + "GB");
        spannableString4.setSpan(relativeSizeSpan, spannableString4.length() + (-2), spannableString4.length(), 17);
        return spannableString4;
    }

    public static int getScreenHeight(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int getScreenWidth(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    private static int getSettingTimeout(Context context, String str) {
        try {
            return Integer.parseInt(PreferenceManager.getDefaultSharedPreferences(context).getString(str, "0"));
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static boolean isTimeout(Context context, String str, Long l2) {
        int settingTimeout = getSettingTimeout(context, str);
        return settingTimeout > 0 && l2 != null && l2.longValue() > ((long) settingTimeout);
    }

    public static boolean isWifiProxy(Context context) {
        String property = System.getProperty("http.proxyHost");
        String property2 = System.getProperty("http.proxyPort");
        if (property2 == null) {
            property2 = "-1";
        }
        return (TextUtils.isEmpty(property) || Integer.parseInt(property2) == -1) ? false : true;
    }

    public static void openLink(Context context, String str) {
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    public static int sp2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public static void timeoutChecker(String str) throws Throwable {
        if (str == null || str.length() == 0) {
            return;
        }
        NetworkTraceBean networkTraceModel = IDataPoolHandleImpl.getInstance().getNetworkTraceModel(str);
        Map<String, Long> traceItemList = networkTraceModel.getTraceItemList();
        String url = networkTraceModel.getUrl();
        check(NetworkTraceBean.TRACE_NAME_TOTAL, url, traceItemList);
        check(NetworkTraceBean.TRACE_NAME_DNS, url, traceItemList);
        check(NetworkTraceBean.TRACE_NAME_SECURE_CONNECT, url, traceItemList);
        check(NetworkTraceBean.TRACE_NAME_CONNECT, url, traceItemList);
        check(NetworkTraceBean.TRACE_NAME_REQUEST_HEADERS, url, traceItemList);
        check(NetworkTraceBean.TRACE_NAME_REQUEST_BODY, url, traceItemList);
        check(NetworkTraceBean.TRACE_NAME_RESPONSE_HEADERS, url, traceItemList);
        check(NetworkTraceBean.TRACE_NAME_RESPONSE_BODY, url, traceItemList);
    }

    public static LinkedHashMap<String, Long> transformToTraceDetail(Map<String, Long> map) {
        LinkedHashMap<String, Long> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(NetworkTraceBean.TRACE_NAME_TOTAL, Long.valueOf(getEventCostTime(map, NetworkTraceBean.CALL_START, NetworkTraceBean.CALL_END)));
        linkedHashMap.put(NetworkTraceBean.TRACE_NAME_DNS, Long.valueOf(getEventCostTime(map, NetworkTraceBean.DNS_START, NetworkTraceBean.DNS_END)));
        linkedHashMap.put(NetworkTraceBean.TRACE_NAME_SECURE_CONNECT, Long.valueOf(getEventCostTime(map, NetworkTraceBean.SECURE_CONNECT_START, NetworkTraceBean.SECURE_CONNECT_END)));
        linkedHashMap.put(NetworkTraceBean.TRACE_NAME_CONNECT, Long.valueOf(getEventCostTime(map, NetworkTraceBean.CONNECT_START, NetworkTraceBean.CONNECT_END)));
        linkedHashMap.put(NetworkTraceBean.TRACE_NAME_REQUEST_HEADERS, Long.valueOf(getEventCostTime(map, NetworkTraceBean.REQUEST_HEADERS_START, NetworkTraceBean.REQUEST_HEADERS_END)));
        linkedHashMap.put(NetworkTraceBean.TRACE_NAME_REQUEST_BODY, Long.valueOf(getEventCostTime(map, NetworkTraceBean.REQUEST_BODY_START, NetworkTraceBean.REQUEST_BODY_END)));
        linkedHashMap.put(NetworkTraceBean.TRACE_NAME_RESPONSE_HEADERS, Long.valueOf(getEventCostTime(map, NetworkTraceBean.RESPONSE_HEADERS_START, NetworkTraceBean.RESPONSE_HEADERS_END)));
        linkedHashMap.put(NetworkTraceBean.TRACE_NAME_RESPONSE_BODY, Long.valueOf(getEventCostTime(map, NetworkTraceBean.RESPONSE_BODY_START, NetworkTraceBean.RESPONSE_BODY_END)));
        return linkedHashMap;
    }
}
