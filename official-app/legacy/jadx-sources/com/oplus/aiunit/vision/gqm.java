package com.oplus.aiunit.vision;

import com.oplus.weatherservicesdk.data.Weather;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class gqm {
    public static String a = "";
    public static String b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f11865c = "";

    public static synchronized void a(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        d(arrayList);
    }

    public static synchronized void b(String str, String str2, String str3) {
        a = str;
        b = str2;
        f11865c = str3;
    }

    public static synchronized void c(Throwable th) {
        String string;
        ArrayList arrayList = new ArrayList();
        if (th != null) {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            string = stringWriter.toString();
        } else {
            string = "";
        }
        arrayList.add(string);
        d(arrayList);
    }

    public static synchronized void d(List<String> list) {
        if (!vam.c(b) && !vam.c(f11865c)) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(f11865c);
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                stringBuffer.append(", " + it.next());
            }
            stringBuffer.append(Weather.SEPARATOR);
            try {
                File file = new File(a);
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(a, b);
                if (!file2.exists()) {
                    file2.createNewFile();
                }
                FileWriter fileWriter = ((long) stringBuffer.length()) + file2.length() <= 51200 ? new FileWriter(file2, true) : new FileWriter(file2);
                fileWriter.write(stringBuffer.toString());
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception unused) {
            }
        }
    }
}
