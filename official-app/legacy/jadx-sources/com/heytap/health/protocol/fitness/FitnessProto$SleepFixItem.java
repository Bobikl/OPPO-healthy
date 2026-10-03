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
public final class FitnessProto$SleepFixItem extends GeneratedMessageLite<FitnessProto$SleepFixItem, Builder> implements FitnessProto$SleepFixItemOrBuilder {
    private static final FitnessProto$SleepFixItem DEFAULT_INSTANCE;
    public static final int LAST_SLEEP_DATA_TIME_FIELD_NUMBER = 4;
    private static volatile Parser<FitnessProto$SleepFixItem> PARSER = null;
    public static final int SLEEP_COST_FIELD_NUMBER = 3;
    public static final int SLEEP_IN_TIME_FIELD_NUMBER = 1;
    public static final int SLEEP_OUT_TIME_FIELD_NUMBER = 2;
    private int lastSleepDataTime_;
    private int sleepCost_;
    private int sleepInTime_;
    private int sleepOutTime_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$SleepFixItem, Builder> implements FitnessProto$SleepFixItemOrBuilder {
        public Builder clearLastSleepDataTime() {
            copyOnWrite();
            ((FitnessProto$SleepFixItem) this.instance).clearLastSleepDataTime();
            return this;
        }

        public Builder clearSleepCost() {
            copyOnWrite();
            ((FitnessProto$SleepFixItem) this.instance).clearSleepCost();
            return this;
        }

        public Builder clearSleepInTime() {
            copyOnWrite();
            ((FitnessProto$SleepFixItem) this.instance).clearSleepInTime();
            return this;
        }

        public Builder clearSleepOutTime() {
            copyOnWrite();
            ((FitnessProto$SleepFixItem) this.instance).clearSleepOutTime();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepFixItemOrBuilder
        public int getLastSleepDataTime() {
            return ((FitnessProto$SleepFixItem) this.instance).getLastSleepDataTime();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepFixItemOrBuilder
        public int getSleepCost() {
            return ((FitnessProto$SleepFixItem) this.instance).getSleepCost();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepFixItemOrBuilder
        public int getSleepInTime() {
            return ((FitnessProto$SleepFixItem) this.instance).getSleepInTime();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepFixItemOrBuilder
        public int getSleepOutTime() {
            return ((FitnessProto$SleepFixItem) this.instance).getSleepOutTime();
        }

        public Builder setLastSleepDataTime(int i) {
            copyOnWrite();
            ((FitnessProto$SleepFixItem) this.instance).setLastSleepDataTime(i);
            return this;
        }

        public Builder setSleepCost(int i) {
            copyOnWrite();
            ((FitnessProto$SleepFixItem) this.instance).setSleepCost(i);
            return this;
        }

        public Builder setSleepInTime(int i) {
            copyOnWrite();
            ((FitnessProto$SleepFixItem) this.instance).setSleepInTime(i);
            return this;
        }

        public Builder setSleepOutTime(int i) {
            copyOnWrite();
            ((FitnessProto$SleepFixItem) this.instance).setSleepOutTime(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$SleepFixItem.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$SleepFixItem fitnessProto$SleepFixItem = new FitnessProto$SleepFixItem();
        DEFAULT_INSTANCE = fitnessProto$SleepFixItem;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$SleepFixItem.class, fitnessProto$SleepFixItem);
    }

    private FitnessProto$SleepFixItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastSleepDataTime() {
        this.lastSleepDataTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSleepCost() {
        this.sleepCost_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSleepInTime() {
        this.sleepInTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSleepOutTime() {
        this.sleepOutTime_ = 0;
    }

    public static FitnessProto$SleepFixItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$SleepFixItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$SleepFixItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$SleepFixItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepFixItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$SleepFixItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastSleepDataTime(int i) {
        this.lastSleepDataTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSleepCost(int i) {
        this.sleepCost_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSleepInTime(int i) {
        this.sleepInTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSleepOutTime(int i) {
        this.sleepOutTime_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$SleepFixItem();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004", new Object[]{"sleepInTime_", "sleepOutTime_", "sleepCost_", "lastSleepDataTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$SleepFixItem> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$SleepFixItem.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepFixItemOrBuilder
    public int getLastSleepDataTime() {
        return this.lastSleepDataTime_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepFixItemOrBuilder
    public int getSleepCost() {
        return this.sleepCost_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepFixItemOrBuilder
    public int getSleepInTime() {
        return this.sleepInTime_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepFixItemOrBuilder
    public int getSleepOutTime() {
        return this.sleepOutTime_;
    }

    public static Builder newBuilder(FitnessProto$SleepFixItem fitnessProto$SleepFixItem) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$SleepFixItem);
    }

    public static FitnessProto$SleepFixItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SleepFixItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$SleepFixItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepFixItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$SleepFixItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepFixItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$SleepFixItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepFixItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$SleepFixItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepFixItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$SleepFixItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepFixItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$SleepFixItem parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$SleepFixItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$SleepFixItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SleepFixItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$SleepFixItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$SleepFixItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$SleepFixItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SleepFixItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
