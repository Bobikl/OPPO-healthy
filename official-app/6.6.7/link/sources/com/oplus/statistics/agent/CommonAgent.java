package com.oplus.statistics.agent;

import android.content.Context;
import com.oplus.statistics.data.CommonBean;
import com.oplus.statistics.record.ProxyRecorder;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class CommonAgent extends BaseAgent {
    public static void recordCommon(Context context, CommonBean commonBean) {
        ProxyRecorder.getInstance().addTrackEvent(context, commonBean);
    }
}
