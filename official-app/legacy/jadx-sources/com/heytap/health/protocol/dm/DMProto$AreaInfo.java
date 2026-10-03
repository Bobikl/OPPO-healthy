package com.heytap.health.protocol.dm;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.yl4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class DMProto$AreaInfo extends GeneratedMessageLite<DMProto$AreaInfo, Builder> implements DMProto$AreaInfoOrBuilder {
    private static final DMProto$AreaInfo DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile Parser<DMProto$AreaInfo> PARSER = null;
    public static final int SEQ_FIELD_NUMBER = 1;
    private String name_ = "";
    private int seq_;

    public static final class Builder extends GeneratedMessageLite.Builder<DMProto$AreaInfo, Builder> implements DMProto$AreaInfoOrBuilder {
        public Builder clearName() {
            copyOnWrite();
            ((DMProto$AreaInfo) this.instance).clearName();
            return this;
        }

        public Builder clearSeq() {
            copyOnWrite();
            ((DMProto$AreaInfo) this.instance).clearSeq();
            return this;
        }

        @Override // com.heytap.health.protocol.dm.DMProto$AreaInfoOrBuilder
        public String getName() {
            return ((DMProto$AreaInfo) this.instance).getName();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$AreaInfoOrBuilder
        public ByteString getNameBytes() {
            return ((DMProto$AreaInfo) this.instance).getNameBytes();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$AreaInfoOrBuilder
        public int getSeq() {
            return ((DMProto$AreaInfo) this.instance).getSeq();
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((DMProto$AreaInfo) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((DMProto$AreaInfo) this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setSeq(int i) {
            copyOnWrite();
            ((DMProto$AreaInfo) this.instance).setSeq(i);
            return this;
        }

        private Builder() {
            super(DMProto$AreaInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        DMProto$AreaInfo dMProto$AreaInfo = new DMProto$AreaInfo();
        DEFAULT_INSTANCE = dMProto$AreaInfo;
        GeneratedMessageLite.registerDefaultInstance(DMProto$AreaInfo.class, dMProto$AreaInfo);
    }

    private DMProto$AreaInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeq() {
        this.seq_ = 0;
    }

    public static DMProto$AreaInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DMProto$AreaInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DMProto$AreaInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$AreaInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DMProto$AreaInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DMProto$AreaInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeq(int i) {
        this.seq_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yl4.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DMProto$AreaInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002Ȉ", new Object[]{"seq_", "name_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DMProto$AreaInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DMProto$AreaInfo.class) {
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

    @Override // com.heytap.health.protocol.dm.DMProto$AreaInfoOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$AreaInfoOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.heytap.health.protocol.dm.DMProto$AreaInfoOrBuilder
    public int getSeq() {
        return this.seq_;
    }

    public static Builder newBuilder(DMProto$AreaInfo dMProto$AreaInfo) {
        return DEFAULT_INSTANCE.createBuilder(dMProto$AreaInfo);
    }

    public static DMProto$AreaInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$AreaInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$AreaInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$AreaInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DMProto$AreaInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DMProto$AreaInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DMProto$AreaInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$AreaInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DMProto$AreaInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DMProto$AreaInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DMProto$AreaInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$AreaInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DMProto$AreaInfo parseFrom(InputStream inputStream) throws IOException {
        return (DMProto$AreaInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$AreaInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$AreaInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$AreaInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DMProto$AreaInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DMProto$AreaInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$AreaInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
