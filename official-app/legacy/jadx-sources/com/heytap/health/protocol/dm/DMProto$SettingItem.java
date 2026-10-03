package com.heytap.health.protocol.dm;

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
public final class DMProto$SettingItem extends GeneratedMessageLite<DMProto$SettingItem, Builder> implements DMProto$SettingItemOrBuilder {
    private static final DMProto$SettingItem DEFAULT_INSTANCE;
    private static volatile Parser<DMProto$SettingItem> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int type_;
    private boolean value_;

    public static final class Builder extends GeneratedMessageLite.Builder<DMProto$SettingItem, Builder> implements DMProto$SettingItemOrBuilder {
        public Builder clearType() {
            copyOnWrite();
            ((DMProto$SettingItem) this.instance).clearType();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((DMProto$SettingItem) this.instance).clearValue();
            return this;
        }

        @Override // com.heytap.health.protocol.dm.DMProto$SettingItemOrBuilder
        public int getType() {
            return ((DMProto$SettingItem) this.instance).getType();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$SettingItemOrBuilder
        public boolean getValue() {
            return ((DMProto$SettingItem) this.instance).getValue();
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((DMProto$SettingItem) this.instance).setType(i);
            return this;
        }

        public Builder setValue(boolean z) {
            copyOnWrite();
            ((DMProto$SettingItem) this.instance).setValue(z);
            return this;
        }

        private Builder() {
            super(DMProto$SettingItem.DEFAULT_INSTANCE);
        }
    }

    static {
        DMProto$SettingItem dMProto$SettingItem = new DMProto$SettingItem();
        DEFAULT_INSTANCE = dMProto$SettingItem;
        GeneratedMessageLite.registerDefaultInstance(DMProto$SettingItem.class, dMProto$SettingItem);
    }

    private DMProto$SettingItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = false;
    }

    public static DMProto$SettingItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DMProto$SettingItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DMProto$SettingItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$SettingItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DMProto$SettingItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DMProto$SettingItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i) {
        this.type_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(boolean z) {
        this.value_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yl4.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DMProto$SettingItem();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0007", new Object[]{"type_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DMProto$SettingItem> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DMProto$SettingItem.class) {
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

    @Override // com.heytap.health.protocol.dm.DMProto$SettingItemOrBuilder
    public int getType() {
        return this.type_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$SettingItemOrBuilder
    public boolean getValue() {
        return this.value_;
    }

    public static Builder newBuilder(DMProto$SettingItem dMProto$SettingItem) {
        return DEFAULT_INSTANCE.createBuilder(dMProto$SettingItem);
    }

    public static DMProto$SettingItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$SettingItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$SettingItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$SettingItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DMProto$SettingItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DMProto$SettingItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DMProto$SettingItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$SettingItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DMProto$SettingItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DMProto$SettingItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DMProto$SettingItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$SettingItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DMProto$SettingItem parseFrom(InputStream inputStream) throws IOException {
        return (DMProto$SettingItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$SettingItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$SettingItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$SettingItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DMProto$SettingItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DMProto$SettingItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$SettingItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
