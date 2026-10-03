package com.heytap.health.device.ota.cloud;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.heytap.health.device.ota.bean.OTAVersion;
import com.heytap.health.device.ota.cloud.model.OTAModule;
import com.heytap.health.device.ota.cloud.model.RespsInfo;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.d6d;
import com.oplus.aiunit.vision.mq;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public class OppoOtaUtils {
    @NotNull
    public static d6d a(RespsInfo respsInfo) {
        StringBuilder sb = new StringBuilder();
        sb.append("respsInfo: ");
        sb.append(respsInfo);
        d6d d6dVar = new d6d();
        List<OTAModule> list = respsInfo.modules;
        if (list != null && list.size() > 0) {
            OTAModule oTAModule = respsInfo.modules.get(0);
            d6dVar.f10401c = oTAModule.extract;
            d6dVar.a = oTAModule.version_name;
            d6dVar.b = oTAModule.description;
        }
        return d6dVar;
    }

    public static OTAVersion b(RespsInfo respsInfo) {
        StringBuilder sb = new StringBuilder();
        sb.append("respsInfo: ");
        sb.append(respsInfo);
        OTAVersion oTAVersion = new OTAVersion();
        oTAVersion.resultCode = respsInfo.resultCode;
        oTAVersion.msg = respsInfo.msg;
        List<OTAModule> list = respsInfo.modules;
        if (list == null || list.isEmpty()) {
            oTAVersion.resultCode = 0;
            oTAVersion.msg = "empty version";
        } else {
            OTAModule oTAModule = respsInfo.modules.get(0);
            if (TextUtils.isEmpty(oTAModule.new_version)) {
                oTAVersion.msg = oTAModule.checkFailReason;
                oTAVersion.resultCode = 0;
            } else {
                oTAVersion.versionName = oTAModule.version_name;
                oTAVersion.otaVersion = oTAModule.new_version;
                oTAVersion.descriptionUrl = oTAModule.description;
                oTAVersion.summary = oTAModule.extract;
                oTAVersion.firmwareUrl = oTAModule.down_url;
                oTAVersion.forceUpdate = oTAModule.silenceUpdate > 0 && (oTAModule.noticeType & 64) == 64;
                oTAVersion.size = oTAModule.patch_size;
                oTAVersion.md5 = oTAModule.patch_md5;
            }
        }
        if (!TextUtils.isEmpty(oTAVersion.otaVersion)) {
            String[] strArrSplit = oTAVersion.otaVersion.split("_");
            if (strArrSplit.length >= 4) {
                oTAVersion.model = strArrSplit[0];
                int iIndexOf = strArrSplit[1].indexOf(".");
                if (iIndexOf != -1) {
                    oTAVersion.hwID = strArrSplit[1].substring(0, iIndexOf);
                }
            }
        }
        return oTAVersion;
    }

    public static RespsInfo c(JsonObject jsonObject) {
        String asString = jsonObject.get("resps").getAsString();
        String strC = mq.c(asString.substring(0, asString.length() - 15), mq.e(asString.substring(asString.length() - 15, asString.length())));
        StringBuilder sb = new StringBuilder();
        sb.append("createDecryptJsonObject: ");
        sb.append(strC);
        return (RespsInfo) new Gson().fromJson(strC, new TypeToken<RespsInfo>() { // from class: com.heytap.health.device.ota.cloud.OppoOtaUtils.1
        }.getType());
    }

    public static JsonObject d(JsonObject jsonObject) {
        String string = jsonObject.toString();
        String strF = mq.f();
        String strD = mq.d(string, mq.e(strF));
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("params", strD + strF);
        jsonObject2.addProperty("version", "4");
        return jsonObject2;
    }

    public static String e(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        if ("OB19B3".equals(str2)) {
            return "OB19O0";
        }
        return "OB19B1".equals(str2) ? "OB19O1" : str2;
    }

    public static String f(boolean z, String str) {
        int iIndexOf;
        int i;
        String[] strArrSplit = str.split("_");
        if (strArrSplit.length < 3 || (iIndexOf = strArrSplit[1].indexOf(".")) == -1 || (i = iIndexOf + 1) >= strArrSplit[1].length()) {
            return str;
        }
        if (z) {
            return strArrSplit[1].substring(i);
        }
        return strArrSplit[1].substring(i) + "_" + strArrSplit[2];
    }

    public static int g() {
        return a7b.i("Health_device_ota_test", 2) ? 1 : 0;
    }
}
