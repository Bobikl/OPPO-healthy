package com.heytap.device.data.api;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/heytap/device/data/api/HFGpsFileAPIRequest;", "", "()V", "latitude", "", "getLatitude", "()Ljava/lang/Long;", "setLatitude", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "localFileList", "", "Lcom/heytap/device/data/api/LocalFileInfo;", "getLocalFileList", "()Ljava/util/List;", "setLocalFileList", "(Ljava/util/List;)V", "longitude", "getLongitude", "setLongitude", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HFGpsFileAPIRequest {

    @Nullable
    private Long latitude;

    @Nullable
    private List<LocalFileInfo> localFileList;

    @Nullable
    private Long longitude;

    @Nullable
    public final Long getLatitude() {
        return this.latitude;
    }

    @Nullable
    public final List<LocalFileInfo> getLocalFileList() {
        return this.localFileList;
    }

    @Nullable
    public final Long getLongitude() {
        return this.longitude;
    }

    public final void setLatitude(@Nullable Long l2) {
        this.latitude = l2;
    }

    public final void setLocalFileList(@Nullable List<LocalFileInfo> list) {
        this.localFileList = list;
    }

    public final void setLongitude(@Nullable Long l2) {
        this.longitude = l2;
    }
}
