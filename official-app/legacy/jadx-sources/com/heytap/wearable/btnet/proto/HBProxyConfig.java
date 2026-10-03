package com.heytap.wearable.btnet.proto;

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

/* JADX INFO: loaded from: classes2.dex */
public final class HBProxyConfig extends GeneratedMessageLite<HBProxyConfig, Builder> implements HBProxyConfigOrBuilder {
    private static final HBProxyConfig DEFAULT_INSTANCE;
    public static final int ENABLE_FIELD_NUMBER = 4;
    public static final int HB_INTERVAL_FIELD_NUMBER = 5;
    public static final int HB_TIMEOUT_FIELD_NUMBER = 6;
    public static final int IP_FIELD_NUMBER = 1;
    private static volatile Parser<HBProxyConfig> PARSER = null;
    public static final int PORT_FIELD_NUMBER = 2;
    public static final int PROXY_TYPE_FIELD_NUMBER = 3;
    private boolean enable_;
    private int hbInterval_;
    private int hbTimeout_;
    private String ip_ = "";
    private int port_;
    private int proxyType_;

    /* JADX INFO: renamed from: com.heytap.wearable.btnet.proto.HBProxyConfig$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Builder extends GeneratedMessageLite.Builder<HBProxyConfig, Builder> implements HBProxyConfigOrBuilder {
        public Builder clearEnable() {
            copyOnWrite();
            ((HBProxyConfig) this.instance).clearEnable();
            return this;
        }

        public Builder clearHbInterval() {
            copyOnWrite();
            ((HBProxyConfig) this.instance).clearHbInterval();
            return this;
        }

        public Builder clearHbTimeout() {
            copyOnWrite();
            ((HBProxyConfig) this.instance).clearHbTimeout();
            return this;
        }

        public Builder clearIp() {
            copyOnWrite();
            ((HBProxyConfig) this.instance).clearIp();
            return this;
        }

        public Builder clearPort() {
            copyOnWrite();
            ((HBProxyConfig) this.instance).clearPort();
            return this;
        }

        public Builder clearProxyType() {
            copyOnWrite();
            ((HBProxyConfig) this.instance).clearProxyType();
            return this;
        }

        @Override // com.heytap.wearable.btnet.proto.HBProxyConfigOrBuilder
        public boolean getEnable() {
            return ((HBProxyConfig) this.instance).getEnable();
        }

        @Override // com.heytap.wearable.btnet.proto.HBProxyConfigOrBuilder
        public int getHbInterval() {
            return ((HBProxyConfig) this.instance).getHbInterval();
        }

        @Override // com.heytap.wearable.btnet.proto.HBProxyConfigOrBuilder
        public int getHbTimeout() {
            return ((HBProxyConfig) this.instance).getHbTimeout();
        }

        @Override // com.heytap.wearable.btnet.proto.HBProxyConfigOrBuilder
        public String getIp() {
            return ((HBProxyConfig) this.instance).getIp();
        }

        @Override // com.heytap.wearable.btnet.proto.HBProxyConfigOrBuilder
        public ByteString getIpBytes() {
            return ((HBProxyConfig) this.instance).getIpBytes();
        }

        @Override // com.heytap.wearable.btnet.proto.HBProxyConfigOrBuilder
        public int getPort() {
            return ((HBProxyConfig) this.instance).getPort();
        }

        @Override // com.heytap.wearable.btnet.proto.HBProxyConfigOrBuilder
        public int getProxyType() {
            return ((HBProxyConfig) this.instance).getProxyType();
        }

        public Builder setEnable(boolean z) {
            copyOnWrite();
            ((HBProxyConfig) this.instance).setEnable(z);
            return this;
        }

        public Builder setHbInterval(int i) {
            copyOnWrite();
            ((HBProxyConfig) this.instance).setHbInterval(i);
            return this;
        }

        public Builder setHbTimeout(int i) {
            copyOnWrite();
            ((HBProxyConfig) this.instance).setHbTimeout(i);
            return this;
        }

        public Builder setIp(String str) {
            copyOnWrite();
            ((HBProxyConfig) this.instance).setIp(str);
            return this;
        }

        public Builder setIpBytes(ByteString byteString) {
            copyOnWrite();
            ((HBProxyConfig) this.instance).setIpBytes(byteString);
            return this;
        }

        public Builder setPort(int i) {
            copyOnWrite();
            ((HBProxyConfig) this.instance).setPort(i);
            return this;
        }

        public Builder setProxyType(int i) {
            copyOnWrite();
            ((HBProxyConfig) this.instance).setProxyType(i);
            return this;
        }

        private Builder() {
            super(HBProxyConfig.DEFAULT_INSTANCE);
        }
    }

    static {
        HBProxyConfig hBProxyConfig = new HBProxyConfig();
        DEFAULT_INSTANCE = hBProxyConfig;
        GeneratedMessageLite.registerDefaultInstance(HBProxyConfig.class, hBProxyConfig);
    }

    private HBProxyConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnable() {
        this.enable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHbInterval() {
        this.hbInterval_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHbTimeout() {
        this.hbTimeout_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIp() {
        this.ip_ = getDefaultInstance().getIp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPort() {
        this.port_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProxyType() {
        this.proxyType_ = 0;
    }

    public static HBProxyConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static HBProxyConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HBProxyConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HBProxyConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (HBProxyConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<HBProxyConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnable(boolean z) {
        this.enable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHbInterval(int i) {
        this.hbInterval_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHbTimeout(int i) {
        this.hbTimeout_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIp(String str) {
        str.getClass();
        this.ip_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIpBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.ip_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPort(int i) {
        this.port_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProxyType(int i) {
        this.proxyType_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new HBProxyConfig();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0007\u0005\u0004\u0006\u0004", new Object[]{"ip_", "port_", "proxyType_", "enable_", "hbInterval_", "hbTimeout_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<HBProxyConfig> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (HBProxyConfig.class) {
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

    @Override // com.heytap.wearable.btnet.proto.HBProxyConfigOrBuilder
    public boolean getEnable() {
        return this.enable_;
    }

    @Override // com.heytap.wearable.btnet.proto.HBProxyConfigOrBuilder
    public int getHbInterval() {
        return this.hbInterval_;
    }

    @Override // com.heytap.wearable.btnet.proto.HBProxyConfigOrBuilder
    public int getHbTimeout() {
        return this.hbTimeout_;
    }

    @Override // com.heytap.wearable.btnet.proto.HBProxyConfigOrBuilder
    public String getIp() {
        return this.ip_;
    }

    @Override // com.heytap.wearable.btnet.proto.HBProxyConfigOrBuilder
    public ByteString getIpBytes() {
        return ByteString.copyFromUtf8(this.ip_);
    }

    @Override // com.heytap.wearable.btnet.proto.HBProxyConfigOrBuilder
    public int getPort() {
        return this.port_;
    }

    @Override // com.heytap.wearable.btnet.proto.HBProxyConfigOrBuilder
    public int getProxyType() {
        return this.proxyType_;
    }

    public static Builder newBuilder(HBProxyConfig hBProxyConfig) {
        return DEFAULT_INSTANCE.createBuilder(hBProxyConfig);
    }

    public static HBProxyConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HBProxyConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static HBProxyConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HBProxyConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static HBProxyConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (HBProxyConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static HBProxyConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HBProxyConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static HBProxyConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (HBProxyConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HBProxyConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HBProxyConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static HBProxyConfig parseFrom(InputStream inputStream) throws IOException {
        return (HBProxyConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HBProxyConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HBProxyConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static HBProxyConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (HBProxyConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static HBProxyConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HBProxyConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
