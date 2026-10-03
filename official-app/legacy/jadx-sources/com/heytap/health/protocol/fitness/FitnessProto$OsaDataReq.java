package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.nh7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FitnessProto$OsaDataReq extends GeneratedMessageLite<FitnessProto$OsaDataReq, Builder> implements FitnessProto$OsaDataReqOrBuilder {
    private static final FitnessProto$OsaDataReq DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$OsaDataReq> PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private int timestamp_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$OsaDataReq, Builder> implements FitnessProto$OsaDataReqOrBuilder {
        public Builder clearTimestamp() {
            copyOnWrite();
            ((FitnessProto$OsaDataReq) this.instance).clearTimestamp();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$OsaDataReqOrBuilder
        public int getTimestamp() {
            return ((FitnessProto$OsaDataReq) this.instance).getTimestamp();
        }

        public Builder setTimestamp(int i) {
            copyOnWrite();
            ((FitnessProto$OsaDataReq) this.instance).setTimestamp(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$OsaDataReq.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$OsaDataReq fitnessProto$OsaDataReq = new FitnessProto$OsaDataReq();
        DEFAULT_INSTANCE = fitnessProto$OsaDataReq;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$OsaDataReq.class, fitnessProto$OsaDataReq);
    }

    private FitnessProto$OsaDataReq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0;
    }

    public static FitnessProto$OsaDataReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$OsaDataReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$OsaDataReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$OsaDataReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$OsaDataReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$OsaDataReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(int i) {
        this.timestamp_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$OsaDataReq();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"timestamp_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$OsaDataReq> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$OsaDataReq.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$OsaDataReqOrBuilder
    public int getTimestamp() {
        return this.timestamp_;
    }

    public static Builder newBuilder(FitnessProto$OsaDataReq fitnessProto$OsaDataReq) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$OsaDataReq);
    }

    public static FitnessProto$OsaDataReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$OsaDataReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$OsaDataReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$OsaDataReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$OsaDataReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$OsaDataReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$OsaDataReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$OsaDataReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$OsaDataReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$OsaDataReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$OsaDataReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$OsaDataReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$OsaDataReq parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$OsaDataReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$OsaDataReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$OsaDataReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$OsaDataReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$OsaDataReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$OsaDataReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$OsaDataReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
