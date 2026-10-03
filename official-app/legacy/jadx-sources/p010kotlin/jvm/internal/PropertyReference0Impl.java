package p010kotlin.jvm.internal;

import p010kotlin.SinceKotlin;
import p010kotlin.reflect.KClass;
import p010kotlin.reflect.KDeclarationContainer;

/* JADX INFO: loaded from: classes10.dex */
public class PropertyReference0Impl extends PropertyReference0 {
    public PropertyReference0Impl(KDeclarationContainer kDeclarationContainer, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((ClassBasedDeclarationContainer) kDeclarationContainer).getJClass(), str, str2, !(kDeclarationContainer instanceof KClass) ? 1 : 0);
    }

    @Override // p010kotlin.reflect.KProperty0
    public Object get() {
        return getGetter().call(new Object[0]);
    }

    @SinceKotlin(version = "1.4")
    public PropertyReference0Impl(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    @SinceKotlin(version = "1.4")
    public PropertyReference0Impl(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
