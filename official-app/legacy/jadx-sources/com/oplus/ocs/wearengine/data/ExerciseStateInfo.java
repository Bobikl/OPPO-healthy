package com.oplus.ocs.wearengine.data;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0017\u0010\u0007\u001a\u00020\u0005¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/oplus/ocs/wearengine/data/ExerciseStateInfo;", "", "exerciseState", "Lcom/oplus/ocs/wearengine/data/ExerciseState;", "exerciseEndReason", "", "(Lcom/oplus/ocs/wearengine/data/ExerciseState;I)V", "endReason", "getEndReason$annotations", "()V", "getEndReason", "()I", "state", "getState", "()Lcom/oplus/ocs/wearengine/data/ExerciseState;", "equals", "", "other", "hashCode", "toString", "", "Companion", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ExerciseStateInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int endReason;

    @NotNull
    private final ExerciseState state;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/oplus/ocs/wearengine/data/ExerciseStateInfo$Companion;", "", "()V", "getEndReasonFromState", "", "exerciseState", "Lcom/oplus/ocs/wearengine/data/ExerciseState;", "getEndReasonFromState$thirdparty_impl_release", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getEndReasonFromState$thirdparty_impl_release(@NotNull ExerciseState exerciseState) {
            Intrinsics.checkNotNullParameter(exerciseState, "exerciseState");
            if (Intrinsics.areEqual(exerciseState, ExerciseState.USER_ENDING)) {
                return 4;
            }
            if (!Intrinsics.areEqual(exerciseState, ExerciseState.AUTO_ENDING)) {
                if (!Intrinsics.areEqual(exerciseState, ExerciseState.AUTO_ENDING_PERMISSION_LOST)) {
                    if (!Intrinsics.areEqual(exerciseState, ExerciseState.TERMINATING)) {
                        if (!Intrinsics.areEqual(exerciseState, ExerciseState.ENDING)) {
                            if (Intrinsics.areEqual(exerciseState, ExerciseState.USER_ENDED)) {
                                return 4;
                            }
                            if (!Intrinsics.areEqual(exerciseState, ExerciseState.AUTO_ENDED)) {
                                if (!Intrinsics.areEqual(exerciseState, ExerciseState.AUTO_ENDED_PERMISSION_LOST)) {
                                    if (!Intrinsics.areEqual(exerciseState, ExerciseState.TERMINATED)) {
                                        if (!Intrinsics.areEqual(exerciseState, ExerciseState.ENDED)) {
                                            return 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return 5;
                }
                return 1;
            }
            return 3;
        }
    }

    public ExerciseStateInfo(@NotNull ExerciseState exerciseState, int i) {
        Intrinsics.checkNotNullParameter(exerciseState, "exerciseState");
        if (i != 0) {
            this.endReason = i;
            this.state = exerciseState;
        } else {
            int endReasonFromState$thirdparty_impl_release = INSTANCE.getEndReasonFromState$thirdparty_impl_release(exerciseState);
            this.endReason = endReasonFromState$thirdparty_impl_release;
            this.state = endReasonFromState$thirdparty_impl_release != 0 ? exerciseState.isEnded() ? ExerciseState.ENDED : ExerciseState.ENDING : exerciseState;
        }
    }

    public static /* synthetic */ void getEndReason$annotations() {
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof ExerciseStateInfo)) {
            return false;
        }
        ExerciseStateInfo exerciseStateInfo = (ExerciseStateInfo) other;
        return this.endReason == exerciseStateInfo.endReason && Intrinsics.areEqual(this.state, exerciseStateInfo.state);
    }

    public final int getEndReason() {
        return this.endReason;
    }

    @NotNull
    public final ExerciseState getState() {
        return this.state;
    }

    public int hashCode() {
        return (this.endReason * 31) + this.state.hashCode();
    }

    @NotNull
    public String toString() {
        return "ExerciseStateInfo(state=" + this.state + ", endReason=" + this.endReason + ")";
    }
}
