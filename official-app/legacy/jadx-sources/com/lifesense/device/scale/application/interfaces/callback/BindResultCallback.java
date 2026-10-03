package com.lifesense.device.scale.application.interfaces.callback;

import com.lifesense.device.scale.infrastructure.entity.Device;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BindResultCallback {
    public abstract void onFailed(int i, String str);

    public abstract void onSuccess(Device device);
}
