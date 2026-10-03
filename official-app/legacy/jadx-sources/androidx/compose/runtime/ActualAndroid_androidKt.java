package androidx.compose.runtime;

import android.os.Looper;
import android.util.Log;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.exifinterface.media.ExifInterface;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Deprecated;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a/\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\r\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u000f\u001a\u0002H\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0011H\u0000¢\u0006\u0002\u0010\u0012\u001a\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0000\"!\u0010\u0000\u001a\u00020\u00018FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000*\f\b\u0000\u0010\u0018\"\u00020\u00192\u00020\u0019¨\u0006\u001a"}, d2 = {"DefaultMonotonicFrameClock", "Landroidx/compose/runtime/MonotonicFrameClock;", "getDefaultMonotonicFrameClock$annotations", "()V", "getDefaultMonotonicFrameClock", "()Landroidx/compose/runtime/MonotonicFrameClock;", "DefaultMonotonicFrameClock$delegate", "Lkotlin/Lazy;", "DisallowDefaultMonotonicFrameClock", "", "LogTag", "", "createSnapshotMutableState", "Landroidx/compose/runtime/snapshots/SnapshotMutableState;", ExifInterface.GPS_DIRECTION_TRUE, "value", "policy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;)Landroidx/compose/runtime/snapshots/SnapshotMutableState;", "logError", "", "message", MapSchema.FIELD_NAME_ENTRY, "", "CheckResult", "Landroidx/annotation/CheckResult;", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ActualAndroid_androidKt {

    @NotNull
    private static final Lazy DefaultMonotonicFrameClock$delegate = LazyKt__LazyJVMKt.lazy(new Function0<MonotonicFrameClock>() { // from class: androidx.compose.runtime.ActualAndroid_androidKt$DefaultMonotonicFrameClock$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final MonotonicFrameClock invoke() {
            return Looper.getMainLooper() != null ? DefaultChoreographerFrameClock.INSTANCE : SdkStubsFallbackFrameClock.INSTANCE;
        }
    });
    private static final boolean DisallowDefaultMonotonicFrameClock = false;

    @NotNull
    private static final String LogTag = "ComposeInternal";

    @NotNull
    public static final <T> SnapshotMutableState<T> createSnapshotMutableState(T t, @NotNull SnapshotMutationPolicy<T> policy) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        return new ParcelableSnapshotMutableState(t, policy);
    }

    @NotNull
    public static final MonotonicFrameClock getDefaultMonotonicFrameClock() {
        return (MonotonicFrameClock) DefaultMonotonicFrameClock$delegate.getValue();
    }

    @Deprecated(message = "MonotonicFrameClocks are not globally applicable across platforms. Use an appropriate local clock.")
    public static /* synthetic */ void getDefaultMonotonicFrameClock$annotations() {
    }

    public static final void logError(@NotNull String message, @NotNull Throwable e2) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(e2, "e");
        Log.e(LogTag, message, e2);
    }
}
