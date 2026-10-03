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
public final class FitnessProto$CloseMusic extends GeneratedMessageLite<FitnessProto$CloseMusic, Builder> implements FitnessProto$CloseMusicOrBuilder {
    public static final int CLOSEMUSIC_FIELD_NUMBER = 1;
    private static final FitnessProto$CloseMusic DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$CloseMusic> PARSER;
    private int closeMusic_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$CloseMusic, Builder> implements FitnessProto$CloseMusicOrBuilder {
        public Builder clearCloseMusic() {
            copyOnWrite();
            ((FitnessProto$CloseMusic) this.instance).clearCloseMusic();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$CloseMusicOrBuilder
        public int getCloseMusic() {
            return ((FitnessProto$CloseMusic) this.instance).getCloseMusic();
        }

        public Builder setCloseMusic(int i) {
            copyOnWrite();
            ((FitnessProto$CloseMusic) this.instance).setCloseMusic(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$CloseMusic.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$CloseMusic fitnessProto$CloseMusic = new FitnessProto$CloseMusic();
        DEFAULT_INSTANCE = fitnessProto$CloseMusic;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$CloseMusic.class, fitnessProto$CloseMusic);
    }

    private FitnessProto$CloseMusic() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCloseMusic() {
        this.closeMusic_ = 0;
    }

    public static FitnessProto$CloseMusic getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$CloseMusic parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$CloseMusic) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$CloseMusic parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$CloseMusic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$CloseMusic> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCloseMusic(int i) {
        this.closeMusic_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$CloseMusic();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"closeMusic_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$CloseMusic> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$CloseMusic.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$CloseMusicOrBuilder
    public int getCloseMusic() {
        return this.closeMusic_;
    }

    public static Builder newBuilder(FitnessProto$CloseMusic fitnessProto$CloseMusic) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$CloseMusic);
    }

    public static FitnessProto$CloseMusic parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$CloseMusic) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$CloseMusic parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$CloseMusic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$CloseMusic parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$CloseMusic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$CloseMusic parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$CloseMusic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$CloseMusic parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$CloseMusic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$CloseMusic parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$CloseMusic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$CloseMusic parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$CloseMusic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$CloseMusic parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$CloseMusic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$CloseMusic parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$CloseMusic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$CloseMusic parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$CloseMusic) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
