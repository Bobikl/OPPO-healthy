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
public final class ChatMessageProto extends GeneratedMessageLite<ChatMessageProto, Builder> implements ChatMessageProtoOrBuilder {
    public static final int BITMAP_FIELD_NUMBER = 6;
    private static final ChatMessageProto DEFAULT_INSTANCE;
    private static volatile Parser<ChatMessageProto> PARSER = null;
    public static final int SENDERAVATAR_FIELD_NUMBER = 3;
    public static final int SENDERKEY_FIELD_NUMBER = 2;
    public static final int SENDERNAME_FIELD_NUMBER = 1;
    public static final int TEXT_FIELD_NUMBER = 4;
    public static final int TIMESTAMPMILLIS_FIELD_NUMBER = 5;
    private int bitField0_;
    private MsgPictureProto bitmap_;
    private MsgPictureProto senderAvatar_;
    private long timestampMillis_;
    private String senderName_ = "";
    private String senderKey_ = "";
    private String text_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<ChatMessageProto, Builder> implements ChatMessageProtoOrBuilder {
        public Builder clearBitmap() {
            copyOnWrite();
            ((ChatMessageProto) this.instance).clearBitmap();
            return this;
        }

        public Builder clearSenderAvatar() {
            copyOnWrite();
            ((ChatMessageProto) this.instance).clearSenderAvatar();
            return this;
        }

        public Builder clearSenderKey() {
            copyOnWrite();
            ((ChatMessageProto) this.instance).clearSenderKey();
            return this;
        }

        public Builder clearSenderName() {
            copyOnWrite();
            ((ChatMessageProto) this.instance).clearSenderName();
            return this;
        }

        public Builder clearText() {
            copyOnWrite();
            ((ChatMessageProto) this.instance).clearText();
            return this;
        }

        public Builder clearTimestampMillis() {
            copyOnWrite();
            ((ChatMessageProto) this.instance).clearTimestampMillis();
            return this;
        }

        @Override // com.heytap.health.watch.notification.ChatMessageProtoOrBuilder
        public MsgPictureProto getBitmap() {
            return ((ChatMessageProto) this.instance).getBitmap();
        }

        @Override // com.heytap.health.watch.notification.ChatMessageProtoOrBuilder
        public MsgPictureProto getSenderAvatar() {
            return ((ChatMessageProto) this.instance).getSenderAvatar();
        }

        @Override // com.heytap.health.watch.notification.ChatMessageProtoOrBuilder
        public String getSenderKey() {
            return ((ChatMessageProto) this.instance).getSenderKey();
        }

        @Override // com.heytap.health.watch.notification.ChatMessageProtoOrBuilder
        public ByteString getSenderKeyBytes() {
            return ((ChatMessageProto) this.instance).getSenderKeyBytes();
        }

        @Override // com.heytap.health.watch.notification.ChatMessageProtoOrBuilder
        public String getSenderName() {
            return ((ChatMessageProto) this.instance).getSenderName();
        }

        @Override // com.heytap.health.watch.notification.ChatMessageProtoOrBuilder
        public ByteString getSenderNameBytes() {
            return ((ChatMessageProto) this.instance).getSenderNameBytes();
        }

        @Override // com.heytap.health.watch.notification.ChatMessageProtoOrBuilder
        public String getText() {
            return ((ChatMessageProto) this.instance).getText();
        }

        @Override // com.heytap.health.watch.notification.ChatMessageProtoOrBuilder
        public ByteString getTextBytes() {
            return ((ChatMessageProto) this.instance).getTextBytes();
        }

        @Override // com.heytap.health.watch.notification.ChatMessageProtoOrBuilder
        public long getTimestampMillis() {
            return ((ChatMessageProto) this.instance).getTimestampMillis();
        }

        @Override // com.heytap.health.watch.notification.ChatMessageProtoOrBuilder
        public boolean hasBitmap() {
            return ((ChatMessageProto) this.instance).hasBitmap();
        }

        @Override // com.heytap.health.watch.notification.ChatMessageProtoOrBuilder
        public boolean hasSenderAvatar() {
            return ((ChatMessageProto) this.instance).hasSenderAvatar();
        }

        public Builder mergeBitmap(MsgPictureProto msgPictureProto) {
            copyOnWrite();
            ((ChatMessageProto) this.instance).mergeBitmap(msgPictureProto);
            return this;
        }

        public Builder mergeSenderAvatar(MsgPictureProto msgPictureProto) {
            copyOnWrite();
            ((ChatMessageProto) this.instance).mergeSenderAvatar(msgPictureProto);
            return this;
        }

        public Builder setBitmap(MsgPictureProto msgPictureProto) {
            copyOnWrite();
            ((ChatMessageProto) this.instance).setBitmap(msgPictureProto);
            return this;
        }

        public Builder setSenderAvatar(MsgPictureProto msgPictureProto) {
            copyOnWrite();
            ((ChatMessageProto) this.instance).setSenderAvatar(msgPictureProto);
            return this;
        }

        public Builder setSenderKey(String str) {
            copyOnWrite();
            ((ChatMessageProto) this.instance).setSenderKey(str);
            return this;
        }

        public Builder setSenderKeyBytes(ByteString byteString) {
            copyOnWrite();
            ((ChatMessageProto) this.instance).setSenderKeyBytes(byteString);
            return this;
        }

        public Builder setSenderName(String str) {
            copyOnWrite();
            ((ChatMessageProto) this.instance).setSenderName(str);
            return this;
        }

        public Builder setSenderNameBytes(ByteString byteString) {
            copyOnWrite();
            ((ChatMessageProto) this.instance).setSenderNameBytes(byteString);
            return this;
        }

        public Builder setText(String str) {
            copyOnWrite();
            ((ChatMessageProto) this.instance).setText(str);
            return this;
        }

        public Builder setTextBytes(ByteString byteString) {
            copyOnWrite();
            ((ChatMessageProto) this.instance).setTextBytes(byteString);
            return this;
        }

        public Builder setTimestampMillis(long j2) {
            copyOnWrite();
            ((ChatMessageProto) this.instance).setTimestampMillis(j2);
            return this;
        }

        private Builder() {
            super(ChatMessageProto.DEFAULT_INSTANCE);
        }

        public Builder setBitmap(MsgPictureProto.Builder builder) {
            copyOnWrite();
            ((ChatMessageProto) this.instance).setBitmap(builder.build());
            return this;
        }

        public Builder setSenderAvatar(MsgPictureProto.Builder builder) {
            copyOnWrite();
            ((ChatMessageProto) this.instance).setSenderAvatar(builder.build());
            return this;
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
        ChatMessageProto chatMessageProto = new ChatMessageProto();
        DEFAULT_INSTANCE = chatMessageProto;
        GeneratedMessageLite.registerDefaultInstance(ChatMessageProto.class, chatMessageProto);
    }

    private ChatMessageProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBitmap() {
        this.bitmap_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSenderAvatar() {
        this.senderAvatar_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSenderKey() {
        this.senderKey_ = getDefaultInstance().getSenderKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSenderName() {
        this.senderName_ = getDefaultInstance().getSenderName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestampMillis() {
        this.timestampMillis_ = 0L;
    }

    public static ChatMessageProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBitmap(MsgPictureProto msgPictureProto) {
        msgPictureProto.getClass();
        MsgPictureProto msgPictureProto2 = this.bitmap_;
        if (msgPictureProto2 == null || msgPictureProto2 == MsgPictureProto.getDefaultInstance()) {
            this.bitmap_ = msgPictureProto;
        } else {
            this.bitmap_ = MsgPictureProto.newBuilder(this.bitmap_).mergeFrom(msgPictureProto).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSenderAvatar(MsgPictureProto msgPictureProto) {
        msgPictureProto.getClass();
        MsgPictureProto msgPictureProto2 = this.senderAvatar_;
        if (msgPictureProto2 == null || msgPictureProto2 == MsgPictureProto.getDefaultInstance()) {
            this.senderAvatar_ = msgPictureProto;
        } else {
            this.senderAvatar_ = MsgPictureProto.newBuilder(this.senderAvatar_).mergeFrom(msgPictureProto).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ChatMessageProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ChatMessageProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ChatMessageProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ChatMessageProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ChatMessageProto> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBitmap(MsgPictureProto msgPictureProto) {
        msgPictureProto.getClass();
        this.bitmap_ = msgPictureProto;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSenderAvatar(MsgPictureProto msgPictureProto) {
        msgPictureProto.getClass();
        this.senderAvatar_ = msgPictureProto;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSenderKey(String str) {
        str.getClass();
        this.senderKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSenderKeyBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.senderKey_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSenderName(String str) {
        str.getClass();
        this.senderName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSenderNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.senderName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(String str) {
        str.getClass();
        this.text_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.text_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestampMillis(long j2) {
        this.timestampMillis_ = j2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new ChatMessageProto();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004Ȉ\u0005\u0003\u0006ဉ\u0001", new Object[]{"bitField0_", "senderName_", "senderKey_", "senderAvatar_", "text_", "timestampMillis_", "bitmap_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ChatMessageProto> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (ChatMessageProto.class) {
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

    @Override // com.heytap.health.watch.notification.ChatMessageProtoOrBuilder
    public MsgPictureProto getBitmap() {
        MsgPictureProto msgPictureProto = this.bitmap_;
        return msgPictureProto == null ? MsgPictureProto.getDefaultInstance() : msgPictureProto;
    }

    @Override // com.heytap.health.watch.notification.ChatMessageProtoOrBuilder
    public MsgPictureProto getSenderAvatar() {
        MsgPictureProto msgPictureProto = this.senderAvatar_;
        return msgPictureProto == null ? MsgPictureProto.getDefaultInstance() : msgPictureProto;
    }

    @Override // com.heytap.health.watch.notification.ChatMessageProtoOrBuilder
    public String getSenderKey() {
        return this.senderKey_;
    }

    @Override // com.heytap.health.watch.notification.ChatMessageProtoOrBuilder
    public ByteString getSenderKeyBytes() {
        return ByteString.copyFromUtf8(this.senderKey_);
    }

    @Override // com.heytap.health.watch.notification.ChatMessageProtoOrBuilder
    public String getSenderName() {
        return this.senderName_;
    }

    @Override // com.heytap.health.watch.notification.ChatMessageProtoOrBuilder
    public ByteString getSenderNameBytes() {
        return ByteString.copyFromUtf8(this.senderName_);
    }

    @Override // com.heytap.health.watch.notification.ChatMessageProtoOrBuilder
    public String getText() {
        return this.text_;
    }

    @Override // com.heytap.health.watch.notification.ChatMessageProtoOrBuilder
    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.text_);
    }

    @Override // com.heytap.health.watch.notification.ChatMessageProtoOrBuilder
    public long getTimestampMillis() {
        return this.timestampMillis_;
    }

    @Override // com.heytap.health.watch.notification.ChatMessageProtoOrBuilder
    public boolean hasBitmap() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.heytap.health.watch.notification.ChatMessageProtoOrBuilder
    public boolean hasSenderAvatar() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(ChatMessageProto chatMessageProto) {
        return DEFAULT_INSTANCE.createBuilder(chatMessageProto);
    }

    public static ChatMessageProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ChatMessageProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ChatMessageProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ChatMessageProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ChatMessageProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ChatMessageProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ChatMessageProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ChatMessageProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ChatMessageProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ChatMessageProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ChatMessageProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ChatMessageProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ChatMessageProto parseFrom(InputStream inputStream) throws IOException {
        return (ChatMessageProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ChatMessageProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ChatMessageProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ChatMessageProto parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ChatMessageProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ChatMessageProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ChatMessageProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
