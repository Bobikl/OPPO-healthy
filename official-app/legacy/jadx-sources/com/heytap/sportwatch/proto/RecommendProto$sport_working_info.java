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
public final class RecommendProto$sport_working_info extends GeneratedMessageLite<RecommendProto$sport_working_info, Builder> implements RecommendProto$sport_working_infoOrBuilder {
    public static final int DATA_FIELD_NUMBER = 1;
    private static final RecommendProto$sport_working_info DEFAULT_INSTANCE;
    private static volatile Parser<RecommendProto$sport_working_info> PARSER;
    private Internal.ProtobufList<RecommendProto$sport_cell_info> data_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<RecommendProto$sport_working_info, Builder> implements RecommendProto$sport_working_infoOrBuilder {
        public Builder addAllData(Iterable<? extends RecommendProto$sport_cell_info> iterable) {
            copyOnWrite();
            ((RecommendProto$sport_working_info) this.instance).addAllData(iterable);
            return this;
        }

        public Builder addData(RecommendProto$sport_cell_info recommendProto$sport_cell_info) {
            copyOnWrite();
            ((RecommendProto$sport_working_info) this.instance).addData(recommendProto$sport_cell_info);
            return this;
        }

        public Builder clearData() {
            copyOnWrite();
            ((RecommendProto$sport_working_info) this.instance).clearData();
            return this;
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$sport_working_infoOrBuilder
        public RecommendProto$sport_cell_info getData(int i) {
            return ((RecommendProto$sport_working_info) this.instance).getData(i);
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$sport_working_infoOrBuilder
        public int getDataCount() {
            return ((RecommendProto$sport_working_info) this.instance).getDataCount();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$sport_working_infoOrBuilder
        public List<RecommendProto$sport_cell_info> getDataList() {
            return Collections.unmodifiableList(((RecommendProto$sport_working_info) this.instance).getDataList());
        }

        public Builder removeData(int i) {
            copyOnWrite();
            ((RecommendProto$sport_working_info) this.instance).removeData(i);
            return this;
        }

        public Builder setData(int i, RecommendProto$sport_cell_info recommendProto$sport_cell_info) {
            copyOnWrite();
            ((RecommendProto$sport_working_info) this.instance).setData(i, recommendProto$sport_cell_info);
            return this;
        }

        private Builder() {
            super(RecommendProto$sport_working_info.DEFAULT_INSTANCE);
        }

        public Builder addData(int i, RecommendProto$sport_cell_info recommendProto$sport_cell_info) {
            copyOnWrite();
            ((RecommendProto$sport_working_info) this.instance).addData(i, recommendProto$sport_cell_info);
            return this;
        }

        public Builder setData(int i, RecommendProto$sport_cell_info.Builder builder) {
            copyOnWrite();
            ((RecommendProto$sport_working_info) this.instance).setData(i, builder.build());
            return this;
        }

        public Builder addData(RecommendProto$sport_cell_info.Builder builder) {
            copyOnWrite();
            ((RecommendProto$sport_working_info) this.instance).addData(builder.build());
            return this;
        }

        public Builder addData(int i, RecommendProto$sport_cell_info.Builder builder) {
            copyOnWrite();
            ((RecommendProto$sport_working_info) this.instance).addData(i, builder.build());
            return this;
        }
    }

    static {
        RecommendProto$sport_working_info recommendProto$sport_working_info = new RecommendProto$sport_working_info();
        DEFAULT_INSTANCE = recommendProto$sport_working_info;
        GeneratedMessageLite.registerDefaultInstance(RecommendProto$sport_working_info.class, recommendProto$sport_working_info);
    }

    private RecommendProto$sport_working_info() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllData(Iterable<? extends RecommendProto$sport_cell_info> iterable) {
        ensureDataIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.data_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addData(RecommendProto$sport_cell_info recommendProto$sport_cell_info) {
        recommendProto$sport_cell_info.getClass();
        ensureDataIsMutable();
        this.data_.add(recommendProto$sport_cell_info);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearData() {
        this.data_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureDataIsMutable() {
        Internal.ProtobufList<RecommendProto$sport_cell_info> protobufList = this.data_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.data_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static RecommendProto$sport_working_info getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RecommendProto$sport_working_info parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$sport_working_info) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$sport_working_info parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RecommendProto$sport_working_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RecommendProto$sport_working_info> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeData(int i) {
        ensureDataIsMutable();
        this.data_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setData(int i, RecommendProto$sport_cell_info recommendProto$sport_cell_info) {
        recommendProto$sport_cell_info.getClass();
        ensureDataIsMutable();
        this.data_.set(i, recommendProto$sport_cell_info);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = pef.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new RecommendProto$sport_working_info();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"data_", RecommendProto$sport_cell_info.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RecommendProto$sport_working_info> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (RecommendProto$sport_working_info.class) {
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

    @Override // com.heytap.sportwatch.proto.RecommendProto$sport_working_infoOrBuilder
    public RecommendProto$sport_cell_info getData(int i) {
        return this.data_.get(i);
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$sport_working_infoOrBuilder
    public int getDataCount() {
        return this.data_.size();
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$sport_working_infoOrBuilder
    public List<RecommendProto$sport_cell_info> getDataList() {
        return this.data_;
    }

    public RecommendProto$sport_cell_infoOrBuilder getDataOrBuilder(int i) {
        return this.data_.get(i);
    }

    public List<? extends RecommendProto$sport_cell_infoOrBuilder> getDataOrBuilderList() {
        return this.data_;
    }

    public static Builder newBuilder(RecommendProto$sport_working_info recommendProto$sport_working_info) {
        return DEFAULT_INSTANCE.createBuilder(recommendProto$sport_working_info);
    }

    public static RecommendProto$sport_working_info parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$sport_working_info) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$sport_working_info parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$sport_working_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RecommendProto$sport_working_info parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RecommendProto$sport_working_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addData(int i, RecommendProto$sport_cell_info recommendProto$sport_cell_info) {
        recommendProto$sport_cell_info.getClass();
        ensureDataIsMutable();
        this.data_.add(i, recommendProto$sport_cell_info);
    }

    public static RecommendProto$sport_working_info parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$sport_working_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RecommendProto$sport_working_info parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RecommendProto$sport_working_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RecommendProto$sport_working_info parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$sport_working_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RecommendProto$sport_working_info parseFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$sport_working_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$sport_working_info parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$sport_working_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$sport_working_info parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RecommendProto$sport_working_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RecommendProto$sport_working_info parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$sport_working_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
