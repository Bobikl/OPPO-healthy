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
import com.google.protobuf.Internal;
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
public final class ConnectExtensionArgs extends GeneratedMessageV3 implements ConnectExtensionArgsOrBuilder {
    public static final int ADDBLACKLIST_FIELD_NUMBER = 2;
    public static final int FORCE_FIELD_NUMBER = 1;
    public static final int ISCLOSEALL_FIELD_NUMBER = 3;
    public static final int PID_FIELD_NUMBER = 5;
    public static final int PKG_FIELD_NUMBER = 4;
    private static final long serialVersionUID = 0;
    private boolean addBlacklist_;
    private boolean force_;
    private boolean isCloseAll_;
    private byte memoizedIsInitialized;
    private int pid_;
    private volatile Object pkg_;
    private static final ConnectExtensionArgs DEFAULT_INSTANCE = new ConnectExtensionArgs();
    private static final Parser<ConnectExtensionArgs> PARSER = new a();

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConnectExtensionArgsOrBuilder {
        private boolean addBlacklist_;
        private int bitField0_;
        private boolean force_;
        private boolean isCloseAll_;
        private int pid_;
        private Object pkg_;

        public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, a aVar) {
            this(builderParent);
        }

        private void buildPartial0(ConnectExtensionArgs connectExtensionArgs) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                connectExtensionArgs.force_ = this.force_;
            }
            if ((i & 2) != 0) {
                connectExtensionArgs.addBlacklist_ = this.addBlacklist_;
            }
            if ((i & 4) != 0) {
                connectExtensionArgs.isCloseAll_ = this.isCloseAll_;
            }
            if ((i & 8) != 0) {
                connectExtensionArgs.pkg_ = this.pkg_;
            }
            if ((i & 16) != 0) {
                connectExtensionArgs.pid_ = this.pid_;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return tz3.a;
        }

        public Builder clearAddBlacklist() {
            this.bitField0_ &= -3;
            this.addBlacklist_ = false;
            onChanged();
            return this;
        }

        public Builder clearForce() {
            this.bitField0_ &= -2;
            this.force_ = false;
            onChanged();
            return this;
        }

        public Builder clearIsCloseAll() {
            this.bitField0_ &= -5;
            this.isCloseAll_ = false;
            onChanged();
            return this;
        }

        public Builder clearPid() {
            this.bitField0_ &= -17;
            this.pid_ = 0;
            onChanged();
            return this;
        }

        public Builder clearPkg() {
            this.pkg_ = ConnectExtensionArgs.getDefaultInstance().getPkg();
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        @Override // com.oplus.pantaconnect.connection.ConnectExtensionArgsOrBuilder
        public boolean getAddBlacklist() {
            return this.addBlacklist_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return tz3.a;
        }

        @Override // com.oplus.pantaconnect.connection.ConnectExtensionArgsOrBuilder
        public boolean getForce() {
            return this.force_;
        }

        @Override // com.oplus.pantaconnect.connection.ConnectExtensionArgsOrBuilder
        public boolean getIsCloseAll() {
            return this.isCloseAll_;
        }

        @Override // com.oplus.pantaconnect.connection.ConnectExtensionArgsOrBuilder
        public int getPid() {
            return this.pid_;
        }

        @Override // com.oplus.pantaconnect.connection.ConnectExtensionArgsOrBuilder
        public String getPkg() {
            Object obj = this.pkg_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.pkg_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.connection.ConnectExtensionArgsOrBuilder
        public ByteString getPkgBytes() {
            Object obj = this.pkg_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.pkg_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return tz3.b.ensureFieldAccessorsInitialized(ConnectExtensionArgs.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setAddBlacklist(boolean z) {
            this.addBlacklist_ = z;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder setForce(boolean z) {
            this.force_ = z;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder setIsCloseAll(boolean z) {
            this.isCloseAll_ = z;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder setPid(int i) {
            this.pid_ = i;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder setPkg(String str) {
            str.getClass();
            this.pkg_ = str;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder setPkgBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.pkg_ = byteString;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public /* synthetic */ Builder(a aVar) {
            this();
        }

        private Builder() {
            this.pkg_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public ConnectExtensionArgs build() {
            ConnectExtensionArgs connectExtensionArgsBuildPartial = buildPartial();
            if (connectExtensionArgsBuildPartial.isInitialized()) {
                return connectExtensionArgsBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) connectExtensionArgsBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public ConnectExtensionArgs buildPartial() {
            ConnectExtensionArgs connectExtensionArgs = new ConnectExtensionArgs(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(connectExtensionArgs);
            }
            onBuilt();
            return connectExtensionArgs;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConnectExtensionArgs getDefaultInstanceForType() {
            return ConnectExtensionArgs.getDefaultInstance();
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

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.pkg_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.force_ = false;
            this.addBlacklist_ = false;
            this.isCloseAll_ = false;
            this.pkg_ = "";
            this.pid_ = 0;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4465clone() {
            return (Builder) super.mo4465clone();
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof ConnectExtensionArgs) {
                return mergeFrom((ConnectExtensionArgs) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(ConnectExtensionArgs connectExtensionArgs) {
            if (connectExtensionArgs == ConnectExtensionArgs.getDefaultInstance()) {
                return this;
            }
            if (connectExtensionArgs.getForce()) {
                setForce(connectExtensionArgs.getForce());
            }
            if (connectExtensionArgs.getAddBlacklist()) {
                setAddBlacklist(connectExtensionArgs.getAddBlacklist());
            }
            if (connectExtensionArgs.getIsCloseAll()) {
                setIsCloseAll(connectExtensionArgs.getIsCloseAll());
            }
            if (!connectExtensionArgs.getPkg().isEmpty()) {
                this.pkg_ = connectExtensionArgs.pkg_;
                this.bitField0_ |= 8;
                onChanged();
            }
            if (connectExtensionArgs.getPid() != 0) {
                setPid(connectExtensionArgs.getPid());
            }
            mergeUnknownFields(connectExtensionArgs.getUnknownFields());
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
                                this.force_ = codedInputStream.readBool();
                                this.bitField0_ |= 1;
                            } else if (tag == 16) {
                                this.addBlacklist_ = codedInputStream.readBool();
                                this.bitField0_ |= 2;
                            } else if (tag == 24) {
                                this.isCloseAll_ = codedInputStream.readBool();
                                this.bitField0_ |= 4;
                            } else if (tag == 34) {
                                this.pkg_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 8;
                            } else if (tag != 40) {
                                if (!parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.pid_ = codedInputStream.readInt32();
                                this.bitField0_ |= 16;
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

    public class a extends AbstractParser<ConnectExtensionArgs> {
        @Override // com.google.protobuf.Parser
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectExtensionArgs parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = ConnectExtensionArgs.newBuilder();
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

    public /* synthetic */ ConnectExtensionArgs(GeneratedMessageV3.Builder builder, a aVar) {
        this(builder);
    }

    public static ConnectExtensionArgs getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return tz3.a;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static ConnectExtensionArgs parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ConnectExtensionArgs) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ConnectExtensionArgs parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<ConnectExtensionArgs> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectExtensionArgs)) {
            return super.equals(obj);
        }
        ConnectExtensionArgs connectExtensionArgs = (ConnectExtensionArgs) obj;
        return getForce() == connectExtensionArgs.getForce() && getAddBlacklist() == connectExtensionArgs.getAddBlacklist() && getIsCloseAll() == connectExtensionArgs.getIsCloseAll() && getPkg().equals(connectExtensionArgs.getPkg()) && getPid() == connectExtensionArgs.getPid() && getUnknownFields().equals(connectExtensionArgs.getUnknownFields());
    }

    @Override // com.oplus.pantaconnect.connection.ConnectExtensionArgsOrBuilder
    public boolean getAddBlacklist() {
        return this.addBlacklist_;
    }

    @Override // com.oplus.pantaconnect.connection.ConnectExtensionArgsOrBuilder
    public boolean getForce() {
        return this.force_;
    }

    @Override // com.oplus.pantaconnect.connection.ConnectExtensionArgsOrBuilder
    public boolean getIsCloseAll() {
        return this.isCloseAll_;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<ConnectExtensionArgs> getParserForType() {
        return PARSER;
    }

    @Override // com.oplus.pantaconnect.connection.ConnectExtensionArgsOrBuilder
    public int getPid() {
        return this.pid_;
    }

    @Override // com.oplus.pantaconnect.connection.ConnectExtensionArgsOrBuilder
    public String getPkg() {
        Object obj = this.pkg_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.pkg_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.connection.ConnectExtensionArgsOrBuilder
    public ByteString getPkgBytes() {
        Object obj = this.pkg_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.pkg_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        boolean z = this.force_;
        int iComputeBoolSize = z ? CodedOutputStream.computeBoolSize(1, z) : 0;
        boolean z2 = this.addBlacklist_;
        if (z2) {
            iComputeBoolSize += CodedOutputStream.computeBoolSize(2, z2);
        }
        boolean z3 = this.isCloseAll_;
        if (z3) {
            iComputeBoolSize += CodedOutputStream.computeBoolSize(3, z3);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.pkg_)) {
            iComputeBoolSize += GeneratedMessageV3.computeStringSize(4, this.pkg_);
        }
        int i2 = this.pid_;
        if (i2 != 0) {
            iComputeBoolSize += CodedOutputStream.computeInt32Size(5, i2);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeBoolSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + ((getPid() + ((((getPkg().hashCode() + ((((Internal.hashBoolean(getIsCloseAll()) + ((((Internal.hashBoolean(getAddBlacklist()) + ((((Internal.hashBoolean(getForce()) + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return tz3.b.ensureFieldAccessorsInitialized(ConnectExtensionArgs.class, Builder.class);
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
        return new ConnectExtensionArgs();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        boolean z = this.force_;
        if (z) {
            codedOutputStream.writeBool(1, z);
        }
        boolean z2 = this.addBlacklist_;
        if (z2) {
            codedOutputStream.writeBool(2, z2);
        }
        boolean z3 = this.isCloseAll_;
        if (z3) {
            codedOutputStream.writeBool(3, z3);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.pkg_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.pkg_);
        }
        int i = this.pid_;
        if (i != 0) {
            codedOutputStream.writeInt32(5, i);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    private ConnectExtensionArgs(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.force_ = false;
        this.addBlacklist_ = false;
        this.isCloseAll_ = false;
        this.pkg_ = "";
        this.pid_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Builder newBuilder(ConnectExtensionArgs connectExtensionArgs) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(connectExtensionArgs);
    }

    public static ConnectExtensionArgs parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ConnectExtensionArgs parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ConnectExtensionArgs) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ConnectExtensionArgs parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public ConnectExtensionArgs getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        a aVar = null;
        return this == DEFAULT_INSTANCE ? new Builder(aVar) : new Builder(aVar).mergeFrom(this);
    }

    public static ConnectExtensionArgs parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static ConnectExtensionArgs parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent, null);
    }

    public static ConnectExtensionArgs parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static ConnectExtensionArgs parseFrom(InputStream inputStream) throws IOException {
        return (ConnectExtensionArgs) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    private ConnectExtensionArgs() {
        this.force_ = false;
        this.addBlacklist_ = false;
        this.isCloseAll_ = false;
        this.pkg_ = "";
        this.pid_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.pkg_ = "";
    }

    public static ConnectExtensionArgs parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ConnectExtensionArgs) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ConnectExtensionArgs parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ConnectExtensionArgs) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static ConnectExtensionArgs parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ConnectExtensionArgs) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
