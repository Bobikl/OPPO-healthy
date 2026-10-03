package com.heytap.store.homemodule.data;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b|\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bÿ\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t\u0012\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\t\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010,J\t\u0010\u007f\u001a\u00020\u0003HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010IJ\u0011\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010OJ\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010IJ\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010IJ\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010IJ\u0011\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010OJ\u0011\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010IJ\u0011\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010OJ\u0011\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010OJ\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010OJ\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0012\u0010\u0099\u0001\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tHÆ\u0003J\u0012\u0010\u009a\u0001\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\tHÆ\u0003J\u0011\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u0010IJ\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0012\u0010\u009e\u0001\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010 \u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010¡\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010¢\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003JÐ\u0003\u0010£\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t2\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\t2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0003\u0010¤\u0001J\u0016\u0010¥\u0001\u001a\u00030¦\u00012\t\u0010§\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010¨\u0001\u001a\u00020\u0018HÖ\u0001J\n\u0010©\u0001\u001a\u00020\u0005HÖ\u0001R\u001c\u0010%\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010.\"\u0004\b2\u00100R\"\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010.\"\u0004\b8\u00100R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010.\"\u0004\b:\u00100R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u00104\"\u0004\b<\u00106R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010.\"\u0004\b>\u00100R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010(\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u00104\"\u0004\bD\u00106R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010.\"\u0004\bF\u00100R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010.\"\u0004\bH\u00100R\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010L\u001a\u0004\b\u001f\u0010I\"\u0004\bJ\u0010KR\u001e\u0010!\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010L\u001a\u0004\b!\u0010I\"\u0004\bM\u0010KR\u001e\u0010$\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010R\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010.\"\u0004\bT\u00100R\u001c\u0010&\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010.\"\u0004\bV\u00100R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010.\"\u0004\bX\u00100R\u001e\u0010*\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010L\u001a\u0004\bY\u0010I\"\u0004\bZ\u0010KR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010.\"\u0004\b\\\u00100R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010.\"\u0004\b^\u00100R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010.\"\u0004\b`\u00100R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010.\"\u0004\bb\u00100R\u001e\u0010\"\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010R\u001a\u0004\bc\u0010O\"\u0004\bd\u0010QR\u001e\u0010 \u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010R\u001a\u0004\be\u0010O\"\u0004\bf\u0010QR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010.\"\u0004\bh\u00100R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010.\"\u0004\bj\u00100R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010L\u001a\u0004\bk\u0010I\"\u0004\bl\u0010KR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010.\"\u0004\bn\u00100R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010R\u001a\u0004\bo\u0010O\"\u0004\bp\u0010QR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010.\"\u0004\br\u00100R\u001c\u0010+\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010.\"\u0004\bt\u00100R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010L\u001a\u0004\bu\u0010I\"\u0004\bv\u0010KR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u0010\n\u0002\u0010L\u001a\u0004\bw\u0010I\"\u0004\bx\u0010KR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010.\"\u0004\bz\u00100R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b{\u0010.\"\u0004\b|\u00100R\u001e\u0010#\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010R\u001a\u0004\b}\u0010O\"\u0004\b~\u0010Q¨\u0006ª\u0001"}, d2 = {"Lcom/heytap/store/homemodule/data/LiveInfoForm;", "", "getDataTime", "", "accountLogo", "", "backgroudColor", "backgroundUrl", "comments", "", "Lcom/heytap/store/homemodule/data/Comment;", "endTime", "guests", "introduction", "link", "liveName", "mcLogo", "mcName", "mcUid", "noticeVideo", "posterQR", "posterUrl", "streamCode", "steamId", "", "roomId", "status", "pullUrl", "pullType", "screenSize", "title", "isAdvance", "planStartTime", "isBooked", "nowTime", "viewNum", "likesNum", "account", "listPicUrl", "activityInfos", "goods", "Lcom/heytap/store/homemodule/data/LiveGood;", "liveStyle", "startTime", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;)V", "getAccount", "()Ljava/lang/String;", "setAccount", "(Ljava/lang/String;)V", "getAccountLogo", "setAccountLogo", "getActivityInfos", "()Ljava/util/List;", "setActivityInfos", "(Ljava/util/List;)V", "getBackgroudColor", "setBackgroudColor", "getBackgroundUrl", "setBackgroundUrl", "getComments", "setComments", "getEndTime", "setEndTime", "getGetDataTime", "()J", "setGetDataTime", "(J)V", "getGoods", "setGoods", "getGuests", "setGuests", "getIntroduction", "setIntroduction", "()Ljava/lang/Integer;", "setAdvance", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "setBooked", "getLikesNum", "()Ljava/lang/Long;", "setLikesNum", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getLink", "setLink", "getListPicUrl", "setListPicUrl", "getLiveName", "setLiveName", "getLiveStyle", "setLiveStyle", "getMcLogo", "setMcLogo", "getMcName", "setMcName", "getMcUid", "setMcUid", "getNoticeVideo", "setNoticeVideo", "getNowTime", "setNowTime", "getPlanStartTime", "setPlanStartTime", "getPosterQR", "setPosterQR", "getPosterUrl", "setPosterUrl", "getPullType", "setPullType", "getPullUrl", "setPullUrl", "getRoomId", "setRoomId", "getScreenSize", "setScreenSize", "getStartTime", "setStartTime", "getStatus", "setStatus", "getSteamId", "setSteamId", "getStreamCode", "setStreamCode", "getTitle", "setTitle", "getViewNum", "setViewNum", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;)Lcom/heytap/store/homemodule/data/LiveInfoForm;", "equals", "", "other", "hashCode", "toString", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class LiveInfoForm {

    @Nullable
    private String account;

    @Nullable
    private String accountLogo;

    @Nullable
    private List<String> activityInfos;

    @Nullable
    private String backgroudColor;

    @Nullable
    private String backgroundUrl;

    @Nullable
    private List<Comment> comments;

    @Nullable
    private String endTime;
    private long getDataTime;

    @Nullable
    private List<LiveGood> goods;

    @Nullable
    private String guests;

    @Nullable
    private String introduction;

    @Nullable
    private Integer isAdvance;

    @Nullable
    private Integer isBooked;

    @Nullable
    private Long likesNum;

    @Nullable
    private String link;

    @Nullable
    private String listPicUrl;

    @Nullable
    private String liveName;

    @Nullable
    private Integer liveStyle;

    @Nullable
    private String mcLogo;

    @Nullable
    private String mcName;

    @Nullable
    private String mcUid;

    @Nullable
    private String noticeVideo;

    @Nullable
    private Long nowTime;

    @Nullable
    private Long planStartTime;

    @Nullable
    private String posterQR;

    @Nullable
    private String posterUrl;

    @Nullable
    private Integer pullType;

    @Nullable
    private String pullUrl;

    @Nullable
    private Long roomId;

    @Nullable
    private String screenSize;

    @Nullable
    private String startTime;

    @Nullable
    private Integer status;

    @Nullable
    private Integer steamId;

    @Nullable
    private String streamCode;

    @Nullable
    private String title;

    @Nullable
    private Long viewNum;

    public LiveInfoForm(long j2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<Comment> list, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable Integer num, @Nullable Long l2, @Nullable Integer num2, @Nullable String str16, @Nullable Integer num3, @Nullable String str17, @Nullable String str18, @Nullable Integer num4, @Nullable Long l3, @Nullable Integer num5, @Nullable Long l4, @Nullable Long l5, @Nullable Long l6, @Nullable String str19, @Nullable String str20, @Nullable List<String> list2, @Nullable List<LiveGood> list3, @Nullable Integer num6, @Nullable String str21) {
        this.getDataTime = j2;
        this.accountLogo = str;
        this.backgroudColor = str2;
        this.backgroundUrl = str3;
        this.comments = list;
        this.endTime = str4;
        this.guests = str5;
        this.introduction = str6;
        this.link = str7;
        this.liveName = str8;
        this.mcLogo = str9;
        this.mcName = str10;
        this.mcUid = str11;
        this.noticeVideo = str12;
        this.posterQR = str13;
        this.posterUrl = str14;
        this.streamCode = str15;
        this.steamId = num;
        this.roomId = l2;
        this.status = num2;
        this.pullUrl = str16;
        this.pullType = num3;
        this.screenSize = str17;
        this.title = str18;
        this.isAdvance = num4;
        this.planStartTime = l3;
        this.isBooked = num5;
        this.nowTime = l4;
        this.viewNum = l5;
        this.likesNum = l6;
        this.account = str19;
        this.listPicUrl = str20;
        this.activityInfos = list2;
        this.goods = list3;
        this.liveStyle = num6;
        this.startTime = str21;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getGetDataTime() {
        return this.getDataTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getLiveName() {
        return this.liveName;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getMcLogo() {
        return this.mcLogo;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getMcName() {
        return this.mcName;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getMcUid() {
        return this.mcUid;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getNoticeVideo() {
        return this.noticeVideo;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getPosterQR() {
        return this.posterQR;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getPosterUrl() {
        return this.posterUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getStreamCode() {
        return this.streamCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Integer getSteamId() {
        return this.steamId;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Long getRoomId() {
        return this.roomId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAccountLogo() {
        return this.accountLogo;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getPullUrl() {
        return this.pullUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Integer getPullType() {
        return this.pullType;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getScreenSize() {
        return this.screenSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final Integer getIsAdvance() {
        return this.isAdvance;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Long getPlanStartTime() {
        return this.planStartTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Integer getIsBooked() {
        return this.isBooked;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Long getNowTime() {
        return this.nowTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final Long getViewNum() {
        return this.viewNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBackgroudColor() {
        return this.backgroudColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final Long getLikesNum() {
        return this.likesNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getAccount() {
        return this.account;
    }

    @Nullable
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getListPicUrl() {
        return this.listPicUrl;
    }

    @Nullable
    public final List<String> component33() {
        return this.activityInfos;
    }

    @Nullable
    public final List<LiveGood> component34() {
        return this.goods;
    }

    @Nullable
    /* JADX INFO: renamed from: component35, reason: from getter */
    public final Integer getLiveStyle() {
        return this.liveStyle;
    }

    @Nullable
    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBackgroundUrl() {
        return this.backgroundUrl;
    }

    @Nullable
    public final List<Comment> component5() {
        return this.comments;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getGuests() {
        return this.guests;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getIntroduction() {
        return this.introduction;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @NotNull
    public final LiveInfoForm copy(long getDataTime, @Nullable String accountLogo, @Nullable String backgroudColor, @Nullable String backgroundUrl, @Nullable List<Comment> comments, @Nullable String endTime, @Nullable String guests, @Nullable String introduction, @Nullable String link, @Nullable String liveName, @Nullable String mcLogo, @Nullable String mcName, @Nullable String mcUid, @Nullable String noticeVideo, @Nullable String posterQR, @Nullable String posterUrl, @Nullable String streamCode, @Nullable Integer steamId, @Nullable Long roomId, @Nullable Integer status, @Nullable String pullUrl, @Nullable Integer pullType, @Nullable String screenSize, @Nullable String title, @Nullable Integer isAdvance, @Nullable Long planStartTime, @Nullable Integer isBooked, @Nullable Long nowTime, @Nullable Long viewNum, @Nullable Long likesNum, @Nullable String account, @Nullable String listPicUrl, @Nullable List<String> activityInfos, @Nullable List<LiveGood> goods, @Nullable Integer liveStyle, @Nullable String startTime) {
        return new LiveInfoForm(getDataTime, accountLogo, backgroudColor, backgroundUrl, comments, endTime, guests, introduction, link, liveName, mcLogo, mcName, mcUid, noticeVideo, posterQR, posterUrl, streamCode, steamId, roomId, status, pullUrl, pullType, screenSize, title, isAdvance, planStartTime, isBooked, nowTime, viewNum, likesNum, account, listPicUrl, activityInfos, goods, liveStyle, startTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveInfoForm)) {
            return false;
        }
        LiveInfoForm liveInfoForm = (LiveInfoForm) other;
        return this.getDataTime == liveInfoForm.getDataTime && Intrinsics.areEqual(this.accountLogo, liveInfoForm.accountLogo) && Intrinsics.areEqual(this.backgroudColor, liveInfoForm.backgroudColor) && Intrinsics.areEqual(this.backgroundUrl, liveInfoForm.backgroundUrl) && Intrinsics.areEqual(this.comments, liveInfoForm.comments) && Intrinsics.areEqual(this.endTime, liveInfoForm.endTime) && Intrinsics.areEqual(this.guests, liveInfoForm.guests) && Intrinsics.areEqual(this.introduction, liveInfoForm.introduction) && Intrinsics.areEqual(this.link, liveInfoForm.link) && Intrinsics.areEqual(this.liveName, liveInfoForm.liveName) && Intrinsics.areEqual(this.mcLogo, liveInfoForm.mcLogo) && Intrinsics.areEqual(this.mcName, liveInfoForm.mcName) && Intrinsics.areEqual(this.mcUid, liveInfoForm.mcUid) && Intrinsics.areEqual(this.noticeVideo, liveInfoForm.noticeVideo) && Intrinsics.areEqual(this.posterQR, liveInfoForm.posterQR) && Intrinsics.areEqual(this.posterUrl, liveInfoForm.posterUrl) && Intrinsics.areEqual(this.streamCode, liveInfoForm.streamCode) && Intrinsics.areEqual(this.steamId, liveInfoForm.steamId) && Intrinsics.areEqual(this.roomId, liveInfoForm.roomId) && Intrinsics.areEqual(this.status, liveInfoForm.status) && Intrinsics.areEqual(this.pullUrl, liveInfoForm.pullUrl) && Intrinsics.areEqual(this.pullType, liveInfoForm.pullType) && Intrinsics.areEqual(this.screenSize, liveInfoForm.screenSize) && Intrinsics.areEqual(this.title, liveInfoForm.title) && Intrinsics.areEqual(this.isAdvance, liveInfoForm.isAdvance) && Intrinsics.areEqual(this.planStartTime, liveInfoForm.planStartTime) && Intrinsics.areEqual(this.isBooked, liveInfoForm.isBooked) && Intrinsics.areEqual(this.nowTime, liveInfoForm.nowTime) && Intrinsics.areEqual(this.viewNum, liveInfoForm.viewNum) && Intrinsics.areEqual(this.likesNum, liveInfoForm.likesNum) && Intrinsics.areEqual(this.account, liveInfoForm.account) && Intrinsics.areEqual(this.listPicUrl, liveInfoForm.listPicUrl) && Intrinsics.areEqual(this.activityInfos, liveInfoForm.activityInfos) && Intrinsics.areEqual(this.goods, liveInfoForm.goods) && Intrinsics.areEqual(this.liveStyle, liveInfoForm.liveStyle) && Intrinsics.areEqual(this.startTime, liveInfoForm.startTime);
    }

    @Nullable
    public final String getAccount() {
        return this.account;
    }

    @Nullable
    public final String getAccountLogo() {
        return this.accountLogo;
    }

    @Nullable
    public final List<String> getActivityInfos() {
        return this.activityInfos;
    }

    @Nullable
    public final String getBackgroudColor() {
        return this.backgroudColor;
    }

    @Nullable
    public final String getBackgroundUrl() {
        return this.backgroundUrl;
    }

    @Nullable
    public final List<Comment> getComments() {
        return this.comments;
    }

    @Nullable
    public final String getEndTime() {
        return this.endTime;
    }

    public final long getGetDataTime() {
        return this.getDataTime;
    }

    @Nullable
    public final List<LiveGood> getGoods() {
        return this.goods;
    }

    @Nullable
    public final String getGuests() {
        return this.guests;
    }

    @Nullable
    public final String getIntroduction() {
        return this.introduction;
    }

    @Nullable
    public final Long getLikesNum() {
        return this.likesNum;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final String getListPicUrl() {
        return this.listPicUrl;
    }

    @Nullable
    public final String getLiveName() {
        return this.liveName;
    }

    @Nullable
    public final Integer getLiveStyle() {
        return this.liveStyle;
    }

    @Nullable
    public final String getMcLogo() {
        return this.mcLogo;
    }

    @Nullable
    public final String getMcName() {
        return this.mcName;
    }

    @Nullable
    public final String getMcUid() {
        return this.mcUid;
    }

    @Nullable
    public final String getNoticeVideo() {
        return this.noticeVideo;
    }

    @Nullable
    public final Long getNowTime() {
        return this.nowTime;
    }

    @Nullable
    public final Long getPlanStartTime() {
        return this.planStartTime;
    }

    @Nullable
    public final String getPosterQR() {
        return this.posterQR;
    }

    @Nullable
    public final String getPosterUrl() {
        return this.posterUrl;
    }

    @Nullable
    public final Integer getPullType() {
        return this.pullType;
    }

    @Nullable
    public final String getPullUrl() {
        return this.pullUrl;
    }

    @Nullable
    public final Long getRoomId() {
        return this.roomId;
    }

    @Nullable
    public final String getScreenSize() {
        return this.screenSize;
    }

    @Nullable
    public final String getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final Integer getStatus() {
        return this.status;
    }

    @Nullable
    public final Integer getSteamId() {
        return this.steamId;
    }

    @Nullable
    public final String getStreamCode() {
        return this.streamCode;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final Long getViewNum() {
        return this.viewNum;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.getDataTime) * 31;
        String str = this.accountLogo;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroudColor;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.backgroundUrl;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<Comment> list = this.comments;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.endTime;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.guests;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.introduction;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.link;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.liveName;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.mcLogo;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.mcName;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.mcUid;
        int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.noticeVideo;
        int iHashCode14 = (iHashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.posterQR;
        int iHashCode15 = (iHashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.posterUrl;
        int iHashCode16 = (iHashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.streamCode;
        int iHashCode17 = (iHashCode16 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Integer num = this.steamId;
        int iHashCode18 = (iHashCode17 + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.roomId;
        int iHashCode19 = (iHashCode18 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num2 = this.status;
        int iHashCode20 = (iHashCode19 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str16 = this.pullUrl;
        int iHashCode21 = (iHashCode20 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Integer num3 = this.pullType;
        int iHashCode22 = (iHashCode21 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str17 = this.screenSize;
        int iHashCode23 = (iHashCode22 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.title;
        int iHashCode24 = (iHashCode23 + (str18 == null ? 0 : str18.hashCode())) * 31;
        Integer num4 = this.isAdvance;
        int iHashCode25 = (iHashCode24 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Long l3 = this.planStartTime;
        int iHashCode26 = (iHashCode25 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num5 = this.isBooked;
        int iHashCode27 = (iHashCode26 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Long l4 = this.nowTime;
        int iHashCode28 = (iHashCode27 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.viewNum;
        int iHashCode29 = (iHashCode28 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.likesNum;
        int iHashCode30 = (iHashCode29 + (l6 == null ? 0 : l6.hashCode())) * 31;
        String str19 = this.account;
        int iHashCode31 = (iHashCode30 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.listPicUrl;
        int iHashCode32 = (iHashCode31 + (str20 == null ? 0 : str20.hashCode())) * 31;
        List<String> list2 = this.activityInfos;
        int iHashCode33 = (iHashCode32 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<LiveGood> list3 = this.goods;
        int iHashCode34 = (iHashCode33 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num6 = this.liveStyle;
        int iHashCode35 = (iHashCode34 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str21 = this.startTime;
        return iHashCode35 + (str21 != null ? str21.hashCode() : 0);
    }

    @Nullable
    public final Integer isAdvance() {
        return this.isAdvance;
    }

    @Nullable
    public final Integer isBooked() {
        return this.isBooked;
    }

    public final void setAccount(@Nullable String str) {
        this.account = str;
    }

    public final void setAccountLogo(@Nullable String str) {
        this.accountLogo = str;
    }

    public final void setActivityInfos(@Nullable List<String> list) {
        this.activityInfos = list;
    }

    public final void setAdvance(@Nullable Integer num) {
        this.isAdvance = num;
    }

    public final void setBackgroudColor(@Nullable String str) {
        this.backgroudColor = str;
    }

    public final void setBackgroundUrl(@Nullable String str) {
        this.backgroundUrl = str;
    }

    public final void setBooked(@Nullable Integer num) {
        this.isBooked = num;
    }

    public final void setComments(@Nullable List<Comment> list) {
        this.comments = list;
    }

    public final void setEndTime(@Nullable String str) {
        this.endTime = str;
    }

    public final void setGetDataTime(long j2) {
        this.getDataTime = j2;
    }

    public final void setGoods(@Nullable List<LiveGood> list) {
        this.goods = list;
    }

    public final void setGuests(@Nullable String str) {
        this.guests = str;
    }

    public final void setIntroduction(@Nullable String str) {
        this.introduction = str;
    }

    public final void setLikesNum(@Nullable Long l2) {
        this.likesNum = l2;
    }

    public final void setLink(@Nullable String str) {
        this.link = str;
    }

    public final void setListPicUrl(@Nullable String str) {
        this.listPicUrl = str;
    }

    public final void setLiveName(@Nullable String str) {
        this.liveName = str;
    }

    public final void setLiveStyle(@Nullable Integer num) {
        this.liveStyle = num;
    }

    public final void setMcLogo(@Nullable String str) {
        this.mcLogo = str;
    }

    public final void setMcName(@Nullable String str) {
        this.mcName = str;
    }

    public final void setMcUid(@Nullable String str) {
        this.mcUid = str;
    }

    public final void setNoticeVideo(@Nullable String str) {
        this.noticeVideo = str;
    }

    public final void setNowTime(@Nullable Long l2) {
        this.nowTime = l2;
    }

    public final void setPlanStartTime(@Nullable Long l2) {
        this.planStartTime = l2;
    }

    public final void setPosterQR(@Nullable String str) {
        this.posterQR = str;
    }

    public final void setPosterUrl(@Nullable String str) {
        this.posterUrl = str;
    }

    public final void setPullType(@Nullable Integer num) {
        this.pullType = num;
    }

    public final void setPullUrl(@Nullable String str) {
        this.pullUrl = str;
    }

    public final void setRoomId(@Nullable Long l2) {
        this.roomId = l2;
    }

    public final void setScreenSize(@Nullable String str) {
        this.screenSize = str;
    }

    public final void setStartTime(@Nullable String str) {
        this.startTime = str;
    }

    public final void setStatus(@Nullable Integer num) {
        this.status = num;
    }

    public final void setSteamId(@Nullable Integer num) {
        this.steamId = num;
    }

    public final void setStreamCode(@Nullable String str) {
        this.streamCode = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setViewNum(@Nullable Long l2) {
        this.viewNum = l2;
    }

    @NotNull
    public String toString() {
        return "LiveInfoForm(getDataTime=" + this.getDataTime + ", accountLogo=" + ((Object) this.accountLogo) + ", backgroudColor=" + ((Object) this.backgroudColor) + ", backgroundUrl=" + ((Object) this.backgroundUrl) + ", comments=" + this.comments + ", endTime=" + ((Object) this.endTime) + ", guests=" + ((Object) this.guests) + ", introduction=" + ((Object) this.introduction) + ", link=" + ((Object) this.link) + ", liveName=" + ((Object) this.liveName) + ", mcLogo=" + ((Object) this.mcLogo) + ", mcName=" + ((Object) this.mcName) + ", mcUid=" + ((Object) this.mcUid) + ", noticeVideo=" + ((Object) this.noticeVideo) + ", posterQR=" + ((Object) this.posterQR) + ", posterUrl=" + ((Object) this.posterUrl) + ", streamCode=" + ((Object) this.streamCode) + ", steamId=" + this.steamId + ", roomId=" + this.roomId + ", status=" + this.status + ", pullUrl=" + ((Object) this.pullUrl) + ", pullType=" + this.pullType + ", screenSize=" + ((Object) this.screenSize) + ", title=" + ((Object) this.title) + ", isAdvance=" + this.isAdvance + ", planStartTime=" + this.planStartTime + ", isBooked=" + this.isBooked + ", nowTime=" + this.nowTime + ", viewNum=" + this.viewNum + ", likesNum=" + this.likesNum + ", account=" + ((Object) this.account) + ", listPicUrl=" + ((Object) this.listPicUrl) + ", activityInfos=" + this.activityInfos + ", goods=" + this.goods + ", liveStyle=" + this.liveStyle + ", startTime=" + ((Object) this.startTime) + ')';
    }

    public /* synthetic */ LiveInfoForm(long j2, String str, String str2, String str3, List list, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Integer num, Long l2, Integer num2, String str16, Integer num3, String str17, String str18, Integer num4, Long l3, Integer num5, Long l4, Long l5, Long l6, String str19, String str20, List list2, List list3, Integer num6, String str21, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j2, str, str2, str3, list, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, num, l2, num2, str16, num3, str17, str18, num4, l3, num5, l4, l5, l6, str19, str20, list2, list3, num6, str21);
    }
}
