package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.StrictMode;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;
import com.heytap.health.base.share.ShareType;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import java.io.File;

/* JADX INFO: loaded from: classes15.dex */
public class vzg {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static vzg f18061e;
    public static prj f;
    public IWXAPI a;
    public b b;
    public static final String WECHAT_APP_ID = vo6.b(b78.a(), y80.HEALTH_WECHAT_APP_ID);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f18060c = vo6.b(b78.a(), y80.HEALTH_QQ_APP_ID);
    public static final String d = vo6.b(b78.a(), y80.HEALTH_DOUYIN_CLIENT_KEY);
    public static iz9 g = new a();

    public class a implements iz9 {
        @Override // com.oplus.aiunit.vision.iz9
        public void onCancel() {
            a7b.f("ShareFileUtil", "QQ Share onCancel");
        }

        @Override // com.oplus.aiunit.vision.iz9
        public void onComplete(Object obj) {
            a7b.f("ShareFileUtil", "QQ Share onComplete");
        }

        @Override // com.oplus.aiunit.vision.iz9
        public void onError(yfk yfkVar) {
            a7b.f("ShareFileUtil", "QQ Share onError" + yfkVar.a + ";" + yfkVar.b + ";" + yfkVar.f19005c);
        }

        @Override // com.oplus.aiunit.vision.iz9
        public void onWarning(int i) {
            a7b.f("ShareFileUtil", "QQ Share onWarning ");
        }
    }

    public interface b {
        public static final String CANCEL = "cancel";
        public static final String ERROR = "error";
        public static final String SUCCESS = "success";
    }

    public static Uri b(File file) {
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().build());
        return Uri.parse("file://" + file.getAbsolutePath());
    }

    public static vzg e() {
        if (f18061e == null) {
            synchronized (vzg.class) {
                if (f18061e == null) {
                    f18061e = new vzg();
                }
            }
        }
        return f18061e;
    }

    public static prj f() {
        if (f == null) {
            i();
        }
        return f;
    }

    public static iz9 g() {
        return g;
    }

    public static void i() {
        f = prj.c(f18060c, b78.a(), "com.heytap.health.sharefileprovider");
    }

    public void a(AppCompatActivity appCompatActivity) {
        new q0h.c(appCompatActivity).i().k();
    }

    public m06 c(Activity activity) {
        yam.b(new n06(d));
        return yam.a(activity);
    }

    public final q0h.c d(AppCompatActivity appCompatActivity, Bitmap bitmap) {
        q0h.c cVar = new q0h.c(appCompatActivity);
        cVar.l("image/*");
        cVar.j(bitmap);
        return cVar;
    }

    public IWXAPI h() {
        if (this.a == null) {
            j();
        }
        return this.a;
    }

    public void j() {
        Context contextA = b78.a();
        String str = WECHAT_APP_ID;
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(contextA, str, true);
        this.a = iwxapiCreateWXAPI;
        iwxapiCreateWXAPI.registerApp(str);
    }

    public void k(AppCompatActivity appCompatActivity, Bitmap bitmap) {
        d(appCompatActivity, bitmap).i().x();
    }

    public void l(AppCompatActivity appCompatActivity, Bitmap bitmap, pzg pzgVar) {
        d(appCompatActivity, bitmap).m(pzgVar).i().x();
    }

    public void m(AppCompatActivity appCompatActivity, Bitmap bitmap) {
        d(appCompatActivity, bitmap).i().z(ShareType.SYSTEM, bitmap);
    }

    public void n(AppCompatActivity appCompatActivity, Bitmap bitmap, vid vidVar, b bVar) {
        this.b = bVar;
        d(appCompatActivity, bitmap).m(vidVar).i().z(ShareType.SYSTEM, bitmap);
    }

    public void o(AppCompatActivity appCompatActivity, Bitmap bitmap, pzg pzgVar) {
        d(appCompatActivity, bitmap).m(pzgVar).i().z(ShareType.SYSTEM, bitmap);
    }

    public void p(AppCompatActivity appCompatActivity, ShareType shareType, Bitmap bitmap, pzg pzgVar) {
        d(appCompatActivity, bitmap).m(pzgVar).i().z(shareType, bitmap);
    }

    public void q(Activity activity, String str, String str2) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setType("text/plain");
        activity.startActivity(Intent.createChooser(intent, str2));
    }

    public void r(AppCompatActivity appCompatActivity, Bitmap bitmap, String str, String str2, String str3, b bVar) {
        if (TextUtils.isEmpty(str3)) {
            a7b.b("ShareFileUtil", "url for sharing is empty");
            return;
        }
        this.b = bVar;
        q0h.c cVar = new q0h.c(appCompatActivity);
        cVar.l("url/*");
        cVar.j(bitmap);
        cVar.o(str);
        cVar.k(str2);
        cVar.p(str3);
        cVar.i().G();
    }

    public void s(AppCompatActivity appCompatActivity, String str) {
        File file = new File(str);
        if (!file.exists()) {
            a7b.b("ShareFileUtil", "file for sharing is not exists");
            return;
        }
        q0h.c cVar = new q0h.c(appCompatActivity);
        cVar.l("video/*");
        ContentResolver contentResolver = appCompatActivity.getContentResolver();
        Uri uriB = null;
        try {
            Cursor cursorQuery = contentResolver.query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, new String[]{"_display_name", "_id"}, "_display_name = ? ", new String[]{file.getName()}, null);
            if (cursorQuery != null) {
                try {
                    uriB = cursorQuery.moveToNext() ? ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, cursorQuery.getLong(cursorQuery.getColumnIndex("_id"))) : null;
                    cursorQuery.close();
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
        } catch (Exception e2) {
            a7b.b("ShareFileUtil", "shareVideoFileWx e:" + e2.getMessage());
        }
        if (uriB == null) {
            uriB = b(file);
        }
        cVar.n(uriB);
        cVar.o(file.getName());
        cVar.i().B("video/*");
    }
}
