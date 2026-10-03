package com.heytap.health.protocol.dm;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.yl4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class DMProto$HisChargingInfoRes extends GeneratedMessageLite<DMProto$HisChargingInfoRes, Builder> implements DMProto$HisChargingInfoResOrBuilder {
    private static final DMProto$HisChargingInfoRes DEFAULT_INSTANCE;
    public static final int HIS_BATTERY_FIELD_NUMBER = 1;
    private static volatile Parser<DMProto$HisChargingInfoRes> PARSER = null;
    public static final int USED_TIME_FIELD_NUMBER = 2;
    private int hisBattery_;
    private int usedTime_;

    public static final class Builder extends GeneratedMessageLite.Builder<DMProto$HisChargingInfoRes, Builder> implements DMProto$HisChargingInfoResOrBuilder {
        public Builder clearHisBattery() {
            copyOnWrite();
            ((DMProto$HisChargingInfoRes) this.instance).clearHisBattery();
            return this;
        }

        public Builder clearUsedTime() {
            copyOnWrite();
            ((DMProto$HisChargingInfoRes) this.instance).clearUsedTime();
            return this;
        }

        @Override // com.heytap.health.protocol.dm.DMProto$HisChargingInfoResOrBuilder
        public int getHisBattery() {
            return ((DMProto$HisChargingInfoRes) this.instance).getHisBattery();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$HisChargingInfoResOrBuilder
        public int getUsedTime() {
            return ((DMProto$HisChargingInfoRes) this.instance).getUsedTime();
        }

        public Builder setHisBattery(int i) {
            copyOnWrite();
            ((DMProto$HisChargingInfoRes) this.instance).setHisBattery(i);
            return this;
        }

        public Builder setUsedTime(int i) {
            copyOnWrite();
            ((DMProto$HisChargingInfoRes) this.instance).setUsedTime(i);
            return this;
        }

        private Builder() {
            super(DMProto$HisChargingInfoRes.DEFAULT_INSTANCE);
        }
    }

    static {
        DMProto$HisChargingInfoRes dMProto$HisChargingInfoRes = new DMProto$HisChargingInfoRes();
        DEFAULT_INSTANCE = dMProto$HisChargingInfoRes;
        GeneratedMessageLite.registerDefaultInstance(DMProto$HisChargingInfoRes.class, dMProto$HisChargingInfoRes);
    }

    private DMProto$HisChargingInfoRes() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHisBattery() {
        this.hisBattery_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUsedTime() {
        this.usedTime_ = 0;
    }

    public static DMProto$HisChargingInfoRes getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DMProto$HisChargingInfoRes parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DMProto$HisChargingInfoRes) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$HisChargingInfoRes parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DMProto$HisChargingInfoRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DMProto$HisChargingInfoRes> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHisBattery(int i) {
        this.hisBattery_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsedTime(int i) {
        this.usedTime_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yl4.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DMProto$HisChargingInfoRes();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"hisBattery_", "usedTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DMProto$HisChargingInfoRes> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DMProto$HisChargingInfoRes.class) {
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

    @Override // com.heytap.health.protocol.dm.DMProto$HisChargingInfoResOrBuilder
    public int getHisBattery() {
        return this.hisBattery_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$HisChargingInfoResOrBuilder
    public int getUsedTime() {
        return this.usedTime_;
    }

    public static Builder newBuilder(DMProto$HisChargingInfoRes dMProto$HisChargingInfoRes) {
        return DEFAULT_INSTANCE.createBuilder(dMProto$HisChargingInfoRes);
    }

    public static DMProto$HisChargingInfoRes parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$HisChargingInfoRes) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$HisChargingInfoRes parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$HisChargingInfoRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DMProto$HisChargingInfoRes parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DMProto$HisChargingInfoRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DMProto$HisChargingInfoRes parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$HisChargingInfoRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DMProto$HisChargingInfoRes parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DMProto$HisChargingInfoRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DMProto$HisChargingInfoRes parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$HisChargingInfoRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DMProto$HisChargingInfoRes parseFrom(InputStream inputStream) throws IOException {
        return (DMProto$HisChargingInfoRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$HisChargingInfoRes parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$HisChargingInfoRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$HisChargingInfoRes parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DMProto$HisChargingInfoRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DMProto$HisChargingInfoRes parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$HisChargingInfoRes) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
