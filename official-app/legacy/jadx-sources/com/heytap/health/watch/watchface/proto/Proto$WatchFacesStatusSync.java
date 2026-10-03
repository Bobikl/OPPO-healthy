package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.fze;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class Proto$WatchFacesStatusSync extends GeneratedMessageLite<Proto$WatchFacesStatusSync, Builder> implements Proto$WatchFacesStatusSyncOrBuilder {
    public static final int AI_RES_MD5_FIELD_NUMBER = 20;
    public static final int ALBUM_KEY_FIELD_NUMBER = 18;
    private static final Proto$WatchFacesStatusSync DEFAULT_INSTANCE;
    public static final int DENSITY_FIELD_NUMBER = 16;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 7;
    public static final int MAX_COUNT_FIELD_NUMBER = 2;
    public static final int MODEL_FIELD_NUMBER = 8;
    public static final int OUTFITS_KEY_FIELD_NUMBER = 19;
    private static volatile Parser<Proto$WatchFacesStatusSync> PARSER = null;
    public static final int PRESENT_FIELD_NUMBER = 1;
    public static final int PREVIEW_IMAGES_FIELD_NUMBER = 21;
    public static final int SCALED_DENSITY_FIELD_NUMBER = 17;
    public static final int SCREEN_HEIGHT_FIELD_NUMBER = 6;
    public static final int SCREEN_WIDTH_FIELD_NUMBER = 5;
    public static final int SKU_CODE_FIELD_NUMBER = 9;
    public static final int VERSIONS_FIELD_NUMBER = 4;
    public static final int WATCH_FACES_FIELD_NUMBER = 3;
    public static final int WATCH_FACE_VERSION_FIELD_NUMBER = 22;
    private float density_;
    private int maxCount_;
    private float scaledDensity_;
    private int screenHeight_;
    private int screenWidth_;
    private int watchFaceVersion_;
    private String present_ = "";
    private Internal.ProtobufList<Proto$WatchFace> watchFaces_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<Proto$WatchFaceVersion> versions_ = GeneratedMessageLite.emptyProtobufList();
    private String deviceType_ = "";
    private String model_ = "";
    private String skuCode_ = "";
    private String albumKey_ = "";
    private String outfitsKey_ = "";
    private String aiResMd5_ = "";
    private Internal.ProtobufList<String> previewImages_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Builder extends GeneratedMessageLite.Builder<Proto$WatchFacesStatusSync, Builder> implements Proto$WatchFacesStatusSyncOrBuilder {
        public Builder addAllPreviewImages(Iterable<String> iterable) {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).addAllPreviewImages(iterable);
            return this;
        }

        public Builder addAllVersions(Iterable<? extends Proto$WatchFaceVersion> iterable) {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).addAllVersions(iterable);
            return this;
        }

        public Builder addAllWatchFaces(Iterable<? extends Proto$WatchFace> iterable) {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).addAllWatchFaces(iterable);
            return this;
        }

        public Builder addPreviewImages(String str) {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).addPreviewImages(str);
            return this;
        }

        public Builder addPreviewImagesBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).addPreviewImagesBytes(byteString);
            return this;
        }

        public Builder addVersions(Proto$WatchFaceVersion proto$WatchFaceVersion) {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).addVersions(proto$WatchFaceVersion);
            return this;
        }

        public Builder addWatchFaces(Proto$WatchFace proto$WatchFace) {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).addWatchFaces(proto$WatchFace);
            return this;
        }

        public Builder clearAiResMd5() {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).clearAiResMd5();
            return this;
        }

        public Builder clearAlbumKey() {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).clearAlbumKey();
            return this;
        }

        public Builder clearDensity() {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).clearDensity();
            return this;
        }

        public Builder clearDeviceType() {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).clearDeviceType();
            return this;
        }

        public Builder clearMaxCount() {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).clearMaxCount();
            return this;
        }

        public Builder clearModel() {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).clearModel();
            return this;
        }

        public Builder clearOutfitsKey() {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).clearOutfitsKey();
            return this;
        }

        public Builder clearPresent() {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).clearPresent();
            return this;
        }

        public Builder clearPreviewImages() {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).clearPreviewImages();
            return this;
        }

        public Builder clearScaledDensity() {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).clearScaledDensity();
            return this;
        }

        public Builder clearScreenHeight() {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).clearScreenHeight();
            return this;
        }

        public Builder clearScreenWidth() {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).clearScreenWidth();
            return this;
        }

        public Builder clearSkuCode() {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).clearSkuCode();
            return this;
        }

        public Builder clearVersions() {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).clearVersions();
            return this;
        }

        public Builder clearWatchFaceVersion() {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).clearWatchFaceVersion();
            return this;
        }

        public Builder clearWatchFaces() {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).clearWatchFaces();
            return this;
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
        public String getAiResMd5() {
            return ((Proto$WatchFacesStatusSync) this.instance).getAiResMd5();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
        public ByteString getAiResMd5Bytes() {
            return ((Proto$WatchFacesStatusSync) this.instance).getAiResMd5Bytes();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
        public String getAlbumKey() {
            return ((Proto$WatchFacesStatusSync) this.instance).getAlbumKey();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
        public ByteString getAlbumKeyBytes() {
            return ((Proto$WatchFacesStatusSync) this.instance).getAlbumKeyBytes();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
        public float getDensity() {
            return ((Proto$WatchFacesStatusSync) this.instance).getDensity();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
        public String getDeviceType() {
            return ((Proto$WatchFacesStatusSync) this.instance).getDeviceType();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
        public ByteString getDeviceTypeBytes() {
            return ((Proto$WatchFacesStatusSync) this.instance).getDeviceTypeBytes();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
        public int getMaxCount() {
            return ((Proto$WatchFacesStatusSync) this.instance).getMaxCount();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
        public String getModel() {
            return ((Proto$WatchFacesStatusSync) this.instance).getModel();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
        public ByteString getModelBytes() {
            return ((Proto$WatchFacesStatusSync) this.instance).getModelBytes();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
        public String getOutfitsKey() {
            return ((Proto$WatchFacesStatusSync) this.instance).getOutfitsKey();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
        public ByteString getOutfitsKeyBytes() {
            return ((Proto$WatchFacesStatusSync) this.instance).getOutfitsKeyBytes();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
        public String getPresent() {
            return ((Proto$WatchFacesStatusSync) this.instance).getPresent();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
        public ByteString getPresentBytes() {
            return ((Proto$WatchFacesStatusSync) this.instance).getPresentBytes();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
        public String getPreviewImages(int i) {
            return ((Proto$WatchFacesStatusSync) this.instance).getPreviewImages(i);
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
        public ByteString getPreviewImagesBytes(int i) {
            return ((Proto$WatchFacesStatusSync) this.instance).getPreviewImagesBytes(i);
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
        public int getPreviewImagesCount() {
            return ((Proto$WatchFacesStatusSync) this.instance).getPreviewImagesCount();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
        public List<String> getPreviewImagesList() {
            return Collections.unmodifiableList(((Proto$WatchFacesStatusSync) this.instance).getPreviewImagesList());
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
        public float getScaledDensity() {
            return ((Proto$WatchFacesStatusSync) this.instance).getScaledDensity();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
        public int getScreenHeight() {
            return ((Proto$WatchFacesStatusSync) this.instance).getScreenHeight();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
        public int getScreenWidth() {
            return ((Proto$WatchFacesStatusSync) this.instance).getScreenWidth();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
        public String getSkuCode() {
            return ((Proto$WatchFacesStatusSync) this.instance).getSkuCode();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
        public ByteString getSkuCodeBytes() {
            return ((Proto$WatchFacesStatusSync) this.instance).getSkuCodeBytes();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
        public Proto$WatchFaceVersion getVersions(int i) {
            return ((Proto$WatchFacesStatusSync) this.instance).getVersions(i);
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
        public int getVersionsCount() {
            return ((Proto$WatchFacesStatusSync) this.instance).getVersionsCount();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
        public List<Proto$WatchFaceVersion> getVersionsList() {
            return Collections.unmodifiableList(((Proto$WatchFacesStatusSync) this.instance).getVersionsList());
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
        public int getWatchFaceVersion() {
            return ((Proto$WatchFacesStatusSync) this.instance).getWatchFaceVersion();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
        public Proto$WatchFace getWatchFaces(int i) {
            return ((Proto$WatchFacesStatusSync) this.instance).getWatchFaces(i);
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
        public int getWatchFacesCount() {
            return ((Proto$WatchFacesStatusSync) this.instance).getWatchFacesCount();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
        public List<Proto$WatchFace> getWatchFacesList() {
            return Collections.unmodifiableList(((Proto$WatchFacesStatusSync) this.instance).getWatchFacesList());
        }

        public Builder removeVersions(int i) {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).removeVersions(i);
            return this;
        }

        public Builder removeWatchFaces(int i) {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).removeWatchFaces(i);
            return this;
        }

        public Builder setAiResMd5(String str) {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).setAiResMd5(str);
            return this;
        }

        public Builder setAiResMd5Bytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).setAiResMd5Bytes(byteString);
            return this;
        }

        public Builder setAlbumKey(String str) {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).setAlbumKey(str);
            return this;
        }

        public Builder setAlbumKeyBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).setAlbumKeyBytes(byteString);
            return this;
        }

        public Builder setDensity(float f) {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).setDensity(f);
            return this;
        }

        public Builder setDeviceType(String str) {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).setDeviceType(str);
            return this;
        }

        public Builder setDeviceTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).setDeviceTypeBytes(byteString);
            return this;
        }

        public Builder setMaxCount(int i) {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).setMaxCount(i);
            return this;
        }

        public Builder setModel(String str) {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).setModel(str);
            return this;
        }

        public Builder setModelBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).setModelBytes(byteString);
            return this;
        }

        public Builder setOutfitsKey(String str) {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).setOutfitsKey(str);
            return this;
        }

        public Builder setOutfitsKeyBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).setOutfitsKeyBytes(byteString);
            return this;
        }

        public Builder setPresent(String str) {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).setPresent(str);
            return this;
        }

        public Builder setPresentBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).setPresentBytes(byteString);
            return this;
        }

        public Builder setPreviewImages(int i, String str) {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).setPreviewImages(i, str);
            return this;
        }

        public Builder setScaledDensity(float f) {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).setScaledDensity(f);
            return this;
        }

        public Builder setScreenHeight(int i) {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).setScreenHeight(i);
            return this;
        }

        public Builder setScreenWidth(int i) {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).setScreenWidth(i);
            return this;
        }

        public Builder setSkuCode(String str) {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).setSkuCode(str);
            return this;
        }

        public Builder setSkuCodeBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).setSkuCodeBytes(byteString);
            return this;
        }

        public Builder setVersions(int i, Proto$WatchFaceVersion proto$WatchFaceVersion) {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).setVersions(i, proto$WatchFaceVersion);
            return this;
        }

        public Builder setWatchFaceVersion(int i) {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).setWatchFaceVersion(i);
            return this;
        }

        public Builder setWatchFaces(int i, Proto$WatchFace proto$WatchFace) {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).setWatchFaces(i, proto$WatchFace);
            return this;
        }

        private Builder() {
            super(Proto$WatchFacesStatusSync.DEFAULT_INSTANCE);
        }

        public Builder addVersions(int i, Proto$WatchFaceVersion proto$WatchFaceVersion) {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).addVersions(i, proto$WatchFaceVersion);
            return this;
        }

        public Builder addWatchFaces(int i, Proto$WatchFace proto$WatchFace) {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).addWatchFaces(i, proto$WatchFace);
            return this;
        }

        public Builder setVersions(int i, Proto$WatchFaceVersion.Builder builder) {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).setVersions(i, builder.build());
            return this;
        }

        public Builder setWatchFaces(int i, Proto$WatchFace.Builder builder) {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).setWatchFaces(i, builder.build());
            return this;
        }

        public Builder addVersions(Proto$WatchFaceVersion.Builder builder) {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).addVersions(builder.build());
            return this;
        }

        public Builder addWatchFaces(Proto$WatchFace.Builder builder) {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).addWatchFaces(builder.build());
            return this;
        }

        public Builder addVersions(int i, Proto$WatchFaceVersion.Builder builder) {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).addVersions(i, builder.build());
            return this;
        }

        public Builder addWatchFaces(int i, Proto$WatchFace.Builder builder) {
            copyOnWrite();
            ((Proto$WatchFacesStatusSync) this.instance).addWatchFaces(i, builder.build());
            return this;
        }
    }

    static {
        Proto$WatchFacesStatusSync proto$WatchFacesStatusSync = new Proto$WatchFacesStatusSync();
        DEFAULT_INSTANCE = proto$WatchFacesStatusSync;
        GeneratedMessageLite.registerDefaultInstance(Proto$WatchFacesStatusSync.class, proto$WatchFacesStatusSync);
    }

    private Proto$WatchFacesStatusSync() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPreviewImages(Iterable<String> iterable) {
        ensurePreviewImagesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.previewImages_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllVersions(Iterable<? extends Proto$WatchFaceVersion> iterable) {
        ensureVersionsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.versions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllWatchFaces(Iterable<? extends Proto$WatchFace> iterable) {
        ensureWatchFacesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.watchFaces_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPreviewImages(String str) {
        str.getClass();
        ensurePreviewImagesIsMutable();
        this.previewImages_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPreviewImagesBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensurePreviewImagesIsMutable();
        this.previewImages_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVersions(Proto$WatchFaceVersion proto$WatchFaceVersion) {
        proto$WatchFaceVersion.getClass();
        ensureVersionsIsMutable();
        this.versions_.add(proto$WatchFaceVersion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWatchFaces(Proto$WatchFace proto$WatchFace) {
        proto$WatchFace.getClass();
        ensureWatchFacesIsMutable();
        this.watchFaces_.add(proto$WatchFace);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAiResMd5() {
        this.aiResMd5_ = getDefaultInstance().getAiResMd5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlbumKey() {
        this.albumKey_ = getDefaultInstance().getAlbumKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDensity() {
        this.density_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceType() {
        this.deviceType_ = getDefaultInstance().getDeviceType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxCount() {
        this.maxCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModel() {
        this.model_ = getDefaultInstance().getModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOutfitsKey() {
        this.outfitsKey_ = getDefaultInstance().getOutfitsKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPresent() {
        this.present_ = getDefaultInstance().getPresent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreviewImages() {
        this.previewImages_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScaledDensity() {
        this.scaledDensity_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScreenHeight() {
        this.screenHeight_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScreenWidth() {
        this.screenWidth_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSkuCode() {
        this.skuCode_ = getDefaultInstance().getSkuCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersions() {
        this.versions_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWatchFaceVersion() {
        this.watchFaceVersion_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWatchFaces() {
        this.watchFaces_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensurePreviewImagesIsMutable() {
        Internal.ProtobufList<String> protobufList = this.previewImages_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.previewImages_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureVersionsIsMutable() {
        Internal.ProtobufList<Proto$WatchFaceVersion> protobufList = this.versions_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.versions_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureWatchFacesIsMutable() {
        Internal.ProtobufList<Proto$WatchFace> protobufList = this.watchFaces_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.watchFaces_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Proto$WatchFacesStatusSync getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Proto$WatchFacesStatusSync parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Proto$WatchFacesStatusSync) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Proto$WatchFacesStatusSync parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Proto$WatchFacesStatusSync) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Proto$WatchFacesStatusSync> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeVersions(int i) {
        ensureVersionsIsMutable();
        this.versions_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeWatchFaces(int i) {
        ensureWatchFacesIsMutable();
        this.watchFaces_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAiResMd5(String str) {
        str.getClass();
        this.aiResMd5_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAiResMd5Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.aiResMd5_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlbumKey(String str) {
        str.getClass();
        this.albumKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlbumKeyBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.albumKey_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDensity(float f) {
        this.density_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceType(String str) {
        str.getClass();
        this.deviceType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.deviceType_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxCount(int i) {
        this.maxCount_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModel(String str) {
        str.getClass();
        this.model_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModelBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.model_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOutfitsKey(String str) {
        str.getClass();
        this.outfitsKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOutfitsKeyBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.outfitsKey_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPresent(String str) {
        str.getClass();
        this.present_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPresentBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.present_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviewImages(int i, String str) {
        str.getClass();
        ensurePreviewImagesIsMutable();
        this.previewImages_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScaledDensity(float f) {
        this.scaledDensity_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenHeight(int i) {
        this.screenHeight_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenWidth(int i) {
        this.screenWidth_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSkuCode(String str) {
        str.getClass();
        this.skuCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSkuCodeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.skuCode_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersions(int i, Proto$WatchFaceVersion proto$WatchFaceVersion) {
        proto$WatchFaceVersion.getClass();
        ensureVersionsIsMutable();
        this.versions_.set(i, proto$WatchFaceVersion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWatchFaceVersion(int i) {
        this.watchFaceVersion_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWatchFaces(int i, Proto$WatchFace proto$WatchFace) {
        proto$WatchFace.getClass();
        ensureWatchFacesIsMutable();
        this.watchFaces_.set(i, proto$WatchFace);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (fze.a[methodToInvoke.ordinal()]) {
            case 1:
                return new Proto$WatchFacesStatusSync();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0000\u0001\u0016\u0010\u0000\u0003\u0000\u0001Ȉ\u0002\u0004\u0003\u001b\u0004\u001b\u0005\u0004\u0006\u0004\u0007Ȉ\bȈ\tȈ\u0010\u0001\u0011\u0001\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015Ț\u0016\u0004", new Object[]{"present_", "maxCount_", "watchFaces_", Proto$WatchFace.class, "versions_", Proto$WatchFaceVersion.class, "screenWidth_", "screenHeight_", "deviceType_", "model_", "skuCode_", "density_", "scaledDensity_", "albumKey_", "outfitsKey_", "aiResMd5_", "previewImages_", "watchFaceVersion_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Proto$WatchFacesStatusSync> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Proto$WatchFacesStatusSync.class) {
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

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
    public String getAiResMd5() {
        return this.aiResMd5_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
    public ByteString getAiResMd5Bytes() {
        return ByteString.copyFromUtf8(this.aiResMd5_);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
    public String getAlbumKey() {
        return this.albumKey_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
    public ByteString getAlbumKeyBytes() {
        return ByteString.copyFromUtf8(this.albumKey_);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
    public float getDensity() {
        return this.density_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
    public String getDeviceType() {
        return this.deviceType_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
    public ByteString getDeviceTypeBytes() {
        return ByteString.copyFromUtf8(this.deviceType_);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
    public int getMaxCount() {
        return this.maxCount_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
    public String getModel() {
        return this.model_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
    public ByteString getModelBytes() {
        return ByteString.copyFromUtf8(this.model_);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
    public String getOutfitsKey() {
        return this.outfitsKey_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
    public ByteString getOutfitsKeyBytes() {
        return ByteString.copyFromUtf8(this.outfitsKey_);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
    public String getPresent() {
        return this.present_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
    public ByteString getPresentBytes() {
        return ByteString.copyFromUtf8(this.present_);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
    public String getPreviewImages(int i) {
        return this.previewImages_.get(i);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
    public ByteString getPreviewImagesBytes(int i) {
        return ByteString.copyFromUtf8(this.previewImages_.get(i));
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
    public int getPreviewImagesCount() {
        return this.previewImages_.size();
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
    public List<String> getPreviewImagesList() {
        return this.previewImages_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
    public float getScaledDensity() {
        return this.scaledDensity_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
    public int getScreenHeight() {
        return this.screenHeight_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
    public int getScreenWidth() {
        return this.screenWidth_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
    public String getSkuCode() {
        return this.skuCode_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
    public ByteString getSkuCodeBytes() {
        return ByteString.copyFromUtf8(this.skuCode_);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
    public Proto$WatchFaceVersion getVersions(int i) {
        return this.versions_.get(i);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
    public int getVersionsCount() {
        return this.versions_.size();
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
    public List<Proto$WatchFaceVersion> getVersionsList() {
        return this.versions_;
    }

    public Proto$WatchFaceVersionOrBuilder getVersionsOrBuilder(int i) {
        return this.versions_.get(i);
    }

    public List<? extends Proto$WatchFaceVersionOrBuilder> getVersionsOrBuilderList() {
        return this.versions_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
    public int getWatchFaceVersion() {
        return this.watchFaceVersion_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
    public Proto$WatchFace getWatchFaces(int i) {
        return this.watchFaces_.get(i);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
    public int getWatchFacesCount() {
        return this.watchFaces_.size();
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$WatchFacesStatusSyncOrBuilder
    public List<Proto$WatchFace> getWatchFacesList() {
        return this.watchFaces_;
    }

    public Proto$WatchFaceOrBuilder getWatchFacesOrBuilder(int i) {
        return this.watchFaces_.get(i);
    }

    public List<? extends Proto$WatchFaceOrBuilder> getWatchFacesOrBuilderList() {
        return this.watchFaces_;
    }

    public static Builder newBuilder(Proto$WatchFacesStatusSync proto$WatchFacesStatusSync) {
        return DEFAULT_INSTANCE.createBuilder(proto$WatchFacesStatusSync);
    }

    public static Proto$WatchFacesStatusSync parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$WatchFacesStatusSync) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Proto$WatchFacesStatusSync parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$WatchFacesStatusSync) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Proto$WatchFacesStatusSync parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Proto$WatchFacesStatusSync) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVersions(int i, Proto$WatchFaceVersion proto$WatchFaceVersion) {
        proto$WatchFaceVersion.getClass();
        ensureVersionsIsMutable();
        this.versions_.add(i, proto$WatchFaceVersion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWatchFaces(int i, Proto$WatchFace proto$WatchFace) {
        proto$WatchFace.getClass();
        ensureWatchFacesIsMutable();
        this.watchFaces_.add(i, proto$WatchFace);
    }

    public static Proto$WatchFacesStatusSync parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$WatchFacesStatusSync) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Proto$WatchFacesStatusSync parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Proto$WatchFacesStatusSync) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Proto$WatchFacesStatusSync parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$WatchFacesStatusSync) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Proto$WatchFacesStatusSync parseFrom(InputStream inputStream) throws IOException {
        return (Proto$WatchFacesStatusSync) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Proto$WatchFacesStatusSync parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$WatchFacesStatusSync) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Proto$WatchFacesStatusSync parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Proto$WatchFacesStatusSync) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Proto$WatchFacesStatusSync parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$WatchFacesStatusSync) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
