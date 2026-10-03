package p010kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Constructor;
import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionReference;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Reflection;
import p010kotlin.reflect.KDeclarationContainer;

/* JADX INFO: loaded from: classes11.dex */
public /* synthetic */ class ReflectJavaClass$constructors$2 extends FunctionReference implements Function1<Constructor<?>, ReflectJavaConstructor> {
    public static final ReflectJavaClass$constructors$2 INSTANCE = new ReflectJavaClass$constructors$2();

    public ReflectJavaClass$constructors$2() {
        super(1);
    }

    @Override // p010kotlin.jvm.internal.CallableReference, p010kotlin.reflect.KCallable
    @NotNull
    public final String getName() {
        return "<init>";
    }

    @Override // p010kotlin.jvm.internal.CallableReference
    @NotNull
    public final KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(ReflectJavaConstructor.class);
    }

    @Override // p010kotlin.jvm.internal.CallableReference
    @NotNull
    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Constructor;)V";
    }

    @Override // p010kotlin.jvm.functions.Function1
    @NotNull
    public final ReflectJavaConstructor invoke(@NotNull Constructor<?> p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new ReflectJavaConstructor(p0);
    }
}
