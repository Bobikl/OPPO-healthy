package com.heytap.wearable.btnet.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class HBProxySupportRequest extends GeneratedMessageLite<HBProxySupportRequest, Builder> implements HBProxySupportRequestOrBuilder {
    private static final HBProxySupportRequest DEFAULT_INSTANCE;
    private static volatile Parser<HBProxySupportRequest> PARSER = null;
    public static final int PROXY_TYPE_FIELD_NUMBER = 1;
    public static final int VERSION_FIELD_NUMBER = 2;
    private int proxyType_;
    private int version_;

    /* JADX INFO: renamed from: com.heytap.wearable.btnet.proto.HBProxySupportRequest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<HBProxySupportRequest, Builder> implements HBProxySupportRequestOrBuilder {
        public Builder clearProxyType() {
            copyOnWrite();
            ((HBProxySupportRequest) this.instance).clearProxyType();
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((HBProxySupportRequest) this.instance).clearVersion();
            return this;
        }

        @Override // com.heytap.wearable.btnet.proto.HBProxySupportRequestOrBuilder
        public int getProxyType() {
            return ((HBProxySupportRequest) this.instance).getProxyType();
        }

        @Override // com.heytap.wearable.btnet.proto.HBProxySupportRequestOrBuilder
        public int getVersion() {
            return ((HBProxySupportRequest) this.instance).getVersion();
        }

        public Builder setProxyType(int i) {
            copyOnWrite();
            ((HBProxySupportRequest) this.instance).setProxyType(i);
            return this;
        }

        public Builder setVersion(int i) {
            copyOnWrite();
            ((HBProxySupportRequest) this.instance).setVersion(i);
            return this;
        }

        private Builder() {
            super(HBProxySupportRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        HBProxySupportRequest hBProxySupportRequest = new HBProxySupportRequest();
        DEFAULT_INSTANCE = hBProxySupportRequest;
        GeneratedMessageLite.registerDefaultInstance(HBProxySupportRequest.class, hBProxySupportRequest);
    }

    private HBProxySupportRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProxyType() {
        this.proxyType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    public static HBProxySupportRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static HBProxySupportRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HBProxySupportRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HBProxySupportRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (HBProxySupportRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<HBProxySupportRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProxyType(int i) {
        this.proxyType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(int i) {
        this.version_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new HBProxySupportRequest();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"proxyType_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<HBProxySupportRequest> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (HBProxySupportRequest.class) {
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

    @Override // com.heytap.wearable.btnet.proto.HBProxySupportRequestOrBuilder
    public int getProxyType() {
        return this.proxyType_;
    }

    @Override // com.heytap.wearable.btnet.proto.HBProxySupportRequestOrBuilder
    public int getVersion() {
        return this.version_;
    }

    public static Builder newBuilder(HBProxySupportRequest hBProxySupportRequest) {
        return DEFAULT_INSTANCE.createBuilder(hBProxySupportRequest);
    }

    public static HBProxySupportRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HBProxySupportRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static HBProxySupportRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HBProxySupportRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static HBProxySupportRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (HBProxySupportRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static HBProxySupportRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HBProxySupportRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static HBProxySupportRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (HBProxySupportRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HBProxySupportRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HBProxySupportRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static HBProxySupportRequest parseFrom(InputStream inputStream) throws IOException {
        return (HBProxySupportRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HBProxySupportRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HBProxySupportRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static HBProxySupportRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (HBProxySupportRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static HBProxySupportRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HBProxySupportRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
