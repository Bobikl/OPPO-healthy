package io.protostuff;

/* JADX INFO: loaded from: classes10.dex */
public class ProtobufException extends ProtostuffException {
    private static final String ERR_TRUNCATED_MESSAGE = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.";
    private static final long serialVersionUID = 1616151763072450476L;

    public ProtobufException(String str) {
        super(str);
    }

    public static ProtobufException invalidEndTag() {
        return new ProtobufException("Protocol message end-group tag did not match expected tag.");
    }

    public static ProtobufException invalidTag() {
        return new ProtobufException("Protocol message contained an invalid tag (zero).");
    }

    public static ProtobufException invalidWireType() {
        return new ProtobufException("Protocol message tag had invalid wire type.");
    }

    public static ProtobufException malformedVarint() {
        return new ProtobufException("CodedInput encountered a malformed varint.");
    }

    public static ProtobufException misreportedSize() {
        return new ProtobufException("CodedInput encountered an embedded string or bytes that misreported its size.");
    }

    public static ProtobufException negativeSize() {
        return new ProtobufException("CodedInput encountered an embedded string or message which claimed to have negative size.");
    }

    public static ProtobufException recursionLimitExceeded() {
        return new ProtobufException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInput.setRecursionLimit() to increase the depth limit.");
    }

    public static ProtobufException sizeLimitExceeded() {
        return new ProtobufException("Protocol message was too large.  May be malicious.  Use CodedInput.setSizeLimit() to increase the size limit.");
    }

    public static ProtobufException truncatedMessage(Throwable th) {
        return new ProtobufException(ERR_TRUNCATED_MESSAGE, th);
    }

    public ProtobufException(String str, Throwable th) {
        super(str, th);
    }

    public static ProtobufException truncatedMessage() {
        return new ProtobufException(ERR_TRUNCATED_MESSAGE);
    }
}
