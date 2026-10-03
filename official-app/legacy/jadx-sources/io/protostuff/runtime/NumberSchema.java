package io.protostuff.runtime;

import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b2n;
import io.protostuff.GraphInput;
import io.protostuff.Input;
import io.protostuff.MapSchema;
import io.protostuff.Output;
import io.protostuff.Pipe;
import io.protostuff.ProtostuffException;
import io.protostuff.Schema;
import io.protostuff.StatefulOutput;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class NumberSchema extends PolymorphicSchema {
    protected final Pipe.Schema<Object> pipeSchema;

    public NumberSchema(IdStrategy idStrategy) {
        super(idStrategy);
        this.pipeSchema = new Pipe.Schema<Object>(this) { // from class: io.protostuff.runtime.NumberSchema.1
            @Override // io.protostuff.Pipe.Schema
            public void transfer(Pipe pipe, Input input, Output output) throws IOException {
                NumberSchema.transferObject(this, pipe, input, output, NumberSchema.this.strategy);
            }
        };
    }

    public static String name(int i) {
        if (i == 2) {
            return "b";
        }
        if (i == 127) {
            return "_";
        }
        if (i == 12) {
            return LogFieldKey.LEVEL_KEY;
        }
        if (i == 13) {
            return LogFieldKey.MESSAGE_KEY;
        }
        switch (i) {
            case 4:
                return "d";
            case 5:
                return MapSchema.FIELD_NAME_ENTRY;
            case 6:
                return "f";
            case 7:
                return b2n.f;
            case 8:
                return b2n.g;
            default:
                return null;
        }
    }

    public static int number(String str) {
        if (str.length() != 1) {
            return 0;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == '_') {
            return 127;
        }
        if (cCharAt == 'b') {
            return 2;
        }
        if (cCharAt == 'l') {
            return 12;
        }
        if (cCharAt == 'm') {
            return 13;
        }
        switch (cCharAt) {
            case 'd':
                return 4;
            case 'e':
                return 5;
            case 'f':
                return 6;
            case 'g':
                return 7;
            case 'h':
                return 8;
            default:
                return 0;
        }
    }

    public static Object readObjectFrom(Input input, Schema<?> schema, Object obj, IdStrategy idStrategy) throws IOException {
        Object from;
        int fieldNumber = input.readFieldNumber(schema);
        if (fieldNumber == 127) {
            Schema schema2 = idStrategy.resolvePojoFrom(input, fieldNumber).getSchema();
            Object objNewMessage = schema2.newMessage();
            if (input instanceof GraphInput) {
                ((GraphInput) input).updateLast(objNewMessage, obj);
            }
            schema2.mergeFrom(input, objNewMessage);
            return objNewMessage;
        }
        if (fieldNumber == 2) {
            from = RuntimeFieldFactory.BYTE.readFrom(input);
        } else if (fieldNumber == 12) {
            from = RuntimeFieldFactory.BIGDECIMAL.readFrom(input);
        } else if (fieldNumber != 13) {
            switch (fieldNumber) {
                case 4:
                    from = RuntimeFieldFactory.SHORT.readFrom(input);
                    break;
                case 5:
                    from = RuntimeFieldFactory.INT32.readFrom(input);
                    break;
                case 6:
                    from = RuntimeFieldFactory.INT64.readFrom(input);
                    break;
                case 7:
                    from = RuntimeFieldFactory.FLOAT.readFrom(input);
                    break;
                case 8:
                    from = RuntimeFieldFactory.DOUBLE.readFrom(input);
                    break;
                default:
                    throw new ProtostuffException("Corrupt input.");
            }
        } else {
            from = RuntimeFieldFactory.BIGINTEGER.readFrom(input);
        }
        if (input instanceof GraphInput) {
            ((GraphInput) input).updateLast(from, obj);
        }
        if (input.readFieldNumber(schema) == 0) {
            return from;
        }
        throw new ProtostuffException("Corrupt input.");
    }

    public static void transferObject(Pipe.Schema<Object> schema, Pipe pipe, Input input, Output output, IdStrategy idStrategy) throws IOException {
        int fieldNumber = input.readFieldNumber(schema.wrappedSchema);
        if (fieldNumber == 127) {
            Pipe.Schema pipeSchema = idStrategy.transferPojoId(input, output, fieldNumber).getPipeSchema();
            if (output instanceof StatefulOutput) {
                ((StatefulOutput) output).updateLast(pipeSchema, schema);
            }
            Pipe.transferDirect(pipeSchema, pipe, input, output);
            return;
        }
        if (fieldNumber == 2) {
            RuntimeFieldFactory.BYTE.transfer(pipe, input, output, fieldNumber, false);
            return;
        }
        if (fieldNumber == 12) {
            RuntimeFieldFactory.BIGDECIMAL.transfer(pipe, input, output, fieldNumber, false);
            return;
        }
        if (fieldNumber == 13) {
            RuntimeFieldFactory.BIGINTEGER.transfer(pipe, input, output, fieldNumber, false);
            return;
        }
        switch (fieldNumber) {
            case 4:
                RuntimeFieldFactory.SHORT.transfer(pipe, input, output, fieldNumber, false);
                return;
            case 5:
                RuntimeFieldFactory.INT32.transfer(pipe, input, output, fieldNumber, false);
                return;
            case 6:
                RuntimeFieldFactory.INT64.transfer(pipe, input, output, fieldNumber, false);
                return;
            case 7:
                RuntimeFieldFactory.FLOAT.transfer(pipe, input, output, fieldNumber, false);
                return;
            case 8:
                RuntimeFieldFactory.DOUBLE.transfer(pipe, input, output, fieldNumber, false);
                return;
            default:
                throw new ProtostuffException("Corrupt input.");
        }
    }

    public static void writeObjectTo(Output output, Object obj, Schema<?> schema, IdStrategy idStrategy) throws IOException {
        Class<?> cls = obj.getClass();
        RuntimeFieldFactory inline = RuntimeFieldFactory.getInline(cls);
        if (inline != null) {
            inline.writeTo(output, inline.id, obj, false);
            return;
        }
        Schema<?> schema2 = idStrategy.writePojoIdTo(output, 127, cls).getSchema();
        if (output instanceof StatefulOutput) {
            ((StatefulOutput) output).updateLast(schema2, schema);
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
        return Number.class.getName();
    }

    @Override // io.protostuff.Schema
    public String messageName() {
        return Number.class.getSimpleName();
    }

    @Override // io.protostuff.Schema
    public void writeTo(Output output, Object obj) throws IOException {
        writeObjectTo(output, obj, this, this.strategy);
    }
}
