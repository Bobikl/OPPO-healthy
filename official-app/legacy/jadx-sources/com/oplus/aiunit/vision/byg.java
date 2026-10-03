package com.oplus.aiunit.vision;

import android.content.res.Resources;
import android.graphics.Color;
import android.view.View;
import com.oplus.view.OplusView;
import com.support.appcompat.R$attr;
import com.support.appcompat.R$dimen;
import com.support.appcompat.R$integer;

/* JADX INFO: loaded from: classes13.dex */
public class byg {
    public static final int SDK_SUB_VERSION = 2;
    public static final int SDK_VERSION = 34;
    public static final int SHADOW_LV1 = 0;
    public static final int SHADOW_LV2 = 1;
    public static final int SHADOW_LV3 = 2;
    public static final int SHADOW_LV4 = 3;
    public static final int SHADOW_LV5 = 4;

    public static boolean a() {
        return bn2.b(34, 2);
    }

    public static void b(View view) {
        if (a()) {
            i(view, 0, 0, 0, 0, 0, -1);
        } else {
            h(view, 0, 0, 0);
        }
    }

    public static void c(View view, int i, int i2) {
        d(view, i, i2, lh2.a(view.getContext(), R$attr.couiColorPrimary));
    }

    public static void d(View view, int i, int i2, int i3) {
        if (view == null) {
            bj2.c("ShadowUtils", "setElevationToFloatingActionButton target view is null");
            return;
        }
        if (i3 == -1) {
            i3 = lh2.a(view.getContext(), R$attr.couiColorPrimary);
        }
        if (!a()) {
            h(view, i, i2, view.getResources().getDimensionPixelOffset(R$dimen.support_shadow_size_level_for_lowerP));
        } else {
            Resources resources = view.getContext().getResources();
            i(view, resources.getDimensionPixelSize(R$dimen.coui_float_btn_shadow_elevation), Color.argb(resources.getInteger(R$integer.coui_shadow_color_float_btn), Color.red(i3), Color.green(i3), Color.blue(i3)), resources.getDimensionPixelSize(R$dimen.coui_float_btn_shadow_light_y), resources.getDimensionPixelSize(R$dimen.coui_float_btn_shadow_light_z), resources.getDimensionPixelSize(R$dimen.coui_float_btn_shadow_light_r), resources.getDimensionPixelSize(R$dimen.coui_float_btn_shadow_blur_r));
        }
    }

    public static void e(View view, int i) {
        g(view, i, 0, 0, 0);
    }

    public static void f(View view, int i, int i2, int i3) {
        g(view, i, i2, view.getResources().getDimensionPixelOffset(R$dimen.support_shadow_size_level_for_lowerP), i3);
    }

    public static void g(View view, int i, int i2, int i3, int i4) {
        if (view == null) {
            bj2.c("ShadowUtils", "setElevationToView view is null");
            return;
        }
        if (!a()) {
            h(view, i2, i4, i3);
            return;
        }
        Resources resources = view.getContext().getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.coui_shadow_elevation_default);
        if (i == 0) {
            i(view, dimensionPixelSize, Color.argb(resources.getInteger(R$integer.coui_shadow_color_lv1), 0, 0, 0), resources.getDimensionPixelSize(R$dimen.coui_shadow_light_y_level1), resources.getDimensionPixelSize(R$dimen.coui_shadow_light_z_level1), resources.getDimensionPixelSize(R$dimen.coui_shadow_light_r_level1), resources.getDimensionPixelSize(R$dimen.coui_shadow_blur_r_level1));
            return;
        }
        if (i == 1) {
            i(view, dimensionPixelSize, Color.argb(resources.getInteger(R$integer.coui_shadow_color_lv2), 0, 0, 0), resources.getDimensionPixelSize(R$dimen.coui_shadow_light_y_level2), resources.getDimensionPixelSize(R$dimen.coui_shadow_light_z_level2), resources.getDimensionPixelSize(R$dimen.coui_shadow_light_r_level2), resources.getDimensionPixelSize(R$dimen.coui_shadow_blur_r_level2));
            return;
        }
        if (i == 2) {
            i(view, dimensionPixelSize, Color.argb(resources.getInteger(R$integer.coui_shadow_color_lv3), 0, 0, 0), resources.getDimensionPixelSize(R$dimen.coui_shadow_light_y_level3), resources.getDimensionPixelSize(R$dimen.coui_shadow_light_z_level3), resources.getDimensionPixelSize(R$dimen.coui_shadow_light_r_level3), resources.getDimensionPixelSize(R$dimen.coui_shadow_blur_r_level3));
        } else if (i == 3) {
            i(view, resources.getDimensionPixelSize(R$dimen.coui_shadow_elevation_four), Color.argb(resources.getInteger(R$integer.coui_shadow_color_lv4), 0, 0, 0), resources.getDimensionPixelSize(R$dimen.coui_shadow_light_y_level4), resources.getDimensionPixelSize(R$dimen.coui_shadow_light_z_level4), resources.getDimensionPixelSize(R$dimen.coui_shadow_light_r_level4), resources.getDimensionPixelSize(R$dimen.coui_shadow_blur_r_level4));
        } else if (i == 4) {
            i(view, resources.getDimensionPixelSize(R$dimen.coui_shadow_elevation_five), Color.argb(resources.getInteger(R$integer.coui_shadow_color_lv5), 0, 0, 0), resources.getDimensionPixelSize(R$dimen.coui_shadow_light_y_level5), resources.getDimensionPixelSize(R$dimen.coui_shadow_light_z_level5), resources.getDimensionPixelSize(R$dimen.coui_shadow_light_r_level5), resources.getDimensionPixelSize(R$dimen.coui_shadow_blur_r_level5));
        }
    }

    public static void h(View view, int i, int i2, int i3) {
        if (view == null) {
            return;
        }
        view.setOutlineSpotShadowColor(i2);
        view.setElevation(i);
    }

    public static void i(View view, int i, int i2, int i3, int i4, int i5, int i6) {
        if (view != null && a()) {
            view.setOutlineAmbientShadowColor(i2);
            view.setOutlineSpotShadowColor(i2);
            view.setElevation(i);
            try {
                new OplusView(view).setOverrideLightSourceGeometry(-1.0f, i3, i4, i5, i6);
            } catch (Exception e2) {
                bj2.a("ShadowUtils", "setOverrideLightSourceGeometry error:" + e2.getMessage());
            }
        }
    }
}
