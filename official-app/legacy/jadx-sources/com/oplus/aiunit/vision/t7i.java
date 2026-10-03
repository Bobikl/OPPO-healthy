package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.oms.split.full.splitload.SplitCompatResourcesException;
import com.oplus.oms.split.full.splitrequest.OMSRunTimeException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class t7i extends r7i {
    public static final AtomicReference<r7i> f = new AtomicReference<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<String> f16919e;

    public class a implements ajd {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.ajd
        public void a(List<u7i> list) {
            if (list == null || !list.isEmpty()) {
                return;
            }
            w7i.i("SplitLoadManager", "onLoadStatus " + list.toString(), new Object[0]);
        }
    }

    public t7i(Context context, int i, String str, List<String> list) {
        super(context, str, i);
        this.f16919e = list;
    }

    public static Intent D(Context context, String str) {
        h7i h7iVarC = j7i.s().c(context, str);
        if (h7iVarC == null) {
            return null;
        }
        return q(context, h7iVarC);
    }

    public static r7i E() {
        AtomicReference<r7i> atomicReference = f;
        if (atomicReference.get() != null) {
            return atomicReference.get();
        }
        throw new OMSRunTimeException("Have you invoke SplitLoadManagerImpl#install(Context) method?");
    }

    public static boolean F() {
        return f.get() != null;
    }

    public static void G(Context context, int i, String str, List<String> list) {
        AtomicReference<r7i> atomicReference = f;
        if (atomicReference.get() == null) {
            atomicReference.set(new t7i(context, i, str, list));
        }
    }

    public static Intent q(Context context, h7i h7iVar) {
        File fileI;
        boolean z;
        File[] fileArrListFiles;
        String strQ = h7iVar.q();
        int iE = o7i.e(context, strQ);
        if (iE == -1) {
            iE = y(strQ);
        }
        if (iE == -1) {
            w7i.c("SplitLoadManager", "split apk has not installed, split Name = " + strQ, new Object[0]);
            return null;
        }
        try {
            h7i.b bVarM = h7iVar.m(context);
            if (bVarM != null) {
                fileI = a8i.o().i(strQ, bVarM.b(), iE);
                if (fileI.exists() && (fileArrListFiles = fileI.listFiles(new FileFilter() { // from class: com.oplus.aiunit.vision.s7i
                    @Override // java.io.FileFilter
                    public final boolean accept(File file) {
                        return t7i.x(file);
                    }
                })) != null) {
                    int length = fileArrListFiles.length;
                    z = length > 0;
                    w7i.e("SplitLoadManager", "createInstalledSplitFileIntents count:" + length, new Object[0]);
                }
                if (bVarM != null || z) {
                    return r(context, fileI, h7iVar, iE);
                }
                o7i.l(h7iVar, iE, context);
                o7i.h(context, strQ, -1);
                w7i.e("SplitLoadManager", "split " + strQ + " not installed,lib need extract " + fileI, new Object[0]);
                return null;
            }
            fileI = null;
            z = false;
            if (bVarM != null) {
            }
            return r(context, fileI, h7iVar, iE);
        } catch (IOException e2) {
            w7i.c("SplitLoadManager", "getPrimaryLibData error " + e2.getMessage(), new Object[0]);
            return null;
        }
    }

    public static Intent r(Context context, File file, h7i h7iVar, int i) {
        String strQ = h7iVar.q();
        File fileD = a8i.o().d(strQ, i, false);
        ArrayList<String> arrayList = null;
        if (!fileD.exists()) {
            w7i.e("SplitLoadManager", "split apk installed error, split Name = " + strQ, new Object[0]);
            return null;
        }
        if (!pd7.j(fileD) || !e3h.e(context, fileD)) {
            w7i.i("SplitLoadManager", "split apk file is not legal or sign error", new Object[0]);
            pd7.d(fileD.getParentFile(), true);
            v(strQ);
            return null;
        }
        w7i.a("SplitLoadManager", "createLastInstalledSplitFileIntent " + fileD.getAbsolutePath(), new Object[0]);
        if (h7iVar.v()) {
            arrayList = new ArrayList<>();
            arrayList.add(fileD.getAbsolutePath());
            if (Build.VERSION.SDK_INT >= 34) {
                fileD.setReadOnly();
            }
        }
        Intent intent = new Intent();
        intent.putExtra("split_name", strQ);
        intent.putExtra("apk", fileD.getAbsolutePath());
        if (file != null) {
            intent.putExtra("native-lib-dir", file.getAbsolutePath());
            if (Build.VERSION.SDK_INT >= 34) {
                file.setReadOnly();
            }
        }
        if (arrayList != null) {
            intent.putStringArrayListExtra("added-dex", arrayList);
        }
        intent.putExtra("split_version", i);
        HashMap<String, String> mapC = h7iVar.c();
        if (mapC != null && !TextUtils.isEmpty(mapC.get("independent")) && SpeechConstant.TRUE_STR.equals(mapC.get("independent"))) {
            intent.putExtra("independent_split", true);
        }
        w7i.a("SplitLoadManager", strQ + " will work in process current process,apk:" + fileD.getAbsolutePath() + ",splitLibDir " + file, new Object[0]);
        return intent;
    }

    public static void v(String str) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(a8i.o().f(str), com.oplus.oms.split.full.splitinstall.a.h));
            try {
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8);
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
                    try {
                        bufferedWriter.write("");
                        bufferedWriter.flush();
                        bufferedWriter.close();
                        outputStreamWriter.close();
                        fileOutputStream.close();
                    } catch (Throwable th) {
                        try {
                            bufferedWriter.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        outputStreamWriter.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
                throw th5;
            }
        } catch (FileNotFoundException e2) {
            w7i.b("SplitLoadManager", "SplitCopier.lock no found", e2);
        } catch (IOException e3) {
            w7i.b("SplitLoadManager", "clean up split version code error", e3);
        }
    }

    public static /* synthetic */ boolean x(File file) {
        w7i.a("SplitLoadManager", "accept:" + file.getName(), new Object[0]);
        return file.getName().endsWith(".so");
    }

    public static int y(String str) {
        File file = new File(a8i.o().f(str), com.oplus.oms.split.full.splitinstall.a.h);
        int i = -1;
        if (!file.exists()) {
            return -1;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
                try {
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                    try {
                        i = bufferedReader.read();
                        bufferedReader.close();
                        inputStreamReader.close();
                        fileInputStream.close();
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                try {
                    fileInputStream.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
                throw th5;
            }
        } catch (FileNotFoundException e2) {
            w7i.b("SplitLoadManager", "SplitCopier.lock no found", e2);
        } catch (IOException e3) {
            w7i.b("SplitLoadManager", "get split version code error", e3);
        }
        w7i.a("SplitLoadManager", "getSplitVersionFromFile splitName = " + str + ", splitVersionCode = " + i, new Object[0]);
        return i;
    }

    public final Context A() {
        Context contextA = a();
        while (contextA instanceof ContextWrapper) {
            contextA = ((ContextWrapper) contextA).getBaseContext();
        }
        return contextA;
    }

    public final boolean B() {
        return !(a().getClassLoader() instanceof vlm);
    }

    public final boolean C() {
        List<String> list = this.f16919e;
        boolean z = list != null && list.contains(this.d);
        w7i.a("SplitLoadManager", "isInstallProcess = " + z, new Object[0]);
        return z;
    }

    @Override // com.oplus.aiunit.vision.r7i
    public void j(Resources resources) {
        try {
            d7i.b(a(), resources);
        } catch (SplitCompatResourcesException unused) {
            w7i.c("SplitLoadManager", "getResources error", new Object[0]);
        }
    }

    @Override // com.oplus.aiunit.vision.r7i
    public void k() {
        if (B()) {
            u(a().getClassLoader());
        }
        ClassLoader classLoader = a().getClassLoader();
        if (classLoader instanceof vlm) {
            ((vlm) classLoader).b = new zbm(a(), i(), f());
        }
    }

    @Override // com.oplus.aiunit.vision.r7i
    public void l(List<Intent> list, ajd ajdVar) {
        w7i.a("SplitLoadManager", "loadNow ", new Object[0]);
        t(list, ajdVar).run();
    }

    @Override // com.oplus.aiunit.vision.r7i
    public void m(Collection<String> collection) {
        w7i.a("SplitLoadManager", "preloadInstalledSplits = " + collection, new Object[0]);
        z(collection);
    }

    @Override // com.oplus.aiunit.vision.r7i
    public void o(String str) {
        npm npmVarN = n(str);
        if (npmVarN == null) {
            w7i.i("SplitLoadManager", "unloadSplit split not exists", new Object[0]);
        } else {
            s(npmVarN, g8i.b()).run();
        }
    }

    public final Runnable s(npm npmVar, f8i f8iVar) {
        return f() == 1 ? new fym(a(), npmVar, f8iVar) : new czm(a(), npmVar, f8iVar);
    }

    public final Runnable t(List<Intent> list, ajd ajdVar) {
        return f() == 1 ? new com.oplus.oms.split.full.splitload.f(this, list, ajdVar) : new com.oplus.oms.split.full.splitload.h(this, list, ajdVar);
    }

    public final void u(ClassLoader classLoader) {
        try {
            vlm.b(classLoader, A());
        } catch (Exception e2) {
            w7i.b("SplitLoadManager", "Failed to hook PathClassloader", e2);
        }
    }

    public final boolean w(h7i h7iVar) {
        List<String> listU = h7iVar.u();
        w7i.e("SplitLoadManager", "canBeWorkedInThisProcessForSplit:" + listU + ",currentProcessName:" + this.d, new Object[0]);
        if (listU == null || listU.isEmpty()) {
            return true;
        }
        return listU.contains(this.d);
    }

    public final void z(Collection<String> collection) {
        if (C() && ct2.b().d()) {
            return;
        }
        i7i i7iVarS = j7i.s();
        ArrayList<h7i> arrayList = new ArrayList();
        Collection<h7i> collectionE = collection == null ? i7iVarS.e(a()) : i7iVarS.b(a(), collection);
        if (collectionE != null) {
            arrayList.addAll(collectionE);
        }
        if (arrayList.isEmpty()) {
            w7i.i("SplitLoadManager", "Failed to get Split-Info list!", new Object[0]);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (h7i h7iVar : arrayList) {
            if (!w(h7iVar)) {
                w7i.e("SplitLoadManager", "Split " + h7iVar.q() + " do not need work in process " + this.d, new Object[0]);
            } else if (h().contains(h7iVar.q())) {
                w7i.e("SplitLoadManager", "Split " + h7iVar.q() + " has been loaded, ignore it!", new Object[0]);
            } else {
                Intent intentQ = q(a(), h7iVar);
                if (intentQ != null) {
                    arrayList2.add(intentQ);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            w7i.i("SplitLoadManager", "There are no installed splits!", new Object[0]);
        } else {
            l(arrayList2, new a());
        }
    }
}
