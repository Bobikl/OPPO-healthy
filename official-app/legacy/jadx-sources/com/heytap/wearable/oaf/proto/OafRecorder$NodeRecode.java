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
public final class OafRecorder$NodeRecode extends GeneratedMessageLite<OafRecorder$NodeRecode, Builder> implements OafRecorder$NodeRecodeOrBuilder {
    public static final int CONNECTIONTYPE_FIELD_NUMBER = 2;
    private static final OafRecorder$NodeRecode DEFAULT_INSTANCE;
    public static final int KSCALIAS_FIELD_NUMBER = 4;
    public static final int KSC_FIELD_NUMBER = 5;
    public static final int LOCALDEVICEID_FIELD_NUMBER = 6;
    public static final int NODEID_FIELD_NUMBER = 1;
    public static final int OAFMODELID_FIELD_NUMBER = 7;
    private static volatile Parser<OafRecorder$NodeRecode> PARSER = null;
    public static final int REMOTEDEVICEID_FIELD_NUMBER = 3;
    private int connectionType_;
    private ByteString kscAlias_;
    private ByteString ksc_;
    private ByteString localDeviceId_;
    private String nodeId_ = "";
    private ByteString oafModelId_;
    private ByteString remoteDeviceId_;

    public static final class Builder extends GeneratedMessageLite.Builder<OafRecorder$NodeRecode, Builder> implements OafRecorder$NodeRecodeOrBuilder {
        public Builder clearConnectionType() {
            copyOnWrite();
            ((OafRecorder$NodeRecode) this.instance).clearConnectionType();
            return this;
        }

        public Builder clearKsc() {
            copyOnWrite();
            ((OafRecorder$NodeRecode) this.instance).clearKsc();
            return this;
        }

        public Builder clearKscAlias() {
            copyOnWrite();
            ((OafRecorder$NodeRecode) this.instance).clearKscAlias();
            return this;
        }

        public Builder clearLocalDeviceId() {
            copyOnWrite();
            ((OafRecorder$NodeRecode) this.instance).clearLocalDeviceId();
            return this;
        }

        public Builder clearNodeId() {
            copyOnWrite();
            ((OafRecorder$NodeRecode) this.instance).clearNodeId();
            return this;
        }

        public Builder clearOafModelId() {
            copyOnWrite();
            ((OafRecorder$NodeRecode) this.instance).clearOafModelId();
            return this;
        }

        public Builder clearRemoteDeviceId() {
            copyOnWrite();
            ((OafRecorder$NodeRecode) this.instance).clearRemoteDeviceId();
            return this;
        }

        @Override // com.heytap.wearable.oaf.proto.OafRecorder$NodeRecodeOrBuilder
        public int getConnectionType() {
            return ((OafRecorder$NodeRecode) this.instance).getConnectionType();
        }

        @Override // com.heytap.wearable.oaf.proto.OafRecorder$NodeRecodeOrBuilder
        public ByteString getKsc() {
            return ((OafRecorder$NodeRecode) this.instance).getKsc();
        }

        @Override // com.heytap.wearable.oaf.proto.OafRecorder$NodeRecodeOrBuilder
        public ByteString getKscAlias() {
            return ((OafRecorder$NodeRecode) this.instance).getKscAlias();
        }

        @Override // com.heytap.wearable.oaf.proto.OafRecorder$NodeRecodeOrBuilder
        public ByteString getLocalDeviceId() {
            return ((OafRecorder$NodeRecode) this.instance).getLocalDeviceId();
        }

        @Override // com.heytap.wearable.oaf.proto.OafRecorder$NodeRecodeOrBuilder
        public String getNodeId() {
            return ((OafRecorder$NodeRecode) this.instance).getNodeId();
        }

        @Override // com.heytap.wearable.oaf.proto.OafRecorder$NodeRecodeOrBuilder
        public ByteString getNodeIdBytes() {
            return ((OafRecorder$NodeRecode) this.instance).getNodeIdBytes();
        }

        @Override // com.heytap.wearable.oaf.proto.OafRecorder$NodeRecodeOrBuilder
        public ByteString getOafModelId() {
            return ((OafRecorder$NodeRecode) this.instance).getOafModelId();
        }

        @Override // com.heytap.wearable.oaf.proto.OafRecorder$NodeRecodeOrBuilder
        public ByteString getRemoteDeviceId() {
            return ((OafRecorder$NodeRecode) this.instance).getRemoteDeviceId();
        }

        public Builder setConnectionType(int i) {
            copyOnWrite();
            ((OafRecorder$NodeRecode) this.instance).setConnectionType(i);
            return this;
        }

        public Builder setKsc(ByteString byteString) {
            copyOnWrite();
            ((OafRecorder$NodeRecode) this.instance).setKsc(byteString);
            return this;
        }

        public Builder setKscAlias(ByteString byteString) {
            copyOnWrite();
            ((OafRecorder$NodeRecode) this.instance).setKscAlias(byteString);
            return this;
        }

        public Builder setLocalDeviceId(ByteString byteString) {
            copyOnWrite();
            ((OafRecorder$NodeRecode) this.instance).setLocalDeviceId(byteString);
            return this;
        }

        public Builder setNodeId(String str) {
            copyOnWrite();
            ((OafRecorder$NodeRecode) this.instance).setNodeId(str);
            return this;
        }

        public Builder setNodeIdBytes(ByteString byteString) {
            copyOnWrite();
            ((OafRecorder$NodeRecode) this.instance).setNodeIdBytes(byteString);
            return this;
        }

        public Builder setOafModelId(ByteString byteString) {
            copyOnWrite();
            ((OafRecorder$NodeRecode) this.instance).setOafModelId(byteString);
            return this;
        }

        public Builder setRemoteDeviceId(ByteString byteString) {
            copyOnWrite();
            ((OafRecorder$NodeRecode) this.instance).setRemoteDeviceId(byteString);
            return this;
        }

        private Builder() {
            super(OafRecorder$NodeRecode.DEFAULT_INSTANCE);
        }
    }

    static {
        OafRecorder$NodeRecode oafRecorder$NodeRecode = new OafRecorder$NodeRecode();
        DEFAULT_INSTANCE = oafRecorder$NodeRecode;
        GeneratedMessageLite.registerDefaultInstance(OafRecorder$NodeRecode.class, oafRecorder$NodeRecode);
    }

    private OafRecorder$NodeRecode() {
        ByteString byteString = ByteString.EMPTY;
        this.remoteDeviceId_ = byteString;
        this.kscAlias_ = byteString;
        this.ksc_ = byteString;
        this.localDeviceId_ = byteString;
        this.oafModelId_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectionType() {
        this.connectionType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKsc() {
        this.ksc_ = getDefaultInstance().getKsc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKscAlias() {
        this.kscAlias_ = getDefaultInstance().getKscAlias();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocalDeviceId() {
        this.localDeviceId_ = getDefaultInstance().getLocalDeviceId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNodeId() {
        this.nodeId_ = getDefaultInstance().getNodeId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOafModelId() {
        this.oafModelId_ = getDefaultInstance().getOafModelId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemoteDeviceId() {
        this.remoteDeviceId_ = getDefaultInstance().getRemoteDeviceId();
    }

    public static OafRecorder$NodeRecode getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static OafRecorder$NodeRecode parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OafRecorder$NodeRecode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OafRecorder$NodeRecode parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OafRecorder$NodeRecode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<OafRecorder$NodeRecode> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionType(int i) {
        this.connectionType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKsc(ByteString byteString) {
        byteString.getClass();
        this.ksc_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKscAlias(ByteString byteString) {
        byteString.getClass();
        this.kscAlias_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocalDeviceId(ByteString byteString) {
        byteString.getClass();
        this.localDeviceId_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodeId(String str) {
        str.getClass();
        this.nodeId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNodeIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.nodeId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOafModelId(ByteString byteString) {
        byteString.getClass();
        this.oafModelId_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemoteDeviceId(ByteString byteString) {
        byteString.getClass();
        this.remoteDeviceId_ = byteString;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = fad.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new OafRecorder$NodeRecode();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n", new Object[]{"nodeId_", "connectionType_", "remoteDeviceId_", "kscAlias_", "ksc_", "localDeviceId_", "oafModelId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<OafRecorder$NodeRecode> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (OafRecorder$NodeRecode.class) {
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

    @Override // com.heytap.wearable.oaf.proto.OafRecorder$NodeRecodeOrBuilder
    public int getConnectionType() {
        return this.connectionType_;
    }

    @Override // com.heytap.wearable.oaf.proto.OafRecorder$NodeRecodeOrBuilder
    public ByteString getKsc() {
        return this.ksc_;
    }

    @Override // com.heytap.wearable.oaf.proto.OafRecorder$NodeRecodeOrBuilder
    public ByteString getKscAlias() {
        return this.kscAlias_;
    }

    @Override // com.heytap.wearable.oaf.proto.OafRecorder$NodeRecodeOrBuilder
    public ByteString getLocalDeviceId() {
        return this.localDeviceId_;
    }

    @Override // com.heytap.wearable.oaf.proto.OafRecorder$NodeRecodeOrBuilder
    public String getNodeId() {
        return this.nodeId_;
    }

    @Override // com.heytap.wearable.oaf.proto.OafRecorder$NodeRecodeOrBuilder
    public ByteString getNodeIdBytes() {
        return ByteString.copyFromUtf8(this.nodeId_);
    }

    @Override // com.heytap.wearable.oaf.proto.OafRecorder$NodeRecodeOrBuilder
    public ByteString getOafModelId() {
        return this.oafModelId_;
    }

    @Override // com.heytap.wearable.oaf.proto.OafRecorder$NodeRecodeOrBuilder
    public ByteString getRemoteDeviceId() {
        return this.remoteDeviceId_;
    }

    public static Builder newBuilder(OafRecorder$NodeRecode oafRecorder$NodeRecode) {
        return DEFAULT_INSTANCE.createBuilder(oafRecorder$NodeRecode);
    }

    public static OafRecorder$NodeRecode parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OafRecorder$NodeRecode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OafRecorder$NodeRecode parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OafRecorder$NodeRecode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static OafRecorder$NodeRecode parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (OafRecorder$NodeRecode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static OafRecorder$NodeRecode parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OafRecorder$NodeRecode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static OafRecorder$NodeRecode parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OafRecorder$NodeRecode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OafRecorder$NodeRecode parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (OafRecorder$NodeRecode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static OafRecorder$NodeRecode parseFrom(InputStream inputStream) throws IOException {
        return (OafRecorder$NodeRecode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OafRecorder$NodeRecode parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OafRecorder$NodeRecode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static OafRecorder$NodeRecode parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (OafRecorder$NodeRecode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static OafRecorder$NodeRecode parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (OafRecorder$NodeRecode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
