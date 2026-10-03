package io.protostuff.runtime;

import io.protostuff.Tag;
import io.protostuff.WireFormat;

/* JADX INFO: loaded from: classes10.dex */
abstract class RuntimeObjectField<T> extends Field<T> implements PolymorphicSchema.Handler {
    public final PolymorphicSchema schema;

    public RuntimeObjectField(Class<?> cls, WireFormat.FieldType fieldType, int i, String str, boolean z, Tag tag, PolymorphicSchema.Factory factory, IdStrategy idStrategy) {
        super(fieldType, i, str, z, tag);
        this.schema = factory.newSchema(cls, idStrategy, this);
    }
}
