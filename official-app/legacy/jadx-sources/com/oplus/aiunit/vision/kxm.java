package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Environment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes12.dex */
public class kxm {
    public static AssetManager b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Resources f13449c = null;
    public static boolean d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Context f13450e = null;
    public static String f = "amap_resource";
    public static String g = "1_0_0";
    public static String i = ".jar";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f13451j = f + g + i;
    public static String h = ".png";
    public static String k = f + g + h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static String f13452l = "";
    public static String m = f13452l + f13451j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static Resources.Theme f13453n = null;
    public static Resources.Theme o = null;
    public static Field p = null;
    public static Field q = null;
    public static Activity r = null;
    public static int a = -1;

    public static class a implements FilenameFilter {
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(kxm.g);
            sb.append(kxm.i);
            return str.startsWith(kxm.f) && !str.endsWith(sb.toString());
        }
    }

    public static AssetManager a(String str) {
        AssetManager assetManager = null;
        try {
            Class<?> cls = Class.forName("android.content.res.AssetManager");
            AssetManager assetManager2 = (AssetManager) cls.getConstructor(null).newInstance(null);
            try {
                cls.getDeclaredMethod("addAssetPath", String.class).invoke(assetManager2, str);
                return assetManager2;
            } catch (Throwable th) {
                th = th;
                assetManager = assetManager2;
                c2n.r(th, "ResourcesUtil", "getAssetManager(String apkPath)");
                return assetManager;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static Resources b() {
        Resources resources = f13449c;
        return resources == null ? f13450e.getResources() : resources;
    }

    public static Resources c(Context context, AssetManager assetManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayMetrics.setToDefaults();
        return new Resources(assetManager, displayMetrics, context.getResources().getConfiguration());
    }

    public static View d(Context context, int i2) {
        XmlResourceParser xml = b().getXml(i2);
        View viewInflate = null;
        if (!d) {
            return LayoutInflater.from(context).inflate(xml, (ViewGroup) null);
        }
        try {
            int i3 = a;
            if (i3 == -1) {
                i3 = 0;
            }
            viewInflate = LayoutInflater.from(new jxm(context, i3, kxm.class.getClassLoader())).inflate(xml, (ViewGroup) null);
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                c2n.r(th, "ResourcesUtil", "selfInflate(Activity activity, int resource, ViewGroup root)");
            } finally {
                xml.close();
            }
        }
        return viewInflate;
    }

    public static OutputStream e(InputStream inputStream) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(new File(f13452l, f13451j));
        byte[] bArr = new byte[1024];
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 <= 0) {
                return fileOutputStream;
            }
            fileOutputStream.write(bArr, 0, i2);
        }
    }

    public static boolean f(Context context) {
        try {
            f13450e = context;
            File fileG = g(context);
            if (fileG != null) {
                f13452l = fileG.getAbsolutePath() + "/";
            }
            m = f13452l + f13451j;
            if (!d) {
                return true;
            }
            if (!k(context)) {
                return false;
            }
            AssetManager assetManagerA = a(m);
            b = assetManagerA;
            f13449c = c(context, assetManagerA);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return true;
    }

    public static File g(Context context) {
        try {
            if (context == null) {
                if (context != null) {
                    context.getFilesDir();
                }
                return null;
            }
            try {
                File externalFilesDir = (Environment.getExternalStorageState().equals("mounted") && Environment.getExternalStorageDirectory().canWrite()) ? context.getExternalFilesDir("LBS") : context.getFilesDir();
                if (externalFilesDir == null) {
                    context.getFilesDir();
                }
                return externalFilesDir;
            } catch (Exception e2) {
                e2.printStackTrace();
                if (0 == 0) {
                    return context.getFilesDir();
                }
                return null;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                context.getFilesDir();
            }
            throw th;
        }
    }

    public static boolean i(InputStream inputStream) throws IOException {
        File file = new File(m);
        long length = file.length();
        int iAvailable = inputStream.available();
        if (!file.exists() || length != iAvailable) {
            return false;
        }
        inputStream.close();
        return true;
    }

    public static boolean k(Context context) {
        m(context);
        InputStream inputStreamOpen = null;
        try {
            inputStreamOpen = context.getResources().getAssets().open(k);
            if (i(inputStreamOpen)) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                        c2n.r(e2, "ResourcesUtil", "copyResourceJarToAppFilesDir(Context ctx)");
                    }
                }
                return true;
            }
            n();
            OutputStream outputStreamE = e(inputStreamOpen);
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                    c2n.r(e3, "ResourcesUtil", "copyResourceJarToAppFilesDir(Context ctx)");
                }
            }
            outputStreamE.close();
            return true;
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                c2n.r(th, "ResourcesUtil", "copyResourceJarToAppFilesDir(Context ctx)");
                if (inputStreamOpen == null) {
                    return false;
                }
                try {
                    return false;
                } catch (IOException e4) {
                    return false;
                }
            } finally {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                        c2n.r(e5, "ResourcesUtil", "copyResourceJarToAppFilesDir(Context ctx)");
                    }
                }
            }
        }
    }

    public static void m(Context context) {
        f13452l = context.getFilesDir().getAbsolutePath();
        m = f13452l + "/" + f13451j;
    }

    public static void n() {
        File[] fileArrListFiles = new File(f13452l).listFiles(new a());
        if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
            return;
        }
        for (File file : fileArrListFiles) {
            file.delete();
        }
    }
}
