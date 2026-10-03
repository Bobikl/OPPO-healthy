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
public final class FitnessProto$EcgActiveStateReply extends GeneratedMessageLite<FitnessProto$EcgActiveStateReply, Builder> implements FitnessProto$EcgActiveStateReplyOrBuilder {
    private static final FitnessProto$EcgActiveStateReply DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$EcgActiveStateReply> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int type_;
    private int value_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$EcgActiveStateReply, Builder> implements FitnessProto$EcgActiveStateReplyOrBuilder {
        public Builder clearType() {
            copyOnWrite();
            ((FitnessProto$EcgActiveStateReply) this.instance).clearType();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((FitnessProto$EcgActiveStateReply) this.instance).clearValue();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$EcgActiveStateReplyOrBuilder
        public int getType() {
            return ((FitnessProto$EcgActiveStateReply) this.instance).getType();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$EcgActiveStateReplyOrBuilder
        public int getValue() {
            return ((FitnessProto$EcgActiveStateReply) this.instance).getValue();
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((FitnessProto$EcgActiveStateReply) this.instance).setType(i);
            return this;
        }

        public Builder setValue(int i) {
            copyOnWrite();
            ((FitnessProto$EcgActiveStateReply) this.instance).setValue(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$EcgActiveStateReply.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$EcgActiveStateReply fitnessProto$EcgActiveStateReply = new FitnessProto$EcgActiveStateReply();
        DEFAULT_INSTANCE = fitnessProto$EcgActiveStateReply;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$EcgActiveStateReply.class, fitnessProto$EcgActiveStateReply);
    }

    private FitnessProto$EcgActiveStateReply() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0;
    }

    public static FitnessProto$EcgActiveStateReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$EcgActiveStateReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$EcgActiveStateReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$EcgActiveStateReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$EcgActiveStateReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$EcgActiveStateReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i) {
        this.type_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int i) {
        this.value_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$EcgActiveStateReply();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"type_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$EcgActiveStateReply> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$EcgActiveStateReply.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$EcgActiveStateReplyOrBuilder
    public int getType() {
        return this.type_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$EcgActiveStateReplyOrBuilder
    public int getValue() {
        return this.value_;
    }

    public static Builder newBuilder(FitnessProto$EcgActiveStateReply fitnessProto$EcgActiveStateReply) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$EcgActiveStateReply);
    }

    public static FitnessProto$EcgActiveStateReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$EcgActiveStateReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$EcgActiveStateReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$EcgActiveStateReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$EcgActiveStateReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$EcgActiveStateReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$EcgActiveStateReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$EcgActiveStateReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$EcgActiveStateReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$EcgActiveStateReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$EcgActiveStateReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$EcgActiveStateReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$EcgActiveStateReply parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$EcgActiveStateReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$EcgActiveStateReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$EcgActiveStateReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$EcgActiveStateReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$EcgActiveStateReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$EcgActiveStateReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$EcgActiveStateReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
