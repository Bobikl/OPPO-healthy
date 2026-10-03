package io.protostuff.runtime;

import io.protostuff.GraphInput;
import io.protostuff.Input;
import io.protostuff.Output;
import io.protostuff.Pipe;
import io.protostuff.ProtostuffException;
import io.protostuff.Schema;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ClassSchema extends PolymorphicSchema {
    static final int ID_ARRAY_DIMENSION = 2;
    static final String STR_ARRAY_DIMENSION = "b";
    protected final Pipe.Schema<Object> pipeSchema;

    public ClassSchema(IdStrategy idStrategy) {
        super(idStrategy);
        this.pipeSchema = new Pipe.Schema<Object>(this) { // from class: io.protostuff.runtime.ClassSchema.1
            @Override // io.protostuff.Pipe.Schema
            public void transfer(Pipe pipe, Input input, Output output) throws IOException {
                ClassSchema.transferObject(this, pipe, input, output, ClassSchema.this.strategy);
            }
        };
    }

    public static String name(int i) {
        if (i == 2) {
            return STR_ARRAY_DIMENSION;
        }
        switch (i) {
            case 18:
                return "r";
            case 19:
                return "s";
            case 20:
                return "t";
            case 21:
                return "u";
            default:
                return null;
        }
    }

    public static int number(String str) {
        if (str.length() != 1) {
            return 0;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == 'b') {
            return 2;
        }
        switch (cCharAt) {
            case 'r':
                return 18;
            case 's':
                return 19;
            case 't':
                return 20;
            case 'u':
                return 21;
            default:
                return 0;
        }
    }

    public static Object readObjectFrom(Input input, Schema<?> schema, Object obj, IdStrategy idStrategy) throws IOException {
        Class<?> clsResolveClassFrom;
        switch (input.readFieldNumber(schema)) {
            case 18:
                clsResolveClassFrom = idStrategy.resolveClassFrom(input, false, false);
                break;
            case 19:
                clsResolveClassFrom = idStrategy.resolveClassFrom(input, true, false);
                break;
            case 20:
                clsResolveClassFrom = ObjectSchema.getArrayClass(input, schema, idStrategy.resolveClassFrom(input, false, true));
                break;
            case 21:
                clsResolveClassFrom = ObjectSchema.getArrayClass(input, schema, idStrategy.resolveClassFrom(input, true, true));
                break;
            default:
                throw new ProtostuffException("Corrupt input.");
        }
        if (input instanceof GraphInput) {
            ((GraphInput) input).updateLast(clsResolveClassFrom, obj);
        }
        if (input.readFieldNumber(schema) == 0) {
            return clsResolveClassFrom;
        }
        throw new ProtostuffException("Corrupt input.");
    }

    public static void transferObject(Pipe.Schema<Object> schema, Pipe pipe, Input input, Output output, IdStrategy idStrategy) throws IOException {
        int fieldNumber = input.readFieldNumber(schema.wrappedSchema);
        switch (fieldNumber) {
            case 18:
                ObjectSchema.transferClass(pipe, input, output, fieldNumber, schema, false, false, idStrategy);
                break;
            case 19:
                ObjectSchema.transferClass(pipe, input, output, fieldNumber, schema, true, false, idStrategy);
                break;
            case 20:
                ObjectSchema.transferClass(pipe, input, output, fieldNumber, schema, false, true, idStrategy);
                break;
            case 21:
                ObjectSchema.transferClass(pipe, input, output, fieldNumber, schema, true, true, idStrategy);
                break;
            default:
                throw new ProtostuffException("Corrupt input.");
        }
        if (input.readFieldNumber(schema.wrappedSchema) != 0) {
            throw new ProtostuffException("Corrupt input.");
        }
    }

    public static void writeObjectTo(Output output, Object obj, Schema<?> schema, IdStrategy idStrategy) throws IOException {
        Class<?> cls = (Class) obj;
        if (!cls.isArray()) {
            idStrategy.writeClassIdTo(output, cls, false);
            return;
        }
        Class<?> componentType = cls.getComponentType();
        int i = 1;
        while (componentType.isArray()) {
            i++;
            componentType = componentType.getComponentType();
        }
        idStrategy.writeClassIdTo(output, componentType, true);
        output.writeUInt32(2, i, false);
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
        return Class.class.getName();
    }

    @Override // io.protostuff.Schema
    public String messageName() {
        return Class.class.getSimpleName();
    }

    @Override // io.protostuff.Schema
    public void writeTo(Output output, Object obj) throws IOException {
        writeObjectTo(output, obj, this, this.strategy);
    }
}
