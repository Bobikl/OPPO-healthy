package com.heytap.health.protocol;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.dfe;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class PermissionProto$Permission extends GeneratedMessageLite<PermissionProto$Permission, Builder> implements PermissionProto$PermissionOrBuilder {
    private static final PermissionProto$Permission DEFAULT_INSTANCE;
    public static final int FEATURES_FIELD_NUMBER = 1;
    private static volatile Parser<PermissionProto$Permission> PARSER;
    private Internal.ProtobufList<FeatureItem> features_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<PermissionProto$Permission, Builder> implements PermissionProto$PermissionOrBuilder {
        public Builder addAllFeatures(Iterable<? extends FeatureItem> iterable) {
            copyOnWrite();
            ((PermissionProto$Permission) this.instance).addAllFeatures(iterable);
            return this;
        }

        public Builder addFeatures(FeatureItem featureItem) {
            copyOnWrite();
            ((PermissionProto$Permission) this.instance).addFeatures(featureItem);
            return this;
        }

        public Builder clearFeatures() {
            copyOnWrite();
            ((PermissionProto$Permission) this.instance).clearFeatures();
            return this;
        }

        @Override // com.heytap.health.protocol.PermissionProto$PermissionOrBuilder
        public FeatureItem getFeatures(int i) {
            return ((PermissionProto$Permission) this.instance).getFeatures(i);
        }

        @Override // com.heytap.health.protocol.PermissionProto$PermissionOrBuilder
        public int getFeaturesCount() {
            return ((PermissionProto$Permission) this.instance).getFeaturesCount();
        }

        @Override // com.heytap.health.protocol.PermissionProto$PermissionOrBuilder
        public List<FeatureItem> getFeaturesList() {
            return Collections.unmodifiableList(((PermissionProto$Permission) this.instance).getFeaturesList());
        }

        public Builder removeFeatures(int i) {
            copyOnWrite();
            ((PermissionProto$Permission) this.instance).removeFeatures(i);
            return this;
        }

        public Builder setFeatures(int i, FeatureItem featureItem) {
            copyOnWrite();
            ((PermissionProto$Permission) this.instance).setFeatures(i, featureItem);
            return this;
        }

        private Builder() {
            super(PermissionProto$Permission.DEFAULT_INSTANCE);
        }

        public Builder addFeatures(int i, FeatureItem featureItem) {
            copyOnWrite();
            ((PermissionProto$Permission) this.instance).addFeatures(i, featureItem);
            return this;
        }

        public Builder setFeatures(int i, FeatureItem.Builder builder) {
            copyOnWrite();
            ((PermissionProto$Permission) this.instance).setFeatures(i, builder.build());
            return this;
        }

        public Builder addFeatures(FeatureItem.Builder builder) {
            copyOnWrite();
            ((PermissionProto$Permission) this.instance).addFeatures(builder.build());
            return this;
        }

        public Builder addFeatures(int i, FeatureItem.Builder builder) {
            copyOnWrite();
            ((PermissionProto$Permission) this.instance).addFeatures(i, builder.build());
            return this;
        }
    }

    public static final class FeatureItem extends GeneratedMessageLite<FeatureItem, Builder> implements FeatureItemOrBuilder {
        private static final FeatureItem DEFAULT_INSTANCE;
        public static final int FEATURETYPE_FIELD_NUMBER = 1;
        private static volatile Parser<FeatureItem> PARSER = null;
        public static final int PERMISSIONS_FIELD_NUMBER = 2;
        private int featureType_;
        private Internal.ProtobufList<PermissionItem> permissions_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.Builder<FeatureItem, Builder> implements FeatureItemOrBuilder {
            public Builder addAllPermissions(Iterable<? extends PermissionItem> iterable) {
                copyOnWrite();
                ((FeatureItem) this.instance).addAllPermissions(iterable);
                return this;
            }

            public Builder addPermissions(PermissionItem permissionItem) {
                copyOnWrite();
                ((FeatureItem) this.instance).addPermissions(permissionItem);
                return this;
            }

            public Builder clearFeatureType() {
                copyOnWrite();
                ((FeatureItem) this.instance).clearFeatureType();
                return this;
            }

            public Builder clearPermissions() {
                copyOnWrite();
                ((FeatureItem) this.instance).clearPermissions();
                return this;
            }

            @Override // com.heytap.health.protocol.PermissionProto$Permission.FeatureItemOrBuilder
            public FeaturesType getFeatureType() {
                return ((FeatureItem) this.instance).getFeatureType();
            }

            @Override // com.heytap.health.protocol.PermissionProto$Permission.FeatureItemOrBuilder
            public int getFeatureTypeValue() {
                return ((FeatureItem) this.instance).getFeatureTypeValue();
            }

            @Override // com.heytap.health.protocol.PermissionProto$Permission.FeatureItemOrBuilder
            public PermissionItem getPermissions(int i) {
                return ((FeatureItem) this.instance).getPermissions(i);
            }

            @Override // com.heytap.health.protocol.PermissionProto$Permission.FeatureItemOrBuilder
            public int getPermissionsCount() {
                return ((FeatureItem) this.instance).getPermissionsCount();
            }

            @Override // com.heytap.health.protocol.PermissionProto$Permission.FeatureItemOrBuilder
            public List<PermissionItem> getPermissionsList() {
                return Collections.unmodifiableList(((FeatureItem) this.instance).getPermissionsList());
            }

            public Builder removePermissions(int i) {
                copyOnWrite();
                ((FeatureItem) this.instance).removePermissions(i);
                return this;
            }

            public Builder setFeatureType(FeaturesType featuresType) {
                copyOnWrite();
                ((FeatureItem) this.instance).setFeatureType(featuresType);
                return this;
            }

            public Builder setFeatureTypeValue(int i) {
                copyOnWrite();
                ((FeatureItem) this.instance).setFeatureTypeValue(i);
                return this;
            }

            public Builder setPermissions(int i, PermissionItem permissionItem) {
                copyOnWrite();
                ((FeatureItem) this.instance).setPermissions(i, permissionItem);
                return this;
            }

            private Builder() {
                super(FeatureItem.DEFAULT_INSTANCE);
            }

            public Builder addPermissions(int i, PermissionItem permissionItem) {
                copyOnWrite();
                ((FeatureItem) this.instance).addPermissions(i, permissionItem);
                return this;
            }

            public Builder setPermissions(int i, PermissionItem.Builder builder) {
                copyOnWrite();
                ((FeatureItem) this.instance).setPermissions(i, builder.build());
                return this;
            }

            public Builder addPermissions(PermissionItem.Builder builder) {
                copyOnWrite();
                ((FeatureItem) this.instance).addPermissions(builder.build());
                return this;
            }

            public Builder addPermissions(int i, PermissionItem.Builder builder) {
                copyOnWrite();
                ((FeatureItem) this.instance).addPermissions(i, builder.build());
                return this;
            }
        }

        static {
            FeatureItem featureItem = new FeatureItem();
            DEFAULT_INSTANCE = featureItem;
            GeneratedMessageLite.registerDefaultInstance(FeatureItem.class, featureItem);
        }

        private FeatureItem() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllPermissions(Iterable<? extends PermissionItem> iterable) {
            ensurePermissionsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.permissions_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPermissions(PermissionItem permissionItem) {
            permissionItem.getClass();
            ensurePermissionsIsMutable();
            this.permissions_.add(permissionItem);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFeatureType() {
            this.featureType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPermissions() {
            this.permissions_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensurePermissionsIsMutable() {
            Internal.ProtobufList<PermissionItem> protobufList = this.permissions_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.permissions_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static FeatureItem getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static FeatureItem parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FeatureItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FeatureItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (FeatureItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<FeatureItem> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removePermissions(int i) {
            ensurePermissionsIsMutable();
            this.permissions_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFeatureType(FeaturesType featuresType) {
            this.featureType_ = featuresType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFeatureTypeValue(int i) {
            this.featureType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPermissions(int i, PermissionItem permissionItem) {
            permissionItem.getClass();
            ensurePermissionsIsMutable();
            this.permissions_.set(i, permissionItem);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = dfe.a[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new FeatureItem();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"featureType_", "permissions_", PermissionItem.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<FeatureItem> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (FeatureItem.class) {
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

        @Override // com.heytap.health.protocol.PermissionProto$Permission.FeatureItemOrBuilder
        public FeaturesType getFeatureType() {
            FeaturesType featuresTypeForNumber = FeaturesType.forNumber(this.featureType_);
            return featuresTypeForNumber == null ? FeaturesType.UNRECOGNIZED : featuresTypeForNumber;
        }

        @Override // com.heytap.health.protocol.PermissionProto$Permission.FeatureItemOrBuilder
        public int getFeatureTypeValue() {
            return this.featureType_;
        }

        @Override // com.heytap.health.protocol.PermissionProto$Permission.FeatureItemOrBuilder
        public PermissionItem getPermissions(int i) {
            return this.permissions_.get(i);
        }

        @Override // com.heytap.health.protocol.PermissionProto$Permission.FeatureItemOrBuilder
        public int getPermissionsCount() {
            return this.permissions_.size();
        }

        @Override // com.heytap.health.protocol.PermissionProto$Permission.FeatureItemOrBuilder
        public List<PermissionItem> getPermissionsList() {
            return this.permissions_;
        }

        public PermissionItemOrBuilder getPermissionsOrBuilder(int i) {
            return this.permissions_.get(i);
        }

        public List<? extends PermissionItemOrBuilder> getPermissionsOrBuilderList() {
            return this.permissions_;
        }

        public static Builder newBuilder(FeatureItem featureItem) {
            return DEFAULT_INSTANCE.createBuilder(featureItem);
        }

        public static FeatureItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FeatureItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FeatureItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FeatureItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static FeatureItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FeatureItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPermissions(int i, PermissionItem permissionItem) {
            permissionItem.getClass();
            ensurePermissionsIsMutable();
            this.permissions_.add(i, permissionItem);
        }

        public static FeatureItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FeatureItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static FeatureItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (FeatureItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FeatureItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FeatureItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static FeatureItem parseFrom(InputStream inputStream) throws IOException {
            return (FeatureItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FeatureItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FeatureItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static FeatureItem parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (FeatureItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static FeatureItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FeatureItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface FeatureItemOrBuilder extends MessageLiteOrBuilder {
        FeaturesType getFeatureType();

        int getFeatureTypeValue();

        PermissionItem getPermissions(int i);

        int getPermissionsCount();

        List<PermissionItem> getPermissionsList();
    }

    public enum FeaturesType implements Internal.EnumLite {
        PIC_SHARE(0),
        STEP_RANKING(1),
        SLEEP_SERVICE(2),
        FAMILY_HEALTH(3),
        RUN(4),
        WATCH_FACE(5),
        APP_CACHE(6),
        DEVICE_PAIR(7),
        DEVICE_CALL(8),
        E_SIM(9),
        DEVICE_SCHEDULE(10),
        WATCH_SOS_CALL(11),
        DEVICE_A_GPS(12),
        MUSIC_MANAGEMENT(13),
        QUERY_DEVICE(14),
        WALLET_DEVICE_WALLET(17),
        COMMUNITY(18),
        HEALTH_ARCHIVES(19),
        HEALTH_AI_AGENT(20),
        DOCTOR(21),
        OAF_WIFI_P2P(22),
        UNRECOGNIZED(-1);

        public static final int APP_CACHE_VALUE = 6;
        public static final int COMMUNITY_VALUE = 18;
        public static final int DEVICE_A_GPS_VALUE = 12;
        public static final int DEVICE_CALL_VALUE = 8;
        public static final int DEVICE_PAIR_VALUE = 7;
        public static final int DEVICE_SCHEDULE_VALUE = 10;
        public static final int DOCTOR_VALUE = 21;
        public static final int E_SIM_VALUE = 9;
        public static final int FAMILY_HEALTH_VALUE = 3;
        public static final int HEALTH_AI_AGENT_VALUE = 20;
        public static final int HEALTH_ARCHIVES_VALUE = 19;
        public static final int MUSIC_MANAGEMENT_VALUE = 13;
        public static final int OAF_WIFI_P2P_VALUE = 22;
        public static final int PIC_SHARE_VALUE = 0;
        public static final int QUERY_DEVICE_VALUE = 14;
        public static final int RUN_VALUE = 4;
        public static final int SLEEP_SERVICE_VALUE = 2;
        public static final int STEP_RANKING_VALUE = 1;
        public static final int WALLET_DEVICE_WALLET_VALUE = 17;
        public static final int WATCH_FACE_VALUE = 5;
        public static final int WATCH_SOS_CALL_VALUE = 11;
        private static final Internal.EnumLiteMap<FeaturesType> internalValueMap = new a();
        private final int value;

        public class a implements Internal.EnumLiteMap<FeaturesType> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public FeaturesType findValueByNumber(int i) {
                return FeaturesType.forNumber(i);
            }
        }

        public static final class b implements Internal.EnumVerifier {
            public static final Internal.EnumVerifier a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return FeaturesType.forNumber(i) != null;
            }
        }

        FeaturesType(int i) {
            this.value = i;
        }

        public static FeaturesType forNumber(int i) {
            switch (i) {
                case 0:
                    return PIC_SHARE;
                case 1:
                    return STEP_RANKING;
                case 2:
                    return SLEEP_SERVICE;
                case 3:
                    return FAMILY_HEALTH;
                case 4:
                    return RUN;
                case 5:
                    return WATCH_FACE;
                case 6:
                    return APP_CACHE;
                case 7:
                    return DEVICE_PAIR;
                case 8:
                    return DEVICE_CALL;
                case 9:
                    return E_SIM;
                case 10:
                    return DEVICE_SCHEDULE;
                case 11:
                    return WATCH_SOS_CALL;
                case 12:
                    return DEVICE_A_GPS;
                case 13:
                    return MUSIC_MANAGEMENT;
                case 14:
                    return QUERY_DEVICE;
                case 15:
                case 16:
                default:
                    return null;
                case 17:
                    return WALLET_DEVICE_WALLET;
                case 18:
                    return COMMUNITY;
                case 19:
                    return HEALTH_ARCHIVES;
                case 20:
                    return HEALTH_AI_AGENT;
                case 21:
                    return DOCTOR;
                case 22:
                    return OAF_WIFI_P2P;
            }
        }

        public static Internal.EnumLiteMap<FeaturesType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static FeaturesType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class PermissionItem extends GeneratedMessageLite<PermissionItem, Builder> implements PermissionItemOrBuilder {
        private static final PermissionItem DEFAULT_INSTANCE;
        private static volatile Parser<PermissionItem> PARSER = null;
        public static final int PERMISSION_FIELD_NUMBER = 1;
        public static final int STATUS_FIELD_NUMBER = 2;
        private int permission_;
        private boolean status_;

        public static final class Builder extends GeneratedMessageLite.Builder<PermissionItem, Builder> implements PermissionItemOrBuilder {
            public Builder clearPermission() {
                copyOnWrite();
                ((PermissionItem) this.instance).clearPermission();
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((PermissionItem) this.instance).clearStatus();
                return this;
            }

            @Override // com.heytap.health.protocol.PermissionProto$Permission.PermissionItemOrBuilder
            public PermissionsType getPermission() {
                return ((PermissionItem) this.instance).getPermission();
            }

            @Override // com.heytap.health.protocol.PermissionProto$Permission.PermissionItemOrBuilder
            public int getPermissionValue() {
                return ((PermissionItem) this.instance).getPermissionValue();
            }

            @Override // com.heytap.health.protocol.PermissionProto$Permission.PermissionItemOrBuilder
            public boolean getStatus() {
                return ((PermissionItem) this.instance).getStatus();
            }

            public Builder setPermission(PermissionsType permissionsType) {
                copyOnWrite();
                ((PermissionItem) this.instance).setPermission(permissionsType);
                return this;
            }

            public Builder setPermissionValue(int i) {
                copyOnWrite();
                ((PermissionItem) this.instance).setPermissionValue(i);
                return this;
            }

            public Builder setStatus(boolean z) {
                copyOnWrite();
                ((PermissionItem) this.instance).setStatus(z);
                return this;
            }

            private Builder() {
                super(PermissionItem.DEFAULT_INSTANCE);
            }
        }

        static {
            PermissionItem permissionItem = new PermissionItem();
            DEFAULT_INSTANCE = permissionItem;
            GeneratedMessageLite.registerDefaultInstance(PermissionItem.class, permissionItem);
        }

        private PermissionItem() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPermission() {
            this.permission_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatus() {
            this.status_ = false;
        }

        public static PermissionItem getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static PermissionItem parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PermissionItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PermissionItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (PermissionItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<PermissionItem> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPermission(PermissionsType permissionsType) {
            this.permission_ = permissionsType.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPermissionValue(int i) {
            this.permission_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatus(boolean z) {
            this.status_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i = dfe.a[methodToInvoke.ordinal()];
            switch (i) {
                case 1:
                    return new PermissionItem();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0007", new Object[]{"permission_", "status_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<PermissionItem> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (PermissionItem.class) {
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

        @Override // com.heytap.health.protocol.PermissionProto$Permission.PermissionItemOrBuilder
        public PermissionsType getPermission() {
            PermissionsType permissionsTypeForNumber = PermissionsType.forNumber(this.permission_);
            return permissionsTypeForNumber == null ? PermissionsType.UNRECOGNIZED : permissionsTypeForNumber;
        }

        @Override // com.heytap.health.protocol.PermissionProto$Permission.PermissionItemOrBuilder
        public int getPermissionValue() {
            return this.permission_;
        }

        @Override // com.heytap.health.protocol.PermissionProto$Permission.PermissionItemOrBuilder
        public boolean getStatus() {
            return this.status_;
        }

        public static Builder newBuilder(PermissionItem permissionItem) {
            return DEFAULT_INSTANCE.createBuilder(permissionItem);
        }

        public static PermissionItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PermissionItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PermissionItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PermissionItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static PermissionItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PermissionItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PermissionItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PermissionItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static PermissionItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PermissionItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PermissionItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PermissionItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static PermissionItem parseFrom(InputStream inputStream) throws IOException {
            return (PermissionItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PermissionItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PermissionItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PermissionItem parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (PermissionItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static PermissionItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PermissionItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface PermissionItemOrBuilder extends MessageLiteOrBuilder {
        PermissionsType getPermission();

        int getPermissionValue();

        boolean getStatus();
    }

    public enum PermissionsType implements Internal.EnumLite {
        CAMERA(0),
        EXTERNAL_STORAGE(1),
        LOCATION(2),
        BACKGROUND_LOCATION(3),
        READ_PHONE_STATE(4),
        RECORD_AUDIO(5),
        READ_CALENDAR(6),
        WRITE_CALENDAR(7),
        ACTIVITY_RECOGNITION(8),
        BLUETOOTH(9),
        CALL_PHONE(10),
        READ_CONTACTS(11),
        READ_CALL_LOG(12),
        SEND_SMS(13),
        ANSWER_PHONE_CALLS(14),
        UNRECOGNIZED(-1);

        public static final int ACTIVITY_RECOGNITION_VALUE = 8;
        public static final int ANSWER_PHONE_CALLS_VALUE = 14;
        public static final int BACKGROUND_LOCATION_VALUE = 3;
        public static final int BLUETOOTH_VALUE = 9;
        public static final int CALL_PHONE_VALUE = 10;
        public static final int CAMERA_VALUE = 0;
        public static final int EXTERNAL_STORAGE_VALUE = 1;
        public static final int LOCATION_VALUE = 2;
        public static final int READ_CALENDAR_VALUE = 6;
        public static final int READ_CALL_LOG_VALUE = 12;
        public static final int READ_CONTACTS_VALUE = 11;
        public static final int READ_PHONE_STATE_VALUE = 4;
        public static final int RECORD_AUDIO_VALUE = 5;
        public static final int SEND_SMS_VALUE = 13;
        public static final int WRITE_CALENDAR_VALUE = 7;
        private static final Internal.EnumLiteMap<PermissionsType> internalValueMap = new a();
        private final int value;

        public class a implements Internal.EnumLiteMap<PermissionsType> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public PermissionsType findValueByNumber(int i) {
                return PermissionsType.forNumber(i);
            }
        }

        public static final class b implements Internal.EnumVerifier {
            public static final Internal.EnumVerifier a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return PermissionsType.forNumber(i) != null;
            }
        }

        PermissionsType(int i) {
            this.value = i;
        }

        public static PermissionsType forNumber(int i) {
            switch (i) {
                case 0:
                    return CAMERA;
                case 1:
                    return EXTERNAL_STORAGE;
                case 2:
                    return LOCATION;
                case 3:
                    return BACKGROUND_LOCATION;
                case 4:
                    return READ_PHONE_STATE;
                case 5:
                    return RECORD_AUDIO;
                case 6:
                    return READ_CALENDAR;
                case 7:
                    return WRITE_CALENDAR;
                case 8:
                    return ACTIVITY_RECOGNITION;
                case 9:
                    return BLUETOOTH;
                case 10:
                    return CALL_PHONE;
                case 11:
                    return READ_CONTACTS;
                case 12:
                    return READ_CALL_LOG;
                case 13:
                    return SEND_SMS;
                case 14:
                    return ANSWER_PHONE_CALLS;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<PermissionsType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static PermissionsType valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        PermissionProto$Permission permissionProto$Permission = new PermissionProto$Permission();
        DEFAULT_INSTANCE = permissionProto$Permission;
        GeneratedMessageLite.registerDefaultInstance(PermissionProto$Permission.class, permissionProto$Permission);
    }

    private PermissionProto$Permission() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFeatures(Iterable<? extends FeatureItem> iterable) {
        ensureFeaturesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.features_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFeatures(FeatureItem featureItem) {
        featureItem.getClass();
        ensureFeaturesIsMutable();
        this.features_.add(featureItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatures() {
        this.features_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureFeaturesIsMutable() {
        Internal.ProtobufList<FeatureItem> protobufList = this.features_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.features_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static PermissionProto$Permission getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static PermissionProto$Permission parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PermissionProto$Permission) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PermissionProto$Permission parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PermissionProto$Permission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<PermissionProto$Permission> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFeatures(int i) {
        ensureFeaturesIsMutable();
        this.features_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatures(int i, FeatureItem featureItem) {
        featureItem.getClass();
        ensureFeaturesIsMutable();
        this.features_.set(i, featureItem);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = dfe.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new PermissionProto$Permission();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"features_", FeatureItem.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PermissionProto$Permission> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (PermissionProto$Permission.class) {
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

    @Override // com.heytap.health.protocol.PermissionProto$PermissionOrBuilder
    public FeatureItem getFeatures(int i) {
        return this.features_.get(i);
    }

    @Override // com.heytap.health.protocol.PermissionProto$PermissionOrBuilder
    public int getFeaturesCount() {
        return this.features_.size();
    }

    @Override // com.heytap.health.protocol.PermissionProto$PermissionOrBuilder
    public List<FeatureItem> getFeaturesList() {
        return this.features_;
    }

    public FeatureItemOrBuilder getFeaturesOrBuilder(int i) {
        return this.features_.get(i);
    }

    public List<? extends FeatureItemOrBuilder> getFeaturesOrBuilderList() {
        return this.features_;
    }

    public static Builder newBuilder(PermissionProto$Permission permissionProto$Permission) {
        return DEFAULT_INSTANCE.createBuilder(permissionProto$Permission);
    }

    public static PermissionProto$Permission parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PermissionProto$Permission) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PermissionProto$Permission parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PermissionProto$Permission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PermissionProto$Permission parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PermissionProto$Permission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFeatures(int i, FeatureItem featureItem) {
        featureItem.getClass();
        ensureFeaturesIsMutable();
        this.features_.add(i, featureItem);
    }

    public static PermissionProto$Permission parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PermissionProto$Permission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PermissionProto$Permission parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PermissionProto$Permission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PermissionProto$Permission parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PermissionProto$Permission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PermissionProto$Permission parseFrom(InputStream inputStream) throws IOException {
        return (PermissionProto$Permission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PermissionProto$Permission parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PermissionProto$Permission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PermissionProto$Permission parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PermissionProto$Permission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PermissionProto$Permission parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PermissionProto$Permission) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
