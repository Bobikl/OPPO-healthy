package com.heytap.device.data.api;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.y15;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/heytap/device/data/api/DataSyncTimestampEntity;", "", y15.PARAMS_DATA_TYPE, "", "startTimestamp", "", "(IJ)V", "getDataType", "()I", "getStartTimestamp", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DataSyncTimestampEntity {
    private final int dataType;
    private final long startTimestamp;

    public DataSyncTimestampEntity(int i, long j2) {
        this.dataType = i;
        this.startTimestamp = j2;
    }

    public static /* synthetic */ DataSyncTimestampEntity copy$default(DataSyncTimestampEntity dataSyncTimestampEntity, int i, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = dataSyncTimestampEntity.dataType;
        }
        if ((i2 & 2) != 0) {
            j2 = dataSyncTimestampEntity.startTimestamp;
        }
        return dataSyncTimestampEntity.copy(i, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDataType() {
        return this.dataType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    @NotNull
    public final DataSyncTimestampEntity copy(int dataType, long startTimestamp) {
        return new DataSyncTimestampEntity(dataType, startTimestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataSyncTimestampEntity)) {
            return false;
        }
        DataSyncTimestampEntity dataSyncTimestampEntity = (DataSyncTimestampEntity) other;
        return this.dataType == dataSyncTimestampEntity.dataType && this.startTimestamp == dataSyncTimestampEntity.startTimestamp;
    }

    public final int getDataType() {
        return this.dataType;
    }

    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    public int hashCode() {
        return (Integer.hashCode(this.dataType) * 31) + Long.hashCode(this.startTimestamp);
    }

    @NotNull
    public String toString() {
        return "DataSyncTimestampEntity(dataType=" + this.dataType + ", startTimestamp=" + this.startTimestamp + ")";
    }
}
