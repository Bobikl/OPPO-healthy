package com.oplus.aiunit.vision;

import com.heytap.health.base.R$string;
import com.heytap.health.base.base.BaseApplication;

/* JADX INFO: loaded from: classes19.dex */
public abstract class a6e<T> extends ao0<T> {
    @Override // com.oplus.aiunit.vision.ao0, com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        super.onError(th);
        y0k.i(BaseApplication.a().getString(R$string.lib_base_webview_time_out));
    }
}
