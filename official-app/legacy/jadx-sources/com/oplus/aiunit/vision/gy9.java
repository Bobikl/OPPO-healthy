package com.oplus.aiunit.vision;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.heytap.databaseengine.model.SpaceInfo;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public abstract class gy9 {
    public Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ViewGroup f11936j;

    public gy9(Context context, ViewGroup viewGroup) {
        this.i = context;
        this.f11936j = viewGroup;
    }

    public abstract void a();

    public abstract View b(List<SpaceInfo> list);

    public void c(boolean z, boolean z2, int i, int i2, SpaceInfo spaceInfo) {
        e4i e4iVar = new e4i();
        e4iVar.k(i + 1);
        e4iVar.i(i2 + 1);
        e4iVar.l(spaceInfo);
        e4iVar.j(spaceInfo.getMaterielList().get(i2));
        if (z) {
            f4i.c(e4iVar);
        } else if (z2) {
            f4i.b(e4iVar);
        } else {
            f4i.a(e4iVar);
        }
    }
}
