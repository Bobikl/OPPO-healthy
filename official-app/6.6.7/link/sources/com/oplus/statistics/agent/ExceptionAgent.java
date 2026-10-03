package com.oplus.statistics.agent;

import android.content.Context;
import com.oplus.statistics.data.ExceptionBean;
import com.oplus.statistics.record.ProxyRecorder;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class ExceptionAgent {
    public static void recordException(Context context, ExceptionBean exceptionBean) {
        ProxyRecorder.getInstance().addTrackEvent(context, exceptionBean);
    }
}
