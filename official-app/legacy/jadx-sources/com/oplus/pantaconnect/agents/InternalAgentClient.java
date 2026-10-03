package com.oplus.pantaconnect.agents;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public final class InternalAgentClient extends GeneratedMessageV3 implements InternalAgentClientOrBuilder {
    public static final int AGENTID_FIELD_NUMBER = 1;
    public static final int APPNAME_FIELD_NUMBER = 4;
    public static final int CHANNELNAME_FIELD_NUMBER = 5;
    public static final int CONNECTIONID_FIELD_NUMBER = 7;
    private static final InternalAgentClient DEFAULT_INSTANCE = new InternalAgentClient();
    private static final Parser<InternalAgentClient> PARSER = new AbstractParser<InternalAgentClient>() { // from class: com.oplus.pantaconnect.agents.InternalAgentClient.1
        @Override // com.google.protobuf.Parser
        public InternalAgentClient parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = InternalAgentClient.newBuilder();
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
    };
    public static final int PID_FIELD_NUMBER = 3;
    public static final int PKG_FIELD_NUMBER = 2;
    public static final int ROLE_FIELD_NUMBER = 6;
    private static final long serialVersionUID = 0;
    private volatile Object agentId_;
    private volatile Object appName_;
    private volatile Object channelName_;
    private long connectionId_;
    private byte memoizedIsInitialized;
    private int pid_;
    private volatile Object pkg_;
    private int role_;

    public static InternalAgentClient getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return Agents.internal_static_com_oplus_pantaconnect_agents_InternalAgentClient_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static InternalAgentClient parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (InternalAgentClient) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static InternalAgentClient parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<InternalAgentClient> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InternalAgentClient)) {
            return super.equals(obj);
        }
        InternalAgentClient internalAgentClient = (InternalAgentClient) obj;
        return getAgentId().equals(internalAgentClient.getAgentId()) && getPkg().equals(internalAgentClient.getPkg()) && getPid() == internalAgentClient.getPid() && getAppName().equals(internalAgentClient.getAppName()) && getChannelName().equals(internalAgentClient.getChannelName()) && this.role_ == internalAgentClient.role_ && getConnectionId() == internalAgentClient.getConnectionId() && getUnknownFields().equals(internalAgentClient.getUnknownFields());
    }

    @Override // com.oplus.pantaconnect.agents.InternalAgentClientOrBuilder
    public String getAgentId() {
        Object obj = this.agentId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.agentId_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.agents.InternalAgentClientOrBuilder
    public ByteString getAgentIdBytes() {
        Object obj = this.agentId_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.agentId_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.agents.InternalAgentClientOrBuilder
    public String getAppName() {
        Object obj = this.appName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.appName_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.agents.InternalAgentClientOrBuilder
    public ByteString getAppNameBytes() {
        Object obj = this.appName_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.appName_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.agents.InternalAgentClientOrBuilder
    public String getChannelName() {
        Object obj = this.channelName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.channelName_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.agents.InternalAgentClientOrBuilder
    public ByteString getChannelNameBytes() {
        Object obj = this.channelName_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.channelName_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.agents.InternalAgentClientOrBuilder
    public long getConnectionId() {
        return this.connectionId_;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<InternalAgentClient> getParserForType() {
        return PARSER;
    }

    @Override // com.oplus.pantaconnect.agents.InternalAgentClientOrBuilder
    public int getPid() {
        return this.pid_;
    }

    @Override // com.oplus.pantaconnect.agents.InternalAgentClientOrBuilder
    public String getPkg() {
        Object obj = this.pkg_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.pkg_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.agents.InternalAgentClientOrBuilder
    public ByteString getPkgBytes() {
        Object obj = this.pkg_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.pkg_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.agents.InternalAgentClientOrBuilder
    public Role getRole() {
        Role roleForNumber = Role.forNumber(this.role_);
        return roleForNumber == null ? Role.UNRECOGNIZED : roleForNumber;
    }

    @Override // com.oplus.pantaconnect.agents.InternalAgentClientOrBuilder
    public int getRoleValue() {
        return this.role_;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.agentId_) ? GeneratedMessageV3.computeStringSize(1, this.agentId_) : 0;
        if (!GeneratedMessageV3.isStringEmpty(this.pkg_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.pkg_);
        }
        int i2 = this.pid_;
        if (i2 != 0) {
            iComputeStringSize += CodedOutputStream.computeInt32Size(3, i2);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.appName_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.appName_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.channelName_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(5, this.channelName_);
        }
        if (this.role_ != Role.Provider.getNumber()) {
            iComputeStringSize += CodedOutputStream.computeEnumSize(6, this.role_);
        }
        long j2 = this.connectionId_;
        if (j2 != 0) {
            iComputeStringSize += CodedOutputStream.computeInt64Size(7, j2);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + ((Internal.hashLong(getConnectionId()) + cherry.carambola((((getChannelName().hashCode() + ((((getAppName().hashCode() + ((((getPid() + ((((getPkg().hashCode() + ((((getAgentId().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53, this.role_, 37, 7, 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return Agents.internal_static_com_oplus_pantaconnect_agents_InternalAgentClient_fieldAccessorTable.ensureFieldAccessorsInitialized(InternalAgentClient.class, Builder.class);
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
        return new InternalAgentClient();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!GeneratedMessageV3.isStringEmpty(this.agentId_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.agentId_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.pkg_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.pkg_);
        }
        int i = this.pid_;
        if (i != 0) {
            codedOutputStream.writeInt32(3, i);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.appName_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.appName_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.channelName_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 5, this.channelName_);
        }
        if (this.role_ != Role.Provider.getNumber()) {
            codedOutputStream.writeEnum(6, this.role_);
        }
        long j2 = this.connectionId_;
        if (j2 != 0) {
            codedOutputStream.writeInt64(7, j2);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements InternalAgentClientOrBuilder {
        private Object agentId_;
        private Object appName_;
        private int bitField0_;
        private Object channelName_;
        private long connectionId_;
        private int pid_;
        private Object pkg_;
        private int role_;

        private void buildPartial0(InternalAgentClient internalAgentClient) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                internalAgentClient.agentId_ = this.agentId_;
            }
            if ((i & 2) != 0) {
                internalAgentClient.pkg_ = this.pkg_;
            }
            if ((i & 4) != 0) {
                internalAgentClient.pid_ = this.pid_;
            }
            if ((i & 8) != 0) {
                internalAgentClient.appName_ = this.appName_;
            }
            if ((i & 16) != 0) {
                internalAgentClient.channelName_ = this.channelName_;
            }
            if ((i & 32) != 0) {
                internalAgentClient.role_ = this.role_;
            }
            if ((i & 64) != 0) {
                internalAgentClient.connectionId_ = this.connectionId_;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return Agents.internal_static_com_oplus_pantaconnect_agents_InternalAgentClient_descriptor;
        }

        public Builder clearAgentId() {
            this.agentId_ = InternalAgentClient.getDefaultInstance().getAgentId();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder clearAppName() {
            this.appName_ = InternalAgentClient.getDefaultInstance().getAppName();
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        public Builder clearChannelName() {
            this.channelName_ = InternalAgentClient.getDefaultInstance().getChannelName();
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }

        public Builder clearConnectionId() {
            this.bitField0_ &= -65;
            this.connectionId_ = 0L;
            onChanged();
            return this;
        }

        public Builder clearPid() {
            this.bitField0_ &= -5;
            this.pid_ = 0;
            onChanged();
            return this;
        }

        public Builder clearPkg() {
            this.pkg_ = InternalAgentClient.getDefaultInstance().getPkg();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder clearRole() {
            this.bitField0_ &= -33;
            this.role_ = 0;
            onChanged();
            return this;
        }

        @Override // com.oplus.pantaconnect.agents.InternalAgentClientOrBuilder
        public String getAgentId() {
            Object obj = this.agentId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.agentId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.agents.InternalAgentClientOrBuilder
        public ByteString getAgentIdBytes() {
            Object obj = this.agentId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.agentId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.agents.InternalAgentClientOrBuilder
        public String getAppName() {
            Object obj = this.appName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.appName_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.agents.InternalAgentClientOrBuilder
        public ByteString getAppNameBytes() {
            Object obj = this.appName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.appName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.agents.InternalAgentClientOrBuilder
        public String getChannelName() {
            Object obj = this.channelName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.channelName_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.agents.InternalAgentClientOrBuilder
        public ByteString getChannelNameBytes() {
            Object obj = this.channelName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.channelName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.agents.InternalAgentClientOrBuilder
        public long getConnectionId() {
            return this.connectionId_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return Agents.internal_static_com_oplus_pantaconnect_agents_InternalAgentClient_descriptor;
        }

        @Override // com.oplus.pantaconnect.agents.InternalAgentClientOrBuilder
        public int getPid() {
            return this.pid_;
        }

        @Override // com.oplus.pantaconnect.agents.InternalAgentClientOrBuilder
        public String getPkg() {
            Object obj = this.pkg_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.pkg_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.agents.InternalAgentClientOrBuilder
        public ByteString getPkgBytes() {
            Object obj = this.pkg_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.pkg_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.agents.InternalAgentClientOrBuilder
        public Role getRole() {
            Role roleForNumber = Role.forNumber(this.role_);
            return roleForNumber == null ? Role.UNRECOGNIZED : roleForNumber;
        }

        @Override // com.oplus.pantaconnect.agents.InternalAgentClientOrBuilder
        public int getRoleValue() {
            return this.role_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Agents.internal_static_com_oplus_pantaconnect_agents_InternalAgentClient_fieldAccessorTable.ensureFieldAccessorsInitialized(InternalAgentClient.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setAgentId(String str) {
            str.getClass();
            this.agentId_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder setAgentIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.agentId_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder setAppName(String str) {
            str.getClass();
            this.appName_ = str;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder setAppNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.appName_ = byteString;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder setChannelName(String str) {
            str.getClass();
            this.channelName_ = str;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder setChannelNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.channelName_ = byteString;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder setConnectionId(long j2) {
            this.connectionId_ = j2;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public Builder setPid(int i) {
            this.pid_ = i;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder setPkg(String str) {
            str.getClass();
            this.pkg_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder setPkgBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.pkg_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder setRole(Role role) {
            role.getClass();
            this.bitField0_ |= 32;
            this.role_ = role.getNumber();
            onChanged();
            return this;
        }

        public Builder setRoleValue(int i) {
            this.role_ = i;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        private Builder() {
            this.agentId_ = "";
            this.pkg_ = "";
            this.appName_ = "";
            this.channelName_ = "";
            this.role_ = 0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public InternalAgentClient build() {
            InternalAgentClient internalAgentClientBuildPartial = buildPartial();
            if (internalAgentClientBuildPartial.isInitialized()) {
                return internalAgentClientBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) internalAgentClientBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public InternalAgentClient buildPartial() {
            InternalAgentClient internalAgentClient = new InternalAgentClient(this);
            if (this.bitField0_ != 0) {
                buildPartial0(internalAgentClient);
            }
            onBuilt();
            return internalAgentClient;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public InternalAgentClient getDefaultInstanceForType() {
            return InternalAgentClient.getDefaultInstance();
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
            this.agentId_ = "";
            this.pkg_ = "";
            this.pid_ = 0;
            this.appName_ = "";
            this.channelName_ = "";
            this.role_ = 0;
            this.connectionId_ = 0L;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4465clone() {
            return (Builder) super.mo4465clone();
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof InternalAgentClient) {
                return mergeFrom((InternalAgentClient) message);
            }
            super.mergeFrom(message);
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.agentId_ = "";
            this.pkg_ = "";
            this.appName_ = "";
            this.channelName_ = "";
            this.role_ = 0;
        }

        public Builder mergeFrom(InternalAgentClient internalAgentClient) {
            if (internalAgentClient == InternalAgentClient.getDefaultInstance()) {
                return this;
            }
            if (!internalAgentClient.getAgentId().isEmpty()) {
                this.agentId_ = internalAgentClient.agentId_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (!internalAgentClient.getPkg().isEmpty()) {
                this.pkg_ = internalAgentClient.pkg_;
                this.bitField0_ |= 2;
                onChanged();
            }
            if (internalAgentClient.getPid() != 0) {
                setPid(internalAgentClient.getPid());
            }
            if (!internalAgentClient.getAppName().isEmpty()) {
                this.appName_ = internalAgentClient.appName_;
                this.bitField0_ |= 8;
                onChanged();
            }
            if (!internalAgentClient.getChannelName().isEmpty()) {
                this.channelName_ = internalAgentClient.channelName_;
                this.bitField0_ |= 16;
                onChanged();
            }
            if (internalAgentClient.role_ != 0) {
                setRoleValue(internalAgentClient.getRoleValue());
            }
            if (internalAgentClient.getConnectionId() != 0) {
                setConnectionId(internalAgentClient.getConnectionId());
            }
            mergeUnknownFields(internalAgentClient.getUnknownFields());
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
                            if (tag == 10) {
                                this.agentId_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 1;
                            } else if (tag == 18) {
                                this.pkg_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 2;
                            } else if (tag == 24) {
                                this.pid_ = codedInputStream.readInt32();
                                this.bitField0_ |= 4;
                            } else if (tag == 34) {
                                this.appName_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 8;
                            } else if (tag == 42) {
                                this.channelName_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 16;
                            } else if (tag == 48) {
                                this.role_ = codedInputStream.readEnum();
                                this.bitField0_ |= 32;
                            } else if (tag != 56) {
                                if (!parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.connectionId_ = codedInputStream.readInt64();
                                this.bitField0_ |= 64;
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

    private InternalAgentClient(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.agentId_ = "";
        this.pkg_ = "";
        this.pid_ = 0;
        this.appName_ = "";
        this.channelName_ = "";
        this.role_ = 0;
        this.connectionId_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Builder newBuilder(InternalAgentClient internalAgentClient) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(internalAgentClient);
    }

    public static InternalAgentClient parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static InternalAgentClient parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (InternalAgentClient) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static InternalAgentClient parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public InternalAgentClient getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static InternalAgentClient parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static InternalAgentClient parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static InternalAgentClient parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static InternalAgentClient parseFrom(InputStream inputStream) throws IOException {
        return (InternalAgentClient) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static InternalAgentClient parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (InternalAgentClient) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    private InternalAgentClient() {
        this.agentId_ = "";
        this.pkg_ = "";
        this.pid_ = 0;
        this.appName_ = "";
        this.channelName_ = "";
        this.role_ = 0;
        this.connectionId_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
        this.agentId_ = "";
        this.pkg_ = "";
        this.appName_ = "";
        this.channelName_ = "";
        this.role_ = 0;
    }

    public static InternalAgentClient parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (InternalAgentClient) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static InternalAgentClient parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (InternalAgentClient) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
