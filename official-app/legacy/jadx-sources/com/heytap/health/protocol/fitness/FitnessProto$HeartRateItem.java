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
public final class FitnessProto$HeartRateItem extends GeneratedMessageLite<FitnessProto$HeartRateItem, Builder> implements FitnessProto$HeartRateItemOrBuilder {
    private static final FitnessProto$HeartRateItem DEFAULT_INSTANCE;
    public static final int HEART_RATE_FIELD_NUMBER = 2;
    private static volatile Parser<FitnessProto$HeartRateItem> PARSER = null;
    public static final int RELIABILITY_FIELD_NUMBER = 3;
    public static final int TIME_OFFSET_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 4;
    private int heartRate_;
    private int reliability_;
    private int timeOffset_;
    private int type_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$HeartRateItem, Builder> implements FitnessProto$HeartRateItemOrBuilder {
        public Builder clearHeartRate() {
            copyOnWrite();
            ((FitnessProto$HeartRateItem) this.instance).clearHeartRate();
            return this;
        }

        public Builder clearReliability() {
            copyOnWrite();
            ((FitnessProto$HeartRateItem) this.instance).clearReliability();
            return this;
        }

        public Builder clearTimeOffset() {
            copyOnWrite();
            ((FitnessProto$HeartRateItem) this.instance).clearTimeOffset();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((FitnessProto$HeartRateItem) this.instance).clearType();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateItemOrBuilder
        public int getHeartRate() {
            return ((FitnessProto$HeartRateItem) this.instance).getHeartRate();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateItemOrBuilder
        public int getReliability() {
            return ((FitnessProto$HeartRateItem) this.instance).getReliability();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateItemOrBuilder
        public int getTimeOffset() {
            return ((FitnessProto$HeartRateItem) this.instance).getTimeOffset();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateItemOrBuilder
        public int getType() {
            return ((FitnessProto$HeartRateItem) this.instance).getType();
        }

        public Builder setHeartRate(int i) {
            copyOnWrite();
            ((FitnessProto$HeartRateItem) this.instance).setHeartRate(i);
            return this;
        }

        public Builder setReliability(int i) {
            copyOnWrite();
            ((FitnessProto$HeartRateItem) this.instance).setReliability(i);
            return this;
        }

        public Builder setTimeOffset(int i) {
            copyOnWrite();
            ((FitnessProto$HeartRateItem) this.instance).setTimeOffset(i);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((FitnessProto$HeartRateItem) this.instance).setType(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$HeartRateItem.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$HeartRateItem fitnessProto$HeartRateItem = new FitnessProto$HeartRateItem();
        DEFAULT_INSTANCE = fitnessProto$HeartRateItem;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$HeartRateItem.class, fitnessProto$HeartRateItem);
    }

    private FitnessProto$HeartRateItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeartRate() {
        this.heartRate_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReliability() {
        this.reliability_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeOffset() {
        this.timeOffset_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static FitnessProto$HeartRateItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$HeartRateItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$HeartRateItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$HeartRateItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$HeartRateItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$HeartRateItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeartRate(int i) {
        this.heartRate_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReliability(int i) {
        this.reliability_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeOffset(int i) {
        this.timeOffset_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$HeartRateItem();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u000b", new Object[]{"timeOffset_", "heartRate_", "reliability_", "type_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$HeartRateItem> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$HeartRateItem.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateItemOrBuilder
    public int getHeartRate() {
        return this.heartRate_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateItemOrBuilder
    public int getReliability() {
        return this.reliability_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateItemOrBuilder
    public int getTimeOffset() {
        return this.timeOffset_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateItemOrBuilder
    public int getType() {
        return this.type_;
    }

    public static Builder newBuilder(FitnessProto$HeartRateItem fitnessProto$HeartRateItem) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$HeartRateItem);
    }

    public static FitnessProto$HeartRateItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$HeartRateItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$HeartRateItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$HeartRateItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$HeartRateItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$HeartRateItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$HeartRateItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$HeartRateItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$HeartRateItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$HeartRateItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$HeartRateItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$HeartRateItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$HeartRateItem parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$HeartRateItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$HeartRateItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$HeartRateItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$HeartRateItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$HeartRateItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$HeartRateItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$HeartRateItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
