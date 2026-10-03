package com.heytap.health.cardiovascular.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.aiunit.vision.y15;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/cardiovascular/bean/RecordRiskItem;", "", y15.PARAMS_DATA_TYPE, "", "exceptionDesc", "", "(ILjava/lang/String;)V", "getDataType", "()I", "getExceptionDesc", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "cardiovascular_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RecordRiskItem {
    public static final int $stable = 0;
    private final int dataType;

    @NotNull
    private final String exceptionDesc;

    public RecordRiskItem(int i, @NotNull String exceptionDesc) {
        Intrinsics.checkNotNullParameter(exceptionDesc, "exceptionDesc");
        this.dataType = i;
        this.exceptionDesc = exceptionDesc;
    }

    public static /* synthetic */ RecordRiskItem copy$default(RecordRiskItem recordRiskItem, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = recordRiskItem.dataType;
        }
        if ((i2 & 2) != 0) {
            str = recordRiskItem.exceptionDesc;
        }
        return recordRiskItem.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDataType() {
        return this.dataType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getExceptionDesc() {
        return this.exceptionDesc;
    }

    @NotNull
    public final RecordRiskItem copy(int dataType, @NotNull String exceptionDesc) {
        Intrinsics.checkNotNullParameter(exceptionDesc, "exceptionDesc");
        return new RecordRiskItem(dataType, exceptionDesc);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecordRiskItem)) {
            return false;
        }
        RecordRiskItem recordRiskItem = (RecordRiskItem) other;
        return this.dataType == recordRiskItem.dataType && Intrinsics.areEqual(this.exceptionDesc, recordRiskItem.exceptionDesc);
    }

    public final int getDataType() {
        return this.dataType;
    }

    @NotNull
    public final String getExceptionDesc() {
        return this.exceptionDesc;
    }

    public int hashCode() {
        return (Integer.hashCode(this.dataType) * 31) + this.exceptionDesc.hashCode();
    }

    @NotNull
    public String toString() {
        return "RecordRiskItem(dataType=" + this.dataType + ", exceptionDesc=" + this.exceptionDesc + ")";
    }
}
