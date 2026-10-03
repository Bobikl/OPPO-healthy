package com.oplus.ocs.wearengine.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.vu4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class DataProto$ExerciseLapSummary extends GeneratedMessageLite<DataProto$ExerciseLapSummary, Builder> implements DataProto$ExerciseLapSummaryOrBuilder {
    private static final DataProto$ExerciseLapSummary DEFAULT_INSTANCE;
    public static final int LAP_METRICS_FIELD_NUMBER = 1;
    private static volatile Parser<DataProto$ExerciseLapSummary> PARSER;
    private Internal.ProtobufList<DataProto$StatsDataPoint> lapMetrics_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<DataProto$ExerciseLapSummary, Builder> implements DataProto$ExerciseLapSummaryOrBuilder {
        public Builder addAllLapMetrics(Iterable<? extends DataProto$StatsDataPoint> iterable) {
            copyOnWrite();
            ((DataProto$ExerciseLapSummary) this.instance).addAllLapMetrics(iterable);
            return this;
        }

        public Builder addLapMetrics(DataProto$StatsDataPoint dataProto$StatsDataPoint) {
            copyOnWrite();
            ((DataProto$ExerciseLapSummary) this.instance).addLapMetrics(dataProto$StatsDataPoint);
            return this;
        }

        public Builder clearLapMetrics() {
            copyOnWrite();
            ((DataProto$ExerciseLapSummary) this.instance).clearLapMetrics();
            return this;
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseLapSummaryOrBuilder
        public DataProto$StatsDataPoint getLapMetrics(int i) {
            return ((DataProto$ExerciseLapSummary) this.instance).getLapMetrics(i);
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseLapSummaryOrBuilder
        public int getLapMetricsCount() {
            return ((DataProto$ExerciseLapSummary) this.instance).getLapMetricsCount();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseLapSummaryOrBuilder
        public List<DataProto$StatsDataPoint> getLapMetricsList() {
            return Collections.unmodifiableList(((DataProto$ExerciseLapSummary) this.instance).getLapMetricsList());
        }

        public Builder removeLapMetrics(int i) {
            copyOnWrite();
            ((DataProto$ExerciseLapSummary) this.instance).removeLapMetrics(i);
            return this;
        }

        public Builder setLapMetrics(int i, DataProto$StatsDataPoint dataProto$StatsDataPoint) {
            copyOnWrite();
            ((DataProto$ExerciseLapSummary) this.instance).setLapMetrics(i, dataProto$StatsDataPoint);
            return this;
        }

        private Builder() {
            super(DataProto$ExerciseLapSummary.DEFAULT_INSTANCE);
        }

        public Builder addLapMetrics(int i, DataProto$StatsDataPoint dataProto$StatsDataPoint) {
            copyOnWrite();
            ((DataProto$ExerciseLapSummary) this.instance).addLapMetrics(i, dataProto$StatsDataPoint);
            return this;
        }

        public Builder setLapMetrics(int i, DataProto$StatsDataPoint.Builder builder) {
            copyOnWrite();
            ((DataProto$ExerciseLapSummary) this.instance).setLapMetrics(i, builder.build());
            return this;
        }

        public Builder addLapMetrics(DataProto$StatsDataPoint.Builder builder) {
            copyOnWrite();
            ((DataProto$ExerciseLapSummary) this.instance).addLapMetrics(builder.build());
            return this;
        }

        public Builder addLapMetrics(int i, DataProto$StatsDataPoint.Builder builder) {
            copyOnWrite();
            ((DataProto$ExerciseLapSummary) this.instance).addLapMetrics(i, builder.build());
            return this;
        }
    }

    static {
        DataProto$ExerciseLapSummary dataProto$ExerciseLapSummary = new DataProto$ExerciseLapSummary();
        DEFAULT_INSTANCE = dataProto$ExerciseLapSummary;
        GeneratedMessageLite.registerDefaultInstance(DataProto$ExerciseLapSummary.class, dataProto$ExerciseLapSummary);
    }

    private DataProto$ExerciseLapSummary() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLapMetrics(Iterable<? extends DataProto$StatsDataPoint> iterable) {
        ensureLapMetricsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.lapMetrics_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLapMetrics(DataProto$StatsDataPoint dataProto$StatsDataPoint) {
        dataProto$StatsDataPoint.getClass();
        ensureLapMetricsIsMutable();
        this.lapMetrics_.add(dataProto$StatsDataPoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLapMetrics() {
        this.lapMetrics_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureLapMetricsIsMutable() {
        Internal.ProtobufList<DataProto$StatsDataPoint> protobufList = this.lapMetrics_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.lapMetrics_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static DataProto$ExerciseLapSummary getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DataProto$ExerciseLapSummary parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DataProto$ExerciseLapSummary) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DataProto$ExerciseLapSummary parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DataProto$ExerciseLapSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DataProto$ExerciseLapSummary> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLapMetrics(int i) {
        ensureLapMetricsIsMutable();
        this.lapMetrics_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLapMetrics(int i, DataProto$StatsDataPoint dataProto$StatsDataPoint) {
        dataProto$StatsDataPoint.getClass();
        ensureLapMetricsIsMutable();
        this.lapMetrics_.set(i, dataProto$StatsDataPoint);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = vu4.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DataProto$ExerciseLapSummary();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"lapMetrics_", DataProto$StatsDataPoint.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DataProto$ExerciseLapSummary> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DataProto$ExerciseLapSummary.class) {
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

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseLapSummaryOrBuilder
    public DataProto$StatsDataPoint getLapMetrics(int i) {
        return this.lapMetrics_.get(i);
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseLapSummaryOrBuilder
    public int getLapMetricsCount() {
        return this.lapMetrics_.size();
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseLapSummaryOrBuilder
    public List<DataProto$StatsDataPoint> getLapMetricsList() {
        return this.lapMetrics_;
    }

    public DataProto$StatsDataPointOrBuilder getLapMetricsOrBuilder(int i) {
        return this.lapMetrics_.get(i);
    }

    public List<? extends DataProto$StatsDataPointOrBuilder> getLapMetricsOrBuilderList() {
        return this.lapMetrics_;
    }

    public static Builder newBuilder(DataProto$ExerciseLapSummary dataProto$ExerciseLapSummary) {
        return DEFAULT_INSTANCE.createBuilder(dataProto$ExerciseLapSummary);
    }

    public static DataProto$ExerciseLapSummary parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DataProto$ExerciseLapSummary) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DataProto$ExerciseLapSummary parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DataProto$ExerciseLapSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DataProto$ExerciseLapSummary parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DataProto$ExerciseLapSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLapMetrics(int i, DataProto$StatsDataPoint dataProto$StatsDataPoint) {
        dataProto$StatsDataPoint.getClass();
        ensureLapMetricsIsMutable();
        this.lapMetrics_.add(i, dataProto$StatsDataPoint);
    }

    public static DataProto$ExerciseLapSummary parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DataProto$ExerciseLapSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DataProto$ExerciseLapSummary parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DataProto$ExerciseLapSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DataProto$ExerciseLapSummary parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DataProto$ExerciseLapSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DataProto$ExerciseLapSummary parseFrom(InputStream inputStream) throws IOException {
        return (DataProto$ExerciseLapSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DataProto$ExerciseLapSummary parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DataProto$ExerciseLapSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DataProto$ExerciseLapSummary parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DataProto$ExerciseLapSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DataProto$ExerciseLapSummary parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DataProto$ExerciseLapSummary) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
