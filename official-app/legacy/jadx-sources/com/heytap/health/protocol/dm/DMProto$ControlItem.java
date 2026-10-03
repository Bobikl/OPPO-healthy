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
public final class DMProto$ControlItem extends GeneratedMessageLite<DMProto$ControlItem, Builder> implements DMProto$ControlItemOrBuilder {
    private static final DMProto$ControlItem DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile Parser<DMProto$ControlItem> PARSER = null;
    public static final int STATE_FIELD_NUMBER = 3;
    private int id_;
    private String name_ = "";
    private int state_;

    public static final class Builder extends GeneratedMessageLite.Builder<DMProto$ControlItem, Builder> implements DMProto$ControlItemOrBuilder {
        public Builder clearId() {
            copyOnWrite();
            ((DMProto$ControlItem) this.instance).clearId();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((DMProto$ControlItem) this.instance).clearName();
            return this;
        }

        public Builder clearState() {
            copyOnWrite();
            ((DMProto$ControlItem) this.instance).clearState();
            return this;
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ControlItemOrBuilder
        public int getId() {
            return ((DMProto$ControlItem) this.instance).getId();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ControlItemOrBuilder
        public String getName() {
            return ((DMProto$ControlItem) this.instance).getName();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ControlItemOrBuilder
        public ByteString getNameBytes() {
            return ((DMProto$ControlItem) this.instance).getNameBytes();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$ControlItemOrBuilder
        public int getState() {
            return ((DMProto$ControlItem) this.instance).getState();
        }

        public Builder setId(int i) {
            copyOnWrite();
            ((DMProto$ControlItem) this.instance).setId(i);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((DMProto$ControlItem) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((DMProto$ControlItem) this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setState(int i) {
            copyOnWrite();
            ((DMProto$ControlItem) this.instance).setState(i);
            return this;
        }

        private Builder() {
            super(DMProto$ControlItem.DEFAULT_INSTANCE);
        }
    }

    static {
        DMProto$ControlItem dMProto$ControlItem = new DMProto$ControlItem();
        DEFAULT_INSTANCE = dMProto$ControlItem;
        GeneratedMessageLite.registerDefaultInstance(DMProto$ControlItem.class, dMProto$ControlItem);
    }

    private DMProto$ControlItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = 0;
    }

    public static DMProto$ControlItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DMProto$ControlItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DMProto$ControlItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$ControlItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DMProto$ControlItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DMProto$ControlItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(int i) {
        this.id_ = i;
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
    public void setState(int i) {
        this.state_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yl4.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DMProto$ControlItem();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003\u0004", new Object[]{"id_", "name_", "state_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DMProto$ControlItem> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DMProto$ControlItem.class) {
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

    @Override // com.heytap.health.protocol.dm.DMProto$ControlItemOrBuilder
    public int getId() {
        return this.id_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ControlItemOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ControlItemOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.heytap.health.protocol.dm.DMProto$ControlItemOrBuilder
    public int getState() {
        return this.state_;
    }

    public static Builder newBuilder(DMProto$ControlItem dMProto$ControlItem) {
        return DEFAULT_INSTANCE.createBuilder(dMProto$ControlItem);
    }

    public static DMProto$ControlItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$ControlItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$ControlItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$ControlItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DMProto$ControlItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DMProto$ControlItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DMProto$ControlItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$ControlItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DMProto$ControlItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DMProto$ControlItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DMProto$ControlItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$ControlItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DMProto$ControlItem parseFrom(InputStream inputStream) throws IOException {
        return (DMProto$ControlItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$ControlItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$ControlItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$ControlItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DMProto$ControlItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DMProto$ControlItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$ControlItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
