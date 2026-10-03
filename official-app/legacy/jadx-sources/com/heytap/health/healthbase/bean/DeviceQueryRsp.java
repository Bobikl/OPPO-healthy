package com.heytap.health.healthbase.bean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.oplus.aiunit.vision.t04;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class DeviceQueryRsp {

    @SerializedName("appTerminalId")
    public String appTerminalId;

    @SerializedName(t04.DEVICE_UNIQUE_ID)
    public String deviceUniqueId;

    @SerializedName("token")
    public String token;
}
