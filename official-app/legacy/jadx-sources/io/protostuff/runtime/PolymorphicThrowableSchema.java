package io.protostuff.runtime;

import io.protostuff.GraphInput;
import io.protostuff.Input;
import io.protostuff.Output;
import io.protostuff.Pipe;
import io.protostuff.ProtostuffException;
import io.protostuff.Schema;
import io.protostuff.StatefulOutput;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class PolymorphicThrowableSchema extends PolymorphicSchema {
    static final java.lang.reflect.Field __cause;
    protected final Pipe.Schema<Object> pipeSchema;

    static {
        java.lang.reflect.Field declaredField;
        try {
            declaredField = Throwable.class.getDeclaredField("cause");
            declaredField.setAccessible(true);
        } catch (Exception unused) {
            declaredField = null;
        }
        __cause = declaredField;
    }

    public PolymorphicThrowableSchema(IdStrategy idStrategy) {
        super(idStrategy);
        this.pipeSchema = new Pipe.Schema<Object>(this) { // from class: io.protostuff.runtime.PolymorphicThrowableSchema.1
            @Override // io.protostuff.Pipe.Schema
            public void transfer(Pipe pipe, Input input, Output output) throws IOException {
                PolymorphicThrowableSchema.transferObject(this, pipe, input, output, PolymorphicThrowableSchema.this.strategy);
            }
        };
    }

    public static String name(int i) {
        if (i == 52) {
            return "Z";
        }
        return null;
    }

    public static int number(String str) {
        return (str.length() == 1 && str.charAt(0) == 'Z') ? 52 : 0;
    }

    public static Object readObjectFrom(Input input, Schema<?> schema, Object obj, IdStrategy idStrategy) throws IOException {
        int fieldNumber = input.readFieldNumber(schema);
        if (fieldNumber == 52) {
            return readObjectFrom(input, schema, obj, idStrategy, fieldNumber);
        }
        throw new ProtostuffException("Corrupt input.");
    }

    public static void transferObject(Pipe.Schema<Object> schema, Pipe pipe, Input input, Output output, IdStrategy idStrategy) throws IOException {
        int fieldNumber = input.readFieldNumber(schema.wrappedSchema);
        if (fieldNumber != 52) {
            throw new ProtostuffException("Corrupt input.");
        }
        transferObject(schema, pipe, input, output, idStrategy, fieldNumber);
    }

    public static boolean tryWriteWithoutCause(Output output, Object obj, Schema<Object> schema) throws IOException {
        java.lang.reflect.Field field;
        if ((schema instanceof RuntimeSchema) && (field = __cause) != null) {
            RuntimeSchema runtimeSchema = (RuntimeSchema) schema;
            if (runtimeSchema.getFieldCount() > 1 && ((Field) runtimeSchema.getFields().get(1)).name.equals("cause")) {
                try {
                    if (field.get(obj) == obj) {
                        ((Field) runtimeSchema.getFields().get(0)).writeTo(output, obj);
                        int fieldCount = runtimeSchema.getFieldCount();
                        for (int i = 2; i < fieldCount; i++) {
                            ((Field) runtimeSchema.getFields().get(i)).writeTo(output, obj);
                        }
                        return true;
                    }
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return false;
    }

    public static void writeObjectTo(Output output, Object obj, Schema<?> schema, IdStrategy idStrategy) throws IOException {
        Schema<?> schema2 = idStrategy.writePojoIdTo(output, 52, obj.getClass()).getSchema();
        if (output instanceof StatefulOutput) {
            ((StatefulOutput) output).updateLast(schema2, schema);
        }
        if (tryWriteWithoutCause(output, obj, schema2)) {
            return;
        }
        schema2.writeTo(output, obj);
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
        return Throwable.class.getName();
    }

    @Override // io.protostuff.Schema
    public String messageName() {
        return Throwable.class.getSimpleName();
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
        java.lang.reflect.Field field = __cause;
        if (field != null) {
            try {
                Object obj2 = field.get(objNewMessage);
                if (obj2 == null) {
                    try {
                        field.set(objNewMessage, obj2);
                    } catch (Exception e2) {
                        throw new RuntimeException(e2);
                    }
                }
            } catch (Exception e3) {
                throw new RuntimeException(e3);
            }
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
