package io.protostuff;

/* JADX INFO: loaded from: classes10.dex */
public final class UninitializedMessageException extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;
    public final Object targetMessage;
    public final Schema<?> targetSchema;

    public UninitializedMessageException(Message<?> message) {
        this(message, message.cachedSchema());
    }

    public <T> T getTargetMessage() {
        return (T) this.targetMessage;
    }

    public <T> Schema<T> getTargetSchema() {
        return (Schema<T>) this.targetSchema;
    }

    public UninitializedMessageException(Object obj, Schema<?> schema) {
        this.targetMessage = obj;
        this.targetSchema = schema;
    }

    public UninitializedMessageException(String str, Message<?> message) {
        this(str, message, message.cachedSchema());
    }

    public UninitializedMessageException(String str, Object obj, Schema<?> schema) {
        super(str);
        this.targetMessage = obj;
        this.targetSchema = schema;
    }
}
