package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.AssessmentRecord;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\tR\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/oif;", "Lcom/oplus/aiunit/vision/pn9;", "Lcom/heytap/databaseengine/model/AssessmentRecord;", "a", "Lcom/heytap/databaseengine/model/AssessmentRecord;", "c", "()Lcom/heytap/databaseengine/model/AssessmentRecord;", "recordData", "", "()I", "ecgResultStringRes", "b", "pwvResultStringRes", "<init>", "(Lcom/heytap/databaseengine/model/AssessmentRecord;)V", "cardiovascular_release"}, k = 1, mv = {1, 8, 0})
public final class oif implements pn9 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AssessmentRecord recordData;

    public oif(@NotNull AssessmentRecord recordData) {
        Intrinsics.checkNotNullParameter(recordData, "recordData");
        this.recordData = recordData;
    }

    public final int a() {
        return t23.INSTANCE.a(this.recordData.getEcgDiagnosisResults());
    }

    public final int b() {
        return t23.INSTANCE.e(this.recordData.getPwv());
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final AssessmentRecord getRecordData() {
        return this.recordData;
    }
}
