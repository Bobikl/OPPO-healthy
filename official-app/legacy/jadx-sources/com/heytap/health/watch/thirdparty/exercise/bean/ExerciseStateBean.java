package com.heytap.health.watch.thirdparty.exercise.bean;

import androidx.annotation.Keep;
import com.oplus.ocs.wearengine.data.ExerciseStateInfo;
import com.oplus.ocs.wearengine.data.ExerciseType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/watch/thirdparty/exercise/bean/ExerciseStateBean;", "", "exerciseType", "Lcom/oplus/ocs/wearengine/data/ExerciseType;", "exerciseStateInfo", "Lcom/oplus/ocs/wearengine/data/ExerciseStateInfo;", "(Lcom/oplus/ocs/wearengine/data/ExerciseType;Lcom/oplus/ocs/wearengine/data/ExerciseStateInfo;)V", "getExerciseStateInfo", "()Lcom/oplus/ocs/wearengine/data/ExerciseStateInfo;", "setExerciseStateInfo", "(Lcom/oplus/ocs/wearengine/data/ExerciseStateInfo;)V", "getExerciseType", "()Lcom/oplus/ocs/wearengine/data/ExerciseType;", "setExerciseType", "(Lcom/oplus/ocs/wearengine/data/ExerciseType;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ExerciseStateBean {

    @NotNull
    private ExerciseStateInfo exerciseStateInfo;

    @NotNull
    private ExerciseType exerciseType;

    public ExerciseStateBean(@NotNull ExerciseType exerciseType, @NotNull ExerciseStateInfo exerciseStateInfo) {
        Intrinsics.checkNotNullParameter(exerciseType, "exerciseType");
        Intrinsics.checkNotNullParameter(exerciseStateInfo, "exerciseStateInfo");
        this.exerciseType = exerciseType;
        this.exerciseStateInfo = exerciseStateInfo;
    }

    public static /* synthetic */ ExerciseStateBean copy$default(ExerciseStateBean exerciseStateBean, ExerciseType exerciseType, ExerciseStateInfo exerciseStateInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            exerciseType = exerciseStateBean.exerciseType;
        }
        if ((i & 2) != 0) {
            exerciseStateInfo = exerciseStateBean.exerciseStateInfo;
        }
        return exerciseStateBean.copy(exerciseType, exerciseStateInfo);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ExerciseType getExerciseType() {
        return this.exerciseType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ExerciseStateInfo getExerciseStateInfo() {
        return this.exerciseStateInfo;
    }

    @NotNull
    public final ExerciseStateBean copy(@NotNull ExerciseType exerciseType, @NotNull ExerciseStateInfo exerciseStateInfo) {
        Intrinsics.checkNotNullParameter(exerciseType, "exerciseType");
        Intrinsics.checkNotNullParameter(exerciseStateInfo, "exerciseStateInfo");
        return new ExerciseStateBean(exerciseType, exerciseStateInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExerciseStateBean)) {
            return false;
        }
        ExerciseStateBean exerciseStateBean = (ExerciseStateBean) other;
        return Intrinsics.areEqual(this.exerciseType, exerciseStateBean.exerciseType) && Intrinsics.areEqual(this.exerciseStateInfo, exerciseStateBean.exerciseStateInfo);
    }

    @NotNull
    public final ExerciseStateInfo getExerciseStateInfo() {
        return this.exerciseStateInfo;
    }

    @NotNull
    public final ExerciseType getExerciseType() {
        return this.exerciseType;
    }

    public int hashCode() {
        return (this.exerciseType.hashCode() * 31) + this.exerciseStateInfo.hashCode();
    }

    public final void setExerciseStateInfo(@NotNull ExerciseStateInfo exerciseStateInfo) {
        Intrinsics.checkNotNullParameter(exerciseStateInfo, "<set-?>");
        this.exerciseStateInfo = exerciseStateInfo;
    }

    public final void setExerciseType(@NotNull ExerciseType exerciseType) {
        Intrinsics.checkNotNullParameter(exerciseType, "<set-?>");
        this.exerciseType = exerciseType;
    }

    @NotNull
    public String toString() {
        return "ExerciseStateBean(exerciseType=" + this.exerciseType + ", exerciseStateInfo=" + this.exerciseStateInfo + ")";
    }
}
