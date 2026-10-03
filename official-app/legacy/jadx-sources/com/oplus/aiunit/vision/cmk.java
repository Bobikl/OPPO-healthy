package com.oplus.aiunit.vision;

import android.content.UriMatcher;
import android.net.Uri;
import com.heytap.health.watch.notification.impl.pull.NotificationApiService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class cmk extends UriMatcher {
    public Map<Integer, List<Uri>> a;

    public cmk(int i) {
        super(i);
        this.a = new HashMap();
    }

    public List<Uri> a(int i) {
        return this.a.get(Integer.valueOf(i));
    }

    @Override // android.content.UriMatcher
    public void addURI(String str, String str2, int i) {
        super.addURI(str, str2, i);
        Uri uri = Uri.parse(NotificationApiService.CONTENT + str + "/" + str2);
        List<Uri> arrayList = this.a.get(Integer.valueOf(i));
        if (lza.a(arrayList)) {
            arrayList = new ArrayList<>();
        }
        if (!arrayList.contains(uri)) {
            arrayList.add(uri);
        }
        this.a.put(Integer.valueOf(i), arrayList);
    }
}
