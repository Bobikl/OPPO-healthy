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
public final class RecommendProto$composite_cell extends GeneratedMessageLite<RecommendProto$composite_cell, Builder> implements RecommendProto$composite_cellOrBuilder {
    public static final int DATA_FIELD_NUMBER = 1;
    private static final RecommendProto$composite_cell DEFAULT_INSTANCE;
    private static volatile Parser<RecommendProto$composite_cell> PARSER;
    private Internal.ProtobufList<RecommendProto$health_single_cell> data_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<RecommendProto$composite_cell, Builder> implements RecommendProto$composite_cellOrBuilder {
        public Builder addAllData(Iterable<? extends RecommendProto$health_single_cell> iterable) {
            copyOnWrite();
            ((RecommendProto$composite_cell) this.instance).addAllData(iterable);
            return this;
        }

        public Builder addData(RecommendProto$health_single_cell recommendProto$health_single_cell) {
            copyOnWrite();
            ((RecommendProto$composite_cell) this.instance).addData(recommendProto$health_single_cell);
            return this;
        }

        public Builder clearData() {
            copyOnWrite();
            ((RecommendProto$composite_cell) this.instance).clearData();
            return this;
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$composite_cellOrBuilder
        public RecommendProto$health_single_cell getData(int i) {
            return ((RecommendProto$composite_cell) this.instance).getData(i);
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$composite_cellOrBuilder
        public int getDataCount() {
            return ((RecommendProto$composite_cell) this.instance).getDataCount();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$composite_cellOrBuilder
        public List<RecommendProto$health_single_cell> getDataList() {
            return Collections.unmodifiableList(((RecommendProto$composite_cell) this.instance).getDataList());
        }

        public Builder removeData(int i) {
            copyOnWrite();
            ((RecommendProto$composite_cell) this.instance).removeData(i);
            return this;
        }

        public Builder setData(int i, RecommendProto$health_single_cell recommendProto$health_single_cell) {
            copyOnWrite();
            ((RecommendProto$composite_cell) this.instance).setData(i, recommendProto$health_single_cell);
            return this;
        }

        private Builder() {
            super(RecommendProto$composite_cell.DEFAULT_INSTANCE);
        }

        public Builder addData(int i, RecommendProto$health_single_cell recommendProto$health_single_cell) {
            copyOnWrite();
            ((RecommendProto$composite_cell) this.instance).addData(i, recommendProto$health_single_cell);
            return this;
        }

        public Builder setData(int i, RecommendProto$health_single_cell.Builder builder) {
            copyOnWrite();
            ((RecommendProto$composite_cell) this.instance).setData(i, builder.build());
            return this;
        }

        public Builder addData(RecommendProto$health_single_cell.Builder builder) {
            copyOnWrite();
            ((RecommendProto$composite_cell) this.instance).addData(builder.build());
            return this;
        }

        public Builder addData(int i, RecommendProto$health_single_cell.Builder builder) {
            copyOnWrite();
            ((RecommendProto$composite_cell) this.instance).addData(i, builder.build());
            return this;
        }
    }

    static {
        RecommendProto$composite_cell recommendProto$composite_cell = new RecommendProto$composite_cell();
        DEFAULT_INSTANCE = recommendProto$composite_cell;
        GeneratedMessageLite.registerDefaultInstance(RecommendProto$composite_cell.class, recommendProto$composite_cell);
    }

    private RecommendProto$composite_cell() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllData(Iterable<? extends RecommendProto$health_single_cell> iterable) {
        ensureDataIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.data_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addData(RecommendProto$health_single_cell recommendProto$health_single_cell) {
        recommendProto$health_single_cell.getClass();
        ensureDataIsMutable();
        this.data_.add(recommendProto$health_single_cell);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearData() {
        this.data_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureDataIsMutable() {
        Internal.ProtobufList<RecommendProto$health_single_cell> protobufList = this.data_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.data_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static RecommendProto$composite_cell getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RecommendProto$composite_cell parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$composite_cell) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$composite_cell parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RecommendProto$composite_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RecommendProto$composite_cell> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeData(int i) {
        ensureDataIsMutable();
        this.data_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setData(int i, RecommendProto$health_single_cell recommendProto$health_single_cell) {
        recommendProto$health_single_cell.getClass();
        ensureDataIsMutable();
        this.data_.set(i, recommendProto$health_single_cell);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = pef.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new RecommendProto$composite_cell();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"data_", RecommendProto$health_single_cell.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RecommendProto$composite_cell> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (RecommendProto$composite_cell.class) {
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

    @Override // com.heytap.sportwatch.proto.RecommendProto$composite_cellOrBuilder
    public RecommendProto$health_single_cell getData(int i) {
        return this.data_.get(i);
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$composite_cellOrBuilder
    public int getDataCount() {
        return this.data_.size();
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$composite_cellOrBuilder
    public List<RecommendProto$health_single_cell> getDataList() {
        return this.data_;
    }

    public RecommendProto$health_single_cellOrBuilder getDataOrBuilder(int i) {
        return this.data_.get(i);
    }

    public List<? extends RecommendProto$health_single_cellOrBuilder> getDataOrBuilderList() {
        return this.data_;
    }

    public static Builder newBuilder(RecommendProto$composite_cell recommendProto$composite_cell) {
        return DEFAULT_INSTANCE.createBuilder(recommendProto$composite_cell);
    }

    public static RecommendProto$composite_cell parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$composite_cell) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$composite_cell parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$composite_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RecommendProto$composite_cell parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RecommendProto$composite_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addData(int i, RecommendProto$health_single_cell recommendProto$health_single_cell) {
        recommendProto$health_single_cell.getClass();
        ensureDataIsMutable();
        this.data_.add(i, recommendProto$health_single_cell);
    }

    public static RecommendProto$composite_cell parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$composite_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RecommendProto$composite_cell parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RecommendProto$composite_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RecommendProto$composite_cell parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$composite_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RecommendProto$composite_cell parseFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$composite_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$composite_cell parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$composite_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$composite_cell parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RecommendProto$composite_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RecommendProto$composite_cell parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$composite_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
