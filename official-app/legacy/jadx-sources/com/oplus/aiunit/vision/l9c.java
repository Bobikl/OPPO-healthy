package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.annotation.NonNull;
import com.heytap.health.watch.music.api.IMusicControlAidl;
import com.heytap.health.watch.music.control.MusicControlApiImpl;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes19.dex */
public class l9c implements cm9<IMusicControlAidl> {
    @Override // com.oplus.aiunit.vision.cm9
    public void a(@NonNull PrintWriter printWriter, String[] strArr) {
        MusicControlApiImpl.d().b(printWriter, strArr);
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void b(@NonNull Context context) {
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void c(@NonNull Context context) {
    }

    @Override // com.oplus.aiunit.vision.cm9
    @NonNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public IMusicControlAidl d() {
        return MusicControlApiImpl.d().c();
    }
}
