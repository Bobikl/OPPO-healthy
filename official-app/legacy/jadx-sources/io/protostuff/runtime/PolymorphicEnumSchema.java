package io.protostuff.runtime;

import io.protostuff.GraphInput;
import io.protostuff.Input;
import io.protostuff.Output;
import io.protostuff.Pipe;
import io.protostuff.ProtostuffException;
import io.protostuff.Schema;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class PolymorphicEnumSchema extends PolymorphicSchema {
    static final int ID_ENUM_VALUE = 1;
    static final String STR_ENUM_VALUE = "a";
    protected final Pipe.Schema<Object> pipeSchema;

    public PolymorphicEnumSchema(IdStrategy idStrategy) {
        super(idStrategy);
        this.pipeSchema = new Pipe.Schema<Object>(this) { // from class: io.protostuff.runtime.PolymorphicEnumSchema.1
            @Override // io.protostuff.Pipe.Schema
            public void transfer(Pipe pipe, Input input, Output output) throws IOException {
                PolymorphicEnumSchema.transferObject(this, pipe, input, output, PolymorphicEnumSchema.this.strategy);
            }
        };
    }

    public static String name(int i) {
        if (i == 1) {
            return STR_ENUM_VALUE;
        }
        if (i != 24) {
            return null;
        }
        return "x";
    }

    public static int number(String str) {
        if (str.length() != 1) {
            return 0;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt != 'a') {
            return cCharAt != 'x' ? 0 : 24;
        }
        return 1;
    }

    public static Object readObjectFrom(Input input, Schema<?> schema, Object obj, IdStrategy idStrategy) throws IOException {
        if (24 != input.readFieldNumber(schema)) {
            throw new ProtostuffException("Corrupt input.");
        }
        EnumIO<?> enumIOResolveEnumFrom = idStrategy.resolveEnumFrom(input);
        if (1 != input.readFieldNumber(schema)) {
            throw new ProtostuffException("Corrupt input.");
        }
        Enum from = enumIOResolveEnumFrom.readFrom(input);
        if (input instanceof GraphInput) {
            ((GraphInput) input).updateLast(from, obj);
        }
        if (input.readFieldNumber(schema) == 0) {
            return from;
        }
        throw new ProtostuffException("Corrupt input.");
    }

    public static void transferObject(Pipe.Schema<Object> schema, Pipe pipe, Input input, Output output, IdStrategy idStrategy) throws IOException {
        if (24 != input.readFieldNumber(schema.wrappedSchema)) {
            throw new ProtostuffException("Corrupt input.");
        }
        idStrategy.transferEnumId(input, output, 24);
        if (1 != input.readFieldNumber(schema.wrappedSchema)) {
            throw new ProtostuffException("Corrupt input.");
        }
        EnumIO.transfer(pipe, input, output, 1, false, idStrategy);
        if (input.readFieldNumber(schema.wrappedSchema) != 0) {
            throw new ProtostuffException("Corrupt input.");
        }
    }

    public static void writeObjectTo(Output output, Object obj, Schema<?> schema, IdStrategy idStrategy) throws IOException {
        Class<?> cls = obj.getClass();
        if (cls.getSuperclass() == null || !cls.getSuperclass().isEnum()) {
            EnumIO<? extends Enum<?>> enumIO = idStrategy.getEnumIO(cls);
            idStrategy.writeEnumIdTo(output, 24, cls);
            enumIO.writeTo(output, 1, false, (Enum) obj);
        } else {
            EnumIO<? extends Enum<?>> enumIO2 = idStrategy.getEnumIO(cls.getSuperclass());
            idStrategy.writeEnumIdTo(output, 24, cls.getSuperclass());
            enumIO2.writeTo(output, 1, false, (Enum) obj);
        }
    }

    @Override // io.protostuff.Schema
    public String getFieldName(int i) {
        return name(i);
    }

    @Override // io.protostuff.Schema
    public int getFieldNumber(String str) {
        return number(str);
    }

    @Override // io.protostuff.runtime.PolymorphicSchema
    public Pipe.Schema<Object> getPipeSchema() {
        return this.pipeSchema;
    }

    @Override // io.protostuff.Schema
    public void mergeFrom(Input input, Object obj) throws IOException {
        setValue(readObjectFrom(input, this, obj, this.strategy), obj);
    }

    @Override // io.protostuff.Schema
    public String messageFullName() {
        return Enum.class.getName();
    }

    @Override // io.protostuff.Schema
    public String messageName() {
        return Enum.class.getSimpleName();
    }

    @Override // io.protostuff.Schema
    public void writeTo(Output output, Object obj) throws IOException {
        writeObjectTo(output, obj, this, this.strategy);
    }
}
