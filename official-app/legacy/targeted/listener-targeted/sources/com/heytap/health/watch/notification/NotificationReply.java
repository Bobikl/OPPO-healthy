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
public final class NotificationReply extends GeneratedMessageLite<NotificationReply, Builder> implements NotificationReplyOrBuilder {
    private static final NotificationReply DEFAULT_INSTANCE;
    private static volatile Parser<NotificationReply> PARSER = null;
    public static final int REPLYTEXT_FIELD_NUMBER = 2;
    public static final int STRKEY_FIELD_NUMBER = 1;
    private String strKey_ = "";
    private String replyText_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<NotificationReply, Builder> implements NotificationReplyOrBuilder {
        public Builder clearReplyText() {
            copyOnWrite();
            ((NotificationReply) this.instance).clearReplyText();
            return this;
        }

        public Builder clearStrKey() {
            copyOnWrite();
            ((NotificationReply) this.instance).clearStrKey();
            return this;
        }

        @Override // com.heytap.health.watch.notification.NotificationReplyOrBuilder
        public String getReplyText() {
            return ((NotificationReply) this.instance).getReplyText();
        }

        @Override // com.heytap.health.watch.notification.NotificationReplyOrBuilder
        public ByteString getReplyTextBytes() {
            return ((NotificationReply) this.instance).getReplyTextBytes();
        }

        @Override // com.heytap.health.watch.notification.NotificationReplyOrBuilder
        public String getStrKey() {
            return ((NotificationReply) this.instance).getStrKey();
        }

        @Override // com.heytap.health.watch.notification.NotificationReplyOrBuilder
        public ByteString getStrKeyBytes() {
            return ((NotificationReply) this.instance).getStrKeyBytes();
        }

        public Builder setReplyText(String str) {
            copyOnWrite();
            ((NotificationReply) this.instance).setReplyText(str);
            return this;
        }

        public Builder setReplyTextBytes(ByteString byteString) {
            copyOnWrite();
            ((NotificationReply) this.instance).setReplyTextBytes(byteString);
            return this;
        }

        public Builder setStrKey(String str) {
            copyOnWrite();
            ((NotificationReply) this.instance).setStrKey(str);
            return this;
        }

        public Builder setStrKeyBytes(ByteString byteString) {
            copyOnWrite();
            ((NotificationReply) this.instance).setStrKeyBytes(byteString);
            return this;
        }

        private Builder() {
            super(NotificationReply.DEFAULT_INSTANCE);
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
        NotificationReply notificationReply = new NotificationReply();
        DEFAULT_INSTANCE = notificationReply;
        GeneratedMessageLite.registerDefaultInstance(NotificationReply.class, notificationReply);
    }

    private NotificationReply() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReplyText() {
        this.replyText_ = getDefaultInstance().getReplyText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStrKey() {
        this.strKey_ = getDefaultInstance().getStrKey();
    }

    public static NotificationReply getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static NotificationReply parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (NotificationReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NotificationReply parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (NotificationReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<NotificationReply> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReplyText(String str) {
        str.getClass();
        this.replyText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReplyTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.replyText_ = byteString.toStringUtf8();
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

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new NotificationReply();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"strKey_", "replyText_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<NotificationReply> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (NotificationReply.class) {
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

    @Override // com.heytap.health.watch.notification.NotificationReplyOrBuilder
    public String getReplyText() {
        return this.replyText_;
    }

    @Override // com.heytap.health.watch.notification.NotificationReplyOrBuilder
    public ByteString getReplyTextBytes() {
        return ByteString.copyFromUtf8(this.replyText_);
    }

    @Override // com.heytap.health.watch.notification.NotificationReplyOrBuilder
    public String getStrKey() {
        return this.strKey_;
    }

    @Override // com.heytap.health.watch.notification.NotificationReplyOrBuilder
    public ByteString getStrKeyBytes() {
        return ByteString.copyFromUtf8(this.strKey_);
    }

    public static Builder newBuilder(NotificationReply notificationReply) {
        return DEFAULT_INSTANCE.createBuilder(notificationReply);
    }

    public static NotificationReply parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NotificationReply) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NotificationReply parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NotificationReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static NotificationReply parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (NotificationReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static NotificationReply parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NotificationReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static NotificationReply parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (NotificationReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NotificationReply parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (NotificationReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static NotificationReply parseFrom(InputStream inputStream) throws IOException {
        return (NotificationReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NotificationReply parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NotificationReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NotificationReply parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (NotificationReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static NotificationReply parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (NotificationReply) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
