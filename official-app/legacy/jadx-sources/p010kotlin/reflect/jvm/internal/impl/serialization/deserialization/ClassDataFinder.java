package p010kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.reflect.jvm.internal.impl.name.ClassId;

/* JADX INFO: loaded from: classes11.dex */
public interface ClassDataFinder {
    @Nullable
    ClassData findClassData(@NotNull ClassId classId);
}
