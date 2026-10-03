package com.opos.process.bridge.interceptor;

import android.content.Context;
import com.opos.process.bridge.client.TargetInfo;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface ServerFilter {
    TargetInfo filter(Context context, List<TargetInfo> list);
}
