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
public final class FitnessProto$StressResultItem extends GeneratedMessageLite<FitnessProto$StressResultItem, Builder> implements FitnessProto$StressResultItemOrBuilder {
    private static final FitnessProto$StressResultItem DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$StressResultItem> PARSER = null;
    public static final int QUESTION_NUM_FIELD_NUMBER = 1;
    public static final int QUESTION_RESULT_FIELD_NUMBER = 2;
    private int questionNum_;
    private int questionResult_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$StressResultItem, Builder> implements FitnessProto$StressResultItemOrBuilder {
        public Builder clearQuestionNum() {
            copyOnWrite();
            ((FitnessProto$StressResultItem) this.instance).clearQuestionNum();
            return this;
        }

        public Builder clearQuestionResult() {
            copyOnWrite();
            ((FitnessProto$StressResultItem) this.instance).clearQuestionResult();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$StressResultItemOrBuilder
        public int getQuestionNum() {
            return ((FitnessProto$StressResultItem) this.instance).getQuestionNum();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$StressResultItemOrBuilder
        public int getQuestionResult() {
            return ((FitnessProto$StressResultItem) this.instance).getQuestionResult();
        }

        public Builder setQuestionNum(int i) {
            copyOnWrite();
            ((FitnessProto$StressResultItem) this.instance).setQuestionNum(i);
            return this;
        }

        public Builder setQuestionResult(int i) {
            copyOnWrite();
            ((FitnessProto$StressResultItem) this.instance).setQuestionResult(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$StressResultItem.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$StressResultItem fitnessProto$StressResultItem = new FitnessProto$StressResultItem();
        DEFAULT_INSTANCE = fitnessProto$StressResultItem;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$StressResultItem.class, fitnessProto$StressResultItem);
    }

    private FitnessProto$StressResultItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuestionNum() {
        this.questionNum_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuestionResult() {
        this.questionResult_ = 0;
    }

    public static FitnessProto$StressResultItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$StressResultItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$StressResultItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$StressResultItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$StressResultItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$StressResultItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuestionNum(int i) {
        this.questionNum_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuestionResult(int i) {
        this.questionResult_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$StressResultItem();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"questionNum_", "questionResult_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$StressResultItem> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$StressResultItem.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$StressResultItemOrBuilder
    public int getQuestionNum() {
        return this.questionNum_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$StressResultItemOrBuilder
    public int getQuestionResult() {
        return this.questionResult_;
    }

    public static Builder newBuilder(FitnessProto$StressResultItem fitnessProto$StressResultItem) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$StressResultItem);
    }

    public static FitnessProto$StressResultItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$StressResultItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$StressResultItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$StressResultItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$StressResultItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$StressResultItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$StressResultItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$StressResultItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$StressResultItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$StressResultItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$StressResultItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$StressResultItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$StressResultItem parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$StressResultItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$StressResultItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$StressResultItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$StressResultItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$StressResultItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$StressResultItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$StressResultItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
