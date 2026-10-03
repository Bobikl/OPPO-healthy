package io.protostuff.runtime;

import io.protostuff.GraphInput;
import io.protostuff.Input;
import io.protostuff.Output;
import io.protostuff.Pipe;
import io.protostuff.ProtostuffException;
import io.protostuff.Schema;
import io.protostuff.StatefulOutput;
import java.io.IOException;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ArraySchema extends PolymorphicSchema {
    static final int ID_ARRAY_DIMENSION = 2;
    static final int ID_ARRAY_LEN = 3;
    static final String STR_ARRAY_DIMENSION = "b";
    static final String STR_ARRAY_LEN = "c";
    protected final Pipe.Schema<Object> pipeSchema;

    public ArraySchema(IdStrategy idStrategy) {
        super(idStrategy);
        this.pipeSchema = new Pipe.Schema<Object>(this) { // from class: io.protostuff.runtime.ArraySchema.1
            @Override // io.protostuff.Pipe.Schema
            public void transfer(Pipe pipe, Input input, Output output) throws IOException {
                ArraySchema.transferObject(this, pipe, input, output, ArraySchema.this.strategy);
            }
        };
    }

    public static String name(int i) {
        if (i == 2) {
            return STR_ARRAY_DIMENSION;
        }
        if (i == 3) {
            return STR_ARRAY_LEN;
        }
        if (i == 15) {
            return "o";
        }
        if (i != 17) {
            return null;
        }
        return "q";
    }

    public static int number(String str) {
        if (str.length() != 1) {
            return 0;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == 'b') {
            return 2;
        }
        if (cCharAt == 'c') {
            return 3;
        }
        if (cCharAt != 'o') {
            return cCharAt != 'q' ? 0 : 17;
        }
        return 15;
    }

    public static Object readObjectFrom(Input input, Schema<?> schema, Object obj, IdStrategy idStrategy) throws IOException {
        boolean z;
        int fieldNumber = input.readFieldNumber(schema);
        if (fieldNumber == 15) {
            z = false;
        } else {
            if (fieldNumber != 17) {
                throw new ProtostuffException("Corrupt input.");
            }
            z = true;
        }
        ObjectSchema.ArrayWrapper arrayWrapperNewArrayWrapper = ObjectSchema.newArrayWrapper(input, schema, z, idStrategy);
        if (input instanceof GraphInput) {
            ((GraphInput) input).updateLast(arrayWrapperNewArrayWrapper.array, obj);
        }
        idStrategy.COLLECTION_SCHEMA.mergeFrom(input, arrayWrapperNewArrayWrapper);
        return arrayWrapperNewArrayWrapper.array;
    }

    public static void transferObject(Pipe.Schema<Object> schema, Pipe pipe, Input input, Output output, IdStrategy idStrategy) throws IOException {
        int fieldNumber = input.readFieldNumber(schema.wrappedSchema);
        if (fieldNumber == 15) {
            ObjectSchema.transferArray(pipe, input, output, fieldNumber, schema, false, idStrategy);
        } else {
            if (fieldNumber != 17) {
                throw new ProtostuffException("Corrupt input.");
            }
            ObjectSchema.transferArray(pipe, input, output, fieldNumber, schema, true, idStrategy);
        }
    }

    public static void writeObjectTo(Output output, Object obj, Schema<?> schema, IdStrategy idStrategy) throws IOException {
        Class<?> componentType = obj.getClass().getComponentType();
        int i = 1;
        while (componentType.isArray()) {
            i++;
            componentType = componentType.getComponentType();
        }
        idStrategy.writeArrayIdTo(output, componentType);
        output.writeUInt32(3, ((Object[]) obj).length, false);
        output.writeUInt32(2, i, false);
        if (output instanceof StatefulOutput) {
            ((StatefulOutput) output).updateLast(idStrategy.ARRAY_SCHEMA, schema);
        }
        idStrategy.ARRAY_SCHEMA.writeTo(output, obj);
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
        return Array.class.getName();
    }

    @Override // io.protostuff.Schema
    public String messageName() {
        return Array.class.getSimpleName();
    }

    @Override // io.protostuff.Schema
    public void writeTo(Output output, Object obj) throws IOException {
        writeObjectTo(output, obj, this, this.strategy);
    }
}
