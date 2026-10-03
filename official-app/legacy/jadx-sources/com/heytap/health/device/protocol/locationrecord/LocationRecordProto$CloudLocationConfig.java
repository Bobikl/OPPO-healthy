package com.heytap.health.device.protocol.locationrecord;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.m5b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes16.dex */
public final class LocationRecordProto$CloudLocationConfig extends GeneratedMessageLite<LocationRecordProto$CloudLocationConfig, Builder> implements LocationRecordProto$CloudLocationConfigOrBuilder {
    private static final LocationRecordProto$CloudLocationConfig DEFAULT_INSTANCE;
    public static final int ENABLE_FIELD_NUMBER = 1;
    public static final int INTERVAL_FIELD_NUMBER = 2;
    private static volatile Parser<LocationRecordProto$CloudLocationConfig> PARSER = null;
    public static final int RESERVED_FIELD_NUMBER = 3;
    private int enable_;
    private int interval_;
    private int reserved_;

    public static final class Builder extends GeneratedMessageLite.Builder<LocationRecordProto$CloudLocationConfig, Builder> implements LocationRecordProto$CloudLocationConfigOrBuilder {
        public Builder clearEnable() {
            copyOnWrite();
            ((LocationRecordProto$CloudLocationConfig) this.instance).clearEnable();
            return this;
        }

        public Builder clearInterval() {
            copyOnWrite();
            ((LocationRecordProto$CloudLocationConfig) this.instance).clearInterval();
            return this;
        }

        public Builder clearReserved() {
            copyOnWrite();
            ((LocationRecordProto$CloudLocationConfig) this.instance).clearReserved();
            return this;
        }

        @Override // com.heytap.health.device.protocol.locationrecord.LocationRecordProto$CloudLocationConfigOrBuilder
        public int getEnable() {
            return ((LocationRecordProto$CloudLocationConfig) this.instance).getEnable();
        }

        @Override // com.heytap.health.device.protocol.locationrecord.LocationRecordProto$CloudLocationConfigOrBuilder
        public int getInterval() {
            return ((LocationRecordProto$CloudLocationConfig) this.instance).getInterval();
        }

        @Override // com.heytap.health.device.protocol.locationrecord.LocationRecordProto$CloudLocationConfigOrBuilder
        public int getReserved() {
            return ((LocationRecordProto$CloudLocationConfig) this.instance).getReserved();
        }

        public Builder setEnable(int i) {
            copyOnWrite();
            ((LocationRecordProto$CloudLocationConfig) this.instance).setEnable(i);
            return this;
        }

        public Builder setInterval(int i) {
            copyOnWrite();
            ((LocationRecordProto$CloudLocationConfig) this.instance).setInterval(i);
            return this;
        }

        public Builder setReserved(int i) {
            copyOnWrite();
            ((LocationRecordProto$CloudLocationConfig) this.instance).setReserved(i);
            return this;
        }

        private Builder() {
            super(LocationRecordProto$CloudLocationConfig.DEFAULT_INSTANCE);
        }
    }

    static {
        LocationRecordProto$CloudLocationConfig locationRecordProto$CloudLocationConfig = new LocationRecordProto$CloudLocationConfig();
        DEFAULT_INSTANCE = locationRecordProto$CloudLocationConfig;
        GeneratedMessageLite.registerDefaultInstance(LocationRecordProto$CloudLocationConfig.class, locationRecordProto$CloudLocationConfig);
    }

    private LocationRecordProto$CloudLocationConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnable() {
        this.enable_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInterval() {
        this.interval_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReserved() {
        this.reserved_ = 0;
    }

    public static LocationRecordProto$CloudLocationConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LocationRecordProto$CloudLocationConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LocationRecordProto$CloudLocationConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LocationRecordProto$CloudLocationConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LocationRecordProto$CloudLocationConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LocationRecordProto$CloudLocationConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnable(int i) {
        this.enable_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInterval(int i) {
        this.interval_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReserved(int i) {
        this.reserved_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = m5b.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new LocationRecordProto$CloudLocationConfig();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b", new Object[]{"enable_", "interval_", "reserved_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LocationRecordProto$CloudLocationConfig> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (LocationRecordProto$CloudLocationConfig.class) {
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

    @Override // com.heytap.health.device.protocol.locationrecord.LocationRecordProto$CloudLocationConfigOrBuilder
    public int getEnable() {
        return this.enable_;
    }

    @Override // com.heytap.health.device.protocol.locationrecord.LocationRecordProto$CloudLocationConfigOrBuilder
    public int getInterval() {
        return this.interval_;
    }

    @Override // com.heytap.health.device.protocol.locationrecord.LocationRecordProto$CloudLocationConfigOrBuilder
    public int getReserved() {
        return this.reserved_;
    }

    public static Builder newBuilder(LocationRecordProto$CloudLocationConfig locationRecordProto$CloudLocationConfig) {
        return DEFAULT_INSTANCE.createBuilder(locationRecordProto$CloudLocationConfig);
    }

    public static LocationRecordProto$CloudLocationConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LocationRecordProto$CloudLocationConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LocationRecordProto$CloudLocationConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LocationRecordProto$CloudLocationConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LocationRecordProto$CloudLocationConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LocationRecordProto$CloudLocationConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LocationRecordProto$CloudLocationConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LocationRecordProto$CloudLocationConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LocationRecordProto$CloudLocationConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LocationRecordProto$CloudLocationConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LocationRecordProto$CloudLocationConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LocationRecordProto$CloudLocationConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LocationRecordProto$CloudLocationConfig parseFrom(InputStream inputStream) throws IOException {
        return (LocationRecordProto$CloudLocationConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LocationRecordProto$CloudLocationConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LocationRecordProto$CloudLocationConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LocationRecordProto$CloudLocationConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LocationRecordProto$CloudLocationConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LocationRecordProto$CloudLocationConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LocationRecordProto$CloudLocationConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
