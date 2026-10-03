package androidx.camera.core.internal.utils;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import com.autonavi.amap.mapcore.tools.GlMapUtil;
import com.oplus.aiunit.vision.k18;
import com.oplus.aiunit.vision.weg;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class SizeUtil {
    public static final Size RESOLUTION_ZERO = new Size(0, 0);
    public static final Size RESOLUTION_QVGA = new Size(320, 240);
    public static final Size RESOLUTION_VGA = new Size(GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH, 480);
    public static final Size RESOLUTION_480P = new Size(720, 480);
    public static final Size RESOLUTION_720P = new Size(k18.GL_INVALID_ENUM, 720);
    public static final Size RESOLUTION_1080P = new Size(1920, 1080);
    public static final Size RESOLUTION_1440P = new Size(1920, weg.WINDOW_NIGHT_END);

    private SizeUtil() {
    }

    @Nullable
    public static <T> T findNearestHigherFor(@NonNull Size size, @NonNull TreeMap<Size, T> treeMap) {
        Map.Entry<Size, T> entryCeilingEntry = treeMap.ceilingEntry(size);
        if (entryCeilingEntry != null) {
            return entryCeilingEntry.getValue();
        }
        Map.Entry<Size, T> entryFloorEntry = treeMap.floorEntry(size);
        if (entryFloorEntry != null) {
            return entryFloorEntry.getValue();
        }
        return null;
    }

    public static int getArea(int i, int i2) {
        return i * i2;
    }

    @Nullable
    public static Size getMaxSize(@NonNull List<Size> list) {
        if (list.isEmpty()) {
            return null;
        }
        return (Size) Collections.max(list, new CompareSizesByArea());
    }

    public static boolean isLongerInAnyEdge(@NonNull Size size, @NonNull Size size2) {
        return size.getWidth() > size2.getWidth() || size.getHeight() > size2.getHeight();
    }

    public static boolean isSmallerByArea(@NonNull Size size, @NonNull Size size2) {
        return getArea(size) < getArea(size2);
    }

    public static int getArea(@NonNull Size size) {
        return getArea(size.getWidth(), size.getHeight());
    }
}
