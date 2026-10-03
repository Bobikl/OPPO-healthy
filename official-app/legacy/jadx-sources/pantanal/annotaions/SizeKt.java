package pantanal.annotaions;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toSizeString", "", "", "pantanal-interface_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SizeKt {
    @NotNull
    public static final String toSizeString(int i) {
        switch (i) {
            case 1:
                return "2x2";
            case 2:
                return "2x4";
            case 3:
                return "4x4";
            case 4:
                return "Nx2";
            case 5:
                return "1x2";
            case 6:
                return "widget1x1";
            case 7:
                return "sm";
            case 8:
                return "md";
            case 9:
                return "lg";
            case 10:
                return "1x1";
            default:
                return "Unknown";
        }
    }
}
