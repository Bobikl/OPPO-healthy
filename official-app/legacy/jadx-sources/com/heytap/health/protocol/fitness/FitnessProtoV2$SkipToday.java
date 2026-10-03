package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.in7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FitnessProtoV2$SkipToday extends GeneratedMessageLite<FitnessProtoV2$SkipToday, Builder> implements FitnessProtoV2$SkipTodayOrBuilder {
    public static final int CURRENT_MONTH_SKIPPED_COUNT_FIELD_NUMBER = 3;
    private static final FitnessProtoV2$SkipToday DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProtoV2$SkipToday> PARSER = null;
    public static final int SKIP_FIELD_NUMBER = 1;
    public static final int SKIP_TODAY_REASON_FIELD_NUMBER = 2;
    private int currentMonthSkippedCount_;
    private int skipTodayReason_;
    private int skip_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProtoV2$SkipToday, Builder> implements FitnessProtoV2$SkipTodayOrBuilder {
        public Builder clearCurrentMonthSkippedCount() {
            copyOnWrite();
            ((FitnessProtoV2$SkipToday) this.instance).clearCurrentMonthSkippedCount();
            return this;
        }

        public Builder clearSkip() {
            copyOnWrite();
            ((FitnessProtoV2$SkipToday) this.instance).clearSkip();
            return this;
        }

        public Builder clearSkipTodayReason() {
            copyOnWrite();
            ((FitnessProtoV2$SkipToday) this.instance).clearSkipTodayReason();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SkipTodayOrBuilder
        public int getCurrentMonthSkippedCount() {
            return ((FitnessProtoV2$SkipToday) this.instance).getCurrentMonthSkippedCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SkipTodayOrBuilder
        public int getSkip() {
            return ((FitnessProtoV2$SkipToday) this.instance).getSkip();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SkipTodayOrBuilder
        public int getSkipTodayReason() {
            return ((FitnessProtoV2$SkipToday) this.instance).getSkipTodayReason();
        }

        public Builder setCurrentMonthSkippedCount(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SkipToday) this.instance).setCurrentMonthSkippedCount(i);
            return this;
        }

        public Builder setSkip(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SkipToday) this.instance).setSkip(i);
            return this;
        }

        public Builder setSkipTodayReason(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SkipToday) this.instance).setSkipTodayReason(i);
            return this;
        }

        private Builder() {
            super(FitnessProtoV2$SkipToday.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProtoV2$SkipToday fitnessProtoV2$SkipToday = new FitnessProtoV2$SkipToday();
        DEFAULT_INSTANCE = fitnessProtoV2$SkipToday;
        GeneratedMessageLite.registerDefaultInstance(FitnessProtoV2$SkipToday.class, fitnessProtoV2$SkipToday);
    }

    private FitnessProtoV2$SkipToday() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentMonthSkippedCount() {
        this.currentMonthSkippedCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSkip() {
        this.skip_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSkipTodayReason() {
        this.skipTodayReason_ = 0;
    }

    public static FitnessProtoV2$SkipToday getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProtoV2$SkipToday parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$SkipToday) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$SkipToday parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SkipToday) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProtoV2$SkipToday> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentMonthSkippedCount(int i) {
        this.currentMonthSkippedCount_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSkip(int i) {
        this.skip_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSkipTodayReason(int i) {
        this.skipTodayReason_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = in7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProtoV2$SkipToday();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b", new Object[]{"skip_", "skipTodayReason_", "currentMonthSkippedCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProtoV2$SkipToday> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProtoV2$SkipToday.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SkipTodayOrBuilder
    public int getCurrentMonthSkippedCount() {
        return this.currentMonthSkippedCount_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SkipTodayOrBuilder
    public int getSkip() {
        return this.skip_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SkipTodayOrBuilder
    public int getSkipTodayReason() {
        return this.skipTodayReason_;
    }

    public static Builder newBuilder(FitnessProtoV2$SkipToday fitnessProtoV2$SkipToday) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProtoV2$SkipToday);
    }

    public static FitnessProtoV2$SkipToday parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SkipToday) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SkipToday parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SkipToday) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProtoV2$SkipToday parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SkipToday) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProtoV2$SkipToday parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SkipToday) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProtoV2$SkipToday parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SkipToday) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProtoV2$SkipToday parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SkipToday) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProtoV2$SkipToday parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$SkipToday) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$SkipToday parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SkipToday) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SkipToday parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProtoV2$SkipToday) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProtoV2$SkipToday parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SkipToday) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
