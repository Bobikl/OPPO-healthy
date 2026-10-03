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
public final class FeatureSwitch extends GeneratedMessageLite<FeatureSwitch, Builder> implements FeatureSwitchOrBuilder {
    private static final FeatureSwitch DEFAULT_INSTANCE;
    private static volatile Parser<FeatureSwitch> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int SUBDOMAIN_FIELD_NUMBER = 1;
    private boolean status_;
    private String subDomain_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<FeatureSwitch, Builder> implements FeatureSwitchOrBuilder {
        public Builder clearStatus() {
            copyOnWrite();
            ((FeatureSwitch) this.instance).clearStatus();
            return this;
        }

        public Builder clearSubDomain() {
            copyOnWrite();
            ((FeatureSwitch) this.instance).clearSubDomain();
            return this;
        }

        @Override // com.heytap.health.watch.notification.FeatureSwitchOrBuilder
        public boolean getStatus() {
            return ((FeatureSwitch) this.instance).getStatus();
        }

        @Override // com.heytap.health.watch.notification.FeatureSwitchOrBuilder
        public String getSubDomain() {
            return ((FeatureSwitch) this.instance).getSubDomain();
        }

        @Override // com.heytap.health.watch.notification.FeatureSwitchOrBuilder
        public ByteString getSubDomainBytes() {
            return ((FeatureSwitch) this.instance).getSubDomainBytes();
        }

        public Builder setStatus(boolean z) {
            copyOnWrite();
            ((FeatureSwitch) this.instance).setStatus(z);
            return this;
        }

        public Builder setSubDomain(String str) {
            copyOnWrite();
            ((FeatureSwitch) this.instance).setSubDomain(str);
            return this;
        }

        public Builder setSubDomainBytes(ByteString byteString) {
            copyOnWrite();
            ((FeatureSwitch) this.instance).setSubDomainBytes(byteString);
            return this;
        }

        private Builder() {
            super(FeatureSwitch.DEFAULT_INSTANCE);
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
        FeatureSwitch featureSwitch = new FeatureSwitch();
        DEFAULT_INSTANCE = featureSwitch;
        GeneratedMessageLite.registerDefaultInstance(FeatureSwitch.class, featureSwitch);
    }

    private FeatureSwitch() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubDomain() {
        this.subDomain_ = getDefaultInstance().getSubDomain();
    }

    public static FeatureSwitch getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FeatureSwitch parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FeatureSwitch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FeatureSwitch parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FeatureSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FeatureSwitch> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(boolean z) {
        this.status_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubDomain(String str) {
        str.getClass();
        this.subDomain_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubDomainBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.subDomain_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FeatureSwitch();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"subDomain_", "status_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FeatureSwitch> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FeatureSwitch.class) {
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

    @Override // com.heytap.health.watch.notification.FeatureSwitchOrBuilder
    public boolean getStatus() {
        return this.status_;
    }

    @Override // com.heytap.health.watch.notification.FeatureSwitchOrBuilder
    public String getSubDomain() {
        return this.subDomain_;
    }

    @Override // com.heytap.health.watch.notification.FeatureSwitchOrBuilder
    public ByteString getSubDomainBytes() {
        return ByteString.copyFromUtf8(this.subDomain_);
    }

    public static Builder newBuilder(FeatureSwitch featureSwitch) {
        return DEFAULT_INSTANCE.createBuilder(featureSwitch);
    }

    public static FeatureSwitch parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FeatureSwitch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FeatureSwitch parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FeatureSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FeatureSwitch parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FeatureSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FeatureSwitch parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FeatureSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FeatureSwitch parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FeatureSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FeatureSwitch parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FeatureSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FeatureSwitch parseFrom(InputStream inputStream) throws IOException {
        return (FeatureSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FeatureSwitch parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FeatureSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FeatureSwitch parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FeatureSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FeatureSwitch parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FeatureSwitch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
