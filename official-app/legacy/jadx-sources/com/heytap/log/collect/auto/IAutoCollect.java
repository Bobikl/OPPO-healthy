package com.heytap.log.collect.auto;

import android.content.Context;

/* JADX INFO: loaded from: classes19.dex */
public interface IAutoCollect extends IDataCollect {
    void onActivityStart(Context context);

    void onActivityStop(Context context);
}
