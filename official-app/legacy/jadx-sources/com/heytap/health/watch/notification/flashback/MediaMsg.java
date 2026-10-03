package com.heytap.health.watch.notification.flashback;

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
public final class MediaMsg extends GeneratedMessageLite<MediaMsg, Builder> implements MediaMsgOrBuilder {
    private static final MediaMsg DEFAULT_INSTANCE;
    public static final int MEDIAID_FIELD_NUMBER = 3;
    public static final int MEDIATYPE_FIELD_NUMBER = 2;
    public static final int MEDIA_FIELD_NUMBER = 1;
    private static volatile Parser<MediaMsg> PARSER;
    private int mediaId_;
    private int mediaType_;
    private ByteString media_ = ByteString.EMPTY;

    public static final class Builder extends GeneratedMessageLite.Builder<MediaMsg, Builder> implements MediaMsgOrBuilder {
        public Builder clearMedia() {
            copyOnWrite();
            ((MediaMsg) this.instance).clearMedia();
            return this;
        }

        public Builder clearMediaId() {
            copyOnWrite();
            ((MediaMsg) this.instance).clearMediaId();
            return this;
        }

        public Builder clearMediaType() {
            copyOnWrite();
            ((MediaMsg) this.instance).clearMediaType();
            return this;
        }

        @Override // com.heytap.health.watch.notification.flashback.MediaMsgOrBuilder
        public ByteString getMedia() {
            return ((MediaMsg) this.instance).getMedia();
        }

        @Override // com.heytap.health.watch.notification.flashback.MediaMsgOrBuilder
        public int getMediaId() {
            return ((MediaMsg) this.instance).getMediaId();
        }

        @Override // com.heytap.health.watch.notification.flashback.MediaMsgOrBuilder
        public int getMediaType() {
            return ((MediaMsg) this.instance).getMediaType();
        }

        public Builder setMedia(ByteString byteString) {
            copyOnWrite();
            ((MediaMsg) this.instance).setMedia(byteString);
            return this;
        }

        public Builder setMediaId(int i) {
            copyOnWrite();
            ((MediaMsg) this.instance).setMediaId(i);
            return this;
        }

        public Builder setMediaType(int i) {
            copyOnWrite();
            ((MediaMsg) this.instance).setMediaType(i);
            return this;
        }

        private Builder() {
            super(MediaMsg.DEFAULT_INSTANCE);
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
        MediaMsg mediaMsg = new MediaMsg();
        DEFAULT_INSTANCE = mediaMsg;
        GeneratedMessageLite.registerDefaultInstance(MediaMsg.class, mediaMsg);
    }

    private MediaMsg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMedia() {
        this.media_ = getDefaultInstance().getMedia();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMediaId() {
        this.mediaId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMediaType() {
        this.mediaType_ = 0;
    }

    public static MediaMsg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MediaMsg parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MediaMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MediaMsg parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MediaMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MediaMsg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMedia(ByteString byteString) {
        byteString.getClass();
        this.media_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediaId(int i) {
        this.mediaId_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediaType(int i) {
        this.mediaType_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new MediaMsg();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\u0004\u0003\u0004", new Object[]{"media_", "mediaType_", "mediaId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MediaMsg> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (MediaMsg.class) {
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

    @Override // com.heytap.health.watch.notification.flashback.MediaMsgOrBuilder
    public ByteString getMedia() {
        return this.media_;
    }

    @Override // com.heytap.health.watch.notification.flashback.MediaMsgOrBuilder
    public int getMediaId() {
        return this.mediaId_;
    }

    @Override // com.heytap.health.watch.notification.flashback.MediaMsgOrBuilder
    public int getMediaType() {
        return this.mediaType_;
    }

    public static Builder newBuilder(MediaMsg mediaMsg) {
        return DEFAULT_INSTANCE.createBuilder(mediaMsg);
    }

    public static MediaMsg parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MediaMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MediaMsg parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MediaMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MediaMsg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MediaMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MediaMsg parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MediaMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MediaMsg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MediaMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MediaMsg parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MediaMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MediaMsg parseFrom(InputStream inputStream) throws IOException {
        return (MediaMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MediaMsg parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MediaMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MediaMsg parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MediaMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MediaMsg parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MediaMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
