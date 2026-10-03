package com.heytap.sports.record.details.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.aiunit.vision.y15;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/heytap/sports/record/details/bean/H5QueryData;", "", "ssoid", "", "requestId", y15.PARAMS_DATA_TYPE, "analysisType", "data", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAnalysisType", "()Ljava/lang/String;", "getData", "getDataType", "getRequestId", "getSsoid", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "sport_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class H5QueryData {
    public static final int $stable = 0;

    @NotNull
    private final String analysisType;

    @NotNull
    private final String data;

    @NotNull
    private final String dataType;

    @NotNull
    private final String requestId;

    @NotNull
    private final String ssoid;

    public H5QueryData(@NotNull String ssoid, @NotNull String requestId, @NotNull String dataType, @NotNull String analysisType, @NotNull String data) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        Intrinsics.checkNotNullParameter(analysisType, "analysisType");
        Intrinsics.checkNotNullParameter(data, "data");
        this.ssoid = ssoid;
        this.requestId = requestId;
        this.dataType = dataType;
        this.analysisType = analysisType;
        this.data = data;
    }

    public static /* synthetic */ H5QueryData copy$default(H5QueryData h5QueryData, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = h5QueryData.ssoid;
        }
        if ((i & 2) != 0) {
            str2 = h5QueryData.requestId;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = h5QueryData.dataType;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = h5QueryData.analysisType;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = h5QueryData.data;
        }
        return h5QueryData.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSsoid() {
        return this.ssoid;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDataType() {
        return this.dataType;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAnalysisType() {
        return this.analysisType;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final H5QueryData copy(@NotNull String ssoid, @NotNull String requestId, @NotNull String dataType, @NotNull String analysisType, @NotNull String data) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        Intrinsics.checkNotNullParameter(analysisType, "analysisType");
        Intrinsics.checkNotNullParameter(data, "data");
        return new H5QueryData(ssoid, requestId, dataType, analysisType, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof H5QueryData)) {
            return false;
        }
        H5QueryData h5QueryData = (H5QueryData) other;
        return Intrinsics.areEqual(this.ssoid, h5QueryData.ssoid) && Intrinsics.areEqual(this.requestId, h5QueryData.requestId) && Intrinsics.areEqual(this.dataType, h5QueryData.dataType) && Intrinsics.areEqual(this.analysisType, h5QueryData.analysisType) && Intrinsics.areEqual(this.data, h5QueryData.data);
    }

    @NotNull
    public final String getAnalysisType() {
        return this.analysisType;
    }

    @NotNull
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final String getDataType() {
        return this.dataType;
    }

    @NotNull
    public final String getRequestId() {
        return this.requestId;
    }

    @NotNull
    public final String getSsoid() {
        return this.ssoid;
    }

    public int hashCode() {
        return (((((((this.ssoid.hashCode() * 31) + this.requestId.hashCode()) * 31) + this.dataType.hashCode()) * 31) + this.analysisType.hashCode()) * 31) + this.data.hashCode();
    }

    @NotNull
    public String toString() {
        return "H5QueryData(ssoid=" + this.ssoid + ", requestId=" + this.requestId + ", dataType=" + this.dataType + ", analysisType=" + this.analysisType + ", data=" + this.data + ")";
    }
}
