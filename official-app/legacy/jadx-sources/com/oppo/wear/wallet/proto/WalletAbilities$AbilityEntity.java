package com.oppo.wear.wallet.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.g6l;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes9.dex */
public final class WalletAbilities$AbilityEntity extends GeneratedMessageLite<WalletAbilities$AbilityEntity, Builder> implements WalletAbilities$AbilityEntityOrBuilder {
    public static final int ABID_FIELD_NUMBER = 1;
    private static final WalletAbilities$AbilityEntity DEFAULT_INSTANCE;
    public static final int ISSUPPORT_FIELD_NUMBER = 2;
    private static volatile Parser<WalletAbilities$AbilityEntity> PARSER;
    private int abId_;
    private boolean isSupport_;

    public static final class Builder extends GeneratedMessageLite.Builder<WalletAbilities$AbilityEntity, Builder> implements WalletAbilities$AbilityEntityOrBuilder {
        public Builder clearAbId() {
            copyOnWrite();
            ((WalletAbilities$AbilityEntity) this.instance).clearAbId();
            return this;
        }

        public Builder clearIsSupport() {
            copyOnWrite();
            ((WalletAbilities$AbilityEntity) this.instance).clearIsSupport();
            return this;
        }

        @Override // com.oppo.wear.wallet.proto.WalletAbilities$AbilityEntityOrBuilder
        public WalletAbilities$Abilities getAbId() {
            return ((WalletAbilities$AbilityEntity) this.instance).getAbId();
        }

        @Override // com.oppo.wear.wallet.proto.WalletAbilities$AbilityEntityOrBuilder
        public int getAbIdValue() {
            return ((WalletAbilities$AbilityEntity) this.instance).getAbIdValue();
        }

        @Override // com.oppo.wear.wallet.proto.WalletAbilities$AbilityEntityOrBuilder
        public boolean getIsSupport() {
            return ((WalletAbilities$AbilityEntity) this.instance).getIsSupport();
        }

        public Builder setAbId(WalletAbilities$Abilities walletAbilities$Abilities) {
            copyOnWrite();
            ((WalletAbilities$AbilityEntity) this.instance).setAbId(walletAbilities$Abilities);
            return this;
        }

        public Builder setAbIdValue(int i) {
            copyOnWrite();
            ((WalletAbilities$AbilityEntity) this.instance).setAbIdValue(i);
            return this;
        }

        public Builder setIsSupport(boolean z) {
            copyOnWrite();
            ((WalletAbilities$AbilityEntity) this.instance).setIsSupport(z);
            return this;
        }

        private Builder() {
            super(WalletAbilities$AbilityEntity.DEFAULT_INSTANCE);
        }
    }

    static {
        WalletAbilities$AbilityEntity walletAbilities$AbilityEntity = new WalletAbilities$AbilityEntity();
        DEFAULT_INSTANCE = walletAbilities$AbilityEntity;
        GeneratedMessageLite.registerDefaultInstance(WalletAbilities$AbilityEntity.class, walletAbilities$AbilityEntity);
    }

    private WalletAbilities$AbilityEntity() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAbId() {
        this.abId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsSupport() {
        this.isSupport_ = false;
    }

    public static WalletAbilities$AbilityEntity getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WalletAbilities$AbilityEntity parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WalletAbilities$AbilityEntity) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WalletAbilities$AbilityEntity parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WalletAbilities$AbilityEntity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WalletAbilities$AbilityEntity> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAbId(WalletAbilities$Abilities walletAbilities$Abilities) {
        this.abId_ = walletAbilities$Abilities.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAbIdValue(int i) {
        this.abId_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsSupport(boolean z) {
        this.isSupport_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = g6l.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WalletAbilities$AbilityEntity();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0007", new Object[]{"abId_", "isSupport_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WalletAbilities$AbilityEntity> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WalletAbilities$AbilityEntity.class) {
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

    @Override // com.oppo.wear.wallet.proto.WalletAbilities$AbilityEntityOrBuilder
    public WalletAbilities$Abilities getAbId() {
        WalletAbilities$Abilities walletAbilities$AbilitiesForNumber = WalletAbilities$Abilities.forNumber(this.abId_);
        return walletAbilities$AbilitiesForNumber == null ? WalletAbilities$Abilities.UNRECOGNIZED : walletAbilities$AbilitiesForNumber;
    }

    @Override // com.oppo.wear.wallet.proto.WalletAbilities$AbilityEntityOrBuilder
    public int getAbIdValue() {
        return this.abId_;
    }

    @Override // com.oppo.wear.wallet.proto.WalletAbilities$AbilityEntityOrBuilder
    public boolean getIsSupport() {
        return this.isSupport_;
    }

    public static Builder newBuilder(WalletAbilities$AbilityEntity walletAbilities$AbilityEntity) {
        return DEFAULT_INSTANCE.createBuilder(walletAbilities$AbilityEntity);
    }

    public static WalletAbilities$AbilityEntity parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WalletAbilities$AbilityEntity) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WalletAbilities$AbilityEntity parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WalletAbilities$AbilityEntity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WalletAbilities$AbilityEntity parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WalletAbilities$AbilityEntity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WalletAbilities$AbilityEntity parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WalletAbilities$AbilityEntity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WalletAbilities$AbilityEntity parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WalletAbilities$AbilityEntity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WalletAbilities$AbilityEntity parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WalletAbilities$AbilityEntity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WalletAbilities$AbilityEntity parseFrom(InputStream inputStream) throws IOException {
        return (WalletAbilities$AbilityEntity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WalletAbilities$AbilityEntity parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WalletAbilities$AbilityEntity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WalletAbilities$AbilityEntity parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WalletAbilities$AbilityEntity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WalletAbilities$AbilityEntity parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WalletAbilities$AbilityEntity) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
