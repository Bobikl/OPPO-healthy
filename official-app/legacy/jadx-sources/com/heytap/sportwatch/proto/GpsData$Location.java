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
public final class GpsData$Location extends GeneratedMessageLite<GpsData$Location, Builder> implements GpsData$LocationOrBuilder {
    public static final int ACCURACY_FIELD_NUMBER = 5;
    private static final GpsData$Location DEFAULT_INSTANCE;
    public static final int DISTANCE_FIELD_NUMBER = 7;
    public static final int LATITUDE_FIELD_NUMBER = 2;
    public static final int LONGITUDE_FIELD_NUMBER = 3;
    private static volatile Parser<GpsData$Location> PARSER = null;
    public static final int SPEED_FIELD_NUMBER = 6;
    public static final int STATE_FIELD_NUMBER = 4;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private int accuracy_;
    private int distance_;
    private double latitude_;
    private double longitude_;
    private int speed_;
    private int state_;
    private int timestamp_;

    public static final class Builder extends GeneratedMessageLite.Builder<GpsData$Location, Builder> implements GpsData$LocationOrBuilder {
        public Builder clearAccuracy() {
            copyOnWrite();
            ((GpsData$Location) this.instance).clearAccuracy();
            return this;
        }

        public Builder clearDistance() {
            copyOnWrite();
            ((GpsData$Location) this.instance).clearDistance();
            return this;
        }

        public Builder clearLatitude() {
            copyOnWrite();
            ((GpsData$Location) this.instance).clearLatitude();
            return this;
        }

        public Builder clearLongitude() {
            copyOnWrite();
            ((GpsData$Location) this.instance).clearLongitude();
            return this;
        }

        public Builder clearSpeed() {
            copyOnWrite();
            ((GpsData$Location) this.instance).clearSpeed();
            return this;
        }

        public Builder clearState() {
            copyOnWrite();
            ((GpsData$Location) this.instance).clearState();
            return this;
        }

        public Builder clearTimestamp() {
            copyOnWrite();
            ((GpsData$Location) this.instance).clearTimestamp();
            return this;
        }

        @Override // com.heytap.sportwatch.proto.GpsData$LocationOrBuilder
        public int getAccuracy() {
            return ((GpsData$Location) this.instance).getAccuracy();
        }

        @Override // com.heytap.sportwatch.proto.GpsData$LocationOrBuilder
        public int getDistance() {
            return ((GpsData$Location) this.instance).getDistance();
        }

        @Override // com.heytap.sportwatch.proto.GpsData$LocationOrBuilder
        public double getLatitude() {
            return ((GpsData$Location) this.instance).getLatitude();
        }

        @Override // com.heytap.sportwatch.proto.GpsData$LocationOrBuilder
        public double getLongitude() {
            return ((GpsData$Location) this.instance).getLongitude();
        }

        @Override // com.heytap.sportwatch.proto.GpsData$LocationOrBuilder
        public int getSpeed() {
            return ((GpsData$Location) this.instance).getSpeed();
        }

        @Override // com.heytap.sportwatch.proto.GpsData$LocationOrBuilder
        public int getState() {
            return ((GpsData$Location) this.instance).getState();
        }

        @Override // com.heytap.sportwatch.proto.GpsData$LocationOrBuilder
        public int getTimestamp() {
            return ((GpsData$Location) this.instance).getTimestamp();
        }

        public Builder setAccuracy(int i) {
            copyOnWrite();
            ((GpsData$Location) this.instance).setAccuracy(i);
            return this;
        }

        public Builder setDistance(int i) {
            copyOnWrite();
            ((GpsData$Location) this.instance).setDistance(i);
            return this;
        }

        public Builder setLatitude(double d) {
            copyOnWrite();
            ((GpsData$Location) this.instance).setLatitude(d);
            return this;
        }

        public Builder setLongitude(double d) {
            copyOnWrite();
            ((GpsData$Location) this.instance).setLongitude(d);
            return this;
        }

        public Builder setSpeed(int i) {
            copyOnWrite();
            ((GpsData$Location) this.instance).setSpeed(i);
            return this;
        }

        public Builder setState(int i) {
            copyOnWrite();
            ((GpsData$Location) this.instance).setState(i);
            return this;
        }

        public Builder setTimestamp(int i) {
            copyOnWrite();
            ((GpsData$Location) this.instance).setTimestamp(i);
            return this;
        }

        private Builder() {
            super(GpsData$Location.DEFAULT_INSTANCE);
        }
    }

    static {
        GpsData$Location gpsData$Location = new GpsData$Location();
        DEFAULT_INSTANCE = gpsData$Location;
        GeneratedMessageLite.registerDefaultInstance(GpsData$Location.class, gpsData$Location);
    }

    private GpsData$Location() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccuracy() {
        this.accuracy_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistance() {
        this.distance_ = 0;
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
    public void clearSpeed() {
        this.speed_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0;
    }

    public static GpsData$Location getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static GpsData$Location parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GpsData$Location) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GpsData$Location parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (GpsData$Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<GpsData$Location> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccuracy(int i) {
        this.accuracy_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistance(int i) {
        this.distance_ = i;
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
    public void setSpeed(int i) {
        this.speed_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(int i) {
        this.state_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(int i) {
        this.timestamp_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = r98.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new GpsData$Location();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u000b\u0002\u0000\u0003\u0000\u0004\u000b\u0005\u000b\u0006\u000b\u0007\u000b", new Object[]{"timestamp_", "latitude_", "longitude_", "state_", "accuracy_", "speed_", "distance_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<GpsData$Location> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (GpsData$Location.class) {
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

    @Override // com.heytap.sportwatch.proto.GpsData$LocationOrBuilder
    public int getAccuracy() {
        return this.accuracy_;
    }

    @Override // com.heytap.sportwatch.proto.GpsData$LocationOrBuilder
    public int getDistance() {
        return this.distance_;
    }

    @Override // com.heytap.sportwatch.proto.GpsData$LocationOrBuilder
    public double getLatitude() {
        return this.latitude_;
    }

    @Override // com.heytap.sportwatch.proto.GpsData$LocationOrBuilder
    public double getLongitude() {
        return this.longitude_;
    }

    @Override // com.heytap.sportwatch.proto.GpsData$LocationOrBuilder
    public int getSpeed() {
        return this.speed_;
    }

    @Override // com.heytap.sportwatch.proto.GpsData$LocationOrBuilder
    public int getState() {
        return this.state_;
    }

    @Override // com.heytap.sportwatch.proto.GpsData$LocationOrBuilder
    public int getTimestamp() {
        return this.timestamp_;
    }

    public static Builder newBuilder(GpsData$Location gpsData$Location) {
        return DEFAULT_INSTANCE.createBuilder(gpsData$Location);
    }

    public static GpsData$Location parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GpsData$Location) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GpsData$Location parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GpsData$Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static GpsData$Location parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (GpsData$Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static GpsData$Location parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GpsData$Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static GpsData$Location parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (GpsData$Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GpsData$Location parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GpsData$Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static GpsData$Location parseFrom(InputStream inputStream) throws IOException {
        return (GpsData$Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GpsData$Location parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GpsData$Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GpsData$Location parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GpsData$Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static GpsData$Location parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GpsData$Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
