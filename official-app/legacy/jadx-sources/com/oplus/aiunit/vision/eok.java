package com.oplus.aiunit.vision;

import android.content.Context;
import com.tencent.open.utils.HttpUtils;

/* JADX INFO: loaded from: classes10.dex */
public class eok extends nz0 {
    public static final String GRAPH_OPEN_ID = "oauth2.0/m_me";

    public eok(Context context, p4f p4fVar) {
        super(p4fVar);
    }

    public void h(iz9 iz9Var) {
        HttpUtils.l(this.b, uum.a(), "user/get_simple_userinfo", b(), "GET", new nz0.a(iz9Var));
    }
}
