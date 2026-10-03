package com.oplus.pay.opensdk.statistic.network.Interceptor;

import android.text.TextUtils;
import com.oplus.aiunit.vision.axf;
import com.oplus.aiunit.vision.cj8;
import com.oplus.aiunit.vision.exf;
import com.oplus.aiunit.vision.itf;
import com.oplus.aiunit.vision.jk8;
import com.oplus.aiunit.vision.pce;
import com.oplus.aiunit.vision.rfa;
import com.oplus.aiunit.vision.v3g;
import com.oplus.aiunit.vision.vtg;
import com.oplus.pay.opensdk.statistic.helper.DigestHelper;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.LinkedList;
import okhttp3.MediaType;
import okhttp3.Request;
import okio.Buffer;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class SecurityRequestInterceptor implements rfa {
    public static final String LOG_DOWNGRADE_REQUEST_END = "=================downgrade request end";
    public static final String LOG_END_REQUEST = "=================end request";
    public static final String LOG_FIRST_REQUEST_SUCCESS = "=================first request success";
    public static final String LOG_HAS_A_AVAILABLE_SECURITY_KEYS = "has a Available security keys";
    public static final String LOG_REQUEST_DOWNGRADE_TIME = "=================request downgrade time";
    public static final String LOG_REQUEST_FIRST_TIME = "=================request first time";
    public static final String LOG_REQUEST_SECOND_TIME = "=================request second time";
    public static final String LOG_SECOND_REQUEST_SUCCESS = "=================second request success";
    public static final String LOG_SECURITY_KEYS_UN_AVAILABLE_AND_RESET_SECURITY_KEYS = "mSecurityKeys unAvailable and reset security keys";
    public static final String TAG = "Pay SecurityRequest";
    public static String TAG_SUFFIX = "Pay SecurityRequest";
    public String a;
    public vtg b;
    public final String c;
    public final LogQueue d = new LogQueue();

    public static final class LogQueue extends LinkedList<String> {
        private LogQueue() {
        }

        @Override // java.util.LinkedList, java.util.Deque, java.util.Queue
        public boolean offer(String str) {
            return super.offer(str);
        }
    }

    public SecurityRequestInterceptor(String str) {
        this.c = str;
        if (str == null) {
            throw new NullPointerException("SecurityRequestInterceptor key must not be null");
        }
    }

    public static String a(itf itfVar) {
        try {
            Buffer buffer = new Buffer();
            itfVar.writeTo(buffer);
            return buffer.readUtf8();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String b(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(i(), str);
            jSONObject.put("iv", str3);
            jSONObject.put("sessionTicket", str2);
            return URLEncoder.encode(jSONObject.toString(), "utf-8");
        } catch (Exception e) {
            pce.c(e.getMessage());
            return "";
        }
    }

    public static String i() {
        return DigestHelper.g("cmq");
    }

    public final void c(jk8.a aVar, String str, vtg vtgVar) {
        if (d("X-Safety", str)) {
            aVar.k("X-Safety", str);
        }
        String strB = b(vtgVar.d, vtgVar.e, vtgVar.c);
        if (d("X-Protocol", strB)) {
            aVar.k("X-Protocol", strB);
        }
        aVar.k("X-Protocol-Ver", "3.0");
    }

    public boolean d(String str, String str2) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt <= ' ' || cCharAt >= 127) {
                return false;
            }
        }
        if (str2 == null) {
            return false;
        }
        int length2 = str2.length();
        for (int i2 = 0; i2 < length2; i2++) {
            char cCharAt2 = str2.charAt(i2);
            if ((cCharAt2 <= 31 && cCharAt2 != '\t') || cCharAt2 >= 127) {
                return false;
            }
        }
        return true;
    }

    public final void e() {
        this.b = null;
    }

    public final axf f(axf axfVar, vtg vtgVar, String str) {
        String strS;
        axf axfVarC;
        jk8 jk8VarU = axfVar.u();
        exf exfVarG = axfVar.g();
        if (l(axfVar)) {
            try {
                strS = axfVar.g().s();
            } catch (IOException e) {
                this.d.offer("decryptResponse srcResponse.body().string() IOException = ");
                e.printStackTrace();
                strS = null;
            }
            if (!TextUtils.isEmpty(jk8VarU.a("X-Session-Ticket"))) {
                this.d.offer("decryptResponse parserSecurityTicketHeader = " + jk8VarU.a("X-Session-Ticket"));
                vtgVar.e = jk8VarU.a("X-Session-Ticket");
            }
            String strB = vtgVar.b(strS);
            if (TextUtils.isEmpty(strB)) {
                this.d.offer("decryptResponse decrypt fail and throw SecurityDecryptError ; the aeskey = " + vtgVar.a);
                axfVarC = axfVar.x().g(5222).c();
            } else {
                k(vtgVar);
                axfVarC = axfVar.x().b(exf.o(exfVarG.m(), strB)).c();
            }
            return axfVarC;
        }
        if (axfVar.m() != 222 || TextUtils.isEmpty(jk8VarU.a("X-Signature"))) {
            return axfVar;
        }
        String strA = jk8VarU.a("X-Signature");
        String strF = DigestHelper.f(this.a);
        if (v3g.b(strF, strA, this.c)) {
            this.d.offer("parseNetworkResponse receive statuscode 222 and verify signature success , throw SecurityDecryptError");
            return axfVar.x().g(5222).c();
        }
        this.d.offer("decryptResponse receive statuscode 222 signature = " + strA);
        this.d.offer("decryptResponse receive statuscode 222 mEncryptHeader  = " + str);
        this.d.offer("decryptResponse receive statuscode 222 mEncryptHeader md5  = " + strF);
        this.d.offer("decryptResponse receive statuscode 222 and verify signature fail");
        return axfVar;
    }

    public final Request g(Request request, itf itfVar, jk8 jk8Var, String str, vtg vtgVar) throws IOException {
        jk8.a aVarD = jk8Var.d();
        if (!TextUtils.isEmpty(str)) {
            String strEncode = URLEncoder.encode(vtgVar.c(str), "UTF-8");
            this.a = strEncode;
            aVarD.k("Accept", "application/encrypted-json");
            c(aVarD, strEncode, vtgVar);
            request = request.n().headers(aVarD.g()).build();
        }
        return request.n().post(itf.create(MediaType.parse(h(true)), vtgVar.c(a(itfVar)))).build();
    }

    public final String h(boolean z) {
        Object[] objArr = new Object[2];
        objArr[0] = z ? "application/encrypted-json" : "application/json";
        objArr[1] = "UTF-8";
        return String.format("%s; charset=%s", objArr);
    }

    public axf intercept(rfa.a aVar) throws IOException {
        Request request = aVar.request();
        TAG_SUFFIX = "Pay SecurityRequest:" + request.t().d();
        vtg vtgVar = this.b;
        if (vtgVar == null || !vtgVar.a()) {
            this.d.offer(LOG_SECURITY_KEYS_UN_AVAILABLE_AND_RESET_SECURITY_KEYS);
            vtgVar = new vtg(this.c);
        } else {
            this.d.offer(LOG_HAS_A_AVAILABLE_SECURITY_KEYS);
        }
        vtg vtgVar2 = vtgVar;
        this.d.offer(" SECURITY Ticket = =  " + vtgVar2.e);
        jk8 jk8VarH = request.h();
        itf itfVarA = request.a();
        String strB = cj8.d.b();
        this.d.offer(LOG_REQUEST_FIRST_TIME);
        axf axfVarC = aVar.c(g(request, itfVarA, jk8VarH, strB, vtgVar2));
        axf axfVarF = f(axfVarC, vtgVar2, strB);
        try {
            if (!l(axfVarF)) {
                if (axfVarF != null && axfVarF.m() == 5222) {
                    this.d.offer(LOG_REQUEST_SECOND_TIME);
                    e();
                    vtg vtgVar3 = new vtg(this.c);
                    axfVarF = f(aVar.c(g(request, itfVarA, jk8VarH, strB, vtgVar3)), vtgVar3, strB);
                    if (l(axfVarF)) {
                        this.d.offer(LOG_SECOND_REQUEST_SUCCESS);
                    } else if (axfVarF.m() == 5222) {
                        this.d.offer(LOG_REQUEST_DOWNGRADE_TIME);
                        e();
                        axfVarC = aVar.c(request.n().header("Accept", "application/json").post(itf.create(MediaType.parse(h(false)), a(itfVarA))).build());
                        this.d.offer(LOG_DOWNGRADE_REQUEST_END);
                    }
                }
                this.d.offer(LOG_END_REQUEST);
                return axfVarC;
            }
            this.d.offer(LOG_FIRST_REQUEST_SUCCESS);
            this.d.offer(LOG_END_REQUEST);
            return axfVarC;
        } finally {
            j();
        }
        axfVarC = axfVarF;
    }

    public final void j() {
        for (int i = 0; i < this.d.size() + 1; i++) {
            try {
                pce.f(TAG_SUFFIX + "" + this.d.poll());
            } catch (Exception unused) {
                return;
            }
        }
    }

    public final void k(vtg vtgVar) {
        this.b = vtgVar;
    }

    public final boolean l(axf axfVar) {
        return (axfVar == null || !axfVar.b() || axfVar.m() == 222) ? false : true;
    }
}
