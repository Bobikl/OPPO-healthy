package io.protostuff.runtime;

import io.protostuff.Input;
import io.protostuff.MapSchema;
import io.protostuff.Output;
import io.protostuff.Pipe;
import io.protostuff.Tag;
import io.protostuff.WireFormat;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
abstract class RuntimeMapField<T, K, V> extends Field<T> {
    protected final MapSchema<K, V> schema;

    public RuntimeMapField(WireFormat.FieldType fieldType, int i, String str, Tag tag, MapSchema.MessageFactory messageFactory) {
        super(fieldType, i, str, false, tag);
        this.schema = new MapSchema<K, V>(messageFactory) { // from class: io.protostuff.runtime.RuntimeMapField.1
            @Override // io.protostuff.MapSchema
            public void putValueFrom(Input input, MapSchema.MapWrapper<K, V> mapWrapper, K k) throws IOException {
                RuntimeMapField.this.vPutFrom(input, mapWrapper, k);
            }

            @Override // io.protostuff.MapSchema
            public K readKeyFrom(Input input, MapSchema.MapWrapper<K, V> mapWrapper) throws IOException {
                return (K) RuntimeMapField.this.kFrom(input, mapWrapper);
            }

            @Override // io.protostuff.MapSchema
            public void transferKey(Pipe pipe, Input input, Output output, int i2, boolean z) throws IOException {
                RuntimeMapField.this.kTransfer(pipe, input, output, i2, z);
            }

            @Override // io.protostuff.MapSchema
            public void transferValue(Pipe pipe, Input input, Output output, int i2, boolean z) throws IOException {
                RuntimeMapField.this.vTransfer(pipe, input, output, i2, z);
            }

            @Override // io.protostuff.MapSchema
            public void writeKeyTo(Output output, int i2, K k, boolean z) throws IOException {
                RuntimeMapField.this.kTo(output, i2, k, z);
            }

            @Override // io.protostuff.MapSchema
            public void writeValueTo(Output output, int i2, V v, boolean z) throws IOException {
                RuntimeMapField.this.vTo(output, i2, v, z);
            }
        };
    }

    public abstract K kFrom(Input input, MapSchema.MapWrapper<K, V> mapWrapper) throws IOException;

    public abstract void kTo(Output output, int i, K k, boolean z) throws IOException;

    public abstract void kTransfer(Pipe pipe, Input input, Output output, int i, boolean z) throws IOException;

    public abstract void vPutFrom(Input input, MapSchema.MapWrapper<K, V> mapWrapper, K k) throws IOException;

    public abstract void vTo(Output output, int i, V v, boolean z) throws IOException;

    public abstract void vTransfer(Pipe pipe, Input input, Output output, int i, boolean z) throws IOException;
}
