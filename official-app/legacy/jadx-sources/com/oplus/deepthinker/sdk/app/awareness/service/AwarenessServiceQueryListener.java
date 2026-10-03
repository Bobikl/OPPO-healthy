package com.oplus.deepthinker.sdk.app.awareness.service;

import android.os.Bundle;
import com.oplus.aiunit.vision.boi;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.DeviceEventResult;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventQueryListener;
import com.oplus.deepthinker.sdk.app.aidl.proton.intentdecision.ServiceResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u000e¨\u0006\u000f"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/awareness/service/AwarenessServiceQueryListener;", "Lcom/oplus/deepthinker/sdk/app/aidl/eventfountain/EventQueryListener;", "()V", "onFailure", "", "errorCode", "", "onQueryServiceFailure", "errorMessage", "", "onQueryServiceSuccess", "result", "Lcom/oplus/deepthinker/sdk/app/aidl/proton/intentdecision/ServiceResult;", "onSuccess", "Lcom/oplus/deepthinker/sdk/app/aidl/eventfountain/DeviceEventResult;", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class AwarenessServiceQueryListener extends EventQueryListener {
    @Override // com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventQueryListener, com.oplus.deepthinker.sdk.app.aidl.eventfountain.IEventQueryListener
    public final void onFailure(int errorCode) {
        onQueryServiceFailure(errorCode, boi.a(errorCode));
    }

    public abstract void onQueryServiceFailure(int errorCode, @NotNull String errorMessage);

    public abstract void onQueryServiceSuccess(@NotNull ServiceResult result);

    @Override // com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventQueryListener, com.oplus.deepthinker.sdk.app.aidl.eventfountain.IEventQueryListener
    public final void onSuccess(@Nullable DeviceEventResult result) {
        Unit unit = null;
        Bundle extraData = result == null ? null : result.getExtraData();
        ServiceResult serviceResult = extraData == null ? null : (ServiceResult) extraData.getParcelable(ServiceResult.BUNDLE_KEY_SERVICE_RESULT);
        if (serviceResult != null) {
            onQueryServiceSuccess(serviceResult);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            onFailure(32);
        }
    }
}
