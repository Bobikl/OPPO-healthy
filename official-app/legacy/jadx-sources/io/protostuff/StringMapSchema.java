package io.protostuff;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public class StringMapSchema<V> extends MapSchema<String, V> {
    public static final StringMapSchema<String> VALUE_STRING = new StringMapSchema<String>(null) { // from class: io.protostuff.StringMapSchema.1
        @Override // io.protostuff.StringMapSchema, io.protostuff.MapSchema
        public /* bridge */ /* synthetic */ void putValueFrom(Input input, MapSchema.MapWrapper mapWrapper, String str) throws IOException {
            putValueFrom(input, (MapSchema.MapWrapper<String, String>) mapWrapper, str);
        }

        @Override // io.protostuff.StringMapSchema, io.protostuff.MapSchema
        public /* bridge */ /* synthetic */ String readKeyFrom(Input input, MapSchema.MapWrapper mapWrapper) throws IOException {
            return super.readKeyFrom(input, mapWrapper);
        }

        @Override // io.protostuff.StringMapSchema, io.protostuff.MapSchema
        public void transferValue(Pipe pipe, Input input, Output output, int i, boolean z) throws IOException {
            input.transferByteRangeTo(output, true, i, z);
        }

        @Override // io.protostuff.StringMapSchema, io.protostuff.MapSchema
        public /* bridge */ /* synthetic */ void writeKeyTo(Output output, int i, String str, boolean z) throws IOException {
            super.writeKeyTo(output, i, str, z);
        }

        @Override // io.protostuff.StringMapSchema
        public void putValueFrom(Input input, MapSchema.MapWrapper<String, String> mapWrapper, String str) throws IOException {
            mapWrapper.put(str, input.readString());
        }

        @Override // io.protostuff.StringMapSchema, io.protostuff.MapSchema
        public void writeValueTo(Output output, int i, String str, boolean z) throws IOException {
            output.writeString(i, str, z);
        }
    };
    public final Pipe.Schema<V> vPipeSchema;
    public final Schema<V> vSchema;

    public StringMapSchema(Schema<V> schema) {
        this(schema, null);
    }

    @Override // io.protostuff.MapSchema
    public void transferKey(Pipe pipe, Input input, Output output, int i, boolean z) throws IOException {
        input.transferByteRangeTo(output, true, i, z);
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
    public void writeValueTo(Output output, int i, V v, boolean z) throws IOException {
        output.writeObject(i, v, this.vSchema, z);
    }

    public StringMapSchema(Schema<V> schema, Pipe.Schema<V> schema2) {
        this.vSchema = schema;
        this.vPipeSchema = schema2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.protostuff.MapSchema
    public void putValueFrom(Input input, MapSchema.MapWrapper<String, V> mapWrapper, String str) throws IOException {
        mapWrapper.put(str, input.mergeObject(null, this.vSchema));
    }

    @Override // io.protostuff.MapSchema
    public final String readKeyFrom(Input input, MapSchema.MapWrapper<String, V> mapWrapper) throws IOException {
        return input.readString();
    }

    @Override // io.protostuff.MapSchema
    public final void writeKeyTo(Output output, int i, String str, boolean z) throws IOException {
        output.writeString(i, str, z);
    }
}
