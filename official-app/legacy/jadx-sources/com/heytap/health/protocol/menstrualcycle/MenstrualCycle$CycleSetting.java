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
public final class MenstrualCycle$CycleSetting extends GeneratedMessageLite<MenstrualCycle$CycleSetting, Builder> implements MenstrualCycle$CycleSettingOrBuilder {
    private static final MenstrualCycle$CycleSetting DEFAULT_INSTANCE;
    public static final int MODIFIEDTIME_FIELD_NUMBER = 4;
    private static volatile Parser<MenstrualCycle$CycleSetting> PARSER = null;
    public static final int USERCYCLEDUR_FIELD_NUMBER = 1;
    public static final int USERLASTPERIOD_FIELD_NUMBER = 3;
    public static final int USERPERIODDUR_FIELD_NUMBER = 2;
    private int modifiedTime_;
    private int userCycleDur_;
    private int userLastPeriod_;
    private int userPeriodDur_;

    public static final class Builder extends GeneratedMessageLite.Builder<MenstrualCycle$CycleSetting, Builder> implements MenstrualCycle$CycleSettingOrBuilder {
        public Builder clearModifiedTime() {
            copyOnWrite();
            ((MenstrualCycle$CycleSetting) this.instance).clearModifiedTime();
            return this;
        }

        public Builder clearUserCycleDur() {
            copyOnWrite();
            ((MenstrualCycle$CycleSetting) this.instance).clearUserCycleDur();
            return this;
        }

        public Builder clearUserLastPeriod() {
            copyOnWrite();
            ((MenstrualCycle$CycleSetting) this.instance).clearUserLastPeriod();
            return this;
        }

        public Builder clearUserPeriodDur() {
            copyOnWrite();
            ((MenstrualCycle$CycleSetting) this.instance).clearUserPeriodDur();
            return this;
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$CycleSettingOrBuilder
        public int getModifiedTime() {
            return ((MenstrualCycle$CycleSetting) this.instance).getModifiedTime();
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$CycleSettingOrBuilder
        public int getUserCycleDur() {
            return ((MenstrualCycle$CycleSetting) this.instance).getUserCycleDur();
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$CycleSettingOrBuilder
        public int getUserLastPeriod() {
            return ((MenstrualCycle$CycleSetting) this.instance).getUserLastPeriod();
        }

        @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$CycleSettingOrBuilder
        public int getUserPeriodDur() {
            return ((MenstrualCycle$CycleSetting) this.instance).getUserPeriodDur();
        }

        public Builder setModifiedTime(int i) {
            copyOnWrite();
            ((MenstrualCycle$CycleSetting) this.instance).setModifiedTime(i);
            return this;
        }

        public Builder setUserCycleDur(int i) {
            copyOnWrite();
            ((MenstrualCycle$CycleSetting) this.instance).setUserCycleDur(i);
            return this;
        }

        public Builder setUserLastPeriod(int i) {
            copyOnWrite();
            ((MenstrualCycle$CycleSetting) this.instance).setUserLastPeriod(i);
            return this;
        }

        public Builder setUserPeriodDur(int i) {
            copyOnWrite();
            ((MenstrualCycle$CycleSetting) this.instance).setUserPeriodDur(i);
            return this;
        }

        private Builder() {
            super(MenstrualCycle$CycleSetting.DEFAULT_INSTANCE);
        }
    }

    static {
        MenstrualCycle$CycleSetting menstrualCycle$CycleSetting = new MenstrualCycle$CycleSetting();
        DEFAULT_INSTANCE = menstrualCycle$CycleSetting;
        GeneratedMessageLite.registerDefaultInstance(MenstrualCycle$CycleSetting.class, menstrualCycle$CycleSetting);
    }

    private MenstrualCycle$CycleSetting() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModifiedTime() {
        this.modifiedTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserCycleDur() {
        this.userCycleDur_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserLastPeriod() {
        this.userLastPeriod_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserPeriodDur() {
        this.userPeriodDur_ = 0;
    }

    public static MenstrualCycle$CycleSetting getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MenstrualCycle$CycleSetting parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MenstrualCycle$CycleSetting) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MenstrualCycle$CycleSetting parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MenstrualCycle$CycleSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MenstrualCycle$CycleSetting> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModifiedTime(int i) {
        this.modifiedTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserCycleDur(int i) {
        this.userCycleDur_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserLastPeriod(int i) {
        this.userLastPeriod_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserPeriodDur(int i) {
        this.userPeriodDur_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = rsb.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new MenstrualCycle$CycleSetting();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u000b", new Object[]{"userCycleDur_", "userPeriodDur_", "userLastPeriod_", "modifiedTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MenstrualCycle$CycleSetting> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (MenstrualCycle$CycleSetting.class) {
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

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$CycleSettingOrBuilder
    public int getModifiedTime() {
        return this.modifiedTime_;
    }

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$CycleSettingOrBuilder
    public int getUserCycleDur() {
        return this.userCycleDur_;
    }

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$CycleSettingOrBuilder
    public int getUserLastPeriod() {
        return this.userLastPeriod_;
    }

    @Override // com.heytap.health.protocol.menstrualcycle.MenstrualCycle$CycleSettingOrBuilder
    public int getUserPeriodDur() {
        return this.userPeriodDur_;
    }

    public static Builder newBuilder(MenstrualCycle$CycleSetting menstrualCycle$CycleSetting) {
        return DEFAULT_INSTANCE.createBuilder(menstrualCycle$CycleSetting);
    }

    public static MenstrualCycle$CycleSetting parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$CycleSetting) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MenstrualCycle$CycleSetting parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$CycleSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MenstrualCycle$CycleSetting parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MenstrualCycle$CycleSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MenstrualCycle$CycleSetting parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$CycleSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MenstrualCycle$CycleSetting parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MenstrualCycle$CycleSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MenstrualCycle$CycleSetting parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MenstrualCycle$CycleSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MenstrualCycle$CycleSetting parseFrom(InputStream inputStream) throws IOException {
        return (MenstrualCycle$CycleSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MenstrualCycle$CycleSetting parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$CycleSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MenstrualCycle$CycleSetting parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MenstrualCycle$CycleSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MenstrualCycle$CycleSetting parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MenstrualCycle$CycleSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
