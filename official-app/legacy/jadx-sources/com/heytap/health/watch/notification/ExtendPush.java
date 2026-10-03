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
public final class ExtendPush extends GeneratedMessageLite<ExtendPush, Builder> implements ExtendPushOrBuilder {
    private static final ExtendPush DEFAULT_INSTANCE;
    public static final int MOCKPACKAGENAME_FIELD_NUMBER = 6;
    private static volatile Parser<ExtendPush> PARSER = null;
    public static final int PUSH_FIELD_NUMBER = 1;
    public static final int SHOWATTIME_FIELD_NUMBER = 5;
    public static final int SHOWDURATION_FIELD_NUMBER = 4;
    public static final int TRANSPARENT_ACTION_FIELD_NUMBER = 3;
    public static final int TRANSPARENT_FIELD_NUMBER = 2;
    private String mockPackageName_ = "";
    private boolean push_;
    private long showAtTime_;
    private long showDuration_;
    private int transparentAction_;
    private boolean transparent_;

    public static final class Builder extends GeneratedMessageLite.Builder<ExtendPush, Builder> implements ExtendPushOrBuilder {
        public Builder clearMockPackageName() {
            copyOnWrite();
            ((ExtendPush) this.instance).clearMockPackageName();
            return this;
        }

        public Builder clearPush() {
            copyOnWrite();
            ((ExtendPush) this.instance).clearPush();
            return this;
        }

        public Builder clearShowAtTime() {
            copyOnWrite();
            ((ExtendPush) this.instance).clearShowAtTime();
            return this;
        }

        public Builder clearShowDuration() {
            copyOnWrite();
            ((ExtendPush) this.instance).clearShowDuration();
            return this;
        }

        public Builder clearTransparent() {
            copyOnWrite();
            ((ExtendPush) this.instance).clearTransparent();
            return this;
        }

        public Builder clearTransparentAction() {
            copyOnWrite();
            ((ExtendPush) this.instance).clearTransparentAction();
            return this;
        }

        @Override // com.heytap.health.watch.notification.ExtendPushOrBuilder
        public String getMockPackageName() {
            return ((ExtendPush) this.instance).getMockPackageName();
        }

        @Override // com.heytap.health.watch.notification.ExtendPushOrBuilder
        public ByteString getMockPackageNameBytes() {
            return ((ExtendPush) this.instance).getMockPackageNameBytes();
        }

        @Override // com.heytap.health.watch.notification.ExtendPushOrBuilder
        public boolean getPush() {
            return ((ExtendPush) this.instance).getPush();
        }

        @Override // com.heytap.health.watch.notification.ExtendPushOrBuilder
        public long getShowAtTime() {
            return ((ExtendPush) this.instance).getShowAtTime();
        }

        @Override // com.heytap.health.watch.notification.ExtendPushOrBuilder
        public long getShowDuration() {
            return ((ExtendPush) this.instance).getShowDuration();
        }

        @Override // com.heytap.health.watch.notification.ExtendPushOrBuilder
        public boolean getTransparent() {
            return ((ExtendPush) this.instance).getTransparent();
        }

        @Override // com.heytap.health.watch.notification.ExtendPushOrBuilder
        public int getTransparentAction() {
            return ((ExtendPush) this.instance).getTransparentAction();
        }

        public Builder setMockPackageName(String str) {
            copyOnWrite();
            ((ExtendPush) this.instance).setMockPackageName(str);
            return this;
        }

        public Builder setMockPackageNameBytes(ByteString byteString) {
            copyOnWrite();
            ((ExtendPush) this.instance).setMockPackageNameBytes(byteString);
            return this;
        }

        public Builder setPush(boolean z) {
            copyOnWrite();
            ((ExtendPush) this.instance).setPush(z);
            return this;
        }

        public Builder setShowAtTime(long j2) {
            copyOnWrite();
            ((ExtendPush) this.instance).setShowAtTime(j2);
            return this;
        }

        public Builder setShowDuration(long j2) {
            copyOnWrite();
            ((ExtendPush) this.instance).setShowDuration(j2);
            return this;
        }

        public Builder setTransparent(boolean z) {
            copyOnWrite();
            ((ExtendPush) this.instance).setTransparent(z);
            return this;
        }

        public Builder setTransparentAction(int i) {
            copyOnWrite();
            ((ExtendPush) this.instance).setTransparentAction(i);
            return this;
        }

        private Builder() {
            super(ExtendPush.DEFAULT_INSTANCE);
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
        ExtendPush extendPush = new ExtendPush();
        DEFAULT_INSTANCE = extendPush;
        GeneratedMessageLite.registerDefaultInstance(ExtendPush.class, extendPush);
    }

    private ExtendPush() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMockPackageName() {
        this.mockPackageName_ = getDefaultInstance().getMockPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPush() {
        this.push_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowAtTime() {
        this.showAtTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowDuration() {
        this.showDuration_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransparent() {
        this.transparent_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransparentAction() {
        this.transparentAction_ = 0;
    }

    public static ExtendPush getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ExtendPush parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ExtendPush) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExtendPush parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ExtendPush) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ExtendPush> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMockPackageName(String str) {
        str.getClass();
        this.mockPackageName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMockPackageNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.mockPackageName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPush(boolean z) {
        this.push_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowAtTime(long j2) {
        this.showAtTime_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowDuration(long j2) {
        this.showDuration_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransparent(boolean z) {
        this.transparent_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransparentAction(int i) {
        this.transparentAction_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new ExtendPush();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0004\u0004\u0003\u0005\u0003\u0006Ȉ", new Object[]{"push_", "transparent_", "transparentAction_", "showDuration_", "showAtTime_", "mockPackageName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ExtendPush> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (ExtendPush.class) {
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

    @Override // com.heytap.health.watch.notification.ExtendPushOrBuilder
    public String getMockPackageName() {
        return this.mockPackageName_;
    }

    @Override // com.heytap.health.watch.notification.ExtendPushOrBuilder
    public ByteString getMockPackageNameBytes() {
        return ByteString.copyFromUtf8(this.mockPackageName_);
    }

    @Override // com.heytap.health.watch.notification.ExtendPushOrBuilder
    public boolean getPush() {
        return this.push_;
    }

    @Override // com.heytap.health.watch.notification.ExtendPushOrBuilder
    public long getShowAtTime() {
        return this.showAtTime_;
    }

    @Override // com.heytap.health.watch.notification.ExtendPushOrBuilder
    public long getShowDuration() {
        return this.showDuration_;
    }

    @Override // com.heytap.health.watch.notification.ExtendPushOrBuilder
    public boolean getTransparent() {
        return this.transparent_;
    }

    @Override // com.heytap.health.watch.notification.ExtendPushOrBuilder
    public int getTransparentAction() {
        return this.transparentAction_;
    }

    public static Builder newBuilder(ExtendPush extendPush) {
        return DEFAULT_INSTANCE.createBuilder(extendPush);
    }

    public static ExtendPush parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExtendPush) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ExtendPush parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExtendPush) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ExtendPush parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ExtendPush) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ExtendPush parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExtendPush) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ExtendPush parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ExtendPush) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ExtendPush parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExtendPush) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ExtendPush parseFrom(InputStream inputStream) throws IOException {
        return (ExtendPush) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExtendPush parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExtendPush) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ExtendPush parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ExtendPush) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ExtendPush parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExtendPush) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
