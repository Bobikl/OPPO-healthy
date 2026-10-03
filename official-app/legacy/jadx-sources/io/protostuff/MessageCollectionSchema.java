package io.protostuff;

import java.io.IOException;
import java.util.Collection;

/* JADX INFO: loaded from: classes10.dex */
public final class MessageCollectionSchema<V> extends CollectionSchema<V> {
    public final Pipe.Schema<V> pipeSchema;
    public final Schema<V> schema;

    public MessageCollectionSchema(Schema<V> schema) {
        this(schema, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.protostuff.CollectionSchema
    public void addValueFrom(Input input, Collection<V> collection) throws IOException {
        collection.add(input.mergeObject(null, this.schema));
    }

    @Override // io.protostuff.CollectionSchema
    public void transferValue(Pipe pipe, Input input, Output output, int i, boolean z) throws IOException {
        Pipe.Schema<V> schema = this.pipeSchema;
        if (schema != null) {
            output.writeObject(i, pipe, schema, z);
            return;
        }
        throw new RuntimeException("No pipe schema for value: " + this.schema.typeClass().getName());
    }

    @Override // io.protostuff.CollectionSchema
    public void writeValueTo(Output output, int i, V v, boolean z) throws IOException {
        output.writeObject(i, v, this.schema, z);
    }

    public MessageCollectionSchema(Schema<V> schema, Pipe.Schema<V> schema2) {
        this.schema = schema;
        this.pipeSchema = schema2;
    }
}
