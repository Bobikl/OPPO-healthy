package com.heytap.wearable.health;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.dv6;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class Exercise$SampleConfig extends GeneratedMessageLite<Exercise$SampleConfig, Builder> implements Exercise$SampleConfigOrBuilder {
    public static final int BATCHING_MODE_FIELD_NUMBER = 1;
    private static final Exercise$SampleConfig DEFAULT_INSTANCE;
    private static volatile Parser<Exercise$SampleConfig> PARSER;
    private int batchingMode_;

    public static final class Builder extends GeneratedMessageLite.Builder<Exercise$SampleConfig, Builder> implements Exercise$SampleConfigOrBuilder {
        public Builder clearBatchingMode() {
            copyOnWrite();
            ((Exercise$SampleConfig) this.instance).clearBatchingMode();
            return this;
        }

        @Override // com.heytap.wearable.health.Exercise$SampleConfigOrBuilder
        public Exercise$BatchingMode getBatchingMode() {
            return ((Exercise$SampleConfig) this.instance).getBatchingMode();
        }

        @Override // com.heytap.wearable.health.Exercise$SampleConfigOrBuilder
        public int getBatchingModeValue() {
            return ((Exercise$SampleConfig) this.instance).getBatchingModeValue();
        }

        public Builder setBatchingMode(Exercise$BatchingMode exercise$BatchingMode) {
            copyOnWrite();
            ((Exercise$SampleConfig) this.instance).setBatchingMode(exercise$BatchingMode);
            return this;
        }

        public Builder setBatchingModeValue(int i) {
            copyOnWrite();
            ((Exercise$SampleConfig) this.instance).setBatchingModeValue(i);
            return this;
        }

        private Builder() {
            super(Exercise$SampleConfig.DEFAULT_INSTANCE);
        }
    }

    static {
        Exercise$SampleConfig exercise$SampleConfig = new Exercise$SampleConfig();
        DEFAULT_INSTANCE = exercise$SampleConfig;
        GeneratedMessageLite.registerDefaultInstance(Exercise$SampleConfig.class, exercise$SampleConfig);
    }

    private Exercise$SampleConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBatchingMode() {
        this.batchingMode_ = 0;
    }

    public static Exercise$SampleConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Exercise$SampleConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Exercise$SampleConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Exercise$SampleConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Exercise$SampleConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Exercise$SampleConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBatchingMode(Exercise$BatchingMode exercise$BatchingMode) {
        this.batchingMode_ = exercise$BatchingMode.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBatchingModeValue(int i) {
        this.batchingMode_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = dv6.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new Exercise$SampleConfig();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"batchingMode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Exercise$SampleConfig> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Exercise$SampleConfig.class) {
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

    @Override // com.heytap.wearable.health.Exercise$SampleConfigOrBuilder
    public Exercise$BatchingMode getBatchingMode() {
        Exercise$BatchingMode exercise$BatchingModeForNumber = Exercise$BatchingMode.forNumber(this.batchingMode_);
        return exercise$BatchingModeForNumber == null ? Exercise$BatchingMode.UNRECOGNIZED : exercise$BatchingModeForNumber;
    }

    @Override // com.heytap.wearable.health.Exercise$SampleConfigOrBuilder
    public int getBatchingModeValue() {
        return this.batchingMode_;
    }

    public static Builder newBuilder(Exercise$SampleConfig exercise$SampleConfig) {
        return DEFAULT_INSTANCE.createBuilder(exercise$SampleConfig);
    }

    public static Exercise$SampleConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Exercise$SampleConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Exercise$SampleConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Exercise$SampleConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Exercise$SampleConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Exercise$SampleConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Exercise$SampleConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Exercise$SampleConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Exercise$SampleConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Exercise$SampleConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Exercise$SampleConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Exercise$SampleConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Exercise$SampleConfig parseFrom(InputStream inputStream) throws IOException {
        return (Exercise$SampleConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Exercise$SampleConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Exercise$SampleConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Exercise$SampleConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Exercise$SampleConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Exercise$SampleConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Exercise$SampleConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
