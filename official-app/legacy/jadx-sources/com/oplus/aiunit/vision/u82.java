package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import com.heytap.unsafe.TailNumberHelper;
import com.heytap.upgrade.exception.UpgradeException;
import com.heytap.upgrade.model.SplitFileInfoDto;
import com.heytap.upgrade.model.UpgradeInfo;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class u82 {
    public ExecutorService a;
    public Executor b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f17347c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public the f17348e;
    public sn9 f;
    public PackageInfo g;
    public o93 h;

    public u82(o93 o93Var, sn9 sn9Var) {
        w93.a(o93Var, "check upgrade param can not be null");
        this.h = o93Var;
        Context contextB = rqk.b();
        this.f17347c = contextB;
        w93.a(contextB, "you should invoke UpgradeSDK#init(Context,InitParam) first");
        this.a = dkk.b();
        this.b = dkk.d();
        String strC = o93Var.c();
        this.d = strC;
        w93.b(strC, "packageName cannot be null or empty");
        this.f = sn9Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(UpgradeException upgradeException) {
        this.f.c(upgradeException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(UpgradeInfo upgradeInfo) {
        this.f.b(upgradeInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n() {
        this.f.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        try {
            jkk jkkVarB = new ymc().b(k(), j(), i());
            if (jkkVarB == null) {
                e(new UpgradeException(10003, "response is null"));
                return;
            }
            if (jkkVarB.d == 200) {
                UpgradeInfo upgradeInfoP = p(jkkVarB);
                e6b.a("upgrade_BundleCheckTask", upgradeInfoP.toString());
                f(upgradeInfoP);
            } else {
                e(new UpgradeException(10002, "response code:" + jkkVarB.f12940c));
            }
        } catch (IOException e2) {
            e6b.a("upgrade_BundleCheckTask", "check failed : " + e2.getMessage());
            e(new UpgradeException(10005));
        } catch (JSONException e3) {
            e6b.a("upgrade_BundleCheckTask", "check failed : " + e3.getMessage());
            e(new UpgradeException(10004, e3));
        }
    }

    public final void e(final UpgradeException upgradeException) {
        this.b.execute(new Runnable() { // from class: com.oplus.aiunit.vision.s82
            @Override // java.lang.Runnable
            public final void run() {
                this.i.l(upgradeException);
            }
        });
    }

    public final void f(final UpgradeInfo upgradeInfo) {
        this.b.execute(new Runnable() { // from class: com.oplus.aiunit.vision.r82
            @Override // java.lang.Runnable
            public final void run() {
                this.i.m(upgradeInfo);
            }
        });
    }

    public final void g() {
        this.b.execute(new Runnable() { // from class: com.oplus.aiunit.vision.t82
            @Override // java.lang.Runnable
            public final void run() {
                this.i.n();
            }
        });
    }

    public void h() {
        u6b.b("upgrade_BundleCheckTask", "check upgrade for package " + this.d);
        g();
        if (unc.i(rqk.b())) {
            this.a.submit(new Runnable() { // from class: com.oplus.aiunit.vision.q82
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.o();
                }
            });
        } else {
            e(new UpgradeException(10006, "no network"));
        }
    }

    public final TreeMap<String, String> i() {
        String strB;
        TreeMap<String, String> treeMap = new TreeMap<>();
        o93.a aVarD = this.h.d();
        String strA = aVarD.a();
        String strB2 = aVarD.b();
        if (TextUtils.isEmpty(strB2)) {
            aVarD.c();
        }
        if (!TextUtils.isEmpty(strB2)) {
            strB = strB2;
        } else if (TextUtils.isEmpty(strA)) {
            strB = ykj.INSTANCE.b(p04.UPGRADE_DEVICE_ID, "");
            if (TextUtils.isEmpty(strB)) {
                strB = null;
            }
        } else {
            strB = strA;
        }
        if (!TextUtils.isEmpty(strB)) {
            try {
                String strA2 = g6g.a(strB);
                treeMap.put("upgId2", strA2);
                u6b.a("encrypt <upgId2> success, use it. encryptUpgId=" + strA2);
                try {
                    u6b.a("the last 2 tail number:" + TailNumberHelper.getOpenIdTail(strA2));
                } catch (Throwable unused) {
                }
            } catch (Exception unused2) {
                u6b.a("encrypt <upgId2> failed, use <openId> or <imei> instead");
                if (!TextUtils.isEmpty(strB2)) {
                    treeMap.put("openId", strB2);
                } else if (!TextUtils.isEmpty(strA)) {
                    treeMap.put("id", strA);
                }
            }
        }
        return treeMap;
    }

    public final TreeMap<String, String> j() {
        String strValueOf;
        boolean z;
        String strF;
        String str;
        boolean zEquals = rqk.j(this.f17347c).equals(this.d);
        if (this.f17348e == null) {
            this.f17348e = new the.a(this.f17347c).a();
        }
        if (this.g == null) {
            this.g = rqk.i(this.f17347c, this.d);
        }
        PackageInfo packageInfo = this.g;
        if (packageInfo != null) {
            strValueOf = String.valueOf(packageInfo.versionCode);
            strF = rqk.f(this.d, new File(this.g.applicationInfo.sourceDir));
            str = this.g.sharedUserId;
            z = true;
        } else {
            strValueOf = "";
            z = false;
            strF = "";
            str = strF;
        }
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("code", rqk.l(this.d));
        if (!zEquals && !z) {
            treeMap.put("type", "1");
        }
        treeMap.put("brand", this.f17348e.f());
        treeMap.put("mobile", this.f17348e.g());
        treeMap.put("os", String.valueOf(Build.VERSION.SDK_INT));
        treeMap.put("versionCode", strValueOf);
        if (zEquals) {
            treeMap.put(vye.h() + "VersionCode", String.valueOf(rqk.c()));
        }
        if (!TextUtils.isEmpty(strF)) {
            treeMap.put("md5", strF);
        }
        treeMap.put("region", rqk.m(this.f17347c));
        treeMap.put("lang", rqk.n());
        if ("com.nearme.gamecenter".equals(this.d) && str != null && str.endsWith("uid.gc")) {
            treeMap.put("u", "1");
        }
        treeMap.put("bundle", f80.b(this.h.e()) ? SpeechConstant.TRUE_STR : SpeechConstant.FALSE_STR);
        return treeMap;
    }

    public final String k() {
        return p04.a(this.f17347c);
    }

    public final UpgradeInfo p(jkk jkkVar) throws JSONException {
        UpgradeInfo upgradeInfo = new UpgradeInfo();
        JSONObject jSONObject = new JSONObject(jkkVar.a);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("downUrlList");
        ArrayList<String> arrayList = new ArrayList<>();
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayList.add(jSONArrayOptJSONArray.getString(i));
            }
        }
        String strOptString = jSONObject.isNull("md5") ? "" : jSONObject.optString("md5");
        upgradeInfo.setVersionCode(jSONObject.optInt("versionCode")).setVersionName(jSONObject.optString("versionName")).setDownUrlList(arrayList).setUpgradeComment(jSONObject.optString("updateComment")).setUpgradeFlag(jSONObject.optInt("upgradeFlag")).setApkFileSize(jSONObject.optLong("apkSize")).setMd5(TextUtils.isEmpty(strOptString) ? "" : strOptString).setBundle(jSONObject.optBoolean("bundle"));
        if (upgradeInfo.getVersionName() == null || upgradeInfo.getUpgradeFlag() == 1) {
            jkkVar.f12940c = 304;
        } else {
            jkkVar.f12940c = 0;
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("splitFileList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                ArrayList<String> arrayList3 = new ArrayList<>();
                SplitFileInfoDto splitFileInfoDto = new SplitFileInfoDto();
                JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i2);
                splitFileInfoDto.setSplitName(jSONObject2.optString("splitName")).setRevisionCode(jSONObject2.optString("revisionCode")).setType(jSONObject2.optString("type")).setMd5(jSONObject2.optString("md5")).setHeaderMd5(jSONObject2.optString("headerMd5")).setSize(jSONObject2.optString("size"));
                JSONArray jSONArrayOptJSONArray3 = jSONObject2.optJSONArray("downUrlList");
                for (int i3 = 0; i3 < jSONArrayOptJSONArray3.length(); i3++) {
                    arrayList3.add(String.valueOf(jSONArrayOptJSONArray3.get(i3)));
                }
                splitFileInfoDto.setDownUrlList(arrayList3);
                arrayList2.add(splitFileInfoDto);
            }
        }
        upgradeInfo.setSplitFileList(arrayList2);
        return upgradeInfo;
    }
}
