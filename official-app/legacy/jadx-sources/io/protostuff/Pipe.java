package io.protostuff;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class Pipe {
    protected Input input;
    protected Output output;

    public static abstract class Schema<T> implements io.protostuff.Schema<Pipe> {
        public final io.protostuff.Schema<T> wrappedSchema;

        public Schema(io.protostuff.Schema<T> schema) {
            this.wrappedSchema = schema;
        }

        @Override // io.protostuff.Schema
        public String getFieldName(int i) {
            return this.wrappedSchema.getFieldName(i);
        }

        @Override // io.protostuff.Schema
        public int getFieldNumber(String str) {
            return this.wrappedSchema.getFieldNumber(str);
        }

        @Override // io.protostuff.Schema
        public boolean isInitialized(Pipe pipe) {
            return true;
        }

        @Override // io.protostuff.Schema
        public String messageFullName() {
            return this.wrappedSchema.messageFullName();
        }

        @Override // io.protostuff.Schema
        public String messageName() {
            return this.wrappedSchema.messageName();
        }

        public abstract void transfer(Pipe pipe, Input input, Output output) throws IOException;

        @Override // io.protostuff.Schema
        public Class<? super Pipe> typeClass() {
            throw new UnsupportedOperationException();
        }

        @Override // io.protostuff.Schema
        public final void mergeFrom(Input input, Pipe pipe) throws IOException {
            transfer(pipe, input, pipe.output);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.protostuff.Schema
        public Pipe newMessage() {
            throw new UnsupportedOperationException();
        }

        @Override // io.protostuff.Schema
        public final void writeTo(Output output, Pipe pipe) throws IOException {
            if (pipe.output != null) {
                pipe.input.mergeObject(pipe, this);
                return;
            }
            pipe.output = output;
            Input inputBegin = pipe.begin(this);
            boolean z = true;
            if (inputBegin == null) {
                pipe.output = null;
                pipe.end(this, inputBegin, z);
                return;
            }
            pipe.input = inputBegin;
            try {
                transfer(pipe, inputBegin, output);
                z = false;
            } finally {
                pipe.end(this, inputBegin, z);
            }
        }
    }

    public static <T> void transferDirect(Schema<T> schema, Pipe pipe, Input input, Output output) throws IOException {
        schema.transfer(pipe, input, output);
    }

    public abstract Input begin(Schema<?> schema) throws IOException;

    public abstract void end(Schema<?> schema, Input input, boolean z) throws IOException;

    public Pipe reset() {
        this.output = null;
        this.input = null;
        return this;
    }
}
