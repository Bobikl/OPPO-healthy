package com.heytap.health.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.oplus.aiunit.vision.h1k;

/* JADX INFO: loaded from: classes16.dex */
@Route(path = "/home/TodoCardService")
public class TodoCardServiceImpl implements ITodoCardService {
    @Override // com.heytap.health.home.ITodoCardService
    public void M5(Context context, ViewGroup viewGroup, int i, String str, String str2) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        h1k h1kVar = new h1k(context, i, str, str2);
        View viewInflate = layoutInflaterFrom.inflate(h1kVar.a(), viewGroup, false);
        h1kVar.e(viewInflate);
        h1kVar.c();
        viewGroup.addView(viewInflate);
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
    }
}
