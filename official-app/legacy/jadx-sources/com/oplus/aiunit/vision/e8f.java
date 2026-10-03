package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.AssessmentRecord;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\nR\u0011\u0010\r\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/e8f;", "Lcom/oplus/aiunit/vision/pn9;", "", "a", "Z", "b", "()Z", "isFirstItem", "Lcom/heytap/databaseengine/model/AssessmentRecord;", "Lcom/heytap/databaseengine/model/AssessmentRecord;", "()Lcom/heytap/databaseengine/model/AssessmentRecord;", "recordData", "c", "isQuicklyCheckupV2Data", "<init>", "(ZLcom/heytap/databaseengine/model/AssessmentRecord;)V", "cardiovascular_release"}, k = 1, mv = {1, 8, 0})
public final class e8f implements pn9 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean isFirstItem;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AssessmentRecord recordData;

    public e8f(boolean z, @NotNull AssessmentRecord recordData) {
        Intrinsics.checkNotNullParameter(recordData, "recordData");
        this.isFirstItem = z;
        this.recordData = recordData;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final AssessmentRecord getRecordData() {
        return this.recordData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsFirstItem() {
        return this.isFirstItem;
    }

    public final boolean c() {
        Integer version = this.recordData.getVersion();
        Intrinsics.checkNotNullExpressionValue(version, "recordData.version");
        return version.intValue() >= 3;
    }
}
