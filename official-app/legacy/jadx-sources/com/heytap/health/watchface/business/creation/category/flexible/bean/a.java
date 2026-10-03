package com.heytap.health.watchface.business.creation.category.flexible.bean;

import com.heytap.health.watchface.R$string;
import com.heytap.health.watchface.business.base.BaseFlexiblePresenter;
import com.heytap.health.watchface.utils.DeepCloneUtils;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.mr7;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.TuplesKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0014\u0010\n\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R&\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/flexible/bean/a;", "Lcom/oplus/aiunit/vision/mr7;", "", "mode", "", "c", "", "Lcom/heytap/health/watchface/business/creation/category/flexible/bean/ComplicationSummaryBean;", "d", "savedBeans", "f", "", "a", "Ljava/util/List;", MapSchema.FIELD_NAME_ENTRY, "()Ljava/util/List;", "dataList", "b", "I", "currentWidgetMode", "", "Ljava/util/Map;", "modeCache", "<init>", "()V", "Companion", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAlbumPhotoBean.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlbumPhotoBean.kt\ncom/heytap/health/watchface/business/creation/category/flexible/bean/AlbumComplicationBean\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,427:1\n1855#2,2:428\n1855#2:430\n1856#2:432\n1855#2,2:433\n1#3:431\n*S KotlinDebug\n*F\n+ 1 AlbumPhotoBean.kt\ncom/heytap/health/watchface/business/creation/category/flexible/bean/AlbumComplicationBean\n*L\n329#1:428,2\n334#1:430\n334#1:432\n348#1:433,2\n*E\n"})
public final class a extends mr7 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int MODE_BOTTOM_LEFT = 15;
    public static final int MODE_BOTTOM_RIGHT = 16;
    public static final int MODE_DEFAULT = 13;
    public static final int MODE_SMALL_WIDGET = 5;
    public static final int MODE_TOP_RIGHT = 14;
    public static final int SLOT_ID_BOTTOM = 105;
    public static final int SLOT_ID_BOTTOM_LEFT = 102;
    public static final int SLOT_ID_BOTTOM_RIGHT = 103;
    public static final int SLOT_ID_TOP = 104;
    public static final int SLOT_ID_TOP_LEFT = 100;
    public static final int SLOT_ID_TOP_RIGHT = 101;

    @NotNull
    public static final List<ComplicationSummaryBean> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final List<ComplicationSummaryBean> f6758e;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<ComplicationSummaryBean> dataList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int currentWidgetMode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<Integer, List<ComplicationSummaryBean>> modeCache;

    /* JADX INFO: renamed from: com.heytap.health.watchface.business.creation.category.flexible.bean.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0015\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000fR\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000fR\u0014\u0010\u0018\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000fR\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/flexible/bean/a$a;", "", "", "mode", "", "Lcom/heytap/health/watchface/business/creation/category/flexible/bean/ComplicationSummaryBean;", "a", "", "DEFAULT_CONFIG_COMPLICATION", "Ljava/util/List;", "b", "()Ljava/util/List;", "SMALL_WIDGET_CONFIG_COMPLICATION", "c", "MODE_BOTTOM_LEFT", "I", "MODE_BOTTOM_RIGHT", "MODE_DEFAULT", "MODE_SMALL_WIDGET", "MODE_TOP_RIGHT", "SLOT_ID_BOTTOM", "SLOT_ID_BOTTOM_LEFT", "SLOT_ID_BOTTOM_RIGHT", "SLOT_ID_TOP", "SLOT_ID_TOP_LEFT", "SLOT_ID_TOP_RIGHT", "<init>", "()V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<ComplicationSummaryBean> a(int mode) {
            return mode == 5 ? c() : b();
        }

        @NotNull
        public final List<ComplicationSummaryBean> b() {
            return a.d;
        }

        @NotNull
        public final List<ComplicationSummaryBean> c() {
            return a.f6758e;
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        String string = b78.a().getString(R$string.watch_face_complication_top_left);
        Intrinsics.checkNotNullExpressionValue(string, "getAppContext()\n        …ce_complication_top_left)");
        arrayList.add(new ComplicationSummaryBean(string, 100, 13, null, 0, 24, null));
        String string2 = b78.a().getString(R$string.watch_face_complication_top_right);
        Intrinsics.checkNotNullExpressionValue(string2, "getAppContext()\n        …e_complication_top_right)");
        arrayList.add(new ComplicationSummaryBean(string2, 101, 14, null, 0, 24, null));
        String string3 = b78.a().getString(R$string.watch_face_complication_bottom_left);
        Intrinsics.checkNotNullExpressionValue(string3, "getAppContext()\n        …complication_bottom_left)");
        arrayList.add(new ComplicationSummaryBean(string3, 102, 15, null, 0, 24, null));
        String string4 = b78.a().getString(R$string.watch_face_complication_bottom_right);
        Intrinsics.checkNotNullExpressionValue(string4, "getAppContext()\n        …omplication_bottom_right)");
        arrayList.add(new ComplicationSummaryBean(string4, 103, 16, null, 0, 24, null));
        d = arrayList;
        ArrayList arrayList2 = new ArrayList();
        String string5 = b78.a().getString(R$string.watch_face_complication_top);
        Intrinsics.checkNotNullExpressionValue(string5, "getAppContext()\n        …ch_face_complication_top)");
        arrayList2.add(new ComplicationSummaryBean(string5, 104, 5, null, 0, 24, null));
        String string6 = b78.a().getString(R$string.watch_face_complication_bottom);
        Intrinsics.checkNotNullExpressionValue(string6, "getAppContext()\n        …face_complication_bottom)");
        arrayList2.add(new ComplicationSummaryBean(string6, 105, 5, null, 0, 24, null));
        f6758e = arrayList2;
    }

    public a() {
        super(BaseFlexiblePresenter.TAG_ALBUM_COMPLICATION);
        ArrayList arrayListB = DeepCloneUtils.b(d, ComplicationSummaryBean.class);
        Intrinsics.checkNotNullExpressionValue(arrayListB, "deepCopyList(\n        DE…aryBean::class.java\n    )");
        this.dataList = arrayListB;
        this.currentWidgetMode = 13;
        this.modeCache = new LinkedHashMap();
    }

    public final void c(int mode) {
        int i = this.currentWidgetMode;
        if (i == mode) {
            return;
        }
        Map<Integer, List<ComplicationSummaryBean>> map = this.modeCache;
        Integer numValueOf = Integer.valueOf(i);
        ArrayList arrayListB = DeepCloneUtils.b(this.dataList, ComplicationSummaryBean.class);
        Intrinsics.checkNotNullExpressionValue(arrayListB, "deepCopyList(dataList, C…nSummaryBean::class.java)");
        map.put(numValueOf, arrayListB);
        List<ComplicationSummaryBean> listA = this.modeCache.get(Integer.valueOf(mode));
        if (listA == null) {
            listA = INSTANCE.a(mode);
        }
        this.dataList.clear();
        List<ComplicationSummaryBean> list = this.dataList;
        ArrayList arrayListB2 = DeepCloneUtils.b(listA, ComplicationSummaryBean.class);
        Intrinsics.checkNotNullExpressionValue(arrayListB2, "deepCopyList(newConfig, …nSummaryBean::class.java)");
        list.addAll(arrayListB2);
        this.currentWidgetMode = mode;
    }

    @NotNull
    public final List<ComplicationSummaryBean> d() {
        Map<Integer, List<ComplicationSummaryBean>> map = this.modeCache;
        Integer numValueOf = Integer.valueOf(this.currentWidgetMode);
        ArrayList arrayListB = DeepCloneUtils.b(this.dataList, ComplicationSummaryBean.class);
        Intrinsics.checkNotNullExpressionValue(arrayListB, "deepCopyList(dataList, C…nSummaryBean::class.java)");
        map.put(numValueOf, arrayListB);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.modeCache.values().iterator();
        while (it.hasNext()) {
            arrayList.addAll((List) it.next());
        }
        return arrayList;
    }

    @NotNull
    public final List<ComplicationSummaryBean> e() {
        return this.dataList;
    }

    public final void f(@NotNull List<ComplicationSummaryBean> savedBeans) {
        Object next;
        Intrinsics.checkNotNullParameter(savedBeans, "savedBeans");
        List<ComplicationSummaryBean> list = savedBeans;
        Iterator<T> it = list.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            ComplicationSummaryBean complicationSummaryBean = (ComplicationSummaryBean) it.next();
            for (Object obj2 : this.dataList) {
                if (((ComplicationSummaryBean) obj2).getSlotId() == complicationSummaryBean.getSlotId()) {
                    obj = obj2;
                    break;
                }
            }
            ComplicationSummaryBean complicationSummaryBean2 = (ComplicationSummaryBean) obj;
            if (complicationSummaryBean2 != null) {
                complicationSummaryBean2.setComplicationName(complicationSummaryBean.getComplicationName());
                complicationSummaryBean2.setProviderId(complicationSummaryBean.getProviderId());
            }
        }
        for (Map.Entry entry : MapsKt__MapsKt.mapOf(TuplesKt.to(13, d), TuplesKt.to(5, f6758e)).entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            List list2 = (List) entry.getValue();
            if (iIntValue != this.currentWidgetMode) {
                ArrayList templateCopy = DeepCloneUtils.b(list2, ComplicationSummaryBean.class);
                for (ComplicationSummaryBean complicationSummaryBean3 : list) {
                    Intrinsics.checkNotNullExpressionValue(templateCopy, "templateCopy");
                    Iterator it2 = templateCopy.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!(((ComplicationSummaryBean) next).getSlotId() == complicationSummaryBean3.getSlotId()));
                    ComplicationSummaryBean complicationSummaryBean4 = (ComplicationSummaryBean) next;
                    if (complicationSummaryBean4 != null) {
                        complicationSummaryBean4.setComplicationName(complicationSummaryBean3.getComplicationName());
                        complicationSummaryBean4.setProviderId(complicationSummaryBean3.getProviderId());
                    }
                }
                Integer numValueOf = Integer.valueOf(iIntValue);
                Map<Integer, List<ComplicationSummaryBean>> map = this.modeCache;
                Intrinsics.checkNotNullExpressionValue(templateCopy, "templateCopy");
                map.put(numValueOf, templateCopy);
            }
        }
    }
}
