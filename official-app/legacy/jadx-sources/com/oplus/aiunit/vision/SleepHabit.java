package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.wsport.data.SleepSettingBean;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.whh, reason: from toString */
/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/whh;", "", "", "editMode", "", "Lcom/heytap/wsport/data/SleepSettingBean$SleepRest;", "sleepRests", "a", "", "toString", "", "hashCode", "other", "equals", "Z", "c", "()Z", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "<init>", "(ZLjava/util/List;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class SleepHabit {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final boolean editMode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<SleepSettingBean.SleepRest> sleepRests;

    /* JADX WARN: Multi-variable type inference failed */
    public SleepHabit(boolean z, @NotNull List<? extends SleepSettingBean.SleepRest> sleepRests) {
        Intrinsics.checkNotNullParameter(sleepRests, "sleepRests");
        this.editMode = z;
        this.sleepRests = sleepRests;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SleepHabit b(SleepHabit sleepHabit, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = sleepHabit.editMode;
        }
        if ((i & 2) != 0) {
            list = sleepHabit.sleepRests;
        }
        return sleepHabit.a(z, list);
    }

    @NotNull
    public final SleepHabit a(boolean editMode, @NotNull List<? extends SleepSettingBean.SleepRest> sleepRests) {
        Intrinsics.checkNotNullParameter(sleepRests, "sleepRests");
        return new SleepHabit(editMode, sleepRests);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getEditMode() {
        return this.editMode;
    }

    @NotNull
    public final List<SleepSettingBean.SleepRest> d() {
        return this.sleepRests;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepHabit)) {
            return false;
        }
        SleepHabit sleepHabit = (SleepHabit) other;
        return this.editMode == sleepHabit.editMode && Intrinsics.areEqual(this.sleepRests, sleepHabit.sleepRests);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.editMode;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.sleepRests.hashCode();
    }

    @NotNull
    public String toString() {
        return "SleepHabit(editMode=" + this.editMode + ", sleepRests=" + this.sleepRests + ")";
    }
}
