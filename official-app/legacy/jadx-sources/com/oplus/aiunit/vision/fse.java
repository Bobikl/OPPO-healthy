package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.heytap.webpro.preload.network.core.CoreResponse;
import com.heytap.webpro.preload.parallel.PreloadParallelRepository;
import com.heytap.webpro.preload.parallel.entity.Limit;
import com.heytap.webpro.preload.parallel.entity.PreloadConfig;
import com.heytap.webpro.preload.parallel.entity.PreloadParam;
import com.oplus.smartenginehelper.ParserTag;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class fse implements kv9 {
    public final PreloadParallelRepository a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bv9 f11484c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final URI f11485e;
    public zu9 f;

    public static class b {
        public String a;
        public bv9 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public zu9 f11486c;
        public boolean d = true;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f11487e;

        public fse f() {
            return new fse(this);
        }

        public b g(String str) {
            this.f11487e = str;
            return this;
        }

        public b h(String str) {
            this.a = str;
            return this;
        }

        public b i(boolean z) {
            this.d = z;
            return this;
        }

        public b j(zu9 zu9Var) {
            this.f11486c = zu9Var;
            return this;
        }

        public b k(bv9 bv9Var) {
            this.b = bv9Var;
            return this;
        }
    }

    public static /* synthetic */ void g(pt9 pt9Var) {
        pt9Var.onResult(CoreResponse.error(-1000, "get method refuse").toJsonObject());
    }

    @Override // com.oplus.aiunit.vision.kv9
    public boolean a(@NonNull String str) {
        if (!this.d) {
            q7b.n("PreloadDataManager", "isParallelUrl, isEnable is false");
            return false;
        }
        String strB = qse.b(str);
        boolean z = cse.f().i(strB) != null;
        if (this.f != null) {
            String strE = cse.f().e(strB);
            if (z) {
                this.f.parallelInterceptSuccess(strE, strB);
            } else {
                this.f.parallelInterceptorFailed(strE, strB);
            }
        }
        return z;
    }

    @Override // com.oplus.aiunit.vision.kv9
    public void b(@NonNull String str, @NonNull final pt9<JSONObject> pt9Var) {
        if (!this.d) {
            q7b.d("PreloadDataManager", "getParallelPageData, isEnable is false");
            pt9Var.onResult(null);
            return;
        }
        PreloadConfig.PreloadConfigData preloadConfigDataI = cse.f().i(str);
        String strE = cse.f().e(str);
        if (preloadConfigDataI == null) {
            q7b.d("PreloadDataManager", "getParallelPageData, data == null");
            pt9Var.onResult(null);
            return;
        }
        if (!f(preloadConfigDataI)) {
            q7b.d("PreloadDataManager", "isNeedRequest is false");
            pt9Var.onResult(null);
            return;
        }
        preloadConfigDataI.url = str;
        String str2 = preloadConfigDataI.method;
        zu9 zu9Var = this.f;
        if (zu9Var != null) {
            zu9Var.parallelInterceptSuccess(strE, str);
        }
        bv9 bv9VarG = TextUtils.isEmpty(strE) ? null : cse.f().g(strE);
        if (ParserTag.TAG_GET.equalsIgnoreCase(str2)) {
            lwj.i(new Runnable() { // from class: com.oplus.aiunit.vision.ese
                @Override // java.lang.Runnable
                public final void run() {
                    fse.g(pt9Var);
                }
            });
        } else {
            i(preloadConfigDataI.api, d(new JSONObject(h(preloadConfigDataI, bv9VarG)).toString(), bv9VarG), pt9Var);
        }
    }

    public final String d(String str, bv9 bv9Var) {
        if (bv9Var == null || TextUtils.isEmpty(str)) {
            return str;
        }
        String strEncodeParam = bv9Var.encodeParam(str);
        return !TextUtils.isEmpty(strEncodeParam) ? strEncodeParam : str;
    }

    public void e(Context context) {
        d94.c(context);
        if (TextUtils.isEmpty(this.b)) {
            throw new IllegalArgumentException("businessCode is null");
        }
        if (this.d && !dse.b().c(this.b)) {
            dse.b().a(this.b);
        }
    }

    public final boolean f(PreloadConfig.PreloadConfigData preloadConfigData) {
        List<Limit> list = preloadConfigData.limit;
        if (list != null && !list.isEmpty()) {
            Iterator<Limit> it = list.iterator();
            while (it.hasNext()) {
                if (!Limit.checkLimit(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    public final Map<String, String> h(PreloadConfig.PreloadConfigData preloadConfigData, bv9 bv9Var) {
        Map<String, String> params;
        TreeMap treeMap = new TreeMap();
        if (bv9Var != null && (params = bv9Var.getParams()) != null && !params.isEmpty()) {
            treeMap.putAll(params);
        }
        for (PreloadParam preloadParam : preloadConfigData.query) {
            String strA = j7e.a(bv9Var, preloadParam.type, preloadConfigData.url, preloadParam.value);
            if (!TextUtils.isEmpty(strA) && !"null".equalsIgnoreCase(strA)) {
                treeMap.put(preloadParam.key, strA);
            }
        }
        if (preloadConfigData.signature && bv9Var != null) {
            treeMap.put("sign", bv9Var.getSign(treeMap));
        }
        return treeMap;
    }

    public final void i(String str, String str2, @NonNull pt9<JSONObject> pt9Var) {
        this.a.q(str, str2, pt9Var);
    }

    public void j() {
        if (!this.d) {
            q7b.n("PreloadDataManager", "refreshParallelConfig, isEnable is false");
            return;
        }
        this.a.n(this.f11485e.resolve(String.format("preload/config_%s.json", this.b)).toString(), this.b);
    }

    public void k(boolean z) {
        this.d = z;
    }

    public fse(b bVar) {
        String str = bVar.a;
        this.b = str;
        bv9 bv9Var = bVar.b;
        this.f11484c = bv9Var;
        this.f = bVar.f11486c;
        cse.f().b(str, bv9Var);
        this.a = PreloadParallelRepository.m();
        this.d = bVar.d;
        try {
            this.f11485e = new URI(bVar.f11487e);
        } catch (URISyntaxException e2) {
            throw new IllegalArgumentException("base url is illegal!", e2);
        }
    }
}
