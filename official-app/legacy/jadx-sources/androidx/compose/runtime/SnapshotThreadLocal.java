package androidx.compose.runtime;

import androidx.compose.runtime.internal.ThreadMap;
import androidx.compose.runtime.internal.ThreadMapKt;
import androidx.exifinterface.media.ExifInterface;
import com.oplus.smartenginehelper.ParserTag;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\r\u0010\t\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\nJ\u0015\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u000eR\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/SnapshotThreadLocal;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "map", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/internal/ThreadMap;", "Landroidx/compose/runtime/AtomicReference;", "writeMutex", ParserTag.TAG_GET, "()Ljava/lang/Object;", "set", "", "value", "(Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nActualJvm.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActualJvm.jvm.kt\nandroidx/compose/runtime/SnapshotThreadLocal\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,116:1\n70#2:117\n*S KotlinDebug\n*F\n+ 1 ActualJvm.jvm.kt\nandroidx/compose/runtime/SnapshotThreadLocal\n*L\n58#1:117\n*E\n"})
public final class SnapshotThreadLocal<T> {

    @NotNull
    private final AtomicReference<ThreadMap> map = new AtomicReference<>(ThreadMapKt.getEmptyThreadMap());

    @NotNull
    private final Object writeMutex = new Object();

    @Nullable
    public final T get() {
        return (T) this.map.get().get(Thread.currentThread().getId());
    }

    public final void set(@Nullable T value) {
        long id = Thread.currentThread().getId();
        synchronized (this.writeMutex) {
            ThreadMap threadMap = this.map.get();
            if (threadMap.trySet(id, value)) {
                return;
            }
            this.map.set(threadMap.newWith(id, value));
            Unit unit = Unit.INSTANCE;
        }
    }
}
