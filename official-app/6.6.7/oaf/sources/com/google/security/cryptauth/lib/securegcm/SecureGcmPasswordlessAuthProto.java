package com.google.security.cryptauth.lib.securegcm;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public final class SecureGcmPasswordlessAuthProto {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_securegcm_IdentityAssertion_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_securegcm_IdentityAssertion_fieldAccessorTable;

    public static final class IdentityAssertion extends GeneratedMessageV3 implements IdentityAssertionOrBuilder {
        public static final int BROWSER_DATA_HASH_FIELD_NUMBER = 1;
        public static final int COUNTER_FIELD_NUMBER = 2;
        private static final IdentityAssertion DEFAULT_INSTANCE = new IdentityAssertion();

        @Deprecated
        public static final Parser<IdentityAssertion> PARSER = new AbstractParser<IdentityAssertion>() { // from class: com.google.security.cryptauth.lib.securegcm.SecureGcmPasswordlessAuthProto.IdentityAssertion.1
            @Override // com.google.protobuf.Parser
            public IdentityAssertion parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new IdentityAssertion(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int USER_APPROVAL_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString browserDataHash_;
        private long counter_;
        private byte memoizedIsInitialized;
        private int userApproval_;

        public static IdentityAssertion getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SecureGcmPasswordlessAuthProto.internal_static_securegcm_IdentityAssertion_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static IdentityAssertion parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (IdentityAssertion) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static IdentityAssertion parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<IdentityAssertion> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof IdentityAssertion)) {
                return super.equals(obj);
            }
            IdentityAssertion identityAssertion = (IdentityAssertion) obj;
            boolean z = hasBrowserDataHash() == identityAssertion.hasBrowserDataHash();
            if (hasBrowserDataHash()) {
                z = z && getBrowserDataHash().equals(identityAssertion.getBrowserDataHash());
            }
            boolean z2 = z && hasCounter() == identityAssertion.hasCounter();
            if (hasCounter()) {
                z2 = z2 && getCounter() == identityAssertion.getCounter();
            }
            boolean z3 = z2 && hasUserApproval() == identityAssertion.hasUserApproval();
            if (hasUserApproval()) {
                z3 = z3 && getUserApproval() == identityAssertion.getUserApproval();
            }
            return z3 && this.unknownFields.equals(identityAssertion.unknownFields);
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmPasswordlessAuthProto.IdentityAssertionOrBuilder
        public ByteString getBrowserDataHash() {
            return this.browserDataHash_;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmPasswordlessAuthProto.IdentityAssertionOrBuilder
        public long getCounter() {
            return this.counter_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<IdentityAssertion> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeBytesSize = (this.bitField0_ & 1) == 1 ? 0 + CodedOutputStream.computeBytesSize(1, this.browserDataHash_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeBytesSize += CodedOutputStream.computeInt64Size(2, this.counter_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeBytesSize += CodedOutputStream.computeInt32Size(3, this.userApproval_);
            }
            int serializedSize = iComputeBytesSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmPasswordlessAuthProto.IdentityAssertionOrBuilder
        public int getUserApproval() {
            return this.userApproval_;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmPasswordlessAuthProto.IdentityAssertionOrBuilder
        public boolean hasBrowserDataHash() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmPasswordlessAuthProto.IdentityAssertionOrBuilder
        public boolean hasCounter() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmPasswordlessAuthProto.IdentityAssertionOrBuilder
        public boolean hasUserApproval() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptorForType().hashCode() + 779;
            if (hasBrowserDataHash()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getBrowserDataHash().hashCode();
            }
            if (hasCounter()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + Internal.hashLong(getCounter());
            }
            if (hasUserApproval()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getUserApproval();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SecureGcmPasswordlessAuthProto.internal_static_securegcm_IdentityAssertion_fieldAccessorTable.ensureFieldAccessorsInitialized(IdentityAssertion.class, Builder.class);
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

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeBytes(1, this.browserDataHash_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt64(2, this.counter_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeInt32(3, this.userApproval_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements IdentityAssertionOrBuilder {
            private int bitField0_;
            private ByteString browserDataHash_;
            private long counter_;
            private int userApproval_;

            public static final Descriptors.Descriptor getDescriptor() {
                return SecureGcmPasswordlessAuthProto.internal_static_securegcm_IdentityAssertion_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder clearBrowserDataHash() {
                this.bitField0_ &= -2;
                this.browserDataHash_ = IdentityAssertion.getDefaultInstance().getBrowserDataHash();
                onChanged();
                return this;
            }

            public Builder clearCounter() {
                this.bitField0_ &= -3;
                this.counter_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearUserApproval() {
                this.bitField0_ &= -5;
                this.userApproval_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmPasswordlessAuthProto.IdentityAssertionOrBuilder
            public ByteString getBrowserDataHash() {
                return this.browserDataHash_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmPasswordlessAuthProto.IdentityAssertionOrBuilder
            public long getCounter() {
                return this.counter_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SecureGcmPasswordlessAuthProto.internal_static_securegcm_IdentityAssertion_descriptor;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmPasswordlessAuthProto.IdentityAssertionOrBuilder
            public int getUserApproval() {
                return this.userApproval_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmPasswordlessAuthProto.IdentityAssertionOrBuilder
            public boolean hasBrowserDataHash() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmPasswordlessAuthProto.IdentityAssertionOrBuilder
            public boolean hasCounter() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmPasswordlessAuthProto.IdentityAssertionOrBuilder
            public boolean hasUserApproval() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SecureGcmPasswordlessAuthProto.internal_static_securegcm_IdentityAssertion_fieldAccessorTable.ensureFieldAccessorsInitialized(IdentityAssertion.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setBrowserDataHash(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.browserDataHash_ = byteString;
                onChanged();
                return this;
            }

            public Builder setCounter(long j) {
                this.bitField0_ |= 2;
                this.counter_ = j;
                onChanged();
                return this;
            }

            public Builder setUserApproval(int i) {
                this.bitField0_ |= 4;
                this.userApproval_ = i;
                onChanged();
                return this;
            }

            private Builder() {
                this.browserDataHash_ = ByteString.EMPTY;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public IdentityAssertion build() {
                IdentityAssertion identityAssertionBuildPartial = buildPartial();
                if (identityAssertionBuildPartial.isInitialized()) {
                    return identityAssertionBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) identityAssertionBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public IdentityAssertion buildPartial() {
                IdentityAssertion identityAssertion = new IdentityAssertion(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                identityAssertion.browserDataHash_ = this.browserDataHash_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                identityAssertion.counter_ = this.counter_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                identityAssertion.userApproval_ = this.userApproval_;
                identityAssertion.bitField0_ = i2;
                onBuilt();
                return identityAssertion;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public IdentityAssertion getDefaultInstanceForType() {
                return IdentityAssertion.getDefaultInstance();
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
                this.browserDataHash_ = ByteString.EMPTY;
                int i = this.bitField0_ & (-2);
                this.counter_ = 0L;
                this.userApproval_ = 0;
                this.bitField0_ = i & (-3) & (-5);
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.browserDataHash_ = ByteString.EMPTY;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            public Builder clone() {
                return (Builder) super.clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof IdentityAssertion) {
                    return mergeFrom((IdentityAssertion) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(IdentityAssertion identityAssertion) {
                if (identityAssertion == IdentityAssertion.getDefaultInstance()) {
                    return this;
                }
                if (identityAssertion.hasBrowserDataHash()) {
                    setBrowserDataHash(identityAssertion.getBrowserDataHash());
                }
                if (identityAssertion.hasCounter()) {
                    setCounter(identityAssertion.getCounter());
                }
                if (identityAssertion.hasUserApproval()) {
                    setUserApproval(identityAssertion.getUserApproval());
                }
                mergeUnknownFields(((GeneratedMessageV3) identityAssertion).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                IdentityAssertion identityAssertion = null;
                try {
                    try {
                        IdentityAssertion partialFrom = IdentityAssertion.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        IdentityAssertion identityAssertion2 = (IdentityAssertion) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            identityAssertion = identityAssertion2;
                            if (identityAssertion != null) {
                                mergeFrom(identityAssertion);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (identityAssertion != null) {
                        mergeFrom(identityAssertion);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(IdentityAssertion identityAssertion) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(identityAssertion);
        }

        public static IdentityAssertion parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private IdentityAssertion(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static IdentityAssertion parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (IdentityAssertion) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static IdentityAssertion parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public IdentityAssertion getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static IdentityAssertion parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private IdentityAssertion() {
            this.memoizedIsInitialized = (byte) -1;
            this.browserDataHash_ = ByteString.EMPTY;
            this.counter_ = 0L;
            this.userApproval_ = 0;
        }

        public static IdentityAssertion parseFrom(InputStream inputStream) throws IOException {
            return (IdentityAssertion) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static IdentityAssertion parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (IdentityAssertion) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static IdentityAssertion parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (IdentityAssertion) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        private IdentityAssertion(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.bitField0_ |= 1;
                                    this.browserDataHash_ = codedInputStream.readBytes();
                                } else if (tag == 16) {
                                    this.bitField0_ |= 2;
                                    this.counter_ = codedInputStream.readInt64();
                                } else if (tag != 24) {
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.bitField0_ |= 4;
                                    this.userApproval_ = codedInputStream.readInt32();
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.setUnfinishedMessage(this);
                        }
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = builderNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static IdentityAssertion parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (IdentityAssertion) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface IdentityAssertionOrBuilder extends MessageOrBuilder {
        ByteString getBrowserDataHash();

        long getCounter();

        int getUserApproval();

        boolean hasBrowserDataHash();

        boolean hasCounter();

        boolean hasUserApproval();
    }

    static {
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n passwordless_auth_payloads.proto\u0012\tsecuregcm\"V\n\u0011IdentityAssertion\u0012\u0019\n\u0011browser_data_hash\u0018\u0001 \u0001(\f\u0012\u000f\n\u0007counter\u0018\u0002 \u0001(\u0003\u0012\u0015\n\ruser_approval\u0018\u0003 \u0001(\u0005BT\n+com.google.security.cryptauth.lib.securegcmB\u001eSecureGcmPasswordlessAuthProto¢\u0002\u0004SGCM"}, new Descriptors.FileDescriptor[0], new Descriptors.FileDescriptor.InternalDescriptorAssigner() { // from class: com.google.security.cryptauth.lib.securegcm.SecureGcmPasswordlessAuthProto.1
            @Override // com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner
            public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor fileDescriptor) {
                Descriptors.FileDescriptor unused = SecureGcmPasswordlessAuthProto.descriptor = fileDescriptor;
                return null;
            }
        });
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_securegcm_IdentityAssertion_descriptor = descriptor2;
        internal_static_securegcm_IdentityAssertion_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"BrowserDataHash", "Counter", "UserApproval"});
    }

    private SecureGcmPasswordlessAuthProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
