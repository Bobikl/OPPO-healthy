package com.heytap.health.sleep.snore.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0005\"\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/heytap/health/sleep/snore/bean/DeviceConfigBean;", "", "()V", "isOsaEnable", "", "()Z", "setOsaEnable", "(Z)V", "isSupportSnore", "setSupportSnore", "sleep_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DeviceConfigBean {
    public static final int $stable = 8;
    private boolean isOsaEnable;
    private boolean isSupportSnore;

    /* JADX INFO: renamed from: isOsaEnable, reason: from getter */
    public final boolean getIsOsaEnable() {
        return this.isOsaEnable;
    }

    /* JADX INFO: renamed from: isSupportSnore, reason: from getter */
    public final boolean getIsSupportSnore() {
        return this.isSupportSnore;
    }

    public final void setOsaEnable(boolean z) {
        this.isOsaEnable = z;
    }

    public final void setSupportSnore(boolean z) {
        this.isSupportSnore = z;
    }
}
