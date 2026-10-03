package com.heytap.health.band.data;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.vs;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes15.dex */
public final class AlarmProperty$AlarmDetail extends GeneratedMessageLite<AlarmProperty$AlarmDetail, Builder> implements AlarmProperty$AlarmDetailOrBuilder {
    public static final int ALARM_DAYFLAG_FIELD_NUMBER = 7;
    public static final int ALARM_ENABLE_FIELD_NUMBER = 1;
    public static final int ALARM_ID_FIELD_NUMBER = 2;
    public static final int ALARM_LATER_ENABLE_FIELD_NUMBER = 6;
    public static final int ALARM_NAME_FIELD_NUMBER = 4;
    public static final int ALARM_SHAKE_DURATION_FIELD_NUMBER = 8;
    public static final int ALARM_STATE_FIELD_NUMBER = 3;
    public static final int ALARM_TIME_FIELD_NUMBER = 5;
    private static final AlarmProperty$AlarmDetail DEFAULT_INSTANCE;
    private static volatile Parser<AlarmProperty$AlarmDetail> PARSER;
    private int alarmDayflag_;
    private int alarmEnable_;
    private int alarmId_;
    private int alarmLaterEnable_;
    private String alarmName_ = "";
    private int alarmShakeDuration_;
    private int alarmState_;
    private int alarmTime_;

    public static final class Builder extends GeneratedMessageLite.Builder<AlarmProperty$AlarmDetail, Builder> implements AlarmProperty$AlarmDetailOrBuilder {
        public Builder clearAlarmDayflag() {
            copyOnWrite();
            ((AlarmProperty$AlarmDetail) this.instance).clearAlarmDayflag();
            return this;
        }

        public Builder clearAlarmEnable() {
            copyOnWrite();
            ((AlarmProperty$AlarmDetail) this.instance).clearAlarmEnable();
            return this;
        }

        public Builder clearAlarmId() {
            copyOnWrite();
            ((AlarmProperty$AlarmDetail) this.instance).clearAlarmId();
            return this;
        }

        public Builder clearAlarmLaterEnable() {
            copyOnWrite();
            ((AlarmProperty$AlarmDetail) this.instance).clearAlarmLaterEnable();
            return this;
        }

        public Builder clearAlarmName() {
            copyOnWrite();
            ((AlarmProperty$AlarmDetail) this.instance).clearAlarmName();
            return this;
        }

        public Builder clearAlarmShakeDuration() {
            copyOnWrite();
            ((AlarmProperty$AlarmDetail) this.instance).clearAlarmShakeDuration();
            return this;
        }

        public Builder clearAlarmState() {
            copyOnWrite();
            ((AlarmProperty$AlarmDetail) this.instance).clearAlarmState();
            return this;
        }

        public Builder clearAlarmTime() {
            copyOnWrite();
            ((AlarmProperty$AlarmDetail) this.instance).clearAlarmTime();
            return this;
        }

        @Override // com.heytap.health.band.data.AlarmProperty$AlarmDetailOrBuilder
        public int getAlarmDayflag() {
            return ((AlarmProperty$AlarmDetail) this.instance).getAlarmDayflag();
        }

        @Override // com.heytap.health.band.data.AlarmProperty$AlarmDetailOrBuilder
        public int getAlarmEnable() {
            return ((AlarmProperty$AlarmDetail) this.instance).getAlarmEnable();
        }

        @Override // com.heytap.health.band.data.AlarmProperty$AlarmDetailOrBuilder
        public int getAlarmId() {
            return ((AlarmProperty$AlarmDetail) this.instance).getAlarmId();
        }

        @Override // com.heytap.health.band.data.AlarmProperty$AlarmDetailOrBuilder
        public int getAlarmLaterEnable() {
            return ((AlarmProperty$AlarmDetail) this.instance).getAlarmLaterEnable();
        }

        @Override // com.heytap.health.band.data.AlarmProperty$AlarmDetailOrBuilder
        public String getAlarmName() {
            return ((AlarmProperty$AlarmDetail) this.instance).getAlarmName();
        }

        @Override // com.heytap.health.band.data.AlarmProperty$AlarmDetailOrBuilder
        public ByteString getAlarmNameBytes() {
            return ((AlarmProperty$AlarmDetail) this.instance).getAlarmNameBytes();
        }

        @Override // com.heytap.health.band.data.AlarmProperty$AlarmDetailOrBuilder
        public int getAlarmShakeDuration() {
            return ((AlarmProperty$AlarmDetail) this.instance).getAlarmShakeDuration();
        }

        @Override // com.heytap.health.band.data.AlarmProperty$AlarmDetailOrBuilder
        public int getAlarmState() {
            return ((AlarmProperty$AlarmDetail) this.instance).getAlarmState();
        }

        @Override // com.heytap.health.band.data.AlarmProperty$AlarmDetailOrBuilder
        public int getAlarmTime() {
            return ((AlarmProperty$AlarmDetail) this.instance).getAlarmTime();
        }

        public Builder setAlarmDayflag(int i) {
            copyOnWrite();
            ((AlarmProperty$AlarmDetail) this.instance).setAlarmDayflag(i);
            return this;
        }

        public Builder setAlarmEnable(int i) {
            copyOnWrite();
            ((AlarmProperty$AlarmDetail) this.instance).setAlarmEnable(i);
            return this;
        }

        public Builder setAlarmId(int i) {
            copyOnWrite();
            ((AlarmProperty$AlarmDetail) this.instance).setAlarmId(i);
            return this;
        }

        public Builder setAlarmLaterEnable(int i) {
            copyOnWrite();
            ((AlarmProperty$AlarmDetail) this.instance).setAlarmLaterEnable(i);
            return this;
        }

        public Builder setAlarmName(String str) {
            copyOnWrite();
            ((AlarmProperty$AlarmDetail) this.instance).setAlarmName(str);
            return this;
        }

        public Builder setAlarmNameBytes(ByteString byteString) {
            copyOnWrite();
            ((AlarmProperty$AlarmDetail) this.instance).setAlarmNameBytes(byteString);
            return this;
        }

        public Builder setAlarmShakeDuration(int i) {
            copyOnWrite();
            ((AlarmProperty$AlarmDetail) this.instance).setAlarmShakeDuration(i);
            return this;
        }

        public Builder setAlarmState(int i) {
            copyOnWrite();
            ((AlarmProperty$AlarmDetail) this.instance).setAlarmState(i);
            return this;
        }

        public Builder setAlarmTime(int i) {
            copyOnWrite();
            ((AlarmProperty$AlarmDetail) this.instance).setAlarmTime(i);
            return this;
        }

        private Builder() {
            super(AlarmProperty$AlarmDetail.DEFAULT_INSTANCE);
        }
    }

    static {
        AlarmProperty$AlarmDetail alarmProperty$AlarmDetail = new AlarmProperty$AlarmDetail();
        DEFAULT_INSTANCE = alarmProperty$AlarmDetail;
        GeneratedMessageLite.registerDefaultInstance(AlarmProperty$AlarmDetail.class, alarmProperty$AlarmDetail);
    }

    private AlarmProperty$AlarmDetail() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlarmDayflag() {
        this.alarmDayflag_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlarmEnable() {
        this.alarmEnable_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlarmId() {
        this.alarmId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlarmLaterEnable() {
        this.alarmLaterEnable_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlarmName() {
        this.alarmName_ = getDefaultInstance().getAlarmName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlarmShakeDuration() {
        this.alarmShakeDuration_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlarmState() {
        this.alarmState_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlarmTime() {
        this.alarmTime_ = 0;
    }

    public static AlarmProperty$AlarmDetail getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static AlarmProperty$AlarmDetail parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AlarmProperty$AlarmDetail) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AlarmProperty$AlarmDetail parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AlarmProperty$AlarmDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<AlarmProperty$AlarmDetail> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlarmDayflag(int i) {
        this.alarmDayflag_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlarmEnable(int i) {
        this.alarmEnable_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlarmId(int i) {
        this.alarmId_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlarmLaterEnable(int i) {
        this.alarmLaterEnable_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlarmName(String str) {
        str.getClass();
        this.alarmName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlarmNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.alarmName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlarmShakeDuration(int i) {
        this.alarmShakeDuration_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlarmState(int i) {
        this.alarmState_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlarmTime(int i) {
        this.alarmTime_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = vs.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new AlarmProperty$AlarmDetail();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004Ȉ\u0005\u0004\u0006\u0004\u0007\u0004\b\u0004", new Object[]{"alarmEnable_", "alarmId_", "alarmState_", "alarmName_", "alarmTime_", "alarmLaterEnable_", "alarmDayflag_", "alarmShakeDuration_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AlarmProperty$AlarmDetail> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (AlarmProperty$AlarmDetail.class) {
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

    @Override // com.heytap.health.band.data.AlarmProperty$AlarmDetailOrBuilder
    public int getAlarmDayflag() {
        return this.alarmDayflag_;
    }

    @Override // com.heytap.health.band.data.AlarmProperty$AlarmDetailOrBuilder
    public int getAlarmEnable() {
        return this.alarmEnable_;
    }

    @Override // com.heytap.health.band.data.AlarmProperty$AlarmDetailOrBuilder
    public int getAlarmId() {
        return this.alarmId_;
    }

    @Override // com.heytap.health.band.data.AlarmProperty$AlarmDetailOrBuilder
    public int getAlarmLaterEnable() {
        return this.alarmLaterEnable_;
    }

    @Override // com.heytap.health.band.data.AlarmProperty$AlarmDetailOrBuilder
    public String getAlarmName() {
        return this.alarmName_;
    }

    @Override // com.heytap.health.band.data.AlarmProperty$AlarmDetailOrBuilder
    public ByteString getAlarmNameBytes() {
        return ByteString.copyFromUtf8(this.alarmName_);
    }

    @Override // com.heytap.health.band.data.AlarmProperty$AlarmDetailOrBuilder
    public int getAlarmShakeDuration() {
        return this.alarmShakeDuration_;
    }

    @Override // com.heytap.health.band.data.AlarmProperty$AlarmDetailOrBuilder
    public int getAlarmState() {
        return this.alarmState_;
    }

    @Override // com.heytap.health.band.data.AlarmProperty$AlarmDetailOrBuilder
    public int getAlarmTime() {
        return this.alarmTime_;
    }

    public static Builder newBuilder(AlarmProperty$AlarmDetail alarmProperty$AlarmDetail) {
        return DEFAULT_INSTANCE.createBuilder(alarmProperty$AlarmDetail);
    }

    public static AlarmProperty$AlarmDetail parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AlarmProperty$AlarmDetail) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AlarmProperty$AlarmDetail parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AlarmProperty$AlarmDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AlarmProperty$AlarmDetail parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AlarmProperty$AlarmDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AlarmProperty$AlarmDetail parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AlarmProperty$AlarmDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AlarmProperty$AlarmDetail parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AlarmProperty$AlarmDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AlarmProperty$AlarmDetail parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AlarmProperty$AlarmDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static AlarmProperty$AlarmDetail parseFrom(InputStream inputStream) throws IOException {
        return (AlarmProperty$AlarmDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AlarmProperty$AlarmDetail parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AlarmProperty$AlarmDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AlarmProperty$AlarmDetail parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AlarmProperty$AlarmDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AlarmProperty$AlarmDetail parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AlarmProperty$AlarmDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
