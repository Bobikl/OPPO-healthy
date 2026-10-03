package com.heytap.sportwatch.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.r98;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class GpsData$GpsConfig extends GeneratedMessageLite<GpsData$GpsConfig, Builder> implements GpsData$GpsConfigOrBuilder {
    public static final int APP_VER_FIELD_NUMBER = 12;
    public static final int CRITERIA_FIELD_NUMBER = 1;
    private static final GpsData$GpsConfig DEFAULT_INSTANCE;
    public static final int DISTANCE_THRESHOLD_FIELD_NUMBER = 7;
    public static final int GROUP_SEND_COUNT_FIELD_NUMBER = 5;
    public static final int GROUP_SEND_INTERVAL_FIELD_NUMBER = 6;
    public static final int INFO_BITMAP_FIELD_NUMBER = 3;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 13;
    private static volatile Parser<GpsData$GpsConfig> PARSER = null;
    public static final int PROC_ID_FIELD_NUMBER = 11;
    public static final int PROVIDER_FIELD_NUMBER = 2;
    public static final int SAMPLE_INTERVAL_FIELD_NUMBER = 8;
    public static final int SEND_TYPE_FIELD_NUMBER = 4;
    public static final int SESSION_ID_FIELD_NUMBER = 9;
    public static final int SUPPORT_OPTIMIZE_FIELD_NUMBER = 10;
    private int appVer_;
    private int criteria_;
    private int distanceThreshold_;
    private int groupSendCount_;
    private int groupSendInterval_;
    private int infoBitmap_;
    private int procId_;
    private int provider_;
    private int sampleInterval_;
    private int sendType_;
    private int supportOptimize_;
    private String sessionId_ = "";
    private String packageName_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<GpsData$GpsConfig, Builder> implements GpsData$GpsConfigOrBuilder {
        public Builder clearAppVer() {
            copyOnWrite();
            ((GpsData$GpsConfig) this.instance).clearAppVer();
            return this;
        }

        public Builder clearCriteria() {
            copyOnWrite();
            ((GpsData$GpsConfig) this.instance).clearCriteria();
            return this;
        }

        public Builder clearDistanceThreshold() {
            copyOnWrite();
            ((GpsData$GpsConfig) this.instance).clearDistanceThreshold();
            return this;
        }

        public Builder clearGroupSendCount() {
            copyOnWrite();
            ((GpsData$GpsConfig) this.instance).clearGroupSendCount();
            return this;
        }

        public Builder clearGroupSendInterval() {
            copyOnWrite();
            ((GpsData$GpsConfig) this.instance).clearGroupSendInterval();
            return this;
        }

        public Builder clearInfoBitmap() {
            copyOnWrite();
            ((GpsData$GpsConfig) this.instance).clearInfoBitmap();
            return this;
        }

        public Builder clearPackageName() {
            copyOnWrite();
            ((GpsData$GpsConfig) this.instance).clearPackageName();
            return this;
        }

        public Builder clearProcId() {
            copyOnWrite();
            ((GpsData$GpsConfig) this.instance).clearProcId();
            return this;
        }

        public Builder clearProvider() {
            copyOnWrite();
            ((GpsData$GpsConfig) this.instance).clearProvider();
            return this;
        }

        public Builder clearSampleInterval() {
            copyOnWrite();
            ((GpsData$GpsConfig) this.instance).clearSampleInterval();
            return this;
        }

        public Builder clearSendType() {
            copyOnWrite();
            ((GpsData$GpsConfig) this.instance).clearSendType();
            return this;
        }

        public Builder clearSessionId() {
            copyOnWrite();
            ((GpsData$GpsConfig) this.instance).clearSessionId();
            return this;
        }

        public Builder clearSupportOptimize() {
            copyOnWrite();
            ((GpsData$GpsConfig) this.instance).clearSupportOptimize();
            return this;
        }

        @Override // com.heytap.sportwatch.proto.GpsData$GpsConfigOrBuilder
        public int getAppVer() {
            return ((GpsData$GpsConfig) this.instance).getAppVer();
        }

        @Override // com.heytap.sportwatch.proto.GpsData$GpsConfigOrBuilder
        public int getCriteria() {
            return ((GpsData$GpsConfig) this.instance).getCriteria();
        }

        @Override // com.heytap.sportwatch.proto.GpsData$GpsConfigOrBuilder
        public int getDistanceThreshold() {
            return ((GpsData$GpsConfig) this.instance).getDistanceThreshold();
        }

        @Override // com.heytap.sportwatch.proto.GpsData$GpsConfigOrBuilder
        public int getGroupSendCount() {
            return ((GpsData$GpsConfig) this.instance).getGroupSendCount();
        }

        @Override // com.heytap.sportwatch.proto.GpsData$GpsConfigOrBuilder
        public int getGroupSendInterval() {
            return ((GpsData$GpsConfig) this.instance).getGroupSendInterval();
        }

        @Override // com.heytap.sportwatch.proto.GpsData$GpsConfigOrBuilder
        public int getInfoBitmap() {
            return ((GpsData$GpsConfig) this.instance).getInfoBitmap();
        }

        @Override // com.heytap.sportwatch.proto.GpsData$GpsConfigOrBuilder
        public String getPackageName() {
            return ((GpsData$GpsConfig) this.instance).getPackageName();
        }

        @Override // com.heytap.sportwatch.proto.GpsData$GpsConfigOrBuilder
        public ByteString getPackageNameBytes() {
            return ((GpsData$GpsConfig) this.instance).getPackageNameBytes();
        }

        @Override // com.heytap.sportwatch.proto.GpsData$GpsConfigOrBuilder
        public int getProcId() {
            return ((GpsData$GpsConfig) this.instance).getProcId();
        }

        @Override // com.heytap.sportwatch.proto.GpsData$GpsConfigOrBuilder
        public int getProvider() {
            return ((GpsData$GpsConfig) this.instance).getProvider();
        }

        @Override // com.heytap.sportwatch.proto.GpsData$GpsConfigOrBuilder
        public int getSampleInterval() {
            return ((GpsData$GpsConfig) this.instance).getSampleInterval();
        }

        @Override // com.heytap.sportwatch.proto.GpsData$GpsConfigOrBuilder
        public int getSendType() {
            return ((GpsData$GpsConfig) this.instance).getSendType();
        }

        @Override // com.heytap.sportwatch.proto.GpsData$GpsConfigOrBuilder
        public String getSessionId() {
            return ((GpsData$GpsConfig) this.instance).getSessionId();
        }

        @Override // com.heytap.sportwatch.proto.GpsData$GpsConfigOrBuilder
        public ByteString getSessionIdBytes() {
            return ((GpsData$GpsConfig) this.instance).getSessionIdBytes();
        }

        @Override // com.heytap.sportwatch.proto.GpsData$GpsConfigOrBuilder
        public int getSupportOptimize() {
            return ((GpsData$GpsConfig) this.instance).getSupportOptimize();
        }

        public Builder setAppVer(int i) {
            copyOnWrite();
            ((GpsData$GpsConfig) this.instance).setAppVer(i);
            return this;
        }

        public Builder setCriteria(int i) {
            copyOnWrite();
            ((GpsData$GpsConfig) this.instance).setCriteria(i);
            return this;
        }

        public Builder setDistanceThreshold(int i) {
            copyOnWrite();
            ((GpsData$GpsConfig) this.instance).setDistanceThreshold(i);
            return this;
        }

        public Builder setGroupSendCount(int i) {
            copyOnWrite();
            ((GpsData$GpsConfig) this.instance).setGroupSendCount(i);
            return this;
        }

        public Builder setGroupSendInterval(int i) {
            copyOnWrite();
            ((GpsData$GpsConfig) this.instance).setGroupSendInterval(i);
            return this;
        }

        public Builder setInfoBitmap(int i) {
            copyOnWrite();
            ((GpsData$GpsConfig) this.instance).setInfoBitmap(i);
            return this;
        }

        public Builder setPackageName(String str) {
            copyOnWrite();
            ((GpsData$GpsConfig) this.instance).setPackageName(str);
            return this;
        }

        public Builder setPackageNameBytes(ByteString byteString) {
            copyOnWrite();
            ((GpsData$GpsConfig) this.instance).setPackageNameBytes(byteString);
            return this;
        }

        public Builder setProcId(int i) {
            copyOnWrite();
            ((GpsData$GpsConfig) this.instance).setProcId(i);
            return this;
        }

        public Builder setProvider(int i) {
            copyOnWrite();
            ((GpsData$GpsConfig) this.instance).setProvider(i);
            return this;
        }

        public Builder setSampleInterval(int i) {
            copyOnWrite();
            ((GpsData$GpsConfig) this.instance).setSampleInterval(i);
            return this;
        }

        public Builder setSendType(int i) {
            copyOnWrite();
            ((GpsData$GpsConfig) this.instance).setSendType(i);
            return this;
        }

        public Builder setSessionId(String str) {
            copyOnWrite();
            ((GpsData$GpsConfig) this.instance).setSessionId(str);
            return this;
        }

        public Builder setSessionIdBytes(ByteString byteString) {
            copyOnWrite();
            ((GpsData$GpsConfig) this.instance).setSessionIdBytes(byteString);
            return this;
        }

        public Builder setSupportOptimize(int i) {
            copyOnWrite();
            ((GpsData$GpsConfig) this.instance).setSupportOptimize(i);
            return this;
        }

        private Builder() {
            super(GpsData$GpsConfig.DEFAULT_INSTANCE);
        }
    }

    static {
        GpsData$GpsConfig gpsData$GpsConfig = new GpsData$GpsConfig();
        DEFAULT_INSTANCE = gpsData$GpsConfig;
        GeneratedMessageLite.registerDefaultInstance(GpsData$GpsConfig.class, gpsData$GpsConfig);
    }

    private GpsData$GpsConfig() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppVer() {
        this.appVer_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCriteria() {
        this.criteria_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistanceThreshold() {
        this.distanceThreshold_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGroupSendCount() {
        this.groupSendCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGroupSendInterval() {
        this.groupSendInterval_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInfoBitmap() {
        this.infoBitmap_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPackageName() {
        this.packageName_ = getDefaultInstance().getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProcId() {
        this.procId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProvider() {
        this.provider_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSampleInterval() {
        this.sampleInterval_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSendType() {
        this.sendType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSupportOptimize() {
        this.supportOptimize_ = 0;
    }

    public static GpsData$GpsConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static GpsData$GpsConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GpsData$GpsConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GpsData$GpsConfig parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (GpsData$GpsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<GpsData$GpsConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppVer(int i) {
        this.appVer_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCriteria(int i) {
        this.criteria_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistanceThreshold(int i) {
        this.distanceThreshold_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGroupSendCount(int i) {
        this.groupSendCount_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGroupSendInterval(int i) {
        this.groupSendInterval_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInfoBitmap(int i) {
        this.infoBitmap_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackageName(String str) {
        str.getClass();
        this.packageName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackageNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.packageName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProcId(int i) {
        this.procId_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProvider(int i) {
        this.provider_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSampleInterval(int i) {
        this.sampleInterval_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSendType(int i) {
        this.sendType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(String str) {
        str.getClass();
        this.sessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.sessionId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSupportOptimize(int i) {
        this.supportOptimize_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (r98.a[methodToInvoke.ordinal()]) {
            case 1:
                return new GpsData$GpsConfig();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0000\u0001\r\r\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u000b\u0005\u000b\u0006\u000b\u0007\u000b\b\u000b\tȈ\n\u000b\u000b\u000b\f\u000b\rȈ", new Object[]{"criteria_", "provider_", "infoBitmap_", "sendType_", "groupSendCount_", "groupSendInterval_", "distanceThreshold_", "sampleInterval_", "sessionId_", "supportOptimize_", "procId_", "appVer_", "packageName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<GpsData$GpsConfig> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (GpsData$GpsConfig.class) {
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

    @Override // com.heytap.sportwatch.proto.GpsData$GpsConfigOrBuilder
    public int getAppVer() {
        return this.appVer_;
    }

    @Override // com.heytap.sportwatch.proto.GpsData$GpsConfigOrBuilder
    public int getCriteria() {
        return this.criteria_;
    }

    @Override // com.heytap.sportwatch.proto.GpsData$GpsConfigOrBuilder
    public int getDistanceThreshold() {
        return this.distanceThreshold_;
    }

    @Override // com.heytap.sportwatch.proto.GpsData$GpsConfigOrBuilder
    public int getGroupSendCount() {
        return this.groupSendCount_;
    }

    @Override // com.heytap.sportwatch.proto.GpsData$GpsConfigOrBuilder
    public int getGroupSendInterval() {
        return this.groupSendInterval_;
    }

    @Override // com.heytap.sportwatch.proto.GpsData$GpsConfigOrBuilder
    public int getInfoBitmap() {
        return this.infoBitmap_;
    }

    @Override // com.heytap.sportwatch.proto.GpsData$GpsConfigOrBuilder
    public String getPackageName() {
        return this.packageName_;
    }

    @Override // com.heytap.sportwatch.proto.GpsData$GpsConfigOrBuilder
    public ByteString getPackageNameBytes() {
        return ByteString.copyFromUtf8(this.packageName_);
    }

    @Override // com.heytap.sportwatch.proto.GpsData$GpsConfigOrBuilder
    public int getProcId() {
        return this.procId_;
    }

    @Override // com.heytap.sportwatch.proto.GpsData$GpsConfigOrBuilder
    public int getProvider() {
        return this.provider_;
    }

    @Override // com.heytap.sportwatch.proto.GpsData$GpsConfigOrBuilder
    public int getSampleInterval() {
        return this.sampleInterval_;
    }

    @Override // com.heytap.sportwatch.proto.GpsData$GpsConfigOrBuilder
    public int getSendType() {
        return this.sendType_;
    }

    @Override // com.heytap.sportwatch.proto.GpsData$GpsConfigOrBuilder
    public String getSessionId() {
        return this.sessionId_;
    }

    @Override // com.heytap.sportwatch.proto.GpsData$GpsConfigOrBuilder
    public ByteString getSessionIdBytes() {
        return ByteString.copyFromUtf8(this.sessionId_);
    }

    @Override // com.heytap.sportwatch.proto.GpsData$GpsConfigOrBuilder
    public int getSupportOptimize() {
        return this.supportOptimize_;
    }

    public static Builder newBuilder(GpsData$GpsConfig gpsData$GpsConfig) {
        return DEFAULT_INSTANCE.createBuilder(gpsData$GpsConfig);
    }

    public static GpsData$GpsConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GpsData$GpsConfig) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GpsData$GpsConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GpsData$GpsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static GpsData$GpsConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (GpsData$GpsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static GpsData$GpsConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GpsData$GpsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static GpsData$GpsConfig parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (GpsData$GpsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GpsData$GpsConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GpsData$GpsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static GpsData$GpsConfig parseFrom(InputStream inputStream) throws IOException {
        return (GpsData$GpsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GpsData$GpsConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GpsData$GpsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GpsData$GpsConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GpsData$GpsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static GpsData$GpsConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GpsData$GpsConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
