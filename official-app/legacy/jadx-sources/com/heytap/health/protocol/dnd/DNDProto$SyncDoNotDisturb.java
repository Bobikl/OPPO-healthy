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
public final class DNDProto$SyncDoNotDisturb extends GeneratedMessageLite<DNDProto$SyncDoNotDisturb, Builder> implements DNDProto$SyncDoNotDisturbOrBuilder {
    private static final DNDProto$SyncDoNotDisturb DEFAULT_INSTANCE;
    private static volatile Parser<DNDProto$SyncDoNotDisturb> PARSER = null;
    public static final int STATUS_CHANGED_TIME_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int statusChangedTime_;
    private int status_;

    public static final class Builder extends GeneratedMessageLite.Builder<DNDProto$SyncDoNotDisturb, Builder> implements DNDProto$SyncDoNotDisturbOrBuilder {
        public Builder clearStatus() {
            copyOnWrite();
            ((DNDProto$SyncDoNotDisturb) this.instance).clearStatus();
            return this;
        }

        public Builder clearStatusChangedTime() {
            copyOnWrite();
            ((DNDProto$SyncDoNotDisturb) this.instance).clearStatusChangedTime();
            return this;
        }

        @Override // com.heytap.health.protocol.dnd.DNDProto$SyncDoNotDisturbOrBuilder
        public int getStatus() {
            return ((DNDProto$SyncDoNotDisturb) this.instance).getStatus();
        }

        @Override // com.heytap.health.protocol.dnd.DNDProto$SyncDoNotDisturbOrBuilder
        public int getStatusChangedTime() {
            return ((DNDProto$SyncDoNotDisturb) this.instance).getStatusChangedTime();
        }

        public Builder setStatus(int i) {
            copyOnWrite();
            ((DNDProto$SyncDoNotDisturb) this.instance).setStatus(i);
            return this;
        }

        public Builder setStatusChangedTime(int i) {
            copyOnWrite();
            ((DNDProto$SyncDoNotDisturb) this.instance).setStatusChangedTime(i);
            return this;
        }

        private Builder() {
            super(DNDProto$SyncDoNotDisturb.DEFAULT_INSTANCE);
        }
    }

    static {
        DNDProto$SyncDoNotDisturb dNDProto$SyncDoNotDisturb = new DNDProto$SyncDoNotDisturb();
        DEFAULT_INSTANCE = dNDProto$SyncDoNotDisturb;
        GeneratedMessageLite.registerDefaultInstance(DNDProto$SyncDoNotDisturb.class, dNDProto$SyncDoNotDisturb);
    }

    private DNDProto$SyncDoNotDisturb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatusChangedTime() {
        this.statusChangedTime_ = 0;
    }

    public static DNDProto$SyncDoNotDisturb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DNDProto$SyncDoNotDisturb parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DNDProto$SyncDoNotDisturb) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DNDProto$SyncDoNotDisturb parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DNDProto$SyncDoNotDisturb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DNDProto$SyncDoNotDisturb> parser() {
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

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = lo4.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DNDProto$SyncDoNotDisturb();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"status_", "statusChangedTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DNDProto$SyncDoNotDisturb> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DNDProto$SyncDoNotDisturb.class) {
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

    @Override // com.heytap.health.protocol.dnd.DNDProto$SyncDoNotDisturbOrBuilder
    public int getStatus() {
        return this.status_;
    }

    @Override // com.heytap.health.protocol.dnd.DNDProto$SyncDoNotDisturbOrBuilder
    public int getStatusChangedTime() {
        return this.statusChangedTime_;
    }

    public static Builder newBuilder(DNDProto$SyncDoNotDisturb dNDProto$SyncDoNotDisturb) {
        return DEFAULT_INSTANCE.createBuilder(dNDProto$SyncDoNotDisturb);
    }

    public static DNDProto$SyncDoNotDisturb parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DNDProto$SyncDoNotDisturb) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DNDProto$SyncDoNotDisturb parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DNDProto$SyncDoNotDisturb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DNDProto$SyncDoNotDisturb parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DNDProto$SyncDoNotDisturb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DNDProto$SyncDoNotDisturb parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DNDProto$SyncDoNotDisturb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DNDProto$SyncDoNotDisturb parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DNDProto$SyncDoNotDisturb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DNDProto$SyncDoNotDisturb parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DNDProto$SyncDoNotDisturb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DNDProto$SyncDoNotDisturb parseFrom(InputStream inputStream) throws IOException {
        return (DNDProto$SyncDoNotDisturb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DNDProto$SyncDoNotDisturb parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DNDProto$SyncDoNotDisturb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DNDProto$SyncDoNotDisturb parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DNDProto$SyncDoNotDisturb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DNDProto$SyncDoNotDisturb parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DNDProto$SyncDoNotDisturb) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
