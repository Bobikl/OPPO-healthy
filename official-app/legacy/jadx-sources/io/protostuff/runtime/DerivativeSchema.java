package io.protostuff.runtime;

import io.protostuff.Input;
import io.protostuff.Output;
import io.protostuff.Pipe;
import io.protostuff.ProtostuffException;
import io.protostuff.Schema;
import io.protostuff.StatefulOutput;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class DerivativeSchema implements Schema<Object> {
    public final Pipe.Schema<Object> pipeSchema = new Pipe.Schema<Object>(this) { // from class: io.protostuff.runtime.DerivativeSchema.1
        @Override // io.protostuff.Pipe.Schema
        public void transfer(Pipe pipe, Input input, Output output) throws IOException {
            if (input.readFieldNumber(DerivativeSchema.this) != 127) {
                throw new ProtostuffException("order not preserved.");
            }
            Pipe.Schema pipeSchema = DerivativeSchema.this.strategy.transferPojoId(input, output, 127).getPipeSchema();
            if (output instanceof StatefulOutput) {
                ((StatefulOutput) output).updateLast(pipeSchema, this);
            }
            Pipe.transferDirect(pipeSchema, pipe, input, output);
        }
    };
    public final IdStrategy strategy;

    public DerivativeSchema(IdStrategy idStrategy) {
        this.strategy = idStrategy;
    }

    public abstract void doMergeFrom(Input input, Schema<Object> schema, Object obj) throws IOException;

    @Override // io.protostuff.Schema
    public String getFieldName(int i) {
        if (i == 127) {
            return "_";
        }
        return null;
    }

    @Override // io.protostuff.Schema
    public int getFieldNumber(String str) {
        return (str.length() == 1 && str.charAt(0) == '_') ? 127 : 0;
    }

    @Override // io.protostuff.Schema
    public boolean isInitialized(Object obj) {
        return true;
    }

    @Override // io.protostuff.Schema
    public void mergeFrom(Input input, Object obj) throws IOException {
        if (input.readFieldNumber(this) != 127) {
            throw new ProtostuffException("order not preserved.");
        }
        doMergeFrom(input, this.strategy.resolvePojoFrom(input, 127).getSchema(), obj);
    }

    @Override // io.protostuff.Schema
    public String messageFullName() {
        return Object.class.getName();
    }

    @Override // io.protostuff.Schema
    public String messageName() {
        return Object.class.getSimpleName();
    }

    @Override // io.protostuff.Schema
    public Object newMessage() {
        throw new UnsupportedOperationException();
    }

    @Override // io.protostuff.Schema
    public Class<? super Object> typeClass() {
        return Object.class;
    }

    @Override // io.protostuff.Schema
    public void writeTo(Output output, Object obj) throws IOException {
        Schema<?> schema = this.strategy.writePojoIdTo(output, 127, obj.getClass()).getSchema();
        if (output instanceof StatefulOutput) {
            ((StatefulOutput) output).updateLast(schema, this);
        }
        schema.writeTo(output, obj);
    }
}
