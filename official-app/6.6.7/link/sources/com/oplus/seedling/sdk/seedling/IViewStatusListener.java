package com.oplus.seedling.sdk.seedling;

import android.os.Bundle;
import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/oplus/seedling/sdk/seedling/IViewStatusListener;", "", "onStatusChanged", "", "event", "", "params", "Landroid/os/Bundle;", "foundation-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface IViewStatusListener {
    void onStatusChanged(@Nullable String event, @Nullable Bundle params);
}
