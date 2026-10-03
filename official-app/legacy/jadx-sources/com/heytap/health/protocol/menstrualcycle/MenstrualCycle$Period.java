package com.heytap.health.protocol.menstrualcycle;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.rsb;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class MenstrualCycle$Period extends GeneratedMessageLite<MenstrualCycle$Period, Builder> implements MenstrualCycle$PeriodOrBuilder {
    private static final MenstrualCycle$Period DEFAULT_INSTANCE;
    public static final int DURATIONDAYS_FIELD_NUMBER = 2;
    private static volatile Parser<MenstrualCycle$Period> PARSER = null;
    public static final int PERIODCLOSETYPE_FIELD_NUMBER = 3;
    public static final int PERIODMODIFIEDTIME_FIELD_NUMBER = 4;
    public static final int STARTDAYOFFSET_FIELD_NUMBER = 1;
    private int durationDays_;
    private int periodCloseType_;
    private int periodModifiedTime_;
    private int startDayOffset_;

    public static final class Builder extends GeneratedMessageLite.Builder<MenstrualCycle$Period, Builder> implements MenstrualCycle$PeriodOrBuilder {
        public Builder clearDurationDays() {
            copyOnWrite();
            ((MenstrualCycle$Period) this.instance).clearDurationDays();
            return this;
        }

        public Builder clearPeriodCloseType() {
            copyOnWrite();
            ((MenstrualCycle$Period) this.instance).clearPeriodCloseType();
            return this;
        }

        public Builder clearPeriodModifiedTime() {
            copyOnWrite();
            ((MenstrualCycle$Period) this.instance).clearPeriodModifiedTime();
            return this;
        }

        public Builder clearStartDayOffset() {
            copyOnWrite();
            ((MenstrualCycle$Period) this.instance).clearStartDayOffset();
            return this;
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$PeriodOrBuilder
        public int getDurationDays() {
            return ((MenstrualCycle$Period) this.instance).getDurationDays();
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$PeriodOrBuilder
        public int getPeriodCloseType() {
            return ((MenstrualCycle$Period) this.instance).getPeriodCloseType();
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$PeriodOrBuilder
        public int getPeriodModifiedTime() {
            return ((MenstrualCycle$Period) this.instance).getPeriodModifiedTime();
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$PeriodOrBuilder
        public int getStartDayOffset() {
            return ((MenstrualCycle$Period) this.instance).getStartDayOffset();
        }

        public Builder setDurationDays(int i) {
            copyOnWrite();
            ((MenstrualCycle$Period) this.instance).setDurationDays(i);
            return this;
        }

        public Builder setPeriodCloseType(int i) {
            copyOnWrite();
            ((MenstrualCycle$Period) this.instance).setPeriodCloseType(i);
            return this;
        }

        public Builder setPeriodModifiedTime(int i) {
            copyOnWrite();
            ((MenstrualCycle$Period) this.instance).setPeriodModifiedTime(i);
            return this;
        }

        public Builder setStartDayOffset(int i) {
            copyOnWrite();
            ((MenstrualCycle$Period) this.instance).setStartDayOffset(i);
            return this;
        }

        private Builder() {
            super(MenstrualCycle$Period.DEFAULT_INSTANCE);
        }
    }

    static {
        MenstrualCycle$Period menstrualCycle$Period = new MenstrualCycle$Period();
        DEFAULT_INSTANCE = menstrualCycle$Period;
        GeneratedMessageLite.registerDefaultInstance(MenstrualCycle$Period.class, menstrualCycle$Period);
    }

    private MenstrualCycle$Period() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDurationDays() {
        this.durationDays_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPeriodCloseType() {
        this.periodCloseType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPeriodModifiedTime() {
        this.periodModifiedTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartDayOffset() {
        this.startDayOffset_ = 0;
    }

    public static MenstrualCycle$Period getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MenstrualCycle$Period parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MenstrualCycle$Period) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MenstrualCycle$Period parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MenstrualCycle$Period) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MenstrualCycle$Period> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDurationDays(int i) {
        this.durationDays_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPeriodCloseType(int i) {
        this.periodCloseType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPeriodModifiedTime(int i) {
        this.periodModifiedTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartDayOffset(int i) {
        this.startDayOffset_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = rsb.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new MenstrualCycle$Period();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u000b", new Object[]{"startDayOffset_", "durationDays_", "periodCloseType_", "periodModifiedTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MenstrualCycle$Period> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (MenstrualCycle$Period.class) {
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

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$PeriodOrBuilder
    public int getDurationDays() {
        return this.durationDays_;
    }

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$PeriodOrBuilder
    public int getPeriodCloseType() {
        return this.periodCloseType_;
    }

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$PeriodOrBuilder
    public int getPeriodModifiedTime() {
        return this.periodModifiedTime_;
    }

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$PeriodOrBuilder
    public int getStartDayOffset() {
        return this.startDayOffset_;
    }

    public static Builder newBuilder(MenstrualCycle$Period menstrualCycle$Period) {
        return DEFAULT_INSTANCE.createBuilder(menstrualCycle$Period);
    }

    public static MenstrualCycle$Period parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$Period) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MenstrualCycle$Period parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$Period) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MenstrualCycle$Period parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MenstrualCycle$Period) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MenstrualCycle$Period parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$Period) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MenstrualCycle$Period parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MenstrualCycle$Period) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MenstrualCycle$Period parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$Period) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MenstrualCycle$Period parseFrom(InputStream inputStream) throws IOException {
        return (MenstrualCycle$Period) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MenstrualCycle$Period parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$Period) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MenstrualCycle$Period parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MenstrualCycle$Period) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MenstrualCycle$Period parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$Period) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
