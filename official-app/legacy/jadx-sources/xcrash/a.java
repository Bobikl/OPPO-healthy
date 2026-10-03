package xcrash;

import android.annotation.SuppressLint;
import android.os.Process;
import android.text.TextUtils;
import com.caverock.androidsvg.SVGParser;
import com.oplus.aiunit.vision.fp;
import com.oplus.aiunit.vision.js9;
import com.oplus.aiunit.vision.ko9;
import com.oplus.aiunit.vision.m60;
import com.oplus.aiunit.vision.qqk;
import com.oplus.aiunit.vision.vb7;
import com.oplus.weatherservicesdk.data.Weather;
import java.io.File;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"StaticFieldLeak"})
public class a implements Thread.UncaughtExceptionHandler {
    public static final a z = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f20852j;
    public String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f20853l;
    public String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f20854n;
    public String o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public String[] w;
    public ko9 x;
    public final Date i = new Date();
    public Thread.UncaughtExceptionHandler y = null;

    public static a c() {
        return z;
    }

    public final String a(String str) {
        ArrayList arrayList = new ArrayList();
        if (!str.contains("UnsatisfiedLinkError")) {
            return "";
        }
        String strD = null;
        for (String str2 : str.split("\"")) {
            if (!str2.isEmpty() && str2.endsWith(".so")) {
                arrayList.add(str2);
                String strSubstring = str2.substring(str2.lastIndexOf(47) + 1);
                arrayList.add(b.nativeLibDir + "/" + strSubstring);
                StringBuilder sb = new StringBuilder();
                sb.append("/vendor/lib/");
                sb.append(strSubstring);
                arrayList.add(sb.toString());
                arrayList.add("/vendor/lib64/" + strSubstring);
                arrayList.add("/system/lib/" + strSubstring);
                arrayList.add("/system/lib64/" + strSubstring);
                strD = d(arrayList);
            }
        }
        return "build id:\n" + strD + Weather.SEPARATOR;
    }

    public final String b(Date date, Thread thread, Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        return qqk.i(this.i, date, "java", this.f20853l, this.m) + "pid: " + this.f20852j + ", tid: " + Process.myTid() + ", name: " + thread.getName() + "  >>> " + this.k + " <<<\n\njava stacktrace:\n" + string + Weather.SEPARATOR + a(string);
    }

    public final String d(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            File file = new File(str);
            if (file.exists() && file.isFile()) {
                String strH = qqk.h(file);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);
                Date date = new Date(file.lastModified());
                sb.append("    ");
                sb.append(str);
                sb.append("(BuildId: unknown. FileSize: ");
                sb.append(file.length());
                sb.append(". LastModified: ");
                sb.append(simpleDateFormat.format(date));
                sb.append(". MD5: ");
                sb.append(strH);
                sb.append(")\n");
            } else {
                sb.append("    ");
                sb.append(str);
                sb.append(" (Not found)\n");
            }
        }
        return sb.toString();
    }

    public final String e(Thread thread) {
        ArrayList<Pattern> arrayList;
        if (this.w != null) {
            arrayList = new ArrayList<>();
            for (String str : this.w) {
                try {
                    arrayList.add(Pattern.compile(str));
                } catch (Exception e2) {
                    b.c().w("xcrash", "JavaCrashHandler pattern compile failed", e2);
                }
            }
        } else {
            arrayList = null;
        }
        StringBuilder sb = new StringBuilder();
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
            Thread key = entry.getKey();
            StackTraceElement[] value = entry.getValue();
            if (!key.getName().equals(thread.getName()) && (arrayList == null || h(arrayList, key.getName()))) {
                i2++;
                int i4 = this.v;
                if (i4 <= 0 || i < i4) {
                    sb.append("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n");
                    sb.append("pid: ");
                    sb.append(this.f20852j);
                    sb.append(", tid: ");
                    sb.append(key.getId());
                    sb.append(", name: ");
                    sb.append(key.getName());
                    sb.append("  >>> ");
                    sb.append(this.k);
                    sb.append(" <<<\n");
                    sb.append(Weather.SEPARATOR);
                    sb.append("java stacktrace:\n");
                    for (StackTraceElement stackTraceElement : value) {
                        sb.append("    at ");
                        sb.append(stackTraceElement.toString());
                        sb.append(Weather.SEPARATOR);
                    }
                    sb.append(Weather.SEPARATOR);
                    i++;
                } else {
                    i3++;
                }
            }
        }
        if (allStackTraces.size() > 1) {
            if (i == 0) {
                sb.append("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n");
            }
            sb.append("total JVM threads (exclude the crashed thread): ");
            sb.append(allStackTraces.size() - 1);
            sb.append(Weather.SEPARATOR);
            if (arrayList != null) {
                sb.append("JVM threads matched whitelist: ");
                sb.append(i2);
                sb.append(Weather.SEPARATOR);
            }
            if (this.v > 0) {
                sb.append("JVM threads ignored by max count limit: ");
                sb.append(i3);
                sb.append(Weather.SEPARATOR);
            }
            sb.append("dumped JVM threads:");
            sb.append(i);
            sb.append(Weather.SEPARATOR);
            sb.append("+++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++\n");
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:58:0x012c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x011c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x012f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void f(Thread thread, Throwable th) throws Throwable {
        File fileG;
        String strB;
        Object obj;
        RandomAccessFile randomAccessFile;
        ko9 ko9Var;
        Date date = new Date();
        NativeHandler.a().d();
        m60.a().b();
        RandomAccessFile randomAccessFile2 = 0;
        try {
            fileG = vb7.l().g(String.format(Locale.US, "%s/%s_%020d_%s__%s%s", this.o, "tombstone", Long.valueOf(this.i.getTime() * 1000), this.m, this.k, ".java.xcrash"));
        } catch (Exception e2) {
            b.c().e("xcrash", "JavaCrashHandler createLogFile failed", e2);
            fileG = null;
        }
        try {
            strB = b(date, thread, th);
            obj = date;
        } catch (Exception e3) {
            js9 js9VarC = b.c();
            js9VarC.e("xcrash", "JavaCrashHandler getEmergency failed", e3);
            strB = null;
            obj = js9VarC;
        }
        try {
            if (fileG != null) {
                try {
                    randomAccessFile = new RandomAccessFile(fileG, "rws");
                    if (strB != null) {
                        try {
                            randomAccessFile.write(strB.getBytes("UTF-8"));
                        } catch (Exception e4) {
                            e = e4;
                            b.c().e("xcrash", "JavaCrashHandler write log file failed", e);
                            if (randomAccessFile != null) {
                                try {
                                    randomAccessFile.close();
                                } catch (Exception unused) {
                                }
                            }
                            ko9Var = this.x;
                            if (ko9Var != null) {
                                if (fileG != null) {
                                    try {
                                    } catch (Exception unused2) {
                                        return;
                                    }
                                }
                                ko9Var.a(fileG != null ? fileG.getAbsolutePath() : null, strB);
                            }
                        }
                    }
                    try {
                        int i = this.r;
                        if (i > 0 || this.p > 0 || this.q > 0) {
                            randomAccessFile.write(qqk.j(i, this.p, this.q).getBytes("UTF-8"));
                        }
                        if (this.s) {
                            randomAccessFile.write(qqk.e().getBytes("UTF-8"));
                        }
                        if (this.t) {
                            randomAccessFile.write(qqk.n().getBytes("UTF-8"));
                        }
                        randomAccessFile.write(qqk.l().getBytes("UTF-8"));
                        StringBuilder sb = new StringBuilder();
                        sb.append("foreground:\n");
                        sb.append(fp.d().f() ? "yes" : SVGParser.XML_STYLESHEET_ATTR_ALTERNATE_NO);
                        sb.append("\n\n");
                        randomAccessFile.write(sb.toString().getBytes("UTF-8"));
                        if (this.u) {
                            randomAccessFile.write(e(thread).getBytes("UTF-8"));
                        }
                        try {
                            randomAccessFile.close();
                        } catch (Exception unused3) {
                        }
                        strB = null;
                    } catch (Exception e5) {
                        e = e5;
                        strB = null;
                        b.c().e("xcrash", "JavaCrashHandler write log file failed", e);
                        if (randomAccessFile != null) {
                            randomAccessFile.close();
                        }
                    }
                } catch (Exception e6) {
                    e = e6;
                    randomAccessFile = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (randomAccessFile2 != 0) {
                        try {
                            randomAccessFile2.close();
                        } catch (Exception unused4) {
                        }
                    }
                    throw th;
                }
            }
            ko9Var = this.x;
            if (ko9Var != null) {
                ko9Var.a(fileG != null ? fileG.getAbsolutePath() : null, strB);
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile2 = obj;
        }
    }

    public void g(int i, String str, String str2, String str3, String str4, boolean z2, int i2, int i3, int i4, boolean z3, boolean z4, boolean z5, int i5, String[] strArr, ko9 ko9Var) {
        this.f20852j = i;
        if (TextUtils.isEmpty(str)) {
            str = "unknown";
        }
        this.k = str;
        this.f20853l = str2;
        this.m = str3;
        this.f20854n = z2;
        this.o = str4;
        this.p = i2;
        this.q = i3;
        this.r = i4;
        this.s = z3;
        this.t = z4;
        this.u = z5;
        this.v = i5;
        this.w = strArr;
        this.x = ko9Var;
        this.y = Thread.getDefaultUncaughtExceptionHandler();
        try {
            Thread.setDefaultUncaughtExceptionHandler(this);
        } catch (Exception e2) {
            b.c().e("xcrash", "JavaCrashHandler setDefaultUncaughtExceptionHandler failed", e2);
        }
    }

    public final boolean h(ArrayList<Pattern> arrayList, String str) {
        Iterator<Pattern> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) throws Throwable {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.y;
        if (uncaughtExceptionHandler != null) {
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
        try {
            f(thread, th);
        } catch (Exception e2) {
            b.c().e("xcrash", "JavaCrashHandler handleException failed", e2);
        }
        if (!this.f20854n) {
            fp.d().c();
            Process.killProcess(this.f20852j);
            System.exit(10);
        } else {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.y;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
        }
    }
}
