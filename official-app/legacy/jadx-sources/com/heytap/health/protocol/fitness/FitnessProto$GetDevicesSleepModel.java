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
public final class FitnessProto$GetDevicesSleepModel extends GeneratedMessageLite<FitnessProto$GetDevicesSleepModel, Builder> implements FitnessProto$GetDevicesSleepModelOrBuilder {
    private static final FitnessProto$GetDevicesSleepModel DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$GetDevicesSleepModel> PARSER = null;
    public static final int TIME_FIELD_NUMBER = 1;
    private int time_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$GetDevicesSleepModel, Builder> implements FitnessProto$GetDevicesSleepModelOrBuilder {
        public Builder clearTime() {
            copyOnWrite();
            ((FitnessProto$GetDevicesSleepModel) this.instance).clearTime();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$GetDevicesSleepModelOrBuilder
        public int getTime() {
            return ((FitnessProto$GetDevicesSleepModel) this.instance).getTime();
        }

        public Builder setTime(int i) {
            copyOnWrite();
            ((FitnessProto$GetDevicesSleepModel) this.instance).setTime(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$GetDevicesSleepModel.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$GetDevicesSleepModel fitnessProto$GetDevicesSleepModel = new FitnessProto$GetDevicesSleepModel();
        DEFAULT_INSTANCE = fitnessProto$GetDevicesSleepModel;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$GetDevicesSleepModel.class, fitnessProto$GetDevicesSleepModel);
    }

    private FitnessProto$GetDevicesSleepModel() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTime() {
        this.time_ = 0;
    }

    public static FitnessProto$GetDevicesSleepModel getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$GetDevicesSleepModel parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$GetDevicesSleepModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$GetDevicesSleepModel parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$GetDevicesSleepModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$GetDevicesSleepModel> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTime(int i) {
        this.time_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$GetDevicesSleepModel();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"time_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$GetDevicesSleepModel> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$GetDevicesSleepModel.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$GetDevicesSleepModelOrBuilder
    public int getTime() {
        return this.time_;
    }

    public static Builder newBuilder(FitnessProto$GetDevicesSleepModel fitnessProto$GetDevicesSleepModel) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$GetDevicesSleepModel);
    }

    public static FitnessProto$GetDevicesSleepModel parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$GetDevicesSleepModel) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$GetDevicesSleepModel parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$GetDevicesSleepModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$GetDevicesSleepModel parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$GetDevicesSleepModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$GetDevicesSleepModel parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$GetDevicesSleepModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$GetDevicesSleepModel parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$GetDevicesSleepModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$GetDevicesSleepModel parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$GetDevicesSleepModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$GetDevicesSleepModel parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$GetDevicesSleepModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$GetDevicesSleepModel parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$GetDevicesSleepModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$GetDevicesSleepModel parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$GetDevicesSleepModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$GetDevicesSleepModel parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$GetDevicesSleepModel) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
