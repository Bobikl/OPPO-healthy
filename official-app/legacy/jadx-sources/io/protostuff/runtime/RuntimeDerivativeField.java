package io.protostuff.runtime;

import io.protostuff.Input;
import io.protostuff.Schema;
import io.protostuff.Tag;
import io.protostuff.WireFormat;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
abstract class RuntimeDerivativeField<T> extends Field<T> {
    public final DerivativeSchema schema;
    public final Class<Object> typeClass;

    public RuntimeDerivativeField(Class<Object> cls, WireFormat.FieldType fieldType, int i, String str, boolean z, Tag tag, IdStrategy idStrategy) {
        super(fieldType, i, str, z, tag);
        this.typeClass = cls;
        this.schema = new DerivativeSchema(idStrategy) { // from class: io.protostuff.runtime.RuntimeDerivativeField.1
            @Override // io.protostuff.runtime.DerivativeSchema
            public void doMergeFrom(Input input, Schema<Object> schema, Object obj) throws IOException {
                RuntimeDerivativeField.this.doMergeFrom(input, schema, obj);
            }
        };
    }

    public abstract void doMergeFrom(Input input, Schema<Object> schema, Object obj) throws IOException;
}
