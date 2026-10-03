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
public final class FitnessProto$BedTimeReminder extends GeneratedMessageLite<FitnessProto$BedTimeReminder, Builder> implements FitnessProto$BedTimeReminderOrBuilder {
    public static final int BED_TIME_SWITCH_FIELD_NUMBER = 2;
    public static final int BED_TIME_TYPE_FIELD_NUMBER = 3;
    private static final FitnessProto$BedTimeReminder DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$BedTimeReminder> PARSER = null;
    public static final int REMINDER_BED_TIME_FIELD_NUMBER = 1;
    private int bedTimeSwitch_;
    private int bedTimeType_;
    private int reminderBedTime_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$BedTimeReminder, Builder> implements FitnessProto$BedTimeReminderOrBuilder {
        public Builder clearBedTimeSwitch() {
            copyOnWrite();
            ((FitnessProto$BedTimeReminder) this.instance).clearBedTimeSwitch();
            return this;
        }

        public Builder clearBedTimeType() {
            copyOnWrite();
            ((FitnessProto$BedTimeReminder) this.instance).clearBedTimeType();
            return this;
        }

        public Builder clearReminderBedTime() {
            copyOnWrite();
            ((FitnessProto$BedTimeReminder) this.instance).clearReminderBedTime();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$BedTimeReminderOrBuilder
        public int getBedTimeSwitch() {
            return ((FitnessProto$BedTimeReminder) this.instance).getBedTimeSwitch();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$BedTimeReminderOrBuilder
        public int getBedTimeType() {
            return ((FitnessProto$BedTimeReminder) this.instance).getBedTimeType();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$BedTimeReminderOrBuilder
        public int getReminderBedTime() {
            return ((FitnessProto$BedTimeReminder) this.instance).getReminderBedTime();
        }

        public Builder setBedTimeSwitch(int i) {
            copyOnWrite();
            ((FitnessProto$BedTimeReminder) this.instance).setBedTimeSwitch(i);
            return this;
        }

        public Builder setBedTimeType(int i) {
            copyOnWrite();
            ((FitnessProto$BedTimeReminder) this.instance).setBedTimeType(i);
            return this;
        }

        public Builder setReminderBedTime(int i) {
            copyOnWrite();
            ((FitnessProto$BedTimeReminder) this.instance).setReminderBedTime(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$BedTimeReminder.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$BedTimeReminder fitnessProto$BedTimeReminder = new FitnessProto$BedTimeReminder();
        DEFAULT_INSTANCE = fitnessProto$BedTimeReminder;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$BedTimeReminder.class, fitnessProto$BedTimeReminder);
    }

    private FitnessProto$BedTimeReminder() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBedTimeSwitch() {
        this.bedTimeSwitch_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBedTimeType() {
        this.bedTimeType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReminderBedTime() {
        this.reminderBedTime_ = 0;
    }

    public static FitnessProto$BedTimeReminder getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$BedTimeReminder parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$BedTimeReminder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$BedTimeReminder parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$BedTimeReminder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$BedTimeReminder> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBedTimeSwitch(int i) {
        this.bedTimeSwitch_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBedTimeType(int i) {
        this.bedTimeType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReminderBedTime(int i) {
        this.reminderBedTime_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$BedTimeReminder();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"reminderBedTime_", "bedTimeSwitch_", "bedTimeType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$BedTimeReminder> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$BedTimeReminder.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$BedTimeReminderOrBuilder
    public int getBedTimeSwitch() {
        return this.bedTimeSwitch_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$BedTimeReminderOrBuilder
    public int getBedTimeType() {
        return this.bedTimeType_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$BedTimeReminderOrBuilder
    public int getReminderBedTime() {
        return this.reminderBedTime_;
    }

    public static Builder newBuilder(FitnessProto$BedTimeReminder fitnessProto$BedTimeReminder) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$BedTimeReminder);
    }

    public static FitnessProto$BedTimeReminder parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$BedTimeReminder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$BedTimeReminder parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$BedTimeReminder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$BedTimeReminder parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$BedTimeReminder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$BedTimeReminder parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$BedTimeReminder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$BedTimeReminder parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$BedTimeReminder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$BedTimeReminder parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$BedTimeReminder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$BedTimeReminder parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$BedTimeReminder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$BedTimeReminder parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$BedTimeReminder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$BedTimeReminder parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$BedTimeReminder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$BedTimeReminder parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$BedTimeReminder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
