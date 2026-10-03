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
public final class KV extends GeneratedMessageLite<KV, Builder> implements KVOrBuilder {
    private static final KV DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 1;
    private static volatile Parser<KV> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String key_ = "";
    private String value_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<KV, Builder> implements KVOrBuilder {
        public Builder clearKey() {
            copyOnWrite();
            ((KV) this.instance).clearKey();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((KV) this.instance).clearValue();
            return this;
        }

        @Override // com.heytap.health.watch.notification.KVOrBuilder
        public String getKey() {
            return ((KV) this.instance).getKey();
        }

        @Override // com.heytap.health.watch.notification.KVOrBuilder
        public ByteString getKeyBytes() {
            return ((KV) this.instance).getKeyBytes();
        }

        @Override // com.heytap.health.watch.notification.KVOrBuilder
        public String getValue() {
            return ((KV) this.instance).getValue();
        }

        @Override // com.heytap.health.watch.notification.KVOrBuilder
        public ByteString getValueBytes() {
            return ((KV) this.instance).getValueBytes();
        }

        public Builder setKey(String str) {
            copyOnWrite();
            ((KV) this.instance).setKey(str);
            return this;
        }

        public Builder setKeyBytes(ByteString byteString) {
            copyOnWrite();
            ((KV) this.instance).setKeyBytes(byteString);
            return this;
        }

        public Builder setValue(String str) {
            copyOnWrite();
            ((KV) this.instance).setValue(str);
            return this;
        }

        public Builder setValueBytes(ByteString byteString) {
            copyOnWrite();
            ((KV) this.instance).setValueBytes(byteString);
            return this;
        }

        private Builder() {
            super(KV.DEFAULT_INSTANCE);
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
        KV kv = new KV();
        DEFAULT_INSTANCE = kv;
        GeneratedMessageLite.registerDefaultInstance(KV.class, kv);
    }

    private KV() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKey() {
        this.key_ = getDefaultInstance().getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static KV getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static KV parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (KV) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static KV parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (KV) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<KV> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setValue(String str) {
        str.getClass();
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.value_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new KV();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"key_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<KV> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (KV.class) {
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

    @Override // com.heytap.health.watch.notification.KVOrBuilder
    public String getKey() {
        return this.key_;
    }

    @Override // com.heytap.health.watch.notification.KVOrBuilder
    public ByteString getKeyBytes() {
        return ByteString.copyFromUtf8(this.key_);
    }

    @Override // com.heytap.health.watch.notification.KVOrBuilder
    public String getValue() {
        return this.value_;
    }

    @Override // com.heytap.health.watch.notification.KVOrBuilder
    public ByteString getValueBytes() {
        return ByteString.copyFromUtf8(this.value_);
    }

    public static Builder newBuilder(KV kv) {
        return DEFAULT_INSTANCE.createBuilder(kv);
    }

    public static KV parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (KV) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static KV parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (KV) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static KV parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (KV) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static KV parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (KV) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static KV parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (KV) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static KV parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (KV) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static KV parseFrom(InputStream inputStream) throws IOException {
        return (KV) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static KV parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (KV) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static KV parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (KV) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static KV parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (KV) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
