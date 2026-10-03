package com.omron;

import android.content.Context;
import android.support.annotation.NonNull;
import com.omron.lib.http.model.BgData;
import com.omron.lib.model.bg.BGData;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class au {
    public static ax<Void> a(String str) {
        ax<Void> axVar = new ax<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt("code");
            String string = jSONObject.getString("message");
            if (jSONObject.has("flag")) {
                axVar.b(jSONObject.getInt("flag"));
            }
            axVar.a(i);
            axVar.a(string);
        } catch (Exception e2) {
            e2.printStackTrace();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            e2.printStackTrace(new PrintStream(byteArrayOutputStream));
            ay.b("requestUpdateDeviceInfo response parse error:" + byteArrayOutputStream.toString(), new Object[0]);
            axVar.a(-100);
            axVar.a("数据解析失败");
        }
        return axVar;
    }

    public static List<BgData> a(@NonNull String str, @NonNull String str2, List<BGData> list, Context context) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (BGData bGData : list) {
            BgData bgData = new BgData(str, str2, str2);
            bgData.setMeasureId(1);
            bgData.setUuid((String) o.a(context, "uuid", ""));
            bgData.setDiningStatus(bGData.getMeal() == null ? 0 : bGData.getMeal().getCode());
            bgData.setBg(String.valueOf(bGData.getGlucoseConcentration()));
            bgData.setMeasureAt(bm.a(bGData.getTime().getTime()));
            arrayList.add(bgData);
        }
        return arrayList;
    }
}
