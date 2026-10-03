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
public final class DMProto$P2PPermissionResult extends GeneratedMessageLite<DMProto$P2PPermissionResult, Builder> implements DMProto$P2PPermissionResultOrBuilder {
    private static final DMProto$P2PPermissionResult DEFAULT_INSTANCE;
    public static final int HASPERMISSION_FIELD_NUMBER = 1;
    private static volatile Parser<DMProto$P2PPermissionResult> PARSER;
    private boolean hasPermission_;

    public static final class Builder extends GeneratedMessageLite.Builder<DMProto$P2PPermissionResult, Builder> implements DMProto$P2PPermissionResultOrBuilder {
        public Builder clearHasPermission() {
            copyOnWrite();
            ((DMProto$P2PPermissionResult) this.instance).clearHasPermission();
            return this;
        }

        @Override // com.heytap.health.protocol.dm.DMProto$P2PPermissionResultOrBuilder
        public boolean getHasPermission() {
            return ((DMProto$P2PPermissionResult) this.instance).getHasPermission();
        }

        public Builder setHasPermission(boolean z) {
            copyOnWrite();
            ((DMProto$P2PPermissionResult) this.instance).setHasPermission(z);
            return this;
        }

        private Builder() {
            super(DMProto$P2PPermissionResult.DEFAULT_INSTANCE);
        }
    }

    static {
        DMProto$P2PPermissionResult dMProto$P2PPermissionResult = new DMProto$P2PPermissionResult();
        DEFAULT_INSTANCE = dMProto$P2PPermissionResult;
        GeneratedMessageLite.registerDefaultInstance(DMProto$P2PPermissionResult.class, dMProto$P2PPermissionResult);
    }

    private DMProto$P2PPermissionResult() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasPermission() {
        this.hasPermission_ = false;
    }

    public static DMProto$P2PPermissionResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DMProto$P2PPermissionResult parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DMProto$P2PPermissionResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$P2PPermissionResult parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DMProto$P2PPermissionResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DMProto$P2PPermissionResult> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasPermission(boolean z) {
        this.hasPermission_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yl4.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DMProto$P2PPermissionResult();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"hasPermission_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DMProto$P2PPermissionResult> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DMProto$P2PPermissionResult.class) {
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

    @Override // com.heytap.health.protocol.dm.DMProto$P2PPermissionResultOrBuilder
    public boolean getHasPermission() {
        return this.hasPermission_;
    }

    public static Builder newBuilder(DMProto$P2PPermissionResult dMProto$P2PPermissionResult) {
        return DEFAULT_INSTANCE.createBuilder(dMProto$P2PPermissionResult);
    }

    public static DMProto$P2PPermissionResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$P2PPermissionResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$P2PPermissionResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$P2PPermissionResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DMProto$P2PPermissionResult parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DMProto$P2PPermissionResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DMProto$P2PPermissionResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$P2PPermissionResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DMProto$P2PPermissionResult parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DMProto$P2PPermissionResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DMProto$P2PPermissionResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$P2PPermissionResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DMProto$P2PPermissionResult parseFrom(InputStream inputStream) throws IOException {
        return (DMProto$P2PPermissionResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$P2PPermissionResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$P2PPermissionResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$P2PPermissionResult parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DMProto$P2PPermissionResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DMProto$P2PPermissionResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$P2PPermissionResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
