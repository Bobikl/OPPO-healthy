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
public final class Extend extends GeneratedMessageLite<Extend, Builder> implements ExtendOrBuilder {
    private static final Extend DEFAULT_INSTANCE;
    public static final int EXTCOMMON_FIELD_NUMBER = 1;
    public static final int EXTHOST_FIELD_NUMBER = 3;
    public static final int EXTMCU_FIELD_NUMBER = 2;
    public static final int EXTPUSH_FIELD_NUMBER = 4;
    private static volatile Parser<Extend> PARSER;
    private int bitField0_;
    private ExtendCommon extCommon_;
    private ExtendHost extHost_;
    private ExtendMcu extMcu_;
    private ExtendPush extPush_;

    public static final class Builder extends GeneratedMessageLite.Builder<Extend, Builder> implements ExtendOrBuilder {
        public Builder clearExtCommon() {
            copyOnWrite();
            ((Extend) this.instance).clearExtCommon();
            return this;
        }

        public Builder clearExtHost() {
            copyOnWrite();
            ((Extend) this.instance).clearExtHost();
            return this;
        }

        public Builder clearExtMcu() {
            copyOnWrite();
            ((Extend) this.instance).clearExtMcu();
            return this;
        }

        public Builder clearExtPush() {
            copyOnWrite();
            ((Extend) this.instance).clearExtPush();
            return this;
        }

        @Override // com.heytap.health.watch.notification.ExtendOrBuilder
        public ExtendCommon getExtCommon() {
            return ((Extend) this.instance).getExtCommon();
        }

        @Override // com.heytap.health.watch.notification.ExtendOrBuilder
        public ExtendHost getExtHost() {
            return ((Extend) this.instance).getExtHost();
        }

        @Override // com.heytap.health.watch.notification.ExtendOrBuilder
        public ExtendMcu getExtMcu() {
            return ((Extend) this.instance).getExtMcu();
        }

        @Override // com.heytap.health.watch.notification.ExtendOrBuilder
        public ExtendPush getExtPush() {
            return ((Extend) this.instance).getExtPush();
        }

        @Override // com.heytap.health.watch.notification.ExtendOrBuilder
        public boolean hasExtCommon() {
            return ((Extend) this.instance).hasExtCommon();
        }

        @Override // com.heytap.health.watch.notification.ExtendOrBuilder
        public boolean hasExtHost() {
            return ((Extend) this.instance).hasExtHost();
        }

        @Override // com.heytap.health.watch.notification.ExtendOrBuilder
        public boolean hasExtMcu() {
            return ((Extend) this.instance).hasExtMcu();
        }

        @Override // com.heytap.health.watch.notification.ExtendOrBuilder
        public boolean hasExtPush() {
            return ((Extend) this.instance).hasExtPush();
        }

        public Builder mergeExtCommon(ExtendCommon extendCommon) {
            copyOnWrite();
            ((Extend) this.instance).mergeExtCommon(extendCommon);
            return this;
        }

        public Builder mergeExtHost(ExtendHost extendHost) {
            copyOnWrite();
            ((Extend) this.instance).mergeExtHost(extendHost);
            return this;
        }

        public Builder mergeExtMcu(ExtendMcu extendMcu) {
            copyOnWrite();
            ((Extend) this.instance).mergeExtMcu(extendMcu);
            return this;
        }

        public Builder mergeExtPush(ExtendPush extendPush) {
            copyOnWrite();
            ((Extend) this.instance).mergeExtPush(extendPush);
            return this;
        }

        public Builder setExtCommon(ExtendCommon extendCommon) {
            copyOnWrite();
            ((Extend) this.instance).setExtCommon(extendCommon);
            return this;
        }

        public Builder setExtHost(ExtendHost extendHost) {
            copyOnWrite();
            ((Extend) this.instance).setExtHost(extendHost);
            return this;
        }

        public Builder setExtMcu(ExtendMcu extendMcu) {
            copyOnWrite();
            ((Extend) this.instance).setExtMcu(extendMcu);
            return this;
        }

        public Builder setExtPush(ExtendPush extendPush) {
            copyOnWrite();
            ((Extend) this.instance).setExtPush(extendPush);
            return this;
        }

        private Builder() {
            super(Extend.DEFAULT_INSTANCE);
        }

        public Builder setExtCommon(ExtendCommon.Builder builder) {
            copyOnWrite();
            ((Extend) this.instance).setExtCommon(builder.build());
            return this;
        }

        public Builder setExtHost(ExtendHost.Builder builder) {
            copyOnWrite();
            ((Extend) this.instance).setExtHost(builder.build());
            return this;
        }

        public Builder setExtMcu(ExtendMcu.Builder builder) {
            copyOnWrite();
            ((Extend) this.instance).setExtMcu(builder.build());
            return this;
        }

        public Builder setExtPush(ExtendPush.Builder builder) {
            copyOnWrite();
            ((Extend) this.instance).setExtPush(builder.build());
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
        Extend extend = new Extend();
        DEFAULT_INSTANCE = extend;
        GeneratedMessageLite.registerDefaultInstance(Extend.class, extend);
    }

    private Extend() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtCommon() {
        this.extCommon_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtHost() {
        this.extHost_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtMcu() {
        this.extMcu_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtPush() {
        this.extPush_ = null;
        this.bitField0_ &= -9;
    }

    public static Extend getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExtCommon(ExtendCommon extendCommon) {
        extendCommon.getClass();
        ExtendCommon extendCommon2 = this.extCommon_;
        if (extendCommon2 == null || extendCommon2 == ExtendCommon.getDefaultInstance()) {
            this.extCommon_ = extendCommon;
        } else {
            this.extCommon_ = ExtendCommon.newBuilder(this.extCommon_).mergeFrom(extendCommon).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExtHost(ExtendHost extendHost) {
        extendHost.getClass();
        ExtendHost extendHost2 = this.extHost_;
        if (extendHost2 == null || extendHost2 == ExtendHost.getDefaultInstance()) {
            this.extHost_ = extendHost;
        } else {
            this.extHost_ = ExtendHost.newBuilder(this.extHost_).mergeFrom(extendHost).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExtMcu(ExtendMcu extendMcu) {
        extendMcu.getClass();
        ExtendMcu extendMcu2 = this.extMcu_;
        if (extendMcu2 == null || extendMcu2 == ExtendMcu.getDefaultInstance()) {
            this.extMcu_ = extendMcu;
        } else {
            this.extMcu_ = ExtendMcu.newBuilder(this.extMcu_).mergeFrom(extendMcu).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExtPush(ExtendPush extendPush) {
        extendPush.getClass();
        ExtendPush extendPush2 = this.extPush_;
        if (extendPush2 == null || extendPush2 == ExtendPush.getDefaultInstance()) {
            this.extPush_ = extendPush;
        } else {
            this.extPush_ = ExtendPush.newBuilder(this.extPush_).mergeFrom(extendPush).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Extend parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Extend) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Extend parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Extend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Extend> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtCommon(ExtendCommon extendCommon) {
        extendCommon.getClass();
        this.extCommon_ = extendCommon;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtHost(ExtendHost extendHost) {
        extendHost.getClass();
        this.extHost_ = extendHost;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtMcu(ExtendMcu extendMcu) {
        extendMcu.getClass();
        this.extMcu_ = extendMcu;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtPush(ExtendPush extendPush) {
        extendPush.getClass();
        this.extPush_ = extendPush;
        this.bitField0_ |= 8;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new Extend();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "extCommon_", "extMcu_", "extHost_", "extPush_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Extend> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Extend.class) {
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

    @Override // com.heytap.health.watch.notification.ExtendOrBuilder
    public ExtendCommon getExtCommon() {
        ExtendCommon extendCommon = this.extCommon_;
        return extendCommon == null ? ExtendCommon.getDefaultInstance() : extendCommon;
    }

    @Override // com.heytap.health.watch.notification.ExtendOrBuilder
    public ExtendHost getExtHost() {
        ExtendHost extendHost = this.extHost_;
        return extendHost == null ? ExtendHost.getDefaultInstance() : extendHost;
    }

    @Override // com.heytap.health.watch.notification.ExtendOrBuilder
    public ExtendMcu getExtMcu() {
        ExtendMcu extendMcu = this.extMcu_;
        return extendMcu == null ? ExtendMcu.getDefaultInstance() : extendMcu;
    }

    @Override // com.heytap.health.watch.notification.ExtendOrBuilder
    public ExtendPush getExtPush() {
        ExtendPush extendPush = this.extPush_;
        return extendPush == null ? ExtendPush.getDefaultInstance() : extendPush;
    }

    @Override // com.heytap.health.watch.notification.ExtendOrBuilder
    public boolean hasExtCommon() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.heytap.health.watch.notification.ExtendOrBuilder
    public boolean hasExtHost() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.heytap.health.watch.notification.ExtendOrBuilder
    public boolean hasExtMcu() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.heytap.health.watch.notification.ExtendOrBuilder
    public boolean hasExtPush() {
        return (this.bitField0_ & 8) != 0;
    }

    public static Builder newBuilder(Extend extend) {
        return DEFAULT_INSTANCE.createBuilder(extend);
    }

    public static Extend parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Extend) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Extend parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Extend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Extend parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Extend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Extend parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Extend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Extend parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Extend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Extend parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Extend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Extend parseFrom(InputStream inputStream) throws IOException {
        return (Extend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Extend parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Extend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Extend parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Extend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Extend parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Extend) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
