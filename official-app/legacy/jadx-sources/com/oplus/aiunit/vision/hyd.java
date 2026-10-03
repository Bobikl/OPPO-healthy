package com.oplus.aiunit.vision;

import com.heytap.health.watchface.R$drawable;
import com.heytap.health.watchface.business.creation.category.classic.bean.ClassicStyleBean;
import com.heytap.health.watchface.business.creation.category.classic.bean.ClassicWidgetBean;
import com.heytap.health.watchface.business.creation.category.video.VideoCustomPresenter;
import com.heytap.health.watchface.business.creation.category.video.bean.VideoConfigBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public class hyd extends s3 {
    public static final int[] BACKGROUND_BACKGROUND;
    public static final int[] TIME_STYLE_ALBUM;
    public static final int[] TIME_STYLE_PAINT;
    public static final int[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f12309c;

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
            int[] iArr = hyd.TIME_STYLE_ALBUM;
            map.put(lo9.TAG_DEFAULT_CREATION_ALBUM, iArr);
            map.put(lo9.TAG_DEFAULT_CREATION_PAINT, hyd.TIME_STYLE_PAINT);
            map.put(lo9.TAG_DEFAULT_CREATION_WALLPAPER, iArr);
            map.put("video", hyd.f12309c);
            return map;
        }

        @Override // com.oplus.aiunit.vision.lo9
        public Map<String, List<k11>> c() {
            HashMap map = new HashMap();
            map.put(lo9.TAG_DEFAULT_CREATION_PAINT, l());
            map.put(lo9.TAG_DEFAULT_CREATION_OUTFITS, k());
            map.put(lo9.TAG_DEFAULT_CREATION_CLASSIC, i());
            map.put(lo9.TAG_DEFAULT_CREATION_OMOJI, j());
            map.put("video", m());
            return map;
        }

        @Override // com.oplus.aiunit.vision.lo9
        public boolean d() {
            return true;
        }

        @Override // com.oplus.aiunit.vision.lo9
        public boolean f() {
            return false;
        }

        @Override // com.oplus.aiunit.vision.lo9
        public int g() {
            return 8;
        }

        @Override // com.oplus.aiunit.vision.lo9
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public HashMap<String, int[]> e() {
            HashMap<String, int[]> map = new HashMap<>();
            map.put(lo9.TAG_DEFAULT_CREATION_ALBUM, hyd.BACKGROUND_BACKGROUND);
            map.put(lo9.TAG_DEFAULT_CREATION_WALLPAPER, hyd.b);
            return map;
        }

        @NotNull
        public final List<k11> i() {
            ArrayList arrayList = new ArrayList();
            ClassicStyleBean classicStyleBean = new ClassicStyleBean();
            classicStyleBean.setBackground("1");
            classicStyleBean.setPointer("1");
            classicStyleBean.setScale("1");
            classicStyleBean.setSeriesId("jingdian1");
            classicStyleBean.setWidgetId("3");
            ClassicWidgetBean classicWidgetBean = new ClassicWidgetBean("1", 3, "logo");
            ClassicWidgetBean classicWidgetBean2 = new ClassicWidgetBean("1", 14, "moon_week");
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(classicWidgetBean);
            arrayList2.add(classicWidgetBean2);
            classicStyleBean.setWidgetBeans(arrayList2);
            arrayList.add(new dd3("5a0e9523968c4549bc1ded146e3539b3", classicStyleBean));
            return arrayList;
        }

        public final List<k11> j() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new bgd("66910b685d8d8921", 0, 0));
            arrayList.add(new bgd("e591f0fef1d14c86", 0, 0));
            arrayList.add(new bgd("cb09baae40f26a16", 0, 0));
            arrayList.add(new bgd("4e9b56e018f71639", 0, 0));
            return arrayList;
        }

        @NotNull
        public final List<k11> k() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new qud("4db4f6f853dbab3749527f038b384781", "watchv2_ai_style_one.png", "videos/tiaowen/tiaowen_05.png", "videos/tiaowen/tiaowen_05.mp4", "#FFF7E516", "#FFBDBDBD", "#FFFFFFFF", "times/watchFace_config_mode9.json"));
            arrayList.add(new qud("e3d4a04829a94851b0f01e01b8271fd2", "watchv2_ai_style_two.png", "videos/tiaowen/tiaowen_04.png", "videos/tiaowen/tiaowen_04.mp4", "#FFF5814E", "#FFFBFFE4", "#FF000000", "times/watchFace_config_mode3.json"));
            arrayList.add(new qud("f5154348c2418f457095e96c5a96aeb3", "watchv2_ai_style_three.png", "videos/qita/qita_05.png", "videos/qita/qita_05.mp4", "#FFF5814E", "#FFAFDEF6", "#FF000000", "times/watchFace_config_mode4.json"));
            arrayList.add(new qud("2bf6a6ca364e4ce5bb9821f5282d38fe", "watchv2_ai_style_four.png", "videos/tiaowen/tiaowen_01.png", "videos/tiaowen/tiaowen_01.mp4", "#FFD68076", "#FF39363F", "#FFD4D5C3", "times/watchFace_config_mode3.json"));
            return arrayList;
        }

        @NotNull
        public final List<k11> l() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new i5e("defaultStyleZero", 0, 7));
            arrayList.add(new i5e("defaultStyleOne", 0, 7));
            arrayList.add(new i5e("defaultStyleTwo", 0, 6));
            arrayList.add(new i5e("defaultStyleThree", 0, 7));
            arrayList.add(new i5e("defaultStyleFour", 0, 7));
            return arrayList;
        }

        public final List<k11> m() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new ixk(VideoCustomPresenter.DEFAULT_VIDEO_STYLE_UNIQUE_ID, new VideoConfigBean()));
            return arrayList;
        }
    }

    static {
        int i = R$drawable.watch_face_album_v2_clock_style_1;
        int i2 = R$drawable.watch_face_album_v2_clock_style_2;
        int i3 = R$drawable.watch_face_v2_clock_style_3;
        TIME_STYLE_ALBUM = new int[]{i, i2, i3};
        TIME_STYLE_PAINT = new int[]{R$drawable.watch_face_v2_clock_style_4, R$drawable.watch_face_v2_clock_style_5, i3};
        BACKGROUND_BACKGROUND = new int[]{R$drawable.watch_face_album_default_v2_up, R$drawable.watch_face_album_default_v2_down, R$drawable.watch_face_album_default_v2_pointer};
        int i4 = R$drawable.watch_face_v2_wallpaper_default_bg_down;
        b = new int[]{i4, R$drawable.watch_face_v2_wallpaper_default_bg_up, i4};
        f12309c = new int[]{R$drawable.watch_face_v2_video_clock_style_1, R$drawable.watch_face_v2_video_clock_style_2, R$drawable.watch_face_v2_video_clock_style_3, R$drawable.watch_face_v2_video_clock_style_4};
    }

    @Override // com.oplus.aiunit.vision.s3
    public lo9 b() {
        return new a();
    }
}
