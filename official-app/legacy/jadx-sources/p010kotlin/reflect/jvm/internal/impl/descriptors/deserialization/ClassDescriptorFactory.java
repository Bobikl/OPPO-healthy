package p010kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p010kotlin.reflect.jvm.internal.impl.name.ClassId;
import p010kotlin.reflect.jvm.internal.impl.name.FqName;
import p010kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes11.dex */
public interface ClassDescriptorFactory {
    @Nullable
    ClassDescriptor createClass(@NotNull ClassId classId);

    @NotNull
    Collection<ClassDescriptor> getAllContributedClassesIfPossible(@NotNull FqName fqName);

    boolean shouldCreateClass(@NotNull FqName fqName, @NotNull Name name);
}
