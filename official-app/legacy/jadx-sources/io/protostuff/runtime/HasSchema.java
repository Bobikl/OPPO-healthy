package io.protostuff.runtime;

import io.protostuff.Pipe;
import io.protostuff.Schema;

/* JADX INFO: loaded from: classes10.dex */
public abstract class HasSchema<T> implements PolymorphicSchema.Factory {
    public final ArraySchemas.Base genericElementSchema;
    public final IdStrategy strategy;

    public HasSchema(IdStrategy idStrategy) {
        this.strategy = idStrategy;
        this.genericElementSchema = new ArraySchemas.PojoArray(idStrategy, ArraySchemas.GENERIC_HANDLER, this);
    }

    public abstract Pipe.Schema<T> getPipeSchema();

    public abstract Schema<T> getSchema();

    @Override // io.protostuff.runtime.PolymorphicSchema.Factory
    public PolymorphicSchema newSchema(Class<?> cls, IdStrategy idStrategy, PolymorphicSchema.Handler handler) {
        return new ArraySchemas.PojoArray(idStrategy, handler, this);
    }
}
