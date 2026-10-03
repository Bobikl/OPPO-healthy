package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.accessory.BaseAgent;
import com.heytap.health.watchface.business.creation.category.outfits.OutfitsMatchActivity;
import java.util.Hashtable;
import java.util.Map;
import org.json.JSONObject;
import xcrash.TombstoneParser;

/* JADX INFO: loaded from: classes12.dex */
public final class t8n extends b0n<String, a> {
    public boolean w;
    public int[] x;

    public static class a {
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f16928c;
        public int a = -1;
        public boolean d = false;
    }

    public t8n(Context context, String str) {
        super(context, str);
        this.x = new int[]{10000, 0, BaseAgent.CONNECTION_FAILURE_ACC_DORMANT, 10019, OutfitsMatchActivity.REQ_CODE, 10021, 10022, 10023};
        this.u = "/feedback";
        this.isPostFlag = false;
        this.w = true;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getIPV6URL() {
        return xsm.y(getURL());
    }

    @Override // com.amap.api.col.p0003sl.l, com.amap.api.col.p0003sl.la
    public final Map<String, String> getParams() {
        Hashtable hashtable = new Hashtable(16);
        hashtable.put("key", n0n.j(this.t));
        if (this.w) {
            hashtable.put(TombstoneParser.keyProcessName, "3dmap");
        }
        String strA = o0n.a();
        String strC = o0n.c(this.t, strA, w0n.q(hashtable));
        hashtable.put("ts", strA);
        hashtable.put("scode", strC);
        return hashtable;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final String getURL() {
        return "http://restsdk.amap.com/v4" + this.u;
    }

    @Override // com.amap.api.col.p0003sl.la
    public final boolean isSupportIPV6() {
        return true;
    }

    @Override // com.oplus.aiunit.vision.b0n
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final a e(String str) throws com.amap.api.col.p0003sl.ic {
        String strOptString;
        int iOptInt;
        String strOptString2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("errcode")) {
                iOptInt = jSONObject.optInt("errcode");
                strOptString = jSONObject.optString("errmsg");
                strOptString2 = jSONObject.optString("errdetail");
            } else {
                strOptString = "";
                iOptInt = -1;
                strOptString2 = "";
            }
            a aVar = new a();
            aVar.a = iOptInt;
            aVar.b = strOptString;
            aVar.f16928c = strOptString2;
            aVar.d = false;
            for (int i : this.x) {
                if (i == iOptInt) {
                    aVar.d = true;
                    break;
                }
            }
            return aVar;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
