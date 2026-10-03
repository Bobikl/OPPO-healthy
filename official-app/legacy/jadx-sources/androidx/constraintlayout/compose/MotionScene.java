package androidx.constraintlayout.compose;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.MutableState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\rH&J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H&J\u0012\u0010\u0010\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H&J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H&J\u0016\u0010\u0012\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H&¨\u0006\u0016"}, d2 = {"Landroidx/constraintlayout/compose/MotionScene;", "", "getConstraintSet", "", "index", "", "name", "getForcedDrawDebug", "Landroidx/constraintlayout/compose/MotionLayoutDebugFlags;", "getForcedProgress", "", "getTransition", "resetForcedProgress", "", "setConstraintSetContent", "content", "setDebugName", "setTransitionContent", "setUpdateFlag", "needsUpdate", "Landroidx/compose/runtime/MutableState;", "", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface MotionScene {
    @Nullable
    String getConstraintSet(int index);

    @Nullable
    String getConstraintSet(@NotNull String name);

    @NotNull
    MotionLayoutDebugFlags getForcedDrawDebug();

    float getForcedProgress();

    @Nullable
    String getTransition(@NotNull String name);

    void resetForcedProgress();

    void setConstraintSetContent(@NotNull String name, @NotNull String content);

    void setDebugName(@Nullable String name);

    void setTransitionContent(@NotNull String name, @NotNull String content);

    void setUpdateFlag(@NotNull MutableState<Long> needsUpdate);
}
