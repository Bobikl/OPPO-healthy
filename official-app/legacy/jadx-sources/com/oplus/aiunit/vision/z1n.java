package com.oplus.aiunit.vision;

import android.os.Build;
import android.text.TextUtils;
import com.customer.feedback.sdk.util.HeaderInfoHelper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes12.dex */
public final class z1n {
    public static volatile com.amap.api.col.p0003sl.jq a;
    public static Properties b;

    public static com.amap.api.col.p0003sl.jq a() {
        if (a == null) {
            synchronized (z1n.class) {
                if (a == null) {
                    try {
                        com.amap.api.col.p0003sl.jq jqVarB = b(Build.MANUFACTURER);
                        if ("".equals(jqVarB.a())) {
                            Iterator it = Arrays.asList(com.amap.api.col.p0003sl.jq.MIUI.a(), com.amap.api.col.p0003sl.jq.Flyme.a(), com.amap.api.col.p0003sl.jq.RH.a(), com.amap.api.col.p0003sl.jq.ColorOS.a(), com.amap.api.col.p0003sl.jq.FuntouchOS.a(), com.amap.api.col.p0003sl.jq.SmartisanOS.a(), com.amap.api.col.p0003sl.jq.AmigoOS.a(), com.amap.api.col.p0003sl.jq.Sense.a(), com.amap.api.col.p0003sl.jq.LG.a(), com.amap.api.col.p0003sl.jq.Google.a(), com.amap.api.col.p0003sl.jq.NubiaUI.a()).iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    jqVarB = com.amap.api.col.p0003sl.jq.Other;
                                    break;
                                }
                                com.amap.api.col.p0003sl.jq jqVarB2 = b((String) it.next());
                                if (!"".equals(jqVarB2.a())) {
                                    jqVarB = jqVarB2;
                                    break;
                                }
                            }
                        }
                        a = jqVarB;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
        return a;
    }

    public static com.amap.api.col.p0003sl.jq b(String str) {
        if (str == null || str.length() <= 0) {
            return com.amap.api.col.p0003sl.jq.Other;
        }
        com.amap.api.col.p0003sl.jq jqVar = com.amap.api.col.p0003sl.jq.MIUI;
        if (!str.equalsIgnoreCase(jqVar.a())) {
            com.amap.api.col.p0003sl.jq jqVar2 = com.amap.api.col.p0003sl.jq.Flyme;
            if (!str.equalsIgnoreCase(jqVar2.a())) {
                com.amap.api.col.p0003sl.jq jqVar3 = com.amap.api.col.p0003sl.jq.RH;
                if (!str.equalsIgnoreCase(jqVar3.a())) {
                    com.amap.api.col.p0003sl.jq jqVar4 = com.amap.api.col.p0003sl.jq.ColorOS;
                    if (!str.equalsIgnoreCase(jqVar4.a())) {
                        com.amap.api.col.p0003sl.jq jqVar5 = com.amap.api.col.p0003sl.jq.FuntouchOS;
                        if (!str.equalsIgnoreCase(jqVar5.a())) {
                            com.amap.api.col.p0003sl.jq jqVar6 = com.amap.api.col.p0003sl.jq.SmartisanOS;
                            if (!str.equalsIgnoreCase(jqVar6.a())) {
                                com.amap.api.col.p0003sl.jq jqVar7 = com.amap.api.col.p0003sl.jq.AmigoOS;
                                if (!str.equalsIgnoreCase(jqVar7.a())) {
                                    com.amap.api.col.p0003sl.jq jqVar8 = com.amap.api.col.p0003sl.jq.EUI;
                                    if (!str.equalsIgnoreCase(jqVar8.a())) {
                                        com.amap.api.col.p0003sl.jq jqVar9 = com.amap.api.col.p0003sl.jq.Sense;
                                        if (!str.equalsIgnoreCase(jqVar9.a())) {
                                            com.amap.api.col.p0003sl.jq jqVar10 = com.amap.api.col.p0003sl.jq.LG;
                                            if (!str.equalsIgnoreCase(jqVar10.a())) {
                                                com.amap.api.col.p0003sl.jq jqVar11 = com.amap.api.col.p0003sl.jq.Google;
                                                if (!str.equalsIgnoreCase(jqVar11.a())) {
                                                    com.amap.api.col.p0003sl.jq jqVar12 = com.amap.api.col.p0003sl.jq.NubiaUI;
                                                    if (str.equalsIgnoreCase(jqVar12.a()) && q(jqVar12)) {
                                                        return jqVar12;
                                                    }
                                                } else if (p(jqVar11)) {
                                                    return jqVar11;
                                                }
                                            } else if (o(jqVar10)) {
                                                return jqVar10;
                                            }
                                        } else if (n(jqVar9)) {
                                            return jqVar9;
                                        }
                                    } else if (m(jqVar8)) {
                                        return jqVar8;
                                    }
                                } else if (l(jqVar7)) {
                                    return jqVar7;
                                }
                            } else if (k(jqVar6)) {
                                return jqVar6;
                            }
                        } else if (j(jqVar5)) {
                            return jqVar5;
                        }
                    } else if (i(jqVar4)) {
                        return jqVar4;
                    }
                } else if (h(jqVar3)) {
                    return jqVar3;
                }
            } else if (f(jqVar2)) {
                return jqVar2;
            }
        } else if (d(jqVar)) {
            return jqVar;
        }
        return com.amap.api.col.p0003sl.jq.Other;
    }

    public static void c(com.amap.api.col.p0003sl.jq jqVar, String str) {
        Matcher matcher = Pattern.compile("([\\d.]+)[^\\d]*").matcher(str);
        if (matcher.find()) {
            try {
                String strGroup = matcher.group(1);
                jqVar.a(strGroup);
                jqVar.a(Integer.parseInt(strGroup.split("\\.")[0]));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static boolean d(com.amap.api.col.p0003sl.jq jqVar) {
        if (TextUtils.isEmpty(e("ro.miui.ui.version.name"))) {
            return false;
        }
        String strE = e("ro.build.version.incremental");
        c(jqVar, strE);
        jqVar.b(strE);
        return true;
    }

    public static String e(String str) {
        Properties properties = b;
        String property = null;
        if (properties != null) {
            property = properties.getProperty("[" + str + "]", null);
        }
        return TextUtils.isEmpty(property) ? g(str) : property.replace("[", "").replace("]", "");
    }

    public static boolean f(com.amap.api.col.p0003sl.jq jqVar) {
        String strE = e("ro.flyme.published");
        String strE2 = e("ro.meizu.setupwizard.flyme");
        if (TextUtils.isEmpty(strE) && TextUtils.isEmpty(strE2)) {
            return false;
        }
        String strE3 = e(HeaderInfoHelper.RO_BUILD_ID);
        c(jqVar, strE3);
        jqVar.b(strE3);
        return true;
    }

    public static String g(String str) throws Throwable {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop ".concat(String.valueOf(str))).getInputStream()), 1024);
            try {
                String line = bufferedReader.readLine();
                bufferedReader.close();
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return line;
            } catch (IOException unused2) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused3) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (IOException unused5) {
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean h(com.amap.api.col.p0003sl.jq jqVar) {
        String strE = e(pcm.a);
        if (TextUtils.isEmpty(strE)) {
            return false;
        }
        c(jqVar, strE);
        jqVar.b(strE);
        return true;
    }

    public static boolean i(com.amap.api.col.p0003sl.jq jqVar) {
        String strE = e("ro.build.version.opporom");
        if (TextUtils.isEmpty(strE)) {
            return false;
        }
        c(jqVar, strE);
        jqVar.b(strE);
        return true;
    }

    public static boolean j(com.amap.api.col.p0003sl.jq jqVar) {
        String strE = e("ro.vivo.os.build.display.id");
        if (TextUtils.isEmpty(strE)) {
            return false;
        }
        c(jqVar, strE);
        jqVar.b(strE);
        return true;
    }

    public static boolean k(com.amap.api.col.p0003sl.jq jqVar) {
        String strE = e("ro.smartisan.version");
        if (TextUtils.isEmpty(strE)) {
            return false;
        }
        c(jqVar, strE);
        jqVar.b(strE);
        return true;
    }

    public static boolean l(com.amap.api.col.p0003sl.jq jqVar) {
        String strE = e(HeaderInfoHelper.RO_BUILD_ID);
        if (TextUtils.isEmpty(strE) || !strE.matches("amigo([\\d.]+)[a-zA-Z]*")) {
            return false;
        }
        c(jqVar, strE);
        jqVar.b(strE);
        return true;
    }

    public static boolean m(com.amap.api.col.p0003sl.jq jqVar) {
        String strE = e("ro.letv.release.version");
        if (TextUtils.isEmpty(strE)) {
            return false;
        }
        c(jqVar, strE);
        jqVar.b(strE);
        return true;
    }

    public static boolean n(com.amap.api.col.p0003sl.jq jqVar) {
        String strE = e("ro.build.sense.version");
        if (TextUtils.isEmpty(strE)) {
            return false;
        }
        c(jqVar, strE);
        jqVar.b(strE);
        return true;
    }

    public static boolean o(com.amap.api.col.p0003sl.jq jqVar) {
        String strE = e("sys.lge.lgmdm_version");
        if (TextUtils.isEmpty(strE)) {
            return false;
        }
        c(jqVar, strE);
        jqVar.b(strE);
        return true;
    }

    public static boolean p(com.amap.api.col.p0003sl.jq jqVar) {
        if (!"android-google".equals(e("ro.com.google.clientidbase"))) {
            return false;
        }
        String strE = e("ro.build.version.release");
        jqVar.a(Build.VERSION.SDK_INT);
        jqVar.b(strE);
        return true;
    }

    public static boolean q(com.amap.api.col.p0003sl.jq jqVar) {
        String strE = e("ro.build.nubia.rom.code");
        if (TextUtils.isEmpty(strE)) {
            return false;
        }
        c(jqVar, strE);
        jqVar.b(strE);
        return true;
    }
}
