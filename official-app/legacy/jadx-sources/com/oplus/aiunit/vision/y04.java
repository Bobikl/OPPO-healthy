package com.oplus.aiunit.vision;

import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.health.base.text.GsonUtil;
import com.heytap.health.watchface.R$string;
import com.heytap.health.watchface.business.creation.category.flexible.bean.AlbumInfoExtraData;
import com.heytap.health.watchface.business.creation.category.flexible.bean.TimeStyleDesc;
import com.heytap.health.watchface.business.creation.db.LivePhotoRecord;
import com.heytap.log.consts.LogSenderConst;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\bA\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bh\u0010iJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J0\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eJ\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00102\u0006\u0010\u0013\u001a\u00020\u0012J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00102\u0006\u0010\u0013\u001a\u00020\u0012J\u0010\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u001b\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u001c\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u001d\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\tJ\u000e\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tJ\u0016\u0010\"\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010!\u001a\u00020 J\u0010\u0010#\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001f\u001a\u00020\tJ\b\u0010$\u001a\u0004\u0018\u00010\tJ\b\u0010%\u001a\u0004\u0018\u00010\tJ\b\u0010&\u001a\u0004\u0018\u00010\tJ\u000e\u0010'\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010*\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020)J\u0016\u0010,\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\t2\u0006\u0010+\u001a\u00020\tJ\u0016\u0010-\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006J\u001e\u00100\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0006J,\u00102\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u00101\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006J\u001f\u00104\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u00103\u001a\u00020\t¢\u0006\u0004\b4\u00105J\u0016\u00108\u001a\u00020\t2\u0006\u00106\u001a\u00020\t2\u0006\u00107\u001a\u00020\tJ\u0016\u00109\u001a\u00020\t2\u0006\u00106\u001a\u00020\t2\u0006\u00107\u001a\u00020\tJ\u000e\u0010;\u001a\u00020\t2\u0006\u0010:\u001a\u00020\tJ\u000e\u0010=\u001a\u00020\t2\u0006\u0010<\u001a\u00020\tJ\u0006\u0010>\u001a\u00020\tJ\u000e\u0010@\u001a\u00020\u00192\u0006\u0010?\u001a\u00020\tJ\u000e\u0010A\u001a\u00020\t2\u0006\u0010?\u001a\u00020\tR\u0014\u0010B\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\bD\u0010CR\u0014\u0010E\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\bE\u0010CR\u0014\u0010F\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\bF\u0010CR\u0014\u0010G\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\bG\u0010CR\u0014\u0010H\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\bH\u0010CR\u0014\u0010I\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\bI\u0010CR\u0014\u0010J\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\bJ\u0010CR\u0014\u0010K\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\bK\u0010CR\u0014\u0010L\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\bL\u0010CR\u0014\u0010M\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\bM\u0010CR\u0014\u0010N\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\bN\u0010CR\u0014\u0010O\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\bO\u0010CR\u0014\u0010P\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\bP\u0010CR\u0014\u0010Q\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\bQ\u0010CR\u0014\u0010R\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\bR\u0010CR\u0014\u0010S\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\bS\u0010CR\u0014\u0010T\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\bT\u0010CR\u0014\u0010U\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\bU\u0010CR\u0014\u0010V\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\bV\u0010CR\u0014\u0010W\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\bW\u0010CR\u0014\u0010X\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\bX\u0010CR\u0014\u0010Y\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\bY\u0010CR\u0014\u0010Z\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\bZ\u0010CR\u0014\u0010[\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b[\u0010CR\u0014\u0010\\\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\\\u0010CR\u0014\u0010]\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b]\u0010CR\u0014\u0010^\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b^\u0010CR\u0014\u0010_\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b_\u0010CR\u0014\u0010`\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b`\u0010CR\u0014\u0010a\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010c\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\bc\u0010bR\u0014\u0010d\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\bd\u0010bR\u0014\u0010e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\be\u0010bR\u0014\u0010f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\bf\u0010bR\u0014\u0010g\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\bg\u0010b¨\u0006j"}, d2 = {"Lcom/oplus/aiunit/vision/y04;", "", "Lcom/heytap/health/watchface/business/creation/db/LivePhotoRecord;", "record", "", "b", "", "type", "timePos", "", "t", ExifInterface.GPS_DIRECTION_TRUE, "resDirPath", LogSenderConst.FILENAME, "Ljava/lang/Class;", "clazz", "", "i", "Lcom/oplus/aiunit/vision/kvi;", "storeHelper", "Lcom/heytap/health/watchface/business/creation/category/flexible/bean/TimeStyleDesc;", "q", "Lcom/oplus/aiunit/vision/wvl;", "u", "packageName", "", "w", "A", "y", "x", "j", "basePkgName", "", "num", "o", "f", "c", MapSchema.FIELD_NAME_ENTRY, "d", "D", "deviceFlag", "Lcom/oplus/aiunit/vision/ud4;", c8l.KEY_B, "wfPkgName", "C", "a", "providerId", "providerMode", "v", "timeStyleIndex", "r", "styleId", b2n.f, "(Lcom/oplus/aiunit/vision/kvi;Ljava/lang/String;)Ljava/lang/Integer;", "baseCachePath", "flexiblePackageName", LogFieldKey.LEVEL_KEY, "n", "editPreviewPath", LogFieldKey.MESSAGE_KEY, "normalPreviewPath", MapSchema.FIELD_NAME_KEY, b2n.g, "resName", "z", LogFieldKey.PROCESS_NAME_KEY, "TAG", "Ljava/lang/String;", "TIME_STYLE_UP_RES_NAME", "TIME_STYLE_DOWN_RES_NAME", "TIME_STYLE_LEFT_RES_NAME", "TIME_STYLE_RIGHT_RES_NAME", "TIME_STYLE_PREVIEW_RES_NAME", "TIME_STYLE_UP_DIR_NAME", "TIME_STYLE_DOWN_DIR_NAME", "TIME_STYLE_LEFT_DIR_NAME", "TIME_STYLE_RIGHT_DIR_NAME", "TIME_STYLE_POINT_DIR_NAME", "TIME_STYLE_AOD_UP_RES_NAME", "TIME_STYLE_AOD_DOWN_RES_NAME", "TIME_STYLE_AOD_LEFT_RES_NAME", "TIME_STYLE_AOD_RIGHT_RES_NAME", "TIME_STYLE_POINT_RES_NAME", "TIME_STYLE_AOD_POINT_RES_NAME", "FG_RES_TAG", "PREVIEW_EDIT", "PREVIEW_NORMAL", "DEFAULT_ALBUM_BG_PIC_NAME", "DEFAULT_DOF_BG_PIC_NAME", "DEFAULT_DOF_FG_PIC_NAME", "TEMPLATE_DESC_NAME", "DOF_TEMPLATE_DESC_NAME", "WIDGET_DESC_CONFIG_NAME", "ALBUM_V2_BASE_NAME", "ALBUM_V2_BUILDIN_NAME", "LIVEPHOTO_BASE_NAME", "DOF_BASE_NAME", "ALBUM_V2_COUNT_MAX", "I", "LIVEPHOTO_COUNT_MAX", "DOF_COUNT_MAX", "ALBUM_V2_SUPPORT_ITEM_MAX", "LIVEPHOTO_SUPPORT_ITEM_MAX", "DOF_SUPPORT_ITEM_MAX", "<init>", "()V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nConstraintResHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintResHelper.kt\ncom/heytap/health/watchface/business/creation/category/flexible/manager/ConstraintResHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,271:1\n1855#2,2:272\n1855#2,2:277\n3792#3:274\n4307#3,2:275\n1#4:279\n*S KotlinDebug\n*F\n+ 1 ConstraintResHelper.kt\ncom/heytap/health/watchface/business/creation/category/flexible/manager/ConstraintResHelper\n*L\n171#1:272,2\n176#1:277,2\n175#1:274\n175#1:275,2\n*E\n"})
public final class y04 {

    @NotNull
    public static final String ALBUM_V2_BASE_NAME = "com.heytap.wearable.enginewf.creation.album";

    @NotNull
    public static final String ALBUM_V2_BUILDIN_NAME = "com.heytap.wearable.enginewf.creation.album_1";
    public static final int ALBUM_V2_COUNT_MAX = 5;
    public static final int ALBUM_V2_SUPPORT_ITEM_MAX = 24;

    @NotNull
    public static final String DEFAULT_ALBUM_BG_PIC_NAME = "default_bg_album.png";

    @NotNull
    public static final String DEFAULT_DOF_BG_PIC_NAME = "default_bg_dof.png";

    @NotNull
    public static final String DEFAULT_DOF_FG_PIC_NAME = "default_bg_dof.png";

    @NotNull
    public static final String DOF_BASE_NAME = "com.heytap.wearable.enginewf.creation.dof";
    public static final int DOF_COUNT_MAX = 3;
    public static final int DOF_SUPPORT_ITEM_MAX = 12;

    @NotNull
    public static final String DOF_TEMPLATE_DESC_NAME = "dial_template_desc.json";

    @NotNull
    public static final String FG_RES_TAG = "FG_";

    @NotNull
    public static final y04 INSTANCE = new y04();

    @NotNull
    public static final String LIVEPHOTO_BASE_NAME = "com.heytap.wearable.enginewf.creation.livephoto";
    public static final int LIVEPHOTO_COUNT_MAX = 1;
    public static final int LIVEPHOTO_SUPPORT_ITEM_MAX = 5;

    @NotNull
    public static final String PREVIEW_EDIT = "edit";

    @NotNull
    public static final String PREVIEW_NORMAL = "preview";

    @NotNull
    public static final String TAG = "ConstraintConfigHelper";

    @NotNull
    public static final String TEMPLATE_DESC_NAME = "template_desc.json";

    @NotNull
    public static final String TIME_STYLE_AOD_DOWN_RES_NAME = "aod_down.png";

    @NotNull
    public static final String TIME_STYLE_AOD_LEFT_RES_NAME = "aod_left.png";

    @NotNull
    public static final String TIME_STYLE_AOD_POINT_RES_NAME = "aod_hand.png";

    @NotNull
    public static final String TIME_STYLE_AOD_RIGHT_RES_NAME = "aod_right.png";

    @NotNull
    public static final String TIME_STYLE_AOD_UP_RES_NAME = "aod_up.png";

    @NotNull
    public static final String TIME_STYLE_DOWN_DIR_NAME = "down";

    @NotNull
    public static final String TIME_STYLE_DOWN_RES_NAME = "down.png";

    @NotNull
    public static final String TIME_STYLE_LEFT_DIR_NAME = "left";

    @NotNull
    public static final String TIME_STYLE_LEFT_RES_NAME = "left.png";

    @NotNull
    public static final String TIME_STYLE_POINT_DIR_NAME = "hand";

    @NotNull
    public static final String TIME_STYLE_POINT_RES_NAME = "hand.png";

    @NotNull
    public static final String TIME_STYLE_PREVIEW_RES_NAME = "show.png";

    @NotNull
    public static final String TIME_STYLE_RIGHT_DIR_NAME = "right";

    @NotNull
    public static final String TIME_STYLE_RIGHT_RES_NAME = "right.png";

    @NotNull
    public static final String TIME_STYLE_UP_DIR_NAME = "up";

    @NotNull
    public static final String TIME_STYLE_UP_RES_NAME = "up.png";

    @NotNull
    public static final String WIDGET_DESC_CONFIG_NAME = "widget_desc_config.json";

    public static /* synthetic */ String s(y04 y04Var, kvi kviVar, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        return y04Var.r(kviVar, i, i2, i3);
    }

    public final boolean A(@Nullable String packageName) {
        if (TextUtils.isEmpty(packageName)) {
            return false;
        }
        Intrinsics.checkNotNull(packageName);
        return StringsKt__StringsJVMKt.startsWith$default(packageName, LIVEPHOTO_BASE_NAME, false, 2, null);
    }

    public final void B(@NotNull String deviceFlag, @NotNull ud4 record) {
        Intrinsics.checkNotNullParameter(deviceFlag, "deviceFlag");
        Intrinsics.checkNotNullParameter(record, "record");
        Iterator<T> it = ((AlbumInfoExtraData) GsonUtil.a(record.i, AlbumInfoExtraData.class)).getAlbumPhotoBean().getAllResource().iterator();
        while (it.hasNext()) {
            wd7.g((String) it.next());
        }
        File[] fileArrListFiles = new File(new kvi(record.a).E()).listFiles();
        if (fileArrListFiles != null) {
            ArrayList arrayList = new ArrayList();
            for (File file : fileArrListFiles) {
                String name = file.getName();
                Intrinsics.checkNotNullExpressionValue(name, "it.name");
                if (StringsKt__StringsJVMKt.startsWith$default(name, record.k + "_", false, 2, null)) {
                    arrayList.add(file);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                wd7.g(((File) it2.next()).getAbsolutePath());
            }
        }
        com.heytap.health.watchface.business.creation.db.a.a().o(record);
        if (record.h == 10) {
            j2b.h().delete(deviceFlag);
        }
    }

    public final void C(@NotNull String deviceFlag, @NotNull String wfPkgName) {
        Intrinsics.checkNotNullParameter(deviceFlag, "deviceFlag");
        Intrinsics.checkNotNullParameter(wfPkgName, "wfPkgName");
        ud4 ud4VarS = com.heytap.health.watchface.business.creation.db.a.a().s(deviceFlag, wfPkgName);
        if (ud4VarS != null) {
            B(deviceFlag, ud4VarS);
        }
    }

    public final void D(@NotNull LivePhotoRecord record) {
        Intrinsics.checkNotNullParameter(record, "record");
        j2b.h().e(record);
        b(record);
    }

    public final void a(@NotNull String deviceFlag, int type) {
        Intrinsics.checkNotNullParameter(deviceFlag, "deviceFlag");
        com.heytap.health.watchface.business.creation.db.a.a().p(type, deviceFlag);
        if (type == 10) {
            j2b.h().delete(deviceFlag);
        }
    }

    public final void b(LivePhotoRecord record) {
        wd7.g(record.imgPath);
        wd7.g(record.videoPath);
    }

    @Nullable
    public final String c() {
        return f(ALBUM_V2_BASE_NAME);
    }

    @Nullable
    public final String d() {
        return f(DOF_BASE_NAME);
    }

    @Nullable
    public final String e() {
        return f(LIVEPHOTO_BASE_NAME);
    }

    @Nullable
    public final String f(@NotNull String basePkgName) {
        Intrinsics.checkNotNullParameter(basePkgName, "basePkgName");
        if (!(basePkgName.length() == 0)) {
            return o(basePkgName, System.currentTimeMillis());
        }
        ltl.i(TAG, "wf basePkgName must not empty");
        return null;
    }

    @Nullable
    public final Integer g(@NotNull kvi storeHelper, @NotNull String styleId) {
        Object next;
        Intrinsics.checkNotNullParameter(storeHelper, "storeHelper");
        Intrinsics.checkNotNullParameter(styleId, "styleId");
        if (styleId.length() == 0) {
            return null;
        }
        Iterator<T> it = q(storeHelper).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((TimeStyleDesc) next).getStyleId(), styleId));
        TimeStyleDesc timeStyleDesc = (TimeStyleDesc) next;
        if (timeStyleDesc != null) {
            return Integer.valueOf(timeStyleDesc.getTimeStyleIndex());
        }
        return null;
    }

    @NotNull
    public final String h() {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        return FG_RES_TAG + StringsKt__StringsJVMKt.replace$default(string, "-", "", false, 4, (Object) null) + ".png";
    }

    @NotNull
    public final <T> List<T> i(@NotNull String resDirPath, @NotNull String fileName, @NotNull Class<T> clazz) throws Throwable {
        Intrinsics.checkNotNullParameter(resDirPath, "resDirPath");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        String configJson = ld7.r(new File(resDirPath, fileName));
        jsf jsfVar = jsf.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(configJson, "configJson");
        return jsfVar.b(configJson, clazz);
    }

    @NotNull
    public final String j(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (StringsKt__StringsJVMKt.startsWith$default(packageName, ALBUM_V2_BASE_NAME, false, 2, null)) {
            String string = b78.a().getString(R$string.watch_face_flexible_watch_face);
            Intrinsics.checkNotNullExpressionValue(string, "getAppContext()\n        …face_flexible_watch_face)");
            return string;
        }
        if (StringsKt__StringsJVMKt.startsWith$default(packageName, LIVEPHOTO_BASE_NAME, false, 2, null)) {
            String string2 = b78.a().getString(R$string.watch_face_livephoto_watch_face);
            Intrinsics.checkNotNullExpressionValue(string2, "getAppContext()\n        …ace_livephoto_watch_face)");
            return string2;
        }
        String string3 = b78.a().getString(R$string.watch_face_dof_title);
        Intrinsics.checkNotNullExpressionValue(string3, "getAppContext()\n        …ing.watch_face_dof_title)");
        return string3;
    }

    @NotNull
    public final String k(@NotNull String normalPreviewPath) {
        Intrinsics.checkNotNullParameter(normalPreviewPath, "normalPreviewPath");
        File file = new File(normalPreviewPath);
        String parent = file.getParent();
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "file.name");
        return parent + "/" + StringsKt__StringsJVMKt.replace$default(name, "preview", "edit", false, 4, (Object) null);
    }

    @NotNull
    public final String l(@NotNull String baseCachePath, @NotNull String flexiblePackageName) {
        Intrinsics.checkNotNullParameter(baseCachePath, "baseCachePath");
        Intrinsics.checkNotNullParameter(flexiblePackageName, "flexiblePackageName");
        return baseCachePath + "/" + flexiblePackageName + "_" + System.currentTimeMillis() + "_edit.png";
    }

    @NotNull
    public final String m(@NotNull String editPreviewPath) {
        Intrinsics.checkNotNullParameter(editPreviewPath, "editPreviewPath");
        File file = new File(editPreviewPath);
        String parent = file.getParent();
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "file.name");
        return parent + "/" + StringsKt__StringsJVMKt.replace$default(name, "edit", "preview", false, 4, (Object) null);
    }

    @NotNull
    public final String n(@NotNull String baseCachePath, @NotNull String flexiblePackageName) {
        Intrinsics.checkNotNullParameter(baseCachePath, "baseCachePath");
        Intrinsics.checkNotNullParameter(flexiblePackageName, "flexiblePackageName");
        return baseCachePath + "/" + flexiblePackageName + "_" + System.currentTimeMillis() + "_preview.png";
    }

    @NotNull
    public final String o(@NotNull String basePkgName, long num) {
        Intrinsics.checkNotNullParameter(basePkgName, "basePkgName");
        return basePkgName + "_" + num;
    }

    @NotNull
    public final String p(@NotNull String resName) {
        Intrinsics.checkNotNullParameter(resName, "resName");
        return StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(resName, TIME_STYLE_UP_RES_NAME, TIME_STYLE_PREVIEW_RES_NAME, false, 4, (Object) null), TIME_STYLE_DOWN_RES_NAME, TIME_STYLE_PREVIEW_RES_NAME, false, 4, (Object) null), TIME_STYLE_LEFT_RES_NAME, TIME_STYLE_PREVIEW_RES_NAME, false, 4, (Object) null), TIME_STYLE_RIGHT_RES_NAME, TIME_STYLE_PREVIEW_RES_NAME, false, 4, (Object) null);
    }

    @NotNull
    public final List<TimeStyleDesc> q(@NotNull kvi storeHelper) {
        Intrinsics.checkNotNullParameter(storeHelper, "storeHelper");
        String strJ = storeHelper.J();
        Intrinsics.checkNotNullExpressionValue(strJ, "storeHelper.flexibleTemplateResDirPath");
        return i(strJ, TEMPLATE_DESC_NAME, TimeStyleDesc.class);
    }

    @NotNull
    public final String r(@NotNull kvi storeHelper, int timeStyleIndex, int type, int timePos) {
        Intrinsics.checkNotNullParameter(storeHelper, "storeHelper");
        return storeHelper.J() + "/" + timeStyleIndex + "/" + t(type, timePos) + "/";
    }

    public final String t(int type, int timePos) {
        if (type != 0) {
            return TIME_STYLE_POINT_DIR_NAME;
        }
        if (timePos == 0) {
            return TIME_STYLE_UP_DIR_NAME;
        }
        if (timePos == 1) {
            return TIME_STYLE_DOWN_DIR_NAME;
        }
        if (timePos != 3) {
            return timePos != 4 ? TIME_STYLE_DOWN_DIR_NAME : TIME_STYLE_RIGHT_DIR_NAME;
        }
        return TIME_STYLE_LEFT_DIR_NAME;
    }

    @NotNull
    public final List<WidgetSupportConfig> u(@NotNull kvi storeHelper) {
        Intrinsics.checkNotNullParameter(storeHelper, "storeHelper");
        String strK = storeHelper.K();
        Intrinsics.checkNotNullExpressionValue(strK, "storeHelper.flexibleWidgetResDirPath");
        return i(strK, WIDGET_DESC_CONFIG_NAME, WidgetSupportConfig.class);
    }

    @NotNull
    public final String v(@NotNull kvi storeHelper, int providerId, int providerMode) {
        Intrinsics.checkNotNullParameter(storeHelper, "storeHelper");
        String strK = storeHelper.K();
        String str = File.separator;
        return strK + str + providerId + str + providerId + "_" + providerMode + "_color.png";
    }

    public final boolean w(@Nullable String packageName) {
        if (TextUtils.isEmpty(packageName)) {
            return false;
        }
        Intrinsics.checkNotNull(packageName);
        return StringsKt__StringsJVMKt.startsWith$default(packageName, ALBUM_V2_BASE_NAME, false, 2, null);
    }

    public final boolean x(@Nullable String packageName) {
        if (TextUtils.isEmpty(packageName)) {
            return false;
        }
        return w(packageName) || A(packageName) || y(packageName);
    }

    public final boolean y(@Nullable String packageName) {
        if (TextUtils.isEmpty(packageName)) {
            return false;
        }
        Intrinsics.checkNotNull(packageName);
        return StringsKt__StringsJVMKt.startsWith$default(packageName, DOF_BASE_NAME, false, 2, null);
    }

    public final boolean z(@NotNull String resName) {
        Intrinsics.checkNotNullParameter(resName, "resName");
        return StringsKt__StringsJVMKt.startsWith$default(resName, FG_RES_TAG, false, 2, null);
    }
}
