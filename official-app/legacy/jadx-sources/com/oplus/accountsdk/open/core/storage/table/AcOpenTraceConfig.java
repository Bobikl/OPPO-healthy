package com.oplus.accountsdk.open.core.storage.table;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.oplus.aiunit.vision.xa;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
@Entity(tableName = "ac_open_trace_config_tb")
@Keep
public class AcOpenTraceConfig implements Serializable {

    @NonNull
    @PrimaryKey
    private String configKey;

    @NonNull
    private long configValue;

    @NonNull
    public String getConfigKey() {
        return this.configKey;
    }

    public long getConfigValue() {
        return this.configValue;
    }

    public void setConfigKey(@NonNull String str) {
        this.configKey = str;
    }

    public void setConfigValue(long j2) {
        this.configValue = j2;
    }

    public String toString() {
        return xa.d(this);
    }
}
