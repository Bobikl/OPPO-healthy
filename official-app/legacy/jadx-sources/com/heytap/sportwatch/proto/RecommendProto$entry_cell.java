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
public final class RecommendProto$entry_cell extends GeneratedMessageLite<RecommendProto$entry_cell, Builder> implements RecommendProto$entry_cellOrBuilder {
    private static final RecommendProto$entry_cell DEFAULT_INSTANCE;
    public static final int ENTRY_STR_FIELD_NUMBER = 2;
    public static final int LANG_CODE_FIELD_NUMBER = 1;
    private static volatile Parser<RecommendProto$entry_cell> PARSER;
    private String langCode_ = "";
    private String entryStr_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<RecommendProto$entry_cell, Builder> implements RecommendProto$entry_cellOrBuilder {
        public Builder clearEntryStr() {
            copyOnWrite();
            ((RecommendProto$entry_cell) this.instance).clearEntryStr();
            return this;
        }

        public Builder clearLangCode() {
            copyOnWrite();
            ((RecommendProto$entry_cell) this.instance).clearLangCode();
            return this;
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$entry_cellOrBuilder
        public String getEntryStr() {
            return ((RecommendProto$entry_cell) this.instance).getEntryStr();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$entry_cellOrBuilder
        public ByteString getEntryStrBytes() {
            return ((RecommendProto$entry_cell) this.instance).getEntryStrBytes();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$entry_cellOrBuilder
        public String getLangCode() {
            return ((RecommendProto$entry_cell) this.instance).getLangCode();
        }

        @Override // com.heytap.sportwatch.proto.RecommendProto$entry_cellOrBuilder
        public ByteString getLangCodeBytes() {
            return ((RecommendProto$entry_cell) this.instance).getLangCodeBytes();
        }

        public Builder setEntryStr(String str) {
            copyOnWrite();
            ((RecommendProto$entry_cell) this.instance).setEntryStr(str);
            return this;
        }

        public Builder setEntryStrBytes(ByteString byteString) {
            copyOnWrite();
            ((RecommendProto$entry_cell) this.instance).setEntryStrBytes(byteString);
            return this;
        }

        public Builder setLangCode(String str) {
            copyOnWrite();
            ((RecommendProto$entry_cell) this.instance).setLangCode(str);
            return this;
        }

        public Builder setLangCodeBytes(ByteString byteString) {
            copyOnWrite();
            ((RecommendProto$entry_cell) this.instance).setLangCodeBytes(byteString);
            return this;
        }

        private Builder() {
            super(RecommendProto$entry_cell.DEFAULT_INSTANCE);
        }
    }

    static {
        RecommendProto$entry_cell recommendProto$entry_cell = new RecommendProto$entry_cell();
        DEFAULT_INSTANCE = recommendProto$entry_cell;
        GeneratedMessageLite.registerDefaultInstance(RecommendProto$entry_cell.class, recommendProto$entry_cell);
    }

    private RecommendProto$entry_cell() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEntryStr() {
        this.entryStr_ = getDefaultInstance().getEntryStr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLangCode() {
        this.langCode_ = getDefaultInstance().getLangCode();
    }

    public static RecommendProto$entry_cell getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static RecommendProto$entry_cell parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$entry_cell) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$entry_cell parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RecommendProto$entry_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<RecommendProto$entry_cell> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntryStr(String str) {
        str.getClass();
        this.entryStr_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntryStrBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.entryStr_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLangCode(String str) {
        str.getClass();
        this.langCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLangCodeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.langCode_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = pef.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new RecommendProto$entry_cell();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"langCode_", "entryStr_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<RecommendProto$entry_cell> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (RecommendProto$entry_cell.class) {
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

    @Override // com.heytap.sportwatch.proto.RecommendProto$entry_cellOrBuilder
    public String getEntryStr() {
        return this.entryStr_;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$entry_cellOrBuilder
    public ByteString getEntryStrBytes() {
        return ByteString.copyFromUtf8(this.entryStr_);
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$entry_cellOrBuilder
    public String getLangCode() {
        return this.langCode_;
    }

    @Override // com.heytap.sportwatch.proto.RecommendProto$entry_cellOrBuilder
    public ByteString getLangCodeBytes() {
        return ByteString.copyFromUtf8(this.langCode_);
    }

    public static Builder newBuilder(RecommendProto$entry_cell recommendProto$entry_cell) {
        return DEFAULT_INSTANCE.createBuilder(recommendProto$entry_cell);
    }

    public static RecommendProto$entry_cell parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$entry_cell) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$entry_cell parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$entry_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static RecommendProto$entry_cell parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RecommendProto$entry_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static RecommendProto$entry_cell parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$entry_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static RecommendProto$entry_cell parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RecommendProto$entry_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RecommendProto$entry_cell parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RecommendProto$entry_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static RecommendProto$entry_cell parseFrom(InputStream inputStream) throws IOException {
        return (RecommendProto$entry_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecommendProto$entry_cell parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$entry_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static RecommendProto$entry_cell parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RecommendProto$entry_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static RecommendProto$entry_cell parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RecommendProto$entry_cell) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
