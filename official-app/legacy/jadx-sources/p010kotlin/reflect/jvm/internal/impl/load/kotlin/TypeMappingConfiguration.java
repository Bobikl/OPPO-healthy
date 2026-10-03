package p010kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p010kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes11.dex */
public interface TypeMappingConfiguration<T> {
    @NotNull
    KotlinType commonSupertype(@NotNull Collection<KotlinType> collection);

    @Nullable
    String getPredefinedFullInternalNameForClass(@NotNull ClassDescriptor classDescriptor);

    @Nullable
    String getPredefinedInternalNameForClass(@NotNull ClassDescriptor classDescriptor);

    @Nullable
    T getPredefinedTypeForClass(@NotNull ClassDescriptor classDescriptor);

    @Nullable
    KotlinType preprocessType(@NotNull KotlinType kotlinType);

    void processErrorType(@NotNull KotlinType kotlinType, @NotNull ClassDescriptor classDescriptor);
}
