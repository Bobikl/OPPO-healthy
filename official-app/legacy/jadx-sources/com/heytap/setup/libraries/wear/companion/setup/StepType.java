package com.heytap.setup.libraries.wear.companion.setup;

import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/setup/libraries/wear/companion/setup/StepType;", "", "isPointOfNoReturn", "", "(Ljava/lang/String;IZ)V", "()Z", "NONE", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum StepType {
    NONE(false);

    private final boolean isPointOfNoReturn;

    StepType(boolean z) {
        this.isPointOfNoReturn = z;
    }

    /* JADX INFO: renamed from: isPointOfNoReturn, reason: from getter */
    public final boolean getIsPointOfNoReturn() {
        return this.isPointOfNoReturn;
    }
}
