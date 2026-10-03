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
public final class Spec extends GeneratedMessageV3 implements SpecOrBuilder {
    public static final int ANDROIDVERSION_FIELD_NUMBER = 9;
    public static final int BATTERYCAPACITY_FIELD_NUMBER = 7;
    public static final int BRAND_FIELD_NUMBER = 11;
    public static final int BTMAC_FIELD_NUMBER = 8;
    public static final int CPUNAME_FIELD_NUMBER = 4;
    public static final int DEVICENAME_FIELD_NUMBER = 1;
    public static final int MARKETNAME_FIELD_NUMBER = 14;
    public static final int OAID_FIELD_NUMBER = 13;
    public static final int OSVERSION_FIELD_NUMBER = 10;
    public static final int RAMSPEC_FIELD_NUMBER = 5;
    public static final int REGION_FIELD_NUMBER = 12;
    public static final int RESOLUTION_FIELD_NUMBER = 2;
    public static final int ROMSPEC_FIELD_NUMBER = 6;
    public static final int SCREENDPI_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0;
    private volatile Object androidVersion_;
    private volatile Object batteryCapacity_;
    private volatile Object brand_;
    private volatile Object btMac_;
    private volatile Object cpuName_;
    private volatile Object deviceName_;
    private volatile Object marketName_;
    private byte memoizedIsInitialized;
    private volatile Object oaid_;
    private volatile Object osVersion_;
    private volatile Object ramSpec_;
    private volatile Object region_;
    private volatile Object resolution_;
    private volatile Object romSpec_;
    private volatile Object screenDpi_;
    private static final Spec DEFAULT_INSTANCE = new Spec();
    private static final Parser<Spec> PARSER = new a();

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SpecOrBuilder {
        private Object androidVersion_;
        private Object batteryCapacity_;
        private int bitField0_;
        private Object brand_;
        private Object btMac_;
        private Object cpuName_;
        private Object deviceName_;
        private Object marketName_;
        private Object oaid_;
        private Object osVersion_;
        private Object ramSpec_;
        private Object region_;
        private Object resolution_;
        private Object romSpec_;
        private Object screenDpi_;

        public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, a aVar) {
            this(builderParent);
        }

        private void buildPartial0(Spec spec) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                spec.deviceName_ = this.deviceName_;
            }
            if ((i & 2) != 0) {
                spec.resolution_ = this.resolution_;
            }
            if ((i & 4) != 0) {
                spec.screenDpi_ = this.screenDpi_;
            }
            if ((i & 8) != 0) {
                spec.cpuName_ = this.cpuName_;
            }
            if ((i & 16) != 0) {
                spec.ramSpec_ = this.ramSpec_;
            }
            if ((i & 32) != 0) {
                spec.romSpec_ = this.romSpec_;
            }
            if ((i & 64) != 0) {
                spec.batteryCapacity_ = this.batteryCapacity_;
            }
            if ((i & 128) != 0) {
                spec.btMac_ = this.btMac_;
            }
            if ((i & 256) != 0) {
                spec.androidVersion_ = this.androidVersion_;
            }
            if ((i & 512) != 0) {
                spec.osVersion_ = this.osVersion_;
            }
            if ((i & 1024) != 0) {
                spec.brand_ = this.brand_;
            }
            if ((i & 2048) != 0) {
                spec.region_ = this.region_;
            }
            if ((i & 4096) != 0) {
                spec.oaid_ = this.oaid_;
            }
            if ((i & 8192) != 0) {
                spec.marketName_ = this.marketName_;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return xq5.f18723e;
        }

        public Builder clearAndroidVersion() {
            this.androidVersion_ = Spec.getDefaultInstance().getAndroidVersion();
            this.bitField0_ &= -257;
            onChanged();
            return this;
        }

        public Builder clearBatteryCapacity() {
            this.batteryCapacity_ = Spec.getDefaultInstance().getBatteryCapacity();
            this.bitField0_ &= -65;
            onChanged();
            return this;
        }

        public Builder clearBrand() {
            this.brand_ = Spec.getDefaultInstance().getBrand();
            this.bitField0_ &= -1025;
            onChanged();
            return this;
        }

        public Builder clearBtMac() {
            this.btMac_ = Spec.getDefaultInstance().getBtMac();
            this.bitField0_ &= -129;
            onChanged();
            return this;
        }

        public Builder clearCpuName() {
            this.cpuName_ = Spec.getDefaultInstance().getCpuName();
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        public Builder clearDeviceName() {
            this.deviceName_ = Spec.getDefaultInstance().getDeviceName();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder clearMarketName() {
            this.marketName_ = Spec.getDefaultInstance().getMarketName();
            this.bitField0_ &= -8193;
            onChanged();
            return this;
        }

        public Builder clearOaid() {
            this.oaid_ = Spec.getDefaultInstance().getOaid();
            this.bitField0_ &= -4097;
            onChanged();
            return this;
        }

        public Builder clearOsVersion() {
            this.osVersion_ = Spec.getDefaultInstance().getOsVersion();
            this.bitField0_ &= -513;
            onChanged();
            return this;
        }

        public Builder clearRamSpec() {
            this.ramSpec_ = Spec.getDefaultInstance().getRamSpec();
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }

        public Builder clearRegion() {
            this.region_ = Spec.getDefaultInstance().getRegion();
            this.bitField0_ &= -2049;
            onChanged();
            return this;
        }

        public Builder clearResolution() {
            this.resolution_ = Spec.getDefaultInstance().getResolution();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder clearRomSpec() {
            this.romSpec_ = Spec.getDefaultInstance().getRomSpec();
            this.bitField0_ &= -33;
            onChanged();
            return this;
        }

        public Builder clearScreenDpi() {
            this.screenDpi_ = Spec.getDefaultInstance().getScreenDpi();
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
        public String getAndroidVersion() {
            Object obj = this.androidVersion_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.androidVersion_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
        public ByteString getAndroidVersionBytes() {
            Object obj = this.androidVersion_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.androidVersion_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
        public String getBatteryCapacity() {
            Object obj = this.batteryCapacity_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.batteryCapacity_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
        public ByteString getBatteryCapacityBytes() {
            Object obj = this.batteryCapacity_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.batteryCapacity_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
        public String getBrand() {
            Object obj = this.brand_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.brand_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
        public ByteString getBrandBytes() {
            Object obj = this.brand_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.brand_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
        public String getBtMac() {
            Object obj = this.btMac_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.btMac_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
        public ByteString getBtMacBytes() {
            Object obj = this.btMac_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.btMac_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
        public String getCpuName() {
            Object obj = this.cpuName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.cpuName_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
        public ByteString getCpuNameBytes() {
            Object obj = this.cpuName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.cpuName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return xq5.f18723e;
        }

        @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
        public String getDeviceName() {
            Object obj = this.deviceName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.deviceName_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
        public ByteString getDeviceNameBytes() {
            Object obj = this.deviceName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.deviceName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
        public String getMarketName() {
            Object obj = this.marketName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.marketName_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
        public ByteString getMarketNameBytes() {
            Object obj = this.marketName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.marketName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
        public String getOaid() {
            Object obj = this.oaid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.oaid_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
        public ByteString getOaidBytes() {
            Object obj = this.oaid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.oaid_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
        public String getOsVersion() {
            Object obj = this.osVersion_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.osVersion_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
        public ByteString getOsVersionBytes() {
            Object obj = this.osVersion_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.osVersion_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
        public String getRamSpec() {
            Object obj = this.ramSpec_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.ramSpec_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
        public ByteString getRamSpecBytes() {
            Object obj = this.ramSpec_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ramSpec_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
        public String getRegion() {
            Object obj = this.region_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.region_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
        public ByteString getRegionBytes() {
            Object obj = this.region_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.region_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
        public String getResolution() {
            Object obj = this.resolution_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.resolution_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
        public ByteString getResolutionBytes() {
            Object obj = this.resolution_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.resolution_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
        public String getRomSpec() {
            Object obj = this.romSpec_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.romSpec_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
        public ByteString getRomSpecBytes() {
            Object obj = this.romSpec_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.romSpec_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
        public String getScreenDpi() {
            Object obj = this.screenDpi_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.screenDpi_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
        public ByteString getScreenDpiBytes() {
            Object obj = this.screenDpi_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.screenDpi_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return xq5.f.ensureFieldAccessorsInitialized(Spec.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setAndroidVersion(String str) {
            str.getClass();
            this.androidVersion_ = str;
            this.bitField0_ |= 256;
            onChanged();
            return this;
        }

        public Builder setAndroidVersionBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.androidVersion_ = byteString;
            this.bitField0_ |= 256;
            onChanged();
            return this;
        }

        public Builder setBatteryCapacity(String str) {
            str.getClass();
            this.batteryCapacity_ = str;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public Builder setBatteryCapacityBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.batteryCapacity_ = byteString;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public Builder setBrand(String str) {
            str.getClass();
            this.brand_ = str;
            this.bitField0_ |= 1024;
            onChanged();
            return this;
        }

        public Builder setBrandBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.brand_ = byteString;
            this.bitField0_ |= 1024;
            onChanged();
            return this;
        }

        public Builder setBtMac(String str) {
            str.getClass();
            this.btMac_ = str;
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        public Builder setBtMacBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.btMac_ = byteString;
            this.bitField0_ |= 128;
            onChanged();
            return this;
        }

        public Builder setCpuName(String str) {
            str.getClass();
            this.cpuName_ = str;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder setCpuNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.cpuName_ = byteString;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder setDeviceName(String str) {
            str.getClass();
            this.deviceName_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder setDeviceNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.deviceName_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder setMarketName(String str) {
            str.getClass();
            this.marketName_ = str;
            this.bitField0_ |= 8192;
            onChanged();
            return this;
        }

        public Builder setMarketNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.marketName_ = byteString;
            this.bitField0_ |= 8192;
            onChanged();
            return this;
        }

        public Builder setOaid(String str) {
            str.getClass();
            this.oaid_ = str;
            this.bitField0_ |= 4096;
            onChanged();
            return this;
        }

        public Builder setOaidBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.oaid_ = byteString;
            this.bitField0_ |= 4096;
            onChanged();
            return this;
        }

        public Builder setOsVersion(String str) {
            str.getClass();
            this.osVersion_ = str;
            this.bitField0_ |= 512;
            onChanged();
            return this;
        }

        public Builder setOsVersionBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.osVersion_ = byteString;
            this.bitField0_ |= 512;
            onChanged();
            return this;
        }

        public Builder setRamSpec(String str) {
            str.getClass();
            this.ramSpec_ = str;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder setRamSpecBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.ramSpec_ = byteString;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder setRegion(String str) {
            str.getClass();
            this.region_ = str;
            this.bitField0_ |= 2048;
            onChanged();
            return this;
        }

        public Builder setRegionBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.region_ = byteString;
            this.bitField0_ |= 2048;
            onChanged();
            return this;
        }

        public Builder setResolution(String str) {
            str.getClass();
            this.resolution_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder setResolutionBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.resolution_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder setRomSpec(String str) {
            str.getClass();
            this.romSpec_ = str;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public Builder setRomSpecBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.romSpec_ = byteString;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public Builder setScreenDpi(String str) {
            str.getClass();
            this.screenDpi_ = str;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder setScreenDpiBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.screenDpi_ = byteString;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public /* synthetic */ Builder(a aVar) {
            this();
        }

        private Builder() {
            this.deviceName_ = "";
            this.resolution_ = "";
            this.screenDpi_ = "";
            this.cpuName_ = "";
            this.ramSpec_ = "";
            this.romSpec_ = "";
            this.batteryCapacity_ = "";
            this.btMac_ = "";
            this.androidVersion_ = "";
            this.osVersion_ = "";
            this.brand_ = "";
            this.region_ = "";
            this.oaid_ = "";
            this.marketName_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Spec build() {
            Spec specBuildPartial = buildPartial();
            if (specBuildPartial.isInitialized()) {
                return specBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) specBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Spec buildPartial() {
            Spec spec = new Spec(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(spec);
            }
            onBuilt();
            return spec;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Spec getDefaultInstanceForType() {
            return Spec.getDefaultInstance();
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
            this.deviceName_ = "";
            this.resolution_ = "";
            this.screenDpi_ = "";
            this.cpuName_ = "";
            this.ramSpec_ = "";
            this.romSpec_ = "";
            this.batteryCapacity_ = "";
            this.btMac_ = "";
            this.androidVersion_ = "";
            this.osVersion_ = "";
            this.brand_ = "";
            this.region_ = "";
            this.oaid_ = "";
            this.marketName_ = "";
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4465clone() {
            return (Builder) super.mo4465clone();
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof Spec) {
                return mergeFrom((Spec) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Spec spec) {
            if (spec == Spec.getDefaultInstance()) {
                return this;
            }
            if (!spec.getDeviceName().isEmpty()) {
                this.deviceName_ = spec.deviceName_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (!spec.getResolution().isEmpty()) {
                this.resolution_ = spec.resolution_;
                this.bitField0_ |= 2;
                onChanged();
            }
            if (!spec.getScreenDpi().isEmpty()) {
                this.screenDpi_ = spec.screenDpi_;
                this.bitField0_ |= 4;
                onChanged();
            }
            if (!spec.getCpuName().isEmpty()) {
                this.cpuName_ = spec.cpuName_;
                this.bitField0_ |= 8;
                onChanged();
            }
            if (!spec.getRamSpec().isEmpty()) {
                this.ramSpec_ = spec.ramSpec_;
                this.bitField0_ |= 16;
                onChanged();
            }
            if (!spec.getRomSpec().isEmpty()) {
                this.romSpec_ = spec.romSpec_;
                this.bitField0_ |= 32;
                onChanged();
            }
            if (!spec.getBatteryCapacity().isEmpty()) {
                this.batteryCapacity_ = spec.batteryCapacity_;
                this.bitField0_ |= 64;
                onChanged();
            }
            if (!spec.getBtMac().isEmpty()) {
                this.btMac_ = spec.btMac_;
                this.bitField0_ |= 128;
                onChanged();
            }
            if (!spec.getAndroidVersion().isEmpty()) {
                this.androidVersion_ = spec.androidVersion_;
                this.bitField0_ |= 256;
                onChanged();
            }
            if (!spec.getOsVersion().isEmpty()) {
                this.osVersion_ = spec.osVersion_;
                this.bitField0_ |= 512;
                onChanged();
            }
            if (!spec.getBrand().isEmpty()) {
                this.brand_ = spec.brand_;
                this.bitField0_ |= 1024;
                onChanged();
            }
            if (!spec.getRegion().isEmpty()) {
                this.region_ = spec.region_;
                this.bitField0_ |= 2048;
                onChanged();
            }
            if (!spec.getOaid().isEmpty()) {
                this.oaid_ = spec.oaid_;
                this.bitField0_ |= 4096;
                onChanged();
            }
            if (!spec.getMarketName().isEmpty()) {
                this.marketName_ = spec.marketName_;
                this.bitField0_ |= 8192;
                onChanged();
            }
            mergeUnknownFields(spec.getUnknownFields());
            onChanged();
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.deviceName_ = "";
            this.resolution_ = "";
            this.screenDpi_ = "";
            this.cpuName_ = "";
            this.ramSpec_ = "";
            this.romSpec_ = "";
            this.batteryCapacity_ = "";
            this.btMac_ = "";
            this.androidVersion_ = "";
            this.osVersion_ = "";
            this.brand_ = "";
            this.region_ = "";
            this.oaid_ = "";
            this.marketName_ = "";
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
                                this.deviceName_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 1;
                                continue;
                            case 18:
                                this.resolution_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 2;
                                continue;
                            case 26:
                                this.screenDpi_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 4;
                                continue;
                            case 34:
                                this.cpuName_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 8;
                                continue;
                            case 42:
                                this.ramSpec_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 16;
                                continue;
                            case 50:
                                this.romSpec_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 32;
                                continue;
                            case 58:
                                this.batteryCapacity_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 64;
                                continue;
                            case 66:
                                this.btMac_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 128;
                                continue;
                            case 74:
                                this.androidVersion_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 256;
                                continue;
                            case 82:
                                this.osVersion_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 512;
                                continue;
                            case 90:
                                this.brand_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 1024;
                                continue;
                            case 98:
                                this.region_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 2048;
                                continue;
                            case 106:
                                this.oaid_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 4096;
                                continue;
                            case 114:
                                this.marketName_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 8192;
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

    public class a extends AbstractParser<Spec> {
        @Override // com.google.protobuf.Parser
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Spec parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = Spec.newBuilder();
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

    public /* synthetic */ Spec(GeneratedMessageV3.Builder builder, a aVar) {
        this(builder);
    }

    public static Spec getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return xq5.f18723e;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Spec parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Spec) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Spec parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<Spec> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Spec)) {
            return super.equals(obj);
        }
        Spec spec = (Spec) obj;
        return getDeviceName().equals(spec.getDeviceName()) && getResolution().equals(spec.getResolution()) && getScreenDpi().equals(spec.getScreenDpi()) && getCpuName().equals(spec.getCpuName()) && getRamSpec().equals(spec.getRamSpec()) && getRomSpec().equals(spec.getRomSpec()) && getBatteryCapacity().equals(spec.getBatteryCapacity()) && getBtMac().equals(spec.getBtMac()) && getAndroidVersion().equals(spec.getAndroidVersion()) && getOsVersion().equals(spec.getOsVersion()) && getBrand().equals(spec.getBrand()) && getRegion().equals(spec.getRegion()) && getOaid().equals(spec.getOaid()) && getMarketName().equals(spec.getMarketName()) && getUnknownFields().equals(spec.getUnknownFields());
    }

    @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
    public String getAndroidVersion() {
        Object obj = this.androidVersion_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.androidVersion_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
    public ByteString getAndroidVersionBytes() {
        Object obj = this.androidVersion_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.androidVersion_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
    public String getBatteryCapacity() {
        Object obj = this.batteryCapacity_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.batteryCapacity_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
    public ByteString getBatteryCapacityBytes() {
        Object obj = this.batteryCapacity_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.batteryCapacity_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
    public String getBrand() {
        Object obj = this.brand_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.brand_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
    public ByteString getBrandBytes() {
        Object obj = this.brand_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.brand_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
    public String getBtMac() {
        Object obj = this.btMac_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.btMac_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
    public ByteString getBtMacBytes() {
        Object obj = this.btMac_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.btMac_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
    public String getCpuName() {
        Object obj = this.cpuName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.cpuName_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
    public ByteString getCpuNameBytes() {
        Object obj = this.cpuName_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.cpuName_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
    public String getDeviceName() {
        Object obj = this.deviceName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.deviceName_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
    public ByteString getDeviceNameBytes() {
        Object obj = this.deviceName_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.deviceName_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
    public String getMarketName() {
        Object obj = this.marketName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.marketName_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
    public ByteString getMarketNameBytes() {
        Object obj = this.marketName_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.marketName_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
    public String getOaid() {
        Object obj = this.oaid_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.oaid_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
    public ByteString getOaidBytes() {
        Object obj = this.oaid_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.oaid_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
    public String getOsVersion() {
        Object obj = this.osVersion_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.osVersion_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
    public ByteString getOsVersionBytes() {
        Object obj = this.osVersion_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.osVersion_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<Spec> getParserForType() {
        return PARSER;
    }

    @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
    public String getRamSpec() {
        Object obj = this.ramSpec_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.ramSpec_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
    public ByteString getRamSpecBytes() {
        Object obj = this.ramSpec_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.ramSpec_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
    public String getRegion() {
        Object obj = this.region_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.region_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
    public ByteString getRegionBytes() {
        Object obj = this.region_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.region_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
    public String getResolution() {
        Object obj = this.resolution_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.resolution_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
    public ByteString getResolutionBytes() {
        Object obj = this.resolution_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.resolution_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
    public String getRomSpec() {
        Object obj = this.romSpec_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.romSpec_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
    public ByteString getRomSpecBytes() {
        Object obj = this.romSpec_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.romSpec_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
    public String getScreenDpi() {
        Object obj = this.screenDpi_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.screenDpi_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.SpecOrBuilder
    public ByteString getScreenDpiBytes() {
        Object obj = this.screenDpi_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.screenDpi_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.deviceName_) ? GeneratedMessageV3.computeStringSize(1, this.deviceName_) : 0;
        if (!GeneratedMessageV3.isStringEmpty(this.resolution_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.resolution_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.screenDpi_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.screenDpi_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.cpuName_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.cpuName_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.ramSpec_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(5, this.ramSpec_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.romSpec_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(6, this.romSpec_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.batteryCapacity_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(7, this.batteryCapacity_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.btMac_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(8, this.btMac_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.androidVersion_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(9, this.androidVersion_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.osVersion_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(10, this.osVersion_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.brand_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(11, this.brand_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.region_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(12, this.region_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.oaid_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(13, this.oaid_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.marketName_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(14, this.marketName_);
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
        int iHashCode = getUnknownFields().hashCode() + ((getMarketName().hashCode() + ((((getOaid().hashCode() + ((((getRegion().hashCode() + ((((getBrand().hashCode() + ((((getOsVersion().hashCode() + ((((getAndroidVersion().hashCode() + ((((getBtMac().hashCode() + ((((getBatteryCapacity().hashCode() + ((((getRomSpec().hashCode() + ((((getRamSpec().hashCode() + ((((getCpuName().hashCode() + ((((getScreenDpi().hashCode() + ((((getResolution().hashCode() + ((((getDeviceName().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53)) * 37) + 7) * 53)) * 37) + 8) * 53)) * 37) + 9) * 53)) * 37) + 10) * 53)) * 37) + 11) * 53)) * 37) + 12) * 53)) * 37) + 13) * 53)) * 37) + 14) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return xq5.f.ensureFieldAccessorsInitialized(Spec.class, Builder.class);
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
        return new Spec();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!GeneratedMessageV3.isStringEmpty(this.deviceName_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.deviceName_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.resolution_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.resolution_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.screenDpi_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.screenDpi_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.cpuName_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.cpuName_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.ramSpec_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 5, this.ramSpec_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.romSpec_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 6, this.romSpec_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.batteryCapacity_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 7, this.batteryCapacity_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.btMac_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 8, this.btMac_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.androidVersion_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 9, this.androidVersion_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.osVersion_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 10, this.osVersion_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.brand_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 11, this.brand_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.region_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 12, this.region_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.oaid_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 13, this.oaid_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.marketName_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 14, this.marketName_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    private Spec(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.deviceName_ = "";
        this.resolution_ = "";
        this.screenDpi_ = "";
        this.cpuName_ = "";
        this.ramSpec_ = "";
        this.romSpec_ = "";
        this.batteryCapacity_ = "";
        this.btMac_ = "";
        this.androidVersion_ = "";
        this.osVersion_ = "";
        this.brand_ = "";
        this.region_ = "";
        this.oaid_ = "";
        this.marketName_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Builder newBuilder(Spec spec) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(spec);
    }

    public static Spec parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Spec parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Spec) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Spec parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public Spec getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        a aVar = null;
        return this == DEFAULT_INSTANCE ? new Builder(aVar) : new Builder(aVar).mergeFrom(this);
    }

    public static Spec parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Spec parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent, null);
    }

    public static Spec parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Spec parseFrom(InputStream inputStream) throws IOException {
        return (Spec) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Spec parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Spec) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Spec parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Spec) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Spec parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Spec) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    private Spec() {
        this.deviceName_ = "";
        this.resolution_ = "";
        this.screenDpi_ = "";
        this.cpuName_ = "";
        this.ramSpec_ = "";
        this.romSpec_ = "";
        this.batteryCapacity_ = "";
        this.btMac_ = "";
        this.androidVersion_ = "";
        this.osVersion_ = "";
        this.brand_ = "";
        this.region_ = "";
        this.oaid_ = "";
        this.marketName_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.deviceName_ = "";
        this.resolution_ = "";
        this.screenDpi_ = "";
        this.cpuName_ = "";
        this.ramSpec_ = "";
        this.romSpec_ = "";
        this.batteryCapacity_ = "";
        this.btMac_ = "";
        this.androidVersion_ = "";
        this.osVersion_ = "";
        this.brand_ = "";
        this.region_ = "";
        this.oaid_ = "";
        this.marketName_ = "";
    }
}
