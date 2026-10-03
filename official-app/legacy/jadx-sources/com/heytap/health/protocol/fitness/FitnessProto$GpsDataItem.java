package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.nh7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FitnessProto$GpsDataItem extends GeneratedMessageLite<FitnessProto$GpsDataItem, Builder> implements FitnessProto$GpsDataItemOrBuilder {
    public static final int COG_FIELD_NUMBER = 6;
    private static final FitnessProto$GpsDataItem DEFAULT_INSTANCE;
    public static final int LATITUDE_FIELD_NUMBER = 2;
    public static final int LONGITUDE_FIELD_NUMBER = 3;
    private static volatile Parser<FitnessProto$GpsDataItem> PARSER = null;
    public static final int SPEED_FIELD_NUMBER = 4;
    public static final int STATE_FIELD_NUMBER = 5;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private int cog_;
    private double latitude_;
    private double longitude_;
    private int speed_;
    private int state_;
    private int timeStamp_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$GpsDataItem, Builder> implements FitnessProto$GpsDataItemOrBuilder {
        public Builder clearCog() {
            copyOnWrite();
            ((FitnessProto$GpsDataItem) this.instance).clearCog();
            return this;
        }

        public Builder clearLatitude() {
            copyOnWrite();
            ((FitnessProto$GpsDataItem) this.instance).clearLatitude();
            return this;
        }

        public Builder clearLongitude() {
            copyOnWrite();
            ((FitnessProto$GpsDataItem) this.instance).clearLongitude();
            return this;
        }

        public Builder clearSpeed() {
            copyOnWrite();
            ((FitnessProto$GpsDataItem) this.instance).clearSpeed();
            return this;
        }

        public Builder clearState() {
            copyOnWrite();
            ((FitnessProto$GpsDataItem) this.instance).clearState();
            return this;
        }

        public Builder clearTimeStamp() {
            copyOnWrite();
            ((FitnessProto$GpsDataItem) this.instance).clearTimeStamp();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$GpsDataItemOrBuilder
        public int getCog() {
            return ((FitnessProto$GpsDataItem) this.instance).getCog();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$GpsDataItemOrBuilder
        public double getLatitude() {
            return ((FitnessProto$GpsDataItem) this.instance).getLatitude();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$GpsDataItemOrBuilder
        public double getLongitude() {
            return ((FitnessProto$GpsDataItem) this.instance).getLongitude();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$GpsDataItemOrBuilder
        public int getSpeed() {
            return ((FitnessProto$GpsDataItem) this.instance).getSpeed();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$GpsDataItemOrBuilder
        public int getState() {
            return ((FitnessProto$GpsDataItem) this.instance).getState();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$GpsDataItemOrBuilder
        public int getTimeStamp() {
            return ((FitnessProto$GpsDataItem) this.instance).getTimeStamp();
        }

        public Builder setCog(int i) {
            copyOnWrite();
            ((FitnessProto$GpsDataItem) this.instance).setCog(i);
            return this;
        }

        public Builder setLatitude(double d) {
            copyOnWrite();
            ((FitnessProto$GpsDataItem) this.instance).setLatitude(d);
            return this;
        }

        public Builder setLongitude(double d) {
            copyOnWrite();
            ((FitnessProto$GpsDataItem) this.instance).setLongitude(d);
            return this;
        }

        public Builder setSpeed(int i) {
            copyOnWrite();
            ((FitnessProto$GpsDataItem) this.instance).setSpeed(i);
            return this;
        }

        public Builder setState(int i) {
            copyOnWrite();
            ((FitnessProto$GpsDataItem) this.instance).setState(i);
            return this;
        }

        public Builder setTimeStamp(int i) {
            copyOnWrite();
            ((FitnessProto$GpsDataItem) this.instance).setTimeStamp(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$GpsDataItem.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$GpsDataItem fitnessProto$GpsDataItem = new FitnessProto$GpsDataItem();
        DEFAULT_INSTANCE = fitnessProto$GpsDataItem;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$GpsDataItem.class, fitnessProto$GpsDataItem);
    }

    private FitnessProto$GpsDataItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCog() {
        this.cog_ = 0;
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
    public void clearTimeStamp() {
        this.timeStamp_ = 0;
    }

    public static FitnessProto$GpsDataItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$GpsDataItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$GpsDataItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$GpsDataItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$GpsDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$GpsDataItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCog(int i) {
        this.cog_ = i;
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
    public void setTimeStamp(int i) {
        this.timeStamp_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$GpsDataItem();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u000b\u0002\u0000\u0003\u0000\u0004\u000b\u0005\u000b\u0006\u000b", new Object[]{"timeStamp_", "latitude_", "longitude_", "speed_", "state_", "cog_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$GpsDataItem> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$GpsDataItem.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$GpsDataItemOrBuilder
    public int getCog() {
        return this.cog_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$GpsDataItemOrBuilder
    public double getLatitude() {
        return this.latitude_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$GpsDataItemOrBuilder
    public double getLongitude() {
        return this.longitude_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$GpsDataItemOrBuilder
    public int getSpeed() {
        return this.speed_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$GpsDataItemOrBuilder
    public int getState() {
        return this.state_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$GpsDataItemOrBuilder
    public int getTimeStamp() {
        return this.timeStamp_;
    }

    public static Builder newBuilder(FitnessProto$GpsDataItem fitnessProto$GpsDataItem) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$GpsDataItem);
    }

    public static FitnessProto$GpsDataItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$GpsDataItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$GpsDataItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$GpsDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$GpsDataItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$GpsDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$GpsDataItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$GpsDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$GpsDataItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$GpsDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$GpsDataItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$GpsDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$GpsDataItem parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$GpsDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$GpsDataItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$GpsDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$GpsDataItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$GpsDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$GpsDataItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$GpsDataItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
