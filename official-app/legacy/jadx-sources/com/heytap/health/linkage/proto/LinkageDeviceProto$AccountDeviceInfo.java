package com.heytap.health.linkage.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.kya;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes16.dex */
public final class LinkageDeviceProto$AccountDeviceInfo extends GeneratedMessageLite<LinkageDeviceProto$AccountDeviceInfo, Builder> implements LinkageDeviceProto$AccountDeviceInfoOrBuilder {
    public static final int ACCOUNTKEY_FIELD_NUMBER = 3;
    public static final int BOUNDSTATUS_FIELD_NUMBER = 1;
    public static final int COLORID_FIELD_NUMBER = 9;
    private static final LinkageDeviceProto$AccountDeviceInfo DEFAULT_INSTANCE;
    public static final int DEVICEID_FIELD_NUMBER = 5;
    public static final int DEVICENAME_FIELD_NUMBER = 6;
    public static final int DEVICETYPE_FIELD_NUMBER = 4;
    public static final int FEATURE_FIELD_NUMBER = 19;
    public static final int LINKAGEVERSION_FIELD_NUMBER = 18;
    public static final int MAC_FIELD_NUMBER = 7;
    private static volatile Parser<LinkageDeviceProto$AccountDeviceInfo> PARSER = null;
    public static final int PRODUCTID_FIELD_NUMBER = 8;
    public static final int SERVERDEVICEID_FIELD_NUMBER = 17;
    public static final int SSOID_FIELD_NUMBER = 2;
    public static final int TIMESTAMP_FIELD_NUMBER = 16;
    private int boundStatus_;
    private int deviceType_;
    private int feature_;
    private int linkageVersion_;
    private long timestamp_;
    private String ssoid_ = "";
    private String accountKey_ = "";
    private String deviceId_ = "";
    private String deviceName_ = "";
    private String mac_ = "";
    private String productId_ = "";
    private String colorId_ = "";
    private String serverDeviceId_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<LinkageDeviceProto$AccountDeviceInfo, Builder> implements LinkageDeviceProto$AccountDeviceInfoOrBuilder {
        public Builder clearAccountKey() {
            copyOnWrite();
            ((LinkageDeviceProto$AccountDeviceInfo) this.instance).clearAccountKey();
            return this;
        }

        public Builder clearBoundStatus() {
            copyOnWrite();
            ((LinkageDeviceProto$AccountDeviceInfo) this.instance).clearBoundStatus();
            return this;
        }

        public Builder clearColorId() {
            copyOnWrite();
            ((LinkageDeviceProto$AccountDeviceInfo) this.instance).clearColorId();
            return this;
        }

        public Builder clearDeviceId() {
            copyOnWrite();
            ((LinkageDeviceProto$AccountDeviceInfo) this.instance).clearDeviceId();
            return this;
        }

        public Builder clearDeviceName() {
            copyOnWrite();
            ((LinkageDeviceProto$AccountDeviceInfo) this.instance).clearDeviceName();
            return this;
        }

        public Builder clearDeviceType() {
            copyOnWrite();
            ((LinkageDeviceProto$AccountDeviceInfo) this.instance).clearDeviceType();
            return this;
        }

        public Builder clearFeature() {
            copyOnWrite();
            ((LinkageDeviceProto$AccountDeviceInfo) this.instance).clearFeature();
            return this;
        }

        public Builder clearLinkageVersion() {
            copyOnWrite();
            ((LinkageDeviceProto$AccountDeviceInfo) this.instance).clearLinkageVersion();
            return this;
        }

        public Builder clearMac() {
            copyOnWrite();
            ((LinkageDeviceProto$AccountDeviceInfo) this.instance).clearMac();
            return this;
        }

        public Builder clearProductId() {
            copyOnWrite();
            ((LinkageDeviceProto$AccountDeviceInfo) this.instance).clearProductId();
            return this;
        }

        public Builder clearServerDeviceId() {
            copyOnWrite();
            ((LinkageDeviceProto$AccountDeviceInfo) this.instance).clearServerDeviceId();
            return this;
        }

        public Builder clearSsoid() {
            copyOnWrite();
            ((LinkageDeviceProto$AccountDeviceInfo) this.instance).clearSsoid();
            return this;
        }

        public Builder clearTimestamp() {
            copyOnWrite();
            ((LinkageDeviceProto$AccountDeviceInfo) this.instance).clearTimestamp();
            return this;
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
        public String getAccountKey() {
            return ((LinkageDeviceProto$AccountDeviceInfo) this.instance).getAccountKey();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
        public ByteString getAccountKeyBytes() {
            return ((LinkageDeviceProto$AccountDeviceInfo) this.instance).getAccountKeyBytes();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
        public LinkageDeviceProto$BondStatus getBoundStatus() {
            return ((LinkageDeviceProto$AccountDeviceInfo) this.instance).getBoundStatus();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
        public int getBoundStatusValue() {
            return ((LinkageDeviceProto$AccountDeviceInfo) this.instance).getBoundStatusValue();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
        public String getColorId() {
            return ((LinkageDeviceProto$AccountDeviceInfo) this.instance).getColorId();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
        public ByteString getColorIdBytes() {
            return ((LinkageDeviceProto$AccountDeviceInfo) this.instance).getColorIdBytes();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
        public String getDeviceId() {
            return ((LinkageDeviceProto$AccountDeviceInfo) this.instance).getDeviceId();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
        public ByteString getDeviceIdBytes() {
            return ((LinkageDeviceProto$AccountDeviceInfo) this.instance).getDeviceIdBytes();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
        public String getDeviceName() {
            return ((LinkageDeviceProto$AccountDeviceInfo) this.instance).getDeviceName();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
        public ByteString getDeviceNameBytes() {
            return ((LinkageDeviceProto$AccountDeviceInfo) this.instance).getDeviceNameBytes();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
        public LinkageDeviceProto$DeviceType getDeviceType() {
            return ((LinkageDeviceProto$AccountDeviceInfo) this.instance).getDeviceType();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
        public int getDeviceTypeValue() {
            return ((LinkageDeviceProto$AccountDeviceInfo) this.instance).getDeviceTypeValue();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
        public int getFeature() {
            return ((LinkageDeviceProto$AccountDeviceInfo) this.instance).getFeature();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
        public int getLinkageVersion() {
            return ((LinkageDeviceProto$AccountDeviceInfo) this.instance).getLinkageVersion();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
        public String getMac() {
            return ((LinkageDeviceProto$AccountDeviceInfo) this.instance).getMac();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
        public ByteString getMacBytes() {
            return ((LinkageDeviceProto$AccountDeviceInfo) this.instance).getMacBytes();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
        public String getProductId() {
            return ((LinkageDeviceProto$AccountDeviceInfo) this.instance).getProductId();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
        public ByteString getProductIdBytes() {
            return ((LinkageDeviceProto$AccountDeviceInfo) this.instance).getProductIdBytes();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
        public String getServerDeviceId() {
            return ((LinkageDeviceProto$AccountDeviceInfo) this.instance).getServerDeviceId();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
        public ByteString getServerDeviceIdBytes() {
            return ((LinkageDeviceProto$AccountDeviceInfo) this.instance).getServerDeviceIdBytes();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
        public String getSsoid() {
            return ((LinkageDeviceProto$AccountDeviceInfo) this.instance).getSsoid();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
        public ByteString getSsoidBytes() {
            return ((LinkageDeviceProto$AccountDeviceInfo) this.instance).getSsoidBytes();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
        public long getTimestamp() {
            return ((LinkageDeviceProto$AccountDeviceInfo) this.instance).getTimestamp();
        }

        public Builder setAccountKey(String str) {
            copyOnWrite();
            ((LinkageDeviceProto$AccountDeviceInfo) this.instance).setAccountKey(str);
            return this;
        }

        public Builder setAccountKeyBytes(ByteString byteString) {
            copyOnWrite();
            ((LinkageDeviceProto$AccountDeviceInfo) this.instance).setAccountKeyBytes(byteString);
            return this;
        }

        public Builder setBoundStatus(LinkageDeviceProto$BondStatus linkageDeviceProto$BondStatus) {
            copyOnWrite();
            ((LinkageDeviceProto$AccountDeviceInfo) this.instance).setBoundStatus(linkageDeviceProto$BondStatus);
            return this;
        }

        public Builder setBoundStatusValue(int i) {
            copyOnWrite();
            ((LinkageDeviceProto$AccountDeviceInfo) this.instance).setBoundStatusValue(i);
            return this;
        }

        public Builder setColorId(String str) {
            copyOnWrite();
            ((LinkageDeviceProto$AccountDeviceInfo) this.instance).setColorId(str);
            return this;
        }

        public Builder setColorIdBytes(ByteString byteString) {
            copyOnWrite();
            ((LinkageDeviceProto$AccountDeviceInfo) this.instance).setColorIdBytes(byteString);
            return this;
        }

        public Builder setDeviceId(String str) {
            copyOnWrite();
            ((LinkageDeviceProto$AccountDeviceInfo) this.instance).setDeviceId(str);
            return this;
        }

        public Builder setDeviceIdBytes(ByteString byteString) {
            copyOnWrite();
            ((LinkageDeviceProto$AccountDeviceInfo) this.instance).setDeviceIdBytes(byteString);
            return this;
        }

        public Builder setDeviceName(String str) {
            copyOnWrite();
            ((LinkageDeviceProto$AccountDeviceInfo) this.instance).setDeviceName(str);
            return this;
        }

        public Builder setDeviceNameBytes(ByteString byteString) {
            copyOnWrite();
            ((LinkageDeviceProto$AccountDeviceInfo) this.instance).setDeviceNameBytes(byteString);
            return this;
        }

        public Builder setDeviceType(LinkageDeviceProto$DeviceType linkageDeviceProto$DeviceType) {
            copyOnWrite();
            ((LinkageDeviceProto$AccountDeviceInfo) this.instance).setDeviceType(linkageDeviceProto$DeviceType);
            return this;
        }

        public Builder setDeviceTypeValue(int i) {
            copyOnWrite();
            ((LinkageDeviceProto$AccountDeviceInfo) this.instance).setDeviceTypeValue(i);
            return this;
        }

        public Builder setFeature(int i) {
            copyOnWrite();
            ((LinkageDeviceProto$AccountDeviceInfo) this.instance).setFeature(i);
            return this;
        }

        public Builder setLinkageVersion(int i) {
            copyOnWrite();
            ((LinkageDeviceProto$AccountDeviceInfo) this.instance).setLinkageVersion(i);
            return this;
        }

        public Builder setMac(String str) {
            copyOnWrite();
            ((LinkageDeviceProto$AccountDeviceInfo) this.instance).setMac(str);
            return this;
        }

        public Builder setMacBytes(ByteString byteString) {
            copyOnWrite();
            ((LinkageDeviceProto$AccountDeviceInfo) this.instance).setMacBytes(byteString);
            return this;
        }

        public Builder setProductId(String str) {
            copyOnWrite();
            ((LinkageDeviceProto$AccountDeviceInfo) this.instance).setProductId(str);
            return this;
        }

        public Builder setProductIdBytes(ByteString byteString) {
            copyOnWrite();
            ((LinkageDeviceProto$AccountDeviceInfo) this.instance).setProductIdBytes(byteString);
            return this;
        }

        public Builder setServerDeviceId(String str) {
            copyOnWrite();
            ((LinkageDeviceProto$AccountDeviceInfo) this.instance).setServerDeviceId(str);
            return this;
        }

        public Builder setServerDeviceIdBytes(ByteString byteString) {
            copyOnWrite();
            ((LinkageDeviceProto$AccountDeviceInfo) this.instance).setServerDeviceIdBytes(byteString);
            return this;
        }

        public Builder setSsoid(String str) {
            copyOnWrite();
            ((LinkageDeviceProto$AccountDeviceInfo) this.instance).setSsoid(str);
            return this;
        }

        public Builder setSsoidBytes(ByteString byteString) {
            copyOnWrite();
            ((LinkageDeviceProto$AccountDeviceInfo) this.instance).setSsoidBytes(byteString);
            return this;
        }

        public Builder setTimestamp(long j2) {
            copyOnWrite();
            ((LinkageDeviceProto$AccountDeviceInfo) this.instance).setTimestamp(j2);
            return this;
        }

        private Builder() {
            super(LinkageDeviceProto$AccountDeviceInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        LinkageDeviceProto$AccountDeviceInfo linkageDeviceProto$AccountDeviceInfo = new LinkageDeviceProto$AccountDeviceInfo();
        DEFAULT_INSTANCE = linkageDeviceProto$AccountDeviceInfo;
        GeneratedMessageLite.registerDefaultInstance(LinkageDeviceProto$AccountDeviceInfo.class, linkageDeviceProto$AccountDeviceInfo);
    }

    private LinkageDeviceProto$AccountDeviceInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAccountKey() {
        this.accountKey_ = getDefaultInstance().getAccountKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBoundStatus() {
        this.boundStatus_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearColorId() {
        this.colorId_ = getDefaultInstance().getColorId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceId() {
        this.deviceId_ = getDefaultInstance().getDeviceId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceName() {
        this.deviceName_ = getDefaultInstance().getDeviceName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceType() {
        this.deviceType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeature() {
        this.feature_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLinkageVersion() {
        this.linkageVersion_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMac() {
        this.mac_ = getDefaultInstance().getMac();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProductId() {
        this.productId_ = getDefaultInstance().getProductId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerDeviceId() {
        this.serverDeviceId_ = getDefaultInstance().getServerDeviceId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSsoid() {
        this.ssoid_ = getDefaultInstance().getSsoid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0L;
    }

    public static LinkageDeviceProto$AccountDeviceInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LinkageDeviceProto$AccountDeviceInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LinkageDeviceProto$AccountDeviceInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LinkageDeviceProto$AccountDeviceInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LinkageDeviceProto$AccountDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LinkageDeviceProto$AccountDeviceInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccountKey(String str) {
        str.getClass();
        this.accountKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccountKeyBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.accountKey_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBoundStatus(LinkageDeviceProto$BondStatus linkageDeviceProto$BondStatus) {
        this.boundStatus_ = linkageDeviceProto$BondStatus.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBoundStatusValue(int i) {
        this.boundStatus_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColorId(String str) {
        str.getClass();
        this.colorId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColorIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.colorId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceId(String str) {
        str.getClass();
        this.deviceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.deviceId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceName(String str) {
        str.getClass();
        this.deviceName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.deviceName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceType(LinkageDeviceProto$DeviceType linkageDeviceProto$DeviceType) {
        this.deviceType_ = linkageDeviceProto$DeviceType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceTypeValue(int i) {
        this.deviceType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeature(int i) {
        this.feature_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkageVersion(int i) {
        this.linkageVersion_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMac(String str) {
        str.getClass();
        this.mac_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMacBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.mac_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProductId(String str) {
        str.getClass();
        this.productId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProductIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.productId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerDeviceId(String str) {
        str.getClass();
        this.serverDeviceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerDeviceIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.serverDeviceId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSsoid(String str) {
        str.getClass();
        this.ssoid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSsoidBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.ssoid_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(long j2) {
        this.timestamp_ = j2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (kya.a[methodToInvoke.ordinal()]) {
            case 1:
                return new LinkageDeviceProto$AccountDeviceInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0000\u0001\u0013\r\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\u0010\u0002\u0011Ȉ\u0012\u0004\u0013\u0004", new Object[]{"boundStatus_", "ssoid_", "accountKey_", "deviceType_", "deviceId_", "deviceName_", "mac_", "productId_", "colorId_", "timestamp_", "serverDeviceId_", "linkageVersion_", "feature_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LinkageDeviceProto$AccountDeviceInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (LinkageDeviceProto$AccountDeviceInfo.class) {
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

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
    public String getAccountKey() {
        return this.accountKey_;
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
    public ByteString getAccountKeyBytes() {
        return ByteString.copyFromUtf8(this.accountKey_);
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
    public LinkageDeviceProto$BondStatus getBoundStatus() {
        LinkageDeviceProto$BondStatus linkageDeviceProto$BondStatusForNumber = LinkageDeviceProto$BondStatus.forNumber(this.boundStatus_);
        return linkageDeviceProto$BondStatusForNumber == null ? LinkageDeviceProto$BondStatus.UNRECOGNIZED : linkageDeviceProto$BondStatusForNumber;
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
    public int getBoundStatusValue() {
        return this.boundStatus_;
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
    public String getColorId() {
        return this.colorId_;
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
    public ByteString getColorIdBytes() {
        return ByteString.copyFromUtf8(this.colorId_);
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
    public String getDeviceId() {
        return this.deviceId_;
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
    public ByteString getDeviceIdBytes() {
        return ByteString.copyFromUtf8(this.deviceId_);
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
    public String getDeviceName() {
        return this.deviceName_;
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
    public ByteString getDeviceNameBytes() {
        return ByteString.copyFromUtf8(this.deviceName_);
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
    public LinkageDeviceProto$DeviceType getDeviceType() {
        LinkageDeviceProto$DeviceType linkageDeviceProto$DeviceTypeForNumber = LinkageDeviceProto$DeviceType.forNumber(this.deviceType_);
        return linkageDeviceProto$DeviceTypeForNumber == null ? LinkageDeviceProto$DeviceType.UNRECOGNIZED : linkageDeviceProto$DeviceTypeForNumber;
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
    public int getDeviceTypeValue() {
        return this.deviceType_;
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
    public int getFeature() {
        return this.feature_;
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
    public int getLinkageVersion() {
        return this.linkageVersion_;
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
    public String getMac() {
        return this.mac_;
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
    public ByteString getMacBytes() {
        return ByteString.copyFromUtf8(this.mac_);
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
    public String getProductId() {
        return this.productId_;
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
    public ByteString getProductIdBytes() {
        return ByteString.copyFromUtf8(this.productId_);
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
    public String getServerDeviceId() {
        return this.serverDeviceId_;
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
    public ByteString getServerDeviceIdBytes() {
        return ByteString.copyFromUtf8(this.serverDeviceId_);
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
    public String getSsoid() {
        return this.ssoid_;
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
    public ByteString getSsoidBytes() {
        return ByteString.copyFromUtf8(this.ssoid_);
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$AccountDeviceInfoOrBuilder
    public long getTimestamp() {
        return this.timestamp_;
    }

    public static Builder newBuilder(LinkageDeviceProto$AccountDeviceInfo linkageDeviceProto$AccountDeviceInfo) {
        return DEFAULT_INSTANCE.createBuilder(linkageDeviceProto$AccountDeviceInfo);
    }

    public static LinkageDeviceProto$AccountDeviceInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LinkageDeviceProto$AccountDeviceInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LinkageDeviceProto$AccountDeviceInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LinkageDeviceProto$AccountDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LinkageDeviceProto$AccountDeviceInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LinkageDeviceProto$AccountDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LinkageDeviceProto$AccountDeviceInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LinkageDeviceProto$AccountDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LinkageDeviceProto$AccountDeviceInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LinkageDeviceProto$AccountDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LinkageDeviceProto$AccountDeviceInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LinkageDeviceProto$AccountDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LinkageDeviceProto$AccountDeviceInfo parseFrom(InputStream inputStream) throws IOException {
        return (LinkageDeviceProto$AccountDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LinkageDeviceProto$AccountDeviceInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LinkageDeviceProto$AccountDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LinkageDeviceProto$AccountDeviceInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LinkageDeviceProto$AccountDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LinkageDeviceProto$AccountDeviceInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LinkageDeviceProto$AccountDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
