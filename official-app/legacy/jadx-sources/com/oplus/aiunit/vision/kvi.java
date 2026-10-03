package com.oplus.aiunit.vision;

import android.content.res.Resources;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.heytap.health.watch.watchface.proto.Proto$DeviceInfo;
import com.heytap.health.watchface.business.creation.category.outfits.bean.OutfitAlternativeImgBean;
import com.heytap.health.watchface.business.creation.category.outfits.bean.OutfitAlternativeVideoBean;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

/* JADX INFO: loaded from: classes19.dex */
public class kvi {
    public static final String ALBUM_CUSTOM_WATCH_FACE_PREFIX = "custom_";
    public static final String ALBUM_MEMORY_WATCH_FACE_PREFIX = "memory_";
    public static final String FLEXIBLE_CACHE_RES_DIR_NAME = "cache";
    public static final String FLEXIBLE_OUT_RES_DIR_NAME = "out";
    public static final String FLEXIBLE_RES_ROOT_DIR_NAME = "flexible";
    public static final String FLEXIBLE_SAMPLE_RES_DIR_NAME = "dial_template";
    public static final String FLEXIBLE_TEMPLATE_RES_DIR_NAME = "template";
    public static final String FLEXIBLE_WIDGET_RES_DIR_NAME = "widget";
    public static final String LAST_AI_STYLE = "last_ai_style";
    public static final String OUTFIT_CONFIG_FILE_NAME_TAG = "mConfigFile";
    public static final String OUTFIT_RES_FILE_NAME = "com.heytap.wearable.watchface.res";
    public static final String SELF_WATCH_FACE_PACKAGE_NAME = "com.heytap.wearable.watchface";
    public static final String SUFFIX_BIN = ".bin";
    public static final String SUFFIX_JPG = ".jpg";
    public static final String SUFFIX_PNG = ".png";
    public static final String SUFFIX_ZIP = ".zip";
    public static final String TAG = "StoreHelper";
    public static final String WATCH_FACE_MANAGER_DIAL_DIR;
    public static final String WATCH_FACE_MANAGER_DIR;
    public static final String WATCH_FACE_MANAGER_LIST_CACHE_DIR = "/ListCache/";
    public static final String WATCH_FACE_MANAGER_PREVIEW_DIR = "/CurrentWf/";
    public static final String WATCH_FACE_MANAGER_STRIPE_MODEL_DIR;
    public static final String WATCH_FACE_MANAGER_TEMP_DIR;
    public static final String d;
    public Proto$DeviceInfo a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13430c;

    public class a {
        public String a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f13431c;
        public String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f13432e;

        public a(OutfitAlternativeImgBean outfitAlternativeImgBean) {
            this.f13432e = "";
            this.d = outfitAlternativeImgBean.timeFileName;
            this.f13431c = outfitAlternativeImgBean.backgroundName;
            if (outfitAlternativeImgBean instanceof OutfitAlternativeVideoBean) {
                this.f13432e = ((OutfitAlternativeVideoBean) outfitAlternativeImgBean).backgroundImgName;
            }
        }

        public final void a(String str) {
            File file = new File(str);
            if (file.exists()) {
                return;
            }
            try {
                file.createNewFile();
            } catch (IOException e2) {
                ltl.b(kvi.TAG, "[createFile] --> error=" + e2.getMessage());
            }
        }

        public String b() {
            return this.f13432e;
        }

        public String c() {
            String str = j() + this.f13432e;
            a(str);
            return str;
        }

        public String d() {
            return this.f13431c;
        }

        public String e() {
            String str = j() + this.f13431c;
            a(str);
            return str;
        }

        public String f() {
            String str = j() + "config.json";
            a(str);
            return str;
        }

        public String g() {
            String str = kvi.this.b + "ai//resource/" + this.a + ".png";
            a(str);
            return str;
        }

        public String h() {
            return this.d;
        }

        public String i() {
            return this.a;
        }

        public String j() {
            String str = this.b;
            if (str != null) {
                return str;
            }
            String strSubstring = UUID.randomUUID().toString().replace("-", "").substring(0, 8);
            this.a = strSubstring;
            String str2 = kvi.this.b + "ai//resource/" + strSubstring + "/";
            File file = new File(str2);
            if (!file.exists()) {
                file.mkdirs();
            }
            this.b = str2;
            return str2;
        }

        public String k(boolean z) {
            String str = kvi.this.f() + this.a + (z ? ".bin" : ".zip");
            a(str);
            return str;
        }
    }

    static {
        String str = b78.a().getFilesDir() + "/WatchFace";
        WATCH_FACE_MANAGER_DIR = str;
        WATCH_FACE_MANAGER_DIAL_DIR = str + "/Dial";
        WATCH_FACE_MANAGER_TEMP_DIR = str + "/Temp";
        WATCH_FACE_MANAGER_STRIPE_MODEL_DIR = str + "/StripeModel";
        d = File.separator;
    }

    public kvi(Proto$DeviceInfo proto$DeviceInfo) {
        this.a = proto$DeviceInfo;
        String strR7 = grl.a(proto$DeviceInfo.getDeviceMac()).R7();
        StringBuilder sb = new StringBuilder();
        sb.append(WATCH_FACE_MANAGER_DIR);
        String str = d;
        sb.append(str);
        sb.append(strR7);
        sb.append(str);
        this.b = sb.toString();
        this.f13430c = "watch_" + strR7;
    }

    public static void b(String str) {
        ltl.a(TAG, "[clearDeviceData]" + str);
        String str2 = WATCH_FACE_MANAGER_DIR + File.separator + str;
        File file = new File(str2);
        if (file.exists()) {
            ld7.i(file);
            ltl.a(TAG, "[unbound] clear path " + str2);
        }
        v9g.x("watch_" + str).k();
    }

    public final String A(boolean z) {
        return z ? ".bin" : ".zip";
    }

    public String B(boolean z, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(z ? C() : M());
        String str2 = d;
        sb.append(str2);
        sb.append("Cut");
        sb.append(str2);
        sb.append(str);
        return sb.toString();
    }

    public String C() {
        return i0() + d + TypedValues.Custom.NAME;
    }

    public final File D(String str, String str2) {
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str);
        if (file2.exists()) {
            file2.delete();
        }
        try {
            file2.createNewFile();
        } catch (IOException e2) {
            ltl.b(TAG, "[getFile] --> [" + str + "] ,error=" + e2.getMessage());
        }
        if (!file2.exists()) {
            ltl.b(TAG, "[getFile] --> [" + str + "] , error file create fail");
        }
        return file2;
    }

    public String E() {
        return G("cache");
    }

    public String F() {
        return G(FLEXIBLE_OUT_RES_DIR_NAME);
    }

    public String G(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(H());
        String str2 = d;
        sb.append(str2);
        sb.append(str);
        sb.append(str2);
        File file = new File(sb.toString());
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getPath();
    }

    public String H() {
        File file = new File(this.b + FLEXIBLE_RES_ROOT_DIR_NAME);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getPath();
    }

    public String I() {
        return G(FLEXIBLE_SAMPLE_RES_DIR_NAME);
    }

    public String J() {
        return G(FLEXIBLE_TEMPLATE_RES_DIR_NAME);
    }

    public String K() {
        return G("widget");
    }

    public String L() {
        File file = new File(this.b + "livephoto/");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getPath();
    }

    public String M() {
        return i0() + d + "Memory";
    }

    public String N() {
        File file = new File(this.b + lo9.TAG_DEFAULT_CREATION_OMOJI + "/resource");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getPath();
    }

    public String O() {
        File file = new File(this.b + lo9.TAG_DEFAULT_CREATION_OMOJI);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getPath();
    }

    public String P() {
        String str = this.b + lo9.TAG_DEFAULT_CREATION_OMOJI;
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(str, "temp");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return file2.getPath();
    }

    public String Q(String str) {
        String str2 = this.b + lo9.TAG_DEFAULT_CREATION_OMOJI + "/resource";
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(str2, str);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return file2.getPath();
    }

    public String R(String str) {
        String str2 = this.b + lo9.TAG_DEFAULT_CREATION_OMOJI;
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(str2, "zip");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return file2.getPath() + d + str + ".zip";
    }

    public String S(String str, boolean z) {
        File file = new File(this.b + "ai/");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, "zip");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return file2.getPath() + d + str + A(z);
    }

    public String T() {
        File file = new File(this.b + "ai/");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getPath();
    }

    public String U() {
        String str = this.b + lo9.TAG_DEFAULT_CREATION_PAINT;
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(str, "resource");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return file2.getPath();
    }

    public String V() {
        File file = new File(this.b + lo9.TAG_DEFAULT_CREATION_PAINT);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getPath();
    }

    public String W() {
        String str = this.b + lo9.TAG_DEFAULT_CREATION_PAINT;
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(str, "temp");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return file2.getPath();
    }

    public String X(String str) {
        String str2 = this.b + lo9.TAG_DEFAULT_CREATION_PAINT;
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(str2, "resource");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        File file3 = new File(file2, str);
        if (!file3.exists()) {
            file3.mkdirs();
        }
        return file3.getPath();
    }

    public String Y(String str, boolean z) {
        String str2 = this.b + lo9.TAG_DEFAULT_CREATION_PAINT;
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(str2, "zip");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return file2.getPath() + d + str + A(z);
    }

    public String Z() {
        return WATCH_FACE_MANAGER_DIR + d;
    }

    public String a0() {
        return this.b;
    }

    public String b0() {
        return this.f13430c;
    }

    public void c(String str) throws Throwable {
        FileOutputStream fileOutputStream;
        if (this.a == null) {
            ltl.a(TAG, "copyRsAiConfigFile mDeviceInfo = null");
            return;
        }
        File fileL = l("watchFace_config.xml");
        InputStream inputStream = null;
        try {
            Resources resourcesP = ntl.m().i(this.a).l().v().p("com.heytap.wearable.watchface");
            if (resourcesP == null) {
                ltl.i(TAG, "[copyRsAiConfigFile] --> resources==null.");
                nt9.a(null, TAG);
                nt9.a(null, TAG);
                return;
            }
            InputStream inputStreamOpen = resourcesP.getAssets().open("configs/" + str);
            try {
                fileOutputStream = new FileOutputStream(fileL);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStreamOpen.read(bArr);
                        if (i == -1) {
                            break;
                        } else {
                            fileOutputStream.write(bArr, 0, i);
                        }
                    }
                    fileOutputStream.flush();
                    inputStreamOpen.close();
                    fileOutputStream.close();
                    nt9.a(inputStreamOpen, TAG);
                } catch (IOException e2) {
                    inputStream = inputStreamOpen;
                    e = e2;
                    try {
                        ltl.b(TAG, "[copyRsAiConfigFile] --> error=" + e.getMessage());
                        nt9.a(inputStream, TAG);
                    } catch (Throwable th) {
                        th = th;
                        nt9.a(inputStream, TAG);
                        nt9.a(fileOutputStream, TAG);
                        throw th;
                    }
                } catch (Throwable th2) {
                    inputStream = inputStreamOpen;
                    th = th2;
                    nt9.a(inputStream, TAG);
                    nt9.a(fileOutputStream, TAG);
                    throw th;
                }
            } catch (IOException e3) {
                inputStream = inputStreamOpen;
                e = e3;
                fileOutputStream = null;
            } catch (Throwable th3) {
                inputStream = inputStreamOpen;
                th = th3;
                fileOutputStream = null;
            }
            nt9.a(fileOutputStream, TAG);
        } catch (IOException e4) {
            e = e4;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    public String c0(String str) {
        String str2 = this.b + lo9.TAG_DEFAULT_CREATION_PAINT;
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(str2, "pack");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        File file3 = new File(file2, str);
        if (!file3.exists()) {
            file3.mkdirs();
        }
        return file3.getPath();
    }

    public String d() {
        String str = this.b + "outfit2Res/";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    public String d0() {
        String str = this.b + "video";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(str, "resource");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return file2.getPath();
    }

    public a e(OutfitAlternativeImgBean outfitAlternativeImgBean) {
        return new a(outfitAlternativeImgBean);
    }

    public String e0() {
        File file = new File(this.b + "video");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getPath();
    }

    public String f() {
        String str = this.b + "ai/zip/";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }

    public String f0() {
        String str = this.b + "video";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(str, "temp");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return file2.getPath();
    }

    public File g() {
        return D("style.bin", this.b + "outfit/");
    }

    public String g0(String str) {
        String str2 = this.b + "video";
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(str2, "resource");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        File file3 = new File(file2, str);
        if (!file3.exists()) {
            file3.mkdirs();
        }
        return file3.getPath();
    }

    public File h() {
        return l("edit_mode.bmp");
    }

    public String h0(String str) {
        String str2 = this.b + "video";
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(str2, "zip");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return file2.getPath() + d + str + ".zip";
    }

    public String i() {
        String strI = n9g.i(b78.a(), this.f13430c, LAST_AI_STYLE);
        ltl.d(TAG, "[getAiLocalStyleImageFilePath] --> 本地样式图使用图片=" + strI);
        if (TextUtils.isEmpty(strI)) {
            return null;
        }
        return this.b + "outfit/" + strI;
    }

    public String i0() {
        return this.b + "AlbumPhoto";
    }

    public File j() {
        return l("background.bmp");
    }

    public String j0() {
        return this.b + WATCH_FACE_MANAGER_LIST_CACHE_DIR;
    }

    public String k() {
        return this.b + "outfit/style/";
    }

    public String k0() {
        return this.b + "WatchID";
    }

    public final File l(String str) {
        return D(str, k());
    }

    public File m() {
        String str = System.currentTimeMillis() + ".png";
        n9g.s(b78.a(), this.f13430c, LAST_AI_STYLE, str);
        ltl.d(TAG, "[getAiStyleImageFile] --> 本地样式图使用图片=" + str);
        return l("style_select.bmp");
    }

    public String n(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(z ? C() : M());
        sb.append(d);
        return sb.toString();
    }

    public String o(boolean z, String str) {
        String strB = ybb.b(str);
        StringBuilder sb = new StringBuilder();
        sb.append(z ? C() : M());
        sb.append(d);
        sb.append(strB);
        sb.append(".jpg");
        return sb.toString();
    }

    public String p(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(z ? C() : M());
        String str = d;
        sb.append(str);
        sb.append("Temp");
        sb.append(str);
        return sb.toString();
    }

    public final String q(boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder();
        sb.append(z ? ALBUM_CUSTOM_WATCH_FACE_PREFIX : ALBUM_MEMORY_WATCH_FACE_PREFIX);
        sb.append(z2 ? y04.TIME_STYLE_UP_DIR_NAME : y04.TIME_STYLE_DOWN_DIR_NAME);
        sb.append(".png");
        return sb.toString();
    }

    public String r(boolean z, boolean z2) {
        return s(q(z, z2));
    }

    public String s(String str) {
        String strV = v();
        File file = new File(strV);
        if (!file.exists()) {
            ltl.a(TAG, file.getAbsolutePath() + " mkdir result = " + file.mkdir());
        }
        return strV + "/" + str;
    }

    public String t() {
        return C() + d + "Cut";
    }

    public String u(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(C());
        String str2 = d;
        sb.append(str2);
        sb.append("Cut");
        sb.append(str2);
        sb.append(str);
        return sb.toString();
    }

    public String v() {
        return i0() + d + "Temp";
    }

    public String w() {
        String str = this.b + lo9.TAG_DEFAULT_CREATION_CLASSIC;
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(str, SpeechConstant.RES_TYPE_ASSETS);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return file2.getPath();
    }

    public String x() {
        File file = new File(this.b + lo9.TAG_DEFAULT_CREATION_CLASSIC);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getPath();
    }

    public String y(String str) {
        String str2 = this.b + lo9.TAG_DEFAULT_CREATION_CLASSIC;
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(str2, "resource");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        File file3 = new File(file2, str);
        if (!file3.exists()) {
            file3.mkdirs();
        }
        return file3.getPath();
    }

    public String z(String str) {
        String str2 = this.b + lo9.TAG_DEFAULT_CREATION_CLASSIC;
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(str2, "zip");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return file2.getPath() + d + str + ".zip";
    }

    public kvi(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(WATCH_FACE_MANAGER_DIR);
        String str2 = d;
        sb.append(str2);
        sb.append(str);
        sb.append(str2);
        this.b = sb.toString();
        this.f13430c = "watch_" + str;
    }
}
