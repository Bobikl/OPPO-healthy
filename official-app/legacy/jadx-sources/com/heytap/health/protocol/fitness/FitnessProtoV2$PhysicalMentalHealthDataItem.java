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
public final class FitnessProtoV2$PhysicalMentalHealthDataItem extends GeneratedMessageLite<FitnessProtoV2$PhysicalMentalHealthDataItem, Builder> implements FitnessProtoV2$PhysicalMentalHealthDataItemOrBuilder {
    private static final FitnessProtoV2$PhysicalMentalHealthDataItem DEFAULT_INSTANCE;
    public static final int HRV_FIELD_NUMBER = 3;
    public static final int MINUTE_OFFSET_FIELD_NUMBER = 1;
    private static volatile Parser<FitnessProtoV2$PhysicalMentalHealthDataItem> PARSER = null;
    public static final int STRESS_STATE_FIELD_NUMBER = 5;
    public static final int STRESS_VALUE_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int hrv_;
    private int minuteOffset_;
    private int stressState_;
    private int stressValue_;
    private int type_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProtoV2$PhysicalMentalHealthDataItem, Builder> implements FitnessProtoV2$PhysicalMentalHealthDataItemOrBuilder {
        public Builder clearHrv() {
            copyOnWrite();
            ((FitnessProtoV2$PhysicalMentalHealthDataItem) this.instance).clearHrv();
            return this;
        }

        public Builder clearMinuteOffset() {
            copyOnWrite();
            ((FitnessProtoV2$PhysicalMentalHealthDataItem) this.instance).clearMinuteOffset();
            return this;
        }

        public Builder clearStressState() {
            copyOnWrite();
            ((FitnessProtoV2$PhysicalMentalHealthDataItem) this.instance).clearStressState();
            return this;
        }

        public Builder clearStressValue() {
            copyOnWrite();
            ((FitnessProtoV2$PhysicalMentalHealthDataItem) this.instance).clearStressValue();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((FitnessProtoV2$PhysicalMentalHealthDataItem) this.instance).clearType();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$PhysicalMentalHealthDataItemOrBuilder
        public int getHrv() {
            return ((FitnessProtoV2$PhysicalMentalHealthDataItem) this.instance).getHrv();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$PhysicalMentalHealthDataItemOrBuilder
        public int getMinuteOffset() {
            return ((FitnessProtoV2$PhysicalMentalHealthDataItem) this.instance).getMinuteOffset();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$PhysicalMentalHealthDataItemOrBuilder
        public int getStressState() {
            return ((FitnessProtoV2$PhysicalMentalHealthDataItem) this.instance).getStressState();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$PhysicalMentalHealthDataItemOrBuilder
        public int getStressValue() {
            return ((FitnessProtoV2$PhysicalMentalHealthDataItem) this.instance).getStressValue();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$PhysicalMentalHealthDataItemOrBuilder
        public int getType() {
            return ((FitnessProtoV2$PhysicalMentalHealthDataItem) this.instance).getType();
        }

        public Builder setHrv(int i) {
            copyOnWrite();
            ((FitnessProtoV2$PhysicalMentalHealthDataItem) this.instance).setHrv(i);
            return this;
        }

        public Builder setMinuteOffset(int i) {
            copyOnWrite();
            ((FitnessProtoV2$PhysicalMentalHealthDataItem) this.instance).setMinuteOffset(i);
            return this;
        }

        public Builder setStressState(int i) {
            copyOnWrite();
            ((FitnessProtoV2$PhysicalMentalHealthDataItem) this.instance).setStressState(i);
            return this;
        }

        public Builder setStressValue(int i) {
            copyOnWrite();
            ((FitnessProtoV2$PhysicalMentalHealthDataItem) this.instance).setStressValue(i);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((FitnessProtoV2$PhysicalMentalHealthDataItem) this.instance).setType(i);
            return this;
        }

        private Builder() {
            super(FitnessProtoV2$PhysicalMentalHealthDataItem.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProtoV2$PhysicalMentalHealthDataItem fitnessProtoV2$PhysicalMentalHealthDataItem = new FitnessProtoV2$PhysicalMentalHealthDataItem();
        DEFAULT_INSTANCE = fitnessProtoV2$PhysicalMentalHealthDataItem;
        GeneratedMessageLite.registerDefaultInstance(FitnessProtoV2$PhysicalMentalHealthDataItem.class, fitnessProtoV2$PhysicalMentalHealthDataItem);
    }

    private FitnessProtoV2$PhysicalMentalHealthDataItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHrv() {
        this.hrv_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinuteOffset() {
        this.minuteOffset_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStressState() {
        this.stressState_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStressValue() {
        this.stressValue_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static FitnessProtoV2$PhysicalMentalHealthDataItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProtoV2$PhysicalMentalHealthDataItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$PhysicalMentalHealthDataItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$PhysicalMentalHealthDataItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$PhysicalMentalHealthDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProtoV2$PhysicalMentalHealthDataItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHrv(int i) {
        this.hrv_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinuteOffset(int i) {
        this.minuteOffset_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStressState(int i) {
        this.stressState_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStressValue(int i) {
        this.stressValue_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = in7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProtoV2$PhysicalMentalHealthDataItem();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u000b\u0005\u000b", new Object[]{"minuteOffset_", "type_", "hrv_", "stressValue_", "stressState_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProtoV2$PhysicalMentalHealthDataItem> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProtoV2$PhysicalMentalHealthDataItem.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$PhysicalMentalHealthDataItemOrBuilder
    public int getHrv() {
        return this.hrv_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$PhysicalMentalHealthDataItemOrBuilder
    public int getMinuteOffset() {
        return this.minuteOffset_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$PhysicalMentalHealthDataItemOrBuilder
    public int getStressState() {
        return this.stressState_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$PhysicalMentalHealthDataItemOrBuilder
    public int getStressValue() {
        return this.stressValue_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$PhysicalMentalHealthDataItemOrBuilder
    public int getType() {
        return this.type_;
    }

    public static Builder newBuilder(FitnessProtoV2$PhysicalMentalHealthDataItem fitnessProtoV2$PhysicalMentalHealthDataItem) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProtoV2$PhysicalMentalHealthDataItem);
    }

    public static FitnessProtoV2$PhysicalMentalHealthDataItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$PhysicalMentalHealthDataItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$PhysicalMentalHealthDataItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$PhysicalMentalHealthDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProtoV2$PhysicalMentalHealthDataItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$PhysicalMentalHealthDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProtoV2$PhysicalMentalHealthDataItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$PhysicalMentalHealthDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProtoV2$PhysicalMentalHealthDataItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$PhysicalMentalHealthDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProtoV2$PhysicalMentalHealthDataItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$PhysicalMentalHealthDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProtoV2$PhysicalMentalHealthDataItem parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$PhysicalMentalHealthDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$PhysicalMentalHealthDataItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$PhysicalMentalHealthDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$PhysicalMentalHealthDataItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProtoV2$PhysicalMentalHealthDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProtoV2$PhysicalMentalHealthDataItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$PhysicalMentalHealthDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
