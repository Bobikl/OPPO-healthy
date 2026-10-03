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
public final class BigPictureProto extends GeneratedMessageLite<BigPictureProto, Builder> implements BigPictureProtoOrBuilder {
    private static final BigPictureProto DEFAULT_INSTANCE;
    private static volatile Parser<BigPictureProto> PARSER = null;
    public static final int PICKEY_FIELD_NUMBER = 1;
    public static final int PICTYPE_FIELD_NUMBER = 2;
    private String picKey_ = "";
    private String picType_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<BigPictureProto, Builder> implements BigPictureProtoOrBuilder {
        public Builder clearPicKey() {
            copyOnWrite();
            ((BigPictureProto) this.instance).clearPicKey();
            return this;
        }

        public Builder clearPicType() {
            copyOnWrite();
            ((BigPictureProto) this.instance).clearPicType();
            return this;
        }

        @Override // com.heytap.health.watch.notification.BigPictureProtoOrBuilder
        public String getPicKey() {
            return ((BigPictureProto) this.instance).getPicKey();
        }

        @Override // com.heytap.health.watch.notification.BigPictureProtoOrBuilder
        public ByteString getPicKeyBytes() {
            return ((BigPictureProto) this.instance).getPicKeyBytes();
        }

        @Override // com.heytap.health.watch.notification.BigPictureProtoOrBuilder
        public String getPicType() {
            return ((BigPictureProto) this.instance).getPicType();
        }

        @Override // com.heytap.health.watch.notification.BigPictureProtoOrBuilder
        public ByteString getPicTypeBytes() {
            return ((BigPictureProto) this.instance).getPicTypeBytes();
        }

        public Builder setPicKey(String str) {
            copyOnWrite();
            ((BigPictureProto) this.instance).setPicKey(str);
            return this;
        }

        public Builder setPicKeyBytes(ByteString byteString) {
            copyOnWrite();
            ((BigPictureProto) this.instance).setPicKeyBytes(byteString);
            return this;
        }

        public Builder setPicType(String str) {
            copyOnWrite();
            ((BigPictureProto) this.instance).setPicType(str);
            return this;
        }

        public Builder setPicTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((BigPictureProto) this.instance).setPicTypeBytes(byteString);
            return this;
        }

        private Builder() {
            super(BigPictureProto.DEFAULT_INSTANCE);
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
        BigPictureProto bigPictureProto = new BigPictureProto();
        DEFAULT_INSTANCE = bigPictureProto;
        GeneratedMessageLite.registerDefaultInstance(BigPictureProto.class, bigPictureProto);
    }

    private BigPictureProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPicKey() {
        this.picKey_ = getDefaultInstance().getPicKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPicType() {
        this.picType_ = getDefaultInstance().getPicType();
    }

    public static BigPictureProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static BigPictureProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BigPictureProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BigPictureProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BigPictureProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<BigPictureProto> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPicKey(String str) {
        str.getClass();
        this.picKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPicKeyBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.picKey_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPicType(String str) {
        str.getClass();
        this.picType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPicTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.picType_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new BigPictureProto();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"picKey_", "picType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<BigPictureProto> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (BigPictureProto.class) {
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

    @Override // com.heytap.health.watch.notification.BigPictureProtoOrBuilder
    public String getPicKey() {
        return this.picKey_;
    }

    @Override // com.heytap.health.watch.notification.BigPictureProtoOrBuilder
    public ByteString getPicKeyBytes() {
        return ByteString.copyFromUtf8(this.picKey_);
    }

    @Override // com.heytap.health.watch.notification.BigPictureProtoOrBuilder
    public String getPicType() {
        return this.picType_;
    }

    @Override // com.heytap.health.watch.notification.BigPictureProtoOrBuilder
    public ByteString getPicTypeBytes() {
        return ByteString.copyFromUtf8(this.picType_);
    }

    public static Builder newBuilder(BigPictureProto bigPictureProto) {
        return DEFAULT_INSTANCE.createBuilder(bigPictureProto);
    }

    public static BigPictureProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BigPictureProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BigPictureProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BigPictureProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static BigPictureProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BigPictureProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static BigPictureProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BigPictureProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static BigPictureProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BigPictureProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BigPictureProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BigPictureProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static BigPictureProto parseFrom(InputStream inputStream) throws IOException {
        return (BigPictureProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BigPictureProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BigPictureProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static BigPictureProto parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BigPictureProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BigPictureProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BigPictureProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
