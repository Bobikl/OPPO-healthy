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
public final class DataProto$ExerciseConfig extends GeneratedMessageLite<DataProto$ExerciseConfig, Builder> implements DataProto$ExerciseConfigOrBuilder {
    public static final int BATCHING_MODE_FIELD_NUMBER = 6;
    private static final DataProto$ExerciseConfig DEFAULT_INSTANCE;
    public static final int EXERCISE_PARAMS_FIELD_NUMBER = 5;
    public static final int EXERCISE_TYPE_FIELD_NUMBER = 1;
    public static final int IS_AUTO_PAUSE_AND_RESUME_ENABLED_FIELD_NUMBER = 4;
    private static volatile Parser<DataProto$ExerciseConfig> PARSER = null;
    public static final int SAMPLE_DATA_TYPES_FIELD_NUMBER = 2;
    public static final int STATS_DATA_TYPES_FIELD_NUMBER = 3;
    private int batchingMode_;
    private int bitField0_;
    private DataProto$Bundle exerciseParams_;
    private int exerciseType_;
    private boolean isAutoPauseAndResumeEnabled_;
    private Internal.ProtobufList<DataProto$DataType> sampleDataTypes_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<DataProto$DataType> statsDataTypes_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<DataProto$ExerciseConfig, Builder> implements DataProto$ExerciseConfigOrBuilder {
        public Builder addAllSampleDataTypes(Iterable<? extends DataProto$DataType> iterable) {
            copyOnWrite();
            ((DataProto$ExerciseConfig) this.instance).addAllSampleDataTypes(iterable);
            return this;
        }

        public Builder addAllStatsDataTypes(Iterable<? extends DataProto$DataType> iterable) {
            copyOnWrite();
            ((DataProto$ExerciseConfig) this.instance).addAllStatsDataTypes(iterable);
            return this;
        }

        public Builder addSampleDataTypes(DataProto$DataType dataProto$DataType) {
            copyOnWrite();
            ((DataProto$ExerciseConfig) this.instance).addSampleDataTypes(dataProto$DataType);
            return this;
        }

        public Builder addStatsDataTypes(DataProto$DataType dataProto$DataType) {
            copyOnWrite();
            ((DataProto$ExerciseConfig) this.instance).addStatsDataTypes(dataProto$DataType);
            return this;
        }

        public Builder clearBatchingMode() {
            copyOnWrite();
            ((DataProto$ExerciseConfig) this.instance).clearBatchingMode();
            return this;
        }

        public Builder clearExerciseParams() {
            copyOnWrite();
            ((DataProto$ExerciseConfig) this.instance).clearExerciseParams();
            return this;
        }

        public Builder clearExerciseType() {
            copyOnWrite();
            ((DataProto$ExerciseConfig) this.instance).clearExerciseType();
            return this;
        }

        public Builder clearIsAutoPauseAndResumeEnabled() {
            copyOnWrite();
            ((DataProto$ExerciseConfig) this.instance).clearIsAutoPauseAndResumeEnabled();
            return this;
        }

        public Builder clearSampleDataTypes() {
            copyOnWrite();
            ((DataProto$ExerciseConfig) this.instance).clearSampleDataTypes();
            return this;
        }

        public Builder clearStatsDataTypes() {
            copyOnWrite();
            ((DataProto$ExerciseConfig) this.instance).clearStatsDataTypes();
            return this;
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseConfigOrBuilder
        public DataProto$BatchingMode getBatchingMode() {
            return ((DataProto$ExerciseConfig) this.instance).getBatchingMode();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseConfigOrBuilder
        public int getBatchingModeValue() {
            return ((DataProto$ExerciseConfig) this.instance).getBatchingModeValue();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseConfigOrBuilder
        public DataProto$Bundle getExerciseParams() {
            return ((DataProto$ExerciseConfig) this.instance).getExerciseParams();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseConfigOrBuilder
        public DataProto$ExerciseType getExerciseType() {
            return ((DataProto$ExerciseConfig) this.instance).getExerciseType();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseConfigOrBuilder
        public int getExerciseTypeValue() {
            return ((DataProto$ExerciseConfig) this.instance).getExerciseTypeValue();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseConfigOrBuilder
        public boolean getIsAutoPauseAndResumeEnabled() {
            return ((DataProto$ExerciseConfig) this.instance).getIsAutoPauseAndResumeEnabled();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseConfigOrBuilder
        public DataProto$DataType getSampleDataTypes(int i) {
            return ((DataProto$ExerciseConfig) this.instance).getSampleDataTypes(i);
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseConfigOrBuilder
        public int getSampleDataTypesCount() {
            return ((DataProto$ExerciseConfig) this.instance).getSampleDataTypesCount();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseConfigOrBuilder
        public List<DataProto$DataType> getSampleDataTypesList() {
            return Collections.unmodifiableList(((DataProto$ExerciseConfig) this.instance).getSampleDataTypesList());
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseConfigOrBuilder
        public DataProto$DataType getStatsDataTypes(int i) {
            return ((DataProto$ExerciseConfig) this.instance).getStatsDataTypes(i);
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseConfigOrBuilder
        public int getStatsDataTypesCount() {
            return ((DataProto$ExerciseConfig) this.instance).getStatsDataTypesCount();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseConfigOrBuilder
        public List<DataProto$DataType> getStatsDataTypesList() {
            return Collections.unmodifiableList(((DataProto$ExerciseConfig) this.instance).getStatsDataTypesList());
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseConfigOrBuilder
        public boolean hasExerciseParams() {
            return ((DataProto$ExerciseConfig) this.instance).hasExerciseParams();
        }

        public Builder mergeExerciseParams(DataProto$Bundle dataProto$Bundle) {
            copyOnWrite();
            ((DataProto$ExerciseConfig) this.instance).mergeExerciseParams(dataProto$Bundle);
            return this;
        }

        public Builder removeSampleDataTypes(int i) {
            copyOnWrite();
            ((DataProto$ExerciseConfig) this.instance).removeSampleDataTypes(i);
            return this;
        }

        public Builder removeStatsDataTypes(int i) {
            copyOnWrite();
            ((DataProto$ExerciseConfig) this.instance).removeStatsDataTypes(i);
            return this;
        }

        public Builder setBatchingMode(DataProto$BatchingMode dataProto$BatchingMode) {
            copyOnWrite();
            ((DataProto$ExerciseConfig) this.instance).setBatchingMode(dataProto$BatchingMode);
            return this;
        }

        public Builder setBatchingModeValue(int i) {
            copyOnWrite();
            ((DataProto$ExerciseConfig) this.instance).setBatchingModeValue(i);
            return this;
        }

        public Builder setExerciseParams(DataProto$Bundle dataProto$Bundle) {
            copyOnWrite();
            ((DataProto$ExerciseConfig) this.instance).setExerciseParams(dataProto$Bundle);
            return this;
        }

        public Builder setExerciseType(DataProto$ExerciseType dataProto$ExerciseType) {
            copyOnWrite();
            ((DataProto$ExerciseConfig) this.instance).setExerciseType(dataProto$ExerciseType);
            return this;
        }

        public Builder setExerciseTypeValue(int i) {
            copyOnWrite();
            ((DataProto$ExerciseConfig) this.instance).setExerciseTypeValue(i);
            return this;
        }

        public Builder setIsAutoPauseAndResumeEnabled(boolean z) {
            copyOnWrite();
            ((DataProto$ExerciseConfig) this.instance).setIsAutoPauseAndResumeEnabled(z);
            return this;
        }

        public Builder setSampleDataTypes(int i, DataProto$DataType dataProto$DataType) {
            copyOnWrite();
            ((DataProto$ExerciseConfig) this.instance).setSampleDataTypes(i, dataProto$DataType);
            return this;
        }

        public Builder setStatsDataTypes(int i, DataProto$DataType dataProto$DataType) {
            copyOnWrite();
            ((DataProto$ExerciseConfig) this.instance).setStatsDataTypes(i, dataProto$DataType);
            return this;
        }

        private Builder() {
            super(DataProto$ExerciseConfig.DEFAULT_INSTANCE);
        }

        public Builder addSampleDataTypes(int i, DataProto$DataType dataProto$DataType) {
            copyOnWrite();
            ((DataProto$ExerciseConfig) this.instance).addSampleDataTypes(i, dataProto$DataType);
            return this;
        }

        public Builder addStatsDataTypes(int i, DataProto$DataType dataProto$DataType) {
            copyOnWrite();
            ((DataProto$ExerciseConfig) this.instance).addStatsDataTypes(i, dataProto$DataType);
            return this;
        }

        public Builder setExerciseParams(DataProto$Bundle.Builder builder) {
            copyOnWrite();
            ((DataProto$ExerciseConfig) this.instance).setExerciseParams(builder.build());
            return this;
        }

        public Builder setSampleDataTypes(int i, DataProto$DataType.Builder builder) {
            copyOnWrite();
            ((DataProto$ExerciseConfig) this.instance).setSampleDataTypes(i, builder.build());
            return this;
        }

        public Builder setStatsDataTypes(int i, DataProto$DataType.Builder builder) {
            copyOnWrite();
            ((DataProto$ExerciseConfig) this.instance).setStatsDataTypes(i, builder.build());
            return this;
        }

        public Builder addSampleDataTypes(DataProto$DataType.Builder builder) {
            copyOnWrite();
            ((DataProto$ExerciseConfig) this.instance).addSampleDataTypes(builder.build());
            return this;
        }

        public Builder addStatsDataTypes(DataProto$DataType.Builder builder) {
            copyOnWrite();
            ((DataProto$ExerciseConfig) this.instance).addStatsDataTypes(builder.build());
            return this;
        }

        public Builder addSampleDataTypes(int i, DataProto$DataType.Builder builder) {
            copyOnWrite();
            ((DataProto$ExerciseConfig) this.instance).addSampleDataTypes(i, builder.build());
            return this;
        }

        public Builder addStatsDataTypes(int i, DataProto$DataType.Builder builder) {
            copyOnWrite();
            ((DataProto$ExerciseConfig) this.instance).addStatsDataTypes(i, builder.build());
            return this;
        }
    }

    static {
        DataProto$ExerciseConfig dataProto$ExerciseConfig = new DataProto$ExerciseConfig();
        DEFAULT_INSTANCE = dataProto$ExerciseConfig;
        GeneratedMessageLite.registerDefaultInstance(DataProto$ExerciseConfig.class, dataProto$ExerciseConfig);
    }

    private DataProto$ExerciseConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSampleDataTypes(Iterable<? extends DataProto$DataType> iterable) {
        ensureSampleDataTypesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.sampleDataTypes_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllStatsDataTypes(Iterable<? extends DataProto$DataType> iterable) {
        ensureStatsDataTypesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.statsDataTypes_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSampleDataTypes(DataProto$DataType dataProto$DataType) {
        dataProto$DataType.getClass();
        ensureSampleDataTypesIsMutable();
        this.sampleDataTypes_.add(dataProto$DataType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStatsDataTypes(DataProto$DataType dataProto$DataType) {
        dataProto$DataType.getClass();
        ensureStatsDataTypesIsMutable();
        this.statsDataTypes_.add(dataProto$DataType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBatchingMode() {
        this.batchingMode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExerciseParams() {
        this.exerciseParams_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExerciseType() {
        this.exerciseType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAutoPauseAndResumeEnabled() {
        this.isAutoPauseAndResumeEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSampleDataTypes() {
        this.sampleDataTypes_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatsDataTypes() {
        this.statsDataTypes_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureSampleDataTypesIsMutable() {
        Internal.ProtobufList<DataProto$DataType> protobufList = this.sampleDataTypes_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.sampleDataTypes_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureStatsDataTypesIsMutable() {
        Internal.ProtobufList<DataProto$DataType> protobufList = this.statsDataTypes_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.statsDataTypes_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static DataProto$ExerciseConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExerciseParams(DataProto$Bundle dataProto$Bundle) {
        dataProto$Bundle.getClass();
        DataProto$Bundle dataProto$Bundle2 = this.exerciseParams_;
        if (dataProto$Bundle2 == null || dataProto$Bundle2 == DataProto$Bundle.getDefaultInstance()) {
            this.exerciseParams_ = dataProto$Bundle;
        } else {
            this.exerciseParams_ = DataProto$Bundle.newBuilder(this.exerciseParams_).mergeFrom(dataProto$Bundle).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DataProto$ExerciseConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DataProto$ExerciseConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DataProto$ExerciseConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DataProto$ExerciseConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DataProto$ExerciseConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSampleDataTypes(int i) {
        ensureSampleDataTypesIsMutable();
        this.sampleDataTypes_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeStatsDataTypes(int i) {
        ensureStatsDataTypesIsMutable();
        this.statsDataTypes_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBatchingMode(DataProto$BatchingMode dataProto$BatchingMode) {
        this.batchingMode_ = dataProto$BatchingMode.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBatchingModeValue(int i) {
        this.batchingMode_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExerciseParams(DataProto$Bundle dataProto$Bundle) {
        dataProto$Bundle.getClass();
        this.exerciseParams_ = dataProto$Bundle;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExerciseType(DataProto$ExerciseType dataProto$ExerciseType) {
        this.exerciseType_ = dataProto$ExerciseType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExerciseTypeValue(int i) {
        this.exerciseType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAutoPauseAndResumeEnabled(boolean z) {
        this.isAutoPauseAndResumeEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSampleDataTypes(int i, DataProto$DataType dataProto$DataType) {
        dataProto$DataType.getClass();
        ensureSampleDataTypesIsMutable();
        this.sampleDataTypes_.set(i, dataProto$DataType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatsDataTypes(int i, DataProto$DataType dataProto$DataType) {
        dataProto$DataType.getClass();
        ensureStatsDataTypesIsMutable();
        this.statsDataTypes_.set(i, dataProto$DataType);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = vu4.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DataProto$ExerciseConfig();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\f\u0002\u001b\u0003\u001b\u0004\u0007\u0005ဉ\u0000\u0006\f", new Object[]{"bitField0_", "exerciseType_", "sampleDataTypes_", DataProto$DataType.class, "statsDataTypes_", DataProto$DataType.class, "isAutoPauseAndResumeEnabled_", "exerciseParams_", "batchingMode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DataProto$ExerciseConfig> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DataProto$ExerciseConfig.class) {
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

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseConfigOrBuilder
    public DataProto$BatchingMode getBatchingMode() {
        DataProto$BatchingMode dataProto$BatchingModeForNumber = DataProto$BatchingMode.forNumber(this.batchingMode_);
        return dataProto$BatchingModeForNumber == null ? DataProto$BatchingMode.UNRECOGNIZED : dataProto$BatchingModeForNumber;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseConfigOrBuilder
    public int getBatchingModeValue() {
        return this.batchingMode_;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseConfigOrBuilder
    public DataProto$Bundle getExerciseParams() {
        DataProto$Bundle dataProto$Bundle = this.exerciseParams_;
        return dataProto$Bundle == null ? DataProto$Bundle.getDefaultInstance() : dataProto$Bundle;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseConfigOrBuilder
    public DataProto$ExerciseType getExerciseType() {
        DataProto$ExerciseType dataProto$ExerciseTypeForNumber = DataProto$ExerciseType.forNumber(this.exerciseType_);
        return dataProto$ExerciseTypeForNumber == null ? DataProto$ExerciseType.UNRECOGNIZED : dataProto$ExerciseTypeForNumber;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseConfigOrBuilder
    public int getExerciseTypeValue() {
        return this.exerciseType_;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseConfigOrBuilder
    public boolean getIsAutoPauseAndResumeEnabled() {
        return this.isAutoPauseAndResumeEnabled_;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseConfigOrBuilder
    public DataProto$DataType getSampleDataTypes(int i) {
        return this.sampleDataTypes_.get(i);
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseConfigOrBuilder
    public int getSampleDataTypesCount() {
        return this.sampleDataTypes_.size();
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseConfigOrBuilder
    public List<DataProto$DataType> getSampleDataTypesList() {
        return this.sampleDataTypes_;
    }

    public DataProto$DataTypeOrBuilder getSampleDataTypesOrBuilder(int i) {
        return this.sampleDataTypes_.get(i);
    }

    public List<? extends DataProto$DataTypeOrBuilder> getSampleDataTypesOrBuilderList() {
        return this.sampleDataTypes_;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseConfigOrBuilder
    public DataProto$DataType getStatsDataTypes(int i) {
        return this.statsDataTypes_.get(i);
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseConfigOrBuilder
    public int getStatsDataTypesCount() {
        return this.statsDataTypes_.size();
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseConfigOrBuilder
    public List<DataProto$DataType> getStatsDataTypesList() {
        return this.statsDataTypes_;
    }

    public DataProto$DataTypeOrBuilder getStatsDataTypesOrBuilder(int i) {
        return this.statsDataTypes_.get(i);
    }

    public List<? extends DataProto$DataTypeOrBuilder> getStatsDataTypesOrBuilderList() {
        return this.statsDataTypes_;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseConfigOrBuilder
    public boolean hasExerciseParams() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(DataProto$ExerciseConfig dataProto$ExerciseConfig) {
        return DEFAULT_INSTANCE.createBuilder(dataProto$ExerciseConfig);
    }

    public static DataProto$ExerciseConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DataProto$ExerciseConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DataProto$ExerciseConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DataProto$ExerciseConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DataProto$ExerciseConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DataProto$ExerciseConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSampleDataTypes(int i, DataProto$DataType dataProto$DataType) {
        dataProto$DataType.getClass();
        ensureSampleDataTypesIsMutable();
        this.sampleDataTypes_.add(i, dataProto$DataType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStatsDataTypes(int i, DataProto$DataType dataProto$DataType) {
        dataProto$DataType.getClass();
        ensureStatsDataTypesIsMutable();
        this.statsDataTypes_.add(i, dataProto$DataType);
    }

    public static DataProto$ExerciseConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DataProto$ExerciseConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DataProto$ExerciseConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DataProto$ExerciseConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DataProto$ExerciseConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DataProto$ExerciseConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DataProto$ExerciseConfig parseFrom(InputStream inputStream) throws IOException {
        return (DataProto$ExerciseConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DataProto$ExerciseConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DataProto$ExerciseConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DataProto$ExerciseConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DataProto$ExerciseConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DataProto$ExerciseConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DataProto$ExerciseConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
