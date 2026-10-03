package com.oplus.aiunit.vision;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;
import com.heytap.health.base.R$string;
import com.heytap.health.base.permission.wxbpermission.PermissionRequestDialog;
import com.heytap.health.base.task.ThreadUtils;
import java.io.File;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes15.dex */
public abstract class h1h {
    public boolean a = false;
    public WeakReference<AppCompatActivity> b;

    public class a implements PermissionRequestDialog.d {
        public final /* synthetic */ int i;

        public a(int i) {
            this.i = i;
        }

        @Override // com.heytap.health.base.permission.wxbpermission.PermissionRequestDialog.d
        public void Y1() {
            h1h.this.j(this.i);
        }

        @Override // com.heytap.health.base.permission.wxbpermission.PermissionRequestDialog.d
        public void Z5() {
            h1h h1hVar = h1h.this;
            h1hVar.a = true;
            h1hVar.i();
        }
    }

    public h1h(AppCompatActivity appCompatActivity) {
        this.b = new WeakReference<>(appCompatActivity);
    }

    public static /* synthetic */ void f() {
        Toast.makeText(b78.a(), R$string.lib_base_network_error_and_tips, 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        if (!rpc.c()) {
            ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.g1h
                @Override // java.lang.Runnable
                public final void run() {
                    h1h.f();
                }
            });
            return;
        }
        if (this.b.get() == null) {
            a7b.b("ShareType", "activity == null!");
            return;
        }
        if (TextUtils.isEmpty(d())) {
            a7b.b("ShareType", "ShareType == null!");
            return;
        }
        if (c() == null) {
            a7b.b("ShareType", "saveUri == null!");
            return;
        }
        AppCompatActivity appCompatActivity = this.b.get();
        Uri uriC = c();
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", uriC);
        intent.setType(d());
        if (this instanceof lde) {
            intent.addFlags(268435457);
            intent.setClipData(ClipData.newRawUri("", uriC));
        }
        Intent intentCreateChooser = Intent.createChooser(intent, "");
        intentCreateChooser.addFlags(1);
        appCompatActivity.startActivity(intentCreateChooser);
    }

    public abstract Uri c();

    public abstract String d();

    @Nullable
    public Uri e(String str) {
        if (this.b.get() == null) {
            a7b.f("ShareType", "activity has Recycle");
            return null;
        }
        AppCompatActivity appCompatActivity = this.b.get();
        File file = new File(str);
        if (file.exists()) {
            return FileProvider.getUriForFile(appCompatActivity, "com.heytap.health.sharefileprovider", file);
        }
        a7b.b("ShareType", "file for sharing is not exists");
        return null;
    }

    public void h(int i) {
        if (this.b.get() == null) {
            a7b.b("ShareType", "requestPermission activity has recycle is null");
        } else {
            new PermissionRequestDialog.b(this.b.get(), 1).t(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).r(new a(i)).x();
        }
    }

    public void i() {
    }

    public void j(int i) {
    }

    public void k() {
    }

    public void l() {
        ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.f1h
            @Override // java.lang.Runnable
            public final void run() {
                this.i.g();
            }
        });
    }
}
