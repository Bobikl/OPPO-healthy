package com.heytap.health.watchface.utils;

import androidx.annotation.Keep;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.base.text.GsonUtil;
import com.heytap.health.watchface.business.creation.category.flexible.bean.AlbumTimeBean;
import com.heytap.health.watchface.business.creation.category.flexible.bean.ComplicationSummaryBean;
import com.heytap.health.watchface.business.creation.category.livephoto.ImageTags;
import com.heytap.health.watchface.network.bean.WatchFaceHomeCard;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.b84;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.ojk;
import com.oplus.aiunit.vision.t91;
import com.oplus.aiunit.vision.vik;
import com.oplus.seedling.sdk.statistics.StatisticsTrackUtil;
import com.oplus.smartsdk.themecard.Tags;
import io.protostuff.MapSchema;
import java.util.LinkedHashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/heytap/health/watchface/utils/BiEventUtil;", "", "Companion", "a", "FlexibleWfConfig", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class BiEventUtil {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.heytap.health.watchface.utils.BiEventUtil$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bL\u0010MJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0003J \u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0003J \u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0002H\u0003J\b\u0010\u000f\u001a\u00020\u0007H\u0007J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0015H\u0007J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0015H\u0007J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0018H\u0007J\u0010\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u001aH\u0007J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0018H\u0007J\u0010\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0018H\u0007J\u0010\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0018H\u0007J\u0010\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0018H\u0007J\u0010\u0010 \u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0018H\u0007J\u0010\u0010!\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0018H\u0007J\u0010\u0010\"\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0018H\u0007J\u0010\u0010$\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020#H\u0007J\u0010\u0010%\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0018H\u0007J\u0010\u0010&\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0018H\u0007J\u0010\u0010'\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0018H\u0007J\u0010\u0010)\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020(H\u0007J\u0010\u0010+\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0002H\u0007J \u0010/\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0002H\u0007J(\u00101\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u0002H\u0007J\u0010\u00102\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u0018\u00105\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u0004H\u0007J\u0018\u00106\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u0004H\u0007J0\u0010;\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u0004H\u0007J\u0018\u0010>\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00022\u0006\u0010=\u001a\u00020<H\u0007J\u0018\u0010@\u001a\u00020\u00072\u0006\u0010?\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0002H\u0007J\u0010\u0010A\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J$\u0010E\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\u00022\b\u0010C\u001a\u0004\u0018\u00010\u00042\b\u0010D\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010H\u001a\u00020\u00072\u0006\u0010G\u001a\u00020FH\u0007J\u0010\u0010I\u001a\u00020\u00072\u0006\u0010G\u001a\u00020FH\u0007J \u0010K\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010J\u001a\u00020\n2\u0006\u00100\u001a\u00020\u0002H\u0007¨\u0006N"}, d2 = {"Lcom/heytap/health/watchface/utils/BiEventUtil$a;", "", "", "type", "", "id", "name", "", "z", "b", "", "taskId", "costTime", "resultCode", "v", "w", "Lcom/heytap/health/watchface/network/bean/WatchFaceHomeCard$Item;", "item", "H", "title", "o", "Lcom/heytap/health/watchface/network/bean/WatchFaceHomeCard$Banner;", "y", "a", "Lcom/heytap/health/watchface/network/bean/WatchFaceHomeCard;", ExifInterface.LONGITUDE_EAST, "Lcom/heytap/health/watchface/network/bean/WatchFaceHomeCard$MenuItem;", "j", "G", "n", b2n.g, "D", "C", b2n.f, "A", "Lcom/heytap/health/watchface/network/bean/WatchFaceHomeCard$CategoryItem;", "c", UserInfo.SEX_FEMALE, MapSchema.FIELD_NAME_KEY, "x", "Lcom/oplus/aiunit/vision/t91;", "i", "eventType", "J", "wfName", "wfUnique", "wfPay", LogFieldKey.LEVEL_KEY, "status", LogFieldKey.MESSAGE_KEY, c8l.KEY_B, "seriesName", "moduleName", MapSchema.FIELD_NAME_ENTRY, "d", "bgName", "degreeName", "functionName", "pointName", "f", "Lcom/heytap/health/watchface/utils/BiEventUtil$FlexibleWfConfig;", "config", LogFieldKey.PROCESS_NAME_KEY, "imgId", "r", "t", "sourceType", "styleId", "styleName", "u", "Lcom/heytap/health/watchface/business/creation/category/livephoto/ImageTags;", "imageTags", "q", "s", "taskCommitedTime", "I", "<init>", "()V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void A(@NotNull WatchFaceHomeCard item) {
            Intrinsics.checkNotNullParameter(item, "item");
            if (item.isExpose()) {
                return;
            }
            item.setExpose(true);
            String strValueOf = String.valueOf(item.getKey());
            String title = item.getTitle();
            Intrinsics.checkNotNullExpressionValue(title, "item.title");
            z(4, strValueOf, title);
        }

        @JvmStatic
        public final void B(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("series_name", name);
            vik.o(1, linkedHashMap);
        }

        @JvmStatic
        public final void C(@NotNull WatchFaceHomeCard item) {
            Intrinsics.checkNotNullParameter(item, "item");
            if (item.isExpose()) {
                return;
            }
            item.setExpose(true);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(Tags.CARD_ID, String.valueOf(item.getKey()));
            linkedHashMap.put(StatisticsTrackUtil.KEY_CARD_TYPE, "7");
            String title = item.getTitle();
            Intrinsics.checkNotNullExpressionValue(title, "item.title");
            linkedHashMap.put("card_title", title);
            linkedHashMap.put("creation_type", String.valueOf(item.getCreationWfType()));
            vik.o(3, linkedHashMap);
        }

        @JvmStatic
        public final void D(@NotNull WatchFaceHomeCard item) {
            Intrinsics.checkNotNullParameter(item, "item");
            if (item.getCode() == 10011) {
                F(item);
            } else if (item.getCode() == 10006) {
                G(item);
            }
        }

        @JvmStatic
        public final void E(@NotNull WatchFaceHomeCard item) {
            Intrinsics.checkNotNullParameter(item, "item");
            if (item.isExpose()) {
                return;
            }
            item.setExpose(true);
            String strValueOf = String.valueOf(item.getKey());
            String title = item.getTitle();
            Intrinsics.checkNotNullExpressionValue(title, "item.title");
            z(3, strValueOf, title);
        }

        @JvmStatic
        public final void F(@NotNull WatchFaceHomeCard item) {
            Intrinsics.checkNotNullParameter(item, "item");
            if (item.isExpose()) {
                return;
            }
            item.setExpose(true);
            String strValueOf = String.valueOf(item.getKey());
            String title = item.getTitle();
            Intrinsics.checkNotNullExpressionValue(title, "item.title");
            z(5, strValueOf, title);
        }

        @JvmStatic
        public final void G(@NotNull WatchFaceHomeCard item) {
            Intrinsics.checkNotNullParameter(item, "item");
            if (item.isExpose()) {
                return;
            }
            item.setExpose(true);
            String strValueOf = String.valueOf(item.getKey());
            String title = item.getTitle();
            Intrinsics.checkNotNullExpressionValue(title, "item.title");
            z(1, strValueOf, title);
        }

        @JvmStatic
        public final void H(@NotNull WatchFaceHomeCard.Item item) {
            Intrinsics.checkNotNullParameter(item, "item");
            if (item.isExpose()) {
                return;
            }
            item.setExpose(true);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String appName = item.getAppName();
            Intrinsics.checkNotNullExpressionValue(appName, "item.appName");
            linkedHashMap.put("wf_name", appName);
            String pkgNameMd5 = item.getPkgNameMd5();
            Intrinsics.checkNotNullExpressionValue(pkgNameMd5, "item.pkgNameMd5");
            linkedHashMap.put("wf_unique", pkgNameMd5);
            linkedHashMap.put("wf_pay", String.valueOf(item.getPay()));
            linkedHashMap.put("wf_master_id", String.valueOf(item.getMasterId()));
            vik.o(2, linkedHashMap);
        }

        @JvmStatic
        public final void I(long taskId, long taskCommitedTime, int status) {
            if (status == 0 || status == 5 || status == 6 || status == 7 || status < 0) {
                v(taskId, (System.currentTimeMillis() - taskCommitedTime) / ((long) 1000), status);
            }
        }

        @JvmStatic
        public final void J(int eventType) {
            vik.b(2, eventType);
        }

        @JvmStatic
        public final void a(@NotNull WatchFaceHomeCard.Banner item) {
            Intrinsics.checkNotNullParameter(item, "item");
            String strValueOf = String.valueOf(item.getId());
            String title = item.getTitle();
            Intrinsics.checkNotNullExpressionValue(title, "item.title");
            b(2, strValueOf, title);
        }

        @JvmStatic
        public final void b(int type, String id, String name) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(vik.TAG_MODULE_ID, "3");
            linkedHashMap.put(SensorsBean.ITEM_TYPE, String.valueOf(type));
            linkedHashMap.put("item_id", id);
            linkedHashMap.put("item_name", name);
            vik.i(linkedHashMap);
        }

        @JvmStatic
        public final void c(@NotNull WatchFaceHomeCard.CategoryItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            String strValueOf = String.valueOf(item.getId());
            String name = item.getName();
            Intrinsics.checkNotNullExpressionValue(name, "item.name");
            b(4, strValueOf, name);
        }

        @JvmStatic
        public final void d(@NotNull String seriesName, @NotNull String moduleName) {
            Intrinsics.checkNotNullParameter(seriesName, "seriesName");
            Intrinsics.checkNotNullParameter(moduleName, "moduleName");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(vik.TAG_MODULE_ID, "3");
            linkedHashMap.put("series_name", seriesName);
            linkedHashMap.put("module_name", moduleName);
            vik.i(linkedHashMap);
        }

        @JvmStatic
        public final void e(@NotNull String seriesName, @NotNull String moduleName) {
            Intrinsics.checkNotNullParameter(seriesName, "seriesName");
            Intrinsics.checkNotNullParameter(moduleName, "moduleName");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(vik.TAG_MODULE_ID, "2");
            linkedHashMap.put("series_name", seriesName);
            linkedHashMap.put("module_name", moduleName);
            vik.i(linkedHashMap);
        }

        @JvmStatic
        public final void f(@NotNull String seriesName, @NotNull String bgName, @NotNull String degreeName, @NotNull String functionName, @NotNull String pointName) {
            Intrinsics.checkNotNullParameter(seriesName, "seriesName");
            Intrinsics.checkNotNullParameter(bgName, "bgName");
            Intrinsics.checkNotNullParameter(degreeName, "degreeName");
            Intrinsics.checkNotNullParameter(functionName, "functionName");
            Intrinsics.checkNotNullParameter(pointName, "pointName");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(vik.TAG_MODULE_ID, "1");
            linkedHashMap.put("series_name", seriesName);
            linkedHashMap.put("bg_name", bgName);
            linkedHashMap.put("degree_name", degreeName);
            linkedHashMap.put("function_name", functionName);
            linkedHashMap.put("point_name", pointName);
            vik.i(linkedHashMap);
        }

        @JvmStatic
        public final void g(@NotNull WatchFaceHomeCard item) {
            Intrinsics.checkNotNullParameter(item, "item");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(vik.TAG_MODULE_ID, "3");
            linkedHashMap.put(Tags.CARD_ID, String.valueOf(item.getKey()));
            linkedHashMap.put(StatisticsTrackUtil.KEY_CARD_TYPE, "7");
            String title = item.getTitle();
            Intrinsics.checkNotNullExpressionValue(title, "item.title");
            linkedHashMap.put("card_title", title);
            linkedHashMap.put("creation_type", String.valueOf(item.getCreationWfType()));
            vik.i(linkedHashMap);
        }

        @JvmStatic
        public final void h(@NotNull WatchFaceHomeCard item) {
            Intrinsics.checkNotNullParameter(item, "item");
            if (item.getCode() == 10011) {
                k(item);
            } else if (item.getCode() == 10006) {
                n(item);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v6, types: [int] */
        /* JADX WARN: Type inference failed for: r2v8 */
        @JvmStatic
        public final void i(@NotNull t91 item) {
            ?? r2;
            int iD;
            Intrinsics.checkNotNullParameter(item, "item");
            if (item.b() == 2) {
                boolean zE = ((ojk) item).e();
                iD = 6;
                r2 = zE;
            } else if (item.b() == 3) {
                iD = ((b84) item).d();
                r2 = 0;
            } else {
                r2 = 0;
                iD = 0;
            }
            vik.b(iD, r2);
        }

        @JvmStatic
        public final void j(@NotNull WatchFaceHomeCard.MenuItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            String strValueOf = String.valueOf(item.getId());
            String name = item.getName();
            Intrinsics.checkNotNullExpressionValue(name, "item.name");
            b(3, strValueOf, name);
        }

        @JvmStatic
        public final void k(@NotNull WatchFaceHomeCard item) {
            Intrinsics.checkNotNullParameter(item, "item");
            String strValueOf = String.valueOf(item.getKey());
            String title = item.getTitle();
            Intrinsics.checkNotNullExpressionValue(title, "item.title");
            b(5, strValueOf, title);
        }

        @JvmStatic
        public final void l(@NotNull String wfName, @NotNull String wfUnique, int wfPay) {
            Intrinsics.checkNotNullParameter(wfName, "wfName");
            Intrinsics.checkNotNullParameter(wfUnique, "wfUnique");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(vik.TAG_MODULE_ID, "1");
            linkedHashMap.put("wf_name", wfName);
            linkedHashMap.put("wf_unique", wfUnique);
            linkedHashMap.put("wf_pay", String.valueOf(wfPay));
            vik.i(linkedHashMap);
        }

        @JvmStatic
        public final void m(@NotNull String wfName, @NotNull String wfUnique, int wfPay, int status) {
            Intrinsics.checkNotNullParameter(wfName, "wfName");
            Intrinsics.checkNotNullParameter(wfUnique, "wfUnique");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(vik.TAG_MODULE_ID, "2");
            linkedHashMap.put("wf_name", wfName);
            linkedHashMap.put("wf_unique", wfUnique);
            linkedHashMap.put("wf_pay", String.valueOf(wfPay));
            linkedHashMap.put("wf_status", String.valueOf(status));
            vik.i(linkedHashMap);
        }

        @JvmStatic
        public final void n(@NotNull WatchFaceHomeCard item) {
            Intrinsics.checkNotNullParameter(item, "item");
            String strValueOf = String.valueOf(item.getKey());
            String title = item.getTitle();
            Intrinsics.checkNotNullExpressionValue(title, "item.title");
            b(1, strValueOf, title);
        }

        @JvmStatic
        public final void o(@Nullable String title, @NotNull WatchFaceHomeCard.Item item) {
            Intrinsics.checkNotNullParameter(item, "item");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(vik.TAG_MODULE_ID, "2");
            String appName = item.getAppName();
            Intrinsics.checkNotNullExpressionValue(appName, "item.appName");
            linkedHashMap.put("wf_name", appName);
            String pkgNameMd5 = item.getPkgNameMd5();
            Intrinsics.checkNotNullExpressionValue(pkgNameMd5, "item.pkgNameMd5");
            linkedHashMap.put("wf_unique", pkgNameMd5);
            linkedHashMap.put("wf_pay", String.valueOf(item.getPay()));
            linkedHashMap.put("wf_master_id", String.valueOf(item.getMasterId()));
            if (title == null) {
                title = "";
            }
            linkedHashMap.put("card_title", title);
            vik.i(linkedHashMap);
        }

        @JvmStatic
        public final void p(int eventType, @NotNull FlexibleWfConfig config) {
            Intrinsics.checkNotNullParameter(config, "config");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("flex_event_type", String.valueOf(eventType));
            String strE = GsonUtil.e(config);
            Intrinsics.checkNotNullExpressionValue(strE, "toJson(config)");
            linkedHashMap.put("flex_create_config", strE);
            vik.o(1, linkedHashMap);
        }

        @JvmStatic
        public final void q(@NotNull ImageTags imageTags) {
            Intrinsics.checkNotNullParameter(imageTags, "imageTags");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("lp_cancel_style_id", imageTags.getStyleId());
            linkedHashMap.put("lp_cancel_style_name", imageTags.getName());
            vik.o(5, linkedHashMap);
        }

        @JvmStatic
        public final void r(@NotNull String imgId, int resultCode) {
            Intrinsics.checkNotNullParameter(imgId, "imgId");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("lp_check_result", String.valueOf(resultCode));
            linkedHashMap.put("lp_img_id", imgId);
            vik.o(2, linkedHashMap);
        }

        @JvmStatic
        public final void s(@NotNull ImageTags imageTags) {
            Intrinsics.checkNotNullParameter(imageTags, "imageTags");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("lp_cancel_style_id", imageTags.getStyleId());
            linkedHashMap.put("lp_cancel_style_name", imageTags.getName());
            vik.o(6, linkedHashMap);
        }

        @JvmStatic
        public final void t(int type) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("lp_reselect_type", String.valueOf(type));
            vik.o(3, linkedHashMap);
        }

        @JvmStatic
        public final void u(int sourceType, @Nullable String styleId, @Nullable String styleName) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("lp_select_source", String.valueOf(sourceType));
            if (styleId != null) {
                linkedHashMap.put("lp_cancel_style_id", styleId);
            }
            if (styleName != null) {
                linkedHashMap.put("lp_cancel_style_name", styleName);
            }
            vik.o(7, linkedHashMap);
        }

        @JvmStatic
        public final void v(long taskId, long costTime, int resultCode) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("lp_task_id", String.valueOf(taskId));
            linkedHashMap.put("lp_task_cost_time", String.valueOf(costTime));
            linkedHashMap.put("lp_task_result", String.valueOf(resultCode));
            vik.o(8, linkedHashMap);
        }

        @JvmStatic
        public final void w() {
            vik.a(1);
        }

        @JvmStatic
        public final void x(@NotNull WatchFaceHomeCard item) {
            Intrinsics.checkNotNullParameter(item, "item");
            if (item.isExpose()) {
                return;
            }
            item.setExpose(true);
            String strValueOf = String.valueOf(item.getKey());
            String title = item.getTitle();
            Intrinsics.checkNotNullExpressionValue(title, "item.title");
            z(6, strValueOf, title);
        }

        @JvmStatic
        public final void y(@NotNull WatchFaceHomeCard.Banner item) {
            Intrinsics.checkNotNullParameter(item, "item");
            if (item.isExpose()) {
                return;
            }
            item.setExpose(true);
            String strValueOf = String.valueOf(item.getId());
            String title = item.getTitle();
            Intrinsics.checkNotNullExpressionValue(title, "item.title");
            z(2, strValueOf, title);
        }

        @JvmStatic
        public final void z(int type, String id, String name) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(StatisticsTrackUtil.KEY_CARD_TYPE, String.valueOf(type));
            linkedHashMap.put(Tags.CARD_ID, id);
            linkedHashMap.put("card_name", name);
            vik.o(3, linkedHashMap);
        }
    }

    @JvmStatic
    public static final void a(@NotNull WatchFaceHomeCard.Banner banner) {
        INSTANCE.a(banner);
    }

    @JvmStatic
    public static final void b(@NotNull WatchFaceHomeCard.CategoryItem categoryItem) {
        INSTANCE.c(categoryItem);
    }

    @JvmStatic
    public static final void c(@NotNull String str, @NotNull String str2) {
        INSTANCE.d(str, str2);
    }

    @JvmStatic
    public static final void d(@NotNull String str, @NotNull String str2) {
        INSTANCE.e(str, str2);
    }

    @JvmStatic
    public static final void e(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        INSTANCE.f(str, str2, str3, str4, str5);
    }

    @JvmStatic
    public static final void f(@NotNull WatchFaceHomeCard watchFaceHomeCard) {
        INSTANCE.g(watchFaceHomeCard);
    }

    @JvmStatic
    public static final void g(@NotNull WatchFaceHomeCard watchFaceHomeCard) {
        INSTANCE.h(watchFaceHomeCard);
    }

    @JvmStatic
    public static final void h(@NotNull t91 t91Var) {
        INSTANCE.i(t91Var);
    }

    @JvmStatic
    public static final void i(@NotNull WatchFaceHomeCard.MenuItem menuItem) {
        INSTANCE.j(menuItem);
    }

    @JvmStatic
    public static final void j(@NotNull String str, @NotNull String str2, int i) {
        INSTANCE.l(str, str2, i);
    }

    @JvmStatic
    public static final void k(@NotNull String str, @NotNull String str2, int i, int i2) {
        INSTANCE.m(str, str2, i, i2);
    }

    @JvmStatic
    public static final void l(@Nullable String str, @NotNull WatchFaceHomeCard.Item item) {
        INSTANCE.o(str, item);
    }

    @JvmStatic
    public static final void m() {
        INSTANCE.w();
    }

    @JvmStatic
    public static final void n(@NotNull WatchFaceHomeCard watchFaceHomeCard) {
        INSTANCE.x(watchFaceHomeCard);
    }

    @JvmStatic
    public static final void o(@NotNull WatchFaceHomeCard.Banner banner) {
        INSTANCE.y(banner);
    }

    @JvmStatic
    public static final void p(@NotNull WatchFaceHomeCard watchFaceHomeCard) {
        INSTANCE.A(watchFaceHomeCard);
    }

    @JvmStatic
    public static final void q(@NotNull String str) {
        INSTANCE.B(str);
    }

    @JvmStatic
    public static final void r(@NotNull WatchFaceHomeCard watchFaceHomeCard) {
        INSTANCE.C(watchFaceHomeCard);
    }

    @JvmStatic
    public static final void s(@NotNull WatchFaceHomeCard watchFaceHomeCard) {
        INSTANCE.D(watchFaceHomeCard);
    }

    @JvmStatic
    public static final void t(@NotNull WatchFaceHomeCard watchFaceHomeCard) {
        INSTANCE.E(watchFaceHomeCard);
    }

    @JvmStatic
    public static final void u(@NotNull WatchFaceHomeCard.Item item) {
        INSTANCE.H(item);
    }

    @JvmStatic
    public static final void v(int i) {
        INSTANCE.J(i);
    }

    @Keep
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/heytap/health/watchface/utils/BiEventUtil$FlexibleWfConfig;", "", "sourceType", "", "imgCount", "livephotoCount", "timeBean", "Lcom/heytap/health/watchface/business/creation/category/flexible/bean/AlbumTimeBean;", "complicationList", "", "Lcom/heytap/health/watchface/business/creation/category/flexible/bean/ComplicationSummaryBean;", "(IIILcom/heytap/health/watchface/business/creation/category/flexible/bean/AlbumTimeBean;Ljava/util/List;)V", "getComplicationList", "()Ljava/util/List;", "getImgCount", "()I", "getLivephotoCount", "getSourceType", "getTimeBean", "()Lcom/heytap/health/watchface/business/creation/category/flexible/bean/AlbumTimeBean;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "watchface_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class FlexibleWfConfig {

        @NotNull
        private final List<ComplicationSummaryBean> complicationList;
        private final int imgCount;
        private final int livephotoCount;
        private final int sourceType;

        @NotNull
        private final AlbumTimeBean timeBean;

        public FlexibleWfConfig(int i, int i2, int i3, @NotNull AlbumTimeBean timeBean, @NotNull List<ComplicationSummaryBean> complicationList) {
            Intrinsics.checkNotNullParameter(timeBean, "timeBean");
            Intrinsics.checkNotNullParameter(complicationList, "complicationList");
            this.sourceType = i;
            this.imgCount = i2;
            this.livephotoCount = i3;
            this.timeBean = timeBean;
            this.complicationList = complicationList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FlexibleWfConfig copy$default(FlexibleWfConfig flexibleWfConfig, int i, int i2, int i3, AlbumTimeBean albumTimeBean, List list, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = flexibleWfConfig.sourceType;
            }
            if ((i4 & 2) != 0) {
                i2 = flexibleWfConfig.imgCount;
            }
            int i5 = i2;
            if ((i4 & 4) != 0) {
                i3 = flexibleWfConfig.livephotoCount;
            }
            int i6 = i3;
            if ((i4 & 8) != 0) {
                albumTimeBean = flexibleWfConfig.timeBean;
            }
            AlbumTimeBean albumTimeBean2 = albumTimeBean;
            if ((i4 & 16) != 0) {
                list = flexibleWfConfig.complicationList;
            }
            return flexibleWfConfig.copy(i, i5, i6, albumTimeBean2, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getSourceType() {
            return this.sourceType;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getImgCount() {
            return this.imgCount;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getLivephotoCount() {
            return this.livephotoCount;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final AlbumTimeBean getTimeBean() {
            return this.timeBean;
        }

        @NotNull
        public final List<ComplicationSummaryBean> component5() {
            return this.complicationList;
        }

        @NotNull
        public final FlexibleWfConfig copy(int sourceType, int imgCount, int livephotoCount, @NotNull AlbumTimeBean timeBean, @NotNull List<ComplicationSummaryBean> complicationList) {
            Intrinsics.checkNotNullParameter(timeBean, "timeBean");
            Intrinsics.checkNotNullParameter(complicationList, "complicationList");
            return new FlexibleWfConfig(sourceType, imgCount, livephotoCount, timeBean, complicationList);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FlexibleWfConfig)) {
                return false;
            }
            FlexibleWfConfig flexibleWfConfig = (FlexibleWfConfig) other;
            return this.sourceType == flexibleWfConfig.sourceType && this.imgCount == flexibleWfConfig.imgCount && this.livephotoCount == flexibleWfConfig.livephotoCount && Intrinsics.areEqual(this.timeBean, flexibleWfConfig.timeBean) && Intrinsics.areEqual(this.complicationList, flexibleWfConfig.complicationList);
        }

        @NotNull
        public final List<ComplicationSummaryBean> getComplicationList() {
            return this.complicationList;
        }

        public final int getImgCount() {
            return this.imgCount;
        }

        public final int getLivephotoCount() {
            return this.livephotoCount;
        }

        public final int getSourceType() {
            return this.sourceType;
        }

        @NotNull
        public final AlbumTimeBean getTimeBean() {
            return this.timeBean;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.sourceType) * 31) + Integer.hashCode(this.imgCount)) * 31) + Integer.hashCode(this.livephotoCount)) * 31) + this.timeBean.hashCode()) * 31) + this.complicationList.hashCode();
        }

        @NotNull
        public String toString() {
            return "FlexibleWfConfig(sourceType=" + this.sourceType + ", imgCount=" + this.imgCount + ", livephotoCount=" + this.livephotoCount + ", timeBean=" + this.timeBean + ", complicationList=" + this.complicationList + ")";
        }

        public /* synthetic */ FlexibleWfConfig(int i, int i2, int i3, AlbumTimeBean albumTimeBean, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, albumTimeBean, list);
        }
    }
}
