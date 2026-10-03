package com.oplus.aiunit.vision;

import com.heytap.health.watchface.R$drawable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public class pad extends s3 {
    public static final int[] TIME_STYLE = {R$drawable.watch_face_watchfree_clock_style_up, R$drawable.watch_face_watchfree_clock_style_down, R$drawable.watch_face_watchfree_clock_style_mid};
    public static final int[] ALBUM_DEFAULT_BACKGROUND = {R$drawable.watch_face_watchfree_album_default_bg_up, R$drawable.watch_face_watchfree_album_default_bg_down, R$drawable.watch_face_watchfree_album_default_bg_mid};

    public class a implements lo9 {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.lo9
        public int a() {
            return 10;
        }

        @Override // com.oplus.aiunit.vision.lo9
        public Map<String, int[]> b() {
            HashMap map = new HashMap();
            int[] iArr = pad.TIME_STYLE;
            map.put(lo9.TAG_DEFAULT_CREATION_ALBUM, iArr);
            map.put(lo9.TAG_DEFAULT_CREATION_PAINT, iArr);
            return map;
        }

        @Override // com.oplus.aiunit.vision.lo9
        public Map<String, List<k11>> c() {
            HashMap map = new HashMap();
            map.put(lo9.TAG_DEFAULT_CREATION_PAINT, i());
            map.put(lo9.TAG_DEFAULT_CREATION_OUTFITS, h());
            return map;
        }

        @Override // com.oplus.aiunit.vision.lo9
        public boolean d() {
            return false;
        }

        @Override // com.oplus.aiunit.vision.lo9
        public Map<String, int[]> e() {
            HashMap map = new HashMap();
            map.put(lo9.TAG_DEFAULT_CREATION_ALBUM, pad.ALBUM_DEFAULT_BACKGROUND);
            return map;
        }

        @Override // com.oplus.aiunit.vision.lo9
        public boolean f() {
            return true;
        }

        @Override // com.oplus.aiunit.vision.lo9
        public int g() {
            return 3;
        }

        @NotNull
        public final List<k11> h() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new qud("ob2DefaultOutfitsStyle0", "bandv2_ai_style_one.png", "imgs/qita/qita_A_05.png", "", "#FFF5814E", "#FFAFDEF6", "#FF000000", "times/watchFace_config_mode1.json"));
            arrayList.add(new qud("ob2DefaultOutfitsStyle1", "bandv2_ai_style_one.png", "imgs/qita/qita_A_05.png", "", "#FFF5814E", "#FFAFDEF6", "#FF000000", "times/watchFace_config_mode5.json"));
            arrayList.add(new qud("ob2DefaultOutfitsStyle2", "bandv2_ai_style_one.png", "imgs/qita/qita_A_05.png", "", "#FFF5814E", "#FFAFDEF6", "#FF000000", "times/watchFace_config_mode3.json"));
            return arrayList;
        }

        @NotNull
        public final List<k11> i() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new i5e("ob2DefaultPaintStyle0", 0, 7));
            arrayList.add(new i5e("ob2DefaultPaintStyle1", 0, 7));
            arrayList.add(new i5e("ob2DefaultPaintStyle2", 0, 7));
            return arrayList;
        }
    }

    @Override // com.oplus.aiunit.vision.s3
    public lo9 b() {
        return new a();
    }
}
