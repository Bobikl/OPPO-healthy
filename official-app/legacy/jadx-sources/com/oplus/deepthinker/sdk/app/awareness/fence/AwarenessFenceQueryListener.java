package com.oplus.deepthinker.sdk.app.awareness.fence;

import android.os.Bundle;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.DeviceEventResult;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventQueryListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\r¨\u0006\u000e"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/awareness/fence/AwarenessFenceQueryListener;", "Lcom/oplus/deepthinker/sdk/app/aidl/eventfountain/EventQueryListener;", "()V", "onFailure", "", "errorCode", "", "onQueryFenceFailure", "onQueryFenceSuccess", "fenceState", "Lcom/oplus/deepthinker/sdk/app/awareness/fence/AwarenessFenceState;", "onSuccess", "result", "Lcom/oplus/deepthinker/sdk/app/aidl/eventfountain/DeviceEventResult;", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class AwarenessFenceQueryListener extends EventQueryListener {
    @Override // com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventQueryListener, com.oplus.deepthinker.sdk.app.aidl.eventfountain.IEventQueryListener
    public final void onFailure(int errorCode) {
        onQueryFenceFailure(errorCode);
    }

    public abstract void onQueryFenceFailure(int errorCode);

    public abstract void onQueryFenceSuccess(@NotNull AwarenessFenceState fenceState);

    @Override // com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventQueryListener, com.oplus.deepthinker.sdk.app.aidl.eventfountain.IEventQueryListener
    public final void onSuccess(@Nullable DeviceEventResult result) {
        Unit unit = null;
        Bundle extraData = result == null ? null : result.getExtraData();
        AwarenessFenceState awarenessFenceState = extraData == null ? null : (AwarenessFenceState) extraData.getParcelable(AwarenessFenceState.BUNDLE_KEY_FENCE_STATE);
        if (awarenessFenceState != null) {
            onQueryFenceSuccess(awarenessFenceState);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            onQueryFenceFailure(32);
        }
    }
}
