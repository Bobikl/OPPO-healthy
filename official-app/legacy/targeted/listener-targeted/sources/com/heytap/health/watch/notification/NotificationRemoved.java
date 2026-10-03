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
public final class NotificationRemoved extends GeneratedMessageLite<NotificationRemoved, Builder> implements NotificationRemovedOrBuilder {
    private static final NotificationRemoved DEFAULT_INSTANCE;
    public static final int INTID_FIELD_NUMBER = 1;
    public static final int ISREMOVEALL_FIELD_NUMBER = 5;
    private static volatile Parser<NotificationRemoved> PARSER = null;
    public static final int STRKEY_FIELD_NUMBER = 4;
    public static final int STRPACKAGENAME_FIELD_NUMBER = 3;
    public static final int STRTAG_FIELD_NUMBER = 2;
    private int intId_;
    private boolean isRemoveAll_;
    private String strTag_ = "";
    private String strPackageName_ = "";
    private String strKey_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<NotificationRemoved, Builder> implements NotificationRemovedOrBuilder {
        public Builder clearIntId() {
            copyOnWrite();
            ((NotificationRemoved) this.instance).clearIntId();
            return this;
        }

        public Builder clearIsRemoveAll() {
            copyOnWrite();
            ((NotificationRemoved) this.instance).clearIsRemoveAll();
            return this;
        }

        public Builder clearStrKey() {
            copyOnWrite();
            ((NotificationRemoved) this.instance).clearStrKey();
            return this;
        }

        public Builder clearStrPackageName() {
            copyOnWrite();
            ((NotificationRemoved) this.instance).clearStrPackageName();
            return this;
        }

        public Builder clearStrTag() {
            copyOnWrite();
            ((NotificationRemoved) this.instance).clearStrTag();
            return this;
        }

        @Override // com.heytap.health.watch.notification.NotificationRemovedOrBuilder
        public int getIntId() {
            return ((NotificationRemoved) this.instance).getIntId();
        }

        @Override // com.heytap.health.watch.notification.NotificationRemovedOrBuilder
        public boolean getIsRemoveAll() {
            return ((NotificationRemoved) this.instance).getIsRemoveAll();
        }

        @Override // com.heytap.health.watch.notification.NotificationRemovedOrBuilder
        public String getStrKey() {
            return ((NotificationRemoved) this.instance).getStrKey();
        }

        @Override // com.heytap.health.watch.notification.NotificationRemovedOrBuilder
        public ByteString getStrKeyBytes() {
            return ((NotificationRemoved) this.instance).getStrKeyBytes();
        }

        @Override // com.heytap.health.watch.notification.NotificationRemovedOrBuilder
        public String getStrPackageName() {
            return ((NotificationRemoved) this.instance).getStrPackageName();
        }

        @Override // com.heytap.health.watch.notification.NotificationRemovedOrBuilder
        public ByteString getStrPackageNameBytes() {
            return ((NotificationRemoved) this.instance).getStrPackageNameBytes();
        }

        @Override // com.heytap.health.watch.notification.NotificationRemovedOrBuilder
        public String getStrTag() {
            return ((NotificationRemoved) this.instance).getStrTag();
        }

        @Override // com.heytap.health.watch.notification.NotificationRemovedOrBuilder
        public ByteString getStrTagBytes() {
            return ((NotificationRemoved) this.instance).getStrTagBytes();
        }

        public Builder setIntId(int i) {
            copyOnWrite();
            ((NotificationRemoved) this.instance).setIntId(i);
            return this;
        }

        public Builder setIsRemoveAll(boolean z) {
            copyOnWrite();
            ((NotificationRemoved) this.instance).setIsRemoveAll(z);
            return this;
        }

        public Builder setStrKey(String str) {
            copyOnWrite();
            ((NotificationRemoved) this.instance).setStrKey(str);
            return this;
        }

        public Builder setStrKeyBytes(ByteString byteString) {
            copyOnWrite();
            ((NotificationRemoved) this.instance).setStrKeyBytes(byteString);
            return this;
        }

        public Builder setStrPackageName(String str) {
            copyOnWrite();
            ((NotificationRemoved) this.instance).setStrPackageName(str);
            return this;
        }

        public Builder setStrPackageNameBytes(ByteString byteString) {
            copyOnWrite();
            ((NotificationRemoved) this.instance).setStrPackageNameBytes(byteString);
            return this;
        }

        public Builder setStrTag(String str) {
            copyOnWrite();
            ((NotificationRemoved) this.instance).setStrTag(str);
            return this;
        }

        public Builder setStrTagBytes(ByteString byteString) {
            copyOnWrite();
            ((NotificationRemoved) this.instance).setStrTagBytes(byteString);
            return this;
        }

        private Builder() {
            super(NotificationRemoved.DEFAULT_INSTANCE);
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
        NotificationRemoved notificationRemoved = new NotificationRemoved();
        DEFAULT_INSTANCE = notificationRemoved;
        GeneratedMessageLite.registerDefaultInstance(NotificationRemoved.class, notificationRemoved);
    }

    private NotificationRemoved() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntId() {
        this.intId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsRemoveAll() {
        this.isRemoveAll_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStrKey() {
        this.strKey_ = getDefaultInstance().getStrKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStrPackageName() {
        this.strPackageName_ = getDefaultInstance().getStrPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStrTag() {
        this.strTag_ = getDefaultInstance().getStrTag();
    }

    public static NotificationRemoved getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static NotificationRemoved parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (NotificationRemoved) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NotificationRemoved parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (NotificationRemoved) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<NotificationRemoved> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntId(int i) {
        this.intId_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsRemoveAll(boolean z) {
        this.isRemoveAll_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStrKey(String str) {
        str.getClass();
        this.strKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStrKeyBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.strKey_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStrPackageName(String str) {
        str.getClass();
        this.strPackageName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStrPackageNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.strPackageName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStrTag(String str) {
        str.getClass();
        this.strTag_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStrTagBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.strTag_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new NotificationRemoved();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0007", new Object[]{"intId_", "strTag_", "strPackageName_", "strKey_", "isRemoveAll_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<NotificationRemoved> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (NotificationRemoved.class) {
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

    @Override // com.heytap.health.watch.notification.NotificationRemovedOrBuilder
    public int getIntId() {
        return this.intId_;
    }

    @Override // com.heytap.health.watch.notification.NotificationRemovedOrBuilder
    public boolean getIsRemoveAll() {
        return this.isRemoveAll_;
    }

    @Override // com.heytap.health.watch.notification.NotificationRemovedOrBuilder
    public String getStrKey() {
        return this.strKey_;
    }

    @Override // com.heytap.health.watch.notification.NotificationRemovedOrBuilder
    public ByteString getStrKeyBytes() {
        return ByteString.copyFromUtf8(this.strKey_);
    }

    @Override // com.heytap.health.watch.notification.NotificationRemovedOrBuilder
    public String getStrPackageName() {
        return this.strPackageName_;
    }

    @Override // com.heytap.health.watch.notification.NotificationRemovedOrBuilder
    public ByteString getStrPackageNameBytes() {
        return ByteString.copyFromUtf8(this.strPackageName_);
    }

    @Override // com.heytap.health.watch.notification.NotificationRemovedOrBuilder
    public String getStrTag() {
        return this.strTag_;
    }

    @Override // com.heytap.health.watch.notification.NotificationRemovedOrBuilder
    public ByteString getStrTagBytes() {
        return ByteString.copyFromUtf8(this.strTag_);
    }

    public static Builder newBuilder(NotificationRemoved notificationRemoved) {
        return DEFAULT_INSTANCE.createBuilder(notificationRemoved);
    }

    public static NotificationRemoved parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NotificationRemoved) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NotificationRemoved parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NotificationRemoved) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static NotificationRemoved parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (NotificationRemoved) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static NotificationRemoved parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NotificationRemoved) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static NotificationRemoved parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (NotificationRemoved) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NotificationRemoved parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NotificationRemoved) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static NotificationRemoved parseFrom(InputStream inputStream) throws IOException {
        return (NotificationRemoved) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NotificationRemoved parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NotificationRemoved) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NotificationRemoved parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (NotificationRemoved) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static NotificationRemoved parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NotificationRemoved) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
