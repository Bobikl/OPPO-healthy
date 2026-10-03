package com.heytap.health.device.protocol.emergency;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.l5g;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes16.dex */
public final class SGP$SafeGuardSyncTravelData extends GeneratedMessageLite<SGP$SafeGuardSyncTravelData, Builder> implements SGP$SafeGuardSyncTravelDataOrBuilder {
    public static final int ACCURACY_FIELD_NUMBER = 9;
    public static final int ALTITUDE_FIELD_NUMBER = 7;
    public static final int BATTERYLEVEL_FIELD_NUMBER = 10;
    private static final SGP$SafeGuardSyncTravelData DEFAULT_INSTANCE;
    public static final int HEARTRATE_FIELD_NUMBER = 12;
    public static final int LATITUDE_FIELD_NUMBER = 5;
    public static final int LONGITUDE_FIELD_NUMBER = 6;
    private static volatile Parser<SGP$SafeGuardSyncTravelData> PARSER = null;
    public static final int POSTYPE_FIELD_NUMBER = 3;
    public static final int PUSHUSERSTATE_FIELD_NUMBER = 15;
    public static final int SIGNAL_FIELD_NUMBER = 4;
    public static final int SPEED_FIELD_NUMBER = 8;
    public static final int STAYTIME_FIELD_NUMBER = 14;
    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    public static final int TRAVELID_FIELD_NUMBER = 1;
    public static final int USERSTATE_FIELD_NUMBER = 13;
    public static final int WEARSTATUS_FIELD_NUMBER = 11;
    private int accuracy_;
    private int altitude_;
    private int batteryLevel_;
    private int heartRate_;
    private int latitude_;
    private int longitude_;
    private int posType_;
    private int pushUserState_;
    private int signal_;
    private int speed_;
    private int stayTime_;
    private int timestamp_;
    private String travelId_ = "";
    private int userState_;
    private int wearStatus_;

    public static final class Builder extends GeneratedMessageLite.Builder<SGP$SafeGuardSyncTravelData, Builder> implements SGP$SafeGuardSyncTravelDataOrBuilder {
        public Builder clearAccuracy() {
            copyOnWrite();
            ((SGP$SafeGuardSyncTravelData) this.instance).clearAccuracy();
            return this;
        }

        public Builder clearAltitude() {
            copyOnWrite();
            ((SGP$SafeGuardSyncTravelData) this.instance).clearAltitude();
            return this;
        }

        public Builder clearBatteryLevel() {
            copyOnWrite();
            ((SGP$SafeGuardSyncTravelData) this.instance).clearBatteryLevel();
            return this;
        }

        public Builder clearHeartRate() {
            copyOnWrite();
            ((SGP$SafeGuardSyncTravelData) this.instance).clearHeartRate();
            return this;
        }

        public Builder clearLatitude() {
            copyOnWrite();
            ((SGP$SafeGuardSyncTravelData) this.instance).clearLatitude();
            return this;
        }

        public Builder clearLongitude() {
            copyOnWrite();
            ((SGP$SafeGuardSyncTravelData) this.instance).clearLongitude();
            return this;
        }

        public Builder clearPosType() {
            copyOnWrite();
            ((SGP$SafeGuardSyncTravelData) this.instance).clearPosType();
            return this;
        }

        public Builder clearPushUserState() {
            copyOnWrite();
            ((SGP$SafeGuardSyncTravelData) this.instance).clearPushUserState();
            return this;
        }

        public Builder clearSignal() {
            copyOnWrite();
            ((SGP$SafeGuardSyncTravelData) this.instance).clearSignal();
            return this;
        }

        public Builder clearSpeed() {
            copyOnWrite();
            ((SGP$SafeGuardSyncTravelData) this.instance).clearSpeed();
            return this;
        }

        public Builder clearStayTime() {
            copyOnWrite();
            ((SGP$SafeGuardSyncTravelData) this.instance).clearStayTime();
            return this;
        }

        public Builder clearTimestamp() {
            copyOnWrite();
            ((SGP$SafeGuardSyncTravelData) this.instance).clearTimestamp();
            return this;
        }

        public Builder clearTravelId() {
            copyOnWrite();
            ((SGP$SafeGuardSyncTravelData) this.instance).clearTravelId();
            return this;
        }

        public Builder clearUserState() {
            copyOnWrite();
            ((SGP$SafeGuardSyncTravelData) this.instance).clearUserState();
            return this;
        }

        public Builder clearWearStatus() {
            copyOnWrite();
            ((SGP$SafeGuardSyncTravelData) this.instance).clearWearStatus();
            return this;
        }

        @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncTravelDataOrBuilder
        public int getAccuracy() {
            return ((SGP$SafeGuardSyncTravelData) this.instance).getAccuracy();
        }

        @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncTravelDataOrBuilder
        public int getAltitude() {
            return ((SGP$SafeGuardSyncTravelData) this.instance).getAltitude();
        }

        @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncTravelDataOrBuilder
        public int getBatteryLevel() {
            return ((SGP$SafeGuardSyncTravelData) this.instance).getBatteryLevel();
        }

        @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncTravelDataOrBuilder
        public int getHeartRate() {
            return ((SGP$SafeGuardSyncTravelData) this.instance).getHeartRate();
        }

        @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncTravelDataOrBuilder
        public int getLatitude() {
            return ((SGP$SafeGuardSyncTravelData) this.instance).getLatitude();
        }

        @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncTravelDataOrBuilder
        public int getLongitude() {
            return ((SGP$SafeGuardSyncTravelData) this.instance).getLongitude();
        }

        @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncTravelDataOrBuilder
        public int getPosType() {
            return ((SGP$SafeGuardSyncTravelData) this.instance).getPosType();
        }

        @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncTravelDataOrBuilder
        public int getPushUserState() {
            return ((SGP$SafeGuardSyncTravelData) this.instance).getPushUserState();
        }

        @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncTravelDataOrBuilder
        public int getSignal() {
            return ((SGP$SafeGuardSyncTravelData) this.instance).getSignal();
        }

        @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncTravelDataOrBuilder
        public int getSpeed() {
            return ((SGP$SafeGuardSyncTravelData) this.instance).getSpeed();
        }

        @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncTravelDataOrBuilder
        public int getStayTime() {
            return ((SGP$SafeGuardSyncTravelData) this.instance).getStayTime();
        }

        @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncTravelDataOrBuilder
        public int getTimestamp() {
            return ((SGP$SafeGuardSyncTravelData) this.instance).getTimestamp();
        }

        @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncTravelDataOrBuilder
        public String getTravelId() {
            return ((SGP$SafeGuardSyncTravelData) this.instance).getTravelId();
        }

        @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncTravelDataOrBuilder
        public ByteString getTravelIdBytes() {
            return ((SGP$SafeGuardSyncTravelData) this.instance).getTravelIdBytes();
        }

        @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncTravelDataOrBuilder
        public int getUserState() {
            return ((SGP$SafeGuardSyncTravelData) this.instance).getUserState();
        }

        @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncTravelDataOrBuilder
        public int getWearStatus() {
            return ((SGP$SafeGuardSyncTravelData) this.instance).getWearStatus();
        }

        public Builder setAccuracy(int i) {
            copyOnWrite();
            ((SGP$SafeGuardSyncTravelData) this.instance).setAccuracy(i);
            return this;
        }

        public Builder setAltitude(int i) {
            copyOnWrite();
            ((SGP$SafeGuardSyncTravelData) this.instance).setAltitude(i);
            return this;
        }

        public Builder setBatteryLevel(int i) {
            copyOnWrite();
            ((SGP$SafeGuardSyncTravelData) this.instance).setBatteryLevel(i);
            return this;
        }

        public Builder setHeartRate(int i) {
            copyOnWrite();
            ((SGP$SafeGuardSyncTravelData) this.instance).setHeartRate(i);
            return this;
        }

        public Builder setLatitude(int i) {
            copyOnWrite();
            ((SGP$SafeGuardSyncTravelData) this.instance).setLatitude(i);
            return this;
        }

        public Builder setLongitude(int i) {
            copyOnWrite();
            ((SGP$SafeGuardSyncTravelData) this.instance).setLongitude(i);
            return this;
        }

        public Builder setPosType(int i) {
            copyOnWrite();
            ((SGP$SafeGuardSyncTravelData) this.instance).setPosType(i);
            return this;
        }

        public Builder setPushUserState(int i) {
            copyOnWrite();
            ((SGP$SafeGuardSyncTravelData) this.instance).setPushUserState(i);
            return this;
        }

        public Builder setSignal(int i) {
            copyOnWrite();
            ((SGP$SafeGuardSyncTravelData) this.instance).setSignal(i);
            return this;
        }

        public Builder setSpeed(int i) {
            copyOnWrite();
            ((SGP$SafeGuardSyncTravelData) this.instance).setSpeed(i);
            return this;
        }

        public Builder setStayTime(int i) {
            copyOnWrite();
            ((SGP$SafeGuardSyncTravelData) this.instance).setStayTime(i);
            return this;
        }

        public Builder setTimestamp(int i) {
            copyOnWrite();
            ((SGP$SafeGuardSyncTravelData) this.instance).setTimestamp(i);
            return this;
        }

        public Builder setTravelId(String str) {
            copyOnWrite();
            ((SGP$SafeGuardSyncTravelData) this.instance).setTravelId(str);
            return this;
        }

        public Builder setTravelIdBytes(ByteString byteString) {
            copyOnWrite();
            ((SGP$SafeGuardSyncTravelData) this.instance).setTravelIdBytes(byteString);
            return this;
        }

        public Builder setUserState(int i) {
            copyOnWrite();
            ((SGP$SafeGuardSyncTravelData) this.instance).setUserState(i);
            return this;
        }

        public Builder setWearStatus(int i) {
            copyOnWrite();
            ((SGP$SafeGuardSyncTravelData) this.instance).setWearStatus(i);
            return this;
        }

        private Builder() {
            super(SGP$SafeGuardSyncTravelData.DEFAULT_INSTANCE);
        }
    }

    static {
        SGP$SafeGuardSyncTravelData sGP$SafeGuardSyncTravelData = new SGP$SafeGuardSyncTravelData();
        DEFAULT_INSTANCE = sGP$SafeGuardSyncTravelData;
        GeneratedMessageLite.registerDefaultInstance(SGP$SafeGuardSyncTravelData.class, sGP$SafeGuardSyncTravelData);
    }

    private SGP$SafeGuardSyncTravelData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccuracy() {
        this.accuracy_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAltitude() {
        this.altitude_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBatteryLevel() {
        this.batteryLevel_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeartRate() {
        this.heartRate_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatitude() {
        this.latitude_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLongitude() {
        this.longitude_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPosType() {
        this.posType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPushUserState() {
        this.pushUserState_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSignal() {
        this.signal_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeed() {
        this.speed_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStayTime() {
        this.stayTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTravelId() {
        this.travelId_ = getDefaultInstance().getTravelId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserState() {
        this.userState_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWearStatus() {
        this.wearStatus_ = 0;
    }

    public static SGP$SafeGuardSyncTravelData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SGP$SafeGuardSyncTravelData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SGP$SafeGuardSyncTravelData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SGP$SafeGuardSyncTravelData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SGP$SafeGuardSyncTravelData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SGP$SafeGuardSyncTravelData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccuracy(int i) {
        this.accuracy_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAltitude(int i) {
        this.altitude_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBatteryLevel(int i) {
        this.batteryLevel_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeartRate(int i) {
        this.heartRate_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatitude(int i) {
        this.latitude_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLongitude(int i) {
        this.longitude_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPosType(int i) {
        this.posType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPushUserState(int i) {
        this.pushUserState_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSignal(int i) {
        this.signal_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeed(int i) {
        this.speed_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStayTime(int i) {
        this.stayTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(int i) {
        this.timestamp_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTravelId(String str) {
        str.getClass();
        this.travelId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTravelIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.travelId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserState(int i) {
        this.userState_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWearStatus(int i) {
        this.wearStatus_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (l5g.a[methodToInvoke.ordinal()]) {
            case 1:
                return new SGP$SafeGuardSyncTravelData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0000\u0001\u000f\u000f\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b\u0004\t\u0004\n\u0004\u000b\u0004\f\u0004\r\u0004\u000e\u0004\u000f\u0004", new Object[]{"travelId_", "timestamp_", "posType_", "signal_", "latitude_", "longitude_", "altitude_", "speed_", "accuracy_", "batteryLevel_", "wearStatus_", "heartRate_", "userState_", "stayTime_", "pushUserState_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SGP$SafeGuardSyncTravelData> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (SGP$SafeGuardSyncTravelData.class) {
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

    @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncTravelDataOrBuilder
    public int getAccuracy() {
        return this.accuracy_;
    }

    @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncTravelDataOrBuilder
    public int getAltitude() {
        return this.altitude_;
    }

    @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncTravelDataOrBuilder
    public int getBatteryLevel() {
        return this.batteryLevel_;
    }

    @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncTravelDataOrBuilder
    public int getHeartRate() {
        return this.heartRate_;
    }

    @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncTravelDataOrBuilder
    public int getLatitude() {
        return this.latitude_;
    }

    @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncTravelDataOrBuilder
    public int getLongitude() {
        return this.longitude_;
    }

    @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncTravelDataOrBuilder
    public int getPosType() {
        return this.posType_;
    }

    @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncTravelDataOrBuilder
    public int getPushUserState() {
        return this.pushUserState_;
    }

    @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncTravelDataOrBuilder
    public int getSignal() {
        return this.signal_;
    }

    @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncTravelDataOrBuilder
    public int getSpeed() {
        return this.speed_;
    }

    @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncTravelDataOrBuilder
    public int getStayTime() {
        return this.stayTime_;
    }

    @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncTravelDataOrBuilder
    public int getTimestamp() {
        return this.timestamp_;
    }

    @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncTravelDataOrBuilder
    public String getTravelId() {
        return this.travelId_;
    }

    @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncTravelDataOrBuilder
    public ByteString getTravelIdBytes() {
        return ByteString.copyFromUtf8(this.travelId_);
    }

    @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncTravelDataOrBuilder
    public int getUserState() {
        return this.userState_;
    }

    @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncTravelDataOrBuilder
    public int getWearStatus() {
        return this.wearStatus_;
    }

    public static Builder newBuilder(SGP$SafeGuardSyncTravelData sGP$SafeGuardSyncTravelData) {
        return DEFAULT_INSTANCE.createBuilder(sGP$SafeGuardSyncTravelData);
    }

    public static SGP$SafeGuardSyncTravelData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SGP$SafeGuardSyncTravelData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SGP$SafeGuardSyncTravelData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SGP$SafeGuardSyncTravelData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SGP$SafeGuardSyncTravelData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SGP$SafeGuardSyncTravelData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SGP$SafeGuardSyncTravelData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SGP$SafeGuardSyncTravelData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SGP$SafeGuardSyncTravelData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SGP$SafeGuardSyncTravelData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SGP$SafeGuardSyncTravelData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SGP$SafeGuardSyncTravelData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SGP$SafeGuardSyncTravelData parseFrom(InputStream inputStream) throws IOException {
        return (SGP$SafeGuardSyncTravelData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SGP$SafeGuardSyncTravelData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SGP$SafeGuardSyncTravelData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SGP$SafeGuardSyncTravelData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SGP$SafeGuardSyncTravelData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SGP$SafeGuardSyncTravelData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SGP$SafeGuardSyncTravelData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
