package io.protostuff.runtime;

/* JADX INFO: loaded from: classes10.dex */
public final class ReflectAccessor extends Accessor {
    static final Accessor.Factory FACTORY = new Accessor.Factory() { // from class: io.protostuff.runtime.ReflectAccessor.1
        @Override // io.protostuff.runtime.Accessor.Factory
        public Accessor create(java.lang.reflect.Field field) {
            return new ReflectAccessor(field);
        }
    };

    public ReflectAccessor(java.lang.reflect.Field field) {
        super(field);
        field.setAccessible(true);
    }

    @Override // io.protostuff.runtime.Accessor
    public <T> T get(Object obj) {
        try {
            return (T) this.f.get(obj);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (IllegalArgumentException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // io.protostuff.runtime.Accessor
    public void set(Object obj, Object obj2) {
        try {
            this.f.set(obj, obj2);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (IllegalArgumentException e3) {
            throw new RuntimeException(e3);
        }
    }
}
