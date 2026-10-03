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
public final class FitnessProto$StayUpBedTimeReminder extends GeneratedMessageLite<FitnessProto$StayUpBedTimeReminder, Builder> implements FitnessProto$StayUpBedTimeReminderOrBuilder {
    private static final FitnessProto$StayUpBedTimeReminder DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$StayUpBedTimeReminder> PARSER = null;
    public static final int STAY_UP_BED_TIME_FIELD_NUMBER = 1;
    public static final int STAY_UP_BED_TIME_SWITCH_FIELD_NUMBER = 2;
    private int stayUpBedTimeSwitch_;
    private int stayUpBedTime_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$StayUpBedTimeReminder, Builder> implements FitnessProto$StayUpBedTimeReminderOrBuilder {
        public Builder clearStayUpBedTime() {
            copyOnWrite();
            ((FitnessProto$StayUpBedTimeReminder) this.instance).clearStayUpBedTime();
            return this;
        }

        public Builder clearStayUpBedTimeSwitch() {
            copyOnWrite();
            ((FitnessProto$StayUpBedTimeReminder) this.instance).clearStayUpBedTimeSwitch();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$StayUpBedTimeReminderOrBuilder
        public int getStayUpBedTime() {
            return ((FitnessProto$StayUpBedTimeReminder) this.instance).getStayUpBedTime();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$StayUpBedTimeReminderOrBuilder
        public int getStayUpBedTimeSwitch() {
            return ((FitnessProto$StayUpBedTimeReminder) this.instance).getStayUpBedTimeSwitch();
        }

        public Builder setStayUpBedTime(int i) {
            copyOnWrite();
            ((FitnessProto$StayUpBedTimeReminder) this.instance).setStayUpBedTime(i);
            return this;
        }

        public Builder setStayUpBedTimeSwitch(int i) {
            copyOnWrite();
            ((FitnessProto$StayUpBedTimeReminder) this.instance).setStayUpBedTimeSwitch(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$StayUpBedTimeReminder.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$StayUpBedTimeReminder fitnessProto$StayUpBedTimeReminder = new FitnessProto$StayUpBedTimeReminder();
        DEFAULT_INSTANCE = fitnessProto$StayUpBedTimeReminder;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$StayUpBedTimeReminder.class, fitnessProto$StayUpBedTimeReminder);
    }

    private FitnessProto$StayUpBedTimeReminder() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStayUpBedTime() {
        this.stayUpBedTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStayUpBedTimeSwitch() {
        this.stayUpBedTimeSwitch_ = 0;
    }

    public static FitnessProto$StayUpBedTimeReminder getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$StayUpBedTimeReminder parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$StayUpBedTimeReminder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$StayUpBedTimeReminder parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$StayUpBedTimeReminder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$StayUpBedTimeReminder> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStayUpBedTime(int i) {
        this.stayUpBedTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStayUpBedTimeSwitch(int i) {
        this.stayUpBedTimeSwitch_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$StayUpBedTimeReminder();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"stayUpBedTime_", "stayUpBedTimeSwitch_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$StayUpBedTimeReminder> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$StayUpBedTimeReminder.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$StayUpBedTimeReminderOrBuilder
    public int getStayUpBedTime() {
        return this.stayUpBedTime_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$StayUpBedTimeReminderOrBuilder
    public int getStayUpBedTimeSwitch() {
        return this.stayUpBedTimeSwitch_;
    }

    public static Builder newBuilder(FitnessProto$StayUpBedTimeReminder fitnessProto$StayUpBedTimeReminder) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$StayUpBedTimeReminder);
    }

    public static FitnessProto$StayUpBedTimeReminder parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$StayUpBedTimeReminder) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$StayUpBedTimeReminder parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$StayUpBedTimeReminder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$StayUpBedTimeReminder parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$StayUpBedTimeReminder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$StayUpBedTimeReminder parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$StayUpBedTimeReminder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$StayUpBedTimeReminder parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$StayUpBedTimeReminder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$StayUpBedTimeReminder parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$StayUpBedTimeReminder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$StayUpBedTimeReminder parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$StayUpBedTimeReminder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$StayUpBedTimeReminder parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$StayUpBedTimeReminder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$StayUpBedTimeReminder parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$StayUpBedTimeReminder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$StayUpBedTimeReminder parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$StayUpBedTimeReminder) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
