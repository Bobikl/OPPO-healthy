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
public final class FitnessProto$CardiovascularPrepareState extends GeneratedMessageLite<FitnessProto$CardiovascularPrepareState, Builder> implements FitnessProto$CardiovascularPrepareStateOrBuilder {
    private static final FitnessProto$CardiovascularPrepareState DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$CardiovascularPrepareState> PARSER = null;
    public static final int STATE_FIELD_NUMBER = 1;
    private int state_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$CardiovascularPrepareState, Builder> implements FitnessProto$CardiovascularPrepareStateOrBuilder {
        public Builder clearState() {
            copyOnWrite();
            ((FitnessProto$CardiovascularPrepareState) this.instance).clearState();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$CardiovascularPrepareStateOrBuilder
        public int getState() {
            return ((FitnessProto$CardiovascularPrepareState) this.instance).getState();
        }

        public Builder setState(int i) {
            copyOnWrite();
            ((FitnessProto$CardiovascularPrepareState) this.instance).setState(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$CardiovascularPrepareState.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$CardiovascularPrepareState fitnessProto$CardiovascularPrepareState = new FitnessProto$CardiovascularPrepareState();
        DEFAULT_INSTANCE = fitnessProto$CardiovascularPrepareState;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$CardiovascularPrepareState.class, fitnessProto$CardiovascularPrepareState);
    }

    private FitnessProto$CardiovascularPrepareState() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = 0;
    }

    public static FitnessProto$CardiovascularPrepareState getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$CardiovascularPrepareState parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$CardiovascularPrepareState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$CardiovascularPrepareState parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$CardiovascularPrepareState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$CardiovascularPrepareState> parser() {
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
                return new FitnessProto$CardiovascularPrepareState();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"state_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$CardiovascularPrepareState> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$CardiovascularPrepareState.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$CardiovascularPrepareStateOrBuilder
    public int getState() {
        return this.state_;
    }

    public static Builder newBuilder(FitnessProto$CardiovascularPrepareState fitnessProto$CardiovascularPrepareState) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$CardiovascularPrepareState);
    }

    public static FitnessProto$CardiovascularPrepareState parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$CardiovascularPrepareState) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$CardiovascularPrepareState parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$CardiovascularPrepareState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$CardiovascularPrepareState parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$CardiovascularPrepareState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$CardiovascularPrepareState parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$CardiovascularPrepareState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$CardiovascularPrepareState parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$CardiovascularPrepareState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$CardiovascularPrepareState parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$CardiovascularPrepareState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$CardiovascularPrepareState parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$CardiovascularPrepareState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$CardiovascularPrepareState parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$CardiovascularPrepareState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$CardiovascularPrepareState parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$CardiovascularPrepareState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$CardiovascularPrepareState parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$CardiovascularPrepareState) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
