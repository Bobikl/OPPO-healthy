package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b)\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b3\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\r\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u0019\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u001b\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010R\u0017\u0010\u001c\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u001e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u001d\u0010\u0010R\u0014\u0010\u001f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0007R\u0014\u0010 \u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0007R\u0014\u0010!\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0007R\u0014\u0010\"\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0007R\u0014\u0010#\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0007R\u0014\u0010$\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0007R\u0014\u0010%\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0007R\u0014\u0010&\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0007R\u0014\u0010'\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0007R\u0014\u0010(\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0007R\u0014\u0010)\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u0007R\u0014\u0010*\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u0007R\u0014\u0010+\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b+\u0010\u0007R\u0014\u0010,\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010\u0007R\u0017\u0010/\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b-\u0010\u000e\u001a\u0004\b.\u0010\u0010R\u0017\u00102\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b0\u0010\u000e\u001a\u0004\b1\u0010\u0010¨\u00065"}, d2 = {"Lcom/oplus/aiunit/vision/h5c;", "", "", "EMPTY_BYTE", c8l.KEY_B, "", "MP_FORMAT_IDENTIFIER_SIZE", "I", "MP_HEADER_SIZE", "MP_HEADER_ENDIAN_SIZE", "MP_HEADER_OFFSET_TO_FIRST_IFD_SIZE", "MP_ENTRY_OFFSET_COUNT", "", "a", "[B", "b", "()[B", "IDENTIFIER_MPF_BYTE_ARRAY", "c", "LITTLE_ENDIAN_BYTE_ARRAY", "BIG_ENDIAN_BYTE_ARRAY", "d", MapSchema.FIELD_NAME_ENTRY, "TAG_MP_FORMAT_VERSION_NUMBER", b2n.f, "TAG_MP_NUM_OF_IMAGES", "f", "TAG_MP_ENTRY", "TAG_MP_INDIVIDUAL_IMAGE_UNIQUE_ID_LIST", b2n.g, "TAG_MP_TOTAL_NUMBER_OF_CAPTURED_FRAMES", "MP_INDEX_IFD_COUNT_SIZE", "MP_INDEX_IFD_TAG_ID_SIZE", "MP_INDEX_IFD_VERSION_SIZE", "MP_INDEX_IFD_NUM_OF_IMAGE_SIZE", "MP_INDEX_IFD_MP_ENTRY_INFO_SIZE", "MP_INDEX_IFD_INDIVIDUAL_IMAGE_UNIQUE_ID_LIST_SIZE", "MP_INDEX_IFD_TOTAL_NUMBER_OF_CAPTURED_FRAMES_SIZE", "MP_INDEX_IFD_OFFSET_OF_NEXT_IFD_SIZE", "MP_VALUE_ENTRY_SIZE", "MP_VALUE_INDIVIDUAL_IMAGE_UNIQUE_ID_SIZE", "MP_ENTRY_INDIVIDUAL_IMAGE_ATTRS_SIZE", "MP_ENTRY_INDIVIDUAL_IMAGE_SIZE", "MP_ENTRY_INDIVIDUAL_IMAGE_DATA_OFFSET", "MP_ENTRY_DEPENDENT_IMAGE_ENTRY_NUMBER_SIZE", "i", "getMP_TYPE_CODE_BASELINE_IMAGE", "MP_TYPE_CODE_BASELINE_IMAGE", "j", "getMP_TYPE_CODE_UNDEFINED", "MP_TYPE_CODE_UNDEFINED", "<init>", "()V", "olive-decoder"}, k = 1, mv = {1, 6, 0})
public final class h5c {
    public static final byte EMPTY_BYTE = 0;
    public static final int MP_ENTRY_DEPENDENT_IMAGE_ENTRY_NUMBER_SIZE = 2;
    public static final int MP_ENTRY_INDIVIDUAL_IMAGE_ATTRS_SIZE = 4;
    public static final int MP_ENTRY_INDIVIDUAL_IMAGE_DATA_OFFSET = 4;
    public static final int MP_ENTRY_INDIVIDUAL_IMAGE_SIZE = 4;
    public static final int MP_ENTRY_OFFSET_COUNT = 16;
    public static final int MP_FORMAT_IDENTIFIER_SIZE = 4;
    public static final int MP_HEADER_ENDIAN_SIZE = 4;
    public static final int MP_HEADER_OFFSET_TO_FIRST_IFD_SIZE = 4;
    public static final int MP_HEADER_SIZE = 8;
    public static final int MP_INDEX_IFD_COUNT_SIZE = 2;
    public static final int MP_INDEX_IFD_INDIVIDUAL_IMAGE_UNIQUE_ID_LIST_SIZE = 12;
    public static final int MP_INDEX_IFD_MP_ENTRY_INFO_SIZE = 12;
    public static final int MP_INDEX_IFD_NUM_OF_IMAGE_SIZE = 12;
    public static final int MP_INDEX_IFD_OFFSET_OF_NEXT_IFD_SIZE = 4;
    public static final int MP_INDEX_IFD_TAG_ID_SIZE = 2;
    public static final int MP_INDEX_IFD_TOTAL_NUMBER_OF_CAPTURED_FRAMES_SIZE = 12;
    public static final int MP_INDEX_IFD_VERSION_SIZE = 12;
    public static final int MP_VALUE_ENTRY_SIZE = 16;
    public static final int MP_VALUE_INDIVIDUAL_IMAGE_UNIQUE_ID_SIZE = 33;

    @NotNull
    public static final h5c INSTANCE = new h5c();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final byte[] IDENTIFIER_MPF_BYTE_ARRAY = {77, 80, 70, 0};

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final byte[] LITTLE_ENDIAN_BYTE_ARRAY = {73, 73, 42, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final byte[] BIG_ENDIAN_BYTE_ARRAY = {77, 77, 0, 42};

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final byte[] TAG_MP_FORMAT_VERSION_NUMBER = {-80, 0};

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final byte[] TAG_MP_NUM_OF_IMAGES = {-80, 1};

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final byte[] TAG_MP_ENTRY = {-80, 2};

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final byte[] TAG_MP_INDIVIDUAL_IMAGE_UNIQUE_ID_LIST = {-80, 3};

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public static final byte[] TAG_MP_TOTAL_NUMBER_OF_CAPTURED_FRAMES = {-80, 4};

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public static final byte[] MP_TYPE_CODE_BASELINE_IMAGE = {3, 0, 0};

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final byte[] MP_TYPE_CODE_UNDEFINED = {0, 0, 0};

    @NotNull
    public final byte[] a() {
        return BIG_ENDIAN_BYTE_ARRAY;
    }

    @NotNull
    public final byte[] b() {
        return IDENTIFIER_MPF_BYTE_ARRAY;
    }

    @NotNull
    public final byte[] c() {
        return LITTLE_ENDIAN_BYTE_ARRAY;
    }

    @NotNull
    public final byte[] d() {
        return TAG_MP_ENTRY;
    }

    @NotNull
    public final byte[] e() {
        return TAG_MP_FORMAT_VERSION_NUMBER;
    }

    @NotNull
    public final byte[] f() {
        return TAG_MP_INDIVIDUAL_IMAGE_UNIQUE_ID_LIST;
    }

    @NotNull
    public final byte[] g() {
        return TAG_MP_NUM_OF_IMAGES;
    }

    @NotNull
    public final byte[] h() {
        return TAG_MP_TOTAL_NUMBER_OF_CAPTURED_FRAMES;
    }
}
