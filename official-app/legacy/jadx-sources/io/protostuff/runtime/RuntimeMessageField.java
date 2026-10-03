package io.protostuff.runtime;

import io.protostuff.Pipe;
import io.protostuff.Schema;
import io.protostuff.Tag;
import io.protostuff.WireFormat;

/* JADX INFO: loaded from: classes10.dex */
abstract class RuntimeMessageField<T, P> extends Field<T> {
    final HasSchema<P> hasSchema;
    public final Class<P> typeClass;

    public RuntimeMessageField(Class<P> cls, HasSchema<P> hasSchema, WireFormat.FieldType fieldType, int i, String str, boolean z, Tag tag) {
        super(fieldType, i, str, z, tag);
        this.typeClass = cls;
        this.hasSchema = hasSchema;
    }

    public Pipe.Schema<P> getPipeSchema() {
        return this.hasSchema.getPipeSchema();
    }

    public Schema<P> getSchema() {
        return this.hasSchema.getSchema();
    }
}
