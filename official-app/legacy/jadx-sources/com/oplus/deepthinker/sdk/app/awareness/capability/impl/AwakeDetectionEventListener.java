package com.oplus.deepthinker.sdk.app.awareness.capability.impl;

import android.os.Parcelable;
import com.oplus.deepthinker.sdk.app.awareness.capability.AwarenessEventQueryListener;
import com.oplus.deepthinker.sdk.app.awareness.capability.CapabilityEvent;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH&J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0012\u0010\u000b\u001a\u00020\u00042\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r¨\u0006\u000e"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/awareness/capability/impl/AwakeDetectionEventListener;", "Lcom/oplus/deepthinker/sdk/app/awareness/capability/AwarenessEventQueryListener;", "()V", "onQueryAwakeDetectionEventFailure", "", "errorCode", "", "onQueryAwakeDetectionEventSuccess", "event", "Lcom/oplus/deepthinker/sdk/app/awareness/capability/impl/AwakeDetectionEvent;", "onQueryEventFailure", "onQueryEventSuccess", "capabilityEvent", "Lcom/oplus/deepthinker/sdk/app/awareness/capability/CapabilityEvent;", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class AwakeDetectionEventListener extends AwarenessEventQueryListener {
    public abstract void onQueryAwakeDetectionEventFailure(int errorCode);

    public abstract void onQueryAwakeDetectionEventSuccess(@NotNull AwakeDetectionEvent event);

    @Override // com.oplus.deepthinker.sdk.app.awareness.capability.AwarenessEventQueryListener
    public final void onQueryEventFailure(int errorCode) {
        onQueryAwakeDetectionEventFailure(errorCode);
    }

    @Override // com.oplus.deepthinker.sdk.app.awareness.capability.AwarenessEventQueryListener
    public final void onQueryEventSuccess(@NotNull CapabilityEvent<?> capabilityEvent) {
        Intrinsics.checkNotNullParameter(capabilityEvent, "capabilityEvent");
        Parcelable parcelableM5179getCapabilityEvent = capabilityEvent.m5179getCapabilityEvent();
        if (parcelableM5179getCapabilityEvent instanceof AwakeDetectionEvent) {
            onQueryAwakeDetectionEventSuccess((AwakeDetectionEvent) parcelableM5179getCapabilityEvent);
        } else {
            onQueryAwakeDetectionEventFailure(32);
        }
    }
}
