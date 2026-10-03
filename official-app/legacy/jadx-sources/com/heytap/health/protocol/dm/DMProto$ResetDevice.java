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
public final class DMProto$ResetDevice extends GeneratedMessageLite<DMProto$ResetDevice, Builder> implements DMProto$ResetDeviceOrBuilder {
    private static final DMProto$ResetDevice DEFAULT_INSTANCE;
    private static volatile Parser<DMProto$ResetDevice> PARSER = null;
    public static final int RESET_TYPE_FIELD_NUMBER = 1;
    private int resetType_;

    public static final class Builder extends GeneratedMessageLite.Builder<DMProto$ResetDevice, Builder> implements DMProto$ResetDeviceOrBuilder {
        public Builder clearResetType() {
            copyOnWrite();
            ((DMProto$ResetDevice) this.instance).clearResetType();
            return this;
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ResetDeviceOrBuilder
        public int getResetType() {
            return ((DMProto$ResetDevice) this.instance).getResetType();
        }

        public Builder setResetType(int i) {
            copyOnWrite();
            ((DMProto$ResetDevice) this.instance).setResetType(i);
            return this;
        }

        private Builder() {
            super(DMProto$ResetDevice.DEFAULT_INSTANCE);
        }
    }

    static {
        DMProto$ResetDevice dMProto$ResetDevice = new DMProto$ResetDevice();
        DEFAULT_INSTANCE = dMProto$ResetDevice;
        GeneratedMessageLite.registerDefaultInstance(DMProto$ResetDevice.class, dMProto$ResetDevice);
    }

    private DMProto$ResetDevice() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResetType() {
        this.resetType_ = 0;
    }

    public static DMProto$ResetDevice getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DMProto$ResetDevice parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DMProto$ResetDevice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$ResetDevice parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DMProto$ResetDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DMProto$ResetDevice> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResetType(int i) {
        this.resetType_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yl4.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DMProto$ResetDevice();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"resetType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DMProto$ResetDevice> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DMProto$ResetDevice.class) {
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

    @Override // com.heytap.health.protocol.dm.DMProto$ResetDeviceOrBuilder
    public int getResetType() {
        return this.resetType_;
    }

    public static Builder newBuilder(DMProto$ResetDevice dMProto$ResetDevice) {
        return DEFAULT_INSTANCE.createBuilder(dMProto$ResetDevice);
    }

    public static DMProto$ResetDevice parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$ResetDevice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$ResetDevice parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$ResetDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DMProto$ResetDevice parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DMProto$ResetDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DMProto$ResetDevice parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$ResetDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DMProto$ResetDevice parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DMProto$ResetDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DMProto$ResetDevice parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$ResetDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DMProto$ResetDevice parseFrom(InputStream inputStream) throws IOException {
        return (DMProto$ResetDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$ResetDevice parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$ResetDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$ResetDevice parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DMProto$ResetDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DMProto$ResetDevice parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$ResetDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
