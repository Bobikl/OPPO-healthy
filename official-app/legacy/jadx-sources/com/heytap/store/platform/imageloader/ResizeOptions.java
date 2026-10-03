package com.heytap.store.platform.imageloader;

import com.heytap.nearx.tangramconfig.strategy.Fields;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0003J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/heytap/store/platform/imageloader/ResizeOptions;", "", Fields.WIDTH_FIELD, "", Fields.HEIGHT_FIELD, "(II)V", "getHeight", "()I", "getWidth", "wrapSize", "getWrapSize", "setWrapSize", "(I)V", "wrapType", "getWrapType", "setWrapType", "setWrap", "", "Companion", "ImageLoader_release"}, k = 1, mv = {1, 4, 0})
public final class ResizeOptions {
    private static final int FIXED_RESIZE = 0;
    private final int height;
    private final int width;
    private int wrapSize;
    private int wrapType = FIXED_RESIZE;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int FIXED_HEIGHT = 1;
    private static final int FIXED_WIDTH = 2;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u001c\u0010\u000b\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/heytap/store/platform/imageloader/ResizeOptions$Companion;", "", "()V", "FIXED_HEIGHT", "", "getFIXED_HEIGHT$annotations", "getFIXED_HEIGHT", "()I", "FIXED_RESIZE", "getFIXED_RESIZE$annotations", "getFIXED_RESIZE", "FIXED_WIDTH", "getFIXED_WIDTH$annotations", "getFIXED_WIDTH", "ImageLoader_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getFIXED_HEIGHT$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getFIXED_RESIZE$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getFIXED_WIDTH$annotations() {
        }

        public final int getFIXED_HEIGHT() {
            return ResizeOptions.FIXED_HEIGHT;
        }

        public final int getFIXED_RESIZE() {
            return ResizeOptions.FIXED_RESIZE;
        }

        public final int getFIXED_WIDTH() {
            return ResizeOptions.FIXED_WIDTH;
        }
    }

    public ResizeOptions(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public static final int getFIXED_HEIGHT() {
        return FIXED_HEIGHT;
    }

    public static final int getFIXED_RESIZE() {
        return FIXED_RESIZE;
    }

    public static final int getFIXED_WIDTH() {
        return FIXED_WIDTH;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getWrapSize() {
        return this.wrapSize;
    }

    public final int getWrapType() {
        return this.wrapType;
    }

    public final void setWrap(int wrapSize, int wrapType) {
        this.wrapSize = wrapSize;
        this.wrapType = wrapType;
    }

    public final void setWrapSize(int i) {
        this.wrapSize = i;
    }

    public final void setWrapType(int i) {
        this.wrapType = i;
    }

    public final void setWrap(int wrapType) {
        this.wrapType = wrapType;
    }
}
