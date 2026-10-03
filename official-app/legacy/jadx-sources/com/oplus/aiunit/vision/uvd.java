package com.oplus.aiunit.vision;

import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.coui.appcompat.dialog.COUIAlertDialogBuilder;
import com.heytap.health.base.permission.wxbpermission.PermissionRequestDialog;
import com.heytap.health.watchface.R$id;
import com.heytap.health.watchface.R$layout;
import com.heytap.health.watchface.R$string;

/* JADX INFO: loaded from: classes19.dex */
public class uvd {
    public static final String BUNDLE_FROM = "bundle_skip_from";
    public static final String BUNDLE_PATH_PHOTO = "bundle_path_photo";
    public static final String BUNDLE_WATCH_MAC = "bundle_watch_mac";
    public static final int FROM_DEFAULT = 0;
    public static final int FROM_WATCH_FACE_MANAGER = 1;
    public static final int REQUEST_CODE_RETRY_NET = 292;
    public static final String TAG = "OutfitsRouterUtil";

    public static class a {
        public static final uvd a = new uvd();
    }

    public interface b {
        void onSuccess();
    }

    public interface c {
        void request();
    }

    public static uvd b() {
        return a.a;
    }

    public static /* synthetic */ void d(b bVar, c cVar, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        boolean zD = PermissionRequestDialog.D(6, "android.permission.CAMERA");
        ltl.a(TAG, "[jumpToOpenCamera] hasPermissions =  " + zD);
        if (!zD) {
            cVar.request();
        } else if (bVar != null) {
            bVar.onSuccess();
        }
    }

    public void c(AppCompatActivity appCompatActivity, final b bVar, final c cVar) {
        ltl.d(TAG, "[jumpToOpenCamera] ");
        boolean zF = n9g.f(appCompatActivity);
        ltl.a(TAG, "[jumpToOpenCamera] isFirstGuideFlag " + zF);
        if (zF) {
            View viewInflate = View.inflate(appCompatActivity, R$layout.watch_face_dialog_outfits_guide, null);
            TextView textView = (TextView) viewInflate.findViewById(R$id.tv_pop_content);
            TextView textView2 = (TextView) viewInflate.findViewById(R$id.tv_camera_tips);
            boolean zD = PermissionRequestDialog.D(6, "android.permission.CAMERA");
            textView.setText(zD ? R$string.watch_face_outfits_dialog_take_photo_tips : R$string.watch_face_outfits_dialog_no_permission_tips);
            textView2.setVisibility(zD ? 8 : 0);
            new COUIAlertDialogBuilder(appCompatActivity).setView(viewInflate).setPositiveButton(R$string.watch_face_outfits_dialog_have_try, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.tvd
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    uvd.d(bVar, cVar, dialogInterface, i);
                }
            }).show();
            n9g.u(appCompatActivity, false);
            return;
        }
        boolean zD2 = PermissionRequestDialog.D(6, "android.permission.CAMERA");
        ltl.a(TAG, "[jumpToOpenCamera] hasPermissions " + zD2);
        if (!zD2) {
            cVar.request();
        } else if (bVar != null) {
            bVar.onSuccess();
        }
    }

    public uvd() {
    }
}
