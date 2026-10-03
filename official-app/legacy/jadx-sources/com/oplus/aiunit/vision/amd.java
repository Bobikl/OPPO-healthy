package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.heytap.webpro.common.exception.NotGrantException;
import com.oplus.smartenginehelper.ParserTag;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class amd extends q51 {
    public amd() {
        super("vip", "operateSp");
    }

    public int a(Context context, String str, int i) {
        uo3 uo3VarK = uo3.k(context);
        if (uo3VarK.c(str)) {
            return uo3VarK.e(str, i);
        }
        int iE = uo3.l(context).e(str, i);
        uo3VarK.a(str, iE);
        return iE;
    }

    public String b(Context context, String str, String str2) {
        uo3 uo3VarK = uo3.k(context);
        if (uo3VarK.c(str)) {
            return uo3VarK.g(str, str2);
        }
        String strG = uo3.l(context).g(str, str2);
        uo3VarK.b(str, strG);
        return strG;
    }

    public void c(Context context, String str, int i) {
        uo3.k(context).a(str, i);
    }

    public void d(Context context, String str, String str2) {
        uo3.k(context).b(str, str2);
    }

    @Override // com.oplus.aiunit.vision.rr9
    public boolean intercept(@NonNull pr9 pr9Var, @NonNull jja jjaVar, @NonNull kr9 kr9Var) throws Throwable {
        JSONObject jSONObject = new JSONObject();
        String strD = jjaVar.d("type");
        String strD2 = jjaVar.d("key");
        String strD3 = jjaVar.d("valueType");
        if (TextUtils.isEmpty(strD3)) {
            strD3 = TypedValues.Custom.S_STRING;
        }
        int score = getScore(pr9Var, 4);
        if (ParserTag.TAG_GET.equals(strD) && score < 80) {
            throw new NotGrantException("no data permission");
        }
        if ("set".equals(strD) && score < 90) {
            throw new NotGrantException("no data permission");
        }
        Context applicationContext = pr9Var.getActivity().getApplicationContext();
        q7b.c("OperateSpInterceptor", "operate sp. methodType=%s, valueType, key=%s", strD, strD3, strD2);
        if (ParserTag.TAG_GET.equals(strD)) {
            jSONObject.put("result", "int".equals(strD3) ? String.valueOf(a(applicationContext, strD2, 0)) : b(applicationContext, strD2, ""));
        } else if ("set".equals(strD)) {
            String strD4 = jjaVar.d("value");
            if ("int".equals(strD3)) {
                c(applicationContext, strD2, Integer.parseInt(strD4));
            } else {
                d(applicationContext, strD2, strD4);
            }
            jSONObject.put("result", strD4);
        }
        onSuccess(kr9Var, jSONObject);
        return true;
    }
}
