package com.opos.process.bridge.interceptor;

import android.content.Context;
import com.opos.process.bridge.client.TargetInfo;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public interface ServerFilter {
    TargetInfo filter(Context context, List<TargetInfo> list);
}
