package com.heytap.health.protocol.device_breeno;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.ab5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class DeviceBreenoProto$BreenoCar extends GeneratedMessageLite<DeviceBreenoProto$BreenoCar, Builder> implements DeviceBreenoProto$BreenoCarOrBuilder {
    private static final DeviceBreenoProto$BreenoCar DEFAULT_INSTANCE;
    public static final int FIRSTBIND_FIELD_NUMBER = 3;
    public static final int HASCAR_FIELD_NUMBER = 2;
    private static volatile Parser<DeviceBreenoProto$BreenoCar> PARSER = null;
    public static final int SUPPORT_FIELD_NUMBER = 1;
    private boolean firstBind_;
    private boolean hasCar_;
    private boolean support_;

    public static final class Builder extends GeneratedMessageLite.Builder<DeviceBreenoProto$BreenoCar, Builder> implements DeviceBreenoProto$BreenoCarOrBuilder {
        public Builder clearFirstBind() {
            copyOnWrite();
            ((DeviceBreenoProto$BreenoCar) this.instance).clearFirstBind();
            return this;
        }

        public Builder clearHasCar() {
            copyOnWrite();
            ((DeviceBreenoProto$BreenoCar) this.instance).clearHasCar();
            return this;
        }

        public Builder clearSupport() {
            copyOnWrite();
            ((DeviceBreenoProto$BreenoCar) this.instance).clearSupport();
            return this;
        }

        @Override // com.heytap.health.protocol.device_breeno.DeviceBreenoProto$BreenoCarOrBuilder
        public boolean getFirstBind() {
            return ((DeviceBreenoProto$BreenoCar) this.instance).getFirstBind();
        }

        @Override // com.heytap.health.protocol.device_breeno.DeviceBreenoProto$BreenoCarOrBuilder
        public boolean getHasCar() {
            return ((DeviceBreenoProto$BreenoCar) this.instance).getHasCar();
        }

        @Override // com.heytap.health.protocol.device_breeno.DeviceBreenoProto$BreenoCarOrBuilder
        public boolean getSupport() {
            return ((DeviceBreenoProto$BreenoCar) this.instance).getSupport();
        }

        public Builder setFirstBind(boolean z) {
            copyOnWrite();
            ((DeviceBreenoProto$BreenoCar) this.instance).setFirstBind(z);
            return this;
        }

        public Builder setHasCar(boolean z) {
            copyOnWrite();
            ((DeviceBreenoProto$BreenoCar) this.instance).setHasCar(z);
            return this;
        }

        public Builder setSupport(boolean z) {
            copyOnWrite();
            ((DeviceBreenoProto$BreenoCar) this.instance).setSupport(z);
            return this;
        }

        private Builder() {
            super(DeviceBreenoProto$BreenoCar.DEFAULT_INSTANCE);
        }
    }

    static {
        DeviceBreenoProto$BreenoCar deviceBreenoProto$BreenoCar = new DeviceBreenoProto$BreenoCar();
        DEFAULT_INSTANCE = deviceBreenoProto$BreenoCar;
        GeneratedMessageLite.registerDefaultInstance(DeviceBreenoProto$BreenoCar.class, deviceBreenoProto$BreenoCar);
    }

    private DeviceBreenoProto$BreenoCar() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFirstBind() {
        this.firstBind_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasCar() {
        this.hasCar_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSupport() {
        this.support_ = false;
    }

    public static DeviceBreenoProto$BreenoCar getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DeviceBreenoProto$BreenoCar parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DeviceBreenoProto$BreenoCar) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DeviceBreenoProto$BreenoCar parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DeviceBreenoProto$BreenoCar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DeviceBreenoProto$BreenoCar> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirstBind(boolean z) {
        this.firstBind_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasCar(boolean z) {
        this.hasCar_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSupport(boolean z) {
        this.support_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = ab5.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DeviceBreenoProto$BreenoCar();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007", new Object[]{"support_", "hasCar_", "firstBind_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DeviceBreenoProto$BreenoCar> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DeviceBreenoProto$BreenoCar.class) {
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

    @Override // com.heytap.health.protocol.device_breeno.DeviceBreenoProto$BreenoCarOrBuilder
    public boolean getFirstBind() {
        return this.firstBind_;
    }

    @Override // com.heytap.health.protocol.device_breeno.DeviceBreenoProto$BreenoCarOrBuilder
    public boolean getHasCar() {
        return this.hasCar_;
    }

    @Override // com.heytap.health.protocol.device_breeno.DeviceBreenoProto$BreenoCarOrBuilder
    public boolean getSupport() {
        return this.support_;
    }

    public static Builder newBuilder(DeviceBreenoProto$BreenoCar deviceBreenoProto$BreenoCar) {
        return DEFAULT_INSTANCE.createBuilder(deviceBreenoProto$BreenoCar);
    }

    public static DeviceBreenoProto$BreenoCar parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DeviceBreenoProto$BreenoCar) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DeviceBreenoProto$BreenoCar parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DeviceBreenoProto$BreenoCar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DeviceBreenoProto$BreenoCar parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DeviceBreenoProto$BreenoCar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DeviceBreenoProto$BreenoCar parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DeviceBreenoProto$BreenoCar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DeviceBreenoProto$BreenoCar parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DeviceBreenoProto$BreenoCar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DeviceBreenoProto$BreenoCar parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DeviceBreenoProto$BreenoCar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DeviceBreenoProto$BreenoCar parseFrom(InputStream inputStream) throws IOException {
        return (DeviceBreenoProto$BreenoCar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DeviceBreenoProto$BreenoCar parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DeviceBreenoProto$BreenoCar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DeviceBreenoProto$BreenoCar parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DeviceBreenoProto$BreenoCar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DeviceBreenoProto$BreenoCar parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DeviceBreenoProto$BreenoCar) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
