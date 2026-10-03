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

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes19.dex */
public final class MsgPictureProto extends GeneratedMessageLite<MsgPictureProto, Builder> implements MsgPictureProtoOrBuilder {
    public static final int DATA_FIELD_NUMBER = 3;
    private static final MsgPictureProto DEFAULT_INSTANCE;
    public static final int HEIGHT_FIELD_NUMBER = 5;
    public static final int INDEX_FIELD_NUMBER = 6;
    private static volatile Parser<MsgPictureProto> PARSER = null;
    public static final int PICKEY_FIELD_NUMBER = 1;
    public static final int PICTYPE_FIELD_NUMBER = 2;
    public static final int WIDTH_FIELD_NUMBER = 4;
    private int height_;
    private int index_;
    private int width_;
    private String picKey_ = "";
    private String picType_ = "";
    private ByteString data_ = ByteString.EMPTY;

    public static final class Builder extends GeneratedMessageLite.Builder<MsgPictureProto, Builder> implements MsgPictureProtoOrBuilder {
        public Builder clearData() {
            copyOnWrite();
            ((MsgPictureProto) ((GeneratedMessageLite.Builder) this).instance).clearData();
            return this;
        }

        public Builder clearHeight() {
            copyOnWrite();
            ((MsgPictureProto) ((GeneratedMessageLite.Builder) this).instance).clearHeight();
            return this;
        }

        public Builder clearIndex() {
            copyOnWrite();
            ((MsgPictureProto) ((GeneratedMessageLite.Builder) this).instance).clearIndex();
            return this;
        }

        public Builder clearPicKey() {
            copyOnWrite();
            ((MsgPictureProto) ((GeneratedMessageLite.Builder) this).instance).clearPicKey();
            return this;
        }

        public Builder clearPicType() {
            copyOnWrite();
            ((MsgPictureProto) ((GeneratedMessageLite.Builder) this).instance).clearPicType();
            return this;
        }

        public Builder clearWidth() {
            copyOnWrite();
            ((MsgPictureProto) ((GeneratedMessageLite.Builder) this).instance).clearWidth();
            return this;
        }

        @Override // com.heytap.health.watch.notification.MsgPictureProtoOrBuilder
        public ByteString getData() {
            return ((MsgPictureProto) ((GeneratedMessageLite.Builder) this).instance).getData();
        }

        @Override // com.heytap.health.watch.notification.MsgPictureProtoOrBuilder
        public int getHeight() {
            return ((MsgPictureProto) ((GeneratedMessageLite.Builder) this).instance).getHeight();
        }

        @Override // com.heytap.health.watch.notification.MsgPictureProtoOrBuilder
        public int getIndex() {
            return ((MsgPictureProto) ((GeneratedMessageLite.Builder) this).instance).getIndex();
        }

        @Override // com.heytap.health.watch.notification.MsgPictureProtoOrBuilder
        public String getPicKey() {
            return ((MsgPictureProto) ((GeneratedMessageLite.Builder) this).instance).getPicKey();
        }

        @Override // com.heytap.health.watch.notification.MsgPictureProtoOrBuilder
        public ByteString getPicKeyBytes() {
            return ((MsgPictureProto) ((GeneratedMessageLite.Builder) this).instance).getPicKeyBytes();
        }

        @Override // com.heytap.health.watch.notification.MsgPictureProtoOrBuilder
        public String getPicType() {
            return ((MsgPictureProto) ((GeneratedMessageLite.Builder) this).instance).getPicType();
        }

        @Override // com.heytap.health.watch.notification.MsgPictureProtoOrBuilder
        public ByteString getPicTypeBytes() {
            return ((MsgPictureProto) ((GeneratedMessageLite.Builder) this).instance).getPicTypeBytes();
        }

        @Override // com.heytap.health.watch.notification.MsgPictureProtoOrBuilder
        public int getWidth() {
            return ((MsgPictureProto) ((GeneratedMessageLite.Builder) this).instance).getWidth();
        }

        public Builder setData(ByteString byteString) {
            copyOnWrite();
            ((MsgPictureProto) ((GeneratedMessageLite.Builder) this).instance).setData(byteString);
            return this;
        }

        public Builder setHeight(int i) {
            copyOnWrite();
            ((MsgPictureProto) ((GeneratedMessageLite.Builder) this).instance).setHeight(i);
            return this;
        }

        public Builder setIndex(int i) {
            copyOnWrite();
            ((MsgPictureProto) ((GeneratedMessageLite.Builder) this).instance).setIndex(i);
            return this;
        }

        public Builder setPicKey(String str) {
            copyOnWrite();
            ((MsgPictureProto) ((GeneratedMessageLite.Builder) this).instance).setPicKey(str);
            return this;
        }

        public Builder setPicKeyBytes(ByteString byteString) {
            copyOnWrite();
            ((MsgPictureProto) ((GeneratedMessageLite.Builder) this).instance).setPicKeyBytes(byteString);
            return this;
        }

        public Builder setPicType(String str) {
            copyOnWrite();
            ((MsgPictureProto) ((GeneratedMessageLite.Builder) this).instance).setPicType(str);
            return this;
        }

        public Builder setPicTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((MsgPictureProto) ((GeneratedMessageLite.Builder) this).instance).setPicTypeBytes(byteString);
            return this;
        }

        public Builder setWidth(int i) {
            copyOnWrite();
            ((MsgPictureProto) ((GeneratedMessageLite.Builder) this).instance).setWidth(i);
            return this;
        }

        private Builder() {
            super(MsgPictureProto.DEFAULT_INSTANCE);
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
        MsgPictureProto msgPictureProto = new MsgPictureProto();
        DEFAULT_INSTANCE = msgPictureProto;
        GeneratedMessageLite.registerDefaultInstance(MsgPictureProto.class, msgPictureProto);
    }

    private MsgPictureProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearData() {
        this.data_ = getDefaultInstance().getData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeight() {
        this.height_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIndex() {
        this.index_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPicKey() {
        this.picKey_ = getDefaultInstance().getPicKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPicType() {
        this.picType_ = getDefaultInstance().getPicType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWidth() {
        this.width_ = 0;
    }

    public static MsgPictureProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static MsgPictureProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MsgPictureProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MsgPictureProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MsgPictureProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MsgPictureProto> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setData(ByteString byteString) {
        byteString.getClass();
        this.data_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeight(int i) {
        this.height_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndex(int i) {
        this.index_ = i;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidth(int i) {
        this.width_ = i;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new MsgPictureProto();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\n\u0004\u0004\u0005\u0004\u0006\u0004", new Object[]{"picKey_", "picType_", "data_", "width_", "height_", "index_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (MsgPictureProto.class) {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
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

    @Override // com.heytap.health.watch.notification.MsgPictureProtoOrBuilder
    public ByteString getData() {
        return this.data_;
    }

    @Override // com.heytap.health.watch.notification.MsgPictureProtoOrBuilder
    public int getHeight() {
        return this.height_;
    }

    @Override // com.heytap.health.watch.notification.MsgPictureProtoOrBuilder
    public int getIndex() {
        return this.index_;
    }

    @Override // com.heytap.health.watch.notification.MsgPictureProtoOrBuilder
    public String getPicKey() {
        return this.picKey_;
    }

    @Override // com.heytap.health.watch.notification.MsgPictureProtoOrBuilder
    public ByteString getPicKeyBytes() {
        return ByteString.copyFromUtf8(this.picKey_);
    }

    @Override // com.heytap.health.watch.notification.MsgPictureProtoOrBuilder
    public String getPicType() {
        return this.picType_;
    }

    @Override // com.heytap.health.watch.notification.MsgPictureProtoOrBuilder
    public ByteString getPicTypeBytes() {
        return ByteString.copyFromUtf8(this.picType_);
    }

    @Override // com.heytap.health.watch.notification.MsgPictureProtoOrBuilder
    public int getWidth() {
        return this.width_;
    }

    public static Builder newBuilder(MsgPictureProto msgPictureProto) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(msgPictureProto);
    }

    public static MsgPictureProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MsgPictureProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MsgPictureProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MsgPictureProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MsgPictureProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MsgPictureProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MsgPictureProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MsgPictureProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MsgPictureProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MsgPictureProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MsgPictureProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MsgPictureProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MsgPictureProto parseFrom(InputStream inputStream) throws IOException {
        return (MsgPictureProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MsgPictureProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MsgPictureProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MsgPictureProto parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MsgPictureProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MsgPictureProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MsgPictureProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
