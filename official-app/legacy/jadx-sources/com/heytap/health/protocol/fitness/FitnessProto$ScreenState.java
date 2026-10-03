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
public final class FitnessProto$ScreenState extends GeneratedMessageLite<FitnessProto$ScreenState, Builder> implements FitnessProto$ScreenStateOrBuilder {
    private static final FitnessProto$ScreenState DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$ScreenState> PARSER = null;
    public static final int STATE_FIELD_NUMBER = 1;
    private int state_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$ScreenState, Builder> implements FitnessProto$ScreenStateOrBuilder {
        public Builder clearState() {
            copyOnWrite();
            ((FitnessProto$ScreenState) this.instance).clearState();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$ScreenStateOrBuilder
        public int getState() {
            return ((FitnessProto$ScreenState) this.instance).getState();
        }

        public Builder setState(int i) {
            copyOnWrite();
            ((FitnessProto$ScreenState) this.instance).setState(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$ScreenState.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$ScreenState fitnessProto$ScreenState = new FitnessProto$ScreenState();
        DEFAULT_INSTANCE = fitnessProto$ScreenState;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$ScreenState.class, fitnessProto$ScreenState);
    }

    private FitnessProto$ScreenState() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = 0;
    }

    public static FitnessProto$ScreenState getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$ScreenState parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$ScreenState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$ScreenState parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$ScreenState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$ScreenState> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(int i) {
        this.state_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$ScreenState();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"state_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$ScreenState> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$ScreenState.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$ScreenStateOrBuilder
    public int getState() {
        return this.state_;
    }

    public static Builder newBuilder(FitnessProto$ScreenState fitnessProto$ScreenState) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$ScreenState);
    }

    public static FitnessProto$ScreenState parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$ScreenState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$ScreenState parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$ScreenState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$ScreenState parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$ScreenState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$ScreenState parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$ScreenState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$ScreenState parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$ScreenState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$ScreenState parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$ScreenState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$ScreenState parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$ScreenState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$ScreenState parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$ScreenState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$ScreenState parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$ScreenState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$ScreenState parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$ScreenState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
