package io.protostuff.runtime;

/* JADX INFO: loaded from: classes10.dex */
public abstract class Accessor {
    public final java.lang.reflect.Field f;

    public interface Factory {
        Accessor create(java.lang.reflect.Field field);
    }

    public Accessor(java.lang.reflect.Field field) {
        this.f = field;
    }

    public abstract <T> T get(Object obj);

    public abstract void set(Object obj, Object obj2);
}
