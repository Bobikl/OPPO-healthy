package com.oppo.wear.wallet.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.wp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes9.dex */
public final class AddCardManager$CardInfoMessage extends GeneratedMessageLite<AddCardManager$CardInfoMessage, Builder> implements AddCardManager$CardInfoMessageOrBuilder {
    public static final int APPCODE_FIELD_NUMBER = 9;
    public static final int CARDAMOUNT_FIELD_NUMBER = 8;
    public static final int CARDIMAGE_FIELD_NUMBER = 7;
    private static final AddCardManager$CardInfoMessage DEFAULT_INSTANCE;
    private static volatile Parser<AddCardManager$CardInfoMessage> PARSER = null;
    public static final int WALLETCARDAID_FIELD_NUMBER = 1;
    public static final int WALLETCARDDEFAULT_FIELD_NUMBER = 6;
    public static final int WALLETCARDNAME_FIELD_NUMBER = 2;
    public static final int WALLETCARDNO_FIELD_NUMBER = 3;
    public static final int WALLETCARDSTATUS_FIELD_NUMBER = 4;
    public static final int WALLETCARDTYPE_FIELD_NUMBER = 5;
    private int cardAmount_;
    private int walletCardDefault_;
    private int walletCardStatus_;
    private int walletCardType_;
    private String walletCardAid_ = "";
    private String walletCardName_ = "";
    private String walletCardNo_ = "";
    private ByteString cardImage_ = ByteString.EMPTY;
    private String appCode_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<AddCardManager$CardInfoMessage, Builder> implements AddCardManager$CardInfoMessageOrBuilder {
        public Builder clearAppCode() {
            copyOnWrite();
            ((AddCardManager$CardInfoMessage) this.instance).clearAppCode();
            return this;
        }

        public Builder clearCardAmount() {
            copyOnWrite();
            ((AddCardManager$CardInfoMessage) this.instance).clearCardAmount();
            return this;
        }

        public Builder clearCardImage() {
            copyOnWrite();
            ((AddCardManager$CardInfoMessage) this.instance).clearCardImage();
            return this;
        }

        public Builder clearWalletCardAid() {
            copyOnWrite();
            ((AddCardManager$CardInfoMessage) this.instance).clearWalletCardAid();
            return this;
        }

        public Builder clearWalletCardDefault() {
            copyOnWrite();
            ((AddCardManager$CardInfoMessage) this.instance).clearWalletCardDefault();
            return this;
        }

        public Builder clearWalletCardName() {
            copyOnWrite();
            ((AddCardManager$CardInfoMessage) this.instance).clearWalletCardName();
            return this;
        }

        public Builder clearWalletCardNo() {
            copyOnWrite();
            ((AddCardManager$CardInfoMessage) this.instance).clearWalletCardNo();
            return this;
        }

        public Builder clearWalletCardStatus() {
            copyOnWrite();
            ((AddCardManager$CardInfoMessage) this.instance).clearWalletCardStatus();
            return this;
        }

        public Builder clearWalletCardType() {
            copyOnWrite();
            ((AddCardManager$CardInfoMessage) this.instance).clearWalletCardType();
            return this;
        }

        @Override // com.oppo.wear.wallet.proto.AddCardManager$CardInfoMessageOrBuilder
        public String getAppCode() {
            return ((AddCardManager$CardInfoMessage) this.instance).getAppCode();
        }

        @Override // com.oppo.wear.wallet.proto.AddCardManager$CardInfoMessageOrBuilder
        public ByteString getAppCodeBytes() {
            return ((AddCardManager$CardInfoMessage) this.instance).getAppCodeBytes();
        }

        @Override // com.oppo.wear.wallet.proto.AddCardManager$CardInfoMessageOrBuilder
        public int getCardAmount() {
            return ((AddCardManager$CardInfoMessage) this.instance).getCardAmount();
        }

        @Override // com.oppo.wear.wallet.proto.AddCardManager$CardInfoMessageOrBuilder
        public ByteString getCardImage() {
            return ((AddCardManager$CardInfoMessage) this.instance).getCardImage();
        }

        @Override // com.oppo.wear.wallet.proto.AddCardManager$CardInfoMessageOrBuilder
        public String getWalletCardAid() {
            return ((AddCardManager$CardInfoMessage) this.instance).getWalletCardAid();
        }

        @Override // com.oppo.wear.wallet.proto.AddCardManager$CardInfoMessageOrBuilder
        public ByteString getWalletCardAidBytes() {
            return ((AddCardManager$CardInfoMessage) this.instance).getWalletCardAidBytes();
        }

        @Override // com.oppo.wear.wallet.proto.AddCardManager$CardInfoMessageOrBuilder
        public int getWalletCardDefault() {
            return ((AddCardManager$CardInfoMessage) this.instance).getWalletCardDefault();
        }

        @Override // com.oppo.wear.wallet.proto.AddCardManager$CardInfoMessageOrBuilder
        public String getWalletCardName() {
            return ((AddCardManager$CardInfoMessage) this.instance).getWalletCardName();
        }

        @Override // com.oppo.wear.wallet.proto.AddCardManager$CardInfoMessageOrBuilder
        public ByteString getWalletCardNameBytes() {
            return ((AddCardManager$CardInfoMessage) this.instance).getWalletCardNameBytes();
        }

        @Override // com.oppo.wear.wallet.proto.AddCardManager$CardInfoMessageOrBuilder
        public String getWalletCardNo() {
            return ((AddCardManager$CardInfoMessage) this.instance).getWalletCardNo();
        }

        @Override // com.oppo.wear.wallet.proto.AddCardManager$CardInfoMessageOrBuilder
        public ByteString getWalletCardNoBytes() {
            return ((AddCardManager$CardInfoMessage) this.instance).getWalletCardNoBytes();
        }

        @Override // com.oppo.wear.wallet.proto.AddCardManager$CardInfoMessageOrBuilder
        public int getWalletCardStatus() {
            return ((AddCardManager$CardInfoMessage) this.instance).getWalletCardStatus();
        }

        @Override // com.oppo.wear.wallet.proto.AddCardManager$CardInfoMessageOrBuilder
        public int getWalletCardType() {
            return ((AddCardManager$CardInfoMessage) this.instance).getWalletCardType();
        }

        public Builder setAppCode(String str) {
            copyOnWrite();
            ((AddCardManager$CardInfoMessage) this.instance).setAppCode(str);
            return this;
        }

        public Builder setAppCodeBytes(ByteString byteString) {
            copyOnWrite();
            ((AddCardManager$CardInfoMessage) this.instance).setAppCodeBytes(byteString);
            return this;
        }

        public Builder setCardAmount(int i) {
            copyOnWrite();
            ((AddCardManager$CardInfoMessage) this.instance).setCardAmount(i);
            return this;
        }

        public Builder setCardImage(ByteString byteString) {
            copyOnWrite();
            ((AddCardManager$CardInfoMessage) this.instance).setCardImage(byteString);
            return this;
        }

        public Builder setWalletCardAid(String str) {
            copyOnWrite();
            ((AddCardManager$CardInfoMessage) this.instance).setWalletCardAid(str);
            return this;
        }

        public Builder setWalletCardAidBytes(ByteString byteString) {
            copyOnWrite();
            ((AddCardManager$CardInfoMessage) this.instance).setWalletCardAidBytes(byteString);
            return this;
        }

        public Builder setWalletCardDefault(int i) {
            copyOnWrite();
            ((AddCardManager$CardInfoMessage) this.instance).setWalletCardDefault(i);
            return this;
        }

        public Builder setWalletCardName(String str) {
            copyOnWrite();
            ((AddCardManager$CardInfoMessage) this.instance).setWalletCardName(str);
            return this;
        }

        public Builder setWalletCardNameBytes(ByteString byteString) {
            copyOnWrite();
            ((AddCardManager$CardInfoMessage) this.instance).setWalletCardNameBytes(byteString);
            return this;
        }

        public Builder setWalletCardNo(String str) {
            copyOnWrite();
            ((AddCardManager$CardInfoMessage) this.instance).setWalletCardNo(str);
            return this;
        }

        public Builder setWalletCardNoBytes(ByteString byteString) {
            copyOnWrite();
            ((AddCardManager$CardInfoMessage) this.instance).setWalletCardNoBytes(byteString);
            return this;
        }

        public Builder setWalletCardStatus(int i) {
            copyOnWrite();
            ((AddCardManager$CardInfoMessage) this.instance).setWalletCardStatus(i);
            return this;
        }

        public Builder setWalletCardType(int i) {
            copyOnWrite();
            ((AddCardManager$CardInfoMessage) this.instance).setWalletCardType(i);
            return this;
        }

        private Builder() {
            super(AddCardManager$CardInfoMessage.DEFAULT_INSTANCE);
        }
    }

    static {
        AddCardManager$CardInfoMessage addCardManager$CardInfoMessage = new AddCardManager$CardInfoMessage();
        DEFAULT_INSTANCE = addCardManager$CardInfoMessage;
        GeneratedMessageLite.registerDefaultInstance(AddCardManager$CardInfoMessage.class, addCardManager$CardInfoMessage);
    }

    private AddCardManager$CardInfoMessage() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppCode() {
        this.appCode_ = getDefaultInstance().getAppCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCardAmount() {
        this.cardAmount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCardImage() {
        this.cardImage_ = getDefaultInstance().getCardImage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWalletCardAid() {
        this.walletCardAid_ = getDefaultInstance().getWalletCardAid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWalletCardDefault() {
        this.walletCardDefault_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWalletCardName() {
        this.walletCardName_ = getDefaultInstance().getWalletCardName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWalletCardNo() {
        this.walletCardNo_ = getDefaultInstance().getWalletCardNo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWalletCardStatus() {
        this.walletCardStatus_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWalletCardType() {
        this.walletCardType_ = 0;
    }

    public static AddCardManager$CardInfoMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static AddCardManager$CardInfoMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AddCardManager$CardInfoMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AddCardManager$CardInfoMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AddCardManager$CardInfoMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<AddCardManager$CardInfoMessage> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppCode(String str) {
        str.getClass();
        this.appCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppCodeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.appCode_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardAmount(int i) {
        this.cardAmount_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardImage(ByteString byteString) {
        byteString.getClass();
        this.cardImage_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWalletCardAid(String str) {
        str.getClass();
        this.walletCardAid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWalletCardAidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.walletCardAid_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWalletCardDefault(int i) {
        this.walletCardDefault_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWalletCardName(String str) {
        str.getClass();
        this.walletCardName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWalletCardNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.walletCardName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWalletCardNo(String str) {
        str.getClass();
        this.walletCardNo_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWalletCardNoBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.walletCardNo_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWalletCardStatus(int i) {
        this.walletCardStatus_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWalletCardType(int i) {
        this.walletCardType_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = wp.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new AddCardManager$CardInfoMessage();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0004\u0005\u0004\u0006\u0004\u0007\n\b\u0004\tȈ", new Object[]{"walletCardAid_", "walletCardName_", "walletCardNo_", "walletCardStatus_", "walletCardType_", "walletCardDefault_", "cardImage_", "cardAmount_", "appCode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AddCardManager$CardInfoMessage> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (AddCardManager$CardInfoMessage.class) {
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

    @Override // com.oppo.wear.wallet.proto.AddCardManager$CardInfoMessageOrBuilder
    public String getAppCode() {
        return this.appCode_;
    }

    @Override // com.oppo.wear.wallet.proto.AddCardManager$CardInfoMessageOrBuilder
    public ByteString getAppCodeBytes() {
        return ByteString.copyFromUtf8(this.appCode_);
    }

    @Override // com.oppo.wear.wallet.proto.AddCardManager$CardInfoMessageOrBuilder
    public int getCardAmount() {
        return this.cardAmount_;
    }

    @Override // com.oppo.wear.wallet.proto.AddCardManager$CardInfoMessageOrBuilder
    public ByteString getCardImage() {
        return this.cardImage_;
    }

    @Override // com.oppo.wear.wallet.proto.AddCardManager$CardInfoMessageOrBuilder
    public String getWalletCardAid() {
        return this.walletCardAid_;
    }

    @Override // com.oppo.wear.wallet.proto.AddCardManager$CardInfoMessageOrBuilder
    public ByteString getWalletCardAidBytes() {
        return ByteString.copyFromUtf8(this.walletCardAid_);
    }

    @Override // com.oppo.wear.wallet.proto.AddCardManager$CardInfoMessageOrBuilder
    public int getWalletCardDefault() {
        return this.walletCardDefault_;
    }

    @Override // com.oppo.wear.wallet.proto.AddCardManager$CardInfoMessageOrBuilder
    public String getWalletCardName() {
        return this.walletCardName_;
    }

    @Override // com.oppo.wear.wallet.proto.AddCardManager$CardInfoMessageOrBuilder
    public ByteString getWalletCardNameBytes() {
        return ByteString.copyFromUtf8(this.walletCardName_);
    }

    @Override // com.oppo.wear.wallet.proto.AddCardManager$CardInfoMessageOrBuilder
    public String getWalletCardNo() {
        return this.walletCardNo_;
    }

    @Override // com.oppo.wear.wallet.proto.AddCardManager$CardInfoMessageOrBuilder
    public ByteString getWalletCardNoBytes() {
        return ByteString.copyFromUtf8(this.walletCardNo_);
    }

    @Override // com.oppo.wear.wallet.proto.AddCardManager$CardInfoMessageOrBuilder
    public int getWalletCardStatus() {
        return this.walletCardStatus_;
    }

    @Override // com.oppo.wear.wallet.proto.AddCardManager$CardInfoMessageOrBuilder
    public int getWalletCardType() {
        return this.walletCardType_;
    }

    public static Builder newBuilder(AddCardManager$CardInfoMessage addCardManager$CardInfoMessage) {
        return DEFAULT_INSTANCE.createBuilder(addCardManager$CardInfoMessage);
    }

    public static AddCardManager$CardInfoMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AddCardManager$CardInfoMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AddCardManager$CardInfoMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AddCardManager$CardInfoMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AddCardManager$CardInfoMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AddCardManager$CardInfoMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AddCardManager$CardInfoMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AddCardManager$CardInfoMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AddCardManager$CardInfoMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AddCardManager$CardInfoMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AddCardManager$CardInfoMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AddCardManager$CardInfoMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static AddCardManager$CardInfoMessage parseFrom(InputStream inputStream) throws IOException {
        return (AddCardManager$CardInfoMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AddCardManager$CardInfoMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AddCardManager$CardInfoMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AddCardManager$CardInfoMessage parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AddCardManager$CardInfoMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AddCardManager$CardInfoMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AddCardManager$CardInfoMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
