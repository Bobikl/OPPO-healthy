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
public final class DMProto$ResetResult extends GeneratedMessageLite<DMProto$ResetResult, Builder> implements DMProto$ResetResultOrBuilder {
    private static final DMProto$ResetResult DEFAULT_INSTANCE;
    private static volatile Parser<DMProto$ResetResult> PARSER = null;
    public static final int RESULT_CODE_FIELD_NUMBER = 1;
    private int resultCode_;

    public static final class Builder extends GeneratedMessageLite.Builder<DMProto$ResetResult, Builder> implements DMProto$ResetResultOrBuilder {
        public Builder clearResultCode() {
            copyOnWrite();
            ((DMProto$ResetResult) this.instance).clearResultCode();
            return this;
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ResetResultOrBuilder
        public int getResultCode() {
            return ((DMProto$ResetResult) this.instance).getResultCode();
        }

        public Builder setResultCode(int i) {
            copyOnWrite();
            ((DMProto$ResetResult) this.instance).setResultCode(i);
            return this;
        }

        private Builder() {
            super(DMProto$ResetResult.DEFAULT_INSTANCE);
        }
    }

    static {
        DMProto$ResetResult dMProto$ResetResult = new DMProto$ResetResult();
        DEFAULT_INSTANCE = dMProto$ResetResult;
        GeneratedMessageLite.registerDefaultInstance(DMProto$ResetResult.class, dMProto$ResetResult);
    }

    private DMProto$ResetResult() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResultCode() {
        this.resultCode_ = 0;
    }

    public static DMProto$ResetResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DMProto$ResetResult parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DMProto$ResetResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$ResetResult parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DMProto$ResetResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DMProto$ResetResult> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResultCode(int i) {
        this.resultCode_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yl4.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DMProto$ResetResult();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"resultCode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DMProto$ResetResult> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DMProto$ResetResult.class) {
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

    @Override // com.heytap.health.protocol.dm.DMProto$ResetResultOrBuilder
    public int getResultCode() {
        return this.resultCode_;
    }

    public static Builder newBuilder(DMProto$ResetResult dMProto$ResetResult) {
        return DEFAULT_INSTANCE.createBuilder(dMProto$ResetResult);
    }

    public static DMProto$ResetResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$ResetResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$ResetResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$ResetResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DMProto$ResetResult parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DMProto$ResetResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DMProto$ResetResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$ResetResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DMProto$ResetResult parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DMProto$ResetResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DMProto$ResetResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$ResetResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DMProto$ResetResult parseFrom(InputStream inputStream) throws IOException {
        return (DMProto$ResetResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$ResetResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$ResetResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$ResetResult parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DMProto$ResetResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DMProto$ResetResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$ResetResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
