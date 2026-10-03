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
public final class FitnessProto$RealtimeDataItem extends GeneratedMessageLite<FitnessProto$RealtimeDataItem, Builder> implements FitnessProto$RealtimeDataItemOrBuilder {
    private static final FitnessProto$RealtimeDataItem DEFAULT_INSTANCE;
    public static final int DISTANCE_FIELD_NUMBER = 7;
    public static final int ELEVATION_FIELD_NUMBER = 5;
    public static final int FREQUENCY_FIELD_NUMBER = 4;
    public static final int HEARTRATE_FIELD_NUMBER = 3;
    public static final int PACE_FIELD_NUMBER = 2;
    private static volatile Parser<FitnessProto$RealtimeDataItem> PARSER = null;
    public static final int STAMINA_FIELD_NUMBER = 8;
    public static final int STATE_FIELD_NUMBER = 6;
    public static final int STRIDE_FIELD_NUMBER = 9;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private int distance_;
    private int elevation_;
    private int frequency_;
    private int heartRate_;
    private int pace_;
    private int stamina_;
    private int state_;
    private int stride_;
    private int timeStamp_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$RealtimeDataItem, Builder> implements FitnessProto$RealtimeDataItemOrBuilder {
        public Builder clearDistance() {
            copyOnWrite();
            ((FitnessProto$RealtimeDataItem) this.instance).clearDistance();
            return this;
        }

        public Builder clearElevation() {
            copyOnWrite();
            ((FitnessProto$RealtimeDataItem) this.instance).clearElevation();
            return this;
        }

        public Builder clearFrequency() {
            copyOnWrite();
            ((FitnessProto$RealtimeDataItem) this.instance).clearFrequency();
            return this;
        }

        public Builder clearHeartRate() {
            copyOnWrite();
            ((FitnessProto$RealtimeDataItem) this.instance).clearHeartRate();
            return this;
        }

        public Builder clearPace() {
            copyOnWrite();
            ((FitnessProto$RealtimeDataItem) this.instance).clearPace();
            return this;
        }

        public Builder clearStamina() {
            copyOnWrite();
            ((FitnessProto$RealtimeDataItem) this.instance).clearStamina();
            return this;
        }

        public Builder clearState() {
            copyOnWrite();
            ((FitnessProto$RealtimeDataItem) this.instance).clearState();
            return this;
        }

        public Builder clearStride() {
            copyOnWrite();
            ((FitnessProto$RealtimeDataItem) this.instance).clearStride();
            return this;
        }

        public Builder clearTimeStamp() {
            copyOnWrite();
            ((FitnessProto$RealtimeDataItem) this.instance).clearTimeStamp();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$RealtimeDataItemOrBuilder
        public int getDistance() {
            return ((FitnessProto$RealtimeDataItem) this.instance).getDistance();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$RealtimeDataItemOrBuilder
        public int getElevation() {
            return ((FitnessProto$RealtimeDataItem) this.instance).getElevation();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$RealtimeDataItemOrBuilder
        public int getFrequency() {
            return ((FitnessProto$RealtimeDataItem) this.instance).getFrequency();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$RealtimeDataItemOrBuilder
        public int getHeartRate() {
            return ((FitnessProto$RealtimeDataItem) this.instance).getHeartRate();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$RealtimeDataItemOrBuilder
        public int getPace() {
            return ((FitnessProto$RealtimeDataItem) this.instance).getPace();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$RealtimeDataItemOrBuilder
        public int getStamina() {
            return ((FitnessProto$RealtimeDataItem) this.instance).getStamina();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$RealtimeDataItemOrBuilder
        public int getState() {
            return ((FitnessProto$RealtimeDataItem) this.instance).getState();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$RealtimeDataItemOrBuilder
        public int getStride() {
            return ((FitnessProto$RealtimeDataItem) this.instance).getStride();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$RealtimeDataItemOrBuilder
        public int getTimeStamp() {
            return ((FitnessProto$RealtimeDataItem) this.instance).getTimeStamp();
        }

        public Builder setDistance(int i) {
            copyOnWrite();
            ((FitnessProto$RealtimeDataItem) this.instance).setDistance(i);
            return this;
        }

        public Builder setElevation(int i) {
            copyOnWrite();
            ((FitnessProto$RealtimeDataItem) this.instance).setElevation(i);
            return this;
        }

        public Builder setFrequency(int i) {
            copyOnWrite();
            ((FitnessProto$RealtimeDataItem) this.instance).setFrequency(i);
            return this;
        }

        public Builder setHeartRate(int i) {
            copyOnWrite();
            ((FitnessProto$RealtimeDataItem) this.instance).setHeartRate(i);
            return this;
        }

        public Builder setPace(int i) {
            copyOnWrite();
            ((FitnessProto$RealtimeDataItem) this.instance).setPace(i);
            return this;
        }

        public Builder setStamina(int i) {
            copyOnWrite();
            ((FitnessProto$RealtimeDataItem) this.instance).setStamina(i);
            return this;
        }

        public Builder setState(int i) {
            copyOnWrite();
            ((FitnessProto$RealtimeDataItem) this.instance).setState(i);
            return this;
        }

        public Builder setStride(int i) {
            copyOnWrite();
            ((FitnessProto$RealtimeDataItem) this.instance).setStride(i);
            return this;
        }

        public Builder setTimeStamp(int i) {
            copyOnWrite();
            ((FitnessProto$RealtimeDataItem) this.instance).setTimeStamp(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$RealtimeDataItem.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$RealtimeDataItem fitnessProto$RealtimeDataItem = new FitnessProto$RealtimeDataItem();
        DEFAULT_INSTANCE = fitnessProto$RealtimeDataItem;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$RealtimeDataItem.class, fitnessProto$RealtimeDataItem);
    }

    private FitnessProto$RealtimeDataItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistance() {
        this.distance_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearElevation() {
        this.elevation_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFrequency() {
        this.frequency_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeartRate() {
        this.heartRate_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPace() {
        this.pace_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStamina() {
        this.stamina_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStride() {
        this.stride_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeStamp() {
        this.timeStamp_ = 0;
    }

    public static FitnessProto$RealtimeDataItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$RealtimeDataItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$RealtimeDataItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$RealtimeDataItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$RealtimeDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$RealtimeDataItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistance(int i) {
        this.distance_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setElevation(int i) {
        this.elevation_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrequency(int i) {
        this.frequency_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeartRate(int i) {
        this.heartRate_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPace(int i) {
        this.pace_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStamina(int i) {
        this.stamina_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(int i) {
        this.state_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStride(int i) {
        this.stride_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeStamp(int i) {
        this.timeStamp_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$RealtimeDataItem();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u000b\u0005\u0004\u0006\u000b\u0007\u000b\b\u000b\t\u000b", new Object[]{"timeStamp_", "pace_", "heartRate_", "frequency_", "elevation_", "state_", "distance_", "stamina_", "stride_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$RealtimeDataItem> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$RealtimeDataItem.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$RealtimeDataItemOrBuilder
    public int getDistance() {
        return this.distance_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$RealtimeDataItemOrBuilder
    public int getElevation() {
        return this.elevation_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$RealtimeDataItemOrBuilder
    public int getFrequency() {
        return this.frequency_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$RealtimeDataItemOrBuilder
    public int getHeartRate() {
        return this.heartRate_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$RealtimeDataItemOrBuilder
    public int getPace() {
        return this.pace_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$RealtimeDataItemOrBuilder
    public int getStamina() {
        return this.stamina_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$RealtimeDataItemOrBuilder
    public int getState() {
        return this.state_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$RealtimeDataItemOrBuilder
    public int getStride() {
        return this.stride_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$RealtimeDataItemOrBuilder
    public int getTimeStamp() {
        return this.timeStamp_;
    }

    public static Builder newBuilder(FitnessProto$RealtimeDataItem fitnessProto$RealtimeDataItem) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$RealtimeDataItem);
    }

    public static FitnessProto$RealtimeDataItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$RealtimeDataItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$RealtimeDataItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$RealtimeDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$RealtimeDataItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$RealtimeDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$RealtimeDataItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$RealtimeDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$RealtimeDataItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$RealtimeDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$RealtimeDataItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$RealtimeDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$RealtimeDataItem parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$RealtimeDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$RealtimeDataItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$RealtimeDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$RealtimeDataItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$RealtimeDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$RealtimeDataItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$RealtimeDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
