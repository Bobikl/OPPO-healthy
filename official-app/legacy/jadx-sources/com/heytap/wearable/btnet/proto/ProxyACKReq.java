package com.heytap.wearable.btnet.proto;

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
public final class ProxyACKReq extends GeneratedMessageLite<ProxyACKReq, Builder> implements ProxyACKReqOrBuilder {
    private static final ProxyACKReq DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NET_PACKAGE_SZ_FIELD_NUMBER = 2;
    private static volatile Parser<ProxyACKReq> PARSER = null;
    public static final int SLEEP_FIELD_NUMBER = 3;
    private long id_;
    private int netPackageSz_;
    private int sleep_;

    /* JADX INFO: renamed from: com.heytap.wearable.btnet.proto.ProxyACKReq$1, reason: invalid class name */
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

    public static final class Builder extends GeneratedMessageLite.Builder<ProxyACKReq, Builder> implements ProxyACKReqOrBuilder {
        public Builder clearId() {
            copyOnWrite();
            ((ProxyACKReq) this.instance).clearId();
            return this;
        }

        public Builder clearNetPackageSz() {
            copyOnWrite();
            ((ProxyACKReq) this.instance).clearNetPackageSz();
            return this;
        }

        public Builder clearSleep() {
            copyOnWrite();
            ((ProxyACKReq) this.instance).clearSleep();
            return this;
        }

        @Override // com.heytap.wearable.btnet.proto.ProxyACKReqOrBuilder
        public long getId() {
            return ((ProxyACKReq) this.instance).getId();
        }

        @Override // com.heytap.wearable.btnet.proto.ProxyACKReqOrBuilder
        public int getNetPackageSz() {
            return ((ProxyACKReq) this.instance).getNetPackageSz();
        }

        @Override // com.heytap.wearable.btnet.proto.ProxyACKReqOrBuilder
        public int getSleep() {
            return ((ProxyACKReq) this.instance).getSleep();
        }

        public Builder setId(long j2) {
            copyOnWrite();
            ((ProxyACKReq) this.instance).setId(j2);
            return this;
        }

        public Builder setNetPackageSz(int i) {
            copyOnWrite();
            ((ProxyACKReq) this.instance).setNetPackageSz(i);
            return this;
        }

        public Builder setSleep(int i) {
            copyOnWrite();
            ((ProxyACKReq) this.instance).setSleep(i);
            return this;
        }

        private Builder() {
            super(ProxyACKReq.DEFAULT_INSTANCE);
        }
    }

    static {
        ProxyACKReq proxyACKReq = new ProxyACKReq();
        DEFAULT_INSTANCE = proxyACKReq;
        GeneratedMessageLite.registerDefaultInstance(ProxyACKReq.class, proxyACKReq);
    }

    private ProxyACKReq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetPackageSz() {
        this.netPackageSz_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSleep() {
        this.sleep_ = 0;
    }

    public static ProxyACKReq getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ProxyACKReq parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ProxyACKReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ProxyACKReq parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ProxyACKReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ProxyACKReq> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j2) {
        this.id_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetPackageSz(int i) {
        this.netPackageSz_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSleep(int i) {
        this.sleep_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new ProxyACKReq();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0004\u0003\u0004", new Object[]{"id_", "netPackageSz_", "sleep_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ProxyACKReq> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (ProxyACKReq.class) {
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

    @Override // com.heytap.wearable.btnet.proto.ProxyACKReqOrBuilder
    public long getId() {
        return this.id_;
    }

    @Override // com.heytap.wearable.btnet.proto.ProxyACKReqOrBuilder
    public int getNetPackageSz() {
        return this.netPackageSz_;
    }

    @Override // com.heytap.wearable.btnet.proto.ProxyACKReqOrBuilder
    public int getSleep() {
        return this.sleep_;
    }

    public static Builder newBuilder(ProxyACKReq proxyACKReq) {
        return DEFAULT_INSTANCE.createBuilder(proxyACKReq);
    }

    public static ProxyACKReq parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ProxyACKReq) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ProxyACKReq parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ProxyACKReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ProxyACKReq parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ProxyACKReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ProxyACKReq parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ProxyACKReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ProxyACKReq parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ProxyACKReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ProxyACKReq parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ProxyACKReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ProxyACKReq parseFrom(InputStream inputStream) throws IOException {
        return (ProxyACKReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ProxyACKReq parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ProxyACKReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ProxyACKReq parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ProxyACKReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ProxyACKReq parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ProxyACKReq) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
