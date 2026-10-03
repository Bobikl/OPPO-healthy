package com.heytap.health.protocol.fitness;

import androidx.room.util.TableInfo;
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
public final class FitnessProto$HeartRateNoticeRequest extends GeneratedMessageLite<FitnessProto$HeartRateNoticeRequest, Builder> implements FitnessProto$HeartRateNoticeRequestOrBuilder {
    private static final FitnessProto$HeartRateNoticeRequest DEFAULT_INSTANCE;
    public static final int INDEX_FIELD_NUMBER = 1;
    private static volatile Parser<FitnessProto$HeartRateNoticeRequest> PARSER = null;
    public static final int START_TIME_FIELD_NUMBER = 2;
    private int index_;
    private int startTime_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$HeartRateNoticeRequest, Builder> implements FitnessProto$HeartRateNoticeRequestOrBuilder {
        public Builder clearIndex() {
            copyOnWrite();
            ((FitnessProto$HeartRateNoticeRequest) this.instance).clearIndex();
            return this;
        }

        public Builder clearStartTime() {
            copyOnWrite();
            ((FitnessProto$HeartRateNoticeRequest) this.instance).clearStartTime();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateNoticeRequestOrBuilder
        public int getIndex() {
            return ((FitnessProto$HeartRateNoticeRequest) this.instance).getIndex();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateNoticeRequestOrBuilder
        public int getStartTime() {
            return ((FitnessProto$HeartRateNoticeRequest) this.instance).getStartTime();
        }

        public Builder setIndex(int i) {
            copyOnWrite();
            ((FitnessProto$HeartRateNoticeRequest) this.instance).setIndex(i);
            return this;
        }

        public Builder setStartTime(int i) {
            copyOnWrite();
            ((FitnessProto$HeartRateNoticeRequest) this.instance).setStartTime(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$HeartRateNoticeRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$HeartRateNoticeRequest fitnessProto$HeartRateNoticeRequest = new FitnessProto$HeartRateNoticeRequest();
        DEFAULT_INSTANCE = fitnessProto$HeartRateNoticeRequest;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$HeartRateNoticeRequest.class, fitnessProto$HeartRateNoticeRequest);
    }

    private FitnessProto$HeartRateNoticeRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIndex() {
        this.index_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTime() {
        this.startTime_ = 0;
    }

    public static FitnessProto$HeartRateNoticeRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$HeartRateNoticeRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$HeartRateNoticeRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$HeartRateNoticeRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$HeartRateNoticeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$HeartRateNoticeRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndex(int i) {
        this.index_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTime(int i) {
        this.startTime_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$HeartRateNoticeRequest();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{TableInfo.Index.DEFAULT_PREFIX, "startTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$HeartRateNoticeRequest> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$HeartRateNoticeRequest.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateNoticeRequestOrBuilder
    public int getIndex() {
        return this.index_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateNoticeRequestOrBuilder
    public int getStartTime() {
        return this.startTime_;
    }

    public static Builder newBuilder(FitnessProto$HeartRateNoticeRequest fitnessProto$HeartRateNoticeRequest) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$HeartRateNoticeRequest);
    }

    public static FitnessProto$HeartRateNoticeRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$HeartRateNoticeRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$HeartRateNoticeRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$HeartRateNoticeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$HeartRateNoticeRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$HeartRateNoticeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$HeartRateNoticeRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$HeartRateNoticeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$HeartRateNoticeRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$HeartRateNoticeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$HeartRateNoticeRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$HeartRateNoticeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$HeartRateNoticeRequest parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$HeartRateNoticeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$HeartRateNoticeRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$HeartRateNoticeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$HeartRateNoticeRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$HeartRateNoticeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$HeartRateNoticeRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$HeartRateNoticeRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
