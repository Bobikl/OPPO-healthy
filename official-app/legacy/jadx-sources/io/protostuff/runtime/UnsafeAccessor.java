package io.protostuff.runtime;

/* JADX INFO: loaded from: classes10.dex */
public final class UnsafeAccessor extends Accessor {
    static final Accessor.Factory FACTORY = new Accessor.Factory() { // from class: io.protostuff.runtime.UnsafeAccessor.1
        @Override // io.protostuff.runtime.Accessor.Factory
        public Accessor create(java.lang.reflect.Field field) {
            return new UnsafeAccessor(field);
        }
    };
    public final long offset;

    public UnsafeAccessor(java.lang.reflect.Field field) {
        super(field);
        this.offset = RuntimeUnsafeFieldFactory.us.objectFieldOffset(field);
    }

    @Override // io.protostuff.runtime.Accessor
    public <T> T get(Object obj) {
        return (T) RuntimeUnsafeFieldFactory.us.getObject(obj, this.offset);
    }

    @Override // io.protostuff.runtime.Accessor
    public void set(Object obj, Object obj2) {
        RuntimeUnsafeFieldFactory.us.putObject(obj, this.offset, obj2);
    }
}
