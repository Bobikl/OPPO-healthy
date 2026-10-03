package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import com.oplus.oms.split.full.common.SplitProcessUtils;
import com.oplus.oms.split.full.splitrequest.OMSRunTimeException;
import com.oplus.oms.split.full.splitrequest.SplitOmsJsonLoadStrategy;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class j7i implements i7i {
    public final AtomicReference<dim> a = new AtomicReference<>();

    public static class a {

        @SuppressLint({"StaticFieldLeak"})
        public static final i7i a = new j7i();
    }

    public static h7i g(JSONObject jSONObject, String str, boolean z) throws JSONException {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean z2;
        int i;
        int i2;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        boolean z3;
        int i3;
        int i4;
        boolean zOptBoolean = jSONObject.optBoolean("mBuiltIn");
        String strOptString = jSONObject.optString("mSplitName");
        int iOptInt = jSONObject.optInt("mVersionCode");
        String strOptString2 = jSONObject.optString("mVersionName");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mInfoForSplit");
        HashMap map = new HashMap();
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObjectOptJSONObject.getString(next));
            }
        }
        int iOptInt2 = jSONObject.optInt("mMinSdkVersion");
        int iOptInt3 = jSONObject.optInt("mDexNumber");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("mWorkProcesses");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(jSONArrayOptJSONArray.length());
            for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
                arrayList.add(jSONArrayOptJSONArray.optString(i5));
            }
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("mDependencies");
        if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0) {
            arrayList2 = null;
        } else {
            arrayList2 = new ArrayList(jSONArrayOptJSONArray2.length());
            for (int i6 = 0; i6 < jSONArrayOptJSONArray2.length(); i6++) {
                arrayList2.add(jSONArrayOptJSONArray2.optString(i6));
            }
        }
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("mApkData");
        if (jSONArrayOptJSONArray3 == null || jSONArrayOptJSONArray3.length() <= 0) {
            arrayList3 = null;
        } else {
            ArrayList arrayList8 = new ArrayList(jSONArrayOptJSONArray3.length());
            for (int i7 = 0; i7 < jSONArrayOptJSONArray3.length(); i7++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray3.optJSONObject(i7);
                arrayList8.add(new h7i.a(null, null, jSONObjectOptJSONObject2.optString("mMd5"), jSONObjectOptJSONObject2.optLong("mSize")));
            }
            arrayList3 = arrayList8;
        }
        JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("mLibData");
        if (jSONArrayOptJSONArray4 == null || jSONArrayOptJSONArray4.length() <= 0) {
            arrayList4 = arrayList3;
            z2 = zOptBoolean;
            i = iOptInt2;
            i2 = iOptInt3;
            arrayList5 = arrayList;
            arrayList6 = arrayList2;
            arrayList7 = null;
        } else {
            ArrayList arrayList9 = new ArrayList(jSONArrayOptJSONArray4.length());
            int i8 = 0;
            while (i8 < jSONArrayOptJSONArray4.length()) {
                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray4.optJSONObject(i8);
                JSONArray jSONArray = jSONArrayOptJSONArray4;
                String strOptString3 = jSONObjectOptJSONObject3.optString("mAbi");
                ArrayList arrayList10 = arrayList3;
                JSONArray jSONArrayOptJSONArray5 = jSONObjectOptJSONObject3.optJSONArray("mJniLibs");
                ArrayList arrayList11 = new ArrayList();
                if (jSONArrayOptJSONArray5 == null || jSONArrayOptJSONArray5.length() <= 0) {
                    z3 = zOptBoolean;
                    i3 = iOptInt2;
                    i4 = iOptInt3;
                } else {
                    int i9 = 0;
                    while (i9 < jSONArrayOptJSONArray5.length()) {
                        JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray5.optJSONObject(i9);
                        arrayList11.add(new h7i.b.a(jSONObjectOptJSONObject4.optString("mName"), jSONObjectOptJSONObject4.optString("mMd5"), jSONObjectOptJSONObject4.optLong("mSize")));
                        i9++;
                        jSONArrayOptJSONArray5 = jSONArrayOptJSONArray5;
                        iOptInt3 = iOptInt3;
                        zOptBoolean = zOptBoolean;
                        iOptInt2 = iOptInt2;
                    }
                    z3 = zOptBoolean;
                    i3 = iOptInt2;
                    i4 = iOptInt3;
                }
                arrayList9.add(new h7i.b(strOptString3, arrayList11));
                i8++;
                jSONArrayOptJSONArray4 = jSONArray;
                arrayList3 = arrayList10;
                arrayList2 = arrayList2;
                arrayList = arrayList;
                iOptInt3 = i4;
                zOptBoolean = z3;
                iOptInt2 = i3;
            }
            arrayList4 = arrayList3;
            z2 = zOptBoolean;
            i = iOptInt2;
            i2 = iOptInt3;
            arrayList5 = arrayList;
            arrayList6 = arrayList2;
            arrayList7 = arrayList9;
        }
        return new h7i(strOptString, str, iOptInt, strOptString2, z2, i, i2, arrayList5, arrayList6, arrayList4, arrayList7, map, jSONObject.optBoolean("mIsSotaFeature"), jSONObject.optBoolean("mIsComponentFeature"), jSONObject.optString(ebe.KEY_PACKAGE_NAME), z);
    }

    public static dim h(ppm ppmVar) throws JSONException {
        JSONObject jSONObjectB = ppmVar.b();
        ArrayList arrayList = null;
        if (jSONObjectB == null) {
            return null;
        }
        w7i.e("SplitInfoManagerImpl", "parseSplitsContent local version = " + l(jSONObjectB), new Object[0]);
        String strOptString = jSONObjectB.optString("mOmsId");
        String strOptString2 = jSONObjectB.optString("mBaseVersionName");
        JSONArray jSONArrayOptJSONArray = jSONObjectB.optJSONArray("mUpdateSplits");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
                arrayList2.add(new csm(jSONObject.optString("mSplitName"), jSONObject.optString("mSplitVersion")));
            }
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObjectB.optJSONArray("mSplitEntryFragments");
        if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
            arrayList = new ArrayList(jSONArrayOptJSONArray2.length());
            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                arrayList.add(jSONArrayOptJSONArray2.getString(i2));
            }
        }
        ArrayList arrayList3 = arrayList;
        JSONArray jSONArrayOptJSONArray3 = jSONObjectB.optJSONArray("mSplits");
        if (jSONArrayOptJSONArray3 == null) {
            throw new OMSRunTimeException("No splits found in split-details file!");
        }
        LinkedHashMap<String, h7i> linkedHashMapM = m(jSONArrayOptJSONArray3, strOptString2, ppmVar);
        w7i.a("SplitInfoManagerImpl", "parseSplitsContent splitInfoMap = " + linkedHashMapM.toString(), new Object[0]);
        return new dim(strOptString, strOptString2, arrayList2, arrayList3, new zlm(linkedHashMapM));
    }

    public static ppm i(Context context) {
        Throwable e2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3 = null;
        boolean z = true;
        try {
            InputStream inputStreamO = o(context);
            if (inputStreamO == null) {
                throw new IOException("Asset file not exist!!");
            }
            String strJ = j(inputStreamO);
            Objects.requireNonNull(strJ);
            jSONObject = new JSONObject(strJ);
            try {
                w7i.e("SplitInfoManagerImpl", "checkOsmJsonFrom OmsJsonVersion from localOmsJsonObject value = " + n(l(jSONObject)), new Object[0]);
                File file = new File(a8i.o().k(true).getAbsoluteFile(), "oms_1.0.json");
                if (!file.exists()) {
                    w7i.e("SplitInfoManagerImpl", "checkOsmJsonFrom isSuccessCreateOmsFile = " + file.createNewFile(), new Object[0]);
                }
                String strJ2 = j(new FileInputStream(file));
                boolean zD = o7i.d(context);
                w7i.e("SplitInfoManagerImpl", "checkOsmJsonFrom apkOmsJsonString isEmpty = " + strJ2.isEmpty() + " isCopyOmsJsonSuccess = " + zD, new Object[0]);
                if (TextUtils.isEmpty(strJ2) || !zD) {
                    jSONObject2 = jSONObject;
                } else {
                    jSONObject2 = new JSONObject(strJ2);
                    try {
                        w7i.e("SplitInfoManagerImpl", "checkOsmJsonFrom apkOmsJsonVersion = " + n(l(jSONObject2)), new Object[0]);
                        z = false;
                    } catch (IOException | NumberFormatException | JSONException e3) {
                        e2 = e3;
                        jSONObject3 = jSONObject2;
                        z = false;
                        w7i.c("SplitInfoManagerImpl", "checkOsmJsonFrom error message = " + e2.getMessage(), new Object[0]);
                        return new ppm(jSONObject3, jSONObject, z);
                    }
                }
                try {
                    if (!SplitOmsJsonLoadStrategy.getInstance().getIsCustomizeOmsJsonStatus()) {
                        w7i.e("SplitInfoManagerImpl", "getIsCustomizeOms = false", new Object[0]);
                        return new ppm(jSONObject2, jSONObject, z);
                    }
                    SplitOmsJsonLoadStrategy.getInstance().getOmsJsonCustomProvider();
                    w7i.e("SplitInfoManagerImpl", "customizeOmsJson = null return localOmsJson", new Object[0]);
                    return new ppm(jSONObject2, jSONObject, z);
                } catch (IOException | NumberFormatException | JSONException e4) {
                    e2 = e4;
                    jSONObject3 = jSONObject2;
                    w7i.c("SplitInfoManagerImpl", "checkOsmJsonFrom error message = " + e2.getMessage(), new Object[0]);
                    return new ppm(jSONObject3, jSONObject, z);
                }
            } catch (IOException | NumberFormatException | JSONException e5) {
                e2 = e5;
                jSONObject3 = jSONObject;
            }
        } catch (IOException | NumberFormatException | JSONException e6) {
            e2 = e6;
            jSONObject = null;
        }
    }

    public static String j(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                pd7.a(inputStream);
                pd7.a(bufferedReader);
                return sb.toString();
            }
            sb.append(line);
        }
    }

    public static String k(String str) {
        return "oms" + File.separator + "oms_" + str + hc3.CLASSIC_CONFIG_SUFFIX;
    }

    public static String l(JSONObject jSONObject) {
        if (jSONObject == null) {
            return "1.0";
        }
        try {
            return jSONObject.getString("mSplitTotalVersion");
        } catch (JSONException unused) {
            w7i.c("SplitInfoManagerImpl", "get mSplitTotalVersion error, return default value", new Object[0]);
            return "1.0";
        }
    }

    public static LinkedHashMap<String, h7i> m(JSONArray jSONArray, String str, ppm ppmVar) throws JSONException {
        LinkedHashMap<String, h7i> linkedHashMap = new LinkedHashMap<>();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String strOptString = jSONObject.optString("mSplitName");
            h7i h7iVarG = g(jSONObject, str, false);
            arrayList.add(strOptString);
            linkedHashMap.put(strOptString, h7iVarG);
        }
        if (ppmVar.a()) {
            return linkedHashMap;
        }
        w7i.a("SplitInfoManagerImpl", "getSplitInfoMap splitInfoMap = " + linkedHashMap.toString(), new Object[0]);
        if (ppmVar.c() == null) {
            w7i.a("SplitInfoManagerImpl", "getSplitInfoMap getOtherOmsJson = null", new Object[0]);
            return linkedHashMap;
        }
        JSONArray jSONArrayOptJSONArray = ppmVar.c().optJSONArray("mSplits");
        for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
            JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i2);
            String strOptString2 = jSONObject2.optString("mSplitName");
            if (!arrayList.contains(strOptString2)) {
                h7i h7iVarG2 = g(jSONObject2, str, true);
                JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("mWorkProcesses");
                SplitProcessUtils.setInfoData(strOptString2, (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0) ? "" : (String) jSONArrayOptJSONArray2.get(0));
                linkedHashMap.put(strOptString2, h7iVarG2);
            }
        }
        w7i.a("SplitInfoManagerImpl", "getSplitInfoMap splitInfoMapNew = " + linkedHashMap.toString(), new Object[0]);
        return linkedHashMap;
    }

    public static int n(String str) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        String[] strArrSplit = str.split("\\.");
        int i = Integer.parseInt(strArrSplit[1]) + (Integer.parseInt(strArrSplit[0]) * 100);
        w7i.e("SplitInfoManagerImpl", "getIntVersionForString = " + i, new Object[0]);
        return i;
    }

    public static InputStream o(Context context) {
        InputStream inputStreamOpen;
        AssetManager assets = context.getAssets();
        if (assets == null) {
            return null;
        }
        try {
            try {
                String strK = k("1.0");
                w7i.a("SplitInfoManagerImpl", "default split file name: " + strK, new Object[0]);
                inputStreamOpen = assets.open(strK);
            } catch (IOException unused) {
                w7i.c("SplitInfoManagerImpl", "assets json file not exist!", new Object[0]);
                return null;
            }
        } catch (IOException unused2) {
            String strK2 = k(b7i.a());
            w7i.a("SplitInfoManagerImpl", "default json not exist, try OmsConfig: " + strK2, new Object[0]);
            inputStreamOpen = assets.open(strK2);
        }
        return inputStreamOpen;
    }

    public static dim r(Context context) throws JSONException, IOException {
        ppm ppmVarI = i(context);
        w7i.a("SplitInfoManagerImpl", "parseSplitContents isFrom= " + ppmVarI.a() + " version = " + l(ppmVarI.c()), new Object[0]);
        return h(ppmVarI);
    }

    public static i7i s() {
        return a.a;
    }

    @Override // com.oplus.aiunit.vision.i7i
    public List<String> a(Context context) {
        dim dimVarQ = q(context);
        return dimVarQ != null ? dimVarQ.d : Collections.emptyList();
    }

    @Override // com.oplus.aiunit.vision.i7i
    public List<h7i> b(Context context, Collection<String> collection) {
        dim dimVarQ = q(context);
        if (dimVarQ == null) {
            return Collections.emptyList();
        }
        Collection<h7i> collectionValues = dimVarQ.f10585e.a.values();
        ArrayList arrayList = new ArrayList(collection.size());
        for (h7i h7iVar : collectionValues) {
            if (collection.contains(h7iVar.q())) {
                arrayList.add(h7iVar);
                w7i.a("SplitInfoManagerImpl", "getSplitInfos " + h7iVar, new Object[0]);
            }
        }
        return arrayList;
    }

    @Override // com.oplus.aiunit.vision.i7i
    public h7i c(Context context, String str) {
        dim dimVarQ = q(context);
        if (dimVarQ == null) {
            return null;
        }
        for (h7i h7iVar : dimVarQ.f10585e.a.values()) {
            if (h7iVar.q().equals(str)) {
                return h7iVar;
            }
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.i7i
    public String d(Context context) {
        dim dimVarQ = q(context);
        if (dimVarQ != null) {
            return dimVarQ.a;
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.i7i
    public Collection<h7i> e(Context context) {
        dim dimVarQ = q(context);
        return dimVarQ != null ? dimVarQ.f10585e.a.values() : Collections.emptyList();
    }

    @Override // com.oplus.aiunit.vision.i7i
    public String f(Context context) {
        dim dimVarQ = q(context);
        if (dimVarQ != null) {
            return dimVarQ.b;
        }
        return null;
    }

    public final dim p(Context context) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            dim dimVarR = r(context);
            w7i.a("SplitInfoManagerImpl", "Cost " + (System.currentTimeMillis() - jCurrentTimeMillis) + " mil-second to parse default split info", new Object[0]);
            return dimVarR;
        } catch (IOException | JSONException e2) {
            w7i.b("SplitInfoManagerImpl", "Failed to create default split info!", e2);
            return null;
        }
    }

    public final synchronized dim q(Context context) {
        dim dimVarP = this.a.get();
        if (dimVarP == null) {
            dimVarP = p(context);
            if (dimVarP != null && TextUtils.isEmpty(dimVarP.a)) {
                return null;
            }
            fue.a(this.a, null, dimVarP);
        }
        return dimVarP;
    }
}
