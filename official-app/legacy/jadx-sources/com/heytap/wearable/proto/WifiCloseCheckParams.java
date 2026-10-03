package com.heytap.wearable.proto;

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
public final class WifiCloseCheckParams extends GeneratedMessageLite<WifiCloseCheckParams, Builder> implements WifiCloseCheckParamsOrBuilder {
    public static final int ALLOW_FIELD_NUMBER = 1;
    private static final WifiCloseCheckParams DEFAULT_INSTANCE;
    public static final int DELAY_FIELD_NUMBER = 2;
    private static volatile Parser<WifiCloseCheckParams> PARSER;
    private boolean allow_;
    private int delay_;

    public static final class Builder extends GeneratedMessageLite.Builder<WifiCloseCheckParams, Builder> implements WifiCloseCheckParamsOrBuilder {
        public Builder clearAllow() {
            copyOnWrite();
            ((WifiCloseCheckParams) this.instance).clearAllow();
            return this;
        }

        public Builder clearDelay() {
            copyOnWrite();
            ((WifiCloseCheckParams) this.instance).clearDelay();
            return this;
        }

        @Override // com.heytap.wearable.proto.WifiCloseCheckParamsOrBuilder
        public boolean getAllow() {
            return ((WifiCloseCheckParams) this.instance).getAllow();
        }

        @Override // com.heytap.wearable.proto.WifiCloseCheckParamsOrBuilder
        public int getDelay() {
            return ((WifiCloseCheckParams) this.instance).getDelay();
        }

        public Builder setAllow(boolean z) {
            copyOnWrite();
            ((WifiCloseCheckParams) this.instance).setAllow(z);
            return this;
        }

        public Builder setDelay(int i) {
            copyOnWrite();
            ((WifiCloseCheckParams) this.instance).setDelay(i);
            return this;
        }

        private Builder() {
            super(WifiCloseCheckParams.DEFAULT_INSTANCE);
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        WifiCloseCheckParams wifiCloseCheckParams = new WifiCloseCheckParams();
        DEFAULT_INSTANCE = wifiCloseCheckParams;
        GeneratedMessageLite.registerDefaultInstance(WifiCloseCheckParams.class, wifiCloseCheckParams);
    }

    private WifiCloseCheckParams() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllow() {
        this.allow_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDelay() {
        this.delay_ = 0;
    }

    public static WifiCloseCheckParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WifiCloseCheckParams parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WifiCloseCheckParams) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WifiCloseCheckParams parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WifiCloseCheckParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WifiCloseCheckParams> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllow(boolean z) {
        this.allow_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDelay(int i) {
        this.delay_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WifiCloseCheckParams();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0004", new Object[]{"allow_", "delay_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WifiCloseCheckParams> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WifiCloseCheckParams.class) {
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

    @Override // com.heytap.wearable.proto.WifiCloseCheckParamsOrBuilder
    public boolean getAllow() {
        return this.allow_;
    }

    @Override // com.heytap.wearable.proto.WifiCloseCheckParamsOrBuilder
    public int getDelay() {
        return this.delay_;
    }

    public static Builder newBuilder(WifiCloseCheckParams wifiCloseCheckParams) {
        return DEFAULT_INSTANCE.createBuilder(wifiCloseCheckParams);
    }

    public static WifiCloseCheckParams parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WifiCloseCheckParams) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WifiCloseCheckParams parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WifiCloseCheckParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WifiCloseCheckParams parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WifiCloseCheckParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WifiCloseCheckParams parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WifiCloseCheckParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WifiCloseCheckParams parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WifiCloseCheckParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WifiCloseCheckParams parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WifiCloseCheckParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WifiCloseCheckParams parseFrom(InputStream inputStream) throws IOException {
        return (WifiCloseCheckParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WifiCloseCheckParams parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WifiCloseCheckParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WifiCloseCheckParams parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WifiCloseCheckParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WifiCloseCheckParams parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WifiCloseCheckParams) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
