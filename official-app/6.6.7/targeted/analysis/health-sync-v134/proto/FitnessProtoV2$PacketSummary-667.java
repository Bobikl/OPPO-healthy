package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.model.ko7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes17.dex */
public final class FitnessProtoV2$PacketSummary extends GeneratedMessageLite<FitnessProtoV2$PacketSummary, Builder> implements FitnessProtoV2$PacketSummaryOrBuilder {
    private static final FitnessProtoV2$PacketSummary DEFAULT_INSTANCE;
    public static final int END_TIME_FIELD_NUMBER = 3;
    public static final int HASMORE_FIELD_NUMBER = 1;
    private static volatile Parser<FitnessProtoV2$PacketSummary> PARSER = null;
    public static final int START_TIME_FIELD_NUMBER = 2;
    private int endTime_;
    private boolean hasMore_;
    private int startTime_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProtoV2$PacketSummary, Builder> implements FitnessProtoV2$PacketSummaryOrBuilder {
        public Builder clearEndTime() {
            copyOnWrite();
            ((FitnessProtoV2$PacketSummary) ((GeneratedMessageLite.Builder) this).instance).clearEndTime();
            return this;
        }

        public Builder clearHasMore() {
            copyOnWrite();
            ((FitnessProtoV2$PacketSummary) ((GeneratedMessageLite.Builder) this).instance).clearHasMore();
            return this;
        }

        public Builder clearStartTime() {
            copyOnWrite();
            ((FitnessProtoV2$PacketSummary) ((GeneratedMessageLite.Builder) this).instance).clearStartTime();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$PacketSummaryOrBuilder
        public int getEndTime() {
            return ((FitnessProtoV2$PacketSummary) ((GeneratedMessageLite.Builder) this).instance).getEndTime();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$PacketSummaryOrBuilder
        public boolean getHasMore() {
            return ((FitnessProtoV2$PacketSummary) ((GeneratedMessageLite.Builder) this).instance).getHasMore();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$PacketSummaryOrBuilder
        public int getStartTime() {
            return ((FitnessProtoV2$PacketSummary) ((GeneratedMessageLite.Builder) this).instance).getStartTime();
        }

        public Builder setEndTime(int i) {
            copyOnWrite();
            ((FitnessProtoV2$PacketSummary) ((GeneratedMessageLite.Builder) this).instance).setEndTime(i);
            return this;
        }

        public Builder setHasMore(boolean z) {
            copyOnWrite();
            ((FitnessProtoV2$PacketSummary) ((GeneratedMessageLite.Builder) this).instance).setHasMore(z);
            return this;
        }

        public Builder setStartTime(int i) {
            copyOnWrite();
            ((FitnessProtoV2$PacketSummary) ((GeneratedMessageLite.Builder) this).instance).setStartTime(i);
            return this;
        }

        private Builder() {
            super(FitnessProtoV2$PacketSummary.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProtoV2$PacketSummary fitnessProtoV2$PacketSummary = new FitnessProtoV2$PacketSummary();
        DEFAULT_INSTANCE = fitnessProtoV2$PacketSummary;
        GeneratedMessageLite.registerDefaultInstance(FitnessProtoV2$PacketSummary.class, fitnessProtoV2$PacketSummary);
    }

    private FitnessProtoV2$PacketSummary() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndTime() {
        this.endTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasMore() {
        this.hasMore_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTime() {
        this.startTime_ = 0;
    }

    public static FitnessProtoV2$PacketSummary getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProtoV2$PacketSummary parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$PacketSummary) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$PacketSummary parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$PacketSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProtoV2$PacketSummary> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndTime(int i) {
        this.endTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasMore(boolean z) {
        this.hasMore_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTime(int i) {
        this.startTime_ = i;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = ko7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProtoV2$PacketSummary();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u000b\u0003\u000b", new Object[]{"hasMore_", "startTime_", "endTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProtoV2$PacketSummary.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$PacketSummaryOrBuilder
    public int getEndTime() {
        return this.endTime_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$PacketSummaryOrBuilder
    public boolean getHasMore() {
        return this.hasMore_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$PacketSummaryOrBuilder
    public int getStartTime() {
        return this.startTime_;
    }

    public static Builder newBuilder(FitnessProtoV2$PacketSummary fitnessProtoV2$PacketSummary) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(fitnessProtoV2$PacketSummary);
    }

    public static FitnessProtoV2$PacketSummary parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$PacketSummary) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$PacketSummary parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$PacketSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProtoV2$PacketSummary parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$PacketSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProtoV2$PacketSummary parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$PacketSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProtoV2$PacketSummary parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$PacketSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProtoV2$PacketSummary parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$PacketSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProtoV2$PacketSummary parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$PacketSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$PacketSummary parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$PacketSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$PacketSummary parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProtoV2$PacketSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProtoV2$PacketSummary parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$PacketSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}