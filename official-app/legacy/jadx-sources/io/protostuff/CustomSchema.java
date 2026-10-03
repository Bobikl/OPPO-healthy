package io.protostuff;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class CustomSchema<T> implements Schema<T> {
    protected final Schema<T> schema;

    public CustomSchema(Schema<T> schema) {
        this.schema = schema;
    }

    @Override // io.protostuff.Schema
    public String getFieldName(int i) {
        return this.schema.getFieldName(i);
    }

    @Override // io.protostuff.Schema
    public int getFieldNumber(String str) {
        return this.schema.getFieldNumber(str);
    }

    @Override // io.protostuff.Schema
    public boolean isInitialized(T t) {
        return this.schema.isInitialized(t);
    }

    @Override // io.protostuff.Schema
    public void mergeFrom(Input input, T t) throws IOException {
        this.schema.mergeFrom(input, t);
    }

    @Override // io.protostuff.Schema
    public String messageFullName() {
        return this.schema.messageFullName();
    }

    @Override // io.protostuff.Schema
    public String messageName() {
        return this.schema.messageName();
    }

    @Override // io.protostuff.Schema
    public T newMessage() {
        return this.schema.newMessage();
    }

    @Override // io.protostuff.Schema
    public Class<? super T> typeClass() {
        return this.schema.typeClass();
    }

    @Override // io.protostuff.Schema
    public void writeTo(Output output, T t) throws IOException {
        this.schema.writeTo(output, t);
    }
}
