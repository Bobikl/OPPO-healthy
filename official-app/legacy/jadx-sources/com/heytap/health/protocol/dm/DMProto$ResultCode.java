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
public final class DMProto$ResultCode extends GeneratedMessageLite<DMProto$ResultCode, Builder> implements DMProto$ResultCodeOrBuilder {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final DMProto$ResultCode DEFAULT_INSTANCE;
    private static volatile Parser<DMProto$ResultCode> PARSER;
    private int code_;

    public static final class Builder extends GeneratedMessageLite.Builder<DMProto$ResultCode, Builder> implements DMProto$ResultCodeOrBuilder {
        public Builder clearCode() {
            copyOnWrite();
            ((DMProto$ResultCode) this.instance).clearCode();
            return this;
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ResultCodeOrBuilder
        public int getCode() {
            return ((DMProto$ResultCode) this.instance).getCode();
        }

        public Builder setCode(int i) {
            copyOnWrite();
            ((DMProto$ResultCode) this.instance).setCode(i);
            return this;
        }

        private Builder() {
            super(DMProto$ResultCode.DEFAULT_INSTANCE);
        }
    }

    static {
        DMProto$ResultCode dMProto$ResultCode = new DMProto$ResultCode();
        DEFAULT_INSTANCE = dMProto$ResultCode;
        GeneratedMessageLite.registerDefaultInstance(DMProto$ResultCode.class, dMProto$ResultCode);
    }

    private DMProto$ResultCode() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.code_ = 0;
    }

    public static DMProto$ResultCode getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DMProto$ResultCode parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DMProto$ResultCode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$ResultCode parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DMProto$ResultCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DMProto$ResultCode> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(int i) {
        this.code_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yl4.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DMProto$ResultCode();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"code_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DMProto$ResultCode> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DMProto$ResultCode.class) {
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

    @Override // com.heytap.health.protocol.dm.DMProto$ResultCodeOrBuilder
    public int getCode() {
        return this.code_;
    }

    public static Builder newBuilder(DMProto$ResultCode dMProto$ResultCode) {
        return DEFAULT_INSTANCE.createBuilder(dMProto$ResultCode);
    }

    public static DMProto$ResultCode parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$ResultCode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$ResultCode parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$ResultCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DMProto$ResultCode parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DMProto$ResultCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DMProto$ResultCode parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$ResultCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DMProto$ResultCode parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DMProto$ResultCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DMProto$ResultCode parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$ResultCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DMProto$ResultCode parseFrom(InputStream inputStream) throws IOException {
        return (DMProto$ResultCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$ResultCode parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$ResultCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$ResultCode parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DMProto$ResultCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DMProto$ResultCode parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$ResultCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
