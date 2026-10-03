package com.heytap.health.bitmap;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.base.base.BaseService;
import com.heytap.health.base.text.GsonUtil;
import com.heytap.health.health.bitmap.DataResult;
import com.heytap.health.health.bitmap.ErrorCode;
import com.heytap.health.health.bitmap.IBitmapProviderService;
import com.heytap.health.health.bitmap.QueryDataBean;
import com.heytap.health.health.bitmap.ThemeDataResult;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.jr;
import com.oplus.aiunit.vision.mr;
import com.oplus.aiunit.vision.tr;
import com.oplus.aiunit.vision.wr;
import com.oplus.aiunit.vision.xr;
import com.oplus.aiunit.vision.yr;
import com.oplus.aiunit.vision.zr;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/bitmap/BitmapProviderService;", "Lcom/heytap/health/base/base/BaseService;", "Landroid/content/Intent;", "p0", "Landroid/os/IBinder;", "onBind", "Lcom/heytap/health/health/bitmap/QueryDataBean;", "queryData", "Lcom/heytap/health/health/bitmap/DataResult;", "c", "Lcom/heytap/health/health/bitmap/IBitmapProviderService$Stub;", "i", "Lcom/heytap/health/health/bitmap/IBitmapProviderService$Stub;", "mBinder", "<init>", "()V", "Companion", "a", "health_impl_release"}, k = 1, mv = {1, 8, 0})
public final class BitmapProviderService extends BaseService {
    public static final long BITMAP_MAX_SIZE = 5242880;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final IBitmapProviderService.Stub mBinder = new IBitmapProviderService.Stub() { // from class: com.heytap.health.bitmap.BitmapProviderService$mBinder$1
        @Override // com.heytap.health.health.bitmap.IBitmapProviderService
        @NotNull
        public DataResult getBitmapByData(@Nullable String data) {
            if (data == null || data.length() == 0) {
                a7b.f("BitmapProviderService", " getBitmapByData data is null ,return");
                return new DataResult(ErrorCode.PARAM_INVALID.getCode(), null, 2, null);
            }
            QueryDataBean queryDataBean = (QueryDataBean) GsonUtil.a(data, QueryDataBean.class);
            if (queryDataBean == null) {
                return new DataResult(ErrorCode.PARAM_INVALID.getCode(), null, 2, null);
            }
            switch (queryDataBean.getDataType()) {
                case 2:
                    return this.this$0.c(queryDataBean);
                case 3:
                    HealthArchiveBitmapRepository healthArchiveBitmapRepository = new HealthArchiveBitmapRepository();
                    Context baseContext = this.this$0.getBaseContext();
                    Intrinsics.checkNotNullExpressionValue(baseContext, "baseContext");
                    return healthArchiveBitmapRepository.e(baseContext, queryDataBean);
                case 4:
                    xr xrVar = new xr();
                    Context baseContext2 = this.this$0.getBaseContext();
                    Intrinsics.checkNotNullExpressionValue(baseContext2, "baseContext");
                    return xrVar.f(baseContext2, queryDataBean);
                case 5:
                    wr wrVar = new wr();
                    Context baseContext3 = this.this$0.getBaseContext();
                    Intrinsics.checkNotNullExpressionValue(baseContext3, "baseContext");
                    return wrVar.f(baseContext3, queryDataBean);
                case 6:
                    jr jrVar = new jr();
                    Context baseContext4 = this.this$0.getBaseContext();
                    Intrinsics.checkNotNullExpressionValue(baseContext4, "baseContext");
                    return jrVar.f(baseContext4, queryDataBean);
                case 7:
                    yr yrVar = new yr();
                    Context baseContext5 = this.this$0.getBaseContext();
                    Intrinsics.checkNotNullExpressionValue(baseContext5, "baseContext");
                    return yrVar.f(baseContext5, queryDataBean);
                case 8:
                    mr mrVar = new mr();
                    Context baseContext6 = this.this$0.getBaseContext();
                    Intrinsics.checkNotNullExpressionValue(baseContext6, "baseContext");
                    return mrVar.f(baseContext6, queryDataBean);
                case 9:
                    tr trVar = new tr();
                    Context baseContext7 = this.this$0.getBaseContext();
                    Intrinsics.checkNotNullExpressionValue(baseContext7, "baseContext");
                    return trVar.f(baseContext7, queryDataBean);
                case 10:
                    zr zrVar = new zr();
                    Context baseContext8 = this.this$0.getBaseContext();
                    Intrinsics.checkNotNullExpressionValue(baseContext8, "baseContext");
                    return zrVar.f(baseContext8, queryDataBean);
                default:
                    return new DataResult(ErrorCode.DATA_NOT_SUPPORT_DRAW.getCode(), null, 2, null);
            }
        }

        @Override // com.heytap.health.health.bitmap.IBitmapProviderService
        @NotNull
        public ThemeDataResult getThemeBitmapByData(@Nullable String data) {
            if (data == null || data.length() == 0) {
                a7b.f("BitmapProviderService", " getBitmapByData data is null ,return");
                return new ThemeDataResult(ErrorCode.PARAM_INVALID.getCode(), null, null, 6, null);
            }
            QueryDataBean queryDataBean = (QueryDataBean) GsonUtil.a(data, QueryDataBean.class);
            if (queryDataBean == null) {
                return new ThemeDataResult(ErrorCode.PARAM_INVALID.getCode(), null, null, 6, null);
            }
            switch (queryDataBean.getDataType()) {
                case 2:
                    return new ThemeDataResult(ErrorCode.DATA_NOT_SUPPORT_DRAW.getCode(), null, null, 6, null);
                case 3:
                    HealthArchiveBitmapRepository healthArchiveBitmapRepository = new HealthArchiveBitmapRepository();
                    Context baseContext = this.this$0.getBaseContext();
                    Intrinsics.checkNotNullExpressionValue(baseContext, "baseContext");
                    return healthArchiveBitmapRepository.f(baseContext, queryDataBean);
                case 4:
                    xr xrVar = new xr();
                    Context baseContext2 = this.this$0.getBaseContext();
                    Intrinsics.checkNotNullExpressionValue(baseContext2, "baseContext");
                    return xrVar.g(baseContext2, queryDataBean);
                case 5:
                    wr wrVar = new wr();
                    Context baseContext3 = this.this$0.getBaseContext();
                    Intrinsics.checkNotNullExpressionValue(baseContext3, "baseContext");
                    return wrVar.g(baseContext3, queryDataBean);
                case 6:
                    jr jrVar = new jr();
                    Context baseContext4 = this.this$0.getBaseContext();
                    Intrinsics.checkNotNullExpressionValue(baseContext4, "baseContext");
                    return jrVar.g(baseContext4, queryDataBean);
                case 7:
                    yr yrVar = new yr();
                    Context baseContext5 = this.this$0.getBaseContext();
                    Intrinsics.checkNotNullExpressionValue(baseContext5, "baseContext");
                    return yrVar.g(baseContext5, queryDataBean);
                case 8:
                    mr mrVar = new mr();
                    Context baseContext6 = this.this$0.getBaseContext();
                    Intrinsics.checkNotNullExpressionValue(baseContext6, "baseContext");
                    return mrVar.g(baseContext6, queryDataBean);
                case 9:
                    tr trVar = new tr();
                    Context baseContext7 = this.this$0.getBaseContext();
                    Intrinsics.checkNotNullExpressionValue(baseContext7, "baseContext");
                    return trVar.g(baseContext7, queryDataBean);
                case 10:
                    zr zrVar = new zr();
                    Context baseContext8 = this.this$0.getBaseContext();
                    Intrinsics.checkNotNullExpressionValue(baseContext8, "baseContext");
                    return zrVar.g(baseContext8, queryDataBean);
                default:
                    return new ThemeDataResult(ErrorCode.DATA_NOT_SUPPORT_DRAW.getCode(), null, null, 6, null);
            }
        }
    };
    public static final int $stable = 8;

    public final DataResult c(QueryDataBean queryData) {
        return new DataResult(0, null, 3, null);
    }

    @Override // android.app.Service
    @NotNull
    public IBinder onBind(@Nullable Intent p0) {
        return this.mBinder;
    }
}
