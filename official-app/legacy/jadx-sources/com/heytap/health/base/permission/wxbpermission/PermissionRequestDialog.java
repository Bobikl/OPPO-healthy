package com.heytap.health.base.permission.wxbpermission;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.HtmlCompat;
import androidx.fragment.app.FragmentManager;
import com.alibaba.android.arouter.facade.Postcard;
import com.coui.appcompat.button.COUIButton;
import com.coui.appcompat.panel.COUIBottomSheetDialog;
import com.coui.appcompat.snackbar.COUISnackBar;
import com.heytap.health.base.R$id;
import com.heytap.health.base.R$layout;
import com.heytap.health.base.R$plurals;
import com.heytap.health.base.R$string;
import com.heytap.health.base.permission.wxbpermission.PermissionRequestDialog;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.base.ui.dialog.HealthAlertDialogBuilder;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.dge;
import com.oplus.aiunit.vision.gee;
import com.oplus.aiunit.vision.hx9;
import com.oplus.aiunit.vision.iee;
import com.oplus.aiunit.vision.ilj;
import com.oplus.aiunit.vision.msg;
import com.oplus.aiunit.vision.op;
import com.oplus.aiunit.vision.qe0;
import com.oplus.aiunit.vision.rb8;
import com.oplus.aiunit.vision.t8b;
import com.oplus.aiunit.vision.v9g;
import com.oplus.aiunit.vision.x0;
import com.oplus.aiunit.vision.y0k;
import com.oplus.aiunit.vision.yr5;
import com.support.panel.R$style;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p010kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public class PermissionRequestDialog {
    public static final String WXB = "WXB";
    public final b a;
    public final List<String> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Dialog f3193c;
    public ExplanationDialogKind d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3194e;
    public final com.heytap.health.base.permission.a.InterfaceC0290a f;
    public com.heytap.health.base.permission.wxbpermission.a g;

    public enum ExplanationDialogKind {
        MAIN_ALERT,
        SECONDARY_EXPLANATION
    }

    public class a implements com.heytap.health.base.permission.a.InterfaceC0290a {
        public a() {
        }

        @Override // com.heytap.health.base.permission.a.InterfaceC0290a
        public void a(@NonNull List<String> list, @NonNull List<String> list2) {
            rb8.a(list, list2);
            b(list2);
            c(list);
        }

        public final void b(List<String> list) {
            if (list == null || list.isEmpty()) {
                return;
            }
            if (PermissionRequestDialog.this.a.h != null) {
                PermissionRequestDialog.this.a.h.Z5();
            }
            PermissionRequestDialog.this.n0(list, true);
        }

        public final void c(List<String> list) {
            if (list == null) {
                return;
            }
            Context contextA = b78.a();
            Intent intent = new Intent("com.heytap.health.action_permission_granted");
            intent.putExtra("granted_list", (String[]) list.toArray(new String[0]));
            intent.setPackage(contextA.getPackageName());
            StringBuilder sb = new StringBuilder();
            sb.append("Broadcast action permission granted: ");
            sb.append(list);
            contextA.sendBroadcast(intent);
            if (list.size() == PermissionRequestDialog.this.b.size()) {
                PermissionRequestDialog.this.a.h.Y1();
            }
        }
    }

    public static class b {
        public final AppCompatActivity a;
        public final int b;
        public d h;
        public e i;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f3195c = b78.a().getString(R$string.lib_base_sports_permission_notice_t);
        public String d = b78.a().getString(R$string.lib_base_not_yet);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f3196e = b78.a().getString(R$string.lib_base_sports_permission_notice_pb);
        public final Map<String, c> f = new HashMap();
        public String[] g = new String[0];

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f3197j = false;
        public boolean k = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public View f3198l = null;
        public Boolean m = Boolean.FALSE;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f3199n = false;

        public b(AppCompatActivity appCompatActivity, int i) {
            this.a = appCompatActivity;
            this.b = i;
        }

        public b p(boolean z) {
            this.k = z;
            return this;
        }

        public b q(boolean z) {
            this.f3199n = z;
            return this;
        }

        public b r(d dVar) {
            this.h = dVar;
            return this;
        }

        public b s(e eVar) {
            this.i = eVar;
            return this;
        }

        public b t(String[] strArr) {
            this.g = strArr;
            return this;
        }

        public b u(View view) {
            this.f3198l = view;
            return this;
        }

        public b v(boolean z) {
            this.f3197j = z;
            return this;
        }

        public b w(Boolean bool) {
            this.m = bool;
            return this;
        }

        public PermissionRequestDialog x() {
            PermissionRequestDialog permissionRequestDialog = new PermissionRequestDialog(this);
            permissionRequestDialog.l0();
            return permissionRequestDialog;
        }
    }

    public static class c {
        public final String a;
        public final String b;

        public c(String str, String str2) {
            this.a = str2;
            this.b = str;
        }
    }

    public interface d {
        void Y1();

        void Z5();
    }

    public interface e {
        void a();
    }

    public static class f {
        public final Context a = b78.a();

        public boolean a(int i, String str) {
            boolean zB;
            boolean zD;
            boolean zC = msg.a().c();
            str.hashCode();
            switch (str) {
                case "android.permission.ACCESS_FINE_LOCATION":
                case "android.permission.ACCESS_COARSE_LOCATION":
                case "android.permission.ACCESS_BACKGROUND_LOCATION":
                    zB = b(i, zC);
                    zD = d(str);
                    break;
                case "android.permission.READ_MEDIA_VISUAL_USER_SELECTED":
                case "android.permission.READ_MEDIA_IMAGES":
                case "android.permission.READ_MEDIA_VIDEO":
                    zB = v9g.x(PermissionRequestDialog.WXB).r(PermissionRequestDialog.N(i, str), zC);
                    if (rb8.b(str) < 100) {
                        zD = false;
                        break;
                    } else {
                        zD = true;
                        break;
                    }
                    break;
                case "android.permission.READ_EXTERNAL_STORAGE":
                    zB = c(i, zC);
                    zD = e();
                    if (Build.VERSION.SDK_INT >= 33) {
                        return true;
                    }
                    break;
                case "android.permission.WRITE_EXTERNAL_STORAGE":
                    zB = c(i, zC);
                    zD = e();
                    if (Build.VERSION.SDK_INT > 29 || !ilj.E()) {
                        return true;
                    }
                    break;
                default:
                    zB = v9g.x(PermissionRequestDialog.WXB).r(PermissionRequestDialog.N(i, str), zC);
                    zD = dge.a(this.a, str);
                    break;
            }
            a7b.f("PermissionRequestDialog", "check featureId:" + i + ",appFlag:" + zB + ",systemFlag:" + zD + ",permission:" + str);
            return zB && zD;
        }

        public final boolean b(int i, boolean z) {
            return v9g.x(PermissionRequestDialog.WXB).r(PermissionRequestDialog.N(i, "LOCATION"), z);
        }

        public final boolean c(int i, boolean z) {
            return v9g.x(PermissionRequestDialog.WXB).r(PermissionRequestDialog.N(i, "android.permission.READ_EXTERNAL_STORAGE"), z) || v9g.x(PermissionRequestDialog.WXB).r(PermissionRequestDialog.N(i, "android.permission.WRITE_EXTERNAL_STORAGE"), z);
        }

        @SuppressLint({"ObsoleteSdkInt"})
        public final boolean d(String str) {
            str.hashCode();
            switch (str) {
                case "android.permission.ACCESS_FINE_LOCATION":
                    if (Build.VERSION.SDK_INT >= 31) {
                        return dge.a(this.a, str);
                    }
                    break;
                case "android.permission.ACCESS_COARSE_LOCATION":
                    break;
                case "android.permission.ACCESS_BACKGROUND_LOCATION":
                    return dge.a(this.a, str);
                default:
                    return false;
            }
            return dge.a(this.a, "android.permission.ACCESS_BACKGROUND_LOCATION") || dge.a(this.a, "android.permission.ACCESS_FINE_LOCATION") || dge.a(this.a, "android.permission.ACCESS_COARSE_LOCATION");
        }

        public final boolean e() {
            return dge.a(this.a, "android.permission.READ_EXTERNAL_STORAGE") || dge.a(this.a, "android.permission.WRITE_EXTERNAL_STORAGE");
        }
    }

    public final class g implements com.heytap.health.base.permission.wxbpermission.a.b {
        @Override // com.heytap.health.base.permission.wxbpermission.a.b
        public boolean a() {
            return PermissionRequestDialog.this.d != null;
        }

        @Override // com.heytap.health.base.permission.wxbpermission.a.b
        public boolean b() {
            if (PermissionRequestDialog.this.a == null || PermissionRequestDialog.this.a.a == null) {
                return true;
            }
            AppCompatActivity appCompatActivity = PermissionRequestDialog.this.a.a;
            if (appCompatActivity.isFinishing()) {
                return true;
            }
            return appCompatActivity.isDestroyed();
        }

        @Override // com.heytap.health.base.permission.wxbpermission.a.b
        public AppCompatActivity c() {
            if (PermissionRequestDialog.this.a != null) {
                return PermissionRequestDialog.this.a.a;
            }
            return null;
        }

        @Override // com.heytap.health.base.permission.wxbpermission.a.b
        public void d() {
            PermissionRequestDialog.this.e0();
        }

        @Override // com.heytap.health.base.permission.wxbpermission.a.b
        public void e(boolean z) {
            if (z) {
                PermissionRequestDialog.this.o0();
            } else {
                PermissionRequestDialog.this.f3193c = null;
            }
            PermissionRequestDialog.this.d = null;
            PermissionRequestDialog.this.g = null;
        }

        public g() {
        }
    }

    public static boolean D(int i, String str) {
        return new f().a(i, str);
    }

    public static boolean E(int i, String str) {
        return v9g.x(WXB).n(N(i, F(str)));
    }

    public static String F(String str) {
        str.hashCode();
        switch (str) {
            case "android.permission.ACCESS_FINE_LOCATION":
            case "android.permission.ACCESS_COARSE_LOCATION":
            case "android.permission.ACCESS_BACKGROUND_LOCATION":
                return "LOCATION";
            default:
                return str;
        }
    }

    public static boolean I(int i, String str) {
        return v9g.x(WXB).r(N(i, F(str)), false);
    }

    public static String N(int i, String str) {
        return i + "_" + str;
    }

    public static /* synthetic */ Boolean O(int i, String str) {
        return Boolean.valueOf(E(i, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P(DialogInterface dialogInterface, int i) {
        j0(false);
        if (this.a.h != null) {
            this.a.h.Z5();
        }
        G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q(DialogInterface dialogInterface, int i) {
        j0(true);
        g0();
        G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R(DialogInterface dialogInterface, int i) {
        G();
        j0(false);
        if (this.a.h != null) {
            this.a.h.Z5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S(DialogInterface dialogInterface, int i) {
        j0(true);
        g0();
        G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T(View view) {
        j0(true);
        g0();
        G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U(View view) {
        j0(false);
        if (this.a.h != null) {
            this.a.h.Z5();
        }
        G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean V(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        if (this.a.h != null) {
            this.a.h.Z5();
        }
        G();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W(com.heytap.health.base.permission.wxbpermission.a aVar) {
        try {
            K();
        } finally {
            aVar.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X(List list, boolean z, final List list2) {
        Activity activityO = op.n().o();
        if (activityO != null) {
            this.a.f3198l = activityO.findViewById(R.id.content);
        }
        if (this.a.f3198l == null) {
            y0k.i(C(list, z));
            return;
        }
        COUISnackBar cOUISnackBarW = COUISnackBar.w(this.a.f3198l, C(list, z), 3000);
        cOUISnackBarW.y(b78.a().getString(R$string.lib_base_sport_auth), new View.OnClickListener() { // from class: com.oplus.aiunit.vision.qfe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.Y(list2, view);
            }
        });
        cOUISnackBarW.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y(List list, View view) {
        if (I(this.a.b, this.b.get(0))) {
            p0(list);
            return;
        }
        Postcard postcardWithInt = x0.d().b("/settings/FeaturePermissionDetailActivity").withString("feature_name", iee.f(this.a.b)).withInt("feature_id", this.a.b);
        t8b.c(postcardWithInt);
        if (!this.a.a.getClass().getName().equals(postcardWithInt.getDestination().getName())) {
            postcardWithInt.navigation();
        } else {
            a7b.f("PermissionRequestDialog", "already in FeaturePermissionDetail");
            p0(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z() {
        if (this.f3193c.isShowing()) {
            this.f3193c.dismiss();
        }
        this.f3193c = null;
    }

    public static void i0(int i, String str, boolean z) {
        v9g.x(WXB).W(N(i, F(str)), z);
    }

    public final void A(View view) {
        if (this.a.f3199n) {
            int color = Color.parseColor("#E5FFFFFF");
            int color2 = Color.parseColor("#8CFFFFFF");
            TextView textView = (TextView) view.findViewById(R$id.dialog_title);
            if (textView != null) {
                textView.setTextColor(color);
            }
            TextView textView2 = (TextView) view.findViewById(R$id.dialog_sub_title);
            if (textView2 != null) {
                textView2.setTextColor(color2);
            }
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R$id.contents);
            if (linearLayout == null) {
                return;
            }
            for (int i = 0; i < linearLayout.getChildCount(); i++) {
                View childAt = linearLayout.getChildAt(i);
                TextView textView3 = (TextView) childAt.findViewById(R$id.content_title);
                if (textView3 != null) {
                    textView3.setTextColor(color);
                }
                TextView textView4 = (TextView) childAt.findViewById(R$id.content_content);
                if (textView4 != null) {
                    textView4.setTextColor(color2);
                }
            }
        }
    }

    public final void B(@NonNull Dialog dialog) {
        com.heytap.health.base.permission.wxbpermission.a aVar = this.g;
        if (aVar == null || !aVar.n()) {
            return;
        }
        aVar.i(dialog);
    }

    public final String C(List<String> list, boolean z) {
        StringBuilder sb = new StringBuilder();
        if (list.size() == 1) {
            y(sb, b78.a().getString(z ? R$string.lib_base_auth_system_setting_1 : R$string.lib_base_perms_change_perms_in_settings_has_permission_1), list);
        } else if (list.size() == 2) {
            y(sb, b78.a().getString(z ? R$string.lib_base_auth_system_setting_2 : R$string.lib_base_perms_change_perms_in_settings_has_permission_2), list);
        } else if (list.size() == 3) {
            y(sb, b78.a().getString(z ? R$string.lib_base_auth_system_setting_3 : R$string.lib_base_perms_change_perms_in_settings_has_permission_3), list);
        } else if (list.size() == 4) {
            y(sb, b78.a().getString(z ? R$string.lib_base_auth_system_setting_4 : R$string.lib_base_perms_change_perms_in_settings_has_permission_4), list);
        } else if (list.size() == 5) {
            y(sb, b78.a().getString(z ? R$string.lib_base_auth_system_setting_5 : R$string.lib_base_perms_change_perms_in_settings_has_permission_5), list);
        } else if (list.size() == 6) {
            y(sb, b78.a().getString(z ? R$string.lib_base_auth_system_setting_6 : R$string.lib_base_perms_change_perms_in_settings_has_permission_6), list);
        }
        return sb.toString();
    }

    public void G() {
        com.heytap.health.base.permission.wxbpermission.a aVar = this.g;
        if (aVar != null) {
            aVar.x();
        }
        this.d = null;
        o0();
        this.g = null;
    }

    public final List<String> H() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.f.entrySet().iterator();
        while (it.hasNext()) {
            String str = (String) ((Map.Entry) it.next()).getKey();
            if (!D(this.a.b, str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    @NonNull
    public final com.heytap.health.base.permission.wxbpermission.a J() {
        if (this.g == null) {
            this.g = new com.heytap.health.base.permission.wxbpermission.a(new g());
        }
        return this.g;
    }

    public final void K() {
        if (this.d == null || this.a.a == null) {
            return;
        }
        View viewInflate = LayoutInflater.from(this.a.a).inflate(hx9.b(this.a.a) ? R$layout.lib_base_dialog_permission_in_secondary : R$layout.lib_base_perms_granted, (ViewGroup) null);
        M(viewInflate);
        A(viewInflate);
        ExplanationDialogKind explanationDialogKind = this.d;
        if (explanationDialogKind == ExplanationDialogKind.SECONDARY_EXPLANATION) {
            Dialog dialogD0 = d0(viewInflate, this.f3194e);
            this.f3193c = dialogD0;
            dialogD0.setCancelable(false);
            x(this.f3193c);
            B(this.f3193c);
            this.f3193c.show();
        } else if (explanationDialogKind == ExplanationDialogKind.MAIN_ALERT) {
            AlertDialog alertDialogC0 = c0(viewInflate, this.f3194e);
            this.f3193c = alertDialogC0;
            B(alertDialogC0);
            this.f3193c.show();
        }
        Dialog dialog = this.f3193c;
        if (dialog != null) {
            b0(dialog);
        }
    }

    public final void L(HashMap<String, String> map, View view, LinearLayout linearLayout) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            w(view, new c(entry.getKey(), entry.getValue()), linearLayout);
        }
    }

    public final void M(View view) {
        if (this.a == null) {
            a7b.b("PermissionRequestDialog", "builder == null, do nothing");
            return;
        }
        ((TextView) view.findViewById(R$id.dialog_title)).setVisibility(8);
        TextView textView = (TextView) view.findViewById(R$id.dialog_sub_title);
        textView.setVisibility(0);
        textView.setText(view.getContext().getResources().getQuantityString(R$plurals.lib_base_perms_change_perms_in_settings, Math.max(this.b.size(), 1)));
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R$id.contents);
        HashMap<String, String> map = new HashMap<>();
        Iterator<String> it = this.b.iterator();
        while (it.hasNext()) {
            c cVar = (c) this.a.f.get(it.next());
            if (cVar != null) {
                map.put(cVar.b, cVar.a);
            }
        }
        L(map, view, linearLayout);
    }

    public final void a0() {
        if (this.a.g == null || this.a.g.length == 0) {
            return;
        }
        for (String str : this.a.g) {
            String[] strArrB = PermissionExplanation.b(str, this.a.b);
            if (strArrB != null) {
                this.a.f.put(str, new c(strArrB[0], strArrB[1]));
            }
        }
    }

    public final void b0(@NonNull Dialog dialog) {
        b bVar;
        if (Build.VERSION.SDK_INT < 30 || (bVar = this.a) == null || bVar.a == null) {
            return;
        }
        final int i = this.a.b;
        final String str = this.b.get(0);
        this.a.a.registerActivityLifecycleCallbacks(new yr5(this.a.a, dialog, new Function0() { // from class: com.oplus.aiunit.vision.rfe
            @Override // p010kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PermissionRequestDialog.O(i, str);
            }
        }));
    }

    @NonNull
    public final AlertDialog c0(@NonNull View view, boolean z) {
        AlertDialog.Builder view2 = new HealthAlertDialogBuilder(this.a.a).setView(view);
        view2.setTitle(this.a.f3195c);
        return z ? view2.setNegativeButton(this.a.d, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.mfe
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.i.P(dialogInterface, i);
            }
        }).setPositiveButton(this.a.a.getString(R$string.lib_base_sports_permission_step_per_pb), new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.nfe
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.i.Q(dialogInterface, i);
            }
        }).setCancelable(false).create() : view2.setNegativeButton(this.a.d, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.ofe
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.i.R(dialogInterface, i);
            }
        }).setPositiveButton(this.a.f3196e, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.pfe
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.i.S(dialogInterface, i);
            }
        }).setCancelable(false).create();
    }

    @NonNull
    public final Dialog d0(@NonNull View view, boolean z) {
        TextView textView = (TextView) view.findViewById(R$id.dialog_title);
        textView.setVisibility(0);
        textView.setText(this.a.f3195c);
        COUIButton cOUIButton = (COUIButton) view.findViewById(R$id.btn_confirm);
        COUIButton cOUIButton2 = (COUIButton) view.findViewById(R$id.btn_reject);
        if (z) {
            cOUIButton.setText(R$string.lib_base_sports_permission_step_per_pb);
        } else {
            cOUIButton.setText(this.a.f3196e);
        }
        cOUIButton2.setText(this.a.d);
        cOUIButton.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.sfe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.i.T(view2);
            }
        });
        cOUIButton2.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.ife
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.i.U(view2);
            }
        });
        COUIBottomSheetDialog cOUIBottomSheetDialog = new COUIBottomSheetDialog(this.a.a, R$style.DefaultBottomSheetDialog);
        cOUIBottomSheetDialog.setCanceledOnTouchOutside(false);
        cOUIBottomSheetDialog.getBehavior().setDraggable(false);
        cOUIBottomSheetDialog.setContentView(view);
        cOUIBottomSheetDialog.getDragableLinearLayout().getDragView().setVisibility(4);
        cOUIBottomSheetDialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.oplus.aiunit.vision.jfe
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return this.i.V(dialogInterface, i, keyEvent);
            }
        });
        return cOUIBottomSheetDialog;
    }

    public final void e0() {
        final com.heytap.health.base.permission.wxbpermission.a aVar = this.g;
        if (aVar == null || this.d == null || this.a.a == null) {
            return;
        }
        aVar.j();
        o0();
        this.a.a.getWindow().getDecorView().post(new Runnable() { // from class: com.oplus.aiunit.vision.hfe
            @Override // java.lang.Runnable
            public final void run() {
                this.i.W(aVar);
            }
        });
    }

    public final void f0(@NonNull Dialog dialog) {
        b bVar = this.a;
        if (bVar == null || bVar.a == null || !qe0.p(this.a.a)) {
            return;
        }
        com.heytap.health.base.permission.wxbpermission.a aVarJ = J();
        if (aVarJ.r(this.a.a)) {
            aVarJ.i(dialog);
        }
    }

    public final void g0() {
        h0(this.a.k);
    }

    public final void h0(boolean z) {
        FragmentManager supportFragmentManager = this.a.a.getSupportFragmentManager();
        if (z) {
            new com.heytap.health.base.permission.a(supportFragmentManager).d((String[]) this.b.toArray(new String[0]), this.f);
        } else {
            new com.heytap.health.base.permission.a(supportFragmentManager).c((String[]) this.b.toArray(new String[0]), this.f);
        }
    }

    public final void j0(boolean z) {
        Iterator<String> it = this.b.iterator();
        while (it.hasNext()) {
            i0(this.a.b, it.next(), z);
        }
    }

    public final void k0(View view, c cVar) {
        TextView textView = (TextView) view.findViewById(R$id.content_title);
        TextView textView2 = (TextView) view.findViewById(R$id.content_content);
        if (TextUtils.isEmpty(cVar.b)) {
            textView.setVisibility(8);
        } else {
            textView.setText(cVar.b);
        }
        if (TextUtils.isEmpty(cVar.a)) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(HtmlCompat.fromHtml(cVar.a, 0));
        }
    }

    public void l0() {
        a0();
        this.b.addAll(H());
        if (this.b.isEmpty()) {
            this.a.h.Y1();
            return;
        }
        View viewInflate = LayoutInflater.from(this.a.a).inflate(hx9.b(this.a.a) ? R$layout.lib_base_dialog_permission_in_secondary : R$layout.lib_base_perms_granted, (ViewGroup) null);
        M(viewInflate);
        A(viewInflate);
        if (!this.a.f3197j) {
            m0(viewInflate);
            return;
        }
        Iterator<String> it = this.b.iterator();
        while (it.hasNext()) {
            i0(this.a.b, it.next(), true);
        }
        g0();
    }

    public final void m0(View view) {
        if (!E(this.a.b, this.b.get(0))) {
            this.f3194e = dge.a(this.a.a, (String[]) this.b.toArray(new String[0]));
            if (hx9.b(this.a.a)) {
                this.d = ExplanationDialogKind.SECONDARY_EXPLANATION;
                Dialog dialogD0 = d0(view, this.f3194e);
                this.f3193c = dialogD0;
                dialogD0.setCancelable(false);
                x(this.f3193c);
            } else {
                this.d = ExplanationDialogKind.MAIN_ALERT;
                this.f3193c = c0(view, this.f3194e);
            }
            f0(this.f3193c);
            this.f3193c.show();
        } else if (I(this.a.b, this.b.get(0))) {
            g0();
        } else {
            n0(this.b, false);
            if (this.a.h != null) {
                this.a.h.Z5();
            }
        }
        Dialog dialog = this.f3193c;
        if (dialog != null) {
            b0(dialog);
        }
    }

    public final void n0(final List<String> list, final boolean z) {
        if (this.a.i != null) {
            this.a.i.a();
        }
        if (this.a.m.booleanValue()) {
            a7b.f("PermissionRequestDialog", "skip tips...");
            return;
        }
        final ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String[] strArrB = PermissionExplanation.b(it.next(), this.a.b);
            if (strArrB != null && !arrayList.contains(strArrB[0])) {
                arrayList.add(strArrB[0]);
            }
        }
        ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.lfe
            @Override // java.lang.Runnable
            public final void run() {
                this.i.X(arrayList, z, list);
            }
        }, 300L);
    }

    public final void o0() {
        if (this.f3193c == null) {
            return;
        }
        com.heytap.health.base.permission.wxbpermission.a aVar = this.g;
        Runnable runnable = new Runnable() { // from class: com.oplus.aiunit.vision.kfe
            @Override // java.lang.Runnable
            public final void run() {
                this.i.Z();
            }
        };
        if (aVar != null) {
            aVar.v(runnable);
        } else {
            runnable.run();
        }
    }

    public final void p0(List<String> list) {
        new gee().a(list);
    }

    public final void w(View view, c cVar, LinearLayout linearLayout) {
        View viewInflate = LayoutInflater.from(view.getContext()).inflate(R$layout.lib_base_perms_granted_item_view, (ViewGroup) null);
        k0(viewInflate, cVar);
        linearLayout.addView(viewInflate);
    }

    public final void x(@NonNull Dialog dialog) {
        try {
            int i = androidx.appcompat.R.id.customPanel;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ((ViewGroup) dialog.findViewById(i)).getLayoutParams();
            layoutParams.weight = 1.0f;
            ((ViewGroup) dialog.findViewById(i)).setLayoutParams(layoutParams);
        } catch (Exception e2) {
            a7b.b("PermissionRequestDialog", "PermissionDialog Error is " + e2.getMessage());
        }
    }

    public final void y(StringBuilder sb, String str, List<String> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(z(it.next()));
        }
        sb.append(String.format(str, arrayList.toArray()));
    }

    public final String z(String str) {
        if (Build.VERSION.SDK_INT >= 31 && TextUtils.equals(str, b78.a().getString(R$string.lib_base_sports_permission_notice_t2)) && this.b.contains("android.permission.ACCESS_FINE_LOCATION")) {
            return b78.a().getString(R$string.lib_base_sports_permission_notice_t2_1);
        }
        return (TextUtils.equals(str, b78.a().getString(R$string.lib_base_sports_permission_notice_t2)) && this.b.contains("android.permission.ACCESS_BACKGROUND_LOCATION")) ? b78.a().getString(R$string.lib_base_perms_allow_all_the_time) : str;
    }

    public PermissionRequestDialog(b bVar) {
        this.b = new ArrayList();
        this.f3193c = null;
        this.f = new a();
        this.a = bVar;
    }
}
