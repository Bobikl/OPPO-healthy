package p010kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Member;
import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionReference;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Reflection;
import p010kotlin.reflect.KDeclarationContainer;

/* JADX INFO: loaded from: classes11.dex */
public /* synthetic */ class ReflectJavaClass$fields$1 extends FunctionReference implements Function1<Member, Boolean> {
    public static final ReflectJavaClass$fields$1 INSTANCE = new ReflectJavaClass$fields$1();

    public ReflectJavaClass$fields$1() {
        super(1);
    }

    @Override // p010kotlin.jvm.internal.CallableReference, p010kotlin.reflect.KCallable
    @NotNull
    public final String getName() {
        return "isSynthetic";
    }

    @Override // p010kotlin.jvm.internal.CallableReference
    @NotNull
    public final KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(Member.class);
    }

    @Override // p010kotlin.jvm.internal.CallableReference
    @NotNull
    public final String getSignature() {
        return "isSynthetic()Z";
    }

    @Override // p010kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull Member p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Boolean.valueOf(p0.isSynthetic());
    }
}
