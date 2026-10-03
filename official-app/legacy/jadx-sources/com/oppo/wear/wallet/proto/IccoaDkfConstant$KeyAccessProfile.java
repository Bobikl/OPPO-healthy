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
public final class IccoaDkfConstant$KeyAccessProfile extends GeneratedMessageLite<IccoaDkfConstant$KeyAccessProfile, Builder> implements IccoaDkfConstant$KeyAccessProfileOrBuilder {
    private static final IccoaDkfConstant$KeyAccessProfile DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int KEYPRIVILEGE_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<IccoaDkfConstant$KeyAccessProfile> PARSER;
    private String name_ = "";
    private String description_ = "";
    private String keyPrivilege_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<IccoaDkfConstant$KeyAccessProfile, Builder> implements IccoaDkfConstant$KeyAccessProfileOrBuilder {
        public Builder clearDescription() {
            copyOnWrite();
            ((IccoaDkfConstant$KeyAccessProfile) this.instance).clearDescription();
            return this;
        }

        public Builder clearKeyPrivilege() {
            copyOnWrite();
            ((IccoaDkfConstant$KeyAccessProfile) this.instance).clearKeyPrivilege();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((IccoaDkfConstant$KeyAccessProfile) this.instance).clearName();
            return this;
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$KeyAccessProfileOrBuilder
        public String getDescription() {
            return ((IccoaDkfConstant$KeyAccessProfile) this.instance).getDescription();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$KeyAccessProfileOrBuilder
        public ByteString getDescriptionBytes() {
            return ((IccoaDkfConstant$KeyAccessProfile) this.instance).getDescriptionBytes();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$KeyAccessProfileOrBuilder
        public String getKeyPrivilege() {
            return ((IccoaDkfConstant$KeyAccessProfile) this.instance).getKeyPrivilege();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$KeyAccessProfileOrBuilder
        public ByteString getKeyPrivilegeBytes() {
            return ((IccoaDkfConstant$KeyAccessProfile) this.instance).getKeyPrivilegeBytes();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$KeyAccessProfileOrBuilder
        public String getName() {
            return ((IccoaDkfConstant$KeyAccessProfile) this.instance).getName();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$KeyAccessProfileOrBuilder
        public ByteString getNameBytes() {
            return ((IccoaDkfConstant$KeyAccessProfile) this.instance).getNameBytes();
        }

        public Builder setDescription(String str) {
            copyOnWrite();
            ((IccoaDkfConstant$KeyAccessProfile) this.instance).setDescription(str);
            return this;
        }

        public Builder setDescriptionBytes(ByteString byteString) {
            copyOnWrite();
            ((IccoaDkfConstant$KeyAccessProfile) this.instance).setDescriptionBytes(byteString);
            return this;
        }

        public Builder setKeyPrivilege(String str) {
            copyOnWrite();
            ((IccoaDkfConstant$KeyAccessProfile) this.instance).setKeyPrivilege(str);
            return this;
        }

        public Builder setKeyPrivilegeBytes(ByteString byteString) {
            copyOnWrite();
            ((IccoaDkfConstant$KeyAccessProfile) this.instance).setKeyPrivilegeBytes(byteString);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((IccoaDkfConstant$KeyAccessProfile) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((IccoaDkfConstant$KeyAccessProfile) this.instance).setNameBytes(byteString);
            return this;
        }

        private Builder() {
            super(IccoaDkfConstant$KeyAccessProfile.DEFAULT_INSTANCE);
        }
    }

    static {
        IccoaDkfConstant$KeyAccessProfile iccoaDkfConstant$KeyAccessProfile = new IccoaDkfConstant$KeyAccessProfile();
        DEFAULT_INSTANCE = iccoaDkfConstant$KeyAccessProfile;
        GeneratedMessageLite.registerDefaultInstance(IccoaDkfConstant$KeyAccessProfile.class, iccoaDkfConstant$KeyAccessProfile);
    }

    private IccoaDkfConstant$KeyAccessProfile() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKeyPrivilege() {
        this.keyPrivilege_ = getDefaultInstance().getKeyPrivilege();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    public static IccoaDkfConstant$KeyAccessProfile getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static IccoaDkfConstant$KeyAccessProfile parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IccoaDkfConstant$KeyAccessProfile) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IccoaDkfConstant$KeyAccessProfile parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$KeyAccessProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<IccoaDkfConstant$KeyAccessProfile> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setKeyPrivilege(String str) {
        str.getClass();
        this.keyPrivilege_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyPrivilegeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.keyPrivilege_ = byteString.toStringUtf8();
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
                return new IccoaDkfConstant$KeyAccessProfile();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"name_", "description_", "keyPrivilege_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<IccoaDkfConstant$KeyAccessProfile> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (IccoaDkfConstant$KeyAccessProfile.class) {
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

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$KeyAccessProfileOrBuilder
    public String getDescription() {
        return this.description_;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$KeyAccessProfileOrBuilder
    public ByteString getDescriptionBytes() {
        return ByteString.copyFromUtf8(this.description_);
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$KeyAccessProfileOrBuilder
    public String getKeyPrivilege() {
        return this.keyPrivilege_;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$KeyAccessProfileOrBuilder
    public ByteString getKeyPrivilegeBytes() {
        return ByteString.copyFromUtf8(this.keyPrivilege_);
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$KeyAccessProfileOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$KeyAccessProfileOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public static Builder newBuilder(IccoaDkfConstant$KeyAccessProfile iccoaDkfConstant$KeyAccessProfile) {
        return DEFAULT_INSTANCE.createBuilder(iccoaDkfConstant$KeyAccessProfile);
    }

    public static IccoaDkfConstant$KeyAccessProfile parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IccoaDkfConstant$KeyAccessProfile) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IccoaDkfConstant$KeyAccessProfile parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$KeyAccessProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static IccoaDkfConstant$KeyAccessProfile parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$KeyAccessProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static IccoaDkfConstant$KeyAccessProfile parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$KeyAccessProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static IccoaDkfConstant$KeyAccessProfile parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$KeyAccessProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IccoaDkfConstant$KeyAccessProfile parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$KeyAccessProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static IccoaDkfConstant$KeyAccessProfile parseFrom(InputStream inputStream) throws IOException {
        return (IccoaDkfConstant$KeyAccessProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IccoaDkfConstant$KeyAccessProfile parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IccoaDkfConstant$KeyAccessProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IccoaDkfConstant$KeyAccessProfile parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (IccoaDkfConstant$KeyAccessProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static IccoaDkfConstant$KeyAccessProfile parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IccoaDkfConstant$KeyAccessProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
