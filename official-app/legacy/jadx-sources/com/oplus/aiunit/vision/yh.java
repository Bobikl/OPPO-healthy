package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplus.accountsdk.base.account.trace.AcBaseTraceHelper;
import com.oplus.accountsdk.base.common.net.data.AcSdkNetResponse;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class yh {

    @Nullable
    public static volatile List<String> a;

    @Nullable
    public static List<String> a() {
        return a;
    }

    public static String b(String str) {
        URL url;
        String host;
        try {
            url = new URL(str);
        } catch (IllegalArgumentException | MalformedURLException e2) {
            AcLogUtil.e("WhiteListHelper", "getHost, exception = " + e2.getMessage());
            url = null;
        }
        return (url == null || url.getUserInfo() != null || (host = url.getHost()) == null) ? "" : host;
    }

    public static boolean c(String str) {
        List<String> listA = a();
        if (listA == null || listA.isEmpty()) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strB = b(str);
        return !TextUtils.isEmpty(strB) && listA.contains(strB);
    }

    public static void d(@NonNull Context context, String str) {
        List<String> data;
        String strCreateTraceId = AcBaseTraceHelper.createTraceId(str);
        AcLogUtil.i("WhiteListHelper", "requestDomainWhiteList invoke traceId=" + strCreateTraceId, true);
        AcSdkNetResponse<List<String>, Object> acSdkNetResponseA = ee.a(context, strCreateTraceId);
        if (acSdkNetResponseA == null || !acSdkNetResponseA.isSuccess() || (data = acSdkNetResponseA.getData()) == null || data.isEmpty()) {
            return;
        }
        AcLogUtil.d("WhiteListHelper", "requestDomainWhiteList size = " + data.size());
        e(data);
    }

    public static void e(@Nullable List<String> list) {
        if (list == null || list.isEmpty()) {
            a = null;
        } else {
            a = Collections.unmodifiableList(new ArrayList(list));
        }
    }
}
