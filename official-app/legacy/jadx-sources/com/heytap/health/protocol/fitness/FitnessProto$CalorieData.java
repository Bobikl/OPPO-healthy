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
public final class FitnessProto$CalorieData extends GeneratedMessageLite<FitnessProto$CalorieData, Builder> implements FitnessProto$CalorieDataOrBuilder {
    public static final int CALORIE_FIELD_NUMBER = 1;
    private static final FitnessProto$CalorieData DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$CalorieData> PARSER = null;
    public static final int STEP_FIELD_NUMBER = 2;
    public static final int TIMESTAMP_FIELD_NUMBER = 3;
    private int calorie_;
    private int step_;
    private int timestamp_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$CalorieData, Builder> implements FitnessProto$CalorieDataOrBuilder {
        public Builder clearCalorie() {
            copyOnWrite();
            ((FitnessProto$CalorieData) this.instance).clearCalorie();
            return this;
        }

        public Builder clearStep() {
            copyOnWrite();
            ((FitnessProto$CalorieData) this.instance).clearStep();
            return this;
        }

        public Builder clearTimestamp() {
            copyOnWrite();
            ((FitnessProto$CalorieData) this.instance).clearTimestamp();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$CalorieDataOrBuilder
        public int getCalorie() {
            return ((FitnessProto$CalorieData) this.instance).getCalorie();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$CalorieDataOrBuilder
        public int getStep() {
            return ((FitnessProto$CalorieData) this.instance).getStep();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$CalorieDataOrBuilder
        public int getTimestamp() {
            return ((FitnessProto$CalorieData) this.instance).getTimestamp();
        }

        public Builder setCalorie(int i) {
            copyOnWrite();
            ((FitnessProto$CalorieData) this.instance).setCalorie(i);
            return this;
        }

        public Builder setStep(int i) {
            copyOnWrite();
            ((FitnessProto$CalorieData) this.instance).setStep(i);
            return this;
        }

        public Builder setTimestamp(int i) {
            copyOnWrite();
            ((FitnessProto$CalorieData) this.instance).setTimestamp(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$CalorieData.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$CalorieData fitnessProto$CalorieData = new FitnessProto$CalorieData();
        DEFAULT_INSTANCE = fitnessProto$CalorieData;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$CalorieData.class, fitnessProto$CalorieData);
    }

    private FitnessProto$CalorieData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCalorie() {
        this.calorie_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStep() {
        this.step_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0;
    }

    public static FitnessProto$CalorieData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$CalorieData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$CalorieData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$CalorieData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$CalorieData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$CalorieData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCalorie(int i) {
        this.calorie_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStep(int i) {
        this.step_ = i;
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
                return new FitnessProto$CalorieData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b", new Object[]{"calorie_", "step_", "timestamp_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$CalorieData> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$CalorieData.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$CalorieDataOrBuilder
    public int getCalorie() {
        return this.calorie_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$CalorieDataOrBuilder
    public int getStep() {
        return this.step_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$CalorieDataOrBuilder
    public int getTimestamp() {
        return this.timestamp_;
    }

    public static Builder newBuilder(FitnessProto$CalorieData fitnessProto$CalorieData) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$CalorieData);
    }

    public static FitnessProto$CalorieData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$CalorieData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$CalorieData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$CalorieData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$CalorieData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$CalorieData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$CalorieData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$CalorieData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$CalorieData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$CalorieData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$CalorieData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$CalorieData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$CalorieData parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$CalorieData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$CalorieData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$CalorieData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$CalorieData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$CalorieData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$CalorieData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$CalorieData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
