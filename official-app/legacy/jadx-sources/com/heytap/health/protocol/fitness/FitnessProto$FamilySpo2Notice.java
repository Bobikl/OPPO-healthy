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
public final class FitnessProto$FamilySpo2Notice extends GeneratedMessageLite<FitnessProto$FamilySpo2Notice, Builder> implements FitnessProto$FamilySpo2NoticeOrBuilder {
    public static final int ALTITUDEVALID_FIELD_NUMBER = 6;
    public static final int ALTITUDE_FIELD_NUMBER = 5;
    private static final FitnessProto$FamilySpo2Notice DEFAULT_INSTANCE;
    public static final int ENDTIME_FIELD_NUMBER = 2;
    public static final int MAXOXYGEN_FIELD_NUMBER = 4;
    public static final int MINOXYGEN_FIELD_NUMBER = 3;
    private static volatile Parser<FitnessProto$FamilySpo2Notice> PARSER = null;
    public static final int STARTTIME_FIELD_NUMBER = 1;
    private int altitudeValid_;
    private int altitude_;
    private int endTime_;
    private int maxOxygen_;
    private int minOxygen_;
    private int startTime_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$FamilySpo2Notice, Builder> implements FitnessProto$FamilySpo2NoticeOrBuilder {
        public Builder clearAltitude() {
            copyOnWrite();
            ((FitnessProto$FamilySpo2Notice) this.instance).clearAltitude();
            return this;
        }

        public Builder clearAltitudeValid() {
            copyOnWrite();
            ((FitnessProto$FamilySpo2Notice) this.instance).clearAltitudeValid();
            return this;
        }

        public Builder clearEndTime() {
            copyOnWrite();
            ((FitnessProto$FamilySpo2Notice) this.instance).clearEndTime();
            return this;
        }

        public Builder clearMaxOxygen() {
            copyOnWrite();
            ((FitnessProto$FamilySpo2Notice) this.instance).clearMaxOxygen();
            return this;
        }

        public Builder clearMinOxygen() {
            copyOnWrite();
            ((FitnessProto$FamilySpo2Notice) this.instance).clearMinOxygen();
            return this;
        }

        public Builder clearStartTime() {
            copyOnWrite();
            ((FitnessProto$FamilySpo2Notice) this.instance).clearStartTime();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$FamilySpo2NoticeOrBuilder
        public int getAltitude() {
            return ((FitnessProto$FamilySpo2Notice) this.instance).getAltitude();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$FamilySpo2NoticeOrBuilder
        public int getAltitudeValid() {
            return ((FitnessProto$FamilySpo2Notice) this.instance).getAltitudeValid();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$FamilySpo2NoticeOrBuilder
        public int getEndTime() {
            return ((FitnessProto$FamilySpo2Notice) this.instance).getEndTime();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$FamilySpo2NoticeOrBuilder
        public int getMaxOxygen() {
            return ((FitnessProto$FamilySpo2Notice) this.instance).getMaxOxygen();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$FamilySpo2NoticeOrBuilder
        public int getMinOxygen() {
            return ((FitnessProto$FamilySpo2Notice) this.instance).getMinOxygen();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$FamilySpo2NoticeOrBuilder
        public int getStartTime() {
            return ((FitnessProto$FamilySpo2Notice) this.instance).getStartTime();
        }

        public Builder setAltitude(int i) {
            copyOnWrite();
            ((FitnessProto$FamilySpo2Notice) this.instance).setAltitude(i);
            return this;
        }

        public Builder setAltitudeValid(int i) {
            copyOnWrite();
            ((FitnessProto$FamilySpo2Notice) this.instance).setAltitudeValid(i);
            return this;
        }

        public Builder setEndTime(int i) {
            copyOnWrite();
            ((FitnessProto$FamilySpo2Notice) this.instance).setEndTime(i);
            return this;
        }

        public Builder setMaxOxygen(int i) {
            copyOnWrite();
            ((FitnessProto$FamilySpo2Notice) this.instance).setMaxOxygen(i);
            return this;
        }

        public Builder setMinOxygen(int i) {
            copyOnWrite();
            ((FitnessProto$FamilySpo2Notice) this.instance).setMinOxygen(i);
            return this;
        }

        public Builder setStartTime(int i) {
            copyOnWrite();
            ((FitnessProto$FamilySpo2Notice) this.instance).setStartTime(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$FamilySpo2Notice.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$FamilySpo2Notice fitnessProto$FamilySpo2Notice = new FitnessProto$FamilySpo2Notice();
        DEFAULT_INSTANCE = fitnessProto$FamilySpo2Notice;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$FamilySpo2Notice.class, fitnessProto$FamilySpo2Notice);
    }

    private FitnessProto$FamilySpo2Notice() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAltitude() {
        this.altitude_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAltitudeValid() {
        this.altitudeValid_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndTime() {
        this.endTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxOxygen() {
        this.maxOxygen_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinOxygen() {
        this.minOxygen_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTime() {
        this.startTime_ = 0;
    }

    public static FitnessProto$FamilySpo2Notice getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$FamilySpo2Notice parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$FamilySpo2Notice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$FamilySpo2Notice parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$FamilySpo2Notice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$FamilySpo2Notice> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAltitude(int i) {
        this.altitude_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAltitudeValid(int i) {
        this.altitudeValid_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndTime(int i) {
        this.endTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxOxygen(int i) {
        this.maxOxygen_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinOxygen(int i) {
        this.minOxygen_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTime(int i) {
        this.startTime_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$FamilySpo2Notice();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004", new Object[]{"startTime_", "endTime_", "minOxygen_", "maxOxygen_", "altitude_", "altitudeValid_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$FamilySpo2Notice> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$FamilySpo2Notice.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$FamilySpo2NoticeOrBuilder
    public int getAltitude() {
        return this.altitude_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$FamilySpo2NoticeOrBuilder
    public int getAltitudeValid() {
        return this.altitudeValid_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$FamilySpo2NoticeOrBuilder
    public int getEndTime() {
        return this.endTime_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$FamilySpo2NoticeOrBuilder
    public int getMaxOxygen() {
        return this.maxOxygen_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$FamilySpo2NoticeOrBuilder
    public int getMinOxygen() {
        return this.minOxygen_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$FamilySpo2NoticeOrBuilder
    public int getStartTime() {
        return this.startTime_;
    }

    public static Builder newBuilder(FitnessProto$FamilySpo2Notice fitnessProto$FamilySpo2Notice) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$FamilySpo2Notice);
    }

    public static FitnessProto$FamilySpo2Notice parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$FamilySpo2Notice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$FamilySpo2Notice parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$FamilySpo2Notice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$FamilySpo2Notice parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$FamilySpo2Notice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$FamilySpo2Notice parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$FamilySpo2Notice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$FamilySpo2Notice parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$FamilySpo2Notice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$FamilySpo2Notice parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$FamilySpo2Notice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$FamilySpo2Notice parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$FamilySpo2Notice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$FamilySpo2Notice parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$FamilySpo2Notice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$FamilySpo2Notice parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$FamilySpo2Notice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$FamilySpo2Notice parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$FamilySpo2Notice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
