package io.protostuff.runtime;

import io.protostuff.CollectionSchema;
import io.protostuff.Input;
import io.protostuff.Output;
import io.protostuff.Pipe;
import io.protostuff.Tag;
import io.protostuff.WireFormat;
import java.io.IOException;
import java.util.Collection;

/* JADX INFO: loaded from: classes10.dex */
abstract class RuntimeCollectionField<T, V> extends Field<T> {
    protected final CollectionSchema<V> schema;

    public RuntimeCollectionField(WireFormat.FieldType fieldType, int i, String str, Tag tag, CollectionSchema.MessageFactory messageFactory) {
        super(fieldType, i, str, false, tag);
        this.schema = new CollectionSchema<V>(messageFactory) { // from class: io.protostuff.runtime.RuntimeCollectionField.1
            @Override // io.protostuff.CollectionSchema
            public void addValueFrom(Input input, Collection<V> collection) throws IOException {
                RuntimeCollectionField.this.addValueFrom(input, collection);
            }

            @Override // io.protostuff.CollectionSchema
            public void transferValue(Pipe pipe, Input input, Output output, int i2, boolean z) throws IOException {
                RuntimeCollectionField.this.transferValue(pipe, input, output, i2, z);
            }

            @Override // io.protostuff.CollectionSchema
            public void writeValueTo(Output output, int i2, V v, boolean z) throws IOException {
                RuntimeCollectionField.this.writeValueTo(output, i2, v, z);
            }
        };
    }

    public abstract void addValueFrom(Input input, Collection<V> collection) throws IOException;

    public abstract void transferValue(Pipe pipe, Input input, Output output, int i, boolean z) throws IOException;

    public abstract void writeValueTo(Output output, int i, V v, boolean z) throws IOException;
}
