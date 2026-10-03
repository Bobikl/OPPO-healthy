package p010kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import p010kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes11.dex */
public interface VariableDescriptor extends ValueDescriptor {
    @Nullable
    /* JADX INFO: renamed from: getCompileTimeInitializer */
    ConstantValue<?> mo6580getCompileTimeInitializer();

    boolean isConst();

    boolean isLateInit();

    boolean isVar();

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    VariableDescriptor substitute(@NotNull TypeSubstitutor typeSubstitutor);
}
