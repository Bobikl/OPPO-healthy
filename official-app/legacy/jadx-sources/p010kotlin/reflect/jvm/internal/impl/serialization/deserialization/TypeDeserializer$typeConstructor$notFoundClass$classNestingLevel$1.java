package p010kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionReference;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Reflection;
import p010kotlin.reflect.KDeclarationContainer;
import p010kotlin.reflect.jvm.internal.impl.name.ClassId;

/* JADX INFO: loaded from: classes11.dex */
public /* synthetic */ class TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1 extends FunctionReference implements Function1<ClassId, ClassId> {
    public static final TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1 INSTANCE = new TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1();

    public TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1() {
        super(1);
    }

    @Override // p010kotlin.jvm.internal.CallableReference, p010kotlin.reflect.KCallable
    @NotNull
    public final String getName() {
        return "getOuterClassId";
    }

    @Override // p010kotlin.jvm.internal.CallableReference
    @NotNull
    public final KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(ClassId.class);
    }

    @Override // p010kotlin.jvm.internal.CallableReference
    @NotNull
    public final String getSignature() {
        return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
    }

    @Override // p010kotlin.jvm.functions.Function1
    @Nullable
    public final ClassId invoke(@NotNull ClassId p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return p0.getOuterClassId();
    }
}
