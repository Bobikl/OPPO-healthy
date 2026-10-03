package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.health.watchface.adaptation.base.BaseWatchFaceBean;
import com.heytap.health.watchface.adaptation.common.ConfigHolder;

/* JADX INFO: loaded from: classes19.dex */
public class sd4 {
    public static int a(i11 i11Var, String str) {
        return b(i11Var, str, "");
    }

    public static int b(i11 i11Var, String str, String str2) {
        ConfigHolder configHolderE = i11Var.e();
        if (!TextUtils.isEmpty(str2) && str2.startsWith(y04.ALBUM_V2_BASE_NAME)) {
            return 9;
        }
        if (!TextUtils.isEmpty(str2) && str2.startsWith(y04.LIVEPHOTO_BASE_NAME)) {
            return 10;
        }
        if (!TextUtils.isEmpty(str2) && str2.startsWith(y04.DOF_BASE_NAME)) {
            return 11;
        }
        if (TextUtils.equals(str, configHolderE.getAlbumWfUnique())) {
            return 4;
        }
        if (TextUtils.equals(str, configHolderE.getOutfitWfUnique())) {
            return 1;
        }
        if (TextUtils.equals(str, configHolderE.getHandPaintWfUnique())) {
            return 2;
        }
        if (TextUtils.equals(str, configHolderE.getClassicWfUnique())) {
            return 5;
        }
        if (TextUtils.equals(str, configHolderE.getWallpaperWfUnique())) {
            return 3;
        }
        if (TextUtils.equals(str, configHolderE.getAodWfUnique())) {
            return 6;
        }
        if (TextUtils.equals(str, configHolderE.getOmojiWfUnique())) {
            return 7;
        }
        return TextUtils.equals(str, configHolderE.getVideoWfUnique()) ? 8 : 0;
    }

    public static String c(i11 i11Var, int i) {
        BaseWatchFaceBean baseWatchFaceBeanA = ial.a(i11Var, d(i11Var, i));
        if (baseWatchFaceBeanA != null) {
            return baseWatchFaceBeanA.getStyleUnique();
        }
        return null;
    }

    public static String d(i11 i11Var, int i) {
        if (i11Var == null) {
            ltl.a("CreationInfoHelper", "[getUniqueIdByCreationType] currentDataManager =null");
            return "";
        }
        ConfigHolder configHolderE = i11Var.e();
        switch (i) {
            case 1:
                return configHolderE.getOutfitWfUnique();
            case 2:
                return configHolderE.getHandPaintWfUnique();
            case 3:
                return configHolderE.getWallpaperWfUnique();
            case 4:
                return configHolderE.getAlbumWfUnique();
            case 5:
                return configHolderE.getClassicWfUnique();
            case 6:
                return configHolderE.getAodWfUnique();
            case 7:
                return configHolderE.getOmojiWfUnique();
            case 8:
                return configHolderE.getVideoWfUnique();
            default:
                ltl.b("CreationInfoHelper", "[getUniqueIdByCreationType]--> wrong creation type");
                return "";
        }
    }

    public static boolean e(i11 i11Var, String str) {
        return f(i11Var, str, "");
    }

    public static boolean f(i11 i11Var, String str, String str2) {
        ConfigHolder configHolderE = i11Var.e();
        return TextUtils.equals(str, configHolderE.getAlbumWfUnique()) || TextUtils.equals(str, configHolderE.getOutfitWfUnique()) || TextUtils.equals(str, configHolderE.getHandPaintWfUnique()) || TextUtils.equals(str, configHolderE.getClassicWfUnique()) || TextUtils.equals(str, configHolderE.getWallpaperWfUnique()) || TextUtils.equals(str, configHolderE.getAodWfUnique()) || TextUtils.equals(str, configHolderE.getOmojiWfUnique()) || TextUtils.equals(str, configHolderE.getVideoWfUnique()) || (!TextUtils.isEmpty(str2) && y04.INSTANCE.x(str2));
    }
}
