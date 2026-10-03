package com.oplus.ocs.wearengine.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.vu4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class DataProto$ExerciseUpdate extends GeneratedMessageLite<DataProto$ExerciseUpdate, Builder> implements DataProto$ExerciseUpdateOrBuilder {
    private static final DataProto$ExerciseUpdate DEFAULT_INSTANCE;
    public static final int EXERCISE_CONFIG_FIELD_NUMBER = 4;
    public static final int EXERCISE_END_REASON_FIELD_NUMBER = 5;
    private static volatile Parser<DataProto$ExerciseUpdate> PARSER = null;
    public static final int SAMPLE_METRICS_FIELD_NUMBER = 2;
    public static final int STATE_FIELD_NUMBER = 1;
    public static final int STATS_METRICS_FIELD_NUMBER = 3;
    private int bitField0_;
    private DataProto$ExerciseConfig exerciseConfig_;
    private int exerciseEndReason_;
    private int state_;
    private Internal.ProtobufList<SampleMetricsEntry> sampleMetrics_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<DataProto$StatsDataPoint> statsMetrics_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<DataProto$ExerciseUpdate, Builder> implements DataProto$ExerciseUpdateOrBuilder {
        public Builder addAllSampleMetrics(Iterable<? extends SampleMetricsEntry> iterable) {
            copyOnWrite();
            ((DataProto$ExerciseUpdate) this.instance).addAllSampleMetrics(iterable);
            return this;
        }

        public Builder addAllStatsMetrics(Iterable<? extends DataProto$StatsDataPoint> iterable) {
            copyOnWrite();
            ((DataProto$ExerciseUpdate) this.instance).addAllStatsMetrics(iterable);
            return this;
        }

        public Builder addSampleMetrics(SampleMetricsEntry sampleMetricsEntry) {
            copyOnWrite();
            ((DataProto$ExerciseUpdate) this.instance).addSampleMetrics(sampleMetricsEntry);
            return this;
        }

        public Builder addStatsMetrics(DataProto$StatsDataPoint dataProto$StatsDataPoint) {
            copyOnWrite();
            ((DataProto$ExerciseUpdate) this.instance).addStatsMetrics(dataProto$StatsDataPoint);
            return this;
        }

        public Builder clearExerciseConfig() {
            copyOnWrite();
            ((DataProto$ExerciseUpdate) this.instance).clearExerciseConfig();
            return this;
        }

        public Builder clearExerciseEndReason() {
            copyOnWrite();
            ((DataProto$ExerciseUpdate) this.instance).clearExerciseEndReason();
            return this;
        }

        public Builder clearSampleMetrics() {
            copyOnWrite();
            ((DataProto$ExerciseUpdate) this.instance).clearSampleMetrics();
            return this;
        }

        public Builder clearState() {
            copyOnWrite();
            ((DataProto$ExerciseUpdate) this.instance).clearState();
            return this;
        }

        public Builder clearStatsMetrics() {
            copyOnWrite();
            ((DataProto$ExerciseUpdate) this.instance).clearStatsMetrics();
            return this;
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseUpdateOrBuilder
        public DataProto$ExerciseConfig getExerciseConfig() {
            return ((DataProto$ExerciseUpdate) this.instance).getExerciseConfig();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseUpdateOrBuilder
        public DataProto$ExerciseEndReason getExerciseEndReason() {
            return ((DataProto$ExerciseUpdate) this.instance).getExerciseEndReason();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseUpdateOrBuilder
        public int getExerciseEndReasonValue() {
            return ((DataProto$ExerciseUpdate) this.instance).getExerciseEndReasonValue();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseUpdateOrBuilder
        public SampleMetricsEntry getSampleMetrics(int i) {
            return ((DataProto$ExerciseUpdate) this.instance).getSampleMetrics(i);
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseUpdateOrBuilder
        public int getSampleMetricsCount() {
            return ((DataProto$ExerciseUpdate) this.instance).getSampleMetricsCount();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseUpdateOrBuilder
        public List<SampleMetricsEntry> getSampleMetricsList() {
            return Collections.unmodifiableList(((DataProto$ExerciseUpdate) this.instance).getSampleMetricsList());
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseUpdateOrBuilder
        public DataProto$ExerciseState getState() {
            return ((DataProto$ExerciseUpdate) this.instance).getState();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseUpdateOrBuilder
        public int getStateValue() {
            return ((DataProto$ExerciseUpdate) this.instance).getStateValue();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseUpdateOrBuilder
        public DataProto$StatsDataPoint getStatsMetrics(int i) {
            return ((DataProto$ExerciseUpdate) this.instance).getStatsMetrics(i);
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseUpdateOrBuilder
        public int getStatsMetricsCount() {
            return ((DataProto$ExerciseUpdate) this.instance).getStatsMetricsCount();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseUpdateOrBuilder
        public List<DataProto$StatsDataPoint> getStatsMetricsList() {
            return Collections.unmodifiableList(((DataProto$ExerciseUpdate) this.instance).getStatsMetricsList());
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseUpdateOrBuilder
        public boolean hasExerciseConfig() {
            return ((DataProto$ExerciseUpdate) this.instance).hasExerciseConfig();
        }

        public Builder mergeExerciseConfig(DataProto$ExerciseConfig dataProto$ExerciseConfig) {
            copyOnWrite();
            ((DataProto$ExerciseUpdate) this.instance).mergeExerciseConfig(dataProto$ExerciseConfig);
            return this;
        }

        public Builder removeSampleMetrics(int i) {
            copyOnWrite();
            ((DataProto$ExerciseUpdate) this.instance).removeSampleMetrics(i);
            return this;
        }

        public Builder removeStatsMetrics(int i) {
            copyOnWrite();
            ((DataProto$ExerciseUpdate) this.instance).removeStatsMetrics(i);
            return this;
        }

        public Builder setExerciseConfig(DataProto$ExerciseConfig dataProto$ExerciseConfig) {
            copyOnWrite();
            ((DataProto$ExerciseUpdate) this.instance).setExerciseConfig(dataProto$ExerciseConfig);
            return this;
        }

        public Builder setExerciseEndReason(DataProto$ExerciseEndReason dataProto$ExerciseEndReason) {
            copyOnWrite();
            ((DataProto$ExerciseUpdate) this.instance).setExerciseEndReason(dataProto$ExerciseEndReason);
            return this;
        }

        public Builder setExerciseEndReasonValue(int i) {
            copyOnWrite();
            ((DataProto$ExerciseUpdate) this.instance).setExerciseEndReasonValue(i);
            return this;
        }

        public Builder setSampleMetrics(int i, SampleMetricsEntry sampleMetricsEntry) {
            copyOnWrite();
            ((DataProto$ExerciseUpdate) this.instance).setSampleMetrics(i, sampleMetricsEntry);
            return this;
        }

        public Builder setState(DataProto$ExerciseState dataProto$ExerciseState) {
            copyOnWrite();
            ((DataProto$ExerciseUpdate) this.instance).setState(dataProto$ExerciseState);
            return this;
        }

        public Builder setStateValue(int i) {
            copyOnWrite();
            ((DataProto$ExerciseUpdate) this.instance).setStateValue(i);
            return this;
        }

        public Builder setStatsMetrics(int i, DataProto$StatsDataPoint dataProto$StatsDataPoint) {
            copyOnWrite();
            ((DataProto$ExerciseUpdate) this.instance).setStatsMetrics(i, dataProto$StatsDataPoint);
            return this;
        }

        private Builder() {
            super(DataProto$ExerciseUpdate.DEFAULT_INSTANCE);
        }

        public Builder addSampleMetrics(int i, SampleMetricsEntry sampleMetricsEntry) {
            copyOnWrite();
            ((DataProto$ExerciseUpdate) this.instance).addSampleMetrics(i, sampleMetricsEntry);
            return this;
        }

        public Builder addStatsMetrics(int i, DataProto$StatsDataPoint dataProto$StatsDataPoint) {
            copyOnWrite();
            ((DataProto$ExerciseUpdate) this.instance).addStatsMetrics(i, dataProto$StatsDataPoint);
            return this;
        }

        public Builder setExerciseConfig(DataProto$ExerciseConfig.Builder builder) {
            copyOnWrite();
            ((DataProto$ExerciseUpdate) this.instance).setExerciseConfig(builder.build());
            return this;
        }

        public Builder setSampleMetrics(int i, SampleMetricsEntry.Builder builder) {
            copyOnWrite();
            ((DataProto$ExerciseUpdate) this.instance).setSampleMetrics(i, builder.build());
            return this;
        }

        public Builder setStatsMetrics(int i, DataProto$StatsDataPoint.Builder builder) {
            copyOnWrite();
            ((DataProto$ExerciseUpdate) this.instance).setStatsMetrics(i, builder.build());
            return this;
        }

        public Builder addSampleMetrics(SampleMetricsEntry.Builder builder) {
            copyOnWrite();
            ((DataProto$ExerciseUpdate) this.instance).addSampleMetrics(builder.build());
            return this;
        }

        public Builder addStatsMetrics(DataProto$StatsDataPoint.Builder builder) {
            copyOnWrite();
            ((DataProto$ExerciseUpdate) this.instance).addStatsMetrics(builder.build());
            return this;
        }

        public Builder addSampleMetrics(int i, SampleMetricsEntry.Builder builder) {
            copyOnWrite();
            ((DataProto$ExerciseUpdate) this.instance).addSampleMetrics(i, builder.build());
            return this;
        }

        public Builder addStatsMetrics(int i, DataProto$StatsDataPoint.Builder builder) {
            copyOnWrite();
            ((DataProto$ExerciseUpdate) this.instance).addStatsMetrics(i, builder.build());
            return this;
        }
    }

    public static final class SampleMetricsEntry extends GeneratedMessageLite<SampleMetricsEntry, Builder> implements SampleMetricsEntryOrBuilder {
        public static final int DATA_POINTS_FIELD_NUMBER = 2;
        public static final int DATA_TYPE_FIELD_NUMBER = 1;
        private static final SampleMetricsEntry DEFAULT_INSTANCE;
        private static volatile Parser<SampleMetricsEntry> PARSER;
        private int bitField0_;
        private Internal.ProtobufList<DataProto$SampleDataPoint> dataPoints_ = GeneratedMessageLite.emptyProtobufList();
        private DataProto$DataType dataType_;

        public static final class Builder extends GeneratedMessageLite.Builder<SampleMetricsEntry, Builder> implements SampleMetricsEntryOrBuilder {
            public Builder addAllDataPoints(Iterable<? extends DataProto$SampleDataPoint> iterable) {
                copyOnWrite();
                ((SampleMetricsEntry) this.instance).addAllDataPoints(iterable);
                return this;
            }

            public Builder addDataPoints(DataProto$SampleDataPoint dataProto$SampleDataPoint) {
                copyOnWrite();
                ((SampleMetricsEntry) this.instance).addDataPoints(dataProto$SampleDataPoint);
                return this;
            }

            public Builder clearDataPoints() {
                copyOnWrite();
                ((SampleMetricsEntry) this.instance).clearDataPoints();
                return this;
            }

            public Builder clearDataType() {
                copyOnWrite();
                ((SampleMetricsEntry) this.instance).clearDataType();
                return this;
            }

            @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseUpdate.SampleMetricsEntryOrBuilder
            public DataProto$SampleDataPoint getDataPoints(int i) {
                return ((SampleMetricsEntry) this.instance).getDataPoints(i);
            }

            @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseUpdate.SampleMetricsEntryOrBuilder
            public int getDataPointsCount() {
                return ((SampleMetricsEntry) this.instance).getDataPointsCount();
            }

            @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseUpdate.SampleMetricsEntryOrBuilder
            public List<DataProto$SampleDataPoint> getDataPointsList() {
                return Collections.unmodifiableList(((SampleMetricsEntry) this.instance).getDataPointsList());
            }

            @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseUpdate.SampleMetricsEntryOrBuilder
            public DataProto$DataType getDataType() {
                return ((SampleMetricsEntry) this.instance).getDataType();
            }

            @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseUpdate.SampleMetricsEntryOrBuilder
            public boolean hasDataType() {
                return ((SampleMetricsEntry) this.instance).hasDataType();
            }

            public Builder mergeDataType(DataProto$DataType dataProto$DataType) {
                copyOnWrite();
                ((SampleMetricsEntry) this.instance).mergeDataType(dataProto$DataType);
                return this;
            }

            public Builder removeDataPoints(int i) {
                copyOnWrite();
                ((SampleMetricsEntry) this.instance).removeDataPoints(i);
                return this;
            }

            public Builder setDataPoints(int i, DataProto$SampleDataPoint dataProto$SampleDataPoint) {
                copyOnWrite();
                ((SampleMetricsEntry) this.instance).setDataPoints(i, dataProto$SampleDataPoint);
                return this;
            }

            public Builder setDataType(DataProto$DataType dataProto$DataType) {
                copyOnWrite();
                ((SampleMetricsEntry) this.instance).setDataType(dataProto$DataType);
                return this;
            }

            private Builder() {
                super(SampleMetricsEntry.DEFAULT_INSTANCE);
            }

            public Builder addDataPoints(int i, DataProto$SampleDataPoint dataProto$SampleDataPoint) {
                copyOnWrite();
                ((SampleMetricsEntry) this.instance).addDataPoints(i, dataProto$SampleDataPoint);
                return this;
            }

            public Builder setDataPoints(int i, DataProto$SampleDataPoint.Builder builder) {
                copyOnWrite();
                ((SampleMetricsEntry) this.instance).setDataPoints(i, builder.build());
                return this;
            }

            public Builder setDataType(DataProto$DataType.Builder builder) {
                copyOnWrite();
                ((SampleMetricsEntry) this.instance).setDataType(builder.build());
                return this;
            }

            public Builder addDataPoints(DataProto$SampleDataPoint.Builder builder) {
                copyOnWrite();
                ((SampleMetricsEntry) this.instance).addDataPoints(builder.build());
                return this;
            }

            public Builder addDataPoints(int i, DataProto$SampleDataPoint.Builder builder) {
                copyOnWrite();
                ((SampleMetricsEntry) this.instance).addDataPoints(i, builder.build());
                return this;
            }
        }

        static {
            SampleMetricsEntry sampleMetricsEntry = new SampleMetricsEntry();
            DEFAULT_INSTANCE = sampleMetricsEntry;
            GeneratedMessageLite.registerDefaultInstance(SampleMetricsEntry.class, sampleMetricsEntry);
        }

        private SampleMetricsEntry() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllDataPoints(Iterable<? extends DataProto$SampleDataPoint> iterable) {
            ensureDataPointsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.dataPoints_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDataPoints(DataProto$SampleDataPoint dataProto$SampleDataPoint) {
            dataProto$SampleDataPoint.getClass();
            ensureDataPointsIsMutable();
            this.dataPoints_.add(dataProto$SampleDataPoint);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDataPoints() {
            this.dataPoints_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDataType() {
            this.dataType_ = null;
            this.bitField0_ &= -2;
        }

        private void ensureDataPointsIsMutable() {
            Internal.ProtobufList<DataProto$SampleDataPoint> protobufList = this.dataPoints_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.dataPoints_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static SampleMetricsEntry getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDataType(DataProto$DataType dataProto$DataType) {
            dataProto$DataType.getClass();
            DataProto$DataType dataProto$DataType2 = this.dataType_;
            if (dataProto$DataType2 == null || dataProto$DataType2 == DataProto$DataType.getDefaultInstance()) {
                this.dataType_ = dataProto$DataType;
            } else {
                this.dataType_ = DataProto$DataType.newBuilder(this.dataType_).mergeFrom(dataProto$DataType).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SampleMetricsEntry parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SampleMetricsEntry) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SampleMetricsEntry parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SampleMetricsEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SampleMetricsEntry> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeDataPoints(int i) {
            ensureDataPointsIsMutable();
            this.dataPoints_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDataPoints(int i, DataProto$SampleDataPoint dataProto$SampleDataPoint) {
            dataProto$SampleDataPoint.getClass();
            ensureDataPointsIsMutable();
            this.dataPoints_.set(i, dataProto$SampleDataPoint);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDataType(DataProto$DataType dataProto$DataType) {
            dataProto$DataType.getClass();
            this.dataType_ = dataProto$DataType;
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = vu4.a[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new SampleMetricsEntry();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "dataType_", "dataPoints_", DataProto$SampleDataPoint.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SampleMetricsEntry> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (SampleMetricsEntry.class) {
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

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseUpdate.SampleMetricsEntryOrBuilder
        public DataProto$SampleDataPoint getDataPoints(int i) {
            return this.dataPoints_.get(i);
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseUpdate.SampleMetricsEntryOrBuilder
        public int getDataPointsCount() {
            return this.dataPoints_.size();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseUpdate.SampleMetricsEntryOrBuilder
        public List<DataProto$SampleDataPoint> getDataPointsList() {
            return this.dataPoints_;
        }

        public DataProto$SampleDataPointOrBuilder getDataPointsOrBuilder(int i) {
            return this.dataPoints_.get(i);
        }

        public List<? extends DataProto$SampleDataPointOrBuilder> getDataPointsOrBuilderList() {
            return this.dataPoints_;
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseUpdate.SampleMetricsEntryOrBuilder
        public DataProto$DataType getDataType() {
            DataProto$DataType dataProto$DataType = this.dataType_;
            return dataProto$DataType == null ? DataProto$DataType.getDefaultInstance() : dataProto$DataType;
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseUpdate.SampleMetricsEntryOrBuilder
        public boolean hasDataType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(SampleMetricsEntry sampleMetricsEntry) {
            return DEFAULT_INSTANCE.createBuilder(sampleMetricsEntry);
        }

        public static SampleMetricsEntry parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SampleMetricsEntry) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SampleMetricsEntry parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SampleMetricsEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SampleMetricsEntry parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SampleMetricsEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addDataPoints(int i, DataProto$SampleDataPoint dataProto$SampleDataPoint) {
            dataProto$SampleDataPoint.getClass();
            ensureDataPointsIsMutable();
            this.dataPoints_.add(i, dataProto$SampleDataPoint);
        }

        public static SampleMetricsEntry parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SampleMetricsEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SampleMetricsEntry parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SampleMetricsEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SampleMetricsEntry parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SampleMetricsEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SampleMetricsEntry parseFrom(InputStream inputStream) throws IOException {
            return (SampleMetricsEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SampleMetricsEntry parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SampleMetricsEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SampleMetricsEntry parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SampleMetricsEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SampleMetricsEntry parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SampleMetricsEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SampleMetricsEntryOrBuilder extends MessageLiteOrBuilder {
        DataProto$SampleDataPoint getDataPoints(int i);

        int getDataPointsCount();

        List<DataProto$SampleDataPoint> getDataPointsList();

        DataProto$DataType getDataType();

        boolean hasDataType();
    }

    static {
        DataProto$ExerciseUpdate dataProto$ExerciseUpdate = new DataProto$ExerciseUpdate();
        DEFAULT_INSTANCE = dataProto$ExerciseUpdate;
        GeneratedMessageLite.registerDefaultInstance(DataProto$ExerciseUpdate.class, dataProto$ExerciseUpdate);
    }

    private DataProto$ExerciseUpdate() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSampleMetrics(Iterable<? extends SampleMetricsEntry> iterable) {
        ensureSampleMetricsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.sampleMetrics_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllStatsMetrics(Iterable<? extends DataProto$StatsDataPoint> iterable) {
        ensureStatsMetricsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.statsMetrics_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSampleMetrics(SampleMetricsEntry sampleMetricsEntry) {
        sampleMetricsEntry.getClass();
        ensureSampleMetricsIsMutable();
        this.sampleMetrics_.add(sampleMetricsEntry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStatsMetrics(DataProto$StatsDataPoint dataProto$StatsDataPoint) {
        dataProto$StatsDataPoint.getClass();
        ensureStatsMetricsIsMutable();
        this.statsMetrics_.add(dataProto$StatsDataPoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExerciseConfig() {
        this.exerciseConfig_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExerciseEndReason() {
        this.exerciseEndReason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSampleMetrics() {
        this.sampleMetrics_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatsMetrics() {
        this.statsMetrics_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureSampleMetricsIsMutable() {
        Internal.ProtobufList<SampleMetricsEntry> protobufList = this.sampleMetrics_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.sampleMetrics_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureStatsMetricsIsMutable() {
        Internal.ProtobufList<DataProto$StatsDataPoint> protobufList = this.statsMetrics_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.statsMetrics_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static DataProto$ExerciseUpdate getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExerciseConfig(DataProto$ExerciseConfig dataProto$ExerciseConfig) {
        dataProto$ExerciseConfig.getClass();
        DataProto$ExerciseConfig dataProto$ExerciseConfig2 = this.exerciseConfig_;
        if (dataProto$ExerciseConfig2 == null || dataProto$ExerciseConfig2 == DataProto$ExerciseConfig.getDefaultInstance()) {
            this.exerciseConfig_ = dataProto$ExerciseConfig;
        } else {
            this.exerciseConfig_ = DataProto$ExerciseConfig.newBuilder(this.exerciseConfig_).mergeFrom(dataProto$ExerciseConfig).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DataProto$ExerciseUpdate parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DataProto$ExerciseUpdate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DataProto$ExerciseUpdate parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DataProto$ExerciseUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DataProto$ExerciseUpdate> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSampleMetrics(int i) {
        ensureSampleMetricsIsMutable();
        this.sampleMetrics_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeStatsMetrics(int i) {
        ensureStatsMetricsIsMutable();
        this.statsMetrics_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExerciseConfig(DataProto$ExerciseConfig dataProto$ExerciseConfig) {
        dataProto$ExerciseConfig.getClass();
        this.exerciseConfig_ = dataProto$ExerciseConfig;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExerciseEndReason(DataProto$ExerciseEndReason dataProto$ExerciseEndReason) {
        this.exerciseEndReason_ = dataProto$ExerciseEndReason.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExerciseEndReasonValue(int i) {
        this.exerciseEndReason_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSampleMetrics(int i, SampleMetricsEntry sampleMetricsEntry) {
        sampleMetricsEntry.getClass();
        ensureSampleMetricsIsMutable();
        this.sampleMetrics_.set(i, sampleMetricsEntry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(DataProto$ExerciseState dataProto$ExerciseState) {
        this.state_ = dataProto$ExerciseState.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateValue(int i) {
        this.state_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatsMetrics(int i, DataProto$StatsDataPoint dataProto$StatsDataPoint) {
        dataProto$StatsDataPoint.getClass();
        ensureStatsMetricsIsMutable();
        this.statsMetrics_.set(i, dataProto$StatsDataPoint);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = vu4.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DataProto$ExerciseUpdate();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\f\u0002\u001b\u0003\u001b\u0004ဉ\u0000\u0005\f", new Object[]{"bitField0_", "state_", "sampleMetrics_", SampleMetricsEntry.class, "statsMetrics_", DataProto$StatsDataPoint.class, "exerciseConfig_", "exerciseEndReason_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DataProto$ExerciseUpdate> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DataProto$ExerciseUpdate.class) {
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

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseUpdateOrBuilder
    public DataProto$ExerciseConfig getExerciseConfig() {
        DataProto$ExerciseConfig dataProto$ExerciseConfig = this.exerciseConfig_;
        return dataProto$ExerciseConfig == null ? DataProto$ExerciseConfig.getDefaultInstance() : dataProto$ExerciseConfig;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseUpdateOrBuilder
    public DataProto$ExerciseEndReason getExerciseEndReason() {
        DataProto$ExerciseEndReason dataProto$ExerciseEndReasonForNumber = DataProto$ExerciseEndReason.forNumber(this.exerciseEndReason_);
        return dataProto$ExerciseEndReasonForNumber == null ? DataProto$ExerciseEndReason.UNRECOGNIZED : dataProto$ExerciseEndReasonForNumber;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseUpdateOrBuilder
    public int getExerciseEndReasonValue() {
        return this.exerciseEndReason_;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseUpdateOrBuilder
    public SampleMetricsEntry getSampleMetrics(int i) {
        return this.sampleMetrics_.get(i);
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseUpdateOrBuilder
    public int getSampleMetricsCount() {
        return this.sampleMetrics_.size();
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseUpdateOrBuilder
    public List<SampleMetricsEntry> getSampleMetricsList() {
        return this.sampleMetrics_;
    }

    public SampleMetricsEntryOrBuilder getSampleMetricsOrBuilder(int i) {
        return this.sampleMetrics_.get(i);
    }

    public List<? extends SampleMetricsEntryOrBuilder> getSampleMetricsOrBuilderList() {
        return this.sampleMetrics_;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseUpdateOrBuilder
    public DataProto$ExerciseState getState() {
        DataProto$ExerciseState dataProto$ExerciseStateForNumber = DataProto$ExerciseState.forNumber(this.state_);
        return dataProto$ExerciseStateForNumber == null ? DataProto$ExerciseState.UNRECOGNIZED : dataProto$ExerciseStateForNumber;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseUpdateOrBuilder
    public int getStateValue() {
        return this.state_;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseUpdateOrBuilder
    public DataProto$StatsDataPoint getStatsMetrics(int i) {
        return this.statsMetrics_.get(i);
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseUpdateOrBuilder
    public int getStatsMetricsCount() {
        return this.statsMetrics_.size();
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseUpdateOrBuilder
    public List<DataProto$StatsDataPoint> getStatsMetricsList() {
        return this.statsMetrics_;
    }

    public DataProto$StatsDataPointOrBuilder getStatsMetricsOrBuilder(int i) {
        return this.statsMetrics_.get(i);
    }

    public List<? extends DataProto$StatsDataPointOrBuilder> getStatsMetricsOrBuilderList() {
        return this.statsMetrics_;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseUpdateOrBuilder
    public boolean hasExerciseConfig() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(DataProto$ExerciseUpdate dataProto$ExerciseUpdate) {
        return DEFAULT_INSTANCE.createBuilder(dataProto$ExerciseUpdate);
    }

    public static DataProto$ExerciseUpdate parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DataProto$ExerciseUpdate) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DataProto$ExerciseUpdate parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DataProto$ExerciseUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DataProto$ExerciseUpdate parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DataProto$ExerciseUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSampleMetrics(int i, SampleMetricsEntry sampleMetricsEntry) {
        sampleMetricsEntry.getClass();
        ensureSampleMetricsIsMutable();
        this.sampleMetrics_.add(i, sampleMetricsEntry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStatsMetrics(int i, DataProto$StatsDataPoint dataProto$StatsDataPoint) {
        dataProto$StatsDataPoint.getClass();
        ensureStatsMetricsIsMutable();
        this.statsMetrics_.add(i, dataProto$StatsDataPoint);
    }

    public static DataProto$ExerciseUpdate parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DataProto$ExerciseUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DataProto$ExerciseUpdate parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DataProto$ExerciseUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DataProto$ExerciseUpdate parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DataProto$ExerciseUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DataProto$ExerciseUpdate parseFrom(InputStream inputStream) throws IOException {
        return (DataProto$ExerciseUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DataProto$ExerciseUpdate parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DataProto$ExerciseUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DataProto$ExerciseUpdate parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DataProto$ExerciseUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DataProto$ExerciseUpdate parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DataProto$ExerciseUpdate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
