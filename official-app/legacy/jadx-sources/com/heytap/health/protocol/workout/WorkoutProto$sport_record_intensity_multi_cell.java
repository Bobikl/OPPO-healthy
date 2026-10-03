package com.heytap.health.protocol.workout;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.yzl;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class WorkoutProto$sport_record_intensity_multi_cell extends GeneratedMessageLite<WorkoutProto$sport_record_intensity_multi_cell, Builder> implements WorkoutProto$sport_record_intensity_multi_cellOrBuilder {
    public static final int DATA_FIELD_NUMBER = 2;
    private static final WorkoutProto$sport_record_intensity_multi_cell DEFAULT_INSTANCE;
    public static final int OPERATION_TYPE_FIELD_NUMBER = 1;
    private static volatile Parser<WorkoutProto$sport_record_intensity_multi_cell> PARSER;
    private Internal.ProtobufList<WorkoutProto$sport_record_intensity_cell> data_ = GeneratedMessageLite.emptyProtobufList();
    private int operationType_;

    public static final class Builder extends GeneratedMessageLite.Builder<WorkoutProto$sport_record_intensity_multi_cell, Builder> implements WorkoutProto$sport_record_intensity_multi_cellOrBuilder {
        public Builder addAllData(Iterable<? extends WorkoutProto$sport_record_intensity_cell> iterable) {
            copyOnWrite();
            ((WorkoutProto$sport_record_intensity_multi_cell) this.instance).addAllData(iterable);
            return this;
        }

        public Builder addData(WorkoutProto$sport_record_intensity_cell workoutProto$sport_record_intensity_cell) {
            copyOnWrite();
            ((WorkoutProto$sport_record_intensity_multi_cell) this.instance).addData(workoutProto$sport_record_intensity_cell);
            return this;
        }

        public Builder clearData() {
            copyOnWrite();
            ((WorkoutProto$sport_record_intensity_multi_cell) this.instance).clearData();
            return this;
        }

        public Builder clearOperationType() {
            copyOnWrite();
            ((WorkoutProto$sport_record_intensity_multi_cell) this.instance).clearOperationType();
            return this;
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$sport_record_intensity_multi_cellOrBuilder
        public WorkoutProto$sport_record_intensity_cell getData(int i) {
            return ((WorkoutProto$sport_record_intensity_multi_cell) this.instance).getData(i);
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$sport_record_intensity_multi_cellOrBuilder
        public int getDataCount() {
            return ((WorkoutProto$sport_record_intensity_multi_cell) this.instance).getDataCount();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$sport_record_intensity_multi_cellOrBuilder
        public List<WorkoutProto$sport_record_intensity_cell> getDataList() {
            return Collections.unmodifiableList(((WorkoutProto$sport_record_intensity_multi_cell) this.instance).getDataList());
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$sport_record_intensity_multi_cellOrBuilder
        public int getOperationType() {
            return ((WorkoutProto$sport_record_intensity_multi_cell) this.instance).getOperationType();
        }

        public Builder removeData(int i) {
            copyOnWrite();
            ((WorkoutProto$sport_record_intensity_multi_cell) this.instance).removeData(i);
            return this;
        }

        public Builder setData(int i, WorkoutProto$sport_record_intensity_cell workoutProto$sport_record_intensity_cell) {
            copyOnWrite();
            ((WorkoutProto$sport_record_intensity_multi_cell) this.instance).setData(i, workoutProto$sport_record_intensity_cell);
            return this;
        }

        public Builder setOperationType(int i) {
            copyOnWrite();
            ((WorkoutProto$sport_record_intensity_multi_cell) this.instance).setOperationType(i);
            return this;
        }

        private Builder() {
            super(WorkoutProto$sport_record_intensity_multi_cell.DEFAULT_INSTANCE);
        }

        public Builder addData(int i, WorkoutProto$sport_record_intensity_cell workoutProto$sport_record_intensity_cell) {
            copyOnWrite();
            ((WorkoutProto$sport_record_intensity_multi_cell) this.instance).addData(i, workoutProto$sport_record_intensity_cell);
            return this;
        }

        public Builder setData(int i, WorkoutProto$sport_record_intensity_cell.Builder builder) {
            copyOnWrite();
            ((WorkoutProto$sport_record_intensity_multi_cell) this.instance).setData(i, builder.build());
            return this;
        }

        public Builder addData(WorkoutProto$sport_record_intensity_cell.Builder builder) {
            copyOnWrite();
            ((WorkoutProto$sport_record_intensity_multi_cell) this.instance).addData(builder.build());
            return this;
        }

        public Builder addData(int i, WorkoutProto$sport_record_intensity_cell.Builder builder) {
            copyOnWrite();
            ((WorkoutProto$sport_record_intensity_multi_cell) this.instance).addData(i, builder.build());
            return this;
        }
    }

    static {
        WorkoutProto$sport_record_intensity_multi_cell workoutProto$sport_record_intensity_multi_cell = new WorkoutProto$sport_record_intensity_multi_cell();
        DEFAULT_INSTANCE = workoutProto$sport_record_intensity_multi_cell;
        GeneratedMessageLite.registerDefaultInstance(WorkoutProto$sport_record_intensity_multi_cell.class, workoutProto$sport_record_intensity_multi_cell);
    }

    private WorkoutProto$sport_record_intensity_multi_cell() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllData(Iterable<? extends WorkoutProto$sport_record_intensity_cell> iterable) {
        ensureDataIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.data_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addData(WorkoutProto$sport_record_intensity_cell workoutProto$sport_record_intensity_cell) {
        workoutProto$sport_record_intensity_cell.getClass();
        ensureDataIsMutable();
        this.data_.add(workoutProto$sport_record_intensity_cell);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearData() {
        this.data_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOperationType() {
        this.operationType_ = 0;
    }

    private void ensureDataIsMutable() {
        Internal.ProtobufList<WorkoutProto$sport_record_intensity_cell> protobufList = this.data_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.data_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static WorkoutProto$sport_record_intensity_multi_cell getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WorkoutProto$sport_record_intensity_multi_cell parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$sport_record_intensity_multi_cell) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$sport_record_intensity_multi_cell parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WorkoutProto$sport_record_intensity_multi_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WorkoutProto$sport_record_intensity_multi_cell> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeData(int i) {
        ensureDataIsMutable();
        this.data_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setData(int i, WorkoutProto$sport_record_intensity_cell workoutProto$sport_record_intensity_cell) {
        workoutProto$sport_record_intensity_cell.getClass();
        ensureDataIsMutable();
        this.data_.set(i, workoutProto$sport_record_intensity_cell);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOperationType(int i) {
        this.operationType_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yzl.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WorkoutProto$sport_record_intensity_multi_cell();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"operationType_", "data_", WorkoutProto$sport_record_intensity_cell.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WorkoutProto$sport_record_intensity_multi_cell> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WorkoutProto$sport_record_intensity_multi_cell.class) {
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

    @Override // com.heytap.health.protocol.workout.WorkoutProto$sport_record_intensity_multi_cellOrBuilder
    public WorkoutProto$sport_record_intensity_cell getData(int i) {
        return this.data_.get(i);
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$sport_record_intensity_multi_cellOrBuilder
    public int getDataCount() {
        return this.data_.size();
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$sport_record_intensity_multi_cellOrBuilder
    public List<WorkoutProto$sport_record_intensity_cell> getDataList() {
        return this.data_;
    }

    public WorkoutProto$sport_record_intensity_cellOrBuilder getDataOrBuilder(int i) {
        return this.data_.get(i);
    }

    public List<? extends WorkoutProto$sport_record_intensity_cellOrBuilder> getDataOrBuilderList() {
        return this.data_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$sport_record_intensity_multi_cellOrBuilder
    public int getOperationType() {
        return this.operationType_;
    }

    public static Builder newBuilder(WorkoutProto$sport_record_intensity_multi_cell workoutProto$sport_record_intensity_multi_cell) {
        return DEFAULT_INSTANCE.createBuilder(workoutProto$sport_record_intensity_multi_cell);
    }

    public static WorkoutProto$sport_record_intensity_multi_cell parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$sport_record_intensity_multi_cell) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$sport_record_intensity_multi_cell parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$sport_record_intensity_multi_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WorkoutProto$sport_record_intensity_multi_cell parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WorkoutProto$sport_record_intensity_multi_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addData(int i, WorkoutProto$sport_record_intensity_cell workoutProto$sport_record_intensity_cell) {
        workoutProto$sport_record_intensity_cell.getClass();
        ensureDataIsMutable();
        this.data_.add(i, workoutProto$sport_record_intensity_cell);
    }

    public static WorkoutProto$sport_record_intensity_multi_cell parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$sport_record_intensity_multi_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WorkoutProto$sport_record_intensity_multi_cell parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WorkoutProto$sport_record_intensity_multi_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WorkoutProto$sport_record_intensity_multi_cell parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$sport_record_intensity_multi_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WorkoutProto$sport_record_intensity_multi_cell parseFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$sport_record_intensity_multi_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$sport_record_intensity_multi_cell parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$sport_record_intensity_multi_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$sport_record_intensity_multi_cell parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WorkoutProto$sport_record_intensity_multi_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WorkoutProto$sport_record_intensity_multi_cell parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$sport_record_intensity_multi_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
