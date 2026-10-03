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
public final class FitnessProto$Spo2LowWarningSwitch extends GeneratedMessageLite<FitnessProto$Spo2LowWarningSwitch, Builder> implements FitnessProto$Spo2LowWarningSwitchOrBuilder {
    private static final FitnessProto$Spo2LowWarningSwitch DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$Spo2LowWarningSwitch> PARSER = null;
    public static final int SPO2_LOW_WARNING_FIELD_NUMBER = 1;
    public static final int SPO2_LOW_WARNING_VALUE_FIELD_NUMBER = 2;
    private int spo2LowWarningValue_;
    private int spo2LowWarning_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$Spo2LowWarningSwitch, Builder> implements FitnessProto$Spo2LowWarningSwitchOrBuilder {
        public Builder clearSpo2LowWarning() {
            copyOnWrite();
            ((FitnessProto$Spo2LowWarningSwitch) this.instance).clearSpo2LowWarning();
            return this;
        }

        public Builder clearSpo2LowWarningValue() {
            copyOnWrite();
            ((FitnessProto$Spo2LowWarningSwitch) this.instance).clearSpo2LowWarningValue();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$Spo2LowWarningSwitchOrBuilder
        public int getSpo2LowWarning() {
            return ((FitnessProto$Spo2LowWarningSwitch) this.instance).getSpo2LowWarning();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$Spo2LowWarningSwitchOrBuilder
        public int getSpo2LowWarningValue() {
            return ((FitnessProto$Spo2LowWarningSwitch) this.instance).getSpo2LowWarningValue();
        }

        public Builder setSpo2LowWarning(int i) {
            copyOnWrite();
            ((FitnessProto$Spo2LowWarningSwitch) this.instance).setSpo2LowWarning(i);
            return this;
        }

        public Builder setSpo2LowWarningValue(int i) {
            copyOnWrite();
            ((FitnessProto$Spo2LowWarningSwitch) this.instance).setSpo2LowWarningValue(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$Spo2LowWarningSwitch.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$Spo2LowWarningSwitch fitnessProto$Spo2LowWarningSwitch = new FitnessProto$Spo2LowWarningSwitch();
        DEFAULT_INSTANCE = fitnessProto$Spo2LowWarningSwitch;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$Spo2LowWarningSwitch.class, fitnessProto$Spo2LowWarningSwitch);
    }

    private FitnessProto$Spo2LowWarningSwitch() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpo2LowWarning() {
        this.spo2LowWarning_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpo2LowWarningValue() {
        this.spo2LowWarningValue_ = 0;
    }

    public static FitnessProto$Spo2LowWarningSwitch getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$Spo2LowWarningSwitch parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$Spo2LowWarningSwitch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$Spo2LowWarningSwitch parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$Spo2LowWarningSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$Spo2LowWarningSwitch> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpo2LowWarning(int i) {
        this.spo2LowWarning_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpo2LowWarningValue(int i) {
        this.spo2LowWarningValue_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$Spo2LowWarningSwitch();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"spo2LowWarning_", "spo2LowWarningValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$Spo2LowWarningSwitch> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$Spo2LowWarningSwitch.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$Spo2LowWarningSwitchOrBuilder
    public int getSpo2LowWarning() {
        return this.spo2LowWarning_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$Spo2LowWarningSwitchOrBuilder
    public int getSpo2LowWarningValue() {
        return this.spo2LowWarningValue_;
    }

    public static Builder newBuilder(FitnessProto$Spo2LowWarningSwitch fitnessProto$Spo2LowWarningSwitch) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$Spo2LowWarningSwitch);
    }

    public static FitnessProto$Spo2LowWarningSwitch parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$Spo2LowWarningSwitch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$Spo2LowWarningSwitch parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$Spo2LowWarningSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$Spo2LowWarningSwitch parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$Spo2LowWarningSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$Spo2LowWarningSwitch parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$Spo2LowWarningSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$Spo2LowWarningSwitch parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$Spo2LowWarningSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$Spo2LowWarningSwitch parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$Spo2LowWarningSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$Spo2LowWarningSwitch parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$Spo2LowWarningSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$Spo2LowWarningSwitch parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$Spo2LowWarningSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$Spo2LowWarningSwitch parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$Spo2LowWarningSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$Spo2LowWarningSwitch parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$Spo2LowWarningSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
