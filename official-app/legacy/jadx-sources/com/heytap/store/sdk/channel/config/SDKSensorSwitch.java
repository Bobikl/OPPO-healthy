package com.heytap.store.sdk.channel.config;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/heytap/store/sdk/channel/config/SDKSensorSwitch;", "", "()V", "isNeedSensorReport", "", "()Z", "channelConfig_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SDKSensorSwitch {

    @NotNull
    public static final SDKSensorSwitch INSTANCE = new SDKSensorSwitch();

    private SDKSensorSwitch() {
    }

    public final boolean isNeedSensorReport() {
        return true;
    }
}
