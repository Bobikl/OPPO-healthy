package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes15.dex */
public class w9j {
    public final String a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set<String> f18176c;
    public final boolean d = d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ZoneId f18177e = ZoneId.systemDefault();

    public w9j(String str, String str2) {
        this.a = str;
        String str3 = str + "_SYNC_DATE:" + str2;
        this.b = str3;
        this.f18176c = qa2.spData.d(p9j.DB_SP_SYNC_FILE, str3, Collections.emptySet());
    }

    public void a(long j2, long j3) {
        if (d()) {
            return;
        }
        Set<String> setD = qa2.spData.d(p9j.DB_SP_SYNC_FILE, this.b, Collections.emptySet());
        if (setD.isEmpty()) {
            setD = new HashSet<>();
        }
        while (j2 < j3) {
            setD.add(LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), this.f18177e).format(DateTimeFormatter.BASIC_ISO_DATE));
            j2 += 86400000;
        }
        qa2.spData.A0(p9j.DB_SP_SYNC_FILE, this.b, setD);
        this.f18176c = setD;
    }

    public final void b(d8j d8jVar) {
        if (d8jVar == null) {
            return;
        }
        d8jVar.a(LocalDateTime.ofInstant(Instant.ofEpochMilli(System.currentTimeMillis()), ZoneId.systemDefault()).toLocalDate().atStartOfDay().minusDays(7L).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli(), LocalDateTime.ofInstant(Instant.ofEpochMilli(System.currentTimeMillis()), ZoneId.systemDefault()).toLocalDate().atStartOfDay().plusDays(1L).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
    }

    public boolean c(long j2) {
        Set<String> set;
        if (this.d || j2 < 1577808000000L || (set = this.f18176c) == null) {
            return true;
        }
        return set.contains(LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), this.f18177e).format(DateTimeFormatter.BASIC_ISO_DATE));
    }

    public final boolean d() {
        boolean zIsEmpty = TextUtils.isEmpty(this.a);
        if (zIsEmpty) {
            cj4.b("SyncDataRecord", "type is invalid");
        }
        return zIsEmpty;
    }

    public void e(List<Long> list, d8j d8jVar, String str) {
        if (d()) {
            return;
        }
        f(list, str);
        b(d8jVar);
    }

    public final void f(List<Long> list, String str) {
        p9j.b(this.a, list, str);
        cj4.c("SyncDataRecord", "noSyncVersions is " + list.toString());
    }
}
