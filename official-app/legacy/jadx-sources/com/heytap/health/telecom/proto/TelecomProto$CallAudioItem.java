package com.heytap.health.telecom.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.nqj;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes18.dex */
public final class TelecomProto$CallAudioItem extends GeneratedMessageLite<TelecomProto$CallAudioItem, Builder> implements TelecomProto$CallAudioItemOrBuilder {
    private static final TelecomProto$CallAudioItem DEFAULT_INSTANCE;
    public static final int IS_ACTIVE_ROUTE_FIELD_NUMBER = 4;
    public static final int MAC_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile Parser<TelecomProto$CallAudioItem> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private boolean isActiveRoute_;
    private int type_;
    private String name_ = "";
    private String mac_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<TelecomProto$CallAudioItem, Builder> implements TelecomProto$CallAudioItemOrBuilder {
        public Builder clearIsActiveRoute() {
            copyOnWrite();
            ((TelecomProto$CallAudioItem) this.instance).clearIsActiveRoute();
            return this;
        }

        public Builder clearMac() {
            copyOnWrite();
            ((TelecomProto$CallAudioItem) this.instance).clearMac();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((TelecomProto$CallAudioItem) this.instance).clearName();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((TelecomProto$CallAudioItem) this.instance).clearType();
            return this;
        }

        @Override // com.heytap.health.telecom.proto.TelecomProto$CallAudioItemOrBuilder
        public boolean getIsActiveRoute() {
            return ((TelecomProto$CallAudioItem) this.instance).getIsActiveRoute();
        }

        @Override // com.heytap.health.telecom.proto.TelecomProto$CallAudioItemOrBuilder
        public String getMac() {
            return ((TelecomProto$CallAudioItem) this.instance).getMac();
        }

        @Override // com.heytap.health.telecom.proto.TelecomProto$CallAudioItemOrBuilder
        public ByteString getMacBytes() {
            return ((TelecomProto$CallAudioItem) this.instance).getMacBytes();
        }

        @Override // com.heytap.health.telecom.proto.TelecomProto$CallAudioItemOrBuilder
        public String getName() {
            return ((TelecomProto$CallAudioItem) this.instance).getName();
        }

        @Override // com.heytap.health.telecom.proto.TelecomProto$CallAudioItemOrBuilder
        public ByteString getNameBytes() {
            return ((TelecomProto$CallAudioItem) this.instance).getNameBytes();
        }

        @Override // com.heytap.health.telecom.proto.TelecomProto$CallAudioItemOrBuilder
        public int getType() {
            return ((TelecomProto$CallAudioItem) this.instance).getType();
        }

        public Builder setIsActiveRoute(boolean z) {
            copyOnWrite();
            ((TelecomProto$CallAudioItem) this.instance).setIsActiveRoute(z);
            return this;
        }

        public Builder setMac(String str) {
            copyOnWrite();
            ((TelecomProto$CallAudioItem) this.instance).setMac(str);
            return this;
        }

        public Builder setMacBytes(ByteString byteString) {
            copyOnWrite();
            ((TelecomProto$CallAudioItem) this.instance).setMacBytes(byteString);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((TelecomProto$CallAudioItem) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((TelecomProto$CallAudioItem) this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((TelecomProto$CallAudioItem) this.instance).setType(i);
            return this;
        }

        private Builder() {
            super(TelecomProto$CallAudioItem.DEFAULT_INSTANCE);
        }
    }

    static {
        TelecomProto$CallAudioItem telecomProto$CallAudioItem = new TelecomProto$CallAudioItem();
        DEFAULT_INSTANCE = telecomProto$CallAudioItem;
        GeneratedMessageLite.registerDefaultInstance(TelecomProto$CallAudioItem.class, telecomProto$CallAudioItem);
    }

    private TelecomProto$CallAudioItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsActiveRoute() {
        this.isActiveRoute_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMac() {
        this.mac_ = getDefaultInstance().getMac();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static TelecomProto$CallAudioItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TelecomProto$CallAudioItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TelecomProto$CallAudioItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TelecomProto$CallAudioItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TelecomProto$CallAudioItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TelecomProto$CallAudioItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsActiveRoute(boolean z) {
        this.isActiveRoute_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMac(String str) {
        str.getClass();
        this.mac_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMacBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.mac_ = byteString.toStringUtf8();
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
    public void setType(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nqj.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new TelecomProto$CallAudioItem();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004\u0007", new Object[]{"type_", "name_", "mac_", "isActiveRoute_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TelecomProto$CallAudioItem> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (TelecomProto$CallAudioItem.class) {
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

    @Override // com.heytap.health.telecom.proto.TelecomProto$CallAudioItemOrBuilder
    public boolean getIsActiveRoute() {
        return this.isActiveRoute_;
    }

    @Override // com.heytap.health.telecom.proto.TelecomProto$CallAudioItemOrBuilder
    public String getMac() {
        return this.mac_;
    }

    @Override // com.heytap.health.telecom.proto.TelecomProto$CallAudioItemOrBuilder
    public ByteString getMacBytes() {
        return ByteString.copyFromUtf8(this.mac_);
    }

    @Override // com.heytap.health.telecom.proto.TelecomProto$CallAudioItemOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.heytap.health.telecom.proto.TelecomProto$CallAudioItemOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.heytap.health.telecom.proto.TelecomProto$CallAudioItemOrBuilder
    public int getType() {
        return this.type_;
    }

    public static Builder newBuilder(TelecomProto$CallAudioItem telecomProto$CallAudioItem) {
        return DEFAULT_INSTANCE.createBuilder(telecomProto$CallAudioItem);
    }

    public static TelecomProto$CallAudioItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TelecomProto$CallAudioItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TelecomProto$CallAudioItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TelecomProto$CallAudioItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TelecomProto$CallAudioItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TelecomProto$CallAudioItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TelecomProto$CallAudioItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TelecomProto$CallAudioItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TelecomProto$CallAudioItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TelecomProto$CallAudioItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TelecomProto$CallAudioItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TelecomProto$CallAudioItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TelecomProto$CallAudioItem parseFrom(InputStream inputStream) throws IOException {
        return (TelecomProto$CallAudioItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TelecomProto$CallAudioItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TelecomProto$CallAudioItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TelecomProto$CallAudioItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TelecomProto$CallAudioItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TelecomProto$CallAudioItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TelecomProto$CallAudioItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
