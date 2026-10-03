package p010kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ArrayMap<T> implements Iterable<T>, KMappedMarker {
    private ArrayMap() {
    }

    public /* synthetic */ ArrayMap(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public abstract T get(int i);

    public abstract int getSize();

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract void set(int i, @NotNull T t);
}
