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
public final class FitnessProto$SleepModelSetting extends GeneratedMessageLite<FitnessProto$SleepModelSetting, Builder> implements FitnessProto$SleepModelSettingOrBuilder {
    public static final int ACCORDRESTSWITCH_FIELD_NUMBER = 2;
    private static final FitnessProto$SleepModelSetting DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$SleepModelSetting> PARSER = null;
    public static final int STARTNOW_FIELD_NUMBER = 3;
    public static final int STATESYNCTIME_FIELD_NUMBER = 5;
    public static final int STATESYNC_FIELD_NUMBER = 4;
    public static final int TIME_FIELD_NUMBER = 1;
    private int accordRestSwitch_;
    private int startNow_;
    private int stateSyncTime_;
    private int stateSync_;
    private int time_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$SleepModelSetting, Builder> implements FitnessProto$SleepModelSettingOrBuilder {
        public Builder clearAccordRestSwitch() {
            copyOnWrite();
            ((FitnessProto$SleepModelSetting) this.instance).clearAccordRestSwitch();
            return this;
        }

        public Builder clearStartNow() {
            copyOnWrite();
            ((FitnessProto$SleepModelSetting) this.instance).clearStartNow();
            return this;
        }

        public Builder clearStateSync() {
            copyOnWrite();
            ((FitnessProto$SleepModelSetting) this.instance).clearStateSync();
            return this;
        }

        public Builder clearStateSyncTime() {
            copyOnWrite();
            ((FitnessProto$SleepModelSetting) this.instance).clearStateSyncTime();
            return this;
        }

        public Builder clearTime() {
            copyOnWrite();
            ((FitnessProto$SleepModelSetting) this.instance).clearTime();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepModelSettingOrBuilder
        public int getAccordRestSwitch() {
            return ((FitnessProto$SleepModelSetting) this.instance).getAccordRestSwitch();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepModelSettingOrBuilder
        public int getStartNow() {
            return ((FitnessProto$SleepModelSetting) this.instance).getStartNow();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepModelSettingOrBuilder
        public int getStateSync() {
            return ((FitnessProto$SleepModelSetting) this.instance).getStateSync();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepModelSettingOrBuilder
        public int getStateSyncTime() {
            return ((FitnessProto$SleepModelSetting) this.instance).getStateSyncTime();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepModelSettingOrBuilder
        public int getTime() {
            return ((FitnessProto$SleepModelSetting) this.instance).getTime();
        }

        public Builder setAccordRestSwitch(int i) {
            copyOnWrite();
            ((FitnessProto$SleepModelSetting) this.instance).setAccordRestSwitch(i);
            return this;
        }

        public Builder setStartNow(int i) {
            copyOnWrite();
            ((FitnessProto$SleepModelSetting) this.instance).setStartNow(i);
            return this;
        }

        public Builder setStateSync(int i) {
            copyOnWrite();
            ((FitnessProto$SleepModelSetting) this.instance).setStateSync(i);
            return this;
        }

        public Builder setStateSyncTime(int i) {
            copyOnWrite();
            ((FitnessProto$SleepModelSetting) this.instance).setStateSyncTime(i);
            return this;
        }

        public Builder setTime(int i) {
            copyOnWrite();
            ((FitnessProto$SleepModelSetting) this.instance).setTime(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$SleepModelSetting.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$SleepModelSetting fitnessProto$SleepModelSetting = new FitnessProto$SleepModelSetting();
        DEFAULT_INSTANCE = fitnessProto$SleepModelSetting;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$SleepModelSetting.class, fitnessProto$SleepModelSetting);
    }

    private FitnessProto$SleepModelSetting() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccordRestSwitch() {
        this.accordRestSwitch_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartNow() {
        this.startNow_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStateSync() {
        this.stateSync_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStateSyncTime() {
        this.stateSyncTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTime() {
        this.time_ = 0;
    }

    public static FitnessProto$SleepModelSetting getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$SleepModelSetting parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$SleepModelSetting) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$SleepModelSetting parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepModelSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$SleepModelSetting> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccordRestSwitch(int i) {
        this.accordRestSwitch_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartNow(int i) {
        this.startNow_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateSync(int i) {
        this.stateSync_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateSyncTime(int i) {
        this.stateSyncTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTime(int i) {
        this.time_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$SleepModelSetting();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004", new Object[]{"time_", "accordRestSwitch_", "startNow_", "stateSync_", "stateSyncTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$SleepModelSetting> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$SleepModelSetting.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepModelSettingOrBuilder
    public int getAccordRestSwitch() {
        return this.accordRestSwitch_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepModelSettingOrBuilder
    public int getStartNow() {
        return this.startNow_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepModelSettingOrBuilder
    public int getStateSync() {
        return this.stateSync_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepModelSettingOrBuilder
    public int getStateSyncTime() {
        return this.stateSyncTime_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepModelSettingOrBuilder
    public int getTime() {
        return this.time_;
    }

    public static Builder newBuilder(FitnessProto$SleepModelSetting fitnessProto$SleepModelSetting) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$SleepModelSetting);
    }

    public static FitnessProto$SleepModelSetting parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SleepModelSetting) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$SleepModelSetting parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepModelSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$SleepModelSetting parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepModelSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$SleepModelSetting parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepModelSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$SleepModelSetting parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepModelSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$SleepModelSetting parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepModelSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$SleepModelSetting parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$SleepModelSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$SleepModelSetting parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SleepModelSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$SleepModelSetting parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$SleepModelSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$SleepModelSetting parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SleepModelSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
