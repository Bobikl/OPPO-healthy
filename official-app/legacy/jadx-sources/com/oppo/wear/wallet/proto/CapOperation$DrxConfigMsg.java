package com.oppo.wear.wallet.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.cx2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes9.dex */
public final class CapOperation$DrxConfigMsg extends GeneratedMessageLite<CapOperation$DrxConfigMsg, Builder> implements CapOperation$DrxConfigMsgOrBuilder {
    private static final CapOperation$DrxConfigMsg DEFAULT_INSTANCE;
    public static final int FAILRETRYNUM_FIELD_NUMBER = 7;
    public static final int INVERSEKEYTYPE_FIELD_NUMBER = 3;
    public static final int ISNEEDINVERSE_FIELD_NUMBER = 2;
    public static final int ISNEEDM4MUPGRADE_FIELD_NUMBER = 1;
    public static final int NUMDISTANCE_FIELD_NUMBER = 6;
    private static volatile Parser<CapOperation$DrxConfigMsg> PARSER = null;
    public static final int PROBECOUNT_FIELD_NUMBER = 4;
    public static final int QUERYKEYMAXNUM_FIELD_NUMBER = 9;
    public static final int QUERYKEYTIMEINTERVAL_FIELD_NUMBER = 8;
    public static final int SAMPLECOUNT_FIELD_NUMBER = 5;
    private int failRetryNum_;
    private int inverseKeyType_;
    private boolean isNeedInverse_;
    private boolean isNeedM4MUpgrade_;
    private int numDistance_;
    private int probeCount_;
    private int queryKeyMaxNum_;
    private int queryKeyTimeInterval_;
    private int sampleCount_;

    public static final class Builder extends GeneratedMessageLite.Builder<CapOperation$DrxConfigMsg, Builder> implements CapOperation$DrxConfigMsgOrBuilder {
        public Builder clearFailRetryNum() {
            copyOnWrite();
            ((CapOperation$DrxConfigMsg) this.instance).clearFailRetryNum();
            return this;
        }

        public Builder clearInverseKeyType() {
            copyOnWrite();
            ((CapOperation$DrxConfigMsg) this.instance).clearInverseKeyType();
            return this;
        }

        public Builder clearIsNeedInverse() {
            copyOnWrite();
            ((CapOperation$DrxConfigMsg) this.instance).clearIsNeedInverse();
            return this;
        }

        public Builder clearIsNeedM4MUpgrade() {
            copyOnWrite();
            ((CapOperation$DrxConfigMsg) this.instance).clearIsNeedM4MUpgrade();
            return this;
        }

        public Builder clearNumDistance() {
            copyOnWrite();
            ((CapOperation$DrxConfigMsg) this.instance).clearNumDistance();
            return this;
        }

        public Builder clearProbeCount() {
            copyOnWrite();
            ((CapOperation$DrxConfigMsg) this.instance).clearProbeCount();
            return this;
        }

        public Builder clearQueryKeyMaxNum() {
            copyOnWrite();
            ((CapOperation$DrxConfigMsg) this.instance).clearQueryKeyMaxNum();
            return this;
        }

        public Builder clearQueryKeyTimeInterval() {
            copyOnWrite();
            ((CapOperation$DrxConfigMsg) this.instance).clearQueryKeyTimeInterval();
            return this;
        }

        public Builder clearSampleCount() {
            copyOnWrite();
            ((CapOperation$DrxConfigMsg) this.instance).clearSampleCount();
            return this;
        }

        @Override // com.oppo.wear.wallet.proto.CapOperation$DrxConfigMsgOrBuilder
        public int getFailRetryNum() {
            return ((CapOperation$DrxConfigMsg) this.instance).getFailRetryNum();
        }

        @Override // com.oppo.wear.wallet.proto.CapOperation$DrxConfigMsgOrBuilder
        public int getInverseKeyType() {
            return ((CapOperation$DrxConfigMsg) this.instance).getInverseKeyType();
        }

        @Override // com.oppo.wear.wallet.proto.CapOperation$DrxConfigMsgOrBuilder
        public boolean getIsNeedInverse() {
            return ((CapOperation$DrxConfigMsg) this.instance).getIsNeedInverse();
        }

        @Override // com.oppo.wear.wallet.proto.CapOperation$DrxConfigMsgOrBuilder
        public boolean getIsNeedM4MUpgrade() {
            return ((CapOperation$DrxConfigMsg) this.instance).getIsNeedM4MUpgrade();
        }

        @Override // com.oppo.wear.wallet.proto.CapOperation$DrxConfigMsgOrBuilder
        public int getNumDistance() {
            return ((CapOperation$DrxConfigMsg) this.instance).getNumDistance();
        }

        @Override // com.oppo.wear.wallet.proto.CapOperation$DrxConfigMsgOrBuilder
        public int getProbeCount() {
            return ((CapOperation$DrxConfigMsg) this.instance).getProbeCount();
        }

        @Override // com.oppo.wear.wallet.proto.CapOperation$DrxConfigMsgOrBuilder
        public int getQueryKeyMaxNum() {
            return ((CapOperation$DrxConfigMsg) this.instance).getQueryKeyMaxNum();
        }

        @Override // com.oppo.wear.wallet.proto.CapOperation$DrxConfigMsgOrBuilder
        public int getQueryKeyTimeInterval() {
            return ((CapOperation$DrxConfigMsg) this.instance).getQueryKeyTimeInterval();
        }

        @Override // com.oppo.wear.wallet.proto.CapOperation$DrxConfigMsgOrBuilder
        public int getSampleCount() {
            return ((CapOperation$DrxConfigMsg) this.instance).getSampleCount();
        }

        public Builder setFailRetryNum(int i) {
            copyOnWrite();
            ((CapOperation$DrxConfigMsg) this.instance).setFailRetryNum(i);
            return this;
        }

        public Builder setInverseKeyType(int i) {
            copyOnWrite();
            ((CapOperation$DrxConfigMsg) this.instance).setInverseKeyType(i);
            return this;
        }

        public Builder setIsNeedInverse(boolean z) {
            copyOnWrite();
            ((CapOperation$DrxConfigMsg) this.instance).setIsNeedInverse(z);
            return this;
        }

        public Builder setIsNeedM4MUpgrade(boolean z) {
            copyOnWrite();
            ((CapOperation$DrxConfigMsg) this.instance).setIsNeedM4MUpgrade(z);
            return this;
        }

        public Builder setNumDistance(int i) {
            copyOnWrite();
            ((CapOperation$DrxConfigMsg) this.instance).setNumDistance(i);
            return this;
        }

        public Builder setProbeCount(int i) {
            copyOnWrite();
            ((CapOperation$DrxConfigMsg) this.instance).setProbeCount(i);
            return this;
        }

        public Builder setQueryKeyMaxNum(int i) {
            copyOnWrite();
            ((CapOperation$DrxConfigMsg) this.instance).setQueryKeyMaxNum(i);
            return this;
        }

        public Builder setQueryKeyTimeInterval(int i) {
            copyOnWrite();
            ((CapOperation$DrxConfigMsg) this.instance).setQueryKeyTimeInterval(i);
            return this;
        }

        public Builder setSampleCount(int i) {
            copyOnWrite();
            ((CapOperation$DrxConfigMsg) this.instance).setSampleCount(i);
            return this;
        }

        private Builder() {
            super(CapOperation$DrxConfigMsg.DEFAULT_INSTANCE);
        }
    }

    static {
        CapOperation$DrxConfigMsg capOperation$DrxConfigMsg = new CapOperation$DrxConfigMsg();
        DEFAULT_INSTANCE = capOperation$DrxConfigMsg;
        GeneratedMessageLite.registerDefaultInstance(CapOperation$DrxConfigMsg.class, capOperation$DrxConfigMsg);
    }

    private CapOperation$DrxConfigMsg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFailRetryNum() {
        this.failRetryNum_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInverseKeyType() {
        this.inverseKeyType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsNeedInverse() {
        this.isNeedInverse_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsNeedM4MUpgrade() {
        this.isNeedM4MUpgrade_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumDistance() {
        this.numDistance_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProbeCount() {
        this.probeCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQueryKeyMaxNum() {
        this.queryKeyMaxNum_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQueryKeyTimeInterval() {
        this.queryKeyTimeInterval_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSampleCount() {
        this.sampleCount_ = 0;
    }

    public static CapOperation$DrxConfigMsg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CapOperation$DrxConfigMsg parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CapOperation$DrxConfigMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CapOperation$DrxConfigMsg parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CapOperation$DrxConfigMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CapOperation$DrxConfigMsg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailRetryNum(int i) {
        this.failRetryNum_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInverseKeyType(int i) {
        this.inverseKeyType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsNeedInverse(boolean z) {
        this.isNeedInverse_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsNeedM4MUpgrade(boolean z) {
        this.isNeedM4MUpgrade_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumDistance(int i) {
        this.numDistance_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProbeCount(int i) {
        this.probeCount_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQueryKeyMaxNum(int i) {
        this.queryKeyMaxNum_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQueryKeyTimeInterval(int i) {
        this.queryKeyTimeInterval_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSampleCount(int i) {
        this.sampleCount_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = cx2.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new CapOperation$DrxConfigMsg();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b\u0004\t\u0004", new Object[]{"isNeedM4MUpgrade_", "isNeedInverse_", "inverseKeyType_", "probeCount_", "sampleCount_", "numDistance_", "failRetryNum_", "queryKeyTimeInterval_", "queryKeyMaxNum_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CapOperation$DrxConfigMsg> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (CapOperation$DrxConfigMsg.class) {
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

    @Override // com.oppo.wear.wallet.proto.CapOperation$DrxConfigMsgOrBuilder
    public int getFailRetryNum() {
        return this.failRetryNum_;
    }

    @Override // com.oppo.wear.wallet.proto.CapOperation$DrxConfigMsgOrBuilder
    public int getInverseKeyType() {
        return this.inverseKeyType_;
    }

    @Override // com.oppo.wear.wallet.proto.CapOperation$DrxConfigMsgOrBuilder
    public boolean getIsNeedInverse() {
        return this.isNeedInverse_;
    }

    @Override // com.oppo.wear.wallet.proto.CapOperation$DrxConfigMsgOrBuilder
    public boolean getIsNeedM4MUpgrade() {
        return this.isNeedM4MUpgrade_;
    }

    @Override // com.oppo.wear.wallet.proto.CapOperation$DrxConfigMsgOrBuilder
    public int getNumDistance() {
        return this.numDistance_;
    }

    @Override // com.oppo.wear.wallet.proto.CapOperation$DrxConfigMsgOrBuilder
    public int getProbeCount() {
        return this.probeCount_;
    }

    @Override // com.oppo.wear.wallet.proto.CapOperation$DrxConfigMsgOrBuilder
    public int getQueryKeyMaxNum() {
        return this.queryKeyMaxNum_;
    }

    @Override // com.oppo.wear.wallet.proto.CapOperation$DrxConfigMsgOrBuilder
    public int getQueryKeyTimeInterval() {
        return this.queryKeyTimeInterval_;
    }

    @Override // com.oppo.wear.wallet.proto.CapOperation$DrxConfigMsgOrBuilder
    public int getSampleCount() {
        return this.sampleCount_;
    }

    public static Builder newBuilder(CapOperation$DrxConfigMsg capOperation$DrxConfigMsg) {
        return DEFAULT_INSTANCE.createBuilder(capOperation$DrxConfigMsg);
    }

    public static CapOperation$DrxConfigMsg parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CapOperation$DrxConfigMsg) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CapOperation$DrxConfigMsg parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CapOperation$DrxConfigMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CapOperation$DrxConfigMsg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CapOperation$DrxConfigMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CapOperation$DrxConfigMsg parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CapOperation$DrxConfigMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CapOperation$DrxConfigMsg parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CapOperation$DrxConfigMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CapOperation$DrxConfigMsg parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CapOperation$DrxConfigMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CapOperation$DrxConfigMsg parseFrom(InputStream inputStream) throws IOException {
        return (CapOperation$DrxConfigMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CapOperation$DrxConfigMsg parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CapOperation$DrxConfigMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CapOperation$DrxConfigMsg parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CapOperation$DrxConfigMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CapOperation$DrxConfigMsg parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CapOperation$DrxConfigMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
