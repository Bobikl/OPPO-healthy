package com.oplus.aiunit.vision;

import com.oplus.epona.Call$Callback;
import com.oplus.epona.Request;
import com.oplus.epona.Response;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ncf implements iea.a {
    public final List<iea> a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Request f14444c;
    public final Call$Callback d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f14445e;

    public ncf(List<iea> list, int i, Request request, Call$Callback call$Callback, boolean z) {
        this.a = list;
        this.b = i;
        this.f14444c = request;
        this.d = call$Callback;
        this.f14445e = z;
    }

    @Override // com.oplus.aiunit.vision.iea.a
    public void a() {
        if (this.b < this.a.size()) {
            this.a.get(this.b).a(c(this.b + 1));
            return;
        }
        this.d.onReceive(Response.errorResponse(this.f14444c.getComponentName() + "#" + this.f14444c.getActionName() + " cannot be proceeded"));
    }

    @Override // com.oplus.aiunit.vision.iea.a
    public boolean b() {
        return this.f14445e;
    }

    public final ncf c(int i) {
        return new ncf(this.a, i, this.f14444c, this.d, this.f14445e);
    }

    @Override // com.oplus.aiunit.vision.iea.a
    public Call$Callback callback() {
        return this.d;
    }

    @Override // com.oplus.aiunit.vision.iea.a
    public Request request() {
        return this.f14444c;
    }
}
