package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import com.heytap.databaseengine.model.UserInfo;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\r\u0018\u0000 \u001a2\u00020\u0001:\u0001\rB)\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0014R\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0016\u0010\u0016\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/oplus/aiunit/vision/v43;", "Lcom/oplus/aiunit/vision/sf1;", "Ljava/security/MessageDigest;", "messageDigest", "", "updateDiskCacheKey", "Lcom/oplus/aiunit/vision/kf1;", "pool", "Landroid/graphics/Bitmap;", "toTransform", "", "outWidth", "outHeight", "a", "", UserInfo.SEX_FEMALE, "topLeft", "b", "topRight", "c", "bottomRight", "d", "bottomLeft", "toRight", "<init>", "(FFFF)V", "Companion", "community_impl_release"}, k = 1, mv = {1, 8, 0})
public final class v43 extends sf1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final byte[] f17701e;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public float topLeft;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public float topRight;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public float bottomRight;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public float bottomLeft;

    static {
        Charset CHARSET = ona.CHARSET;
        Intrinsics.checkNotNullExpressionValue(CHARSET, "CHARSET");
        byte[] bytes = "com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners".getBytes(CHARSET);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        f17701e = bytes;
    }

    public v43(float f, float f2, float f3, float f4) {
        this.topLeft = f;
        this.topRight = f2;
        this.bottomRight = f3;
        this.bottomLeft = f4;
    }

    @Override // com.oplus.aiunit.vision.sf1
    @NotNull
    public Bitmap a(@NotNull kf1 pool, @NotNull Bitmap toTransform, int outWidth, int outHeight) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        Intrinsics.checkNotNullParameter(toTransform, "toTransform");
        Bitmap roundedBitmap = z9k.o(pool, z9k.b(pool, toTransform, outWidth, outHeight), this.topLeft, this.topRight, this.bottomRight, this.bottomLeft);
        Intrinsics.checkNotNullExpressionValue(roundedBitmap, "roundedBitmap");
        return roundedBitmap;
    }

    @Override // com.oplus.aiunit.vision.ona
    public void updateDiskCacheKey(@NotNull MessageDigest messageDigest) {
        Intrinsics.checkNotNullParameter(messageDigest, "messageDigest");
        messageDigest.update(f17701e);
        messageDigest.update(ByteBuffer.allocate(16).putFloat(this.topLeft).putFloat(this.topRight).putFloat(this.bottomRight).putFloat(this.bottomLeft).array());
    }
}
