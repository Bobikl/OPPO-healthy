package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.smartenginehelper.ParserTag;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u000f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\b\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/ql1;", "Lcom/oplus/aiunit/vision/pn9;", "", "a", "I", "()I", "bloodOxygenValue", "", "b", "Z", "c", "()Z", "isValid", "", "()F", ParserTag.TAG_PERCENT, "<init>", "(IZ)V", "cardiovascular_release"}, k = 1, mv = {1, 8, 0})
public final class ql1 implements pn9 {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int bloodOxygenValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean isValid;

    public ql1(int i, boolean z) {
        this.bloodOxygenValue = i;
        this.isValid = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getBloodOxygenValue() {
        return this.bloodOxygenValue;
    }

    public final float b() {
        int i = this.bloodOxygenValue;
        if (i < 70.0f) {
            return 0.0f;
        }
        float f = i;
        boolean z = false;
        if (70.0f <= f && f <= 100.0f) {
            z = true;
        }
        if (z) {
            return (i - 70.0f) / 30.0f;
        }
        return 1.0f;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }
}
