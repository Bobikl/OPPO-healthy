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
public final class Insight$MultipleSignsAnalysis extends GeneratedMessageLite<Insight$MultipleSignsAnalysis, Builder> implements Insight$MultipleSignsAnalysisOrBuilder {
    private static final Insight$MultipleSignsAnalysis DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 4;
    private static volatile Parser<Insight$MultipleSignsAnalysis> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 3;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 2;
    private Internal.ProtobufList<Insight$SignsData> details_ = GeneratedMessageLite.emptyProtobufList();
    private int status_;
    private int timestamp_;
    private int type_;

    public static final class Builder extends GeneratedMessageLite.Builder<Insight$MultipleSignsAnalysis, Builder> implements Insight$MultipleSignsAnalysisOrBuilder {
        public Builder addAllDetails(Iterable<? extends Insight$SignsData> iterable) {
            copyOnWrite();
            ((Insight$MultipleSignsAnalysis) this.instance).addAllDetails(iterable);
            return this;
        }

        public Builder addDetails(Insight$SignsData insight$SignsData) {
            copyOnWrite();
            ((Insight$MultipleSignsAnalysis) this.instance).addDetails(insight$SignsData);
            return this;
        }

        public Builder clearDetails() {
            copyOnWrite();
            ((Insight$MultipleSignsAnalysis) this.instance).clearDetails();
            return this;
        }

        public Builder clearStatus() {
            copyOnWrite();
            ((Insight$MultipleSignsAnalysis) this.instance).clearStatus();
            return this;
        }

        public Builder clearTimestamp() {
            copyOnWrite();
            ((Insight$MultipleSignsAnalysis) this.instance).clearTimestamp();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((Insight$MultipleSignsAnalysis) this.instance).clearType();
            return this;
        }

        @Override // com.heytap.health.protocol.insight.Insight$MultipleSignsAnalysisOrBuilder
        public Insight$SignsData getDetails(int i) {
            return ((Insight$MultipleSignsAnalysis) this.instance).getDetails(i);
        }

        @Override // com.heytap.health.protocol.insight.Insight$MultipleSignsAnalysisOrBuilder
        public int getDetailsCount() {
            return ((Insight$MultipleSignsAnalysis) this.instance).getDetailsCount();
        }

        @Override // com.heytap.health.protocol.insight.Insight$MultipleSignsAnalysisOrBuilder
        public List<Insight$SignsData> getDetailsList() {
            return Collections.unmodifiableList(((Insight$MultipleSignsAnalysis) this.instance).getDetailsList());
        }

        @Override // com.heytap.health.protocol.insight.Insight$MultipleSignsAnalysisOrBuilder
        public int getStatus() {
            return ((Insight$MultipleSignsAnalysis) this.instance).getStatus();
        }

        @Override // com.heytap.health.protocol.insight.Insight$MultipleSignsAnalysisOrBuilder
        public int getTimestamp() {
            return ((Insight$MultipleSignsAnalysis) this.instance).getTimestamp();
        }

        @Override // com.heytap.health.protocol.insight.Insight$MultipleSignsAnalysisOrBuilder
        public int getType() {
            return ((Insight$MultipleSignsAnalysis) this.instance).getType();
        }

        public Builder removeDetails(int i) {
            copyOnWrite();
            ((Insight$MultipleSignsAnalysis) this.instance).removeDetails(i);
            return this;
        }

        public Builder setDetails(int i, Insight$SignsData insight$SignsData) {
            copyOnWrite();
            ((Insight$MultipleSignsAnalysis) this.instance).setDetails(i, insight$SignsData);
            return this;
        }

        public Builder setStatus(int i) {
            copyOnWrite();
            ((Insight$MultipleSignsAnalysis) this.instance).setStatus(i);
            return this;
        }

        public Builder setTimestamp(int i) {
            copyOnWrite();
            ((Insight$MultipleSignsAnalysis) this.instance).setTimestamp(i);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((Insight$MultipleSignsAnalysis) this.instance).setType(i);
            return this;
        }

        private Builder() {
            super(Insight$MultipleSignsAnalysis.DEFAULT_INSTANCE);
        }

        public Builder addDetails(int i, Insight$SignsData insight$SignsData) {
            copyOnWrite();
            ((Insight$MultipleSignsAnalysis) this.instance).addDetails(i, insight$SignsData);
            return this;
        }

        public Builder setDetails(int i, Insight$SignsData.Builder builder) {
            copyOnWrite();
            ((Insight$MultipleSignsAnalysis) this.instance).setDetails(i, builder.build());
            return this;
        }

        public Builder addDetails(Insight$SignsData.Builder builder) {
            copyOnWrite();
            ((Insight$MultipleSignsAnalysis) this.instance).addDetails(builder.build());
            return this;
        }

        public Builder addDetails(int i, Insight$SignsData.Builder builder) {
            copyOnWrite();
            ((Insight$MultipleSignsAnalysis) this.instance).addDetails(i, builder.build());
            return this;
        }
    }

    static {
        Insight$MultipleSignsAnalysis insight$MultipleSignsAnalysis = new Insight$MultipleSignsAnalysis();
        DEFAULT_INSTANCE = insight$MultipleSignsAnalysis;
        GeneratedMessageLite.registerDefaultInstance(Insight$MultipleSignsAnalysis.class, insight$MultipleSignsAnalysis);
    }

    private Insight$MultipleSignsAnalysis() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDetails(Iterable<? extends Insight$SignsData> iterable) {
        ensureDetailsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.details_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDetails(Insight$SignsData insight$SignsData) {
        insight$SignsData.getClass();
        ensureDetailsIsMutable();
        this.details_.add(insight$SignsData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetails() {
        this.details_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    private void ensureDetailsIsMutable() {
        Internal.ProtobufList<Insight$SignsData> protobufList = this.details_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.details_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Insight$MultipleSignsAnalysis getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Insight$MultipleSignsAnalysis parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Insight$MultipleSignsAnalysis) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Insight$MultipleSignsAnalysis parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Insight$MultipleSignsAnalysis) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Insight$MultipleSignsAnalysis> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDetails(int i) {
        ensureDetailsIsMutable();
        this.details_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetails(int i, Insight$SignsData insight$SignsData) {
        insight$SignsData.getClass();
        ensureDetailsIsMutable();
        this.details_.set(i, insight$SignsData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(int i) {
        this.status_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(int i) {
        this.timestamp_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = r9a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new Insight$MultipleSignsAnalysis();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u001b", new Object[]{"timestamp_", "type_", "status_", "details_", Insight$SignsData.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Insight$MultipleSignsAnalysis> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Insight$MultipleSignsAnalysis.class) {
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

    @Override // com.heytap.health.protocol.insight.Insight$MultipleSignsAnalysisOrBuilder
    public Insight$SignsData getDetails(int i) {
        return this.details_.get(i);
    }

    @Override // com.heytap.health.protocol.insight.Insight$MultipleSignsAnalysisOrBuilder
    public int getDetailsCount() {
        return this.details_.size();
    }

    @Override // com.heytap.health.protocol.insight.Insight$MultipleSignsAnalysisOrBuilder
    public List<Insight$SignsData> getDetailsList() {
        return this.details_;
    }

    public Insight$SignsDataOrBuilder getDetailsOrBuilder(int i) {
        return this.details_.get(i);
    }

    public List<? extends Insight$SignsDataOrBuilder> getDetailsOrBuilderList() {
        return this.details_;
    }

    @Override // com.heytap.health.protocol.insight.Insight$MultipleSignsAnalysisOrBuilder
    public int getStatus() {
        return this.status_;
    }

    @Override // com.heytap.health.protocol.insight.Insight$MultipleSignsAnalysisOrBuilder
    public int getTimestamp() {
        return this.timestamp_;
    }

    @Override // com.heytap.health.protocol.insight.Insight$MultipleSignsAnalysisOrBuilder
    public int getType() {
        return this.type_;
    }

    public static Builder newBuilder(Insight$MultipleSignsAnalysis insight$MultipleSignsAnalysis) {
        return DEFAULT_INSTANCE.createBuilder(insight$MultipleSignsAnalysis);
    }

    public static Insight$MultipleSignsAnalysis parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Insight$MultipleSignsAnalysis) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Insight$MultipleSignsAnalysis parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Insight$MultipleSignsAnalysis) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Insight$MultipleSignsAnalysis parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Insight$MultipleSignsAnalysis) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDetails(int i, Insight$SignsData insight$SignsData) {
        insight$SignsData.getClass();
        ensureDetailsIsMutable();
        this.details_.add(i, insight$SignsData);
    }

    public static Insight$MultipleSignsAnalysis parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Insight$MultipleSignsAnalysis) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Insight$MultipleSignsAnalysis parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Insight$MultipleSignsAnalysis) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Insight$MultipleSignsAnalysis parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Insight$MultipleSignsAnalysis) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Insight$MultipleSignsAnalysis parseFrom(InputStream inputStream) throws IOException {
        return (Insight$MultipleSignsAnalysis) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Insight$MultipleSignsAnalysis parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Insight$MultipleSignsAnalysis) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Insight$MultipleSignsAnalysis parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Insight$MultipleSignsAnalysis) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Insight$MultipleSignsAnalysis parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Insight$MultipleSignsAnalysis) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
