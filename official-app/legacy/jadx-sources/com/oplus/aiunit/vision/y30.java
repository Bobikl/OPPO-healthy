package com.oplus.aiunit.vision;

import com.airbnb.lottie.LottieAnimationView;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0005"}, d2 = {"Lcom/airbnb/lottie/LottieAnimationView;", "lottieAnimationView", "", "a", "b", "entrance_release"}, k = 2, mv = {1, 8, 0})
public final class y30 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    public static final void a(@NotNull LottieAnimationView lottieAnimationView) {
        String str;
        Intrinsics.checkNotNullParameter(lottieAnimationView, "lottieAnimationView");
        String strC = k7l.c();
        if (strC != null) {
            switch (strC) {
                case "watchStarRiver":
                    str = "nfc_entrance_identify_scan_round.json";
                    break;
                case "watch4":
                    str = "nfc_entrance_identify_remote_scan_s.json";
                    break;
                case "watchStar":
                    str = "nfc_entrance_identify_half_scan.json";
                    break;
                case "band":
                    str = "nfc_entrance_identify_remote_scan_band.json";
                    break;
                case "rswatch":
                    str = "nfc_entrance_identify_remote_scan_rx.json";
                    break;
                default:
                    str = "nfc_entrance_identify_remote_scan.json";
                    break;
            }
        } else {
            str = "nfc_entrance_identify_remote_scan.json";
        }
        x50.b(lottieAnimationView, str, wrf.DEFAULT_IMAGES_DIR_NAME, -1, -1, true);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    public static final void b(@NotNull LottieAnimationView lottieAnimationView) {
        String str;
        Intrinsics.checkNotNullParameter(lottieAnimationView, "lottieAnimationView");
        String strC = k7l.c();
        if (strC == null) {
            str = "scan_card.json";
        } else {
            int iHashCode = strC.hashCode();
            if (iHashCode != -1556710709) {
                if (iHashCode != -794962619) {
                    if (iHashCode == -280674367 && strC.equals("watchStar")) {
                        str = "stick_when_read.json";
                    } else {
                        str = "scan_card.json";
                    }
                } else if (strC.equals("watch4")) {
                    str = "stick_when_read_s.json";
                } else {
                    str = "scan_card.json";
                }
            } else if (strC.equals("watchStarRiver")) {
                str = "stick_when_read_smart_round.json";
            } else {
                str = "scan_card.json";
            }
        }
        x50.b(lottieAnimationView, str, wrf.DEFAULT_IMAGES_DIR_NAME, -1, -1, true);
    }
}
