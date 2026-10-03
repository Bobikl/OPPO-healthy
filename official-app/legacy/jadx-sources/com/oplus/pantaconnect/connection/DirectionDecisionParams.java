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
public final class DirectionDecisionParams extends GeneratedMessageV3 implements DirectionDecisionParamsOrBuilder {
    public static final int ADVFREQ_FIELD_NUMBER = 2;
    public static final int DEVICEID_FIELD_NUMBER = 6;
    public static final int DEVICEKSC_FIELD_NUMBER = 8;
    public static final int KSCALIAS_FIELD_NUMBER = 7;
    public static final int MACADDRESS_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 9;
    public static final int PASSWORD_FIELD_NUMBER = 10;
    public static final int REMOTEIP_FIELD_NUMBER = 3;
    public static final int SSID_FIELD_NUMBER = 4;
    public static final int TAG_FIELD_NUMBER = 5;
    private static final long serialVersionUID = 0;
    private volatile Object advFreq_;
    private volatile Object deviceId_;
    private volatile Object deviceKsc_;
    private volatile Object kscAlias_;
    private volatile Object macAddress_;
    private byte memoizedIsInitialized;
    private volatile Object name_;
    private volatile Object password_;
    private volatile Object remoteIp_;
    private volatile Object ssid_;
    private volatile Object tag_;
    private static final DirectionDecisionParams DEFAULT_INSTANCE = new DirectionDecisionParams();
    private static final Parser<DirectionDecisionParams> PARSER = new a();

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DirectionDecisionParamsOrBuilder {
        private Object advFreq_;
        private int bitField0_;
        private Object deviceId_;
        private Object deviceKsc_;
        private Object kscAlias_;
        private Object macAddress_;
        private Object name_;
        private Object password_;
        private Object remoteIp_;
        private Object ssid_;
        private Object tag_;

        public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, a aVar) {
            this(builderParent);
        }

        private void buildPartial0(DirectionDecisionParams directionDecisionParams) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                directionDecisionParams.macAddress_ = this.macAddress_;
            }
            if ((i & 2) != 0) {
                directionDecisionParams.advFreq_ = this.advFreq_;
            }
            if ((i & 4) != 0) {
                directionDecisionParams.remoteIp_ = this.remoteIp_;
            }
            if ((i & 8) != 0) {
                directionDecisionParams.ssid_ = this.ssid_;
            }
            if ((i & 16) != 0) {
                directionDecisionParams.tag_ = this.tag_;
            }
            if ((i & 32) != 0) {
                directionDecisionParams.deviceId_ = this.deviceId_;
            }
            if ((i & 64) != 0) {
                directionDecisionParams.kscAlias_ = this.kscAlias_;
            }
            if ((i & 128) != 0) {
                directionDecisionParams.deviceKsc_ = this.deviceKsc_;
            }
            if ((i & 256) != 0) {
                directionDecisionParams.name_ = this.name_;
            }
            if ((i & 512) != 0) {
                directionDecisionParams.password_ = this.password_;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return tz3.y;
        }

        public Builder clearAdvFreq() {
            this.advFreq_ = DirectionDecisionParams.getDefaultInstance().getAdvFreq();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder clearDeviceId() {
            this.deviceId_ = DirectionDecisionParams.getDefaultInstance().getDeviceId();
            this.bitField0_ &= -33;
            onChanged();
            return this;
        }

        public Builder clearDeviceKsc() {
            this.deviceKsc_ = DirectionDecisionParams.getDefaultInstance().getDeviceKsc();
            this.bitField0_ &= -129;
            onChanged();
            return this;
        }

        public Builder clearKscAlias() {
            this.kscAlias_ = DirectionDecisionParams.getDefaultInstance().getKscAlias();
            this.bitField0_ &= -65;
            onChanged();
            return this;
        }

        public Builder clearMacAddress() {
            this.macAddress_ = DirectionDecisionParams.getDefaultInstance().getMacAddress();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder clearName() {
            this.name_ = DirectionDecisionParams.getDefaultInstance().getName();
            this.bitField0_ &= -257;
            onChanged();
            return this;
        }

        public Builder clearPassword() {
            this.password_ = DirectionDecisionParams.getDefaultInstance().getPassword();
            this.bitField0_ &= -513;
            onChanged();
            return this;
        }

        public Builder clearRemoteIp() {
            this.remoteIp_ = DirectionDecisionParams.getDefaultInstance().getRemoteIp();
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public Builder clearSsid() {
            this.ssid_ = DirectionDecisionParams.getDefaultInstance().getSsid();
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        public Builder clearTag() {
            this.tag_ = DirectionDecisionParams.getDefaultInstance().getTag();
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }

        @Override // com.oplus.pantaconnect.connection.DirectionDecisionParamsOrBuilder
        public String getAdvFreq() {
            Object obj = this.advFreq_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.advFreq_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.connection.DirectionDecisionParamsOrBuilder
        public ByteString getAdvFreqBytes() {
            Object obj = this.advFreq_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.advFreq_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return tz3.y;
        }

        @Override // com.oplus.pantaconnect.connection.DirectionDecisionParamsOrBuilder
        public String getDeviceId() {
            Object obj = this.deviceId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.deviceId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.connection.DirectionDecisionParamsOrBuilder
        public ByteString getDeviceIdBytes() {
            Object obj = this.deviceId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.deviceId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.connection.DirectionDecisionParamsOrBuilder
        public String getDeviceKsc() {
            Object obj = this.deviceKsc_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.deviceKsc_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.connection.DirectionDecisionParamsOrBuilder
        public ByteString getDeviceKscBytes() {
            Object obj = this.deviceKsc_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.deviceKsc_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.connection.DirectionDecisionParamsOrBuilder
        public String getKscAlias() {
            Object obj = this.kscAlias_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.kscAlias_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.connection.DirectionDecisionParamsOrBuilder
        public ByteString getKscAliasBytes() {
            Object obj = this.kscAlias_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.kscAlias_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.connection.DirectionDecisionParamsOrBuilder
        public String getMacAddress() {
            Object obj = this.macAddress_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.macAddress_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.connection.DirectionDecisionParamsOrBuilder
        public ByteString getMacAddressBytes() {
            Object obj = this.macAddress_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.macAddress_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.connection.DirectionDecisionParamsOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.connection.DirectionDecisionParamsOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.connection.DirectionDecisionParamsOrBuilder
        public String getPassword() {
            Object obj = this.password_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.password_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.connection.DirectionDecisionParamsOrBuilder
        public ByteString getPasswordBytes() {
            Object obj = this.password_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.password_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.connection.DirectionDecisionParamsOrBuilder
        public String getRemoteIp() {
            Object obj = this.remoteIp_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.remoteIp_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.connection.DirectionDecisionParamsOrBuilder
        public ByteString getRemoteIpBytes() {
            Object obj = this.remoteIp_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.remoteIp_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.connection.DirectionDecisionParamsOrBuilder
        public String getSsid() {
            Object obj = this.ssid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ssid_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.connection.DirectionDecisionParamsOrBuilder
        public ByteString getSsidBytes() {
            Object obj = this.ssid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ssid_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.connection.DirectionDecisionParamsOrBuilder
        public String getTag() {
            Object obj = this.tag_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.tag_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.connection.DirectionDecisionParamsOrBuilder
        public ByteString getTagBytes() {
            Object obj = this.tag_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.tag_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return tz3.z.ensureFieldAccessorsInitialized(DirectionDecisionParams.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setAdvFreq(String str) {
            str.getClass();
            this.advFreq_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder setAdvFreqBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.advFreq_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder setDeviceId(String str) {
            str.getClass();
            this.deviceId_ = str;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public Builder setDeviceIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.deviceId_ = byteString;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public Builder setDeviceKsc(String str) {
            str.getClass();
            this.deviceKsc_ = str;
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        public Builder setDeviceKscBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.deviceKsc_ = byteString;
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        public Builder setKscAlias(String str) {
            str.getClass();
            this.kscAlias_ = str;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public Builder setKscAliasBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.kscAlias_ = byteString;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public Builder setMacAddress(String str) {
            str.getClass();
            this.macAddress_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder setMacAddressBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.macAddress_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder setName(String str) {
            str.getClass();
            this.name_ = str;
            this.bitField0_ |= 256;
            onChanged();
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.name_ = byteString;
            this.bitField0_ |= 256;
            onChanged();
            return this;
        }

        public Builder setPassword(String str) {
            str.getClass();
            this.password_ = str;
            this.bitField0_ |= 512;
            onChanged();
            return this;
        }

        public Builder setPasswordBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.password_ = byteString;
            this.bitField0_ |= 512;
            onChanged();
            return this;
        }

        public Builder setRemoteIp(String str) {
            str.getClass();
            this.remoteIp_ = str;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder setRemoteIpBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.remoteIp_ = byteString;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder setSsid(String str) {
            str.getClass();
            this.ssid_ = str;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder setSsidBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.ssid_ = byteString;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder setTag(String str) {
            str.getClass();
            this.tag_ = str;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder setTagBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.tag_ = byteString;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public /* synthetic */ Builder(a aVar) {
            this();
        }

        private Builder() {
            this.macAddress_ = "";
            this.advFreq_ = "";
            this.remoteIp_ = "";
            this.ssid_ = "";
            this.tag_ = "";
            this.deviceId_ = "";
            this.kscAlias_ = "";
            this.deviceKsc_ = "";
            this.name_ = "";
            this.password_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public DirectionDecisionParams build() {
            DirectionDecisionParams directionDecisionParamsBuildPartial = buildPartial();
            if (directionDecisionParamsBuildPartial.isInitialized()) {
                return directionDecisionParamsBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) directionDecisionParamsBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public DirectionDecisionParams buildPartial() {
            DirectionDecisionParams directionDecisionParams = new DirectionDecisionParams(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(directionDecisionParams);
            }
            onBuilt();
            return directionDecisionParams;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DirectionDecisionParams getDefaultInstanceForType() {
            return DirectionDecisionParams.getDefaultInstance();
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
            this.macAddress_ = "";
            this.advFreq_ = "";
            this.remoteIp_ = "";
            this.ssid_ = "";
            this.tag_ = "";
            this.deviceId_ = "";
            this.kscAlias_ = "";
            this.deviceKsc_ = "";
            this.name_ = "";
            this.password_ = "";
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4465clone() {
            return (Builder) super.mo4465clone();
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof DirectionDecisionParams) {
                return mergeFrom((DirectionDecisionParams) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(DirectionDecisionParams directionDecisionParams) {
            if (directionDecisionParams == DirectionDecisionParams.getDefaultInstance()) {
                return this;
            }
            if (!directionDecisionParams.getMacAddress().isEmpty()) {
                this.macAddress_ = directionDecisionParams.macAddress_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (!directionDecisionParams.getAdvFreq().isEmpty()) {
                this.advFreq_ = directionDecisionParams.advFreq_;
                this.bitField0_ |= 2;
                onChanged();
            }
            if (!directionDecisionParams.getRemoteIp().isEmpty()) {
                this.remoteIp_ = directionDecisionParams.remoteIp_;
                this.bitField0_ |= 4;
                onChanged();
            }
            if (!directionDecisionParams.getSsid().isEmpty()) {
                this.ssid_ = directionDecisionParams.ssid_;
                this.bitField0_ |= 8;
                onChanged();
            }
            if (!directionDecisionParams.getTag().isEmpty()) {
                this.tag_ = directionDecisionParams.tag_;
                this.bitField0_ |= 16;
                onChanged();
            }
            if (!directionDecisionParams.getDeviceId().isEmpty()) {
                this.deviceId_ = directionDecisionParams.deviceId_;
                this.bitField0_ |= 32;
                onChanged();
            }
            if (!directionDecisionParams.getKscAlias().isEmpty()) {
                this.kscAlias_ = directionDecisionParams.kscAlias_;
                this.bitField0_ |= 64;
                onChanged();
            }
            if (!directionDecisionParams.getDeviceKsc().isEmpty()) {
                this.deviceKsc_ = directionDecisionParams.deviceKsc_;
                this.bitField0_ |= 128;
                onChanged();
            }
            if (!directionDecisionParams.getName().isEmpty()) {
                this.name_ = directionDecisionParams.name_;
                this.bitField0_ |= 256;
                onChanged();
            }
            if (!directionDecisionParams.getPassword().isEmpty()) {
                this.password_ = directionDecisionParams.password_;
                this.bitField0_ |= 512;
                onChanged();
            }
            mergeUnknownFields(directionDecisionParams.getUnknownFields());
            onChanged();
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.macAddress_ = "";
            this.advFreq_ = "";
            this.remoteIp_ = "";
            this.ssid_ = "";
            this.tag_ = "";
            this.deviceId_ = "";
            this.kscAlias_ = "";
            this.deviceKsc_ = "";
            this.name_ = "";
            this.password_ = "";
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            extensionRegistryLite.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        switch (tag) {
                            case 0:
                                break;
                            case 10:
                                this.macAddress_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 1;
                                continue;
                            case 18:
                                this.advFreq_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 2;
                                continue;
                            case 26:
                                this.remoteIp_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 4;
                                continue;
                            case 34:
                                this.ssid_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 8;
                                continue;
                            case 42:
                                this.tag_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 16;
                                continue;
                            case 50:
                                this.deviceId_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 32;
                                continue;
                            case 58:
                                this.kscAlias_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 64;
                                continue;
                            case 66:
                                this.deviceKsc_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 128;
                                continue;
                            case 74:
                                this.name_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 256;
                                continue;
                            case 82:
                                this.password_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 512;
                                continue;
                            default:
                                if (!parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    break;
                                }
                                break;
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

    public class a extends AbstractParser<DirectionDecisionParams> {
        @Override // com.google.protobuf.Parser
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DirectionDecisionParams parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = DirectionDecisionParams.newBuilder();
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

    public /* synthetic */ DirectionDecisionParams(GeneratedMessageV3.Builder builder, a aVar) {
        this(builder);
    }

    public static DirectionDecisionParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return tz3.y;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DirectionDecisionParams parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DirectionDecisionParams) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DirectionDecisionParams parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<DirectionDecisionParams> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DirectionDecisionParams)) {
            return super.equals(obj);
        }
        DirectionDecisionParams directionDecisionParams = (DirectionDecisionParams) obj;
        return getMacAddress().equals(directionDecisionParams.getMacAddress()) && getAdvFreq().equals(directionDecisionParams.getAdvFreq()) && getRemoteIp().equals(directionDecisionParams.getRemoteIp()) && getSsid().equals(directionDecisionParams.getSsid()) && getTag().equals(directionDecisionParams.getTag()) && getDeviceId().equals(directionDecisionParams.getDeviceId()) && getKscAlias().equals(directionDecisionParams.getKscAlias()) && getDeviceKsc().equals(directionDecisionParams.getDeviceKsc()) && getName().equals(directionDecisionParams.getName()) && getPassword().equals(directionDecisionParams.getPassword()) && getUnknownFields().equals(directionDecisionParams.getUnknownFields());
    }

    @Override // com.oplus.pantaconnect.connection.DirectionDecisionParamsOrBuilder
    public String getAdvFreq() {
        Object obj = this.advFreq_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.advFreq_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.connection.DirectionDecisionParamsOrBuilder
    public ByteString getAdvFreqBytes() {
        Object obj = this.advFreq_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.advFreq_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.connection.DirectionDecisionParamsOrBuilder
    public String getDeviceId() {
        Object obj = this.deviceId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.deviceId_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.connection.DirectionDecisionParamsOrBuilder
    public ByteString getDeviceIdBytes() {
        Object obj = this.deviceId_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.deviceId_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.connection.DirectionDecisionParamsOrBuilder
    public String getDeviceKsc() {
        Object obj = this.deviceKsc_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.deviceKsc_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.connection.DirectionDecisionParamsOrBuilder
    public ByteString getDeviceKscBytes() {
        Object obj = this.deviceKsc_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.deviceKsc_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.connection.DirectionDecisionParamsOrBuilder
    public String getKscAlias() {
        Object obj = this.kscAlias_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.kscAlias_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.connection.DirectionDecisionParamsOrBuilder
    public ByteString getKscAliasBytes() {
        Object obj = this.kscAlias_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.kscAlias_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.connection.DirectionDecisionParamsOrBuilder
    public String getMacAddress() {
        Object obj = this.macAddress_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.macAddress_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.connection.DirectionDecisionParamsOrBuilder
    public ByteString getMacAddressBytes() {
        Object obj = this.macAddress_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.macAddress_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.connection.DirectionDecisionParamsOrBuilder
    public String getName() {
        Object obj = this.name_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.name_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.connection.DirectionDecisionParamsOrBuilder
    public ByteString getNameBytes() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.name_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<DirectionDecisionParams> getParserForType() {
        return PARSER;
    }

    @Override // com.oplus.pantaconnect.connection.DirectionDecisionParamsOrBuilder
    public String getPassword() {
        Object obj = this.password_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.password_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.connection.DirectionDecisionParamsOrBuilder
    public ByteString getPasswordBytes() {
        Object obj = this.password_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.password_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.connection.DirectionDecisionParamsOrBuilder
    public String getRemoteIp() {
        Object obj = this.remoteIp_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.remoteIp_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.connection.DirectionDecisionParamsOrBuilder
    public ByteString getRemoteIpBytes() {
        Object obj = this.remoteIp_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.remoteIp_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.macAddress_) ? GeneratedMessageV3.computeStringSize(1, this.macAddress_) : 0;
        if (!GeneratedMessageV3.isStringEmpty(this.advFreq_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.advFreq_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.remoteIp_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.remoteIp_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.ssid_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.ssid_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.tag_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(5, this.tag_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.deviceId_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(6, this.deviceId_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.kscAlias_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(7, this.kscAlias_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.deviceKsc_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(8, this.deviceKsc_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(9, this.name_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.password_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(10, this.password_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.oplus.pantaconnect.connection.DirectionDecisionParamsOrBuilder
    public String getSsid() {
        Object obj = this.ssid_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.ssid_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.connection.DirectionDecisionParamsOrBuilder
    public ByteString getSsidBytes() {
        Object obj = this.ssid_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.ssid_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.connection.DirectionDecisionParamsOrBuilder
    public String getTag() {
        Object obj = this.tag_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.tag_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.connection.DirectionDecisionParamsOrBuilder
    public ByteString getTagBytes() {
        Object obj = this.tag_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.tag_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + ((getPassword().hashCode() + ((((getName().hashCode() + ((((getDeviceKsc().hashCode() + ((((getKscAlias().hashCode() + ((((getDeviceId().hashCode() + ((((getTag().hashCode() + ((((getSsid().hashCode() + ((((getRemoteIp().hashCode() + ((((getAdvFreq().hashCode() + ((((getMacAddress().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53)) * 37) + 7) * 53)) * 37) + 8) * 53)) * 37) + 9) * 53)) * 37) + 10) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return tz3.z.ensureFieldAccessorsInitialized(DirectionDecisionParams.class, Builder.class);
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
        return new DirectionDecisionParams();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!GeneratedMessageV3.isStringEmpty(this.macAddress_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.macAddress_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.advFreq_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.advFreq_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.remoteIp_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.remoteIp_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.ssid_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.ssid_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.tag_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 5, this.tag_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.deviceId_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 6, this.deviceId_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.kscAlias_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 7, this.kscAlias_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.deviceKsc_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 8, this.deviceKsc_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 9, this.name_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.password_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 10, this.password_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    private DirectionDecisionParams(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.macAddress_ = "";
        this.advFreq_ = "";
        this.remoteIp_ = "";
        this.ssid_ = "";
        this.tag_ = "";
        this.deviceId_ = "";
        this.kscAlias_ = "";
        this.deviceKsc_ = "";
        this.name_ = "";
        this.password_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Builder newBuilder(DirectionDecisionParams directionDecisionParams) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(directionDecisionParams);
    }

    public static DirectionDecisionParams parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static DirectionDecisionParams parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DirectionDecisionParams) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static DirectionDecisionParams parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public DirectionDecisionParams getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        a aVar = null;
        return this == DEFAULT_INSTANCE ? new Builder(aVar) : new Builder(aVar).mergeFrom(this);
    }

    public static DirectionDecisionParams parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static DirectionDecisionParams parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent, null);
    }

    public static DirectionDecisionParams parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static DirectionDecisionParams parseFrom(InputStream inputStream) throws IOException {
        return (DirectionDecisionParams) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static DirectionDecisionParams parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DirectionDecisionParams) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static DirectionDecisionParams parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DirectionDecisionParams) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static DirectionDecisionParams parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DirectionDecisionParams) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    private DirectionDecisionParams() {
        this.macAddress_ = "";
        this.advFreq_ = "";
        this.remoteIp_ = "";
        this.ssid_ = "";
        this.tag_ = "";
        this.deviceId_ = "";
        this.kscAlias_ = "";
        this.deviceKsc_ = "";
        this.name_ = "";
        this.password_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.macAddress_ = "";
        this.advFreq_ = "";
        this.remoteIp_ = "";
        this.ssid_ = "";
        this.tag_ = "";
        this.deviceId_ = "";
        this.kscAlias_ = "";
        this.deviceKsc_ = "";
        this.name_ = "";
        this.password_ = "";
    }
}
