package p010kotlin.jvm.internal;

import p010kotlin.SinceKotlin;
import p010kotlin.reflect.KCallable;
import p010kotlin.reflect.KProperty2;

/* JADX INFO: loaded from: classes10.dex */
public abstract class PropertyReference2 extends PropertyReference implements KProperty2 {
    public PropertyReference2() {
    }

    @Override // p010kotlin.jvm.internal.CallableReference
    public KCallable computeReflected() {
        return Reflection.property2(this);
    }

    @Override // p010kotlin.reflect.KProperty2
    @SinceKotlin(version = "1.1")
    public Object getDelegate(Object obj, Object obj2) {
        return ((KProperty2) getReflected()).getDelegate(obj, obj2);
    }

    @Override // p010kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }

    @SinceKotlin(version = "1.4")
    public PropertyReference2(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    @Override // p010kotlin.reflect.KProperty
    public KProperty2.Getter getGetter() {
        return ((KProperty2) getReflected()).getGetter();
    }
}
