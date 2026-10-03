package com.heytap.health.watch.notification;

import com.google.protobuf.AbstractMessageLite;
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
public final class ExtendAction extends GeneratedMessageLite<ExtendAction, Builder> implements ExtendActionOrBuilder {
    public static final int DEEPLINK_FIELD_NUMBER = 3;
    private static final ExtendAction DEFAULT_INSTANCE;
    public static final int PACKAGE_FIELD_NUMBER = 1;
    private static volatile Parser<ExtendAction> PARSER = null;
    public static final int VERSIONCODE_FIELD_NUMBER = 2;
    private long versionCode_;
    private String package_ = "";
    private String deeplink_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<ExtendAction, Builder> implements ExtendActionOrBuilder {
        public Builder clearDeeplink() {
            copyOnWrite();
            ((ExtendAction) this.instance).clearDeeplink();
            return this;
        }

        public Builder clearPackage() {
            copyOnWrite();
            ((ExtendAction) this.instance).clearPackage();
            return this;
        }

        public Builder clearVersionCode() {
            copyOnWrite();
            ((ExtendAction) this.instance).clearVersionCode();
            return this;
        }

        @Override // com.heytap.health.watch.notification.ExtendActionOrBuilder
        public String getDeeplink() {
            return ((ExtendAction) this.instance).getDeeplink();
        }

        @Override // com.heytap.health.watch.notification.ExtendActionOrBuilder
        public ByteString getDeeplinkBytes() {
            return ((ExtendAction) this.instance).getDeeplinkBytes();
        }

        @Override // com.heytap.health.watch.notification.ExtendActionOrBuilder
        public String getPackage() {
            return ((ExtendAction) this.instance).getPackage();
        }

        @Override // com.heytap.health.watch.notification.ExtendActionOrBuilder
        public ByteString getPackageBytes() {
            return ((ExtendAction) this.instance).getPackageBytes();
        }

        @Override // com.heytap.health.watch.notification.ExtendActionOrBuilder
        public long getVersionCode() {
            return ((ExtendAction) this.instance).getVersionCode();
        }

        public Builder setDeeplink(String str) {
            copyOnWrite();
            ((ExtendAction) this.instance).setDeeplink(str);
            return this;
        }

        public Builder setDeeplinkBytes(ByteString byteString) {
            copyOnWrite();
            ((ExtendAction) this.instance).setDeeplinkBytes(byteString);
            return this;
        }

        public Builder setPackage(String str) {
            copyOnWrite();
            ((ExtendAction) this.instance).setPackage(str);
            return this;
        }

        public Builder setPackageBytes(ByteString byteString) {
            copyOnWrite();
            ((ExtendAction) this.instance).setPackageBytes(byteString);
            return this;
        }

        public Builder setVersionCode(long j2) {
            copyOnWrite();
            ((ExtendAction) this.instance).setVersionCode(j2);
            return this;
        }

        private Builder() {
            super(ExtendAction.DEFAULT_INSTANCE);
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
        ExtendAction extendAction = new ExtendAction();
        DEFAULT_INSTANCE = extendAction;
        GeneratedMessageLite.registerDefaultInstance(ExtendAction.class, extendAction);
    }

    private ExtendAction() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeeplink() {
        this.deeplink_ = getDefaultInstance().getDeeplink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPackage() {
        this.package_ = getDefaultInstance().getPackage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersionCode() {
        this.versionCode_ = 0L;
    }

    public static ExtendAction getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ExtendAction parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ExtendAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExtendAction parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ExtendAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ExtendAction> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeeplink(String str) {
        str.getClass();
        this.deeplink_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeeplinkBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.deeplink_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackage(String str) {
        str.getClass();
        this.package_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.package_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersionCode(long j2) {
        this.versionCode_ = j2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new ExtendAction();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0003\u0003Ȉ", new Object[]{"package_", "versionCode_", "deeplink_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ExtendAction> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (ExtendAction.class) {
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

    @Override // com.heytap.health.watch.notification.ExtendActionOrBuilder
    public String getDeeplink() {
        return this.deeplink_;
    }

    @Override // com.heytap.health.watch.notification.ExtendActionOrBuilder
    public ByteString getDeeplinkBytes() {
        return ByteString.copyFromUtf8(this.deeplink_);
    }

    @Override // com.heytap.health.watch.notification.ExtendActionOrBuilder
    public String getPackage() {
        return this.package_;
    }

    @Override // com.heytap.health.watch.notification.ExtendActionOrBuilder
    public ByteString getPackageBytes() {
        return ByteString.copyFromUtf8(this.package_);
    }

    @Override // com.heytap.health.watch.notification.ExtendActionOrBuilder
    public long getVersionCode() {
        return this.versionCode_;
    }

    public static Builder newBuilder(ExtendAction extendAction) {
        return DEFAULT_INSTANCE.createBuilder(extendAction);
    }

    public static ExtendAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExtendAction) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ExtendAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExtendAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ExtendAction parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ExtendAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ExtendAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExtendAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ExtendAction parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ExtendAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ExtendAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExtendAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ExtendAction parseFrom(InputStream inputStream) throws IOException {
        return (ExtendAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExtendAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExtendAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ExtendAction parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ExtendAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ExtendAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExtendAction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
