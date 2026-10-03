package p010kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import p010kotlin.reflect.jvm.internal.impl.name.ClassId;

/* JADX INFO: loaded from: classes11.dex */
public interface JavaModuleAnnotationsProvider {
    @Nullable
    List<JavaAnnotation> getAnnotationsForModuleOwnerOfClass(@NotNull ClassId classId);
}
