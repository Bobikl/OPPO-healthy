package com.google.security.cryptauth.lib.securegcm;

import com.google.mlkit.vision.barcode.common.Barcode;
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
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.UnknownFieldSet;
import com.heytap.accessory.connectivity.constant.ConnectConstant;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public final class SecureGcmProto {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_securegcm_GcmDeviceInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_securegcm_GcmDeviceInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_securegcm_GcmMetadata_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_securegcm_GcmMetadata_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_securegcm_LoginNotificationInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_securegcm_LoginNotificationInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_securegcm_Tickle_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_securegcm_Tickle_fieldAccessorTable;

    public enum AppleDeviceDiagonalMils implements ProtocolMessageEnum {
        APPLE_PHONE(APPLE_PHONE_VALUE),
        APPLE_PAD(APPLE_PAD_VALUE);

        public static final int APPLE_PAD_VALUE = 7900;
        public static final int APPLE_PHONE_VALUE = 4000;
        private final int value;
        private static final Internal.EnumLiteMap<AppleDeviceDiagonalMils> internalValueMap = new Internal.EnumLiteMap<AppleDeviceDiagonalMils>() { // from class: com.google.security.cryptauth.lib.securegcm.SecureGcmProto.AppleDeviceDiagonalMils.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public AppleDeviceDiagonalMils findValueByNumber(int i) {
                return AppleDeviceDiagonalMils.forNumber(i);
            }
        };
        private static final AppleDeviceDiagonalMils[] VALUES = values();

        AppleDeviceDiagonalMils(int i) {
            this.value = i;
        }

        public static AppleDeviceDiagonalMils forNumber(int i) {
            if (i == 4000) {
                return APPLE_PHONE;
            }
            if (i != 7900) {
                return null;
            }
            return APPLE_PAD;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return SecureGcmProto.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<AppleDeviceDiagonalMils> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            return getDescriptor().getValues().get(ordinal());
        }

        @Deprecated
        public static AppleDeviceDiagonalMils valueOf(int i) {
            return forNumber(i);
        }

        public static AppleDeviceDiagonalMils valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public enum DeviceType implements ProtocolMessageEnum {
        UNKNOWN(0),
        ANDROID(1),
        CHROME(2),
        IOS(3),
        BROWSER(4),
        OSX(5);

        public static final int ANDROID_VALUE = 1;
        public static final int BROWSER_VALUE = 4;
        public static final int CHROME_VALUE = 2;
        public static final int IOS_VALUE = 3;
        public static final int OSX_VALUE = 5;
        public static final int UNKNOWN_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<DeviceType> internalValueMap = new Internal.EnumLiteMap<DeviceType>() { // from class: com.google.security.cryptauth.lib.securegcm.SecureGcmProto.DeviceType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public DeviceType findValueByNumber(int i) {
                return DeviceType.forNumber(i);
            }
        };
        private static final DeviceType[] VALUES = values();

        DeviceType(int i) {
            this.value = i;
        }

        public static DeviceType forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return ANDROID;
            }
            if (i == 2) {
                return CHROME;
            }
            if (i == 3) {
                return IOS;
            }
            if (i == 4) {
                return BROWSER;
            }
            if (i != 5) {
                return null;
            }
            return OSX;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return SecureGcmProto.getDescriptor().getEnumTypes().get(1);
        }

        public static Internal.EnumLiteMap<DeviceType> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            return getDescriptor().getValues().get(ordinal());
        }

        @Deprecated
        public static DeviceType valueOf(int i) {
            return forNumber(i);
        }

        public static DeviceType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class GcmDeviceInfo extends GeneratedMessageV3 implements GcmDeviceInfoOrBuilder {
        public static final int ANDROID_DEVICE_ID_FIELD_NUMBER = 1;
        public static final int APN_REGISTRATION_ID_FIELD_NUMBER = 202;
        public static final int ARC_PLUS_PLUS_FIELD_NUMBER = 409;
        public static final int AUTO_UNLOCK_SCREENLOCK_ENABLED_FIELD_NUMBER = 402;
        public static final int AUTO_UNLOCK_SCREENLOCK_SUPPORTED_FIELD_NUMBER = 401;
        public static final int BLE_RADIO_SUPPORTED_FIELD_NUMBER = 407;
        public static final int BLUETOOTH_MAC_ADDRESS_FIELD_NUMBER = 302;
        public static final int BLUETOOTH_RADIO_ENABLED_FIELD_NUMBER = 404;
        public static final int BLUETOOTH_RADIO_SUPPORTED_FIELD_NUMBER = 403;
        public static final int COUNTER_FIELD_NUMBER = 12;
        public static final int DEVICE_AUTHZEN_VERSION_FIELD_NUMBER = 24;
        public static final int DEVICE_DISPLAY_DIAGONAL_MILS_FIELD_NUMBER = 22;
        public static final int DEVICE_MANUFACTURER_FIELD_NUMBER = 31;
        public static final int DEVICE_MASTER_KEY_HASH_FIELD_NUMBER = 103;
        public static final int DEVICE_MODEL_FIELD_NUMBER = 7;
        public static final int DEVICE_OS_CODENAME_FIELD_NUMBER = 16;
        public static final int DEVICE_OS_RELEASE_FIELD_NUMBER = 15;
        public static final int DEVICE_OS_VERSION_CODE_FIELD_NUMBER = 14;
        public static final int DEVICE_OS_VERSION_FIELD_NUMBER = 13;
        public static final int DEVICE_SOFTWARE_PACKAGE_FIELD_NUMBER = 19;
        public static final int DEVICE_SOFTWARE_VERSION_CODE_FIELD_NUMBER = 18;
        public static final int DEVICE_SOFTWARE_VERSION_FIELD_NUMBER = 17;
        public static final int DEVICE_TYPE_FIELD_NUMBER = 32;
        public static final int ENABLED_SOFTWARE_FEATURES_FIELD_NUMBER = 412;
        public static final int ENROLLMENT_SESSION_ID_FIELD_NUMBER = 1000;
        public static final int GCM_REGISTRATION_ID_FIELD_NUMBER = 102;
        public static final int IS_SCREENLOCK_STATE_FLAKY_FIELD_NUMBER = 410;
        public static final int KEY_HANDLE_FIELD_NUMBER = 9;
        public static final int LOCALE_FIELD_NUMBER = 8;
        public static final int LONG_DEVICE_ID_FIELD_NUMBER = 29;
        public static final int MOBILE_DATA_SUPPORTED_FIELD_NUMBER = 405;
        public static final int NOTIFICATION_ENABLED_FIELD_NUMBER = 203;
        public static final int OAUTH_TOKEN_FIELD_NUMBER = 1001;
        public static final int PIXEL_EXPERIENCE_FIELD_NUMBER = 408;
        public static final int SUPPORTED_SOFTWARE_FEATURES_FIELD_NUMBER = 411;
        public static final int TETHERING_SUPPORTED_FIELD_NUMBER = 406;
        public static final int USER_PUBLIC_KEY_FIELD_NUMBER = 4;
        public static final int USING_SECURE_SCREENLOCK_FIELD_NUMBER = 400;
        private static final long serialVersionUID = 0;
        private long androidDeviceId_;
        private ByteString apnRegistrationId_;
        private boolean arcPlusPlus_;
        private boolean autoUnlockScreenlockEnabled_;
        private boolean autoUnlockScreenlockSupported_;
        private int bitField0_;
        private int bitField1_;
        private boolean bleRadioSupported_;
        private volatile Object bluetoothMacAddress_;
        private boolean bluetoothRadioEnabled_;
        private boolean bluetoothRadioSupported_;
        private long counter_;
        private int deviceAuthzenVersion_;
        private int deviceDisplayDiagonalMils_;
        private volatile Object deviceManufacturer_;
        private ByteString deviceMasterKeyHash_;
        private volatile Object deviceModel_;
        private volatile Object deviceOsCodename_;
        private volatile Object deviceOsRelease_;
        private long deviceOsVersionCode_;
        private volatile Object deviceOsVersion_;
        private volatile Object deviceSoftwarePackage_;
        private long deviceSoftwareVersionCode_;
        private volatile Object deviceSoftwareVersion_;
        private int deviceType_;
        private List<Integer> enabledSoftwareFeatures_;
        private ByteString enrollmentSessionId_;
        private ByteString gcmRegistrationId_;
        private boolean isScreenlockStateFlaky_;
        private ByteString keyHandle_;
        private volatile Object locale_;
        private ByteString longDeviceId_;
        private byte memoizedIsInitialized;
        private boolean mobileDataSupported_;
        private boolean notificationEnabled_;
        private volatile Object oauthToken_;
        private boolean pixelExperience_;
        private List<Integer> supportedSoftwareFeatures_;
        private boolean tetheringSupported_;
        private ByteString userPublicKey_;
        private boolean usingSecureScreenlock_;
        private static final Internal.ListAdapter.Converter<Integer, SoftwareFeature> supportedSoftwareFeatures_converter_ = new Internal.ListAdapter.Converter<Integer, SoftwareFeature>() { // from class: com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfo.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public SoftwareFeature convert(Integer num) {
                SoftwareFeature softwareFeatureValueOf = SoftwareFeature.valueOf(num.intValue());
                return softwareFeatureValueOf == null ? SoftwareFeature.UNKNOWN_FEATURE : softwareFeatureValueOf;
            }
        };
        private static final Internal.ListAdapter.Converter<Integer, SoftwareFeature> enabledSoftwareFeatures_converter_ = new Internal.ListAdapter.Converter<Integer, SoftwareFeature>() { // from class: com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfo.2
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public SoftwareFeature convert(Integer num) {
                SoftwareFeature softwareFeatureValueOf = SoftwareFeature.valueOf(num.intValue());
                return softwareFeatureValueOf == null ? SoftwareFeature.UNKNOWN_FEATURE : softwareFeatureValueOf;
            }
        };
        private static final GcmDeviceInfo DEFAULT_INSTANCE = new GcmDeviceInfo();

        @Deprecated
        public static final Parser<GcmDeviceInfo> PARSER = new AbstractParser<GcmDeviceInfo>() { // from class: com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfo.3
            @Override // com.google.protobuf.Parser
            public GcmDeviceInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new GcmDeviceInfo(codedInputStream, extensionRegistryLite);
            }
        };

        public static GcmDeviceInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SecureGcmProto.internal_static_securegcm_GcmDeviceInfo_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GcmDeviceInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GcmDeviceInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GcmDeviceInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<GcmDeviceInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GcmDeviceInfo)) {
                return super.equals(obj);
            }
            GcmDeviceInfo gcmDeviceInfo = (GcmDeviceInfo) obj;
            boolean z = hasAndroidDeviceId() == gcmDeviceInfo.hasAndroidDeviceId();
            if (hasAndroidDeviceId()) {
                z = z && getAndroidDeviceId() == gcmDeviceInfo.getAndroidDeviceId();
            }
            boolean z2 = z && hasGcmRegistrationId() == gcmDeviceInfo.hasGcmRegistrationId();
            if (hasGcmRegistrationId()) {
                z2 = z2 && getGcmRegistrationId().equals(gcmDeviceInfo.getGcmRegistrationId());
            }
            boolean z3 = z2 && hasApnRegistrationId() == gcmDeviceInfo.hasApnRegistrationId();
            if (hasApnRegistrationId()) {
                z3 = z3 && getApnRegistrationId().equals(gcmDeviceInfo.getApnRegistrationId());
            }
            boolean z4 = z3 && hasNotificationEnabled() == gcmDeviceInfo.hasNotificationEnabled();
            if (hasNotificationEnabled()) {
                z4 = z4 && getNotificationEnabled() == gcmDeviceInfo.getNotificationEnabled();
            }
            boolean z5 = z4 && hasBluetoothMacAddress() == gcmDeviceInfo.hasBluetoothMacAddress();
            if (hasBluetoothMacAddress()) {
                z5 = z5 && getBluetoothMacAddress().equals(gcmDeviceInfo.getBluetoothMacAddress());
            }
            boolean z6 = z5 && hasDeviceMasterKeyHash() == gcmDeviceInfo.hasDeviceMasterKeyHash();
            if (hasDeviceMasterKeyHash()) {
                z6 = z6 && getDeviceMasterKeyHash().equals(gcmDeviceInfo.getDeviceMasterKeyHash());
            }
            boolean z7 = z6 && hasUserPublicKey() == gcmDeviceInfo.hasUserPublicKey();
            if (hasUserPublicKey()) {
                z7 = z7 && getUserPublicKey().equals(gcmDeviceInfo.getUserPublicKey());
            }
            boolean z8 = z7 && hasDeviceModel() == gcmDeviceInfo.hasDeviceModel();
            if (hasDeviceModel()) {
                z8 = z8 && getDeviceModel().equals(gcmDeviceInfo.getDeviceModel());
            }
            boolean z9 = z8 && hasLocale() == gcmDeviceInfo.hasLocale();
            if (hasLocale()) {
                z9 = z9 && getLocale().equals(gcmDeviceInfo.getLocale());
            }
            boolean z10 = z9 && hasKeyHandle() == gcmDeviceInfo.hasKeyHandle();
            if (hasKeyHandle()) {
                z10 = z10 && getKeyHandle().equals(gcmDeviceInfo.getKeyHandle());
            }
            boolean z11 = z10 && hasCounter() == gcmDeviceInfo.hasCounter();
            if (hasCounter()) {
                z11 = z11 && getCounter() == gcmDeviceInfo.getCounter();
            }
            boolean z12 = z11 && hasDeviceOsVersion() == gcmDeviceInfo.hasDeviceOsVersion();
            if (hasDeviceOsVersion()) {
                z12 = z12 && getDeviceOsVersion().equals(gcmDeviceInfo.getDeviceOsVersion());
            }
            boolean z13 = z12 && hasDeviceOsVersionCode() == gcmDeviceInfo.hasDeviceOsVersionCode();
            if (hasDeviceOsVersionCode()) {
                z13 = z13 && getDeviceOsVersionCode() == gcmDeviceInfo.getDeviceOsVersionCode();
            }
            boolean z14 = z13 && hasDeviceOsRelease() == gcmDeviceInfo.hasDeviceOsRelease();
            if (hasDeviceOsRelease()) {
                z14 = z14 && getDeviceOsRelease().equals(gcmDeviceInfo.getDeviceOsRelease());
            }
            boolean z15 = z14 && hasDeviceOsCodename() == gcmDeviceInfo.hasDeviceOsCodename();
            if (hasDeviceOsCodename()) {
                z15 = z15 && getDeviceOsCodename().equals(gcmDeviceInfo.getDeviceOsCodename());
            }
            boolean z16 = z15 && hasDeviceSoftwareVersion() == gcmDeviceInfo.hasDeviceSoftwareVersion();
            if (hasDeviceSoftwareVersion()) {
                z16 = z16 && getDeviceSoftwareVersion().equals(gcmDeviceInfo.getDeviceSoftwareVersion());
            }
            boolean z17 = z16 && hasDeviceSoftwareVersionCode() == gcmDeviceInfo.hasDeviceSoftwareVersionCode();
            if (hasDeviceSoftwareVersionCode()) {
                z17 = z17 && getDeviceSoftwareVersionCode() == gcmDeviceInfo.getDeviceSoftwareVersionCode();
            }
            boolean z18 = z17 && hasDeviceSoftwarePackage() == gcmDeviceInfo.hasDeviceSoftwarePackage();
            if (hasDeviceSoftwarePackage()) {
                z18 = z18 && getDeviceSoftwarePackage().equals(gcmDeviceInfo.getDeviceSoftwarePackage());
            }
            boolean z19 = z18 && hasDeviceDisplayDiagonalMils() == gcmDeviceInfo.hasDeviceDisplayDiagonalMils();
            if (hasDeviceDisplayDiagonalMils()) {
                z19 = z19 && getDeviceDisplayDiagonalMils() == gcmDeviceInfo.getDeviceDisplayDiagonalMils();
            }
            boolean z20 = z19 && hasDeviceAuthzenVersion() == gcmDeviceInfo.hasDeviceAuthzenVersion();
            if (hasDeviceAuthzenVersion()) {
                z20 = z20 && getDeviceAuthzenVersion() == gcmDeviceInfo.getDeviceAuthzenVersion();
            }
            boolean z21 = z20 && hasLongDeviceId() == gcmDeviceInfo.hasLongDeviceId();
            if (hasLongDeviceId()) {
                z21 = z21 && getLongDeviceId().equals(gcmDeviceInfo.getLongDeviceId());
            }
            boolean z22 = z21 && hasDeviceManufacturer() == gcmDeviceInfo.hasDeviceManufacturer();
            if (hasDeviceManufacturer()) {
                z22 = z22 && getDeviceManufacturer().equals(gcmDeviceInfo.getDeviceManufacturer());
            }
            boolean z23 = z22 && hasDeviceType() == gcmDeviceInfo.hasDeviceType();
            if (hasDeviceType()) {
                z23 = z23 && this.deviceType_ == gcmDeviceInfo.deviceType_;
            }
            boolean z24 = z23 && hasUsingSecureScreenlock() == gcmDeviceInfo.hasUsingSecureScreenlock();
            if (hasUsingSecureScreenlock()) {
                z24 = z24 && getUsingSecureScreenlock() == gcmDeviceInfo.getUsingSecureScreenlock();
            }
            boolean z25 = z24 && hasAutoUnlockScreenlockSupported() == gcmDeviceInfo.hasAutoUnlockScreenlockSupported();
            if (hasAutoUnlockScreenlockSupported()) {
                z25 = z25 && getAutoUnlockScreenlockSupported() == gcmDeviceInfo.getAutoUnlockScreenlockSupported();
            }
            boolean z26 = z25 && hasAutoUnlockScreenlockEnabled() == gcmDeviceInfo.hasAutoUnlockScreenlockEnabled();
            if (hasAutoUnlockScreenlockEnabled()) {
                z26 = z26 && getAutoUnlockScreenlockEnabled() == gcmDeviceInfo.getAutoUnlockScreenlockEnabled();
            }
            boolean z27 = z26 && hasBluetoothRadioSupported() == gcmDeviceInfo.hasBluetoothRadioSupported();
            if (hasBluetoothRadioSupported()) {
                z27 = z27 && getBluetoothRadioSupported() == gcmDeviceInfo.getBluetoothRadioSupported();
            }
            boolean z28 = z27 && hasBluetoothRadioEnabled() == gcmDeviceInfo.hasBluetoothRadioEnabled();
            if (hasBluetoothRadioEnabled()) {
                z28 = z28 && getBluetoothRadioEnabled() == gcmDeviceInfo.getBluetoothRadioEnabled();
            }
            boolean z29 = z28 && hasMobileDataSupported() == gcmDeviceInfo.hasMobileDataSupported();
            if (hasMobileDataSupported()) {
                z29 = z29 && getMobileDataSupported() == gcmDeviceInfo.getMobileDataSupported();
            }
            boolean z30 = z29 && hasTetheringSupported() == gcmDeviceInfo.hasTetheringSupported();
            if (hasTetheringSupported()) {
                z30 = z30 && getTetheringSupported() == gcmDeviceInfo.getTetheringSupported();
            }
            boolean z31 = z30 && hasBleRadioSupported() == gcmDeviceInfo.hasBleRadioSupported();
            if (hasBleRadioSupported()) {
                z31 = z31 && getBleRadioSupported() == gcmDeviceInfo.getBleRadioSupported();
            }
            boolean z32 = z31 && hasPixelExperience() == gcmDeviceInfo.hasPixelExperience();
            if (hasPixelExperience()) {
                z32 = z32 && getPixelExperience() == gcmDeviceInfo.getPixelExperience();
            }
            boolean z33 = z32 && hasArcPlusPlus() == gcmDeviceInfo.hasArcPlusPlus();
            if (hasArcPlusPlus()) {
                z33 = z33 && getArcPlusPlus() == gcmDeviceInfo.getArcPlusPlus();
            }
            boolean z34 = z33 && hasIsScreenlockStateFlaky() == gcmDeviceInfo.hasIsScreenlockStateFlaky();
            if (hasIsScreenlockStateFlaky()) {
                z34 = z34 && getIsScreenlockStateFlaky() == gcmDeviceInfo.getIsScreenlockStateFlaky();
            }
            boolean z35 = ((z34 && this.supportedSoftwareFeatures_.equals(gcmDeviceInfo.supportedSoftwareFeatures_)) && this.enabledSoftwareFeatures_.equals(gcmDeviceInfo.enabledSoftwareFeatures_)) && hasEnrollmentSessionId() == gcmDeviceInfo.hasEnrollmentSessionId();
            if (hasEnrollmentSessionId()) {
                z35 = z35 && getEnrollmentSessionId().equals(gcmDeviceInfo.getEnrollmentSessionId());
            }
            boolean z36 = z35 && hasOauthToken() == gcmDeviceInfo.hasOauthToken();
            if (hasOauthToken()) {
                z36 = z36 && getOauthToken().equals(gcmDeviceInfo.getOauthToken());
            }
            return z36 && this.unknownFields.equals(gcmDeviceInfo.unknownFields);
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public long getAndroidDeviceId() {
            return this.androidDeviceId_;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public ByteString getApnRegistrationId() {
            return this.apnRegistrationId_;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean getArcPlusPlus() {
            return this.arcPlusPlus_;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean getAutoUnlockScreenlockEnabled() {
            return this.autoUnlockScreenlockEnabled_;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean getAutoUnlockScreenlockSupported() {
            return this.autoUnlockScreenlockSupported_;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean getBleRadioSupported() {
            return this.bleRadioSupported_;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public String getBluetoothMacAddress() {
            Object obj = this.bluetoothMacAddress_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.bluetoothMacAddress_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public ByteString getBluetoothMacAddressBytes() {
            Object obj = this.bluetoothMacAddress_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bluetoothMacAddress_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean getBluetoothRadioEnabled() {
            return this.bluetoothRadioEnabled_;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean getBluetoothRadioSupported() {
            return this.bluetoothRadioSupported_;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public long getCounter() {
            return this.counter_;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public int getDeviceAuthzenVersion() {
            return this.deviceAuthzenVersion_;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public int getDeviceDisplayDiagonalMils() {
            return this.deviceDisplayDiagonalMils_;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public String getDeviceManufacturer() {
            Object obj = this.deviceManufacturer_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.deviceManufacturer_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public ByteString getDeviceManufacturerBytes() {
            Object obj = this.deviceManufacturer_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.deviceManufacturer_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public ByteString getDeviceMasterKeyHash() {
            return this.deviceMasterKeyHash_;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public String getDeviceModel() {
            Object obj = this.deviceModel_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.deviceModel_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public ByteString getDeviceModelBytes() {
            Object obj = this.deviceModel_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.deviceModel_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public String getDeviceOsCodename() {
            Object obj = this.deviceOsCodename_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.deviceOsCodename_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public ByteString getDeviceOsCodenameBytes() {
            Object obj = this.deviceOsCodename_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.deviceOsCodename_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public String getDeviceOsRelease() {
            Object obj = this.deviceOsRelease_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.deviceOsRelease_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public ByteString getDeviceOsReleaseBytes() {
            Object obj = this.deviceOsRelease_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.deviceOsRelease_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public String getDeviceOsVersion() {
            Object obj = this.deviceOsVersion_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.deviceOsVersion_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public ByteString getDeviceOsVersionBytes() {
            Object obj = this.deviceOsVersion_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.deviceOsVersion_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public long getDeviceOsVersionCode() {
            return this.deviceOsVersionCode_;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public String getDeviceSoftwarePackage() {
            Object obj = this.deviceSoftwarePackage_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.deviceSoftwarePackage_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public ByteString getDeviceSoftwarePackageBytes() {
            Object obj = this.deviceSoftwarePackage_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.deviceSoftwarePackage_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public String getDeviceSoftwareVersion() {
            Object obj = this.deviceSoftwareVersion_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.deviceSoftwareVersion_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public ByteString getDeviceSoftwareVersionBytes() {
            Object obj = this.deviceSoftwareVersion_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.deviceSoftwareVersion_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public long getDeviceSoftwareVersionCode() {
            return this.deviceSoftwareVersionCode_;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public DeviceType getDeviceType() {
            DeviceType deviceTypeValueOf = DeviceType.valueOf(this.deviceType_);
            return deviceTypeValueOf == null ? DeviceType.ANDROID : deviceTypeValueOf;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public SoftwareFeature getEnabledSoftwareFeatures(int i) {
            return enabledSoftwareFeatures_converter_.convert(this.enabledSoftwareFeatures_.get(i));
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public int getEnabledSoftwareFeaturesCount() {
            return this.enabledSoftwareFeatures_.size();
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public List<SoftwareFeature> getEnabledSoftwareFeaturesList() {
            return new Internal.ListAdapter(this.enabledSoftwareFeatures_, enabledSoftwareFeatures_converter_);
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public ByteString getEnrollmentSessionId() {
            return this.enrollmentSessionId_;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public ByteString getGcmRegistrationId() {
            return this.gcmRegistrationId_;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean getIsScreenlockStateFlaky() {
            return this.isScreenlockStateFlaky_;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public ByteString getKeyHandle() {
            return this.keyHandle_;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public String getLocale() {
            Object obj = this.locale_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.locale_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public ByteString getLocaleBytes() {
            Object obj = this.locale_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.locale_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public ByteString getLongDeviceId() {
            return this.longDeviceId_;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean getMobileDataSupported() {
            return this.mobileDataSupported_;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean getNotificationEnabled() {
            return this.notificationEnabled_;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public String getOauthToken() {
            Object obj = this.oauthToken_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.oauthToken_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public ByteString getOauthTokenBytes() {
            Object obj = this.oauthToken_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.oauthToken_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GcmDeviceInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean getPixelExperience() {
            return this.pixelExperience_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeFixed64Size = (this.bitField0_ & 1) == 1 ? CodedOutputStream.computeFixed64Size(1, this.androidDeviceId_) + 0 : 0;
            if ((this.bitField0_ & 64) == 64) {
                iComputeFixed64Size += CodedOutputStream.computeBytesSize(4, this.userPublicKey_);
            }
            if ((this.bitField0_ & Barcode.FORMAT_ITF) == 128) {
                iComputeFixed64Size += GeneratedMessageV3.computeStringSize(7, this.deviceModel_);
            }
            if ((this.bitField0_ & 256) == 256) {
                iComputeFixed64Size += GeneratedMessageV3.computeStringSize(8, this.locale_);
            }
            if ((this.bitField0_ & 512) == 512) {
                iComputeFixed64Size += CodedOutputStream.computeBytesSize(9, this.keyHandle_);
            }
            if ((this.bitField0_ & Barcode.FORMAT_UPC_E) == 1024) {
                iComputeFixed64Size += CodedOutputStream.computeInt64Size(12, this.counter_);
            }
            if ((this.bitField0_ & Barcode.FORMAT_PDF417) == 2048) {
                iComputeFixed64Size += GeneratedMessageV3.computeStringSize(13, this.deviceOsVersion_);
            }
            if ((this.bitField0_ & 4096) == 4096) {
                iComputeFixed64Size += CodedOutputStream.computeInt64Size(14, this.deviceOsVersionCode_);
            }
            if ((this.bitField0_ & 8192) == 8192) {
                iComputeFixed64Size += GeneratedMessageV3.computeStringSize(15, this.deviceOsRelease_);
            }
            if ((this.bitField0_ & 16384) == 16384) {
                iComputeFixed64Size += GeneratedMessageV3.computeStringSize(16, this.deviceOsCodename_);
            }
            if ((this.bitField0_ & 32768) == 32768) {
                iComputeFixed64Size += GeneratedMessageV3.computeStringSize(17, this.deviceSoftwareVersion_);
            }
            if ((this.bitField0_ & 65536) == 65536) {
                iComputeFixed64Size += CodedOutputStream.computeInt64Size(18, this.deviceSoftwareVersionCode_);
            }
            if ((this.bitField0_ & 131072) == 131072) {
                iComputeFixed64Size += GeneratedMessageV3.computeStringSize(19, this.deviceSoftwarePackage_);
            }
            if ((this.bitField0_ & 262144) == 262144) {
                iComputeFixed64Size += CodedOutputStream.computeInt32Size(22, this.deviceDisplayDiagonalMils_);
            }
            if ((this.bitField0_ & 524288) == 524288) {
                iComputeFixed64Size += CodedOutputStream.computeInt32Size(24, this.deviceAuthzenVersion_);
            }
            if ((this.bitField0_ & 1048576) == 1048576) {
                iComputeFixed64Size += CodedOutputStream.computeBytesSize(29, this.longDeviceId_);
            }
            if ((this.bitField0_ & 2097152) == 2097152) {
                iComputeFixed64Size += GeneratedMessageV3.computeStringSize(31, this.deviceManufacturer_);
            }
            if ((this.bitField0_ & 4194304) == 4194304) {
                iComputeFixed64Size += CodedOutputStream.computeEnumSize(32, this.deviceType_);
            }
            if ((this.bitField0_ & 2) == 2) {
                iComputeFixed64Size += CodedOutputStream.computeBytesSize(102, this.gcmRegistrationId_);
            }
            if ((this.bitField0_ & 32) == 32) {
                iComputeFixed64Size += CodedOutputStream.computeBytesSize(103, this.deviceMasterKeyHash_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeFixed64Size += CodedOutputStream.computeBytesSize(202, this.apnRegistrationId_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeFixed64Size += CodedOutputStream.computeBoolSize(203, this.notificationEnabled_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iComputeFixed64Size += GeneratedMessageV3.computeStringSize(BLUETOOTH_MAC_ADDRESS_FIELD_NUMBER, this.bluetoothMacAddress_);
            }
            if ((this.bitField0_ & 8388608) == 8388608) {
                iComputeFixed64Size += CodedOutputStream.computeBoolSize(USING_SECURE_SCREENLOCK_FIELD_NUMBER, this.usingSecureScreenlock_);
            }
            if ((this.bitField0_ & 16777216) == 16777216) {
                iComputeFixed64Size += CodedOutputStream.computeBoolSize(AUTO_UNLOCK_SCREENLOCK_SUPPORTED_FIELD_NUMBER, this.autoUnlockScreenlockSupported_);
            }
            if ((this.bitField0_ & 33554432) == 33554432) {
                iComputeFixed64Size += CodedOutputStream.computeBoolSize(AUTO_UNLOCK_SCREENLOCK_ENABLED_FIELD_NUMBER, this.autoUnlockScreenlockEnabled_);
            }
            if ((this.bitField0_ & 67108864) == 67108864) {
                iComputeFixed64Size += CodedOutputStream.computeBoolSize(BLUETOOTH_RADIO_SUPPORTED_FIELD_NUMBER, this.bluetoothRadioSupported_);
            }
            if ((this.bitField0_ & 134217728) == 134217728) {
                iComputeFixed64Size += CodedOutputStream.computeBoolSize(BLUETOOTH_RADIO_ENABLED_FIELD_NUMBER, this.bluetoothRadioEnabled_);
            }
            if ((this.bitField0_ & 268435456) == 268435456) {
                iComputeFixed64Size += CodedOutputStream.computeBoolSize(MOBILE_DATA_SUPPORTED_FIELD_NUMBER, this.mobileDataSupported_);
            }
            if ((this.bitField0_ & 536870912) == 536870912) {
                iComputeFixed64Size += CodedOutputStream.computeBoolSize(TETHERING_SUPPORTED_FIELD_NUMBER, this.tetheringSupported_);
            }
            if ((this.bitField0_ & 1073741824) == 1073741824) {
                iComputeFixed64Size += CodedOutputStream.computeBoolSize(BLE_RADIO_SUPPORTED_FIELD_NUMBER, this.bleRadioSupported_);
            }
            if ((this.bitField0_ & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
                iComputeFixed64Size += CodedOutputStream.computeBoolSize(PIXEL_EXPERIENCE_FIELD_NUMBER, this.pixelExperience_);
            }
            if ((this.bitField1_ & 1) == 1) {
                iComputeFixed64Size += CodedOutputStream.computeBoolSize(ARC_PLUS_PLUS_FIELD_NUMBER, this.arcPlusPlus_);
            }
            if ((this.bitField1_ & 2) == 2) {
                iComputeFixed64Size += CodedOutputStream.computeBoolSize(IS_SCREENLOCK_STATE_FLAKY_FIELD_NUMBER, this.isScreenlockStateFlaky_);
            }
            int iComputeEnumSizeNoTag = 0;
            for (int i2 = 0; i2 < this.supportedSoftwareFeatures_.size(); i2++) {
                iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(this.supportedSoftwareFeatures_.get(i2).intValue());
            }
            int size = iComputeFixed64Size + iComputeEnumSizeNoTag + (this.supportedSoftwareFeatures_.size() * 2);
            int iComputeEnumSizeNoTag2 = 0;
            for (int i3 = 0; i3 < this.enabledSoftwareFeatures_.size(); i3++) {
                iComputeEnumSizeNoTag2 += CodedOutputStream.computeEnumSizeNoTag(this.enabledSoftwareFeatures_.get(i3).intValue());
            }
            int size2 = size + iComputeEnumSizeNoTag2 + (this.enabledSoftwareFeatures_.size() * 2);
            if ((this.bitField1_ & 4) == 4) {
                size2 += CodedOutputStream.computeBytesSize(1000, this.enrollmentSessionId_);
            }
            if ((this.bitField1_ & 8) == 8) {
                size2 += GeneratedMessageV3.computeStringSize(1001, this.oauthToken_);
            }
            int serializedSize = size2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public SoftwareFeature getSupportedSoftwareFeatures(int i) {
            return supportedSoftwareFeatures_converter_.convert(this.supportedSoftwareFeatures_.get(i));
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public int getSupportedSoftwareFeaturesCount() {
            return this.supportedSoftwareFeatures_.size();
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public List<SoftwareFeature> getSupportedSoftwareFeaturesList() {
            return new Internal.ListAdapter(this.supportedSoftwareFeatures_, supportedSoftwareFeatures_converter_);
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean getTetheringSupported() {
            return this.tetheringSupported_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public ByteString getUserPublicKey() {
            return this.userPublicKey_;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean getUsingSecureScreenlock() {
            return this.usingSecureScreenlock_;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean hasAndroidDeviceId() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean hasApnRegistrationId() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean hasArcPlusPlus() {
            return (this.bitField1_ & 1) == 1;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean hasAutoUnlockScreenlockEnabled() {
            return (this.bitField0_ & 33554432) == 33554432;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean hasAutoUnlockScreenlockSupported() {
            return (this.bitField0_ & 16777216) == 16777216;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean hasBleRadioSupported() {
            return (this.bitField0_ & 1073741824) == 1073741824;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean hasBluetoothMacAddress() {
            return (this.bitField0_ & 16) == 16;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean hasBluetoothRadioEnabled() {
            return (this.bitField0_ & 134217728) == 134217728;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean hasBluetoothRadioSupported() {
            return (this.bitField0_ & 67108864) == 67108864;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean hasCounter() {
            return (this.bitField0_ & Barcode.FORMAT_UPC_E) == 1024;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean hasDeviceAuthzenVersion() {
            return (this.bitField0_ & 524288) == 524288;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean hasDeviceDisplayDiagonalMils() {
            return (this.bitField0_ & 262144) == 262144;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean hasDeviceManufacturer() {
            return (this.bitField0_ & 2097152) == 2097152;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean hasDeviceMasterKeyHash() {
            return (this.bitField0_ & 32) == 32;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean hasDeviceModel() {
            return (this.bitField0_ & Barcode.FORMAT_ITF) == 128;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean hasDeviceOsCodename() {
            return (this.bitField0_ & 16384) == 16384;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean hasDeviceOsRelease() {
            return (this.bitField0_ & 8192) == 8192;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean hasDeviceOsVersion() {
            return (this.bitField0_ & Barcode.FORMAT_PDF417) == 2048;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean hasDeviceOsVersionCode() {
            return (this.bitField0_ & 4096) == 4096;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean hasDeviceSoftwarePackage() {
            return (this.bitField0_ & 131072) == 131072;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean hasDeviceSoftwareVersion() {
            return (this.bitField0_ & 32768) == 32768;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean hasDeviceSoftwareVersionCode() {
            return (this.bitField0_ & 65536) == 65536;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean hasDeviceType() {
            return (this.bitField0_ & 4194304) == 4194304;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean hasEnrollmentSessionId() {
            return (this.bitField1_ & 4) == 4;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean hasGcmRegistrationId() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean hasIsScreenlockStateFlaky() {
            return (this.bitField1_ & 2) == 2;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean hasKeyHandle() {
            return (this.bitField0_ & 512) == 512;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean hasLocale() {
            return (this.bitField0_ & 256) == 256;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean hasLongDeviceId() {
            return (this.bitField0_ & 1048576) == 1048576;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean hasMobileDataSupported() {
            return (this.bitField0_ & 268435456) == 268435456;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean hasNotificationEnabled() {
            return (this.bitField0_ & 8) == 8;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean hasOauthToken() {
            return (this.bitField1_ & 8) == 8;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean hasPixelExperience() {
            return (this.bitField0_ & Integer.MIN_VALUE) == Integer.MIN_VALUE;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean hasTetheringSupported() {
            return (this.bitField0_ & 536870912) == 536870912;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean hasUserPublicKey() {
            return (this.bitField0_ & 64) == 64;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
        public boolean hasUsingSecureScreenlock() {
            return (this.bitField0_ & 8388608) == 8388608;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptorForType().hashCode() + 779;
            if (hasAndroidDeviceId()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + Internal.hashLong(getAndroidDeviceId());
            }
            if (hasGcmRegistrationId()) {
                iHashCode = (((iHashCode * 37) + 102) * 53) + getGcmRegistrationId().hashCode();
            }
            if (hasApnRegistrationId()) {
                iHashCode = (((iHashCode * 37) + 202) * 53) + getApnRegistrationId().hashCode();
            }
            if (hasNotificationEnabled()) {
                iHashCode = (((iHashCode * 37) + 203) * 53) + Internal.hashBoolean(getNotificationEnabled());
            }
            if (hasBluetoothMacAddress()) {
                iHashCode = (((iHashCode * 37) + BLUETOOTH_MAC_ADDRESS_FIELD_NUMBER) * 53) + getBluetoothMacAddress().hashCode();
            }
            if (hasDeviceMasterKeyHash()) {
                iHashCode = (((iHashCode * 37) + 103) * 53) + getDeviceMasterKeyHash().hashCode();
            }
            if (hasUserPublicKey()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getUserPublicKey().hashCode();
            }
            if (hasDeviceModel()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + getDeviceModel().hashCode();
            }
            if (hasLocale()) {
                iHashCode = (((iHashCode * 37) + 8) * 53) + getLocale().hashCode();
            }
            if (hasKeyHandle()) {
                iHashCode = (((iHashCode * 37) + 9) * 53) + getKeyHandle().hashCode();
            }
            if (hasCounter()) {
                iHashCode = (((iHashCode * 37) + 12) * 53) + Internal.hashLong(getCounter());
            }
            if (hasDeviceOsVersion()) {
                iHashCode = (((iHashCode * 37) + 13) * 53) + getDeviceOsVersion().hashCode();
            }
            if (hasDeviceOsVersionCode()) {
                iHashCode = (((iHashCode * 37) + 14) * 53) + Internal.hashLong(getDeviceOsVersionCode());
            }
            if (hasDeviceOsRelease()) {
                iHashCode = (((iHashCode * 37) + 15) * 53) + getDeviceOsRelease().hashCode();
            }
            if (hasDeviceOsCodename()) {
                iHashCode = (((iHashCode * 37) + 16) * 53) + getDeviceOsCodename().hashCode();
            }
            if (hasDeviceSoftwareVersion()) {
                iHashCode = (((iHashCode * 37) + 17) * 53) + getDeviceSoftwareVersion().hashCode();
            }
            if (hasDeviceSoftwareVersionCode()) {
                iHashCode = (((iHashCode * 37) + 18) * 53) + Internal.hashLong(getDeviceSoftwareVersionCode());
            }
            if (hasDeviceSoftwarePackage()) {
                iHashCode = (((iHashCode * 37) + 19) * 53) + getDeviceSoftwarePackage().hashCode();
            }
            if (hasDeviceDisplayDiagonalMils()) {
                iHashCode = (((iHashCode * 37) + 22) * 53) + getDeviceDisplayDiagonalMils();
            }
            if (hasDeviceAuthzenVersion()) {
                iHashCode = (((iHashCode * 37) + 24) * 53) + getDeviceAuthzenVersion();
            }
            if (hasLongDeviceId()) {
                iHashCode = (((iHashCode * 37) + 29) * 53) + getLongDeviceId().hashCode();
            }
            if (hasDeviceManufacturer()) {
                iHashCode = (((iHashCode * 37) + 31) * 53) + getDeviceManufacturer().hashCode();
            }
            if (hasDeviceType()) {
                iHashCode = (((iHashCode * 37) + 32) * 53) + this.deviceType_;
            }
            if (hasUsingSecureScreenlock()) {
                iHashCode = (((iHashCode * 37) + USING_SECURE_SCREENLOCK_FIELD_NUMBER) * 53) + Internal.hashBoolean(getUsingSecureScreenlock());
            }
            if (hasAutoUnlockScreenlockSupported()) {
                iHashCode = (((iHashCode * 37) + AUTO_UNLOCK_SCREENLOCK_SUPPORTED_FIELD_NUMBER) * 53) + Internal.hashBoolean(getAutoUnlockScreenlockSupported());
            }
            if (hasAutoUnlockScreenlockEnabled()) {
                iHashCode = (((iHashCode * 37) + AUTO_UNLOCK_SCREENLOCK_ENABLED_FIELD_NUMBER) * 53) + Internal.hashBoolean(getAutoUnlockScreenlockEnabled());
            }
            if (hasBluetoothRadioSupported()) {
                iHashCode = (((iHashCode * 37) + BLUETOOTH_RADIO_SUPPORTED_FIELD_NUMBER) * 53) + Internal.hashBoolean(getBluetoothRadioSupported());
            }
            if (hasBluetoothRadioEnabled()) {
                iHashCode = (((iHashCode * 37) + BLUETOOTH_RADIO_ENABLED_FIELD_NUMBER) * 53) + Internal.hashBoolean(getBluetoothRadioEnabled());
            }
            if (hasMobileDataSupported()) {
                iHashCode = (((iHashCode * 37) + MOBILE_DATA_SUPPORTED_FIELD_NUMBER) * 53) + Internal.hashBoolean(getMobileDataSupported());
            }
            if (hasTetheringSupported()) {
                iHashCode = (((iHashCode * 37) + TETHERING_SUPPORTED_FIELD_NUMBER) * 53) + Internal.hashBoolean(getTetheringSupported());
            }
            if (hasBleRadioSupported()) {
                iHashCode = (((iHashCode * 37) + BLE_RADIO_SUPPORTED_FIELD_NUMBER) * 53) + Internal.hashBoolean(getBleRadioSupported());
            }
            if (hasPixelExperience()) {
                iHashCode = (((iHashCode * 37) + PIXEL_EXPERIENCE_FIELD_NUMBER) * 53) + Internal.hashBoolean(getPixelExperience());
            }
            if (hasArcPlusPlus()) {
                iHashCode = (((iHashCode * 37) + ARC_PLUS_PLUS_FIELD_NUMBER) * 53) + Internal.hashBoolean(getArcPlusPlus());
            }
            if (hasIsScreenlockStateFlaky()) {
                iHashCode = (((iHashCode * 37) + IS_SCREENLOCK_STATE_FLAKY_FIELD_NUMBER) * 53) + Internal.hashBoolean(getIsScreenlockStateFlaky());
            }
            if (getSupportedSoftwareFeaturesCount() > 0) {
                iHashCode = (((iHashCode * 37) + SUPPORTED_SOFTWARE_FEATURES_FIELD_NUMBER) * 53) + this.supportedSoftwareFeatures_.hashCode();
            }
            if (getEnabledSoftwareFeaturesCount() > 0) {
                iHashCode = (((iHashCode * 37) + ENABLED_SOFTWARE_FEATURES_FIELD_NUMBER) * 53) + this.enabledSoftwareFeatures_.hashCode();
            }
            if (hasEnrollmentSessionId()) {
                iHashCode = (((iHashCode * 37) + 1000) * 53) + getEnrollmentSessionId().hashCode();
            }
            if (hasOauthToken()) {
                iHashCode = (((iHashCode * 37) + 1001) * 53) + getOauthToken().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SecureGcmProto.internal_static_securegcm_GcmDeviceInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(GcmDeviceInfo.class, Builder.class);
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
            if (hasUserPublicKey()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeFixed64(1, this.androidDeviceId_);
            }
            if ((this.bitField0_ & 64) == 64) {
                codedOutputStream.writeBytes(4, this.userPublicKey_);
            }
            if ((this.bitField0_ & Barcode.FORMAT_ITF) == 128) {
                GeneratedMessageV3.writeString(codedOutputStream, 7, this.deviceModel_);
            }
            if ((this.bitField0_ & 256) == 256) {
                GeneratedMessageV3.writeString(codedOutputStream, 8, this.locale_);
            }
            if ((this.bitField0_ & 512) == 512) {
                codedOutputStream.writeBytes(9, this.keyHandle_);
            }
            if ((this.bitField0_ & Barcode.FORMAT_UPC_E) == 1024) {
                codedOutputStream.writeInt64(12, this.counter_);
            }
            if ((this.bitField0_ & Barcode.FORMAT_PDF417) == 2048) {
                GeneratedMessageV3.writeString(codedOutputStream, 13, this.deviceOsVersion_);
            }
            if ((this.bitField0_ & 4096) == 4096) {
                codedOutputStream.writeInt64(14, this.deviceOsVersionCode_);
            }
            if ((this.bitField0_ & 8192) == 8192) {
                GeneratedMessageV3.writeString(codedOutputStream, 15, this.deviceOsRelease_);
            }
            if ((this.bitField0_ & 16384) == 16384) {
                GeneratedMessageV3.writeString(codedOutputStream, 16, this.deviceOsCodename_);
            }
            if ((this.bitField0_ & 32768) == 32768) {
                GeneratedMessageV3.writeString(codedOutputStream, 17, this.deviceSoftwareVersion_);
            }
            if ((this.bitField0_ & 65536) == 65536) {
                codedOutputStream.writeInt64(18, this.deviceSoftwareVersionCode_);
            }
            if ((this.bitField0_ & 131072) == 131072) {
                GeneratedMessageV3.writeString(codedOutputStream, 19, this.deviceSoftwarePackage_);
            }
            if ((this.bitField0_ & 262144) == 262144) {
                codedOutputStream.writeInt32(22, this.deviceDisplayDiagonalMils_);
            }
            if ((this.bitField0_ & 524288) == 524288) {
                codedOutputStream.writeInt32(24, this.deviceAuthzenVersion_);
            }
            if ((this.bitField0_ & 1048576) == 1048576) {
                codedOutputStream.writeBytes(29, this.longDeviceId_);
            }
            if ((this.bitField0_ & 2097152) == 2097152) {
                GeneratedMessageV3.writeString(codedOutputStream, 31, this.deviceManufacturer_);
            }
            if ((this.bitField0_ & 4194304) == 4194304) {
                codedOutputStream.writeEnum(32, this.deviceType_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeBytes(102, this.gcmRegistrationId_);
            }
            if ((this.bitField0_ & 32) == 32) {
                codedOutputStream.writeBytes(103, this.deviceMasterKeyHash_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeBytes(202, this.apnRegistrationId_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeBool(203, this.notificationEnabled_);
            }
            if ((this.bitField0_ & 16) == 16) {
                GeneratedMessageV3.writeString(codedOutputStream, BLUETOOTH_MAC_ADDRESS_FIELD_NUMBER, this.bluetoothMacAddress_);
            }
            if ((this.bitField0_ & 8388608) == 8388608) {
                codedOutputStream.writeBool(USING_SECURE_SCREENLOCK_FIELD_NUMBER, this.usingSecureScreenlock_);
            }
            if ((this.bitField0_ & 16777216) == 16777216) {
                codedOutputStream.writeBool(AUTO_UNLOCK_SCREENLOCK_SUPPORTED_FIELD_NUMBER, this.autoUnlockScreenlockSupported_);
            }
            if ((this.bitField0_ & 33554432) == 33554432) {
                codedOutputStream.writeBool(AUTO_UNLOCK_SCREENLOCK_ENABLED_FIELD_NUMBER, this.autoUnlockScreenlockEnabled_);
            }
            if ((this.bitField0_ & 67108864) == 67108864) {
                codedOutputStream.writeBool(BLUETOOTH_RADIO_SUPPORTED_FIELD_NUMBER, this.bluetoothRadioSupported_);
            }
            if ((this.bitField0_ & 134217728) == 134217728) {
                codedOutputStream.writeBool(BLUETOOTH_RADIO_ENABLED_FIELD_NUMBER, this.bluetoothRadioEnabled_);
            }
            if ((this.bitField0_ & 268435456) == 268435456) {
                codedOutputStream.writeBool(MOBILE_DATA_SUPPORTED_FIELD_NUMBER, this.mobileDataSupported_);
            }
            if ((this.bitField0_ & 536870912) == 536870912) {
                codedOutputStream.writeBool(TETHERING_SUPPORTED_FIELD_NUMBER, this.tetheringSupported_);
            }
            if ((this.bitField0_ & 1073741824) == 1073741824) {
                codedOutputStream.writeBool(BLE_RADIO_SUPPORTED_FIELD_NUMBER, this.bleRadioSupported_);
            }
            if ((this.bitField0_ & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
                codedOutputStream.writeBool(PIXEL_EXPERIENCE_FIELD_NUMBER, this.pixelExperience_);
            }
            if ((this.bitField1_ & 1) == 1) {
                codedOutputStream.writeBool(ARC_PLUS_PLUS_FIELD_NUMBER, this.arcPlusPlus_);
            }
            if ((this.bitField1_ & 2) == 2) {
                codedOutputStream.writeBool(IS_SCREENLOCK_STATE_FLAKY_FIELD_NUMBER, this.isScreenlockStateFlaky_);
            }
            for (int i = 0; i < this.supportedSoftwareFeatures_.size(); i++) {
                codedOutputStream.writeEnum(SUPPORTED_SOFTWARE_FEATURES_FIELD_NUMBER, this.supportedSoftwareFeatures_.get(i).intValue());
            }
            for (int i2 = 0; i2 < this.enabledSoftwareFeatures_.size(); i2++) {
                codedOutputStream.writeEnum(ENABLED_SOFTWARE_FEATURES_FIELD_NUMBER, this.enabledSoftwareFeatures_.get(i2).intValue());
            }
            if ((this.bitField1_ & 4) == 4) {
                codedOutputStream.writeBytes(1000, this.enrollmentSessionId_);
            }
            if ((this.bitField1_ & 8) == 8) {
                GeneratedMessageV3.writeString(codedOutputStream, 1001, this.oauthToken_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GcmDeviceInfoOrBuilder {
            private long androidDeviceId_;
            private ByteString apnRegistrationId_;
            private boolean arcPlusPlus_;
            private boolean autoUnlockScreenlockEnabled_;
            private boolean autoUnlockScreenlockSupported_;
            private int bitField0_;
            private int bitField1_;
            private boolean bleRadioSupported_;
            private Object bluetoothMacAddress_;
            private boolean bluetoothRadioEnabled_;
            private boolean bluetoothRadioSupported_;
            private long counter_;
            private int deviceAuthzenVersion_;
            private int deviceDisplayDiagonalMils_;
            private Object deviceManufacturer_;
            private ByteString deviceMasterKeyHash_;
            private Object deviceModel_;
            private Object deviceOsCodename_;
            private Object deviceOsRelease_;
            private long deviceOsVersionCode_;
            private Object deviceOsVersion_;
            private Object deviceSoftwarePackage_;
            private long deviceSoftwareVersionCode_;
            private Object deviceSoftwareVersion_;
            private int deviceType_;
            private List<Integer> enabledSoftwareFeatures_;
            private ByteString enrollmentSessionId_;
            private ByteString gcmRegistrationId_;
            private boolean isScreenlockStateFlaky_;
            private ByteString keyHandle_;
            private Object locale_;
            private ByteString longDeviceId_;
            private boolean mobileDataSupported_;
            private boolean notificationEnabled_;
            private Object oauthToken_;
            private boolean pixelExperience_;
            private List<Integer> supportedSoftwareFeatures_;
            private boolean tetheringSupported_;
            private ByteString userPublicKey_;
            private boolean usingSecureScreenlock_;

            private void ensureEnabledSoftwareFeaturesIsMutable() {
                if ((this.bitField1_ & 8) != 8) {
                    this.enabledSoftwareFeatures_ = new ArrayList(this.enabledSoftwareFeatures_);
                    this.bitField1_ |= 8;
                }
            }

            private void ensureSupportedSoftwareFeaturesIsMutable() {
                if ((this.bitField1_ & 4) != 4) {
                    this.supportedSoftwareFeatures_ = new ArrayList(this.supportedSoftwareFeatures_);
                    this.bitField1_ |= 4;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SecureGcmProto.internal_static_securegcm_GcmDeviceInfo_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder addAllEnabledSoftwareFeatures(Iterable<? extends SoftwareFeature> iterable) {
                ensureEnabledSoftwareFeaturesIsMutable();
                Iterator<? extends SoftwareFeature> it = iterable.iterator();
                while (it.hasNext()) {
                    this.enabledSoftwareFeatures_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllSupportedSoftwareFeatures(Iterable<? extends SoftwareFeature> iterable) {
                ensureSupportedSoftwareFeaturesIsMutable();
                Iterator<? extends SoftwareFeature> it = iterable.iterator();
                while (it.hasNext()) {
                    this.supportedSoftwareFeatures_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addEnabledSoftwareFeatures(SoftwareFeature softwareFeature) {
                softwareFeature.getClass();
                ensureEnabledSoftwareFeaturesIsMutable();
                this.enabledSoftwareFeatures_.add(Integer.valueOf(softwareFeature.getNumber()));
                onChanged();
                return this;
            }

            public Builder addSupportedSoftwareFeatures(SoftwareFeature softwareFeature) {
                softwareFeature.getClass();
                ensureSupportedSoftwareFeaturesIsMutable();
                this.supportedSoftwareFeatures_.add(Integer.valueOf(softwareFeature.getNumber()));
                onChanged();
                return this;
            }

            public Builder clearAndroidDeviceId() {
                this.bitField0_ &= -2;
                this.androidDeviceId_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearApnRegistrationId() {
                this.bitField0_ &= -5;
                this.apnRegistrationId_ = GcmDeviceInfo.getDefaultInstance().getApnRegistrationId();
                onChanged();
                return this;
            }

            public Builder clearArcPlusPlus() {
                this.bitField1_ &= -2;
                this.arcPlusPlus_ = false;
                onChanged();
                return this;
            }

            public Builder clearAutoUnlockScreenlockEnabled() {
                this.bitField0_ &= -33554433;
                this.autoUnlockScreenlockEnabled_ = false;
                onChanged();
                return this;
            }

            public Builder clearAutoUnlockScreenlockSupported() {
                this.bitField0_ &= -16777217;
                this.autoUnlockScreenlockSupported_ = false;
                onChanged();
                return this;
            }

            public Builder clearBleRadioSupported() {
                this.bitField0_ &= -1073741825;
                this.bleRadioSupported_ = false;
                onChanged();
                return this;
            }

            public Builder clearBluetoothMacAddress() {
                this.bitField0_ &= -17;
                this.bluetoothMacAddress_ = GcmDeviceInfo.getDefaultInstance().getBluetoothMacAddress();
                onChanged();
                return this;
            }

            public Builder clearBluetoothRadioEnabled() {
                this.bitField0_ &= -134217729;
                this.bluetoothRadioEnabled_ = false;
                onChanged();
                return this;
            }

            public Builder clearBluetoothRadioSupported() {
                this.bitField0_ &= -67108865;
                this.bluetoothRadioSupported_ = false;
                onChanged();
                return this;
            }

            public Builder clearCounter() {
                this.bitField0_ &= -1025;
                this.counter_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearDeviceAuthzenVersion() {
                this.bitField0_ &= -524289;
                this.deviceAuthzenVersion_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDeviceDisplayDiagonalMils() {
                this.bitField0_ &= -262145;
                this.deviceDisplayDiagonalMils_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDeviceManufacturer() {
                this.bitField0_ &= -2097153;
                this.deviceManufacturer_ = GcmDeviceInfo.getDefaultInstance().getDeviceManufacturer();
                onChanged();
                return this;
            }

            public Builder clearDeviceMasterKeyHash() {
                this.bitField0_ &= -33;
                this.deviceMasterKeyHash_ = GcmDeviceInfo.getDefaultInstance().getDeviceMasterKeyHash();
                onChanged();
                return this;
            }

            public Builder clearDeviceModel() {
                this.bitField0_ &= -129;
                this.deviceModel_ = GcmDeviceInfo.getDefaultInstance().getDeviceModel();
                onChanged();
                return this;
            }

            public Builder clearDeviceOsCodename() {
                this.bitField0_ &= -16385;
                this.deviceOsCodename_ = GcmDeviceInfo.getDefaultInstance().getDeviceOsCodename();
                onChanged();
                return this;
            }

            public Builder clearDeviceOsRelease() {
                this.bitField0_ &= -8193;
                this.deviceOsRelease_ = GcmDeviceInfo.getDefaultInstance().getDeviceOsRelease();
                onChanged();
                return this;
            }

            public Builder clearDeviceOsVersion() {
                this.bitField0_ &= -2049;
                this.deviceOsVersion_ = GcmDeviceInfo.getDefaultInstance().getDeviceOsVersion();
                onChanged();
                return this;
            }

            public Builder clearDeviceOsVersionCode() {
                this.bitField0_ &= -4097;
                this.deviceOsVersionCode_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearDeviceSoftwarePackage() {
                this.bitField0_ &= -131073;
                this.deviceSoftwarePackage_ = GcmDeviceInfo.getDefaultInstance().getDeviceSoftwarePackage();
                onChanged();
                return this;
            }

            public Builder clearDeviceSoftwareVersion() {
                this.bitField0_ &= -32769;
                this.deviceSoftwareVersion_ = GcmDeviceInfo.getDefaultInstance().getDeviceSoftwareVersion();
                onChanged();
                return this;
            }

            public Builder clearDeviceSoftwareVersionCode() {
                this.bitField0_ &= -65537;
                this.deviceSoftwareVersionCode_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearDeviceType() {
                this.bitField0_ &= -4194305;
                this.deviceType_ = 1;
                onChanged();
                return this;
            }

            public Builder clearEnabledSoftwareFeatures() {
                this.enabledSoftwareFeatures_ = Collections.emptyList();
                this.bitField1_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearEnrollmentSessionId() {
                this.bitField1_ &= -17;
                this.enrollmentSessionId_ = GcmDeviceInfo.getDefaultInstance().getEnrollmentSessionId();
                onChanged();
                return this;
            }

            public Builder clearGcmRegistrationId() {
                this.bitField0_ &= -3;
                this.gcmRegistrationId_ = GcmDeviceInfo.getDefaultInstance().getGcmRegistrationId();
                onChanged();
                return this;
            }

            public Builder clearIsScreenlockStateFlaky() {
                this.bitField1_ &= -3;
                this.isScreenlockStateFlaky_ = false;
                onChanged();
                return this;
            }

            public Builder clearKeyHandle() {
                this.bitField0_ &= -513;
                this.keyHandle_ = GcmDeviceInfo.getDefaultInstance().getKeyHandle();
                onChanged();
                return this;
            }

            public Builder clearLocale() {
                this.bitField0_ &= -257;
                this.locale_ = GcmDeviceInfo.getDefaultInstance().getLocale();
                onChanged();
                return this;
            }

            public Builder clearLongDeviceId() {
                this.bitField0_ &= -1048577;
                this.longDeviceId_ = GcmDeviceInfo.getDefaultInstance().getLongDeviceId();
                onChanged();
                return this;
            }

            public Builder clearMobileDataSupported() {
                this.bitField0_ &= -268435457;
                this.mobileDataSupported_ = false;
                onChanged();
                return this;
            }

            public Builder clearNotificationEnabled() {
                this.bitField0_ &= -9;
                this.notificationEnabled_ = true;
                onChanged();
                return this;
            }

            public Builder clearOauthToken() {
                this.bitField1_ &= -33;
                this.oauthToken_ = GcmDeviceInfo.getDefaultInstance().getOauthToken();
                onChanged();
                return this;
            }

            public Builder clearPixelExperience() {
                this.bitField0_ &= Integer.MAX_VALUE;
                this.pixelExperience_ = false;
                onChanged();
                return this;
            }

            public Builder clearSupportedSoftwareFeatures() {
                this.supportedSoftwareFeatures_ = Collections.emptyList();
                this.bitField1_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearTetheringSupported() {
                this.bitField0_ &= -536870913;
                this.tetheringSupported_ = false;
                onChanged();
                return this;
            }

            public Builder clearUserPublicKey() {
                this.bitField0_ &= -65;
                this.userPublicKey_ = GcmDeviceInfo.getDefaultInstance().getUserPublicKey();
                onChanged();
                return this;
            }

            public Builder clearUsingSecureScreenlock() {
                this.bitField0_ &= -8388609;
                this.usingSecureScreenlock_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public long getAndroidDeviceId() {
                return this.androidDeviceId_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public ByteString getApnRegistrationId() {
                return this.apnRegistrationId_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean getArcPlusPlus() {
                return this.arcPlusPlus_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean getAutoUnlockScreenlockEnabled() {
                return this.autoUnlockScreenlockEnabled_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean getAutoUnlockScreenlockSupported() {
                return this.autoUnlockScreenlockSupported_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean getBleRadioSupported() {
                return this.bleRadioSupported_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public String getBluetoothMacAddress() {
                Object obj = this.bluetoothMacAddress_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.bluetoothMacAddress_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public ByteString getBluetoothMacAddressBytes() {
                Object obj = this.bluetoothMacAddress_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.bluetoothMacAddress_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean getBluetoothRadioEnabled() {
                return this.bluetoothRadioEnabled_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean getBluetoothRadioSupported() {
                return this.bluetoothRadioSupported_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public long getCounter() {
                return this.counter_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SecureGcmProto.internal_static_securegcm_GcmDeviceInfo_descriptor;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public int getDeviceAuthzenVersion() {
                return this.deviceAuthzenVersion_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public int getDeviceDisplayDiagonalMils() {
                return this.deviceDisplayDiagonalMils_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public String getDeviceManufacturer() {
                Object obj = this.deviceManufacturer_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.deviceManufacturer_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public ByteString getDeviceManufacturerBytes() {
                Object obj = this.deviceManufacturer_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.deviceManufacturer_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public ByteString getDeviceMasterKeyHash() {
                return this.deviceMasterKeyHash_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public String getDeviceModel() {
                Object obj = this.deviceModel_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.deviceModel_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public ByteString getDeviceModelBytes() {
                Object obj = this.deviceModel_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.deviceModel_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public String getDeviceOsCodename() {
                Object obj = this.deviceOsCodename_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.deviceOsCodename_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public ByteString getDeviceOsCodenameBytes() {
                Object obj = this.deviceOsCodename_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.deviceOsCodename_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public String getDeviceOsRelease() {
                Object obj = this.deviceOsRelease_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.deviceOsRelease_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public ByteString getDeviceOsReleaseBytes() {
                Object obj = this.deviceOsRelease_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.deviceOsRelease_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public String getDeviceOsVersion() {
                Object obj = this.deviceOsVersion_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.deviceOsVersion_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public ByteString getDeviceOsVersionBytes() {
                Object obj = this.deviceOsVersion_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.deviceOsVersion_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public long getDeviceOsVersionCode() {
                return this.deviceOsVersionCode_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public String getDeviceSoftwarePackage() {
                Object obj = this.deviceSoftwarePackage_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.deviceSoftwarePackage_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public ByteString getDeviceSoftwarePackageBytes() {
                Object obj = this.deviceSoftwarePackage_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.deviceSoftwarePackage_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public String getDeviceSoftwareVersion() {
                Object obj = this.deviceSoftwareVersion_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.deviceSoftwareVersion_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public ByteString getDeviceSoftwareVersionBytes() {
                Object obj = this.deviceSoftwareVersion_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.deviceSoftwareVersion_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public long getDeviceSoftwareVersionCode() {
                return this.deviceSoftwareVersionCode_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public DeviceType getDeviceType() {
                DeviceType deviceTypeValueOf = DeviceType.valueOf(this.deviceType_);
                return deviceTypeValueOf == null ? DeviceType.ANDROID : deviceTypeValueOf;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public SoftwareFeature getEnabledSoftwareFeatures(int i) {
                return (SoftwareFeature) GcmDeviceInfo.enabledSoftwareFeatures_converter_.convert(this.enabledSoftwareFeatures_.get(i));
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public int getEnabledSoftwareFeaturesCount() {
                return this.enabledSoftwareFeatures_.size();
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public List<SoftwareFeature> getEnabledSoftwareFeaturesList() {
                return new Internal.ListAdapter(this.enabledSoftwareFeatures_, GcmDeviceInfo.enabledSoftwareFeatures_converter_);
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public ByteString getEnrollmentSessionId() {
                return this.enrollmentSessionId_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public ByteString getGcmRegistrationId() {
                return this.gcmRegistrationId_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean getIsScreenlockStateFlaky() {
                return this.isScreenlockStateFlaky_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public ByteString getKeyHandle() {
                return this.keyHandle_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public String getLocale() {
                Object obj = this.locale_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.locale_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public ByteString getLocaleBytes() {
                Object obj = this.locale_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.locale_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public ByteString getLongDeviceId() {
                return this.longDeviceId_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean getMobileDataSupported() {
                return this.mobileDataSupported_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean getNotificationEnabled() {
                return this.notificationEnabled_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public String getOauthToken() {
                Object obj = this.oauthToken_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.oauthToken_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public ByteString getOauthTokenBytes() {
                Object obj = this.oauthToken_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.oauthToken_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean getPixelExperience() {
                return this.pixelExperience_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public SoftwareFeature getSupportedSoftwareFeatures(int i) {
                return (SoftwareFeature) GcmDeviceInfo.supportedSoftwareFeatures_converter_.convert(this.supportedSoftwareFeatures_.get(i));
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public int getSupportedSoftwareFeaturesCount() {
                return this.supportedSoftwareFeatures_.size();
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public List<SoftwareFeature> getSupportedSoftwareFeaturesList() {
                return new Internal.ListAdapter(this.supportedSoftwareFeatures_, GcmDeviceInfo.supportedSoftwareFeatures_converter_);
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean getTetheringSupported() {
                return this.tetheringSupported_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public ByteString getUserPublicKey() {
                return this.userPublicKey_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean getUsingSecureScreenlock() {
                return this.usingSecureScreenlock_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean hasAndroidDeviceId() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean hasApnRegistrationId() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean hasArcPlusPlus() {
                return (this.bitField1_ & 1) == 1;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean hasAutoUnlockScreenlockEnabled() {
                return (this.bitField0_ & 33554432) == 33554432;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean hasAutoUnlockScreenlockSupported() {
                return (this.bitField0_ & 16777216) == 16777216;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean hasBleRadioSupported() {
                return (this.bitField0_ & 1073741824) == 1073741824;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean hasBluetoothMacAddress() {
                return (this.bitField0_ & 16) == 16;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean hasBluetoothRadioEnabled() {
                return (this.bitField0_ & 134217728) == 134217728;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean hasBluetoothRadioSupported() {
                return (this.bitField0_ & 67108864) == 67108864;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean hasCounter() {
                return (this.bitField0_ & Barcode.FORMAT_UPC_E) == 1024;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean hasDeviceAuthzenVersion() {
                return (this.bitField0_ & 524288) == 524288;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean hasDeviceDisplayDiagonalMils() {
                return (this.bitField0_ & 262144) == 262144;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean hasDeviceManufacturer() {
                return (this.bitField0_ & 2097152) == 2097152;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean hasDeviceMasterKeyHash() {
                return (this.bitField0_ & 32) == 32;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean hasDeviceModel() {
                return (this.bitField0_ & Barcode.FORMAT_ITF) == 128;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean hasDeviceOsCodename() {
                return (this.bitField0_ & 16384) == 16384;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean hasDeviceOsRelease() {
                return (this.bitField0_ & 8192) == 8192;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean hasDeviceOsVersion() {
                return (this.bitField0_ & Barcode.FORMAT_PDF417) == 2048;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean hasDeviceOsVersionCode() {
                return (this.bitField0_ & 4096) == 4096;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean hasDeviceSoftwarePackage() {
                return (this.bitField0_ & 131072) == 131072;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean hasDeviceSoftwareVersion() {
                return (this.bitField0_ & 32768) == 32768;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean hasDeviceSoftwareVersionCode() {
                return (this.bitField0_ & 65536) == 65536;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean hasDeviceType() {
                return (this.bitField0_ & 4194304) == 4194304;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean hasEnrollmentSessionId() {
                return (this.bitField1_ & 16) == 16;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean hasGcmRegistrationId() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean hasIsScreenlockStateFlaky() {
                return (this.bitField1_ & 2) == 2;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean hasKeyHandle() {
                return (this.bitField0_ & 512) == 512;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean hasLocale() {
                return (this.bitField0_ & 256) == 256;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean hasLongDeviceId() {
                return (this.bitField0_ & 1048576) == 1048576;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean hasMobileDataSupported() {
                return (this.bitField0_ & 268435456) == 268435456;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean hasNotificationEnabled() {
                return (this.bitField0_ & 8) == 8;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean hasOauthToken() {
                return (this.bitField1_ & 32) == 32;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean hasPixelExperience() {
                return (this.bitField0_ & Integer.MIN_VALUE) == Integer.MIN_VALUE;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean hasTetheringSupported() {
                return (this.bitField0_ & 536870912) == 536870912;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean hasUserPublicKey() {
                return (this.bitField0_ & 64) == 64;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmDeviceInfoOrBuilder
            public boolean hasUsingSecureScreenlock() {
                return (this.bitField0_ & 8388608) == 8388608;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SecureGcmProto.internal_static_securegcm_GcmDeviceInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(GcmDeviceInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasUserPublicKey();
            }

            public Builder setAndroidDeviceId(long j) {
                this.bitField0_ |= 1;
                this.androidDeviceId_ = j;
                onChanged();
                return this;
            }

            public Builder setApnRegistrationId(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 4;
                this.apnRegistrationId_ = byteString;
                onChanged();
                return this;
            }

            public Builder setArcPlusPlus(boolean z) {
                this.bitField1_ |= 1;
                this.arcPlusPlus_ = z;
                onChanged();
                return this;
            }

            public Builder setAutoUnlockScreenlockEnabled(boolean z) {
                this.bitField0_ |= 33554432;
                this.autoUnlockScreenlockEnabled_ = z;
                onChanged();
                return this;
            }

            public Builder setAutoUnlockScreenlockSupported(boolean z) {
                this.bitField0_ |= 16777216;
                this.autoUnlockScreenlockSupported_ = z;
                onChanged();
                return this;
            }

            public Builder setBleRadioSupported(boolean z) {
                this.bitField0_ |= 1073741824;
                this.bleRadioSupported_ = z;
                onChanged();
                return this;
            }

            public Builder setBluetoothMacAddress(String str) {
                str.getClass();
                this.bitField0_ |= 16;
                this.bluetoothMacAddress_ = str;
                onChanged();
                return this;
            }

            public Builder setBluetoothMacAddressBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 16;
                this.bluetoothMacAddress_ = byteString;
                onChanged();
                return this;
            }

            public Builder setBluetoothRadioEnabled(boolean z) {
                this.bitField0_ |= 134217728;
                this.bluetoothRadioEnabled_ = z;
                onChanged();
                return this;
            }

            public Builder setBluetoothRadioSupported(boolean z) {
                this.bitField0_ |= 67108864;
                this.bluetoothRadioSupported_ = z;
                onChanged();
                return this;
            }

            public Builder setCounter(long j) {
                this.bitField0_ |= Barcode.FORMAT_UPC_E;
                this.counter_ = j;
                onChanged();
                return this;
            }

            public Builder setDeviceAuthzenVersion(int i) {
                this.bitField0_ |= 524288;
                this.deviceAuthzenVersion_ = i;
                onChanged();
                return this;
            }

            public Builder setDeviceDisplayDiagonalMils(int i) {
                this.bitField0_ |= 262144;
                this.deviceDisplayDiagonalMils_ = i;
                onChanged();
                return this;
            }

            public Builder setDeviceManufacturer(String str) {
                str.getClass();
                this.bitField0_ |= 2097152;
                this.deviceManufacturer_ = str;
                onChanged();
                return this;
            }

            public Builder setDeviceManufacturerBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2097152;
                this.deviceManufacturer_ = byteString;
                onChanged();
                return this;
            }

            public Builder setDeviceMasterKeyHash(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 32;
                this.deviceMasterKeyHash_ = byteString;
                onChanged();
                return this;
            }

            public Builder setDeviceModel(String str) {
                str.getClass();
                this.bitField0_ |= Barcode.FORMAT_ITF;
                this.deviceModel_ = str;
                onChanged();
                return this;
            }

            public Builder setDeviceModelBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= Barcode.FORMAT_ITF;
                this.deviceModel_ = byteString;
                onChanged();
                return this;
            }

            public Builder setDeviceOsCodename(String str) {
                str.getClass();
                this.bitField0_ |= 16384;
                this.deviceOsCodename_ = str;
                onChanged();
                return this;
            }

            public Builder setDeviceOsCodenameBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 16384;
                this.deviceOsCodename_ = byteString;
                onChanged();
                return this;
            }

            public Builder setDeviceOsRelease(String str) {
                str.getClass();
                this.bitField0_ |= 8192;
                this.deviceOsRelease_ = str;
                onChanged();
                return this;
            }

            public Builder setDeviceOsReleaseBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 8192;
                this.deviceOsRelease_ = byteString;
                onChanged();
                return this;
            }

            public Builder setDeviceOsVersion(String str) {
                str.getClass();
                this.bitField0_ |= Barcode.FORMAT_PDF417;
                this.deviceOsVersion_ = str;
                onChanged();
                return this;
            }

            public Builder setDeviceOsVersionBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= Barcode.FORMAT_PDF417;
                this.deviceOsVersion_ = byteString;
                onChanged();
                return this;
            }

            public Builder setDeviceOsVersionCode(long j) {
                this.bitField0_ |= 4096;
                this.deviceOsVersionCode_ = j;
                onChanged();
                return this;
            }

            public Builder setDeviceSoftwarePackage(String str) {
                str.getClass();
                this.bitField0_ |= 131072;
                this.deviceSoftwarePackage_ = str;
                onChanged();
                return this;
            }

            public Builder setDeviceSoftwarePackageBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 131072;
                this.deviceSoftwarePackage_ = byteString;
                onChanged();
                return this;
            }

            public Builder setDeviceSoftwareVersion(String str) {
                str.getClass();
                this.bitField0_ |= 32768;
                this.deviceSoftwareVersion_ = str;
                onChanged();
                return this;
            }

            public Builder setDeviceSoftwareVersionBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 32768;
                this.deviceSoftwareVersion_ = byteString;
                onChanged();
                return this;
            }

            public Builder setDeviceSoftwareVersionCode(long j) {
                this.bitField0_ |= 65536;
                this.deviceSoftwareVersionCode_ = j;
                onChanged();
                return this;
            }

            public Builder setDeviceType(DeviceType deviceType) {
                deviceType.getClass();
                this.bitField0_ |= 4194304;
                this.deviceType_ = deviceType.getNumber();
                onChanged();
                return this;
            }

            public Builder setEnabledSoftwareFeatures(int i, SoftwareFeature softwareFeature) {
                softwareFeature.getClass();
                ensureEnabledSoftwareFeaturesIsMutable();
                this.enabledSoftwareFeatures_.set(i, Integer.valueOf(softwareFeature.getNumber()));
                onChanged();
                return this;
            }

            public Builder setEnrollmentSessionId(ByteString byteString) {
                byteString.getClass();
                this.bitField1_ |= 16;
                this.enrollmentSessionId_ = byteString;
                onChanged();
                return this;
            }

            public Builder setGcmRegistrationId(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.gcmRegistrationId_ = byteString;
                onChanged();
                return this;
            }

            public Builder setIsScreenlockStateFlaky(boolean z) {
                this.bitField1_ |= 2;
                this.isScreenlockStateFlaky_ = z;
                onChanged();
                return this;
            }

            public Builder setKeyHandle(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 512;
                this.keyHandle_ = byteString;
                onChanged();
                return this;
            }

            public Builder setLocale(String str) {
                str.getClass();
                this.bitField0_ |= 256;
                this.locale_ = str;
                onChanged();
                return this;
            }

            public Builder setLocaleBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 256;
                this.locale_ = byteString;
                onChanged();
                return this;
            }

            public Builder setLongDeviceId(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1048576;
                this.longDeviceId_ = byteString;
                onChanged();
                return this;
            }

            public Builder setMobileDataSupported(boolean z) {
                this.bitField0_ |= 268435456;
                this.mobileDataSupported_ = z;
                onChanged();
                return this;
            }

            public Builder setNotificationEnabled(boolean z) {
                this.bitField0_ |= 8;
                this.notificationEnabled_ = z;
                onChanged();
                return this;
            }

            public Builder setOauthToken(String str) {
                str.getClass();
                this.bitField1_ |= 32;
                this.oauthToken_ = str;
                onChanged();
                return this;
            }

            public Builder setOauthTokenBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField1_ |= 32;
                this.oauthToken_ = byteString;
                onChanged();
                return this;
            }

            public Builder setPixelExperience(boolean z) {
                this.bitField0_ |= Integer.MIN_VALUE;
                this.pixelExperience_ = z;
                onChanged();
                return this;
            }

            public Builder setSupportedSoftwareFeatures(int i, SoftwareFeature softwareFeature) {
                softwareFeature.getClass();
                ensureSupportedSoftwareFeaturesIsMutable();
                this.supportedSoftwareFeatures_.set(i, Integer.valueOf(softwareFeature.getNumber()));
                onChanged();
                return this;
            }

            public Builder setTetheringSupported(boolean z) {
                this.bitField0_ |= 536870912;
                this.tetheringSupported_ = z;
                onChanged();
                return this;
            }

            public Builder setUserPublicKey(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 64;
                this.userPublicKey_ = byteString;
                onChanged();
                return this;
            }

            public Builder setUsingSecureScreenlock(boolean z) {
                this.bitField0_ |= 8388608;
                this.usingSecureScreenlock_ = z;
                onChanged();
                return this;
            }

            private Builder() {
                ByteString byteString = ByteString.EMPTY;
                this.gcmRegistrationId_ = byteString;
                this.apnRegistrationId_ = byteString;
                this.notificationEnabled_ = true;
                this.bluetoothMacAddress_ = "";
                this.deviceMasterKeyHash_ = byteString;
                this.userPublicKey_ = byteString;
                this.deviceModel_ = "";
                this.locale_ = "";
                this.keyHandle_ = byteString;
                this.deviceOsVersion_ = "";
                this.deviceOsRelease_ = "";
                this.deviceOsCodename_ = "";
                this.deviceSoftwareVersion_ = "";
                this.deviceSoftwarePackage_ = "";
                this.longDeviceId_ = byteString;
                this.deviceManufacturer_ = "";
                this.deviceType_ = 1;
                this.supportedSoftwareFeatures_ = Collections.emptyList();
                this.enabledSoftwareFeatures_ = Collections.emptyList();
                this.enrollmentSessionId_ = byteString;
                this.oauthToken_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GcmDeviceInfo build() {
                GcmDeviceInfo gcmDeviceInfoBuildPartial = buildPartial();
                if (gcmDeviceInfoBuildPartial.isInitialized()) {
                    return gcmDeviceInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) gcmDeviceInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GcmDeviceInfo buildPartial() {
                GcmDeviceInfo gcmDeviceInfo = new GcmDeviceInfo(this);
                int i = this.bitField0_;
                int i2 = this.bitField1_;
                int i3 = (i & 1) == 1 ? 1 : 0;
                gcmDeviceInfo.androidDeviceId_ = this.androidDeviceId_;
                if ((i & 2) == 2) {
                    i3 |= 2;
                }
                gcmDeviceInfo.gcmRegistrationId_ = this.gcmRegistrationId_;
                if ((i & 4) == 4) {
                    i3 |= 4;
                }
                gcmDeviceInfo.apnRegistrationId_ = this.apnRegistrationId_;
                if ((i & 8) == 8) {
                    i3 |= 8;
                }
                gcmDeviceInfo.notificationEnabled_ = this.notificationEnabled_;
                if ((i & 16) == 16) {
                    i3 |= 16;
                }
                gcmDeviceInfo.bluetoothMacAddress_ = this.bluetoothMacAddress_;
                if ((i & 32) == 32) {
                    i3 |= 32;
                }
                gcmDeviceInfo.deviceMasterKeyHash_ = this.deviceMasterKeyHash_;
                if ((i & 64) == 64) {
                    i3 |= 64;
                }
                gcmDeviceInfo.userPublicKey_ = this.userPublicKey_;
                if ((i & Barcode.FORMAT_ITF) == 128) {
                    i3 |= Barcode.FORMAT_ITF;
                }
                gcmDeviceInfo.deviceModel_ = this.deviceModel_;
                if ((i & 256) == 256) {
                    i3 |= 256;
                }
                gcmDeviceInfo.locale_ = this.locale_;
                if ((i & 512) == 512) {
                    i3 |= 512;
                }
                gcmDeviceInfo.keyHandle_ = this.keyHandle_;
                if ((i & Barcode.FORMAT_UPC_E) == 1024) {
                    i3 |= Barcode.FORMAT_UPC_E;
                }
                gcmDeviceInfo.counter_ = this.counter_;
                if ((i & Barcode.FORMAT_PDF417) == 2048) {
                    i3 |= Barcode.FORMAT_PDF417;
                }
                gcmDeviceInfo.deviceOsVersion_ = this.deviceOsVersion_;
                if ((i & 4096) == 4096) {
                    i3 |= 4096;
                }
                gcmDeviceInfo.deviceOsVersionCode_ = this.deviceOsVersionCode_;
                if ((i & 8192) == 8192) {
                    i3 |= 8192;
                }
                gcmDeviceInfo.deviceOsRelease_ = this.deviceOsRelease_;
                if ((i & 16384) == 16384) {
                    i3 |= 16384;
                }
                gcmDeviceInfo.deviceOsCodename_ = this.deviceOsCodename_;
                if ((i & 32768) == 32768) {
                    i3 |= 32768;
                }
                gcmDeviceInfo.deviceSoftwareVersion_ = this.deviceSoftwareVersion_;
                if ((i & 65536) == 65536) {
                    i3 |= 65536;
                }
                gcmDeviceInfo.deviceSoftwareVersionCode_ = this.deviceSoftwareVersionCode_;
                if ((i & 131072) == 131072) {
                    i3 |= 131072;
                }
                gcmDeviceInfo.deviceSoftwarePackage_ = this.deviceSoftwarePackage_;
                if ((i & 262144) == 262144) {
                    i3 |= 262144;
                }
                gcmDeviceInfo.deviceDisplayDiagonalMils_ = this.deviceDisplayDiagonalMils_;
                if ((i & 524288) == 524288) {
                    i3 |= 524288;
                }
                gcmDeviceInfo.deviceAuthzenVersion_ = this.deviceAuthzenVersion_;
                if ((i & 1048576) == 1048576) {
                    i3 |= 1048576;
                }
                gcmDeviceInfo.longDeviceId_ = this.longDeviceId_;
                if ((i & 2097152) == 2097152) {
                    i3 |= 2097152;
                }
                gcmDeviceInfo.deviceManufacturer_ = this.deviceManufacturer_;
                if ((4194304 & i) == 4194304) {
                    i3 |= 4194304;
                }
                gcmDeviceInfo.deviceType_ = this.deviceType_;
                if ((8388608 & i) == 8388608) {
                    i3 |= 8388608;
                }
                gcmDeviceInfo.usingSecureScreenlock_ = this.usingSecureScreenlock_;
                if ((16777216 & i) == 16777216) {
                    i3 |= 16777216;
                }
                gcmDeviceInfo.autoUnlockScreenlockSupported_ = this.autoUnlockScreenlockSupported_;
                if ((33554432 & i) == 33554432) {
                    i3 |= 33554432;
                }
                gcmDeviceInfo.autoUnlockScreenlockEnabled_ = this.autoUnlockScreenlockEnabled_;
                if ((67108864 & i) == 67108864) {
                    i3 |= 67108864;
                }
                gcmDeviceInfo.bluetoothRadioSupported_ = this.bluetoothRadioSupported_;
                if ((134217728 & i) == 134217728) {
                    i3 |= 134217728;
                }
                gcmDeviceInfo.bluetoothRadioEnabled_ = this.bluetoothRadioEnabled_;
                if ((268435456 & i) == 268435456) {
                    i3 |= 268435456;
                }
                gcmDeviceInfo.mobileDataSupported_ = this.mobileDataSupported_;
                if ((536870912 & i) == 536870912) {
                    i3 |= 536870912;
                }
                gcmDeviceInfo.tetheringSupported_ = this.tetheringSupported_;
                if ((1073741824 & i) == 1073741824) {
                    i3 |= 1073741824;
                }
                gcmDeviceInfo.bleRadioSupported_ = this.bleRadioSupported_;
                if ((i & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
                    i3 |= Integer.MIN_VALUE;
                }
                gcmDeviceInfo.pixelExperience_ = this.pixelExperience_;
                int i4 = (i2 & 1) != 1 ? 0 : 1;
                gcmDeviceInfo.arcPlusPlus_ = this.arcPlusPlus_;
                if ((i2 & 2) == 2) {
                    i4 |= 2;
                }
                gcmDeviceInfo.isScreenlockStateFlaky_ = this.isScreenlockStateFlaky_;
                if ((this.bitField1_ & 4) == 4) {
                    this.supportedSoftwareFeatures_ = Collections.unmodifiableList(this.supportedSoftwareFeatures_);
                    this.bitField1_ &= -5;
                }
                gcmDeviceInfo.supportedSoftwareFeatures_ = this.supportedSoftwareFeatures_;
                if ((this.bitField1_ & 8) == 8) {
                    this.enabledSoftwareFeatures_ = Collections.unmodifiableList(this.enabledSoftwareFeatures_);
                    this.bitField1_ &= -9;
                }
                gcmDeviceInfo.enabledSoftwareFeatures_ = this.enabledSoftwareFeatures_;
                if ((i2 & 16) == 16) {
                    i4 |= 4;
                }
                gcmDeviceInfo.enrollmentSessionId_ = this.enrollmentSessionId_;
                if ((i2 & 32) == 32) {
                    i4 |= 8;
                }
                gcmDeviceInfo.oauthToken_ = this.oauthToken_;
                gcmDeviceInfo.bitField0_ = i3;
                gcmDeviceInfo.bitField1_ = i4;
                onBuilt();
                return gcmDeviceInfo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public GcmDeviceInfo getDefaultInstanceForType() {
                return GcmDeviceInfo.getDefaultInstance();
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
                this.androidDeviceId_ = 0L;
                int i = this.bitField0_ & (-2);
                this.bitField0_ = i;
                ByteString byteString = ByteString.EMPTY;
                this.gcmRegistrationId_ = byteString;
                this.apnRegistrationId_ = byteString;
                this.notificationEnabled_ = true;
                this.bluetoothMacAddress_ = "";
                this.deviceMasterKeyHash_ = byteString;
                this.userPublicKey_ = byteString;
                this.deviceModel_ = "";
                this.locale_ = "";
                this.keyHandle_ = byteString;
                this.counter_ = 0L;
                this.deviceOsVersion_ = "";
                this.deviceOsVersionCode_ = 0L;
                this.deviceOsRelease_ = "";
                this.deviceOsCodename_ = "";
                this.deviceSoftwareVersion_ = "";
                this.deviceSoftwareVersionCode_ = 0L;
                this.deviceSoftwarePackage_ = "";
                this.deviceDisplayDiagonalMils_ = 0;
                this.deviceAuthzenVersion_ = 0;
                this.longDeviceId_ = byteString;
                this.deviceManufacturer_ = "";
                this.deviceType_ = 1;
                this.usingSecureScreenlock_ = false;
                this.autoUnlockScreenlockSupported_ = false;
                this.autoUnlockScreenlockEnabled_ = false;
                this.bluetoothRadioSupported_ = false;
                this.bluetoothRadioEnabled_ = false;
                this.mobileDataSupported_ = false;
                this.tetheringSupported_ = false;
                this.bleRadioSupported_ = false;
                this.pixelExperience_ = false;
                this.bitField0_ = (-65537) & i & (-3) & (-5) & (-9) & (-17) & (-33) & (-65) & (-129) & (-257) & (-513) & (-1025) & (-2049) & (-4097) & (-8193) & (-16385) & (-32769) & (-131073) & (-262145) & (-524289) & (-1048577) & (-2097153) & (-4194305) & (-8388609) & (-16777217) & (-33554433) & (-67108865) & (-134217729) & (-268435457) & (-536870913) & (-1073741825) & Integer.MAX_VALUE;
                this.arcPlusPlus_ = false;
                int i2 = this.bitField1_ & (-2);
                this.isScreenlockStateFlaky_ = false;
                this.bitField1_ = i2 & (-3);
                this.supportedSoftwareFeatures_ = Collections.emptyList();
                this.bitField1_ &= -5;
                this.enabledSoftwareFeatures_ = Collections.emptyList();
                int i3 = this.bitField1_ & (-9);
                this.enrollmentSessionId_ = byteString;
                this.oauthToken_ = "";
                this.bitField1_ = i3 & (-17) & (-33);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            public Builder clone() {
                return (Builder) super.clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GcmDeviceInfo) {
                    return mergeFrom((GcmDeviceInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GcmDeviceInfo gcmDeviceInfo) {
                if (gcmDeviceInfo == GcmDeviceInfo.getDefaultInstance()) {
                    return this;
                }
                if (gcmDeviceInfo.hasAndroidDeviceId()) {
                    setAndroidDeviceId(gcmDeviceInfo.getAndroidDeviceId());
                }
                if (gcmDeviceInfo.hasGcmRegistrationId()) {
                    setGcmRegistrationId(gcmDeviceInfo.getGcmRegistrationId());
                }
                if (gcmDeviceInfo.hasApnRegistrationId()) {
                    setApnRegistrationId(gcmDeviceInfo.getApnRegistrationId());
                }
                if (gcmDeviceInfo.hasNotificationEnabled()) {
                    setNotificationEnabled(gcmDeviceInfo.getNotificationEnabled());
                }
                if (gcmDeviceInfo.hasBluetoothMacAddress()) {
                    this.bitField0_ |= 16;
                    this.bluetoothMacAddress_ = gcmDeviceInfo.bluetoothMacAddress_;
                    onChanged();
                }
                if (gcmDeviceInfo.hasDeviceMasterKeyHash()) {
                    setDeviceMasterKeyHash(gcmDeviceInfo.getDeviceMasterKeyHash());
                }
                if (gcmDeviceInfo.hasUserPublicKey()) {
                    setUserPublicKey(gcmDeviceInfo.getUserPublicKey());
                }
                if (gcmDeviceInfo.hasDeviceModel()) {
                    this.bitField0_ |= Barcode.FORMAT_ITF;
                    this.deviceModel_ = gcmDeviceInfo.deviceModel_;
                    onChanged();
                }
                if (gcmDeviceInfo.hasLocale()) {
                    this.bitField0_ |= 256;
                    this.locale_ = gcmDeviceInfo.locale_;
                    onChanged();
                }
                if (gcmDeviceInfo.hasKeyHandle()) {
                    setKeyHandle(gcmDeviceInfo.getKeyHandle());
                }
                if (gcmDeviceInfo.hasCounter()) {
                    setCounter(gcmDeviceInfo.getCounter());
                }
                if (gcmDeviceInfo.hasDeviceOsVersion()) {
                    this.bitField0_ |= Barcode.FORMAT_PDF417;
                    this.deviceOsVersion_ = gcmDeviceInfo.deviceOsVersion_;
                    onChanged();
                }
                if (gcmDeviceInfo.hasDeviceOsVersionCode()) {
                    setDeviceOsVersionCode(gcmDeviceInfo.getDeviceOsVersionCode());
                }
                if (gcmDeviceInfo.hasDeviceOsRelease()) {
                    this.bitField0_ |= 8192;
                    this.deviceOsRelease_ = gcmDeviceInfo.deviceOsRelease_;
                    onChanged();
                }
                if (gcmDeviceInfo.hasDeviceOsCodename()) {
                    this.bitField0_ |= 16384;
                    this.deviceOsCodename_ = gcmDeviceInfo.deviceOsCodename_;
                    onChanged();
                }
                if (gcmDeviceInfo.hasDeviceSoftwareVersion()) {
                    this.bitField0_ |= 32768;
                    this.deviceSoftwareVersion_ = gcmDeviceInfo.deviceSoftwareVersion_;
                    onChanged();
                }
                if (gcmDeviceInfo.hasDeviceSoftwareVersionCode()) {
                    setDeviceSoftwareVersionCode(gcmDeviceInfo.getDeviceSoftwareVersionCode());
                }
                if (gcmDeviceInfo.hasDeviceSoftwarePackage()) {
                    this.bitField0_ |= 131072;
                    this.deviceSoftwarePackage_ = gcmDeviceInfo.deviceSoftwarePackage_;
                    onChanged();
                }
                if (gcmDeviceInfo.hasDeviceDisplayDiagonalMils()) {
                    setDeviceDisplayDiagonalMils(gcmDeviceInfo.getDeviceDisplayDiagonalMils());
                }
                if (gcmDeviceInfo.hasDeviceAuthzenVersion()) {
                    setDeviceAuthzenVersion(gcmDeviceInfo.getDeviceAuthzenVersion());
                }
                if (gcmDeviceInfo.hasLongDeviceId()) {
                    setLongDeviceId(gcmDeviceInfo.getLongDeviceId());
                }
                if (gcmDeviceInfo.hasDeviceManufacturer()) {
                    this.bitField0_ |= 2097152;
                    this.deviceManufacturer_ = gcmDeviceInfo.deviceManufacturer_;
                    onChanged();
                }
                if (gcmDeviceInfo.hasDeviceType()) {
                    setDeviceType(gcmDeviceInfo.getDeviceType());
                }
                if (gcmDeviceInfo.hasUsingSecureScreenlock()) {
                    setUsingSecureScreenlock(gcmDeviceInfo.getUsingSecureScreenlock());
                }
                if (gcmDeviceInfo.hasAutoUnlockScreenlockSupported()) {
                    setAutoUnlockScreenlockSupported(gcmDeviceInfo.getAutoUnlockScreenlockSupported());
                }
                if (gcmDeviceInfo.hasAutoUnlockScreenlockEnabled()) {
                    setAutoUnlockScreenlockEnabled(gcmDeviceInfo.getAutoUnlockScreenlockEnabled());
                }
                if (gcmDeviceInfo.hasBluetoothRadioSupported()) {
                    setBluetoothRadioSupported(gcmDeviceInfo.getBluetoothRadioSupported());
                }
                if (gcmDeviceInfo.hasBluetoothRadioEnabled()) {
                    setBluetoothRadioEnabled(gcmDeviceInfo.getBluetoothRadioEnabled());
                }
                if (gcmDeviceInfo.hasMobileDataSupported()) {
                    setMobileDataSupported(gcmDeviceInfo.getMobileDataSupported());
                }
                if (gcmDeviceInfo.hasTetheringSupported()) {
                    setTetheringSupported(gcmDeviceInfo.getTetheringSupported());
                }
                if (gcmDeviceInfo.hasBleRadioSupported()) {
                    setBleRadioSupported(gcmDeviceInfo.getBleRadioSupported());
                }
                if (gcmDeviceInfo.hasPixelExperience()) {
                    setPixelExperience(gcmDeviceInfo.getPixelExperience());
                }
                if (gcmDeviceInfo.hasArcPlusPlus()) {
                    setArcPlusPlus(gcmDeviceInfo.getArcPlusPlus());
                }
                if (gcmDeviceInfo.hasIsScreenlockStateFlaky()) {
                    setIsScreenlockStateFlaky(gcmDeviceInfo.getIsScreenlockStateFlaky());
                }
                if (!gcmDeviceInfo.supportedSoftwareFeatures_.isEmpty()) {
                    if (this.supportedSoftwareFeatures_.isEmpty()) {
                        this.supportedSoftwareFeatures_ = gcmDeviceInfo.supportedSoftwareFeatures_;
                        this.bitField1_ &= -5;
                    } else {
                        ensureSupportedSoftwareFeaturesIsMutable();
                        this.supportedSoftwareFeatures_.addAll(gcmDeviceInfo.supportedSoftwareFeatures_);
                    }
                    onChanged();
                }
                if (!gcmDeviceInfo.enabledSoftwareFeatures_.isEmpty()) {
                    if (this.enabledSoftwareFeatures_.isEmpty()) {
                        this.enabledSoftwareFeatures_ = gcmDeviceInfo.enabledSoftwareFeatures_;
                        this.bitField1_ &= -9;
                    } else {
                        ensureEnabledSoftwareFeaturesIsMutable();
                        this.enabledSoftwareFeatures_.addAll(gcmDeviceInfo.enabledSoftwareFeatures_);
                    }
                    onChanged();
                }
                if (gcmDeviceInfo.hasEnrollmentSessionId()) {
                    setEnrollmentSessionId(gcmDeviceInfo.getEnrollmentSessionId());
                }
                if (gcmDeviceInfo.hasOauthToken()) {
                    this.bitField1_ |= 32;
                    this.oauthToken_ = gcmDeviceInfo.oauthToken_;
                    onChanged();
                }
                mergeUnknownFields(((GeneratedMessageV3) gcmDeviceInfo).unknownFields);
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                ByteString byteString = ByteString.EMPTY;
                this.gcmRegistrationId_ = byteString;
                this.apnRegistrationId_ = byteString;
                this.notificationEnabled_ = true;
                this.bluetoothMacAddress_ = "";
                this.deviceMasterKeyHash_ = byteString;
                this.userPublicKey_ = byteString;
                this.deviceModel_ = "";
                this.locale_ = "";
                this.keyHandle_ = byteString;
                this.deviceOsVersion_ = "";
                this.deviceOsRelease_ = "";
                this.deviceOsCodename_ = "";
                this.deviceSoftwareVersion_ = "";
                this.deviceSoftwarePackage_ = "";
                this.longDeviceId_ = byteString;
                this.deviceManufacturer_ = "";
                this.deviceType_ = 1;
                this.supportedSoftwareFeatures_ = Collections.emptyList();
                this.enabledSoftwareFeatures_ = Collections.emptyList();
                this.enrollmentSessionId_ = byteString;
                this.oauthToken_ = "";
                maybeForceBuilderInitialization();
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                GcmDeviceInfo gcmDeviceInfo = null;
                try {
                    try {
                        GcmDeviceInfo partialFrom = GcmDeviceInfo.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        GcmDeviceInfo gcmDeviceInfo2 = (GcmDeviceInfo) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            gcmDeviceInfo = gcmDeviceInfo2;
                            if (gcmDeviceInfo != null) {
                                mergeFrom(gcmDeviceInfo);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (gcmDeviceInfo != null) {
                        mergeFrom(gcmDeviceInfo);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(GcmDeviceInfo gcmDeviceInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(gcmDeviceInfo);
        }

        public static GcmDeviceInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private GcmDeviceInfo(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GcmDeviceInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GcmDeviceInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GcmDeviceInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GcmDeviceInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static GcmDeviceInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private GcmDeviceInfo() {
            this.memoizedIsInitialized = (byte) -1;
            this.androidDeviceId_ = 0L;
            ByteString byteString = ByteString.EMPTY;
            this.gcmRegistrationId_ = byteString;
            this.apnRegistrationId_ = byteString;
            this.notificationEnabled_ = true;
            this.bluetoothMacAddress_ = "";
            this.deviceMasterKeyHash_ = byteString;
            this.userPublicKey_ = byteString;
            this.deviceModel_ = "";
            this.locale_ = "";
            this.keyHandle_ = byteString;
            this.counter_ = 0L;
            this.deviceOsVersion_ = "";
            this.deviceOsVersionCode_ = 0L;
            this.deviceOsRelease_ = "";
            this.deviceOsCodename_ = "";
            this.deviceSoftwareVersion_ = "";
            this.deviceSoftwareVersionCode_ = 0L;
            this.deviceSoftwarePackage_ = "";
            this.deviceDisplayDiagonalMils_ = 0;
            this.deviceAuthzenVersion_ = 0;
            this.longDeviceId_ = byteString;
            this.deviceManufacturer_ = "";
            this.deviceType_ = 1;
            this.usingSecureScreenlock_ = false;
            this.autoUnlockScreenlockSupported_ = false;
            this.autoUnlockScreenlockEnabled_ = false;
            this.bluetoothRadioSupported_ = false;
            this.bluetoothRadioEnabled_ = false;
            this.mobileDataSupported_ = false;
            this.tetheringSupported_ = false;
            this.bleRadioSupported_ = false;
            this.pixelExperience_ = false;
            this.arcPlusPlus_ = false;
            this.isScreenlockStateFlaky_ = false;
            this.supportedSoftwareFeatures_ = Collections.emptyList();
            this.enabledSoftwareFeatures_ = Collections.emptyList();
            this.enrollmentSessionId_ = byteString;
            this.oauthToken_ = "";
        }

        public static GcmDeviceInfo parseFrom(InputStream inputStream) throws IOException {
            return (GcmDeviceInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static GcmDeviceInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GcmDeviceInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GcmDeviceInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GcmDeviceInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GcmDeviceInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GcmDeviceInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private GcmDeviceInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        switch (tag) {
                            case 0:
                                break;
                            case 9:
                                this.bitField0_ |= 1;
                                this.androidDeviceId_ = codedInputStream.readFixed64();
                                continue;
                            case 34:
                                this.bitField0_ |= 64;
                                this.userPublicKey_ = codedInputStream.readBytes();
                                continue;
                            case 58:
                                ByteString bytes = codedInputStream.readBytes();
                                this.bitField0_ |= Barcode.FORMAT_ITF;
                                this.deviceModel_ = bytes;
                                continue;
                            case 66:
                                ByteString bytes2 = codedInputStream.readBytes();
                                this.bitField0_ |= 256;
                                this.locale_ = bytes2;
                                continue;
                            case 74:
                                this.bitField0_ |= 512;
                                this.keyHandle_ = codedInputStream.readBytes();
                                continue;
                            case 96:
                                this.bitField0_ |= Barcode.FORMAT_UPC_E;
                                this.counter_ = codedInputStream.readInt64();
                                continue;
                            case 106:
                                ByteString bytes3 = codedInputStream.readBytes();
                                this.bitField0_ |= Barcode.FORMAT_PDF417;
                                this.deviceOsVersion_ = bytes3;
                                continue;
                            case 112:
                                this.bitField0_ |= 4096;
                                this.deviceOsVersionCode_ = codedInputStream.readInt64();
                                continue;
                            case 122:
                                ByteString bytes4 = codedInputStream.readBytes();
                                this.bitField0_ |= 8192;
                                this.deviceOsRelease_ = bytes4;
                                continue;
                            case ConnectConstant.DEVICE_BOND_STATE_NONE /* 130 */:
                                ByteString bytes5 = codedInputStream.readBytes();
                                this.bitField0_ |= 16384;
                                this.deviceOsCodename_ = bytes5;
                                continue;
                            case 138:
                                ByteString bytes6 = codedInputStream.readBytes();
                                this.bitField0_ |= 32768;
                                this.deviceSoftwareVersion_ = bytes6;
                                continue;
                            case 144:
                                this.bitField0_ |= 65536;
                                this.deviceSoftwareVersionCode_ = codedInputStream.readInt64();
                                continue;
                            case 154:
                                ByteString bytes7 = codedInputStream.readBytes();
                                this.bitField0_ |= 131072;
                                this.deviceSoftwarePackage_ = bytes7;
                                continue;
                            case 176:
                                this.bitField0_ |= 262144;
                                this.deviceDisplayDiagonalMils_ = codedInputStream.readInt32();
                                continue;
                            case 192:
                                this.bitField0_ |= 524288;
                                this.deviceAuthzenVersion_ = codedInputStream.readInt32();
                                continue;
                            case 234:
                                this.bitField0_ |= 1048576;
                                this.longDeviceId_ = codedInputStream.readBytes();
                                continue;
                            case 250:
                                ByteString bytes8 = codedInputStream.readBytes();
                                this.bitField0_ |= 2097152;
                                this.deviceManufacturer_ = bytes8;
                                continue;
                            case 256:
                                int i2 = codedInputStream.readEnum();
                                if (DeviceType.valueOf(i2) == null) {
                                    builderNewBuilder.mergeVarintField(32, i2);
                                } else {
                                    this.bitField0_ |= 4194304;
                                    this.deviceType_ = i2;
                                    continue;
                                }
                                break;
                            case 818:
                                this.bitField0_ |= 2;
                                this.gcmRegistrationId_ = codedInputStream.readBytes();
                                continue;
                            case 826:
                                this.bitField0_ |= 32;
                                this.deviceMasterKeyHash_ = codedInputStream.readBytes();
                                continue;
                            case 1618:
                                this.bitField0_ |= 4;
                                this.apnRegistrationId_ = codedInputStream.readBytes();
                                continue;
                            case 1624:
                                this.bitField0_ |= 8;
                                this.notificationEnabled_ = codedInputStream.readBool();
                                continue;
                            case 2418:
                                ByteString bytes9 = codedInputStream.readBytes();
                                this.bitField0_ |= 16;
                                this.bluetoothMacAddress_ = bytes9;
                                continue;
                            case 3200:
                                this.bitField0_ |= 8388608;
                                this.usingSecureScreenlock_ = codedInputStream.readBool();
                                continue;
                            case 3208:
                                this.bitField0_ |= 16777216;
                                this.autoUnlockScreenlockSupported_ = codedInputStream.readBool();
                                continue;
                            case 3216:
                                this.bitField0_ |= 33554432;
                                this.autoUnlockScreenlockEnabled_ = codedInputStream.readBool();
                                continue;
                            case 3224:
                                this.bitField0_ |= 67108864;
                                this.bluetoothRadioSupported_ = codedInputStream.readBool();
                                continue;
                            case 3232:
                                this.bitField0_ |= 134217728;
                                this.bluetoothRadioEnabled_ = codedInputStream.readBool();
                                continue;
                            case 3240:
                                this.bitField0_ |= 268435456;
                                this.mobileDataSupported_ = codedInputStream.readBool();
                                continue;
                            case 3248:
                                this.bitField0_ |= 536870912;
                                this.tetheringSupported_ = codedInputStream.readBool();
                                continue;
                            case 3256:
                                this.bitField0_ |= 1073741824;
                                this.bleRadioSupported_ = codedInputStream.readBool();
                                continue;
                            case 3264:
                                this.bitField0_ |= Integer.MIN_VALUE;
                                this.pixelExperience_ = codedInputStream.readBool();
                                continue;
                            case 3272:
                                this.bitField1_ |= 1;
                                this.arcPlusPlus_ = codedInputStream.readBool();
                                continue;
                            case 3280:
                                this.bitField1_ |= 2;
                                this.isScreenlockStateFlaky_ = codedInputStream.readBool();
                                continue;
                            case 3288:
                                int i3 = codedInputStream.readEnum();
                                if (SoftwareFeature.valueOf(i3) == null) {
                                    builderNewBuilder.mergeVarintField(SUPPORTED_SOFTWARE_FEATURES_FIELD_NUMBER, i3);
                                } else {
                                    if ((i & 4) != 4) {
                                        this.supportedSoftwareFeatures_ = new ArrayList();
                                        i |= 4;
                                    }
                                    this.supportedSoftwareFeatures_.add(Integer.valueOf(i3));
                                    continue;
                                }
                                break;
                            case 3290:
                                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    int i4 = codedInputStream.readEnum();
                                    if (SoftwareFeature.valueOf(i4) == null) {
                                        builderNewBuilder.mergeVarintField(SUPPORTED_SOFTWARE_FEATURES_FIELD_NUMBER, i4);
                                    } else {
                                        if ((i & 4) != 4) {
                                            this.supportedSoftwareFeatures_ = new ArrayList();
                                            i |= 4;
                                        }
                                        this.supportedSoftwareFeatures_.add(Integer.valueOf(i4));
                                    }
                                }
                                codedInputStream.popLimit(iPushLimit);
                                continue;
                            case 3296:
                                int i5 = codedInputStream.readEnum();
                                if (SoftwareFeature.valueOf(i5) == null) {
                                    builderNewBuilder.mergeVarintField(ENABLED_SOFTWARE_FEATURES_FIELD_NUMBER, i5);
                                } else {
                                    if ((i & 8) != 8) {
                                        this.enabledSoftwareFeatures_ = new ArrayList();
                                        i |= 8;
                                    }
                                    this.enabledSoftwareFeatures_.add(Integer.valueOf(i5));
                                    continue;
                                }
                                break;
                            case 3298:
                                int iPushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    int i6 = codedInputStream.readEnum();
                                    if (SoftwareFeature.valueOf(i6) == null) {
                                        builderNewBuilder.mergeVarintField(ENABLED_SOFTWARE_FEATURES_FIELD_NUMBER, i6);
                                    } else {
                                        if ((i & 8) != 8) {
                                            this.enabledSoftwareFeatures_ = new ArrayList();
                                            i |= 8;
                                        }
                                        this.enabledSoftwareFeatures_.add(Integer.valueOf(i6));
                                    }
                                }
                                codedInputStream.popLimit(iPushLimit2);
                                continue;
                            case 8002:
                                this.bitField1_ |= 4;
                                this.enrollmentSessionId_ = codedInputStream.readBytes();
                                continue;
                            case 8010:
                                ByteString bytes10 = codedInputStream.readBytes();
                                this.bitField1_ |= 8;
                                this.oauthToken_ = bytes10;
                                continue;
                            default:
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    break;
                                }
                                break;
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if ((i & 4) == 4) {
                        this.supportedSoftwareFeatures_ = Collections.unmodifiableList(this.supportedSoftwareFeatures_);
                    }
                    if ((i & 8) == 8) {
                        this.enabledSoftwareFeatures_ = Collections.unmodifiableList(this.enabledSoftwareFeatures_);
                    }
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((i & 4) == 4) {
                this.supportedSoftwareFeatures_ = Collections.unmodifiableList(this.supportedSoftwareFeatures_);
            }
            if ((i & 8) == 8) {
                this.enabledSoftwareFeatures_ = Collections.unmodifiableList(this.enabledSoftwareFeatures_);
            }
            this.unknownFields = builderNewBuilder.build();
            makeExtensionsImmutable();
        }
    }

    public interface GcmDeviceInfoOrBuilder extends MessageOrBuilder {
        long getAndroidDeviceId();

        ByteString getApnRegistrationId();

        boolean getArcPlusPlus();

        boolean getAutoUnlockScreenlockEnabled();

        boolean getAutoUnlockScreenlockSupported();

        boolean getBleRadioSupported();

        String getBluetoothMacAddress();

        ByteString getBluetoothMacAddressBytes();

        boolean getBluetoothRadioEnabled();

        boolean getBluetoothRadioSupported();

        long getCounter();

        int getDeviceAuthzenVersion();

        int getDeviceDisplayDiagonalMils();

        String getDeviceManufacturer();

        ByteString getDeviceManufacturerBytes();

        ByteString getDeviceMasterKeyHash();

        String getDeviceModel();

        ByteString getDeviceModelBytes();

        String getDeviceOsCodename();

        ByteString getDeviceOsCodenameBytes();

        String getDeviceOsRelease();

        ByteString getDeviceOsReleaseBytes();

        String getDeviceOsVersion();

        ByteString getDeviceOsVersionBytes();

        long getDeviceOsVersionCode();

        String getDeviceSoftwarePackage();

        ByteString getDeviceSoftwarePackageBytes();

        String getDeviceSoftwareVersion();

        ByteString getDeviceSoftwareVersionBytes();

        long getDeviceSoftwareVersionCode();

        DeviceType getDeviceType();

        SoftwareFeature getEnabledSoftwareFeatures(int i);

        int getEnabledSoftwareFeaturesCount();

        List<SoftwareFeature> getEnabledSoftwareFeaturesList();

        ByteString getEnrollmentSessionId();

        ByteString getGcmRegistrationId();

        boolean getIsScreenlockStateFlaky();

        ByteString getKeyHandle();

        String getLocale();

        ByteString getLocaleBytes();

        ByteString getLongDeviceId();

        boolean getMobileDataSupported();

        boolean getNotificationEnabled();

        String getOauthToken();

        ByteString getOauthTokenBytes();

        boolean getPixelExperience();

        SoftwareFeature getSupportedSoftwareFeatures(int i);

        int getSupportedSoftwareFeaturesCount();

        List<SoftwareFeature> getSupportedSoftwareFeaturesList();

        boolean getTetheringSupported();

        ByteString getUserPublicKey();

        boolean getUsingSecureScreenlock();

        boolean hasAndroidDeviceId();

        boolean hasApnRegistrationId();

        boolean hasArcPlusPlus();

        boolean hasAutoUnlockScreenlockEnabled();

        boolean hasAutoUnlockScreenlockSupported();

        boolean hasBleRadioSupported();

        boolean hasBluetoothMacAddress();

        boolean hasBluetoothRadioEnabled();

        boolean hasBluetoothRadioSupported();

        boolean hasCounter();

        boolean hasDeviceAuthzenVersion();

        boolean hasDeviceDisplayDiagonalMils();

        boolean hasDeviceManufacturer();

        boolean hasDeviceMasterKeyHash();

        boolean hasDeviceModel();

        boolean hasDeviceOsCodename();

        boolean hasDeviceOsRelease();

        boolean hasDeviceOsVersion();

        boolean hasDeviceOsVersionCode();

        boolean hasDeviceSoftwarePackage();

        boolean hasDeviceSoftwareVersion();

        boolean hasDeviceSoftwareVersionCode();

        boolean hasDeviceType();

        boolean hasEnrollmentSessionId();

        boolean hasGcmRegistrationId();

        boolean hasIsScreenlockStateFlaky();

        boolean hasKeyHandle();

        boolean hasLocale();

        boolean hasLongDeviceId();

        boolean hasMobileDataSupported();

        boolean hasNotificationEnabled();

        boolean hasOauthToken();

        boolean hasPixelExperience();

        boolean hasTetheringSupported();

        boolean hasUserPublicKey();

        boolean hasUsingSecureScreenlock();
    }

    public static final class GcmMetadata extends GeneratedMessageV3 implements GcmMetadataOrBuilder {
        private static final GcmMetadata DEFAULT_INSTANCE = new GcmMetadata();

        @Deprecated
        public static final Parser<GcmMetadata> PARSER = new AbstractParser<GcmMetadata>() { // from class: com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmMetadata.1
            @Override // com.google.protobuf.Parser
            public GcmMetadata parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new GcmMetadata(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int VERSION_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int type_;
        private int version_;

        public static GcmMetadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SecureGcmProto.internal_static_securegcm_GcmMetadata_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GcmMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GcmMetadata) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GcmMetadata parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<GcmMetadata> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GcmMetadata)) {
                return super.equals(obj);
            }
            GcmMetadata gcmMetadata = (GcmMetadata) obj;
            boolean z = hasType() == gcmMetadata.hasType();
            if (hasType()) {
                z = z && this.type_ == gcmMetadata.type_;
            }
            boolean z2 = z && hasVersion() == gcmMetadata.hasVersion();
            if (hasVersion()) {
                z2 = z2 && getVersion() == gcmMetadata.getVersion();
            }
            return z2 && this.unknownFields.equals(gcmMetadata.unknownFields);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GcmMetadata> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) == 1 ? 0 + CodedOutputStream.computeEnumSize(1, this.type_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeEnumSize += CodedOutputStream.computeInt32Size(2, this.version_);
            }
            int serializedSize = iComputeEnumSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmMetadataOrBuilder
        public Type getType() {
            Type typeValueOf = Type.valueOf(this.type_);
            return typeValueOf == null ? Type.ENROLLMENT : typeValueOf;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmMetadataOrBuilder
        public int getVersion() {
            return this.version_;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmMetadataOrBuilder
        public boolean hasType() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmMetadataOrBuilder
        public boolean hasVersion() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptorForType().hashCode() + 779;
            if (hasType()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + this.type_;
            }
            if (hasVersion()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getVersion();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SecureGcmProto.internal_static_securegcm_GcmMetadata_fieldAccessorTable.ensureFieldAccessorsInitialized(GcmMetadata.class, Builder.class);
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
            if (hasType()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeEnum(1, this.type_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(2, this.version_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GcmMetadataOrBuilder {
            private int bitField0_;
            private int type_;
            private int version_;

            public static final Descriptors.Descriptor getDescriptor() {
                return SecureGcmProto.internal_static_securegcm_GcmMetadata_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder clearType() {
                this.bitField0_ &= -2;
                this.type_ = 0;
                onChanged();
                return this;
            }

            public Builder clearVersion() {
                this.bitField0_ &= -3;
                this.version_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SecureGcmProto.internal_static_securegcm_GcmMetadata_descriptor;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmMetadataOrBuilder
            public Type getType() {
                Type typeValueOf = Type.valueOf(this.type_);
                return typeValueOf == null ? Type.ENROLLMENT : typeValueOf;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmMetadataOrBuilder
            public int getVersion() {
                return this.version_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmMetadataOrBuilder
            public boolean hasType() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.GcmMetadataOrBuilder
            public boolean hasVersion() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SecureGcmProto.internal_static_securegcm_GcmMetadata_fieldAccessorTable.ensureFieldAccessorsInitialized(GcmMetadata.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasType();
            }

            public Builder setType(Type type) {
                type.getClass();
                this.bitField0_ |= 1;
                this.type_ = type.getNumber();
                onChanged();
                return this;
            }

            public Builder setVersion(int i) {
                this.bitField0_ |= 2;
                this.version_ = i;
                onChanged();
                return this;
            }

            private Builder() {
                this.type_ = 0;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GcmMetadata build() {
                GcmMetadata gcmMetadataBuildPartial = buildPartial();
                if (gcmMetadataBuildPartial.isInitialized()) {
                    return gcmMetadataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) gcmMetadataBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GcmMetadata buildPartial() {
                GcmMetadata gcmMetadata = new GcmMetadata(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                gcmMetadata.type_ = this.type_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                gcmMetadata.version_ = this.version_;
                gcmMetadata.bitField0_ = i2;
                onBuilt();
                return gcmMetadata;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public GcmMetadata getDefaultInstanceForType() {
                return GcmMetadata.getDefaultInstance();
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
                this.type_ = 0;
                int i = this.bitField0_ & (-2);
                this.version_ = 0;
                this.bitField0_ = i & (-3);
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.type_ = 0;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            public Builder clone() {
                return (Builder) super.clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GcmMetadata) {
                    return mergeFrom((GcmMetadata) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GcmMetadata gcmMetadata) {
                if (gcmMetadata == GcmMetadata.getDefaultInstance()) {
                    return this;
                }
                if (gcmMetadata.hasType()) {
                    setType(gcmMetadata.getType());
                }
                if (gcmMetadata.hasVersion()) {
                    setVersion(gcmMetadata.getVersion());
                }
                mergeUnknownFields(((GeneratedMessageV3) gcmMetadata).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                GcmMetadata gcmMetadata = null;
                try {
                    try {
                        GcmMetadata partialFrom = GcmMetadata.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        GcmMetadata gcmMetadata2 = (GcmMetadata) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            gcmMetadata = gcmMetadata2;
                            if (gcmMetadata != null) {
                                mergeFrom(gcmMetadata);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (gcmMetadata != null) {
                        mergeFrom(gcmMetadata);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(GcmMetadata gcmMetadata) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(gcmMetadata);
        }

        public static GcmMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private GcmMetadata(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GcmMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GcmMetadata) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GcmMetadata parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GcmMetadata getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static GcmMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private GcmMetadata() {
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
            this.version_ = 0;
        }

        public static GcmMetadata parseFrom(InputStream inputStream) throws IOException {
            return (GcmMetadata) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static GcmMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GcmMetadata) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private GcmMetadata(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                int i = codedInputStream.readEnum();
                                if (Type.valueOf(i) == null) {
                                    builderNewBuilder.mergeVarintField(1, i);
                                } else {
                                    this.bitField0_ = 1 | this.bitField0_;
                                    this.type_ = i;
                                }
                            } else if (tag != 16) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.bitField0_ |= 2;
                                this.version_ = codedInputStream.readInt32();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
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

        public static GcmMetadata parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (GcmMetadata) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GcmMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (GcmMetadata) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface GcmMetadataOrBuilder extends MessageOrBuilder {
        Type getType();

        int getVersion();

        boolean hasType();

        boolean hasVersion();
    }

    public enum InvocationReason implements ProtocolMessageEnum {
        REASON_UNKNOWN(0),
        REASON_INITIALIZATION(1),
        REASON_PERIODIC(2),
        REASON_SLOW_PERIODIC(3),
        REASON_FAST_PERIODIC(4),
        REASON_EXPIRATION(5),
        REASON_FAILURE_RECOVERY(6),
        REASON_NEW_ACCOUNT(7),
        REASON_CHANGED_ACCOUNT(8),
        REASON_FEATURE_TOGGLED(9),
        REASON_SERVER_INITIATED(10),
        REASON_ADDRESS_CHANGE(11),
        REASON_SOFTWARE_UPDATE(12),
        REASON_MANUAL(13),
        REASON_CUSTOM_KEY_INVALIDATION(14),
        REASON_PROXIMITY_PERIODIC(15);

        public static final int REASON_ADDRESS_CHANGE_VALUE = 11;
        public static final int REASON_CHANGED_ACCOUNT_VALUE = 8;
        public static final int REASON_CUSTOM_KEY_INVALIDATION_VALUE = 14;
        public static final int REASON_EXPIRATION_VALUE = 5;
        public static final int REASON_FAILURE_RECOVERY_VALUE = 6;
        public static final int REASON_FAST_PERIODIC_VALUE = 4;
        public static final int REASON_FEATURE_TOGGLED_VALUE = 9;
        public static final int REASON_INITIALIZATION_VALUE = 1;
        public static final int REASON_MANUAL_VALUE = 13;
        public static final int REASON_NEW_ACCOUNT_VALUE = 7;
        public static final int REASON_PERIODIC_VALUE = 2;
        public static final int REASON_PROXIMITY_PERIODIC_VALUE = 15;
        public static final int REASON_SERVER_INITIATED_VALUE = 10;
        public static final int REASON_SLOW_PERIODIC_VALUE = 3;
        public static final int REASON_SOFTWARE_UPDATE_VALUE = 12;
        public static final int REASON_UNKNOWN_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<InvocationReason> internalValueMap = new Internal.EnumLiteMap<InvocationReason>() { // from class: com.google.security.cryptauth.lib.securegcm.SecureGcmProto.InvocationReason.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public InvocationReason findValueByNumber(int i) {
                return InvocationReason.forNumber(i);
            }
        };
        private static final InvocationReason[] VALUES = values();

        InvocationReason(int i) {
            this.value = i;
        }

        public static InvocationReason forNumber(int i) {
            switch (i) {
                case 0:
                    return REASON_UNKNOWN;
                case 1:
                    return REASON_INITIALIZATION;
                case 2:
                    return REASON_PERIODIC;
                case 3:
                    return REASON_SLOW_PERIODIC;
                case 4:
                    return REASON_FAST_PERIODIC;
                case 5:
                    return REASON_EXPIRATION;
                case 6:
                    return REASON_FAILURE_RECOVERY;
                case 7:
                    return REASON_NEW_ACCOUNT;
                case 8:
                    return REASON_CHANGED_ACCOUNT;
                case 9:
                    return REASON_FEATURE_TOGGLED;
                case 10:
                    return REASON_SERVER_INITIATED;
                case 11:
                    return REASON_ADDRESS_CHANGE;
                case 12:
                    return REASON_SOFTWARE_UPDATE;
                case 13:
                    return REASON_MANUAL;
                case 14:
                    return REASON_CUSTOM_KEY_INVALIDATION;
                case 15:
                    return REASON_PROXIMITY_PERIODIC;
                default:
                    return null;
            }
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return SecureGcmProto.getDescriptor().getEnumTypes().get(3);
        }

        public static Internal.EnumLiteMap<InvocationReason> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            return getDescriptor().getValues().get(ordinal());
        }

        @Deprecated
        public static InvocationReason valueOf(int i) {
            return forNumber(i);
        }

        public static InvocationReason valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class LoginNotificationInfo extends GeneratedMessageV3 implements LoginNotificationInfoOrBuilder {
        public static final int CREATION_TIME_FIELD_NUMBER = 2;
        public static final int EMAIL_FIELD_NUMBER = 3;
        public static final int EVENT_TYPE_FIELD_NUMBER = 6;
        public static final int HOST_FIELD_NUMBER = 4;
        public static final int SOURCE_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long creationTime_;
        private volatile Object email_;
        private volatile Object eventType_;
        private volatile Object host_;
        private byte memoizedIsInitialized;
        private volatile Object source_;
        private static final LoginNotificationInfo DEFAULT_INSTANCE = new LoginNotificationInfo();

        @Deprecated
        public static final Parser<LoginNotificationInfo> PARSER = new AbstractParser<LoginNotificationInfo>() { // from class: com.google.security.cryptauth.lib.securegcm.SecureGcmProto.LoginNotificationInfo.1
            @Override // com.google.protobuf.Parser
            public LoginNotificationInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new LoginNotificationInfo(codedInputStream, extensionRegistryLite);
            }
        };

        public static LoginNotificationInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SecureGcmProto.internal_static_securegcm_LoginNotificationInfo_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LoginNotificationInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LoginNotificationInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LoginNotificationInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<LoginNotificationInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LoginNotificationInfo)) {
                return super.equals(obj);
            }
            LoginNotificationInfo loginNotificationInfo = (LoginNotificationInfo) obj;
            boolean z = hasCreationTime() == loginNotificationInfo.hasCreationTime();
            if (hasCreationTime()) {
                z = z && getCreationTime() == loginNotificationInfo.getCreationTime();
            }
            boolean z2 = z && hasEmail() == loginNotificationInfo.hasEmail();
            if (hasEmail()) {
                z2 = z2 && getEmail().equals(loginNotificationInfo.getEmail());
            }
            boolean z3 = z2 && hasHost() == loginNotificationInfo.hasHost();
            if (hasHost()) {
                z3 = z3 && getHost().equals(loginNotificationInfo.getHost());
            }
            boolean z4 = z3 && hasSource() == loginNotificationInfo.hasSource();
            if (hasSource()) {
                z4 = z4 && getSource().equals(loginNotificationInfo.getSource());
            }
            boolean z5 = z4 && hasEventType() == loginNotificationInfo.hasEventType();
            if (hasEventType()) {
                z5 = z5 && getEventType().equals(loginNotificationInfo.getEventType());
            }
            return z5 && this.unknownFields.equals(loginNotificationInfo.unknownFields);
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.LoginNotificationInfoOrBuilder
        public long getCreationTime() {
            return this.creationTime_;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.LoginNotificationInfoOrBuilder
        public String getEmail() {
            Object obj = this.email_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.email_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.LoginNotificationInfoOrBuilder
        public ByteString getEmailBytes() {
            Object obj = this.email_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.email_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.LoginNotificationInfoOrBuilder
        public String getEventType() {
            Object obj = this.eventType_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.eventType_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.LoginNotificationInfoOrBuilder
        public ByteString getEventTypeBytes() {
            Object obj = this.eventType_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.eventType_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.LoginNotificationInfoOrBuilder
        public String getHost() {
            Object obj = this.host_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.host_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.LoginNotificationInfoOrBuilder
        public ByteString getHostBytes() {
            Object obj = this.host_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.host_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LoginNotificationInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeFixed64Size = (this.bitField0_ & 1) == 1 ? 0 + CodedOutputStream.computeFixed64Size(2, this.creationTime_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeFixed64Size += GeneratedMessageV3.computeStringSize(3, this.email_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeFixed64Size += GeneratedMessageV3.computeStringSize(4, this.host_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeFixed64Size += GeneratedMessageV3.computeStringSize(5, this.source_);
            }
            if ((this.bitField0_ & 16) == 16) {
                iComputeFixed64Size += GeneratedMessageV3.computeStringSize(6, this.eventType_);
            }
            int serializedSize = iComputeFixed64Size + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.LoginNotificationInfoOrBuilder
        public String getSource() {
            Object obj = this.source_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.source_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.LoginNotificationInfoOrBuilder
        public ByteString getSourceBytes() {
            Object obj = this.source_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.source_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.LoginNotificationInfoOrBuilder
        public boolean hasCreationTime() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.LoginNotificationInfoOrBuilder
        public boolean hasEmail() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.LoginNotificationInfoOrBuilder
        public boolean hasEventType() {
            return (this.bitField0_ & 16) == 16;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.LoginNotificationInfoOrBuilder
        public boolean hasHost() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.LoginNotificationInfoOrBuilder
        public boolean hasSource() {
            return (this.bitField0_ & 8) == 8;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptorForType().hashCode() + 779;
            if (hasCreationTime()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + Internal.hashLong(getCreationTime());
            }
            if (hasEmail()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getEmail().hashCode();
            }
            if (hasHost()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getHost().hashCode();
            }
            if (hasSource()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + getSource().hashCode();
            }
            if (hasEventType()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getEventType().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SecureGcmProto.internal_static_securegcm_LoginNotificationInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(LoginNotificationInfo.class, Builder.class);
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
                codedOutputStream.writeFixed64(2, this.creationTime_);
            }
            if ((this.bitField0_ & 2) == 2) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.email_);
            }
            if ((this.bitField0_ & 4) == 4) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.host_);
            }
            if ((this.bitField0_ & 8) == 8) {
                GeneratedMessageV3.writeString(codedOutputStream, 5, this.source_);
            }
            if ((this.bitField0_ & 16) == 16) {
                GeneratedMessageV3.writeString(codedOutputStream, 6, this.eventType_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LoginNotificationInfoOrBuilder {
            private int bitField0_;
            private long creationTime_;
            private Object email_;
            private Object eventType_;
            private Object host_;
            private Object source_;

            public static final Descriptors.Descriptor getDescriptor() {
                return SecureGcmProto.internal_static_securegcm_LoginNotificationInfo_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder clearCreationTime() {
                this.bitField0_ &= -2;
                this.creationTime_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearEmail() {
                this.bitField0_ &= -3;
                this.email_ = LoginNotificationInfo.getDefaultInstance().getEmail();
                onChanged();
                return this;
            }

            public Builder clearEventType() {
                this.bitField0_ &= -17;
                this.eventType_ = LoginNotificationInfo.getDefaultInstance().getEventType();
                onChanged();
                return this;
            }

            public Builder clearHost() {
                this.bitField0_ &= -5;
                this.host_ = LoginNotificationInfo.getDefaultInstance().getHost();
                onChanged();
                return this;
            }

            public Builder clearSource() {
                this.bitField0_ &= -9;
                this.source_ = LoginNotificationInfo.getDefaultInstance().getSource();
                onChanged();
                return this;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.LoginNotificationInfoOrBuilder
            public long getCreationTime() {
                return this.creationTime_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SecureGcmProto.internal_static_securegcm_LoginNotificationInfo_descriptor;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.LoginNotificationInfoOrBuilder
            public String getEmail() {
                Object obj = this.email_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.email_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.LoginNotificationInfoOrBuilder
            public ByteString getEmailBytes() {
                Object obj = this.email_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.email_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.LoginNotificationInfoOrBuilder
            public String getEventType() {
                Object obj = this.eventType_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.eventType_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.LoginNotificationInfoOrBuilder
            public ByteString getEventTypeBytes() {
                Object obj = this.eventType_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.eventType_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.LoginNotificationInfoOrBuilder
            public String getHost() {
                Object obj = this.host_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.host_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.LoginNotificationInfoOrBuilder
            public ByteString getHostBytes() {
                Object obj = this.host_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.host_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.LoginNotificationInfoOrBuilder
            public String getSource() {
                Object obj = this.source_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.source_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.LoginNotificationInfoOrBuilder
            public ByteString getSourceBytes() {
                Object obj = this.source_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.source_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.LoginNotificationInfoOrBuilder
            public boolean hasCreationTime() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.LoginNotificationInfoOrBuilder
            public boolean hasEmail() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.LoginNotificationInfoOrBuilder
            public boolean hasEventType() {
                return (this.bitField0_ & 16) == 16;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.LoginNotificationInfoOrBuilder
            public boolean hasHost() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.LoginNotificationInfoOrBuilder
            public boolean hasSource() {
                return (this.bitField0_ & 8) == 8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SecureGcmProto.internal_static_securegcm_LoginNotificationInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(LoginNotificationInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setCreationTime(long j) {
                this.bitField0_ |= 1;
                this.creationTime_ = j;
                onChanged();
                return this;
            }

            public Builder setEmail(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.email_ = str;
                onChanged();
                return this;
            }

            public Builder setEmailBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.email_ = byteString;
                onChanged();
                return this;
            }

            public Builder setEventType(String str) {
                str.getClass();
                this.bitField0_ |= 16;
                this.eventType_ = str;
                onChanged();
                return this;
            }

            public Builder setEventTypeBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 16;
                this.eventType_ = byteString;
                onChanged();
                return this;
            }

            public Builder setHost(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.host_ = str;
                onChanged();
                return this;
            }

            public Builder setHostBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 4;
                this.host_ = byteString;
                onChanged();
                return this;
            }

            public Builder setSource(String str) {
                str.getClass();
                this.bitField0_ |= 8;
                this.source_ = str;
                onChanged();
                return this;
            }

            public Builder setSourceBytes(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 8;
                this.source_ = byteString;
                onChanged();
                return this;
            }

            private Builder() {
                this.email_ = "";
                this.host_ = "";
                this.source_ = "";
                this.eventType_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LoginNotificationInfo build() {
                LoginNotificationInfo loginNotificationInfoBuildPartial = buildPartial();
                if (loginNotificationInfoBuildPartial.isInitialized()) {
                    return loginNotificationInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) loginNotificationInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LoginNotificationInfo buildPartial() {
                LoginNotificationInfo loginNotificationInfo = new LoginNotificationInfo(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                loginNotificationInfo.creationTime_ = this.creationTime_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                loginNotificationInfo.email_ = this.email_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                loginNotificationInfo.host_ = this.host_;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                loginNotificationInfo.source_ = this.source_;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                loginNotificationInfo.eventType_ = this.eventType_;
                loginNotificationInfo.bitField0_ = i2;
                onBuilt();
                return loginNotificationInfo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public LoginNotificationInfo getDefaultInstanceForType() {
                return LoginNotificationInfo.getDefaultInstance();
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
                this.creationTime_ = 0L;
                int i = this.bitField0_ & (-2);
                this.email_ = "";
                this.host_ = "";
                this.source_ = "";
                this.eventType_ = "";
                this.bitField0_ = i & (-3) & (-5) & (-9) & (-17);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            public Builder clone() {
                return (Builder) super.clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LoginNotificationInfo) {
                    return mergeFrom((LoginNotificationInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.email_ = "";
                this.host_ = "";
                this.source_ = "";
                this.eventType_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(LoginNotificationInfo loginNotificationInfo) {
                if (loginNotificationInfo == LoginNotificationInfo.getDefaultInstance()) {
                    return this;
                }
                if (loginNotificationInfo.hasCreationTime()) {
                    setCreationTime(loginNotificationInfo.getCreationTime());
                }
                if (loginNotificationInfo.hasEmail()) {
                    this.bitField0_ |= 2;
                    this.email_ = loginNotificationInfo.email_;
                    onChanged();
                }
                if (loginNotificationInfo.hasHost()) {
                    this.bitField0_ |= 4;
                    this.host_ = loginNotificationInfo.host_;
                    onChanged();
                }
                if (loginNotificationInfo.hasSource()) {
                    this.bitField0_ |= 8;
                    this.source_ = loginNotificationInfo.source_;
                    onChanged();
                }
                if (loginNotificationInfo.hasEventType()) {
                    this.bitField0_ |= 16;
                    this.eventType_ = loginNotificationInfo.eventType_;
                    onChanged();
                }
                mergeUnknownFields(((GeneratedMessageV3) loginNotificationInfo).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                LoginNotificationInfo loginNotificationInfo = null;
                try {
                    try {
                        LoginNotificationInfo partialFrom = LoginNotificationInfo.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        LoginNotificationInfo loginNotificationInfo2 = (LoginNotificationInfo) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            loginNotificationInfo = loginNotificationInfo2;
                            if (loginNotificationInfo != null) {
                                mergeFrom(loginNotificationInfo);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (loginNotificationInfo != null) {
                        mergeFrom(loginNotificationInfo);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(LoginNotificationInfo loginNotificationInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(loginNotificationInfo);
        }

        public static LoginNotificationInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private LoginNotificationInfo(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LoginNotificationInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LoginNotificationInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LoginNotificationInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LoginNotificationInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static LoginNotificationInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private LoginNotificationInfo() {
            this.memoizedIsInitialized = (byte) -1;
            this.creationTime_ = 0L;
            this.email_ = "";
            this.host_ = "";
            this.source_ = "";
            this.eventType_ = "";
        }

        public static LoginNotificationInfo parseFrom(InputStream inputStream) throws IOException {
            return (LoginNotificationInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static LoginNotificationInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LoginNotificationInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LoginNotificationInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (LoginNotificationInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LoginNotificationInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LoginNotificationInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private LoginNotificationInfo(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 17) {
                                this.bitField0_ |= 1;
                                this.creationTime_ = codedInputStream.readFixed64();
                            } else if (tag == 26) {
                                ByteString bytes = codedInputStream.readBytes();
                                this.bitField0_ |= 2;
                                this.email_ = bytes;
                            } else if (tag == 34) {
                                ByteString bytes2 = codedInputStream.readBytes();
                                this.bitField0_ |= 4;
                                this.host_ = bytes2;
                            } else if (tag == 42) {
                                ByteString bytes3 = codedInputStream.readBytes();
                                this.bitField0_ |= 8;
                                this.source_ = bytes3;
                            } else if (tag != 50) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                ByteString bytes4 = codedInputStream.readBytes();
                                this.bitField0_ |= 16;
                                this.eventType_ = bytes4;
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
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
    }

    public interface LoginNotificationInfoOrBuilder extends MessageOrBuilder {
        long getCreationTime();

        String getEmail();

        ByteString getEmailBytes();

        String getEventType();

        ByteString getEventTypeBytes();

        String getHost();

        ByteString getHostBytes();

        String getSource();

        ByteString getSourceBytes();

        boolean hasCreationTime();

        boolean hasEmail();

        boolean hasEventType();

        boolean hasHost();

        boolean hasSource();
    }

    public enum SoftwareFeature implements ProtocolMessageEnum {
        UNKNOWN_FEATURE(0),
        BETTER_TOGETHER_HOST(1),
        BETTER_TOGETHER_CLIENT(2),
        EASY_UNLOCK_HOST(3),
        EASY_UNLOCK_CLIENT(4),
        MAGIC_TETHER_HOST(5),
        MAGIC_TETHER_CLIENT(6),
        SMS_CONNECT_HOST(7),
        SMS_CONNECT_CLIENT(8);

        public static final int BETTER_TOGETHER_CLIENT_VALUE = 2;
        public static final int BETTER_TOGETHER_HOST_VALUE = 1;
        public static final int EASY_UNLOCK_CLIENT_VALUE = 4;
        public static final int EASY_UNLOCK_HOST_VALUE = 3;
        public static final int MAGIC_TETHER_CLIENT_VALUE = 6;
        public static final int MAGIC_TETHER_HOST_VALUE = 5;
        public static final int SMS_CONNECT_CLIENT_VALUE = 8;
        public static final int SMS_CONNECT_HOST_VALUE = 7;
        public static final int UNKNOWN_FEATURE_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<SoftwareFeature> internalValueMap = new Internal.EnumLiteMap<SoftwareFeature>() { // from class: com.google.security.cryptauth.lib.securegcm.SecureGcmProto.SoftwareFeature.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SoftwareFeature findValueByNumber(int i) {
                return SoftwareFeature.forNumber(i);
            }
        };
        private static final SoftwareFeature[] VALUES = values();

        SoftwareFeature(int i) {
            this.value = i;
        }

        public static SoftwareFeature forNumber(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_FEATURE;
                case 1:
                    return BETTER_TOGETHER_HOST;
                case 2:
                    return BETTER_TOGETHER_CLIENT;
                case 3:
                    return EASY_UNLOCK_HOST;
                case 4:
                    return EASY_UNLOCK_CLIENT;
                case 5:
                    return MAGIC_TETHER_HOST;
                case 6:
                    return MAGIC_TETHER_CLIENT;
                case 7:
                    return SMS_CONNECT_HOST;
                case 8:
                    return SMS_CONNECT_CLIENT;
                default:
                    return null;
            }
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return SecureGcmProto.getDescriptor().getEnumTypes().get(2);
        }

        public static Internal.EnumLiteMap<SoftwareFeature> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            return getDescriptor().getValues().get(ordinal());
        }

        @Deprecated
        public static SoftwareFeature valueOf(int i) {
            return forNumber(i);
        }

        public static SoftwareFeature valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class Tickle extends GeneratedMessageV3 implements TickleOrBuilder {
        public static final int EXPIRY_TIME_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long expiryTime_;
        private byte memoizedIsInitialized;
        private static final Tickle DEFAULT_INSTANCE = new Tickle();

        @Deprecated
        public static final Parser<Tickle> PARSER = new AbstractParser<Tickle>() { // from class: com.google.security.cryptauth.lib.securegcm.SecureGcmProto.Tickle.1
            @Override // com.google.protobuf.Parser
            public Tickle parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Tickle(codedInputStream, extensionRegistryLite);
            }
        };

        public static Tickle getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SecureGcmProto.internal_static_securegcm_Tickle_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Tickle parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Tickle) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Tickle parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<Tickle> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Tickle)) {
                return super.equals(obj);
            }
            Tickle tickle = (Tickle) obj;
            boolean z = hasExpiryTime() == tickle.hasExpiryTime();
            if (hasExpiryTime()) {
                z = z && getExpiryTime() == tickle.getExpiryTime();
            }
            return z && this.unknownFields.equals(tickle.unknownFields);
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.TickleOrBuilder
        public long getExpiryTime() {
            return this.expiryTime_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Tickle> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeFixed64Size = ((this.bitField0_ & 1) == 1 ? 0 + CodedOutputStream.computeFixed64Size(1, this.expiryTime_) : 0) + this.unknownFields.getSerializedSize();
            this.memoizedSize = iComputeFixed64Size;
            return iComputeFixed64Size;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.TickleOrBuilder
        public boolean hasExpiryTime() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptorForType().hashCode() + 779;
            if (hasExpiryTime()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + Internal.hashLong(getExpiryTime());
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SecureGcmProto.internal_static_securegcm_Tickle_fieldAccessorTable.ensureFieldAccessorsInitialized(Tickle.class, Builder.class);
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
                codedOutputStream.writeFixed64(1, this.expiryTime_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TickleOrBuilder {
            private int bitField0_;
            private long expiryTime_;

            public static final Descriptors.Descriptor getDescriptor() {
                return SecureGcmProto.internal_static_securegcm_Tickle_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder clearExpiryTime() {
                this.bitField0_ &= -2;
                this.expiryTime_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SecureGcmProto.internal_static_securegcm_Tickle_descriptor;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.TickleOrBuilder
            public long getExpiryTime() {
                return this.expiryTime_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.SecureGcmProto.TickleOrBuilder
            public boolean hasExpiryTime() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SecureGcmProto.internal_static_securegcm_Tickle_fieldAccessorTable.ensureFieldAccessorsInitialized(Tickle.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setExpiryTime(long j) {
                this.bitField0_ |= 1;
                this.expiryTime_ = j;
                onChanged();
                return this;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Tickle build() {
                Tickle tickleBuildPartial = buildPartial();
                if (tickleBuildPartial.isInitialized()) {
                    return tickleBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) tickleBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Tickle buildPartial() {
                Tickle tickle = new Tickle(this);
                int i = (this.bitField0_ & 1) != 1 ? 0 : 1;
                tickle.expiryTime_ = this.expiryTime_;
                tickle.bitField0_ = i;
                onBuilt();
                return tickle;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Tickle getDefaultInstanceForType() {
                return Tickle.getDefaultInstance();
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
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.expiryTime_ = 0L;
                this.bitField0_ &= -2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            public Builder clone() {
                return (Builder) super.clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Tickle) {
                    return mergeFrom((Tickle) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Tickle tickle) {
                if (tickle == Tickle.getDefaultInstance()) {
                    return this;
                }
                if (tickle.hasExpiryTime()) {
                    setExpiryTime(tickle.getExpiryTime());
                }
                mergeUnknownFields(((GeneratedMessageV3) tickle).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Tickle tickle = null;
                try {
                    try {
                        Tickle partialFrom = Tickle.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        Tickle tickle2 = (Tickle) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            tickle = tickle2;
                            if (tickle != null) {
                                mergeFrom(tickle);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (tickle != null) {
                        mergeFrom(tickle);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(Tickle tickle) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(tickle);
        }

        public static Tickle parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private Tickle(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Tickle parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Tickle) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Tickle parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Tickle getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Tickle parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Tickle() {
            this.memoizedIsInitialized = (byte) -1;
            this.expiryTime_ = 0L;
        }

        public static Tickle parseFrom(InputStream inputStream) throws IOException {
            return (Tickle) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Tickle parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Tickle) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private Tickle(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag != 9) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.bitField0_ |= 1;
                                this.expiryTime_ = codedInputStream.readFixed64();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
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

        public static Tickle parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Tickle) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Tickle parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Tickle) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface TickleOrBuilder extends MessageOrBuilder {
        long getExpiryTime();

        boolean hasExpiryTime();
    }

    public enum Type implements ProtocolMessageEnum {
        ENROLLMENT(0),
        TICKLE(1),
        TX_REQUEST(2),
        TX_REPLY(3),
        TX_SYNC_REQUEST(4),
        TX_SYNC_RESPONSE(5),
        TX_PING(6),
        DEVICE_INFO_UPDATE(7),
        TX_CANCEL_REQUEST(8),
        PROXIMITYAUTH_PAIRING(10),
        GCMV1_IDENTITY_ASSERTION(11),
        DEVICE_TO_DEVICE_RESPONDER_HELLO_PAYLOAD(12),
        DEVICE_TO_DEVICE_MESSAGE(13),
        DEVICE_PROXIMITY_CALLBACK(14),
        UNLOCK_KEY_SIGNED_CHALLENGE(15),
        LOGIN_NOTIFICATION(101);

        public static final int DEVICE_INFO_UPDATE_VALUE = 7;
        public static final int DEVICE_PROXIMITY_CALLBACK_VALUE = 14;
        public static final int DEVICE_TO_DEVICE_MESSAGE_VALUE = 13;
        public static final int DEVICE_TO_DEVICE_RESPONDER_HELLO_PAYLOAD_VALUE = 12;
        public static final int ENROLLMENT_VALUE = 0;
        public static final int GCMV1_IDENTITY_ASSERTION_VALUE = 11;
        public static final int LOGIN_NOTIFICATION_VALUE = 101;
        public static final int PROXIMITYAUTH_PAIRING_VALUE = 10;
        public static final int TICKLE_VALUE = 1;
        public static final int TX_CANCEL_REQUEST_VALUE = 8;
        public static final int TX_PING_VALUE = 6;
        public static final int TX_REPLY_VALUE = 3;
        public static final int TX_REQUEST_VALUE = 2;
        public static final int TX_SYNC_REQUEST_VALUE = 4;
        public static final int TX_SYNC_RESPONSE_VALUE = 5;
        public static final int UNLOCK_KEY_SIGNED_CHALLENGE_VALUE = 15;
        private final int value;
        private static final Internal.EnumLiteMap<Type> internalValueMap = new Internal.EnumLiteMap<Type>() { // from class: com.google.security.cryptauth.lib.securegcm.SecureGcmProto.Type.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public Type findValueByNumber(int i) {
                return Type.forNumber(i);
            }
        };
        private static final Type[] VALUES = values();

        Type(int i) {
            this.value = i;
        }

        public static Type forNumber(int i) {
            if (i == 101) {
                return LOGIN_NOTIFICATION;
            }
            switch (i) {
                case 0:
                    return ENROLLMENT;
                case 1:
                    return TICKLE;
                case 2:
                    return TX_REQUEST;
                case 3:
                    return TX_REPLY;
                case 4:
                    return TX_SYNC_REQUEST;
                case 5:
                    return TX_SYNC_RESPONSE;
                case 6:
                    return TX_PING;
                case 7:
                    return DEVICE_INFO_UPDATE;
                case 8:
                    return TX_CANCEL_REQUEST;
                default:
                    switch (i) {
                        case 10:
                            return PROXIMITYAUTH_PAIRING;
                        case 11:
                            return GCMV1_IDENTITY_ASSERTION;
                        case 12:
                            return DEVICE_TO_DEVICE_RESPONDER_HELLO_PAYLOAD;
                        case 13:
                            return DEVICE_TO_DEVICE_MESSAGE;
                        case 14:
                            return DEVICE_PROXIMITY_CALLBACK;
                        case 15:
                            return UNLOCK_KEY_SIGNED_CHALLENGE;
                        default:
                            return null;
                    }
            }
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return SecureGcmProto.getDescriptor().getEnumTypes().get(4);
        }

        public static Internal.EnumLiteMap<Type> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            return getDescriptor().getValues().get(ordinal());
        }

        @Deprecated
        public static Type valueOf(int i) {
            return forNumber(i);
        }

        public static Type valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    static {
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u000fsecuregcm.proto\u0012\tsecuregcm\"¯\n\n\rGcmDeviceInfo\u0012\u0019\n\u0011android_device_id\u0018\u0001 \u0001(\u0006\u0012\u001b\n\u0013gcm_registration_id\u0018f \u0001(\f\u0012\u001c\n\u0013apn_registration_id\u0018Ê\u0001 \u0001(\f\u0012#\n\u0014notification_enabled\u0018Ë\u0001 \u0001(\b:\u0004true\u0012\u001e\n\u0015bluetooth_mac_address\u0018®\u0002 \u0001(\t\u0012\u001e\n\u0016device_master_key_hash\u0018g \u0001(\f\u0012\u0017\n\u000fuser_public_key\u0018\u0004 \u0002(\f\u0012\u0014\n\fdevice_model\u0018\u0007 \u0001(\t\u0012\u000e\n\u0006locale\u0018\b \u0001(\t\u0012\u0012\n\nkey_handle\u0018\t \u0001(\f\u0012\u0012\n\u0007counter\u0018\f \u0001(\u0003:\u00010\u0012\u0019\n\u0011device_os_version\u0018\r \u0001(\t\u0012\u001e\n\u0016device_os_version_code\u0018\u000e \u0001(\u0003\u0012\u0019\n\u0011d", "evice_os_release\u0018\u000f \u0001(\t\u0012\u001a\n\u0012device_os_codename\u0018\u0010 \u0001(\t\u0012\u001f\n\u0017device_software_version\u0018\u0011 \u0001(\t\u0012$\n\u001cdevice_software_version_code\u0018\u0012 \u0001(\u0003\u0012\u001f\n\u0017device_software_package\u0018\u0013 \u0001(\t\u0012$\n\u001cdevice_display_diagonal_mils\u0018\u0016 \u0001(\u0005\u0012\u001e\n\u0016device_authzen_version\u0018\u0018 \u0001(\u0005\u0012\u0016\n\u000elong_device_id\u0018\u001d \u0001(\f\u0012\u001b\n\u0013device_manufacturer\u0018\u001f \u0001(\t\u00123\n\u000bdevice_type\u0018  \u0001(\u000e2\u0015.securegcm.DeviceType:\u0007ANDROID\u0012'\n\u0017using_secure_screenlock\u0018\u0090\u0003 \u0001(\b:\u0005false\u00120\n auto_unlock_screenlock_su", "pported\u0018\u0091\u0003 \u0001(\b:\u0005false\u0012.\n\u001eauto_unlock_screenlock_enabled\u0018\u0092\u0003 \u0001(\b:\u0005false\u0012)\n\u0019bluetooth_radio_supported\u0018\u0093\u0003 \u0001(\b:\u0005false\u0012'\n\u0017bluetooth_radio_enabled\u0018\u0094\u0003 \u0001(\b:\u0005false\u0012%\n\u0015mobile_data_supported\u0018\u0095\u0003 \u0001(\b:\u0005false\u0012#\n\u0013tethering_supported\u0018\u0096\u0003 \u0001(\b:\u0005false\u0012#\n\u0013ble_radio_supported\u0018\u0097\u0003 \u0001(\b:\u0005false\u0012 \n\u0010pixel_experience\u0018\u0098\u0003 \u0001(\b:\u0005false\u0012\u001d\n\rarc_plus_plus\u0018\u0099\u0003 \u0001(\b:\u0005false\u0012)\n\u0019is_screenlock_state_flaky\u0018\u009a\u0003 \u0001(\b:\u0005false\u0012@\n\u001bsupported_software_fea", "tures\u0018\u009b\u0003 \u0003(\u000e2\u001a.securegcm.SoftwareFeature\u0012>\n\u0019enabled_software_features\u0018\u009c\u0003 \u0003(\u000e2\u001a.securegcm.SoftwareFeature\u0012\u001e\n\u0015enrollment_session_id\u0018è\u0007 \u0001(\f\u0012\u0014\n\u000boauth_token\u0018é\u0007 \u0001(\t\"@\n\u000bGcmMetadata\u0012\u001d\n\u0004type\u0018\u0001 \u0002(\u000e2\u000f.securegcm.Type\u0012\u0012\n\u0007version\u0018\u0002 \u0001(\u0005:\u00010\"\u001d\n\u0006Tickle\u0012\u0013\n\u000bexpiry_time\u0018\u0001 \u0001(\u0006\"o\n\u0015LoginNotificationInfo\u0012\u0015\n\rcreation_time\u0018\u0002 \u0001(\u0006\u0012\r\n\u0005email\u0018\u0003 \u0001(\t\u0012\f\n\u0004host\u0018\u0004 \u0001(\t\u0012\u000e\n\u0006source\u0018\u0005 \u0001(\t\u0012\u0012\n\nevent_type\u0018\u0006 \u0001(\t*;\n\u0017AppleDeviceDiagonalMils\u0012\u0010\n\u000bA", "PPLE_PHONE\u0010 \u001f\u0012\u000e\n\tAPPLE_PAD\u0010Ü=*Q\n\nDeviceType\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u000b\n\u0007ANDROID\u0010\u0001\u0012\n\n\u0006CHROME\u0010\u0002\u0012\u0007\n\u0003IOS\u0010\u0003\u0012\u000b\n\u0007BROWSER\u0010\u0004\u0012\u0007\n\u0003OSX\u0010\u0005*è\u0001\n\u000fSoftwareFeature\u0012\u0013\n\u000fUNKNOWN_FEATURE\u0010\u0000\u0012\u0018\n\u0014BETTER_TOGETHER_HOST\u0010\u0001\u0012\u001a\n\u0016BETTER_TOGETHER_CLIENT\u0010\u0002\u0012\u0014\n\u0010EASY_UNLOCK_HOST\u0010\u0003\u0012\u0016\n\u0012EASY_UNLOCK_CLIENT\u0010\u0004\u0012\u0015\n\u0011MAGIC_TETHER_HOST\u0010\u0005\u0012\u0017\n\u0013MAGIC_TETHER_CLIENT\u0010\u0006\u0012\u0014\n\u0010SMS_CONNECT_HOST\u0010\u0007\u0012\u0016\n\u0012SMS_CONNECT_CLIENT\u0010\b*¸\u0003\n\u0010InvocationReason\u0012\u0012\n\u000eREASON_UNKNOWN\u0010\u0000\u0012\u0019\n\u0015REASON_I", "NITIALIZATION\u0010\u0001\u0012\u0013\n\u000fREASON_PERIODIC\u0010\u0002\u0012\u0018\n\u0014REASON_SLOW_PERIODIC\u0010\u0003\u0012\u0018\n\u0014REASON_FAST_PERIODIC\u0010\u0004\u0012\u0015\n\u0011REASON_EXPIRATION\u0010\u0005\u0012\u001b\n\u0017REASON_FAILURE_RECOVERY\u0010\u0006\u0012\u0016\n\u0012REASON_NEW_ACCOUNT\u0010\u0007\u0012\u001a\n\u0016REASON_CHANGED_ACCOUNT\u0010\b\u0012\u001a\n\u0016REASON_FEATURE_TOGGLED\u0010\t\u0012\u001b\n\u0017REASON_SERVER_INITIATED\u0010\n\u0012\u0019\n\u0015REASON_ADDRESS_CHANGE\u0010\u000b\u0012\u001a\n\u0016REASON_SOFTWARE_UPDATE\u0010\f\u0012\u0011\n\rREASON_MANUAL\u0010\r\u0012\"\n\u001eREASON_CUSTOM_KEY_INVALIDATION\u0010\u000e\u0012\u001d\n\u0019REASON_PROXIMITY_PERIODIC\u0010\u000f*\u0084\u0003\n\u0004Type\u0012", "\u000e\n\nENROLLMENT\u0010\u0000\u0012\n\n\u0006TICKLE\u0010\u0001\u0012\u000e\n\nTX_REQUEST\u0010\u0002\u0012\f\n\bTX_REPLY\u0010\u0003\u0012\u0013\n\u000fTX_SYNC_REQUEST\u0010\u0004\u0012\u0014\n\u0010TX_SYNC_RESPONSE\u0010\u0005\u0012\u000b\n\u0007TX_PING\u0010\u0006\u0012\u0016\n\u0012DEVICE_INFO_UPDATE\u0010\u0007\u0012\u0015\n\u0011TX_CANCEL_REQUEST\u0010\b\u0012\u0019\n\u0015PROXIMITYAUTH_PAIRING\u0010\n\u0012\u001c\n\u0018GCMV1_IDENTITY_ASSERTION\u0010\u000b\u0012,\n(DEVICE_TO_DEVICE_RESPONDER_HELLO_PAYLOAD\u0010\f\u0012\u001c\n\u0018DEVICE_TO_DEVICE_MESSAGE\u0010\r\u0012\u001d\n\u0019DEVICE_PROXIMITY_CALLBACK\u0010\u000e\u0012\u001f\n\u001bUNLOCK_KEY_SIGNED_CHALLENGE\u0010\u000f\u0012\u0016\n\u0012LOGIN_NOTIFICATION\u0010eBD\n+com.google.secu", "rity.cryptauth.lib.securegcmB\u000eSecureGcmProto¢\u0002\u0004SGCM"}, new Descriptors.FileDescriptor[0], new Descriptors.FileDescriptor.InternalDescriptorAssigner() { // from class: com.google.security.cryptauth.lib.securegcm.SecureGcmProto.1
            @Override // com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner
            public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor fileDescriptor) {
                Descriptors.FileDescriptor unused = SecureGcmProto.descriptor = fileDescriptor;
                return null;
            }
        });
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_securegcm_GcmDeviceInfo_descriptor = descriptor2;
        internal_static_securegcm_GcmDeviceInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"AndroidDeviceId", "GcmRegistrationId", "ApnRegistrationId", "NotificationEnabled", "BluetoothMacAddress", "DeviceMasterKeyHash", "UserPublicKey", "DeviceModel", "Locale", "KeyHandle", "Counter", "DeviceOsVersion", "DeviceOsVersionCode", "DeviceOsRelease", "DeviceOsCodename", "DeviceSoftwareVersion", "DeviceSoftwareVersionCode", "DeviceSoftwarePackage", "DeviceDisplayDiagonalMils", "DeviceAuthzenVersion", "LongDeviceId", "DeviceManufacturer", "DeviceType", "UsingSecureScreenlock", "AutoUnlockScreenlockSupported", "AutoUnlockScreenlockEnabled", "BluetoothRadioSupported", "BluetoothRadioEnabled", "MobileDataSupported", "TetheringSupported", "BleRadioSupported", "PixelExperience", "ArcPlusPlus", "IsScreenlockStateFlaky", "SupportedSoftwareFeatures", "EnabledSoftwareFeatures", "EnrollmentSessionId", "OauthToken"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_securegcm_GcmMetadata_descriptor = descriptor3;
        internal_static_securegcm_GcmMetadata_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Type", "Version"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_securegcm_Tickle_descriptor = descriptor4;
        internal_static_securegcm_Tickle_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"ExpiryTime"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_securegcm_LoginNotificationInfo_descriptor = descriptor5;
        internal_static_securegcm_LoginNotificationInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"CreationTime", "Email", "Host", "Source", "EventType"});
    }

    private SecureGcmProto() {
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
