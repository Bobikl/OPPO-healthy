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
public class wyd extends s3 {
    public static final int[] ALBUM_DEFAULT_BACKGROUND;
    public static final int[] TIME_STYLE_ALBUM;
    public static final int[] TIME_STYLE_OMOJI;
    public static final int[] TIME_STYLE_PAINT;
    public static final int[] TIME_STYLE_VIDEO;
    public static final int[] WALLPAPER_DEFAULT_BACKGROUND;

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
            map.put(lo9.TAG_DEFAULT_CREATION_ALBUM, wyd.this.e());
            map.put(lo9.TAG_DEFAULT_CREATION_PAINT, wyd.this.f());
            map.put(lo9.TAG_DEFAULT_CREATION_WALLPAPER, wyd.this.e());
            map.put(lo9.TAG_DEFAULT_CREATION_OMOJI, wyd.TIME_STYLE_OMOJI);
            map.put("video", wyd.TIME_STYLE_VIDEO);
            return map;
        }

        @Override // com.oplus.aiunit.vision.lo9
        public Map<String, List<k11>> c() {
            HashMap map = new HashMap();
            map.put(lo9.TAG_DEFAULT_CREATION_PAINT, k());
            map.put(lo9.TAG_DEFAULT_CREATION_OUTFITS, j());
            map.put(lo9.TAG_DEFAULT_CREATION_CLASSIC, h());
            map.put(lo9.TAG_DEFAULT_CREATION_OMOJI, i());
            map.put("video", l());
            return map;
        }

        @Override // com.oplus.aiunit.vision.lo9
        public boolean d() {
            return true;
        }

        @Override // com.oplus.aiunit.vision.lo9
        public Map<String, int[]> e() {
            HashMap map = new HashMap();
            map.put(lo9.TAG_DEFAULT_CREATION_ALBUM, wyd.this.c());
            map.put(lo9.TAG_DEFAULT_CREATION_WALLPAPER, wyd.this.d());
            return map;
        }

        @Override // com.oplus.aiunit.vision.lo9
        public boolean f() {
            return false;
        }

        @Override // com.oplus.aiunit.vision.lo9
        public int g() {
            return 8;
        }

        @NotNull
        public final List<k11> h() {
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
            arrayList.add(new dd3("ow3DefaultClassicStyle0", classicStyleBean));
            return arrayList;
        }

        public final List<k11> i() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new bgd("ow3DefaultOmojiStyle0", 0, 0));
            arrayList.add(new bgd("ow3DefaultOmojiStyle1", 0, 0));
            arrayList.add(new bgd("ow3DefaultOmojiStyle2", 0, 0));
            arrayList.add(new bgd("ow3DefaultOmojiStyle3", 0, 0));
            return arrayList;
        }

        @NotNull
        public final List<k11> j() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new qud("ow3DefaultOutfitsStyle0", "", "tiaowen_05.png", "tiaowen_05.mp4", "#FFF7E516", "#FFBDBDBD", "#FFFFFFFF", "watchFace_config_mode9.json"));
            arrayList.add(new qud("ow3DefaultOutfitsStyle1", "", "tiaowen_04.png", "tiaowen_04.mp4", "#FFF5814E", "#FFFBFFE4", "#FF000000", "watchFace_config_mode3.json"));
            arrayList.add(new qud("ow3DefaultOutfitsStyle2", "", "qita_05.png", "qita_05.mp4", "#FFF5814E", "#FFAFDEF6", "#FF000000", "watchFace_config_mode4.json"));
            arrayList.add(new qud("ow3DefaultOutfitsStyle3", "", "tiaowen_01.png", "tiaowen_01.mp4", "#FFD68076", "#FF39363F", "#FFD4D5C3", "watchFace_config_mode3.json"));
            return arrayList;
        }

        @NotNull
        public final List<k11> k() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new i5e("ow3DefaultPaintStyle0", 0, 7));
            arrayList.add(new i5e("ow3DefaultPaintStyle1", 0, 6));
            arrayList.add(new i5e("ow3DefaultPaintStyle2", 0, 7));
            return arrayList;
        }

        public final List<k11> l() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new ixk(VideoCustomPresenter.DEFAULT_VIDEO_STYLE_UNIQUE_ID, new VideoConfigBean()));
            return arrayList;
        }
    }

    static {
        int i = R$drawable.watch_face_v3pro_album_clock_style_1;
        int i2 = R$drawable.watch_face_v3pro_album_clock_style_2;
        int i3 = R$drawable.watch_face_v3_v3pro_clock_style_3;
        TIME_STYLE_ALBUM = new int[]{i, i2, i3};
        TIME_STYLE_PAINT = new int[]{R$drawable.watch_face_v3pro_clock_style_4, R$drawable.watch_face_v3pro_clock_style_5, i3};
        TIME_STYLE_OMOJI = new int[]{R$drawable.watch_face_v3pro_clock_style_omoji_0, R$drawable.watch_face_v3pro_clock_style_omoji_1, R$drawable.watch_face_v3pro_clock_style_omoji_2, R$drawable.watch_face_v3pro_clock_style_omoji_3, R$drawable.watch_face_v3pro_clock_style_omoji_4, R$drawable.watch_face_v3pro_clock_style_omoji_5};
        ALBUM_DEFAULT_BACKGROUND = new int[]{R$drawable.watch_face_v3pro_album_default_up, R$drawable.watch_face_v3pro_album_default_down, R$drawable.watch_face_v3pro_album_default_pointer};
        int i4 = R$drawable.watch_face_v3pro_wallpaper_default_bg_down;
        WALLPAPER_DEFAULT_BACKGROUND = new int[]{i4, R$drawable.watch_face_v3pro_wallpaper_default_bg_up, i4};
        TIME_STYLE_VIDEO = new int[]{R$drawable.watch_face_v3pro_video_clock_style_1, R$drawable.watch_face_v3pro_video_clock_style_2, R$drawable.watch_face_v3pro_video_clock_style_3, R$drawable.watch_face_v3pro_video_clock_style_4};
    }

    @Override // com.oplus.aiunit.vision.s3
    public lo9 b() {
        return new a();
    }

    public int[] c() {
        return ALBUM_DEFAULT_BACKGROUND;
    }

    public int[] d() {
        return WALLPAPER_DEFAULT_BACKGROUND;
    }

    public int[] e() {
        return TIME_STYLE_ALBUM;
    }

    public int[] f() {
        return TIME_STYLE_PAINT;
    }
}
