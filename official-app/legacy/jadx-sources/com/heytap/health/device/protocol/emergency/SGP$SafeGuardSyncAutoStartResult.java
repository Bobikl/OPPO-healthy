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
public final class SGP$SafeGuardSyncAutoStartResult extends GeneratedMessageLite<SGP$SafeGuardSyncAutoStartResult, Builder> implements SGP$SafeGuardSyncAutoStartResultOrBuilder {
    private static final SGP$SafeGuardSyncAutoStartResult DEFAULT_INSTANCE;
    public static final int ISSUCCESS_FIELD_NUMBER = 1;
    private static volatile Parser<SGP$SafeGuardSyncAutoStartResult> PARSER;
    private boolean isSuccess_;

    public static final class Builder extends GeneratedMessageLite.Builder<SGP$SafeGuardSyncAutoStartResult, Builder> implements SGP$SafeGuardSyncAutoStartResultOrBuilder {
        public Builder clearIsSuccess() {
            copyOnWrite();
            ((SGP$SafeGuardSyncAutoStartResult) this.instance).clearIsSuccess();
            return this;
        }

        @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncAutoStartResultOrBuilder
        public boolean getIsSuccess() {
            return ((SGP$SafeGuardSyncAutoStartResult) this.instance).getIsSuccess();
        }

        public Builder setIsSuccess(boolean z) {
            copyOnWrite();
            ((SGP$SafeGuardSyncAutoStartResult) this.instance).setIsSuccess(z);
            return this;
        }

        private Builder() {
            super(SGP$SafeGuardSyncAutoStartResult.DEFAULT_INSTANCE);
        }
    }

    static {
        SGP$SafeGuardSyncAutoStartResult sGP$SafeGuardSyncAutoStartResult = new SGP$SafeGuardSyncAutoStartResult();
        DEFAULT_INSTANCE = sGP$SafeGuardSyncAutoStartResult;
        GeneratedMessageLite.registerDefaultInstance(SGP$SafeGuardSyncAutoStartResult.class, sGP$SafeGuardSyncAutoStartResult);
    }

    private SGP$SafeGuardSyncAutoStartResult() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsSuccess() {
        this.isSuccess_ = false;
    }

    public static SGP$SafeGuardSyncAutoStartResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SGP$SafeGuardSyncAutoStartResult parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SGP$SafeGuardSyncAutoStartResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SGP$SafeGuardSyncAutoStartResult parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SGP$SafeGuardSyncAutoStartResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SGP$SafeGuardSyncAutoStartResult> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsSuccess(boolean z) {
        this.isSuccess_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = l5g.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new SGP$SafeGuardSyncAutoStartResult();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"isSuccess_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SGP$SafeGuardSyncAutoStartResult> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (SGP$SafeGuardSyncAutoStartResult.class) {
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

    @Override // com.heytap.health.device.protocol.emergency.SGP$SafeGuardSyncAutoStartResultOrBuilder
    public boolean getIsSuccess() {
        return this.isSuccess_;
    }

    public static Builder newBuilder(SGP$SafeGuardSyncAutoStartResult sGP$SafeGuardSyncAutoStartResult) {
        return DEFAULT_INSTANCE.createBuilder(sGP$SafeGuardSyncAutoStartResult);
    }

    public static SGP$SafeGuardSyncAutoStartResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SGP$SafeGuardSyncAutoStartResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SGP$SafeGuardSyncAutoStartResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SGP$SafeGuardSyncAutoStartResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SGP$SafeGuardSyncAutoStartResult parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SGP$SafeGuardSyncAutoStartResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SGP$SafeGuardSyncAutoStartResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SGP$SafeGuardSyncAutoStartResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SGP$SafeGuardSyncAutoStartResult parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SGP$SafeGuardSyncAutoStartResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SGP$SafeGuardSyncAutoStartResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SGP$SafeGuardSyncAutoStartResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SGP$SafeGuardSyncAutoStartResult parseFrom(InputStream inputStream) throws IOException {
        return (SGP$SafeGuardSyncAutoStartResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SGP$SafeGuardSyncAutoStartResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SGP$SafeGuardSyncAutoStartResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SGP$SafeGuardSyncAutoStartResult parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SGP$SafeGuardSyncAutoStartResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SGP$SafeGuardSyncAutoStartResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SGP$SafeGuardSyncAutoStartResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
