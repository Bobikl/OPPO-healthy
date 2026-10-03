package com.oplus.pantaconnect.connection;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.oplus.aiunit.vision.tz3;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public final class GlobalDeviceConnectionItem extends GeneratedMessageV3 implements GlobalDeviceConnectionItemOrBuilder {
    public static final int ADDRESS_FIELD_NUMBER = 3;
    public static final int CHANNELTYPE_FIELD_NUMBER = 2;
    public static final int CONNECTTYPE_FIELD_NUMBER = 1;
    public static final int IP_FIELD_NUMBER = 4;
    public static final int SSID_FIELD_NUMBER = 5;
    public static final int VLINKTYPE_FIELD_NUMBER = 6;
    private static final long serialVersionUID = 0;
    private volatile Object address_;
    private int channelType_;
    private int connectType_;
    private volatile Object ip_;
    private byte memoizedIsInitialized;
    private volatile Object ssid_;
    private int vLinkType_;
    private static final GlobalDeviceConnectionItem DEFAULT_INSTANCE = new GlobalDeviceConnectionItem();
    private static final Parser<GlobalDeviceConnectionItem> PARSER = new a();

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GlobalDeviceConnectionItemOrBuilder {
        private Object address_;
        private int bitField0_;
        private int channelType_;
        private int connectType_;
        private Object ip_;
        private Object ssid_;
        private int vLinkType_;

        public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, a aVar) {
            this(builderParent);
        }

        private void buildPartial0(GlobalDeviceConnectionItem globalDeviceConnectionItem) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                globalDeviceConnectionItem.connectType_ = this.connectType_;
            }
            if ((i & 2) != 0) {
                globalDeviceConnectionItem.channelType_ = this.channelType_;
            }
            if ((i & 4) != 0) {
                globalDeviceConnectionItem.address_ = this.address_;
            }
            if ((i & 8) != 0) {
                globalDeviceConnectionItem.ip_ = this.ip_;
            }
            if ((i & 16) != 0) {
                globalDeviceConnectionItem.ssid_ = this.ssid_;
            }
            if ((i & 32) != 0) {
                globalDeviceConnectionItem.vLinkType_ = this.vLinkType_;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return tz3.g;
        }

        public Builder clearAddress() {
            this.address_ = GlobalDeviceConnectionItem.getDefaultInstance().getAddress();
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public Builder clearChannelType() {
            this.bitField0_ &= -3;
            this.channelType_ = 0;
            onChanged();
            return this;
        }

        public Builder clearConnectType() {
            this.bitField0_ &= -2;
            this.connectType_ = 0;
            onChanged();
            return this;
        }

        public Builder clearIp() {
            this.ip_ = GlobalDeviceConnectionItem.getDefaultInstance().getIp();
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        public Builder clearSsid() {
            this.ssid_ = GlobalDeviceConnectionItem.getDefaultInstance().getSsid();
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }

        public Builder clearVLinkType() {
            this.bitField0_ &= -33;
            this.vLinkType_ = 0;
            onChanged();
            return this;
        }

        @Override // com.oplus.pantaconnect.connection.GlobalDeviceConnectionItemOrBuilder
        public String getAddress() {
            Object obj = this.address_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.address_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.connection.GlobalDeviceConnectionItemOrBuilder
        public ByteString getAddressBytes() {
            Object obj = this.address_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.address_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.connection.GlobalDeviceConnectionItemOrBuilder
        public int getChannelType() {
            return this.channelType_;
        }

        @Override // com.oplus.pantaconnect.connection.GlobalDeviceConnectionItemOrBuilder
        public int getConnectType() {
            return this.connectType_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return tz3.g;
        }

        @Override // com.oplus.pantaconnect.connection.GlobalDeviceConnectionItemOrBuilder
        public String getIp() {
            Object obj = this.ip_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ip_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.connection.GlobalDeviceConnectionItemOrBuilder
        public ByteString getIpBytes() {
            Object obj = this.ip_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ip_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.connection.GlobalDeviceConnectionItemOrBuilder
        public String getSsid() {
            Object obj = this.ssid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ssid_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.connection.GlobalDeviceConnectionItemOrBuilder
        public ByteString getSsidBytes() {
            Object obj = this.ssid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ssid_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.connection.GlobalDeviceConnectionItemOrBuilder
        public int getVLinkType() {
            return this.vLinkType_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return tz3.h.ensureFieldAccessorsInitialized(GlobalDeviceConnectionItem.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setAddress(String str) {
            str.getClass();
            this.address_ = str;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder setAddressBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.address_ = byteString;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder setChannelType(int i) {
            this.channelType_ = i;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder setConnectType(int i) {
            this.connectType_ = i;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder setIp(String str) {
            str.getClass();
            this.ip_ = str;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder setIpBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.ip_ = byteString;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder setSsid(String str) {
            str.getClass();
            this.ssid_ = str;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder setSsidBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.ssid_ = byteString;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder setVLinkType(int i) {
            this.vLinkType_ = i;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public /* synthetic */ Builder(a aVar) {
            this();
        }

        private Builder() {
            this.address_ = "";
            this.ip_ = "";
            this.ssid_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public GlobalDeviceConnectionItem build() {
            GlobalDeviceConnectionItem globalDeviceConnectionItemBuildPartial = buildPartial();
            if (globalDeviceConnectionItemBuildPartial.isInitialized()) {
                return globalDeviceConnectionItemBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) globalDeviceConnectionItemBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public GlobalDeviceConnectionItem buildPartial() {
            GlobalDeviceConnectionItem globalDeviceConnectionItem = new GlobalDeviceConnectionItem(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(globalDeviceConnectionItem);
            }
            onBuilt();
            return globalDeviceConnectionItem;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GlobalDeviceConnectionItem getDefaultInstanceForType() {
            return GlobalDeviceConnectionItem.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.setField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.connectType_ = 0;
            this.channelType_ = 0;
            this.address_ = "";
            this.ip_ = "";
            this.ssid_ = "";
            this.vLinkType_ = 0;
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.address_ = "";
            this.ip_ = "";
            this.ssid_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4465clone() {
            return (Builder) super.mo4465clone();
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof GlobalDeviceConnectionItem) {
                return mergeFrom((GlobalDeviceConnectionItem) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(GlobalDeviceConnectionItem globalDeviceConnectionItem) {
            if (globalDeviceConnectionItem == GlobalDeviceConnectionItem.getDefaultInstance()) {
                return this;
            }
            if (globalDeviceConnectionItem.getConnectType() != 0) {
                setConnectType(globalDeviceConnectionItem.getConnectType());
            }
            if (globalDeviceConnectionItem.getChannelType() != 0) {
                setChannelType(globalDeviceConnectionItem.getChannelType());
            }
            if (!globalDeviceConnectionItem.getAddress().isEmpty()) {
                this.address_ = globalDeviceConnectionItem.address_;
                this.bitField0_ |= 4;
                onChanged();
            }
            if (!globalDeviceConnectionItem.getIp().isEmpty()) {
                this.ip_ = globalDeviceConnectionItem.ip_;
                this.bitField0_ |= 8;
                onChanged();
            }
            if (!globalDeviceConnectionItem.getSsid().isEmpty()) {
                this.ssid_ = globalDeviceConnectionItem.ssid_;
                this.bitField0_ |= 16;
                onChanged();
            }
            if (globalDeviceConnectionItem.getVLinkType() != 0) {
                setVLinkType(globalDeviceConnectionItem.getVLinkType());
            }
            mergeUnknownFields(globalDeviceConnectionItem.getUnknownFields());
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            extensionRegistryLite.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.connectType_ = codedInputStream.readInt32();
                                this.bitField0_ |= 1;
                            } else if (tag == 16) {
                                this.channelType_ = codedInputStream.readInt32();
                                this.bitField0_ |= 2;
                            } else if (tag == 26) {
                                this.address_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 4;
                            } else if (tag == 34) {
                                this.ip_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 8;
                            } else if (tag == 42) {
                                this.ssid_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 16;
                            } else if (tag != 48) {
                                if (!parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.vLinkType_ = codedInputStream.readInt32();
                                this.bitField0_ |= 32;
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e2) {
                        throw e2.unwrapIOException();
                    }
                } catch (Throwable th) {
                    onChanged();
                    throw th;
                }
            }
            onChanged();
            return this;
        }
    }

    public class a extends AbstractParser<GlobalDeviceConnectionItem> {
        @Override // com.google.protobuf.Parser
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GlobalDeviceConnectionItem parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = GlobalDeviceConnectionItem.newBuilder();
            try {
                builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                return builderNewBuilder.buildPartial();
            } catch (InvalidProtocolBufferException e2) {
                throw e2.setUnfinishedMessage(builderNewBuilder.buildPartial());
            } catch (UninitializedMessageException e3) {
                throw e3.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
            } catch (IOException e4) {
                throw new InvalidProtocolBufferException(e4).setUnfinishedMessage(builderNewBuilder.buildPartial());
            }
        }
    }

    public /* synthetic */ GlobalDeviceConnectionItem(GeneratedMessageV3.Builder builder, a aVar) {
        this(builder);
    }

    public static GlobalDeviceConnectionItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return tz3.g;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static GlobalDeviceConnectionItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GlobalDeviceConnectionItem) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static GlobalDeviceConnectionItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<GlobalDeviceConnectionItem> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GlobalDeviceConnectionItem)) {
            return super.equals(obj);
        }
        GlobalDeviceConnectionItem globalDeviceConnectionItem = (GlobalDeviceConnectionItem) obj;
        return getConnectType() == globalDeviceConnectionItem.getConnectType() && getChannelType() == globalDeviceConnectionItem.getChannelType() && getAddress().equals(globalDeviceConnectionItem.getAddress()) && getIp().equals(globalDeviceConnectionItem.getIp()) && getSsid().equals(globalDeviceConnectionItem.getSsid()) && getVLinkType() == globalDeviceConnectionItem.getVLinkType() && getUnknownFields().equals(globalDeviceConnectionItem.getUnknownFields());
    }

    @Override // com.oplus.pantaconnect.connection.GlobalDeviceConnectionItemOrBuilder
    public String getAddress() {
        Object obj = this.address_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.address_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.connection.GlobalDeviceConnectionItemOrBuilder
    public ByteString getAddressBytes() {
        Object obj = this.address_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.address_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.connection.GlobalDeviceConnectionItemOrBuilder
    public int getChannelType() {
        return this.channelType_;
    }

    @Override // com.oplus.pantaconnect.connection.GlobalDeviceConnectionItemOrBuilder
    public int getConnectType() {
        return this.connectType_;
    }

    @Override // com.oplus.pantaconnect.connection.GlobalDeviceConnectionItemOrBuilder
    public String getIp() {
        Object obj = this.ip_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.ip_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.connection.GlobalDeviceConnectionItemOrBuilder
    public ByteString getIpBytes() {
        Object obj = this.ip_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.ip_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<GlobalDeviceConnectionItem> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = this.connectType_;
        int iComputeInt32Size = i2 != 0 ? CodedOutputStream.computeInt32Size(1, i2) : 0;
        int i3 = this.channelType_;
        if (i3 != 0) {
            iComputeInt32Size += CodedOutputStream.computeInt32Size(2, i3);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.address_)) {
            iComputeInt32Size += GeneratedMessageV3.computeStringSize(3, this.address_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.ip_)) {
            iComputeInt32Size += GeneratedMessageV3.computeStringSize(4, this.ip_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.ssid_)) {
            iComputeInt32Size += GeneratedMessageV3.computeStringSize(5, this.ssid_);
        }
        int i4 = this.vLinkType_;
        if (i4 != 0) {
            iComputeInt32Size += CodedOutputStream.computeInt32Size(6, i4);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeInt32Size;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.oplus.pantaconnect.connection.GlobalDeviceConnectionItemOrBuilder
    public String getSsid() {
        Object obj = this.ssid_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.ssid_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.connection.GlobalDeviceConnectionItemOrBuilder
    public ByteString getSsidBytes() {
        Object obj = this.ssid_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.ssid_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.connection.GlobalDeviceConnectionItemOrBuilder
    public int getVLinkType() {
        return this.vLinkType_;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + ((getVLinkType() + ((((getSsid().hashCode() + ((((getIp().hashCode() + ((((getAddress().hashCode() + ((((getChannelType() + ((((getConnectType() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return tz3.h.ensureFieldAccessorsInitialized(GlobalDeviceConnectionItem.class, Builder.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new GlobalDeviceConnectionItem();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i = this.connectType_;
        if (i != 0) {
            codedOutputStream.writeInt32(1, i);
        }
        int i2 = this.channelType_;
        if (i2 != 0) {
            codedOutputStream.writeInt32(2, i2);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.address_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.address_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.ip_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.ip_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.ssid_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 5, this.ssid_);
        }
        int i3 = this.vLinkType_;
        if (i3 != 0) {
            codedOutputStream.writeInt32(6, i3);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    private GlobalDeviceConnectionItem(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.connectType_ = 0;
        this.channelType_ = 0;
        this.address_ = "";
        this.ip_ = "";
        this.ssid_ = "";
        this.vLinkType_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Builder newBuilder(GlobalDeviceConnectionItem globalDeviceConnectionItem) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(globalDeviceConnectionItem);
    }

    public static GlobalDeviceConnectionItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static GlobalDeviceConnectionItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GlobalDeviceConnectionItem) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static GlobalDeviceConnectionItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public GlobalDeviceConnectionItem getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        a aVar = null;
        return this == DEFAULT_INSTANCE ? new Builder(aVar) : new Builder(aVar).mergeFrom(this);
    }

    public static GlobalDeviceConnectionItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static GlobalDeviceConnectionItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent, null);
    }

    public static GlobalDeviceConnectionItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static GlobalDeviceConnectionItem parseFrom(InputStream inputStream) throws IOException {
        return (GlobalDeviceConnectionItem) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static GlobalDeviceConnectionItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GlobalDeviceConnectionItem) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    private GlobalDeviceConnectionItem() {
        this.connectType_ = 0;
        this.channelType_ = 0;
        this.address_ = "";
        this.ip_ = "";
        this.ssid_ = "";
        this.vLinkType_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.address_ = "";
        this.ip_ = "";
        this.ssid_ = "";
    }

    public static GlobalDeviceConnectionItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GlobalDeviceConnectionItem) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static GlobalDeviceConnectionItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GlobalDeviceConnectionItem) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
