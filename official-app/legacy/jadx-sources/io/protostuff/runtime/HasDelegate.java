package io.protostuff.runtime;

/* JADX INFO: loaded from: classes10.dex */
public class HasDelegate<T> implements PolymorphicSchema.Factory {
    public final Delegate<T> delegate;
    public final ArraySchemas.Base genericElementSchema;
    public final IdStrategy strategy;

    public HasDelegate(Delegate<T> delegate, IdStrategy idStrategy) {
        this.delegate = delegate;
        this.strategy = idStrategy;
        this.genericElementSchema = new ArraySchemas.DelegateArray(idStrategy, null, delegate);
    }

    public final Delegate<T> getDelegate() {
        return this.delegate;
    }

    @Override // io.protostuff.runtime.PolymorphicSchema.Factory
    public final PolymorphicSchema newSchema(Class<?> cls, IdStrategy idStrategy, PolymorphicSchema.Handler handler) {
        return new ArraySchemas.DelegateArray(idStrategy, handler, this.delegate);
    }
}
