package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.model.ko7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes17.dex */
public final class FitnessProtoV2$SedentaryReminderSettingsData extends GeneratedMessageLite<FitnessProtoV2$SedentaryReminderSettingsData, Builder> implements FitnessProtoV2$SedentaryReminderSettingsDataOrBuilder {
    private static final FitnessProtoV2$SedentaryReminderSettingsData DEFAULT_INSTANCE;
    public static final int DISABLEINLUNCHBREAK_FIELD_NUMBER = 2;
    private static volatile Parser<FitnessProtoV2$SedentaryReminderSettingsData> PARSER = null;
    public static final int RESUMEACTIVITYREMINDER_FIELD_NUMBER = 3;
    public static final int SEDENTARYSWITCH_FIELD_NUMBER = 1;
    private int bitField0_;
    private FitnessProtoV2$SettingsEnableData disableInLunchBreak_;
    private FitnessProtoV2$SettingsEnableData resumeActivityReminder_;
    private FitnessProtoV2$SettingsEnableData sedentarySwitch_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProtoV2$SedentaryReminderSettingsData, Builder> implements FitnessProtoV2$SedentaryReminderSettingsDataOrBuilder {
        public Builder clearDisableInLunchBreak() {
            copyOnWrite();
            ((FitnessProtoV2$SedentaryReminderSettingsData) ((GeneratedMessageLite.Builder) this).instance).clearDisableInLunchBreak();
            return this;
        }

        public Builder clearResumeActivityReminder() {
            copyOnWrite();
            ((FitnessProtoV2$SedentaryReminderSettingsData) ((GeneratedMessageLite.Builder) this).instance).clearResumeActivityReminder();
            return this;
        }

        public Builder clearSedentarySwitch() {
            copyOnWrite();
            ((FitnessProtoV2$SedentaryReminderSettingsData) ((GeneratedMessageLite.Builder) this).instance).clearSedentarySwitch();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SedentaryReminderSettingsDataOrBuilder
        public FitnessProtoV2$SettingsEnableData getDisableInLunchBreak() {
            return ((FitnessProtoV2$SedentaryReminderSettingsData) ((GeneratedMessageLite.Builder) this).instance).getDisableInLunchBreak();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SedentaryReminderSettingsDataOrBuilder
        public FitnessProtoV2$SettingsEnableData getResumeActivityReminder() {
            return ((FitnessProtoV2$SedentaryReminderSettingsData) ((GeneratedMessageLite.Builder) this).instance).getResumeActivityReminder();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SedentaryReminderSettingsDataOrBuilder
        public FitnessProtoV2$SettingsEnableData getSedentarySwitch() {
            return ((FitnessProtoV2$SedentaryReminderSettingsData) ((GeneratedMessageLite.Builder) this).instance).getSedentarySwitch();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SedentaryReminderSettingsDataOrBuilder
        public boolean hasDisableInLunchBreak() {
            return ((FitnessProtoV2$SedentaryReminderSettingsData) ((GeneratedMessageLite.Builder) this).instance).hasDisableInLunchBreak();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SedentaryReminderSettingsDataOrBuilder
        public boolean hasResumeActivityReminder() {
            return ((FitnessProtoV2$SedentaryReminderSettingsData) ((GeneratedMessageLite.Builder) this).instance).hasResumeActivityReminder();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SedentaryReminderSettingsDataOrBuilder
        public boolean hasSedentarySwitch() {
            return ((FitnessProtoV2$SedentaryReminderSettingsData) ((GeneratedMessageLite.Builder) this).instance).hasSedentarySwitch();
        }

        public Builder mergeDisableInLunchBreak(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$SedentaryReminderSettingsData) ((GeneratedMessageLite.Builder) this).instance).mergeDisableInLunchBreak(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        public Builder mergeResumeActivityReminder(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$SedentaryReminderSettingsData) ((GeneratedMessageLite.Builder) this).instance).mergeResumeActivityReminder(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        public Builder mergeSedentarySwitch(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$SedentaryReminderSettingsData) ((GeneratedMessageLite.Builder) this).instance).mergeSedentarySwitch(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        public Builder setDisableInLunchBreak(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$SedentaryReminderSettingsData) ((GeneratedMessageLite.Builder) this).instance).setDisableInLunchBreak(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        public Builder setResumeActivityReminder(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$SedentaryReminderSettingsData) ((GeneratedMessageLite.Builder) this).instance).setResumeActivityReminder(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        public Builder setSedentarySwitch(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
            copyOnWrite();
            ((FitnessProtoV2$SedentaryReminderSettingsData) ((GeneratedMessageLite.Builder) this).instance).setSedentarySwitch(fitnessProtoV2$SettingsEnableData);
            return this;
        }

        private Builder() {
            super(FitnessProtoV2$SedentaryReminderSettingsData.DEFAULT_INSTANCE);
        }

        public Builder setDisableInLunchBreak(FitnessProtoV2$SettingsEnableData.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$SedentaryReminderSettingsData) ((GeneratedMessageLite.Builder) this).instance).setDisableInLunchBreak((FitnessProtoV2$SettingsEnableData) builder.build());
            return this;
        }

        public Builder setResumeActivityReminder(FitnessProtoV2$SettingsEnableData.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$SedentaryReminderSettingsData) ((GeneratedMessageLite.Builder) this).instance).setResumeActivityReminder((FitnessProtoV2$SettingsEnableData) builder.build());
            return this;
        }

        public Builder setSedentarySwitch(FitnessProtoV2$SettingsEnableData.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$SedentaryReminderSettingsData) ((GeneratedMessageLite.Builder) this).instance).setSedentarySwitch((FitnessProtoV2$SettingsEnableData) builder.build());
            return this;
        }
    }

    static {
        FitnessProtoV2$SedentaryReminderSettingsData fitnessProtoV2$SedentaryReminderSettingsData = new FitnessProtoV2$SedentaryReminderSettingsData();
        DEFAULT_INSTANCE = fitnessProtoV2$SedentaryReminderSettingsData;
        GeneratedMessageLite.registerDefaultInstance(FitnessProtoV2$SedentaryReminderSettingsData.class, fitnessProtoV2$SedentaryReminderSettingsData);
    }

    private FitnessProtoV2$SedentaryReminderSettingsData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisableInLunchBreak() {
        this.disableInLunchBreak_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResumeActivityReminder() {
        this.resumeActivityReminder_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSedentarySwitch() {
        this.sedentarySwitch_ = null;
        this.bitField0_ &= -2;
    }

    public static FitnessProtoV2$SedentaryReminderSettingsData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDisableInLunchBreak(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData2 = this.disableInLunchBreak_;
        if (fitnessProtoV2$SettingsEnableData2 == null || fitnessProtoV2$SettingsEnableData2 == FitnessProtoV2$SettingsEnableData.getDefaultInstance()) {
            this.disableInLunchBreak_ = fitnessProtoV2$SettingsEnableData;
        } else {
            this.disableInLunchBreak_ = (FitnessProtoV2$SettingsEnableData) ((FitnessProtoV2$SettingsEnableData.Builder) FitnessProtoV2$SettingsEnableData.newBuilder(this.disableInLunchBreak_).mergeFrom(fitnessProtoV2$SettingsEnableData)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeResumeActivityReminder(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData2 = this.resumeActivityReminder_;
        if (fitnessProtoV2$SettingsEnableData2 == null || fitnessProtoV2$SettingsEnableData2 == FitnessProtoV2$SettingsEnableData.getDefaultInstance()) {
            this.resumeActivityReminder_ = fitnessProtoV2$SettingsEnableData;
        } else {
            this.resumeActivityReminder_ = (FitnessProtoV2$SettingsEnableData) ((FitnessProtoV2$SettingsEnableData.Builder) FitnessProtoV2$SettingsEnableData.newBuilder(this.resumeActivityReminder_).mergeFrom(fitnessProtoV2$SettingsEnableData)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSedentarySwitch(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData2 = this.sedentarySwitch_;
        if (fitnessProtoV2$SettingsEnableData2 == null || fitnessProtoV2$SettingsEnableData2 == FitnessProtoV2$SettingsEnableData.getDefaultInstance()) {
            this.sedentarySwitch_ = fitnessProtoV2$SettingsEnableData;
        } else {
            this.sedentarySwitch_ = (FitnessProtoV2$SettingsEnableData) ((FitnessProtoV2$SettingsEnableData.Builder) FitnessProtoV2$SettingsEnableData.newBuilder(this.sedentarySwitch_).mergeFrom(fitnessProtoV2$SettingsEnableData)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProtoV2$SedentaryReminderSettingsData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$SedentaryReminderSettingsData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$SedentaryReminderSettingsData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SedentaryReminderSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProtoV2$SedentaryReminderSettingsData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisableInLunchBreak(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        this.disableInLunchBreak_ = fitnessProtoV2$SettingsEnableData;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResumeActivityReminder(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        this.resumeActivityReminder_ = fitnessProtoV2$SettingsEnableData;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSedentarySwitch(FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData) {
        fitnessProtoV2$SettingsEnableData.getClass();
        this.sedentarySwitch_ = fitnessProtoV2$SettingsEnableData;
        this.bitField0_ |= 1;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = ko7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProtoV2$SedentaryReminderSettingsData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "sedentarySwitch_", "disableInLunchBreak_", "resumeActivityReminder_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProtoV2$SedentaryReminderSettingsData.class) {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
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

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SedentaryReminderSettingsDataOrBuilder
    public FitnessProtoV2$SettingsEnableData getDisableInLunchBreak() {
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData = this.disableInLunchBreak_;
        return fitnessProtoV2$SettingsEnableData == null ? FitnessProtoV2$SettingsEnableData.getDefaultInstance() : fitnessProtoV2$SettingsEnableData;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SedentaryReminderSettingsDataOrBuilder
    public FitnessProtoV2$SettingsEnableData getResumeActivityReminder() {
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData = this.resumeActivityReminder_;
        return fitnessProtoV2$SettingsEnableData == null ? FitnessProtoV2$SettingsEnableData.getDefaultInstance() : fitnessProtoV2$SettingsEnableData;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SedentaryReminderSettingsDataOrBuilder
    public FitnessProtoV2$SettingsEnableData getSedentarySwitch() {
        FitnessProtoV2$SettingsEnableData fitnessProtoV2$SettingsEnableData = this.sedentarySwitch_;
        return fitnessProtoV2$SettingsEnableData == null ? FitnessProtoV2$SettingsEnableData.getDefaultInstance() : fitnessProtoV2$SettingsEnableData;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SedentaryReminderSettingsDataOrBuilder
    public boolean hasDisableInLunchBreak() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SedentaryReminderSettingsDataOrBuilder
    public boolean hasResumeActivityReminder() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SedentaryReminderSettingsDataOrBuilder
    public boolean hasSedentarySwitch() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(FitnessProtoV2$SedentaryReminderSettingsData fitnessProtoV2$SedentaryReminderSettingsData) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(fitnessProtoV2$SedentaryReminderSettingsData);
    }

    public static FitnessProtoV2$SedentaryReminderSettingsData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SedentaryReminderSettingsData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SedentaryReminderSettingsData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SedentaryReminderSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProtoV2$SedentaryReminderSettingsData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SedentaryReminderSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProtoV2$SedentaryReminderSettingsData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SedentaryReminderSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProtoV2$SedentaryReminderSettingsData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SedentaryReminderSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProtoV2$SedentaryReminderSettingsData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SedentaryReminderSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProtoV2$SedentaryReminderSettingsData parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$SedentaryReminderSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$SedentaryReminderSettingsData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SedentaryReminderSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SedentaryReminderSettingsData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProtoV2$SedentaryReminderSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProtoV2$SedentaryReminderSettingsData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SedentaryReminderSettingsData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}