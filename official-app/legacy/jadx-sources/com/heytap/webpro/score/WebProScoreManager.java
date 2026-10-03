package com.heytap.webpro.score;

import android.text.TextUtils;
import android.util.ArraySet;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.oplus.aiunit.vision.bia;
import com.oplus.aiunit.vision.q7b;
import com.oplus.aiunit.vision.uo3;
import com.oplus.aiunit.vision.zmk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class WebProScoreManager {
    public List<DomainScoreEntity> a = new ArrayList();
    public Set<String> b = null;

    public static final class a {
        public static final WebProScoreManager a = new WebProScoreManager();
    }

    public static WebProScoreManager d() {
        return a.a;
    }

    public void a(List<DomainScoreEntity> list) {
        if (list == null || list.isEmpty()) {
            q7b.d("ScoreManager", "scoreListString is empty");
            return;
        }
        try {
            this.a.addAll(list);
            j();
        } catch (Exception e2) {
            q7b.f("ScoreManager", "ScoreManager addDomainScoreList error!", e2);
        }
    }

    public List<DomainScoreEntity> b() {
        String strF;
        List<DomainScoreEntity> list;
        uo3 uo3VarJ = uo3.j();
        if (uo3VarJ.c("KEY_DOMAIN_SCORE_LIST")) {
            strF = uo3VarJ.f("KEY_DOMAIN_SCORE_LIST");
        } else {
            String strF2 = uo3.m().f("KEY_DOMAIN_SCORE_LIST");
            uo3VarJ.b("KEY_DOMAIN_SCORE_LIST", strF2);
            strF = strF2;
        }
        if (TextUtils.isEmpty(strF)) {
            return new ArrayList(0);
        }
        try {
            list = (List) new Gson().fromJson(strF, new TypeToken<List<DomainScoreEntity>>() { // from class: com.heytap.webpro.score.WebProScoreManager.2
            }.getType());
        } catch (Exception e2) {
            q7b.f("ScoreManager", "getDomainScoreList gson error!", e2);
            list = null;
        }
        return list != null ? list : new ArrayList(0);
    }

    public List<DomainScoreEntity> c() {
        List<DomainScoreEntity> list = this.a;
        if (list == null || list.isEmpty()) {
            this.a = b();
            StringBuilder sb = new StringBuilder();
            sb.append("white list use sp cache, domianList size is ");
            List<DomainScoreEntity> list2 = this.a;
            sb.append(list2 == null ? 0 : list2.size());
            q7b.a("ScoreManager", sb.toString());
        }
        return this.a;
    }

    public int e(String str, int i) {
        String strA = zmk.a(str);
        if (bia.a(strA)) {
            return 100;
        }
        Set<String> set = this.b;
        if (set != null && set.contains(strA)) {
            return 100;
        }
        DomainScoreEntity domainScoreEntityH = h(str);
        if (domainScoreEntityH == null) {
            return 0;
        }
        if (domainScoreEntityH.score == 100) {
            return 100;
        }
        return domainScoreEntityH.getScoreByPermissionType(i);
    }

    public int f(String str) {
        return e(str, 0);
    }

    public DomainScoreEntity g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List<DomainScoreEntity> list = this.a;
        if (list == null || list.isEmpty()) {
            c();
        }
        for (DomainScoreEntity domainScoreEntity : this.a) {
            if (str.equals(domainScoreEntity.url)) {
                return domainScoreEntity;
            }
        }
        return null;
    }

    public DomainScoreEntity h(String str) {
        return g(zmk.a(str));
    }

    public boolean i(String str) {
        return f(str) >= 0;
    }

    public final void j() {
        if (this.b == null) {
            ArraySet arraySet = new ArraySet();
            this.b = arraySet;
            this.b = Collections.synchronizedSet(arraySet);
        }
        List<DomainScoreEntity> list = this.a;
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<DomainScoreEntity> it = this.a.iterator();
        while (it.hasNext()) {
            DomainScoreEntity next = it.next();
            if (next != null && next.score >= 100) {
                this.b.add(next.url);
                it.remove();
            }
        }
    }

    public void k(String str) {
        uo3.j().b("KEY_DOMAIN_SCORE_LIST", str);
        if (TextUtils.isEmpty(str)) {
            q7b.d("ScoreManager", "scoreListString is empty");
        }
        try {
            this.a = (List) new Gson().fromJson(str, new TypeToken<List<DomainScoreEntity>>() { // from class: com.heytap.webpro.score.WebProScoreManager.1
            }.getType());
            j();
        } catch (Exception e2) {
            q7b.f("ScoreManager", "ScoreManager setDomainScoreListString error!", e2);
        }
    }
}
