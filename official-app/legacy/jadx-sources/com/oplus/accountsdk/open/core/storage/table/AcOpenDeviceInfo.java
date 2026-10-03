package com.oplus.accountsdk.open.core.storage.table;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.oplus.aiunit.vision.xa;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
@Entity(tableName = "ac_open_device_info_tb")
@Keep
public class AcOpenDeviceInfo implements Serializable {

    @NonNull
    private String openId;

    @NonNull
    @PrimaryKey
    private String packageName;

    @NonNull
    public String getOpenId() {
        return this.openId;
    }

    @NonNull
    public String getPackageName() {
        return this.packageName;
    }

    public void setOpenId(@NonNull String str) {
        this.openId = str;
    }

    public void setPackageName(@NonNull String str) {
        this.packageName = str;
    }

    @NonNull
    public String toString() {
        return xa.d(this);
    }
}
