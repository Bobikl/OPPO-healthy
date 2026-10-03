package com.heytap.health.band.data;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.xse;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes15.dex */
public final class PressCmd$DeviceStatus extends GeneratedMessageLite<PressCmd$DeviceStatus, Builder> implements PressCmd$DeviceStatusOrBuilder {
    public static final int BATTERY_FIELD_NUMBER = 8;
    private static final PressCmd$DeviceStatus DEFAULT_INSTANCE;
    public static final int FREESPACE_FIELD_NUMBER = 6;
    private static volatile Parser<PressCmd$DeviceStatus> PARSER = null;
    public static final int PIDHEALTHTRANSPORT_FIELD_NUMBER = 3;
    public static final int PIDLINKSERVICE_FIELD_NUMBER = 2;
    public static final int PIDTESTAPP_FIELD_NUMBER = 1;
    public static final int PIDTESTTRANSPORT_FIELD_NUMBER = 4;
    public static final int REASON_FIELD_NUMBER = 9;
    public static final int TOTALSPACE_FIELD_NUMBER = 7;
    public static final int UPTIME_FIELD_NUMBER = 5;
    private long battery_;
    private long freeSpace_;
    private int pidHealthTransPort_;
    private int pidLinkService_;
    private int pidTestApp_;
    private int pidTestTransPort_;
    private String reason_ = "";
    private long totalSpace_;
    private long upTime_;

    public static final class Builder extends GeneratedMessageLite.Builder<PressCmd$DeviceStatus, Builder> implements PressCmd$DeviceStatusOrBuilder {
        public Builder clearBattery() {
            copyOnWrite();
            ((PressCmd$DeviceStatus) this.instance).clearBattery();
            return this;
        }

        public Builder clearFreeSpace() {
            copyOnWrite();
            ((PressCmd$DeviceStatus) this.instance).clearFreeSpace();
            return this;
        }

        public Builder clearPidHealthTransPort() {
            copyOnWrite();
            ((PressCmd$DeviceStatus) this.instance).clearPidHealthTransPort();
            return this;
        }

        public Builder clearPidLinkService() {
            copyOnWrite();
            ((PressCmd$DeviceStatus) this.instance).clearPidLinkService();
            return this;
        }

        public Builder clearPidTestApp() {
            copyOnWrite();
            ((PressCmd$DeviceStatus) this.instance).clearPidTestApp();
            return this;
        }

        public Builder clearPidTestTransPort() {
            copyOnWrite();
            ((PressCmd$DeviceStatus) this.instance).clearPidTestTransPort();
            return this;
        }

        public Builder clearReason() {
            copyOnWrite();
            ((PressCmd$DeviceStatus) this.instance).clearReason();
            return this;
        }

        public Builder clearTotalSpace() {
            copyOnWrite();
            ((PressCmd$DeviceStatus) this.instance).clearTotalSpace();
            return this;
        }

        public Builder clearUpTime() {
            copyOnWrite();
            ((PressCmd$DeviceStatus) this.instance).clearUpTime();
            return this;
        }

        @Override // com.heytap.health.band.data.PressCmd$DeviceStatusOrBuilder
        public long getBattery() {
            return ((PressCmd$DeviceStatus) this.instance).getBattery();
        }

        @Override // com.heytap.health.band.data.PressCmd$DeviceStatusOrBuilder
        public long getFreeSpace() {
            return ((PressCmd$DeviceStatus) this.instance).getFreeSpace();
        }

        @Override // com.heytap.health.band.data.PressCmd$DeviceStatusOrBuilder
        public int getPidHealthTransPort() {
            return ((PressCmd$DeviceStatus) this.instance).getPidHealthTransPort();
        }

        @Override // com.heytap.health.band.data.PressCmd$DeviceStatusOrBuilder
        public int getPidLinkService() {
            return ((PressCmd$DeviceStatus) this.instance).getPidLinkService();
        }

        @Override // com.heytap.health.band.data.PressCmd$DeviceStatusOrBuilder
        public int getPidTestApp() {
            return ((PressCmd$DeviceStatus) this.instance).getPidTestApp();
        }

        @Override // com.heytap.health.band.data.PressCmd$DeviceStatusOrBuilder
        public int getPidTestTransPort() {
            return ((PressCmd$DeviceStatus) this.instance).getPidTestTransPort();
        }

        @Override // com.heytap.health.band.data.PressCmd$DeviceStatusOrBuilder
        public String getReason() {
            return ((PressCmd$DeviceStatus) this.instance).getReason();
        }

        @Override // com.heytap.health.band.data.PressCmd$DeviceStatusOrBuilder
        public ByteString getReasonBytes() {
            return ((PressCmd$DeviceStatus) this.instance).getReasonBytes();
        }

        @Override // com.heytap.health.band.data.PressCmd$DeviceStatusOrBuilder
        public long getTotalSpace() {
            return ((PressCmd$DeviceStatus) this.instance).getTotalSpace();
        }

        @Override // com.heytap.health.band.data.PressCmd$DeviceStatusOrBuilder
        public long getUpTime() {
            return ((PressCmd$DeviceStatus) this.instance).getUpTime();
        }

        public Builder setBattery(long j2) {
            copyOnWrite();
            ((PressCmd$DeviceStatus) this.instance).setBattery(j2);
            return this;
        }

        public Builder setFreeSpace(long j2) {
            copyOnWrite();
            ((PressCmd$DeviceStatus) this.instance).setFreeSpace(j2);
            return this;
        }

        public Builder setPidHealthTransPort(int i) {
            copyOnWrite();
            ((PressCmd$DeviceStatus) this.instance).setPidHealthTransPort(i);
            return this;
        }

        public Builder setPidLinkService(int i) {
            copyOnWrite();
            ((PressCmd$DeviceStatus) this.instance).setPidLinkService(i);
            return this;
        }

        public Builder setPidTestApp(int i) {
            copyOnWrite();
            ((PressCmd$DeviceStatus) this.instance).setPidTestApp(i);
            return this;
        }

        public Builder setPidTestTransPort(int i) {
            copyOnWrite();
            ((PressCmd$DeviceStatus) this.instance).setPidTestTransPort(i);
            return this;
        }

        public Builder setReason(String str) {
            copyOnWrite();
            ((PressCmd$DeviceStatus) this.instance).setReason(str);
            return this;
        }

        public Builder setReasonBytes(ByteString byteString) {
            copyOnWrite();
            ((PressCmd$DeviceStatus) this.instance).setReasonBytes(byteString);
            return this;
        }

        public Builder setTotalSpace(long j2) {
            copyOnWrite();
            ((PressCmd$DeviceStatus) this.instance).setTotalSpace(j2);
            return this;
        }

        public Builder setUpTime(long j2) {
            copyOnWrite();
            ((PressCmd$DeviceStatus) this.instance).setUpTime(j2);
            return this;
        }

        private Builder() {
            super(PressCmd$DeviceStatus.DEFAULT_INSTANCE);
        }
    }

    static {
        PressCmd$DeviceStatus pressCmd$DeviceStatus = new PressCmd$DeviceStatus();
        DEFAULT_INSTANCE = pressCmd$DeviceStatus;
        GeneratedMessageLite.registerDefaultInstance(PressCmd$DeviceStatus.class, pressCmd$DeviceStatus);
    }

    private PressCmd$DeviceStatus() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBattery() {
        this.battery_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFreeSpace() {
        this.freeSpace_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPidHealthTransPort() {
        this.pidHealthTransPort_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPidLinkService() {
        this.pidLinkService_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPidTestApp() {
        this.pidTestApp_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPidTestTransPort() {
        this.pidTestTransPort_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReason() {
        this.reason_ = getDefaultInstance().getReason();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalSpace() {
        this.totalSpace_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpTime() {
        this.upTime_ = 0L;
    }

    public static PressCmd$DeviceStatus getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PressCmd$DeviceStatus parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PressCmd$DeviceStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PressCmd$DeviceStatus parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PressCmd$DeviceStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PressCmd$DeviceStatus> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBattery(long j2) {
        this.battery_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFreeSpace(long j2) {
        this.freeSpace_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPidHealthTransPort(int i) {
        this.pidHealthTransPort_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPidLinkService(int i) {
        this.pidLinkService_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPidTestApp(int i) {
        this.pidTestApp_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPidTestTransPort(int i) {
        this.pidTestTransPort_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReason(String str) {
        str.getClass();
        this.reason_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReasonBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.reason_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalSpace(long j2) {
        this.totalSpace_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpTime(long j2) {
        this.upTime_ = j2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = xse.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new PressCmd$DeviceStatus();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0003\u0006\u0003\u0007\u0003\b\u0003\tȈ", new Object[]{"pidTestApp_", "pidLinkService_", "pidHealthTransPort_", "pidTestTransPort_", "upTime_", "freeSpace_", "totalSpace_", "battery_", "reason_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PressCmd$DeviceStatus> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (PressCmd$DeviceStatus.class) {
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

    @Override // com.heytap.health.band.data.PressCmd$DeviceStatusOrBuilder
    public long getBattery() {
        return this.battery_;
    }

    @Override // com.heytap.health.band.data.PressCmd$DeviceStatusOrBuilder
    public long getFreeSpace() {
        return this.freeSpace_;
    }

    @Override // com.heytap.health.band.data.PressCmd$DeviceStatusOrBuilder
    public int getPidHealthTransPort() {
        return this.pidHealthTransPort_;
    }

    @Override // com.heytap.health.band.data.PressCmd$DeviceStatusOrBuilder
    public int getPidLinkService() {
        return this.pidLinkService_;
    }

    @Override // com.heytap.health.band.data.PressCmd$DeviceStatusOrBuilder
    public int getPidTestApp() {
        return this.pidTestApp_;
    }

    @Override // com.heytap.health.band.data.PressCmd$DeviceStatusOrBuilder
    public int getPidTestTransPort() {
        return this.pidTestTransPort_;
    }

    @Override // com.heytap.health.band.data.PressCmd$DeviceStatusOrBuilder
    public String getReason() {
        return this.reason_;
    }

    @Override // com.heytap.health.band.data.PressCmd$DeviceStatusOrBuilder
    public ByteString getReasonBytes() {
        return ByteString.copyFromUtf8(this.reason_);
    }

    @Override // com.heytap.health.band.data.PressCmd$DeviceStatusOrBuilder
    public long getTotalSpace() {
        return this.totalSpace_;
    }

    @Override // com.heytap.health.band.data.PressCmd$DeviceStatusOrBuilder
    public long getUpTime() {
        return this.upTime_;
    }

    public static Builder newBuilder(PressCmd$DeviceStatus pressCmd$DeviceStatus) {
        return DEFAULT_INSTANCE.createBuilder(pressCmd$DeviceStatus);
    }

    public static PressCmd$DeviceStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PressCmd$DeviceStatus) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PressCmd$DeviceStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PressCmd$DeviceStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PressCmd$DeviceStatus parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PressCmd$DeviceStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PressCmd$DeviceStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PressCmd$DeviceStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PressCmd$DeviceStatus parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PressCmd$DeviceStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PressCmd$DeviceStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PressCmd$DeviceStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PressCmd$DeviceStatus parseFrom(InputStream inputStream) throws IOException {
        return (PressCmd$DeviceStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PressCmd$DeviceStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PressCmd$DeviceStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PressCmd$DeviceStatus parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PressCmd$DeviceStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PressCmd$DeviceStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PressCmd$DeviceStatus) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
