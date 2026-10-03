package com.heytap.wearable.oaf.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.fad;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class OafRecorder$DeviceEventStore extends GeneratedMessageLite<OafRecorder$DeviceEventStore, Builder> implements OafRecorder$DeviceEventStoreOrBuilder {
    public static final int CALLCONNECTEDTIME_FIELD_NUMBER = 5;
    public static final int CALLDISCONNECTTIME_FIELD_NUMBER = 3;
    public static final int CONNECTEDTIME_FIELD_NUMBER = 6;
    public static final int CONNECTED_FIELD_NUMBER = 2;
    private static final OafRecorder$DeviceEventStore DEFAULT_INSTANCE;
    public static final int DISCONNECTEDTIME_FIELD_NUMBER = 4;
    public static final int HEARTBEATTIME_FIELD_NUMBER = 7;
    public static final int MAC_FIELD_NUMBER = 1;
    private static volatile Parser<OafRecorder$DeviceEventStore> PARSER;
    private long callConnectedTime_;
    private long callDisconnectTime_;
    private long connectedTime_;
    private boolean connected_;
    private long disconnectedTime_;
    private long heartBeatTime_;
    private String mac_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<OafRecorder$DeviceEventStore, Builder> implements OafRecorder$DeviceEventStoreOrBuilder {
        public Builder clearCallConnectedTime() {
            copyOnWrite();
            ((OafRecorder$DeviceEventStore) this.instance).clearCallConnectedTime();
            return this;
        }

        public Builder clearCallDisconnectTime() {
            copyOnWrite();
            ((OafRecorder$DeviceEventStore) this.instance).clearCallDisconnectTime();
            return this;
        }

        public Builder clearConnected() {
            copyOnWrite();
            ((OafRecorder$DeviceEventStore) this.instance).clearConnected();
            return this;
        }

        public Builder clearConnectedTime() {
            copyOnWrite();
            ((OafRecorder$DeviceEventStore) this.instance).clearConnectedTime();
            return this;
        }

        public Builder clearDisconnectedTime() {
            copyOnWrite();
            ((OafRecorder$DeviceEventStore) this.instance).clearDisconnectedTime();
            return this;
        }

        public Builder clearHeartBeatTime() {
            copyOnWrite();
            ((OafRecorder$DeviceEventStore) this.instance).clearHeartBeatTime();
            return this;
        }

        public Builder clearMac() {
            copyOnWrite();
            ((OafRecorder$DeviceEventStore) this.instance).clearMac();
            return this;
        }

        @Override // com.heytap.wearable.oaf.proto.OafRecorder$DeviceEventStoreOrBuilder
        public long getCallConnectedTime() {
            return ((OafRecorder$DeviceEventStore) this.instance).getCallConnectedTime();
        }

        @Override // com.heytap.wearable.oaf.proto.OafRecorder$DeviceEventStoreOrBuilder
        public long getCallDisconnectTime() {
            return ((OafRecorder$DeviceEventStore) this.instance).getCallDisconnectTime();
        }

        @Override // com.heytap.wearable.oaf.proto.OafRecorder$DeviceEventStoreOrBuilder
        public boolean getConnected() {
            return ((OafRecorder$DeviceEventStore) this.instance).getConnected();
        }

        @Override // com.heytap.wearable.oaf.proto.OafRecorder$DeviceEventStoreOrBuilder
        public long getConnectedTime() {
            return ((OafRecorder$DeviceEventStore) this.instance).getConnectedTime();
        }

        @Override // com.heytap.wearable.oaf.proto.OafRecorder$DeviceEventStoreOrBuilder
        public long getDisconnectedTime() {
            return ((OafRecorder$DeviceEventStore) this.instance).getDisconnectedTime();
        }

        @Override // com.heytap.wearable.oaf.proto.OafRecorder$DeviceEventStoreOrBuilder
        public long getHeartBeatTime() {
            return ((OafRecorder$DeviceEventStore) this.instance).getHeartBeatTime();
        }

        @Override // com.heytap.wearable.oaf.proto.OafRecorder$DeviceEventStoreOrBuilder
        public String getMac() {
            return ((OafRecorder$DeviceEventStore) this.instance).getMac();
        }

        @Override // com.heytap.wearable.oaf.proto.OafRecorder$DeviceEventStoreOrBuilder
        public ByteString getMacBytes() {
            return ((OafRecorder$DeviceEventStore) this.instance).getMacBytes();
        }

        public Builder setCallConnectedTime(long j2) {
            copyOnWrite();
            ((OafRecorder$DeviceEventStore) this.instance).setCallConnectedTime(j2);
            return this;
        }

        public Builder setCallDisconnectTime(long j2) {
            copyOnWrite();
            ((OafRecorder$DeviceEventStore) this.instance).setCallDisconnectTime(j2);
            return this;
        }

        public Builder setConnected(boolean z) {
            copyOnWrite();
            ((OafRecorder$DeviceEventStore) this.instance).setConnected(z);
            return this;
        }

        public Builder setConnectedTime(long j2) {
            copyOnWrite();
            ((OafRecorder$DeviceEventStore) this.instance).setConnectedTime(j2);
            return this;
        }

        public Builder setDisconnectedTime(long j2) {
            copyOnWrite();
            ((OafRecorder$DeviceEventStore) this.instance).setDisconnectedTime(j2);
            return this;
        }

        public Builder setHeartBeatTime(long j2) {
            copyOnWrite();
            ((OafRecorder$DeviceEventStore) this.instance).setHeartBeatTime(j2);
            return this;
        }

        public Builder setMac(String str) {
            copyOnWrite();
            ((OafRecorder$DeviceEventStore) this.instance).setMac(str);
            return this;
        }

        public Builder setMacBytes(ByteString byteString) {
            copyOnWrite();
            ((OafRecorder$DeviceEventStore) this.instance).setMacBytes(byteString);
            return this;
        }

        private Builder() {
            super(OafRecorder$DeviceEventStore.DEFAULT_INSTANCE);
        }
    }

    static {
        OafRecorder$DeviceEventStore oafRecorder$DeviceEventStore = new OafRecorder$DeviceEventStore();
        DEFAULT_INSTANCE = oafRecorder$DeviceEventStore;
        GeneratedMessageLite.registerDefaultInstance(OafRecorder$DeviceEventStore.class, oafRecorder$DeviceEventStore);
    }

    private OafRecorder$DeviceEventStore() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCallConnectedTime() {
        this.callConnectedTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCallDisconnectTime() {
        this.callDisconnectTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnected() {
        this.connected_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectedTime() {
        this.connectedTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisconnectedTime() {
        this.disconnectedTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeartBeatTime() {
        this.heartBeatTime_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMac() {
        this.mac_ = getDefaultInstance().getMac();
    }

    public static OafRecorder$DeviceEventStore getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static OafRecorder$DeviceEventStore parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OafRecorder$DeviceEventStore) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OafRecorder$DeviceEventStore parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OafRecorder$DeviceEventStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<OafRecorder$DeviceEventStore> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCallConnectedTime(long j2) {
        this.callConnectedTime_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCallDisconnectTime(long j2) {
        this.callDisconnectTime_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnected(boolean z) {
        this.connected_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectedTime(long j2) {
        this.connectedTime_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisconnectedTime(long j2) {
        this.disconnectedTime_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeartBeatTime(long j2) {
        this.heartBeatTime_ = j2;
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

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = fad.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new OafRecorder$DeviceEventStore();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\u0003\u0004\u0003\u0005\u0003\u0006\u0003\u0007\u0003", new Object[]{"mac_", "connected_", "callDisconnectTime_", "disconnectedTime_", "callConnectedTime_", "connectedTime_", "heartBeatTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<OafRecorder$DeviceEventStore> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (OafRecorder$DeviceEventStore.class) {
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

    @Override // com.heytap.wearable.oaf.proto.OafRecorder$DeviceEventStoreOrBuilder
    public long getCallConnectedTime() {
        return this.callConnectedTime_;
    }

    @Override // com.heytap.wearable.oaf.proto.OafRecorder$DeviceEventStoreOrBuilder
    public long getCallDisconnectTime() {
        return this.callDisconnectTime_;
    }

    @Override // com.heytap.wearable.oaf.proto.OafRecorder$DeviceEventStoreOrBuilder
    public boolean getConnected() {
        return this.connected_;
    }

    @Override // com.heytap.wearable.oaf.proto.OafRecorder$DeviceEventStoreOrBuilder
    public long getConnectedTime() {
        return this.connectedTime_;
    }

    @Override // com.heytap.wearable.oaf.proto.OafRecorder$DeviceEventStoreOrBuilder
    public long getDisconnectedTime() {
        return this.disconnectedTime_;
    }

    @Override // com.heytap.wearable.oaf.proto.OafRecorder$DeviceEventStoreOrBuilder
    public long getHeartBeatTime() {
        return this.heartBeatTime_;
    }

    @Override // com.heytap.wearable.oaf.proto.OafRecorder$DeviceEventStoreOrBuilder
    public String getMac() {
        return this.mac_;
    }

    @Override // com.heytap.wearable.oaf.proto.OafRecorder$DeviceEventStoreOrBuilder
    public ByteString getMacBytes() {
        return ByteString.copyFromUtf8(this.mac_);
    }

    public static Builder newBuilder(OafRecorder$DeviceEventStore oafRecorder$DeviceEventStore) {
        return DEFAULT_INSTANCE.createBuilder(oafRecorder$DeviceEventStore);
    }

    public static OafRecorder$DeviceEventStore parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OafRecorder$DeviceEventStore) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OafRecorder$DeviceEventStore parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OafRecorder$DeviceEventStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static OafRecorder$DeviceEventStore parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (OafRecorder$DeviceEventStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static OafRecorder$DeviceEventStore parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OafRecorder$DeviceEventStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static OafRecorder$DeviceEventStore parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OafRecorder$DeviceEventStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OafRecorder$DeviceEventStore parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OafRecorder$DeviceEventStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static OafRecorder$DeviceEventStore parseFrom(InputStream inputStream) throws IOException {
        return (OafRecorder$DeviceEventStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OafRecorder$DeviceEventStore parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OafRecorder$DeviceEventStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OafRecorder$DeviceEventStore parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (OafRecorder$DeviceEventStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static OafRecorder$DeviceEventStore parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OafRecorder$DeviceEventStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
