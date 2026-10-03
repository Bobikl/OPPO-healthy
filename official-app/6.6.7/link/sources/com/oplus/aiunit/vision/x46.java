package com.oplus.aiunit.vision;

import android.app.Activity;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.Objects;
import okhttp3.MediaType;
import okhttp3.Request;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class x46 {

    public class a implements nt2 {
        public final /* synthetic */ uid i;

        public a(uid uidVar) {
            this.i = uidVar;
        }

        public void onFailure(@NonNull ks2 ks2Var, @NonNull IOException iOException) {
            pce.c("onFailure==========$e");
            this.i.onFailed(iOException);
        }

        public void onResponse(@NonNull ks2 ks2Var, @NonNull axf axfVar) throws IOException {
            try {
                exf exfVarG = axfVar.g();
                Objects.requireNonNull(exfVarG);
                String strS = exfVarG.s();
                pce.b("responseStr：" + strS);
                JSONObject jSONObject = new JSONObject(strS);
                if (jSONObject.has("success") || jSONObject.getBoolean("success")) {
                    this.i.onSuccess(jSONObject.getJSONObject("data").getString(qmm.a.l));
                } else {
                    this.i.onFailed(new Exception("url is empty"));
                }
            } catch (JSONException e) {
                this.i.onFailed(new Exception(e.getMessage()));
            }
        }
    }

    public static void a(Activity activity, String str, String str2, uid uidVar) {
        vgd vgdVarC = new yqc().c(activity, v3g.KEY_PAY, true);
        itf itfVarCreate = itf.create(MediaType.parse("application/json; charset=utf-8"), str2);
        pce.b("mRequestUrl：" + str);
        Request requestBuild = new Request.Builder().url(str).post(itfVarCreate).build();
        pce.b("requestBody：" + str2);
        vgdVarC.a(requestBuild).g(new a(uidVar));
    }
}
