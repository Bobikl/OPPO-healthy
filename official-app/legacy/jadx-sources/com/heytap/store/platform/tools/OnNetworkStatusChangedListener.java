package com.heytap.store.platform.tools;

import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/heytap/store/platform/tools/OnNetworkStatusChangedListener;", "", "onConnected", "", "networkInfo", "Lcom/heytap/store/platform/tools/SimpleNetworkInfo;", "onDisconnected", "utils_release"}, k = 1, mv = {1, 4, 0})
public interface OnNetworkStatusChangedListener {
    void onConnected(@Nullable SimpleNetworkInfo networkInfo);

    void onDisconnected();
}
