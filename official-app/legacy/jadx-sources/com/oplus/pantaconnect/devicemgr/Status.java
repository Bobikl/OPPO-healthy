package com.oplus.pantaconnect.devicemgr;

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
import com.oplus.aiunit.vision.xq5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public final class Status extends GeneratedMessageV3 implements StatusOrBuilder {
    public static final int BTSTATUS_FIELD_NUMBER = 2;
    public static final int CONNECTIONTOMAJOR_FIELD_NUMBER = 1;
    public static final int DARKMODE_FIELD_NUMBER = 8;
    public static final int EARPHONE_FIELD_NUMBER = 9;
    public static final int LATITUDE_FIELD_NUMBER = 11;
    public static final int LOCATIONCOORDINATETYPE_FIELD_NUMBER = 12;
    public static final int LOCATIONSTATUS_FIELD_NUMBER = 4;
    public static final int LONGITUDE_FIELD_NUMBER = 10;
    public static final int MEMAVAIL_FIELD_NUMBER = 5;
    public static final int MEMTOTAL_FIELD_NUMBER = 6;
    public static final int NETWORKTYPE_FIELD_NUMBER = 3;
    public static final int STORAGEAVAIL_FIELD_NUMBER = 7;
    private static final long serialVersionUID = 0;
    private volatile Object btStatus_;
    private volatile Object connectionToMajor_;
    private volatile Object darkMode_;
    private volatile Object earPhone_;
    private volatile Object latitude_;
    private volatile Object locationCoordinateType_;
    private volatile Object locationStatus_;
    private volatile Object longitude_;
    private volatile Object memAvail_;
    private volatile Object memTotal_;
    private byte memoizedIsInitialized;
    private volatile Object networkType_;
    private volatile Object storageAvail_;
    private static final Status DEFAULT_INSTANCE = new Status();
    private static final Parser<Status> PARSER = new a();

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StatusOrBuilder {
        private int bitField0_;
        private Object btStatus_;
        private Object connectionToMajor_;
        private Object darkMode_;
        private Object earPhone_;
        private Object latitude_;
        private Object locationCoordinateType_;
        private Object locationStatus_;
        private Object longitude_;
        private Object memAvail_;
        private Object memTotal_;
        private Object networkType_;
        private Object storageAvail_;

        public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, a aVar) {
            this(builderParent);
        }

        private void buildPartial0(Status status) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                status.connectionToMajor_ = this.connectionToMajor_;
            }
            if ((i & 2) != 0) {
                status.btStatus_ = this.btStatus_;
            }
            if ((i & 4) != 0) {
                status.networkType_ = this.networkType_;
            }
            if ((i & 8) != 0) {
                status.locationStatus_ = this.locationStatus_;
            }
            if ((i & 16) != 0) {
                status.memAvail_ = this.memAvail_;
            }
            if ((i & 32) != 0) {
                status.memTotal_ = this.memTotal_;
            }
            if ((i & 64) != 0) {
                status.storageAvail_ = this.storageAvail_;
            }
            if ((i & 128) != 0) {
                status.darkMode_ = this.darkMode_;
            }
            if ((i & 256) != 0) {
                status.earPhone_ = this.earPhone_;
            }
            if ((i & 512) != 0) {
                status.longitude_ = this.longitude_;
            }
            if ((i & 1024) != 0) {
                status.latitude_ = this.latitude_;
            }
            if ((i & 2048) != 0) {
                status.locationCoordinateType_ = this.locationCoordinateType_;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return xq5.g;
        }

        public Builder clearBtStatus() {
            this.btStatus_ = Status.getDefaultInstance().getBtStatus();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder clearConnectionToMajor() {
            this.connectionToMajor_ = Status.getDefaultInstance().getConnectionToMajor();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder clearDarkMode() {
            this.darkMode_ = Status.getDefaultInstance().getDarkMode();
            this.bitField0_ &= -129;
            onChanged();
            return this;
        }

        public Builder clearEarPhone() {
            this.earPhone_ = Status.getDefaultInstance().getEarPhone();
            this.bitField0_ &= -257;
            onChanged();
            return this;
        }

        public Builder clearLatitude() {
            this.latitude_ = Status.getDefaultInstance().getLatitude();
            this.bitField0_ &= -1025;
            onChanged();
            return this;
        }

        public Builder clearLocationCoordinateType() {
            this.locationCoordinateType_ = Status.getDefaultInstance().getLocationCoordinateType();
            this.bitField0_ &= -2049;
            onChanged();
            return this;
        }

        public Builder clearLocationStatus() {
            this.locationStatus_ = Status.getDefaultInstance().getLocationStatus();
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        public Builder clearLongitude() {
            this.longitude_ = Status.getDefaultInstance().getLongitude();
            this.bitField0_ &= -513;
            onChanged();
            return this;
        }

        public Builder clearMemAvail() {
            this.memAvail_ = Status.getDefaultInstance().getMemAvail();
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }

        public Builder clearMemTotal() {
            this.memTotal_ = Status.getDefaultInstance().getMemTotal();
            this.bitField0_ &= -33;
            onChanged();
            return this;
        }

        public Builder clearNetworkType() {
            this.networkType_ = Status.getDefaultInstance().getNetworkType();
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public Builder clearStorageAvail() {
            this.storageAvail_ = Status.getDefaultInstance().getStorageAvail();
            this.bitField0_ &= -65;
            onChanged();
            return this;
        }

        @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
        public String getBtStatus() {
            Object obj = this.btStatus_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.btStatus_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
        public ByteString getBtStatusBytes() {
            Object obj = this.btStatus_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.btStatus_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
        public String getConnectionToMajor() {
            Object obj = this.connectionToMajor_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.connectionToMajor_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
        public ByteString getConnectionToMajorBytes() {
            Object obj = this.connectionToMajor_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.connectionToMajor_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
        public String getDarkMode() {
            Object obj = this.darkMode_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.darkMode_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
        public ByteString getDarkModeBytes() {
            Object obj = this.darkMode_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.darkMode_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return xq5.g;
        }

        @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
        public String getEarPhone() {
            Object obj = this.earPhone_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.earPhone_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
        public ByteString getEarPhoneBytes() {
            Object obj = this.earPhone_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.earPhone_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
        public String getLatitude() {
            Object obj = this.latitude_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.latitude_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
        public ByteString getLatitudeBytes() {
            Object obj = this.latitude_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.latitude_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
        public String getLocationCoordinateType() {
            Object obj = this.locationCoordinateType_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.locationCoordinateType_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
        public ByteString getLocationCoordinateTypeBytes() {
            Object obj = this.locationCoordinateType_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.locationCoordinateType_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
        public String getLocationStatus() {
            Object obj = this.locationStatus_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.locationStatus_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
        public ByteString getLocationStatusBytes() {
            Object obj = this.locationStatus_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.locationStatus_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
        public String getLongitude() {
            Object obj = this.longitude_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.longitude_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
        public ByteString getLongitudeBytes() {
            Object obj = this.longitude_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.longitude_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
        public String getMemAvail() {
            Object obj = this.memAvail_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.memAvail_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
        public ByteString getMemAvailBytes() {
            Object obj = this.memAvail_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.memAvail_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
        public String getMemTotal() {
            Object obj = this.memTotal_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.memTotal_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
        public ByteString getMemTotalBytes() {
            Object obj = this.memTotal_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.memTotal_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
        public String getNetworkType() {
            Object obj = this.networkType_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.networkType_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
        public ByteString getNetworkTypeBytes() {
            Object obj = this.networkType_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.networkType_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
        public String getStorageAvail() {
            Object obj = this.storageAvail_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.storageAvail_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
        public ByteString getStorageAvailBytes() {
            Object obj = this.storageAvail_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.storageAvail_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return xq5.h.ensureFieldAccessorsInitialized(Status.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setBtStatus(String str) {
            str.getClass();
            this.btStatus_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder setBtStatusBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.btStatus_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder setConnectionToMajor(String str) {
            str.getClass();
            this.connectionToMajor_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder setConnectionToMajorBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.connectionToMajor_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder setDarkMode(String str) {
            str.getClass();
            this.darkMode_ = str;
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        public Builder setDarkModeBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.darkMode_ = byteString;
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        public Builder setEarPhone(String str) {
            str.getClass();
            this.earPhone_ = str;
            this.bitField0_ |= 256;
            onChanged();
            return this;
        }

        public Builder setEarPhoneBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.earPhone_ = byteString;
            this.bitField0_ |= 256;
            onChanged();
            return this;
        }

        public Builder setLatitude(String str) {
            str.getClass();
            this.latitude_ = str;
            this.bitField0_ |= 1024;
            onChanged();
            return this;
        }

        public Builder setLatitudeBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.latitude_ = byteString;
            this.bitField0_ |= 1024;
            onChanged();
            return this;
        }

        public Builder setLocationCoordinateType(String str) {
            str.getClass();
            this.locationCoordinateType_ = str;
            this.bitField0_ |= 2048;
            onChanged();
            return this;
        }

        public Builder setLocationCoordinateTypeBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.locationCoordinateType_ = byteString;
            this.bitField0_ |= 2048;
            onChanged();
            return this;
        }

        public Builder setLocationStatus(String str) {
            str.getClass();
            this.locationStatus_ = str;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder setLocationStatusBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.locationStatus_ = byteString;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder setLongitude(String str) {
            str.getClass();
            this.longitude_ = str;
            this.bitField0_ |= 512;
            onChanged();
            return this;
        }

        public Builder setLongitudeBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.longitude_ = byteString;
            this.bitField0_ |= 512;
            onChanged();
            return this;
        }

        public Builder setMemAvail(String str) {
            str.getClass();
            this.memAvail_ = str;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder setMemAvailBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.memAvail_ = byteString;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder setMemTotal(String str) {
            str.getClass();
            this.memTotal_ = str;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public Builder setMemTotalBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.memTotal_ = byteString;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public Builder setNetworkType(String str) {
            str.getClass();
            this.networkType_ = str;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder setNetworkTypeBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.networkType_ = byteString;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder setStorageAvail(String str) {
            str.getClass();
            this.storageAvail_ = str;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public Builder setStorageAvailBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.storageAvail_ = byteString;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public /* synthetic */ Builder(a aVar) {
            this();
        }

        private Builder() {
            this.connectionToMajor_ = "";
            this.btStatus_ = "";
            this.networkType_ = "";
            this.locationStatus_ = "";
            this.memAvail_ = "";
            this.memTotal_ = "";
            this.storageAvail_ = "";
            this.darkMode_ = "";
            this.earPhone_ = "";
            this.longitude_ = "";
            this.latitude_ = "";
            this.locationCoordinateType_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Status build() {
            Status statusBuildPartial = buildPartial();
            if (statusBuildPartial.isInitialized()) {
                return statusBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) statusBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Status buildPartial() {
            Status status = new Status(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(status);
            }
            onBuilt();
            return status;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Status getDefaultInstanceForType() {
            return Status.getDefaultInstance();
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
            this.connectionToMajor_ = "";
            this.btStatus_ = "";
            this.networkType_ = "";
            this.locationStatus_ = "";
            this.memAvail_ = "";
            this.memTotal_ = "";
            this.storageAvail_ = "";
            this.darkMode_ = "";
            this.earPhone_ = "";
            this.longitude_ = "";
            this.latitude_ = "";
            this.locationCoordinateType_ = "";
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4465clone() {
            return (Builder) super.mo4465clone();
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof Status) {
                return mergeFrom((Status) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Status status) {
            if (status == Status.getDefaultInstance()) {
                return this;
            }
            if (!status.getConnectionToMajor().isEmpty()) {
                this.connectionToMajor_ = status.connectionToMajor_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (!status.getBtStatus().isEmpty()) {
                this.btStatus_ = status.btStatus_;
                this.bitField0_ |= 2;
                onChanged();
            }
            if (!status.getNetworkType().isEmpty()) {
                this.networkType_ = status.networkType_;
                this.bitField0_ |= 4;
                onChanged();
            }
            if (!status.getLocationStatus().isEmpty()) {
                this.locationStatus_ = status.locationStatus_;
                this.bitField0_ |= 8;
                onChanged();
            }
            if (!status.getMemAvail().isEmpty()) {
                this.memAvail_ = status.memAvail_;
                this.bitField0_ |= 16;
                onChanged();
            }
            if (!status.getMemTotal().isEmpty()) {
                this.memTotal_ = status.memTotal_;
                this.bitField0_ |= 32;
                onChanged();
            }
            if (!status.getStorageAvail().isEmpty()) {
                this.storageAvail_ = status.storageAvail_;
                this.bitField0_ |= 64;
                onChanged();
            }
            if (!status.getDarkMode().isEmpty()) {
                this.darkMode_ = status.darkMode_;
                this.bitField0_ |= 128;
                onChanged();
            }
            if (!status.getEarPhone().isEmpty()) {
                this.earPhone_ = status.earPhone_;
                this.bitField0_ |= 256;
                onChanged();
            }
            if (!status.getLongitude().isEmpty()) {
                this.longitude_ = status.longitude_;
                this.bitField0_ |= 512;
                onChanged();
            }
            if (!status.getLatitude().isEmpty()) {
                this.latitude_ = status.latitude_;
                this.bitField0_ |= 1024;
                onChanged();
            }
            if (!status.getLocationCoordinateType().isEmpty()) {
                this.locationCoordinateType_ = status.locationCoordinateType_;
                this.bitField0_ |= 2048;
                onChanged();
            }
            mergeUnknownFields(status.getUnknownFields());
            onChanged();
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.connectionToMajor_ = "";
            this.btStatus_ = "";
            this.networkType_ = "";
            this.locationStatus_ = "";
            this.memAvail_ = "";
            this.memTotal_ = "";
            this.storageAvail_ = "";
            this.darkMode_ = "";
            this.earPhone_ = "";
            this.longitude_ = "";
            this.latitude_ = "";
            this.locationCoordinateType_ = "";
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
                                this.connectionToMajor_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 1;
                                continue;
                            case 18:
                                this.btStatus_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 2;
                                continue;
                            case 26:
                                this.networkType_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 4;
                                continue;
                            case 34:
                                this.locationStatus_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 8;
                                continue;
                            case 42:
                                this.memAvail_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 16;
                                continue;
                            case 50:
                                this.memTotal_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 32;
                                continue;
                            case 58:
                                this.storageAvail_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 64;
                                continue;
                            case 66:
                                this.darkMode_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 128;
                                continue;
                            case 74:
                                this.earPhone_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 256;
                                continue;
                            case 82:
                                this.longitude_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 512;
                                continue;
                            case 90:
                                this.latitude_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 1024;
                                continue;
                            case 98:
                                this.locationCoordinateType_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 2048;
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

    public class a extends AbstractParser<Status> {
        @Override // com.google.protobuf.Parser
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Status parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = Status.newBuilder();
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

    public /* synthetic */ Status(GeneratedMessageV3.Builder builder, a aVar) {
        this(builder);
    }

    public static Status getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return xq5.g;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Status parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Status) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Status parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<Status> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Status)) {
            return super.equals(obj);
        }
        Status status = (Status) obj;
        return getConnectionToMajor().equals(status.getConnectionToMajor()) && getBtStatus().equals(status.getBtStatus()) && getNetworkType().equals(status.getNetworkType()) && getLocationStatus().equals(status.getLocationStatus()) && getMemAvail().equals(status.getMemAvail()) && getMemTotal().equals(status.getMemTotal()) && getStorageAvail().equals(status.getStorageAvail()) && getDarkMode().equals(status.getDarkMode()) && getEarPhone().equals(status.getEarPhone()) && getLongitude().equals(status.getLongitude()) && getLatitude().equals(status.getLatitude()) && getLocationCoordinateType().equals(status.getLocationCoordinateType()) && getUnknownFields().equals(status.getUnknownFields());
    }

    @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
    public String getBtStatus() {
        Object obj = this.btStatus_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.btStatus_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
    public ByteString getBtStatusBytes() {
        Object obj = this.btStatus_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.btStatus_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
    public String getConnectionToMajor() {
        Object obj = this.connectionToMajor_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.connectionToMajor_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
    public ByteString getConnectionToMajorBytes() {
        Object obj = this.connectionToMajor_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.connectionToMajor_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
    public String getDarkMode() {
        Object obj = this.darkMode_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.darkMode_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
    public ByteString getDarkModeBytes() {
        Object obj = this.darkMode_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.darkMode_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
    public String getEarPhone() {
        Object obj = this.earPhone_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.earPhone_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
    public ByteString getEarPhoneBytes() {
        Object obj = this.earPhone_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.earPhone_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
    public String getLatitude() {
        Object obj = this.latitude_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.latitude_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
    public ByteString getLatitudeBytes() {
        Object obj = this.latitude_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.latitude_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
    public String getLocationCoordinateType() {
        Object obj = this.locationCoordinateType_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.locationCoordinateType_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
    public ByteString getLocationCoordinateTypeBytes() {
        Object obj = this.locationCoordinateType_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.locationCoordinateType_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
    public String getLocationStatus() {
        Object obj = this.locationStatus_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.locationStatus_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
    public ByteString getLocationStatusBytes() {
        Object obj = this.locationStatus_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.locationStatus_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
    public String getLongitude() {
        Object obj = this.longitude_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.longitude_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
    public ByteString getLongitudeBytes() {
        Object obj = this.longitude_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.longitude_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
    public String getMemAvail() {
        Object obj = this.memAvail_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.memAvail_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
    public ByteString getMemAvailBytes() {
        Object obj = this.memAvail_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.memAvail_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
    public String getMemTotal() {
        Object obj = this.memTotal_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.memTotal_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
    public ByteString getMemTotalBytes() {
        Object obj = this.memTotal_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.memTotal_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
    public String getNetworkType() {
        Object obj = this.networkType_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.networkType_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
    public ByteString getNetworkTypeBytes() {
        Object obj = this.networkType_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.networkType_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<Status> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.connectionToMajor_) ? GeneratedMessageV3.computeStringSize(1, this.connectionToMajor_) : 0;
        if (!GeneratedMessageV3.isStringEmpty(this.btStatus_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.btStatus_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.networkType_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.networkType_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.locationStatus_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.locationStatus_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.memAvail_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(5, this.memAvail_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.memTotal_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(6, this.memTotal_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.storageAvail_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(7, this.storageAvail_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.darkMode_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(8, this.darkMode_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.earPhone_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(9, this.earPhone_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.longitude_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(10, this.longitude_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.latitude_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(11, this.latitude_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.locationCoordinateType_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(12, this.locationCoordinateType_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
    public String getStorageAvail() {
        Object obj = this.storageAvail_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.storageAvail_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.StatusOrBuilder
    public ByteString getStorageAvailBytes() {
        Object obj = this.storageAvail_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.storageAvail_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + ((getLocationCoordinateType().hashCode() + ((((getLatitude().hashCode() + ((((getLongitude().hashCode() + ((((getEarPhone().hashCode() + ((((getDarkMode().hashCode() + ((((getStorageAvail().hashCode() + ((((getMemTotal().hashCode() + ((((getMemAvail().hashCode() + ((((getLocationStatus().hashCode() + ((((getNetworkType().hashCode() + ((((getBtStatus().hashCode() + ((((getConnectionToMajor().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53)) * 37) + 7) * 53)) * 37) + 8) * 53)) * 37) + 9) * 53)) * 37) + 10) * 53)) * 37) + 11) * 53)) * 37) + 12) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return xq5.h.ensureFieldAccessorsInitialized(Status.class, Builder.class);
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
        return new Status();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!GeneratedMessageV3.isStringEmpty(this.connectionToMajor_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.connectionToMajor_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.btStatus_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.btStatus_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.networkType_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.networkType_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.locationStatus_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.locationStatus_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.memAvail_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 5, this.memAvail_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.memTotal_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 6, this.memTotal_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.storageAvail_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 7, this.storageAvail_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.darkMode_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 8, this.darkMode_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.earPhone_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 9, this.earPhone_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.longitude_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 10, this.longitude_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.latitude_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 11, this.latitude_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.locationCoordinateType_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 12, this.locationCoordinateType_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    private Status(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.connectionToMajor_ = "";
        this.btStatus_ = "";
        this.networkType_ = "";
        this.locationStatus_ = "";
        this.memAvail_ = "";
        this.memTotal_ = "";
        this.storageAvail_ = "";
        this.darkMode_ = "";
        this.earPhone_ = "";
        this.longitude_ = "";
        this.latitude_ = "";
        this.locationCoordinateType_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Builder newBuilder(Status status) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(status);
    }

    public static Status parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Status parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Status) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Status parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public Status getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        a aVar = null;
        return this == DEFAULT_INSTANCE ? new Builder(aVar) : new Builder(aVar).mergeFrom(this);
    }

    public static Status parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Status parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent, null);
    }

    public static Status parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Status parseFrom(InputStream inputStream) throws IOException {
        return (Status) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Status parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Status) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Status parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Status) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Status parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Status) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    private Status() {
        this.connectionToMajor_ = "";
        this.btStatus_ = "";
        this.networkType_ = "";
        this.locationStatus_ = "";
        this.memAvail_ = "";
        this.memTotal_ = "";
        this.storageAvail_ = "";
        this.darkMode_ = "";
        this.earPhone_ = "";
        this.longitude_ = "";
        this.latitude_ = "";
        this.locationCoordinateType_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.connectionToMajor_ = "";
        this.btStatus_ = "";
        this.networkType_ = "";
        this.locationStatus_ = "";
        this.memAvail_ = "";
        this.memTotal_ = "";
        this.storageAvail_ = "";
        this.darkMode_ = "";
        this.earPhone_ = "";
        this.longitude_ = "";
        this.latitude_ = "";
        this.locationCoordinateType_ = "";
    }
}
