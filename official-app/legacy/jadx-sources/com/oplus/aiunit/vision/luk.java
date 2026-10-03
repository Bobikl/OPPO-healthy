package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.databaseengineservice.db.table.DBAssessmentRecord;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0018\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0003\u0010\u0013\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0019R\u0011\u0010\u001b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0019R\u0011\u0010\u001d\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\u001c¨\u0006 "}, d2 = {"Lcom/oplus/aiunit/vision/luk;", "Lcom/oplus/aiunit/vision/pn9;", "", "a", UserInfo.SEX_FEMALE, DBAssessmentRecord.PWV, "", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "pwvId", "", "c", "I", "degreeVascularElasticity", "", "Z", "f", "()Z", "isValid", MapSchema.FIELD_NAME_ENTRY, "setCanClick", "(Z)V", "canClick", "()I", "vascularValueResId", "compareWithSameAge", "()F", ParserTag.TAG_PERCENT, "<init>", "(FLjava/lang/String;IZZ)V", "cardiovascular_release"}, k = 1, mv = {1, 8, 0})
public final class luk implements pn9 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final float pwv;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String pwvId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int degreeVascularElasticity;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean isValid;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean canClick;

    public luk(float f, @NotNull String pwvId, int i, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(pwvId, "pwvId");
        this.pwv = f;
        this.pwvId = pwvId;
        this.degreeVascularElasticity = i;
        this.isValid = z;
        this.canClick = z2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getCanClick() {
        return this.canClick;
    }

    public final int b() {
        return t23.INSTANCE.d(Integer.valueOf(this.degreeVascularElasticity));
    }

    public final float c() {
        float f = this.pwv;
        if (f >= 8.5d) {
            return f >= 10.0f ? (((f - 10) / 10) * 0.33333334f) + (2 * 0.33333334f) : (((f - 8.5f) / 1.5f) * 0.33333334f) + 0.33333334f;
        }
        float f2 = 0;
        return ((f - f2) / (8.5f - f2)) * 0.33333334f;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPwvId() {
        return this.pwvId;
    }

    public final int e() {
        return t23.INSTANCE.e(Float.valueOf(this.pwv));
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }

    public /* synthetic */ luk(float f, String str, int i, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, str, i, z, (i2 & 16) != 0 ? true : z2);
    }
}
