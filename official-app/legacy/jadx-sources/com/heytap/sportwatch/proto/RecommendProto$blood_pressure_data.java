package com.heytap.sportwatch.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.pef;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class RecommendProto$blood_pressure_data extends GeneratedMessageLite<RecommendProto$blood_pressure_data, Builder> implements RecommendProto$blood_pressure_dataOrBuilder {
    public static final int DATA_FIELD_NUMBER = 1;
    private static final RecommendProto$blood_pressure_data DEFAULT_INSTANCE;
    private static volatile Parser<RecommendProto$blood_pressure_data> PARSER = null;
    public static final int STATUS_RANGE_FIELD_NUMBER = 2;
    private int dataMemoizedSerializedSize = -1;
    private Internal.IntList data_ = GeneratedMessageLite.emptyIntList();
    private Internal.ProtobufList<RecommendProto$int_pair> statusRange_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<RecommendProto$blood_pressure_data, Builder> implements RecommendProto$blood_pressure_dataOrBuilder {
        public Builder addAllData(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((RecommendProto$blood_pressure_data) this.instance).addAllData(iterable);
            return this;
        }

        public Builder addAllStatusRange(Iterable<? extends RecommendProto$int_pair> iterable) {
            copyOnWrite();
            ((RecommendProto$blood_pressure_data) this.instance).addAllStatusRange(iterable);
            return this;
        }

        public Builder addData(int i) {
            copyOnWrite();
            ((RecommendProto$blood_pressure_data) this.instance).addData(i);
            return this;
        }

        public Builder addStatusRange(RecommendProto$int_pair recommendProto$int_pair) {
            copyOnWrite();
            ((RecommendProto$blood_pressure_data) this.instance).addStatusRange(recommendProto$int_pair);
            return this;
        }

        public Builder clearData() {
            copyOnWrite();
            ((RecommendProto$blood_pressure_data) this.instance).clearData();
            return this;
        }

        public Builder clearStatusRange() {
            copyOnWrite();
            ((RecommendProto$blood_pressure_data) this.instance).clearStatusRange();
            return this;
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$blood_pressure_dataOrBuilder
        public int getData(int i) {
            return ((RecommendProto$blood_pressure_data) this.instance).getData(i);
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$blood_pressure_dataOrBuilder
        public int getDataCount() {
            return ((RecommendProto$blood_pressure_data) this.instance).getDataCount();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$blood_pressure_dataOrBuilder
        public List<Integer> getDataList() {
            return Collections.unmodifiableList(((RecommendProto$blood_pressure_data) this.instance).getDataList());
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$blood_pressure_dataOrBuilder
        public RecommendProto$int_pair getStatusRange(int i) {
            return ((RecommendProto$blood_pressure_data) this.instance).getStatusRange(i);
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$blood_pressure_dataOrBuilder
        public int getStatusRangeCount() {
            return ((RecommendProto$blood_pressure_data) this.instance).getStatusRangeCount();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$blood_pressure_dataOrBuilder
        public List<RecommendProto$int_pair> getStatusRangeList() {
            return Collections.unmodifiableList(((RecommendProto$blood_pressure_data) this.instance).getStatusRangeList());
        }

        public Builder removeStatusRange(int i) {
            copyOnWrite();
            ((RecommendProto$blood_pressure_data) this.instance).removeStatusRange(i);
            return this;
        }

        public Builder setData(int i, int i2) {
            copyOnWrite();
            ((RecommendProto$blood_pressure_data) this.instance).setData(i, i2);
            return this;
        }

        public Builder setStatusRange(int i, RecommendProto$int_pair recommendProto$int_pair) {
            copyOnWrite();
            ((RecommendProto$blood_pressure_data) this.instance).setStatusRange(i, recommendProto$int_pair);
            return this;
        }

        private Builder() {
            super(RecommendProto$blood_pressure_data.DEFAULT_INSTANCE);
        }

        public Builder addStatusRange(int i, RecommendProto$int_pair recommendProto$int_pair) {
            copyOnWrite();
            ((RecommendProto$blood_pressure_data) this.instance).addStatusRange(i, recommendProto$int_pair);
            return this;
        }

        public Builder setStatusRange(int i, RecommendProto$int_pair.Builder builder) {
            copyOnWrite();
            ((RecommendProto$blood_pressure_data) this.instance).setStatusRange(i, builder.build());
            return this;
        }

        public Builder addStatusRange(RecommendProto$int_pair.Builder builder) {
            copyOnWrite();
            ((RecommendProto$blood_pressure_data) this.instance).addStatusRange(builder.build());
            return this;
        }

        public Builder addStatusRange(int i, RecommendProto$int_pair.Builder builder) {
            copyOnWrite();
            ((RecommendProto$blood_pressure_data) this.instance).addStatusRange(i, builder.build());
            return this;
        }
    }

    static {
        RecommendProto$blood_pressure_data recommendProto$blood_pressure_data = new RecommendProto$blood_pressure_data();
        DEFAULT_INSTANCE = recommendProto$blood_pressure_data;
        GeneratedMessageLite.registerDefaultInstance(RecommendProto$blood_pressure_data.class, recommendProto$blood_pressure_data);
    }

    private RecommendProto$blood_pressure_data() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllData(Iterable<? extends Integer> iterable) {
        ensureDataIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.data_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllStatusRange(Iterable<? extends RecommendProto$int_pair> iterable) {
        ensureStatusRangeIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.statusRange_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addData(int i) {
        ensureDataIsMutable();
        this.data_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStatusRange(RecommendProto$int_pair recommendProto$int_pair) {
        recommendProto$int_pair.getClass();
        ensureStatusRangeIsMutable();
        this.statusRange_.add(recommendProto$int_pair);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearData() {
        this.data_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatusRange() {
        this.statusRange_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureDataIsMutable() {
        Internal.IntList intList = this.data_;
        if (intList.isModifiable()) {
            return;
        }
        this.data_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureStatusRangeIsMutable() {
        Internal.ProtobufList<RecommendProto$int_pair> protobufList = this.statusRange_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.statusRange_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static RecommendProto$blood_pressure_data getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RecommendProto$blood_pressure_data parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$blood_pressure_data) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$blood_pressure_data parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RecommendProto$blood_pressure_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RecommendProto$blood_pressure_data> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeStatusRange(int i) {
        ensureStatusRangeIsMutable();
        this.statusRange_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setData(int i, int i2) {
        ensureDataIsMutable();
        this.data_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusRange(int i, RecommendProto$int_pair recommendProto$int_pair) {
        recommendProto$int_pair.getClass();
        ensureStatusRangeIsMutable();
        this.statusRange_.set(i, recommendProto$int_pair);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = pef.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new RecommendProto$blood_pressure_data();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001+\u0002\u001b", new Object[]{"data_", "statusRange_", RecommendProto$int_pair.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RecommendProto$blood_pressure_data> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (RecommendProto$blood_pressure_data.class) {
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

    @Override // com.heytap.sportwatch.proto.RecommendProto$blood_pressure_dataOrBuilder
    public int getData(int i) {
        return this.data_.getInt(i);
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$blood_pressure_dataOrBuilder
    public int getDataCount() {
        return this.data_.size();
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$blood_pressure_dataOrBuilder
    public List<Integer> getDataList() {
        return this.data_;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$blood_pressure_dataOrBuilder
    public RecommendProto$int_pair getStatusRange(int i) {
        return this.statusRange_.get(i);
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$blood_pressure_dataOrBuilder
    public int getStatusRangeCount() {
        return this.statusRange_.size();
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$blood_pressure_dataOrBuilder
    public List<RecommendProto$int_pair> getStatusRangeList() {
        return this.statusRange_;
    }

    public RecommendProto$int_pairOrBuilder getStatusRangeOrBuilder(int i) {
        return this.statusRange_.get(i);
    }

    public List<? extends RecommendProto$int_pairOrBuilder> getStatusRangeOrBuilderList() {
        return this.statusRange_;
    }

    public static Builder newBuilder(RecommendProto$blood_pressure_data recommendProto$blood_pressure_data) {
        return DEFAULT_INSTANCE.createBuilder(recommendProto$blood_pressure_data);
    }

    public static RecommendProto$blood_pressure_data parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$blood_pressure_data) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$blood_pressure_data parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$blood_pressure_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RecommendProto$blood_pressure_data parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RecommendProto$blood_pressure_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStatusRange(int i, RecommendProto$int_pair recommendProto$int_pair) {
        recommendProto$int_pair.getClass();
        ensureStatusRangeIsMutable();
        this.statusRange_.add(i, recommendProto$int_pair);
    }

    public static RecommendProto$blood_pressure_data parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$blood_pressure_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RecommendProto$blood_pressure_data parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RecommendProto$blood_pressure_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RecommendProto$blood_pressure_data parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$blood_pressure_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RecommendProto$blood_pressure_data parseFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$blood_pressure_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$blood_pressure_data parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$blood_pressure_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$blood_pressure_data parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RecommendProto$blood_pressure_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RecommendProto$blood_pressure_data parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$blood_pressure_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
