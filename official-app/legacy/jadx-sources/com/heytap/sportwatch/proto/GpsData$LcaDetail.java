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
public final class GpsData$LcaDetail extends GeneratedMessageLite<GpsData$LcaDetail, Builder> implements GpsData$LcaDetailOrBuilder {
    public static final int ACCURACY_FIELD_NUMBER = 4;
    public static final int ALTITUDE_FIELD_NUMBER = 6;
    public static final int BEARING_FIELD_NUMBER = 8;
    private static final GpsData$LcaDetail DEFAULT_INSTANCE;
    public static final int DISTANCE_FIELD_NUMBER = 7;
    public static final int HDOP_FIELD_NUMBER = 11;
    public static final int LATITUDE_FIELD_NUMBER = 2;
    public static final int LONGITUDE_FIELD_NUMBER = 3;
    public static final int MSLALTITUDEACCURACY_FIELD_NUMBER = 9;
    private static volatile Parser<GpsData$LcaDetail> PARSER = null;
    public static final int PDOP_FIELD_NUMBER = 10;
    public static final int SPEED_FIELD_NUMBER = 5;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    public static final int VDOP_FIELD_NUMBER = 12;
    private int accuracy_;
    private int altitude_;
    private float bearing_;
    private double distance_;
    private double hDop_;
    private double latitude_;
    private double longitude_;
    private float mslAltitudeAccuracy_;
    private double pDop_;
    private double speed_;
    private int timestamp_;
    private double vDop_;

    public static final class Builder extends GeneratedMessageLite.Builder<GpsData$LcaDetail, Builder> implements GpsData$LcaDetailOrBuilder {
        public Builder clearAccuracy() {
            copyOnWrite();
            ((GpsData$LcaDetail) this.instance).clearAccuracy();
            return this;
        }

        public Builder clearAltitude() {
            copyOnWrite();
            ((GpsData$LcaDetail) this.instance).clearAltitude();
            return this;
        }

        public Builder clearBearing() {
            copyOnWrite();
            ((GpsData$LcaDetail) this.instance).clearBearing();
            return this;
        }

        public Builder clearDistance() {
            copyOnWrite();
            ((GpsData$LcaDetail) this.instance).clearDistance();
            return this;
        }

        public Builder clearHDop() {
            copyOnWrite();
            ((GpsData$LcaDetail) this.instance).clearHDop();
            return this;
        }

        public Builder clearLatitude() {
            copyOnWrite();
            ((GpsData$LcaDetail) this.instance).clearLatitude();
            return this;
        }

        public Builder clearLongitude() {
            copyOnWrite();
            ((GpsData$LcaDetail) this.instance).clearLongitude();
            return this;
        }

        public Builder clearMslAltitudeAccuracy() {
            copyOnWrite();
            ((GpsData$LcaDetail) this.instance).clearMslAltitudeAccuracy();
            return this;
        }

        public Builder clearPDop() {
            copyOnWrite();
            ((GpsData$LcaDetail) this.instance).clearPDop();
            return this;
        }

        public Builder clearSpeed() {
            copyOnWrite();
            ((GpsData$LcaDetail) this.instance).clearSpeed();
            return this;
        }

        public Builder clearTimestamp() {
            copyOnWrite();
            ((GpsData$LcaDetail) this.instance).clearTimestamp();
            return this;
        }

        public Builder clearVDop() {
            copyOnWrite();
            ((GpsData$LcaDetail) this.instance).clearVDop();
            return this;
        }

        @Override // com.heytap.sportwatch.proto.GpsData$LcaDetailOrBuilder
        public int getAccuracy() {
            return ((GpsData$LcaDetail) this.instance).getAccuracy();
        }

        @Override // com.heytap.sportwatch.proto.GpsData$LcaDetailOrBuilder
        public int getAltitude() {
            return ((GpsData$LcaDetail) this.instance).getAltitude();
        }

        @Override // com.heytap.sportwatch.proto.GpsData$LcaDetailOrBuilder
        public float getBearing() {
            return ((GpsData$LcaDetail) this.instance).getBearing();
        }

        @Override // com.heytap.sportwatch.proto.GpsData$LcaDetailOrBuilder
        public double getDistance() {
            return ((GpsData$LcaDetail) this.instance).getDistance();
        }

        @Override // com.heytap.sportwatch.proto.GpsData$LcaDetailOrBuilder
        public double getHDop() {
            return ((GpsData$LcaDetail) this.instance).getHDop();
        }

        @Override // com.heytap.sportwatch.proto.GpsData$LcaDetailOrBuilder
        public double getLatitude() {
            return ((GpsData$LcaDetail) this.instance).getLatitude();
        }

        @Override // com.heytap.sportwatch.proto.GpsData$LcaDetailOrBuilder
        public double getLongitude() {
            return ((GpsData$LcaDetail) this.instance).getLongitude();
        }

        @Override // com.heytap.sportwatch.proto.GpsData$LcaDetailOrBuilder
        public float getMslAltitudeAccuracy() {
            return ((GpsData$LcaDetail) this.instance).getMslAltitudeAccuracy();
        }

        @Override // com.heytap.sportwatch.proto.GpsData$LcaDetailOrBuilder
        public double getPDop() {
            return ((GpsData$LcaDetail) this.instance).getPDop();
        }

        @Override // com.heytap.sportwatch.proto.GpsData$LcaDetailOrBuilder
        public double getSpeed() {
            return ((GpsData$LcaDetail) this.instance).getSpeed();
        }

        @Override // com.heytap.sportwatch.proto.GpsData$LcaDetailOrBuilder
        public int getTimestamp() {
            return ((GpsData$LcaDetail) this.instance).getTimestamp();
        }

        @Override // com.heytap.sportwatch.proto.GpsData$LcaDetailOrBuilder
        public double getVDop() {
            return ((GpsData$LcaDetail) this.instance).getVDop();
        }

        public Builder setAccuracy(int i) {
            copyOnWrite();
            ((GpsData$LcaDetail) this.instance).setAccuracy(i);
            return this;
        }

        public Builder setAltitude(int i) {
            copyOnWrite();
            ((GpsData$LcaDetail) this.instance).setAltitude(i);
            return this;
        }

        public Builder setBearing(float f) {
            copyOnWrite();
            ((GpsData$LcaDetail) this.instance).setBearing(f);
            return this;
        }

        public Builder setDistance(double d) {
            copyOnWrite();
            ((GpsData$LcaDetail) this.instance).setDistance(d);
            return this;
        }

        public Builder setHDop(double d) {
            copyOnWrite();
            ((GpsData$LcaDetail) this.instance).setHDop(d);
            return this;
        }

        public Builder setLatitude(double d) {
            copyOnWrite();
            ((GpsData$LcaDetail) this.instance).setLatitude(d);
            return this;
        }

        public Builder setLongitude(double d) {
            copyOnWrite();
            ((GpsData$LcaDetail) this.instance).setLongitude(d);
            return this;
        }

        public Builder setMslAltitudeAccuracy(float f) {
            copyOnWrite();
            ((GpsData$LcaDetail) this.instance).setMslAltitudeAccuracy(f);
            return this;
        }

        public Builder setPDop(double d) {
            copyOnWrite();
            ((GpsData$LcaDetail) this.instance).setPDop(d);
            return this;
        }

        public Builder setSpeed(double d) {
            copyOnWrite();
            ((GpsData$LcaDetail) this.instance).setSpeed(d);
            return this;
        }

        public Builder setTimestamp(int i) {
            copyOnWrite();
            ((GpsData$LcaDetail) this.instance).setTimestamp(i);
            return this;
        }

        public Builder setVDop(double d) {
            copyOnWrite();
            ((GpsData$LcaDetail) this.instance).setVDop(d);
            return this;
        }

        private Builder() {
            super(GpsData$LcaDetail.DEFAULT_INSTANCE);
        }
    }

    static {
        GpsData$LcaDetail gpsData$LcaDetail = new GpsData$LcaDetail();
        DEFAULT_INSTANCE = gpsData$LcaDetail;
        GeneratedMessageLite.registerDefaultInstance(GpsData$LcaDetail.class, gpsData$LcaDetail);
    }

    private GpsData$LcaDetail() {
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
    public void clearBearing() {
        this.bearing_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistance() {
        this.distance_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHDop() {
        this.hDop_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatitude() {
        this.latitude_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLongitude() {
        this.longitude_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMslAltitudeAccuracy() {
        this.mslAltitudeAccuracy_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPDop() {
        this.pDop_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeed() {
        this.speed_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVDop() {
        this.vDop_ = 0.0d;
    }

    public static GpsData$LcaDetail getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static GpsData$LcaDetail parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GpsData$LcaDetail) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GpsData$LcaDetail parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (GpsData$LcaDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<GpsData$LcaDetail> parser() {
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
    public void setBearing(float f) {
        this.bearing_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistance(double d) {
        this.distance_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHDop(double d) {
        this.hDop_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatitude(double d) {
        this.latitude_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLongitude(double d) {
        this.longitude_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMslAltitudeAccuracy(float f) {
        this.mslAltitudeAccuracy_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPDop(double d) {
        this.pDop_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeed(double d) {
        this.speed_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(int i) {
        this.timestamp_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVDop(double d) {
        this.vDop_ = d;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = r98.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new GpsData$LcaDetail();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0000\u0000\u0001\u000b\u0002\u0000\u0003\u0000\u0004\u000b\u0005\u0000\u0006\u000b\u0007\u0000\b\u0001\t\u0001\n\u0000\u000b\u0000\f\u0000", new Object[]{"timestamp_", "latitude_", "longitude_", "accuracy_", "speed_", "altitude_", "distance_", "bearing_", "mslAltitudeAccuracy_", "pDop_", "hDop_", "vDop_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<GpsData$LcaDetail> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (GpsData$LcaDetail.class) {
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

    @Override // com.heytap.sportwatch.proto.GpsData$LcaDetailOrBuilder
    public int getAccuracy() {
        return this.accuracy_;
    }

    @Override // com.heytap.sportwatch.proto.GpsData$LcaDetailOrBuilder
    public int getAltitude() {
        return this.altitude_;
    }

    @Override // com.heytap.sportwatch.proto.GpsData$LcaDetailOrBuilder
    public float getBearing() {
        return this.bearing_;
    }

    @Override // com.heytap.sportwatch.proto.GpsData$LcaDetailOrBuilder
    public double getDistance() {
        return this.distance_;
    }

    @Override // com.heytap.sportwatch.proto.GpsData$LcaDetailOrBuilder
    public double getHDop() {
        return this.hDop_;
    }

    @Override // com.heytap.sportwatch.proto.GpsData$LcaDetailOrBuilder
    public double getLatitude() {
        return this.latitude_;
    }

    @Override // com.heytap.sportwatch.proto.GpsData$LcaDetailOrBuilder
    public double getLongitude() {
        return this.longitude_;
    }

    @Override // com.heytap.sportwatch.proto.GpsData$LcaDetailOrBuilder
    public float getMslAltitudeAccuracy() {
        return this.mslAltitudeAccuracy_;
    }

    @Override // com.heytap.sportwatch.proto.GpsData$LcaDetailOrBuilder
    public double getPDop() {
        return this.pDop_;
    }

    @Override // com.heytap.sportwatch.proto.GpsData$LcaDetailOrBuilder
    public double getSpeed() {
        return this.speed_;
    }

    @Override // com.heytap.sportwatch.proto.GpsData$LcaDetailOrBuilder
    public int getTimestamp() {
        return this.timestamp_;
    }

    @Override // com.heytap.sportwatch.proto.GpsData$LcaDetailOrBuilder
    public double getVDop() {
        return this.vDop_;
    }

    public static Builder newBuilder(GpsData$LcaDetail gpsData$LcaDetail) {
        return DEFAULT_INSTANCE.createBuilder(gpsData$LcaDetail);
    }

    public static GpsData$LcaDetail parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GpsData$LcaDetail) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GpsData$LcaDetail parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GpsData$LcaDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static GpsData$LcaDetail parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (GpsData$LcaDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static GpsData$LcaDetail parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GpsData$LcaDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static GpsData$LcaDetail parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (GpsData$LcaDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GpsData$LcaDetail parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GpsData$LcaDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static GpsData$LcaDetail parseFrom(InputStream inputStream) throws IOException {
        return (GpsData$LcaDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GpsData$LcaDetail parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GpsData$LcaDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GpsData$LcaDetail parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GpsData$LcaDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static GpsData$LcaDetail parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GpsData$LcaDetail) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
