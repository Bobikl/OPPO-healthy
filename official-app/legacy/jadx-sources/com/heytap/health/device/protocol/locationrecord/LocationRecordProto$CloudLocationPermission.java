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
public final class LocationRecordProto$CloudLocationPermission extends GeneratedMessageLite<LocationRecordProto$CloudLocationPermission, Builder> implements LocationRecordProto$CloudLocationPermissionOrBuilder {
    private static final LocationRecordProto$CloudLocationPermission DEFAULT_INSTANCE;
    private static volatile Parser<LocationRecordProto$CloudLocationPermission> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int status_;

    public static final class Builder extends GeneratedMessageLite.Builder<LocationRecordProto$CloudLocationPermission, Builder> implements LocationRecordProto$CloudLocationPermissionOrBuilder {
        public Builder clearStatus() {
            copyOnWrite();
            ((LocationRecordProto$CloudLocationPermission) this.instance).clearStatus();
            return this;
        }

        @Override // com.heytap.health.device.protocol.locationrecord.LocationRecordProto$CloudLocationPermissionOrBuilder
        public int getStatus() {
            return ((LocationRecordProto$CloudLocationPermission) this.instance).getStatus();
        }

        public Builder setStatus(int i) {
            copyOnWrite();
            ((LocationRecordProto$CloudLocationPermission) this.instance).setStatus(i);
            return this;
        }

        private Builder() {
            super(LocationRecordProto$CloudLocationPermission.DEFAULT_INSTANCE);
        }
    }

    static {
        LocationRecordProto$CloudLocationPermission locationRecordProto$CloudLocationPermission = new LocationRecordProto$CloudLocationPermission();
        DEFAULT_INSTANCE = locationRecordProto$CloudLocationPermission;
        GeneratedMessageLite.registerDefaultInstance(LocationRecordProto$CloudLocationPermission.class, locationRecordProto$CloudLocationPermission);
    }

    private LocationRecordProto$CloudLocationPermission() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = 0;
    }

    public static LocationRecordProto$CloudLocationPermission getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LocationRecordProto$CloudLocationPermission parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LocationRecordProto$CloudLocationPermission) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LocationRecordProto$CloudLocationPermission parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LocationRecordProto$CloudLocationPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LocationRecordProto$CloudLocationPermission> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(int i) {
        this.status_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = m5b.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new LocationRecordProto$CloudLocationPermission();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"status_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LocationRecordProto$CloudLocationPermission> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (LocationRecordProto$CloudLocationPermission.class) {
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

    @Override // com.heytap.health.device.protocol.locationrecord.LocationRecordProto$CloudLocationPermissionOrBuilder
    public int getStatus() {
        return this.status_;
    }

    public static Builder newBuilder(LocationRecordProto$CloudLocationPermission locationRecordProto$CloudLocationPermission) {
        return DEFAULT_INSTANCE.createBuilder(locationRecordProto$CloudLocationPermission);
    }

    public static LocationRecordProto$CloudLocationPermission parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LocationRecordProto$CloudLocationPermission) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LocationRecordProto$CloudLocationPermission parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LocationRecordProto$CloudLocationPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LocationRecordProto$CloudLocationPermission parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LocationRecordProto$CloudLocationPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LocationRecordProto$CloudLocationPermission parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LocationRecordProto$CloudLocationPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LocationRecordProto$CloudLocationPermission parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LocationRecordProto$CloudLocationPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LocationRecordProto$CloudLocationPermission parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LocationRecordProto$CloudLocationPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LocationRecordProto$CloudLocationPermission parseFrom(InputStream inputStream) throws IOException {
        return (LocationRecordProto$CloudLocationPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LocationRecordProto$CloudLocationPermission parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LocationRecordProto$CloudLocationPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LocationRecordProto$CloudLocationPermission parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LocationRecordProto$CloudLocationPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LocationRecordProto$CloudLocationPermission parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LocationRecordProto$CloudLocationPermission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
