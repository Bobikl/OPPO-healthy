package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.platform.usercenter.tools.device.OpenIDHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes11.dex */
public abstract class q7n {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public String b;

    public HashMap a(Context context, ArrayList arrayList) {
        return new HashMap();
    }

    public final void b(Context context, String str, String str2) {
        long j2;
        i8n i8nVar;
        if (str2 == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ThreadPoolExecutor threadPoolExecutor = o7n.f14829s_a;
        str.getClass();
        switch (str) {
            case "APID":
            case "GUID":
                j2 = 259200000;
                break;
            case "AUID":
                j2 = 604800000;
                break;
            case "DUID":
                j2 = 86400000;
                break;
            case "OUID":
            case "OUID_STATUS":
                j2 = 7200000;
                break;
            default:
                j2 = 0;
                break;
        }
        long j3 = j2 + jCurrentTimeMillis;
        if (str.equals(OpenIDHelper.GUID) || str.equals(OpenIDHelper.APID) || !"".equals(str2)) {
            if (!this.a.containsKey(str) || (i8nVar = (i8n) this.a.get(str)) == null) {
                i8nVar = new i8n(str2, j3);
                this.a.put(str, i8nVar);
            } else {
                i8nVar.a = str2;
                i8nVar.b = j3;
            }
            if (str.equals(OpenIDHelper.OUID) || str.equals("OUID_STATUS")) {
                return;
            }
            o7n.f(context, i8nVar, str);
        }
    }

    public abstract void c(Context context, ArrayList arrayList, boolean z);

    /* JADX WARN: Code duplicated, block: B:53:0x00a4 A[RETURN] */
    public final boolean d(String str) {
        long j2;
        boolean z;
        if (!this.a.isEmpty() && this.a.containsKey(str)) {
            try {
                i8n i8nVar = (i8n) this.a.get(str);
                if (i8nVar != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j3 = i8nVar.b;
                    if (jCurrentTimeMillis >= j3) {
                        k8n.a("invalid");
                    } else {
                        long jAbs = Math.abs(j3 - jCurrentTimeMillis);
                        ThreadPoolExecutor threadPoolExecutor = o7n.f14829s_a;
                        str.getClass();
                        switch (str) {
                            case "APID":
                            case "GUID":
                                j2 = 259200000;
                                break;
                            case "AUID":
                                j2 = 604800000;
                                break;
                            case "DUID":
                                j2 = 86400000;
                                break;
                            case "OUID":
                            case "OUID_STATUS":
                                j2 = 7200000;
                                break;
                            default:
                                j2 = 0;
                                break;
                        }
                        if (jAbs > j2) {
                            k8n.a("invalid");
                        } else {
                            z = true;
                        }
                        if (z) {
                            return true;
                        }
                    }
                    z = false;
                    if (z) {
                        return true;
                    }
                }
                return false;
            } catch (Exception e2) {
                StringBuilder sb = new StringBuilder("1094: ");
                sb.append(e2.getMessage() != null ? e2.getMessage() : e2.getLocalizedMessage());
                Log.e("IDHelper", sb.toString());
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:79:0x013c A[Catch: Exception -> 0x0156, TRY_LEAVE, TryCatch #0 {Exception -> 0x0156, blocks: (B:36:0x00b9, B:39:0x00c5, B:79:0x013c, B:40:0x00ca, B:76:0x0135), top: B:111:0x00b9 }] */
    public final HashMap e(Context context, ArrayList arrayList) {
        String str;
        String str2;
        i8n i8nVar;
        boolean z;
        long j2;
        HashMap mapA = a(context, arrayList);
        if (arrayList.isEmpty()) {
            k8n.a("2040");
            return mapA;
        }
        ArrayList arrayList2 = new ArrayList();
        if (this.a.isEmpty()) {
            ConcurrentHashMap concurrentHashMap = this.a;
            ThreadPoolExecutor threadPoolExecutor = o7n.f14829s_a;
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences("cache", 0);
                o7n.g(sharedPreferences, concurrentHashMap, OpenIDHelper.GUID, "GUID_TIME", "GUID_IV");
                o7n.g(sharedPreferences, concurrentHashMap, OpenIDHelper.APID, "APID_TIME", "APID_IV");
                if (!concurrentHashMap.containsKey(OpenIDHelper.DUID)) {
                    String string = sharedPreferences.getString(OpenIDHelper.DUID, null);
                    long j3 = sharedPreferences.getLong("DUID_TIME", 0L);
                    if (string != null && j3 != 0) {
                        concurrentHashMap.put(OpenIDHelper.DUID, new i8n(string, j3));
                    }
                }
                if (!concurrentHashMap.containsKey(OpenIDHelper.AUID)) {
                    String string2 = sharedPreferences.getString(OpenIDHelper.AUID, null);
                    long j4 = sharedPreferences.getLong("AUID_TIME", 0L);
                    if (string2 != null && j4 != 0) {
                        concurrentHashMap.put(OpenIDHelper.AUID, new i8n(string2, j4));
                    }
                }
            } catch (IllegalStateException e2) {
                k8n.b("1020", e2);
            } catch (Exception e3) {
                k8n.b("1064", e3);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (!this.a.containsKey(str3) || (i8nVar = (i8n) this.a.get(str3)) == null) {
                str2 = null;
            } else {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j5 = i8nVar.b;
                    if (jCurrentTimeMillis >= j5) {
                        k8n.a("invalid");
                    } else {
                        long jAbs = Math.abs(j5 - jCurrentTimeMillis);
                        ThreadPoolExecutor threadPoolExecutor2 = o7n.f14829s_a;
                        str3.getClass();
                        z = true;
                        switch (str3) {
                            case "APID":
                            case "GUID":
                                j2 = 259200000;
                                break;
                            case "AUID":
                                j2 = 604800000;
                                break;
                            case "DUID":
                                j2 = 86400000;
                                break;
                            case "OUID":
                            case "OUID_STATUS":
                                j2 = 7200000;
                                break;
                            default:
                                j2 = 0;
                                break;
                        }
                        if (jAbs > j2) {
                            k8n.a("invalid");
                        }
                        if (!z) {
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(str3);
                            k8n.a("1025");
                            o7n.f14829s_a.execute(new m7n(this, context, arrayList3));
                        }
                        str2 = i8nVar.a;
                    }
                    z = false;
                    if (!z) {
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add(str3);
                        k8n.a("1025");
                        o7n.f14829s_a.execute(new m7n(this, context, arrayList4));
                    }
                    str2 = i8nVar.a;
                } catch (Exception e4) {
                    StringBuilder sb = new StringBuilder("1095: ");
                    sb.append(e4.getMessage() != null ? e4.getMessage() : e4.getLocalizedMessage());
                    Log.e("IDHelper", sb.toString());
                    str2 = null;
                }
            }
            if (str2 == null) {
                arrayList2.add(str3);
            }
        }
        if (!arrayList2.isEmpty()) {
            k8n.a("1026");
            c(context, arrayList2, false);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str4 = (String) it2.next();
            i8n i8nVar2 = (i8n) this.a.get(str4);
            if (i8nVar2 == null) {
                str = str4 == "OUID_STATUS" ? "FALSE" : "";
            } else {
                if (str4.equals(OpenIDHelper.OUID) || str4.equals("OUID_STATUS")) {
                    this.a.remove(str4);
                }
                str = i8nVar2.a;
            }
            mapA.put(str4, str);
        }
        k8n.a("2025");
        return mapA;
    }
}
