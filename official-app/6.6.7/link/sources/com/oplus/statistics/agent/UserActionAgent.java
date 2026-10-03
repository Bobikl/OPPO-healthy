package com.oplus.statistics.agent;

import android.content.Context;
import com.oplus.statistics.data.UserActionBean;
import com.oplus.statistics.record.ProxyRecorder;
import com.oplus.statistics.util.TimeInfoUtil;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class UserActionAgent {
    public static void recordUserAction(Context context, int i, int i2) {
        ProxyRecorder.getInstance().addTrackEvent(context, new UserActionBean(context, i, TimeInfoUtil.getFormatHour(), i2));
    }
}
