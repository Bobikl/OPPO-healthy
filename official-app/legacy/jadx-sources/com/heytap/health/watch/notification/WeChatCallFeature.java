package com.heytap.health.watch.notification;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes19.dex */
public final class WeChatCallFeature extends GeneratedMessageLite<WeChatCallFeature, Builder> implements WeChatCallFeatureOrBuilder {
    private static final WeChatCallFeature DEFAULT_INSTANCE;
    private static volatile Parser<WeChatCallFeature> PARSER = null;
    public static final int SUPPORT_FIELD_NUMBER = 1;
    private boolean support_;

    public static final class Builder extends GeneratedMessageLite.Builder<WeChatCallFeature, Builder> implements WeChatCallFeatureOrBuilder {
        public Builder clearSupport() {
            copyOnWrite();
            ((WeChatCallFeature) this.instance).clearSupport();
            return this;
        }

        @Override // com.heytap.health.watch.notification.WeChatCallFeatureOrBuilder
        public boolean getSupport() {
            return ((WeChatCallFeature) this.instance).getSupport();
        }

        public Builder setSupport(boolean z) {
            copyOnWrite();
            ((WeChatCallFeature) this.instance).setSupport(z);
            return this;
        }

        private Builder() {
            super(WeChatCallFeature.DEFAULT_INSTANCE);
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
        WeChatCallFeature weChatCallFeature = new WeChatCallFeature();
        DEFAULT_INSTANCE = weChatCallFeature;
        GeneratedMessageLite.registerDefaultInstance(WeChatCallFeature.class, weChatCallFeature);
    }

    private WeChatCallFeature() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSupport() {
        this.support_ = false;
    }

    public static WeChatCallFeature getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WeChatCallFeature parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WeChatCallFeature) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WeChatCallFeature parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WeChatCallFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WeChatCallFeature> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSupport(boolean z) {
        this.support_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WeChatCallFeature();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"support_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WeChatCallFeature> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WeChatCallFeature.class) {
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

    @Override // com.heytap.health.watch.notification.WeChatCallFeatureOrBuilder
    public boolean getSupport() {
        return this.support_;
    }

    public static Builder newBuilder(WeChatCallFeature weChatCallFeature) {
        return DEFAULT_INSTANCE.createBuilder(weChatCallFeature);
    }

    public static WeChatCallFeature parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WeChatCallFeature) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WeChatCallFeature parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WeChatCallFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WeChatCallFeature parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WeChatCallFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WeChatCallFeature parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WeChatCallFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WeChatCallFeature parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WeChatCallFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WeChatCallFeature parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WeChatCallFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WeChatCallFeature parseFrom(InputStream inputStream) throws IOException {
        return (WeChatCallFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WeChatCallFeature parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WeChatCallFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WeChatCallFeature parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WeChatCallFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WeChatCallFeature parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WeChatCallFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
