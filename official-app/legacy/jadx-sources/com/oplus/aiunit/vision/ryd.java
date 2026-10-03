package com.oplus.aiunit.vision;

import com.heytap.health.watchface.business.creation.category.classic.bean.ClassicStyleBean;
import com.heytap.health.watchface.business.creation.category.classic.bean.ClassicWidgetBean;
import com.heytap.health.watchface.business.creation.category.video.VideoCustomPresenter;
import com.heytap.health.watchface.business.creation.category.video.bean.VideoConfigBean;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\u001a\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0002H\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/ryd;", "Lcom/oplus/aiunit/vision/lo9;", "", "", "", "b", MapSchema.FIELD_NAME_ENTRY, "", "a", b2n.f, "", "f", "d", "", "Lcom/oplus/aiunit/vision/k11;", "c", LogFieldKey.LEVEL_KEY, "i", MapSchema.FIELD_NAME_KEY, "j", b2n.g, "<init>", "()V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public class ryd implements lo9 {
    @Override // com.oplus.aiunit.vision.lo9
    public int a() {
        return 10;
    }

    @Override // com.oplus.aiunit.vision.lo9
    @NotNull
    public Map<String, int[]> b() {
        HashMap map = new HashMap();
        int[] TIME_STYLE_ALBUM = syd.TIME_STYLE_ALBUM;
        Intrinsics.checkNotNullExpressionValue(TIME_STYLE_ALBUM, "TIME_STYLE_ALBUM");
        map.put(lo9.TAG_DEFAULT_CREATION_ALBUM, TIME_STYLE_ALBUM);
        int[] TIME_STYLE_PAINT = syd.TIME_STYLE_PAINT;
        Intrinsics.checkNotNullExpressionValue(TIME_STYLE_PAINT, "TIME_STYLE_PAINT");
        map.put(lo9.TAG_DEFAULT_CREATION_PAINT, TIME_STYLE_PAINT);
        Intrinsics.checkNotNullExpressionValue(TIME_STYLE_ALBUM, "TIME_STYLE_ALBUM");
        map.put(lo9.TAG_DEFAULT_CREATION_WALLPAPER, TIME_STYLE_ALBUM);
        int[] TIME_STYLE_OMOJI = syd.TIME_STYLE_OMOJI;
        Intrinsics.checkNotNullExpressionValue(TIME_STYLE_OMOJI, "TIME_STYLE_OMOJI");
        map.put(lo9.TAG_DEFAULT_CREATION_OMOJI, TIME_STYLE_OMOJI);
        int[] TIME_STYLE_VIDEO = syd.TIME_STYLE_VIDEO;
        Intrinsics.checkNotNullExpressionValue(TIME_STYLE_VIDEO, "TIME_STYLE_VIDEO");
        map.put("video", TIME_STYLE_VIDEO);
        return map;
    }

    @Override // com.oplus.aiunit.vision.lo9
    @NotNull
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
    @NotNull
    public Map<String, int[]> e() {
        HashMap map = new HashMap();
        int[] ALBUM_DEFAULT_BACKGROUND = syd.ALBUM_DEFAULT_BACKGROUND;
        Intrinsics.checkNotNullExpressionValue(ALBUM_DEFAULT_BACKGROUND, "ALBUM_DEFAULT_BACKGROUND");
        map.put(lo9.TAG_DEFAULT_CREATION_ALBUM, ALBUM_DEFAULT_BACKGROUND);
        int[] WALLPAPER_DEFAULT_BACKGROUND = syd.WALLPAPER_DEFAULT_BACKGROUND;
        Intrinsics.checkNotNullExpressionValue(WALLPAPER_DEFAULT_BACKGROUND, "WALLPAPER_DEFAULT_BACKGROUND");
        map.put(lo9.TAG_DEFAULT_CREATION_WALLPAPER, WALLPAPER_DEFAULT_BACKGROUND);
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

    public final List<k11> j() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new qud("ow3DefaultOutfitsStyle0", "", "tiaowen_05.png", "tiaowen_05.mp4", "#FFF7E516", "#FFBDBDBD", "#FFFFFFFF", "watchFace_config_mode9.json"));
        arrayList.add(new qud("ow3DefaultOutfitsStyle1", "", "tiaowen_04.png", "tiaowen_04.mp4", "#FFF5814E", "#FFFBFFE4", "#FF000000", "watchFace_config_mode3.json"));
        arrayList.add(new qud("ow3DefaultOutfitsStyle2", "", "qita_05.png", "qita_05.mp4", "#FFF5814E", "#FFAFDEF6", "#FF000000", "watchFace_config_mode4.json"));
        arrayList.add(new qud("ow3DefaultOutfitsStyle3", "", "tiaowen_01.png", "tiaowen_01.mp4", "#FFD68076", "#FF39363F", "#FFD4D5C3", "watchFace_config_mode3.json"));
        return arrayList;
    }

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
