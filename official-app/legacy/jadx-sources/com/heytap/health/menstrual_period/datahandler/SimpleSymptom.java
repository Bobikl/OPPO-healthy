package com.heytap.health.menstrual_period.datahandler;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.menstrual_period.data.SymptomType;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/heytap/health/menstrual_period/datahandler/SimpleSymptom;", "Ljava/io/Serializable;", "typeValue", "Lcom/heytap/health/menstrual_period/data/SymptomType$Type;", "value", "", "modifiedTime", "", "textId", "(Lcom/heytap/health/menstrual_period/data/SymptomType$Type;IJI)V", "getModifiedTime", "()J", "setModifiedTime", "(J)V", "getTextId", "()I", "getTypeValue", "()Lcom/heytap/health/menstrual_period/data/SymptomType$Type;", "getValue", "setValue", "(I)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "", "menstrual_period_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SimpleSymptom implements Serializable {
    public static final int $stable = 8;
    private long modifiedTime;
    private final int textId;

    @NotNull
    private final SymptomType.Type typeValue;
    private int value;

    public SimpleSymptom(@NotNull SymptomType.Type typeValue, int i, long j2, int i2) {
        Intrinsics.checkNotNullParameter(typeValue, "typeValue");
        this.typeValue = typeValue;
        this.value = i;
        this.modifiedTime = j2;
        this.textId = i2;
    }

    public static /* synthetic */ SimpleSymptom copy$default(SimpleSymptom simpleSymptom, SymptomType.Type type, int i, long j2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            type = simpleSymptom.typeValue;
        }
        if ((i3 & 2) != 0) {
            i = simpleSymptom.value;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            j2 = simpleSymptom.modifiedTime;
        }
        long j3 = j2;
        if ((i3 & 8) != 0) {
            i2 = simpleSymptom.textId;
        }
        return simpleSymptom.copy(type, i4, j3, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SymptomType.Type getTypeValue() {
        return this.typeValue;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getModifiedTime() {
        return this.modifiedTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTextId() {
        return this.textId;
    }

    @NotNull
    public final SimpleSymptom copy(@NotNull SymptomType.Type typeValue, int value, long modifiedTime, int textId) {
        Intrinsics.checkNotNullParameter(typeValue, "typeValue");
        return new SimpleSymptom(typeValue, value, modifiedTime, textId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimpleSymptom)) {
            return false;
        }
        SimpleSymptom simpleSymptom = (SimpleSymptom) other;
        return this.typeValue == simpleSymptom.typeValue && this.value == simpleSymptom.value && this.modifiedTime == simpleSymptom.modifiedTime && this.textId == simpleSymptom.textId;
    }

    public final long getModifiedTime() {
        return this.modifiedTime;
    }

    public final int getTextId() {
        return this.textId;
    }

    @NotNull
    public final SymptomType.Type getTypeValue() {
        return this.typeValue;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((((this.typeValue.hashCode() * 31) + Integer.hashCode(this.value)) * 31) + Long.hashCode(this.modifiedTime)) * 31) + Integer.hashCode(this.textId);
    }

    public final void setModifiedTime(long j2) {
        this.modifiedTime = j2;
    }

    public final void setValue(int i) {
        this.value = i;
    }

    @NotNull
    public String toString() {
        return "SimpleSymptom(typeValue=" + this.typeValue + ", value=" + this.value + ", modifiedTime=" + this.modifiedTime + ", textId=" + this.textId + ")";
    }
}
