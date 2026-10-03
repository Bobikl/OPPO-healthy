package com.heytap.health.settings.watch.preferences;

import androidx.lifecycle.ViewModel;
import com.heytap.health.device_settings.impl.R$string;
import com.oplus.aiunit.vision.cqe;
import com.oplus.aiunit.vision.g07;
import com.oplus.aiunit.vision.lc5;
import com.oplus.aiunit.vision.pre;
import com.oplus.aiunit.vision.v9g;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class PreferenceViewModel extends ViewModel {
    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
    }

    public cqe u() {
        cqe cqeVar = new cqe();
        cqeVar.h(1);
        cqeVar.k(g07.b(R$string.settings_control_center));
        cqeVar.g(g07.b(R$string.settings_control_center_description));
        cqeVar.j(false);
        return cqeVar;
    }

    public cqe v(String str) {
        return w(v9g.w().r("key_band_music_control/" + str, !((Boolean) lc5.c(str).a(new pre())).booleanValue()));
    }

    public cqe w(boolean z) {
        cqe cqeVar = new cqe();
        cqeVar.h(3);
        cqeVar.k(g07.b(R$string.band_settings_music_controller));
        cqeVar.g(g07.b(R$string.band_settings_music_controller_description));
        cqeVar.j(true);
        cqeVar.i(z);
        return cqeVar;
    }

    public List<cqe> x(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(u());
        arrayList.add(y(str));
        arrayList.add(v(str));
        return arrayList;
    }

    public cqe y(String str) {
        cqe cqeVar = new cqe();
        cqeVar.h(2);
        cqeVar.k(g07.b(R$string.settings_quick_center));
        cqeVar.g(g07.b(((Boolean) lc5.c(str).a(new pre())).booleanValue() ? R$string.settings_quick_center_description1 : R$string.settings_quick_center_description));
        cqeVar.j(false);
        return cqeVar;
    }
}
