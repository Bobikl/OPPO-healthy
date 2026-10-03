package com.heytap.health.protocol.dm;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.model.om4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\official-device-assets\classes17.dex */
public final class DMProto$BatteryInfo extends GeneratedMessageLite<DMProto$BatteryInfo, Builder> implements DMProto$BatteryInfoOrBuilder {
    public static final int BATTERY_PERCENT_FIELD_NUMBER = 1;
    private static final DMProto$BatteryInfo DEFAULT_INSTANCE;
    public static final int DEVICE_MAC_FIELD_NUMBER = 2;
    public static final int IS_CHARGING_FIELD_NUMBER = 3;
    private static volatile Parser<DMProto$BatteryInfo> PARSER;
    private int batteryPercent_;
    private String deviceMac_ = "";
    private int isCharging_;

    public static final class Builder extends GeneratedMessageLite.Builder<DMProto$BatteryInfo, Builder> implements DMProto$BatteryInfoOrBuilder {
        public Builder clearBatteryPercent() {
            copyOnWrite();
            ((DMProto$BatteryInfo) ((GeneratedMessageLite.Builder) this).instance).clearBatteryPercent();
            return this;
        }

        public Builder clearDeviceMac() {
            copyOnWrite();
            ((DMProto$BatteryInfo) ((GeneratedMessageLite.Builder) this).instance).clearDeviceMac();
            return this;
        }

        public Builder clearIsCharging() {
            copyOnWrite();
            ((DMProto$BatteryInfo) ((GeneratedMessageLite.Builder) this).instance).clearIsCharging();
            return this;
        }

        @Override // com.heytap.health.protocol.dm.DMProto$BatteryInfoOrBuilder
        public int getBatteryPercent() {
            return ((DMProto$BatteryInfo) ((GeneratedMessageLite.Builder) this).instance).getBatteryPercent();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$BatteryInfoOrBuilder
        public String getDeviceMac() {
            return ((DMProto$BatteryInfo) ((GeneratedMessageLite.Builder) this).instance).getDeviceMac();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$BatteryInfoOrBuilder
        public ByteString getDeviceMacBytes() {
            return ((DMProto$BatteryInfo) ((GeneratedMessageLite.Builder) this).instance).getDeviceMacBytes();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$BatteryInfoOrBuilder
        public int getIsCharging() {
            return ((DMProto$BatteryInfo) ((GeneratedMessageLite.Builder) this).instance).getIsCharging();
        }

        public Builder setBatteryPercent(int i) {
            copyOnWrite();
            ((DMProto$BatteryInfo) ((GeneratedMessageLite.Builder) this).instance).setBatteryPercent(i);
            return this;
        }

        public Builder setDeviceMac(String str) {
            copyOnWrite();
            ((DMProto$BatteryInfo) ((GeneratedMessageLite.Builder) this).instance).setDeviceMac(str);
            return this;
        }

        public Builder setDeviceMacBytes(ByteString byteString) {
            copyOnWrite();
            ((DMProto$BatteryInfo) ((GeneratedMessageLite.Builder) this).instance).setDeviceMacBytes(byteString);
            return this;
        }

        public Builder setIsCharging(int i) {
            copyOnWrite();
            ((DMProto$BatteryInfo) ((GeneratedMessageLite.Builder) this).instance).setIsCharging(i);
            return this;
        }

        private Builder() {
            super(DMProto$BatteryInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        DMProto$BatteryInfo dMProto$BatteryInfo = new DMProto$BatteryInfo();
        DEFAULT_INSTANCE = dMProto$BatteryInfo;
        GeneratedMessageLite.registerDefaultInstance(DMProto$BatteryInfo.class, dMProto$BatteryInfo);
    }

    private DMProto$BatteryInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBatteryPercent() {
        this.batteryPercent_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceMac() {
        this.deviceMac_ = getDefaultInstance().getDeviceMac();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsCharging() {
        this.isCharging_ = 0;
    }

    public static DMProto$BatteryInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static DMProto$BatteryInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DMProto$BatteryInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$BatteryInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DMProto$BatteryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DMProto$BatteryInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBatteryPercent(int i) {
        this.batteryPercent_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceMac(String str) {
        str.getClass();
        this.deviceMac_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceMacBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.deviceMac_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsCharging(int i) {
        this.isCharging_ = i;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = om4.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DMProto$BatteryInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003\u000b", new Object[]{"batteryPercent_", "deviceMac_", "isCharging_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DMProto$BatteryInfo.class) {
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

    @Override // com.heytap.health.protocol.dm.DMProto$BatteryInfoOrBuilder
    public int getBatteryPercent() {
        return this.batteryPercent_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$BatteryInfoOrBuilder
    public String getDeviceMac() {
        return this.deviceMac_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$BatteryInfoOrBuilder
    public ByteString getDeviceMacBytes() {
        return ByteString.copyFromUtf8(this.deviceMac_);
    }

    @Override // com.heytap.health.protocol.dm.DMProto$BatteryInfoOrBuilder
    public int getIsCharging() {
        return this.isCharging_;
    }

    public static Builder newBuilder(DMProto$BatteryInfo dMProto$BatteryInfo) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(dMProto$BatteryInfo);
    }

    public static DMProto$BatteryInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$BatteryInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$BatteryInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$BatteryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DMProto$BatteryInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DMProto$BatteryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DMProto$BatteryInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$BatteryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DMProto$BatteryInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DMProto$BatteryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DMProto$BatteryInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$BatteryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DMProto$BatteryInfo parseFrom(InputStream inputStream) throws IOException {
        return (DMProto$BatteryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$BatteryInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$BatteryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$BatteryInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DMProto$BatteryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DMProto$BatteryInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$BatteryInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
