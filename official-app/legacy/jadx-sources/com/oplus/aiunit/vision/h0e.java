package com.oplus.aiunit.vision;

import com.heytap.health.watchface.R$drawable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public class h0e extends s3 {
    public static final int[] TIME_STYLE = {R$drawable.watch_face_watchfree_clock_style_up, R$drawable.watch_face_watchfree_clock_style_down, R$drawable.watch_face_watchfree_clock_style_mid};
    public static final int[] BACKGROUND_BACKGROUND = {R$drawable.watch_face_watchfree_album_default_bg_up, R$drawable.watch_face_watchfree_album_default_bg_down, R$drawable.watch_face_watchfree_album_default_bg_mid};

    public class a implements lo9 {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.lo9
        public int a() {
            return 3;
        }

        @Override // com.oplus.aiunit.vision.lo9
        public Map<String, int[]> b() {
            HashMap map = new HashMap();
            int[] iArr = h0e.TIME_STYLE;
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
            map.put(lo9.TAG_DEFAULT_CREATION_ALBUM, h0e.BACKGROUND_BACKGROUND);
            return map;
        }

        @Override // com.oplus.aiunit.vision.lo9
        public boolean f() {
            return true;
        }

        @Override // com.oplus.aiunit.vision.lo9
        public int g() {
            return 1;
        }

        @NotNull
        public final List<k11> h() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new qud("4db4f6f853dbab3749527f038b384781", "watchfree_ai_style_one.png", "imgs/tiaowen/tiaowen_C_05.png", "", "#FFF7E516", "#FFBDBDBD", "#FFFFFFFF", "times/watchFace_config_mode5.json"));
            arrayList.add(new qud("e3d4a04829a94851b0f01e01b8271fd2", "watchfree_ai_style_two.png", "imgs/tiaowen/tiaowen_04.png", "", "#FFF5814E", "#FFFBFFE4", "#FF000000", "times/watchFace_config_mode3.json"));
            arrayList.add(new qud("f5154348c2418f457095e96c5a96aeb3", "watchfree_ai_style_three.png", "imgs/qita/qita_A_05.png", "", "#FFF5814E", "#FFAFDEF6", "#FF000000", "times/watchFace_config_mode4.json"));
            return arrayList;
        }

        @NotNull
        public final List<k11> i() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new i5e("defaultStyleZero", 0, 6));
            arrayList.add(new i5e("defaultStyleOne", 0, 7));
            arrayList.add(new i5e("defaultStyleFive", 1, 0));
            return arrayList;
        }
    }

    @Override // com.oplus.aiunit.vision.s3
    public lo9 b() {
        return new a();
    }
}
