package com.heytap.health.cardiovascular.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.cloud.sdk.cloudstorage.http.FileSyncModel;
import com.heytap.health.base.R$color;
import com.heytap.health.cardiovascular.util.QuicklyCheckupSellModeUtil;
import com.heytap.health.network.core.BaseResponse;
import com.heytap.log.consts.LogSenderConst;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.gqf;
import com.oplus.aiunit.vision.h23;
import com.oplus.aiunit.vision.hz9;
import com.oplus.aiunit.vision.l8c;
import com.oplus.aiunit.vision.msg;
import com.oplus.aiunit.vision.o8c;
import com.oplus.aiunit.vision.rh2;
import com.oplus.aiunit.vision.s23;
import com.oplus.aiunit.vision.v9g;
import com.oplus.aiunit.vision.wzk;
import com.oplus.aiunit.vision.y8b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import okhttp3.MediaType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/heytap/health/cardiovascular/util/QuicklyCheckupSellModeUtil;", "", "Companion", "cardiovascular_release"}, k = 1, mv = {1, 8, 0})
public final class QuicklyCheckupSellModeUtil {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004J%\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ=\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0014\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u0004H\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/heytap/health/cardiovascular/util/QuicklyCheckupSellModeUtil$Companion;", "", "", "f", "", "clientDataId", b2n.f, "imgUrl", "", "i", "fileId", "Ljava/io/File;", "imageFile", "j", "(Ljava/lang/String;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/view/View;", "view", "", "topBgDrawableId", "topBgHeight", "Lkotlin/Function1;", "callBack", "c", "(Landroid/view/View;Ljava/lang/Integer;ILkotlin/jvm/functions/Function1;)V", "Landroid/graphics/Bitmap;", "bitmap", "savePath", b2n.g, "<init>", "()V", "cardiovascular_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nQuicklyCheckupSellModeUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuicklyCheckupSellModeUtil.kt\ncom/heytap/health/cardiovascular/util/QuicklyCheckupSellModeUtil$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,184:1\n1#2:185\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final Bitmap d(View view, Integer num, int i, Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(view, "$view");
            int color = ContextCompat.getColor(view.getContext(), R$color.lib_base_common_background_color);
            Paint paint = new Paint();
            paint.setColor(color);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Intrinsics.checkNotNullExpressionValue(config, "originBitmap.config ?: Bitmap.Config.ARGB_8888");
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), config);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(originBitma…ginBitmap.height, config)");
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), paint);
            if (num != null) {
                Drawable drawable = ContextCompat.getDrawable(view.getContext(), num.intValue());
                int iA = rh2.a(i);
                if (drawable != null) {
                    drawable.setBounds(0, 0, bitmap.getWidth(), iA);
                }
                if (drawable != null) {
                    drawable.draw(canvas);
                }
            }
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            return bitmapCreateBitmap;
        }

        public static final void e(Function1 callBack, Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(callBack, "$callBack");
            Companion companion = QuicklyCheckupSellModeUtil.INSTANCE;
            File externalCacheDir = b78.a().getExternalCacheDir();
            callBack.invoke(companion.h(bitmap, (externalCacheDir != null ? externalCacheDir.getAbsolutePath() : null) + "/sell_mode/60sImgCache.png"));
        }

        public final void c(@NotNull final View view, @Nullable final Integer topBgDrawableId, final int topBgHeight, @NotNull final Function1<? super File, Unit> callBack) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(callBack, "callBack");
            new wzk.c(view).e(new hz9() { // from class: com.oplus.aiunit.vision.g8f
                @Override // com.oplus.aiunit.vision.hz9
                public final Bitmap a(Bitmap bitmap) {
                    return QuicklyCheckupSellModeUtil.Companion.d(view, topBgDrawableId, topBgHeight, bitmap);
                }
            }).g(new y8b()).h(new wzk.d() { // from class: com.oplus.aiunit.vision.h8f
                @Override // com.oplus.aiunit.vision.wzk.d
                public final void a(Bitmap bitmap) {
                    QuicklyCheckupSellModeUtil.Companion.e(callBack, bitmap);
                }
            }).f().e();
        }

        public final boolean f() {
            return msg.a().c();
        }

        @Nullable
        public final String g(@NotNull String clientDataId) {
            Intrinsics.checkNotNullParameter(clientDataId, "clientDataId");
            String strD = v9g.x(s23.SP_NAME_CARDIOVASCULAR).D(s23.KEY_SELL_MODE_IMG_CACHE + clientDataId);
            if (strD == null || strD.length() == 0) {
                return null;
            }
            return strD;
        }

        /* JADX WARN: Code duplicated, block: B:50:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        public final File h(Bitmap bitmap, String savePath) throws Throwable {
            FileOutputStream fileOutputStream;
            long jCurrentTimeMillis = System.currentTimeMillis();
            FileOutputStream fileOutputStream2 = null;
            file = null;
            file = null;
            File file = null;
            if (bitmap == null || TextUtils.isEmpty(savePath)) {
                a7b.b("QuicklyCheckupSellModeUtil", "saveBitmap error, bitmap=" + bitmap + " savePath=" + savePath);
                return null;
            }
            try {
                File file2 = new File(savePath);
                if (!file2.exists()) {
                    File parentFile = file2.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    file2.createNewFile();
                }
                fileOutputStream = new FileOutputStream(file2);
                try {
                    try {
                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        try {
                            fileOutputStream.close();
                        } catch (Exception e2) {
                            a7b.b("QuicklyCheckupSellModeUtil", "[saveBitmap] 2 " + e2.getMessage());
                        }
                        file = file2;
                    } catch (IOException e3) {
                        e = e3;
                        a7b.b("QuicklyCheckupSellModeUtil", "[saveBitmap]IOException " + e.getMessage());
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Exception e4) {
                                a7b.b("QuicklyCheckupSellModeUtil", "[saveBitmap] 2 " + e4.getMessage());
                            }
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream2 = fileOutputStream;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (Exception e5) {
                            a7b.b("QuicklyCheckupSellModeUtil", "[saveBitmap] 2 " + e5.getMessage());
                        }
                    }
                    throw th;
                }
            } catch (IOException e6) {
                e = e6;
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                if (fileOutputStream2 != null) {
                    fileOutputStream2.close();
                }
                throw th;
            }
            a7b.f("QuicklyCheckupSellModeUtil", "saveBitmap cost time=" + (System.currentTimeMillis() - jCurrentTimeMillis));
            return file;
        }

        public final void i(@NotNull String clientDataId, @NotNull String imgUrl) {
            Intrinsics.checkNotNullParameter(clientDataId, "clientDataId");
            Intrinsics.checkNotNullParameter(imgUrl, "imgUrl");
            v9g.x(s23.SP_NAME_CARDIOVASCULAR).U(s23.KEY_SELL_MODE_IMG_CACHE + clientDataId, imgUrl);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Nullable
        public final Object j(@NotNull String str, @NotNull File file, @NotNull Continuation<? super String> continuation) {
            QuicklyCheckupSellModeUtil$Companion$upload60sShareImage$1 quicklyCheckupSellModeUtil$Companion$upload60sShareImage$1;
            if (continuation instanceof QuicklyCheckupSellModeUtil$Companion$upload60sShareImage$1) {
                quicklyCheckupSellModeUtil$Companion$upload60sShareImage$1 = (QuicklyCheckupSellModeUtil$Companion$upload60sShareImage$1) continuation;
                int i = quicklyCheckupSellModeUtil$Companion$upload60sShareImage$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    quicklyCheckupSellModeUtil$Companion$upload60sShareImage$1.label = i - Integer.MIN_VALUE;
                } else {
                    quicklyCheckupSellModeUtil$Companion$upload60sShareImage$1 = new QuicklyCheckupSellModeUtil$Companion$upload60sShareImage$1(this, continuation);
                }
            } else {
                quicklyCheckupSellModeUtil$Companion$upload60sShareImage$1 = new QuicklyCheckupSellModeUtil$Companion$upload60sShareImage$1(this, continuation);
            }
            Object objC = quicklyCheckupSellModeUtil$Companion$upload60sShareImage$1.result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = quicklyCheckupSellModeUtil$Companion$upload60sShareImage$1.label;
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(objC);
                    l8c.a aVarD = new l8c.a().d(o8c.FORM);
                    gqf gqfVarC = gqf.INSTANCE.c(MediaType.INSTANCE.a(FileSyncModel.streamMime), file);
                    aVarD.a(LogSenderConst.FILENAME, file.getName());
                    aVarD.b(Const.Scheme.SCHEME_FILE, file.getName(), gqfVarC);
                    aVarD.a("clientFileId", str);
                    aVarD.a(Fields.FILE_TYPE, "6");
                    aVarD.a("fileSource", "1");
                    aVarD.a("version", "1");
                    l8c build = aVarD.c();
                    h23 h23Var = (h23) com.heytap.health.network.core.a.j(h23.class);
                    Intrinsics.checkNotNullExpressionValue(build, "build");
                    quicklyCheckupSellModeUtil$Companion$upload60sShareImage$1.label = 1;
                    objC = h23Var.c(build, quicklyCheckupSellModeUtil$Companion$upload60sShareImage$1);
                    if (objC == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objC);
                }
                BaseResponse baseResponse = (BaseResponse) objC;
                Object body = baseResponse.getBody();
                StringBuilder sb = new StringBuilder();
                sb.append("upload60sShareImage result =");
                sb.append(body);
                return (String) baseResponse.getBody();
            } catch (Exception e2) {
                a7b.b("QuicklyCheckupSellModeUtil", "upload60sShareImage error. e=" + e2);
                return null;
            }
        }
    }
}
