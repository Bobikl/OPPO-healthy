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
public final class FitnessProto$StressInvestigationResponse extends GeneratedMessageLite<FitnessProto$StressInvestigationResponse, Builder> implements FitnessProto$StressInvestigationResponseOrBuilder {
    private static final FitnessProto$StressInvestigationResponse DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 1;
    public static final int EVENT_FIELD_NUMBER = 2;
    private static volatile Parser<FitnessProto$StressInvestigationResponse> PARSER;
    private int errorCode_;
    private int event_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$StressInvestigationResponse, Builder> implements FitnessProto$StressInvestigationResponseOrBuilder {
        public Builder clearErrorCode() {
            copyOnWrite();
            ((FitnessProto$StressInvestigationResponse) this.instance).clearErrorCode();
            return this;
        }

        public Builder clearEvent() {
            copyOnWrite();
            ((FitnessProto$StressInvestigationResponse) this.instance).clearEvent();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$StressInvestigationResponseOrBuilder
        public int getErrorCode() {
            return ((FitnessProto$StressInvestigationResponse) this.instance).getErrorCode();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$StressInvestigationResponseOrBuilder
        public int getEvent() {
            return ((FitnessProto$StressInvestigationResponse) this.instance).getEvent();
        }

        public Builder setErrorCode(int i) {
            copyOnWrite();
            ((FitnessProto$StressInvestigationResponse) this.instance).setErrorCode(i);
            return this;
        }

        public Builder setEvent(int i) {
            copyOnWrite();
            ((FitnessProto$StressInvestigationResponse) this.instance).setEvent(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$StressInvestigationResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$StressInvestigationResponse fitnessProto$StressInvestigationResponse = new FitnessProto$StressInvestigationResponse();
        DEFAULT_INSTANCE = fitnessProto$StressInvestigationResponse;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$StressInvestigationResponse.class, fitnessProto$StressInvestigationResponse);
    }

    private FitnessProto$StressInvestigationResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorCode() {
        this.errorCode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvent() {
        this.event_ = 0;
    }

    public static FitnessProto$StressInvestigationResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$StressInvestigationResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$StressInvestigationResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$StressInvestigationResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$StressInvestigationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$StressInvestigationResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorCode(int i) {
        this.errorCode_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvent(int i) {
        this.event_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$StressInvestigationResponse();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"errorCode_", "event_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$StressInvestigationResponse> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$StressInvestigationResponse.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$StressInvestigationResponseOrBuilder
    public int getErrorCode() {
        return this.errorCode_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$StressInvestigationResponseOrBuilder
    public int getEvent() {
        return this.event_;
    }

    public static Builder newBuilder(FitnessProto$StressInvestigationResponse fitnessProto$StressInvestigationResponse) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$StressInvestigationResponse);
    }

    public static FitnessProto$StressInvestigationResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$StressInvestigationResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$StressInvestigationResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$StressInvestigationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$StressInvestigationResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$StressInvestigationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$StressInvestigationResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$StressInvestigationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$StressInvestigationResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$StressInvestigationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$StressInvestigationResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$StressInvestigationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$StressInvestigationResponse parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$StressInvestigationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$StressInvestigationResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$StressInvestigationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$StressInvestigationResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$StressInvestigationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$StressInvestigationResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$StressInvestigationResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
