package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.Quirk;
import com.oplus.aiunit.vision.weg;

/* JADX INFO: loaded from: classes.dex */
public class ExtraSupportedOutputSizeQuirk implements Quirk {
    @NonNull
    private Size[] getMotoE5PlayExtraSupportedResolutions() {
        return new Size[]{new Size(weg.WINDOW_NIGHT_END, 1080), new Size(960, 720)};
    }

    private static boolean isMotoE5Play() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean load() {
        return isMotoE5Play();
    }

    @NonNull
    public Size[] getExtraSupportedResolutions(int i) {
        return (i == 34 && isMotoE5Play()) ? getMotoE5PlayExtraSupportedResolutions() : new Size[0];
    }

    @NonNull
    public <T> Size[] getExtraSupportedResolutions(@NonNull Class<T> cls) {
        return (StreamConfigurationMap.isOutputSupportedFor(cls) && isMotoE5Play()) ? getMotoE5PlayExtraSupportedResolutions() : new Size[0];
    }
}
