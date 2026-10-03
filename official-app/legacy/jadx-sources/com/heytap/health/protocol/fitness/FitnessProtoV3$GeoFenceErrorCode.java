package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.aq7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FitnessProtoV3$GeoFenceErrorCode extends GeneratedMessageLite<FitnessProtoV3$GeoFenceErrorCode, Builder> implements FitnessProtoV3$GeoFenceErrorCodeOrBuilder {
    private static final FitnessProtoV3$GeoFenceErrorCode DEFAULT_INSTANCE;
    public static final int ERRORCODE_FIELD_NUMBER = 1;
    private static volatile Parser<FitnessProtoV3$GeoFenceErrorCode> PARSER;
    private int errorCode_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProtoV3$GeoFenceErrorCode, Builder> implements FitnessProtoV3$GeoFenceErrorCodeOrBuilder {
        public Builder clearErrorCode() {
            copyOnWrite();
            ((FitnessProtoV3$GeoFenceErrorCode) this.instance).clearErrorCode();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV3$GeoFenceErrorCodeOrBuilder
        public int getErrorCode() {
            return ((FitnessProtoV3$GeoFenceErrorCode) this.instance).getErrorCode();
        }

        public Builder setErrorCode(int i) {
            copyOnWrite();
            ((FitnessProtoV3$GeoFenceErrorCode) this.instance).setErrorCode(i);
            return this;
        }

        private Builder() {
            super(FitnessProtoV3$GeoFenceErrorCode.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProtoV3$GeoFenceErrorCode fitnessProtoV3$GeoFenceErrorCode = new FitnessProtoV3$GeoFenceErrorCode();
        DEFAULT_INSTANCE = fitnessProtoV3$GeoFenceErrorCode;
        GeneratedMessageLite.registerDefaultInstance(FitnessProtoV3$GeoFenceErrorCode.class, fitnessProtoV3$GeoFenceErrorCode);
    }

    private FitnessProtoV3$GeoFenceErrorCode() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorCode() {
        this.errorCode_ = 0;
    }

    public static FitnessProtoV3$GeoFenceErrorCode getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProtoV3$GeoFenceErrorCode parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV3$GeoFenceErrorCode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV3$GeoFenceErrorCode parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProtoV3$GeoFenceErrorCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProtoV3$GeoFenceErrorCode> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorCode(int i) {
        this.errorCode_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = aq7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProtoV3$GeoFenceErrorCode();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"errorCode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProtoV3$GeoFenceErrorCode> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProtoV3$GeoFenceErrorCode.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV3$GeoFenceErrorCodeOrBuilder
    public int getErrorCode() {
        return this.errorCode_;
    }

    public static Builder newBuilder(FitnessProtoV3$GeoFenceErrorCode fitnessProtoV3$GeoFenceErrorCode) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProtoV3$GeoFenceErrorCode);
    }

    public static FitnessProtoV3$GeoFenceErrorCode parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV3$GeoFenceErrorCode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV3$GeoFenceErrorCode parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV3$GeoFenceErrorCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProtoV3$GeoFenceErrorCode parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProtoV3$GeoFenceErrorCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProtoV3$GeoFenceErrorCode parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV3$GeoFenceErrorCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProtoV3$GeoFenceErrorCode parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProtoV3$GeoFenceErrorCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProtoV3$GeoFenceErrorCode parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV3$GeoFenceErrorCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProtoV3$GeoFenceErrorCode parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV3$GeoFenceErrorCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV3$GeoFenceErrorCode parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV3$GeoFenceErrorCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV3$GeoFenceErrorCode parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProtoV3$GeoFenceErrorCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProtoV3$GeoFenceErrorCode parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV3$GeoFenceErrorCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
