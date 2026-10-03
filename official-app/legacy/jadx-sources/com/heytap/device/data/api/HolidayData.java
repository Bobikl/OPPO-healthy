package com.heytap.device.data.api;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u0004\u0018\u00010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/heytap/device/data/api/HolidayData;", "", "()V", "config", "", "getConfig", "()Ljava/lang/String;", "setConfig", "(Ljava/lang/String;)V", "version", "getVersion", "setVersion", "getHolidayListData", "Lcom/heytap/device/data/api/HolidayListData;", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HolidayData {

    @Nullable
    private String config;

    @Nullable
    private String version;

    @Nullable
    public final String getConfig() {
        return this.config;
    }

    @Nullable
    public final HolidayListData getHolidayListData() {
        String str = this.config;
        if (str == null) {
            return null;
        }
        return HolidayListData.INSTANCE.a(str);
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public final void setConfig(@Nullable String str) {
        this.config = str;
    }

    public final void setVersion(@Nullable String str) {
        this.version = str;
    }
}
