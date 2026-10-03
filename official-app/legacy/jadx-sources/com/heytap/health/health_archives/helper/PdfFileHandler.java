package com.heytap.health.health_archives.helper;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.heytap.databaseengine.model.healtharchive.HealthArchiveFile;
import com.heytap.health.base.text.GsonUtil;
import com.heytap.health.health_archives.util.DownloadPDFManager;
import com.heytap.health.health_archives.web.HealthArchivesPDFWebViewActivity;
import com.heytap.log.consts.LogSenderConst;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.qg0;
import com.oplus.aiunit.vision.qtf;
import io.protostuff.MapSchema;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 )2\u00020\u0001:\u0002\u001f\"B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b'\u0010(J\u0006\u0010\u0003\u001a\u00020\u0002J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0002J\u0012\u0010\r\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u001a\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\"\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0018\u001a\u00020\bH\u0002J\b\u0010\u001a\u001a\u00020\u0002H\u0002J\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u0002R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lcom/heytap/health/health_archives/helper/PdfFileHandler;", "", "", "c", "Lcom/heytap/databaseengine/model/healtharchive/HealthArchiveFile;", "healthArchiveFile", "", "docId", "", "i", "(Lcom/heytap/databaseengine/model/healtharchive/HealthArchiveFile;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", b2n.f, LogFieldKey.MESSAGE_KEY, "url", MapSchema.FIELD_NAME_ENTRY, "originalUrl", "Lcom/heytap/health/health_archives/helper/PdfFileHandler$b;", LogFieldKey.LEVEL_KEY, "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/io/File;", "pdfFile", MapSchema.FIELD_NAME_KEY, "localPath", "isLocal", "j", "d", "Landroid/content/Context;", "context", LogSenderConst.FILENAME, b2n.g, "a", "Landroid/content/Context;", "Lcom/heytap/health/health_archives/util/DownloadPDFManager;", "b", "Lkotlin/Lazy;", "f", "()Lcom/heytap/health/health_archives/util/DownloadPDFManager;", "downloadPDFManager", "<init>", "(Landroid/content/Context;)V", "Companion", "health_archives_release"}, k = 1, mv = {1, 8, 0})
public final class PdfFileHandler {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Lazy downloadPDFManager;

    /* JADX INFO: renamed from: com.heytap.health.health_archives.helper.PdfFileHandler$b, reason: from toString */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u0010\u0010\fR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\t\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/health_archives/helper/PdfFileHandler$b;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", "c", "()Z", "isValid", "b", "localValid", "getRemoteValid", "remoteValid", "d", "Ljava/lang/String;", "()Ljava/lang/String;", "localPath", "<init>", "(ZZZLjava/lang/String;)V", "health_archives_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class FileValidationResult {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        public final boolean isValid;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final boolean localValid;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean remoteValid;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @Nullable
        public final String localPath;

        public FileValidationResult(boolean z, boolean z2, boolean z3, @Nullable String str) {
            this.isValid = z;
            this.localValid = z2;
            this.remoteValid = z3;
            this.localPath = str;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getLocalPath() {
            return this.localPath;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getLocalValid() {
            return this.localValid;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsValid() {
            return this.isValid;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FileValidationResult)) {
                return false;
            }
            FileValidationResult fileValidationResult = (FileValidationResult) other;
            return this.isValid == fileValidationResult.isValid && this.localValid == fileValidationResult.localValid && this.remoteValid == fileValidationResult.remoteValid && Intrinsics.areEqual(this.localPath, fileValidationResult.localPath);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4 */
        public int hashCode() {
            boolean z = this.isValid;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            boolean z2 = this.localValid;
            ?? r2 = z2;
            if (z2) {
                r2 = 1;
            }
            int i2 = (i + r2) * 31;
            boolean z3 = this.remoteValid;
            int i3 = (i2 + (z3 ? 1 : z3)) * 31;
            String str = this.localPath;
            return i3 + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "FileValidationResult(isValid=" + this.isValid + ", localValid=" + this.localValid + ", remoteValid=" + this.remoteValid + ", localPath=" + this.localPath + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"com/heytap/health/health_archives/helper/PdfFileHandler$c", "Lcom/heytap/health/health_archives/util/DownloadPDFManager$b;", "", "onSuccess", "", "errorMessage", "onFailure", "health_archives_release"}, k = 1, mv = {1, 8, 0})
    public static final class c implements DownloadPDFManager.b {
        @Override // com.heytap.health.health_archives.util.DownloadPDFManager.b
        public void onFailure(@NotNull String errorMessage) {
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            a7b.b("PdfFileHandler", "PDF JS download failed: " + errorMessage);
        }

        @Override // com.heytap.health.health_archives.util.DownloadPDFManager.b
        public void onSuccess() {
            a7b.f("PdfFileHandler", "PDF JS download successfully");
        }
    }

    public PdfFileHandler(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.downloadPDFManager = LazyKt__LazyJVMKt.lazy(new Function0<DownloadPDFManager>() { // from class: com.heytap.health.health_archives.helper.PdfFileHandler$downloadPDFManager$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final DownloadPDFManager invoke() {
                return new DownloadPDFManager();
            }
        });
    }

    public final void c() {
        f().c();
    }

    public final void d() {
        f().g("https://ocs-cn-north1.heytapcs.com/ai-health/static/js/pdf.min.js", "https://ocs-cn-north1.heytapcs.com/ai-health/static/js/pdf.sandbox.min.js", "https://ocs-cn-north1.heytapcs.com/ai-health/static/js/pdf.worker.min.js", new c());
    }

    public final void e(String url, final String docId) {
        List<String> listG = g();
        if (docId != null && !listG.contains(docId)) {
            listG.add(docId);
        }
        qg0.e().U(qg0.NOT_DOWNLOADED, GsonUtil.e(listG));
        f().d(url, (116 & 2) != 0 ? null : HealthArchivesHelper.w(url), (116 & 4) != 0 ? null : null, new Function2<Boolean, String, Unit>() { // from class: com.heytap.health.health_archives.helper.PdfFileHandler$downloadPdf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, String str) {
                invoke(bool.booleanValue(), str);
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z, @NotNull String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                if (!z) {
                    a7b.b("PdfFileHandler", "Download failed: " + message);
                    return;
                }
                List listG2 = this.this$0.g();
                List list = listG2;
                if ((!list.isEmpty()) && CollectionsKt___CollectionsKt.contains(listG2, docId)) {
                    TypeIntrinsics.asMutableCollection(list).remove(docId);
                }
                qg0.e().U(qg0.NOT_DOWNLOADED, GsonUtil.e(listG2));
                a7b.f("PdfFileHandler", "Download completed: " + message);
            }
        }, (116 & 16) != 0 ? 8192 : 0, (116 & 32) != 0 ? 100L : 0L, (116 & 64) != 0 ? 65536L : 0L);
    }

    public final DownloadPDFManager f() {
        return (DownloadPDFManager) this.downloadPDFManager.getValue();
    }

    public final List<String> g() {
        List<String> listC = GsonUtil.c(qg0.e().D(qg0.NOT_DOWNLOADED), String.class);
        return listC == null ? new ArrayList() : listC;
    }

    public final String h(Context context, String fileName) {
        if (fileName == null || fileName.length() == 0) {
            return null;
        }
        return new File(context.getFilesDir(), fileName).getAbsolutePath();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object i(@NotNull HealthArchiveFile healthArchiveFile, @Nullable String str, @NotNull Continuation<? super Boolean> continuation) {
        PdfFileHandler$openPdfFile$1 pdfFileHandler$openPdfFile$1;
        String url;
        if (continuation instanceof PdfFileHandler$openPdfFile$1) {
            pdfFileHandler$openPdfFile$1 = (PdfFileHandler$openPdfFile$1) continuation;
            int i = pdfFileHandler$openPdfFile$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pdfFileHandler$openPdfFile$1.label = i - Integer.MIN_VALUE;
            } else {
                pdfFileHandler$openPdfFile$1 = new PdfFileHandler$openPdfFile$1(this, continuation);
            }
        } else {
            pdfFileHandler$openPdfFile$1 = new PdfFileHandler$openPdfFile$1(this, continuation);
        }
        Object objL = pdfFileHandler$openPdfFile$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = pdfFileHandler$openPdfFile$1.label;
        boolean z = false;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objL);
            url = healthArchiveFile.getOriginalUrl().getUrl();
            if (url == null || url.length() == 0) {
                a7b.b("PdfFileHandler", "openPdfFile: originalUrl is empty");
                return Boxing.boxBoolean(false);
            }
            pdfFileHandler$openPdfFile$1.L$0 = this;
            pdfFileHandler$openPdfFile$1.L$1 = str;
            pdfFileHandler$openPdfFile$1.L$2 = url;
            pdfFileHandler$openPdfFile$1.label = 1;
            objL = l(url, str, pdfFileHandler$openPdfFile$1);
            if (objL == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = (String) pdfFileHandler$openPdfFile$1.L$2;
            str = (String) pdfFileHandler$openPdfFile$1.L$1;
            PdfFileHandler pdfFileHandler = (PdfFileHandler) pdfFileHandler$openPdfFile$1.L$0;
            ResultKt.throwOnFailure(objL);
            url = str2;
            this = pdfFileHandler;
        }
        FileValidationResult fileValidationResult = (FileValidationResult) objL;
        if (!fileValidationResult.getIsValid()) {
            return Boxing.boxBoolean(false);
        }
        if (fileValidationResult.getLocalValid() && fileValidationResult.getLocalPath() != null) {
            File file = new File(fileValidationResult.getLocalPath());
            if (this.m(str) && this.k(file)) {
                return Boxing.boxBoolean(true);
            }
        }
        if (!this.f().i()) {
            this.d();
            return Boxing.boxBoolean(false);
        }
        if (fileValidationResult.getLocalValid() && fileValidationResult.getLocalPath() != null && this.m(str)) {
            z = true;
        }
        boolean zJ = this.j(url, fileValidationResult.getLocalPath(), z);
        if (zJ && !fileValidationResult.getLocalValid()) {
            this.e(url, str);
        }
        return Boxing.boxBoolean(zJ);
    }

    public final boolean j(String originalUrl, String localPath, boolean isLocal) {
        try {
            Intent intent = new Intent(qtf.d(), (Class<?>) HealthArchivesPDFWebViewActivity.class);
            if (isLocal) {
                Intrinsics.checkNotNull(localPath);
                originalUrl = localPath;
            }
            intent.putExtra("pdf_url", originalUrl);
            intent.putExtra("pdf_loading_online", !isLocal);
            this.context.startActivity(intent);
            return true;
        } catch (Exception e2) {
            a7b.b("PdfFileHandler", "openPdfWithWebView error: " + e2.getMessage());
            return false;
        }
    }

    public final boolean k(File pdfFile) {
        try {
            Context context = this.context;
            Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", pdfFile);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriForFile, "application/pdf");
            intent.addFlags(1);
            if (intent.resolveActivity(this.context.getPackageManager()) == null) {
                return false;
            }
            this.context.startActivity(intent);
            return true;
        } catch (Exception e2) {
            a7b.b("PdfFileHandler", "openWithExternalPdfReader error: " + e2.getMessage());
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0086  */
    /* JADX WARN: Code duplicated, block: B:27:0x0099 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x009a  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    public final Object l(String str, String str2, Continuation<? super FileValidationResult> continuation) {
        PdfFileHandler$validatePdfFile$1 pdfFileHandler$validatePdfFile$1;
        String strH;
        String str3;
        String str4;
        PdfFileHandler pdfFileHandler;
        ?? BooleanValue;
        Object objG;
        String strS;
        boolean zBooleanValue;
        String str5;
        ?? r7;
        boolean z;
        boolean z2;
        ?? r8;
        if (continuation instanceof PdfFileHandler$validatePdfFile$1) {
            pdfFileHandler$validatePdfFile$1 = (PdfFileHandler$validatePdfFile$1) continuation;
            int i = pdfFileHandler$validatePdfFile$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pdfFileHandler$validatePdfFile$1.label = i - Integer.MIN_VALUE;
            } else {
                pdfFileHandler$validatePdfFile$1 = new PdfFileHandler$validatePdfFile$1(this, continuation);
            }
        } else {
            pdfFileHandler$validatePdfFile$1 = new PdfFileHandler$validatePdfFile$1(this, continuation);
        }
        Object objI = pdfFileHandler$validatePdfFile$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = pdfFileHandler$validatePdfFile$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                String str6 = (String) pdfFileHandler$validatePdfFile$1.L$2;
                str = (String) pdfFileHandler$validatePdfFile$1.L$1;
                PdfFileHandler pdfFileHandler2 = (PdfFileHandler) pdfFileHandler$validatePdfFile$1.L$0;
                ResultKt.throwOnFailure(objI);
                strH = str6;
                this = pdfFileHandler2;
                objG = objI;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i3 = pdfFileHandler$validatePdfFile$1.I$0;
                str5 = (String) pdfFileHandler$validatePdfFile$1.L$0;
                ResultKt.throwOnFailure(objI);
                r8 = i3;
            }
            zBooleanValue = ((Boolean) objI).booleanValue();
            str3 = str5;
            r7 = r8;
            if (r7 == 0 || zBooleanValue) {
                r7 = BooleanValue;
                z = true;
            } else {
                z = false;
            }
            if (r7 != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            a7b.f("PdfFileHandler", "validatePdfFile: localValid=" + z2 + ", remoteValid=" + zBooleanValue);
            return new FileValidationResult(z, r7 != 0, zBooleanValue, str3);
        }
        ResultKt.throwOnFailure(objI);
        strH = h(this.context, HealthArchivesHelper.w(str));
        if (strH != null) {
            Context context = this.context;
            pdfFileHandler$validatePdfFile$1.L$0 = this;
            pdfFileHandler$validatePdfFile$1.L$1 = str;
            pdfFileHandler$validatePdfFile$1.L$2 = strH;
            pdfFileHandler$validatePdfFile$1.label = 1;
            objG = FileCheckHelper.g(context, strH, pdfFileHandler$validatePdfFile$1);
            if (objG == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            str3 = strH;
            str4 = str;
            pdfFileHandler = this;
            BooleanValue = 0;
        }
        strS = HealthArchivesHelper.s(str4);
        if (strS != null) {
            Context context2 = pdfFileHandler.context;
            pdfFileHandler$validatePdfFile$1.L$0 = str3;
            pdfFileHandler$validatePdfFile$1.L$1 = null;
            pdfFileHandler$validatePdfFile$1.L$2 = null;
            pdfFileHandler$validatePdfFile$1.I$0 = BooleanValue;
            pdfFileHandler$validatePdfFile$1.label = 2;
            objI = FileCheckHelper.i(context2, strS, false, pdfFileHandler$validatePdfFile$1);
            if (objI == coroutine_suspended) {
                return coroutine_suspended;
            }
            str5 = str3;
            r8 = BooleanValue;
            zBooleanValue = ((Boolean) objI).booleanValue();
            str3 = str5;
            r7 = r8;
        } else {
            zBooleanValue = false;
        }
        if (r7 == 0) {
            r7 = BooleanValue;
            z = true;
        } else {
            r7 = BooleanValue;
            z = true;
        }
        if (r7 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        a7b.f("PdfFileHandler", "validatePdfFile: localValid=" + z2 + ", remoteValid=" + zBooleanValue);
        return new FileValidationResult(z, r7 != 0, zBooleanValue, str3);
        String str7 = str;
        pdfFileHandler = this;
        BooleanValue = ((Boolean) objG).booleanValue();
        str3 = strH;
        str4 = str7;
        strS = HealthArchivesHelper.s(str4);
        if (strS != null) {
            Context context3 = pdfFileHandler.context;
            pdfFileHandler$validatePdfFile$1.L$0 = str3;
            pdfFileHandler$validatePdfFile$1.L$1 = null;
            pdfFileHandler$validatePdfFile$1.L$2 = null;
            pdfFileHandler$validatePdfFile$1.I$0 = BooleanValue;
            pdfFileHandler$validatePdfFile$1.label = 2;
            objI = FileCheckHelper.i(context3, strS, false, pdfFileHandler$validatePdfFile$1);
            if (objI == coroutine_suspended) {
                return coroutine_suspended;
            }
            str5 = str3;
            r8 = BooleanValue;
            zBooleanValue = ((Boolean) objI).booleanValue();
            str3 = str5;
            r7 = r8;
        } else {
            zBooleanValue = false;
        }
        if (r7 == 0) {
            r7 = BooleanValue;
            z = true;
        } else {
            r7 = BooleanValue;
            z = true;
        }
        if (r7 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        a7b.f("PdfFileHandler", "validatePdfFile: localValid=" + z2 + ", remoteValid=" + zBooleanValue);
        return new FileValidationResult(z, r7 != 0, zBooleanValue, str3);
    }

    public final boolean m(String docId) {
        if (docId == null || docId.length() == 0) {
            return true;
        }
        List<String> listG = g();
        if ((!listG.isEmpty()) && listG.contains(docId)) {
            StringBuilder sb = new StringBuilder();
            sb.append("verifyFileIntegrity: Incomplete file for docId=");
            sb.append(docId);
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("verifyFileIntegrity: Complete file for docId=");
        sb2.append(docId);
        return true;
    }
}
