package com.heytap.health.menstrual_period.data;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengineservice.db.table.wristtemperature.DBWristTemperatureStat;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/heytap/health/menstrual_period/data/SymptomConfigListData;", "", DBWristTemperatureStat.SYMPTOMS, "", "Lcom/heytap/health/menstrual_period/data/SymptomConfigData;", "(Ljava/util/List;)V", "getSymptoms", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "menstrual_period_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SymptomConfigListData {
    public static final int $stable = 8;

    @Nullable
    private final List<SymptomConfigData> symptoms;

    public SymptomConfigListData(@Nullable List<SymptomConfigData> list) {
        this.symptoms = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SymptomConfigListData copy$default(SymptomConfigListData symptomConfigListData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = symptomConfigListData.symptoms;
        }
        return symptomConfigListData.copy(list);
    }

    @Nullable
    public final List<SymptomConfigData> component1() {
        return this.symptoms;
    }

    @NotNull
    public final SymptomConfigListData copy(@Nullable List<SymptomConfigData> symptoms) {
        return new SymptomConfigListData(symptoms);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SymptomConfigListData) && Intrinsics.areEqual(this.symptoms, ((SymptomConfigListData) other).symptoms);
    }

    @Nullable
    public final List<SymptomConfigData> getSymptoms() {
        return this.symptoms;
    }

    public int hashCode() {
        List<SymptomConfigData> list = this.symptoms;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return "SymptomConfigListData(symptoms=" + this.symptoms + ")";
    }
}
