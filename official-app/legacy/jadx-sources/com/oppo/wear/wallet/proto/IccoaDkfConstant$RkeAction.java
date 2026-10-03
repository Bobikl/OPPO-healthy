package com.oppo.wear.wallet.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.j1a;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes9.dex */
public final class IccoaDkfConstant$RkeAction extends GeneratedMessageLite<IccoaDkfConstant$RkeAction, Builder> implements IccoaDkfConstant$RkeActionOrBuilder {
    public static final int ACTIONID_FIELD_NUMBER = 3;
    private static final IccoaDkfConstant$RkeAction DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<IccoaDkfConstant$RkeAction> PARSER;
    private String name_ = "";
    private String description_ = "";
    private String actionId_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<IccoaDkfConstant$RkeAction, Builder> implements IccoaDkfConstant$RkeActionOrBuilder {
        public Builder clearActionId() {
            copyOnWrite();
            ((IccoaDkfConstant$RkeAction) this.instance).clearActionId();
            return this;
        }

        public Builder clearDescription() {
            copyOnWrite();
            ((IccoaDkfConstant$RkeAction) this.instance).clearDescription();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((IccoaDkfConstant$RkeAction) this.instance).clearName();
            return this;
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$RkeActionOrBuilder
        public String getActionId() {
            return ((IccoaDkfConstant$RkeAction) this.instance).getActionId();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$RkeActionOrBuilder
        public ByteString getActionIdBytes() {
            return ((IccoaDkfConstant$RkeAction) this.instance).getActionIdBytes();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$RkeActionOrBuilder
        public String getDescription() {
            return ((IccoaDkfConstant$RkeAction) this.instance).getDescription();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$RkeActionOrBuilder
        public ByteString getDescriptionBytes() {
            return ((IccoaDkfConstant$RkeAction) this.instance).getDescriptionBytes();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$RkeActionOrBuilder
        public String getName() {
            return ((IccoaDkfConstant$RkeAction) this.instance).getName();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$RkeActionOrBuilder
        public ByteString getNameBytes() {
            return ((IccoaDkfConstant$RkeAction) this.instance).getNameBytes();
        }

        public Builder setActionId(String str) {
            copyOnWrite();
            ((IccoaDkfConstant$RkeAction) this.instance).setActionId(str);
            return this;
        }

        public Builder setActionIdBytes(ByteString byteString) {
            copyOnWrite();
            ((IccoaDkfConstant$RkeAction) this.instance).setActionIdBytes(byteString);
            return this;
        }

        public Builder setDescription(String str) {
            copyOnWrite();
            ((IccoaDkfConstant$RkeAction) this.instance).setDescription(str);
            return this;
        }

        public Builder setDescriptionBytes(ByteString byteString) {
            copyOnWrite();
            ((IccoaDkfConstant$RkeAction) this.instance).setDescriptionBytes(byteString);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((IccoaDkfConstant$RkeAction) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((IccoaDkfConstant$RkeAction) this.instance).setNameBytes(byteString);
            return this;
        }

        private Builder() {
            super(IccoaDkfConstant$RkeAction.DEFAULT_INSTANCE);
        }
    }

    static {
        IccoaDkfConstant$RkeAction iccoaDkfConstant$RkeAction = new IccoaDkfConstant$RkeAction();
        DEFAULT_INSTANCE = iccoaDkfConstant$RkeAction;
        GeneratedMessageLite.registerDefaultInstance(IccoaDkfConstant$RkeAction.class, iccoaDkfConstant$RkeAction);
    }

    private IccoaDkfConstant$RkeAction() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActionId() {
        this.actionId_ = getDefaultInstance().getActionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    public static IccoaDkfConstant$RkeAction getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static IccoaDkfConstant$RkeAction parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IccoaDkfConstant$RkeAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IccoaDkfConstant$RkeAction parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$RkeAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<IccoaDkfConstant$RkeAction> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionId(String str) {
        str.getClass();
        this.actionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.actionId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        str.getClass();
        this.description_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.description_ = byteString.toStringUtf8();
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

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = j1a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new IccoaDkfConstant$RkeAction();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"name_", "description_", "actionId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<IccoaDkfConstant$RkeAction> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (IccoaDkfConstant$RkeAction.class) {
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

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$RkeActionOrBuilder
    public String getActionId() {
        return this.actionId_;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$RkeActionOrBuilder
    public ByteString getActionIdBytes() {
        return ByteString.copyFromUtf8(this.actionId_);
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$RkeActionOrBuilder
    public String getDescription() {
        return this.description_;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$RkeActionOrBuilder
    public ByteString getDescriptionBytes() {
        return ByteString.copyFromUtf8(this.description_);
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$RkeActionOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$RkeActionOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public static Builder newBuilder(IccoaDkfConstant$RkeAction iccoaDkfConstant$RkeAction) {
        return DEFAULT_INSTANCE.createBuilder(iccoaDkfConstant$RkeAction);
    }

    public static IccoaDkfConstant$RkeAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IccoaDkfConstant$RkeAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IccoaDkfConstant$RkeAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$RkeAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static IccoaDkfConstant$RkeAction parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$RkeAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static IccoaDkfConstant$RkeAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$RkeAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static IccoaDkfConstant$RkeAction parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$RkeAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IccoaDkfConstant$RkeAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$RkeAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static IccoaDkfConstant$RkeAction parseFrom(InputStream inputStream) throws IOException {
        return (IccoaDkfConstant$RkeAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IccoaDkfConstant$RkeAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IccoaDkfConstant$RkeAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IccoaDkfConstant$RkeAction parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (IccoaDkfConstant$RkeAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static IccoaDkfConstant$RkeAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IccoaDkfConstant$RkeAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
