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
public final class FitnessProtoV2$SkipTodayConfirm extends GeneratedMessageLite<FitnessProtoV2$SkipTodayConfirm, Builder> implements FitnessProtoV2$SkipTodayConfirmOrBuilder {
    public static final int CODE_FIELD_NUMBER = 1;
    public static final int CURRENT_MONTH_SKIPPED_COUNT_FIELD_NUMBER = 2;
    private static final FitnessProtoV2$SkipTodayConfirm DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProtoV2$SkipTodayConfirm> PARSER;
    private int code_;
    private int currentMonthSkippedCount_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProtoV2$SkipTodayConfirm, Builder> implements FitnessProtoV2$SkipTodayConfirmOrBuilder {
        private Builder() {
            super(FitnessProtoV2$SkipTodayConfirm.DEFAULT_INSTANCE);
        }

        public Builder clearCode() {
            copyOnWrite();
            ((FitnessProtoV2$SkipTodayConfirm) this.instance).clearCode();
            return this;
        }

        public Builder clearCurrentMonthSkippedCount() {
            copyOnWrite();
            ((FitnessProtoV2$SkipTodayConfirm) this.instance).clearCurrentMonthSkippedCount();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SkipTodayConfirmOrBuilder
        public int getCode() {
            return ((FitnessProtoV2$SkipTodayConfirm) this.instance).getCode();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SkipTodayConfirmOrBuilder
        public int getCurrentMonthSkippedCount() {
            return ((FitnessProtoV2$SkipTodayConfirm) this.instance).getCurrentMonthSkippedCount();
        }

        public Builder setCode(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SkipTodayConfirm) this.instance).setCode(i);
            return this;
        }

        public Builder setCurrentMonthSkippedCount(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SkipTodayConfirm) this.instance).setCurrentMonthSkippedCount(i);
            return this;
        }
    }

    static {
        FitnessProtoV2$SkipTodayConfirm fitnessProtoV2$SkipTodayConfirm = new FitnessProtoV2$SkipTodayConfirm();
        DEFAULT_INSTANCE = fitnessProtoV2$SkipTodayConfirm;
        GeneratedMessageLite.registerDefaultInstance(FitnessProtoV2$SkipTodayConfirm.class, fitnessProtoV2$SkipTodayConfirm);
    }

    private FitnessProtoV2$SkipTodayConfirm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.code_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentMonthSkippedCount() {
        this.currentMonthSkippedCount_ = 0;
    }

    public static FitnessProtoV2$SkipTodayConfirm getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProtoV2$SkipTodayConfirm parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$SkipTodayConfirm) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$SkipTodayConfirm parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SkipTodayConfirm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<FitnessProtoV2$SkipTodayConfirm> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(int i) {
        this.code_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentMonthSkippedCount(int i) {
        this.currentMonthSkippedCount_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = in7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProtoV2$SkipTodayConfirm();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"code_", "currentMonthSkippedCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProtoV2$SkipTodayConfirm> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProtoV2$SkipTodayConfirm.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SkipTodayConfirmOrBuilder
    public int getCode() {
        return this.code_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SkipTodayConfirmOrBuilder
    public int getCurrentMonthSkippedCount() {
        return this.currentMonthSkippedCount_;
    }

    public static Builder newBuilder(FitnessProtoV2$SkipTodayConfirm fitnessProtoV2$SkipTodayConfirm) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProtoV2$SkipTodayConfirm);
    }

    public static FitnessProtoV2$SkipTodayConfirm parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SkipTodayConfirm) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SkipTodayConfirm parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SkipTodayConfirm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProtoV2$SkipTodayConfirm parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProtoV2$SkipTodayConfirm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProtoV2$SkipTodayConfirm parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SkipTodayConfirm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SkipTodayConfirm parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$SkipTodayConfirm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$SkipTodayConfirm parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SkipTodayConfirm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SkipTodayConfirm parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SkipTodayConfirm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static FitnessProtoV2$SkipTodayConfirm parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SkipTodayConfirm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProtoV2$SkipTodayConfirm parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SkipTodayConfirm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProtoV2$SkipTodayConfirm parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SkipTodayConfirm) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
