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
public final class DMProto$LicenseResult extends GeneratedMessageLite<DMProto$LicenseResult, Builder> implements DMProto$LicenseResultOrBuilder {
    private static final DMProto$LicenseResult DEFAULT_INSTANCE;
    private static volatile Parser<DMProto$LicenseResult> PARSER = null;
    public static final int RESULT_CODE_FIELD_NUMBER = 1;
    private int resultCode_;

    public static final class Builder extends GeneratedMessageLite.Builder<DMProto$LicenseResult, Builder> implements DMProto$LicenseResultOrBuilder {
        public Builder clearResultCode() {
            copyOnWrite();
            ((DMProto$LicenseResult) this.instance).clearResultCode();
            return this;
        }

        @Override // com.heytap.health.protocol.dm.DMProto$LicenseResultOrBuilder
        public int getResultCode() {
            return ((DMProto$LicenseResult) this.instance).getResultCode();
        }

        public Builder setResultCode(int i) {
            copyOnWrite();
            ((DMProto$LicenseResult) this.instance).setResultCode(i);
            return this;
        }

        private Builder() {
            super(DMProto$LicenseResult.DEFAULT_INSTANCE);
        }
    }

    static {
        DMProto$LicenseResult dMProto$LicenseResult = new DMProto$LicenseResult();
        DEFAULT_INSTANCE = dMProto$LicenseResult;
        GeneratedMessageLite.registerDefaultInstance(DMProto$LicenseResult.class, dMProto$LicenseResult);
    }

    private DMProto$LicenseResult() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResultCode() {
        this.resultCode_ = 0;
    }

    public static DMProto$LicenseResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DMProto$LicenseResult parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DMProto$LicenseResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$LicenseResult parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DMProto$LicenseResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DMProto$LicenseResult> parser() {
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
                return new DMProto$LicenseResult();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"resultCode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DMProto$LicenseResult> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DMProto$LicenseResult.class) {
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

    @Override // com.heytap.health.protocol.dm.DMProto$LicenseResultOrBuilder
    public int getResultCode() {
        return this.resultCode_;
    }

    public static Builder newBuilder(DMProto$LicenseResult dMProto$LicenseResult) {
        return DEFAULT_INSTANCE.createBuilder(dMProto$LicenseResult);
    }

    public static DMProto$LicenseResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$LicenseResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$LicenseResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$LicenseResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DMProto$LicenseResult parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DMProto$LicenseResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DMProto$LicenseResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$LicenseResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DMProto$LicenseResult parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DMProto$LicenseResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DMProto$LicenseResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$LicenseResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DMProto$LicenseResult parseFrom(InputStream inputStream) throws IOException {
        return (DMProto$LicenseResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$LicenseResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$LicenseResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$LicenseResult parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DMProto$LicenseResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DMProto$LicenseResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$LicenseResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
