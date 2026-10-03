package com.oplusos.vfxmodelviewer.filament;

/* JADX INFO: loaded from: classes9.dex */
public class ToneMapper {
    private final long mNativeObject;

    public static class ACES extends ToneMapper {
        public ACES() {
            super(ToneMapper.nCreateACESToneMapper());
        }
    }

    public static class ACESLegacy extends ToneMapper {
        public ACESLegacy() {
            super(ToneMapper.nCreateACESLegacyToneMapper());
        }
    }

    public static class Filmic extends ToneMapper {
        public Filmic() {
            super(ToneMapper.nCreateFilmicToneMapper());
        }
    }

    public static class Generic extends ToneMapper {
        public Generic() {
            this(1.585f, 0.5f, 0.18f, 0.268f, 10.0f);
        }

        public float getContrast() {
            return ToneMapper.nGenericGetContrast(getNativeObject());
        }

        public float getHdrMax() {
            return ToneMapper.nGenericGetHdrMax(getNativeObject());
        }

        public float getMidGrayIn() {
            return ToneMapper.nGenericGetMidGrayIn(getNativeObject());
        }

        public float getMidGrayOut() {
            return ToneMapper.nGenericGetMidGrayOut(getNativeObject());
        }

        public float getShoulder() {
            return ToneMapper.nGenericGetShoulder(getNativeObject());
        }

        public void setContrast(float f) {
            ToneMapper.nGenericSetContrast(getNativeObject(), f);
        }

        public void setHdrMax(float f) {
            ToneMapper.nGenericSetHdrMax(getNativeObject(), f);
        }

        public void setMidGrayIn(float f) {
            ToneMapper.nGenericSetMidGrayIn(getNativeObject(), f);
        }

        public void setMidGrayOut(float f) {
            ToneMapper.nGenericSetMidGrayOut(getNativeObject(), f);
        }

        public void setShoulder(float f) {
            ToneMapper.nGenericSetShoulder(getNativeObject(), f);
        }

        public Generic(float f, float f2, float f3, float f4, float f5) {
            super(ToneMapper.nCreateGenericToneMapper(f, f2, f3, f4, f5));
        }
    }

    public static class Linear extends ToneMapper {
        public Linear() {
            super(ToneMapper.nCreateLinearToneMapper());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateACESLegacyToneMapper();

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateACESToneMapper();

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateFilmicToneMapper();

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateGenericToneMapper(float f, float f2, float f3, float f4, float f5);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateLinearToneMapper();

    private static native void nDestroyToneMapper(long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native float nGenericGetContrast(long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native float nGenericGetHdrMax(long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native float nGenericGetMidGrayIn(long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native float nGenericGetMidGrayOut(long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native float nGenericGetShoulder(long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nGenericSetContrast(long j2, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nGenericSetHdrMax(long j2, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nGenericSetMidGrayIn(long j2, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nGenericSetMidGrayOut(long j2, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nGenericSetShoulder(long j2, float f);

    public void finalize() throws Throwable {
        try {
            super.finalize();
        } finally {
            nDestroyToneMapper(this.mNativeObject);
        }
    }

    public long getNativeObject() {
        long j2 = this.mNativeObject;
        if (j2 != 0) {
            return j2;
        }
        throw new IllegalStateException("Calling method on destroyed ToneMapper");
    }

    private ToneMapper(long j2) {
        this.mNativeObject = j2;
    }
}
