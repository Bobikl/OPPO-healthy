package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b5\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b7\u00108J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\nR\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\nR\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\nR\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\nR\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\nR\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\nR\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\nR\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\nR\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\nR\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\nR\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\nR\u0014\u0010 \u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\nR\u0014\u0010!\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\nR\u0014\u0010\"\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\nR\u0014\u0010#\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\nR\u0014\u0010$\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\nR\u0014\u0010%\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\nR\u0014\u0010&\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\nR\u0014\u0010'\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\nR\u0014\u0010(\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\nR\u0014\u0010)\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\nR\u0014\u0010*\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\nR\u0014\u0010+\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\nR\u0014\u0010,\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\nR\u0014\u0010-\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b-\u0010\nR\u0014\u0010.\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010\nR\u0014\u0010/\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b/\u0010\nR\u0014\u00100\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010\nR\u0014\u00101\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010\nR\u0014\u00102\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u0010\nR\u0014\u00103\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010\nR\u0014\u00104\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010\nR\u0014\u00105\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b5\u0010\nR\u0014\u00106\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b6\u0010\n¨\u00069"}, d2 = {"Lcom/oplus/aiunit/vision/l7m;", "", "", "index", "", "a", "MAX_XMP_BUFFER_SIZE", "I", "XMP_HEADER_SIZE", "XMP_HEADER", "Ljava/lang/String;", "GOOGLE_GCAMERA_NAMESPACE", "GOOGLE_PHOTOS_CONTAINER_NAMESPACE", "GOOGLE_PHOTOS_CONTAINER_ITEM_NAMESPACE", "CAMERA_PREFIX", "MOTION_PHOTO_PROP_NAME", "MOTION_PHOTO_PROP_VERSION", "MOTION_PHOTO_PRESET_TIMESTAMP", "EXIF_HEAD_SIZE", "EXIF_HEADER", "MOTION_PHOTO_PROP_NAME_V1", "MOTION_PHOTO_PROP_VERSION_V1", "MOTION_PHOTO_PRESET_TIMESTAMP_V1", "MOTION_PHOTO_VIDEO_OFFSET_V1", "GOOGLE_OPCAMERA_NAMESPACE", "OPCAMERA_PREFIX", "OPCAMERA_MOTION_PHOTO_PRIMARY_PRESET_TIMESTAMP", "OPCAMERA_MOTION_PHOTO_VIDEO_START", "OPCAMERA_MOTION_PHOTO_VIDEO_END", "OPCAMERA_MOTION_PHOTO_ENABLE", "OPCAMERA_MOTION_PHOTO_EDITOR_FLAG", "OPCAMERA_MOTION_PHOTO_SOUND_ENABLE", "OPCAMERA_PROP_HDRGM_VERSION", "OPCAMERA_PROP_OWNER", "OPCAMERA_OLIVE_PHOTO_VERSION", "OPCAMERA_OLIVE_PHOTO_VIDEO_LENGTH", "CONTAINER_PREFIX", "CONTAINER_DIRECTORY", "CONTAINER_ITEM", "ITEM_PREFIX", "ITEM_MIME_TYPE_FIELD_NAME", "ITEM_SEMANTIC_FIELD_NAME", "ITEM_LENGTH_FIELD_NAME", "ITEM_PADDING_FIELD_NAME", "GOOGLE_HDR_NAMESPACE", "HDRGM_PREFIX", "HDR_VERSION", "HDR_GAIN_MAP_MIN", "HDR_GAIN_MAP_MAX", "HDR_GAMMA", "HDR_OFFSET_SDR", "HDR_OFFSET_HDR", "HDR_CAPACITY_MIN", "HDR_CAPACITY_MAX", "HDR_BASE_RENDITION_IS_HDR", "<init>", "()V", "olive-decoder"}, k = 1, mv = {1, 6, 0})
public final class l7m {

    @NotNull
    public static final String CAMERA_PREFIX = "GCamera";

    @NotNull
    public static final String CONTAINER_DIRECTORY = "Container:Directory";

    @NotNull
    public static final String CONTAINER_ITEM = "Container:Item";

    @NotNull
    public static final String CONTAINER_PREFIX = "Container";

    @NotNull
    public static final String EXIF_HEADER = "Exif";
    public static final int EXIF_HEAD_SIZE = 4;

    @NotNull
    public static final String GOOGLE_GCAMERA_NAMESPACE = "http://ns.google.com/photos/1.0/camera/";

    @NotNull
    public static final String GOOGLE_HDR_NAMESPACE = "http://ns.adobe.com/hdr-gain-map/1.0/";

    @NotNull
    public static final String GOOGLE_OPCAMERA_NAMESPACE = "http://ns.oplus.com/photos/1.0/camera/";

    @NotNull
    public static final String GOOGLE_PHOTOS_CONTAINER_ITEM_NAMESPACE = "http://ns.google.com/photos/1.0/container/item/";

    @NotNull
    public static final String GOOGLE_PHOTOS_CONTAINER_NAMESPACE = "http://ns.google.com/photos/1.0/container/";

    @NotNull
    public static final String HDRGM_PREFIX = "hdrgm";

    @NotNull
    public static final String HDR_BASE_RENDITION_IS_HDR = "hdrgm:BaseRenditionIsHDR";

    @NotNull
    public static final String HDR_CAPACITY_MAX = "hdrgm:HDRCapacityMax";

    @NotNull
    public static final String HDR_CAPACITY_MIN = "hdrgm:HDRCapacityMin";

    @NotNull
    public static final String HDR_GAIN_MAP_MAX = "hdrgm:GainMapMax";

    @NotNull
    public static final String HDR_GAIN_MAP_MIN = "hdrgm:GainMapMin";

    @NotNull
    public static final String HDR_GAMMA = "hdrgm:Gamma";

    @NotNull
    public static final String HDR_OFFSET_HDR = "hdrgm:OffsetHDR";

    @NotNull
    public static final String HDR_OFFSET_SDR = "hdrgm:OffsetSDR";

    @NotNull
    public static final String HDR_VERSION = "hdrgm:Version";

    @NotNull
    public static final l7m INSTANCE = new l7m();

    @NotNull
    public static final String ITEM_LENGTH_FIELD_NAME = "Item:Length";

    @NotNull
    public static final String ITEM_MIME_TYPE_FIELD_NAME = "Item:Mime";

    @NotNull
    public static final String ITEM_PADDING_FIELD_NAME = "Item:Padding";

    @NotNull
    public static final String ITEM_PREFIX = "Item";

    @NotNull
    public static final String ITEM_SEMANTIC_FIELD_NAME = "Item:Semantic";
    public static final int MAX_XMP_BUFFER_SIZE = 65502;

    @NotNull
    public static final String MOTION_PHOTO_PRESET_TIMESTAMP = "GCamera:MotionPhotoPresentationTimestampUs";

    @NotNull
    public static final String MOTION_PHOTO_PRESET_TIMESTAMP_V1 = "GCamera:MicroVideoPresentationTimestampUs";

    @NotNull
    public static final String MOTION_PHOTO_PROP_NAME = "GCamera:MotionPhoto";

    @NotNull
    public static final String MOTION_PHOTO_PROP_NAME_V1 = "GCamera:MicroVideoVersion";

    @NotNull
    public static final String MOTION_PHOTO_PROP_VERSION = "GCamera:MotionPhotoVersion";

    @NotNull
    public static final String MOTION_PHOTO_PROP_VERSION_V1 = "GCamera:MicroVideo";

    @NotNull
    public static final String MOTION_PHOTO_VIDEO_OFFSET_V1 = "GCamera:MicroVideoOffset";

    @NotNull
    public static final String OPCAMERA_MOTION_PHOTO_EDITOR_FLAG = "OpCamera:MotionPhotoEditorFlag";

    @NotNull
    public static final String OPCAMERA_MOTION_PHOTO_ENABLE = "OpCamera:MotionPhotoEnable";

    @NotNull
    public static final String OPCAMERA_MOTION_PHOTO_PRIMARY_PRESET_TIMESTAMP = "OpCamera:MotionPhotoPrimaryPresentationTimestampUs";

    @NotNull
    public static final String OPCAMERA_MOTION_PHOTO_SOUND_ENABLE = "OpCamera:MotionPhotoSoundEnable";

    @NotNull
    public static final String OPCAMERA_MOTION_PHOTO_VIDEO_END = "OpCamera:MotionPhotoVideoEnd";

    @NotNull
    public static final String OPCAMERA_MOTION_PHOTO_VIDEO_START = "OpCamera:MotionPhotoVideoStart";

    @NotNull
    public static final String OPCAMERA_OLIVE_PHOTO_VERSION = "OpCamera:OLivePhotoVersion";

    @NotNull
    public static final String OPCAMERA_OLIVE_PHOTO_VIDEO_LENGTH = "OpCamera:VideoLength";

    @NotNull
    public static final String OPCAMERA_PREFIX = "OpCamera";

    @NotNull
    public static final String OPCAMERA_PROP_HDRGM_VERSION = "OpCamera:hdrVersion";

    @NotNull
    public static final String OPCAMERA_PROP_OWNER = "OpCamera:MotionPhotoOwner";

    @NotNull
    public static final String XMP_HEADER = "http://ns.adobe.com/xap/1.0/\u0000";
    public static final int XMP_HEADER_SIZE = 29;

    @NotNull
    public final String a(int index) {
        return "Container:Directory[" + (index + 1) + "]/Container:Item";
    }
}
