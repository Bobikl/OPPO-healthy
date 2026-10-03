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
public final class FlashbackFeature extends GeneratedMessageLite<FlashbackFeature, Builder> implements FlashbackFeatureOrBuilder {
    private static final FlashbackFeature DEFAULT_INSTANCE;
    public static final int MSGID_FIELD_NUMBER = 1;
    private static volatile Parser<FlashbackFeature> PARSER = null;
    public static final int SUPPORT_FIELD_NUMBER = 2;
    private int msgId_;
    private boolean support_;

    public static final class Builder extends GeneratedMessageLite.Builder<FlashbackFeature, Builder> implements FlashbackFeatureOrBuilder {
        public Builder clearMsgId() {
            copyOnWrite();
            ((FlashbackFeature) this.instance).clearMsgId();
            return this;
        }

        public Builder clearSupport() {
            copyOnWrite();
            ((FlashbackFeature) this.instance).clearSupport();
            return this;
        }

        @Override // com.heytap.health.watch.notification.flashback.FlashbackFeatureOrBuilder
        public int getMsgId() {
            return ((FlashbackFeature) this.instance).getMsgId();
        }

        @Override // com.heytap.health.watch.notification.flashback.FlashbackFeatureOrBuilder
        public boolean getSupport() {
            return ((FlashbackFeature) this.instance).getSupport();
        }

        public Builder setMsgId(int i) {
            copyOnWrite();
            ((FlashbackFeature) this.instance).setMsgId(i);
            return this;
        }

        public Builder setSupport(boolean z) {
            copyOnWrite();
            ((FlashbackFeature) this.instance).setSupport(z);
            return this;
        }

        private Builder() {
            super(FlashbackFeature.DEFAULT_INSTANCE);
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
        FlashbackFeature flashbackFeature = new FlashbackFeature();
        DEFAULT_INSTANCE = flashbackFeature;
        GeneratedMessageLite.registerDefaultInstance(FlashbackFeature.class, flashbackFeature);
    }

    private FlashbackFeature() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMsgId() {
        this.msgId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSupport() {
        this.support_ = false;
    }

    public static FlashbackFeature getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FlashbackFeature parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FlashbackFeature) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FlashbackFeature parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FlashbackFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FlashbackFeature> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMsgId(int i) {
        this.msgId_ = i;
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
                return new FlashbackFeature();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0007", new Object[]{"msgId_", "support_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FlashbackFeature> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FlashbackFeature.class) {
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

    @Override // com.heytap.health.watch.notification.flashback.FlashbackFeatureOrBuilder
    public int getMsgId() {
        return this.msgId_;
    }

    @Override // com.heytap.health.watch.notification.flashback.FlashbackFeatureOrBuilder
    public boolean getSupport() {
        return this.support_;
    }

    public static Builder newBuilder(FlashbackFeature flashbackFeature) {
        return DEFAULT_INSTANCE.createBuilder(flashbackFeature);
    }

    public static FlashbackFeature parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FlashbackFeature) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FlashbackFeature parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FlashbackFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FlashbackFeature parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FlashbackFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FlashbackFeature parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FlashbackFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FlashbackFeature parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FlashbackFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FlashbackFeature parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FlashbackFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FlashbackFeature parseFrom(InputStream inputStream) throws IOException {
        return (FlashbackFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FlashbackFeature parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FlashbackFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FlashbackFeature parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FlashbackFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FlashbackFeature parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FlashbackFeature) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
