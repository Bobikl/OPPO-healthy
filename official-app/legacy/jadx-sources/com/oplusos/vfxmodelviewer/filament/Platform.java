package com.oplusos.vfxmodelviewer.filament;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes9.dex */
abstract class Platform {
    private static Platform mCurrentPlatform;

    public static class UnknownPlatform extends Platform {
        private UnknownPlatform() {
        }

        @Override // com.oplusos.vfxmodelviewer.filament.Platform
        public long getSharedContextNativeHandle(Object obj) {
            return 0L;
        }

        @Override // com.oplusos.vfxmodelviewer.filament.Platform
        public void log(String str) {
            System.out.println(str);
        }

        @Override // com.oplusos.vfxmodelviewer.filament.Platform
        public boolean validateSharedContext(Object obj) {
            return false;
        }

        @Override // com.oplusos.vfxmodelviewer.filament.Platform
        public boolean validateStreamSource(Object obj) {
            return false;
        }

        @Override // com.oplusos.vfxmodelviewer.filament.Platform
        public boolean validateSurface(Object obj) {
            return false;
        }

        @Override // com.oplusos.vfxmodelviewer.filament.Platform
        public void warn(String str) {
            System.out.println(str);
        }
    }

    @NonNull
    public static Platform get() {
        if (mCurrentPlatform == null) {
            try {
                if (isAndroid()) {
                    int i = AndroidPlatform.a;
                    mCurrentPlatform = (Platform) AndroidPlatform.class.newInstance();
                } else {
                    mCurrentPlatform = (Platform) Class.forName("com.oplusos.vfxmodelviewer.filament.DesktopPlatform").newInstance();
                }
            } catch (Exception unused) {
            }
            if (mCurrentPlatform == null) {
                mCurrentPlatform = new UnknownPlatform();
            }
        }
        return mCurrentPlatform;
    }

    public static boolean isAndroid() {
        return "The Android Project".equalsIgnoreCase(System.getProperty("java.vendor"));
    }

    public static boolean isLinux() {
        return System.getProperty("os.name").contains("Linux") && !isAndroid();
    }

    public static boolean isMacOS() {
        return System.getProperty("os.name").contains("Mac OS X");
    }

    public static boolean isWindows() {
        return System.getProperty("os.name").contains("Windows");
    }

    public abstract long getSharedContextNativeHandle(Object obj);

    public abstract void log(String str);

    public abstract boolean validateSharedContext(Object obj);

    public abstract boolean validateStreamSource(Object obj);

    public abstract boolean validateSurface(Object obj);

    public abstract void warn(String str);
}
