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
public final class RecommendProto$com_entry_cell extends GeneratedMessageLite<RecommendProto$com_entry_cell, Builder> implements RecommendProto$com_entry_cellOrBuilder {
    public static final int DATA_FIELD_NUMBER = 1;
    private static final RecommendProto$com_entry_cell DEFAULT_INSTANCE;
    private static volatile Parser<RecommendProto$com_entry_cell> PARSER;
    private Internal.ProtobufList<RecommendProto$entry_cell> data_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<RecommendProto$com_entry_cell, Builder> implements RecommendProto$com_entry_cellOrBuilder {
        public Builder addAllData(Iterable<? extends RecommendProto$entry_cell> iterable) {
            copyOnWrite();
            ((RecommendProto$com_entry_cell) this.instance).addAllData(iterable);
            return this;
        }

        public Builder addData(RecommendProto$entry_cell recommendProto$entry_cell) {
            copyOnWrite();
            ((RecommendProto$com_entry_cell) this.instance).addData(recommendProto$entry_cell);
            return this;
        }

        public Builder clearData() {
            copyOnWrite();
            ((RecommendProto$com_entry_cell) this.instance).clearData();
            return this;
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$com_entry_cellOrBuilder
        public RecommendProto$entry_cell getData(int i) {
            return ((RecommendProto$com_entry_cell) this.instance).getData(i);
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$com_entry_cellOrBuilder
        public int getDataCount() {
            return ((RecommendProto$com_entry_cell) this.instance).getDataCount();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$com_entry_cellOrBuilder
        public List<RecommendProto$entry_cell> getDataList() {
            return Collections.unmodifiableList(((RecommendProto$com_entry_cell) this.instance).getDataList());
        }

        public Builder removeData(int i) {
            copyOnWrite();
            ((RecommendProto$com_entry_cell) this.instance).removeData(i);
            return this;
        }

        public Builder setData(int i, RecommendProto$entry_cell recommendProto$entry_cell) {
            copyOnWrite();
            ((RecommendProto$com_entry_cell) this.instance).setData(i, recommendProto$entry_cell);
            return this;
        }

        private Builder() {
            super(RecommendProto$com_entry_cell.DEFAULT_INSTANCE);
        }

        public Builder addData(int i, RecommendProto$entry_cell recommendProto$entry_cell) {
            copyOnWrite();
            ((RecommendProto$com_entry_cell) this.instance).addData(i, recommendProto$entry_cell);
            return this;
        }

        public Builder setData(int i, RecommendProto$entry_cell.Builder builder) {
            copyOnWrite();
            ((RecommendProto$com_entry_cell) this.instance).setData(i, builder.build());
            return this;
        }

        public Builder addData(RecommendProto$entry_cell.Builder builder) {
            copyOnWrite();
            ((RecommendProto$com_entry_cell) this.instance).addData(builder.build());
            return this;
        }

        public Builder addData(int i, RecommendProto$entry_cell.Builder builder) {
            copyOnWrite();
            ((RecommendProto$com_entry_cell) this.instance).addData(i, builder.build());
            return this;
        }
    }

    static {
        RecommendProto$com_entry_cell recommendProto$com_entry_cell = new RecommendProto$com_entry_cell();
        DEFAULT_INSTANCE = recommendProto$com_entry_cell;
        GeneratedMessageLite.registerDefaultInstance(RecommendProto$com_entry_cell.class, recommendProto$com_entry_cell);
    }

    private RecommendProto$com_entry_cell() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllData(Iterable<? extends RecommendProto$entry_cell> iterable) {
        ensureDataIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.data_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addData(RecommendProto$entry_cell recommendProto$entry_cell) {
        recommendProto$entry_cell.getClass();
        ensureDataIsMutable();
        this.data_.add(recommendProto$entry_cell);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearData() {
        this.data_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureDataIsMutable() {
        Internal.ProtobufList<RecommendProto$entry_cell> protobufList = this.data_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.data_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static RecommendProto$com_entry_cell getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RecommendProto$com_entry_cell parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$com_entry_cell) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$com_entry_cell parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RecommendProto$com_entry_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RecommendProto$com_entry_cell> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeData(int i) {
        ensureDataIsMutable();
        this.data_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setData(int i, RecommendProto$entry_cell recommendProto$entry_cell) {
        recommendProto$entry_cell.getClass();
        ensureDataIsMutable();
        this.data_.set(i, recommendProto$entry_cell);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = pef.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new RecommendProto$com_entry_cell();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"data_", RecommendProto$entry_cell.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RecommendProto$com_entry_cell> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (RecommendProto$com_entry_cell.class) {
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

    @Override // com.heytap.sportwatch.proto.RecommendProto$com_entry_cellOrBuilder
    public RecommendProto$entry_cell getData(int i) {
        return this.data_.get(i);
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$com_entry_cellOrBuilder
    public int getDataCount() {
        return this.data_.size();
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$com_entry_cellOrBuilder
    public List<RecommendProto$entry_cell> getDataList() {
        return this.data_;
    }

    public RecommendProto$entry_cellOrBuilder getDataOrBuilder(int i) {
        return this.data_.get(i);
    }

    public List<? extends RecommendProto$entry_cellOrBuilder> getDataOrBuilderList() {
        return this.data_;
    }

    public static Builder newBuilder(RecommendProto$com_entry_cell recommendProto$com_entry_cell) {
        return DEFAULT_INSTANCE.createBuilder(recommendProto$com_entry_cell);
    }

    public static RecommendProto$com_entry_cell parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$com_entry_cell) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$com_entry_cell parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$com_entry_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RecommendProto$com_entry_cell parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RecommendProto$com_entry_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addData(int i, RecommendProto$entry_cell recommendProto$entry_cell) {
        recommendProto$entry_cell.getClass();
        ensureDataIsMutable();
        this.data_.add(i, recommendProto$entry_cell);
    }

    public static RecommendProto$com_entry_cell parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$com_entry_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RecommendProto$com_entry_cell parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RecommendProto$com_entry_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RecommendProto$com_entry_cell parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$com_entry_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RecommendProto$com_entry_cell parseFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$com_entry_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$com_entry_cell parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$com_entry_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$com_entry_cell parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RecommendProto$com_entry_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RecommendProto$com_entry_cell parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$com_entry_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
