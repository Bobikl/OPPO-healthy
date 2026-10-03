package com.oppo.wear.wallet.proto;

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
public final class IccoaDkfConstant$IccoaDkDatabeanExt extends GeneratedMessageLite<IccoaDkfConstant$IccoaDkDatabeanExt, Builder> implements IccoaDkfConstant$IccoaDkDatabeanExtOrBuilder {
    public static final int BLEBROADCASTKEY_FIELD_NUMBER = 4;
    public static final int BLEVALUE_FIELD_NUMBER = 3;
    public static final int CLOUDCAP_FIELD_NUMBER = 5;
    public static final int DECRYPTEDMACADDRESSBYTES_FIELD_NUMBER = 1;
    private static final IccoaDkfConstant$IccoaDkDatabeanExt DEFAULT_INSTANCE;
    public static final int ISSUPPORTMAC_FIELD_NUMBER = 2;
    private static volatile Parser<IccoaDkfConstant$IccoaDkDatabeanExt> PARSER;
    private ByteString bleBroadcastKey_;
    private ByteString bleValue_;
    private int cloudCap_;
    private ByteString decryptedMacAddressBytes_;
    private boolean isSupportMac_;

    public static final class Builder extends GeneratedMessageLite.Builder<IccoaDkfConstant$IccoaDkDatabeanExt, Builder> implements IccoaDkfConstant$IccoaDkDatabeanExtOrBuilder {
        public Builder clearBleBroadcastKey() {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabeanExt) this.instance).clearBleBroadcastKey();
            return this;
        }

        public Builder clearBleValue() {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabeanExt) this.instance).clearBleValue();
            return this;
        }

        public Builder clearCloudCap() {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabeanExt) this.instance).clearCloudCap();
            return this;
        }

        public Builder clearDecryptedMacAddressBytes() {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabeanExt) this.instance).clearDecryptedMacAddressBytes();
            return this;
        }

        public Builder clearIsSupportMac() {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabeanExt) this.instance).clearIsSupportMac();
            return this;
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanExtOrBuilder
        public ByteString getBleBroadcastKey() {
            return ((IccoaDkfConstant$IccoaDkDatabeanExt) this.instance).getBleBroadcastKey();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanExtOrBuilder
        public ByteString getBleValue() {
            return ((IccoaDkfConstant$IccoaDkDatabeanExt) this.instance).getBleValue();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanExtOrBuilder
        public IccoaDkfConstant$CloudConstants_Capability getCloudCap() {
            return ((IccoaDkfConstant$IccoaDkDatabeanExt) this.instance).getCloudCap();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanExtOrBuilder
        public int getCloudCapValue() {
            return ((IccoaDkfConstant$IccoaDkDatabeanExt) this.instance).getCloudCapValue();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanExtOrBuilder
        public ByteString getDecryptedMacAddressBytes() {
            return ((IccoaDkfConstant$IccoaDkDatabeanExt) this.instance).getDecryptedMacAddressBytes();
        }

        @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanExtOrBuilder
        public boolean getIsSupportMac() {
            return ((IccoaDkfConstant$IccoaDkDatabeanExt) this.instance).getIsSupportMac();
        }

        public Builder setBleBroadcastKey(ByteString byteString) {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabeanExt) this.instance).setBleBroadcastKey(byteString);
            return this;
        }

        public Builder setBleValue(ByteString byteString) {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabeanExt) this.instance).setBleValue(byteString);
            return this;
        }

        public Builder setCloudCap(IccoaDkfConstant$CloudConstants_Capability iccoaDkfConstant$CloudConstants_Capability) {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabeanExt) this.instance).setCloudCap(iccoaDkfConstant$CloudConstants_Capability);
            return this;
        }

        public Builder setCloudCapValue(int i) {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabeanExt) this.instance).setCloudCapValue(i);
            return this;
        }

        public Builder setDecryptedMacAddressBytes(ByteString byteString) {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabeanExt) this.instance).setDecryptedMacAddressBytes(byteString);
            return this;
        }

        public Builder setIsSupportMac(boolean z) {
            copyOnWrite();
            ((IccoaDkfConstant$IccoaDkDatabeanExt) this.instance).setIsSupportMac(z);
            return this;
        }

        private Builder() {
            super(IccoaDkfConstant$IccoaDkDatabeanExt.DEFAULT_INSTANCE);
        }
    }

    static {
        IccoaDkfConstant$IccoaDkDatabeanExt iccoaDkfConstant$IccoaDkDatabeanExt = new IccoaDkfConstant$IccoaDkDatabeanExt();
        DEFAULT_INSTANCE = iccoaDkfConstant$IccoaDkDatabeanExt;
        GeneratedMessageLite.registerDefaultInstance(IccoaDkfConstant$IccoaDkDatabeanExt.class, iccoaDkfConstant$IccoaDkDatabeanExt);
    }

    private IccoaDkfConstant$IccoaDkDatabeanExt() {
        ByteString byteString = ByteString.EMPTY;
        this.decryptedMacAddressBytes_ = byteString;
        this.bleValue_ = byteString;
        this.bleBroadcastKey_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBleBroadcastKey() {
        this.bleBroadcastKey_ = getDefaultInstance().getBleBroadcastKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBleValue() {
        this.bleValue_ = getDefaultInstance().getBleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCloudCap() {
        this.cloudCap_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDecryptedMacAddressBytes() {
        this.decryptedMacAddressBytes_ = getDefaultInstance().getDecryptedMacAddressBytes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsSupportMac() {
        this.isSupportMac_ = false;
    }

    public static IccoaDkfConstant$IccoaDkDatabeanExt getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static IccoaDkfConstant$IccoaDkDatabeanExt parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IccoaDkfConstant$IccoaDkDatabeanExt) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IccoaDkfConstant$IccoaDkDatabeanExt parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$IccoaDkDatabeanExt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<IccoaDkfConstant$IccoaDkDatabeanExt> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBleBroadcastKey(ByteString byteString) {
        byteString.getClass();
        this.bleBroadcastKey_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBleValue(ByteString byteString) {
        byteString.getClass();
        this.bleValue_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCloudCap(IccoaDkfConstant$CloudConstants_Capability iccoaDkfConstant$CloudConstants_Capability) {
        this.cloudCap_ = iccoaDkfConstant$CloudConstants_Capability.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCloudCapValue(int i) {
        this.cloudCap_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDecryptedMacAddressBytes(ByteString byteString) {
        byteString.getClass();
        this.decryptedMacAddressBytes_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsSupportMac(boolean z) {
        this.isSupportMac_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = j1a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new IccoaDkfConstant$IccoaDkDatabeanExt();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\n\u0002\u0007\u0003\n\u0004\n\u0005\f", new Object[]{"decryptedMacAddressBytes_", "isSupportMac_", "bleValue_", "bleBroadcastKey_", "cloudCap_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<IccoaDkfConstant$IccoaDkDatabeanExt> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (IccoaDkfConstant$IccoaDkDatabeanExt.class) {
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

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanExtOrBuilder
    public ByteString getBleBroadcastKey() {
        return this.bleBroadcastKey_;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanExtOrBuilder
    public ByteString getBleValue() {
        return this.bleValue_;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanExtOrBuilder
    public IccoaDkfConstant$CloudConstants_Capability getCloudCap() {
        IccoaDkfConstant$CloudConstants_Capability iccoaDkfConstant$CloudConstants_CapabilityForNumber = IccoaDkfConstant$CloudConstants_Capability.forNumber(this.cloudCap_);
        return iccoaDkfConstant$CloudConstants_CapabilityForNumber == null ? IccoaDkfConstant$CloudConstants_Capability.UNRECOGNIZED : iccoaDkfConstant$CloudConstants_CapabilityForNumber;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanExtOrBuilder
    public int getCloudCapValue() {
        return this.cloudCap_;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanExtOrBuilder
    public ByteString getDecryptedMacAddressBytes() {
        return this.decryptedMacAddressBytes_;
    }

    @Override // com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabeanExtOrBuilder
    public boolean getIsSupportMac() {
        return this.isSupportMac_;
    }

    public static Builder newBuilder(IccoaDkfConstant$IccoaDkDatabeanExt iccoaDkfConstant$IccoaDkDatabeanExt) {
        return DEFAULT_INSTANCE.createBuilder(iccoaDkfConstant$IccoaDkDatabeanExt);
    }

    public static IccoaDkfConstant$IccoaDkDatabeanExt parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IccoaDkfConstant$IccoaDkDatabeanExt) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IccoaDkfConstant$IccoaDkDatabeanExt parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$IccoaDkDatabeanExt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static IccoaDkfConstant$IccoaDkDatabeanExt parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$IccoaDkDatabeanExt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static IccoaDkfConstant$IccoaDkDatabeanExt parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$IccoaDkDatabeanExt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static IccoaDkfConstant$IccoaDkDatabeanExt parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$IccoaDkDatabeanExt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IccoaDkfConstant$IccoaDkDatabeanExt parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (IccoaDkfConstant$IccoaDkDatabeanExt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static IccoaDkfConstant$IccoaDkDatabeanExt parseFrom(InputStream inputStream) throws IOException {
        return (IccoaDkfConstant$IccoaDkDatabeanExt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IccoaDkfConstant$IccoaDkDatabeanExt parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IccoaDkfConstant$IccoaDkDatabeanExt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static IccoaDkfConstant$IccoaDkDatabeanExt parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (IccoaDkfConstant$IccoaDkDatabeanExt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static IccoaDkfConstant$IccoaDkDatabeanExt parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IccoaDkfConstant$IccoaDkDatabeanExt) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
