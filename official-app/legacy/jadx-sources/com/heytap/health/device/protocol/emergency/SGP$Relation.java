package com.heytap.health.device.protocol.emergency;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.l5g;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes16.dex */
public final class SGP$Relation extends GeneratedMessageLite<SGP$Relation, Builder> implements SGP$RelationOrBuilder {
    private static final SGP$Relation DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int MOBILE_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile Parser<SGP$Relation> PARSER = null;
    public static final int REMARK_FIELD_NUMBER = 3;
    private long id_;
    private String name_ = "";
    private String remark_ = "";
    private String mobile_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<SGP$Relation, Builder> implements SGP$RelationOrBuilder {
        public Builder clearId() {
            copyOnWrite();
            ((SGP$Relation) this.instance).clearId();
            return this;
        }

        public Builder clearMobile() {
            copyOnWrite();
            ((SGP$Relation) this.instance).clearMobile();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((SGP$Relation) this.instance).clearName();
            return this;
        }

        public Builder clearRemark() {
            copyOnWrite();
            ((SGP$Relation) this.instance).clearRemark();
            return this;
        }

        @Override // com.heytap.health.device.protocol.emergency.SGP$RelationOrBuilder
        public long getId() {
            return ((SGP$Relation) this.instance).getId();
        }

        @Override // com.heytap.health.device.protocol.emergency.SGP$RelationOrBuilder
        public String getMobile() {
            return ((SGP$Relation) this.instance).getMobile();
        }

        @Override // com.heytap.health.device.protocol.emergency.SGP$RelationOrBuilder
        public ByteString getMobileBytes() {
            return ((SGP$Relation) this.instance).getMobileBytes();
        }

        @Override // com.heytap.health.device.protocol.emergency.SGP$RelationOrBuilder
        public String getName() {
            return ((SGP$Relation) this.instance).getName();
        }

        @Override // com.heytap.health.device.protocol.emergency.SGP$RelationOrBuilder
        public ByteString getNameBytes() {
            return ((SGP$Relation) this.instance).getNameBytes();
        }

        @Override // com.heytap.health.device.protocol.emergency.SGP$RelationOrBuilder
        public String getRemark() {
            return ((SGP$Relation) this.instance).getRemark();
        }

        @Override // com.heytap.health.device.protocol.emergency.SGP$RelationOrBuilder
        public ByteString getRemarkBytes() {
            return ((SGP$Relation) this.instance).getRemarkBytes();
        }

        public Builder setId(long j2) {
            copyOnWrite();
            ((SGP$Relation) this.instance).setId(j2);
            return this;
        }

        public Builder setMobile(String str) {
            copyOnWrite();
            ((SGP$Relation) this.instance).setMobile(str);
            return this;
        }

        public Builder setMobileBytes(ByteString byteString) {
            copyOnWrite();
            ((SGP$Relation) this.instance).setMobileBytes(byteString);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((SGP$Relation) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((SGP$Relation) this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setRemark(String str) {
            copyOnWrite();
            ((SGP$Relation) this.instance).setRemark(str);
            return this;
        }

        public Builder setRemarkBytes(ByteString byteString) {
            copyOnWrite();
            ((SGP$Relation) this.instance).setRemarkBytes(byteString);
            return this;
        }

        private Builder() {
            super(SGP$Relation.DEFAULT_INSTANCE);
        }
    }

    static {
        SGP$Relation sGP$Relation = new SGP$Relation();
        DEFAULT_INSTANCE = sGP$Relation;
        GeneratedMessageLite.registerDefaultInstance(SGP$Relation.class, sGP$Relation);
    }

    private SGP$Relation() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMobile() {
        this.mobile_ = getDefaultInstance().getMobile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemark() {
        this.remark_ = getDefaultInstance().getRemark();
    }

    public static SGP$Relation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SGP$Relation parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SGP$Relation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SGP$Relation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SGP$Relation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SGP$Relation> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j2) {
        this.id_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMobile(String str) {
        str.getClass();
        this.mobile_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMobileBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.mobile_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemark(String str) {
        str.getClass();
        this.remark_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemarkBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.remark_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = l5g.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new SGP$Relation();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0003\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"id_", "name_", "remark_", "mobile_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SGP$Relation> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (SGP$Relation.class) {
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

    @Override // com.heytap.health.device.protocol.emergency.SGP$RelationOrBuilder
    public long getId() {
        return this.id_;
    }

    @Override // com.heytap.health.device.protocol.emergency.SGP$RelationOrBuilder
    public String getMobile() {
        return this.mobile_;
    }

    @Override // com.heytap.health.device.protocol.emergency.SGP$RelationOrBuilder
    public ByteString getMobileBytes() {
        return ByteString.copyFromUtf8(this.mobile_);
    }

    @Override // com.heytap.health.device.protocol.emergency.SGP$RelationOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.heytap.health.device.protocol.emergency.SGP$RelationOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.heytap.health.device.protocol.emergency.SGP$RelationOrBuilder
    public String getRemark() {
        return this.remark_;
    }

    @Override // com.heytap.health.device.protocol.emergency.SGP$RelationOrBuilder
    public ByteString getRemarkBytes() {
        return ByteString.copyFromUtf8(this.remark_);
    }

    public static Builder newBuilder(SGP$Relation sGP$Relation) {
        return DEFAULT_INSTANCE.createBuilder(sGP$Relation);
    }

    public static SGP$Relation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SGP$Relation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SGP$Relation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SGP$Relation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SGP$Relation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SGP$Relation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SGP$Relation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SGP$Relation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SGP$Relation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SGP$Relation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SGP$Relation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SGP$Relation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SGP$Relation parseFrom(InputStream inputStream) throws IOException {
        return (SGP$Relation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SGP$Relation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SGP$Relation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SGP$Relation parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SGP$Relation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SGP$Relation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SGP$Relation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
