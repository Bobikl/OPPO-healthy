package com.heytap.health.cardiovascular.model;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.aiunit.vision.hp6;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JP\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\t\u0010#\u001a\u00020\u000bHÖ\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0017\u0010\u0012¨\u0006$"}, d2 = {"Lcom/heytap/health/cardiovascular/model/MultipleSignsAnalysis;", "", "timestamp", "", "type", "", "status", hp6.DETAIL_ENTRY, "", "Lcom/heytap/health/cardiovascular/model/SignsData;", "code", "", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getDetails", "()Ljava/util/List;", "getStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getType", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;)Lcom/heytap/health/cardiovascular/model/MultipleSignsAnalysis;", "equals", "", "other", "hashCode", "toString", "cardiovascular_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class MultipleSignsAnalysis {
    public static final int $stable = 8;

    @Nullable
    private final String code;

    @Nullable
    private final List<SignsData> details;

    @Nullable
    private final Integer status;

    @Nullable
    private final Long timestamp;

    @Nullable
    private final Integer type;

    public MultipleSignsAnalysis() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MultipleSignsAnalysis copy$default(MultipleSignsAnalysis multipleSignsAnalysis, Long l2, Integer num, Integer num2, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            l2 = multipleSignsAnalysis.timestamp;
        }
        if ((i & 2) != 0) {
            num = multipleSignsAnalysis.type;
        }
        Integer num3 = num;
        if ((i & 4) != 0) {
            num2 = multipleSignsAnalysis.status;
        }
        Integer num4 = num2;
        if ((i & 8) != 0) {
            list = multipleSignsAnalysis.details;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            str = multipleSignsAnalysis.code;
        }
        return multipleSignsAnalysis.copy(l2, num3, num4, list2, str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    @Nullable
    public final List<SignsData> component4() {
        return this.details;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final MultipleSignsAnalysis copy(@Nullable Long timestamp, @Nullable Integer type, @Nullable Integer status, @Nullable List<SignsData> details, @Nullable String code) {
        return new MultipleSignsAnalysis(timestamp, type, status, details, code);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultipleSignsAnalysis)) {
            return false;
        }
        MultipleSignsAnalysis multipleSignsAnalysis = (MultipleSignsAnalysis) other;
        return Intrinsics.areEqual(this.timestamp, multipleSignsAnalysis.timestamp) && Intrinsics.areEqual(this.type, multipleSignsAnalysis.type) && Intrinsics.areEqual(this.status, multipleSignsAnalysis.status) && Intrinsics.areEqual(this.details, multipleSignsAnalysis.details) && Intrinsics.areEqual(this.code, multipleSignsAnalysis.code);
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final List<SignsData> getDetails() {
        return this.details;
    }

    @Nullable
    public final Integer getStatus() {
        return this.status;
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public int hashCode() {
        Long l2 = this.timestamp;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        Integer num = this.type;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.status;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<SignsData> list = this.details;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.code;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MultipleSignsAnalysis(timestamp=" + this.timestamp + ", type=" + this.type + ", status=" + this.status + ", details=" + this.details + ", code=" + this.code + ")";
    }

    public MultipleSignsAnalysis(@Nullable Long l2, @Nullable Integer num, @Nullable Integer num2, @Nullable List<SignsData> list, @Nullable String str) {
        this.timestamp = l2;
        this.type = num;
        this.status = num2;
        this.details = list;
        this.code = str;
    }

    public /* synthetic */ MultipleSignsAnalysis(Long l2, Integer num, Integer num2, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l2, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : str);
    }
}
