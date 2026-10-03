package io.protostuff;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class GraphCodedInput extends FilterInput<CodedInput> implements GraphInput, Schema<Object> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private int lastRef;
    private Schema<Object> lastSchema;
    private boolean messageReference;
    private final ArrayList<Object> references;

    public GraphCodedInput(CodedInput codedInput) {
        super(codedInput);
        this.lastRef = -1;
        this.messageReference = false;
        this.references = new ArrayList<>();
    }

    @Override // io.protostuff.Schema
    public String getFieldName(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // io.protostuff.Schema
    public int getFieldNumber(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // io.protostuff.FilterInput, io.protostuff.Input
    public <T> void handleUnknownField(int i, Schema<T> schema) throws IOException {
        if (this.messageReference) {
            return;
        }
        F f = this.input;
        ((CodedInput) f).skipField(((CodedInput) f).getLastTag());
    }

    @Override // io.protostuff.GraphInput
    public boolean isCurrentMessageReference() {
        return this.messageReference;
    }

    @Override // io.protostuff.Schema
    public boolean isInitialized(Object obj) {
        return true;
    }

    @Override // io.protostuff.Schema
    public void mergeFrom(Input input, Object obj) throws IOException {
        Schema<Object> schema = this.lastSchema;
        schema.mergeFrom(this, obj);
        if (!schema.isInitialized(obj)) {
            throw new UninitializedMessageException(obj, (Schema<?>) schema);
        }
        this.lastSchema = schema;
    }

    @Override // io.protostuff.FilterInput, io.protostuff.Input
    public <T> T mergeObject(T t, Schema<T> schema) throws IOException {
        if (this.messageReference) {
            return (T) this.references.get(this.lastRef);
        }
        this.lastSchema = schema;
        if (t == null) {
            t = schema.newMessage();
        }
        this.references.add(t);
        ((CodedInput) this.input).mergeObject(t, this);
        return t;
    }

    @Override // io.protostuff.Schema
    public String messageFullName() {
        throw new UnsupportedOperationException();
    }

    @Override // io.protostuff.Schema
    public String messageName() {
        throw new UnsupportedOperationException();
    }

    @Override // io.protostuff.Schema
    public Object newMessage() {
        throw new UnsupportedOperationException();
    }

    @Override // io.protostuff.FilterInput, io.protostuff.Input
    public <T> int readFieldNumber(Schema<T> schema) throws IOException {
        int fieldNumber = ((CodedInput) this.input).readFieldNumber(schema);
        if (WireFormat.getTagWireType(((CodedInput) this.input).getLastTag()) == 6) {
            this.lastRef = ((CodedInput) this.input).readUInt32();
            this.messageReference = true;
        } else {
            this.messageReference = false;
        }
        return fieldNumber;
    }

    @Override // io.protostuff.Schema
    public Class<? super Object> typeClass() {
        throw new UnsupportedOperationException();
    }

    @Override // io.protostuff.GraphInput
    public void updateLast(Object obj, Object obj2) {
        int size = this.references.size() - 1;
        if (obj2 == null || obj2 != this.references.get(size)) {
            return;
        }
        this.references.set(size, obj);
    }

    @Override // io.protostuff.Schema
    public void writeTo(Output output, Object obj) throws IOException {
        throw new UnsupportedOperationException();
    }

    public GraphCodedInput(CodedInput codedInput, int i) {
        super(codedInput);
        this.lastRef = -1;
        this.messageReference = false;
        this.references = new ArrayList<>(i);
    }
}
