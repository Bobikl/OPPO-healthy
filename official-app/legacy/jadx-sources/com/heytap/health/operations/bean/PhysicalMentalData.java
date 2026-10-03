package com.heytap.health.operations.bean;

import androidx.annotation.Keep;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes17.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/heytap/health/operations/bean/PhysicalMentalData;", "", "value", "", "type", SpeechConstant.KEY_TTS_TIMESTAMP, "", "(IIJ)V", "getTimeStamp", "()J", "setTimeStamp", "(J)V", "getType", "()I", "setType", "(I)V", "getValue", "setValue", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "operations_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PhysicalMentalData {
    private long timeStamp;
    private int type;
    private int value;

    public PhysicalMentalData() {
        this(0, 0, 0L, 7, null);
    }

    public static /* synthetic */ PhysicalMentalData copy$default(PhysicalMentalData physicalMentalData, int i, int i2, long j2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = physicalMentalData.value;
        }
        if ((i3 & 2) != 0) {
            i2 = physicalMentalData.type;
        }
        if ((i3 & 4) != 0) {
            j2 = physicalMentalData.timeStamp;
        }
        return physicalMentalData.copy(i, i2, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    @NotNull
    public final PhysicalMentalData copy(int value, int type, long timeStamp) {
        return new PhysicalMentalData(value, type, timeStamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhysicalMentalData)) {
            return false;
        }
        PhysicalMentalData physicalMentalData = (PhysicalMentalData) other;
        return this.value == physicalMentalData.value && this.type == physicalMentalData.type && this.timeStamp == physicalMentalData.timeStamp;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final int getType() {
        return this.type;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.value) * 31) + Integer.hashCode(this.type)) * 31) + Long.hashCode(this.timeStamp);
    }

    public final void setTimeStamp(long j2) {
        this.timeStamp = j2;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setValue(int i) {
        this.value = i;
    }

    @NotNull
    public String toString() {
        return "PhysicalMentalData(value=" + this.value + ", type=" + this.type + ", timeStamp=" + this.timeStamp + ")";
    }

    public PhysicalMentalData(int i, int i2, long j2) {
        this.value = i;
        this.type = i2;
        this.timeStamp = j2;
    }

    public /* synthetic */ PhysicalMentalData(int i, int i2, long j2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? 0L : j2);
    }
}
