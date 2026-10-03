package com.customer.feedback.sdk;

import android.content.Context;
import com.customer.feedback.sdk.util.HeaderInfoHelper;
import com.customer.feedback.sdk.util.LogUtil;
import com.oplus.aiunit.vision.swm;
import com.oplus.aiunit.vision.yvm;
import com.oplus.aiunit.vision.zvm;
import com.oplus.aiunit.vision.zwm;
import feedbackg.feedbackh;
import java.io.DataOutputStream;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public final class feedbackb implements Runnable {
    public final /* synthetic */ Context feedbacka;
    public final /* synthetic */ feedbacka.feedbackb feedbackb;

    public feedbackb(Context context, feedbacka.feedbackb feedbackbVar) {
        this.feedbacka = context;
        this.feedbackb = feedbackbVar;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x017d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpsURLConnection httpsURLConnection;
        String strA;
        Integer numValueOf;
        swm swmVar = new swm(this.feedbacka);
        String str = yvm.feedbacka;
        String str2 = yvm.feedbackb + yvm.f19171feedbackf;
        ?? r3 = 0;
        String message = null;
        try {
            try {
                httpsURLConnection = (HttpsURLConnection) new URL(str2).openConnection();
                try {
                    httpsURLConnection.setConnectTimeout(30000);
                    httpsURLConnection.setReadTimeout(30000);
                    httpsURLConnection.setDoOutput(true);
                    httpsURLConnection.setRequestMethod("POST");
                    httpsURLConnection.addRequestProperty("Content-type", "application/json");
                    Map<String, String> header = HeaderInfoHelper.getHeader(swmVar.a, true);
                    if (header != null) {
                        for (String str3 : header.keySet()) {
                            String strEncode = header.get(str3);
                            if (str3.equals("FB-PC") || str3.equals("FB-VAID") || str3.equals("FB-REGION")) {
                                strEncode = URLEncoder.encode(zwm.a(swmVar.a, header.get(str3)), "UTF-8");
                            }
                            if (!str3.equalsIgnoreCase("FB-IP")) {
                                httpsURLConnection.addRequestProperty(str3, strEncode);
                            }
                        }
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("openId", header.get("FB-VAID"));
                            jSONObject.put("brand", header.get("FB-BRAND"));
                            jSONObject.put("model", header.get("FB-MODEL"));
                            jSONObject.put("os", HeaderInfoHelper.getVersion());
                            feedbackh.a(jSONObject);
                        } catch (JSONException e2) {
                            LogUtil.e("feedbackf.feedbacke", "recordHeaderData: " + e2.getMessage());
                        }
                    }
                    DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
                    dataOutputStream.writeBytes("{}");
                    dataOutputStream.flush();
                    dataOutputStream.close();
                    httpsURLConnection.connect();
                    strA = zvm.a(httpsURLConnection.getInputStream());
                    httpsURLConnection.disconnect();
                } catch (Exception e3) {
                    e = e3;
                    LogUtil.e("feedbackf.feedbacke", "SendAndWaitResponse IOException:" + e);
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                    strA = null;
                }
            } catch (Throwable th) {
                th = th;
                r3 = str2;
                if (r3 != 0) {
                    r3.disconnect();
                }
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            httpsURLConnection = null;
        } catch (Throwable th2) {
            th = th2;
            if (r3 != 0) {
                r3.disconnect();
            }
            throw th;
        }
        boolean z = false;
        if (strA == null) {
            feedbacka.feedbackb feedbackbVar = this.feedbackb;
            if (feedbackbVar != null) {
                feedbackbVar.onResult(false, "network failure", 0);
                return;
            }
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(strA);
            z = jSONObject2.getBoolean("success");
            if (z) {
                numValueOf = Integer.valueOf(jSONObject2.getInt("data"));
            } else {
                numValueOf = 0;
                message = jSONObject2.getString("subMsg");
            }
        } catch (JSONException e5) {
            LogUtil.e("JsonParser", "exceptionInfo：", e5);
            message = e5.getMessage();
            numValueOf = Integer.valueOf(z ? 1 : 0);
        }
        feedbacka.feedbackb feedbackbVar2 = this.feedbackb;
        if (feedbackbVar2 != null) {
            feedbackbVar2.onResult(z, message, numValueOf);
        }
    }
}
