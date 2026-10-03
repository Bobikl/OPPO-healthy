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
public final class ImagesElement extends GeneratedMessageLite<ImagesElement, Builder> implements ImagesElementOrBuilder {
    private static final ImagesElement DEFAULT_INSTANCE;
    public static final int IMAGEKEY_FIELD_NUMBER = 2;
    public static final int LEVEL_FIELD_NUMBER = 1;
    private static volatile Parser<ImagesElement> PARSER = null;
    public static final int SHAPE_FIELD_NUMBER = 3;
    private String level_ = "";
    private String imageKey_ = "";
    private String shape_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<ImagesElement, Builder> implements ImagesElementOrBuilder {
        public Builder clearImageKey() {
            copyOnWrite();
            ((ImagesElement) this.instance).clearImageKey();
            return this;
        }

        public Builder clearLevel() {
            copyOnWrite();
            ((ImagesElement) this.instance).clearLevel();
            return this;
        }

        public Builder clearShape() {
            copyOnWrite();
            ((ImagesElement) this.instance).clearShape();
            return this;
        }

        @Override // com.heytap.health.watch.notification.ImagesElementOrBuilder
        public String getImageKey() {
            return ((ImagesElement) this.instance).getImageKey();
        }

        @Override // com.heytap.health.watch.notification.ImagesElementOrBuilder
        public ByteString getImageKeyBytes() {
            return ((ImagesElement) this.instance).getImageKeyBytes();
        }

        @Override // com.heytap.health.watch.notification.ImagesElementOrBuilder
        public String getLevel() {
            return ((ImagesElement) this.instance).getLevel();
        }

        @Override // com.heytap.health.watch.notification.ImagesElementOrBuilder
        public ByteString getLevelBytes() {
            return ((ImagesElement) this.instance).getLevelBytes();
        }

        @Override // com.heytap.health.watch.notification.ImagesElementOrBuilder
        public String getShape() {
            return ((ImagesElement) this.instance).getShape();
        }

        @Override // com.heytap.health.watch.notification.ImagesElementOrBuilder
        public ByteString getShapeBytes() {
            return ((ImagesElement) this.instance).getShapeBytes();
        }

        public Builder setImageKey(String str) {
            copyOnWrite();
            ((ImagesElement) this.instance).setImageKey(str);
            return this;
        }

        public Builder setImageKeyBytes(ByteString byteString) {
            copyOnWrite();
            ((ImagesElement) this.instance).setImageKeyBytes(byteString);
            return this;
        }

        public Builder setLevel(String str) {
            copyOnWrite();
            ((ImagesElement) this.instance).setLevel(str);
            return this;
        }

        public Builder setLevelBytes(ByteString byteString) {
            copyOnWrite();
            ((ImagesElement) this.instance).setLevelBytes(byteString);
            return this;
        }

        public Builder setShape(String str) {
            copyOnWrite();
            ((ImagesElement) this.instance).setShape(str);
            return this;
        }

        public Builder setShapeBytes(ByteString byteString) {
            copyOnWrite();
            ((ImagesElement) this.instance).setShapeBytes(byteString);
            return this;
        }

        private Builder() {
            super(ImagesElement.DEFAULT_INSTANCE);
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
        ImagesElement imagesElement = new ImagesElement();
        DEFAULT_INSTANCE = imagesElement;
        GeneratedMessageLite.registerDefaultInstance(ImagesElement.class, imagesElement);
    }

    private ImagesElement() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageKey() {
        this.imageKey_ = getDefaultInstance().getImageKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLevel() {
        this.level_ = getDefaultInstance().getLevel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShape() {
        this.shape_ = getDefaultInstance().getShape();
    }

    public static ImagesElement getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ImagesElement parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ImagesElement) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ImagesElement parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ImagesElement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ImagesElement> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageKey(String str) {
        str.getClass();
        this.imageKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageKeyBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.imageKey_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLevel(String str) {
        str.getClass();
        this.level_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLevelBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.level_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShape(String str) {
        str.getClass();
        this.shape_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShapeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.shape_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new ImagesElement();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"level_", "imageKey_", "shape_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ImagesElement> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (ImagesElement.class) {
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

    @Override // com.heytap.health.watch.notification.ImagesElementOrBuilder
    public String getImageKey() {
        return this.imageKey_;
    }

    @Override // com.heytap.health.watch.notification.ImagesElementOrBuilder
    public ByteString getImageKeyBytes() {
        return ByteString.copyFromUtf8(this.imageKey_);
    }

    @Override // com.heytap.health.watch.notification.ImagesElementOrBuilder
    public String getLevel() {
        return this.level_;
    }

    @Override // com.heytap.health.watch.notification.ImagesElementOrBuilder
    public ByteString getLevelBytes() {
        return ByteString.copyFromUtf8(this.level_);
    }

    @Override // com.heytap.health.watch.notification.ImagesElementOrBuilder
    public String getShape() {
        return this.shape_;
    }

    @Override // com.heytap.health.watch.notification.ImagesElementOrBuilder
    public ByteString getShapeBytes() {
        return ByteString.copyFromUtf8(this.shape_);
    }

    public static Builder newBuilder(ImagesElement imagesElement) {
        return DEFAULT_INSTANCE.createBuilder(imagesElement);
    }

    public static ImagesElement parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ImagesElement) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ImagesElement parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ImagesElement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ImagesElement parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ImagesElement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ImagesElement parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ImagesElement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ImagesElement parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ImagesElement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ImagesElement parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ImagesElement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ImagesElement parseFrom(InputStream inputStream) throws IOException {
        return (ImagesElement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ImagesElement parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ImagesElement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ImagesElement parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ImagesElement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ImagesElement parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ImagesElement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
