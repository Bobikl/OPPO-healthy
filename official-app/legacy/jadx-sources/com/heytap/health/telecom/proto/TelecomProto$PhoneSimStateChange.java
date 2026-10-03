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
public final class TelecomProto$PhoneSimStateChange extends GeneratedMessageLite<TelecomProto$PhoneSimStateChange, Builder> implements TelecomProto$PhoneSimStateChangeOrBuilder {
    private static final TelecomProto$PhoneSimStateChange DEFAULT_INSTANCE;
    public static final int ISDEFAULTCALLCARD_FIELD_NUMBER = 6;
    private static volatile Parser<TelecomProto$PhoneSimStateChange> PARSER = null;
    public static final int SLOTICCID_FIELD_NUMBER = 3;
    public static final int SLOTID_FIELD_NUMBER = 1;
    public static final int SLOTIMSI_FIELD_NUMBER = 4;
    public static final int SLOTSIMSTATE_FIELD_NUMBER = 5;
    public static final int SLOTSUBID_FIELD_NUMBER = 2;
    private boolean isDefaultCallCard_;
    private int slotId_;
    private int slotSimState_;
    private int slotSubId_;
    private String slotIccId_ = "";
    private String slotImsi_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<TelecomProto$PhoneSimStateChange, Builder> implements TelecomProto$PhoneSimStateChangeOrBuilder {
        public Builder clearIsDefaultCallCard() {
            copyOnWrite();
            ((TelecomProto$PhoneSimStateChange) this.instance).clearIsDefaultCallCard();
            return this;
        }

        public Builder clearSlotIccId() {
            copyOnWrite();
            ((TelecomProto$PhoneSimStateChange) this.instance).clearSlotIccId();
            return this;
        }

        public Builder clearSlotId() {
            copyOnWrite();
            ((TelecomProto$PhoneSimStateChange) this.instance).clearSlotId();
            return this;
        }

        public Builder clearSlotImsi() {
            copyOnWrite();
            ((TelecomProto$PhoneSimStateChange) this.instance).clearSlotImsi();
            return this;
        }

        public Builder clearSlotSimState() {
            copyOnWrite();
            ((TelecomProto$PhoneSimStateChange) this.instance).clearSlotSimState();
            return this;
        }

        public Builder clearSlotSubId() {
            copyOnWrite();
            ((TelecomProto$PhoneSimStateChange) this.instance).clearSlotSubId();
            return this;
        }

        @Override // com.heytap.health.telecom.proto.TelecomProto$PhoneSimStateChangeOrBuilder
        public boolean getIsDefaultCallCard() {
            return ((TelecomProto$PhoneSimStateChange) this.instance).getIsDefaultCallCard();
        }

        @Override // com.heytap.health.telecom.proto.TelecomProto$PhoneSimStateChangeOrBuilder
        public String getSlotIccId() {
            return ((TelecomProto$PhoneSimStateChange) this.instance).getSlotIccId();
        }

        @Override // com.heytap.health.telecom.proto.TelecomProto$PhoneSimStateChangeOrBuilder
        public ByteString getSlotIccIdBytes() {
            return ((TelecomProto$PhoneSimStateChange) this.instance).getSlotIccIdBytes();
        }

        @Override // com.heytap.health.telecom.proto.TelecomProto$PhoneSimStateChangeOrBuilder
        public int getSlotId() {
            return ((TelecomProto$PhoneSimStateChange) this.instance).getSlotId();
        }

        @Override // com.heytap.health.telecom.proto.TelecomProto$PhoneSimStateChangeOrBuilder
        public String getSlotImsi() {
            return ((TelecomProto$PhoneSimStateChange) this.instance).getSlotImsi();
        }

        @Override // com.heytap.health.telecom.proto.TelecomProto$PhoneSimStateChangeOrBuilder
        public ByteString getSlotImsiBytes() {
            return ((TelecomProto$PhoneSimStateChange) this.instance).getSlotImsiBytes();
        }

        @Override // com.heytap.health.telecom.proto.TelecomProto$PhoneSimStateChangeOrBuilder
        public int getSlotSimState() {
            return ((TelecomProto$PhoneSimStateChange) this.instance).getSlotSimState();
        }

        @Override // com.heytap.health.telecom.proto.TelecomProto$PhoneSimStateChangeOrBuilder
        public int getSlotSubId() {
            return ((TelecomProto$PhoneSimStateChange) this.instance).getSlotSubId();
        }

        public Builder setIsDefaultCallCard(boolean z) {
            copyOnWrite();
            ((TelecomProto$PhoneSimStateChange) this.instance).setIsDefaultCallCard(z);
            return this;
        }

        public Builder setSlotIccId(String str) {
            copyOnWrite();
            ((TelecomProto$PhoneSimStateChange) this.instance).setSlotIccId(str);
            return this;
        }

        public Builder setSlotIccIdBytes(ByteString byteString) {
            copyOnWrite();
            ((TelecomProto$PhoneSimStateChange) this.instance).setSlotIccIdBytes(byteString);
            return this;
        }

        public Builder setSlotId(int i) {
            copyOnWrite();
            ((TelecomProto$PhoneSimStateChange) this.instance).setSlotId(i);
            return this;
        }

        public Builder setSlotImsi(String str) {
            copyOnWrite();
            ((TelecomProto$PhoneSimStateChange) this.instance).setSlotImsi(str);
            return this;
        }

        public Builder setSlotImsiBytes(ByteString byteString) {
            copyOnWrite();
            ((TelecomProto$PhoneSimStateChange) this.instance).setSlotImsiBytes(byteString);
            return this;
        }

        public Builder setSlotSimState(int i) {
            copyOnWrite();
            ((TelecomProto$PhoneSimStateChange) this.instance).setSlotSimState(i);
            return this;
        }

        public Builder setSlotSubId(int i) {
            copyOnWrite();
            ((TelecomProto$PhoneSimStateChange) this.instance).setSlotSubId(i);
            return this;
        }

        private Builder() {
            super(TelecomProto$PhoneSimStateChange.DEFAULT_INSTANCE);
        }
    }

    static {
        TelecomProto$PhoneSimStateChange telecomProto$PhoneSimStateChange = new TelecomProto$PhoneSimStateChange();
        DEFAULT_INSTANCE = telecomProto$PhoneSimStateChange;
        GeneratedMessageLite.registerDefaultInstance(TelecomProto$PhoneSimStateChange.class, telecomProto$PhoneSimStateChange);
    }

    private TelecomProto$PhoneSimStateChange() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsDefaultCallCard() {
        this.isDefaultCallCard_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSlotIccId() {
        this.slotIccId_ = getDefaultInstance().getSlotIccId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSlotId() {
        this.slotId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSlotImsi() {
        this.slotImsi_ = getDefaultInstance().getSlotImsi();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSlotSimState() {
        this.slotSimState_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSlotSubId() {
        this.slotSubId_ = 0;
    }

    public static TelecomProto$PhoneSimStateChange getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TelecomProto$PhoneSimStateChange parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TelecomProto$PhoneSimStateChange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TelecomProto$PhoneSimStateChange parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TelecomProto$PhoneSimStateChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TelecomProto$PhoneSimStateChange> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsDefaultCallCard(boolean z) {
        this.isDefaultCallCard_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSlotIccId(String str) {
        str.getClass();
        this.slotIccId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSlotIccIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.slotIccId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSlotId(int i) {
        this.slotId_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSlotImsi(String str) {
        str.getClass();
        this.slotImsi_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSlotImsiBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.slotImsi_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSlotSimState(int i) {
        this.slotSimState_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSlotSubId(int i) {
        this.slotSubId_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nqj.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new TelecomProto$PhoneSimStateChange();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003Ȉ\u0004Ȉ\u0005\u0004\u0006\u0007", new Object[]{"slotId_", "slotSubId_", "slotIccId_", "slotImsi_", "slotSimState_", "isDefaultCallCard_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TelecomProto$PhoneSimStateChange> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (TelecomProto$PhoneSimStateChange.class) {
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

    @Override // com.heytap.health.telecom.proto.TelecomProto$PhoneSimStateChangeOrBuilder
    public boolean getIsDefaultCallCard() {
        return this.isDefaultCallCard_;
    }

    @Override // com.heytap.health.telecom.proto.TelecomProto$PhoneSimStateChangeOrBuilder
    public String getSlotIccId() {
        return this.slotIccId_;
    }

    @Override // com.heytap.health.telecom.proto.TelecomProto$PhoneSimStateChangeOrBuilder
    public ByteString getSlotIccIdBytes() {
        return ByteString.copyFromUtf8(this.slotIccId_);
    }

    @Override // com.heytap.health.telecom.proto.TelecomProto$PhoneSimStateChangeOrBuilder
    public int getSlotId() {
        return this.slotId_;
    }

    @Override // com.heytap.health.telecom.proto.TelecomProto$PhoneSimStateChangeOrBuilder
    public String getSlotImsi() {
        return this.slotImsi_;
    }

    @Override // com.heytap.health.telecom.proto.TelecomProto$PhoneSimStateChangeOrBuilder
    public ByteString getSlotImsiBytes() {
        return ByteString.copyFromUtf8(this.slotImsi_);
    }

    @Override // com.heytap.health.telecom.proto.TelecomProto$PhoneSimStateChangeOrBuilder
    public int getSlotSimState() {
        return this.slotSimState_;
    }

    @Override // com.heytap.health.telecom.proto.TelecomProto$PhoneSimStateChangeOrBuilder
    public int getSlotSubId() {
        return this.slotSubId_;
    }

    public static Builder newBuilder(TelecomProto$PhoneSimStateChange telecomProto$PhoneSimStateChange) {
        return DEFAULT_INSTANCE.createBuilder(telecomProto$PhoneSimStateChange);
    }

    public static TelecomProto$PhoneSimStateChange parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TelecomProto$PhoneSimStateChange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TelecomProto$PhoneSimStateChange parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TelecomProto$PhoneSimStateChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TelecomProto$PhoneSimStateChange parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TelecomProto$PhoneSimStateChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TelecomProto$PhoneSimStateChange parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TelecomProto$PhoneSimStateChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TelecomProto$PhoneSimStateChange parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TelecomProto$PhoneSimStateChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TelecomProto$PhoneSimStateChange parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TelecomProto$PhoneSimStateChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TelecomProto$PhoneSimStateChange parseFrom(InputStream inputStream) throws IOException {
        return (TelecomProto$PhoneSimStateChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TelecomProto$PhoneSimStateChange parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TelecomProto$PhoneSimStateChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TelecomProto$PhoneSimStateChange parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TelecomProto$PhoneSimStateChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TelecomProto$PhoneSimStateChange parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TelecomProto$PhoneSimStateChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
