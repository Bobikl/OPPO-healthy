package com.oplus.aiunit.vision;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.oplus.oms.split.full.splitdownload.DownloadRequest;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class vzm {
    public final List<String> a;
    public final List<h7i> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<v5n> f18064c;
    public final List<DownloadRequest> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f18065e;
    public long f;
    public int g;
    public int h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PendingIntent f18066j;
    public List<Intent> k;

    public vzm(int i, List<String> list, List<h7i> list2, List<v5n> list3, List<DownloadRequest> list4) {
        this.i = i;
        this.a = list;
        this.b = list2;
        this.f18064c = list3;
        this.d = list4;
    }

    public static Bundle a(vzm vzmVar) {
        if (vzmVar == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", vzmVar.i);
        bundle.putInt("status", vzmVar.h);
        bundle.putInt("error_code", vzmVar.g);
        bundle.putLong("total_bytes_to_download", vzmVar.f);
        bundle.putLong("bytes_downloaded", vzmVar.f18065e);
        bundle.putStringArrayList("module_names", (ArrayList) vzmVar.a);
        bundle.putParcelable("user_confirmation_intent", vzmVar.f18066j);
        bundle.putParcelableArrayList("split_file_intents", (ArrayList) vzmVar.k);
        return bundle;
    }

    public void b(long j2) {
        if (this.f18065e != j2) {
            this.f18065e = j2;
        }
    }

    public void c(int i) {
        if (this.h != i) {
            this.h = i;
        }
    }
}
