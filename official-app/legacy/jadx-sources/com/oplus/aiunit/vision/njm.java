package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public final class njm extends Thread {
    public Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public yjm f14537j;

    public njm(Context context) {
        this.i = context;
        this.f14537j = yjm.b(context);
    }

    public static tjm a(File file) throws Throwable {
        String strW = xsm.w(file);
        tjm tjmVar = new tjm();
        tjmVar.o(strW);
        return tjmVar;
    }

    public static boolean e(String str, ArrayList<tjm> arrayList) {
        Iterator<tjm> it = arrayList.iterator();
        while (it.hasNext()) {
            if (str.equals(it.next().j())) {
                return true;
            }
        }
        return false;
    }

    public final tjm b(String str) throws Throwable {
        if (str.equals("quanguo")) {
            str = "quanguogaiyaotu";
        }
        ljm ljmVarB = ljm.b(this.i);
        tjm tjmVarA = null;
        if (ljmVarB != null) {
            String strE = ljmVarB.E(str);
            File[] fileArrListFiles = new File(xsm.h0(this.i)).listFiles();
            if (fileArrListFiles == null) {
                return null;
            }
            for (File file : fileArrListFiles) {
                if ((file.getName().contains(strE) || file.getName().contains(str)) && file.getName().endsWith(".zip.tmp.dt")) {
                    tjmVarA = a(file);
                    if (tjmVarA.a() != null) {
                        return tjmVarA;
                    }
                }
            }
        }
        return tjmVarA;
    }

    public final void c() {
        tjm tjmVarB;
        String strI;
        int iIndexOf;
        boolean z;
        String strI2;
        int iIndexOf2;
        String strI3;
        int iIndexOf3;
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<tjm> arrayListC = this.f14537j.c();
        d(arrayList, "vmap/");
        d(arrayList, "map/");
        g(arrayList, "map/");
        ArrayList<String> arrayListF = f();
        for (tjm tjmVar : arrayListC) {
            if (tjmVar != null && tjmVar.a() != null) {
                int i = tjmVar.f18306l;
                boolean z2 = true;
                if (i == 4 || i == 7) {
                    boolean zContains = arrayList.contains(tjmVar.j());
                    if (zContains || (strI = ekm.i(tjmVar.g())) == null || (iIndexOf = arrayList.indexOf(strI)) == -1) {
                        z2 = zContains;
                    } else {
                        arrayList.set(iIndexOf, tjmVar.j());
                    }
                    if (!z2) {
                        this.f14537j.k(tjmVar);
                    }
                } else if (i == 0 || i == 1) {
                    z = arrayListF.contains(tjmVar.e()) || arrayListF.contains(tjmVar.j());
                    if (z || (strI2 = ekm.i(tjmVar.g())) == null || (iIndexOf2 = arrayListF.indexOf(strI2)) == -1) {
                        z2 = z;
                    } else {
                        arrayListF.set(iIndexOf2, tjmVar.j());
                    }
                    if (!z2) {
                        this.f14537j.k(tjmVar);
                    }
                } else if (i == 3 && tjmVar.i() != 0) {
                    z = arrayListF.contains(tjmVar.e()) || arrayListF.contains(tjmVar.j());
                    if (z || (strI3 = ekm.i(tjmVar.g())) == null || (iIndexOf3 = arrayListF.indexOf(strI3)) == -1) {
                        z2 = z;
                    } else {
                        arrayListF.set(iIndexOf3, tjmVar.j());
                    }
                    if (!z2) {
                        this.f14537j.k(tjmVar);
                    }
                }
            }
        }
        for (String str : arrayList) {
            if (!e(str, arrayListC) && (tjmVarB = b(str)) != null) {
                this.f14537j.e(tjmVarB);
            }
        }
        ljm ljmVarB = ljm.b(this.i);
        if (ljmVarB != null) {
            ljmVarB.j();
        }
    }

    public final void d(ArrayList<String> arrayList, String str) {
        File[] fileArrListFiles;
        String name;
        int iLastIndexOf;
        File file = new File(xsm.Y(this.i) + str);
        if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.getName().endsWith(".dat") && (iLastIndexOf = (name = file2.getName()).lastIndexOf(46)) >= 0 && iLastIndexOf < name.length()) {
                    String strSubstring = name.substring(0, iLastIndexOf);
                    if (!arrayList.contains(strSubstring)) {
                        arrayList.add(strSubstring);
                    }
                }
            }
        }
    }

    public final ArrayList<String> f() {
        File[] fileArrListFiles;
        String name;
        int iLastIndexOf;
        ArrayList<String> arrayList = new ArrayList<>();
        File file = new File(xsm.h0(this.i));
        if (!file.exists() || (fileArrListFiles = file.listFiles()) == null) {
            return arrayList;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.getName().endsWith(".zip") && (iLastIndexOf = (name = file2.getName()).lastIndexOf(46)) >= 0 && iLastIndexOf < name.length()) {
                arrayList.add(name.substring(0, iLastIndexOf));
            }
        }
        return arrayList;
    }

    public final void g(ArrayList<String> arrayList, String str) {
        File[] fileArrListFiles;
        String[] list;
        File file = new File(xsm.v(this.i) + str);
        if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    String name = file2.getName();
                    if (!TextUtils.isEmpty(name) && (list = file2.list()) != null && list.length > 0 && !arrayList.contains(name)) {
                        boolean z = true;
                        if (!name.equals("a0")) {
                            boolean z2 = false;
                            boolean z3 = false;
                            for (String str2 : list) {
                                if ("m1.ans".equals(str2)) {
                                    z2 = true;
                                }
                                if ("m3.ans".equals(str2)) {
                                    z3 = true;
                                }
                            }
                            if (!z2 || !z3) {
                                z = false;
                                break;
                            }
                        } else {
                            int length = list.length;
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    z = false;
                                    break;
                                } else if ("m1.ans".equals(list[i])) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                        if (z) {
                            arrayList.add(name);
                        }
                    }
                }
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            c();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
