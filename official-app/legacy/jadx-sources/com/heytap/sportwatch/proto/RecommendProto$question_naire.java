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
public final class RecommendProto$question_naire extends GeneratedMessageLite<RecommendProto$question_naire, Builder> implements RecommendProto$question_naireOrBuilder {
    public static final int ANSWER_TIMESTAMP_FIELD_NUMBER = 1;
    public static final int ANS_FIELD_NUMBER = 3;
    private static final RecommendProto$question_naire DEFAULT_INSTANCE;
    private static volatile Parser<RecommendProto$question_naire> PARSER = null;
    public static final int SOURCE_FIELD_NUMBER = 2;
    private Internal.ProtobufList<RecommendProto$motion_question> ans_ = GeneratedMessageLite.emptyProtobufList();
    private int answerTimestamp_;
    private int source_;

    public static final class Builder extends GeneratedMessageLite.Builder<RecommendProto$question_naire, Builder> implements RecommendProto$question_naireOrBuilder {
        public Builder addAllAns(Iterable<? extends RecommendProto$motion_question> iterable) {
            copyOnWrite();
            ((RecommendProto$question_naire) this.instance).addAllAns(iterable);
            return this;
        }

        public Builder addAns(RecommendProto$motion_question recommendProto$motion_question) {
            copyOnWrite();
            ((RecommendProto$question_naire) this.instance).addAns(recommendProto$motion_question);
            return this;
        }

        public Builder clearAns() {
            copyOnWrite();
            ((RecommendProto$question_naire) this.instance).clearAns();
            return this;
        }

        public Builder clearAnswerTimestamp() {
            copyOnWrite();
            ((RecommendProto$question_naire) this.instance).clearAnswerTimestamp();
            return this;
        }

        public Builder clearSource() {
            copyOnWrite();
            ((RecommendProto$question_naire) this.instance).clearSource();
            return this;
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$question_naireOrBuilder
        public RecommendProto$motion_question getAns(int i) {
            return ((RecommendProto$question_naire) this.instance).getAns(i);
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$question_naireOrBuilder
        public int getAnsCount() {
            return ((RecommendProto$question_naire) this.instance).getAnsCount();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$question_naireOrBuilder
        public List<RecommendProto$motion_question> getAnsList() {
            return Collections.unmodifiableList(((RecommendProto$question_naire) this.instance).getAnsList());
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$question_naireOrBuilder
        public int getAnswerTimestamp() {
            return ((RecommendProto$question_naire) this.instance).getAnswerTimestamp();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$question_naireOrBuilder
        public RecommendProto$MODIFY_SOURCE getSource() {
            return ((RecommendProto$question_naire) this.instance).getSource();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$question_naireOrBuilder
        public int getSourceValue() {
            return ((RecommendProto$question_naire) this.instance).getSourceValue();
        }

        public Builder removeAns(int i) {
            copyOnWrite();
            ((RecommendProto$question_naire) this.instance).removeAns(i);
            return this;
        }

        public Builder setAns(int i, RecommendProto$motion_question recommendProto$motion_question) {
            copyOnWrite();
            ((RecommendProto$question_naire) this.instance).setAns(i, recommendProto$motion_question);
            return this;
        }

        public Builder setAnswerTimestamp(int i) {
            copyOnWrite();
            ((RecommendProto$question_naire) this.instance).setAnswerTimestamp(i);
            return this;
        }

        public Builder setSource(RecommendProto$MODIFY_SOURCE recommendProto$MODIFY_SOURCE) {
            copyOnWrite();
            ((RecommendProto$question_naire) this.instance).setSource(recommendProto$MODIFY_SOURCE);
            return this;
        }

        public Builder setSourceValue(int i) {
            copyOnWrite();
            ((RecommendProto$question_naire) this.instance).setSourceValue(i);
            return this;
        }

        private Builder() {
            super(RecommendProto$question_naire.DEFAULT_INSTANCE);
        }

        public Builder addAns(int i, RecommendProto$motion_question recommendProto$motion_question) {
            copyOnWrite();
            ((RecommendProto$question_naire) this.instance).addAns(i, recommendProto$motion_question);
            return this;
        }

        public Builder setAns(int i, RecommendProto$motion_question.Builder builder) {
            copyOnWrite();
            ((RecommendProto$question_naire) this.instance).setAns(i, builder.build());
            return this;
        }

        public Builder addAns(RecommendProto$motion_question.Builder builder) {
            copyOnWrite();
            ((RecommendProto$question_naire) this.instance).addAns(builder.build());
            return this;
        }

        public Builder addAns(int i, RecommendProto$motion_question.Builder builder) {
            copyOnWrite();
            ((RecommendProto$question_naire) this.instance).addAns(i, builder.build());
            return this;
        }
    }

    static {
        RecommendProto$question_naire recommendProto$question_naire = new RecommendProto$question_naire();
        DEFAULT_INSTANCE = recommendProto$question_naire;
        GeneratedMessageLite.registerDefaultInstance(RecommendProto$question_naire.class, recommendProto$question_naire);
    }

    private RecommendProto$question_naire() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAns(Iterable<? extends RecommendProto$motion_question> iterable) {
        ensureAnsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.ans_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAns(RecommendProto$motion_question recommendProto$motion_question) {
        recommendProto$motion_question.getClass();
        ensureAnsIsMutable();
        this.ans_.add(recommendProto$motion_question);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAns() {
        this.ans_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnswerTimestamp() {
        this.answerTimestamp_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSource() {
        this.source_ = 0;
    }

    private void ensureAnsIsMutable() {
        Internal.ProtobufList<RecommendProto$motion_question> protobufList = this.ans_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.ans_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static RecommendProto$question_naire getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RecommendProto$question_naire parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$question_naire) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$question_naire parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RecommendProto$question_naire) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RecommendProto$question_naire> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAns(int i) {
        ensureAnsIsMutable();
        this.ans_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAns(int i, RecommendProto$motion_question recommendProto$motion_question) {
        recommendProto$motion_question.getClass();
        ensureAnsIsMutable();
        this.ans_.set(i, recommendProto$motion_question);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnswerTimestamp(int i) {
        this.answerTimestamp_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(RecommendProto$MODIFY_SOURCE recommendProto$MODIFY_SOURCE) {
        this.source_ = recommendProto$MODIFY_SOURCE.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceValue(int i) {
        this.source_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = pef.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new RecommendProto$question_naire();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u000b\u0002\f\u0003\u001b", new Object[]{"answerTimestamp_", "source_", "ans_", RecommendProto$motion_question.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RecommendProto$question_naire> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (RecommendProto$question_naire.class) {
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

    @Override // com.heytap.sportwatch.proto.RecommendProto$question_naireOrBuilder
    public RecommendProto$motion_question getAns(int i) {
        return this.ans_.get(i);
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$question_naireOrBuilder
    public int getAnsCount() {
        return this.ans_.size();
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$question_naireOrBuilder
    public List<RecommendProto$motion_question> getAnsList() {
        return this.ans_;
    }

    public RecommendProto$motion_questionOrBuilder getAnsOrBuilder(int i) {
        return this.ans_.get(i);
    }

    public List<? extends RecommendProto$motion_questionOrBuilder> getAnsOrBuilderList() {
        return this.ans_;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$question_naireOrBuilder
    public int getAnswerTimestamp() {
        return this.answerTimestamp_;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$question_naireOrBuilder
    public RecommendProto$MODIFY_SOURCE getSource() {
        RecommendProto$MODIFY_SOURCE recommendProto$MODIFY_SOURCEForNumber = RecommendProto$MODIFY_SOURCE.forNumber(this.source_);
        return recommendProto$MODIFY_SOURCEForNumber == null ? RecommendProto$MODIFY_SOURCE.UNRECOGNIZED : recommendProto$MODIFY_SOURCEForNumber;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$question_naireOrBuilder
    public int getSourceValue() {
        return this.source_;
    }

    public static Builder newBuilder(RecommendProto$question_naire recommendProto$question_naire) {
        return DEFAULT_INSTANCE.createBuilder(recommendProto$question_naire);
    }

    public static RecommendProto$question_naire parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$question_naire) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$question_naire parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$question_naire) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RecommendProto$question_naire parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RecommendProto$question_naire) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAns(int i, RecommendProto$motion_question recommendProto$motion_question) {
        recommendProto$motion_question.getClass();
        ensureAnsIsMutable();
        this.ans_.add(i, recommendProto$motion_question);
    }

    public static RecommendProto$question_naire parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$question_naire) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RecommendProto$question_naire parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RecommendProto$question_naire) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RecommendProto$question_naire parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$question_naire) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RecommendProto$question_naire parseFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$question_naire) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$question_naire parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$question_naire) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$question_naire parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RecommendProto$question_naire) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RecommendProto$question_naire parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$question_naire) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
