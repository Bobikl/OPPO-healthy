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
public final class ExtendHost extends GeneratedMessageLite<ExtendHost, Builder> implements ExtendHostOrBuilder {
    public static final int CARDTYPE_FIELD_NUMBER = 1;
    private static final ExtendHost DEFAULT_INSTANCE;
    private static volatile Parser<ExtendHost> PARSER = null;
    public static final int SOUNDTYPE_FIELD_NUMBER = 3;
    public static final int VIBRATIONTYPE_FIELD_NUMBER = 2;
    private int cardType_;
    private int soundType_;
    private int vibrationType_;

    public static final class Builder extends GeneratedMessageLite.Builder<ExtendHost, Builder> implements ExtendHostOrBuilder {
        public Builder clearCardType() {
            copyOnWrite();
            ((ExtendHost) this.instance).clearCardType();
            return this;
        }

        public Builder clearSoundType() {
            copyOnWrite();
            ((ExtendHost) this.instance).clearSoundType();
            return this;
        }

        public Builder clearVibrationType() {
            copyOnWrite();
            ((ExtendHost) this.instance).clearVibrationType();
            return this;
        }

        @Override // com.heytap.health.watch.notification.ExtendHostOrBuilder
        public int getCardType() {
            return ((ExtendHost) this.instance).getCardType();
        }

        @Override // com.heytap.health.watch.notification.ExtendHostOrBuilder
        public int getSoundType() {
            return ((ExtendHost) this.instance).getSoundType();
        }

        @Override // com.heytap.health.watch.notification.ExtendHostOrBuilder
        public int getVibrationType() {
            return ((ExtendHost) this.instance).getVibrationType();
        }

        public Builder setCardType(int i) {
            copyOnWrite();
            ((ExtendHost) this.instance).setCardType(i);
            return this;
        }

        public Builder setSoundType(int i) {
            copyOnWrite();
            ((ExtendHost) this.instance).setSoundType(i);
            return this;
        }

        public Builder setVibrationType(int i) {
            copyOnWrite();
            ((ExtendHost) this.instance).setVibrationType(i);
            return this;
        }

        private Builder() {
            super(ExtendHost.DEFAULT_INSTANCE);
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
        ExtendHost extendHost = new ExtendHost();
        DEFAULT_INSTANCE = extendHost;
        GeneratedMessageLite.registerDefaultInstance(ExtendHost.class, extendHost);
    }

    private ExtendHost() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCardType() {
        this.cardType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSoundType() {
        this.soundType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVibrationType() {
        this.vibrationType_ = 0;
    }

    public static ExtendHost getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ExtendHost parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ExtendHost) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExtendHost parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ExtendHost) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ExtendHost> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardType(int i) {
        this.cardType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSoundType(int i) {
        this.soundType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVibrationType(int i) {
        this.vibrationType_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new ExtendHost();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u0004\u0003\u0004", new Object[]{"cardType_", "vibrationType_", "soundType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ExtendHost> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (ExtendHost.class) {
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

    @Override // com.heytap.health.watch.notification.ExtendHostOrBuilder
    public int getCardType() {
        return this.cardType_;
    }

    @Override // com.heytap.health.watch.notification.ExtendHostOrBuilder
    public int getSoundType() {
        return this.soundType_;
    }

    @Override // com.heytap.health.watch.notification.ExtendHostOrBuilder
    public int getVibrationType() {
        return this.vibrationType_;
    }

    public static Builder newBuilder(ExtendHost extendHost) {
        return DEFAULT_INSTANCE.createBuilder(extendHost);
    }

    public static ExtendHost parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExtendHost) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ExtendHost parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExtendHost) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ExtendHost parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ExtendHost) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ExtendHost parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExtendHost) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ExtendHost parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ExtendHost) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ExtendHost parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExtendHost) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ExtendHost parseFrom(InputStream inputStream) throws IOException {
        return (ExtendHost) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExtendHost parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExtendHost) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ExtendHost parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ExtendHost) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ExtendHost parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExtendHost) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
