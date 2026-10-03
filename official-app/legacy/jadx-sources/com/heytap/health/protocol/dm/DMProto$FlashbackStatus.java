package com.heytap.health.protocol.dm;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.yl4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class DMProto$FlashbackStatus extends GeneratedMessageLite<DMProto$FlashbackStatus, Builder> implements DMProto$FlashbackStatusOrBuilder {
    private static final DMProto$FlashbackStatus DEFAULT_INSTANCE;
    private static volatile Parser<DMProto$FlashbackStatus> PARSER = null;
    public static final int REQUEST_CODE_FIELD_NUMBER = 2;
    public static final int RESPONSE_CODE_FIELD_NUMBER = 3;
    public static final int STATUS_FIELD_NUMBER = 1;
    private long requestCode_;
    private long responseCode_;
    private boolean status_;

    public static final class Builder extends GeneratedMessageLite.Builder<DMProto$FlashbackStatus, Builder> implements DMProto$FlashbackStatusOrBuilder {
        public Builder clearRequestCode() {
            copyOnWrite();
            ((DMProto$FlashbackStatus) this.instance).clearRequestCode();
            return this;
        }

        public Builder clearResponseCode() {
            copyOnWrite();
            ((DMProto$FlashbackStatus) this.instance).clearResponseCode();
            return this;
        }

        public Builder clearStatus() {
            copyOnWrite();
            ((DMProto$FlashbackStatus) this.instance).clearStatus();
            return this;
        }

        @Override // com.heytap.health.protocol.dm.DMProto$FlashbackStatusOrBuilder
        public long getRequestCode() {
            return ((DMProto$FlashbackStatus) this.instance).getRequestCode();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$FlashbackStatusOrBuilder
        public long getResponseCode() {
            return ((DMProto$FlashbackStatus) this.instance).getResponseCode();
        }

        @Override // com.heytap.health.protocol.dm.DMProto$FlashbackStatusOrBuilder
        public boolean getStatus() {
            return ((DMProto$FlashbackStatus) this.instance).getStatus();
        }

        public Builder setRequestCode(long j2) {
            copyOnWrite();
            ((DMProto$FlashbackStatus) this.instance).setRequestCode(j2);
            return this;
        }

        public Builder setResponseCode(long j2) {
            copyOnWrite();
            ((DMProto$FlashbackStatus) this.instance).setResponseCode(j2);
            return this;
        }

        public Builder setStatus(boolean z) {
            copyOnWrite();
            ((DMProto$FlashbackStatus) this.instance).setStatus(z);
            return this;
        }

        private Builder() {
            super(DMProto$FlashbackStatus.DEFAULT_INSTANCE);
        }
    }

    static {
        DMProto$FlashbackStatus dMProto$FlashbackStatus = new DMProto$FlashbackStatus();
        DEFAULT_INSTANCE = dMProto$FlashbackStatus;
        GeneratedMessageLite.registerDefaultInstance(DMProto$FlashbackStatus.class, dMProto$FlashbackStatus);
    }

    private DMProto$FlashbackStatus() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestCode() {
        this.requestCode_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponseCode() {
        this.responseCode_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = false;
    }

    public static DMProto$FlashbackStatus getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DMProto$FlashbackStatus parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DMProto$FlashbackStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$FlashbackStatus parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DMProto$FlashbackStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DMProto$FlashbackStatus> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestCode(long j2) {
        this.requestCode_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseCode(long j2) {
        this.responseCode_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(boolean z) {
        this.status_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yl4.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DMProto$FlashbackStatus();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0002\u0003\u0002", new Object[]{"status_", "requestCode_", "responseCode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DMProto$FlashbackStatus> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DMProto$FlashbackStatus.class) {
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

    @Override // com.heytap.health.protocol.dm.DMProto$FlashbackStatusOrBuilder
    public long getRequestCode() {
        return this.requestCode_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$FlashbackStatusOrBuilder
    public long getResponseCode() {
        return this.responseCode_;
    }

    @Override // com.heytap.health.protocol.dm.DMProto$FlashbackStatusOrBuilder
    public boolean getStatus() {
        return this.status_;
    }

    public static Builder newBuilder(DMProto$FlashbackStatus dMProto$FlashbackStatus) {
        return DEFAULT_INSTANCE.createBuilder(dMProto$FlashbackStatus);
    }

    public static DMProto$FlashbackStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$FlashbackStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$FlashbackStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$FlashbackStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DMProto$FlashbackStatus parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DMProto$FlashbackStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DMProto$FlashbackStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$FlashbackStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DMProto$FlashbackStatus parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DMProto$FlashbackStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DMProto$FlashbackStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$FlashbackStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DMProto$FlashbackStatus parseFrom(InputStream inputStream) throws IOException {
        return (DMProto$FlashbackStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$FlashbackStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$FlashbackStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$FlashbackStatus parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DMProto$FlashbackStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DMProto$FlashbackStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$FlashbackStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
