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
public final class DataProto$WarmUpConfig extends GeneratedMessageLite<DataProto$WarmUpConfig, Builder> implements DataProto$WarmUpConfigOrBuilder {
    public static final int DATA_TYPES_FIELD_NUMBER = 2;
    private static final DataProto$WarmUpConfig DEFAULT_INSTANCE;
    public static final int EXERCISE_TYPE_FIELD_NUMBER = 1;
    private static volatile Parser<DataProto$WarmUpConfig> PARSER;
    private Internal.ProtobufList<DataProto$DataType> dataTypes_ = GeneratedMessageLite.emptyProtobufList();
    private int exerciseType_;

    public static final class Builder extends GeneratedMessageLite.Builder<DataProto$WarmUpConfig, Builder> implements DataProto$WarmUpConfigOrBuilder {
        public Builder addAllDataTypes(Iterable<? extends DataProto$DataType> iterable) {
            copyOnWrite();
            ((DataProto$WarmUpConfig) this.instance).addAllDataTypes(iterable);
            return this;
        }

        public Builder addDataTypes(DataProto$DataType dataProto$DataType) {
            copyOnWrite();
            ((DataProto$WarmUpConfig) this.instance).addDataTypes(dataProto$DataType);
            return this;
        }

        public Builder clearDataTypes() {
            copyOnWrite();
            ((DataProto$WarmUpConfig) this.instance).clearDataTypes();
            return this;
        }

        public Builder clearExerciseType() {
            copyOnWrite();
            ((DataProto$WarmUpConfig) this.instance).clearExerciseType();
            return this;
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$WarmUpConfigOrBuilder
        public DataProto$DataType getDataTypes(int i) {
            return ((DataProto$WarmUpConfig) this.instance).getDataTypes(i);
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$WarmUpConfigOrBuilder
        public int getDataTypesCount() {
            return ((DataProto$WarmUpConfig) this.instance).getDataTypesCount();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$WarmUpConfigOrBuilder
        public List<DataProto$DataType> getDataTypesList() {
            return Collections.unmodifiableList(((DataProto$WarmUpConfig) this.instance).getDataTypesList());
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$WarmUpConfigOrBuilder
        public DataProto$ExerciseType getExerciseType() {
            return ((DataProto$WarmUpConfig) this.instance).getExerciseType();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$WarmUpConfigOrBuilder
        public int getExerciseTypeValue() {
            return ((DataProto$WarmUpConfig) this.instance).getExerciseTypeValue();
        }

        public Builder removeDataTypes(int i) {
            copyOnWrite();
            ((DataProto$WarmUpConfig) this.instance).removeDataTypes(i);
            return this;
        }

        public Builder setDataTypes(int i, DataProto$DataType dataProto$DataType) {
            copyOnWrite();
            ((DataProto$WarmUpConfig) this.instance).setDataTypes(i, dataProto$DataType);
            return this;
        }

        public Builder setExerciseType(DataProto$ExerciseType dataProto$ExerciseType) {
            copyOnWrite();
            ((DataProto$WarmUpConfig) this.instance).setExerciseType(dataProto$ExerciseType);
            return this;
        }

        public Builder setExerciseTypeValue(int i) {
            copyOnWrite();
            ((DataProto$WarmUpConfig) this.instance).setExerciseTypeValue(i);
            return this;
        }

        private Builder() {
            super(DataProto$WarmUpConfig.DEFAULT_INSTANCE);
        }

        public Builder addDataTypes(int i, DataProto$DataType dataProto$DataType) {
            copyOnWrite();
            ((DataProto$WarmUpConfig) this.instance).addDataTypes(i, dataProto$DataType);
            return this;
        }

        public Builder setDataTypes(int i, DataProto$DataType.Builder builder) {
            copyOnWrite();
            ((DataProto$WarmUpConfig) this.instance).setDataTypes(i, builder.build());
            return this;
        }

        public Builder addDataTypes(DataProto$DataType.Builder builder) {
            copyOnWrite();
            ((DataProto$WarmUpConfig) this.instance).addDataTypes(builder.build());
            return this;
        }

        public Builder addDataTypes(int i, DataProto$DataType.Builder builder) {
            copyOnWrite();
            ((DataProto$WarmUpConfig) this.instance).addDataTypes(i, builder.build());
            return this;
        }
    }

    static {
        DataProto$WarmUpConfig dataProto$WarmUpConfig = new DataProto$WarmUpConfig();
        DEFAULT_INSTANCE = dataProto$WarmUpConfig;
        GeneratedMessageLite.registerDefaultInstance(DataProto$WarmUpConfig.class, dataProto$WarmUpConfig);
    }

    private DataProto$WarmUpConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDataTypes(Iterable<? extends DataProto$DataType> iterable) {
        ensureDataTypesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.dataTypes_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDataTypes(DataProto$DataType dataProto$DataType) {
        dataProto$DataType.getClass();
        ensureDataTypesIsMutable();
        this.dataTypes_.add(dataProto$DataType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDataTypes() {
        this.dataTypes_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExerciseType() {
        this.exerciseType_ = 0;
    }

    private void ensureDataTypesIsMutable() {
        Internal.ProtobufList<DataProto$DataType> protobufList = this.dataTypes_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.dataTypes_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static DataProto$WarmUpConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DataProto$WarmUpConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DataProto$WarmUpConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DataProto$WarmUpConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DataProto$WarmUpConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DataProto$WarmUpConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDataTypes(int i) {
        ensureDataTypesIsMutable();
        this.dataTypes_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDataTypes(int i, DataProto$DataType dataProto$DataType) {
        dataProto$DataType.getClass();
        ensureDataTypesIsMutable();
        this.dataTypes_.set(i, dataProto$DataType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExerciseType(DataProto$ExerciseType dataProto$ExerciseType) {
        this.exerciseType_ = dataProto$ExerciseType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExerciseTypeValue(int i) {
        this.exerciseType_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = vu4.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DataProto$WarmUpConfig();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"exerciseType_", "dataTypes_", DataProto$DataType.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DataProto$WarmUpConfig> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DataProto$WarmUpConfig.class) {
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

    @Override // com.oplus.ocs.wearengine.proto.DataProto$WarmUpConfigOrBuilder
    public DataProto$DataType getDataTypes(int i) {
        return this.dataTypes_.get(i);
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$WarmUpConfigOrBuilder
    public int getDataTypesCount() {
        return this.dataTypes_.size();
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$WarmUpConfigOrBuilder
    public List<DataProto$DataType> getDataTypesList() {
        return this.dataTypes_;
    }

    public DataProto$DataTypeOrBuilder getDataTypesOrBuilder(int i) {
        return this.dataTypes_.get(i);
    }

    public List<? extends DataProto$DataTypeOrBuilder> getDataTypesOrBuilderList() {
        return this.dataTypes_;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$WarmUpConfigOrBuilder
    public DataProto$ExerciseType getExerciseType() {
        DataProto$ExerciseType dataProto$ExerciseTypeForNumber = DataProto$ExerciseType.forNumber(this.exerciseType_);
        return dataProto$ExerciseTypeForNumber == null ? DataProto$ExerciseType.UNRECOGNIZED : dataProto$ExerciseTypeForNumber;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$WarmUpConfigOrBuilder
    public int getExerciseTypeValue() {
        return this.exerciseType_;
    }

    public static Builder newBuilder(DataProto$WarmUpConfig dataProto$WarmUpConfig) {
        return DEFAULT_INSTANCE.createBuilder(dataProto$WarmUpConfig);
    }

    public static DataProto$WarmUpConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DataProto$WarmUpConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DataProto$WarmUpConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DataProto$WarmUpConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DataProto$WarmUpConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DataProto$WarmUpConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDataTypes(int i, DataProto$DataType dataProto$DataType) {
        dataProto$DataType.getClass();
        ensureDataTypesIsMutable();
        this.dataTypes_.add(i, dataProto$DataType);
    }

    public static DataProto$WarmUpConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DataProto$WarmUpConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DataProto$WarmUpConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DataProto$WarmUpConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DataProto$WarmUpConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DataProto$WarmUpConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DataProto$WarmUpConfig parseFrom(InputStream inputStream) throws IOException {
        return (DataProto$WarmUpConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DataProto$WarmUpConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DataProto$WarmUpConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DataProto$WarmUpConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DataProto$WarmUpConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DataProto$WarmUpConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DataProto$WarmUpConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
