package com.oplus.deepthinker.sdk.app.awareness.capability;

import android.os.Bundle;
import com.oplus.aiunit.vision.oea;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.DeviceEventResult;
import com.oplus.deepthinker.sdk.app.api.ApiCallBack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0014\u0010\b\u001a\u00020\u00022\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH&R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/awareness/capability/AwarenessEventCallBack;", "Lcom/oplus/deepthinker/sdk/app/api/ApiCallBack;", "", "tag", "", "(Ljava/lang/String;)V", "getTag", "()Ljava/lang/String;", "onEventStateChanged", "result", "Lcom/oplus/deepthinker/sdk/app/aidl/eventfountain/DeviceEventResult;", "capabilityEvent", "Lcom/oplus/deepthinker/sdk/app/awareness/capability/CapabilityEvent;", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class AwarenessEventCallBack extends ApiCallBack<Unit> {

    @NotNull
    private final String tag;

    /* JADX WARN: Multi-variable type inference failed */
    public AwarenessEventCallBack() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    @Override // com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventCallback, com.oplus.deepthinker.sdk.app.aidl.eventfountain.IEventCallback
    public final void onEventStateChanged(@Nullable DeviceEventResult result) {
        Bundle extraData;
        CapabilityEvent<?> capabilityEvent;
        if (result == null || result.getEventType() != 522) {
            return;
        }
        int eventStateType = result.getEventStateType();
        if (eventStateType == 0) {
            oea.Companion companion = oea.INSTANCE;
            Bundle extraData2 = result.getExtraData();
            Intrinsics.checkNotNullExpressionValue(extraData2, "result.extraData");
            int iC = companion.c(extraData2);
            Bundle extraData3 = result.getExtraData();
            Intrinsics.checkNotNullExpressionValue(extraData3, "result.extraData");
            onFailure(iC, companion.e(extraData3));
            return;
        }
        if (eventStateType == 1) {
            onSuccess(Unit.INSTANCE);
        } else {
            if (eventStateType != 2 || (extraData = result.getExtraData()) == null || (capabilityEvent = (CapabilityEvent) extraData.getParcelable(CapabilityEvent.BUNDLE_KEY_CAPABILITY_EVENT)) == null) {
                return;
            }
            onEventStateChanged(capabilityEvent);
        }
    }

    public abstract void onEventStateChanged(@NotNull CapabilityEvent<?> capabilityEvent);

    public /* synthetic */ AwarenessEventCallBack(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "awareness_capability" : str);
    }

    public AwarenessEventCallBack(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.tag = tag;
    }
}
