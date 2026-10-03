package com.heytap.health.protocol.insight;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.r9a;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class Insight$ScoreAnalysis extends GeneratedMessageLite<Insight$ScoreAnalysis, Builder> implements Insight$ScoreAnalysisOrBuilder {
    public static final int CURAVGSCORE_FIELD_NUMBER = 3;
    private static final Insight$ScoreAnalysis DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 4;
    public static final int LASTAVGSCORE_FIELD_NUMBER = 2;
    private static volatile Parser<Insight$ScoreAnalysis> PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private int curAvgScore_;
    private Internal.ProtobufList<Insight$ScoreResult> details_ = GeneratedMessageLite.emptyProtobufList();
    private int lastAvgScore_;
    private int timestamp_;

    public static final class Builder extends GeneratedMessageLite.Builder<Insight$ScoreAnalysis, Builder> implements Insight$ScoreAnalysisOrBuilder {
        public Builder addAllDetails(Iterable<? extends Insight$ScoreResult> iterable) {
            copyOnWrite();
            ((Insight$ScoreAnalysis) this.instance).addAllDetails(iterable);
            return this;
        }

        public Builder addDetails(Insight$ScoreResult insight$ScoreResult) {
            copyOnWrite();
            ((Insight$ScoreAnalysis) this.instance).addDetails(insight$ScoreResult);
            return this;
        }

        public Builder clearCurAvgScore() {
            copyOnWrite();
            ((Insight$ScoreAnalysis) this.instance).clearCurAvgScore();
            return this;
        }

        public Builder clearDetails() {
            copyOnWrite();
            ((Insight$ScoreAnalysis) this.instance).clearDetails();
            return this;
        }

        public Builder clearLastAvgScore() {
            copyOnWrite();
            ((Insight$ScoreAnalysis) this.instance).clearLastAvgScore();
            return this;
        }

        public Builder clearTimestamp() {
            copyOnWrite();
            ((Insight$ScoreAnalysis) this.instance).clearTimestamp();
            return this;
        }

        @Override // com.heytap.health.protocol.insight.Insight$ScoreAnalysisOrBuilder
        public int getCurAvgScore() {
            return ((Insight$ScoreAnalysis) this.instance).getCurAvgScore();
        }

        @Override // com.heytap.health.protocol.insight.Insight$ScoreAnalysisOrBuilder
        public Insight$ScoreResult getDetails(int i) {
            return ((Insight$ScoreAnalysis) this.instance).getDetails(i);
        }

        @Override // com.heytap.health.protocol.insight.Insight$ScoreAnalysisOrBuilder
        public int getDetailsCount() {
            return ((Insight$ScoreAnalysis) this.instance).getDetailsCount();
        }

        @Override // com.heytap.health.protocol.insight.Insight$ScoreAnalysisOrBuilder
        public List<Insight$ScoreResult> getDetailsList() {
            return Collections.unmodifiableList(((Insight$ScoreAnalysis) this.instance).getDetailsList());
        }

        @Override // com.heytap.health.protocol.insight.Insight$ScoreAnalysisOrBuilder
        public int getLastAvgScore() {
            return ((Insight$ScoreAnalysis) this.instance).getLastAvgScore();
        }

        @Override // com.heytap.health.protocol.insight.Insight$ScoreAnalysisOrBuilder
        public int getTimestamp() {
            return ((Insight$ScoreAnalysis) this.instance).getTimestamp();
        }

        public Builder removeDetails(int i) {
            copyOnWrite();
            ((Insight$ScoreAnalysis) this.instance).removeDetails(i);
            return this;
        }

        public Builder setCurAvgScore(int i) {
            copyOnWrite();
            ((Insight$ScoreAnalysis) this.instance).setCurAvgScore(i);
            return this;
        }

        public Builder setDetails(int i, Insight$ScoreResult insight$ScoreResult) {
            copyOnWrite();
            ((Insight$ScoreAnalysis) this.instance).setDetails(i, insight$ScoreResult);
            return this;
        }

        public Builder setLastAvgScore(int i) {
            copyOnWrite();
            ((Insight$ScoreAnalysis) this.instance).setLastAvgScore(i);
            return this;
        }

        public Builder setTimestamp(int i) {
            copyOnWrite();
            ((Insight$ScoreAnalysis) this.instance).setTimestamp(i);
            return this;
        }

        private Builder() {
            super(Insight$ScoreAnalysis.DEFAULT_INSTANCE);
        }

        public Builder addDetails(int i, Insight$ScoreResult insight$ScoreResult) {
            copyOnWrite();
            ((Insight$ScoreAnalysis) this.instance).addDetails(i, insight$ScoreResult);
            return this;
        }

        public Builder setDetails(int i, Insight$ScoreResult.Builder builder) {
            copyOnWrite();
            ((Insight$ScoreAnalysis) this.instance).setDetails(i, builder.build());
            return this;
        }

        public Builder addDetails(Insight$ScoreResult.Builder builder) {
            copyOnWrite();
            ((Insight$ScoreAnalysis) this.instance).addDetails(builder.build());
            return this;
        }

        public Builder addDetails(int i, Insight$ScoreResult.Builder builder) {
            copyOnWrite();
            ((Insight$ScoreAnalysis) this.instance).addDetails(i, builder.build());
            return this;
        }
    }

    static {
        Insight$ScoreAnalysis insight$ScoreAnalysis = new Insight$ScoreAnalysis();
        DEFAULT_INSTANCE = insight$ScoreAnalysis;
        GeneratedMessageLite.registerDefaultInstance(Insight$ScoreAnalysis.class, insight$ScoreAnalysis);
    }

    private Insight$ScoreAnalysis() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDetails(Iterable<? extends Insight$ScoreResult> iterable) {
        ensureDetailsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.details_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDetails(Insight$ScoreResult insight$ScoreResult) {
        insight$ScoreResult.getClass();
        ensureDetailsIsMutable();
        this.details_.add(insight$ScoreResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurAvgScore() {
        this.curAvgScore_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetails() {
        this.details_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastAvgScore() {
        this.lastAvgScore_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0;
    }

    private void ensureDetailsIsMutable() {
        Internal.ProtobufList<Insight$ScoreResult> protobufList = this.details_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.details_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Insight$ScoreAnalysis getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Insight$ScoreAnalysis parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Insight$ScoreAnalysis) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Insight$ScoreAnalysis parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Insight$ScoreAnalysis) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Insight$ScoreAnalysis> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDetails(int i) {
        ensureDetailsIsMutable();
        this.details_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurAvgScore(int i) {
        this.curAvgScore_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetails(int i, Insight$ScoreResult insight$ScoreResult) {
        insight$ScoreResult.getClass();
        ensureDetailsIsMutable();
        this.details_.set(i, insight$ScoreResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastAvgScore(int i) {
        this.lastAvgScore_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(int i) {
        this.timestamp_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = r9a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new Insight$ScoreAnalysis();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u001b", new Object[]{"timestamp_", "lastAvgScore_", "curAvgScore_", "details_", Insight$ScoreResult.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Insight$ScoreAnalysis> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Insight$ScoreAnalysis.class) {
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

    @Override // com.heytap.health.protocol.insight.Insight$ScoreAnalysisOrBuilder
    public int getCurAvgScore() {
        return this.curAvgScore_;
    }

    @Override // com.heytap.health.protocol.insight.Insight$ScoreAnalysisOrBuilder
    public Insight$ScoreResult getDetails(int i) {
        return this.details_.get(i);
    }

    @Override // com.heytap.health.protocol.insight.Insight$ScoreAnalysisOrBuilder
    public int getDetailsCount() {
        return this.details_.size();
    }

    @Override // com.heytap.health.protocol.insight.Insight$ScoreAnalysisOrBuilder
    public List<Insight$ScoreResult> getDetailsList() {
        return this.details_;
    }

    public Insight$ScoreResultOrBuilder getDetailsOrBuilder(int i) {
        return this.details_.get(i);
    }

    public List<? extends Insight$ScoreResultOrBuilder> getDetailsOrBuilderList() {
        return this.details_;
    }

    @Override // com.heytap.health.protocol.insight.Insight$ScoreAnalysisOrBuilder
    public int getLastAvgScore() {
        return this.lastAvgScore_;
    }

    @Override // com.heytap.health.protocol.insight.Insight$ScoreAnalysisOrBuilder
    public int getTimestamp() {
        return this.timestamp_;
    }

    public static Builder newBuilder(Insight$ScoreAnalysis insight$ScoreAnalysis) {
        return DEFAULT_INSTANCE.createBuilder(insight$ScoreAnalysis);
    }

    public static Insight$ScoreAnalysis parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Insight$ScoreAnalysis) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Insight$ScoreAnalysis parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Insight$ScoreAnalysis) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Insight$ScoreAnalysis parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Insight$ScoreAnalysis) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDetails(int i, Insight$ScoreResult insight$ScoreResult) {
        insight$ScoreResult.getClass();
        ensureDetailsIsMutable();
        this.details_.add(i, insight$ScoreResult);
    }

    public static Insight$ScoreAnalysis parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Insight$ScoreAnalysis) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Insight$ScoreAnalysis parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Insight$ScoreAnalysis) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Insight$ScoreAnalysis parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Insight$ScoreAnalysis) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Insight$ScoreAnalysis parseFrom(InputStream inputStream) throws IOException {
        return (Insight$ScoreAnalysis) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Insight$ScoreAnalysis parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Insight$ScoreAnalysis) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Insight$ScoreAnalysis parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Insight$ScoreAnalysis) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Insight$ScoreAnalysis parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Insight$ScoreAnalysis) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
