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
public final class DMProto$OobeSetSwitchStateRsp extends GeneratedMessageLite<DMProto$OobeSetSwitchStateRsp, Builder> implements DMProto$OobeSetSwitchStateRspOrBuilder {
    private static final DMProto$OobeSetSwitchStateRsp DEFAULT_INSTANCE;
    private static volatile Parser<DMProto$OobeSetSwitchStateRsp> PARSER = null;
    public static final int RESULT_CODE_FIELD_NUMBER = 1;
    private int resultCode_;

    public static final class Builder extends GeneratedMessageLite.Builder<DMProto$OobeSetSwitchStateRsp, Builder> implements DMProto$OobeSetSwitchStateRspOrBuilder {
        public Builder clearResultCode() {
            copyOnWrite();
            ((DMProto$OobeSetSwitchStateRsp) this.instance).clearResultCode();
            return this;
        }

        @Override // com.heytap.health.protocol.dm.DMProto$OobeSetSwitchStateRspOrBuilder
        public int getResultCode() {
            return ((DMProto$OobeSetSwitchStateRsp) this.instance).getResultCode();
        }

        public Builder setResultCode(int i) {
            copyOnWrite();
            ((DMProto$OobeSetSwitchStateRsp) this.instance).setResultCode(i);
            return this;
        }

        private Builder() {
            super(DMProto$OobeSetSwitchStateRsp.DEFAULT_INSTANCE);
        }
    }

    static {
        DMProto$OobeSetSwitchStateRsp dMProto$OobeSetSwitchStateRsp = new DMProto$OobeSetSwitchStateRsp();
        DEFAULT_INSTANCE = dMProto$OobeSetSwitchStateRsp;
        GeneratedMessageLite.registerDefaultInstance(DMProto$OobeSetSwitchStateRsp.class, dMProto$OobeSetSwitchStateRsp);
    }

    private DMProto$OobeSetSwitchStateRsp() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResultCode() {
        this.resultCode_ = 0;
    }

    public static DMProto$OobeSetSwitchStateRsp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DMProto$OobeSetSwitchStateRsp parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DMProto$OobeSetSwitchStateRsp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$OobeSetSwitchStateRsp parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DMProto$OobeSetSwitchStateRsp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DMProto$OobeSetSwitchStateRsp> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResultCode(int i) {
        this.resultCode_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = yl4.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DMProto$OobeSetSwitchStateRsp();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"resultCode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DMProto$OobeSetSwitchStateRsp> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DMProto$OobeSetSwitchStateRsp.class) {
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

    @Override // com.heytap.health.protocol.dm.DMProto$OobeSetSwitchStateRspOrBuilder
    public int getResultCode() {
        return this.resultCode_;
    }

    public static Builder newBuilder(DMProto$OobeSetSwitchStateRsp dMProto$OobeSetSwitchStateRsp) {
        return DEFAULT_INSTANCE.createBuilder(dMProto$OobeSetSwitchStateRsp);
    }

    public static DMProto$OobeSetSwitchStateRsp parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$OobeSetSwitchStateRsp) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$OobeSetSwitchStateRsp parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$OobeSetSwitchStateRsp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DMProto$OobeSetSwitchStateRsp parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DMProto$OobeSetSwitchStateRsp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DMProto$OobeSetSwitchStateRsp parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$OobeSetSwitchStateRsp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DMProto$OobeSetSwitchStateRsp parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DMProto$OobeSetSwitchStateRsp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DMProto$OobeSetSwitchStateRsp parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DMProto$OobeSetSwitchStateRsp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DMProto$OobeSetSwitchStateRsp parseFrom(InputStream inputStream) throws IOException {
        return (DMProto$OobeSetSwitchStateRsp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DMProto$OobeSetSwitchStateRsp parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$OobeSetSwitchStateRsp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DMProto$OobeSetSwitchStateRsp parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DMProto$OobeSetSwitchStateRsp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DMProto$OobeSetSwitchStateRsp parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DMProto$OobeSetSwitchStateRsp) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
