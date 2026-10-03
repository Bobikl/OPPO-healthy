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
public final class SimpleNotificationProto extends GeneratedMessageLite<SimpleNotificationProto, Builder> implements SimpleNotificationProtoOrBuilder {
    private static final SimpleNotificationProto DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile Parser<SimpleNotificationProto> PARSER = null;
    public static final int PKGNAME_FIELD_NUMBER = 4;
    public static final int POSTTIME_FIELD_NUMBER = 5;
    public static final int TAG_FIELD_NUMBER = 3;
    private int id_;
    private long postTime_;
    private String key_ = "";
    private String tag_ = "";
    private String pkgName_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<SimpleNotificationProto, Builder> implements SimpleNotificationProtoOrBuilder {
        public Builder clearId() {
            copyOnWrite();
            ((SimpleNotificationProto) this.instance).clearId();
            return this;
        }

        public Builder clearKey() {
            copyOnWrite();
            ((SimpleNotificationProto) this.instance).clearKey();
            return this;
        }

        public Builder clearPkgName() {
            copyOnWrite();
            ((SimpleNotificationProto) this.instance).clearPkgName();
            return this;
        }

        public Builder clearPostTime() {
            copyOnWrite();
            ((SimpleNotificationProto) this.instance).clearPostTime();
            return this;
        }

        public Builder clearTag() {
            copyOnWrite();
            ((SimpleNotificationProto) this.instance).clearTag();
            return this;
        }

        @Override // com.heytap.health.watch.notification.SimpleNotificationProtoOrBuilder
        public int getId() {
            return ((SimpleNotificationProto) this.instance).getId();
        }

        @Override // com.heytap.health.watch.notification.SimpleNotificationProtoOrBuilder
        public String getKey() {
            return ((SimpleNotificationProto) this.instance).getKey();
        }

        @Override // com.heytap.health.watch.notification.SimpleNotificationProtoOrBuilder
        public ByteString getKeyBytes() {
            return ((SimpleNotificationProto) this.instance).getKeyBytes();
        }

        @Override // com.heytap.health.watch.notification.SimpleNotificationProtoOrBuilder
        public String getPkgName() {
            return ((SimpleNotificationProto) this.instance).getPkgName();
        }

        @Override // com.heytap.health.watch.notification.SimpleNotificationProtoOrBuilder
        public ByteString getPkgNameBytes() {
            return ((SimpleNotificationProto) this.instance).getPkgNameBytes();
        }

        @Override // com.heytap.health.watch.notification.SimpleNotificationProtoOrBuilder
        public long getPostTime() {
            return ((SimpleNotificationProto) this.instance).getPostTime();
        }

        @Override // com.heytap.health.watch.notification.SimpleNotificationProtoOrBuilder
        public String getTag() {
            return ((SimpleNotificationProto) this.instance).getTag();
        }

        @Override // com.heytap.health.watch.notification.SimpleNotificationProtoOrBuilder
        public ByteString getTagBytes() {
            return ((SimpleNotificationProto) this.instance).getTagBytes();
        }

        public Builder setId(int i) {
            copyOnWrite();
            ((SimpleNotificationProto) this.instance).setId(i);
            return this;
        }

        public Builder setKey(String str) {
            copyOnWrite();
            ((SimpleNotificationProto) this.instance).setKey(str);
            return this;
        }

        public Builder setKeyBytes(ByteString byteString) {
            copyOnWrite();
            ((SimpleNotificationProto) this.instance).setKeyBytes(byteString);
            return this;
        }

        public Builder setPkgName(String str) {
            copyOnWrite();
            ((SimpleNotificationProto) this.instance).setPkgName(str);
            return this;
        }

        public Builder setPkgNameBytes(ByteString byteString) {
            copyOnWrite();
            ((SimpleNotificationProto) this.instance).setPkgNameBytes(byteString);
            return this;
        }

        public Builder setPostTime(long j2) {
            copyOnWrite();
            ((SimpleNotificationProto) this.instance).setPostTime(j2);
            return this;
        }

        public Builder setTag(String str) {
            copyOnWrite();
            ((SimpleNotificationProto) this.instance).setTag(str);
            return this;
        }

        public Builder setTagBytes(ByteString byteString) {
            copyOnWrite();
            ((SimpleNotificationProto) this.instance).setTagBytes(byteString);
            return this;
        }

        private Builder() {
            super(SimpleNotificationProto.DEFAULT_INSTANCE);
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
        SimpleNotificationProto simpleNotificationProto = new SimpleNotificationProto();
        DEFAULT_INSTANCE = simpleNotificationProto;
        GeneratedMessageLite.registerDefaultInstance(SimpleNotificationProto.class, simpleNotificationProto);
    }

    private SimpleNotificationProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKey() {
        this.key_ = getDefaultInstance().getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPkgName() {
        this.pkgName_ = getDefaultInstance().getPkgName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPostTime() {
        this.postTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTag() {
        this.tag_ = getDefaultInstance().getTag();
    }

    public static SimpleNotificationProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SimpleNotificationProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SimpleNotificationProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SimpleNotificationProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SimpleNotificationProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SimpleNotificationProto> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(int i) {
        this.id_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKey(String str) {
        str.getClass();
        this.key_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.key_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPkgName(String str) {
        str.getClass();
        this.pkgName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPkgNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.pkgName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPostTime(long j2) {
        this.postTime_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTag(String str) {
        str.getClass();
        this.tag_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTagBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.tag_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new SimpleNotificationProto();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0003", new Object[]{"id_", "key_", "tag_", "pkgName_", "postTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SimpleNotificationProto> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (SimpleNotificationProto.class) {
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

    @Override // com.heytap.health.watch.notification.SimpleNotificationProtoOrBuilder
    public int getId() {
        return this.id_;
    }

    @Override // com.heytap.health.watch.notification.SimpleNotificationProtoOrBuilder
    public String getKey() {
        return this.key_;
    }

    @Override // com.heytap.health.watch.notification.SimpleNotificationProtoOrBuilder
    public ByteString getKeyBytes() {
        return ByteString.copyFromUtf8(this.key_);
    }

    @Override // com.heytap.health.watch.notification.SimpleNotificationProtoOrBuilder
    public String getPkgName() {
        return this.pkgName_;
    }

    @Override // com.heytap.health.watch.notification.SimpleNotificationProtoOrBuilder
    public ByteString getPkgNameBytes() {
        return ByteString.copyFromUtf8(this.pkgName_);
    }

    @Override // com.heytap.health.watch.notification.SimpleNotificationProtoOrBuilder
    public long getPostTime() {
        return this.postTime_;
    }

    @Override // com.heytap.health.watch.notification.SimpleNotificationProtoOrBuilder
    public String getTag() {
        return this.tag_;
    }

    @Override // com.heytap.health.watch.notification.SimpleNotificationProtoOrBuilder
    public ByteString getTagBytes() {
        return ByteString.copyFromUtf8(this.tag_);
    }

    public static Builder newBuilder(SimpleNotificationProto simpleNotificationProto) {
        return DEFAULT_INSTANCE.createBuilder(simpleNotificationProto);
    }

    public static SimpleNotificationProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SimpleNotificationProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SimpleNotificationProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SimpleNotificationProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SimpleNotificationProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SimpleNotificationProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SimpleNotificationProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SimpleNotificationProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SimpleNotificationProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SimpleNotificationProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SimpleNotificationProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SimpleNotificationProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SimpleNotificationProto parseFrom(InputStream inputStream) throws IOException {
        return (SimpleNotificationProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SimpleNotificationProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SimpleNotificationProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SimpleNotificationProto parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SimpleNotificationProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SimpleNotificationProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SimpleNotificationProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
