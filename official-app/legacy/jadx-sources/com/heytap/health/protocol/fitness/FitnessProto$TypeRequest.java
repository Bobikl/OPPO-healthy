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
public final class FitnessProto$TypeRequest extends GeneratedMessageLite<FitnessProto$TypeRequest, Builder> implements FitnessProto$TypeRequestOrBuilder {
    private static final FitnessProto$TypeRequest DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$TypeRequest> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$TypeRequest, Builder> implements FitnessProto$TypeRequestOrBuilder {
        public Builder clearType() {
            copyOnWrite();
            ((FitnessProto$TypeRequest) this.instance).clearType();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$TypeRequestOrBuilder
        public int getType() {
            return ((FitnessProto$TypeRequest) this.instance).getType();
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((FitnessProto$TypeRequest) this.instance).setType(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$TypeRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$TypeRequest fitnessProto$TypeRequest = new FitnessProto$TypeRequest();
        DEFAULT_INSTANCE = fitnessProto$TypeRequest;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$TypeRequest.class, fitnessProto$TypeRequest);
    }

    private FitnessProto$TypeRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static FitnessProto$TypeRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$TypeRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$TypeRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$TypeRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$TypeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$TypeRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$TypeRequest();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"type_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$TypeRequest> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$TypeRequest.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$TypeRequestOrBuilder
    public int getType() {
        return this.type_;
    }

    public static Builder newBuilder(FitnessProto$TypeRequest fitnessProto$TypeRequest) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$TypeRequest);
    }

    public static FitnessProto$TypeRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$TypeRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$TypeRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$TypeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$TypeRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$TypeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$TypeRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$TypeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$TypeRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$TypeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$TypeRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$TypeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$TypeRequest parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$TypeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$TypeRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$TypeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$TypeRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$TypeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$TypeRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$TypeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
