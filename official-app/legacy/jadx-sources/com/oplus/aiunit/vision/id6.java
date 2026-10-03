package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.ECGRecord;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0013¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR$\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0006\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/oplus/aiunit/vision/id6;", "Lcom/oplus/aiunit/vision/pn9;", "Landroid/content/Context;", "context", "", "b", "a", "Ljava/lang/String;", "ecgId", "", "I", "ecgDiagnosisResults", "Lcom/heytap/databaseengine/model/ECGRecord;", "c", "Lcom/heytap/databaseengine/model/ECGRecord;", "()Lcom/heytap/databaseengine/model/ECGRecord;", MapSchema.FIELD_NAME_ENTRY, "(Lcom/heytap/databaseengine/model/ECGRecord;)V", "ecgRecord", "", "d", "Z", "()Z", "setCanClick", "(Z)V", "canClick", "()I", "ecgResultStrId", "<init>", "(Ljava/lang/String;ILcom/heytap/databaseengine/model/ECGRecord;Z)V", "cardiovascular_release"}, k = 1, mv = {1, 8, 0})
public final class id6 implements pn9 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String ecgId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int ecgDiagnosisResults;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ECGRecord ecgRecord;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean canClick;

    public id6(@NotNull String ecgId, int i, @Nullable ECGRecord eCGRecord, boolean z) {
        Intrinsics.checkNotNullParameter(ecgId, "ecgId");
        this.ecgId = ecgId;
        this.ecgDiagnosisResults = i;
        this.ecgRecord = eCGRecord;
        this.canClick = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getCanClick() {
        return this.canClick;
    }

    @NotNull
    public final String b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return t23.INSTANCE.b(context, Integer.valueOf(this.ecgDiagnosisResults));
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final ECGRecord getEcgRecord() {
        return this.ecgRecord;
    }

    public final int d() {
        return t23.INSTANCE.a(Integer.valueOf(this.ecgDiagnosisResults));
    }

    public final void e(@Nullable ECGRecord eCGRecord) {
        this.ecgRecord = eCGRecord;
    }

    public /* synthetic */ id6(String str, int i, ECGRecord eCGRecord, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, eCGRecord, (i2 & 8) != 0 ? true : z);
    }
}
