package com.heytap.health.linkage.proto;

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
public final class LinkageDeviceProto$PairEvent extends GeneratedMessageLite<LinkageDeviceProto$PairEvent, Builder> implements LinkageDeviceProto$PairEventOrBuilder {
    public static final int ACTION_FIELD_NUMBER = 2;
    private static final LinkageDeviceProto$PairEvent DEFAULT_INSTANCE;
    public static final int DEVICE_FIELD_NUMBER = 3;
    public static final int EVENTID_FIELD_NUMBER = 1;
    public static final int FLAG_FIELD_NUMBER = 4;
    private static volatile Parser<LinkageDeviceProto$PairEvent> PARSER = null;
    public static final int RESULTCODE_FIELD_NUMBER = 5;
    private int action_;
    private int bitField0_;
    private LinkageDeviceProto$AccountDeviceInfo device_;
    private int eventId_;
    private int flag_;
    private int resultCode_;

    public static final class Builder extends GeneratedMessageLite.Builder<LinkageDeviceProto$PairEvent, Builder> implements LinkageDeviceProto$PairEventOrBuilder {
        public Builder clearAction() {
            copyOnWrite();
            ((LinkageDeviceProto$PairEvent) this.instance).clearAction();
            return this;
        }

        public Builder clearDevice() {
            copyOnWrite();
            ((LinkageDeviceProto$PairEvent) this.instance).clearDevice();
            return this;
        }

        public Builder clearEventId() {
            copyOnWrite();
            ((LinkageDeviceProto$PairEvent) this.instance).clearEventId();
            return this;
        }

        public Builder clearFlag() {
            copyOnWrite();
            ((LinkageDeviceProto$PairEvent) this.instance).clearFlag();
            return this;
        }

        public Builder clearResultCode() {
            copyOnWrite();
            ((LinkageDeviceProto$PairEvent) this.instance).clearResultCode();
            return this;
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$PairEventOrBuilder
        public LinkageDeviceProto$ACTION getAction() {
            return ((LinkageDeviceProto$PairEvent) this.instance).getAction();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$PairEventOrBuilder
        public int getActionValue() {
            return ((LinkageDeviceProto$PairEvent) this.instance).getActionValue();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$PairEventOrBuilder
        public LinkageDeviceProto$AccountDeviceInfo getDevice() {
            return ((LinkageDeviceProto$PairEvent) this.instance).getDevice();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$PairEventOrBuilder
        public int getEventId() {
            return ((LinkageDeviceProto$PairEvent) this.instance).getEventId();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$PairEventOrBuilder
        public int getFlag() {
            return ((LinkageDeviceProto$PairEvent) this.instance).getFlag();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$PairEventOrBuilder
        public int getResultCode() {
            return ((LinkageDeviceProto$PairEvent) this.instance).getResultCode();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$PairEventOrBuilder
        public boolean hasDevice() {
            return ((LinkageDeviceProto$PairEvent) this.instance).hasDevice();
        }

        public Builder mergeDevice(LinkageDeviceProto$AccountDeviceInfo linkageDeviceProto$AccountDeviceInfo) {
            copyOnWrite();
            ((LinkageDeviceProto$PairEvent) this.instance).mergeDevice(linkageDeviceProto$AccountDeviceInfo);
            return this;
        }

        public Builder setAction(LinkageDeviceProto$ACTION linkageDeviceProto$ACTION) {
            copyOnWrite();
            ((LinkageDeviceProto$PairEvent) this.instance).setAction(linkageDeviceProto$ACTION);
            return this;
        }

        public Builder setActionValue(int i) {
            copyOnWrite();
            ((LinkageDeviceProto$PairEvent) this.instance).setActionValue(i);
            return this;
        }

        public Builder setDevice(LinkageDeviceProto$AccountDeviceInfo linkageDeviceProto$AccountDeviceInfo) {
            copyOnWrite();
            ((LinkageDeviceProto$PairEvent) this.instance).setDevice(linkageDeviceProto$AccountDeviceInfo);
            return this;
        }

        public Builder setEventId(int i) {
            copyOnWrite();
            ((LinkageDeviceProto$PairEvent) this.instance).setEventId(i);
            return this;
        }

        public Builder setFlag(int i) {
            copyOnWrite();
            ((LinkageDeviceProto$PairEvent) this.instance).setFlag(i);
            return this;
        }

        public Builder setResultCode(int i) {
            copyOnWrite();
            ((LinkageDeviceProto$PairEvent) this.instance).setResultCode(i);
            return this;
        }

        private Builder() {
            super(LinkageDeviceProto$PairEvent.DEFAULT_INSTANCE);
        }

        public Builder setDevice(LinkageDeviceProto$AccountDeviceInfo.Builder builder) {
            copyOnWrite();
            ((LinkageDeviceProto$PairEvent) this.instance).setDevice(builder.build());
            return this;
        }
    }

    static {
        LinkageDeviceProto$PairEvent linkageDeviceProto$PairEvent = new LinkageDeviceProto$PairEvent();
        DEFAULT_INSTANCE = linkageDeviceProto$PairEvent;
        GeneratedMessageLite.registerDefaultInstance(LinkageDeviceProto$PairEvent.class, linkageDeviceProto$PairEvent);
    }

    private LinkageDeviceProto$PairEvent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDevice() {
        this.device_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventId() {
        this.eventId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFlag() {
        this.flag_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResultCode() {
        this.resultCode_ = 0;
    }

    public static LinkageDeviceProto$PairEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDevice(LinkageDeviceProto$AccountDeviceInfo linkageDeviceProto$AccountDeviceInfo) {
        linkageDeviceProto$AccountDeviceInfo.getClass();
        LinkageDeviceProto$AccountDeviceInfo linkageDeviceProto$AccountDeviceInfo2 = this.device_;
        if (linkageDeviceProto$AccountDeviceInfo2 == null || linkageDeviceProto$AccountDeviceInfo2 == LinkageDeviceProto$AccountDeviceInfo.getDefaultInstance()) {
            this.device_ = linkageDeviceProto$AccountDeviceInfo;
        } else {
            this.device_ = LinkageDeviceProto$AccountDeviceInfo.newBuilder(this.device_).mergeFrom(linkageDeviceProto$AccountDeviceInfo).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LinkageDeviceProto$PairEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LinkageDeviceProto$PairEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LinkageDeviceProto$PairEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LinkageDeviceProto$PairEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LinkageDeviceProto$PairEvent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(LinkageDeviceProto$ACTION linkageDeviceProto$ACTION) {
        this.action_ = linkageDeviceProto$ACTION.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionValue(int i) {
        this.action_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDevice(LinkageDeviceProto$AccountDeviceInfo linkageDeviceProto$AccountDeviceInfo) {
        linkageDeviceProto$AccountDeviceInfo.getClass();
        this.device_ = linkageDeviceProto$AccountDeviceInfo;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventId(int i) {
        this.eventId_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFlag(int i) {
        this.flag_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResultCode(int i) {
        this.resultCode_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = kya.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new LinkageDeviceProto$PairEvent();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0004\u0002\f\u0003ဉ\u0000\u0004\u0004\u0005\u0004", new Object[]{"bitField0_", "eventId_", "action_", "device_", "flag_", "resultCode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LinkageDeviceProto$PairEvent> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (LinkageDeviceProto$PairEvent.class) {
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

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$PairEventOrBuilder
    public LinkageDeviceProto$ACTION getAction() {
        LinkageDeviceProto$ACTION linkageDeviceProto$ACTIONForNumber = LinkageDeviceProto$ACTION.forNumber(this.action_);
        return linkageDeviceProto$ACTIONForNumber == null ? LinkageDeviceProto$ACTION.UNRECOGNIZED : linkageDeviceProto$ACTIONForNumber;
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$PairEventOrBuilder
    public int getActionValue() {
        return this.action_;
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$PairEventOrBuilder
    public LinkageDeviceProto$AccountDeviceInfo getDevice() {
        LinkageDeviceProto$AccountDeviceInfo linkageDeviceProto$AccountDeviceInfo = this.device_;
        return linkageDeviceProto$AccountDeviceInfo == null ? LinkageDeviceProto$AccountDeviceInfo.getDefaultInstance() : linkageDeviceProto$AccountDeviceInfo;
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$PairEventOrBuilder
    public int getEventId() {
        return this.eventId_;
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$PairEventOrBuilder
    public int getFlag() {
        return this.flag_;
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$PairEventOrBuilder
    public int getResultCode() {
        return this.resultCode_;
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$PairEventOrBuilder
    public boolean hasDevice() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(LinkageDeviceProto$PairEvent linkageDeviceProto$PairEvent) {
        return DEFAULT_INSTANCE.createBuilder(linkageDeviceProto$PairEvent);
    }

    public static LinkageDeviceProto$PairEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LinkageDeviceProto$PairEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LinkageDeviceProto$PairEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LinkageDeviceProto$PairEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LinkageDeviceProto$PairEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LinkageDeviceProto$PairEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LinkageDeviceProto$PairEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LinkageDeviceProto$PairEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LinkageDeviceProto$PairEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LinkageDeviceProto$PairEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LinkageDeviceProto$PairEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LinkageDeviceProto$PairEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LinkageDeviceProto$PairEvent parseFrom(InputStream inputStream) throws IOException {
        return (LinkageDeviceProto$PairEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LinkageDeviceProto$PairEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LinkageDeviceProto$PairEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LinkageDeviceProto$PairEvent parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LinkageDeviceProto$PairEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LinkageDeviceProto$PairEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LinkageDeviceProto$PairEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
