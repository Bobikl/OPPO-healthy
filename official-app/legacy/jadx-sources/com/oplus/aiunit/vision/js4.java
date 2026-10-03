package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.health.base.cache.model.DataModel;
import com.heytap.health.base.text.GsonUtil;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes15.dex */
public class js4<T> extends t3<T> {
    public Type a;
    public u3 b;

    public js4(Type type, u3 u3Var) {
        this.a = type;
        this.b = u3Var;
    }

    @Override // com.oplus.aiunit.vision.qo9
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public DataModel<T> get(String str) {
        String strC = c(str);
        if (TextUtils.isEmpty(strC)) {
            return null;
        }
        return (DataModel) GsonUtil.b(strC, this.a);
    }

    public final String c(String str) {
        u3 u3Var = this.b;
        if (u3Var != null) {
            return u3Var.get(str);
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.qo9
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(String str, DataModel<T> dataModel) {
        if (dataModel != null) {
            e(str, GsonUtil.e(dataModel));
        } else {
            e(str, "");
        }
    }

    public final void e(String str, String str2) {
        u3 u3Var = this.b;
        if (u3Var != null) {
            u3Var.a(str, str2);
        }
    }
}
