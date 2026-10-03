package com.oplus.aiunit.vision;

import android.app.Activity;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.Objects;
import okhttp3.MediaType;
import okhttp3.Request;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class z36 {

    public class a implements zs2 {
        public final /* synthetic */ chd i;

        public a(chd chdVar) {
            this.i = chdVar;
        }

        @Override // com.oplus.aiunit.vision.zs2
        public void onFailure(@NonNull wr2 wr2Var, @NonNull IOException iOException) {
            qae.c("onFailure==========$e");
            this.i.onFailed(iOException);
        }

        @Override // com.oplus.aiunit.vision.zs2
        public void onResponse(@NonNull wr2 wr2Var, @NonNull ytf ytfVar) throws IOException {
            try {
                cuf body = ytfVar.getBody();
                Objects.requireNonNull(body);
                String strS = body.s();
                qae.b("responseStr：" + strS);
                JSONObject jSONObject = new JSONObject(strS);
                if (jSONObject.has("success") || jSONObject.getBoolean("success")) {
                    this.i.onSuccess(jSONObject.getJSONObject("data").getString("url"));
                } else {
                    this.i.onFailed(new Exception("url is empty"));
                }
            } catch (JSONException e2) {
                this.i.onFailed(new Exception(e2.getMessage()));
            }
        }
    }

    public static void a(Activity activity, String str, String str2, chd chdVar) {
        efd efdVarC = new gpc().c(activity, s0g.KEY_PAY, true);
        gqf gqfVarCreate = gqf.create(MediaType.parse("application/json; charset=utf-8"), str2);
        qae.b("mRequestUrl：" + str);
        Request requestBuild = new Request.Builder().url(str).post(gqfVarCreate).build();
        qae.b("requestBody：" + str2);
        efdVarC.a(requestBuild).g(new a(chdVar));
    }
}
