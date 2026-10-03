package io.protostuff.runtime;

import io.protostuff.Pipe;
import io.protostuff.Schema;

/* JADX INFO: loaded from: classes10.dex */
public abstract class PolymorphicSchema implements Schema<Object> {
    public final IdStrategy strategy;

    public interface Factory {
        PolymorphicSchema newSchema(Class<?> cls, IdStrategy idStrategy, Handler handler);
    }

    public interface Handler {
        void setValue(Object obj, Object obj2);
    }

    public PolymorphicSchema(IdStrategy idStrategy) {
        this.strategy = idStrategy;
    }

    public abstract Pipe.Schema<Object> getPipeSchema();

    @Override // io.protostuff.Schema
    public boolean isInitialized(Object obj) {
        return true;
    }

    @Override // io.protostuff.Schema
    public Object newMessage() {
        throw new UnsupportedOperationException();
    }

    public abstract void setValue(Object obj, Object obj2);

    @Override // io.protostuff.Schema
    public Class<? super Object> typeClass() {
        return Object.class;
    }
}
