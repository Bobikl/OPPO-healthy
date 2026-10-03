package androidx.profileinstaller;

/* JADX INFO: loaded from: classes12.dex */
enum FileSectionType {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);

    private final long mValue;

    FileSectionType(long j2) {
        this.mValue = j2;
    }

    public static FileSectionType fromValue(long j2) {
        FileSectionType[] fileSectionTypeArrValues = values();
        for (int i = 0; i < fileSectionTypeArrValues.length; i++) {
            if (fileSectionTypeArrValues[i].getValue() == j2) {
                return fileSectionTypeArrValues[i];
            }
        }
        throw new IllegalArgumentException("Unsupported FileSection Type " + j2);
    }

    public long getValue() {
        return this.mValue;
    }
}
