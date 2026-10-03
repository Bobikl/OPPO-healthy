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
public final class TelecomProto$WatchCallChange extends GeneratedMessageLite<TelecomProto$WatchCallChange, Builder> implements TelecomProto$WatchCallChangeOrBuilder {
    public static final int CALLREMOTENUMBER_FIELD_NUMBER = 2;
    public static final int CHANGESTATUS_FIELD_NUMBER = 1;
    private static final TelecomProto$WatchCallChange DEFAULT_INSTANCE;
    public static final int MUTE_FIELD_NUMBER = 3;
    private static volatile Parser<TelecomProto$WatchCallChange> PARSER;
    private String callRemoteNumber_ = "";
    private int changeStatus_;
    private boolean mute_;

    public static final class Builder extends GeneratedMessageLite.Builder<TelecomProto$WatchCallChange, Builder> implements TelecomProto$WatchCallChangeOrBuilder {
        public Builder clearCallRemoteNumber() {
            copyOnWrite();
            ((TelecomProto$WatchCallChange) this.instance).clearCallRemoteNumber();
            return this;
        }

        public Builder clearChangeStatus() {
            copyOnWrite();
            ((TelecomProto$WatchCallChange) this.instance).clearChangeStatus();
            return this;
        }

        public Builder clearMute() {
            copyOnWrite();
            ((TelecomProto$WatchCallChange) this.instance).clearMute();
            return this;
        }

        @Override // com.heytap.health.telecom.proto.TelecomProto$WatchCallChangeOrBuilder
        public String getCallRemoteNumber() {
            return ((TelecomProto$WatchCallChange) this.instance).getCallRemoteNumber();
        }

        @Override // com.heytap.health.telecom.proto.TelecomProto$WatchCallChangeOrBuilder
        public ByteString getCallRemoteNumberBytes() {
            return ((TelecomProto$WatchCallChange) this.instance).getCallRemoteNumberBytes();
        }

        @Override // com.heytap.health.telecom.proto.TelecomProto$WatchCallChangeOrBuilder
        public int getChangeStatus() {
            return ((TelecomProto$WatchCallChange) this.instance).getChangeStatus();
        }

        @Override // com.heytap.health.telecom.proto.TelecomProto$WatchCallChangeOrBuilder
        public boolean getMute() {
            return ((TelecomProto$WatchCallChange) this.instance).getMute();
        }

        public Builder setCallRemoteNumber(String str) {
            copyOnWrite();
            ((TelecomProto$WatchCallChange) this.instance).setCallRemoteNumber(str);
            return this;
        }

        public Builder setCallRemoteNumberBytes(ByteString byteString) {
            copyOnWrite();
            ((TelecomProto$WatchCallChange) this.instance).setCallRemoteNumberBytes(byteString);
            return this;
        }

        public Builder setChangeStatus(int i) {
            copyOnWrite();
            ((TelecomProto$WatchCallChange) this.instance).setChangeStatus(i);
            return this;
        }

        public Builder setMute(boolean z) {
            copyOnWrite();
            ((TelecomProto$WatchCallChange) this.instance).setMute(z);
            return this;
        }

        private Builder() {
            super(TelecomProto$WatchCallChange.DEFAULT_INSTANCE);
        }
    }

    static {
        TelecomProto$WatchCallChange telecomProto$WatchCallChange = new TelecomProto$WatchCallChange();
        DEFAULT_INSTANCE = telecomProto$WatchCallChange;
        GeneratedMessageLite.registerDefaultInstance(TelecomProto$WatchCallChange.class, telecomProto$WatchCallChange);
    }

    private TelecomProto$WatchCallChange() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCallRemoteNumber() {
        this.callRemoteNumber_ = getDefaultInstance().getCallRemoteNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChangeStatus() {
        this.changeStatus_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMute() {
        this.mute_ = false;
    }

    public static TelecomProto$WatchCallChange getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TelecomProto$WatchCallChange parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TelecomProto$WatchCallChange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TelecomProto$WatchCallChange parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TelecomProto$WatchCallChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TelecomProto$WatchCallChange> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCallRemoteNumber(String str) {
        str.getClass();
        this.callRemoteNumber_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCallRemoteNumberBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.callRemoteNumber_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangeStatus(int i) {
        this.changeStatus_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMute(boolean z) {
        this.mute_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nqj.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new TelecomProto$WatchCallChange();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003\u0007", new Object[]{"changeStatus_", "callRemoteNumber_", "mute_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TelecomProto$WatchCallChange> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (TelecomProto$WatchCallChange.class) {
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

    @Override // com.heytap.health.telecom.proto.TelecomProto$WatchCallChangeOrBuilder
    public String getCallRemoteNumber() {
        return this.callRemoteNumber_;
    }

    @Override // com.heytap.health.telecom.proto.TelecomProto$WatchCallChangeOrBuilder
    public ByteString getCallRemoteNumberBytes() {
        return ByteString.copyFromUtf8(this.callRemoteNumber_);
    }

    @Override // com.heytap.health.telecom.proto.TelecomProto$WatchCallChangeOrBuilder
    public int getChangeStatus() {
        return this.changeStatus_;
    }

    @Override // com.heytap.health.telecom.proto.TelecomProto$WatchCallChangeOrBuilder
    public boolean getMute() {
        return this.mute_;
    }

    public static Builder newBuilder(TelecomProto$WatchCallChange telecomProto$WatchCallChange) {
        return DEFAULT_INSTANCE.createBuilder(telecomProto$WatchCallChange);
    }

    public static TelecomProto$WatchCallChange parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TelecomProto$WatchCallChange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TelecomProto$WatchCallChange parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TelecomProto$WatchCallChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TelecomProto$WatchCallChange parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TelecomProto$WatchCallChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TelecomProto$WatchCallChange parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TelecomProto$WatchCallChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TelecomProto$WatchCallChange parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TelecomProto$WatchCallChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TelecomProto$WatchCallChange parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TelecomProto$WatchCallChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TelecomProto$WatchCallChange parseFrom(InputStream inputStream) throws IOException {
        return (TelecomProto$WatchCallChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TelecomProto$WatchCallChange parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TelecomProto$WatchCallChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TelecomProto$WatchCallChange parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TelecomProto$WatchCallChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TelecomProto$WatchCallChange parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TelecomProto$WatchCallChange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
