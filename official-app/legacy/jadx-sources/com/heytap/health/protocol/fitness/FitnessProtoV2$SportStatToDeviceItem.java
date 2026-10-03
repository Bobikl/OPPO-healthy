package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.in7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FitnessProtoV2$SportStatToDeviceItem extends GeneratedMessageLite<FitnessProtoV2$SportStatToDeviceItem, Builder> implements FitnessProtoV2$SportStatToDeviceItemOrBuilder {
    private static final FitnessProtoV2$SportStatToDeviceItem DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProtoV2$SportStatToDeviceItem> PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    public static final int TOTAL_CALORIE_FIELD_NUMBER = 3;
    public static final int TOTAL_STEP_FIELD_NUMBER = 2;
    private int timestamp_;
    private int totalCalorie_;
    private int totalStep_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProtoV2$SportStatToDeviceItem, Builder> implements FitnessProtoV2$SportStatToDeviceItemOrBuilder {
        public Builder clearTimestamp() {
            copyOnWrite();
            ((FitnessProtoV2$SportStatToDeviceItem) this.instance).clearTimestamp();
            return this;
        }

        public Builder clearTotalCalorie() {
            copyOnWrite();
            ((FitnessProtoV2$SportStatToDeviceItem) this.instance).clearTotalCalorie();
            return this;
        }

        public Builder clearTotalStep() {
            copyOnWrite();
            ((FitnessProtoV2$SportStatToDeviceItem) this.instance).clearTotalStep();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportStatToDeviceItemOrBuilder
        public int getTimestamp() {
            return ((FitnessProtoV2$SportStatToDeviceItem) this.instance).getTimestamp();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportStatToDeviceItemOrBuilder
        public int getTotalCalorie() {
            return ((FitnessProtoV2$SportStatToDeviceItem) this.instance).getTotalCalorie();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportStatToDeviceItemOrBuilder
        public int getTotalStep() {
            return ((FitnessProtoV2$SportStatToDeviceItem) this.instance).getTotalStep();
        }

        public Builder setTimestamp(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportStatToDeviceItem) this.instance).setTimestamp(i);
            return this;
        }

        public Builder setTotalCalorie(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportStatToDeviceItem) this.instance).setTotalCalorie(i);
            return this;
        }

        public Builder setTotalStep(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportStatToDeviceItem) this.instance).setTotalStep(i);
            return this;
        }

        private Builder() {
            super(FitnessProtoV2$SportStatToDeviceItem.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProtoV2$SportStatToDeviceItem fitnessProtoV2$SportStatToDeviceItem = new FitnessProtoV2$SportStatToDeviceItem();
        DEFAULT_INSTANCE = fitnessProtoV2$SportStatToDeviceItem;
        GeneratedMessageLite.registerDefaultInstance(FitnessProtoV2$SportStatToDeviceItem.class, fitnessProtoV2$SportStatToDeviceItem);
    }

    private FitnessProtoV2$SportStatToDeviceItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalCalorie() {
        this.totalCalorie_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalStep() {
        this.totalStep_ = 0;
    }

    public static FitnessProtoV2$SportStatToDeviceItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProtoV2$SportStatToDeviceItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$SportStatToDeviceItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$SportStatToDeviceItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SportStatToDeviceItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProtoV2$SportStatToDeviceItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(int i) {
        this.timestamp_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalCalorie(int i) {
        this.totalCalorie_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalStep(int i) {
        this.totalStep_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = in7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProtoV2$SportStatToDeviceItem();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b", new Object[]{"timestamp_", "totalStep_", "totalCalorie_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProtoV2$SportStatToDeviceItem> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProtoV2$SportStatToDeviceItem.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportStatToDeviceItemOrBuilder
    public int getTimestamp() {
        return this.timestamp_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportStatToDeviceItemOrBuilder
    public int getTotalCalorie() {
        return this.totalCalorie_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportStatToDeviceItemOrBuilder
    public int getTotalStep() {
        return this.totalStep_;
    }

    public static Builder newBuilder(FitnessProtoV2$SportStatToDeviceItem fitnessProtoV2$SportStatToDeviceItem) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProtoV2$SportStatToDeviceItem);
    }

    public static FitnessProtoV2$SportStatToDeviceItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SportStatToDeviceItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SportStatToDeviceItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SportStatToDeviceItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProtoV2$SportStatToDeviceItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SportStatToDeviceItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProtoV2$SportStatToDeviceItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SportStatToDeviceItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProtoV2$SportStatToDeviceItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SportStatToDeviceItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProtoV2$SportStatToDeviceItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SportStatToDeviceItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProtoV2$SportStatToDeviceItem parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$SportStatToDeviceItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$SportStatToDeviceItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SportStatToDeviceItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SportStatToDeviceItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProtoV2$SportStatToDeviceItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProtoV2$SportStatToDeviceItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SportStatToDeviceItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
