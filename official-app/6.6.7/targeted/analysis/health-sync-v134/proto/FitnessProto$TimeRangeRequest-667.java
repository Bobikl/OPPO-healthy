package com.heytap.health.protocol.fitness;

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
public final class FitnessProto$TimeRangeRequest extends GeneratedMessageLite<FitnessProto$TimeRangeRequest, Builder> implements FitnessProto$TimeRangeRequestOrBuilder {
    private static final FitnessProto$TimeRangeRequest DEFAULT_INSTANCE;
    public static final int END_TIMESTAMP_FIELD_NUMBER = 2;
    private static volatile Parser<FitnessProto$TimeRangeRequest> PARSER = null;
    public static final int START_TIMESTAMP_FIELD_NUMBER = 1;
    public static final int SUPPORT_TLV_FIELD_NUMBER = 3;
    private int endTimestamp_;
    private int startTimestamp_;
    private int supportTlv_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$TimeRangeRequest, Builder> implements FitnessProto$TimeRangeRequestOrBuilder {
        public Builder clearEndTimestamp() {
            copyOnWrite();
            ((FitnessProto$TimeRangeRequest) ((GeneratedMessageLite.Builder) this).instance).clearEndTimestamp();
            return this;
        }

        public Builder clearStartTimestamp() {
            copyOnWrite();
            ((FitnessProto$TimeRangeRequest) ((GeneratedMessageLite.Builder) this).instance).clearStartTimestamp();
            return this;
        }

        public Builder clearSupportTlv() {
            copyOnWrite();
            ((FitnessProto$TimeRangeRequest) ((GeneratedMessageLite.Builder) this).instance).clearSupportTlv();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$TimeRangeRequestOrBuilder
        public int getEndTimestamp() {
            return ((FitnessProto$TimeRangeRequest) ((GeneratedMessageLite.Builder) this).instance).getEndTimestamp();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$TimeRangeRequestOrBuilder
        public int getStartTimestamp() {
            return ((FitnessProto$TimeRangeRequest) ((GeneratedMessageLite.Builder) this).instance).getStartTimestamp();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$TimeRangeRequestOrBuilder
        public int getSupportTlv() {
            return ((FitnessProto$TimeRangeRequest) ((GeneratedMessageLite.Builder) this).instance).getSupportTlv();
        }

        public Builder setEndTimestamp(int i) {
            copyOnWrite();
            ((FitnessProto$TimeRangeRequest) ((GeneratedMessageLite.Builder) this).instance).setEndTimestamp(i);
            return this;
        }

        public Builder setStartTimestamp(int i) {
            copyOnWrite();
            ((FitnessProto$TimeRangeRequest) ((GeneratedMessageLite.Builder) this).instance).setStartTimestamp(i);
            return this;
        }

        public Builder setSupportTlv(int i) {
            copyOnWrite();
            ((FitnessProto$TimeRangeRequest) ((GeneratedMessageLite.Builder) this).instance).setSupportTlv(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$TimeRangeRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$TimeRangeRequest fitnessProto$TimeRangeRequest = new FitnessProto$TimeRangeRequest();
        DEFAULT_INSTANCE = fitnessProto$TimeRangeRequest;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$TimeRangeRequest.class, fitnessProto$TimeRangeRequest);
    }

    private FitnessProto$TimeRangeRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndTimestamp() {
        this.endTimestamp_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTimestamp() {
        this.startTimestamp_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSupportTlv() {
        this.supportTlv_ = 0;
    }

    public static FitnessProto$TimeRangeRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$TimeRangeRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$TimeRangeRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$TimeRangeRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$TimeRangeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$TimeRangeRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndTimestamp(int i) {
        this.endTimestamp_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTimestamp(int i) {
        this.startTimestamp_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSupportTlv(int i) {
        this.supportTlv_ = i;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = pi7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$TimeRangeRequest();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b", new Object[]{"startTimestamp_", "endTimestamp_", "supportTlv_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$TimeRangeRequest.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$TimeRangeRequestOrBuilder
    public int getEndTimestamp() {
        return this.endTimestamp_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$TimeRangeRequestOrBuilder
    public int getStartTimestamp() {
        return this.startTimestamp_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$TimeRangeRequestOrBuilder
    public int getSupportTlv() {
        return this.supportTlv_;
    }

    public static Builder newBuilder(FitnessProto$TimeRangeRequest fitnessProto$TimeRangeRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(fitnessProto$TimeRangeRequest);
    }

    public static FitnessProto$TimeRangeRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$TimeRangeRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$TimeRangeRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$TimeRangeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$TimeRangeRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$TimeRangeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$TimeRangeRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$TimeRangeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$TimeRangeRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$TimeRangeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$TimeRangeRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$TimeRangeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$TimeRangeRequest parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$TimeRangeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$TimeRangeRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$TimeRangeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$TimeRangeRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$TimeRangeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$TimeRangeRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$TimeRangeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}