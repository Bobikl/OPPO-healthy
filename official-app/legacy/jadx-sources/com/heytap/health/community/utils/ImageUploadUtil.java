package com.heytap.health.community.utils;

import com.cloud.sdk.cloudstorage.http.FileSyncModel;
import com.heytap.health.community.data.PreSignUploadRequest;
import com.heytap.health.community.data.PreSignUploadResponse;
import com.heytap.health.network.core.BaseResponse;
import com.heytap.health.network.core.a;
import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.oplus.aiunit.vision.a5a;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.at2;
import com.oplus.aiunit.vision.cuf;
import com.oplus.aiunit.vision.gqf;
import com.oplus.aiunit.vision.xr2;
import com.oplus.aiunit.vision.ztf;
import io.protostuff.MapSchema;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.MediaType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.collections.CollectionsKt__CollectionsJVMKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.DebugProbesKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/community/utils/ImageUploadUtil;", "", "", "filePath", "", "bizType", "Lcom/heytap/health/community/data/PreSignUploadResponse;", "d", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "url", "md5", "", MapSchema.FIELD_NAME_ENTRY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "Lcom/oplus/aiunit/vision/a5a;", "a", "Lkotlin/Lazy;", "c", "()Lcom/oplus/aiunit/vision/a5a;", "postService", "<init>", "()V", "community_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nImageUploadUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageUploadUtil.kt\ncom/heytap/health/community/utils/ImageUploadUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,113:1\n288#2,2:114\n314#3,11:116\n*S KotlinDebug\n*F\n+ 1 ImageUploadUtil.kt\ncom/heytap/health/community/utils/ImageUploadUtil\n*L\n49#1:114,2\n72#1:116,11\n*E\n"})
public final class ImageUploadUtil {

    @NotNull
    public static final ImageUploadUtil INSTANCE = new ImageUploadUtil();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy postService = LazyKt__LazyJVMKt.lazy(new Function0<a5a>() { // from class: com.heytap.health.community.utils.ImageUploadUtil$postService$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        public final a5a invoke() {
            return (a5a) a.k(a5a.class);
        }
    });

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J$\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016J\u001e\u0010\u000b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\f"}, d2 = {"com/heytap/health/community/utils/ImageUploadUtil$a", "Lcom/oplus/aiunit/vision/at2;", "Lcom/oplus/aiunit/vision/cuf;", "Lcom/oplus/aiunit/vision/xr2;", "call", "Lcom/oplus/aiunit/vision/ztf;", AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, "", "onResponse", "", "t", "onFailure", "community_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements at2<cuf> {
        public final /* synthetic */ CancellableContinuation<Boolean> i;

        /* JADX WARN: Multi-variable type inference failed */
        public a(CancellableContinuation<? super Boolean> cancellableContinuation) {
            this.i = cancellableContinuation;
        }

        @Override // com.oplus.aiunit.vision.at2
        public void onFailure(@NotNull xr2<cuf> call, @NotNull Throwable t) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t, "t");
            a7b.c("ImageUploadUtil", "uploadImage error: ", t);
            CancellableContinuation<Boolean> cancellableContinuation = this.i;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m5287constructorimpl(Boolean.FALSE));
        }

        @Override // com.oplus.aiunit.vision.at2
        public void onResponse(@NotNull xr2<cuf> call, @NotNull ztf<cuf> response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            StringBuilder sb = new StringBuilder();
            sb.append("uploadImage response=");
            sb.append(response);
            a7b.f("ImageUploadUtil", "uploadImage success=" + response.g());
            CancellableContinuation<Boolean> cancellableContinuation = this.i;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m5287constructorimpl(Boolean.valueOf(response.g())));
        }
    }

    public final String b(String filePath) throws NoSuchAlgorithmException, IOException {
        int i;
        FileInputStream fileInputStream = new FileInputStream(filePath);
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bArr = new byte[1024];
        do {
            i = fileInputStream.read(bArr);
            if (i > 0) {
                messageDigest.update(bArr, 0, i);
            }
        } while (i != -1);
        fileInputStream.close();
        String strEncodeToString = Base64.getEncoder().encodeToString(messageDigest.digest());
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "getEncoder().encodeToString(md5Bytes)");
        return strEncodeToString;
    }

    public final a5a c() {
        Object value = postService.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-postService>(...)");
        return (a5a) value;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00fc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x0104  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:45:0x0104, please report this as an issue */
    @Nullable
    public final Object d(@NotNull String str, int i, @NotNull Continuation<? super PreSignUploadResponse> continuation) throws NoSuchAlgorithmException, IOException {
        ImageUploadUtil$uploadImage$1 imageUploadUtil$uploadImage$1;
        ImageUploadUtil imageUploadUtil;
        String str2;
        String str3;
        String str4;
        Object next;
        PreSignUploadResponse preSignUploadResponse;
        if (continuation instanceof ImageUploadUtil$uploadImage$1) {
            imageUploadUtil$uploadImage$1 = (ImageUploadUtil$uploadImage$1) continuation;
            int i2 = imageUploadUtil$uploadImage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                imageUploadUtil$uploadImage$1.label = i2 - Integer.MIN_VALUE;
            } else {
                imageUploadUtil$uploadImage$1 = new ImageUploadUtil$uploadImage$1(this, continuation);
            }
        } else {
            imageUploadUtil$uploadImage$1 = new ImageUploadUtil$uploadImage$1(this, continuation);
        }
        Object objE = imageUploadUtil$uploadImage$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = imageUploadUtil$uploadImage$1.label;
        boolean z = true;
        if (i3 != 0) {
            if (i3 == 1) {
                str2 = (String) imageUploadUtil$uploadImage$1.L$3;
                str4 = (String) imageUploadUtil$uploadImage$1.L$2;
                str3 = (String) imageUploadUtil$uploadImage$1.L$1;
                imageUploadUtil = (ImageUploadUtil) imageUploadUtil$uploadImage$1.L$0;
                ResultKt.throwOnFailure(objE);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                preSignUploadResponse = (PreSignUploadResponse) imageUploadUtil$uploadImage$1.L$0;
                ResultKt.throwOnFailure(objE);
            }
            if (((Boolean) objE).booleanValue()) {
                return preSignUploadResponse;
            }
            return null;
        }
        ResultKt.throwOnFailure(objE);
        String strB = b(str);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        List<PreSignUploadRequest> listListOf = CollectionsKt__CollectionsJVMKt.listOf(new PreSignUploadRequest(i, strValueOf, "jpg", strB));
        a5a a5aVar = (a5a) com.heytap.health.network.core.a.j(a5a.class);
        imageUploadUtil$uploadImage$1.L$0 = this;
        imageUploadUtil$uploadImage$1.L$1 = str;
        imageUploadUtil$uploadImage$1.L$2 = strB;
        imageUploadUtil$uploadImage$1.L$3 = strValueOf;
        imageUploadUtil$uploadImage$1.label = 1;
        Object objB = a5aVar.b(listListOf, imageUploadUtil$uploadImage$1);
        if (objB == coroutine_suspended) {
            return coroutine_suspended;
        }
        imageUploadUtil = this;
        str2 = strValueOf;
        str3 = str;
        str4 = strB;
        objE = objB;
        BaseResponse baseResponse = (BaseResponse) objE;
        StringBuilder sb = new StringBuilder();
        sb.append("uploadImage response = ");
        sb.append(baseResponse);
        if (baseResponse.isSuccess()) {
            Collection collection = (Collection) baseResponse.getBody();
            if (collection != null && !collection.isEmpty()) {
                z = false;
            }
            if (z) {
                a7b.b("ImageUploadUtil", "uploadImage pre sign error. response=" + baseResponse);
            } else {
                Object body = baseResponse.getBody();
                Intrinsics.checkNotNullExpressionValue(body, "response.body");
                Iterator it = ((Iterable) body).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(((PreSignUploadResponse) next).getClientFileId(), str2));
                preSignUploadResponse = (PreSignUploadResponse) next;
                if (preSignUploadResponse != null) {
                    String ocsUrl = preSignUploadResponse.getOcsUrl();
                    imageUploadUtil$uploadImage$1.L$0 = preSignUploadResponse;
                    imageUploadUtil$uploadImage$1.L$1 = null;
                    imageUploadUtil$uploadImage$1.L$2 = null;
                    imageUploadUtil$uploadImage$1.L$3 = null;
                    imageUploadUtil$uploadImage$1.label = 2;
                    objE = imageUploadUtil.e(ocsUrl, str4, str3, imageUploadUtil$uploadImage$1);
                    if (objE == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((Boolean) objE).booleanValue()) {
                        return preSignUploadResponse;
                    }
                } else {
                    a7b.b("ImageUploadUtil", "uploadImage pre sign do not find target response");
                }
            }
        } else {
            a7b.b("ImageUploadUtil", "uploadImage pre sign error. response=" + baseResponse);
        }
        return null;
    }

    public final Object e(String str, String str2, String str3, Continuation<? super Boolean> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        StringBuilder sb = new StringBuilder();
        sb.append("uploadImage url=");
        sb.append(str);
        sb.append(", md5=");
        sb.append(str2);
        sb.append(", fileUri=");
        sb.append(str3);
        INSTANCE.c().a(str, str2, gqf.INSTANCE.c(MediaType.INSTANCE.b(FileSyncModel.streamMime), new File(str3))).h(new a(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
