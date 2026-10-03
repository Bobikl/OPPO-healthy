package com.heytap.device.repository.api.request;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class SupportDeviceRequest {
    public static final int TYPE_BAND = 2;
    public static final int TYPE_BODY_FAT_SCALE = 100;
    public static final int TYPE_RS_WATCH = 3;
    public static final int TYPE_WATCH = 1;
    public int deviceType;
    public String version;
    public int type = 1;
    public int osType = 1;
}
