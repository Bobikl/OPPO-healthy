package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import android.util.Size;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.Quirk;
import com.autonavi.amap.mapcore.tools.GlMapUtil;
import com.oplus.aiunit.vision.weg;

/* JADX INFO: loaded from: classes.dex */
public class StretchedVideoResolutionQuirk implements Quirk {
    private static boolean isMotoE5Play() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean load() {
        return isMotoE5Play();
    }

    @Nullable
    public Size getAlternativeResolution(int i) {
        if (i == 4) {
            return new Size(GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH, 480);
        }
        if (i == 5) {
            return new Size(960, 720);
        }
        if (i != 6) {
            return null;
        }
        return new Size(weg.WINDOW_NIGHT_END, 1080);
    }
}
