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
public final class FitnessProto$WristTemperatureStatus extends GeneratedMessageLite<FitnessProto$WristTemperatureStatus, Builder> implements FitnessProto$WristTemperatureStatusOrBuilder {
    public static final int COUNTDOWN_DAYS_FIELD_NUMBER = 1;
    private static final FitnessProto$WristTemperatureStatus DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$WristTemperatureStatus> PARSER = null;
    public static final int STATS_FIELD_NUMBER = 2;
    private int countdownDays_;
    private int stats_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$WristTemperatureStatus, Builder> implements FitnessProto$WristTemperatureStatusOrBuilder {
        private Builder() {
            super(FitnessProto$WristTemperatureStatus.DEFAULT_INSTANCE);
        }

        public Builder clearCountdownDays() {
            copyOnWrite();
            ((FitnessProto$WristTemperatureStatus) this.instance).clearCountdownDays();
            return this;
        }

        public Builder clearStats() {
            copyOnWrite();
            ((FitnessProto$WristTemperatureStatus) this.instance).clearStats();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$WristTemperatureStatusOrBuilder
        public int getCountdownDays() {
            return ((FitnessProto$WristTemperatureStatus) this.instance).getCountdownDays();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$WristTemperatureStatusOrBuilder
        public int getStats() {
            return ((FitnessProto$WristTemperatureStatus) this.instance).getStats();
        }

        public Builder setCountdownDays(int i) {
            copyOnWrite();
            ((FitnessProto$WristTemperatureStatus) this.instance).setCountdownDays(i);
            return this;
        }

        public Builder setStats(int i) {
            copyOnWrite();
            ((FitnessProto$WristTemperatureStatus) this.instance).setStats(i);
            return this;
        }
    }

    static {
        FitnessProto$WristTemperatureStatus fitnessProto$WristTemperatureStatus = new FitnessProto$WristTemperatureStatus();
        DEFAULT_INSTANCE = fitnessProto$WristTemperatureStatus;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$WristTemperatureStatus.class, fitnessProto$WristTemperatureStatus);
    }

    private FitnessProto$WristTemperatureStatus() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCountdownDays() {
        this.countdownDays_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStats() {
        this.stats_ = 0;
    }

    public static FitnessProto$WristTemperatureStatus getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$WristTemperatureStatus parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$WristTemperatureStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$WristTemperatureStatus parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$WristTemperatureStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<FitnessProto$WristTemperatureStatus> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountdownDays(int i) {
        this.countdownDays_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStats(int i) {
        this.stats_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$WristTemperatureStatus();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"countdownDays_", "stats_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$WristTemperatureStatus> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$WristTemperatureStatus.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$WristTemperatureStatusOrBuilder
    public int getCountdownDays() {
        return this.countdownDays_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$WristTemperatureStatusOrBuilder
    public int getStats() {
        return this.stats_;
    }

    public static Builder newBuilder(FitnessProto$WristTemperatureStatus fitnessProto$WristTemperatureStatus) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$WristTemperatureStatus);
    }

    public static FitnessProto$WristTemperatureStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$WristTemperatureStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$WristTemperatureStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$WristTemperatureStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$WristTemperatureStatus parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$WristTemperatureStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$WristTemperatureStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$WristTemperatureStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static FitnessProto$WristTemperatureStatus parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$WristTemperatureStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$WristTemperatureStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$WristTemperatureStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$WristTemperatureStatus parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$WristTemperatureStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static FitnessProto$WristTemperatureStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$WristTemperatureStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$WristTemperatureStatus parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$WristTemperatureStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$WristTemperatureStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$WristTemperatureStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
