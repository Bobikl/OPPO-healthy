package com.oplus.deepthinker.sdk.app.aidl.eventfountain;

/* JADX INFO: loaded from: classes5.dex */
public abstract class EventQueryListener extends IEventQueryListener.Stub {
    @Override // com.oplus.deepthinker.sdk.app.aidl.eventfountain.IEventQueryListener
    public abstract void onFailure(int i);

    @Override // com.oplus.deepthinker.sdk.app.aidl.eventfountain.IEventQueryListener
    public abstract void onSuccess(DeviceEventResult deviceEventResult);
}
