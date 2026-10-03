package com.heytap.health.protocol.dnd;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.lo4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class DNDProto$DoNotDisturb extends GeneratedMessageLite<DNDProto$DoNotDisturb, Builder> implements DNDProto$DoNotDisturbOrBuilder {
    private static final DNDProto$DoNotDisturb DEFAULT_INSTANCE;
    private static volatile Parser<DNDProto$DoNotDisturb> PARSER = null;
    public static final int STATUS_CHANGED_TIME_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int SUPPORT_LINKAGE_FIELD_NUMBER = 3;
    private int statusChangedTime_;
    private int status_;
    private int supportLinkage_;

    public static final class Builder extends GeneratedMessageLite.Builder<DNDProto$DoNotDisturb, Builder> implements DNDProto$DoNotDisturbOrBuilder {
        public Builder clearStatus() {
            copyOnWrite();
            ((DNDProto$DoNotDisturb) this.instance).clearStatus();
            return this;
        }

        public Builder clearStatusChangedTime() {
            copyOnWrite();
            ((DNDProto$DoNotDisturb) this.instance).clearStatusChangedTime();
            return this;
        }

        public Builder clearSupportLinkage() {
            copyOnWrite();
            ((DNDProto$DoNotDisturb) this.instance).clearSupportLinkage();
            return this;
        }

        @Override // com.heytap.health.protocol.dnd.DNDProto$DoNotDisturbOrBuilder
        public int getStatus() {
            return ((DNDProto$DoNotDisturb) this.instance).getStatus();
        }

        @Override // com.heytap.health.protocol.dnd.DNDProto$DoNotDisturbOrBuilder
        public int getStatusChangedTime() {
            return ((DNDProto$DoNotDisturb) this.instance).getStatusChangedTime();
        }

        @Override // com.heytap.health.protocol.dnd.DNDProto$DoNotDisturbOrBuilder
        public int getSupportLinkage() {
            return ((DNDProto$DoNotDisturb) this.instance).getSupportLinkage();
        }

        public Builder setStatus(int i) {
            copyOnWrite();
            ((DNDProto$DoNotDisturb) this.instance).setStatus(i);
            return this;
        }

        public Builder setStatusChangedTime(int i) {
            copyOnWrite();
            ((DNDProto$DoNotDisturb) this.instance).setStatusChangedTime(i);
            return this;
        }

        public Builder setSupportLinkage(int i) {
            copyOnWrite();
            ((DNDProto$DoNotDisturb) this.instance).setSupportLinkage(i);
            return this;
        }

        private Builder() {
            super(DNDProto$DoNotDisturb.DEFAULT_INSTANCE);
        }
    }

    static {
        DNDProto$DoNotDisturb dNDProto$DoNotDisturb = new DNDProto$DoNotDisturb();
        DEFAULT_INSTANCE = dNDProto$DoNotDisturb;
        GeneratedMessageLite.registerDefaultInstance(DNDProto$DoNotDisturb.class, dNDProto$DoNotDisturb);
    }

    private DNDProto$DoNotDisturb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatusChangedTime() {
        this.statusChangedTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSupportLinkage() {
        this.supportLinkage_ = 0;
    }

    public static DNDProto$DoNotDisturb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DNDProto$DoNotDisturb parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DNDProto$DoNotDisturb) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DNDProto$DoNotDisturb parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DNDProto$DoNotDisturb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DNDProto$DoNotDisturb> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(int i) {
        this.status_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatusChangedTime(int i) {
        this.statusChangedTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSupportLinkage(int i) {
        this.supportLinkage_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = lo4.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DNDProto$DoNotDisturb();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"status_", "statusChangedTime_", "supportLinkage_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DNDProto$DoNotDisturb> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DNDProto$DoNotDisturb.class) {
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

    @Override // com.heytap.health.protocol.dnd.DNDProto$DoNotDisturbOrBuilder
    public int getStatus() {
        return this.status_;
    }

    @Override // com.heytap.health.protocol.dnd.DNDProto$DoNotDisturbOrBuilder
    public int getStatusChangedTime() {
        return this.statusChangedTime_;
    }

    @Override // com.heytap.health.protocol.dnd.DNDProto$DoNotDisturbOrBuilder
    public int getSupportLinkage() {
        return this.supportLinkage_;
    }

    public static Builder newBuilder(DNDProto$DoNotDisturb dNDProto$DoNotDisturb) {
        return DEFAULT_INSTANCE.createBuilder(dNDProto$DoNotDisturb);
    }

    public static DNDProto$DoNotDisturb parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DNDProto$DoNotDisturb) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DNDProto$DoNotDisturb parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DNDProto$DoNotDisturb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DNDProto$DoNotDisturb parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DNDProto$DoNotDisturb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DNDProto$DoNotDisturb parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DNDProto$DoNotDisturb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DNDProto$DoNotDisturb parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DNDProto$DoNotDisturb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DNDProto$DoNotDisturb parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DNDProto$DoNotDisturb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DNDProto$DoNotDisturb parseFrom(InputStream inputStream) throws IOException {
        return (DNDProto$DoNotDisturb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DNDProto$DoNotDisturb parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DNDProto$DoNotDisturb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DNDProto$DoNotDisturb parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DNDProto$DoNotDisturb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DNDProto$DoNotDisturb parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DNDProto$DoNotDisturb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
