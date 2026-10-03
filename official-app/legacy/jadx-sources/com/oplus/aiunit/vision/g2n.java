package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class g2n {

    public static class a {
        public static g2n a = new g2n();
    }

    public static JSONObject a(Thread thread) {
        if (thread == null || thread.getStackTrace() == null) {
            return null;
        }
        StackTraceElement[] stackTrace = thread.getStackTrace();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("threadId", thread.getId());
            jSONObject.put("threadName", thread.getName());
            jSONObject.put("threadGroup", thread.getThreadGroup());
            StringBuffer stringBuffer = new StringBuffer();
            for (StackTraceElement stackTraceElement : stackTrace) {
                stringBuffer.append(stackTraceElement);
                stringBuffer.append("<br />");
            }
            jSONObject.put("stacks", stringBuffer.toString());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0067 A[EDGE_INSN: B:23:0x0067->B:24:0x0068 BREAK  A[LOOP:0: B:5:0x0014->B:96:0x0014]] */
    public static boolean b(Context context, String str, String str2, List<v0n> list, boolean z, v0n v0nVar) {
        String string;
        v0n v0nVar2 = null;
        if (str2 == null) {
            string = "";
            break;
        }
        Iterator<Thread> it = Thread.getAllStackTraces().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                string = null;
                break;
            }
            Thread next = it.next();
            if (next != null && !TextUtils.isEmpty(next.getName()) && (str2.contains(next.getName()) || next.getName().contains(str2))) {
                StackTraceElement[] stackTrace = next.getStackTrace();
                if (stackTrace != null) {
                    StringBuffer stringBuffer = new StringBuffer();
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        stringBuffer.append("at ");
                        stringBuffer.append(stackTraceElement);
                        stringBuffer.append("<br />");
                    }
                    string = stringBuffer.toString();
                    break;
                }
                string = "";
                break;
            }
        }
        if (!TextUtils.isEmpty(string)) {
            loop2: for (int i = 0; list != null && i < list.size(); i++) {
                v0n v0nVar3 = list.get(i);
                if (v0nVar3 != null) {
                    String[] strArrI = v0nVar3.i();
                    for (String str3 : strArrI) {
                        if (!TextUtils.isEmpty(strArrI[i]) && string.contains(str3)) {
                            v0nVar2 = v0nVar3;
                            break loop2;
                        }
                    }
                }
            }
        }
        if (z && v0nVar2 == null) {
            return false;
        }
        String str4 = str + "<br />" + string;
        if (str2 == null) {
            str2 = "";
        }
        String[] strArr = {"AMapPboRenderThread", "GLThread", "AMapGlRenderThread", "AMapThreadUtil", "GNaviMap", "main"};
        JSONArray jSONArray = new JSONArray();
        for (Thread thread : Thread.getAllStackTraces().keySet()) {
            if (thread != null && !str2.equals(thread.getName())) {
                for (int i2 = 0; i2 < 6; i2++) {
                    String str5 = strArr[i2];
                    String name = thread.getName();
                    if (((TextUtils.isEmpty(str5) || TextUtils.isEmpty(name) || (!str5.contains(name) && !name.contains(str5))) ? false : true) && a(thread) != null) {
                        jSONArray.put(a(thread));
                    }
                }
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("crashStack", str4);
            jSONObject.put("backStacks", jSONArray);
        } catch (Throwable unused) {
        }
        String string2 = jSONObject.toString();
        if (TextUtils.isEmpty(string2)) {
            return false;
        }
        try {
            if (z || v0nVar2 != null) {
                c2n.i(context, v0nVar2, string2, "NATIVE_CRASH_CLS_NAME", "NATIVE_CRASH_MHD_NAME");
                return true;
            }
            c2n.n(context, v0nVar, string2, "NATIVE_APP_CRASH_CLS_NAME", "NATIVE_CRASH_MHD_NAME");
            return true;
        } catch (Throwable unused2) {
        }
    }
}
