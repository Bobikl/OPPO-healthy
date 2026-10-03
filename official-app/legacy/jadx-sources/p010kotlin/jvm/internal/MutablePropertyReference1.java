package p010kotlin.jvm.internal;

import p010kotlin.SinceKotlin;
import p010kotlin.reflect.KCallable;
import p010kotlin.reflect.KMutableProperty1;
import p010kotlin.reflect.KProperty1;

/* JADX INFO: loaded from: classes10.dex */
public abstract class MutablePropertyReference1 extends MutablePropertyReference implements KMutableProperty1 {
    public MutablePropertyReference1() {
    }

    @Override // p010kotlin.jvm.internal.CallableReference
    public KCallable computeReflected() {
        return Reflection.mutableProperty1(this);
    }

    @Override // p010kotlin.reflect.KProperty1
    @SinceKotlin(version = "1.1")
    public Object getDelegate(Object obj) {
        return ((KMutableProperty1) getReflected()).getDelegate(obj);
    }

    @Override // p010kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    @SinceKotlin(version = "1.1")
    public MutablePropertyReference1(Object obj) {
        super(obj);
    }

    @Override // p010kotlin.reflect.KProperty
    public KProperty1.Getter getGetter() {
        return ((KMutableProperty1) getReflected()).getGetter();
    }

    @Override // p010kotlin.reflect.KMutableProperty
    public KMutableProperty1.Setter getSetter() {
        return ((KMutableProperty1) getReflected()).getSetter();
    }

    @SinceKotlin(version = "1.4")
    public MutablePropertyReference1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
