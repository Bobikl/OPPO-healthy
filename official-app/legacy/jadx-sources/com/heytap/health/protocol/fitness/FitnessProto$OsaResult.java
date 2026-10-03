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
public final class FitnessProto$OsaResult extends GeneratedMessageLite<FitnessProto$OsaResult, Builder> implements FitnessProto$OsaResultOrBuilder {
    private static final FitnessProto$OsaResult DEFAULT_INSTANCE;
    public static final int OSA_LEVEL_FIELD_NUMBER = 1;
    private static volatile Parser<FitnessProto$OsaResult> PARSER = null;
    public static final int TIME_FIELD_NUMBER = 2;
    private int osaLevel_;
    private int time_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$OsaResult, Builder> implements FitnessProto$OsaResultOrBuilder {
        public Builder clearOsaLevel() {
            copyOnWrite();
            ((FitnessProto$OsaResult) this.instance).clearOsaLevel();
            return this;
        }

        public Builder clearTime() {
            copyOnWrite();
            ((FitnessProto$OsaResult) this.instance).clearTime();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$OsaResultOrBuilder
        public int getOsaLevel() {
            return ((FitnessProto$OsaResult) this.instance).getOsaLevel();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$OsaResultOrBuilder
        public int getTime() {
            return ((FitnessProto$OsaResult) this.instance).getTime();
        }

        public Builder setOsaLevel(int i) {
            copyOnWrite();
            ((FitnessProto$OsaResult) this.instance).setOsaLevel(i);
            return this;
        }

        public Builder setTime(int i) {
            copyOnWrite();
            ((FitnessProto$OsaResult) this.instance).setTime(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$OsaResult.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$OsaResult fitnessProto$OsaResult = new FitnessProto$OsaResult();
        DEFAULT_INSTANCE = fitnessProto$OsaResult;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$OsaResult.class, fitnessProto$OsaResult);
    }

    private FitnessProto$OsaResult() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsaLevel() {
        this.osaLevel_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTime() {
        this.time_ = 0;
    }

    public static FitnessProto$OsaResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$OsaResult parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$OsaResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$OsaResult parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$OsaResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$OsaResult> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsaLevel(int i) {
        this.osaLevel_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTime(int i) {
        this.time_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$OsaResult();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u000b", new Object[]{"osaLevel_", "time_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$OsaResult> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$OsaResult.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$OsaResultOrBuilder
    public int getOsaLevel() {
        return this.osaLevel_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$OsaResultOrBuilder
    public int getTime() {
        return this.time_;
    }

    public static Builder newBuilder(FitnessProto$OsaResult fitnessProto$OsaResult) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$OsaResult);
    }

    public static FitnessProto$OsaResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$OsaResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$OsaResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$OsaResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$OsaResult parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$OsaResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$OsaResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$OsaResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$OsaResult parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$OsaResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$OsaResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$OsaResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$OsaResult parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$OsaResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$OsaResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$OsaResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$OsaResult parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$OsaResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$OsaResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$OsaResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
