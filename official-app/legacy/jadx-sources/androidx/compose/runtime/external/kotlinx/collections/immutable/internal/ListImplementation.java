package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0002\b\bJ\u001d\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0002\b\nJ%\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0002\b\u000eJ%\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0001¢\u0006\u0002\b\u0014J\u0019\u0010\u0015\u001a\u00020\u00062\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0001¢\u0006\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/ListImplementation;", "", "()V", "checkElementIndex", "", "index", "", "size", "checkElementIndex$runtime_release", "checkPositionIndex", "checkPositionIndex$runtime_release", "checkRangeIndexes", "fromIndex", "toIndex", "checkRangeIndexes$runtime_release", "orderedEquals", "", "c", "", "other", "orderedEquals$runtime_release", "orderedHashCode", "orderedHashCode$runtime_release", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ListImplementation {

    @NotNull
    public static final ListImplementation INSTANCE = new ListImplementation();

    private ListImplementation() {
    }

    @JvmStatic
    public static final void checkElementIndex$runtime_release(int index, int size) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
        }
    }

    @JvmStatic
    public static final void checkPositionIndex$runtime_release(int index, int size) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
        }
    }

    @JvmStatic
    public static final void checkRangeIndexes$runtime_release(int fromIndex, int toIndex, int size) {
        if (fromIndex < 0 || toIndex > size) {
            throw new IndexOutOfBoundsException("fromIndex: " + fromIndex + ", toIndex: " + toIndex + ", size: " + size);
        }
        if (fromIndex <= toIndex) {
            return;
        }
        throw new IllegalArgumentException("fromIndex: " + fromIndex + " > toIndex: " + toIndex);
    }

    @JvmStatic
    public static final boolean orderedEquals$runtime_release(@NotNull Collection<?> c2, @NotNull Collection<?> other) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(other, "other");
        if (c2.size() != other.size()) {
            return false;
        }
        Iterator<?> it = other.iterator();
        Iterator<?> it2 = c2.iterator();
        while (it2.hasNext()) {
            if (!Intrinsics.areEqual(it2.next(), it.next())) {
                return false;
            }
        }
        return true;
    }

    @JvmStatic
    public static final int orderedHashCode$runtime_release(@NotNull Collection<?> c2) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Iterator<?> it = c2.iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }
}
