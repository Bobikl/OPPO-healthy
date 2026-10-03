package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.OneTimeSport;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.u5a, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\fR\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/oplus/aiunit/vision/u5a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "getSuccessCount", "()I", "successCount", "b", "duplicateCount", "c", "getFailedCount", "failedCount", "", "Lcom/heytap/databaseengine/model/OneTimeSport;", "d", "Ljava/util/List;", "getRecords", "()Ljava/util/List;", "records", "<init>", "(IIILjava/util/List;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ImportResultDetail {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int successCount;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int duplicateCount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final int failedCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<OneTimeSport> records;

    public ImportResultDetail() {
        this(0, 0, 0, null, 15, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getDuplicateCount() {
        return this.duplicateCount;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImportResultDetail)) {
            return false;
        }
        ImportResultDetail importResultDetail = (ImportResultDetail) other;
        return this.successCount == importResultDetail.successCount && this.duplicateCount == importResultDetail.duplicateCount && this.failedCount == importResultDetail.failedCount && Intrinsics.areEqual(this.records, importResultDetail.records);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.successCount) * 31) + Integer.hashCode(this.duplicateCount)) * 31) + Integer.hashCode(this.failedCount)) * 31) + this.records.hashCode();
    }

    @NotNull
    public String toString() {
        return "ImportResultDetail(successCount=" + this.successCount + ", duplicateCount=" + this.duplicateCount + ", failedCount=" + this.failedCount + ", records=" + this.records + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ImportResultDetail(int i, int i2, int i3, @NotNull List<? extends OneTimeSport> records) {
        Intrinsics.checkNotNullParameter(records, "records");
        this.successCount = i;
        this.duplicateCount = i2;
        this.failedCount = i3;
        this.records = records;
    }

    public /* synthetic */ ImportResultDetail(int i, int i2, int i3, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
