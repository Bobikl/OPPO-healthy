package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.oplus.aiunit.vision.t04;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class DeleteBloodPressurePOJO {

    @SerializedName(t04.DEVICE_UNIQUE_ID)
    private String deviceUniqueId;

    @SerializedName("measureTimestamp")
    private long measureTimestamp;

    public DeleteBloodPressurePOJO(String str, long j2) {
        this.deviceUniqueId = str;
        this.measureTimestamp = j2;
    }
}
