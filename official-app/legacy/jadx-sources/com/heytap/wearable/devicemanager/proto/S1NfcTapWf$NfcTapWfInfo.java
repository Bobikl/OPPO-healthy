package com.heytap.wearable.devicemanager.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.z4g;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class S1NfcTapWf$NfcTapWfInfo extends GeneratedMessageLite<S1NfcTapWf$NfcTapWfInfo, Builder> implements S1NfcTapWf$NfcTapWfInfoOrBuilder {
    private static final S1NfcTapWf$NfcTapWfInfo DEFAULT_INSTANCE;
    public static final int ISPHONESUPPORT_FIELD_NUMBER = 1;
    private static volatile Parser<S1NfcTapWf$NfcTapWfInfo> PARSER;
    private boolean isPhoneSupport_;

    public static final class Builder extends GeneratedMessageLite.Builder<S1NfcTapWf$NfcTapWfInfo, Builder> implements S1NfcTapWf$NfcTapWfInfoOrBuilder {
        public Builder clearIsPhoneSupport() {
            copyOnWrite();
            ((S1NfcTapWf$NfcTapWfInfo) this.instance).clearIsPhoneSupport();
            return this;
        }

        @Override // com.heytap.wearable.devicemanager.proto.S1NfcTapWf$NfcTapWfInfoOrBuilder
        public boolean getIsPhoneSupport() {
            return ((S1NfcTapWf$NfcTapWfInfo) this.instance).getIsPhoneSupport();
        }

        public Builder setIsPhoneSupport(boolean z) {
            copyOnWrite();
            ((S1NfcTapWf$NfcTapWfInfo) this.instance).setIsPhoneSupport(z);
            return this;
        }

        private Builder() {
            super(S1NfcTapWf$NfcTapWfInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        S1NfcTapWf$NfcTapWfInfo s1NfcTapWf$NfcTapWfInfo = new S1NfcTapWf$NfcTapWfInfo();
        DEFAULT_INSTANCE = s1NfcTapWf$NfcTapWfInfo;
        GeneratedMessageLite.registerDefaultInstance(S1NfcTapWf$NfcTapWfInfo.class, s1NfcTapWf$NfcTapWfInfo);
    }

    private S1NfcTapWf$NfcTapWfInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPhoneSupport() {
        this.isPhoneSupport_ = false;
    }

    public static S1NfcTapWf$NfcTapWfInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static S1NfcTapWf$NfcTapWfInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (S1NfcTapWf$NfcTapWfInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static S1NfcTapWf$NfcTapWfInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (S1NfcTapWf$NfcTapWfInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<S1NfcTapWf$NfcTapWfInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPhoneSupport(boolean z) {
        this.isPhoneSupport_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = z4g.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new S1NfcTapWf$NfcTapWfInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"isPhoneSupport_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<S1NfcTapWf$NfcTapWfInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (S1NfcTapWf$NfcTapWfInfo.class) {
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

    @Override // com.heytap.wearable.devicemanager.proto.S1NfcTapWf$NfcTapWfInfoOrBuilder
    public boolean getIsPhoneSupport() {
        return this.isPhoneSupport_;
    }

    public static Builder newBuilder(S1NfcTapWf$NfcTapWfInfo s1NfcTapWf$NfcTapWfInfo) {
        return DEFAULT_INSTANCE.createBuilder(s1NfcTapWf$NfcTapWfInfo);
    }

    public static S1NfcTapWf$NfcTapWfInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (S1NfcTapWf$NfcTapWfInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static S1NfcTapWf$NfcTapWfInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (S1NfcTapWf$NfcTapWfInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static S1NfcTapWf$NfcTapWfInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (S1NfcTapWf$NfcTapWfInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static S1NfcTapWf$NfcTapWfInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (S1NfcTapWf$NfcTapWfInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static S1NfcTapWf$NfcTapWfInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (S1NfcTapWf$NfcTapWfInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static S1NfcTapWf$NfcTapWfInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (S1NfcTapWf$NfcTapWfInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static S1NfcTapWf$NfcTapWfInfo parseFrom(InputStream inputStream) throws IOException {
        return (S1NfcTapWf$NfcTapWfInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static S1NfcTapWf$NfcTapWfInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (S1NfcTapWf$NfcTapWfInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static S1NfcTapWf$NfcTapWfInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (S1NfcTapWf$NfcTapWfInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static S1NfcTapWf$NfcTapWfInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (S1NfcTapWf$NfcTapWfInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
