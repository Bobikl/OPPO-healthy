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
public final class FitnessProto$BloodSugarDeviceState extends GeneratedMessageLite<FitnessProto$BloodSugarDeviceState, Builder> implements FitnessProto$BloodSugarDeviceStateOrBuilder {
    public static final int ACTIVATION_TIMESTAMP_FIELD_NUMBER = 5;
    private static final FitnessProto$BloodSugarDeviceState DEFAULT_INSTANCE;
    public static final int IS_DEVICE_AVAILABLE_FIELD_NUMBER = 2;
    private static volatile Parser<FitnessProto$BloodSugarDeviceState> PARSER = null;
    public static final int TARGET_RANGE_HIGH_FIELD_NUMBER = 3;
    public static final int TARGET_RANGE_LOW_FIELD_NUMBER = 4;
    public static final int TIME_STAMP_FIELD_NUMBER = 1;
    private int activationTimestamp_;
    private int isDeviceAvailable_;
    private int targetRangeHigh_;
    private int targetRangeLow_;
    private int timeStamp_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$BloodSugarDeviceState, Builder> implements FitnessProto$BloodSugarDeviceStateOrBuilder {
        public Builder clearActivationTimestamp() {
            copyOnWrite();
            ((FitnessProto$BloodSugarDeviceState) this.instance).clearActivationTimestamp();
            return this;
        }

        public Builder clearIsDeviceAvailable() {
            copyOnWrite();
            ((FitnessProto$BloodSugarDeviceState) this.instance).clearIsDeviceAvailable();
            return this;
        }

        public Builder clearTargetRangeHigh() {
            copyOnWrite();
            ((FitnessProto$BloodSugarDeviceState) this.instance).clearTargetRangeHigh();
            return this;
        }

        public Builder clearTargetRangeLow() {
            copyOnWrite();
            ((FitnessProto$BloodSugarDeviceState) this.instance).clearTargetRangeLow();
            return this;
        }

        public Builder clearTimeStamp() {
            copyOnWrite();
            ((FitnessProto$BloodSugarDeviceState) this.instance).clearTimeStamp();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$BloodSugarDeviceStateOrBuilder
        public int getActivationTimestamp() {
            return ((FitnessProto$BloodSugarDeviceState) this.instance).getActivationTimestamp();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$BloodSugarDeviceStateOrBuilder
        public int getIsDeviceAvailable() {
            return ((FitnessProto$BloodSugarDeviceState) this.instance).getIsDeviceAvailable();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$BloodSugarDeviceStateOrBuilder
        public int getTargetRangeHigh() {
            return ((FitnessProto$BloodSugarDeviceState) this.instance).getTargetRangeHigh();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$BloodSugarDeviceStateOrBuilder
        public int getTargetRangeLow() {
            return ((FitnessProto$BloodSugarDeviceState) this.instance).getTargetRangeLow();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$BloodSugarDeviceStateOrBuilder
        public int getTimeStamp() {
            return ((FitnessProto$BloodSugarDeviceState) this.instance).getTimeStamp();
        }

        public Builder setActivationTimestamp(int i) {
            copyOnWrite();
            ((FitnessProto$BloodSugarDeviceState) this.instance).setActivationTimestamp(i);
            return this;
        }

        public Builder setIsDeviceAvailable(int i) {
            copyOnWrite();
            ((FitnessProto$BloodSugarDeviceState) this.instance).setIsDeviceAvailable(i);
            return this;
        }

        public Builder setTargetRangeHigh(int i) {
            copyOnWrite();
            ((FitnessProto$BloodSugarDeviceState) this.instance).setTargetRangeHigh(i);
            return this;
        }

        public Builder setTargetRangeLow(int i) {
            copyOnWrite();
            ((FitnessProto$BloodSugarDeviceState) this.instance).setTargetRangeLow(i);
            return this;
        }

        public Builder setTimeStamp(int i) {
            copyOnWrite();
            ((FitnessProto$BloodSugarDeviceState) this.instance).setTimeStamp(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$BloodSugarDeviceState.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$BloodSugarDeviceState fitnessProto$BloodSugarDeviceState = new FitnessProto$BloodSugarDeviceState();
        DEFAULT_INSTANCE = fitnessProto$BloodSugarDeviceState;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$BloodSugarDeviceState.class, fitnessProto$BloodSugarDeviceState);
    }

    private FitnessProto$BloodSugarDeviceState() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivationTimestamp() {
        this.activationTimestamp_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsDeviceAvailable() {
        this.isDeviceAvailable_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTargetRangeHigh() {
        this.targetRangeHigh_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTargetRangeLow() {
        this.targetRangeLow_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeStamp() {
        this.timeStamp_ = 0;
    }

    public static FitnessProto$BloodSugarDeviceState getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$BloodSugarDeviceState parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$BloodSugarDeviceState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$BloodSugarDeviceState parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$BloodSugarDeviceState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$BloodSugarDeviceState> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivationTimestamp(int i) {
        this.activationTimestamp_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsDeviceAvailable(int i) {
        this.isDeviceAvailable_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetRangeHigh(int i) {
        this.targetRangeHigh_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetRangeLow(int i) {
        this.targetRangeLow_ = i;
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
                return new FitnessProto$BloodSugarDeviceState();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u0004\u0004\u0004\u0005\u000b", new Object[]{"timeStamp_", "isDeviceAvailable_", "targetRangeHigh_", "targetRangeLow_", "activationTimestamp_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$BloodSugarDeviceState> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$BloodSugarDeviceState.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$BloodSugarDeviceStateOrBuilder
    public int getActivationTimestamp() {
        return this.activationTimestamp_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$BloodSugarDeviceStateOrBuilder
    public int getIsDeviceAvailable() {
        return this.isDeviceAvailable_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$BloodSugarDeviceStateOrBuilder
    public int getTargetRangeHigh() {
        return this.targetRangeHigh_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$BloodSugarDeviceStateOrBuilder
    public int getTargetRangeLow() {
        return this.targetRangeLow_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$BloodSugarDeviceStateOrBuilder
    public int getTimeStamp() {
        return this.timeStamp_;
    }

    public static Builder newBuilder(FitnessProto$BloodSugarDeviceState fitnessProto$BloodSugarDeviceState) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$BloodSugarDeviceState);
    }

    public static FitnessProto$BloodSugarDeviceState parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$BloodSugarDeviceState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$BloodSugarDeviceState parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$BloodSugarDeviceState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$BloodSugarDeviceState parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$BloodSugarDeviceState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$BloodSugarDeviceState parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$BloodSugarDeviceState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$BloodSugarDeviceState parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$BloodSugarDeviceState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$BloodSugarDeviceState parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$BloodSugarDeviceState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$BloodSugarDeviceState parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$BloodSugarDeviceState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$BloodSugarDeviceState parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$BloodSugarDeviceState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$BloodSugarDeviceState parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$BloodSugarDeviceState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$BloodSugarDeviceState parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$BloodSugarDeviceState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
