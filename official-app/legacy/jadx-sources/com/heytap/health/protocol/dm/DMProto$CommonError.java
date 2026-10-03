package com.heytap.health.protocol.dm;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.yl4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class DMProto$CommonError extends GeneratedMessageLite<DMProto$CommonError, Builder> implements DMProto$CommonErrorOrBuilder {
    private static final DMProto$CommonError DEFAULT_INSTANCE;
    public static final int ERRORCODE_FIELD_NUMBER = 1;
    private static volatile Parser<DMProto$CommonError> PARSER;
    private int errorCode_;

    public static final class Builder extends GeneratedMessageLite.Builder<DMProto$CommonError, Builder> implements DMProto$CommonErrorOrBuilder {
        public Builder clearErrorCode() {
            copyOnWrite();
            ((DMProto$CommonError) this.instance).clearErrorCode();
            return this;
        }

        @Override // com.heytap.health.protocol.dm.DMProto$CommonErrorOrBuilder
        public int getErrorCode() {
            return ((DMProto$CommonError) this.instance).getErrorCode();
        }

        public Builder setErrorCode(int i) {
            copyOnWrite();
            ((DMProto$CommonError) this.instance).setErrorCode(i);
            return this;
        }

        private Builder() {
            super(DMProto$CommonError.DEFAULT_INSTANCE);
        }
    }

    static {
        DMProto$CommonError dMProto$CommonError = new DMProto$CommonError();
        DEFAULT_INSTANCE = dMProto$CommonError;
        GeneratedMessageLite.registerDefaultInstance(DMProto$CommonError.class, dMProto$CommonError);
    }

    private DMProto$CommonError() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorCode() {
        this.errorCode_ = 0;
    }

    public static DMProto$CommonError getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DMProto$CommonError parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DMProto$CommonError) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$CommonError parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DMProto$CommonError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DMProto$CommonError> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorCode(int i) {
        this.errorCode_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yl4.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DMProto$CommonError();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"errorCode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DMProto$CommonError> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DMProto$CommonError.class) {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                        break;
                    }
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.heytap.health.protocol.dm.DMProto$CommonErrorOrBuilder
    public int getErrorCode() {
        return this.errorCode_;
    }

    public static Builder newBuilder(DMProto$CommonError dMProto$CommonError) {
        return DEFAULT_INSTANCE.createBuilder(dMProto$CommonError);
    }

    public static DMProto$CommonError parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$CommonError) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$CommonError parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$CommonError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DMProto$CommonError parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DMProto$CommonError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DMProto$CommonError parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$CommonError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DMProto$CommonError parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DMProto$CommonError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DMProto$CommonError parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$CommonError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DMProto$CommonError parseFrom(InputStream inputStream) throws IOException {
        return (DMProto$CommonError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$CommonError parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$CommonError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$CommonError parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DMProto$CommonError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DMProto$CommonError parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$CommonError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
