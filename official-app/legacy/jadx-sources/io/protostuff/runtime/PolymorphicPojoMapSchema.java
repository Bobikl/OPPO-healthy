package io.protostuff.runtime;

import io.protostuff.GraphInput;
import io.protostuff.Input;
import io.protostuff.Output;
import io.protostuff.Pipe;
import io.protostuff.Schema;
import io.protostuff.StatefulOutput;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class PolymorphicPojoMapSchema extends PolymorphicSchema {
    protected final Pipe.Schema<Object> pipeSchema;

    public PolymorphicPojoMapSchema(IdStrategy idStrategy) {
        super(idStrategy);
        this.pipeSchema = new Pipe.Schema<Object>(this) { // from class: io.protostuff.runtime.PolymorphicPojoMapSchema.1
            @Override // io.protostuff.Pipe.Schema
            public void transfer(Pipe pipe, Input input, Output output) throws IOException {
                PolymorphicPojoMapSchema.transferObject(this, pipe, input, output, PolymorphicPojoMapSchema.this.strategy);
            }
        };
    }

    public static Object readObjectFrom(Input input, Schema<?> schema, Object obj, IdStrategy idStrategy) throws IOException {
        int fieldNumber = input.readFieldNumber(schema);
        return fieldNumber != 127 ? PolymorphicMapSchema.readObjectFrom(input, schema, obj, idStrategy, fieldNumber) : readObjectFrom(input, schema, obj, idStrategy, fieldNumber);
    }

    public static void transferObject(Pipe.Schema<Object> schema, Pipe pipe, Input input, Output output, IdStrategy idStrategy) throws IOException {
        int fieldNumber = input.readFieldNumber(schema.wrappedSchema);
        if (fieldNumber != 127) {
            PolymorphicMapSchema.transferObject(schema, pipe, input, output, idStrategy, fieldNumber);
        } else {
            transferObject(schema, pipe, input, output, idStrategy, fieldNumber);
        }
    }

    public static void writeObjectTo(Output output, Object obj, Schema<?> schema, IdStrategy idStrategy) throws IOException {
        HasSchema hasSchemaTryWritePojoIdTo = idStrategy.tryWritePojoIdTo(output, 127, obj.getClass(), true);
        if (hasSchemaTryWritePojoIdTo == null) {
            PolymorphicMapSchema.writeObjectTo(output, obj, schema, idStrategy);
            return;
        }
        Schema<?> schema2 = hasSchemaTryWritePojoIdTo.getSchema();
        if (output instanceof StatefulOutput) {
            ((StatefulOutput) output).updateLast(schema2, schema);
        }
        schema2.writeTo(output, obj);
    }

    @Override // io.protostuff.Schema
    public String getFieldName(int i) {
        if (i == 127) {
            return "_";
        }
        return null;
    }

    @Override // io.protostuff.Schema
    public int getFieldNumber(String str) {
        if (str.length() != 1) {
            return 0;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == '_') {
            return 127;
        }
        return PolymorphicMapSchema.number(cCharAt);
    }

    @Override // io.protostuff.runtime.PolymorphicSchema
    public Pipe.Schema<Object> getPipeSchema() {
        return this.pipeSchema;
    }

    @Override // io.protostuff.runtime.PolymorphicSchema, io.protostuff.Schema
    public boolean isInitialized(Object obj) {
        return true;
    }

    @Override // io.protostuff.Schema
    public void mergeFrom(Input input, Object obj) throws IOException {
        setValue(readObjectFrom(input, this, obj, this.strategy), obj);
    }

    @Override // io.protostuff.Schema
    public String messageFullName() {
        return Object.class.getName();
    }

    @Override // io.protostuff.Schema
    public String messageName() {
        return Object.class.getSimpleName();
    }

    @Override // io.protostuff.runtime.PolymorphicSchema, io.protostuff.Schema
    public Object newMessage() {
        throw new UnsupportedOperationException();
    }

    @Override // io.protostuff.runtime.PolymorphicSchema, io.protostuff.Schema
    public Class<? super Object> typeClass() {
        return Object.class;
    }

    @Override // io.protostuff.Schema
    public void writeTo(Output output, Object obj) throws IOException {
        writeObjectTo(output, obj, this, this.strategy);
    }

    public static Object readObjectFrom(Input input, Schema<?> schema, Object obj, IdStrategy idStrategy, int i) throws IOException {
        Schema schema2 = idStrategy.resolvePojoFrom(input, i).getSchema();
        Object objNewMessage = schema2.newMessage();
        if (input instanceof GraphInput) {
            ((GraphInput) input).updateLast(objNewMessage, obj);
        }
        schema2.mergeFrom(input, objNewMessage);
        return objNewMessage;
    }

    public static void transferObject(Pipe.Schema<Object> schema, Pipe pipe, Input input, Output output, IdStrategy idStrategy, int i) throws IOException {
        Pipe.Schema pipeSchema = idStrategy.transferPojoId(input, output, i).getPipeSchema();
        if (output instanceof StatefulOutput) {
            ((StatefulOutput) output).updateLast(pipeSchema, schema);
        }
        Pipe.transferDirect(pipeSchema, pipe, input, output);
    }
}
