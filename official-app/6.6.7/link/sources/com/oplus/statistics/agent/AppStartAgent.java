package com.oplus.statistics.agent;

import android.content.Context;
import com.oplus.statistics.agent.AppStartAgent;
import com.oplus.statistics.data.AppStartBean;
import com.oplus.statistics.record.ProxyRecorder;
import com.oplus.statistics.util.LogUtil;
import com.oplus.statistics.util.Supplier;
import com.oplus.statistics.util.TimeInfoUtil;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class AppStartAgent {
    public static /* synthetic */ String b() {
        return "调用AppStart";
    }

    public static void recordAppStart(Context context) {
        LogUtil.i("AppStartAgent", new Supplier() { // from class: com.oplus.aiunit.vision.wc0
            @Override // com.oplus.statistics.util.Supplier
            public final Object get() {
                return AppStartAgent.b();
            }
        });
        ProxyRecorder.getInstance().addTrackEvent(context, new AppStartBean(context, TimeInfoUtil.getFormatTime()));
    }
}
