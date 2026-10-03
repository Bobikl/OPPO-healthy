package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.oplus.wearable.linkservice.sdk.Node;

/* JADX INFO: loaded from: classes5.dex */
public interface rtc {
    void onPeerConnected(@NonNull Node node);

    void onPeerDisconnected(@NonNull Node node);
}
