package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.maps.MapsInitializer;
import com.autonavi.base.amap.mapcore.FileUtil;
import com.oplus.aiunit.vision.c2n;
import com.oplus.aiunit.vision.krm;
import com.oplus.aiunit.vision.rqm;
import com.oplus.aiunit.vision.u4n;
import com.oplus.aiunit.vision.xsm;

/* JADX INFO: loaded from: classes12.dex */
public final class k extends u4n {
    public Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j f764j;
    public rqm k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f765l;

    public interface a {
        void a(String str, rqm rqmVar);
    }

    public k(Context context) {
        this.i = context;
        if (this.f764j == null) {
            this.f764j = new j(context, "");
        }
    }

    public static String a(Context context) {
        return FileUtil.getMapBaseStorage(context);
    }

    public static void e(String str, byte[] bArr) throws Throwable {
        FileUtil.writeDatasToFile(str, bArr);
    }

    public final void b() {
        krm.a().b(this);
    }

    public final void c(rqm rqmVar) {
        this.k = rqmVar;
    }

    public final void d(String str) {
        j jVar = this.f764j;
        if (jVar != null) {
            jVar.b(str);
        }
    }

    @Override // com.oplus.aiunit.vision.u4n
    public final void runTask() {
        String str;
        try {
            if (MapsInitializer.getNetWorkEnable()) {
                j jVar = this.f764j;
                if (jVar != null) {
                    j.a aVarM = jVar.m();
                    if (aVarM == null || aVarM.a == null) {
                        str = null;
                    } else {
                        str = a(this.i) + "/custom_texture_data";
                        e(str, aVarM.a);
                    }
                    a aVar = this.f765l;
                    if (aVar != null) {
                        aVar.a(str, this.k);
                    }
                }
                c2n.g(this.i, xsm.t());
            }
        } catch (Throwable th) {
            c2n.r(th, "CustomStyleTask", "download customStyle");
            th.printStackTrace();
        }
    }

    public final void a() {
        this.i = null;
        if (this.f764j != null) {
            this.f764j = null;
        }
    }

    public final void b(a aVar) {
        this.f765l = aVar;
    }
}
