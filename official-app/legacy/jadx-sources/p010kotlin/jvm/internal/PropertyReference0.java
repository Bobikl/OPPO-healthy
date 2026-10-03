package p010kotlin.jvm.internal;

import p010kotlin.SinceKotlin;
import p010kotlin.reflect.KCallable;
import p010kotlin.reflect.KProperty0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class PropertyReference0 extends PropertyReference implements KProperty0 {
    public PropertyReference0() {
    }

    @Override // p010kotlin.jvm.internal.CallableReference
    public KCallable computeReflected() {
        return Reflection.property0(this);
    }

    @Override // p010kotlin.reflect.KProperty0
    @SinceKotlin(version = "1.1")
    public Object getDelegate() {
        return ((KProperty0) getReflected()).getDelegate();
    }

    @Override // p010kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }

    @SinceKotlin(version = "1.1")
    public PropertyReference0(Object obj) {
        super(obj);
    }

    @Override // p010kotlin.reflect.KProperty
    public KProperty0.Getter getGetter() {
        return ((KProperty0) getReflected()).getGetter();
    }

    @SinceKotlin(version = "1.4")
    public PropertyReference0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
