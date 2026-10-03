package com.heytap.accessory.pair.seeker;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes14.dex */
public interface IDeviceEvent {
    public static final String FLAG_AUTHENTICATE_MODE = "AuthenticateMode";
    public static final String FLAG_MAC = "mac";
    public static final int TYPE_PAIRED_INFO = 2;
    public static final int TYPE_STATE = 1;

    int send(int i, @Nullable Bundle bundle);
}
