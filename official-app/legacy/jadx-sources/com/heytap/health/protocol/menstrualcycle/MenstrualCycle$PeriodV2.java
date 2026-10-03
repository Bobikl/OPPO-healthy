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
public final class MenstrualCycle$PeriodV2 extends GeneratedMessageLite<MenstrualCycle$PeriodV2, Builder> implements MenstrualCycle$PeriodV2OrBuilder {
    private static final MenstrualCycle$PeriodV2 DEFAULT_INSTANCE;
    private static volatile Parser<MenstrualCycle$PeriodV2> PARSER = null;
    public static final int PERIODCLOSETYPE_FIELD_NUMBER = 3;
    public static final int PERIODENDDAY_FIELD_NUMBER = 2;
    public static final int PERIODMODIFIEDTIME_FIELD_NUMBER = 4;
    public static final int PERIODSTARTDAY_FIELD_NUMBER = 1;
    private int periodCloseType_;
    private int periodEndDay_;
    private int periodModifiedTime_;
    private int periodStartDay_;

    public static final class Builder extends GeneratedMessageLite.Builder<MenstrualCycle$PeriodV2, Builder> implements MenstrualCycle$PeriodV2OrBuilder {
        public Builder clearPeriodCloseType() {
            copyOnWrite();
            ((MenstrualCycle$PeriodV2) this.instance).clearPeriodCloseType();
            return this;
        }

        public Builder clearPeriodEndDay() {
            copyOnWrite();
            ((MenstrualCycle$PeriodV2) this.instance).clearPeriodEndDay();
            return this;
        }

        public Builder clearPeriodModifiedTime() {
            copyOnWrite();
            ((MenstrualCycle$PeriodV2) this.instance).clearPeriodModifiedTime();
            return this;
        }

        public Builder clearPeriodStartDay() {
            copyOnWrite();
            ((MenstrualCycle$PeriodV2) this.instance).clearPeriodStartDay();
            return this;
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$PeriodV2OrBuilder
        public int getPeriodCloseType() {
            return ((MenstrualCycle$PeriodV2) this.instance).getPeriodCloseType();
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$PeriodV2OrBuilder
        public int getPeriodEndDay() {
            return ((MenstrualCycle$PeriodV2) this.instance).getPeriodEndDay();
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$PeriodV2OrBuilder
        public int getPeriodModifiedTime() {
            return ((MenstrualCycle$PeriodV2) this.instance).getPeriodModifiedTime();
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$PeriodV2OrBuilder
        public int getPeriodStartDay() {
            return ((MenstrualCycle$PeriodV2) this.instance).getPeriodStartDay();
        }

        public Builder setPeriodCloseType(int i) {
            copyOnWrite();
            ((MenstrualCycle$PeriodV2) this.instance).setPeriodCloseType(i);
            return this;
        }

        public Builder setPeriodEndDay(int i) {
            copyOnWrite();
            ((MenstrualCycle$PeriodV2) this.instance).setPeriodEndDay(i);
            return this;
        }

        public Builder setPeriodModifiedTime(int i) {
            copyOnWrite();
            ((MenstrualCycle$PeriodV2) this.instance).setPeriodModifiedTime(i);
            return this;
        }

        public Builder setPeriodStartDay(int i) {
            copyOnWrite();
            ((MenstrualCycle$PeriodV2) this.instance).setPeriodStartDay(i);
            return this;
        }

        private Builder() {
            super(MenstrualCycle$PeriodV2.DEFAULT_INSTANCE);
        }
    }

    static {
        MenstrualCycle$PeriodV2 menstrualCycle$PeriodV2 = new MenstrualCycle$PeriodV2();
        DEFAULT_INSTANCE = menstrualCycle$PeriodV2;
        GeneratedMessageLite.registerDefaultInstance(MenstrualCycle$PeriodV2.class, menstrualCycle$PeriodV2);
    }

    private MenstrualCycle$PeriodV2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPeriodCloseType() {
        this.periodCloseType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPeriodEndDay() {
        this.periodEndDay_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPeriodModifiedTime() {
        this.periodModifiedTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPeriodStartDay() {
        this.periodStartDay_ = 0;
    }

    public static MenstrualCycle$PeriodV2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MenstrualCycle$PeriodV2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MenstrualCycle$PeriodV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MenstrualCycle$PeriodV2 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MenstrualCycle$PeriodV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MenstrualCycle$PeriodV2> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPeriodCloseType(int i) {
        this.periodCloseType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPeriodEndDay(int i) {
        this.periodEndDay_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPeriodModifiedTime(int i) {
        this.periodModifiedTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPeriodStartDay(int i) {
        this.periodStartDay_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = rsb.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new MenstrualCycle$PeriodV2();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u000b", new Object[]{"periodStartDay_", "periodEndDay_", "periodCloseType_", "periodModifiedTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MenstrualCycle$PeriodV2> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (MenstrualCycle$PeriodV2.class) {
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

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$PeriodV2OrBuilder
    public int getPeriodCloseType() {
        return this.periodCloseType_;
    }

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$PeriodV2OrBuilder
    public int getPeriodEndDay() {
        return this.periodEndDay_;
    }

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$PeriodV2OrBuilder
    public int getPeriodModifiedTime() {
        return this.periodModifiedTime_;
    }

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$PeriodV2OrBuilder
    public int getPeriodStartDay() {
        return this.periodStartDay_;
    }

    public static Builder newBuilder(MenstrualCycle$PeriodV2 menstrualCycle$PeriodV2) {
        return DEFAULT_INSTANCE.createBuilder(menstrualCycle$PeriodV2);
    }

    public static MenstrualCycle$PeriodV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$PeriodV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MenstrualCycle$PeriodV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$PeriodV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MenstrualCycle$PeriodV2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MenstrualCycle$PeriodV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MenstrualCycle$PeriodV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$PeriodV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MenstrualCycle$PeriodV2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MenstrualCycle$PeriodV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MenstrualCycle$PeriodV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$PeriodV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MenstrualCycle$PeriodV2 parseFrom(InputStream inputStream) throws IOException {
        return (MenstrualCycle$PeriodV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MenstrualCycle$PeriodV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$PeriodV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MenstrualCycle$PeriodV2 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MenstrualCycle$PeriodV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MenstrualCycle$PeriodV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$PeriodV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
