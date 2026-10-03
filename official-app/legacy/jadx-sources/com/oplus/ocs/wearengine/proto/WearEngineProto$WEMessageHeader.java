package com.oplus.ocs.wearengine.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.zhl;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public final class WearEngineProto$WEMessageHeader extends GeneratedMessageLite<WearEngineProto$WEMessageHeader, Builder> implements WearEngineProto$WEMessageHeaderOrBuilder {
    private static final WearEngineProto$WEMessageHeader DEFAULT_INSTANCE;
    public static final int FROMSIGNATURESHA256_FIELD_NUMBER = 7;
    public static final int FROMSIGNATURE_FIELD_NUMBER = 5;
    public static final int FROM_FIELD_NUMBER = 2;
    private static volatile Parser<WearEngineProto$WEMessageHeader> PARSER = null;
    public static final int REQUESTID_FIELD_NUMBER = 1;
    public static final int TOSIGNATURESHA256_FIELD_NUMBER = 8;
    public static final int TOSIGNATURE_FIELD_NUMBER = 6;
    public static final int TO_FIELD_NUMBER = 3;
    public static final int VERSION_FIELD_NUMBER = 4;
    private int requestId_;
    private int version_;
    private String from_ = "";
    private String to_ = "";
    private String fromSignature_ = "";
    private String toSignature_ = "";
    private String fromSignatureSHA256_ = "";
    private String toSignatureSHA256_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<WearEngineProto$WEMessageHeader, Builder> implements WearEngineProto$WEMessageHeaderOrBuilder {
        public Builder clearFrom() {
            copyOnWrite();
            ((WearEngineProto$WEMessageHeader) this.instance).clearFrom();
            return this;
        }

        public Builder clearFromSignature() {
            copyOnWrite();
            ((WearEngineProto$WEMessageHeader) this.instance).clearFromSignature();
            return this;
        }

        public Builder clearFromSignatureSHA256() {
            copyOnWrite();
            ((WearEngineProto$WEMessageHeader) this.instance).clearFromSignatureSHA256();
            return this;
        }

        public Builder clearRequestId() {
            copyOnWrite();
            ((WearEngineProto$WEMessageHeader) this.instance).clearRequestId();
            return this;
        }

        public Builder clearTo() {
            copyOnWrite();
            ((WearEngineProto$WEMessageHeader) this.instance).clearTo();
            return this;
        }

        public Builder clearToSignature() {
            copyOnWrite();
            ((WearEngineProto$WEMessageHeader) this.instance).clearToSignature();
            return this;
        }

        public Builder clearToSignatureSHA256() {
            copyOnWrite();
            ((WearEngineProto$WEMessageHeader) this.instance).clearToSignatureSHA256();
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((WearEngineProto$WEMessageHeader) this.instance).clearVersion();
            return this;
        }

        @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEMessageHeaderOrBuilder
        public String getFrom() {
            return ((WearEngineProto$WEMessageHeader) this.instance).getFrom();
        }

        @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEMessageHeaderOrBuilder
        public ByteString getFromBytes() {
            return ((WearEngineProto$WEMessageHeader) this.instance).getFromBytes();
        }

        @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEMessageHeaderOrBuilder
        public String getFromSignature() {
            return ((WearEngineProto$WEMessageHeader) this.instance).getFromSignature();
        }

        @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEMessageHeaderOrBuilder
        public ByteString getFromSignatureBytes() {
            return ((WearEngineProto$WEMessageHeader) this.instance).getFromSignatureBytes();
        }

        @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEMessageHeaderOrBuilder
        public String getFromSignatureSHA256() {
            return ((WearEngineProto$WEMessageHeader) this.instance).getFromSignatureSHA256();
        }

        @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEMessageHeaderOrBuilder
        public ByteString getFromSignatureSHA256Bytes() {
            return ((WearEngineProto$WEMessageHeader) this.instance).getFromSignatureSHA256Bytes();
        }

        @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEMessageHeaderOrBuilder
        public int getRequestId() {
            return ((WearEngineProto$WEMessageHeader) this.instance).getRequestId();
        }

        @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEMessageHeaderOrBuilder
        public String getTo() {
            return ((WearEngineProto$WEMessageHeader) this.instance).getTo();
        }

        @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEMessageHeaderOrBuilder
        public ByteString getToBytes() {
            return ((WearEngineProto$WEMessageHeader) this.instance).getToBytes();
        }

        @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEMessageHeaderOrBuilder
        public String getToSignature() {
            return ((WearEngineProto$WEMessageHeader) this.instance).getToSignature();
        }

        @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEMessageHeaderOrBuilder
        public ByteString getToSignatureBytes() {
            return ((WearEngineProto$WEMessageHeader) this.instance).getToSignatureBytes();
        }

        @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEMessageHeaderOrBuilder
        public String getToSignatureSHA256() {
            return ((WearEngineProto$WEMessageHeader) this.instance).getToSignatureSHA256();
        }

        @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEMessageHeaderOrBuilder
        public ByteString getToSignatureSHA256Bytes() {
            return ((WearEngineProto$WEMessageHeader) this.instance).getToSignatureSHA256Bytes();
        }

        @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEMessageHeaderOrBuilder
        public int getVersion() {
            return ((WearEngineProto$WEMessageHeader) this.instance).getVersion();
        }

        public Builder setFrom(String str) {
            copyOnWrite();
            ((WearEngineProto$WEMessageHeader) this.instance).setFrom(str);
            return this;
        }

        public Builder setFromBytes(ByteString byteString) {
            copyOnWrite();
            ((WearEngineProto$WEMessageHeader) this.instance).setFromBytes(byteString);
            return this;
        }

        public Builder setFromSignature(String str) {
            copyOnWrite();
            ((WearEngineProto$WEMessageHeader) this.instance).setFromSignature(str);
            return this;
        }

        public Builder setFromSignatureBytes(ByteString byteString) {
            copyOnWrite();
            ((WearEngineProto$WEMessageHeader) this.instance).setFromSignatureBytes(byteString);
            return this;
        }

        public Builder setFromSignatureSHA256(String str) {
            copyOnWrite();
            ((WearEngineProto$WEMessageHeader) this.instance).setFromSignatureSHA256(str);
            return this;
        }

        public Builder setFromSignatureSHA256Bytes(ByteString byteString) {
            copyOnWrite();
            ((WearEngineProto$WEMessageHeader) this.instance).setFromSignatureSHA256Bytes(byteString);
            return this;
        }

        public Builder setRequestId(int i) {
            copyOnWrite();
            ((WearEngineProto$WEMessageHeader) this.instance).setRequestId(i);
            return this;
        }

        public Builder setTo(String str) {
            copyOnWrite();
            ((WearEngineProto$WEMessageHeader) this.instance).setTo(str);
            return this;
        }

        public Builder setToBytes(ByteString byteString) {
            copyOnWrite();
            ((WearEngineProto$WEMessageHeader) this.instance).setToBytes(byteString);
            return this;
        }

        public Builder setToSignature(String str) {
            copyOnWrite();
            ((WearEngineProto$WEMessageHeader) this.instance).setToSignature(str);
            return this;
        }

        public Builder setToSignatureBytes(ByteString byteString) {
            copyOnWrite();
            ((WearEngineProto$WEMessageHeader) this.instance).setToSignatureBytes(byteString);
            return this;
        }

        public Builder setToSignatureSHA256(String str) {
            copyOnWrite();
            ((WearEngineProto$WEMessageHeader) this.instance).setToSignatureSHA256(str);
            return this;
        }

        public Builder setToSignatureSHA256Bytes(ByteString byteString) {
            copyOnWrite();
            ((WearEngineProto$WEMessageHeader) this.instance).setToSignatureSHA256Bytes(byteString);
            return this;
        }

        public Builder setVersion(int i) {
            copyOnWrite();
            ((WearEngineProto$WEMessageHeader) this.instance).setVersion(i);
            return this;
        }

        private Builder() {
            super(WearEngineProto$WEMessageHeader.DEFAULT_INSTANCE);
        }
    }

    static {
        WearEngineProto$WEMessageHeader wearEngineProto$WEMessageHeader = new WearEngineProto$WEMessageHeader();
        DEFAULT_INSTANCE = wearEngineProto$WEMessageHeader;
        GeneratedMessageLite.registerDefaultInstance(WearEngineProto$WEMessageHeader.class, wearEngineProto$WEMessageHeader);
    }

    private WearEngineProto$WEMessageHeader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFrom() {
        this.from_ = getDefaultInstance().getFrom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromSignature() {
        this.fromSignature_ = getDefaultInstance().getFromSignature();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromSignatureSHA256() {
        this.fromSignatureSHA256_ = getDefaultInstance().getFromSignatureSHA256();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestId() {
        this.requestId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTo() {
        this.to_ = getDefaultInstance().getTo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToSignature() {
        this.toSignature_ = getDefaultInstance().getToSignature();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToSignatureSHA256() {
        this.toSignatureSHA256_ = getDefaultInstance().getToSignatureSHA256();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    public static WearEngineProto$WEMessageHeader getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WearEngineProto$WEMessageHeader parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WearEngineProto$WEMessageHeader) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WearEngineProto$WEMessageHeader parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WearEngineProto$WEMessageHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WearEngineProto$WEMessageHeader> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrom(String str) {
        str.getClass();
        this.from_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.from_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromSignature(String str) {
        str.getClass();
        this.fromSignature_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromSignatureBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.fromSignature_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromSignatureSHA256(String str) {
        str.getClass();
        this.fromSignatureSHA256_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromSignatureSHA256Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.fromSignatureSHA256_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestId(int i) {
        this.requestId_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTo(String str) {
        str.getClass();
        this.to_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.to_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToSignature(String str) {
        str.getClass();
        this.toSignature_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToSignatureBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.toSignature_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToSignatureSHA256(String str) {
        str.getClass();
        this.toSignatureSHA256_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToSignatureSHA256Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.toSignatureSHA256_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(int i) {
        this.version_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = zhl.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WearEngineProto$WEMessageHeader();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004\u0004\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ", new Object[]{"requestId_", "from_", "to_", "version_", "fromSignature_", "toSignature_", "fromSignatureSHA256_", "toSignatureSHA256_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WearEngineProto$WEMessageHeader> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WearEngineProto$WEMessageHeader.class) {
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

    @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEMessageHeaderOrBuilder
    public String getFrom() {
        return this.from_;
    }

    @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEMessageHeaderOrBuilder
    public ByteString getFromBytes() {
        return ByteString.copyFromUtf8(this.from_);
    }

    @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEMessageHeaderOrBuilder
    public String getFromSignature() {
        return this.fromSignature_;
    }

    @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEMessageHeaderOrBuilder
    public ByteString getFromSignatureBytes() {
        return ByteString.copyFromUtf8(this.fromSignature_);
    }

    @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEMessageHeaderOrBuilder
    public String getFromSignatureSHA256() {
        return this.fromSignatureSHA256_;
    }

    @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEMessageHeaderOrBuilder
    public ByteString getFromSignatureSHA256Bytes() {
        return ByteString.copyFromUtf8(this.fromSignatureSHA256_);
    }

    @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEMessageHeaderOrBuilder
    public int getRequestId() {
        return this.requestId_;
    }

    @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEMessageHeaderOrBuilder
    public String getTo() {
        return this.to_;
    }

    @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEMessageHeaderOrBuilder
    public ByteString getToBytes() {
        return ByteString.copyFromUtf8(this.to_);
    }

    @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEMessageHeaderOrBuilder
    public String getToSignature() {
        return this.toSignature_;
    }

    @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEMessageHeaderOrBuilder
    public ByteString getToSignatureBytes() {
        return ByteString.copyFromUtf8(this.toSignature_);
    }

    @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEMessageHeaderOrBuilder
    public String getToSignatureSHA256() {
        return this.toSignatureSHA256_;
    }

    @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEMessageHeaderOrBuilder
    public ByteString getToSignatureSHA256Bytes() {
        return ByteString.copyFromUtf8(this.toSignatureSHA256_);
    }

    @Override // com.oplus.ocs.wearengine.proto.WearEngineProto$WEMessageHeaderOrBuilder
    public int getVersion() {
        return this.version_;
    }

    public static Builder newBuilder(WearEngineProto$WEMessageHeader wearEngineProto$WEMessageHeader) {
        return DEFAULT_INSTANCE.createBuilder(wearEngineProto$WEMessageHeader);
    }

    public static WearEngineProto$WEMessageHeader parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WearEngineProto$WEMessageHeader) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WearEngineProto$WEMessageHeader parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WearEngineProto$WEMessageHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WearEngineProto$WEMessageHeader parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WearEngineProto$WEMessageHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WearEngineProto$WEMessageHeader parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WearEngineProto$WEMessageHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WearEngineProto$WEMessageHeader parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WearEngineProto$WEMessageHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WearEngineProto$WEMessageHeader parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WearEngineProto$WEMessageHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WearEngineProto$WEMessageHeader parseFrom(InputStream inputStream) throws IOException {
        return (WearEngineProto$WEMessageHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WearEngineProto$WEMessageHeader parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WearEngineProto$WEMessageHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WearEngineProto$WEMessageHeader parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WearEngineProto$WEMessageHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WearEngineProto$WEMessageHeader parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WearEngineProto$WEMessageHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
