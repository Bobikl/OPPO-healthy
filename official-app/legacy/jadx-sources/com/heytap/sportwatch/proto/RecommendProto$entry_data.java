package com.heytap.sportwatch.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.pef;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class RecommendProto$entry_data extends GeneratedMessageLite<RecommendProto$entry_data, Builder> implements RecommendProto$entry_dataOrBuilder {
    private static final RecommendProto$entry_data DEFAULT_INSTANCE;
    public static final int DEFAULT_STR_FIELD_NUMBER = 2;
    public static final int ENTRY_ID_FIELD_NUMBER = 1;
    private static volatile Parser<RecommendProto$entry_data> PARSER = null;
    public static final int TRANS_FIELD_NUMBER = 3;
    private int bitField0_;
    private String defaultStr_ = "";
    private int entryId_;
    private RecommendProto$com_entry_cell trans_;

    public static final class Builder extends GeneratedMessageLite.Builder<RecommendProto$entry_data, Builder> implements RecommendProto$entry_dataOrBuilder {
        public Builder clearDefaultStr() {
            copyOnWrite();
            ((RecommendProto$entry_data) this.instance).clearDefaultStr();
            return this;
        }

        public Builder clearEntryId() {
            copyOnWrite();
            ((RecommendProto$entry_data) this.instance).clearEntryId();
            return this;
        }

        public Builder clearTrans() {
            copyOnWrite();
            ((RecommendProto$entry_data) this.instance).clearTrans();
            return this;
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$entry_dataOrBuilder
        public String getDefaultStr() {
            return ((RecommendProto$entry_data) this.instance).getDefaultStr();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$entry_dataOrBuilder
        public ByteString getDefaultStrBytes() {
            return ((RecommendProto$entry_data) this.instance).getDefaultStrBytes();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$entry_dataOrBuilder
        public int getEntryId() {
            return ((RecommendProto$entry_data) this.instance).getEntryId();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$entry_dataOrBuilder
        public RecommendProto$com_entry_cell getTrans() {
            return ((RecommendProto$entry_data) this.instance).getTrans();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$entry_dataOrBuilder
        public boolean hasTrans() {
            return ((RecommendProto$entry_data) this.instance).hasTrans();
        }

        public Builder mergeTrans(RecommendProto$com_entry_cell recommendProto$com_entry_cell) {
            copyOnWrite();
            ((RecommendProto$entry_data) this.instance).mergeTrans(recommendProto$com_entry_cell);
            return this;
        }

        public Builder setDefaultStr(String str) {
            copyOnWrite();
            ((RecommendProto$entry_data) this.instance).setDefaultStr(str);
            return this;
        }

        public Builder setDefaultStrBytes(ByteString byteString) {
            copyOnWrite();
            ((RecommendProto$entry_data) this.instance).setDefaultStrBytes(byteString);
            return this;
        }

        public Builder setEntryId(int i) {
            copyOnWrite();
            ((RecommendProto$entry_data) this.instance).setEntryId(i);
            return this;
        }

        public Builder setTrans(RecommendProto$com_entry_cell recommendProto$com_entry_cell) {
            copyOnWrite();
            ((RecommendProto$entry_data) this.instance).setTrans(recommendProto$com_entry_cell);
            return this;
        }

        private Builder() {
            super(RecommendProto$entry_data.DEFAULT_INSTANCE);
        }

        public Builder setTrans(RecommendProto$com_entry_cell.Builder builder) {
            copyOnWrite();
            ((RecommendProto$entry_data) this.instance).setTrans(builder.build());
            return this;
        }
    }

    static {
        RecommendProto$entry_data recommendProto$entry_data = new RecommendProto$entry_data();
        DEFAULT_INSTANCE = recommendProto$entry_data;
        GeneratedMessageLite.registerDefaultInstance(RecommendProto$entry_data.class, recommendProto$entry_data);
    }

    private RecommendProto$entry_data() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDefaultStr() {
        this.defaultStr_ = getDefaultInstance().getDefaultStr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEntryId() {
        this.entryId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrans() {
        this.trans_ = null;
        this.bitField0_ &= -2;
    }

    public static RecommendProto$entry_data getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrans(RecommendProto$com_entry_cell recommendProto$com_entry_cell) {
        recommendProto$com_entry_cell.getClass();
        RecommendProto$com_entry_cell recommendProto$com_entry_cell2 = this.trans_;
        if (recommendProto$com_entry_cell2 == null || recommendProto$com_entry_cell2 == RecommendProto$com_entry_cell.getDefaultInstance()) {
            this.trans_ = recommendProto$com_entry_cell;
        } else {
            this.trans_ = RecommendProto$com_entry_cell.newBuilder(this.trans_).mergeFrom(recommendProto$com_entry_cell).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RecommendProto$entry_data parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$entry_data) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$entry_data parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RecommendProto$entry_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RecommendProto$entry_data> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultStr(String str) {
        str.getClass();
        this.defaultStr_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultStrBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.defaultStr_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntryId(int i) {
        this.entryId_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrans(RecommendProto$com_entry_cell recommendProto$com_entry_cell) {
        recommendProto$com_entry_cell.getClass();
        this.trans_ = recommendProto$com_entry_cell;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = pef.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new RecommendProto$entry_data();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002Ȉ\u0003ဉ\u0000", new Object[]{"bitField0_", "entryId_", "defaultStr_", "trans_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RecommendProto$entry_data> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (RecommendProto$entry_data.class) {
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

    @Override // com.heytap.sportwatch.proto.RecommendProto$entry_dataOrBuilder
    public String getDefaultStr() {
        return this.defaultStr_;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$entry_dataOrBuilder
    public ByteString getDefaultStrBytes() {
        return ByteString.copyFromUtf8(this.defaultStr_);
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$entry_dataOrBuilder
    public int getEntryId() {
        return this.entryId_;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$entry_dataOrBuilder
    public RecommendProto$com_entry_cell getTrans() {
        RecommendProto$com_entry_cell recommendProto$com_entry_cell = this.trans_;
        return recommendProto$com_entry_cell == null ? RecommendProto$com_entry_cell.getDefaultInstance() : recommendProto$com_entry_cell;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$entry_dataOrBuilder
    public boolean hasTrans() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(RecommendProto$entry_data recommendProto$entry_data) {
        return DEFAULT_INSTANCE.createBuilder(recommendProto$entry_data);
    }

    public static RecommendProto$entry_data parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$entry_data) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$entry_data parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$entry_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RecommendProto$entry_data parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RecommendProto$entry_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RecommendProto$entry_data parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$entry_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RecommendProto$entry_data parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RecommendProto$entry_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RecommendProto$entry_data parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$entry_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RecommendProto$entry_data parseFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$entry_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$entry_data parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$entry_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$entry_data parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RecommendProto$entry_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RecommendProto$entry_data parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$entry_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
