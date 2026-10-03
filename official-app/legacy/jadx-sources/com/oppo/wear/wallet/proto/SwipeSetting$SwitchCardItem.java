package com.oppo.wear.wallet.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.p5j;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes9.dex */
public final class SwipeSetting$SwitchCardItem extends GeneratedMessageLite<SwipeSetting$SwitchCardItem, Builder> implements SwipeSetting$SwitchCardItemOrBuilder {
    public static final int AID_FIELD_NUMBER = 2;
    private static final SwipeSetting$SwitchCardItem DEFAULT_INSTANCE;
    public static final int MANNERID_FIELD_NUMBER = 1;
    private static volatile Parser<SwipeSetting$SwitchCardItem> PARSER;
    private String aid_ = "";
    private int mannerId_;

    public static final class Builder extends GeneratedMessageLite.Builder<SwipeSetting$SwitchCardItem, Builder> implements SwipeSetting$SwitchCardItemOrBuilder {
        public Builder clearAid() {
            copyOnWrite();
            ((SwipeSetting$SwitchCardItem) this.instance).clearAid();
            return this;
        }

        public Builder clearMannerId() {
            copyOnWrite();
            ((SwipeSetting$SwitchCardItem) this.instance).clearMannerId();
            return this;
        }

        @Override // com.oppo.wear.wallet.proto.SwipeSetting$SwitchCardItemOrBuilder
        public String getAid() {
            return ((SwipeSetting$SwitchCardItem) this.instance).getAid();
        }

        @Override // com.oppo.wear.wallet.proto.SwipeSetting$SwitchCardItemOrBuilder
        public ByteString getAidBytes() {
            return ((SwipeSetting$SwitchCardItem) this.instance).getAidBytes();
        }

        @Override // com.oppo.wear.wallet.proto.SwipeSetting$SwitchCardItemOrBuilder
        public SwipeSetting$SwipeMannerId getMannerId() {
            return ((SwipeSetting$SwitchCardItem) this.instance).getMannerId();
        }

        @Override // com.oppo.wear.wallet.proto.SwipeSetting$SwitchCardItemOrBuilder
        public int getMannerIdValue() {
            return ((SwipeSetting$SwitchCardItem) this.instance).getMannerIdValue();
        }

        public Builder setAid(String str) {
            copyOnWrite();
            ((SwipeSetting$SwitchCardItem) this.instance).setAid(str);
            return this;
        }

        public Builder setAidBytes(ByteString byteString) {
            copyOnWrite();
            ((SwipeSetting$SwitchCardItem) this.instance).setAidBytes(byteString);
            return this;
        }

        public Builder setMannerId(SwipeSetting$SwipeMannerId swipeSetting$SwipeMannerId) {
            copyOnWrite();
            ((SwipeSetting$SwitchCardItem) this.instance).setMannerId(swipeSetting$SwipeMannerId);
            return this;
        }

        public Builder setMannerIdValue(int i) {
            copyOnWrite();
            ((SwipeSetting$SwitchCardItem) this.instance).setMannerIdValue(i);
            return this;
        }

        private Builder() {
            super(SwipeSetting$SwitchCardItem.DEFAULT_INSTANCE);
        }
    }

    static {
        SwipeSetting$SwitchCardItem swipeSetting$SwitchCardItem = new SwipeSetting$SwitchCardItem();
        DEFAULT_INSTANCE = swipeSetting$SwitchCardItem;
        GeneratedMessageLite.registerDefaultInstance(SwipeSetting$SwitchCardItem.class, swipeSetting$SwitchCardItem);
    }

    private SwipeSetting$SwitchCardItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAid() {
        this.aid_ = getDefaultInstance().getAid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMannerId() {
        this.mannerId_ = 0;
    }

    public static SwipeSetting$SwitchCardItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SwipeSetting$SwitchCardItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SwipeSetting$SwitchCardItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SwipeSetting$SwitchCardItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SwipeSetting$SwitchCardItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SwipeSetting$SwitchCardItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAid(String str) {
        str.getClass();
        this.aid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.aid_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMannerId(SwipeSetting$SwipeMannerId swipeSetting$SwipeMannerId) {
        this.mannerId_ = swipeSetting$SwipeMannerId.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMannerIdValue(int i) {
        this.mannerId_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = p5j.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new SwipeSetting$SwitchCardItem();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"mannerId_", "aid_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SwipeSetting$SwitchCardItem> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (SwipeSetting$SwitchCardItem.class) {
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

    @Override // com.oppo.wear.wallet.proto.SwipeSetting$SwitchCardItemOrBuilder
    public String getAid() {
        return this.aid_;
    }

    @Override // com.oppo.wear.wallet.proto.SwipeSetting$SwitchCardItemOrBuilder
    public ByteString getAidBytes() {
        return ByteString.copyFromUtf8(this.aid_);
    }

    @Override // com.oppo.wear.wallet.proto.SwipeSetting$SwitchCardItemOrBuilder
    public SwipeSetting$SwipeMannerId getMannerId() {
        SwipeSetting$SwipeMannerId swipeSetting$SwipeMannerIdForNumber = SwipeSetting$SwipeMannerId.forNumber(this.mannerId_);
        return swipeSetting$SwipeMannerIdForNumber == null ? SwipeSetting$SwipeMannerId.UNRECOGNIZED : swipeSetting$SwipeMannerIdForNumber;
    }

    @Override // com.oppo.wear.wallet.proto.SwipeSetting$SwitchCardItemOrBuilder
    public int getMannerIdValue() {
        return this.mannerId_;
    }

    public static Builder newBuilder(SwipeSetting$SwitchCardItem swipeSetting$SwitchCardItem) {
        return DEFAULT_INSTANCE.createBuilder(swipeSetting$SwitchCardItem);
    }

    public static SwipeSetting$SwitchCardItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SwipeSetting$SwitchCardItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SwipeSetting$SwitchCardItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SwipeSetting$SwitchCardItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SwipeSetting$SwitchCardItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SwipeSetting$SwitchCardItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SwipeSetting$SwitchCardItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SwipeSetting$SwitchCardItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SwipeSetting$SwitchCardItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SwipeSetting$SwitchCardItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SwipeSetting$SwitchCardItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SwipeSetting$SwitchCardItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SwipeSetting$SwitchCardItem parseFrom(InputStream inputStream) throws IOException {
        return (SwipeSetting$SwitchCardItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SwipeSetting$SwitchCardItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SwipeSetting$SwitchCardItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SwipeSetting$SwitchCardItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SwipeSetting$SwitchCardItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SwipeSetting$SwitchCardItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SwipeSetting$SwitchCardItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
