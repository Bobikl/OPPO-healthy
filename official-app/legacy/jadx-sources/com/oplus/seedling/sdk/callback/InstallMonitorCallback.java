package com.oplus.seedling.sdk.callback;

import androidx.annotation.Keep;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/oplus/seedling/sdk/callback/InstallMonitorCallback;", "", "onSdkInternalInited", "", "isSuccess", "", "onUmsUpdated", "pantanal-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface InstallMonitorCallback {
    void onSdkInternalInited(boolean isSuccess);

    void onUmsUpdated();
}
