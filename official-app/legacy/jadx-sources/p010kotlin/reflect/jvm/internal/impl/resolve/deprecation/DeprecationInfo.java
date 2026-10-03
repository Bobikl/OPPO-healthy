package p010kotlin.reflect.jvm.internal.impl.resolve.deprecation;

import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public abstract class DeprecationInfo implements Comparable<DeprecationInfo> {
    @NotNull
    public abstract DeprecationLevelValue getDeprecationLevel();

    public abstract boolean getPropagatesToOverrides();

    @Override // java.lang.Comparable
    public int compareTo(@NotNull DeprecationInfo other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int iCompareTo = getDeprecationLevel().compareTo(other.getDeprecationLevel());
        if (iCompareTo == 0 && !getPropagatesToOverrides() && other.getPropagatesToOverrides()) {
            return 1;
        }
        return iCompareTo;
    }
}
