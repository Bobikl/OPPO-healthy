package com.heytap.health.device.protocol.emergency;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.zk6;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes16.dex */
public final class EmergencySettingProto$EmergencyContactInfo extends GeneratedMessageLite<EmergencySettingProto$EmergencyContactInfo, Builder> implements EmergencySettingProto$EmergencyContactInfoOrBuilder {
    public static final int CUSTOMRELATIONSHIP_FIELD_NUMBER = 3;
    private static final EmergencySettingProto$EmergencyContactInfo DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 4;
    private static volatile Parser<EmergencySettingProto$EmergencyContactInfo> PARSER = null;
    public static final int RELATIONSHIP_FIELD_NUMBER = 2;
    private int relationship_;
    private String name_ = "";
    private String customRelationship_ = "";
    private String number_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<EmergencySettingProto$EmergencyContactInfo, Builder> implements EmergencySettingProto$EmergencyContactInfoOrBuilder {
        public Builder clearCustomRelationship() {
            copyOnWrite();
            ((EmergencySettingProto$EmergencyContactInfo) this.instance).clearCustomRelationship();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((EmergencySettingProto$EmergencyContactInfo) this.instance).clearName();
            return this;
        }

        public Builder clearNumber() {
            copyOnWrite();
            ((EmergencySettingProto$EmergencyContactInfo) this.instance).clearNumber();
            return this;
        }

        public Builder clearRelationship() {
            copyOnWrite();
            ((EmergencySettingProto$EmergencyContactInfo) this.instance).clearRelationship();
            return this;
        }

        @Override // com.heytap.health.device.protocol.emergency.EmergencySettingProto$EmergencyContactInfoOrBuilder
        public String getCustomRelationship() {
            return ((EmergencySettingProto$EmergencyContactInfo) this.instance).getCustomRelationship();
        }

        @Override // com.heytap.health.device.protocol.emergency.EmergencySettingProto$EmergencyContactInfoOrBuilder
        public ByteString getCustomRelationshipBytes() {
            return ((EmergencySettingProto$EmergencyContactInfo) this.instance).getCustomRelationshipBytes();
        }

        @Override // com.heytap.health.device.protocol.emergency.EmergencySettingProto$EmergencyContactInfoOrBuilder
        public String getName() {
            return ((EmergencySettingProto$EmergencyContactInfo) this.instance).getName();
        }

        @Override // com.heytap.health.device.protocol.emergency.EmergencySettingProto$EmergencyContactInfoOrBuilder
        public ByteString getNameBytes() {
            return ((EmergencySettingProto$EmergencyContactInfo) this.instance).getNameBytes();
        }

        @Override // com.heytap.health.device.protocol.emergency.EmergencySettingProto$EmergencyContactInfoOrBuilder
        public String getNumber() {
            return ((EmergencySettingProto$EmergencyContactInfo) this.instance).getNumber();
        }

        @Override // com.heytap.health.device.protocol.emergency.EmergencySettingProto$EmergencyContactInfoOrBuilder
        public ByteString getNumberBytes() {
            return ((EmergencySettingProto$EmergencyContactInfo) this.instance).getNumberBytes();
        }

        @Override // com.heytap.health.device.protocol.emergency.EmergencySettingProto$EmergencyContactInfoOrBuilder
        public int getRelationship() {
            return ((EmergencySettingProto$EmergencyContactInfo) this.instance).getRelationship();
        }

        public Builder setCustomRelationship(String str) {
            copyOnWrite();
            ((EmergencySettingProto$EmergencyContactInfo) this.instance).setCustomRelationship(str);
            return this;
        }

        public Builder setCustomRelationshipBytes(ByteString byteString) {
            copyOnWrite();
            ((EmergencySettingProto$EmergencyContactInfo) this.instance).setCustomRelationshipBytes(byteString);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((EmergencySettingProto$EmergencyContactInfo) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((EmergencySettingProto$EmergencyContactInfo) this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setNumber(String str) {
            copyOnWrite();
            ((EmergencySettingProto$EmergencyContactInfo) this.instance).setNumber(str);
            return this;
        }

        public Builder setNumberBytes(ByteString byteString) {
            copyOnWrite();
            ((EmergencySettingProto$EmergencyContactInfo) this.instance).setNumberBytes(byteString);
            return this;
        }

        public Builder setRelationship(int i) {
            copyOnWrite();
            ((EmergencySettingProto$EmergencyContactInfo) this.instance).setRelationship(i);
            return this;
        }

        private Builder() {
            super(EmergencySettingProto$EmergencyContactInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        EmergencySettingProto$EmergencyContactInfo emergencySettingProto$EmergencyContactInfo = new EmergencySettingProto$EmergencyContactInfo();
        DEFAULT_INSTANCE = emergencySettingProto$EmergencyContactInfo;
        GeneratedMessageLite.registerDefaultInstance(EmergencySettingProto$EmergencyContactInfo.class, emergencySettingProto$EmergencyContactInfo);
    }

    private EmergencySettingProto$EmergencyContactInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCustomRelationship() {
        this.customRelationship_ = getDefaultInstance().getCustomRelationship();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumber() {
        this.number_ = getDefaultInstance().getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRelationship() {
        this.relationship_ = 0;
    }

    public static EmergencySettingProto$EmergencyContactInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static EmergencySettingProto$EmergencyContactInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EmergencySettingProto$EmergencyContactInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EmergencySettingProto$EmergencyContactInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EmergencySettingProto$EmergencyContactInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<EmergencySettingProto$EmergencyContactInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCustomRelationship(String str) {
        str.getClass();
        this.customRelationship_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCustomRelationshipBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.customRelationship_ = byteString.toStringUtf8();
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
    public void setNumber(String str) {
        str.getClass();
        this.number_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumberBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.number_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRelationship(int i) {
        this.relationship_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = zk6.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new EmergencySettingProto$EmergencyContactInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003Ȉ\u0004Ȉ", new Object[]{"name_", "relationship_", "customRelationship_", "number_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<EmergencySettingProto$EmergencyContactInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (EmergencySettingProto$EmergencyContactInfo.class) {
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

    @Override // com.heytap.health.device.protocol.emergency.EmergencySettingProto$EmergencyContactInfoOrBuilder
    public String getCustomRelationship() {
        return this.customRelationship_;
    }

    @Override // com.heytap.health.device.protocol.emergency.EmergencySettingProto$EmergencyContactInfoOrBuilder
    public ByteString getCustomRelationshipBytes() {
        return ByteString.copyFromUtf8(this.customRelationship_);
    }

    @Override // com.heytap.health.device.protocol.emergency.EmergencySettingProto$EmergencyContactInfoOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.heytap.health.device.protocol.emergency.EmergencySettingProto$EmergencyContactInfoOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    @Override // com.heytap.health.device.protocol.emergency.EmergencySettingProto$EmergencyContactInfoOrBuilder
    public String getNumber() {
        return this.number_;
    }

    @Override // com.heytap.health.device.protocol.emergency.EmergencySettingProto$EmergencyContactInfoOrBuilder
    public ByteString getNumberBytes() {
        return ByteString.copyFromUtf8(this.number_);
    }

    @Override // com.heytap.health.device.protocol.emergency.EmergencySettingProto$EmergencyContactInfoOrBuilder
    public int getRelationship() {
        return this.relationship_;
    }

    public static Builder newBuilder(EmergencySettingProto$EmergencyContactInfo emergencySettingProto$EmergencyContactInfo) {
        return DEFAULT_INSTANCE.createBuilder(emergencySettingProto$EmergencyContactInfo);
    }

    public static EmergencySettingProto$EmergencyContactInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EmergencySettingProto$EmergencyContactInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EmergencySettingProto$EmergencyContactInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EmergencySettingProto$EmergencyContactInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static EmergencySettingProto$EmergencyContactInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EmergencySettingProto$EmergencyContactInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static EmergencySettingProto$EmergencyContactInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EmergencySettingProto$EmergencyContactInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static EmergencySettingProto$EmergencyContactInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EmergencySettingProto$EmergencyContactInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EmergencySettingProto$EmergencyContactInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (EmergencySettingProto$EmergencyContactInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static EmergencySettingProto$EmergencyContactInfo parseFrom(InputStream inputStream) throws IOException {
        return (EmergencySettingProto$EmergencyContactInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EmergencySettingProto$EmergencyContactInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EmergencySettingProto$EmergencyContactInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static EmergencySettingProto$EmergencyContactInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (EmergencySettingProto$EmergencyContactInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static EmergencySettingProto$EmergencyContactInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (EmergencySettingProto$EmergencyContactInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
