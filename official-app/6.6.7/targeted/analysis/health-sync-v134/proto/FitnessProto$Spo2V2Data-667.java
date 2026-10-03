package com.heytap.health.protocol.fitness;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.model.pi7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes17.dex */
public final class FitnessProto$Spo2V2Data extends GeneratedMessageLite<FitnessProto$Spo2V2Data, Builder> implements FitnessProto$Spo2V2DataOrBuilder {
    private static final FitnessProto$Spo2V2Data DEFAULT_INSTANCE;
    public static final int INDEX_FIELD_NUMBER = 1;
    public static final int MINUTE_OFFSET_FIELD_NUMBER = 3;
    private static volatile Parser<FitnessProto$Spo2V2Data> PARSER = null;
    public static final int SPO2_RD_FIELD_NUMBER = 5;
    public static final int START_TIME_FIELD_NUMBER = 2;
    public static final int TYPE_SECOND_OFFSET_FIELD_NUMBER = 4;
    private int index_;
    private int startTime_;
    private int minuteOffsetMemoizedSerializedSize = -1;
    private Internal.IntList minuteOffset_ = GeneratedMessageLite.emptyIntList();
    private Internal.ProtobufList<ByteString> typeSecondOffset_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<ByteString> spo2Rd_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$Spo2V2Data, Builder> implements FitnessProto$Spo2V2DataOrBuilder {
        public Builder addAllMinuteOffset(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProto$Spo2V2Data) ((GeneratedMessageLite.Builder) this).instance).addAllMinuteOffset(iterable);
            return this;
        }

        public Builder addAllSpo2Rd(Iterable<? extends ByteString> iterable) {
            copyOnWrite();
            ((FitnessProto$Spo2V2Data) ((GeneratedMessageLite.Builder) this).instance).addAllSpo2Rd(iterable);
            return this;
        }

        public Builder addAllTypeSecondOffset(Iterable<? extends ByteString> iterable) {
            copyOnWrite();
            ((FitnessProto$Spo2V2Data) ((GeneratedMessageLite.Builder) this).instance).addAllTypeSecondOffset(iterable);
            return this;
        }

        public Builder addMinuteOffset(int i) {
            copyOnWrite();
            ((FitnessProto$Spo2V2Data) ((GeneratedMessageLite.Builder) this).instance).addMinuteOffset(i);
            return this;
        }

        public Builder addSpo2Rd(ByteString byteString) {
            copyOnWrite();
            ((FitnessProto$Spo2V2Data) ((GeneratedMessageLite.Builder) this).instance).addSpo2Rd(byteString);
            return this;
        }

        public Builder addTypeSecondOffset(ByteString byteString) {
            copyOnWrite();
            ((FitnessProto$Spo2V2Data) ((GeneratedMessageLite.Builder) this).instance).addTypeSecondOffset(byteString);
            return this;
        }

        public Builder clearIndex() {
            copyOnWrite();
            ((FitnessProto$Spo2V2Data) ((GeneratedMessageLite.Builder) this).instance).clearIndex();
            return this;
        }

        public Builder clearMinuteOffset() {
            copyOnWrite();
            ((FitnessProto$Spo2V2Data) ((GeneratedMessageLite.Builder) this).instance).clearMinuteOffset();
            return this;
        }

        public Builder clearSpo2Rd() {
            copyOnWrite();
            ((FitnessProto$Spo2V2Data) ((GeneratedMessageLite.Builder) this).instance).clearSpo2Rd();
            return this;
        }

        public Builder clearStartTime() {
            copyOnWrite();
            ((FitnessProto$Spo2V2Data) ((GeneratedMessageLite.Builder) this).instance).clearStartTime();
            return this;
        }

        public Builder clearTypeSecondOffset() {
            copyOnWrite();
            ((FitnessProto$Spo2V2Data) ((GeneratedMessageLite.Builder) this).instance).clearTypeSecondOffset();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$Spo2V2DataOrBuilder
        public int getIndex() {
            return ((FitnessProto$Spo2V2Data) ((GeneratedMessageLite.Builder) this).instance).getIndex();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$Spo2V2DataOrBuilder
        public int getMinuteOffset(int i) {
            return ((FitnessProto$Spo2V2Data) ((GeneratedMessageLite.Builder) this).instance).getMinuteOffset(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$Spo2V2DataOrBuilder
        public int getMinuteOffsetCount() {
            return ((FitnessProto$Spo2V2Data) ((GeneratedMessageLite.Builder) this).instance).getMinuteOffsetCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$Spo2V2DataOrBuilder
        public List<Integer> getMinuteOffsetList() {
            return Collections.unmodifiableList(((FitnessProto$Spo2V2Data) ((GeneratedMessageLite.Builder) this).instance).getMinuteOffsetList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$Spo2V2DataOrBuilder
        public ByteString getSpo2Rd(int i) {
            return ((FitnessProto$Spo2V2Data) ((GeneratedMessageLite.Builder) this).instance).getSpo2Rd(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$Spo2V2DataOrBuilder
        public int getSpo2RdCount() {
            return ((FitnessProto$Spo2V2Data) ((GeneratedMessageLite.Builder) this).instance).getSpo2RdCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$Spo2V2DataOrBuilder
        public List<ByteString> getSpo2RdList() {
            return Collections.unmodifiableList(((FitnessProto$Spo2V2Data) ((GeneratedMessageLite.Builder) this).instance).getSpo2RdList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$Spo2V2DataOrBuilder
        public int getStartTime() {
            return ((FitnessProto$Spo2V2Data) ((GeneratedMessageLite.Builder) this).instance).getStartTime();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$Spo2V2DataOrBuilder
        public ByteString getTypeSecondOffset(int i) {
            return ((FitnessProto$Spo2V2Data) ((GeneratedMessageLite.Builder) this).instance).getTypeSecondOffset(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$Spo2V2DataOrBuilder
        public int getTypeSecondOffsetCount() {
            return ((FitnessProto$Spo2V2Data) ((GeneratedMessageLite.Builder) this).instance).getTypeSecondOffsetCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$Spo2V2DataOrBuilder
        public List<ByteString> getTypeSecondOffsetList() {
            return Collections.unmodifiableList(((FitnessProto$Spo2V2Data) ((GeneratedMessageLite.Builder) this).instance).getTypeSecondOffsetList());
        }

        public Builder setIndex(int i) {
            copyOnWrite();
            ((FitnessProto$Spo2V2Data) ((GeneratedMessageLite.Builder) this).instance).setIndex(i);
            return this;
        }

        public Builder setMinuteOffset(int i, int i2) {
            copyOnWrite();
            ((FitnessProto$Spo2V2Data) ((GeneratedMessageLite.Builder) this).instance).setMinuteOffset(i, i2);
            return this;
        }

        public Builder setSpo2Rd(int i, ByteString byteString) {
            copyOnWrite();
            ((FitnessProto$Spo2V2Data) ((GeneratedMessageLite.Builder) this).instance).setSpo2Rd(i, byteString);
            return this;
        }

        public Builder setStartTime(int i) {
            copyOnWrite();
            ((FitnessProto$Spo2V2Data) ((GeneratedMessageLite.Builder) this).instance).setStartTime(i);
            return this;
        }

        public Builder setTypeSecondOffset(int i, ByteString byteString) {
            copyOnWrite();
            ((FitnessProto$Spo2V2Data) ((GeneratedMessageLite.Builder) this).instance).setTypeSecondOffset(i, byteString);
            return this;
        }

        private Builder() {
            super(FitnessProto$Spo2V2Data.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$Spo2V2Data fitnessProto$Spo2V2Data = new FitnessProto$Spo2V2Data();
        DEFAULT_INSTANCE = fitnessProto$Spo2V2Data;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$Spo2V2Data.class, fitnessProto$Spo2V2Data);
    }

    private FitnessProto$Spo2V2Data() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMinuteOffset(Iterable<? extends Integer> iterable) {
        ensureMinuteOffsetIsMutable();
        AbstractMessageLite.addAll(iterable, this.minuteOffset_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSpo2Rd(Iterable<? extends ByteString> iterable) {
        ensureSpo2RdIsMutable();
        AbstractMessageLite.addAll(iterable, this.spo2Rd_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTypeSecondOffset(Iterable<? extends ByteString> iterable) {
        ensureTypeSecondOffsetIsMutable();
        AbstractMessageLite.addAll(iterable, this.typeSecondOffset_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMinuteOffset(int i) {
        ensureMinuteOffsetIsMutable();
        this.minuteOffset_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSpo2Rd(ByteString byteString) {
        byteString.getClass();
        ensureSpo2RdIsMutable();
        this.spo2Rd_.add(byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTypeSecondOffset(ByteString byteString) {
        byteString.getClass();
        ensureTypeSecondOffsetIsMutable();
        this.typeSecondOffset_.add(byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIndex() {
        this.index_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinuteOffset() {
        this.minuteOffset_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpo2Rd() {
        this.spo2Rd_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTime() {
        this.startTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeSecondOffset() {
        this.typeSecondOffset_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureMinuteOffsetIsMutable() {
        Internal.IntList intList = this.minuteOffset_;
        if (intList.isModifiable()) {
            return;
        }
        this.minuteOffset_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureSpo2RdIsMutable() {
        Internal.ProtobufList<ByteString> protobufList = this.spo2Rd_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.spo2Rd_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureTypeSecondOffsetIsMutable() {
        Internal.ProtobufList<ByteString> protobufList = this.typeSecondOffset_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.typeSecondOffset_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static FitnessProto$Spo2V2Data getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$Spo2V2Data parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$Spo2V2Data) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$Spo2V2Data parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$Spo2V2Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$Spo2V2Data> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndex(int i) {
        this.index_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinuteOffset(int i, int i2) {
        ensureMinuteOffsetIsMutable();
        this.minuteOffset_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpo2Rd(int i, ByteString byteString) {
        byteString.getClass();
        ensureSpo2RdIsMutable();
        this.spo2Rd_.set(i, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTime(int i) {
        this.startTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeSecondOffset(int i, ByteString byteString) {
        byteString.getClass();
        ensureTypeSecondOffsetIsMutable();
        this.typeSecondOffset_.set(i, byteString);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = pi7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$Spo2V2Data();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0003\u0000\u0001\u000b\u0002\u000b\u0003+\u0004\u001c\u0005\u001c", new Object[]{"index_", "startTime_", "minuteOffset_", "typeSecondOffset_", "spo2Rd_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$Spo2V2Data.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$Spo2V2DataOrBuilder
    public int getIndex() {
        return this.index_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$Spo2V2DataOrBuilder
    public int getMinuteOffset(int i) {
        return this.minuteOffset_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$Spo2V2DataOrBuilder
    public int getMinuteOffsetCount() {
        return this.minuteOffset_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$Spo2V2DataOrBuilder
    public List<Integer> getMinuteOffsetList() {
        return this.minuteOffset_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$Spo2V2DataOrBuilder
    public ByteString getSpo2Rd(int i) {
        return (ByteString) this.spo2Rd_.get(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$Spo2V2DataOrBuilder
    public int getSpo2RdCount() {
        return this.spo2Rd_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$Spo2V2DataOrBuilder
    public List<ByteString> getSpo2RdList() {
        return this.spo2Rd_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$Spo2V2DataOrBuilder
    public int getStartTime() {
        return this.startTime_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$Spo2V2DataOrBuilder
    public ByteString getTypeSecondOffset(int i) {
        return (ByteString) this.typeSecondOffset_.get(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$Spo2V2DataOrBuilder
    public int getTypeSecondOffsetCount() {
        return this.typeSecondOffset_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$Spo2V2DataOrBuilder
    public List<ByteString> getTypeSecondOffsetList() {
        return this.typeSecondOffset_;
    }

    public static Builder newBuilder(FitnessProto$Spo2V2Data fitnessProto$Spo2V2Data) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(fitnessProto$Spo2V2Data);
    }

    public static FitnessProto$Spo2V2Data parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$Spo2V2Data) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$Spo2V2Data parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$Spo2V2Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$Spo2V2Data parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$Spo2V2Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$Spo2V2Data parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$Spo2V2Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$Spo2V2Data parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$Spo2V2Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$Spo2V2Data parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$Spo2V2Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$Spo2V2Data parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$Spo2V2Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$Spo2V2Data parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$Spo2V2Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$Spo2V2Data parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$Spo2V2Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$Spo2V2Data parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$Spo2V2Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}