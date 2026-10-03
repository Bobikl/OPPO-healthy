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
public final class DNDProto$DoNotDisturbSupport extends GeneratedMessageLite<DNDProto$DoNotDisturbSupport, Builder> implements DNDProto$DoNotDisturbSupportOrBuilder {
    private static final DNDProto$DoNotDisturbSupport DEFAULT_INSTANCE;
    private static volatile Parser<DNDProto$DoNotDisturbSupport> PARSER = null;
    public static final int SUPPORT_FIELD_NUMBER = 1;
    private int support_;

    public static final class Builder extends GeneratedMessageLite.Builder<DNDProto$DoNotDisturbSupport, Builder> implements DNDProto$DoNotDisturbSupportOrBuilder {
        public Builder clearSupport() {
            copyOnWrite();
            ((DNDProto$DoNotDisturbSupport) this.instance).clearSupport();
            return this;
        }

        @Override // com.heytap.health.protocol.dnd.DNDProto$DoNotDisturbSupportOrBuilder
        public int getSupport() {
            return ((DNDProto$DoNotDisturbSupport) this.instance).getSupport();
        }

        public Builder setSupport(int i) {
            copyOnWrite();
            ((DNDProto$DoNotDisturbSupport) this.instance).setSupport(i);
            return this;
        }

        private Builder() {
            super(DNDProto$DoNotDisturbSupport.DEFAULT_INSTANCE);
        }
    }

    static {
        DNDProto$DoNotDisturbSupport dNDProto$DoNotDisturbSupport = new DNDProto$DoNotDisturbSupport();
        DEFAULT_INSTANCE = dNDProto$DoNotDisturbSupport;
        GeneratedMessageLite.registerDefaultInstance(DNDProto$DoNotDisturbSupport.class, dNDProto$DoNotDisturbSupport);
    }

    private DNDProto$DoNotDisturbSupport() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSupport() {
        this.support_ = 0;
    }

    public static DNDProto$DoNotDisturbSupport getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DNDProto$DoNotDisturbSupport parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DNDProto$DoNotDisturbSupport) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DNDProto$DoNotDisturbSupport parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DNDProto$DoNotDisturbSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DNDProto$DoNotDisturbSupport> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSupport(int i) {
        this.support_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = lo4.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DNDProto$DoNotDisturbSupport();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"support_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DNDProto$DoNotDisturbSupport> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DNDProto$DoNotDisturbSupport.class) {
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

    @Override // com.heytap.health.protocol.dnd.DNDProto$DoNotDisturbSupportOrBuilder
    public int getSupport() {
        return this.support_;
    }

    public static Builder newBuilder(DNDProto$DoNotDisturbSupport dNDProto$DoNotDisturbSupport) {
        return DEFAULT_INSTANCE.createBuilder(dNDProto$DoNotDisturbSupport);
    }

    public static DNDProto$DoNotDisturbSupport parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DNDProto$DoNotDisturbSupport) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DNDProto$DoNotDisturbSupport parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DNDProto$DoNotDisturbSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DNDProto$DoNotDisturbSupport parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DNDProto$DoNotDisturbSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DNDProto$DoNotDisturbSupport parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DNDProto$DoNotDisturbSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DNDProto$DoNotDisturbSupport parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DNDProto$DoNotDisturbSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DNDProto$DoNotDisturbSupport parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DNDProto$DoNotDisturbSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DNDProto$DoNotDisturbSupport parseFrom(InputStream inputStream) throws IOException {
        return (DNDProto$DoNotDisturbSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DNDProto$DoNotDisturbSupport parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DNDProto$DoNotDisturbSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DNDProto$DoNotDisturbSupport parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DNDProto$DoNotDisturbSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DNDProto$DoNotDisturbSupport parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DNDProto$DoNotDisturbSupport) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
