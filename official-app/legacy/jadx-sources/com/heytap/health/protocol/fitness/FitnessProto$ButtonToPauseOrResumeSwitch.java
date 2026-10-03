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
public final class FitnessProto$ButtonToPauseOrResumeSwitch extends GeneratedMessageLite<FitnessProto$ButtonToPauseOrResumeSwitch, Builder> implements FitnessProto$ButtonToPauseOrResumeSwitchOrBuilder {
    public static final int BUTTON_TO_PAUSE_OR_RESUME_FIELD_NUMBER = 1;
    private static final FitnessProto$ButtonToPauseOrResumeSwitch DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$ButtonToPauseOrResumeSwitch> PARSER;
    private int buttonToPauseOrResume_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$ButtonToPauseOrResumeSwitch, Builder> implements FitnessProto$ButtonToPauseOrResumeSwitchOrBuilder {
        public Builder clearButtonToPauseOrResume() {
            copyOnWrite();
            ((FitnessProto$ButtonToPauseOrResumeSwitch) this.instance).clearButtonToPauseOrResume();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$ButtonToPauseOrResumeSwitchOrBuilder
        public int getButtonToPauseOrResume() {
            return ((FitnessProto$ButtonToPauseOrResumeSwitch) this.instance).getButtonToPauseOrResume();
        }

        public Builder setButtonToPauseOrResume(int i) {
            copyOnWrite();
            ((FitnessProto$ButtonToPauseOrResumeSwitch) this.instance).setButtonToPauseOrResume(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$ButtonToPauseOrResumeSwitch.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$ButtonToPauseOrResumeSwitch fitnessProto$ButtonToPauseOrResumeSwitch = new FitnessProto$ButtonToPauseOrResumeSwitch();
        DEFAULT_INSTANCE = fitnessProto$ButtonToPauseOrResumeSwitch;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$ButtonToPauseOrResumeSwitch.class, fitnessProto$ButtonToPauseOrResumeSwitch);
    }

    private FitnessProto$ButtonToPauseOrResumeSwitch() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButtonToPauseOrResume() {
        this.buttonToPauseOrResume_ = 0;
    }

    public static FitnessProto$ButtonToPauseOrResumeSwitch getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$ButtonToPauseOrResumeSwitch parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$ButtonToPauseOrResumeSwitch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$ButtonToPauseOrResumeSwitch parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$ButtonToPauseOrResumeSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$ButtonToPauseOrResumeSwitch> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonToPauseOrResume(int i) {
        this.buttonToPauseOrResume_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$ButtonToPauseOrResumeSwitch();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"buttonToPauseOrResume_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$ButtonToPauseOrResumeSwitch> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$ButtonToPauseOrResumeSwitch.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$ButtonToPauseOrResumeSwitchOrBuilder
    public int getButtonToPauseOrResume() {
        return this.buttonToPauseOrResume_;
    }

    public static Builder newBuilder(FitnessProto$ButtonToPauseOrResumeSwitch fitnessProto$ButtonToPauseOrResumeSwitch) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$ButtonToPauseOrResumeSwitch);
    }

    public static FitnessProto$ButtonToPauseOrResumeSwitch parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$ButtonToPauseOrResumeSwitch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$ButtonToPauseOrResumeSwitch parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$ButtonToPauseOrResumeSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$ButtonToPauseOrResumeSwitch parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$ButtonToPauseOrResumeSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$ButtonToPauseOrResumeSwitch parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$ButtonToPauseOrResumeSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$ButtonToPauseOrResumeSwitch parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$ButtonToPauseOrResumeSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$ButtonToPauseOrResumeSwitch parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$ButtonToPauseOrResumeSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$ButtonToPauseOrResumeSwitch parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$ButtonToPauseOrResumeSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$ButtonToPauseOrResumeSwitch parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$ButtonToPauseOrResumeSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$ButtonToPauseOrResumeSwitch parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$ButtonToPauseOrResumeSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$ButtonToPauseOrResumeSwitch parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$ButtonToPauseOrResumeSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
