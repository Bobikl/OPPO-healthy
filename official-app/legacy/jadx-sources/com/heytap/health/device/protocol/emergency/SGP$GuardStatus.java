package com.heytap.health.device.protocol.emergency;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.l5g;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes16.dex */
public final class SGP$GuardStatus extends GeneratedMessageLite<SGP$GuardStatus, Builder> implements SGP$GuardStatusOrBuilder {
    private static final SGP$GuardStatus DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile Parser<SGP$GuardStatus> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private long id_;
    private int status_;

    public static final class Builder extends GeneratedMessageLite.Builder<SGP$GuardStatus, Builder> implements SGP$GuardStatusOrBuilder {
        public Builder clearId() {
            copyOnWrite();
            ((SGP$GuardStatus) this.instance).clearId();
            return this;
        }

        public Builder clearStatus() {
            copyOnWrite();
            ((SGP$GuardStatus) this.instance).clearStatus();
            return this;
        }

        @Override // com.heytap.health.device.protocol.emergency.SGP$GuardStatusOrBuilder
        public long getId() {
            return ((SGP$GuardStatus) this.instance).getId();
        }

        @Override // com.heytap.health.device.protocol.emergency.SGP$GuardStatusOrBuilder
        public int getStatus() {
            return ((SGP$GuardStatus) this.instance).getStatus();
        }

        public Builder setId(long j2) {
            copyOnWrite();
            ((SGP$GuardStatus) this.instance).setId(j2);
            return this;
        }

        public Builder setStatus(int i) {
            copyOnWrite();
            ((SGP$GuardStatus) this.instance).setStatus(i);
            return this;
        }

        private Builder() {
            super(SGP$GuardStatus.DEFAULT_INSTANCE);
        }
    }

    static {
        SGP$GuardStatus sGP$GuardStatus = new SGP$GuardStatus();
        DEFAULT_INSTANCE = sGP$GuardStatus;
        GeneratedMessageLite.registerDefaultInstance(SGP$GuardStatus.class, sGP$GuardStatus);
    }

    private SGP$GuardStatus() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = 0;
    }

    public static SGP$GuardStatus getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SGP$GuardStatus parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SGP$GuardStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SGP$GuardStatus parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SGP$GuardStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SGP$GuardStatus> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j2) {
        this.id_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(int i) {
        this.status_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = l5g.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new SGP$GuardStatus();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0003\u0002\u0004", new Object[]{"id_", "status_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SGP$GuardStatus> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (SGP$GuardStatus.class) {
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

    @Override // com.heytap.health.device.protocol.emergency.SGP$GuardStatusOrBuilder
    public long getId() {
        return this.id_;
    }

    @Override // com.heytap.health.device.protocol.emergency.SGP$GuardStatusOrBuilder
    public int getStatus() {
        return this.status_;
    }

    public static Builder newBuilder(SGP$GuardStatus sGP$GuardStatus) {
        return DEFAULT_INSTANCE.createBuilder(sGP$GuardStatus);
    }

    public static SGP$GuardStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SGP$GuardStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SGP$GuardStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SGP$GuardStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SGP$GuardStatus parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SGP$GuardStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SGP$GuardStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SGP$GuardStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SGP$GuardStatus parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SGP$GuardStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SGP$GuardStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SGP$GuardStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SGP$GuardStatus parseFrom(InputStream inputStream) throws IOException {
        return (SGP$GuardStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SGP$GuardStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SGP$GuardStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SGP$GuardStatus parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SGP$GuardStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SGP$GuardStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SGP$GuardStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
