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
public final class FitnessProto$SleepCalibrateDataItem extends GeneratedMessageLite<FitnessProto$SleepCalibrateDataItem, Builder> implements FitnessProto$SleepCalibrateDataItemOrBuilder {
    public static final int CALIBRATE_TYPE_FIELD_NUMBER = 1;
    private static final FitnessProto$SleepCalibrateDataItem DEFAULT_INSTANCE;
    public static final int END_TIMESTAMP_FIELD_NUMBER = 3;
    private static volatile Parser<FitnessProto$SleepCalibrateDataItem> PARSER = null;
    public static final int START_TIMESTAMP_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 4;
    private int calibrateType_;
    private int endTimestamp_;
    private int startTimestamp_;
    private int status_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$SleepCalibrateDataItem, Builder> implements FitnessProto$SleepCalibrateDataItemOrBuilder {
        public Builder clearCalibrateType() {
            copyOnWrite();
            ((FitnessProto$SleepCalibrateDataItem) this.instance).clearCalibrateType();
            return this;
        }

        public Builder clearEndTimestamp() {
            copyOnWrite();
            ((FitnessProto$SleepCalibrateDataItem) this.instance).clearEndTimestamp();
            return this;
        }

        public Builder clearStartTimestamp() {
            copyOnWrite();
            ((FitnessProto$SleepCalibrateDataItem) this.instance).clearStartTimestamp();
            return this;
        }

        public Builder clearStatus() {
            copyOnWrite();
            ((FitnessProto$SleepCalibrateDataItem) this.instance).clearStatus();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepCalibrateDataItemOrBuilder
        public int getCalibrateType() {
            return ((FitnessProto$SleepCalibrateDataItem) this.instance).getCalibrateType();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepCalibrateDataItemOrBuilder
        public int getEndTimestamp() {
            return ((FitnessProto$SleepCalibrateDataItem) this.instance).getEndTimestamp();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepCalibrateDataItemOrBuilder
        public int getStartTimestamp() {
            return ((FitnessProto$SleepCalibrateDataItem) this.instance).getStartTimestamp();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepCalibrateDataItemOrBuilder
        public int getStatus() {
            return ((FitnessProto$SleepCalibrateDataItem) this.instance).getStatus();
        }

        public Builder setCalibrateType(int i) {
            copyOnWrite();
            ((FitnessProto$SleepCalibrateDataItem) this.instance).setCalibrateType(i);
            return this;
        }

        public Builder setEndTimestamp(int i) {
            copyOnWrite();
            ((FitnessProto$SleepCalibrateDataItem) this.instance).setEndTimestamp(i);
            return this;
        }

        public Builder setStartTimestamp(int i) {
            copyOnWrite();
            ((FitnessProto$SleepCalibrateDataItem) this.instance).setStartTimestamp(i);
            return this;
        }

        public Builder setStatus(int i) {
            copyOnWrite();
            ((FitnessProto$SleepCalibrateDataItem) this.instance).setStatus(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$SleepCalibrateDataItem.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$SleepCalibrateDataItem fitnessProto$SleepCalibrateDataItem = new FitnessProto$SleepCalibrateDataItem();
        DEFAULT_INSTANCE = fitnessProto$SleepCalibrateDataItem;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$SleepCalibrateDataItem.class, fitnessProto$SleepCalibrateDataItem);
    }

    private FitnessProto$SleepCalibrateDataItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCalibrateType() {
        this.calibrateType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndTimestamp() {
        this.endTimestamp_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTimestamp() {
        this.startTimestamp_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = 0;
    }

    public static FitnessProto$SleepCalibrateDataItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$SleepCalibrateDataItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$SleepCalibrateDataItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$SleepCalibrateDataItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepCalibrateDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$SleepCalibrateDataItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCalibrateType(int i) {
        this.calibrateType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndTimestamp(int i) {
        this.endTimestamp_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTimestamp(int i) {
        this.startTimestamp_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(int i) {
        this.status_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$SleepCalibrateDataItem();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u000b", new Object[]{"calibrateType_", "startTimestamp_", "endTimestamp_", "status_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$SleepCalibrateDataItem> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$SleepCalibrateDataItem.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepCalibrateDataItemOrBuilder
    public int getCalibrateType() {
        return this.calibrateType_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepCalibrateDataItemOrBuilder
    public int getEndTimestamp() {
        return this.endTimestamp_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepCalibrateDataItemOrBuilder
    public int getStartTimestamp() {
        return this.startTimestamp_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepCalibrateDataItemOrBuilder
    public int getStatus() {
        return this.status_;
    }

    public static Builder newBuilder(FitnessProto$SleepCalibrateDataItem fitnessProto$SleepCalibrateDataItem) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$SleepCalibrateDataItem);
    }

    public static FitnessProto$SleepCalibrateDataItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SleepCalibrateDataItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$SleepCalibrateDataItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepCalibrateDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$SleepCalibrateDataItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepCalibrateDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$SleepCalibrateDataItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepCalibrateDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$SleepCalibrateDataItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepCalibrateDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$SleepCalibrateDataItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepCalibrateDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$SleepCalibrateDataItem parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$SleepCalibrateDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$SleepCalibrateDataItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SleepCalibrateDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$SleepCalibrateDataItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$SleepCalibrateDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$SleepCalibrateDataItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SleepCalibrateDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
