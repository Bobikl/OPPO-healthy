package com.heytap.health.protocol.fitness;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.model.ko7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes17.dex */
public final class FitnessProtoV2$ActivityDataV2 extends GeneratedMessageLite<FitnessProtoV2$ActivityDataV2, Builder> implements FitnessProtoV2$ActivityDataV2OrBuilder {
    public static final int DATA_FIELD_NUMBER = 4;
    private static final FitnessProtoV2$ActivityDataV2 DEFAULT_INSTANCE;
    public static final int END_TIME_FIELD_NUMBER = 3;
    public static final int HASMORE_FIELD_NUMBER = 1;
    private static volatile Parser<FitnessProtoV2$ActivityDataV2> PARSER = null;
    public static final int START_TIME_FIELD_NUMBER = 2;
    private Internal.ProtobufList<FitnessProto$ActivityItem> data_ = GeneratedMessageLite.emptyProtobufList();
    private int endTime_;
    private boolean hasMore_;
    private int startTime_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProtoV2$ActivityDataV2, Builder> implements FitnessProtoV2$ActivityDataV2OrBuilder {
        public Builder addAllData(Iterable<? extends FitnessProto$ActivityItem> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$ActivityDataV2) ((GeneratedMessageLite.Builder) this).instance).addAllData(iterable);
            return this;
        }

        public Builder addData(FitnessProto$ActivityItem fitnessProto$ActivityItem) {
            copyOnWrite();
            ((FitnessProtoV2$ActivityDataV2) ((GeneratedMessageLite.Builder) this).instance).addData(fitnessProto$ActivityItem);
            return this;
        }

        public Builder clearData() {
            copyOnWrite();
            ((FitnessProtoV2$ActivityDataV2) ((GeneratedMessageLite.Builder) this).instance).clearData();
            return this;
        }

        public Builder clearEndTime() {
            copyOnWrite();
            ((FitnessProtoV2$ActivityDataV2) ((GeneratedMessageLite.Builder) this).instance).clearEndTime();
            return this;
        }

        public Builder clearHasMore() {
            copyOnWrite();
            ((FitnessProtoV2$ActivityDataV2) ((GeneratedMessageLite.Builder) this).instance).clearHasMore();
            return this;
        }

        public Builder clearStartTime() {
            copyOnWrite();
            ((FitnessProtoV2$ActivityDataV2) ((GeneratedMessageLite.Builder) this).instance).clearStartTime();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$ActivityDataV2OrBuilder
        public FitnessProto$ActivityItem getData(int i) {
            return ((FitnessProtoV2$ActivityDataV2) ((GeneratedMessageLite.Builder) this).instance).getData(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$ActivityDataV2OrBuilder
        public int getDataCount() {
            return ((FitnessProtoV2$ActivityDataV2) ((GeneratedMessageLite.Builder) this).instance).getDataCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$ActivityDataV2OrBuilder
        public List<FitnessProto$ActivityItem> getDataList() {
            return Collections.unmodifiableList(((FitnessProtoV2$ActivityDataV2) ((GeneratedMessageLite.Builder) this).instance).getDataList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$ActivityDataV2OrBuilder
        public int getEndTime() {
            return ((FitnessProtoV2$ActivityDataV2) ((GeneratedMessageLite.Builder) this).instance).getEndTime();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$ActivityDataV2OrBuilder
        public boolean getHasMore() {
            return ((FitnessProtoV2$ActivityDataV2) ((GeneratedMessageLite.Builder) this).instance).getHasMore();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$ActivityDataV2OrBuilder
        public int getStartTime() {
            return ((FitnessProtoV2$ActivityDataV2) ((GeneratedMessageLite.Builder) this).instance).getStartTime();
        }

        public Builder removeData(int i) {
            copyOnWrite();
            ((FitnessProtoV2$ActivityDataV2) ((GeneratedMessageLite.Builder) this).instance).removeData(i);
            return this;
        }

        public Builder setData(int i, FitnessProto$ActivityItem fitnessProto$ActivityItem) {
            copyOnWrite();
            ((FitnessProtoV2$ActivityDataV2) ((GeneratedMessageLite.Builder) this).instance).setData(i, fitnessProto$ActivityItem);
            return this;
        }

        public Builder setEndTime(int i) {
            copyOnWrite();
            ((FitnessProtoV2$ActivityDataV2) ((GeneratedMessageLite.Builder) this).instance).setEndTime(i);
            return this;
        }

        public Builder setHasMore(boolean z) {
            copyOnWrite();
            ((FitnessProtoV2$ActivityDataV2) ((GeneratedMessageLite.Builder) this).instance).setHasMore(z);
            return this;
        }

        public Builder setStartTime(int i) {
            copyOnWrite();
            ((FitnessProtoV2$ActivityDataV2) ((GeneratedMessageLite.Builder) this).instance).setStartTime(i);
            return this;
        }

        private Builder() {
            super(FitnessProtoV2$ActivityDataV2.DEFAULT_INSTANCE);
        }

        public Builder addData(int i, FitnessProto$ActivityItem fitnessProto$ActivityItem) {
            copyOnWrite();
            ((FitnessProtoV2$ActivityDataV2) ((GeneratedMessageLite.Builder) this).instance).addData(i, fitnessProto$ActivityItem);
            return this;
        }

        public Builder setData(int i, FitnessProto$ActivityItem.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$ActivityDataV2) ((GeneratedMessageLite.Builder) this).instance).setData(i, (FitnessProto$ActivityItem) builder.build());
            return this;
        }

        public Builder addData(FitnessProto$ActivityItem.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$ActivityDataV2) ((GeneratedMessageLite.Builder) this).instance).addData((FitnessProto$ActivityItem) builder.build());
            return this;
        }

        public Builder addData(int i, FitnessProto$ActivityItem.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$ActivityDataV2) ((GeneratedMessageLite.Builder) this).instance).addData(i, (FitnessProto$ActivityItem) builder.build());
            return this;
        }
    }

    static {
        FitnessProtoV2$ActivityDataV2 fitnessProtoV2$ActivityDataV2 = new FitnessProtoV2$ActivityDataV2();
        DEFAULT_INSTANCE = fitnessProtoV2$ActivityDataV2;
        GeneratedMessageLite.registerDefaultInstance(FitnessProtoV2$ActivityDataV2.class, fitnessProtoV2$ActivityDataV2);
    }

    private FitnessProtoV2$ActivityDataV2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllData(Iterable<? extends FitnessProto$ActivityItem> iterable) {
        ensureDataIsMutable();
        AbstractMessageLite.addAll(iterable, this.data_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addData(FitnessProto$ActivityItem fitnessProto$ActivityItem) {
        fitnessProto$ActivityItem.getClass();
        ensureDataIsMutable();
        this.data_.add(fitnessProto$ActivityItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearData() {
        this.data_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndTime() {
        this.endTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasMore() {
        this.hasMore_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTime() {
        this.startTime_ = 0;
    }

    private void ensureDataIsMutable() {
        Internal.ProtobufList<FitnessProto$ActivityItem> protobufList = this.data_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.data_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static FitnessProtoV2$ActivityDataV2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProtoV2$ActivityDataV2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$ActivityDataV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$ActivityDataV2 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$ActivityDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProtoV2$ActivityDataV2> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeData(int i) {
        ensureDataIsMutable();
        this.data_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setData(int i, FitnessProto$ActivityItem fitnessProto$ActivityItem) {
        fitnessProto$ActivityItem.getClass();
        ensureDataIsMutable();
        this.data_.set(i, fitnessProto$ActivityItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndTime(int i) {
        this.endTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasMore(boolean z) {
        this.hasMore_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTime(int i) {
        this.startTime_ = i;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = ko7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProtoV2$ActivityDataV2();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0007\u0002\u000b\u0003\u000b\u0004\u001b", new Object[]{"hasMore_", "startTime_", "endTime_", "data_", FitnessProto$ActivityItem.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProtoV2$ActivityDataV2.class) {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
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

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$ActivityDataV2OrBuilder
    public FitnessProto$ActivityItem getData(int i) {
        return (FitnessProto$ActivityItem) this.data_.get(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$ActivityDataV2OrBuilder
    public int getDataCount() {
        return this.data_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$ActivityDataV2OrBuilder
    public List<FitnessProto$ActivityItem> getDataList() {
        return this.data_;
    }

    public FitnessProto$ActivityItemOrBuilder getDataOrBuilder(int i) {
        return (FitnessProto$ActivityItemOrBuilder) this.data_.get(i);
    }

    public List<? extends FitnessProto$ActivityItemOrBuilder> getDataOrBuilderList() {
        return this.data_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$ActivityDataV2OrBuilder
    public int getEndTime() {
        return this.endTime_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$ActivityDataV2OrBuilder
    public boolean getHasMore() {
        return this.hasMore_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$ActivityDataV2OrBuilder
    public int getStartTime() {
        return this.startTime_;
    }

    public static Builder newBuilder(FitnessProtoV2$ActivityDataV2 fitnessProtoV2$ActivityDataV2) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(fitnessProtoV2$ActivityDataV2);
    }

    public static FitnessProtoV2$ActivityDataV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$ActivityDataV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$ActivityDataV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$ActivityDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProtoV2$ActivityDataV2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$ActivityDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addData(int i, FitnessProto$ActivityItem fitnessProto$ActivityItem) {
        fitnessProto$ActivityItem.getClass();
        ensureDataIsMutable();
        this.data_.add(i, fitnessProto$ActivityItem);
    }

    public static FitnessProtoV2$ActivityDataV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$ActivityDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProtoV2$ActivityDataV2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$ActivityDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProtoV2$ActivityDataV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$ActivityDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProtoV2$ActivityDataV2 parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$ActivityDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$ActivityDataV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$ActivityDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$ActivityDataV2 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProtoV2$ActivityDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProtoV2$ActivityDataV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$ActivityDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}