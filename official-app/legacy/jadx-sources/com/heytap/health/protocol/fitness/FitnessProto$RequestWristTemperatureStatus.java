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
public final class FitnessProto$RequestWristTemperatureStatus extends GeneratedMessageLite<FitnessProto$RequestWristTemperatureStatus, Builder> implements FitnessProto$RequestWristTemperatureStatusOrBuilder {
    private static final FitnessProto$RequestWristTemperatureStatus DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$RequestWristTemperatureStatus> PARSER = null;
    public static final int TIME_STAMP_FIELD_NUMBER = 1;
    private int timeStamp_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$RequestWristTemperatureStatus, Builder> implements FitnessProto$RequestWristTemperatureStatusOrBuilder {
        private Builder() {
            super(FitnessProto$RequestWristTemperatureStatus.DEFAULT_INSTANCE);
        }

        public Builder clearTimeStamp() {
            copyOnWrite();
            ((FitnessProto$RequestWristTemperatureStatus) this.instance).clearTimeStamp();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$RequestWristTemperatureStatusOrBuilder
        public int getTimeStamp() {
            return ((FitnessProto$RequestWristTemperatureStatus) this.instance).getTimeStamp();
        }

        public Builder setTimeStamp(int i) {
            copyOnWrite();
            ((FitnessProto$RequestWristTemperatureStatus) this.instance).setTimeStamp(i);
            return this;
        }
    }

    static {
        FitnessProto$RequestWristTemperatureStatus fitnessProto$RequestWristTemperatureStatus = new FitnessProto$RequestWristTemperatureStatus();
        DEFAULT_INSTANCE = fitnessProto$RequestWristTemperatureStatus;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$RequestWristTemperatureStatus.class, fitnessProto$RequestWristTemperatureStatus);
    }

    private FitnessProto$RequestWristTemperatureStatus() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeStamp() {
        this.timeStamp_ = 0;
    }

    public static FitnessProto$RequestWristTemperatureStatus getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$RequestWristTemperatureStatus parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$RequestWristTemperatureStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$RequestWristTemperatureStatus parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$RequestWristTemperatureStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<FitnessProto$RequestWristTemperatureStatus> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
                return new FitnessProto$RequestWristTemperatureStatus();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"timeStamp_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$RequestWristTemperatureStatus> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$RequestWristTemperatureStatus.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$RequestWristTemperatureStatusOrBuilder
    public int getTimeStamp() {
        return this.timeStamp_;
    }

    public static Builder newBuilder(FitnessProto$RequestWristTemperatureStatus fitnessProto$RequestWristTemperatureStatus) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$RequestWristTemperatureStatus);
    }

    public static FitnessProto$RequestWristTemperatureStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$RequestWristTemperatureStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$RequestWristTemperatureStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$RequestWristTemperatureStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$RequestWristTemperatureStatus parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$RequestWristTemperatureStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$RequestWristTemperatureStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$RequestWristTemperatureStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static FitnessProto$RequestWristTemperatureStatus parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$RequestWristTemperatureStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$RequestWristTemperatureStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$RequestWristTemperatureStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$RequestWristTemperatureStatus parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$RequestWristTemperatureStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static FitnessProto$RequestWristTemperatureStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$RequestWristTemperatureStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$RequestWristTemperatureStatus parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$RequestWristTemperatureStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$RequestWristTemperatureStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$RequestWristTemperatureStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
