package io.protostuff;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class MessageMapSchema<K, V> extends MapSchema<K, V> {
    public final Pipe.Schema<K> kPipeSchema;
    public final Schema<K> kSchema;
    public final Pipe.Schema<V> vPipeSchema;
    public final Schema<V> vSchema;

    public MessageMapSchema(Schema<K> schema, Schema<V> schema2) {
        this(schema, schema2, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.protostuff.MapSchema
    public void putValueFrom(Input input, MapSchema.MapWrapper<K, V> mapWrapper, K k) throws IOException {
        mapWrapper.put(k, input.mergeObject(null, this.vSchema));
    }

    @Override // io.protostuff.MapSchema
    public K readKeyFrom(Input input, MapSchema.MapWrapper<K, V> mapWrapper) throws IOException {
        return (K) input.mergeObject(null, this.kSchema);
    }

    @Override // io.protostuff.MapSchema
    public void transferKey(Pipe pipe, Input input, Output output, int i, boolean z) throws IOException {
        Pipe.Schema<K> schema = this.kPipeSchema;
        if (schema != null) {
            output.writeObject(i, pipe, schema, z);
            return;
        }
        throw new RuntimeException("No pipe schema for key: " + this.kSchema.typeClass().getName());
    }

    @Override // io.protostuff.MapSchema
    public void transferValue(Pipe pipe, Input input, Output output, int i, boolean z) throws IOException {
        Pipe.Schema<V> schema = this.vPipeSchema;
        if (schema != null) {
            output.writeObject(i, pipe, schema, z);
            return;
        }
        throw new RuntimeException("No pipe schema for value: " + this.vSchema.typeClass().getName());
    }

    @Override // io.protostuff.MapSchema
    public void writeKeyTo(Output output, int i, K k, boolean z) throws IOException {
        output.writeObject(i, k, this.kSchema, z);
    }

    @Override // io.protostuff.MapSchema
    public void writeValueTo(Output output, int i, V v, boolean z) throws IOException {
        output.writeObject(i, v, this.vSchema, z);
    }

    public MessageMapSchema(Schema<K> schema, Schema<V> schema2, Pipe.Schema<K> schema3, Pipe.Schema<V> schema4) {
        this.kSchema = schema;
        this.vSchema = schema2;
        this.kPipeSchema = schema3;
        this.vPipeSchema = schema4;
    }
}
