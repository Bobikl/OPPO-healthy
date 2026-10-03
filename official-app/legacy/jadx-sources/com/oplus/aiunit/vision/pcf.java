package com.oplus.aiunit.vision;

import com.heytap.epona.Request;
import com.heytap.epona.Response;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class pcf implements fea.a {
    public final List<fea> a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Request f15319c;
    public final vr2 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15320e;

    public pcf(List<fea> list, int i, Request request, vr2 vr2Var, boolean z) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.addAll(list);
        this.b = i;
        this.f15319c = request;
        this.d = vr2Var;
        this.f15320e = z;
    }

    @Override // com.oplus.aiunit.vision.fea.a
    public void a() {
        if (this.b >= this.a.size()) {
            this.d.onReceive(Response.defaultErrorResponse());
        } else {
            this.a.get(this.b).a(c(this.b + 1));
        }
    }

    @Override // com.oplus.aiunit.vision.fea.a
    public boolean b() {
        return this.f15320e;
    }

    public final pcf c(int i) {
        return new pcf(this.a, i, this.f15319c, this.d, this.f15320e);
    }

    @Override // com.oplus.aiunit.vision.fea.a
    public vr2 callback() {
        return this.d;
    }

    @Override // com.oplus.aiunit.vision.fea.a
    public Request request() {
        return this.f15319c;
    }
}
