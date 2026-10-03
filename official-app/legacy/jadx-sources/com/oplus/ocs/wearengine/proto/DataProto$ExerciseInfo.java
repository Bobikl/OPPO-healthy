package com.oplus.ocs.wearengine.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.vu4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public final class DataProto$ExerciseInfo extends GeneratedMessageLite<DataProto$ExerciseInfo, Builder> implements DataProto$ExerciseInfoOrBuilder {
    private static final DataProto$ExerciseInfo DEFAULT_INSTANCE;
    public static final int EXERCISE_TRACKED_STATUS_FIELD_NUMBER = 1;
    public static final int EXERCISE_TYPE_FIELD_NUMBER = 2;
    private static volatile Parser<DataProto$ExerciseInfo> PARSER;
    private int exerciseTrackedStatus_;
    private int exerciseType_;

    public static final class Builder extends GeneratedMessageLite.Builder<DataProto$ExerciseInfo, Builder> implements DataProto$ExerciseInfoOrBuilder {
        public Builder clearExerciseTrackedStatus() {
            copyOnWrite();
            ((DataProto$ExerciseInfo) this.instance).clearExerciseTrackedStatus();
            return this;
        }

        public Builder clearExerciseType() {
            copyOnWrite();
            ((DataProto$ExerciseInfo) this.instance).clearExerciseType();
            return this;
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseInfoOrBuilder
        public DataProto$ExerciseTrackedStatus getExerciseTrackedStatus() {
            return ((DataProto$ExerciseInfo) this.instance).getExerciseTrackedStatus();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseInfoOrBuilder
        public int getExerciseTrackedStatusValue() {
            return ((DataProto$ExerciseInfo) this.instance).getExerciseTrackedStatusValue();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseInfoOrBuilder
        public DataProto$ExerciseType getExerciseType() {
            return ((DataProto$ExerciseInfo) this.instance).getExerciseType();
        }

        @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseInfoOrBuilder
        public int getExerciseTypeValue() {
            return ((DataProto$ExerciseInfo) this.instance).getExerciseTypeValue();
        }

        public Builder setExerciseTrackedStatus(DataProto$ExerciseTrackedStatus dataProto$ExerciseTrackedStatus) {
            copyOnWrite();
            ((DataProto$ExerciseInfo) this.instance).setExerciseTrackedStatus(dataProto$ExerciseTrackedStatus);
            return this;
        }

        public Builder setExerciseTrackedStatusValue(int i) {
            copyOnWrite();
            ((DataProto$ExerciseInfo) this.instance).setExerciseTrackedStatusValue(i);
            return this;
        }

        public Builder setExerciseType(DataProto$ExerciseType dataProto$ExerciseType) {
            copyOnWrite();
            ((DataProto$ExerciseInfo) this.instance).setExerciseType(dataProto$ExerciseType);
            return this;
        }

        public Builder setExerciseTypeValue(int i) {
            copyOnWrite();
            ((DataProto$ExerciseInfo) this.instance).setExerciseTypeValue(i);
            return this;
        }

        private Builder() {
            super(DataProto$ExerciseInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        DataProto$ExerciseInfo dataProto$ExerciseInfo = new DataProto$ExerciseInfo();
        DEFAULT_INSTANCE = dataProto$ExerciseInfo;
        GeneratedMessageLite.registerDefaultInstance(DataProto$ExerciseInfo.class, dataProto$ExerciseInfo);
    }

    private DataProto$ExerciseInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExerciseTrackedStatus() {
        this.exerciseTrackedStatus_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExerciseType() {
        this.exerciseType_ = 0;
    }

    public static DataProto$ExerciseInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DataProto$ExerciseInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DataProto$ExerciseInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DataProto$ExerciseInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DataProto$ExerciseInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DataProto$ExerciseInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExerciseTrackedStatus(DataProto$ExerciseTrackedStatus dataProto$ExerciseTrackedStatus) {
        this.exerciseTrackedStatus_ = dataProto$ExerciseTrackedStatus.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExerciseTrackedStatusValue(int i) {
        this.exerciseTrackedStatus_ = i;
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
                return new DataProto$ExerciseInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"exerciseTrackedStatus_", "exerciseType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DataProto$ExerciseInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DataProto$ExerciseInfo.class) {
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

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseInfoOrBuilder
    public DataProto$ExerciseTrackedStatus getExerciseTrackedStatus() {
        DataProto$ExerciseTrackedStatus dataProto$ExerciseTrackedStatusForNumber = DataProto$ExerciseTrackedStatus.forNumber(this.exerciseTrackedStatus_);
        return dataProto$ExerciseTrackedStatusForNumber == null ? DataProto$ExerciseTrackedStatus.UNRECOGNIZED : dataProto$ExerciseTrackedStatusForNumber;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseInfoOrBuilder
    public int getExerciseTrackedStatusValue() {
        return this.exerciseTrackedStatus_;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseInfoOrBuilder
    public DataProto$ExerciseType getExerciseType() {
        DataProto$ExerciseType dataProto$ExerciseTypeForNumber = DataProto$ExerciseType.forNumber(this.exerciseType_);
        return dataProto$ExerciseTypeForNumber == null ? DataProto$ExerciseType.UNRECOGNIZED : dataProto$ExerciseTypeForNumber;
    }

    @Override // com.oplus.ocs.wearengine.proto.DataProto$ExerciseInfoOrBuilder
    public int getExerciseTypeValue() {
        return this.exerciseType_;
    }

    public static Builder newBuilder(DataProto$ExerciseInfo dataProto$ExerciseInfo) {
        return DEFAULT_INSTANCE.createBuilder(dataProto$ExerciseInfo);
    }

    public static DataProto$ExerciseInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DataProto$ExerciseInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DataProto$ExerciseInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DataProto$ExerciseInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DataProto$ExerciseInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DataProto$ExerciseInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DataProto$ExerciseInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DataProto$ExerciseInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DataProto$ExerciseInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DataProto$ExerciseInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DataProto$ExerciseInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DataProto$ExerciseInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DataProto$ExerciseInfo parseFrom(InputStream inputStream) throws IOException {
        return (DataProto$ExerciseInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DataProto$ExerciseInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DataProto$ExerciseInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DataProto$ExerciseInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DataProto$ExerciseInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DataProto$ExerciseInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DataProto$ExerciseInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
