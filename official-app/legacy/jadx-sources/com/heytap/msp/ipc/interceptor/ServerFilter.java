package com.heytap.msp.ipc.interceptor;

import android.content.Context;
import com.heytap.msp.ipc.client.j;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public interface ServerFilter {
    j filter(Context context, List<j> list);
}
