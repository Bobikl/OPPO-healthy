package com.oplus.statistics.agent;

import android.content.Context;
import com.oplus.statistics.data.AppStartBean;
import com.oplus.statistics.record.ProxyRecorder;
import com.oplus.statistics.util.TimeInfoUtil;

/* JADX INFO: loaded from: classes8.dex */
public class SpecialAppStartAgent {
    public static void onSpecialAppStart(Context context, int i) {
        AppStartBean appStartBean = new AppStartBean(context, TimeInfoUtil.getFormatTime());
        appStartBean.setAppId(String.valueOf(i));
        ProxyRecorder.getInstance().addTrackEvent(context, appStartBean);
    }
}
