package com.heytap.nearx.tangramconfig.bean;

import com.heytap.nearx.tangramconfig.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000)\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0003\b\u0099\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 ¤\u00032\u00020\u0001:\u0002¤\u0003B÷\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0005\u0012\b\b\u0002\u0010 \u001a\u00020\u0005\u0012\b\b\u0002\u0010!\u001a\u00020\u0005\u0012\b\b\u0002\u0010\"\u001a\u00020\u0005\u0012\b\b\u0002\u0010#\u001a\u00020\u0005\u0012\b\b\u0002\u0010$\u001a\u00020\u0005\u0012\b\b\u0002\u0010%\u001a\u00020\u0005\u0012\b\b\u0002\u0010&\u001a\u00020\u0005\u0012\b\b\u0002\u0010'\u001a\u00020\u0005\u0012\b\b\u0002\u0010(\u001a\u00020\u0005\u0012\b\b\u0002\u0010)\u001a\u00020\u0005\u0012\b\b\u0002\u0010*\u001a\u00020\u0005\u0012\b\b\u0002\u0010+\u001a\u00020\u0005\u0012\b\b\u0002\u0010,\u001a\u00020\u0005\u0012\b\b\u0002\u0010-\u001a\u00020\u0005\u0012\b\b\u0002\u0010.\u001a\u00020\u0005\u0012\b\b\u0002\u0010/\u001a\u00020\u0005\u0012\b\b\u0002\u00100\u001a\u00020\u0005\u0012\b\b\u0002\u00101\u001a\u00020\u0005\u0012\b\b\u0002\u00102\u001a\u00020\u0005\u0012\b\b\u0002\u00103\u001a\u00020\u0005\u0012\b\b\u0002\u00104\u001a\u00020\u0005\u0012\b\b\u0002\u00105\u001a\u00020\u0005\u0012\b\b\u0002\u00106\u001a\u00020\u0005\u0012\b\b\u0002\u00107\u001a\u00020\u0005\u0012\b\b\u0002\u00108\u001a\u00020\u0005\u0012\b\b\u0002\u00109\u001a\u00020\u0005\u0012\b\b\u0002\u0010:\u001a\u00020\u0005\u0012\b\b\u0002\u0010;\u001a\u00020\u0005\u0012\b\b\u0002\u0010<\u001a\u00020\u0005\u0012\b\b\u0002\u0010=\u001a\u00020\u0005\u0012\b\b\u0002\u0010>\u001a\u00020\u0005\u0012\b\b\u0002\u0010?\u001a\u00020\u0005\u0012\b\b\u0002\u0010@\u001a\u00020\u0005\u0012\b\b\u0002\u0010A\u001a\u00020\u0005\u0012\b\b\u0002\u0010B\u001a\u00020\u0005\u0012\b\b\u0002\u0010C\u001a\u00020\u0005\u0012\b\b\u0002\u0010D\u001a\u00020\u0005\u0012\b\b\u0002\u0010E\u001a\u00020\u0005\u0012\b\b\u0002\u0010F\u001a\u00020\u0005\u0012\b\b\u0002\u0010G\u001a\u00020\u0005\u0012\b\b\u0002\u0010H\u001a\u00020\u0005\u0012\b\b\u0002\u0010I\u001a\u00020\u0005\u0012\b\b\u0002\u0010J\u001a\u00020\u0005\u0012\b\b\u0002\u0010K\u001a\u00020\u0005\u0012\b\b\u0002\u0010L\u001a\u00020\u0005\u0012\b\b\u0002\u0010M\u001a\u00020\u0005\u0012\b\b\u0002\u0010N\u001a\u00020\u0005\u0012\b\b\u0002\u0010O\u001a\u00020\u0005\u0012\b\b\u0002\u0010P\u001a\u00020\u0005\u0012\b\b\u0002\u0010Q\u001a\u00020\u0005\u0012\b\b\u0002\u0010R\u001a\u00020\u0005\u0012\b\b\u0002\u0010S\u001a\u00020\u0005\u0012\b\b\u0002\u0010T\u001a\u00020\u0005\u0012\b\b\u0002\u0010U\u001a\u00020\u0005\u0012\b\b\u0002\u0010V\u001a\u00020\u0005\u0012\b\b\u0002\u0010W\u001a\u00020\u0005\u0012\b\b\u0002\u0010X\u001a\u00020\u0005\u0012\b\b\u0002\u0010Y\u001a\u00020\u0005\u0012\b\b\u0002\u0010Z\u001a\u00020\u0005\u0012\b\b\u0002\u0010[\u001a\u00020\u0005\u0012\b\b\u0002\u0010\\\u001a\u00020\u0005\u0012\b\b\u0002\u0010]\u001a\u00020\u0005\u0012\b\b\u0002\u0010^\u001a\u00020\u0005\u0012\b\b\u0002\u0010_\u001a\u00020\u0005\u0012\b\b\u0002\u0010`\u001a\u00020\u0005\u0012\b\b\u0002\u0010a\u001a\u00020\u0005\u0012\b\b\u0002\u0010b\u001a\u00020\u0005\u0012\b\b\u0002\u0010c\u001a\u00020\u0005\u0012\b\b\u0002\u0010d\u001a\u00020\u0005\u0012\b\b\u0002\u0010e\u001a\u00020\u0005\u0012\b\b\u0002\u0010f\u001a\u00020\u0005\u0012\b\b\u0002\u0010g\u001a\u00020\u0005\u0012\b\b\u0002\u0010h\u001a\u00020\u0005¢\u0006\u0002\u0010iJ\n\u0010¸\u0002\u001a\u00020\u0003HÆ\u0003J\n\u0010¹\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010º\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010»\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010¼\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010½\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010¾\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010¿\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010À\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010Á\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010Â\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010Ã\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010Ä\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010Å\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010Æ\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010Ç\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010È\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010É\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010Ê\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010Ë\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010Ì\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010Í\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010Î\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010Ï\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010Ð\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010Ñ\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010Ò\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010Ó\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010Ô\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010Õ\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010Ö\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010×\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010Ø\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010Ù\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010Ú\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010Û\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010Ü\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010Ý\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010Þ\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010ß\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010à\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010á\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010â\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010ã\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010ä\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010å\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010æ\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010ç\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010è\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010é\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010ê\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010ë\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010ì\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010í\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010î\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010ï\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010ð\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010ñ\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010ò\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010ó\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010ô\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010õ\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010ö\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010÷\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010ø\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010ù\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010ú\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010û\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010ü\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010ý\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010þ\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010ÿ\u0002\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0080\u0003\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0081\u0003\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0082\u0003\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0083\u0003\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0084\u0003\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0085\u0003\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0086\u0003\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0087\u0003\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0088\u0003\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0089\u0003\u001a\u00020\u0005HÆ\u0003J\n\u0010\u008a\u0003\u001a\u00020\u0005HÆ\u0003J\n\u0010\u008b\u0003\u001a\u00020\u0005HÆ\u0003J\n\u0010\u008c\u0003\u001a\u00020\u0005HÆ\u0003J\n\u0010\u008d\u0003\u001a\u00020\u0005HÆ\u0003J\n\u0010\u008e\u0003\u001a\u00020\u0005HÆ\u0003J\n\u0010\u008f\u0003\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0090\u0003\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0091\u0003\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0092\u0003\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0093\u0003\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0094\u0003\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0095\u0003\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0096\u0003\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0097\u0003\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0098\u0003\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0099\u0003\u001a\u00020\u0005HÆ\u0003J\n\u0010\u009a\u0003\u001a\u00020\u0005HÆ\u0003J\n\u0010\u009b\u0003\u001a\u00020\u0005HÆ\u0003J\n\u0010\u009c\u0003\u001a\u00020\u0005HÆ\u0003Jü\u0007\u0010\u009d\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020\u00052\b\b\u0002\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\u00052\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010%\u001a\u00020\u00052\b\b\u0002\u0010&\u001a\u00020\u00052\b\b\u0002\u0010'\u001a\u00020\u00052\b\b\u0002\u0010(\u001a\u00020\u00052\b\b\u0002\u0010)\u001a\u00020\u00052\b\b\u0002\u0010*\u001a\u00020\u00052\b\b\u0002\u0010+\u001a\u00020\u00052\b\b\u0002\u0010,\u001a\u00020\u00052\b\b\u0002\u0010-\u001a\u00020\u00052\b\b\u0002\u0010.\u001a\u00020\u00052\b\b\u0002\u0010/\u001a\u00020\u00052\b\b\u0002\u00100\u001a\u00020\u00052\b\b\u0002\u00101\u001a\u00020\u00052\b\b\u0002\u00102\u001a\u00020\u00052\b\b\u0002\u00103\u001a\u00020\u00052\b\b\u0002\u00104\u001a\u00020\u00052\b\b\u0002\u00105\u001a\u00020\u00052\b\b\u0002\u00106\u001a\u00020\u00052\b\b\u0002\u00107\u001a\u00020\u00052\b\b\u0002\u00108\u001a\u00020\u00052\b\b\u0002\u00109\u001a\u00020\u00052\b\b\u0002\u0010:\u001a\u00020\u00052\b\b\u0002\u0010;\u001a\u00020\u00052\b\b\u0002\u0010<\u001a\u00020\u00052\b\b\u0002\u0010=\u001a\u00020\u00052\b\b\u0002\u0010>\u001a\u00020\u00052\b\b\u0002\u0010?\u001a\u00020\u00052\b\b\u0002\u0010@\u001a\u00020\u00052\b\b\u0002\u0010A\u001a\u00020\u00052\b\b\u0002\u0010B\u001a\u00020\u00052\b\b\u0002\u0010C\u001a\u00020\u00052\b\b\u0002\u0010D\u001a\u00020\u00052\b\b\u0002\u0010E\u001a\u00020\u00052\b\b\u0002\u0010F\u001a\u00020\u00052\b\b\u0002\u0010G\u001a\u00020\u00052\b\b\u0002\u0010H\u001a\u00020\u00052\b\b\u0002\u0010I\u001a\u00020\u00052\b\b\u0002\u0010J\u001a\u00020\u00052\b\b\u0002\u0010K\u001a\u00020\u00052\b\b\u0002\u0010L\u001a\u00020\u00052\b\b\u0002\u0010M\u001a\u00020\u00052\b\b\u0002\u0010N\u001a\u00020\u00052\b\b\u0002\u0010O\u001a\u00020\u00052\b\b\u0002\u0010P\u001a\u00020\u00052\b\b\u0002\u0010Q\u001a\u00020\u00052\b\b\u0002\u0010R\u001a\u00020\u00052\b\b\u0002\u0010S\u001a\u00020\u00052\b\b\u0002\u0010T\u001a\u00020\u00052\b\b\u0002\u0010U\u001a\u00020\u00052\b\b\u0002\u0010V\u001a\u00020\u00052\b\b\u0002\u0010W\u001a\u00020\u00052\b\b\u0002\u0010X\u001a\u00020\u00052\b\b\u0002\u0010Y\u001a\u00020\u00052\b\b\u0002\u0010Z\u001a\u00020\u00052\b\b\u0002\u0010[\u001a\u00020\u00052\b\b\u0002\u0010\\\u001a\u00020\u00052\b\b\u0002\u0010]\u001a\u00020\u00052\b\b\u0002\u0010^\u001a\u00020\u00052\b\b\u0002\u0010_\u001a\u00020\u00052\b\b\u0002\u0010`\u001a\u00020\u00052\b\b\u0002\u0010a\u001a\u00020\u00052\b\b\u0002\u0010b\u001a\u00020\u00052\b\b\u0002\u0010c\u001a\u00020\u00052\b\b\u0002\u0010d\u001a\u00020\u00052\b\b\u0002\u0010e\u001a\u00020\u00052\b\b\u0002\u0010f\u001a\u00020\u00052\b\b\u0002\u0010g\u001a\u00020\u00052\b\b\u0002\u0010h\u001a\u00020\u0005HÆ\u0001J\u0016\u0010\u009e\u0003\u001a\u00030\u009f\u00032\t\u0010 \u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010¡\u0003\u001a\u00030¢\u0003HÖ\u0001J\n\u0010£\u0003\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010o\"\u0004\bs\u0010qR\u001a\u0010h\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010o\"\u0004\bu\u0010qR\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010o\"\u0004\bw\u0010qR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u0010o\"\u0004\by\u0010qR\u001a\u0010\u0011\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010o\"\u0004\b{\u0010qR\u001a\u0010\u0012\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b|\u0010o\"\u0004\b}\u0010qR\u001a\u0010\u0013\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b~\u0010o\"\u0004\b\u007f\u0010qR\u001c\u0010\u0014\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010o\"\u0005\b\u0081\u0001\u0010qR\u001c\u0010\u0015\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u0010o\"\u0005\b\u0083\u0001\u0010qR\u001c\u0010\u0016\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010o\"\u0005\b\u0085\u0001\u0010qR\u001c\u0010\u0017\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0001\u0010o\"\u0005\b\u0087\u0001\u0010qR\u001c\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0088\u0001\u0010o\"\u0005\b\u0089\u0001\u0010qR\u001c\u0010\u0018\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0001\u0010o\"\u0005\b\u008b\u0001\u0010qR\u001c\u0010\u0019\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008c\u0001\u0010o\"\u0005\b\u008d\u0001\u0010qR\u001c\u0010\u001a\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008e\u0001\u0010o\"\u0005\b\u008f\u0001\u0010qR\u001c\u0010\u001b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0090\u0001\u0010o\"\u0005\b\u0091\u0001\u0010qR\u001c\u0010\u001c\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0092\u0001\u0010o\"\u0005\b\u0093\u0001\u0010qR\u001c\u0010\u001d\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0094\u0001\u0010o\"\u0005\b\u0095\u0001\u0010qR\u001c\u0010\u001e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0096\u0001\u0010o\"\u0005\b\u0097\u0001\u0010qR\u001c\u0010\u001f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0098\u0001\u0010o\"\u0005\b\u0099\u0001\u0010qR\u001c\u0010 \u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009a\u0001\u0010o\"\u0005\b\u009b\u0001\u0010qR\u001c\u0010!\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009c\u0001\u0010o\"\u0005\b\u009d\u0001\u0010qR\u001c\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009e\u0001\u0010o\"\u0005\b\u009f\u0001\u0010qR\u001c\u0010\"\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b \u0001\u0010o\"\u0005\b¡\u0001\u0010qR\u001c\u0010#\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¢\u0001\u0010o\"\u0005\b£\u0001\u0010qR\u001c\u0010$\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¤\u0001\u0010o\"\u0005\b¥\u0001\u0010qR\u001c\u0010%\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¦\u0001\u0010o\"\u0005\b§\u0001\u0010qR\u001c\u0010&\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¨\u0001\u0010o\"\u0005\b©\u0001\u0010qR\u001c\u0010'\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bª\u0001\u0010o\"\u0005\b«\u0001\u0010qR\u001c\u0010(\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¬\u0001\u0010o\"\u0005\b\u00ad\u0001\u0010qR\u001c\u0010)\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b®\u0001\u0010o\"\u0005\b¯\u0001\u0010qR\u001c\u0010*\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b°\u0001\u0010o\"\u0005\b±\u0001\u0010qR\u001c\u0010+\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b²\u0001\u0010o\"\u0005\b³\u0001\u0010qR\u001c\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b´\u0001\u0010o\"\u0005\bµ\u0001\u0010qR\u001c\u0010,\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¶\u0001\u0010o\"\u0005\b·\u0001\u0010qR\u001c\u0010-\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¸\u0001\u0010o\"\u0005\b¹\u0001\u0010qR\u001c\u0010.\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bº\u0001\u0010o\"\u0005\b»\u0001\u0010qR\u001c\u0010/\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¼\u0001\u0010o\"\u0005\b½\u0001\u0010qR\u001c\u00100\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¾\u0001\u0010o\"\u0005\b¿\u0001\u0010qR\u001c\u00101\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÀ\u0001\u0010o\"\u0005\bÁ\u0001\u0010qR\u001c\u00102\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÂ\u0001\u0010o\"\u0005\bÃ\u0001\u0010qR\u001c\u00103\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÄ\u0001\u0010o\"\u0005\bÅ\u0001\u0010qR\u001c\u00104\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÆ\u0001\u0010o\"\u0005\bÇ\u0001\u0010qR\u001c\u00105\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÈ\u0001\u0010o\"\u0005\bÉ\u0001\u0010qR\u001c\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÊ\u0001\u0010o\"\u0005\bË\u0001\u0010qR\u001c\u00106\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÌ\u0001\u0010o\"\u0005\bÍ\u0001\u0010qR\u001c\u00107\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÎ\u0001\u0010o\"\u0005\bÏ\u0001\u0010qR\u001c\u00108\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÐ\u0001\u0010o\"\u0005\bÑ\u0001\u0010qR\u001c\u00109\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÒ\u0001\u0010o\"\u0005\bÓ\u0001\u0010qR\u001c\u0010:\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÔ\u0001\u0010o\"\u0005\bÕ\u0001\u0010qR\u001c\u0010;\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÖ\u0001\u0010o\"\u0005\b×\u0001\u0010qR\u001c\u0010<\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bØ\u0001\u0010o\"\u0005\bÙ\u0001\u0010qR\u001c\u0010=\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÚ\u0001\u0010o\"\u0005\bÛ\u0001\u0010qR\u001c\u0010>\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÜ\u0001\u0010o\"\u0005\bÝ\u0001\u0010qR\u001c\u0010?\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÞ\u0001\u0010o\"\u0005\bß\u0001\u0010qR\u001c\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bà\u0001\u0010o\"\u0005\bá\u0001\u0010qR\u001c\u0010@\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bâ\u0001\u0010o\"\u0005\bã\u0001\u0010qR\u001c\u0010A\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bä\u0001\u0010o\"\u0005\bå\u0001\u0010qR\u001c\u0010B\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bæ\u0001\u0010o\"\u0005\bç\u0001\u0010qR\u001c\u0010C\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bè\u0001\u0010o\"\u0005\bé\u0001\u0010qR\u001c\u0010D\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bê\u0001\u0010o\"\u0005\bë\u0001\u0010qR\u001c\u0010E\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bì\u0001\u0010o\"\u0005\bí\u0001\u0010qR\u001c\u0010F\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bî\u0001\u0010o\"\u0005\bï\u0001\u0010qR\u001c\u0010G\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bð\u0001\u0010o\"\u0005\bñ\u0001\u0010qR\u001c\u0010H\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bò\u0001\u0010o\"\u0005\bó\u0001\u0010qR\u001c\u0010I\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bô\u0001\u0010o\"\u0005\bõ\u0001\u0010qR\u001c\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bö\u0001\u0010o\"\u0005\b÷\u0001\u0010qR\u001c\u0010J\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bø\u0001\u0010o\"\u0005\bù\u0001\u0010qR\u001c\u0010K\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bú\u0001\u0010o\"\u0005\bû\u0001\u0010qR\u001c\u0010L\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bü\u0001\u0010o\"\u0005\bý\u0001\u0010qR\u001c\u0010M\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bþ\u0001\u0010o\"\u0005\bÿ\u0001\u0010qR\u001c\u0010N\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0002\u0010o\"\u0005\b\u0081\u0002\u0010qR\u001c\u0010O\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0002\u0010o\"\u0005\b\u0083\u0002\u0010qR\u001c\u0010P\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0002\u0010o\"\u0005\b\u0085\u0002\u0010qR\u001c\u0010Q\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0002\u0010o\"\u0005\b\u0087\u0002\u0010qR\u001c\u0010R\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0088\u0002\u0010o\"\u0005\b\u0089\u0002\u0010qR\u001c\u0010S\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0002\u0010o\"\u0005\b\u008b\u0002\u0010qR\u001c\u0010\f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008c\u0002\u0010o\"\u0005\b\u008d\u0002\u0010qR\u001c\u0010T\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008e\u0002\u0010o\"\u0005\b\u008f\u0002\u0010qR\u001c\u0010U\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0090\u0002\u0010o\"\u0005\b\u0091\u0002\u0010qR\u001c\u0010V\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0092\u0002\u0010o\"\u0005\b\u0093\u0002\u0010qR\u001c\u0010W\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0094\u0002\u0010o\"\u0005\b\u0095\u0002\u0010qR\u001c\u0010X\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0096\u0002\u0010o\"\u0005\b\u0097\u0002\u0010qR\u001c\u0010Y\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0098\u0002\u0010o\"\u0005\b\u0099\u0002\u0010qR\u001c\u0010Z\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009a\u0002\u0010o\"\u0005\b\u009b\u0002\u0010qR\u001c\u0010[\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009c\u0002\u0010o\"\u0005\b\u009d\u0002\u0010qR\u001c\u0010\\\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009e\u0002\u0010o\"\u0005\b\u009f\u0002\u0010qR\u001c\u0010]\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b \u0002\u0010o\"\u0005\b¡\u0002\u0010qR\u001c\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¢\u0002\u0010o\"\u0005\b£\u0002\u0010qR\u001c\u0010^\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¤\u0002\u0010o\"\u0005\b¥\u0002\u0010qR\u001c\u0010_\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¦\u0002\u0010o\"\u0005\b§\u0002\u0010qR\u001c\u0010`\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¨\u0002\u0010o\"\u0005\b©\u0002\u0010qR\u001c\u0010a\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bª\u0002\u0010o\"\u0005\b«\u0002\u0010qR\u001c\u0010b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¬\u0002\u0010o\"\u0005\b\u00ad\u0002\u0010qR\u001c\u0010c\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b®\u0002\u0010o\"\u0005\b¯\u0002\u0010qR\u001c\u0010d\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b°\u0002\u0010o\"\u0005\b±\u0002\u0010qR\u001c\u0010e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b²\u0002\u0010o\"\u0005\b³\u0002\u0010qR\u001c\u0010f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b´\u0002\u0010o\"\u0005\bµ\u0002\u0010qR\u001c\u0010g\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¶\u0002\u0010o\"\u0005\b·\u0002\u0010q¨\u0006¥\u0003"}, d2 = {"Lcom/heytap/nearx/tangramconfig/bean/CoreEntity;", "", "_id", "", "data1", "", "data2", "data3", CoreEntity.DATA4, CoreEntity.DATA5, CoreEntity.DATA6, CoreEntity.DATA7, CoreEntity.DATA8, CoreEntity.DATA9, CoreEntity.DATA10, CoreEntity.DATA11, CoreEntity.DATA12, CoreEntity.DATA13, CoreEntity.DATA14, CoreEntity.DATA15, CoreEntity.DATA16, CoreEntity.DATA17, CoreEntity.DATA18, CoreEntity.DATA19, CoreEntity.DATA20, CoreEntity.DATA21, CoreEntity.DATA22, CoreEntity.DATA23, CoreEntity.DATA24, CoreEntity.DATA25, CoreEntity.DATA26, CoreEntity.DATA27, CoreEntity.DATA28, CoreEntity.DATA29, CoreEntity.DATA30, CoreEntity.DATA31, CoreEntity.DATA32, CoreEntity.DATA33, CoreEntity.DATA34, CoreEntity.DATA35, CoreEntity.DATA36, CoreEntity.DATA37, CoreEntity.DATA38, CoreEntity.DATA39, CoreEntity.DATA40, CoreEntity.DATA41, CoreEntity.DATA42, CoreEntity.DATA43, CoreEntity.DATA44, CoreEntity.DATA45, CoreEntity.DATA46, CoreEntity.DATA47, CoreEntity.DATA48, CoreEntity.DATA49, CoreEntity.DATA50, CoreEntity.DATA51, CoreEntity.DATA52, CoreEntity.DATA53, CoreEntity.DATA54, CoreEntity.DATA55, CoreEntity.DATA56, CoreEntity.DATA57, CoreEntity.DATA58, CoreEntity.DATA59, CoreEntity.DATA60, CoreEntity.DATA61, CoreEntity.DATA62, CoreEntity.DATA63, CoreEntity.DATA64, CoreEntity.DATA65, CoreEntity.DATA66, CoreEntity.DATA67, CoreEntity.DATA68, CoreEntity.DATA69, CoreEntity.DATA70, CoreEntity.DATA71, CoreEntity.DATA72, CoreEntity.DATA73, CoreEntity.DATA74, CoreEntity.DATA75, CoreEntity.DATA76, CoreEntity.DATA77, CoreEntity.DATA78, CoreEntity.DATA79, CoreEntity.DATA80, CoreEntity.DATA81, CoreEntity.DATA82, CoreEntity.DATA83, CoreEntity.DATA84, CoreEntity.DATA85, CoreEntity.DATA86, CoreEntity.DATA87, CoreEntity.DATA88, CoreEntity.DATA89, CoreEntity.DATA90, CoreEntity.DATA91, CoreEntity.DATA92, CoreEntity.DATA93, CoreEntity.DATA94, CoreEntity.DATA95, CoreEntity.DATA96, CoreEntity.DATA97, CoreEntity.DATA98, CoreEntity.DATA99, CoreEntity.DATA100, "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "get_id", "()J", "set_id", "(J)V", "getData1", "()Ljava/lang/String;", "setData1", "(Ljava/lang/String;)V", "getData10", "setData10", "getData100", "setData100", "getData11", "setData11", "getData12", "setData12", "getData13", "setData13", "getData14", "setData14", "getData15", "setData15", "getData16", "setData16", "getData17", "setData17", "getData18", "setData18", "getData19", "setData19", "getData2", "setData2", "getData20", "setData20", "getData21", "setData21", "getData22", "setData22", "getData23", "setData23", "getData24", "setData24", "getData25", "setData25", "getData26", "setData26", "getData27", "setData27", "getData28", "setData28", "getData29", "setData29", "getData3", "setData3", "getData30", "setData30", "getData31", "setData31", "getData32", "setData32", "getData33", "setData33", "getData34", "setData34", "getData35", "setData35", "getData36", "setData36", "getData37", "setData37", "getData38", "setData38", "getData39", "setData39", "getData4", "setData4", "getData40", "setData40", "getData41", "setData41", "getData42", "setData42", "getData43", "setData43", "getData44", "setData44", "getData45", "setData45", "getData46", "setData46", "getData47", "setData47", "getData48", "setData48", "getData49", "setData49", "getData5", "setData5", "getData50", "setData50", "getData51", "setData51", "getData52", "setData52", "getData53", "setData53", "getData54", "setData54", "getData55", "setData55", "getData56", "setData56", "getData57", "setData57", "getData58", "setData58", "getData59", "setData59", "getData6", "setData6", "getData60", "setData60", "getData61", "setData61", "getData62", "setData62", "getData63", "setData63", "getData64", "setData64", "getData65", "setData65", "getData66", "setData66", "getData67", "setData67", "getData68", "setData68", "getData69", "setData69", "getData7", "setData7", "getData70", "setData70", "getData71", "setData71", "getData72", "setData72", "getData73", "setData73", "getData74", "setData74", "getData75", "setData75", "getData76", "setData76", "getData77", "setData77", "getData78", "setData78", "getData79", "setData79", "getData8", "setData8", "getData80", "setData80", "getData81", "setData81", "getData82", "setData82", "getData83", "setData83", "getData84", "setData84", "getData85", "setData85", "getData86", "setData86", "getData87", "setData87", "getData88", "setData88", "getData89", "setData89", "getData9", "setData9", "getData90", "setData90", "getData91", "setData91", "getData92", "setData92", "getData93", "setData93", "getData94", "setData94", "getData95", "setData95", "getData96", "setData96", "getData97", "setData97", "getData98", "setData98", "getData99", "setData99", "component1", "component10", "component100", "component101", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "component68", "component69", "component7", "component70", "component71", "component72", "component73", "component74", "component75", "component76", "component77", "component78", "component79", "component8", "component80", "component81", "component82", "component83", "component84", "component85", "component86", "component87", "component88", "component89", "component9", "component90", "component91", "component92", "component93", "component94", "component95", "component96", "component97", "component98", "component99", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class CoreEntity {

    @NotNull
    public static final String DATA1 = "data1";

    @NotNull
    public static final String DATA10 = "data10";

    @NotNull
    public static final String DATA100 = "data100";

    @NotNull
    public static final String DATA11 = "data11";

    @NotNull
    public static final String DATA12 = "data12";

    @NotNull
    public static final String DATA13 = "data13";

    @NotNull
    public static final String DATA14 = "data14";

    @NotNull
    public static final String DATA15 = "data15";

    @NotNull
    public static final String DATA16 = "data16";

    @NotNull
    public static final String DATA17 = "data17";

    @NotNull
    public static final String DATA18 = "data18";

    @NotNull
    public static final String DATA19 = "data19";

    @NotNull
    public static final String DATA2 = "data2";

    @NotNull
    public static final String DATA20 = "data20";

    @NotNull
    public static final String DATA21 = "data21";

    @NotNull
    public static final String DATA22 = "data22";

    @NotNull
    public static final String DATA23 = "data23";

    @NotNull
    public static final String DATA24 = "data24";

    @NotNull
    public static final String DATA25 = "data25";

    @NotNull
    public static final String DATA26 = "data26";

    @NotNull
    public static final String DATA27 = "data27";

    @NotNull
    public static final String DATA28 = "data28";

    @NotNull
    public static final String DATA29 = "data29";

    @NotNull
    public static final String DATA3 = "data3";

    @NotNull
    public static final String DATA30 = "data30";

    @NotNull
    public static final String DATA31 = "data31";

    @NotNull
    public static final String DATA32 = "data32";

    @NotNull
    public static final String DATA33 = "data33";

    @NotNull
    public static final String DATA34 = "data34";

    @NotNull
    public static final String DATA35 = "data35";

    @NotNull
    public static final String DATA36 = "data36";

    @NotNull
    public static final String DATA37 = "data37";

    @NotNull
    public static final String DATA38 = "data38";

    @NotNull
    public static final String DATA39 = "data39";

    @NotNull
    public static final String DATA4 = "data4";

    @NotNull
    public static final String DATA40 = "data40";

    @NotNull
    public static final String DATA41 = "data41";

    @NotNull
    public static final String DATA42 = "data42";

    @NotNull
    public static final String DATA43 = "data43";

    @NotNull
    public static final String DATA44 = "data44";

    @NotNull
    public static final String DATA45 = "data45";

    @NotNull
    public static final String DATA46 = "data46";

    @NotNull
    public static final String DATA47 = "data47";

    @NotNull
    public static final String DATA48 = "data48";

    @NotNull
    public static final String DATA49 = "data49";

    @NotNull
    public static final String DATA5 = "data5";

    @NotNull
    public static final String DATA50 = "data50";

    @NotNull
    public static final String DATA51 = "data51";

    @NotNull
    public static final String DATA52 = "data52";

    @NotNull
    public static final String DATA53 = "data53";

    @NotNull
    public static final String DATA54 = "data54";

    @NotNull
    public static final String DATA55 = "data55";

    @NotNull
    public static final String DATA56 = "data56";

    @NotNull
    public static final String DATA57 = "data57";

    @NotNull
    public static final String DATA58 = "data58";

    @NotNull
    public static final String DATA59 = "data59";

    @NotNull
    public static final String DATA6 = "data6";

    @NotNull
    public static final String DATA60 = "data60";

    @NotNull
    public static final String DATA61 = "data61";

    @NotNull
    public static final String DATA62 = "data62";

    @NotNull
    public static final String DATA63 = "data63";

    @NotNull
    public static final String DATA64 = "data64";

    @NotNull
    public static final String DATA65 = "data65";

    @NotNull
    public static final String DATA66 = "data66";

    @NotNull
    public static final String DATA67 = "data67";

    @NotNull
    public static final String DATA68 = "data68";

    @NotNull
    public static final String DATA69 = "data69";

    @NotNull
    public static final String DATA7 = "data7";

    @NotNull
    public static final String DATA70 = "data70";

    @NotNull
    public static final String DATA71 = "data71";

    @NotNull
    public static final String DATA72 = "data72";

    @NotNull
    public static final String DATA73 = "data73";

    @NotNull
    public static final String DATA74 = "data74";

    @NotNull
    public static final String DATA75 = "data75";

    @NotNull
    public static final String DATA76 = "data76";

    @NotNull
    public static final String DATA77 = "data77";

    @NotNull
    public static final String DATA78 = "data78";

    @NotNull
    public static final String DATA79 = "data79";

    @NotNull
    public static final String DATA8 = "data8";

    @NotNull
    public static final String DATA80 = "data80";

    @NotNull
    public static final String DATA81 = "data81";

    @NotNull
    public static final String DATA82 = "data82";

    @NotNull
    public static final String DATA83 = "data83";

    @NotNull
    public static final String DATA84 = "data84";

    @NotNull
    public static final String DATA85 = "data85";

    @NotNull
    public static final String DATA86 = "data86";

    @NotNull
    public static final String DATA87 = "data87";

    @NotNull
    public static final String DATA88 = "data88";

    @NotNull
    public static final String DATA89 = "data89";

    @NotNull
    public static final String DATA9 = "data9";

    @NotNull
    public static final String DATA90 = "data90";

    @NotNull
    public static final String DATA91 = "data91";

    @NotNull
    public static final String DATA92 = "data92";

    @NotNull
    public static final String DATA93 = "data93";

    @NotNull
    public static final String DATA94 = "data94";

    @NotNull
    public static final String DATA95 = "data95";

    @NotNull
    public static final String DATA96 = "data96";

    @NotNull
    public static final String DATA97 = "data97";

    @NotNull
    public static final String DATA98 = "data98";

    @NotNull
    public static final String DATA99 = "data99";

    @NotNull
    public static final String ID = "_id";

    @NotNull
    public static final String TABLE = "hey_config";
    private long _id;

    @NotNull
    private String data1;

    @NotNull
    private String data10;

    @NotNull
    private String data100;

    @NotNull
    private String data11;

    @NotNull
    private String data12;

    @NotNull
    private String data13;

    @NotNull
    private String data14;

    @NotNull
    private String data15;

    @NotNull
    private String data16;

    @NotNull
    private String data17;

    @NotNull
    private String data18;

    @NotNull
    private String data19;

    @NotNull
    private String data2;

    @NotNull
    private String data20;

    @NotNull
    private String data21;

    @NotNull
    private String data22;

    @NotNull
    private String data23;

    @NotNull
    private String data24;

    @NotNull
    private String data25;

    @NotNull
    private String data26;

    @NotNull
    private String data27;

    @NotNull
    private String data28;

    @NotNull
    private String data29;

    @NotNull
    private String data3;

    @NotNull
    private String data30;

    @NotNull
    private String data31;

    @NotNull
    private String data32;

    @NotNull
    private String data33;

    @NotNull
    private String data34;

    @NotNull
    private String data35;

    @NotNull
    private String data36;

    @NotNull
    private String data37;

    @NotNull
    private String data38;

    @NotNull
    private String data39;

    @NotNull
    private String data4;

    @NotNull
    private String data40;

    @NotNull
    private String data41;

    @NotNull
    private String data42;

    @NotNull
    private String data43;

    @NotNull
    private String data44;

    @NotNull
    private String data45;

    @NotNull
    private String data46;

    @NotNull
    private String data47;

    @NotNull
    private String data48;

    @NotNull
    private String data49;

    @NotNull
    private String data5;

    @NotNull
    private String data50;

    @NotNull
    private String data51;

    @NotNull
    private String data52;

    @NotNull
    private String data53;

    @NotNull
    private String data54;

    @NotNull
    private String data55;

    @NotNull
    private String data56;

    @NotNull
    private String data57;

    @NotNull
    private String data58;

    @NotNull
    private String data59;

    @NotNull
    private String data6;

    @NotNull
    private String data60;

    @NotNull
    private String data61;

    @NotNull
    private String data62;

    @NotNull
    private String data63;

    @NotNull
    private String data64;

    @NotNull
    private String data65;

    @NotNull
    private String data66;

    @NotNull
    private String data67;

    @NotNull
    private String data68;

    @NotNull
    private String data69;

    @NotNull
    private String data7;

    @NotNull
    private String data70;

    @NotNull
    private String data71;

    @NotNull
    private String data72;

    @NotNull
    private String data73;

    @NotNull
    private String data74;

    @NotNull
    private String data75;

    @NotNull
    private String data76;

    @NotNull
    private String data77;

    @NotNull
    private String data78;

    @NotNull
    private String data79;

    @NotNull
    private String data8;

    @NotNull
    private String data80;

    @NotNull
    private String data81;

    @NotNull
    private String data82;

    @NotNull
    private String data83;

    @NotNull
    private String data84;

    @NotNull
    private String data85;

    @NotNull
    private String data86;

    @NotNull
    private String data87;

    @NotNull
    private String data88;

    @NotNull
    private String data89;

    @NotNull
    private String data9;

    @NotNull
    private String data90;

    @NotNull
    private String data91;

    @NotNull
    private String data92;

    @NotNull
    private String data93;

    @NotNull
    private String data94;

    @NotNull
    private String data95;

    @NotNull
    private String data96;

    @NotNull
    private String data97;

    @NotNull
    private String data98;

    @NotNull
    private String data99;

    public CoreEntity() {
        this(0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, 31, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long get_id() {
        return this._id;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getData9() {
        return this.data9;
    }

    @NotNull
    /* JADX INFO: renamed from: component100, reason: from getter */
    public final String getData99() {
        return this.data99;
    }

    @NotNull
    /* JADX INFO: renamed from: component101, reason: from getter */
    public final String getData100() {
        return this.data100;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getData10() {
        return this.data10;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getData11() {
        return this.data11;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getData12() {
        return this.data12;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getData13() {
        return this.data13;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getData14() {
        return this.data14;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getData15() {
        return this.data15;
    }

    @NotNull
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getData16() {
        return this.data16;
    }

    @NotNull
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getData17() {
        return this.data17;
    }

    @NotNull
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getData18() {
        return this.data18;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getData1() {
        return this.data1;
    }

    @NotNull
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getData19() {
        return this.data19;
    }

    @NotNull
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getData20() {
        return this.data20;
    }

    @NotNull
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getData21() {
        return this.data21;
    }

    @NotNull
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getData22() {
        return this.data22;
    }

    @NotNull
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getData23() {
        return this.data23;
    }

    @NotNull
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getData24() {
        return this.data24;
    }

    @NotNull
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getData25() {
        return this.data25;
    }

    @NotNull
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getData26() {
        return this.data26;
    }

    @NotNull
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getData27() {
        return this.data27;
    }

    @NotNull
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getData28() {
        return this.data28;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getData2() {
        return this.data2;
    }

    @NotNull
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getData29() {
        return this.data29;
    }

    @NotNull
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getData30() {
        return this.data30;
    }

    @NotNull
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getData31() {
        return this.data31;
    }

    @NotNull
    /* JADX INFO: renamed from: component33, reason: from getter */
    public final String getData32() {
        return this.data32;
    }

    @NotNull
    /* JADX INFO: renamed from: component34, reason: from getter */
    public final String getData33() {
        return this.data33;
    }

    @NotNull
    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getData34() {
        return this.data34;
    }

    @NotNull
    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getData35() {
        return this.data35;
    }

    @NotNull
    /* JADX INFO: renamed from: component37, reason: from getter */
    public final String getData36() {
        return this.data36;
    }

    @NotNull
    /* JADX INFO: renamed from: component38, reason: from getter */
    public final String getData37() {
        return this.data37;
    }

    @NotNull
    /* JADX INFO: renamed from: component39, reason: from getter */
    public final String getData38() {
        return this.data38;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getData3() {
        return this.data3;
    }

    @NotNull
    /* JADX INFO: renamed from: component40, reason: from getter */
    public final String getData39() {
        return this.data39;
    }

    @NotNull
    /* JADX INFO: renamed from: component41, reason: from getter */
    public final String getData40() {
        return this.data40;
    }

    @NotNull
    /* JADX INFO: renamed from: component42, reason: from getter */
    public final String getData41() {
        return this.data41;
    }

    @NotNull
    /* JADX INFO: renamed from: component43, reason: from getter */
    public final String getData42() {
        return this.data42;
    }

    @NotNull
    /* JADX INFO: renamed from: component44, reason: from getter */
    public final String getData43() {
        return this.data43;
    }

    @NotNull
    /* JADX INFO: renamed from: component45, reason: from getter */
    public final String getData44() {
        return this.data44;
    }

    @NotNull
    /* JADX INFO: renamed from: component46, reason: from getter */
    public final String getData45() {
        return this.data45;
    }

    @NotNull
    /* JADX INFO: renamed from: component47, reason: from getter */
    public final String getData46() {
        return this.data46;
    }

    @NotNull
    /* JADX INFO: renamed from: component48, reason: from getter */
    public final String getData47() {
        return this.data47;
    }

    @NotNull
    /* JADX INFO: renamed from: component49, reason: from getter */
    public final String getData48() {
        return this.data48;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getData4() {
        return this.data4;
    }

    @NotNull
    /* JADX INFO: renamed from: component50, reason: from getter */
    public final String getData49() {
        return this.data49;
    }

    @NotNull
    /* JADX INFO: renamed from: component51, reason: from getter */
    public final String getData50() {
        return this.data50;
    }

    @NotNull
    /* JADX INFO: renamed from: component52, reason: from getter */
    public final String getData51() {
        return this.data51;
    }

    @NotNull
    /* JADX INFO: renamed from: component53, reason: from getter */
    public final String getData52() {
        return this.data52;
    }

    @NotNull
    /* JADX INFO: renamed from: component54, reason: from getter */
    public final String getData53() {
        return this.data53;
    }

    @NotNull
    /* JADX INFO: renamed from: component55, reason: from getter */
    public final String getData54() {
        return this.data54;
    }

    @NotNull
    /* JADX INFO: renamed from: component56, reason: from getter */
    public final String getData55() {
        return this.data55;
    }

    @NotNull
    /* JADX INFO: renamed from: component57, reason: from getter */
    public final String getData56() {
        return this.data56;
    }

    @NotNull
    /* JADX INFO: renamed from: component58, reason: from getter */
    public final String getData57() {
        return this.data57;
    }

    @NotNull
    /* JADX INFO: renamed from: component59, reason: from getter */
    public final String getData58() {
        return this.data58;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getData5() {
        return this.data5;
    }

    @NotNull
    /* JADX INFO: renamed from: component60, reason: from getter */
    public final String getData59() {
        return this.data59;
    }

    @NotNull
    /* JADX INFO: renamed from: component61, reason: from getter */
    public final String getData60() {
        return this.data60;
    }

    @NotNull
    /* JADX INFO: renamed from: component62, reason: from getter */
    public final String getData61() {
        return this.data61;
    }

    @NotNull
    /* JADX INFO: renamed from: component63, reason: from getter */
    public final String getData62() {
        return this.data62;
    }

    @NotNull
    /* JADX INFO: renamed from: component64, reason: from getter */
    public final String getData63() {
        return this.data63;
    }

    @NotNull
    /* JADX INFO: renamed from: component65, reason: from getter */
    public final String getData64() {
        return this.data64;
    }

    @NotNull
    /* JADX INFO: renamed from: component66, reason: from getter */
    public final String getData65() {
        return this.data65;
    }

    @NotNull
    /* JADX INFO: renamed from: component67, reason: from getter */
    public final String getData66() {
        return this.data66;
    }

    @NotNull
    /* JADX INFO: renamed from: component68, reason: from getter */
    public final String getData67() {
        return this.data67;
    }

    @NotNull
    /* JADX INFO: renamed from: component69, reason: from getter */
    public final String getData68() {
        return this.data68;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getData6() {
        return this.data6;
    }

    @NotNull
    /* JADX INFO: renamed from: component70, reason: from getter */
    public final String getData69() {
        return this.data69;
    }

    @NotNull
    /* JADX INFO: renamed from: component71, reason: from getter */
    public final String getData70() {
        return this.data70;
    }

    @NotNull
    /* JADX INFO: renamed from: component72, reason: from getter */
    public final String getData71() {
        return this.data71;
    }

    @NotNull
    /* JADX INFO: renamed from: component73, reason: from getter */
    public final String getData72() {
        return this.data72;
    }

    @NotNull
    /* JADX INFO: renamed from: component74, reason: from getter */
    public final String getData73() {
        return this.data73;
    }

    @NotNull
    /* JADX INFO: renamed from: component75, reason: from getter */
    public final String getData74() {
        return this.data74;
    }

    @NotNull
    /* JADX INFO: renamed from: component76, reason: from getter */
    public final String getData75() {
        return this.data75;
    }

    @NotNull
    /* JADX INFO: renamed from: component77, reason: from getter */
    public final String getData76() {
        return this.data76;
    }

    @NotNull
    /* JADX INFO: renamed from: component78, reason: from getter */
    public final String getData77() {
        return this.data77;
    }

    @NotNull
    /* JADX INFO: renamed from: component79, reason: from getter */
    public final String getData78() {
        return this.data78;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getData7() {
        return this.data7;
    }

    @NotNull
    /* JADX INFO: renamed from: component80, reason: from getter */
    public final String getData79() {
        return this.data79;
    }

    @NotNull
    /* JADX INFO: renamed from: component81, reason: from getter */
    public final String getData80() {
        return this.data80;
    }

    @NotNull
    /* JADX INFO: renamed from: component82, reason: from getter */
    public final String getData81() {
        return this.data81;
    }

    @NotNull
    /* JADX INFO: renamed from: component83, reason: from getter */
    public final String getData82() {
        return this.data82;
    }

    @NotNull
    /* JADX INFO: renamed from: component84, reason: from getter */
    public final String getData83() {
        return this.data83;
    }

    @NotNull
    /* JADX INFO: renamed from: component85, reason: from getter */
    public final String getData84() {
        return this.data84;
    }

    @NotNull
    /* JADX INFO: renamed from: component86, reason: from getter */
    public final String getData85() {
        return this.data85;
    }

    @NotNull
    /* JADX INFO: renamed from: component87, reason: from getter */
    public final String getData86() {
        return this.data86;
    }

    @NotNull
    /* JADX INFO: renamed from: component88, reason: from getter */
    public final String getData87() {
        return this.data87;
    }

    @NotNull
    /* JADX INFO: renamed from: component89, reason: from getter */
    public final String getData88() {
        return this.data88;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getData8() {
        return this.data8;
    }

    @NotNull
    /* JADX INFO: renamed from: component90, reason: from getter */
    public final String getData89() {
        return this.data89;
    }

    @NotNull
    /* JADX INFO: renamed from: component91, reason: from getter */
    public final String getData90() {
        return this.data90;
    }

    @NotNull
    /* JADX INFO: renamed from: component92, reason: from getter */
    public final String getData91() {
        return this.data91;
    }

    @NotNull
    /* JADX INFO: renamed from: component93, reason: from getter */
    public final String getData92() {
        return this.data92;
    }

    @NotNull
    /* JADX INFO: renamed from: component94, reason: from getter */
    public final String getData93() {
        return this.data93;
    }

    @NotNull
    /* JADX INFO: renamed from: component95, reason: from getter */
    public final String getData94() {
        return this.data94;
    }

    @NotNull
    /* JADX INFO: renamed from: component96, reason: from getter */
    public final String getData95() {
        return this.data95;
    }

    @NotNull
    /* JADX INFO: renamed from: component97, reason: from getter */
    public final String getData96() {
        return this.data96;
    }

    @NotNull
    /* JADX INFO: renamed from: component98, reason: from getter */
    public final String getData97() {
        return this.data97;
    }

    @NotNull
    /* JADX INFO: renamed from: component99, reason: from getter */
    public final String getData98() {
        return this.data98;
    }

    @NotNull
    public final CoreEntity copy(long _id, @NotNull String data1, @NotNull String data2, @NotNull String data3, @NotNull String data4, @NotNull String data5, @NotNull String data6, @NotNull String data7, @NotNull String data8, @NotNull String data9, @NotNull String data10, @NotNull String data11, @NotNull String data12, @NotNull String data13, @NotNull String data14, @NotNull String data15, @NotNull String data16, @NotNull String data17, @NotNull String data18, @NotNull String data19, @NotNull String data20, @NotNull String data21, @NotNull String data22, @NotNull String data23, @NotNull String data24, @NotNull String data25, @NotNull String data26, @NotNull String data27, @NotNull String data28, @NotNull String data29, @NotNull String data30, @NotNull String data31, @NotNull String data32, @NotNull String data33, @NotNull String data34, @NotNull String data35, @NotNull String data36, @NotNull String data37, @NotNull String data38, @NotNull String data39, @NotNull String data40, @NotNull String data41, @NotNull String data42, @NotNull String data43, @NotNull String data44, @NotNull String data45, @NotNull String data46, @NotNull String data47, @NotNull String data48, @NotNull String data49, @NotNull String data50, @NotNull String data51, @NotNull String data52, @NotNull String data53, @NotNull String data54, @NotNull String data55, @NotNull String data56, @NotNull String data57, @NotNull String data58, @NotNull String data59, @NotNull String data60, @NotNull String data61, @NotNull String data62, @NotNull String data63, @NotNull String data64, @NotNull String data65, @NotNull String data66, @NotNull String data67, @NotNull String data68, @NotNull String data69, @NotNull String data70, @NotNull String data71, @NotNull String data72, @NotNull String data73, @NotNull String data74, @NotNull String data75, @NotNull String data76, @NotNull String data77, @NotNull String data78, @NotNull String data79, @NotNull String data80, @NotNull String data81, @NotNull String data82, @NotNull String data83, @NotNull String data84, @NotNull String data85, @NotNull String data86, @NotNull String data87, @NotNull String data88, @NotNull String data89, @NotNull String data90, @NotNull String data91, @NotNull String data92, @NotNull String data93, @NotNull String data94, @NotNull String data95, @NotNull String data96, @NotNull String data97, @NotNull String data98, @NotNull String data99, @NotNull String data100) {
        Intrinsics.checkNotNullParameter(data1, "data1");
        Intrinsics.checkNotNullParameter(data2, "data2");
        Intrinsics.checkNotNullParameter(data3, "data3");
        Intrinsics.checkNotNullParameter(data4, "data4");
        Intrinsics.checkNotNullParameter(data5, "data5");
        Intrinsics.checkNotNullParameter(data6, "data6");
        Intrinsics.checkNotNullParameter(data7, "data7");
        Intrinsics.checkNotNullParameter(data8, "data8");
        Intrinsics.checkNotNullParameter(data9, "data9");
        Intrinsics.checkNotNullParameter(data10, "data10");
        Intrinsics.checkNotNullParameter(data11, "data11");
        Intrinsics.checkNotNullParameter(data12, "data12");
        Intrinsics.checkNotNullParameter(data13, "data13");
        Intrinsics.checkNotNullParameter(data14, "data14");
        Intrinsics.checkNotNullParameter(data15, "data15");
        Intrinsics.checkNotNullParameter(data16, "data16");
        Intrinsics.checkNotNullParameter(data17, "data17");
        Intrinsics.checkNotNullParameter(data18, "data18");
        Intrinsics.checkNotNullParameter(data19, "data19");
        Intrinsics.checkNotNullParameter(data20, "data20");
        Intrinsics.checkNotNullParameter(data21, "data21");
        Intrinsics.checkNotNullParameter(data22, "data22");
        Intrinsics.checkNotNullParameter(data23, "data23");
        Intrinsics.checkNotNullParameter(data24, "data24");
        Intrinsics.checkNotNullParameter(data25, "data25");
        Intrinsics.checkNotNullParameter(data26, "data26");
        Intrinsics.checkNotNullParameter(data27, "data27");
        Intrinsics.checkNotNullParameter(data28, "data28");
        Intrinsics.checkNotNullParameter(data29, "data29");
        Intrinsics.checkNotNullParameter(data30, "data30");
        Intrinsics.checkNotNullParameter(data31, "data31");
        Intrinsics.checkNotNullParameter(data32, "data32");
        Intrinsics.checkNotNullParameter(data33, "data33");
        Intrinsics.checkNotNullParameter(data34, "data34");
        Intrinsics.checkNotNullParameter(data35, "data35");
        Intrinsics.checkNotNullParameter(data36, "data36");
        Intrinsics.checkNotNullParameter(data37, "data37");
        Intrinsics.checkNotNullParameter(data38, "data38");
        Intrinsics.checkNotNullParameter(data39, "data39");
        Intrinsics.checkNotNullParameter(data40, "data40");
        Intrinsics.checkNotNullParameter(data41, "data41");
        Intrinsics.checkNotNullParameter(data42, "data42");
        Intrinsics.checkNotNullParameter(data43, "data43");
        Intrinsics.checkNotNullParameter(data44, "data44");
        Intrinsics.checkNotNullParameter(data45, "data45");
        Intrinsics.checkNotNullParameter(data46, "data46");
        Intrinsics.checkNotNullParameter(data47, "data47");
        Intrinsics.checkNotNullParameter(data48, "data48");
        Intrinsics.checkNotNullParameter(data49, "data49");
        Intrinsics.checkNotNullParameter(data50, "data50");
        Intrinsics.checkNotNullParameter(data51, "data51");
        Intrinsics.checkNotNullParameter(data52, "data52");
        Intrinsics.checkNotNullParameter(data53, "data53");
        Intrinsics.checkNotNullParameter(data54, "data54");
        Intrinsics.checkNotNullParameter(data55, "data55");
        Intrinsics.checkNotNullParameter(data56, "data56");
        Intrinsics.checkNotNullParameter(data57, "data57");
        Intrinsics.checkNotNullParameter(data58, "data58");
        Intrinsics.checkNotNullParameter(data59, "data59");
        Intrinsics.checkNotNullParameter(data60, "data60");
        Intrinsics.checkNotNullParameter(data61, "data61");
        Intrinsics.checkNotNullParameter(data62, "data62");
        Intrinsics.checkNotNullParameter(data63, "data63");
        Intrinsics.checkNotNullParameter(data64, "data64");
        Intrinsics.checkNotNullParameter(data65, "data65");
        Intrinsics.checkNotNullParameter(data66, "data66");
        Intrinsics.checkNotNullParameter(data67, "data67");
        Intrinsics.checkNotNullParameter(data68, "data68");
        Intrinsics.checkNotNullParameter(data69, "data69");
        Intrinsics.checkNotNullParameter(data70, "data70");
        Intrinsics.checkNotNullParameter(data71, "data71");
        Intrinsics.checkNotNullParameter(data72, "data72");
        Intrinsics.checkNotNullParameter(data73, "data73");
        Intrinsics.checkNotNullParameter(data74, "data74");
        Intrinsics.checkNotNullParameter(data75, "data75");
        Intrinsics.checkNotNullParameter(data76, "data76");
        Intrinsics.checkNotNullParameter(data77, "data77");
        Intrinsics.checkNotNullParameter(data78, "data78");
        Intrinsics.checkNotNullParameter(data79, "data79");
        Intrinsics.checkNotNullParameter(data80, "data80");
        Intrinsics.checkNotNullParameter(data81, "data81");
        Intrinsics.checkNotNullParameter(data82, "data82");
        Intrinsics.checkNotNullParameter(data83, "data83");
        Intrinsics.checkNotNullParameter(data84, "data84");
        Intrinsics.checkNotNullParameter(data85, "data85");
        Intrinsics.checkNotNullParameter(data86, "data86");
        Intrinsics.checkNotNullParameter(data87, "data87");
        Intrinsics.checkNotNullParameter(data88, "data88");
        Intrinsics.checkNotNullParameter(data89, "data89");
        Intrinsics.checkNotNullParameter(data90, "data90");
        Intrinsics.checkNotNullParameter(data91, "data91");
        Intrinsics.checkNotNullParameter(data92, "data92");
        Intrinsics.checkNotNullParameter(data93, "data93");
        Intrinsics.checkNotNullParameter(data94, "data94");
        Intrinsics.checkNotNullParameter(data95, "data95");
        Intrinsics.checkNotNullParameter(data96, "data96");
        Intrinsics.checkNotNullParameter(data97, "data97");
        Intrinsics.checkNotNullParameter(data98, "data98");
        Intrinsics.checkNotNullParameter(data99, "data99");
        Intrinsics.checkNotNullParameter(data100, "data100");
        return new CoreEntity(_id, data1, data2, data3, data4, data5, data6, data7, data8, data9, data10, data11, data12, data13, data14, data15, data16, data17, data18, data19, data20, data21, data22, data23, data24, data25, data26, data27, data28, data29, data30, data31, data32, data33, data34, data35, data36, data37, data38, data39, data40, data41, data42, data43, data44, data45, data46, data47, data48, data49, data50, data51, data52, data53, data54, data55, data56, data57, data58, data59, data60, data61, data62, data63, data64, data65, data66, data67, data68, data69, data70, data71, data72, data73, data74, data75, data76, data77, data78, data79, data80, data81, data82, data83, data84, data85, data86, data87, data88, data89, data90, data91, data92, data93, data94, data95, data96, data97, data98, data99, data100);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoreEntity)) {
            return false;
        }
        CoreEntity coreEntity = (CoreEntity) other;
        return this._id == coreEntity._id && Intrinsics.areEqual(this.data1, coreEntity.data1) && Intrinsics.areEqual(this.data2, coreEntity.data2) && Intrinsics.areEqual(this.data3, coreEntity.data3) && Intrinsics.areEqual(this.data4, coreEntity.data4) && Intrinsics.areEqual(this.data5, coreEntity.data5) && Intrinsics.areEqual(this.data6, coreEntity.data6) && Intrinsics.areEqual(this.data7, coreEntity.data7) && Intrinsics.areEqual(this.data8, coreEntity.data8) && Intrinsics.areEqual(this.data9, coreEntity.data9) && Intrinsics.areEqual(this.data10, coreEntity.data10) && Intrinsics.areEqual(this.data11, coreEntity.data11) && Intrinsics.areEqual(this.data12, coreEntity.data12) && Intrinsics.areEqual(this.data13, coreEntity.data13) && Intrinsics.areEqual(this.data14, coreEntity.data14) && Intrinsics.areEqual(this.data15, coreEntity.data15) && Intrinsics.areEqual(this.data16, coreEntity.data16) && Intrinsics.areEqual(this.data17, coreEntity.data17) && Intrinsics.areEqual(this.data18, coreEntity.data18) && Intrinsics.areEqual(this.data19, coreEntity.data19) && Intrinsics.areEqual(this.data20, coreEntity.data20) && Intrinsics.areEqual(this.data21, coreEntity.data21) && Intrinsics.areEqual(this.data22, coreEntity.data22) && Intrinsics.areEqual(this.data23, coreEntity.data23) && Intrinsics.areEqual(this.data24, coreEntity.data24) && Intrinsics.areEqual(this.data25, coreEntity.data25) && Intrinsics.areEqual(this.data26, coreEntity.data26) && Intrinsics.areEqual(this.data27, coreEntity.data27) && Intrinsics.areEqual(this.data28, coreEntity.data28) && Intrinsics.areEqual(this.data29, coreEntity.data29) && Intrinsics.areEqual(this.data30, coreEntity.data30) && Intrinsics.areEqual(this.data31, coreEntity.data31) && Intrinsics.areEqual(this.data32, coreEntity.data32) && Intrinsics.areEqual(this.data33, coreEntity.data33) && Intrinsics.areEqual(this.data34, coreEntity.data34) && Intrinsics.areEqual(this.data35, coreEntity.data35) && Intrinsics.areEqual(this.data36, coreEntity.data36) && Intrinsics.areEqual(this.data37, coreEntity.data37) && Intrinsics.areEqual(this.data38, coreEntity.data38) && Intrinsics.areEqual(this.data39, coreEntity.data39) && Intrinsics.areEqual(this.data40, coreEntity.data40) && Intrinsics.areEqual(this.data41, coreEntity.data41) && Intrinsics.areEqual(this.data42, coreEntity.data42) && Intrinsics.areEqual(this.data43, coreEntity.data43) && Intrinsics.areEqual(this.data44, coreEntity.data44) && Intrinsics.areEqual(this.data45, coreEntity.data45) && Intrinsics.areEqual(this.data46, coreEntity.data46) && Intrinsics.areEqual(this.data47, coreEntity.data47) && Intrinsics.areEqual(this.data48, coreEntity.data48) && Intrinsics.areEqual(this.data49, coreEntity.data49) && Intrinsics.areEqual(this.data50, coreEntity.data50) && Intrinsics.areEqual(this.data51, coreEntity.data51) && Intrinsics.areEqual(this.data52, coreEntity.data52) && Intrinsics.areEqual(this.data53, coreEntity.data53) && Intrinsics.areEqual(this.data54, coreEntity.data54) && Intrinsics.areEqual(this.data55, coreEntity.data55) && Intrinsics.areEqual(this.data56, coreEntity.data56) && Intrinsics.areEqual(this.data57, coreEntity.data57) && Intrinsics.areEqual(this.data58, coreEntity.data58) && Intrinsics.areEqual(this.data59, coreEntity.data59) && Intrinsics.areEqual(this.data60, coreEntity.data60) && Intrinsics.areEqual(this.data61, coreEntity.data61) && Intrinsics.areEqual(this.data62, coreEntity.data62) && Intrinsics.areEqual(this.data63, coreEntity.data63) && Intrinsics.areEqual(this.data64, coreEntity.data64) && Intrinsics.areEqual(this.data65, coreEntity.data65) && Intrinsics.areEqual(this.data66, coreEntity.data66) && Intrinsics.areEqual(this.data67, coreEntity.data67) && Intrinsics.areEqual(this.data68, coreEntity.data68) && Intrinsics.areEqual(this.data69, coreEntity.data69) && Intrinsics.areEqual(this.data70, coreEntity.data70) && Intrinsics.areEqual(this.data71, coreEntity.data71) && Intrinsics.areEqual(this.data72, coreEntity.data72) && Intrinsics.areEqual(this.data73, coreEntity.data73) && Intrinsics.areEqual(this.data74, coreEntity.data74) && Intrinsics.areEqual(this.data75, coreEntity.data75) && Intrinsics.areEqual(this.data76, coreEntity.data76) && Intrinsics.areEqual(this.data77, coreEntity.data77) && Intrinsics.areEqual(this.data78, coreEntity.data78) && Intrinsics.areEqual(this.data79, coreEntity.data79) && Intrinsics.areEqual(this.data80, coreEntity.data80) && Intrinsics.areEqual(this.data81, coreEntity.data81) && Intrinsics.areEqual(this.data82, coreEntity.data82) && Intrinsics.areEqual(this.data83, coreEntity.data83) && Intrinsics.areEqual(this.data84, coreEntity.data84) && Intrinsics.areEqual(this.data85, coreEntity.data85) && Intrinsics.areEqual(this.data86, coreEntity.data86) && Intrinsics.areEqual(this.data87, coreEntity.data87) && Intrinsics.areEqual(this.data88, coreEntity.data88) && Intrinsics.areEqual(this.data89, coreEntity.data89) && Intrinsics.areEqual(this.data90, coreEntity.data90) && Intrinsics.areEqual(this.data91, coreEntity.data91) && Intrinsics.areEqual(this.data92, coreEntity.data92) && Intrinsics.areEqual(this.data93, coreEntity.data93) && Intrinsics.areEqual(this.data94, coreEntity.data94) && Intrinsics.areEqual(this.data95, coreEntity.data95) && Intrinsics.areEqual(this.data96, coreEntity.data96) && Intrinsics.areEqual(this.data97, coreEntity.data97) && Intrinsics.areEqual(this.data98, coreEntity.data98) && Intrinsics.areEqual(this.data99, coreEntity.data99) && Intrinsics.areEqual(this.data100, coreEntity.data100);
    }

    @NotNull
    public final String getData1() {
        return this.data1;
    }

    @NotNull
    public final String getData10() {
        return this.data10;
    }

    @NotNull
    public final String getData100() {
        return this.data100;
    }

    @NotNull
    public final String getData11() {
        return this.data11;
    }

    @NotNull
    public final String getData12() {
        return this.data12;
    }

    @NotNull
    public final String getData13() {
        return this.data13;
    }

    @NotNull
    public final String getData14() {
        return this.data14;
    }

    @NotNull
    public final String getData15() {
        return this.data15;
    }

    @NotNull
    public final String getData16() {
        return this.data16;
    }

    @NotNull
    public final String getData17() {
        return this.data17;
    }

    @NotNull
    public final String getData18() {
        return this.data18;
    }

    @NotNull
    public final String getData19() {
        return this.data19;
    }

    @NotNull
    public final String getData2() {
        return this.data2;
    }

    @NotNull
    public final String getData20() {
        return this.data20;
    }

    @NotNull
    public final String getData21() {
        return this.data21;
    }

    @NotNull
    public final String getData22() {
        return this.data22;
    }

    @NotNull
    public final String getData23() {
        return this.data23;
    }

    @NotNull
    public final String getData24() {
        return this.data24;
    }

    @NotNull
    public final String getData25() {
        return this.data25;
    }

    @NotNull
    public final String getData26() {
        return this.data26;
    }

    @NotNull
    public final String getData27() {
        return this.data27;
    }

    @NotNull
    public final String getData28() {
        return this.data28;
    }

    @NotNull
    public final String getData29() {
        return this.data29;
    }

    @NotNull
    public final String getData3() {
        return this.data3;
    }

    @NotNull
    public final String getData30() {
        return this.data30;
    }

    @NotNull
    public final String getData31() {
        return this.data31;
    }

    @NotNull
    public final String getData32() {
        return this.data32;
    }

    @NotNull
    public final String getData33() {
        return this.data33;
    }

    @NotNull
    public final String getData34() {
        return this.data34;
    }

    @NotNull
    public final String getData35() {
        return this.data35;
    }

    @NotNull
    public final String getData36() {
        return this.data36;
    }

    @NotNull
    public final String getData37() {
        return this.data37;
    }

    @NotNull
    public final String getData38() {
        return this.data38;
    }

    @NotNull
    public final String getData39() {
        return this.data39;
    }

    @NotNull
    public final String getData4() {
        return this.data4;
    }

    @NotNull
    public final String getData40() {
        return this.data40;
    }

    @NotNull
    public final String getData41() {
        return this.data41;
    }

    @NotNull
    public final String getData42() {
        return this.data42;
    }

    @NotNull
    public final String getData43() {
        return this.data43;
    }

    @NotNull
    public final String getData44() {
        return this.data44;
    }

    @NotNull
    public final String getData45() {
        return this.data45;
    }

    @NotNull
    public final String getData46() {
        return this.data46;
    }

    @NotNull
    public final String getData47() {
        return this.data47;
    }

    @NotNull
    public final String getData48() {
        return this.data48;
    }

    @NotNull
    public final String getData49() {
        return this.data49;
    }

    @NotNull
    public final String getData5() {
        return this.data5;
    }

    @NotNull
    public final String getData50() {
        return this.data50;
    }

    @NotNull
    public final String getData51() {
        return this.data51;
    }

    @NotNull
    public final String getData52() {
        return this.data52;
    }

    @NotNull
    public final String getData53() {
        return this.data53;
    }

    @NotNull
    public final String getData54() {
        return this.data54;
    }

    @NotNull
    public final String getData55() {
        return this.data55;
    }

    @NotNull
    public final String getData56() {
        return this.data56;
    }

    @NotNull
    public final String getData57() {
        return this.data57;
    }

    @NotNull
    public final String getData58() {
        return this.data58;
    }

    @NotNull
    public final String getData59() {
        return this.data59;
    }

    @NotNull
    public final String getData6() {
        return this.data6;
    }

    @NotNull
    public final String getData60() {
        return this.data60;
    }

    @NotNull
    public final String getData61() {
        return this.data61;
    }

    @NotNull
    public final String getData62() {
        return this.data62;
    }

    @NotNull
    public final String getData63() {
        return this.data63;
    }

    @NotNull
    public final String getData64() {
        return this.data64;
    }

    @NotNull
    public final String getData65() {
        return this.data65;
    }

    @NotNull
    public final String getData66() {
        return this.data66;
    }

    @NotNull
    public final String getData67() {
        return this.data67;
    }

    @NotNull
    public final String getData68() {
        return this.data68;
    }

    @NotNull
    public final String getData69() {
        return this.data69;
    }

    @NotNull
    public final String getData7() {
        return this.data7;
    }

    @NotNull
    public final String getData70() {
        return this.data70;
    }

    @NotNull
    public final String getData71() {
        return this.data71;
    }

    @NotNull
    public final String getData72() {
        return this.data72;
    }

    @NotNull
    public final String getData73() {
        return this.data73;
    }

    @NotNull
    public final String getData74() {
        return this.data74;
    }

    @NotNull
    public final String getData75() {
        return this.data75;
    }

    @NotNull
    public final String getData76() {
        return this.data76;
    }

    @NotNull
    public final String getData77() {
        return this.data77;
    }

    @NotNull
    public final String getData78() {
        return this.data78;
    }

    @NotNull
    public final String getData79() {
        return this.data79;
    }

    @NotNull
    public final String getData8() {
        return this.data8;
    }

    @NotNull
    public final String getData80() {
        return this.data80;
    }

    @NotNull
    public final String getData81() {
        return this.data81;
    }

    @NotNull
    public final String getData82() {
        return this.data82;
    }

    @NotNull
    public final String getData83() {
        return this.data83;
    }

    @NotNull
    public final String getData84() {
        return this.data84;
    }

    @NotNull
    public final String getData85() {
        return this.data85;
    }

    @NotNull
    public final String getData86() {
        return this.data86;
    }

    @NotNull
    public final String getData87() {
        return this.data87;
    }

    @NotNull
    public final String getData88() {
        return this.data88;
    }

    @NotNull
    public final String getData89() {
        return this.data89;
    }

    @NotNull
    public final String getData9() {
        return this.data9;
    }

    @NotNull
    public final String getData90() {
        return this.data90;
    }

    @NotNull
    public final String getData91() {
        return this.data91;
    }

    @NotNull
    public final String getData92() {
        return this.data92;
    }

    @NotNull
    public final String getData93() {
        return this.data93;
    }

    @NotNull
    public final String getData94() {
        return this.data94;
    }

    @NotNull
    public final String getData95() {
        return this.data95;
    }

    @NotNull
    public final String getData96() {
        return this.data96;
    }

    @NotNull
    public final String getData97() {
        return this.data97;
    }

    @NotNull
    public final String getData98() {
        return this.data98;
    }

    @NotNull
    public final String getData99() {
        return this.data99;
    }

    public final long get_id() {
        return this._id;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Long.hashCode(this._id) * 31) + this.data1.hashCode()) * 31) + this.data2.hashCode()) * 31) + this.data3.hashCode()) * 31) + this.data4.hashCode()) * 31) + this.data5.hashCode()) * 31) + this.data6.hashCode()) * 31) + this.data7.hashCode()) * 31) + this.data8.hashCode()) * 31) + this.data9.hashCode()) * 31) + this.data10.hashCode()) * 31) + this.data11.hashCode()) * 31) + this.data12.hashCode()) * 31) + this.data13.hashCode()) * 31) + this.data14.hashCode()) * 31) + this.data15.hashCode()) * 31) + this.data16.hashCode()) * 31) + this.data17.hashCode()) * 31) + this.data18.hashCode()) * 31) + this.data19.hashCode()) * 31) + this.data20.hashCode()) * 31) + this.data21.hashCode()) * 31) + this.data22.hashCode()) * 31) + this.data23.hashCode()) * 31) + this.data24.hashCode()) * 31) + this.data25.hashCode()) * 31) + this.data26.hashCode()) * 31) + this.data27.hashCode()) * 31) + this.data28.hashCode()) * 31) + this.data29.hashCode()) * 31) + this.data30.hashCode()) * 31) + this.data31.hashCode()) * 31) + this.data32.hashCode()) * 31) + this.data33.hashCode()) * 31) + this.data34.hashCode()) * 31) + this.data35.hashCode()) * 31) + this.data36.hashCode()) * 31) + this.data37.hashCode()) * 31) + this.data38.hashCode()) * 31) + this.data39.hashCode()) * 31) + this.data40.hashCode()) * 31) + this.data41.hashCode()) * 31) + this.data42.hashCode()) * 31) + this.data43.hashCode()) * 31) + this.data44.hashCode()) * 31) + this.data45.hashCode()) * 31) + this.data46.hashCode()) * 31) + this.data47.hashCode()) * 31) + this.data48.hashCode()) * 31) + this.data49.hashCode()) * 31) + this.data50.hashCode()) * 31) + this.data51.hashCode()) * 31) + this.data52.hashCode()) * 31) + this.data53.hashCode()) * 31) + this.data54.hashCode()) * 31) + this.data55.hashCode()) * 31) + this.data56.hashCode()) * 31) + this.data57.hashCode()) * 31) + this.data58.hashCode()) * 31) + this.data59.hashCode()) * 31) + this.data60.hashCode()) * 31) + this.data61.hashCode()) * 31) + this.data62.hashCode()) * 31) + this.data63.hashCode()) * 31) + this.data64.hashCode()) * 31) + this.data65.hashCode()) * 31) + this.data66.hashCode()) * 31) + this.data67.hashCode()) * 31) + this.data68.hashCode()) * 31) + this.data69.hashCode()) * 31) + this.data70.hashCode()) * 31) + this.data71.hashCode()) * 31) + this.data72.hashCode()) * 31) + this.data73.hashCode()) * 31) + this.data74.hashCode()) * 31) + this.data75.hashCode()) * 31) + this.data76.hashCode()) * 31) + this.data77.hashCode()) * 31) + this.data78.hashCode()) * 31) + this.data79.hashCode()) * 31) + this.data80.hashCode()) * 31) + this.data81.hashCode()) * 31) + this.data82.hashCode()) * 31) + this.data83.hashCode()) * 31) + this.data84.hashCode()) * 31) + this.data85.hashCode()) * 31) + this.data86.hashCode()) * 31) + this.data87.hashCode()) * 31) + this.data88.hashCode()) * 31) + this.data89.hashCode()) * 31) + this.data90.hashCode()) * 31) + this.data91.hashCode()) * 31) + this.data92.hashCode()) * 31) + this.data93.hashCode()) * 31) + this.data94.hashCode()) * 31) + this.data95.hashCode()) * 31) + this.data96.hashCode()) * 31) + this.data97.hashCode()) * 31) + this.data98.hashCode()) * 31) + this.data99.hashCode()) * 31) + this.data100.hashCode();
    }

    public final void setData1(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data1 = str;
    }

    public final void setData10(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data10 = str;
    }

    public final void setData100(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data100 = str;
    }

    public final void setData11(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data11 = str;
    }

    public final void setData12(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data12 = str;
    }

    public final void setData13(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data13 = str;
    }

    public final void setData14(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data14 = str;
    }

    public final void setData15(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data15 = str;
    }

    public final void setData16(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data16 = str;
    }

    public final void setData17(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data17 = str;
    }

    public final void setData18(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data18 = str;
    }

    public final void setData19(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data19 = str;
    }

    public final void setData2(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data2 = str;
    }

    public final void setData20(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data20 = str;
    }

    public final void setData21(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data21 = str;
    }

    public final void setData22(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data22 = str;
    }

    public final void setData23(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data23 = str;
    }

    public final void setData24(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data24 = str;
    }

    public final void setData25(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data25 = str;
    }

    public final void setData26(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data26 = str;
    }

    public final void setData27(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data27 = str;
    }

    public final void setData28(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data28 = str;
    }

    public final void setData29(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data29 = str;
    }

    public final void setData3(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data3 = str;
    }

    public final void setData30(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data30 = str;
    }

    public final void setData31(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data31 = str;
    }

    public final void setData32(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data32 = str;
    }

    public final void setData33(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data33 = str;
    }

    public final void setData34(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data34 = str;
    }

    public final void setData35(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data35 = str;
    }

    public final void setData36(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data36 = str;
    }

    public final void setData37(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data37 = str;
    }

    public final void setData38(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data38 = str;
    }

    public final void setData39(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data39 = str;
    }

    public final void setData4(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data4 = str;
    }

    public final void setData40(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data40 = str;
    }

    public final void setData41(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data41 = str;
    }

    public final void setData42(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data42 = str;
    }

    public final void setData43(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data43 = str;
    }

    public final void setData44(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data44 = str;
    }

    public final void setData45(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data45 = str;
    }

    public final void setData46(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data46 = str;
    }

    public final void setData47(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data47 = str;
    }

    public final void setData48(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data48 = str;
    }

    public final void setData49(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data49 = str;
    }

    public final void setData5(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data5 = str;
    }

    public final void setData50(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data50 = str;
    }

    public final void setData51(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data51 = str;
    }

    public final void setData52(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data52 = str;
    }

    public final void setData53(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data53 = str;
    }

    public final void setData54(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data54 = str;
    }

    public final void setData55(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data55 = str;
    }

    public final void setData56(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data56 = str;
    }

    public final void setData57(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data57 = str;
    }

    public final void setData58(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data58 = str;
    }

    public final void setData59(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data59 = str;
    }

    public final void setData6(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data6 = str;
    }

    public final void setData60(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data60 = str;
    }

    public final void setData61(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data61 = str;
    }

    public final void setData62(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data62 = str;
    }

    public final void setData63(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data63 = str;
    }

    public final void setData64(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data64 = str;
    }

    public final void setData65(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data65 = str;
    }

    public final void setData66(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data66 = str;
    }

    public final void setData67(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data67 = str;
    }

    public final void setData68(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data68 = str;
    }

    public final void setData69(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data69 = str;
    }

    public final void setData7(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data7 = str;
    }

    public final void setData70(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data70 = str;
    }

    public final void setData71(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data71 = str;
    }

    public final void setData72(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data72 = str;
    }

    public final void setData73(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data73 = str;
    }

    public final void setData74(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data74 = str;
    }

    public final void setData75(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data75 = str;
    }

    public final void setData76(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data76 = str;
    }

    public final void setData77(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data77 = str;
    }

    public final void setData78(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data78 = str;
    }

    public final void setData79(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data79 = str;
    }

    public final void setData8(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data8 = str;
    }

    public final void setData80(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data80 = str;
    }

    public final void setData81(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data81 = str;
    }

    public final void setData82(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data82 = str;
    }

    public final void setData83(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data83 = str;
    }

    public final void setData84(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data84 = str;
    }

    public final void setData85(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data85 = str;
    }

    public final void setData86(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data86 = str;
    }

    public final void setData87(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data87 = str;
    }

    public final void setData88(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data88 = str;
    }

    public final void setData89(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data89 = str;
    }

    public final void setData9(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data9 = str;
    }

    public final void setData90(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data90 = str;
    }

    public final void setData91(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data91 = str;
    }

    public final void setData92(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data92 = str;
    }

    public final void setData93(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data93 = str;
    }

    public final void setData94(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data94 = str;
    }

    public final void setData95(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data95 = str;
    }

    public final void setData96(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data96 = str;
    }

    public final void setData97(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data97 = str;
    }

    public final void setData98(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data98 = str;
    }

    public final void setData99(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data99 = str;
    }

    public final void set_id(long j2) {
        this._id = j2;
    }

    @NotNull
    public String toString() {
        return "CoreEntity(_id=" + this._id + ", data1=" + this.data1 + ", data2=" + this.data2 + ", data3=" + this.data3 + ", data4=" + this.data4 + ", data5=" + this.data5 + ", data6=" + this.data6 + ", data7=" + this.data7 + ", data8=" + this.data8 + ", data9=" + this.data9 + ", data10=" + this.data10 + ", data11=" + this.data11 + ", data12=" + this.data12 + ", data13=" + this.data13 + ", data14=" + this.data14 + ", data15=" + this.data15 + ", data16=" + this.data16 + ", data17=" + this.data17 + ", data18=" + this.data18 + ", data19=" + this.data19 + ", data20=" + this.data20 + ", data21=" + this.data21 + ", data22=" + this.data22 + ", data23=" + this.data23 + ", data24=" + this.data24 + ", data25=" + this.data25 + ", data26=" + this.data26 + ", data27=" + this.data27 + ", data28=" + this.data28 + ", data29=" + this.data29 + ", data30=" + this.data30 + ", data31=" + this.data31 + ", data32=" + this.data32 + ", data33=" + this.data33 + ", data34=" + this.data34 + ", data35=" + this.data35 + ", data36=" + this.data36 + ", data37=" + this.data37 + ", data38=" + this.data38 + ", data39=" + this.data39 + ", data40=" + this.data40 + ", data41=" + this.data41 + ", data42=" + this.data42 + ", data43=" + this.data43 + ", data44=" + this.data44 + ", data45=" + this.data45 + ", data46=" + this.data46 + ", data47=" + this.data47 + ", data48=" + this.data48 + ", data49=" + this.data49 + ", data50=" + this.data50 + ", data51=" + this.data51 + ", data52=" + this.data52 + ", data53=" + this.data53 + ", data54=" + this.data54 + ", data55=" + this.data55 + ", data56=" + this.data56 + ", data57=" + this.data57 + ", data58=" + this.data58 + ", data59=" + this.data59 + ", data60=" + this.data60 + ", data61=" + this.data61 + ", data62=" + this.data62 + ", data63=" + this.data63 + ", data64=" + this.data64 + ", data65=" + this.data65 + ", data66=" + this.data66 + ", data67=" + this.data67 + ", data68=" + this.data68 + ", data69=" + this.data69 + ", data70=" + this.data70 + ", data71=" + this.data71 + ", data72=" + this.data72 + ", data73=" + this.data73 + ", data74=" + this.data74 + ", data75=" + this.data75 + ", data76=" + this.data76 + ", data77=" + this.data77 + ", data78=" + this.data78 + ", data79=" + this.data79 + ", data80=" + this.data80 + ", data81=" + this.data81 + ", data82=" + this.data82 + ", data83=" + this.data83 + ", data84=" + this.data84 + ", data85=" + this.data85 + ", data86=" + this.data86 + ", data87=" + this.data87 + ", data88=" + this.data88 + ", data89=" + this.data89 + ", data90=" + this.data90 + ", data91=" + this.data91 + ", data92=" + this.data92 + ", data93=" + this.data93 + ", data94=" + this.data94 + ", data95=" + this.data95 + ", data96=" + this.data96 + ", data97=" + this.data97 + ", data98=" + this.data98 + ", data99=" + this.data99 + ", data100=" + this.data100 + ')';
    }

    public CoreEntity(long j2, @NotNull String data1, @NotNull String data2, @NotNull String data3, @NotNull String data4, @NotNull String data5, @NotNull String data6, @NotNull String data7, @NotNull String data8, @NotNull String data9, @NotNull String data10, @NotNull String data11, @NotNull String data12, @NotNull String data13, @NotNull String data14, @NotNull String data15, @NotNull String data16, @NotNull String data17, @NotNull String data18, @NotNull String data19, @NotNull String data20, @NotNull String data21, @NotNull String data22, @NotNull String data23, @NotNull String data24, @NotNull String data25, @NotNull String data26, @NotNull String data27, @NotNull String data28, @NotNull String data29, @NotNull String data30, @NotNull String data31, @NotNull String data32, @NotNull String data33, @NotNull String data34, @NotNull String data35, @NotNull String data36, @NotNull String data37, @NotNull String data38, @NotNull String data39, @NotNull String data40, @NotNull String data41, @NotNull String data42, @NotNull String data43, @NotNull String data44, @NotNull String data45, @NotNull String data46, @NotNull String data47, @NotNull String data48, @NotNull String data49, @NotNull String data50, @NotNull String data51, @NotNull String data52, @NotNull String data53, @NotNull String data54, @NotNull String data55, @NotNull String data56, @NotNull String data57, @NotNull String data58, @NotNull String data59, @NotNull String data60, @NotNull String data61, @NotNull String data62, @NotNull String data63, @NotNull String data64, @NotNull String data65, @NotNull String data66, @NotNull String data67, @NotNull String data68, @NotNull String data69, @NotNull String data70, @NotNull String data71, @NotNull String data72, @NotNull String data73, @NotNull String data74, @NotNull String data75, @NotNull String data76, @NotNull String data77, @NotNull String data78, @NotNull String data79, @NotNull String data80, @NotNull String data81, @NotNull String data82, @NotNull String data83, @NotNull String data84, @NotNull String data85, @NotNull String data86, @NotNull String data87, @NotNull String data88, @NotNull String data89, @NotNull String data90, @NotNull String data91, @NotNull String data92, @NotNull String data93, @NotNull String data94, @NotNull String data95, @NotNull String data96, @NotNull String data97, @NotNull String data98, @NotNull String data99, @NotNull String data100) {
        Intrinsics.checkNotNullParameter(data1, "data1");
        Intrinsics.checkNotNullParameter(data2, "data2");
        Intrinsics.checkNotNullParameter(data3, "data3");
        Intrinsics.checkNotNullParameter(data4, "data4");
        Intrinsics.checkNotNullParameter(data5, "data5");
        Intrinsics.checkNotNullParameter(data6, "data6");
        Intrinsics.checkNotNullParameter(data7, "data7");
        Intrinsics.checkNotNullParameter(data8, "data8");
        Intrinsics.checkNotNullParameter(data9, "data9");
        Intrinsics.checkNotNullParameter(data10, "data10");
        Intrinsics.checkNotNullParameter(data11, "data11");
        Intrinsics.checkNotNullParameter(data12, "data12");
        Intrinsics.checkNotNullParameter(data13, "data13");
        Intrinsics.checkNotNullParameter(data14, "data14");
        Intrinsics.checkNotNullParameter(data15, "data15");
        Intrinsics.checkNotNullParameter(data16, "data16");
        Intrinsics.checkNotNullParameter(data17, "data17");
        Intrinsics.checkNotNullParameter(data18, "data18");
        Intrinsics.checkNotNullParameter(data19, "data19");
        Intrinsics.checkNotNullParameter(data20, "data20");
        Intrinsics.checkNotNullParameter(data21, "data21");
        Intrinsics.checkNotNullParameter(data22, "data22");
        Intrinsics.checkNotNullParameter(data23, "data23");
        Intrinsics.checkNotNullParameter(data24, "data24");
        Intrinsics.checkNotNullParameter(data25, "data25");
        Intrinsics.checkNotNullParameter(data26, "data26");
        Intrinsics.checkNotNullParameter(data27, "data27");
        Intrinsics.checkNotNullParameter(data28, "data28");
        Intrinsics.checkNotNullParameter(data29, "data29");
        Intrinsics.checkNotNullParameter(data30, "data30");
        Intrinsics.checkNotNullParameter(data31, "data31");
        Intrinsics.checkNotNullParameter(data32, "data32");
        Intrinsics.checkNotNullParameter(data33, "data33");
        Intrinsics.checkNotNullParameter(data34, "data34");
        Intrinsics.checkNotNullParameter(data35, "data35");
        Intrinsics.checkNotNullParameter(data36, "data36");
        Intrinsics.checkNotNullParameter(data37, "data37");
        Intrinsics.checkNotNullParameter(data38, "data38");
        Intrinsics.checkNotNullParameter(data39, "data39");
        Intrinsics.checkNotNullParameter(data40, "data40");
        Intrinsics.checkNotNullParameter(data41, "data41");
        Intrinsics.checkNotNullParameter(data42, "data42");
        Intrinsics.checkNotNullParameter(data43, "data43");
        Intrinsics.checkNotNullParameter(data44, "data44");
        Intrinsics.checkNotNullParameter(data45, "data45");
        Intrinsics.checkNotNullParameter(data46, "data46");
        Intrinsics.checkNotNullParameter(data47, "data47");
        Intrinsics.checkNotNullParameter(data48, "data48");
        Intrinsics.checkNotNullParameter(data49, "data49");
        Intrinsics.checkNotNullParameter(data50, "data50");
        Intrinsics.checkNotNullParameter(data51, "data51");
        Intrinsics.checkNotNullParameter(data52, "data52");
        Intrinsics.checkNotNullParameter(data53, "data53");
        Intrinsics.checkNotNullParameter(data54, "data54");
        Intrinsics.checkNotNullParameter(data55, "data55");
        Intrinsics.checkNotNullParameter(data56, "data56");
        Intrinsics.checkNotNullParameter(data57, "data57");
        Intrinsics.checkNotNullParameter(data58, "data58");
        Intrinsics.checkNotNullParameter(data59, "data59");
        Intrinsics.checkNotNullParameter(data60, "data60");
        Intrinsics.checkNotNullParameter(data61, "data61");
        Intrinsics.checkNotNullParameter(data62, "data62");
        Intrinsics.checkNotNullParameter(data63, "data63");
        Intrinsics.checkNotNullParameter(data64, "data64");
        Intrinsics.checkNotNullParameter(data65, "data65");
        Intrinsics.checkNotNullParameter(data66, "data66");
        Intrinsics.checkNotNullParameter(data67, "data67");
        Intrinsics.checkNotNullParameter(data68, "data68");
        Intrinsics.checkNotNullParameter(data69, "data69");
        Intrinsics.checkNotNullParameter(data70, "data70");
        Intrinsics.checkNotNullParameter(data71, "data71");
        Intrinsics.checkNotNullParameter(data72, "data72");
        Intrinsics.checkNotNullParameter(data73, "data73");
        Intrinsics.checkNotNullParameter(data74, "data74");
        Intrinsics.checkNotNullParameter(data75, "data75");
        Intrinsics.checkNotNullParameter(data76, "data76");
        Intrinsics.checkNotNullParameter(data77, "data77");
        Intrinsics.checkNotNullParameter(data78, "data78");
        Intrinsics.checkNotNullParameter(data79, "data79");
        Intrinsics.checkNotNullParameter(data80, "data80");
        Intrinsics.checkNotNullParameter(data81, "data81");
        Intrinsics.checkNotNullParameter(data82, "data82");
        Intrinsics.checkNotNullParameter(data83, "data83");
        Intrinsics.checkNotNullParameter(data84, "data84");
        Intrinsics.checkNotNullParameter(data85, "data85");
        Intrinsics.checkNotNullParameter(data86, "data86");
        Intrinsics.checkNotNullParameter(data87, "data87");
        Intrinsics.checkNotNullParameter(data88, "data88");
        Intrinsics.checkNotNullParameter(data89, "data89");
        Intrinsics.checkNotNullParameter(data90, "data90");
        Intrinsics.checkNotNullParameter(data91, "data91");
        Intrinsics.checkNotNullParameter(data92, "data92");
        Intrinsics.checkNotNullParameter(data93, "data93");
        Intrinsics.checkNotNullParameter(data94, "data94");
        Intrinsics.checkNotNullParameter(data95, "data95");
        Intrinsics.checkNotNullParameter(data96, "data96");
        Intrinsics.checkNotNullParameter(data97, "data97");
        Intrinsics.checkNotNullParameter(data98, "data98");
        Intrinsics.checkNotNullParameter(data99, "data99");
        Intrinsics.checkNotNullParameter(data100, "data100");
        this._id = j2;
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
        this.data4 = data4;
        this.data5 = data5;
        this.data6 = data6;
        this.data7 = data7;
        this.data8 = data8;
        this.data9 = data9;
        this.data10 = data10;
        this.data11 = data11;
        this.data12 = data12;
        this.data13 = data13;
        this.data14 = data14;
        this.data15 = data15;
        this.data16 = data16;
        this.data17 = data17;
        this.data18 = data18;
        this.data19 = data19;
        this.data20 = data20;
        this.data21 = data21;
        this.data22 = data22;
        this.data23 = data23;
        this.data24 = data24;
        this.data25 = data25;
        this.data26 = data26;
        this.data27 = data27;
        this.data28 = data28;
        this.data29 = data29;
        this.data30 = data30;
        this.data31 = data31;
        this.data32 = data32;
        this.data33 = data33;
        this.data34 = data34;
        this.data35 = data35;
        this.data36 = data36;
        this.data37 = data37;
        this.data38 = data38;
        this.data39 = data39;
        this.data40 = data40;
        this.data41 = data41;
        this.data42 = data42;
        this.data43 = data43;
        this.data44 = data44;
        this.data45 = data45;
        this.data46 = data46;
        this.data47 = data47;
        this.data48 = data48;
        this.data49 = data49;
        this.data50 = data50;
        this.data51 = data51;
        this.data52 = data52;
        this.data53 = data53;
        this.data54 = data54;
        this.data55 = data55;
        this.data56 = data56;
        this.data57 = data57;
        this.data58 = data58;
        this.data59 = data59;
        this.data60 = data60;
        this.data61 = data61;
        this.data62 = data62;
        this.data63 = data63;
        this.data64 = data64;
        this.data65 = data65;
        this.data66 = data66;
        this.data67 = data67;
        this.data68 = data68;
        this.data69 = data69;
        this.data70 = data70;
        this.data71 = data71;
        this.data72 = data72;
        this.data73 = data73;
        this.data74 = data74;
        this.data75 = data75;
        this.data76 = data76;
        this.data77 = data77;
        this.data78 = data78;
        this.data79 = data79;
        this.data80 = data80;
        this.data81 = data81;
        this.data82 = data82;
        this.data83 = data83;
        this.data84 = data84;
        this.data85 = data85;
        this.data86 = data86;
        this.data87 = data87;
        this.data88 = data88;
        this.data89 = data89;
        this.data90 = data90;
        this.data91 = data91;
        this.data92 = data92;
        this.data93 = data93;
        this.data94 = data94;
        this.data95 = data95;
        this.data96 = data96;
        this.data97 = data97;
        this.data98 = data98;
        this.data99 = data99;
        this.data100 = data100;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CoreEntity(long j2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, String str60, String str61, String str62, String str63, String str64, String str65, String str66, String str67, String str68, String str69, String str70, String str71, String str72, String str73, String str74, String str75, String str76, String str77, String str78, String str79, String str80, String str81, String str82, String str83, String str84, String str85, String str86, String str87, String str88, String str89, String str90, String str91, String str92, String str93, String str94, String str95, String str96, String str97, String str98, String str99, String str100, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        long j3 = (i & 1) != 0 ? 0L : j2;
        String str101 = (i & 2) != 0 ? "" : str;
        String str102 = (i & 4) != 0 ? "" : str2;
        String str103 = (i & 8) != 0 ? "" : str3;
        String str104 = (i & 16) != 0 ? "" : str4;
        String str105 = (i & 32) != 0 ? "" : str5;
        String str106 = (i & 64) != 0 ? "" : str6;
        String str107 = (i & 128) != 0 ? "" : str7;
        String str108 = (i & 256) != 0 ? "" : str8;
        String str109 = (i & 512) != 0 ? "" : str9;
        String str110 = (i & 1024) != 0 ? "" : str10;
        String str111 = (i & 2048) != 0 ? "" : str11;
        String str112 = (i & 4096) != 0 ? "" : str12;
        String str113 = (i & 8192) != 0 ? "" : str13;
        String str114 = (i & 16384) != 0 ? "" : str14;
        String str115 = (i & 32768) != 0 ? "" : str15;
        String str116 = (i & 65536) != 0 ? "" : str16;
        String str117 = (i & 131072) != 0 ? "" : str17;
        String str118 = (i & 262144) != 0 ? "" : str18;
        String str119 = (i & 524288) != 0 ? "" : str19;
        String str120 = (i & 1048576) != 0 ? "" : str20;
        String str121 = (i & 2097152) != 0 ? "" : str21;
        String str122 = (i & 4194304) != 0 ? "" : str22;
        String str123 = (i & 8388608) != 0 ? "" : str23;
        String str124 = (i & 16777216) != 0 ? "" : str24;
        String str125 = (i & 33554432) != 0 ? "" : str25;
        String str126 = (i & 67108864) != 0 ? "" : str26;
        String str127 = (i & 134217728) != 0 ? "" : str27;
        String str128 = (i & 268435456) != 0 ? "" : str28;
        String str129 = (i & 536870912) != 0 ? "" : str29;
        String str130 = (i & 1073741824) != 0 ? "" : str30;
        String str131 = (i & Integer.MIN_VALUE) != 0 ? "" : str31;
        this(j3, str101, str102, str103, str104, str105, str106, str107, str108, str109, str110, str111, str112, str113, str114, str115, str116, str117, str118, str119, str120, str121, str122, str123, str124, str125, str126, str127, str128, str129, str130, str131, (i2 & 1) != 0 ? "" : str32, (i2 & 2) != 0 ? "" : str33, (i2 & 4) != 0 ? "" : str34, (i2 & 8) != 0 ? "" : str35, (i2 & 16) != 0 ? "" : str36, (i2 & 32) != 0 ? "" : str37, (i2 & 64) != 0 ? "" : str38, (i2 & 128) != 0 ? "" : str39, (i2 & 256) != 0 ? "" : str40, (i2 & 512) != 0 ? "" : str41, (i2 & 1024) != 0 ? "" : str42, (i2 & 2048) != 0 ? "" : str43, (i2 & 4096) != 0 ? "" : str44, (i2 & 8192) != 0 ? "" : str45, (i2 & 16384) != 0 ? "" : str46, (i2 & 32768) != 0 ? "" : str47, (i2 & 65536) != 0 ? "" : str48, (i2 & 131072) != 0 ? "" : str49, (i2 & 262144) != 0 ? "" : str50, (i2 & 524288) != 0 ? "" : str51, (i2 & 1048576) != 0 ? "" : str52, (i2 & 2097152) != 0 ? "" : str53, (i2 & 4194304) != 0 ? "" : str54, (i2 & 8388608) != 0 ? "" : str55, (i2 & 16777216) != 0 ? "" : str56, (i2 & 33554432) != 0 ? "" : str57, (i2 & 67108864) != 0 ? "" : str58, (i2 & 134217728) != 0 ? "" : str59, (i2 & 268435456) != 0 ? "" : str60, (i2 & 536870912) != 0 ? "" : str61, (i2 & 1073741824) != 0 ? "" : str62, (i2 & Integer.MIN_VALUE) != 0 ? "" : str63, (i3 & 1) != 0 ? "" : str64, (i3 & 2) != 0 ? "" : str65, (i3 & 4) != 0 ? "" : str66, (i3 & 8) != 0 ? "" : str67, (i3 & 16) != 0 ? "" : str68, (i3 & 32) != 0 ? "" : str69, (i3 & 64) != 0 ? "" : str70, (i3 & 128) != 0 ? "" : str71, (i3 & 256) != 0 ? "" : str72, (i3 & 512) != 0 ? "" : str73, (i3 & 1024) != 0 ? "" : str74, (i3 & 2048) != 0 ? "" : str75, (i3 & 4096) != 0 ? "" : str76, (i3 & 8192) != 0 ? "" : str77, (i3 & 16384) != 0 ? "" : str78, (i3 & 32768) != 0 ? "" : str79, (i3 & 65536) != 0 ? "" : str80, (i3 & 131072) != 0 ? "" : str81, (i3 & 262144) != 0 ? "" : str82, (i3 & 524288) != 0 ? "" : str83, (i3 & 1048576) != 0 ? "" : str84, (i3 & 2097152) != 0 ? "" : str85, (i3 & 4194304) != 0 ? "" : str86, (i3 & 8388608) != 0 ? "" : str87, (i3 & 16777216) != 0 ? "" : str88, (i3 & 33554432) != 0 ? "" : str89, (i3 & 67108864) != 0 ? "" : str90, (i3 & 134217728) != 0 ? "" : str91, (i3 & 268435456) != 0 ? "" : str92, (i3 & 536870912) != 0 ? "" : str93, (i3 & 1073741824) != 0 ? "" : str94, (i3 & Integer.MIN_VALUE) != 0 ? "" : str95, (i4 & 1) != 0 ? "" : str96, (i4 & 2) != 0 ? "" : str97, (i4 & 4) != 0 ? "" : str98, (i4 & 8) != 0 ? "" : str99, (i4 & 16) != 0 ? "" : str100);
    }
}
