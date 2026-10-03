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
public final class HttpPackageData extends GeneratedMessageLite<HttpPackageData, Builder> implements HttpPackageDataOrBuilder {
    public static final int CURRENT_PACKAGE_NUM_FIELD_NUMBER = 3;
    private static final HttpPackageData DEFAULT_INSTANCE;
    public static final int PACKAGE_DATA_FIELD_NUMBER = 4;
    public static final int PACKAGE_TOTAL_COUNT_FIELD_NUMBER = 2;
    private static volatile Parser<HttpPackageData> PARSER = null;
    public static final int REQ_ID_FIELD_NUMBER = 1;
    private int currentPackageNum_;
    private ByteString packageData_ = ByteString.EMPTY;
    private int packageTotalCount_;
    private long reqId_;

    /* JADX INFO: renamed from: com.heytap.wearable.btnet.proto.HttpPackageData$1, reason: invalid class name */
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

    public static final class Builder extends GeneratedMessageLite.Builder<HttpPackageData, Builder> implements HttpPackageDataOrBuilder {
        public Builder clearCurrentPackageNum() {
            copyOnWrite();
            ((HttpPackageData) this.instance).clearCurrentPackageNum();
            return this;
        }

        public Builder clearPackageData() {
            copyOnWrite();
            ((HttpPackageData) this.instance).clearPackageData();
            return this;
        }

        public Builder clearPackageTotalCount() {
            copyOnWrite();
            ((HttpPackageData) this.instance).clearPackageTotalCount();
            return this;
        }

        public Builder clearReqId() {
            copyOnWrite();
            ((HttpPackageData) this.instance).clearReqId();
            return this;
        }

        @Override // com.heytap.wearable.btnet.proto.HttpPackageDataOrBuilder
        public int getCurrentPackageNum() {
            return ((HttpPackageData) this.instance).getCurrentPackageNum();
        }

        @Override // com.heytap.wearable.btnet.proto.HttpPackageDataOrBuilder
        public ByteString getPackageData() {
            return ((HttpPackageData) this.instance).getPackageData();
        }

        @Override // com.heytap.wearable.btnet.proto.HttpPackageDataOrBuilder
        public int getPackageTotalCount() {
            return ((HttpPackageData) this.instance).getPackageTotalCount();
        }

        @Override // com.heytap.wearable.btnet.proto.HttpPackageDataOrBuilder
        public long getReqId() {
            return ((HttpPackageData) this.instance).getReqId();
        }

        public Builder setCurrentPackageNum(int i) {
            copyOnWrite();
            ((HttpPackageData) this.instance).setCurrentPackageNum(i);
            return this;
        }

        public Builder setPackageData(ByteString byteString) {
            copyOnWrite();
            ((HttpPackageData) this.instance).setPackageData(byteString);
            return this;
        }

        public Builder setPackageTotalCount(int i) {
            copyOnWrite();
            ((HttpPackageData) this.instance).setPackageTotalCount(i);
            return this;
        }

        public Builder setReqId(long j2) {
            copyOnWrite();
            ((HttpPackageData) this.instance).setReqId(j2);
            return this;
        }

        private Builder() {
            super(HttpPackageData.DEFAULT_INSTANCE);
        }
    }

    static {
        HttpPackageData httpPackageData = new HttpPackageData();
        DEFAULT_INSTANCE = httpPackageData;
        GeneratedMessageLite.registerDefaultInstance(HttpPackageData.class, httpPackageData);
    }

    private HttpPackageData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCurrentPackageNum() {
        this.currentPackageNum_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPackageData() {
        this.packageData_ = getDefaultInstance().getPackageData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPackageTotalCount() {
        this.packageTotalCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReqId() {
        this.reqId_ = 0L;
    }

    public static HttpPackageData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static HttpPackageData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HttpPackageData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HttpPackageData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (HttpPackageData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<HttpPackageData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentPackageNum(int i) {
        this.currentPackageNum_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackageData(ByteString byteString) {
        byteString.getClass();
        this.packageData_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackageTotalCount(int i) {
        this.packageTotalCount_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReqId(long j2) {
        this.reqId_ = j2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new HttpPackageData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0003\u0002\u000b\u0003\u000b\u0004\n", new Object[]{"reqId_", "packageTotalCount_", "currentPackageNum_", "packageData_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<HttpPackageData> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (HttpPackageData.class) {
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

    @Override // com.heytap.wearable.btnet.proto.HttpPackageDataOrBuilder
    public int getCurrentPackageNum() {
        return this.currentPackageNum_;
    }

    @Override // com.heytap.wearable.btnet.proto.HttpPackageDataOrBuilder
    public ByteString getPackageData() {
        return this.packageData_;
    }

    @Override // com.heytap.wearable.btnet.proto.HttpPackageDataOrBuilder
    public int getPackageTotalCount() {
        return this.packageTotalCount_;
    }

    @Override // com.heytap.wearable.btnet.proto.HttpPackageDataOrBuilder
    public long getReqId() {
        return this.reqId_;
    }

    public static Builder newBuilder(HttpPackageData httpPackageData) {
        return DEFAULT_INSTANCE.createBuilder(httpPackageData);
    }

    public static HttpPackageData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HttpPackageData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static HttpPackageData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HttpPackageData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static HttpPackageData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (HttpPackageData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static HttpPackageData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HttpPackageData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static HttpPackageData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (HttpPackageData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HttpPackageData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HttpPackageData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static HttpPackageData parseFrom(InputStream inputStream) throws IOException {
        return (HttpPackageData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HttpPackageData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HttpPackageData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static HttpPackageData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (HttpPackageData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static HttpPackageData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HttpPackageData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
