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
public final class ParsedNotificationActionProto extends GeneratedMessageLite<ParsedNotificationActionProto, Builder> implements ParsedNotificationActionProtoOrBuilder {
    public static final int ALLOWGENERATEDREPLIES_FIELD_NUMBER = 3;
    private static final ParsedNotificationActionProto DEFAULT_INSTANCE;
    public static final int EXT_FIELD_NUMBER = 99;
    public static final int HINTDISPLAYACTIONINLINE_FIELD_NUMBER = 6;
    public static final int INTENTID_FIELD_NUMBER = 2;
    public static final int ISWATCHCONTENTINTENT_FIELD_NUMBER = 8;
    private static volatile Parser<ParsedNotificationActionProto> PARSER = null;
    public static final int REMOTEINPUTS_FIELD_NUMBER = 4;
    public static final int REPLY_FIELD_NUMBER = 9;
    public static final int TITLE_FIELD_NUMBER = 1;
    private boolean allowGeneratedReplies_;
    private int bitField0_;
    private ExtendAction ext_;
    private boolean hintDisplayActionInline_;
    private boolean isWatchContentIntent_;
    private ParsedRemoteInputProto remoteInputs_;
    private String title_ = "";
    private String intentId_ = "";
    private String reply_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<ParsedNotificationActionProto, Builder> implements ParsedNotificationActionProtoOrBuilder {
        public Builder clearAllowGeneratedReplies() {
            copyOnWrite();
            ((ParsedNotificationActionProto) this.instance).clearAllowGeneratedReplies();
            return this;
        }

        public Builder clearExt() {
            copyOnWrite();
            ((ParsedNotificationActionProto) this.instance).clearExt();
            return this;
        }

        public Builder clearHintDisplayActionInline() {
            copyOnWrite();
            ((ParsedNotificationActionProto) this.instance).clearHintDisplayActionInline();
            return this;
        }

        public Builder clearIntentId() {
            copyOnWrite();
            ((ParsedNotificationActionProto) this.instance).clearIntentId();
            return this;
        }

        public Builder clearIsWatchContentIntent() {
            copyOnWrite();
            ((ParsedNotificationActionProto) this.instance).clearIsWatchContentIntent();
            return this;
        }

        public Builder clearRemoteInputs() {
            copyOnWrite();
            ((ParsedNotificationActionProto) this.instance).clearRemoteInputs();
            return this;
        }

        public Builder clearReply() {
            copyOnWrite();
            ((ParsedNotificationActionProto) this.instance).clearReply();
            return this;
        }

        public Builder clearTitle() {
            copyOnWrite();
            ((ParsedNotificationActionProto) this.instance).clearTitle();
            return this;
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationActionProtoOrBuilder
        public boolean getAllowGeneratedReplies() {
            return ((ParsedNotificationActionProto) this.instance).getAllowGeneratedReplies();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationActionProtoOrBuilder
        public ExtendAction getExt() {
            return ((ParsedNotificationActionProto) this.instance).getExt();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationActionProtoOrBuilder
        public boolean getHintDisplayActionInline() {
            return ((ParsedNotificationActionProto) this.instance).getHintDisplayActionInline();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationActionProtoOrBuilder
        public String getIntentId() {
            return ((ParsedNotificationActionProto) this.instance).getIntentId();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationActionProtoOrBuilder
        public ByteString getIntentIdBytes() {
            return ((ParsedNotificationActionProto) this.instance).getIntentIdBytes();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationActionProtoOrBuilder
        public boolean getIsWatchContentIntent() {
            return ((ParsedNotificationActionProto) this.instance).getIsWatchContentIntent();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationActionProtoOrBuilder
        public ParsedRemoteInputProto getRemoteInputs() {
            return ((ParsedNotificationActionProto) this.instance).getRemoteInputs();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationActionProtoOrBuilder
        public String getReply() {
            return ((ParsedNotificationActionProto) this.instance).getReply();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationActionProtoOrBuilder
        public ByteString getReplyBytes() {
            return ((ParsedNotificationActionProto) this.instance).getReplyBytes();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationActionProtoOrBuilder
        public String getTitle() {
            return ((ParsedNotificationActionProto) this.instance).getTitle();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationActionProtoOrBuilder
        public ByteString getTitleBytes() {
            return ((ParsedNotificationActionProto) this.instance).getTitleBytes();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationActionProtoOrBuilder
        public boolean hasExt() {
            return ((ParsedNotificationActionProto) this.instance).hasExt();
        }

        @Override // com.heytap.health.watch.notification.ParsedNotificationActionProtoOrBuilder
        public boolean hasRemoteInputs() {
            return ((ParsedNotificationActionProto) this.instance).hasRemoteInputs();
        }

        public Builder mergeExt(ExtendAction extendAction) {
            copyOnWrite();
            ((ParsedNotificationActionProto) this.instance).mergeExt(extendAction);
            return this;
        }

        public Builder mergeRemoteInputs(ParsedRemoteInputProto parsedRemoteInputProto) {
            copyOnWrite();
            ((ParsedNotificationActionProto) this.instance).mergeRemoteInputs(parsedRemoteInputProto);
            return this;
        }

        public Builder setAllowGeneratedReplies(boolean z) {
            copyOnWrite();
            ((ParsedNotificationActionProto) this.instance).setAllowGeneratedReplies(z);
            return this;
        }

        public Builder setExt(ExtendAction extendAction) {
            copyOnWrite();
            ((ParsedNotificationActionProto) this.instance).setExt(extendAction);
            return this;
        }

        public Builder setHintDisplayActionInline(boolean z) {
            copyOnWrite();
            ((ParsedNotificationActionProto) this.instance).setHintDisplayActionInline(z);
            return this;
        }

        public Builder setIntentId(String str) {
            copyOnWrite();
            ((ParsedNotificationActionProto) this.instance).setIntentId(str);
            return this;
        }

        public Builder setIntentIdBytes(ByteString byteString) {
            copyOnWrite();
            ((ParsedNotificationActionProto) this.instance).setIntentIdBytes(byteString);
            return this;
        }

        public Builder setIsWatchContentIntent(boolean z) {
            copyOnWrite();
            ((ParsedNotificationActionProto) this.instance).setIsWatchContentIntent(z);
            return this;
        }

        public Builder setRemoteInputs(ParsedRemoteInputProto parsedRemoteInputProto) {
            copyOnWrite();
            ((ParsedNotificationActionProto) this.instance).setRemoteInputs(parsedRemoteInputProto);
            return this;
        }

        public Builder setReply(String str) {
            copyOnWrite();
            ((ParsedNotificationActionProto) this.instance).setReply(str);
            return this;
        }

        public Builder setReplyBytes(ByteString byteString) {
            copyOnWrite();
            ((ParsedNotificationActionProto) this.instance).setReplyBytes(byteString);
            return this;
        }

        public Builder setTitle(String str) {
            copyOnWrite();
            ((ParsedNotificationActionProto) this.instance).setTitle(str);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            copyOnWrite();
            ((ParsedNotificationActionProto) this.instance).setTitleBytes(byteString);
            return this;
        }

        private Builder() {
            super(ParsedNotificationActionProto.DEFAULT_INSTANCE);
        }

        public Builder setExt(ExtendAction.Builder builder) {
            copyOnWrite();
            ((ParsedNotificationActionProto) this.instance).setExt(builder.build());
            return this;
        }

        public Builder setRemoteInputs(ParsedRemoteInputProto.Builder builder) {
            copyOnWrite();
            ((ParsedNotificationActionProto) this.instance).setRemoteInputs(builder.build());
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
        ParsedNotificationActionProto parsedNotificationActionProto = new ParsedNotificationActionProto();
        DEFAULT_INSTANCE = parsedNotificationActionProto;
        GeneratedMessageLite.registerDefaultInstance(ParsedNotificationActionProto.class, parsedNotificationActionProto);
    }

    private ParsedNotificationActionProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowGeneratedReplies() {
        this.allowGeneratedReplies_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExt() {
        this.ext_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHintDisplayActionInline() {
        this.hintDisplayActionInline_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntentId() {
        this.intentId_ = getDefaultInstance().getIntentId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsWatchContentIntent() {
        this.isWatchContentIntent_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemoteInputs() {
        this.remoteInputs_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReply() {
        this.reply_ = getDefaultInstance().getReply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static ParsedNotificationActionProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExt(ExtendAction extendAction) {
        extendAction.getClass();
        ExtendAction extendAction2 = this.ext_;
        if (extendAction2 == null || extendAction2 == ExtendAction.getDefaultInstance()) {
            this.ext_ = extendAction;
        } else {
            this.ext_ = ExtendAction.newBuilder(this.ext_).mergeFrom(extendAction).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRemoteInputs(ParsedRemoteInputProto parsedRemoteInputProto) {
        parsedRemoteInputProto.getClass();
        ParsedRemoteInputProto parsedRemoteInputProto2 = this.remoteInputs_;
        if (parsedRemoteInputProto2 == null || parsedRemoteInputProto2 == ParsedRemoteInputProto.getDefaultInstance()) {
            this.remoteInputs_ = parsedRemoteInputProto;
        } else {
            this.remoteInputs_ = ParsedRemoteInputProto.newBuilder(this.remoteInputs_).mergeFrom(parsedRemoteInputProto).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ParsedNotificationActionProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ParsedNotificationActionProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ParsedNotificationActionProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ParsedNotificationActionProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ParsedNotificationActionProto> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowGeneratedReplies(boolean z) {
        this.allowGeneratedReplies_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExt(ExtendAction extendAction) {
        extendAction.getClass();
        this.ext_ = extendAction;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHintDisplayActionInline(boolean z) {
        this.hintDisplayActionInline_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntentId(String str) {
        str.getClass();
        this.intentId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntentIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.intentId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsWatchContentIntent(boolean z) {
        this.isWatchContentIntent_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemoteInputs(ParsedRemoteInputProto parsedRemoteInputProto) {
        parsedRemoteInputProto.getClass();
        this.remoteInputs_ = parsedRemoteInputProto;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReply(String str) {
        str.getClass();
        this.reply_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReplyBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.reply_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.title_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new ParsedNotificationActionProto();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001c\b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004ဉ\u0000\u0006\u0007\b\u0007\tȈcဉ\u0001", new Object[]{"bitField0_", "title_", "intentId_", "allowGeneratedReplies_", "remoteInputs_", "hintDisplayActionInline_", "isWatchContentIntent_", "reply_", "ext_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ParsedNotificationActionProto> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (ParsedNotificationActionProto.class) {
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

    @Override // com.heytap.health.watch.notification.ParsedNotificationActionProtoOrBuilder
    public boolean getAllowGeneratedReplies() {
        return this.allowGeneratedReplies_;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationActionProtoOrBuilder
    public ExtendAction getExt() {
        ExtendAction extendAction = this.ext_;
        return extendAction == null ? ExtendAction.getDefaultInstance() : extendAction;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationActionProtoOrBuilder
    public boolean getHintDisplayActionInline() {
        return this.hintDisplayActionInline_;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationActionProtoOrBuilder
    public String getIntentId() {
        return this.intentId_;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationActionProtoOrBuilder
    public ByteString getIntentIdBytes() {
        return ByteString.copyFromUtf8(this.intentId_);
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationActionProtoOrBuilder
    public boolean getIsWatchContentIntent() {
        return this.isWatchContentIntent_;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationActionProtoOrBuilder
    public ParsedRemoteInputProto getRemoteInputs() {
        ParsedRemoteInputProto parsedRemoteInputProto = this.remoteInputs_;
        return parsedRemoteInputProto == null ? ParsedRemoteInputProto.getDefaultInstance() : parsedRemoteInputProto;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationActionProtoOrBuilder
    public String getReply() {
        return this.reply_;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationActionProtoOrBuilder
    public ByteString getReplyBytes() {
        return ByteString.copyFromUtf8(this.reply_);
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationActionProtoOrBuilder
    public String getTitle() {
        return this.title_;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationActionProtoOrBuilder
    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8(this.title_);
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationActionProtoOrBuilder
    public boolean hasExt() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.heytap.health.watch.notification.ParsedNotificationActionProtoOrBuilder
    public boolean hasRemoteInputs() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(ParsedNotificationActionProto parsedNotificationActionProto) {
        return DEFAULT_INSTANCE.createBuilder(parsedNotificationActionProto);
    }

    public static ParsedNotificationActionProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ParsedNotificationActionProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ParsedNotificationActionProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ParsedNotificationActionProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ParsedNotificationActionProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ParsedNotificationActionProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ParsedNotificationActionProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ParsedNotificationActionProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ParsedNotificationActionProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ParsedNotificationActionProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ParsedNotificationActionProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ParsedNotificationActionProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ParsedNotificationActionProto parseFrom(InputStream inputStream) throws IOException {
        return (ParsedNotificationActionProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ParsedNotificationActionProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ParsedNotificationActionProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ParsedNotificationActionProto parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ParsedNotificationActionProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ParsedNotificationActionProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ParsedNotificationActionProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
