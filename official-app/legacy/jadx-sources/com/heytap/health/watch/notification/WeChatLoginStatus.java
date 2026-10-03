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
public final class WeChatLoginStatus extends GeneratedMessageLite<WeChatLoginStatus, Builder> implements WeChatLoginStatusOrBuilder {
    private static final WeChatLoginStatus DEFAULT_INSTANCE;
    private static volatile Parser<WeChatLoginStatus> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int status_;

    public static final class Builder extends GeneratedMessageLite.Builder<WeChatLoginStatus, Builder> implements WeChatLoginStatusOrBuilder {
        public Builder clearStatus() {
            copyOnWrite();
            ((WeChatLoginStatus) this.instance).clearStatus();
            return this;
        }

        @Override // com.heytap.health.watch.notification.WeChatLoginStatusOrBuilder
        public int getStatus() {
            return ((WeChatLoginStatus) this.instance).getStatus();
        }

        public Builder setStatus(int i) {
            copyOnWrite();
            ((WeChatLoginStatus) this.instance).setStatus(i);
            return this;
        }

        private Builder() {
            super(WeChatLoginStatus.DEFAULT_INSTANCE);
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
        WeChatLoginStatus weChatLoginStatus = new WeChatLoginStatus();
        DEFAULT_INSTANCE = weChatLoginStatus;
        GeneratedMessageLite.registerDefaultInstance(WeChatLoginStatus.class, weChatLoginStatus);
    }

    private WeChatLoginStatus() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = 0;
    }

    public static WeChatLoginStatus getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WeChatLoginStatus parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WeChatLoginStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WeChatLoginStatus parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WeChatLoginStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WeChatLoginStatus> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(int i) {
        this.status_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WeChatLoginStatus();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"status_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WeChatLoginStatus> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WeChatLoginStatus.class) {
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

    @Override // com.heytap.health.watch.notification.WeChatLoginStatusOrBuilder
    public int getStatus() {
        return this.status_;
    }

    public static Builder newBuilder(WeChatLoginStatus weChatLoginStatus) {
        return DEFAULT_INSTANCE.createBuilder(weChatLoginStatus);
    }

    public static WeChatLoginStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WeChatLoginStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WeChatLoginStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WeChatLoginStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WeChatLoginStatus parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WeChatLoginStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WeChatLoginStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WeChatLoginStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WeChatLoginStatus parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WeChatLoginStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WeChatLoginStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WeChatLoginStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WeChatLoginStatus parseFrom(InputStream inputStream) throws IOException {
        return (WeChatLoginStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WeChatLoginStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WeChatLoginStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WeChatLoginStatus parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WeChatLoginStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WeChatLoginStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WeChatLoginStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
