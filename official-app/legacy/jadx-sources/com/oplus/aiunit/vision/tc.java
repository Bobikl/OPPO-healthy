package com.oplus.aiunit.vision;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.oplus.accountsdk.open.R$id;
import com.oplus.accountsdk.open.R$layout;

/* JADX INFO: loaded from: classes6.dex */
public class tc {
    public static void a(@Nullable Activity activity) {
        ViewGroup viewGroup;
        View viewFindViewById;
        if (activity == null || activity.isFinishing() || (viewFindViewById = (viewGroup = (ViewGroup) activity.getWindow().getDecorView()).findViewById(R$id.ac_open_camera_permission_explanation_root)) == null) {
            return;
        }
        viewGroup.removeView(viewFindViewById);
        bn.b("CameraPermExplanation", "dismiss camera permission explanation overlay");
    }

    public static void b(@Nullable Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        if (viewGroup.findViewById(R$id.ac_open_camera_permission_explanation_root) != null) {
            return;
        }
        viewGroup.addView(LayoutInflater.from(activity).inflate(R$layout.ac_open_layout_camera_permission_explanation, viewGroup, false));
        bn.b("CameraPermExplanation", "show camera permission explanation overlay");
    }
}
