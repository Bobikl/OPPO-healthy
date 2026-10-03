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
public final class FitnessProto$BreatheRateSwitch extends GeneratedMessageLite<FitnessProto$BreatheRateSwitch, Builder> implements FitnessProto$BreatheRateSwitchOrBuilder {
    public static final int BREATHE_RATE_FIELD_NUMBER = 1;
    private static final FitnessProto$BreatheRateSwitch DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$BreatheRateSwitch> PARSER;
    private int breatheRate_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$BreatheRateSwitch, Builder> implements FitnessProto$BreatheRateSwitchOrBuilder {
        public Builder clearBreatheRate() {
            copyOnWrite();
            ((FitnessProto$BreatheRateSwitch) this.instance).clearBreatheRate();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$BreatheRateSwitchOrBuilder
        public int getBreatheRate() {
            return ((FitnessProto$BreatheRateSwitch) this.instance).getBreatheRate();
        }

        public Builder setBreatheRate(int i) {
            copyOnWrite();
            ((FitnessProto$BreatheRateSwitch) this.instance).setBreatheRate(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$BreatheRateSwitch.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$BreatheRateSwitch fitnessProto$BreatheRateSwitch = new FitnessProto$BreatheRateSwitch();
        DEFAULT_INSTANCE = fitnessProto$BreatheRateSwitch;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$BreatheRateSwitch.class, fitnessProto$BreatheRateSwitch);
    }

    private FitnessProto$BreatheRateSwitch() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBreatheRate() {
        this.breatheRate_ = 0;
    }

    public static FitnessProto$BreatheRateSwitch getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$BreatheRateSwitch parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$BreatheRateSwitch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$BreatheRateSwitch parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$BreatheRateSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$BreatheRateSwitch> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBreatheRate(int i) {
        this.breatheRate_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$BreatheRateSwitch();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"breatheRate_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$BreatheRateSwitch> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$BreatheRateSwitch.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$BreatheRateSwitchOrBuilder
    public int getBreatheRate() {
        return this.breatheRate_;
    }

    public static Builder newBuilder(FitnessProto$BreatheRateSwitch fitnessProto$BreatheRateSwitch) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$BreatheRateSwitch);
    }

    public static FitnessProto$BreatheRateSwitch parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$BreatheRateSwitch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$BreatheRateSwitch parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$BreatheRateSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$BreatheRateSwitch parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$BreatheRateSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$BreatheRateSwitch parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$BreatheRateSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$BreatheRateSwitch parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$BreatheRateSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$BreatheRateSwitch parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$BreatheRateSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$BreatheRateSwitch parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$BreatheRateSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$BreatheRateSwitch parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$BreatheRateSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$BreatheRateSwitch parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$BreatheRateSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$BreatheRateSwitch parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$BreatheRateSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
