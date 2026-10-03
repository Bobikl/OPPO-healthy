package com.heytap.health.protocol.fitness;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.model.pi7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes17.dex */
public final class FitnessProto$PacketDataRequest extends GeneratedMessageLite<FitnessProto$PacketDataRequest, Builder> implements FitnessProto$PacketDataRequestOrBuilder {
    private static final FitnessProto$PacketDataRequest DEFAULT_INSTANCE;
    public static final int INDEX_FIELD_NUMBER = 1;
    private static volatile Parser<FitnessProto$PacketDataRequest> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 3;
    public static final int START_TIMESTAMP_FIELD_NUMBER = 2;
    private int index_;
    private String sessionId_ = "";
    private int startTimestamp_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$PacketDataRequest, Builder> implements FitnessProto$PacketDataRequestOrBuilder {
        public Builder clearIndex() {
            copyOnWrite();
            ((FitnessProto$PacketDataRequest) ((GeneratedMessageLite.Builder) this).instance).clearIndex();
            return this;
        }

        public Builder clearSessionId() {
            copyOnWrite();
            ((FitnessProto$PacketDataRequest) ((GeneratedMessageLite.Builder) this).instance).clearSessionId();
            return this;
        }

        public Builder clearStartTimestamp() {
            copyOnWrite();
            ((FitnessProto$PacketDataRequest) ((GeneratedMessageLite.Builder) this).instance).clearStartTimestamp();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$PacketDataRequestOrBuilder
        public int getIndex() {
            return ((FitnessProto$PacketDataRequest) ((GeneratedMessageLite.Builder) this).instance).getIndex();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$PacketDataRequestOrBuilder
        public String getSessionId() {
            return ((FitnessProto$PacketDataRequest) ((GeneratedMessageLite.Builder) this).instance).getSessionId();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$PacketDataRequestOrBuilder
        public ByteString getSessionIdBytes() {
            return ((FitnessProto$PacketDataRequest) ((GeneratedMessageLite.Builder) this).instance).getSessionIdBytes();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$PacketDataRequestOrBuilder
        public int getStartTimestamp() {
            return ((FitnessProto$PacketDataRequest) ((GeneratedMessageLite.Builder) this).instance).getStartTimestamp();
        }

        public Builder setIndex(int i) {
            copyOnWrite();
            ((FitnessProto$PacketDataRequest) ((GeneratedMessageLite.Builder) this).instance).setIndex(i);
            return this;
        }

        public Builder setSessionId(String str) {
            copyOnWrite();
            ((FitnessProto$PacketDataRequest) ((GeneratedMessageLite.Builder) this).instance).setSessionId(str);
            return this;
        }

        public Builder setSessionIdBytes(ByteString byteString) {
            copyOnWrite();
            ((FitnessProto$PacketDataRequest) ((GeneratedMessageLite.Builder) this).instance).setSessionIdBytes(byteString);
            return this;
        }

        public Builder setStartTimestamp(int i) {
            copyOnWrite();
            ((FitnessProto$PacketDataRequest) ((GeneratedMessageLite.Builder) this).instance).setStartTimestamp(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$PacketDataRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$PacketDataRequest fitnessProto$PacketDataRequest = new FitnessProto$PacketDataRequest();
        DEFAULT_INSTANCE = fitnessProto$PacketDataRequest;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$PacketDataRequest.class, fitnessProto$PacketDataRequest);
    }

    private FitnessProto$PacketDataRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIndex() {
        this.index_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTimestamp() {
        this.startTimestamp_ = 0;
    }

    public static FitnessProto$PacketDataRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$PacketDataRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$PacketDataRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$PacketDataRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$PacketDataRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$PacketDataRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndex(int i) {
        this.index_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(String str) {
        str.getClass();
        this.sessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.sessionId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTimestamp(int i) {
        this.startTimestamp_ = i;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = pi7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$PacketDataRequest();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003Ȉ", new Object[]{"index_", "startTimestamp_", "sessionId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$PacketDataRequest.class) {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$PacketDataRequestOrBuilder
    public int getIndex() {
        return this.index_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$PacketDataRequestOrBuilder
    public String getSessionId() {
        return this.sessionId_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$PacketDataRequestOrBuilder
    public ByteString getSessionIdBytes() {
        return ByteString.copyFromUtf8(this.sessionId_);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$PacketDataRequestOrBuilder
    public int getStartTimestamp() {
        return this.startTimestamp_;
    }

    public static Builder newBuilder(FitnessProto$PacketDataRequest fitnessProto$PacketDataRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(fitnessProto$PacketDataRequest);
    }

    public static FitnessProto$PacketDataRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$PacketDataRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$PacketDataRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$PacketDataRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$PacketDataRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$PacketDataRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$PacketDataRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$PacketDataRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$PacketDataRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$PacketDataRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$PacketDataRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$PacketDataRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$PacketDataRequest parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$PacketDataRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$PacketDataRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$PacketDataRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$PacketDataRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$PacketDataRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$PacketDataRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$PacketDataRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}