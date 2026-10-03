package com.oplus.aiunit.vision;

import android.graphics.Color;
import android.os.Environment;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.widget.TextView;
import com.heytap.health.wallet.bean.TaskResult;
import com.heytap.health.wallet.model.NfcCardDetail;
import com.heytap.wallet.business.bus.util.Img2DevSender;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class v13 {
    public static final HashMap<String, String> a;
    public static final HashMap<String, String> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap<String, String> f17665c;
    public static final HashMap<String, String> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f17666e;
    public static final Map<String, Img2DevSender> f;

    public class a implements l6h<NfcCardDetail> {
        public final /* synthetic */ String[] i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f17667j;
        public final /* synthetic */ d k;

        public a(String[] strArr, String str, d dVar) {
            this.i = strArr;
            this.f17667j = str;
            this.k = dVar;
        }

        @Override // com.oplus.aiunit.vision.l6h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(NfcCardDetail nfcCardDetail) {
            this.i[0] = nfcCardDetail.getCardNo();
            t6b.b("CardU", "db has cardNo: " + this.i[0]);
            if (TextUtils.isEmpty(this.i[0])) {
                v13.l(this.f17667j, this.k, "CardU");
                return;
            }
            d dVar = this.k;
            if (dVar != null) {
                dVar.a(this.i[0]);
            }
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onError(Throwable th) {
            d dVar = this.k;
            if (dVar != null) {
                dVar.a(null);
            }
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        }
    }

    public class b extends w60<TaskResult> {
        public final /* synthetic */ w92 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f17668c;
        public final /* synthetic */ String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f17669e;

        public b(w92 w92Var, d dVar, String str, String str2) {
            this.b = w92Var;
            this.f17668c = dVar;
            this.d = str;
            this.f17669e = str2;
        }

        @Override // com.oplus.aiunit.vision.w60
        public void b(Object obj) {
            d dVar = this.f17668c;
            if (dVar != null) {
                dVar.a(null);
            }
            if (obj == null) {
                t6b.i(this.f17669e, "onFailedUI:null");
                return;
            }
            t6b.i(this.f17669e, "onFailedUI:" + obj.toString());
        }

        @Override // com.oplus.aiunit.vision.w60
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(TaskResult taskResult) {
            w92 w92Var = this.b;
            ha2 ha2VarH = w92Var != null ? w92Var.h(taskResult, 2) : null;
            if (ha2VarH == null || !ha2VarH.f() || !ha2VarH.a(2)) {
                d dVar = this.f17668c;
                if (dVar != null) {
                    dVar.a(null);
                    return;
                }
                return;
            }
            String strE = ha2VarH.e(2);
            if (!TextUtils.isEmpty(strE)) {
                o6l.D(this.d, strE);
            }
            d dVar2 = this.f17668c;
            if (dVar2 != null) {
                dVar2.a(strE);
                t6b.b("CardU", "card idresult apdu -> " + strE);
            }
        }
    }

    public class c extends w60<TaskResult> {
        public final /* synthetic */ w92 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f17670c;

        public c(w92 w92Var, d dVar) {
            this.b = w92Var;
            this.f17670c = dVar;
        }

        @Override // com.oplus.aiunit.vision.w60
        public void b(Object obj) {
            d dVar = this.f17670c;
            if (dVar != null) {
                dVar.a(null);
            }
            if (obj == null) {
                t6b.i("CardU", "onFailedUI:null");
                return;
            }
            t6b.i("CardU", "onFailedUI:" + obj.toString());
        }

        @Override // com.oplus.aiunit.vision.w60
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(TaskResult taskResult) {
            w92 w92Var = this.b;
            ha2 ha2VarH = w92Var != null ? w92Var.h(taskResult, 2) : null;
            if (ha2VarH == null || !ha2VarH.f() || !ha2VarH.a(2)) {
                d dVar = this.f17670c;
                if (dVar != null) {
                    dVar.a(null);
                    return;
                }
                return;
            }
            String strE = ha2VarH.e(2);
            d dVar2 = this.f17670c;
            if (dVar2 != null) {
                dVar2.a(strE);
                t6b.b("CardU", "card idresult apdu -> " + strE);
            }
        }
    }

    public interface d {
        void a(String str);
    }

    static {
        HashMap<String, String> map = new HashMap<>();
        a = map;
        HashMap<String, String> map2 = new HashMap<>();
        b = map2;
        HashMap<String, String> map3 = new HashMap<>();
        f17665c = map3;
        HashMap<String, String> map4 = new HashMap<>();
        d = map4;
        f17666e = false;
        map.put("535A542E57414C4C45542E454E56", "0755");
        map.put("A00000063201010510009156000014A1", "9005");
        map.put("5943542E555345525800022058100000", "0020");
        map2.put("535A542E57414C4C45542E454E56", "https://img.oppomobile.com/wallet/nfc/cards-img/shenzhentong_big.png");
        map2.put("A00000063201010510009156000014A1", "https://img.oppomobile.com/wallet/nfc/cards-img/beijing_big.png");
        map2.put("5943542E555345525800022058100000", "https://img.oppomobile.com/wallet/nfc/cards-img/lingnantong_big.png");
        map3.put("535A542E57414C4C45542E454E56", "深圳通");
        map3.put("A00000063201010510009156000014A1", "京津冀互联互通卡");
        map3.put("5943542E555345525800022058100000", "岭南通•羊城通");
        map4.put("535A542E57414C4C45542E454E56", "https://img.oppomobile.com/wallet/nfc/cards-img/shenzhentong_log.png");
        map4.put("A00000063201010510009156000014A1", "https://img.oppomobile.com/wallet/nfc/cards-img/beijing_logo.png");
        map4.put("5943542E555345525800022058100000", "https://img.oppomobile.com/wallet/nfc/cards-img/lingnantong_logo.png");
        f = new HashMap();
    }

    public static void a(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        boolean zDelete = file.delete();
        StringBuilder sb = new StringBuilder();
        sb.append(" delete ");
        sb.append(zDelete);
    }

    public static String b(String str, String str2) {
        try {
            return smc.c(str2, smc.e(str), str.substring(52, 68));
        } catch (Exception e2) {
            t6b.c(e2.getLocalizedMessage());
            return "";
        }
    }

    public static void c(String str, d dVar) {
        t6b.b("CardU", "findCarNo");
        o6l.u(str).y(su8.c()).s(f30.c()).b(new a(new String[]{null}, str, dVar));
    }

    public static void d(String str, d dVar) {
        w92 w92VarF = tqc.g().f(str);
        z92 z92VarD = w92VarF != null ? w92VarF.d(2) : null;
        if (z92VarD != null && z92VarD.isValid()) {
            tpc.b().c(z92VarD, new c(w92VarF, dVar));
        } else if (dVar != null) {
            dVar.a(null);
        }
    }

    public static boolean e(String str) {
        return str.startsWith(z60.AID_LINGNANTONG_MOT_PREFIX) || h(str);
    }

    public static boolean f(String str) {
        return "A00000063201010510009156000014A1".equalsIgnoreCase(str);
    }

    public static boolean g(String str) {
        return f(str) || "A0000000033150869807010000000000".equalsIgnoreCase(str) || d04.AID_NINGBOTONG_MOT.equalsIgnoreCase(str);
    }

    public static boolean h(String str) {
        return "A0000006320101060200290046445774".equalsIgnoreCase(str) || "A00000004644574F50504F53484149".equalsIgnoreCase(str);
    }

    public static boolean i() {
        return f17666e;
    }

    public static boolean j(String str) {
        return "A0000000033610869807010000000000".equalsIgnoreCase(str);
    }

    public static boolean k(String str) {
        return f(str) || j(str);
    }

    public static void l(String str, d dVar, String str2) {
        t6b.b(str2, "--------readCardNoFromSe start----------");
        w92 w92VarF = tqc.g().f(str);
        z92 z92VarD = w92VarF != null ? w92VarF.d(2) : null;
        if (z92VarD != null && z92VarD.isValid()) {
            tpc.b().c(z92VarD, new b(w92VarF, dVar, str, str2));
        } else if (dVar != null) {
            dVar.a(null);
        }
    }

    public static void m(String str, String str2) {
        Img2DevSender img2DevSender;
        t6b.b("CardUtils", "===== sendCardImage START =====");
        t6b.b("CardUtils", "sendCardImage, aid: " + str + ", imageUrl: " + str2);
        t6b.b("CardUtils", "sendCardImage, called from: " + Thread.currentThread().getStackTrace()[3].getClassName() + "." + Thread.currentThread().getStackTrace()[3].getMethodName() + ":" + Thread.currentThread().getStackTrace()[3].getLineNumber());
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            t6b.i("CardUtils", "sendCardImage: imageUri or aid is empty, skip");
            return;
        }
        String path = Environment.getExternalStorageDirectory().getPath();
        String str3 = "wallet" + str.toLowerCase() + ".jpeg";
        String[] list = new File(path).list();
        if (list != null && list.length > 0) {
            for (String str4 : list) {
                if (str4.startsWith("wallet") && str4.endsWith(".jpeg")) {
                    File file = new File(path + "/" + str4);
                    StringBuilder sb = new StringBuilder();
                    sb.append("deletePath = ");
                    sb.append(str4);
                    a(file);
                }
            }
        }
        File file2 = new File(j6l.WALLET_MANAGER_DIR, str3);
        try {
            if (!file2.exists()) {
                file2.getParentFile().mkdirs();
                file2.createNewFile();
            }
        } catch (IOException e2) {
            t6b.d("CardUtils", "file create exception: " + e2.getMessage());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("trans file = ");
        sb2.append(file2.getPath());
        Map<String, Img2DevSender> map = f;
        synchronized (map) {
            img2DevSender = map.get(str);
            if (img2DevSender == null) {
                img2DevSender = new Img2DevSender(str, file2);
                map.put(str, img2DevSender);
                t6b.b("CardUtils", "Created new Img2DevSender for aid: " + str);
            } else {
                t6b.b("CardUtils", "Reusing existing Img2DevSender for aid: " + str);
            }
        }
        img2DevSender.g(str2);
        t6b.b("CardUtils", "===== sendCardImage END: aid=" + str + " =====");
    }

    public static void n(TextView textView, String str, int i, int i2, int i3, int i4) {
        SpannableString spannableString = new SpannableString(str);
        try {
            spannableString.setSpan(new ayf(i2, i), i3, i4, 256);
            spannableString.setSpan(new RelativeSizeSpan(1.0f), i3, i4, 256);
            textView.setText(spannableString);
        } catch (Exception unused) {
            t6b.i("CardUtils", "setSpannableString,bgColor=" + i2 + ",textColor=" + i);
            textView.setText(str);
        }
    }

    public static void o(TextView textView, String str, String str2, String str3, int i, int i2) {
        SpannableString spannableString = new SpannableString(str);
        try {
            spannableString.setSpan(new ayf(Color.parseColor(str3), Color.parseColor(str2)), i, i2, 256);
            spannableString.setSpan(new RelativeSizeSpan(1.0f), i, i2, 256);
            textView.setText(spannableString);
        } catch (Exception unused) {
            t6b.i("CardUtils", "setSpannableString,bgColor=" + str3 + ",textColor=" + str2);
            textView.setText(str);
        }
    }

    public static void p(boolean z) {
        f17666e = z;
    }
}
