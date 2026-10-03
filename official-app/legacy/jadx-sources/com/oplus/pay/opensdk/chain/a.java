package com.oplus.pay.opensdk.chain;

import android.content.Context;
import android.content.Intent;
import com.oplus.pay.opensdk.eum.PaySdkEnum;
import com.oplus.pay.opensdk.model.PreOrderParameters;
import com.oplus.pay.opensdk.utils.Resource;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class a implements g {
    public final List<g> a = new ArrayList();
    public int b = 0;

    @Override // com.oplus.pay.opensdk.chain.g
    public void a(Context context, PreOrderParameters preOrderParameters, Resource<Intent> resource, a aVar, g.a aVar2) {
        if (this.b == this.a.size()) {
            return;
        }
        if (resource.getCode() != PaySdkEnum.CheckSuccess.getCode()) {
            aVar2.a(resource);
            return;
        }
        g gVar = this.a.get(this.b);
        this.b++;
        gVar.a(context, preOrderParameters, resource, aVar, aVar2);
    }

    public a b(g gVar) {
        this.a.add(gVar);
        return this;
    }
}
