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
public final class Insight$SnoreAnalysis extends GeneratedMessageLite<Insight$SnoreAnalysis, Builder> implements Insight$SnoreAnalysisOrBuilder {
    private static final Insight$SnoreAnalysis DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 3;
    private static volatile Parser<Insight$SnoreAnalysis> PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    public static final int TOTALOSARESULT_FIELD_NUMBER = 2;
    private Internal.ProtobufList<Insight$SnoreResult> details_ = GeneratedMessageLite.emptyProtobufList();
    private int timestamp_;
    private int totalOsaResult_;

    public static final class Builder extends GeneratedMessageLite.Builder<Insight$SnoreAnalysis, Builder> implements Insight$SnoreAnalysisOrBuilder {
        public Builder addAllDetails(Iterable<? extends Insight$SnoreResult> iterable) {
            copyOnWrite();
            ((Insight$SnoreAnalysis) this.instance).addAllDetails(iterable);
            return this;
        }

        public Builder addDetails(Insight$SnoreResult insight$SnoreResult) {
            copyOnWrite();
            ((Insight$SnoreAnalysis) this.instance).addDetails(insight$SnoreResult);
            return this;
        }

        public Builder clearDetails() {
            copyOnWrite();
            ((Insight$SnoreAnalysis) this.instance).clearDetails();
            return this;
        }

        public Builder clearTimestamp() {
            copyOnWrite();
            ((Insight$SnoreAnalysis) this.instance).clearTimestamp();
            return this;
        }

        public Builder clearTotalOsaResult() {
            copyOnWrite();
            ((Insight$SnoreAnalysis) this.instance).clearTotalOsaResult();
            return this;
        }

        @Override // com.heytap.health.protocol.insight.Insight$SnoreAnalysisOrBuilder
        public Insight$SnoreResult getDetails(int i) {
            return ((Insight$SnoreAnalysis) this.instance).getDetails(i);
        }

        @Override // com.heytap.health.protocol.insight.Insight$SnoreAnalysisOrBuilder
        public int getDetailsCount() {
            return ((Insight$SnoreAnalysis) this.instance).getDetailsCount();
        }

        @Override // com.heytap.health.protocol.insight.Insight$SnoreAnalysisOrBuilder
        public List<Insight$SnoreResult> getDetailsList() {
            return Collections.unmodifiableList(((Insight$SnoreAnalysis) this.instance).getDetailsList());
        }

        @Override // com.heytap.health.protocol.insight.Insight$SnoreAnalysisOrBuilder
        public int getTimestamp() {
            return ((Insight$SnoreAnalysis) this.instance).getTimestamp();
        }

        @Override // com.heytap.health.protocol.insight.Insight$SnoreAnalysisOrBuilder
        public int getTotalOsaResult() {
            return ((Insight$SnoreAnalysis) this.instance).getTotalOsaResult();
        }

        public Builder removeDetails(int i) {
            copyOnWrite();
            ((Insight$SnoreAnalysis) this.instance).removeDetails(i);
            return this;
        }

        public Builder setDetails(int i, Insight$SnoreResult insight$SnoreResult) {
            copyOnWrite();
            ((Insight$SnoreAnalysis) this.instance).setDetails(i, insight$SnoreResult);
            return this;
        }

        public Builder setTimestamp(int i) {
            copyOnWrite();
            ((Insight$SnoreAnalysis) this.instance).setTimestamp(i);
            return this;
        }

        public Builder setTotalOsaResult(int i) {
            copyOnWrite();
            ((Insight$SnoreAnalysis) this.instance).setTotalOsaResult(i);
            return this;
        }

        private Builder() {
            super(Insight$SnoreAnalysis.DEFAULT_INSTANCE);
        }

        public Builder addDetails(int i, Insight$SnoreResult insight$SnoreResult) {
            copyOnWrite();
            ((Insight$SnoreAnalysis) this.instance).addDetails(i, insight$SnoreResult);
            return this;
        }

        public Builder setDetails(int i, Insight$SnoreResult.Builder builder) {
            copyOnWrite();
            ((Insight$SnoreAnalysis) this.instance).setDetails(i, builder.build());
            return this;
        }

        public Builder addDetails(Insight$SnoreResult.Builder builder) {
            copyOnWrite();
            ((Insight$SnoreAnalysis) this.instance).addDetails(builder.build());
            return this;
        }

        public Builder addDetails(int i, Insight$SnoreResult.Builder builder) {
            copyOnWrite();
            ((Insight$SnoreAnalysis) this.instance).addDetails(i, builder.build());
            return this;
        }
    }

    static {
        Insight$SnoreAnalysis insight$SnoreAnalysis = new Insight$SnoreAnalysis();
        DEFAULT_INSTANCE = insight$SnoreAnalysis;
        GeneratedMessageLite.registerDefaultInstance(Insight$SnoreAnalysis.class, insight$SnoreAnalysis);
    }

    private Insight$SnoreAnalysis() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDetails(Iterable<? extends Insight$SnoreResult> iterable) {
        ensureDetailsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.details_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDetails(Insight$SnoreResult insight$SnoreResult) {
        insight$SnoreResult.getClass();
        ensureDetailsIsMutable();
        this.details_.add(insight$SnoreResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetails() {
        this.details_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalOsaResult() {
        this.totalOsaResult_ = 0;
    }

    private void ensureDetailsIsMutable() {
        Internal.ProtobufList<Insight$SnoreResult> protobufList = this.details_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.details_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Insight$SnoreAnalysis getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Insight$SnoreAnalysis parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Insight$SnoreAnalysis) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Insight$SnoreAnalysis parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Insight$SnoreAnalysis) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Insight$SnoreAnalysis> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDetails(int i) {
        ensureDetailsIsMutable();
        this.details_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetails(int i, Insight$SnoreResult insight$SnoreResult) {
        insight$SnoreResult.getClass();
        ensureDetailsIsMutable();
        this.details_.set(i, insight$SnoreResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(int i) {
        this.timestamp_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalOsaResult(int i) {
        this.totalOsaResult_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = r9a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new Insight$SnoreAnalysis();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u000b\u0002\u000b\u0003\u001b", new Object[]{"timestamp_", "totalOsaResult_", "details_", Insight$SnoreResult.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Insight$SnoreAnalysis> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Insight$SnoreAnalysis.class) {
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

    @Override // com.heytap.health.protocol.insight.Insight$SnoreAnalysisOrBuilder
    public Insight$SnoreResult getDetails(int i) {
        return this.details_.get(i);
    }

    @Override // com.heytap.health.protocol.insight.Insight$SnoreAnalysisOrBuilder
    public int getDetailsCount() {
        return this.details_.size();
    }

    @Override // com.heytap.health.protocol.insight.Insight$SnoreAnalysisOrBuilder
    public List<Insight$SnoreResult> getDetailsList() {
        return this.details_;
    }

    public Insight$SnoreResultOrBuilder getDetailsOrBuilder(int i) {
        return this.details_.get(i);
    }

    public List<? extends Insight$SnoreResultOrBuilder> getDetailsOrBuilderList() {
        return this.details_;
    }

    @Override // com.heytap.health.protocol.insight.Insight$SnoreAnalysisOrBuilder
    public int getTimestamp() {
        return this.timestamp_;
    }

    @Override // com.heytap.health.protocol.insight.Insight$SnoreAnalysisOrBuilder
    public int getTotalOsaResult() {
        return this.totalOsaResult_;
    }

    public static Builder newBuilder(Insight$SnoreAnalysis insight$SnoreAnalysis) {
        return DEFAULT_INSTANCE.createBuilder(insight$SnoreAnalysis);
    }

    public static Insight$SnoreAnalysis parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Insight$SnoreAnalysis) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Insight$SnoreAnalysis parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Insight$SnoreAnalysis) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Insight$SnoreAnalysis parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Insight$SnoreAnalysis) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDetails(int i, Insight$SnoreResult insight$SnoreResult) {
        insight$SnoreResult.getClass();
        ensureDetailsIsMutable();
        this.details_.add(i, insight$SnoreResult);
    }

    public static Insight$SnoreAnalysis parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Insight$SnoreAnalysis) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Insight$SnoreAnalysis parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Insight$SnoreAnalysis) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Insight$SnoreAnalysis parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Insight$SnoreAnalysis) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Insight$SnoreAnalysis parseFrom(InputStream inputStream) throws IOException {
        return (Insight$SnoreAnalysis) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Insight$SnoreAnalysis parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Insight$SnoreAnalysis) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Insight$SnoreAnalysis parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Insight$SnoreAnalysis) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Insight$SnoreAnalysis parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Insight$SnoreAnalysis) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
