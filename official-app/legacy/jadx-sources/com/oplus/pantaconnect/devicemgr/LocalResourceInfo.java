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
import com.google.protobuf.MapEntry;
import com.google.protobuf.MapField;
import com.google.protobuf.MapFieldReflectionAccessor;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.WireFormat;
import com.oplus.aiunit.vision.xq5;
import com.oplus.pantaconnect.agents.carambola;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class LocalResourceInfo extends GeneratedMessageV3 implements LocalResourceInfoOrBuilder {
    public static final int DEVICEID_FIELD_NUMBER = 1;
    public static final int KIND_FIELD_NUMBER = 3;
    public static final int METADATA_FIELD_NUMBER = 4;
    public static final int SPEC_FIELD_NUMBER = 5;
    public static final int STATUS_FIELD_NUMBER = 6;
    public static final int VERSION_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private volatile Object deviceId_;
    private volatile Object kind_;
    private byte memoizedIsInitialized;
    private MapField<String, String> metaData_;
    private MapField<String, String> spec_;
    private MapField<String, String> status_;
    private volatile Object version_;
    private static final LocalResourceInfo DEFAULT_INSTANCE = new LocalResourceInfo();
    private static final Parser<LocalResourceInfo> PARSER = new a();

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LocalResourceInfoOrBuilder {
        private int bitField0_;
        private Object deviceId_;
        private Object kind_;
        private MapField<String, String> metaData_;
        private MapField<String, String> spec_;
        private MapField<String, String> status_;
        private Object version_;

        public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, a aVar) {
            this(builderParent);
        }

        private void buildPartial0(LocalResourceInfo localResourceInfo) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                localResourceInfo.deviceId_ = this.deviceId_;
            }
            if ((i & 2) != 0) {
                localResourceInfo.version_ = this.version_;
            }
            if ((i & 4) != 0) {
                localResourceInfo.kind_ = this.kind_;
            }
            if ((i & 8) != 0) {
                localResourceInfo.metaData_ = internalGetMetaData();
                localResourceInfo.metaData_.makeImmutable();
            }
            if ((i & 16) != 0) {
                localResourceInfo.spec_ = internalGetSpec();
                localResourceInfo.spec_.makeImmutable();
            }
            if ((i & 32) != 0) {
                localResourceInfo.status_ = internalGetStatus();
                localResourceInfo.status_.makeImmutable();
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return xq5.k;
        }

        private MapField<String, String> internalGetMetaData() {
            MapField<String, String> mapField = this.metaData_;
            return mapField == null ? MapField.emptyMapField(b.a) : mapField;
        }

        private MapField<String, String> internalGetMutableMetaData() {
            if (this.metaData_ == null) {
                this.metaData_ = MapField.newMapField(b.a);
            }
            if (!this.metaData_.isMutable()) {
                this.metaData_ = this.metaData_.copy();
            }
            this.bitField0_ |= 8;
            onChanged();
            return this.metaData_;
        }

        private MapField<String, String> internalGetMutableSpec() {
            if (this.spec_ == null) {
                this.spec_ = MapField.newMapField(c.a);
            }
            if (!this.spec_.isMutable()) {
                this.spec_ = this.spec_.copy();
            }
            this.bitField0_ |= 16;
            onChanged();
            return this.spec_;
        }

        private MapField<String, String> internalGetMutableStatus() {
            if (this.status_ == null) {
                this.status_ = MapField.newMapField(d.a);
            }
            if (!this.status_.isMutable()) {
                this.status_ = this.status_.copy();
            }
            this.bitField0_ |= 32;
            onChanged();
            return this.status_;
        }

        private MapField<String, String> internalGetSpec() {
            MapField<String, String> mapField = this.spec_;
            return mapField == null ? MapField.emptyMapField(c.a) : mapField;
        }

        private MapField<String, String> internalGetStatus() {
            MapField<String, String> mapField = this.status_;
            return mapField == null ? MapField.emptyMapField(d.a) : mapField;
        }

        public Builder clearDeviceId() {
            this.deviceId_ = LocalResourceInfo.getDefaultInstance().getDeviceId();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder clearKind() {
            this.kind_ = LocalResourceInfo.getDefaultInstance().getKind();
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public Builder clearMetaData() {
            this.bitField0_ &= -9;
            internalGetMutableMetaData().getMutableMap().clear();
            return this;
        }

        public Builder clearSpec() {
            this.bitField0_ &= -17;
            internalGetMutableSpec().getMutableMap().clear();
            return this;
        }

        public Builder clearStatus() {
            this.bitField0_ &= -33;
            internalGetMutableStatus().getMutableMap().clear();
            return this;
        }

        public Builder clearVersion() {
            this.version_ = LocalResourceInfo.getDefaultInstance().getVersion();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
        public boolean containsMetaData(String str) {
            if (str != null) {
                return internalGetMetaData().getMap().containsKey(str);
            }
            throw new NullPointerException("map key");
        }

        @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
        public boolean containsSpec(String str) {
            if (str != null) {
                return internalGetSpec().getMap().containsKey(str);
            }
            throw new NullPointerException("map key");
        }

        @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
        public boolean containsStatus(String str) {
            if (str != null) {
                return internalGetStatus().getMap().containsKey(str);
            }
            throw new NullPointerException("map key");
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return xq5.k;
        }

        @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
        public String getDeviceId() {
            Object obj = this.deviceId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.deviceId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
        public ByteString getDeviceIdBytes() {
            Object obj = this.deviceId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.deviceId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
        public String getKind() {
            Object obj = this.kind_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.kind_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
        public ByteString getKindBytes() {
            Object obj = this.kind_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.kind_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
        @Deprecated
        public Map<String, String> getMetaData() {
            return getMetaDataMap();
        }

        @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
        public int getMetaDataCount() {
            return internalGetMetaData().getMap().size();
        }

        @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
        public Map<String, String> getMetaDataMap() {
            return internalGetMetaData().getMap();
        }

        @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
        public String getMetaDataOrDefault(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            Map<String, String> map = internalGetMetaData().getMap();
            return map.containsKey(str) ? map.get(str) : str2;
        }

        @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
        public String getMetaDataOrThrow(String str) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            Map<String, String> map = internalGetMetaData().getMap();
            if (map.containsKey(str)) {
                return map.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Deprecated
        public Map<String, String> getMutableMetaData() {
            this.bitField0_ |= 8;
            return internalGetMutableMetaData().getMutableMap();
        }

        @Deprecated
        public Map<String, String> getMutableSpec() {
            this.bitField0_ |= 16;
            return internalGetMutableSpec().getMutableMap();
        }

        @Deprecated
        public Map<String, String> getMutableStatus() {
            this.bitField0_ |= 32;
            return internalGetMutableStatus().getMutableMap();
        }

        @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
        @Deprecated
        public Map<String, String> getSpec() {
            return getSpecMap();
        }

        @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
        public int getSpecCount() {
            return internalGetSpec().getMap().size();
        }

        @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
        public Map<String, String> getSpecMap() {
            return internalGetSpec().getMap();
        }

        @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
        public String getSpecOrDefault(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            Map<String, String> map = internalGetSpec().getMap();
            return map.containsKey(str) ? map.get(str) : str2;
        }

        @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
        public String getSpecOrThrow(String str) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            Map<String, String> map = internalGetSpec().getMap();
            if (map.containsKey(str)) {
                return map.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
        @Deprecated
        public Map<String, String> getStatus() {
            return getStatusMap();
        }

        @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
        public int getStatusCount() {
            return internalGetStatus().getMap().size();
        }

        @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
        public Map<String, String> getStatusMap() {
            return internalGetStatus().getMap();
        }

        @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
        public String getStatusOrDefault(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            Map<String, String> map = internalGetStatus().getMap();
            return map.containsKey(str) ? map.get(str) : str2;
        }

        @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
        public String getStatusOrThrow(String str) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            Map<String, String> map = internalGetStatus().getMap();
            if (map.containsKey(str)) {
                return map.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
        public String getVersion() {
            Object obj = this.version_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.version_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
        public ByteString getVersionBytes() {
            Object obj = this.version_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.version_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return xq5.f18725l.ensureFieldAccessorsInitialized(LocalResourceInfo.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public MapFieldReflectionAccessor internalGetMapFieldReflection(int i) {
            if (i == 4) {
                return internalGetMetaData();
            }
            if (i == 5) {
                return internalGetSpec();
            }
            if (i == 6) {
                return internalGetStatus();
            }
            throw new RuntimeException("Invalid map field number: " + i);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public MapFieldReflectionAccessor internalGetMutableMapFieldReflection(int i) {
            if (i == 4) {
                return internalGetMutableMetaData();
            }
            if (i == 5) {
                return internalGetMutableSpec();
            }
            if (i == 6) {
                return internalGetMutableStatus();
            }
            throw new RuntimeException("Invalid map field number: " + i);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder putAllMetaData(Map<String, String> map) {
            internalGetMutableMetaData().getMutableMap().putAll(map);
            this.bitField0_ |= 8;
            return this;
        }

        public Builder putAllSpec(Map<String, String> map) {
            internalGetMutableSpec().getMutableMap().putAll(map);
            this.bitField0_ |= 16;
            return this;
        }

        public Builder putAllStatus(Map<String, String> map) {
            internalGetMutableStatus().getMutableMap().putAll(map);
            this.bitField0_ |= 32;
            return this;
        }

        public Builder putMetaData(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            if (str2 == null) {
                throw new NullPointerException("map value");
            }
            internalGetMutableMetaData().getMutableMap().put(str, str2);
            this.bitField0_ |= 8;
            return this;
        }

        public Builder putSpec(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            if (str2 == null) {
                throw new NullPointerException("map value");
            }
            internalGetMutableSpec().getMutableMap().put(str, str2);
            this.bitField0_ |= 16;
            return this;
        }

        public Builder putStatus(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            if (str2 == null) {
                throw new NullPointerException("map value");
            }
            internalGetMutableStatus().getMutableMap().put(str, str2);
            this.bitField0_ |= 32;
            return this;
        }

        public Builder removeMetaData(String str) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            internalGetMutableMetaData().getMutableMap().remove(str);
            return this;
        }

        public Builder removeSpec(String str) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            internalGetMutableSpec().getMutableMap().remove(str);
            return this;
        }

        public Builder removeStatus(String str) {
            if (str == null) {
                throw new NullPointerException("map key");
            }
            internalGetMutableStatus().getMutableMap().remove(str);
            return this;
        }

        public Builder setDeviceId(String str) {
            str.getClass();
            this.deviceId_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder setDeviceIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.deviceId_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder setKind(String str) {
            str.getClass();
            this.kind_ = str;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder setKindBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.kind_ = byteString;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder setVersion(String str) {
            str.getClass();
            this.version_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder setVersionBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.version_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public /* synthetic */ Builder(a aVar) {
            this();
        }

        private Builder() {
            this.deviceId_ = "";
            this.version_ = "";
            this.kind_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public LocalResourceInfo build() {
            LocalResourceInfo localResourceInfoBuildPartial = buildPartial();
            if (localResourceInfoBuildPartial.isInitialized()) {
                return localResourceInfoBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) localResourceInfoBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public LocalResourceInfo buildPartial() {
            LocalResourceInfo localResourceInfo = new LocalResourceInfo(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(localResourceInfo);
            }
            onBuilt();
            return localResourceInfo;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LocalResourceInfo getDefaultInstanceForType() {
            return LocalResourceInfo.getDefaultInstance();
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
            this.deviceId_ = "";
            this.version_ = "";
            this.kind_ = "";
            internalGetMutableMetaData().clear();
            internalGetMutableSpec().clear();
            internalGetMutableStatus().clear();
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.deviceId_ = "";
            this.version_ = "";
            this.kind_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4465clone() {
            return (Builder) super.mo4465clone();
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof LocalResourceInfo) {
                return mergeFrom((LocalResourceInfo) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(LocalResourceInfo localResourceInfo) {
            if (localResourceInfo == LocalResourceInfo.getDefaultInstance()) {
                return this;
            }
            if (!localResourceInfo.getDeviceId().isEmpty()) {
                this.deviceId_ = localResourceInfo.deviceId_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (!localResourceInfo.getVersion().isEmpty()) {
                this.version_ = localResourceInfo.version_;
                this.bitField0_ |= 2;
                onChanged();
            }
            if (!localResourceInfo.getKind().isEmpty()) {
                this.kind_ = localResourceInfo.kind_;
                this.bitField0_ |= 4;
                onChanged();
            }
            internalGetMutableMetaData().mergeFrom(localResourceInfo.internalGetMetaData());
            this.bitField0_ |= 8;
            internalGetMutableSpec().mergeFrom(localResourceInfo.internalGetSpec());
            this.bitField0_ |= 16;
            internalGetMutableStatus().mergeFrom(localResourceInfo.internalGetStatus());
            this.bitField0_ |= 32;
            mergeUnknownFields(localResourceInfo.getUnknownFields());
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
                                this.deviceId_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 1;
                            } else if (tag == 18) {
                                this.version_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 2;
                            } else if (tag == 26) {
                                this.kind_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 4;
                            } else if (tag == 34) {
                                MapEntry mapEntry = (MapEntry) codedInputStream.readMessage(b.a.getParserForType(), extensionRegistryLite);
                                internalGetMutableMetaData().getMutableMap().put((String) mapEntry.getKey(), (String) mapEntry.getValue());
                                this.bitField0_ |= 8;
                            } else if (tag == 42) {
                                MapEntry mapEntry2 = (MapEntry) codedInputStream.readMessage(c.a.getParserForType(), extensionRegistryLite);
                                internalGetMutableSpec().getMutableMap().put((String) mapEntry2.getKey(), (String) mapEntry2.getValue());
                                this.bitField0_ |= 16;
                            } else if (tag != 50) {
                                if (!parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            } else {
                                MapEntry mapEntry3 = (MapEntry) codedInputStream.readMessage(d.a.getParserForType(), extensionRegistryLite);
                                internalGetMutableStatus().getMutableMap().put((String) mapEntry3.getKey(), (String) mapEntry3.getValue());
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

    public class a extends AbstractParser<LocalResourceInfo> {
        @Override // com.google.protobuf.Parser
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LocalResourceInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = LocalResourceInfo.newBuilder();
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

    public static final class b {
        public static final MapEntry<String, String> a;

        static {
            Descriptors.Descriptor descriptor = xq5.m;
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            a = MapEntry.newDefaultInstance(descriptor, fieldType, "", fieldType, "");
        }
    }

    public static final class c {
        public static final MapEntry<String, String> a;

        static {
            Descriptors.Descriptor descriptor = xq5.o;
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            a = MapEntry.newDefaultInstance(descriptor, fieldType, "", fieldType, "");
        }
    }

    public static final class d {
        public static final MapEntry<String, String> a;

        static {
            Descriptors.Descriptor descriptor = xq5.q;
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            a = MapEntry.newDefaultInstance(descriptor, fieldType, "", fieldType, "");
        }
    }

    public /* synthetic */ LocalResourceInfo(GeneratedMessageV3.Builder builder, a aVar) {
        this(builder);
    }

    public static LocalResourceInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return xq5.k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MapField<String, String> internalGetMetaData() {
        MapField<String, String> mapField = this.metaData_;
        return mapField == null ? MapField.emptyMapField(b.a) : mapField;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MapField<String, String> internalGetSpec() {
        MapField<String, String> mapField = this.spec_;
        return mapField == null ? MapField.emptyMapField(c.a) : mapField;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MapField<String, String> internalGetStatus() {
        MapField<String, String> mapField = this.status_;
        return mapField == null ? MapField.emptyMapField(d.a) : mapField;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static LocalResourceInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LocalResourceInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static LocalResourceInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<LocalResourceInfo> parser() {
        return PARSER;
    }

    @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
    public boolean containsMetaData(String str) {
        if (str != null) {
            return internalGetMetaData().getMap().containsKey(str);
        }
        throw new NullPointerException("map key");
    }

    @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
    public boolean containsSpec(String str) {
        if (str != null) {
            return internalGetSpec().getMap().containsKey(str);
        }
        throw new NullPointerException("map key");
    }

    @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
    public boolean containsStatus(String str) {
        if (str != null) {
            return internalGetStatus().getMap().containsKey(str);
        }
        throw new NullPointerException("map key");
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalResourceInfo)) {
            return super.equals(obj);
        }
        LocalResourceInfo localResourceInfo = (LocalResourceInfo) obj;
        return getDeviceId().equals(localResourceInfo.getDeviceId()) && getVersion().equals(localResourceInfo.getVersion()) && getKind().equals(localResourceInfo.getKind()) && internalGetMetaData().equals(localResourceInfo.internalGetMetaData()) && internalGetSpec().equals(localResourceInfo.internalGetSpec()) && internalGetStatus().equals(localResourceInfo.internalGetStatus()) && getUnknownFields().equals(localResourceInfo.getUnknownFields());
    }

    @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
    public String getDeviceId() {
        Object obj = this.deviceId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.deviceId_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
    public ByteString getDeviceIdBytes() {
        Object obj = this.deviceId_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.deviceId_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
    public String getKind() {
        Object obj = this.kind_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.kind_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
    public ByteString getKindBytes() {
        Object obj = this.kind_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.kind_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
    @Deprecated
    public Map<String, String> getMetaData() {
        return getMetaDataMap();
    }

    @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
    public int getMetaDataCount() {
        return internalGetMetaData().getMap().size();
    }

    @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
    public Map<String, String> getMetaDataMap() {
        return internalGetMetaData().getMap();
    }

    @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
    public String getMetaDataOrDefault(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("map key");
        }
        Map<String, String> map = internalGetMetaData().getMap();
        return map.containsKey(str) ? map.get(str) : str2;
    }

    @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
    public String getMetaDataOrThrow(String str) {
        if (str == null) {
            throw new NullPointerException("map key");
        }
        Map<String, String> map = internalGetMetaData().getMap();
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<LocalResourceInfo> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.deviceId_) ? GeneratedMessageV3.computeStringSize(1, this.deviceId_) : 0;
        if (!GeneratedMessageV3.isStringEmpty(this.version_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.version_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.kind_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.kind_);
        }
        for (Map.Entry<String, String> entry : internalGetMetaData().getMap().entrySet()) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(4, b.a.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build());
        }
        for (Map.Entry<String, String> entry2 : internalGetSpec().getMap().entrySet()) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(5, c.a.newBuilderForType().setKey(entry2.getKey()).setValue(entry2.getValue()).build());
        }
        for (Map.Entry<String, String> entry3 : internalGetStatus().getMap().entrySet()) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(6, d.a.newBuilderForType().setKey(entry3.getKey()).setValue(entry3.getValue()).build());
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
    @Deprecated
    public Map<String, String> getSpec() {
        return getSpecMap();
    }

    @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
    public int getSpecCount() {
        return internalGetSpec().getMap().size();
    }

    @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
    public Map<String, String> getSpecMap() {
        return internalGetSpec().getMap();
    }

    @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
    public String getSpecOrDefault(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("map key");
        }
        Map<String, String> map = internalGetSpec().getMap();
        return map.containsKey(str) ? map.get(str) : str2;
    }

    @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
    public String getSpecOrThrow(String str) {
        if (str == null) {
            throw new NullPointerException("map key");
        }
        Map<String, String> map = internalGetSpec().getMap();
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
    @Deprecated
    public Map<String, String> getStatus() {
        return getStatusMap();
    }

    @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
    public int getStatusCount() {
        return internalGetStatus().getMap().size();
    }

    @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
    public Map<String, String> getStatusMap() {
        return internalGetStatus().getMap();
    }

    @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
    public String getStatusOrDefault(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("map key");
        }
        Map<String, String> map = internalGetStatus().getMap();
        return map.containsKey(str) ? map.get(str) : str2;
    }

    @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
    public String getStatusOrThrow(String str) {
        if (str == null) {
            throw new NullPointerException("map key");
        }
        Map<String, String> map = internalGetStatus().getMap();
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
    public String getVersion() {
        Object obj = this.version_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.version_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.LocalResourceInfoOrBuilder
    public ByteString getVersionBytes() {
        Object obj = this.version_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.version_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getKind().hashCode() + ((((getVersion().hashCode() + ((((getDeviceId().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53);
        if (!internalGetMetaData().getMap().isEmpty()) {
            iHashCode = internalGetMetaData().hashCode() + carambola.carambola(iHashCode, 37, 4, 53);
        }
        if (!internalGetSpec().getMap().isEmpty()) {
            iHashCode = internalGetSpec().hashCode() + carambola.carambola(iHashCode, 37, 5, 53);
        }
        if (!internalGetStatus().getMap().isEmpty()) {
            iHashCode = internalGetStatus().hashCode() + carambola.carambola(iHashCode, 37, 6, 53);
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return xq5.f18725l.ensureFieldAccessorsInitialized(LocalResourceInfo.class, Builder.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public MapFieldReflectionAccessor internalGetMapFieldReflection(int i) {
        if (i == 4) {
            return internalGetMetaData();
        }
        if (i == 5) {
            return internalGetSpec();
        }
        if (i == 6) {
            return internalGetStatus();
        }
        throw new RuntimeException("Invalid map field number: " + i);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b2 = this.memoizedIsInitialized;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new LocalResourceInfo();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!GeneratedMessageV3.isStringEmpty(this.deviceId_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.deviceId_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.version_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.version_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.kind_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.kind_);
        }
        GeneratedMessageV3.serializeStringMapTo(codedOutputStream, internalGetMetaData(), b.a, 4);
        GeneratedMessageV3.serializeStringMapTo(codedOutputStream, internalGetSpec(), c.a, 5);
        GeneratedMessageV3.serializeStringMapTo(codedOutputStream, internalGetStatus(), d.a, 6);
        getUnknownFields().writeTo(codedOutputStream);
    }

    private LocalResourceInfo(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.deviceId_ = "";
        this.version_ = "";
        this.kind_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Builder newBuilder(LocalResourceInfo localResourceInfo) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(localResourceInfo);
    }

    public static LocalResourceInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static LocalResourceInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LocalResourceInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static LocalResourceInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public LocalResourceInfo getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        a aVar = null;
        return this == DEFAULT_INSTANCE ? new Builder(aVar) : new Builder(aVar).mergeFrom(this);
    }

    public static LocalResourceInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static LocalResourceInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent, null);
    }

    public static LocalResourceInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    private LocalResourceInfo() {
        this.deviceId_ = "";
        this.version_ = "";
        this.kind_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.deviceId_ = "";
        this.version_ = "";
        this.kind_ = "";
    }

    public static LocalResourceInfo parseFrom(InputStream inputStream) throws IOException {
        return (LocalResourceInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static LocalResourceInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LocalResourceInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static LocalResourceInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LocalResourceInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static LocalResourceInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LocalResourceInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
