package com.oplus.aiunit.vision;

import com.heytap.health.community.data.PreSignUploadRequest;
import com.heytap.health.community.data.PreSignUploadResponse;
import com.heytap.health.network.core.BaseResponse;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J/\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00020\u00052\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\t2\b\b\u0001\u0010\r\u001a\u00020\fH'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/a5a;", "", "", "Lcom/heytap/health/community/data/PreSignUploadRequest;", "params", "Lcom/heytap/health/network/core/BaseResponse;", "Lcom/heytap/health/community/data/PreSignUploadResponse;", "b", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "url", "md5", "Lcom/oplus/aiunit/vision/gqf;", c8l.IMAGE_KEY, "Lcom/oplus/aiunit/vision/xr2;", "Lcom/oplus/aiunit/vision/cuf;", "a", "community_release"}, k = 1, mv = {1, 8, 0})
public interface a5a {
    @p1e
    @NotNull
    xr2<cuf> a(@dmk @NotNull String url, @yh8("content-md5") @NotNull String md5, @av1 @NotNull gqf image);

    @m1e("v1/c2s/file/getCommunityPreSignUpload")
    @Nullable
    Object b(@av1 @NotNull List<PreSignUploadRequest> list, @NotNull Continuation<? super BaseResponse<List<PreSignUploadResponse>>> continuation);
}
