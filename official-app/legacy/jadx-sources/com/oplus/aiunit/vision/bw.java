package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.heytap.health.watchface.business.creation.category.album.AlbumHomeActivity;
import com.heytap.health.watchface.business.legacy.creation.album.bean.AlbumItem;
import com.heytap.health.watchface.business.legacy.creation.album.utils.AlbumSPUtil;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class bw extends zv {
    public static final String TAG = "AlbumWatchFaceMemory2Presenter";
    public AlbumItem m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f9871n = -1;
    public kvi o;

    @Override // com.oplus.aiunit.vision.q11, com.oplus.aiunit.vision.ja1
    public void k(Intent intent) {
        super.k(intent);
        this.o = new kvi(this.f15580l);
    }

    @Override // com.oplus.aiunit.vision.ja1
    public void l(Bundle bundle) {
        Context contextI = i();
        if (contextI != null) {
            this.m = AlbumSPUtil.j(contextI, this.o);
            List<AlbumItem> listF = xv.f(contextI);
            ltl.a(TAG, "initData " + listF);
            if (listF != null) {
                this.f9871n = listF.indexOf(this.m);
            }
            j().d0(listF, this.f9871n);
        }
    }

    @Override // com.oplus.aiunit.vision.zv
    public void t() {
        ltl.a(TAG, "[startTransmitImages]  ...album name " + this.m.getName());
        Context contextI = i();
        if (contextI == null) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(AlbumHomeActivity.BUNDLE_RETURN_ALBUM_TYPE, 1);
        intent.putExtra(AlbumHomeActivity.BUNDLE_RETURN_ALBUM_COVER, this.m);
        Activity activity = (Activity) contextI;
        activity.setResult(-1, intent);
        activity.finish();
    }

    @Override // com.oplus.aiunit.vision.zv
    public void u(int i, AlbumItem albumItem) {
        this.m = albumItem;
        ltl.a(TAG, "[onSelectImages] albumItem " + albumItem);
        v(i);
    }

    public final void v(int i) {
        if (j() != null) {
            j().c0(i != this.f9871n);
        }
    }
}
