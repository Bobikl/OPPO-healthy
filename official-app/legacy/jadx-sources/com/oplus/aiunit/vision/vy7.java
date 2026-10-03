package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.aiunit.core.FrameUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class vy7 {
    public Integer a;
    public Integer b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f18032c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<a> f18033e = new ArrayList();

    public static class a {
        public Integer a;
        public Integer b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f18034c;
        public Integer d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f18035e;
        public long f;

        public static a a(String str) {
            a aVar = new a();
            try {
                JSONObject jSONObject = new JSONObject(str);
                aVar.a = Integer.valueOf(jSONObject.getInt(Fields.WIDTH_FIELD));
                aVar.b = Integer.valueOf(jSONObject.getInt(Fields.HEIGHT_FIELD));
                aVar.f18034c = Integer.valueOf(jSONObject.getInt("channel"));
                aVar.d = Integer.valueOf(jSONObject.getInt("imageFormat"));
                aVar.f18035e = jSONObject.getString("tag");
                aVar.f = jSONObject.getLong("start");
                return aVar;
            } catch (Exception unused) {
                return null;
            }
        }

        public Integer b() {
            return this.f18034c;
        }

        public Integer c() {
            return this.b;
        }

        public Integer d() {
            return this.d;
        }

        public long e() {
            return this.f;
        }

        public String f() {
            return this.f18035e;
        }

        public Integer g() {
            return this.a;
        }

        public JSONObject h() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(Fields.WIDTH_FIELD, this.a);
                jSONObject.put(Fields.HEIGHT_FIELD, this.b);
                jSONObject.put("channel", this.f18034c);
                jSONObject.put("imageFormat", this.d);
                jSONObject.put("tag", this.f18035e);
                jSONObject.put("start", this.f);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            return jSONObject;
        }
    }

    public vy7() {
    }

    public static vy7 b(String str) {
        vy7 vy7Var = new vy7();
        try {
            JSONObject jSONObject = new JSONObject(str);
            vy7Var.a = Integer.valueOf(jSONObject.getInt("packageOrder"));
            vy7Var.b = Integer.valueOf(jSONObject.getInt("slotOrder"));
            vy7Var.f18032c = jSONObject.getString("type");
            vy7Var.d = jSONObject.getString("tag");
            if (!jSONObject.has("fragments")) {
                return vy7Var;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("fragments");
            for (int i = 0; i < jSONArray.length(); i++) {
                vy7Var.f18033e.add(a.a(jSONArray.getString(i)));
            }
            return vy7Var;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static Map<Integer, vy7> d(String str) {
        return g(str, "output");
    }

    public static Map<Integer, vy7> g(String str, String str2) {
        HashMap map = new HashMap();
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray("frameTagList");
            for (int i = 0; i < jSONArray.length(); i++) {
                vy7 vy7VarB = b(jSONArray.getString(i));
                if (vy7VarB != null && str2.equals(vy7VarB.h())) {
                    map.put(vy7VarB.f(), vy7VarB);
                }
            }
        } catch (Exception unused) {
            i0.c("FrameTag", "invalid json is " + str);
            map.clear();
        }
        return map;
    }

    public static JSONObject i(List<vy7> list) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator<vy7> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().j());
        }
        try {
            jSONObject.put("frameTagList", jSONArray);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public void a(FrameUnit frameUnit, int i) {
        if (frameUnit == null) {
            i0.n("FrameTag", "child frame unit is null.");
            return;
        }
        a aVar = new a();
        aVar.a = Integer.valueOf(frameUnit.getWidth());
        aVar.b = Integer.valueOf(frameUnit.getHeight());
        aVar.f18034c = Integer.valueOf(frameUnit.getChannel());
        aVar.d = Integer.valueOf(frameUnit.getImageFormat());
        aVar.f18035e = frameUnit.getTag();
        aVar.f = i;
        this.f18033e.add(aVar);
    }

    public List<a> c() {
        return this.f18033e;
    }

    public Integer e() {
        return this.a;
    }

    public Integer f() {
        return this.b;
    }

    public String h() {
        return this.f18032c;
    }

    public JSONObject j() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("packageOrder", this.a);
            jSONObject.put("slotOrder", this.b);
            jSONObject.put("type", this.f18032c);
            jSONObject.put("tag", this.d);
            if (!this.f18033e.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator<a> it = this.f18033e.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().h());
                }
                jSONObject.put("fragments", jSONArray);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    @NonNull
    public String toString() {
        try {
            return j().toString(0);
        } catch (JSONException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public vy7(Integer num, Integer num2, String str, String str2) {
        this.a = num;
        this.b = num2;
        this.f18032c = str;
        this.d = str2;
    }
}
