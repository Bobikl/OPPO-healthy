package com.heytap.health.device.protocol.emergency;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.zk6;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes16.dex */
public final class EmergencySettingProto$AutoEmergencyCall extends GeneratedMessageLite<EmergencySettingProto$AutoEmergencyCall, Builder> implements EmergencySettingProto$AutoEmergencyCallOrBuilder {
    private static final EmergencySettingProto$AutoEmergencyCall DEFAULT_INSTANCE;
    private static volatile Parser<EmergencySettingProto$AutoEmergencyCall> PARSER = null;
    public static final int SWITCH_FIELD_NUMBER = 1;
    private boolean switch_;

    public static final class Builder extends GeneratedMessageLite.Builder<EmergencySettingProto$AutoEmergencyCall, Builder> implements EmergencySettingProto$AutoEmergencyCallOrBuilder {
        public Builder clearSwitch() {
            copyOnWrite();
            ((EmergencySettingProto$AutoEmergencyCall) this.instance).clearSwitch();
            return this;
        }

        @Override // com.heytap.health.device.protocol.emergency.EmergencySettingProto$AutoEmergencyCallOrBuilder
        public boolean getSwitch() {
            return ((EmergencySettingProto$AutoEmergencyCall) this.instance).getSwitch();
        }

        public Builder setSwitch(boolean z) {
            copyOnWrite();
            ((EmergencySettingProto$AutoEmergencyCall) this.instance).setSwitch(z);
            return this;
        }

        private Builder() {
            super(EmergencySettingProto$AutoEmergencyCall.DEFAULT_INSTANCE);
        }
    }

    static {
        EmergencySettingProto$AutoEmergencyCall emergencySettingProto$AutoEmergencyCall = new EmergencySettingProto$AutoEmergencyCall();
        DEFAULT_INSTANCE = emergencySettingProto$AutoEmergencyCall;
        GeneratedMessageLite.registerDefaultInstance(EmergencySettingProto$AutoEmergencyCall.class, emergencySettingProto$AutoEmergencyCall);
    }

    private EmergencySettingProto$AutoEmergencyCall() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSwitch() {
        this.switch_ = false;
    }

    public static EmergencySettingProto$AutoEmergencyCall getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static EmergencySettingProto$AutoEmergencyCall parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EmergencySettingProto$AutoEmergencyCall) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EmergencySettingProto$AutoEmergencyCall parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EmergencySettingProto$AutoEmergencyCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<EmergencySettingProto$AutoEmergencyCall> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSwitch(boolean z) {
        this.switch_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = zk6.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new EmergencySettingProto$AutoEmergencyCall();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"switch_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<EmergencySettingProto$AutoEmergencyCall> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (EmergencySettingProto$AutoEmergencyCall.class) {
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

    @Override // com.heytap.health.device.protocol.emergency.EmergencySettingProto$AutoEmergencyCallOrBuilder
    public boolean getSwitch() {
        return this.switch_;
    }

    public static Builder newBuilder(EmergencySettingProto$AutoEmergencyCall emergencySettingProto$AutoEmergencyCall) {
        return DEFAULT_INSTANCE.createBuilder(emergencySettingProto$AutoEmergencyCall);
    }

    public static EmergencySettingProto$AutoEmergencyCall parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EmergencySettingProto$AutoEmergencyCall) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EmergencySettingProto$AutoEmergencyCall parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EmergencySettingProto$AutoEmergencyCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static EmergencySettingProto$AutoEmergencyCall parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EmergencySettingProto$AutoEmergencyCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static EmergencySettingProto$AutoEmergencyCall parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EmergencySettingProto$AutoEmergencyCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static EmergencySettingProto$AutoEmergencyCall parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EmergencySettingProto$AutoEmergencyCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EmergencySettingProto$AutoEmergencyCall parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EmergencySettingProto$AutoEmergencyCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static EmergencySettingProto$AutoEmergencyCall parseFrom(InputStream inputStream) throws IOException {
        return (EmergencySettingProto$AutoEmergencyCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EmergencySettingProto$AutoEmergencyCall parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EmergencySettingProto$AutoEmergencyCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EmergencySettingProto$AutoEmergencyCall parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EmergencySettingProto$AutoEmergencyCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static EmergencySettingProto$AutoEmergencyCall parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EmergencySettingProto$AutoEmergencyCall) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
