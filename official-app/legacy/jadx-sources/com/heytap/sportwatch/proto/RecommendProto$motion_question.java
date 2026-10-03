package com.heytap.sportwatch.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.pef;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class RecommendProto$motion_question extends GeneratedMessageLite<RecommendProto$motion_question, Builder> implements RecommendProto$motion_questionOrBuilder {
    public static final int ANSWER_FIELD_NUMBER = 2;
    public static final int ANSWER_VALUE_FIELD_NUMBER = 3;
    private static final RecommendProto$motion_question DEFAULT_INSTANCE;
    private static volatile Parser<RecommendProto$motion_question> PARSER = null;
    public static final int QUESTION_ID_FIELD_NUMBER = 1;
    private int answerValue_;
    private int bitField0_;
    private int questionId_;
    private int answerMemoizedSerializedSize = -1;
    private Internal.IntList answer_ = GeneratedMessageLite.emptyIntList();

    public static final class Builder extends GeneratedMessageLite.Builder<RecommendProto$motion_question, Builder> implements RecommendProto$motion_questionOrBuilder {
        public Builder addAllAnswer(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((RecommendProto$motion_question) this.instance).addAllAnswer(iterable);
            return this;
        }

        public Builder addAnswer(int i) {
            copyOnWrite();
            ((RecommendProto$motion_question) this.instance).addAnswer(i);
            return this;
        }

        public Builder clearAnswer() {
            copyOnWrite();
            ((RecommendProto$motion_question) this.instance).clearAnswer();
            return this;
        }

        public Builder clearAnswerValue() {
            copyOnWrite();
            ((RecommendProto$motion_question) this.instance).clearAnswerValue();
            return this;
        }

        public Builder clearQuestionId() {
            copyOnWrite();
            ((RecommendProto$motion_question) this.instance).clearQuestionId();
            return this;
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$motion_questionOrBuilder
        public int getAnswer(int i) {
            return ((RecommendProto$motion_question) this.instance).getAnswer(i);
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$motion_questionOrBuilder
        public int getAnswerCount() {
            return ((RecommendProto$motion_question) this.instance).getAnswerCount();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$motion_questionOrBuilder
        public List<Integer> getAnswerList() {
            return Collections.unmodifiableList(((RecommendProto$motion_question) this.instance).getAnswerList());
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$motion_questionOrBuilder
        public int getAnswerValue() {
            return ((RecommendProto$motion_question) this.instance).getAnswerValue();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$motion_questionOrBuilder
        public RecommendProto$QUESTION_ID getQuestionId() {
            return ((RecommendProto$motion_question) this.instance).getQuestionId();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$motion_questionOrBuilder
        public int getQuestionIdValue() {
            return ((RecommendProto$motion_question) this.instance).getQuestionIdValue();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$motion_questionOrBuilder
        public boolean hasAnswerValue() {
            return ((RecommendProto$motion_question) this.instance).hasAnswerValue();
        }

        public Builder setAnswer(int i, int i2) {
            copyOnWrite();
            ((RecommendProto$motion_question) this.instance).setAnswer(i, i2);
            return this;
        }

        public Builder setAnswerValue(int i) {
            copyOnWrite();
            ((RecommendProto$motion_question) this.instance).setAnswerValue(i);
            return this;
        }

        public Builder setQuestionId(RecommendProto$QUESTION_ID recommendProto$QUESTION_ID) {
            copyOnWrite();
            ((RecommendProto$motion_question) this.instance).setQuestionId(recommendProto$QUESTION_ID);
            return this;
        }

        public Builder setQuestionIdValue(int i) {
            copyOnWrite();
            ((RecommendProto$motion_question) this.instance).setQuestionIdValue(i);
            return this;
        }

        private Builder() {
            super(RecommendProto$motion_question.DEFAULT_INSTANCE);
        }
    }

    static {
        RecommendProto$motion_question recommendProto$motion_question = new RecommendProto$motion_question();
        DEFAULT_INSTANCE = recommendProto$motion_question;
        GeneratedMessageLite.registerDefaultInstance(RecommendProto$motion_question.class, recommendProto$motion_question);
    }

    private RecommendProto$motion_question() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAnswer(Iterable<? extends Integer> iterable) {
        ensureAnswerIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.answer_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAnswer(int i) {
        ensureAnswerIsMutable();
        this.answer_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnswer() {
        this.answer_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnswerValue() {
        this.bitField0_ &= -2;
        this.answerValue_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuestionId() {
        this.questionId_ = 0;
    }

    private void ensureAnswerIsMutable() {
        Internal.IntList intList = this.answer_;
        if (intList.isModifiable()) {
            return;
        }
        this.answer_ = GeneratedMessageLite.mutableCopy(intList);
    }

    public static RecommendProto$motion_question getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RecommendProto$motion_question parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$motion_question) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$motion_question parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RecommendProto$motion_question) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RecommendProto$motion_question> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnswer(int i, int i2) {
        ensureAnswerIsMutable();
        this.answer_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnswerValue(int i) {
        this.bitField0_ |= 1;
        this.answerValue_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuestionId(RecommendProto$QUESTION_ID recommendProto$QUESTION_ID) {
        this.questionId_ = recommendProto$QUESTION_ID.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuestionIdValue(int i) {
        this.questionId_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = pef.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new RecommendProto$motion_question();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002+\u0003င\u0000", new Object[]{"bitField0_", "questionId_", "answer_", "answerValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RecommendProto$motion_question> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (RecommendProto$motion_question.class) {
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

    @Override // com.heytap.sportwatch.proto.RecommendProto$motion_questionOrBuilder
    public int getAnswer(int i) {
        return this.answer_.getInt(i);
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$motion_questionOrBuilder
    public int getAnswerCount() {
        return this.answer_.size();
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$motion_questionOrBuilder
    public List<Integer> getAnswerList() {
        return this.answer_;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$motion_questionOrBuilder
    public int getAnswerValue() {
        return this.answerValue_;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$motion_questionOrBuilder
    public RecommendProto$QUESTION_ID getQuestionId() {
        RecommendProto$QUESTION_ID recommendProto$QUESTION_IDForNumber = RecommendProto$QUESTION_ID.forNumber(this.questionId_);
        return recommendProto$QUESTION_IDForNumber == null ? RecommendProto$QUESTION_ID.UNRECOGNIZED : recommendProto$QUESTION_IDForNumber;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$motion_questionOrBuilder
    public int getQuestionIdValue() {
        return this.questionId_;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$motion_questionOrBuilder
    public boolean hasAnswerValue() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(RecommendProto$motion_question recommendProto$motion_question) {
        return DEFAULT_INSTANCE.createBuilder(recommendProto$motion_question);
    }

    public static RecommendProto$motion_question parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$motion_question) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$motion_question parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$motion_question) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RecommendProto$motion_question parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RecommendProto$motion_question) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RecommendProto$motion_question parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$motion_question) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RecommendProto$motion_question parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RecommendProto$motion_question) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RecommendProto$motion_question parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$motion_question) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RecommendProto$motion_question parseFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$motion_question) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$motion_question parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$motion_question) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$motion_question parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RecommendProto$motion_question) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RecommendProto$motion_question parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$motion_question) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
