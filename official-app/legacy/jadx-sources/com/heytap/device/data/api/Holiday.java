package com.heytap.device.data.api;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/heytap/device/data/api/Holiday;", "", "()V", "date", "", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "type", "getType", "setType", "intDate", "", "isHoliday", "", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Holiday {

    @Nullable
    private String date;

    @Nullable
    private String type;

    @Nullable
    public final String getDate() {
        return this.date;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final int intDate() {
        String str = this.date;
        if (str != null) {
            return Integer.parseInt(str);
        }
        return 0;
    }

    public final boolean isHoliday() {
        return Intrinsics.areEqual(this.type, "1");
    }

    public final void setDate(@Nullable String str) {
        this.date = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }
}
