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
public final class FitnessProtoV2$SleepStatisticsDataV2 extends GeneratedMessageLite<FitnessProtoV2$SleepStatisticsDataV2, Builder> implements FitnessProtoV2$SleepStatisticsDataV2OrBuilder {
    public static final int DATA_FIELD_NUMBER = 4;
    private static final FitnessProtoV2$SleepStatisticsDataV2 DEFAULT_INSTANCE;
    public static final int END_TIME_FIELD_NUMBER = 3;
    public static final int HASMORE_FIELD_NUMBER = 1;
    private static volatile Parser<FitnessProtoV2$SleepStatisticsDataV2> PARSER = null;
    public static final int START_TIME_FIELD_NUMBER = 2;
    private Internal.ProtobufList<FitnessProtoV2$SleepStatisticsItemDataV2> data_ = GeneratedMessageLite.emptyProtobufList();
    private int endTime_;
    private boolean hasMore_;
    private int startTime_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProtoV2$SleepStatisticsDataV2, Builder> implements FitnessProtoV2$SleepStatisticsDataV2OrBuilder {
        public Builder addAllData(Iterable<? extends FitnessProtoV2$SleepStatisticsItemDataV2> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsDataV2) ((GeneratedMessageLite.Builder) this).instance).addAllData(iterable);
            return this;
        }

        public Builder addData(FitnessProtoV2$SleepStatisticsItemDataV2 fitnessProtoV2$SleepStatisticsItemDataV2) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsDataV2) ((GeneratedMessageLite.Builder) this).instance).addData(fitnessProtoV2$SleepStatisticsItemDataV2);
            return this;
        }

        public Builder clearData() {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsDataV2) ((GeneratedMessageLite.Builder) this).instance).clearData();
            return this;
        }

        public Builder clearEndTime() {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsDataV2) ((GeneratedMessageLite.Builder) this).instance).clearEndTime();
            return this;
        }

        public Builder clearHasMore() {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsDataV2) ((GeneratedMessageLite.Builder) this).instance).clearHasMore();
            return this;
        }

        public Builder clearStartTime() {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsDataV2) ((GeneratedMessageLite.Builder) this).instance).clearStartTime();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsDataV2OrBuilder
        public FitnessProtoV2$SleepStatisticsItemDataV2 getData(int i) {
            return ((FitnessProtoV2$SleepStatisticsDataV2) ((GeneratedMessageLite.Builder) this).instance).getData(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsDataV2OrBuilder
        public int getDataCount() {
            return ((FitnessProtoV2$SleepStatisticsDataV2) ((GeneratedMessageLite.Builder) this).instance).getDataCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsDataV2OrBuilder
        public List<FitnessProtoV2$SleepStatisticsItemDataV2> getDataList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SleepStatisticsDataV2) ((GeneratedMessageLite.Builder) this).instance).getDataList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsDataV2OrBuilder
        public int getEndTime() {
            return ((FitnessProtoV2$SleepStatisticsDataV2) ((GeneratedMessageLite.Builder) this).instance).getEndTime();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsDataV2OrBuilder
        public boolean getHasMore() {
            return ((FitnessProtoV2$SleepStatisticsDataV2) ((GeneratedMessageLite.Builder) this).instance).getHasMore();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsDataV2OrBuilder
        public int getStartTime() {
            return ((FitnessProtoV2$SleepStatisticsDataV2) ((GeneratedMessageLite.Builder) this).instance).getStartTime();
        }

        public Builder removeData(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsDataV2) ((GeneratedMessageLite.Builder) this).instance).removeData(i);
            return this;
        }

        public Builder setData(int i, FitnessProtoV2$SleepStatisticsItemDataV2 fitnessProtoV2$SleepStatisticsItemDataV2) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsDataV2) ((GeneratedMessageLite.Builder) this).instance).setData(i, fitnessProtoV2$SleepStatisticsItemDataV2);
            return this;
        }

        public Builder setEndTime(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsDataV2) ((GeneratedMessageLite.Builder) this).instance).setEndTime(i);
            return this;
        }

        public Builder setHasMore(boolean z) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsDataV2) ((GeneratedMessageLite.Builder) this).instance).setHasMore(z);
            return this;
        }

        public Builder setStartTime(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsDataV2) ((GeneratedMessageLite.Builder) this).instance).setStartTime(i);
            return this;
        }

        private Builder() {
            super(FitnessProtoV2$SleepStatisticsDataV2.DEFAULT_INSTANCE);
        }

        public Builder addData(int i, FitnessProtoV2$SleepStatisticsItemDataV2 fitnessProtoV2$SleepStatisticsItemDataV2) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsDataV2) ((GeneratedMessageLite.Builder) this).instance).addData(i, fitnessProtoV2$SleepStatisticsItemDataV2);
            return this;
        }

        public Builder setData(int i, FitnessProtoV2$SleepStatisticsItemDataV2.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsDataV2) ((GeneratedMessageLite.Builder) this).instance).setData(i, (FitnessProtoV2$SleepStatisticsItemDataV2) builder.build());
            return this;
        }

        public Builder addData(FitnessProtoV2$SleepStatisticsItemDataV2.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsDataV2) ((GeneratedMessageLite.Builder) this).instance).addData((FitnessProtoV2$SleepStatisticsItemDataV2) builder.build());
            return this;
        }

        public Builder addData(int i, FitnessProtoV2$SleepStatisticsItemDataV2.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsDataV2) ((GeneratedMessageLite.Builder) this).instance).addData(i, (FitnessProtoV2$SleepStatisticsItemDataV2) builder.build());
            return this;
        }
    }

    static {
        FitnessProtoV2$SleepStatisticsDataV2 fitnessProtoV2$SleepStatisticsDataV2 = new FitnessProtoV2$SleepStatisticsDataV2();
        DEFAULT_INSTANCE = fitnessProtoV2$SleepStatisticsDataV2;
        GeneratedMessageLite.registerDefaultInstance(FitnessProtoV2$SleepStatisticsDataV2.class, fitnessProtoV2$SleepStatisticsDataV2);
    }

    private FitnessProtoV2$SleepStatisticsDataV2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllData(Iterable<? extends FitnessProtoV2$SleepStatisticsItemDataV2> iterable) {
        ensureDataIsMutable();
        AbstractMessageLite.addAll(iterable, this.data_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addData(FitnessProtoV2$SleepStatisticsItemDataV2 fitnessProtoV2$SleepStatisticsItemDataV2) {
        fitnessProtoV2$SleepStatisticsItemDataV2.getClass();
        ensureDataIsMutable();
        this.data_.add(fitnessProtoV2$SleepStatisticsItemDataV2);
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
        Internal.ProtobufList<FitnessProtoV2$SleepStatisticsItemDataV2> protobufList = this.data_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.data_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static FitnessProtoV2$SleepStatisticsDataV2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProtoV2$SleepStatisticsDataV2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$SleepStatisticsDataV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$SleepStatisticsDataV2 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SleepStatisticsDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProtoV2$SleepStatisticsDataV2> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeData(int i) {
        ensureDataIsMutable();
        this.data_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setData(int i, FitnessProtoV2$SleepStatisticsItemDataV2 fitnessProtoV2$SleepStatisticsItemDataV2) {
        fitnessProtoV2$SleepStatisticsItemDataV2.getClass();
        ensureDataIsMutable();
        this.data_.set(i, fitnessProtoV2$SleepStatisticsItemDataV2);
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
                return new FitnessProtoV2$SleepStatisticsDataV2();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0007\u0002\u000b\u0003\u000b\u0004\u001b", new Object[]{"hasMore_", "startTime_", "endTime_", "data_", FitnessProtoV2$SleepStatisticsItemDataV2.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProtoV2$SleepStatisticsDataV2.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsDataV2OrBuilder
    public FitnessProtoV2$SleepStatisticsItemDataV2 getData(int i) {
        return (FitnessProtoV2$SleepStatisticsItemDataV2) this.data_.get(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsDataV2OrBuilder
    public int getDataCount() {
        return this.data_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsDataV2OrBuilder
    public List<FitnessProtoV2$SleepStatisticsItemDataV2> getDataList() {
        return this.data_;
    }

    public FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder getDataOrBuilder(int i) {
        return (FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder) this.data_.get(i);
    }

    public List<? extends FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder> getDataOrBuilderList() {
        return this.data_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsDataV2OrBuilder
    public int getEndTime() {
        return this.endTime_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsDataV2OrBuilder
    public boolean getHasMore() {
        return this.hasMore_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsDataV2OrBuilder
    public int getStartTime() {
        return this.startTime_;
    }

    public static Builder newBuilder(FitnessProtoV2$SleepStatisticsDataV2 fitnessProtoV2$SleepStatisticsDataV2) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(fitnessProtoV2$SleepStatisticsDataV2);
    }

    public static FitnessProtoV2$SleepStatisticsDataV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SleepStatisticsDataV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SleepStatisticsDataV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SleepStatisticsDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProtoV2$SleepStatisticsDataV2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SleepStatisticsDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addData(int i, FitnessProtoV2$SleepStatisticsItemDataV2 fitnessProtoV2$SleepStatisticsItemDataV2) {
        fitnessProtoV2$SleepStatisticsItemDataV2.getClass();
        ensureDataIsMutable();
        this.data_.add(i, fitnessProtoV2$SleepStatisticsItemDataV2);
    }

    public static FitnessProtoV2$SleepStatisticsDataV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SleepStatisticsDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProtoV2$SleepStatisticsDataV2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SleepStatisticsDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProtoV2$SleepStatisticsDataV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SleepStatisticsDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProtoV2$SleepStatisticsDataV2 parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$SleepStatisticsDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$SleepStatisticsDataV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SleepStatisticsDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SleepStatisticsDataV2 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProtoV2$SleepStatisticsDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProtoV2$SleepStatisticsDataV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SleepStatisticsDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}