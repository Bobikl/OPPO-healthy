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
public final class WorkoutProto$SportsPageData extends GeneratedMessageLite<WorkoutProto$SportsPageData, Builder> implements WorkoutProto$SportsPageDataOrBuilder {
    public static final int DATAITEM_FIELD_NUMBER = 2;
    private static final WorkoutProto$SportsPageData DEFAULT_INSTANCE;
    public static final int PAGENUM_FIELD_NUMBER = 1;
    private static volatile Parser<WorkoutProto$SportsPageData> PARSER;
    private Internal.ProtobufList<WorkoutProto$SportsDataItem> dataItem_ = GeneratedMessageLite.emptyProtobufList();
    private int pageNum_;

    public static final class Builder extends GeneratedMessageLite.Builder<WorkoutProto$SportsPageData, Builder> implements WorkoutProto$SportsPageDataOrBuilder {
        public Builder addAllDataItem(Iterable<? extends WorkoutProto$SportsDataItem> iterable) {
            copyOnWrite();
            ((WorkoutProto$SportsPageData) this.instance).addAllDataItem(iterable);
            return this;
        }

        public Builder addDataItem(WorkoutProto$SportsDataItem workoutProto$SportsDataItem) {
            copyOnWrite();
            ((WorkoutProto$SportsPageData) this.instance).addDataItem(workoutProto$SportsDataItem);
            return this;
        }

        public Builder clearDataItem() {
            copyOnWrite();
            ((WorkoutProto$SportsPageData) this.instance).clearDataItem();
            return this;
        }

        public Builder clearPageNum() {
            copyOnWrite();
            ((WorkoutProto$SportsPageData) this.instance).clearPageNum();
            return this;
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$SportsPageDataOrBuilder
        public WorkoutProto$SportsDataItem getDataItem(int i) {
            return ((WorkoutProto$SportsPageData) this.instance).getDataItem(i);
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$SportsPageDataOrBuilder
        public int getDataItemCount() {
            return ((WorkoutProto$SportsPageData) this.instance).getDataItemCount();
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$SportsPageDataOrBuilder
        public List<WorkoutProto$SportsDataItem> getDataItemList() {
            return Collections.unmodifiableList(((WorkoutProto$SportsPageData) this.instance).getDataItemList());
        }

        @Override // com.heytap.health.protocol.workout.WorkoutProto$SportsPageDataOrBuilder
        public int getPageNum() {
            return ((WorkoutProto$SportsPageData) this.instance).getPageNum();
        }

        public Builder removeDataItem(int i) {
            copyOnWrite();
            ((WorkoutProto$SportsPageData) this.instance).removeDataItem(i);
            return this;
        }

        public Builder setDataItem(int i, WorkoutProto$SportsDataItem workoutProto$SportsDataItem) {
            copyOnWrite();
            ((WorkoutProto$SportsPageData) this.instance).setDataItem(i, workoutProto$SportsDataItem);
            return this;
        }

        public Builder setPageNum(int i) {
            copyOnWrite();
            ((WorkoutProto$SportsPageData) this.instance).setPageNum(i);
            return this;
        }

        private Builder() {
            super(WorkoutProto$SportsPageData.DEFAULT_INSTANCE);
        }

        public Builder addDataItem(int i, WorkoutProto$SportsDataItem workoutProto$SportsDataItem) {
            copyOnWrite();
            ((WorkoutProto$SportsPageData) this.instance).addDataItem(i, workoutProto$SportsDataItem);
            return this;
        }

        public Builder setDataItem(int i, WorkoutProto$SportsDataItem.Builder builder) {
            copyOnWrite();
            ((WorkoutProto$SportsPageData) this.instance).setDataItem(i, builder.build());
            return this;
        }

        public Builder addDataItem(WorkoutProto$SportsDataItem.Builder builder) {
            copyOnWrite();
            ((WorkoutProto$SportsPageData) this.instance).addDataItem(builder.build());
            return this;
        }

        public Builder addDataItem(int i, WorkoutProto$SportsDataItem.Builder builder) {
            copyOnWrite();
            ((WorkoutProto$SportsPageData) this.instance).addDataItem(i, builder.build());
            return this;
        }
    }

    static {
        WorkoutProto$SportsPageData workoutProto$SportsPageData = new WorkoutProto$SportsPageData();
        DEFAULT_INSTANCE = workoutProto$SportsPageData;
        GeneratedMessageLite.registerDefaultInstance(WorkoutProto$SportsPageData.class, workoutProto$SportsPageData);
    }

    private WorkoutProto$SportsPageData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDataItem(Iterable<? extends WorkoutProto$SportsDataItem> iterable) {
        ensureDataItemIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.dataItem_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDataItem(WorkoutProto$SportsDataItem workoutProto$SportsDataItem) {
        workoutProto$SportsDataItem.getClass();
        ensureDataItemIsMutable();
        this.dataItem_.add(workoutProto$SportsDataItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDataItem() {
        this.dataItem_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPageNum() {
        this.pageNum_ = 0;
    }

    private void ensureDataItemIsMutable() {
        Internal.ProtobufList<WorkoutProto$SportsDataItem> protobufList = this.dataItem_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.dataItem_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static WorkoutProto$SportsPageData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WorkoutProto$SportsPageData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$SportsPageData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$SportsPageData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WorkoutProto$SportsPageData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WorkoutProto$SportsPageData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDataItem(int i) {
        ensureDataItemIsMutable();
        this.dataItem_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDataItem(int i, WorkoutProto$SportsDataItem workoutProto$SportsDataItem) {
        workoutProto$SportsDataItem.getClass();
        ensureDataItemIsMutable();
        this.dataItem_.set(i, workoutProto$SportsDataItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageNum(int i) {
        this.pageNum_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yzl.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WorkoutProto$SportsPageData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0002\u001b", new Object[]{"pageNum_", "dataItem_", WorkoutProto$SportsDataItem.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WorkoutProto$SportsPageData> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WorkoutProto$SportsPageData.class) {
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

    @Override // com.heytap.health.protocol.workout.WorkoutProto$SportsPageDataOrBuilder
    public WorkoutProto$SportsDataItem getDataItem(int i) {
        return this.dataItem_.get(i);
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$SportsPageDataOrBuilder
    public int getDataItemCount() {
        return this.dataItem_.size();
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$SportsPageDataOrBuilder
    public List<WorkoutProto$SportsDataItem> getDataItemList() {
        return this.dataItem_;
    }

    public WorkoutProto$SportsDataItemOrBuilder getDataItemOrBuilder(int i) {
        return this.dataItem_.get(i);
    }

    public List<? extends WorkoutProto$SportsDataItemOrBuilder> getDataItemOrBuilderList() {
        return this.dataItem_;
    }

    @Override // com.heytap.health.protocol.workout.WorkoutProto$SportsPageDataOrBuilder
    public int getPageNum() {
        return this.pageNum_;
    }

    public static Builder newBuilder(WorkoutProto$SportsPageData workoutProto$SportsPageData) {
        return DEFAULT_INSTANCE.createBuilder(workoutProto$SportsPageData);
    }

    public static WorkoutProto$SportsPageData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$SportsPageData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$SportsPageData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$SportsPageData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WorkoutProto$SportsPageData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WorkoutProto$SportsPageData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDataItem(int i, WorkoutProto$SportsDataItem workoutProto$SportsDataItem) {
        workoutProto$SportsDataItem.getClass();
        ensureDataItemIsMutable();
        this.dataItem_.add(i, workoutProto$SportsDataItem);
    }

    public static WorkoutProto$SportsPageData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$SportsPageData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WorkoutProto$SportsPageData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WorkoutProto$SportsPageData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WorkoutProto$SportsPageData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WorkoutProto$SportsPageData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WorkoutProto$SportsPageData parseFrom(InputStream inputStream) throws IOException {
        return (WorkoutProto$SportsPageData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WorkoutProto$SportsPageData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$SportsPageData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WorkoutProto$SportsPageData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WorkoutProto$SportsPageData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WorkoutProto$SportsPageData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WorkoutProto$SportsPageData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
