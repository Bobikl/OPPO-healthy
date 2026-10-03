package com.heytap.sportwatch.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.r98;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class GpsData$HFGpsPoint extends GeneratedMessageLite<GpsData$HFGpsPoint, Builder> implements GpsData$HFGpsPointOrBuilder {
    private static final GpsData$HFGpsPoint DEFAULT_INSTANCE;
    public static final int LAT_FIELD_NUMBER = 1;
    public static final int LNG_FIELD_NUMBER = 2;
    private static volatile Parser<GpsData$HFGpsPoint> PARSER;
    private double lat_;
    private double lng_;

    public static final class Builder extends GeneratedMessageLite.Builder<GpsData$HFGpsPoint, Builder> implements GpsData$HFGpsPointOrBuilder {
        public Builder clearLat() {
            copyOnWrite();
            ((GpsData$HFGpsPoint) this.instance).clearLat();
            return this;
        }

        public Builder clearLng() {
            copyOnWrite();
            ((GpsData$HFGpsPoint) this.instance).clearLng();
            return this;
        }

        @Override // com.heytap.sportwatch.proto.GpsData$HFGpsPointOrBuilder
        public double getLat() {
            return ((GpsData$HFGpsPoint) this.instance).getLat();
        }

        @Override // com.heytap.sportwatch.proto.GpsData$HFGpsPointOrBuilder
        public double getLng() {
            return ((GpsData$HFGpsPoint) this.instance).getLng();
        }

        public Builder setLat(double d) {
            copyOnWrite();
            ((GpsData$HFGpsPoint) this.instance).setLat(d);
            return this;
        }

        public Builder setLng(double d) {
            copyOnWrite();
            ((GpsData$HFGpsPoint) this.instance).setLng(d);
            return this;
        }

        private Builder() {
            super(GpsData$HFGpsPoint.DEFAULT_INSTANCE);
        }
    }

    static {
        GpsData$HFGpsPoint gpsData$HFGpsPoint = new GpsData$HFGpsPoint();
        DEFAULT_INSTANCE = gpsData$HFGpsPoint;
        GeneratedMessageLite.registerDefaultInstance(GpsData$HFGpsPoint.class, gpsData$HFGpsPoint);
    }

    private GpsData$HFGpsPoint() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLat() {
        this.lat_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLng() {
        this.lng_ = 0.0d;
    }

    public static GpsData$HFGpsPoint getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static GpsData$HFGpsPoint parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GpsData$HFGpsPoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GpsData$HFGpsPoint parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (GpsData$HFGpsPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<GpsData$HFGpsPoint> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLat(double d) {
        this.lat_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLng(double d) {
        this.lng_ = d;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = r98.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new GpsData$HFGpsPoint();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"lat_", "lng_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<GpsData$HFGpsPoint> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (GpsData$HFGpsPoint.class) {
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

    @Override // com.heytap.sportwatch.proto.GpsData$HFGpsPointOrBuilder
    public double getLat() {
        return this.lat_;
    }

    @Override // com.heytap.sportwatch.proto.GpsData$HFGpsPointOrBuilder
    public double getLng() {
        return this.lng_;
    }

    public static Builder newBuilder(GpsData$HFGpsPoint gpsData$HFGpsPoint) {
        return DEFAULT_INSTANCE.createBuilder(gpsData$HFGpsPoint);
    }

    public static GpsData$HFGpsPoint parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GpsData$HFGpsPoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GpsData$HFGpsPoint parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GpsData$HFGpsPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static GpsData$HFGpsPoint parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (GpsData$HFGpsPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static GpsData$HFGpsPoint parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GpsData$HFGpsPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static GpsData$HFGpsPoint parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (GpsData$HFGpsPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GpsData$HFGpsPoint parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GpsData$HFGpsPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static GpsData$HFGpsPoint parseFrom(InputStream inputStream) throws IOException {
        return (GpsData$HFGpsPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GpsData$HFGpsPoint parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GpsData$HFGpsPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GpsData$HFGpsPoint parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GpsData$HFGpsPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static GpsData$HFGpsPoint parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GpsData$HFGpsPoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
