package com.heytap.health.menstrual.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/menstrual/data/MenstrualOperateSymptomData;", "", "symptomFlow", "", "symptomDysmenorrhea", "(II)V", "getSymptomDysmenorrhea", "()I", "setSymptomDysmenorrhea", "(I)V", "getSymptomFlow", "setSymptomFlow", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "menstrual_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class MenstrualOperateSymptomData {
    private int symptomDysmenorrhea;
    private int symptomFlow;

    public MenstrualOperateSymptomData(int i, int i2) {
        this.symptomFlow = i;
        this.symptomDysmenorrhea = i2;
    }

    public static /* synthetic */ MenstrualOperateSymptomData copy$default(MenstrualOperateSymptomData menstrualOperateSymptomData, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = menstrualOperateSymptomData.symptomFlow;
        }
        if ((i3 & 2) != 0) {
            i2 = menstrualOperateSymptomData.symptomDysmenorrhea;
        }
        return menstrualOperateSymptomData.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSymptomFlow() {
        return this.symptomFlow;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSymptomDysmenorrhea() {
        return this.symptomDysmenorrhea;
    }

    @NotNull
    public final MenstrualOperateSymptomData copy(int symptomFlow, int symptomDysmenorrhea) {
        return new MenstrualOperateSymptomData(symptomFlow, symptomDysmenorrhea);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenstrualOperateSymptomData)) {
            return false;
        }
        MenstrualOperateSymptomData menstrualOperateSymptomData = (MenstrualOperateSymptomData) other;
        return this.symptomFlow == menstrualOperateSymptomData.symptomFlow && this.symptomDysmenorrhea == menstrualOperateSymptomData.symptomDysmenorrhea;
    }

    public final int getSymptomDysmenorrhea() {
        return this.symptomDysmenorrhea;
    }

    public final int getSymptomFlow() {
        return this.symptomFlow;
    }

    public int hashCode() {
        return (Integer.hashCode(this.symptomFlow) * 31) + Integer.hashCode(this.symptomDysmenorrhea);
    }

    public final void setSymptomDysmenorrhea(int i) {
        this.symptomDysmenorrhea = i;
    }

    public final void setSymptomFlow(int i) {
        this.symptomFlow = i;
    }

    @NotNull
    public String toString() {
        return "MenstrualOperateSymptomData(symptomFlow=" + this.symptomFlow + ", symptomDysmenorrhea=" + this.symptomDysmenorrhea + ")";
    }
}
