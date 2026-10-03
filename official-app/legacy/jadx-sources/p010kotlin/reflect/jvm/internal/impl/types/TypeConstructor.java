package p010kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p010kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p010kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p010kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p010kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
public interface TypeConstructor extends TypeConstructorMarker {
    @NotNull
    KotlinBuiltIns getBuiltIns();

    @Nullable
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    ClassifierDescriptor mo6584getDeclarationDescriptor();

    @NotNull
    List<TypeParameterDescriptor> getParameters();

    @NotNull
    /* JADX INFO: renamed from: getSupertypes */
    Collection<KotlinType> mo6585getSupertypes();

    boolean isDenotable();

    @NotNull
    TypeConstructor refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner);
}
