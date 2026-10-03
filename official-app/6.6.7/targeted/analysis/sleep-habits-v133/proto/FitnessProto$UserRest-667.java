package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.model.pi7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes17.dex */
public final class FitnessProto$UserRest extends GeneratedMessageLite<FitnessProto$UserRest, Builder> implements FitnessProto$UserRestOrBuilder {
    public static final int BEDTIME_FIELD_NUMBER = 2;
    private static final FitnessProto$UserRest DEFAULT_INSTANCE;
    public static final int EXCLUDEHOLIDAY_FIELD_NUMBER = 9;
    private static volatile Parser<FitnessProto$UserRest> PARSER = null;
    public static final int REMINDLATERSWITCH_FIELD_NUMBER = 7;
    public static final int RESTDATELIST_FIELD_NUMBER = 8;
    public static final int RESTTYPE_FIELD_NUMBER = 4;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    public static final int VIBRATIONSWITCH_FIELD_NUMBER = 6;
    public static final int WAKEUPBELLSWITCH_FIELD_NUMBER = 5;
    public static final int WAKEUPTIME_FIELD_NUMBER = 3;
    private int bedTime_;
    private boolean excludeHoliday_;
    private int remindLaterSwitch_;
    private int restDateList_;
    private int restType_;
    private int timeStamp_;
    private int vibrationSwitch_;
    private int wakeUpBellSwitch_;
    private int wakeUpTime_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$UserRest, Builder> implements FitnessProto$UserRestOrBuilder {
        public Builder clearBedTime() {
            copyOnWrite();
            ((FitnessProto$UserRest) ((GeneratedMessageLite.Builder) this).instance).clearBedTime();
            return this;
        }

        public Builder clearExcludeHoliday() {
            copyOnWrite();
            ((FitnessProto$UserRest) ((GeneratedMessageLite.Builder) this).instance).clearExcludeHoliday();
            return this;
        }

        public Builder clearRemindLaterSwitch() {
            copyOnWrite();
            ((FitnessProto$UserRest) ((GeneratedMessageLite.Builder) this).instance).clearRemindLaterSwitch();
            return this;
        }

        public Builder clearRestDateList() {
            copyOnWrite();
            ((FitnessProto$UserRest) ((GeneratedMessageLite.Builder) this).instance).clearRestDateList();
            return this;
        }

        public Builder clearRestType() {
            copyOnWrite();
            ((FitnessProto$UserRest) ((GeneratedMessageLite.Builder) this).instance).clearRestType();
            return this;
        }

        public Builder clearTimeStamp() {
            copyOnWrite();
            ((FitnessProto$UserRest) ((GeneratedMessageLite.Builder) this).instance).clearTimeStamp();
            return this;
        }

        public Builder clearVibrationSwitch() {
            copyOnWrite();
            ((FitnessProto$UserRest) ((GeneratedMessageLite.Builder) this).instance).clearVibrationSwitch();
            return this;
        }

        public Builder clearWakeUpBellSwitch() {
            copyOnWrite();
            ((FitnessProto$UserRest) ((GeneratedMessageLite.Builder) this).instance).clearWakeUpBellSwitch();
            return this;
        }

        public Builder clearWakeUpTime() {
            copyOnWrite();
            ((FitnessProto$UserRest) ((GeneratedMessageLite.Builder) this).instance).clearWakeUpTime();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$UserRestOrBuilder
        public int getBedTime() {
            return ((FitnessProto$UserRest) ((GeneratedMessageLite.Builder) this).instance).getBedTime();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$UserRestOrBuilder
        public boolean getExcludeHoliday() {
            return ((FitnessProto$UserRest) ((GeneratedMessageLite.Builder) this).instance).getExcludeHoliday();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$UserRestOrBuilder
        public int getRemindLaterSwitch() {
            return ((FitnessProto$UserRest) ((GeneratedMessageLite.Builder) this).instance).getRemindLaterSwitch();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$UserRestOrBuilder
        public int getRestDateList() {
            return ((FitnessProto$UserRest) ((GeneratedMessageLite.Builder) this).instance).getRestDateList();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$UserRestOrBuilder
        public int getRestType() {
            return ((FitnessProto$UserRest) ((GeneratedMessageLite.Builder) this).instance).getRestType();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$UserRestOrBuilder
        public int getTimeStamp() {
            return ((FitnessProto$UserRest) ((GeneratedMessageLite.Builder) this).instance).getTimeStamp();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$UserRestOrBuilder
        public int getVibrationSwitch() {
            return ((FitnessProto$UserRest) ((GeneratedMessageLite.Builder) this).instance).getVibrationSwitch();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$UserRestOrBuilder
        public int getWakeUpBellSwitch() {
            return ((FitnessProto$UserRest) ((GeneratedMessageLite.Builder) this).instance).getWakeUpBellSwitch();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$UserRestOrBuilder
        public int getWakeUpTime() {
            return ((FitnessProto$UserRest) ((GeneratedMessageLite.Builder) this).instance).getWakeUpTime();
        }

        public Builder setBedTime(int i) {
            copyOnWrite();
            ((FitnessProto$UserRest) ((GeneratedMessageLite.Builder) this).instance).setBedTime(i);
            return this;
        }

        public Builder setExcludeHoliday(boolean z) {
            copyOnWrite();
            ((FitnessProto$UserRest) ((GeneratedMessageLite.Builder) this).instance).setExcludeHoliday(z);
            return this;
        }

        public Builder setRemindLaterSwitch(int i) {
            copyOnWrite();
            ((FitnessProto$UserRest) ((GeneratedMessageLite.Builder) this).instance).setRemindLaterSwitch(i);
            return this;
        }

        public Builder setRestDateList(int i) {
            copyOnWrite();
            ((FitnessProto$UserRest) ((GeneratedMessageLite.Builder) this).instance).setRestDateList(i);
            return this;
        }

        public Builder setRestType(int i) {
            copyOnWrite();
            ((FitnessProto$UserRest) ((GeneratedMessageLite.Builder) this).instance).setRestType(i);
            return this;
        }

        public Builder setTimeStamp(int i) {
            copyOnWrite();
            ((FitnessProto$UserRest) ((GeneratedMessageLite.Builder) this).instance).setTimeStamp(i);
            return this;
        }

        public Builder setVibrationSwitch(int i) {
            copyOnWrite();
            ((FitnessProto$UserRest) ((GeneratedMessageLite.Builder) this).instance).setVibrationSwitch(i);
            return this;
        }

        public Builder setWakeUpBellSwitch(int i) {
            copyOnWrite();
            ((FitnessProto$UserRest) ((GeneratedMessageLite.Builder) this).instance).setWakeUpBellSwitch(i);
            return this;
        }

        public Builder setWakeUpTime(int i) {
            copyOnWrite();
            ((FitnessProto$UserRest) ((GeneratedMessageLite.Builder) this).instance).setWakeUpTime(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$UserRest.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$UserRest fitnessProto$UserRest = new FitnessProto$UserRest();
        DEFAULT_INSTANCE = fitnessProto$UserRest;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$UserRest.class, fitnessProto$UserRest);
    }

    private FitnessProto$UserRest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBedTime() {
        this.bedTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExcludeHoliday() {
        this.excludeHoliday_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemindLaterSwitch() {
        this.remindLaterSwitch_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRestDateList() {
        this.restDateList_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRestType() {
        this.restType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeStamp() {
        this.timeStamp_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVibrationSwitch() {
        this.vibrationSwitch_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWakeUpBellSwitch() {
        this.wakeUpBellSwitch_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWakeUpTime() {
        this.wakeUpTime_ = 0;
    }

    public static FitnessProto$UserRest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$UserRest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$UserRest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$UserRest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$UserRest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$UserRest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBedTime(int i) {
        this.bedTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExcludeHoliday(boolean z) {
        this.excludeHoliday_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemindLaterSwitch(int i) {
        this.remindLaterSwitch_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRestDateList(int i) {
        this.restDateList_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRestType(int i) {
        this.restType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeStamp(int i) {
        this.timeStamp_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVibrationSwitch(int i) {
        this.vibrationSwitch_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWakeUpBellSwitch(int i) {
        this.wakeUpBellSwitch_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWakeUpTime(int i) {
        this.wakeUpTime_ = i;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = pi7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$UserRest();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b\u0004\t\u0007", new Object[]{"timeStamp_", "bedTime_", "wakeUpTime_", "restType_", "wakeUpBellSwitch_", "vibrationSwitch_", "remindLaterSwitch_", "restDateList_", "excludeHoliday_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$UserRest.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$UserRestOrBuilder
    public int getBedTime() {
        return this.bedTime_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$UserRestOrBuilder
    public boolean getExcludeHoliday() {
        return this.excludeHoliday_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$UserRestOrBuilder
    public int getRemindLaterSwitch() {
        return this.remindLaterSwitch_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$UserRestOrBuilder
    public int getRestDateList() {
        return this.restDateList_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$UserRestOrBuilder
    public int getRestType() {
        return this.restType_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$UserRestOrBuilder
    public int getTimeStamp() {
        return this.timeStamp_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$UserRestOrBuilder
    public int getVibrationSwitch() {
        return this.vibrationSwitch_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$UserRestOrBuilder
    public int getWakeUpBellSwitch() {
        return this.wakeUpBellSwitch_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$UserRestOrBuilder
    public int getWakeUpTime() {
        return this.wakeUpTime_;
    }

    public static Builder newBuilder(FitnessProto$UserRest fitnessProto$UserRest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(fitnessProto$UserRest);
    }

    public static FitnessProto$UserRest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$UserRest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$UserRest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$UserRest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$UserRest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$UserRest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$UserRest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$UserRest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$UserRest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$UserRest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$UserRest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$UserRest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$UserRest parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$UserRest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$UserRest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$UserRest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$UserRest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$UserRest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$UserRest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$UserRest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}