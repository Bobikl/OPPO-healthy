package com.oplusos.vfxmodelviewer.utils;

import com.oplus.aiunit.vision.vr3;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.TextEntity;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\u0000\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\b\u001a\u0011\u0010\u0000\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0004H\u0086\b\u001a\u0011\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007H\u0086\b\u001a\u0011\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\bH\u0086\b\u001a\u0011\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\tH\u0086\b\u001a\u0011\u0010\n\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007H\u0086\b\u001a\u0011\u0010\n\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\bH\u0086\b\u001a\u0011\u0010\n\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\tH\u0086\b\u001a!\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0086\b\u001a!\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0086\b\u001a!\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0086\b\u001a!\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0086\b\u001a!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0086\b\u001a!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0011\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\b\u001a\u0011\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0004H\u0086\b\u001a\u0011\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\b\u001a\u0011\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0011\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\r\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\r\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0011\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\r\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\b\u001a\u0011\u0010\f\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\f\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0011\u0010\f\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\b\u001a!\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u0001H\u0086\b\u001a!\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u000eH\u0086\b\u001a!\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003H\u0086\b\u001a!\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u000eH\u0086\b\u001a!\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004H\u0086\b\u001a!\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u000eH\u0086\b\u001a\u000e\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u000e\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0004\u001a\u0019\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\b\u001a\u0019\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\b\u001a\u0019\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0001H\u0086\b\u001a\u0019\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0003H\u0086\b\u001a\u001e\u0010\"\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u000e\u001a\u001e\u0010\"\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u000e\u001a(\u0010$\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0&H\u0086\bø\u0001\u0000\u001a(\u0010$\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0&H\u0086\bø\u0001\u0000\u001a(\u0010$\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u00042\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0&H\u0086\bø\u0001\u0000\u001a\u0015\u0010'\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010'\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010'\u001a\u00020\u0004*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0004H\u0086\n\u001a\u0015\u0010(\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\f\u001a\u0015\u0010(\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010(\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\f\u001a\u0015\u0010(\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010(\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\f\u001a\u0015\u0010(\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010)\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\f\u001a\u0015\u0010)\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010)\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\f\u001a\u0015\u0010)\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010)\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\f\u001a\u0015\u0010)\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010*\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\f\u001a\u0015\u0010*\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010*\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\f\u001a\u0015\u0010*\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010*\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\f\u001a\u0015\u0010*\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010+\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\f\u001a\u0015\u0010+\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010+\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\f\u001a\u0015\u0010+\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010+\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\f\u001a\u0015\u0010+\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010,\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\f\u001a\u0015\u0010,\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010,\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\f\u001a\u0015\u0010,\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010,\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\f\u001a\u0015\u0010,\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010-\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010-\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010-\u001a\u00020\u0004*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0004H\u0086\n\u001a\u0015\u0010.\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\f\u001a\u0015\u0010.\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010.\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0086\f\u001a\u0015\u0010.\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010.\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0086\f\u001a\u0015\u0010.\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0086\f\u001a\u0015\u0010/\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010/\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010/\u001a\u00020\u0004*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0004H\u0086\n\u001a\u0015\u00100\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u00100\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\n\u001a\u0015\u00100\u001a\u00020\u0004*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0004H\u0086\n\u001a\u0015\u0010\u001c\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00061"}, d2 = {"abs", "Lcom/oplusos/vfxmodelviewer/utils/Float2;", "v", "Lcom/oplusos/vfxmodelviewer/utils/Float3;", "Lcom/oplusos/vfxmodelviewer/utils/Float4;", TextEntity.AUTO_LINK_ALL, "", "Lcom/oplusos/vfxmodelviewer/utils/Bool2;", "Lcom/oplusos/vfxmodelviewer/utils/Bool3;", "Lcom/oplusos/vfxmodelviewer/utils/Bool4;", "any", "clamp", ParserTag.TAG_MIN, ParserTag.TAG_MAX, "", "cross", "a", "b", "distance", "dot", "equal", "greaterThan", "greaterThanEqual", "length", "length2", "lessThan", "lessThanEqual", "mix", "x", "normalize", "notEqual", "reflect", "i", "n", "refract", "eta", "transform", "block", "Lkotlin/Function1;", "div", "eq", "gt", "gte", "lt", "lte", "minus", "neq", "plus", "times", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class VectorKt {
    @NotNull
    public static final Float2 abs(@NotNull Float2 float2) {
        Intrinsics.checkNotNullParameter(float2, "v");
        return new Float2(Math.abs(float2.getX()), Math.abs(float2.getY()));
    }

    public static final boolean all(@NotNull Bool2 bool2) {
        Intrinsics.checkNotNullParameter(bool2, "v");
        return bool2.getX() && bool2.getY();
    }

    public static final boolean any(@NotNull Bool2 bool2) {
        Intrinsics.checkNotNullParameter(bool2, "v");
        return bool2.getX() || bool2.getY();
    }

    @NotNull
    public static final Float2 clamp(@NotNull Float2 float2, float f, float f2) {
        Intrinsics.checkNotNullParameter(float2, "v");
        float x = float2.getX();
        if (x < f) {
            x = f;
        } else if (x > f2) {
            x = f2;
        }
        float y = float2.getY();
        if (y >= f) {
            f = y > f2 ? f2 : y;
        }
        return new Float2(x, f);
    }

    @NotNull
    public static final Float3 cross(@NotNull Float3 float3, @NotNull Float3 float4) {
        Intrinsics.checkNotNullParameter(float3, "a");
        Intrinsics.checkNotNullParameter(float4, "b");
        return new Float3((float3.getY() * float4.getZ()) - (float3.getZ() * float4.getY()), (float3.getZ() * float4.getX()) - (float3.getX() * float4.getZ()), (float3.getX() * float4.getY()) - (float3.getY() * float4.getX()));
    }

    public static final float distance(@NotNull Float2 float2, @NotNull Float2 float3) {
        Intrinsics.checkNotNullParameter(float2, "a");
        Intrinsics.checkNotNullParameter(float3, "b");
        Float2 float4 = new Float2(float2.getX() - float3.getX(), float2.getY() - float3.getY());
        return (float) Math.sqrt((float4.getX() * float4.getX()) + (float4.getY() * float4.getY()));
    }

    @NotNull
    public static final Float2 div(float f, @NotNull Float2 float2) {
        Intrinsics.checkNotNullParameter(float2, "v");
        return new Float2(f / float2.getX(), f / float2.getY());
    }

    public static final float dot(@NotNull Float2 float2, @NotNull Float2 float3) {
        Intrinsics.checkNotNullParameter(float2, "a");
        Intrinsics.checkNotNullParameter(float3, "b");
        return (float2.getX() * float3.getX()) + (float2.getY() * float3.getY());
    }

    @NotNull
    public static final Bool2 eq(@NotNull Float2 float2, float f) {
        Intrinsics.checkNotNullParameter(float2, "<this>");
        return new Bool2(float2.getX() == f, float2.getY() == f);
    }

    @NotNull
    public static final Bool2 equal(@NotNull Float2 float2, float f) {
        Intrinsics.checkNotNullParameter(float2, "a");
        return new Bool2(float2.getX() == f, float2.getY() == f);
    }

    @NotNull
    public static final Bool2 greaterThan(@NotNull Float2 float2, float f) {
        Intrinsics.checkNotNullParameter(float2, "a");
        return new Bool2(float2.getX() > f, float2.getY() > f);
    }

    @NotNull
    public static final Bool2 greaterThanEqual(@NotNull Float2 float2, float f) {
        Intrinsics.checkNotNullParameter(float2, "a");
        return new Bool2(float2.getX() >= f, float2.getY() >= f);
    }

    @NotNull
    public static final Bool2 gt(@NotNull Float2 float2, float f) {
        Intrinsics.checkNotNullParameter(float2, "<this>");
        return new Bool2(float2.getX() > f, float2.getY() > f);
    }

    @NotNull
    public static final Bool2 gte(@NotNull Float2 float2, float f) {
        Intrinsics.checkNotNullParameter(float2, "<this>");
        return new Bool2(float2.getX() >= f, float2.getY() >= f);
    }

    public static final float length(@NotNull Float2 float2) {
        Intrinsics.checkNotNullParameter(float2, "v");
        return (float) Math.sqrt((float2.getX() * float2.getX()) + (float2.getY() * float2.getY()));
    }

    public static final float length2(@NotNull Float2 float2) {
        Intrinsics.checkNotNullParameter(float2, "v");
        return (float2.getX() * float2.getX()) + (float2.getY() * float2.getY());
    }

    @NotNull
    public static final Bool2 lessThan(@NotNull Float2 float2, float f) {
        Intrinsics.checkNotNullParameter(float2, "a");
        return new Bool2(float2.getX() < f, float2.getY() < f);
    }

    @NotNull
    public static final Bool2 lessThanEqual(@NotNull Float2 float2, float f) {
        Intrinsics.checkNotNullParameter(float2, "a");
        return new Bool2(float2.getX() <= f, float2.getY() <= f);
    }

    @NotNull
    public static final Bool2 lt(@NotNull Float2 float2, float f) {
        Intrinsics.checkNotNullParameter(float2, "<this>");
        return new Bool2(float2.getX() < f, float2.getY() < f);
    }

    @NotNull
    public static final Bool2 lte(@NotNull Float2 float2, float f) {
        Intrinsics.checkNotNullParameter(float2, "<this>");
        return new Bool2(float2.getX() <= f, float2.getY() <= f);
    }

    public static final float max(@NotNull Float2 float2) {
        Intrinsics.checkNotNullParameter(float2, "v");
        return Math.max(float2.getX(), float2.getY());
    }

    public static final float min(@NotNull Float2 float2) {
        Intrinsics.checkNotNullParameter(float2, "v");
        return Math.min(float2.getX(), float2.getY());
    }

    @NotNull
    public static final Float2 minus(float f, @NotNull Float2 float2) {
        Intrinsics.checkNotNullParameter(float2, "v");
        return new Float2(f - float2.getX(), f - float2.getY());
    }

    @NotNull
    public static final Float2 mix(@NotNull Float2 float2, @NotNull Float2 float3, float f) {
        Intrinsics.checkNotNullParameter(float2, "a");
        Intrinsics.checkNotNullParameter(float3, "b");
        float f2 = 1.0f - f;
        return new Float2((float2.getX() * f2) + (float3.getX() * f), (float2.getY() * f2) + (float3.getY() * f));
    }

    @NotNull
    public static final Bool2 neq(@NotNull Float2 float2, float f) {
        Intrinsics.checkNotNullParameter(float2, "<this>");
        return new Bool2(!(float2.getX() == f), !(float2.getY() == f));
    }

    @NotNull
    public static final Float2 normalize(@NotNull Float2 float2) {
        Intrinsics.checkNotNullParameter(float2, "v");
        float fSqrt = 1.0f / ((float) Math.sqrt((float2.getX() * float2.getX()) + (float2.getY() * float2.getY())));
        return new Float2(float2.getX() * fSqrt, float2.getY() * fSqrt);
    }

    @NotNull
    public static final Bool2 notEqual(@NotNull Float2 float2, float f) {
        Intrinsics.checkNotNullParameter(float2, "a");
        return new Bool2(!(float2.getX() == f), !(float2.getY() == f));
    }

    @NotNull
    public static final Float2 plus(float f, @NotNull Float2 float2) {
        Intrinsics.checkNotNullParameter(float2, "v");
        return new Float2(float2.getX() + f, f + float2.getY());
    }

    @NotNull
    public static final Float2 reflect(@NotNull Float2 float2, @NotNull Float2 float3) {
        Intrinsics.checkNotNullParameter(float2, "i");
        Intrinsics.checkNotNullParameter(float3, "n");
        float x = ((float3.getX() * float2.getX()) + (float3.getY() * float2.getY())) * 2.0f;
        Float2 float4 = new Float2(float3.getX() * x, x * float3.getY());
        return new Float2(float2.getX() - float4.getX(), float2.getY() - float4.getY());
    }

    @NotNull
    public static final Float2 refract(@NotNull Float2 float2, @NotNull Float2 float3, float f) {
        Intrinsics.checkNotNullParameter(float2, "i");
        Intrinsics.checkNotNullParameter(float3, "n");
        float x = (float3.getX() * float2.getX()) + (float3.getY() * float2.getY());
        float f2 = 1.0f - ((f * f) * (1.0f - (x * x)));
        if (f2 < vr3.UNSET) {
            return new Float2(vr3.UNSET);
        }
        Float2 float4 = new Float2(float2.getX() * f, float2.getY() * f);
        float fSqrt = (f * x) + ((float) Math.sqrt(f2));
        Float2 float5 = new Float2(float3.getX() * fSqrt, fSqrt * float3.getY());
        return new Float2(float4.getX() - float5.getX(), float4.getY() - float5.getY());
    }

    @NotNull
    public static final Float2 times(float f, @NotNull Float2 float2) {
        Intrinsics.checkNotNullParameter(float2, "v");
        return new Float2(float2.getX() * f, f * float2.getY());
    }

    @NotNull
    public static final Float2 transform(@NotNull Float2 float2, @NotNull Function1<? super Float, Float> function1) {
        Intrinsics.checkNotNullParameter(float2, "v");
        Intrinsics.checkNotNullParameter(function1, "block");
        Float2 float2Copy$default = Float2.copy$default(float2, vr3.UNSET, vr3.UNSET, 3, null);
        float2Copy$default.setX(((Number) function1.invoke(Float.valueOf(float2Copy$default.getX()))).floatValue());
        float2Copy$default.setY(((Number) function1.invoke(Float.valueOf(float2Copy$default.getY()))).floatValue());
        return float2Copy$default;
    }

    @NotNull
    public static final Float3 x(@NotNull Float3 float3, @NotNull Float3 float4) {
        Intrinsics.checkNotNullParameter(float3, "<this>");
        Intrinsics.checkNotNullParameter(float4, "v");
        return new Float3((float3.getY() * float4.getZ()) - (float3.getZ() * float4.getY()), (float3.getZ() * float4.getX()) - (float3.getX() * float4.getZ()), (float3.getX() * float4.getY()) - (float3.getY() * float4.getX()));
    }

    @NotNull
    public static final Float3 abs(@NotNull Float3 float3) {
        Intrinsics.checkNotNullParameter(float3, "v");
        return new Float3(Math.abs(float3.getX()), Math.abs(float3.getY()), Math.abs(float3.getZ()));
    }

    public static final boolean all(@NotNull Bool3 bool3) {
        Intrinsics.checkNotNullParameter(bool3, "v");
        return bool3.getX() && bool3.getY() && bool3.getZ();
    }

    public static final boolean any(@NotNull Bool3 bool3) {
        Intrinsics.checkNotNullParameter(bool3, "v");
        return bool3.getX() || bool3.getY() || bool3.getZ();
    }

    @NotNull
    public static final Float3 div(float f, @NotNull Float3 float3) {
        Intrinsics.checkNotNullParameter(float3, "v");
        return new Float3(f / float3.getX(), f / float3.getY(), f / float3.getZ());
    }

    public static final float dot(@NotNull Float3 float3, @NotNull Float3 float4) {
        Intrinsics.checkNotNullParameter(float3, "a");
        Intrinsics.checkNotNullParameter(float4, "b");
        return (float3.getX() * float4.getX()) + (float3.getY() * float4.getY()) + (float3.getZ() * float4.getZ());
    }

    @NotNull
    public static final Bool2 eq(@NotNull Float2 float2, @NotNull Float2 float3) {
        Intrinsics.checkNotNullParameter(float2, "<this>");
        Intrinsics.checkNotNullParameter(float3, "b");
        return new Bool2(float2.getX() == float3.getX(), float2.getY() == float3.getY());
    }

    @NotNull
    public static final Bool2 equal(@NotNull Float2 float2, @NotNull Float2 float3) {
        Intrinsics.checkNotNullParameter(float2, "a");
        Intrinsics.checkNotNullParameter(float3, "b");
        return new Bool2(float2.getX() == float3.getX(), float2.getY() == float3.getY());
    }

    @NotNull
    public static final Bool2 greaterThan(@NotNull Float2 float2, @NotNull Float2 float3) {
        Intrinsics.checkNotNullParameter(float2, "a");
        Intrinsics.checkNotNullParameter(float3, "b");
        return new Bool2(float2.getX() > float3.getY(), float2.getY() > float3.getY());
    }

    @NotNull
    public static final Bool2 greaterThanEqual(@NotNull Float2 float2, @NotNull Float2 float3) {
        Intrinsics.checkNotNullParameter(float2, "a");
        Intrinsics.checkNotNullParameter(float3, "b");
        return new Bool2(float2.getX() >= float3.getX(), float2.getY() >= float3.getY());
    }

    @NotNull
    public static final Bool2 gt(@NotNull Float2 float2, @NotNull Float2 float3) {
        Intrinsics.checkNotNullParameter(float2, "<this>");
        Intrinsics.checkNotNullParameter(float3, "b");
        return new Bool2(float2.getX() > float3.getX(), float2.getY() > float3.getY());
    }

    @NotNull
    public static final Bool2 gte(@NotNull Float2 float2, @NotNull Float2 float3) {
        Intrinsics.checkNotNullParameter(float2, "<this>");
        Intrinsics.checkNotNullParameter(float3, "b");
        return new Bool2(float2.getX() >= float3.getX(), float2.getY() >= float3.getY());
    }

    public static final float length(@NotNull Float3 float3) {
        Intrinsics.checkNotNullParameter(float3, "v");
        return (float) Math.sqrt((float3.getX() * float3.getX()) + (float3.getY() * float3.getY()) + (float3.getZ() * float3.getZ()));
    }

    public static final float length2(@NotNull Float3 float3) {
        Intrinsics.checkNotNullParameter(float3, "v");
        return (float3.getX() * float3.getX()) + (float3.getY() * float3.getY()) + (float3.getZ() * float3.getZ());
    }

    @NotNull
    public static final Bool2 lessThan(@NotNull Float2 float2, @NotNull Float2 float3) {
        Intrinsics.checkNotNullParameter(float2, "a");
        Intrinsics.checkNotNullParameter(float3, "b");
        return new Bool2(float2.getX() < float3.getX(), float2.getY() < float3.getY());
    }

    @NotNull
    public static final Bool2 lessThanEqual(@NotNull Float2 float2, @NotNull Float2 float3) {
        Intrinsics.checkNotNullParameter(float2, "a");
        Intrinsics.checkNotNullParameter(float3, "b");
        return new Bool2(float2.getX() <= float3.getX(), float2.getY() <= float3.getY());
    }

    @NotNull
    public static final Bool2 lt(@NotNull Float2 float2, @NotNull Float2 float3) {
        Intrinsics.checkNotNullParameter(float2, "<this>");
        Intrinsics.checkNotNullParameter(float3, "b");
        return new Bool2(float2.getX() < float3.getX(), float2.getY() < float3.getY());
    }

    @NotNull
    public static final Bool2 lte(@NotNull Float2 float2, @NotNull Float2 float3) {
        Intrinsics.checkNotNullParameter(float2, "<this>");
        Intrinsics.checkNotNullParameter(float3, "b");
        return new Bool2(float2.getX() <= float3.getX(), float2.getY() <= float3.getY());
    }

    @NotNull
    public static final Float2 max(@NotNull Float2 float2, @NotNull Float2 float3) {
        Intrinsics.checkNotNullParameter(float2, "a");
        Intrinsics.checkNotNullParameter(float3, "b");
        return new Float2(Math.max(float2.getX(), float3.getX()), Math.max(float2.getY(), float3.getY()));
    }

    @NotNull
    public static final Float2 min(@NotNull Float2 float2, @NotNull Float2 float3) {
        Intrinsics.checkNotNullParameter(float2, "a");
        Intrinsics.checkNotNullParameter(float3, "b");
        return new Float2(Math.min(float2.getX(), float3.getX()), Math.min(float2.getY(), float3.getY()));
    }

    @NotNull
    public static final Float3 minus(float f, @NotNull Float3 float3) {
        Intrinsics.checkNotNullParameter(float3, "v");
        return new Float3(f - float3.getX(), f - float3.getY(), f - float3.getZ());
    }

    @NotNull
    public static final Bool2 neq(@NotNull Float2 float2, @NotNull Float2 float3) {
        Intrinsics.checkNotNullParameter(float2, "<this>");
        Intrinsics.checkNotNullParameter(float3, "b");
        return new Bool2(!(float2.getX() == float3.getX()), !(float2.getY() == float3.getY()));
    }

    @NotNull
    public static final Bool2 notEqual(@NotNull Float2 float2, @NotNull Float2 float3) {
        Intrinsics.checkNotNullParameter(float2, "a");
        Intrinsics.checkNotNullParameter(float3, "b");
        return new Bool2(!(float2.getX() == float3.getX()), !(float2.getY() == float3.getY()));
    }

    @NotNull
    public static final Float3 plus(float f, @NotNull Float3 float3) {
        Intrinsics.checkNotNullParameter(float3, "v");
        return new Float3(float3.getX() + f, float3.getY() + f, f + float3.getZ());
    }

    @NotNull
    public static final Float3 times(float f, @NotNull Float3 float3) {
        Intrinsics.checkNotNullParameter(float3, "v");
        return new Float3(float3.getX() * f, float3.getY() * f, f * float3.getZ());
    }

    @NotNull
    public static final Float4 abs(@NotNull Float4 float4) {
        Intrinsics.checkNotNullParameter(float4, "v");
        return new Float4(Math.abs(float4.getX()), Math.abs(float4.getY()), Math.abs(float4.getZ()), Math.abs(float4.getW()));
    }

    public static final boolean all(@NotNull Bool4 bool4) {
        Intrinsics.checkNotNullParameter(bool4, "v");
        return bool4.getX() && bool4.getY() && bool4.getZ() && bool4.getW();
    }

    public static final boolean any(@NotNull Bool4 bool4) {
        Intrinsics.checkNotNullParameter(bool4, "v");
        return bool4.getX() || bool4.getY() || bool4.getZ() || bool4.getW();
    }

    public static final float distance(@NotNull Float3 float3, @NotNull Float3 float4) {
        Intrinsics.checkNotNullParameter(float3, "a");
        Intrinsics.checkNotNullParameter(float4, "b");
        Float3 float5 = new Float3(float3.getX() - float4.getX(), float3.getY() - float4.getY(), float3.getZ() - float4.getZ());
        return (float) Math.sqrt((float5.getX() * float5.getX()) + (float5.getY() * float5.getY()) + (float5.getZ() * float5.getZ()));
    }

    @NotNull
    public static final Float4 div(float f, @NotNull Float4 float4) {
        Intrinsics.checkNotNullParameter(float4, "v");
        return new Float4(f / float4.getX(), f / float4.getY(), f / float4.getZ(), f / float4.getW());
    }

    public static final float dot(@NotNull Float4 float4, @NotNull Float4 float5) {
        Intrinsics.checkNotNullParameter(float4, "a");
        Intrinsics.checkNotNullParameter(float5, "b");
        return (float4.getX() * float5.getX()) + (float4.getY() * float5.getY()) + (float4.getZ() * float5.getZ()) + (float4.getW() * float5.getW());
    }

    @NotNull
    public static final Bool3 eq(@NotNull Float3 float3, float f) {
        Intrinsics.checkNotNullParameter(float3, "<this>");
        return new Bool3(float3.getX() == f, float3.getY() == f, float3.getZ() == f);
    }

    @NotNull
    public static final Bool3 equal(@NotNull Float3 float3, float f) {
        Intrinsics.checkNotNullParameter(float3, "a");
        return new Bool3(float3.getX() == f, float3.getY() == f, float3.getZ() == f);
    }

    @NotNull
    public static final Bool3 greaterThan(@NotNull Float3 float3, float f) {
        Intrinsics.checkNotNullParameter(float3, "a");
        return new Bool3(float3.getX() > f, float3.getY() > f, float3.getZ() > f);
    }

    @NotNull
    public static final Bool3 greaterThanEqual(@NotNull Float3 float3, float f) {
        Intrinsics.checkNotNullParameter(float3, "a");
        return new Bool3(float3.getX() >= f, float3.getY() >= f, float3.getZ() >= f);
    }

    @NotNull
    public static final Bool3 gt(@NotNull Float3 float3, float f) {
        Intrinsics.checkNotNullParameter(float3, "<this>");
        return new Bool3(float3.getX() > f, float3.getY() > f, float3.getZ() > f);
    }

    @NotNull
    public static final Bool3 gte(@NotNull Float3 float3, float f) {
        Intrinsics.checkNotNullParameter(float3, "<this>");
        return new Bool3(float3.getX() >= f, float3.getY() >= f, float3.getZ() >= f);
    }

    public static final float length(@NotNull Float4 float4) {
        Intrinsics.checkNotNullParameter(float4, "v");
        return (float) Math.sqrt((float4.getX() * float4.getX()) + (float4.getY() * float4.getY()) + (float4.getZ() * float4.getZ()) + (float4.getW() * float4.getW()));
    }

    public static final float length2(@NotNull Float4 float4) {
        Intrinsics.checkNotNullParameter(float4, "v");
        return (float4.getX() * float4.getX()) + (float4.getY() * float4.getY()) + (float4.getZ() * float4.getZ()) + (float4.getW() * float4.getW());
    }

    @NotNull
    public static final Bool3 lessThan(@NotNull Float3 float3, float f) {
        Intrinsics.checkNotNullParameter(float3, "a");
        return new Bool3(float3.getX() < f, float3.getY() < f, float3.getZ() < f);
    }

    @NotNull
    public static final Bool3 lessThanEqual(@NotNull Float3 float3, float f) {
        Intrinsics.checkNotNullParameter(float3, "a");
        return new Bool3(float3.getX() <= f, float3.getY() <= f, float3.getZ() <= f);
    }

    @NotNull
    public static final Bool3 lt(@NotNull Float3 float3, float f) {
        Intrinsics.checkNotNullParameter(float3, "<this>");
        return new Bool3(float3.getX() < f, float3.getY() < f, float3.getZ() < f);
    }

    @NotNull
    public static final Bool3 lte(@NotNull Float3 float3, float f) {
        Intrinsics.checkNotNullParameter(float3, "<this>");
        return new Bool3(float3.getX() <= f, float3.getY() <= f, float3.getZ() <= f);
    }

    public static final float max(@NotNull Float3 float3) {
        Intrinsics.checkNotNullParameter(float3, "v");
        return Math.max(float3.getX(), Math.max(float3.getY(), float3.getZ()));
    }

    public static final float min(@NotNull Float3 float3) {
        Intrinsics.checkNotNullParameter(float3, "v");
        return Math.min(float3.getX(), Math.min(float3.getY(), float3.getZ()));
    }

    @NotNull
    public static final Float4 minus(float f, @NotNull Float4 float4) {
        Intrinsics.checkNotNullParameter(float4, "v");
        return new Float4(f - float4.getX(), f - float4.getY(), f - float4.getZ(), f - float4.getW());
    }

    @NotNull
    public static final Bool3 neq(@NotNull Float3 float3, float f) {
        Intrinsics.checkNotNullParameter(float3, "<this>");
        return new Bool3(!(float3.getX() == f), !(float3.getY() == f), !(float3.getZ() == f));
    }

    @NotNull
    public static final Float3 normalize(@NotNull Float3 float3) {
        Intrinsics.checkNotNullParameter(float3, "v");
        float fSqrt = 1.0f / ((float) Math.sqrt(((float3.getX() * float3.getX()) + (float3.getY() * float3.getY())) + (float3.getZ() * float3.getZ())));
        return new Float3(float3.getX() * fSqrt, float3.getY() * fSqrt, float3.getZ() * fSqrt);
    }

    @NotNull
    public static final Bool3 notEqual(@NotNull Float3 float3, float f) {
        Intrinsics.checkNotNullParameter(float3, "a");
        return new Bool3(!(float3.getX() == f), !(float3.getY() == f), !(float3.getZ() == f));
    }

    @NotNull
    public static final Float4 plus(float f, @NotNull Float4 float4) {
        Intrinsics.checkNotNullParameter(float4, "v");
        return new Float4(float4.getX() + f, float4.getY() + f, float4.getZ() + f, f + float4.getW());
    }

    @NotNull
    public static final Float4 times(float f, @NotNull Float4 float4) {
        Intrinsics.checkNotNullParameter(float4, "v");
        return new Float4(float4.getX() * f, float4.getY() * f, float4.getZ() * f, f * float4.getW());
    }

    @NotNull
    public static final Bool3 eq(@NotNull Float3 float3, @NotNull Float3 float4) {
        Intrinsics.checkNotNullParameter(float3, "<this>");
        Intrinsics.checkNotNullParameter(float4, "b");
        return new Bool3(float3.getX() == float4.getX(), float3.getY() == float4.getY(), float3.getZ() == float4.getZ());
    }

    @NotNull
    public static final Bool3 equal(@NotNull Float3 float3, @NotNull Float3 float4) {
        Intrinsics.checkNotNullParameter(float3, "a");
        Intrinsics.checkNotNullParameter(float4, "b");
        return new Bool3(float3.getX() == float4.getX(), float3.getY() == float4.getY(), float3.getZ() == float4.getZ());
    }

    @NotNull
    public static final Bool3 greaterThan(@NotNull Float3 float3, @NotNull Float3 float4) {
        Intrinsics.checkNotNullParameter(float3, "a");
        Intrinsics.checkNotNullParameter(float4, "b");
        return new Bool3(float3.getX() > float4.getY(), float3.getY() > float4.getY(), float3.getZ() > float4.getZ());
    }

    @NotNull
    public static final Bool3 greaterThanEqual(@NotNull Float3 float3, @NotNull Float3 float4) {
        Intrinsics.checkNotNullParameter(float3, "a");
        Intrinsics.checkNotNullParameter(float4, "b");
        return new Bool3(float3.getX() >= float4.getX(), float3.getY() >= float4.getY(), float3.getZ() >= float4.getZ());
    }

    @NotNull
    public static final Bool3 gt(@NotNull Float3 float3, @NotNull Float3 float4) {
        Intrinsics.checkNotNullParameter(float3, "<this>");
        Intrinsics.checkNotNullParameter(float4, "b");
        return new Bool3(float3.getX() > float4.getX(), float3.getY() > float4.getY(), float3.getZ() > float4.getZ());
    }

    @NotNull
    public static final Bool3 gte(@NotNull Float3 float3, @NotNull Float3 float4) {
        Intrinsics.checkNotNullParameter(float3, "<this>");
        Intrinsics.checkNotNullParameter(float4, "b");
        return new Bool3(float3.getX() >= float4.getX(), float3.getY() >= float4.getY(), float3.getZ() >= float4.getZ());
    }

    @NotNull
    public static final Bool3 lessThan(@NotNull Float3 float3, @NotNull Float3 float4) {
        Intrinsics.checkNotNullParameter(float3, "a");
        Intrinsics.checkNotNullParameter(float4, "b");
        return new Bool3(float3.getX() < float4.getX(), float3.getY() < float4.getY(), float3.getZ() < float4.getZ());
    }

    @NotNull
    public static final Bool3 lessThanEqual(@NotNull Float3 float3, @NotNull Float3 float4) {
        Intrinsics.checkNotNullParameter(float3, "a");
        Intrinsics.checkNotNullParameter(float4, "b");
        return new Bool3(float3.getX() <= float4.getX(), float3.getY() <= float4.getY(), float3.getZ() <= float4.getZ());
    }

    @NotNull
    public static final Bool3 lt(@NotNull Float3 float3, @NotNull Float3 float4) {
        Intrinsics.checkNotNullParameter(float3, "<this>");
        Intrinsics.checkNotNullParameter(float4, "b");
        return new Bool3(float3.getX() < float4.getX(), float3.getY() < float4.getY(), float3.getZ() < float4.getZ());
    }

    @NotNull
    public static final Bool3 lte(@NotNull Float3 float3, @NotNull Float3 float4) {
        Intrinsics.checkNotNullParameter(float3, "<this>");
        Intrinsics.checkNotNullParameter(float4, "b");
        return new Bool3(float3.getX() <= float4.getX(), float3.getY() <= float4.getY(), float3.getZ() <= float4.getZ());
    }

    @NotNull
    public static final Float3 max(@NotNull Float3 float3, @NotNull Float3 float4) {
        Intrinsics.checkNotNullParameter(float3, "a");
        Intrinsics.checkNotNullParameter(float4, "b");
        return new Float3(Math.max(float3.getX(), float4.getX()), Math.max(float3.getY(), float4.getY()), Math.max(float3.getZ(), float4.getZ()));
    }

    @NotNull
    public static final Float3 min(@NotNull Float3 float3, @NotNull Float3 float4) {
        Intrinsics.checkNotNullParameter(float3, "a");
        Intrinsics.checkNotNullParameter(float4, "b");
        return new Float3(Math.min(float3.getX(), float4.getX()), Math.min(float3.getY(), float4.getY()), Math.min(float3.getZ(), float4.getZ()));
    }

    @NotNull
    public static final Bool3 neq(@NotNull Float3 float3, @NotNull Float3 float4) {
        Intrinsics.checkNotNullParameter(float3, "<this>");
        Intrinsics.checkNotNullParameter(float4, "b");
        return new Bool3(!(float3.getX() == float4.getX()), !(float3.getY() == float4.getY()), !(float3.getZ() == float4.getZ()));
    }

    @NotNull
    public static final Bool3 notEqual(@NotNull Float3 float3, @NotNull Float3 float4) {
        Intrinsics.checkNotNullParameter(float3, "a");
        Intrinsics.checkNotNullParameter(float4, "b");
        return new Bool3(!(float3.getX() == float4.getX()), !(float3.getY() == float4.getY()), !(float3.getZ() == float4.getZ()));
    }

    @NotNull
    public static final Float3 reflect(@NotNull Float3 float3, @NotNull Float3 float4) {
        Intrinsics.checkNotNullParameter(float3, "i");
        Intrinsics.checkNotNullParameter(float4, "n");
        float x = ((float4.getX() * float3.getX()) + (float4.getY() * float3.getY()) + (float4.getZ() * float3.getZ())) * 2.0f;
        Float3 float5 = new Float3(float4.getX() * x, float4.getY() * x, x * float4.getZ());
        return new Float3(float3.getX() - float5.getX(), float3.getY() - float5.getY(), float3.getZ() - float5.getZ());
    }

    @NotNull
    public static final Float3 transform(@NotNull Float3 float3, @NotNull Function1<? super Float, Float> function1) {
        Intrinsics.checkNotNullParameter(float3, "v");
        Intrinsics.checkNotNullParameter(function1, "block");
        Float3 float3Copy$default = Float3.copy$default(float3, vr3.UNSET, vr3.UNSET, vr3.UNSET, 7, null);
        float3Copy$default.setX(((Number) function1.invoke(Float.valueOf(float3Copy$default.getX()))).floatValue());
        float3Copy$default.setY(((Number) function1.invoke(Float.valueOf(float3Copy$default.getY()))).floatValue());
        float3Copy$default.setZ(((Number) function1.invoke(Float.valueOf(float3Copy$default.getZ()))).floatValue());
        return float3Copy$default;
    }

    @NotNull
    public static final Float2 clamp(@NotNull Float2 float2, @NotNull Float2 float3, @NotNull Float2 float4) {
        Intrinsics.checkNotNullParameter(float2, "v");
        Intrinsics.checkNotNullParameter(float3, ParserTag.TAG_MIN);
        Intrinsics.checkNotNullParameter(float4, ParserTag.TAG_MAX);
        float x = float2.getX();
        float x2 = float3.getX();
        float x3 = float4.getX();
        if (x < x2) {
            x = x2;
        } else if (x > x3) {
            x = x3;
        }
        float y = float2.getY();
        float y2 = float3.getY();
        float y3 = float4.getY();
        if (y < y2) {
            y = y2;
        } else if (y > y3) {
            y = y3;
        }
        return new Float2(x, y);
    }

    public static final float distance(@NotNull Float4 float4, @NotNull Float4 float5) {
        Intrinsics.checkNotNullParameter(float4, "a");
        Intrinsics.checkNotNullParameter(float5, "b");
        Float4 float6 = new Float4(float4.getX() - float5.getX(), float4.getY() - float5.getY(), float4.getZ() - float5.getZ(), float4.getW() - float5.getW());
        return (float) Math.sqrt((float6.getX() * float6.getX()) + (float6.getY() * float6.getY()) + (float6.getZ() * float6.getZ()) + (float6.getW() * float6.getW()));
    }

    @NotNull
    public static final Bool4 eq(@NotNull Float4 float4, float f) {
        Intrinsics.checkNotNullParameter(float4, "<this>");
        return new Bool4(float4.getX() == f, float4.getY() == f, float4.getZ() == f, float4.getW() == f);
    }

    @NotNull
    public static final Bool4 equal(@NotNull Float4 float4, float f) {
        Intrinsics.checkNotNullParameter(float4, "a");
        return new Bool4(float4.getX() == f, float4.getY() == f, float4.getZ() == f, float4.getW() == f);
    }

    @NotNull
    public static final Bool4 greaterThan(@NotNull Float4 float4, float f) {
        Intrinsics.checkNotNullParameter(float4, "a");
        return new Bool4(float4.getX() > f, float4.getY() > f, float4.getZ() > f, float4.getW() > f);
    }

    @NotNull
    public static final Bool4 greaterThanEqual(@NotNull Float4 float4, float f) {
        Intrinsics.checkNotNullParameter(float4, "a");
        return new Bool4(float4.getX() >= f, float4.getY() >= f, float4.getZ() >= f, float4.getW() >= f);
    }

    @NotNull
    public static final Bool4 gt(@NotNull Float4 float4, float f) {
        Intrinsics.checkNotNullParameter(float4, "<this>");
        return new Bool4(float4.getX() > f, float4.getY() > f, float4.getZ() > f, float4.getW() > f);
    }

    @NotNull
    public static final Bool4 gte(@NotNull Float4 float4, float f) {
        Intrinsics.checkNotNullParameter(float4, "<this>");
        return new Bool4(float4.getX() >= f, float4.getY() >= f, float4.getZ() >= f, float4.getW() >= f);
    }

    @NotNull
    public static final Bool4 lessThan(@NotNull Float4 float4, float f) {
        Intrinsics.checkNotNullParameter(float4, "a");
        return new Bool4(float4.getX() < f, float4.getY() < f, float4.getZ() < f, float4.getW() < f);
    }

    @NotNull
    public static final Bool4 lessThanEqual(@NotNull Float4 float4, float f) {
        Intrinsics.checkNotNullParameter(float4, "a");
        return new Bool4(float4.getX() <= f, float4.getY() <= f, float4.getZ() <= f, float4.getW() <= f);
    }

    @NotNull
    public static final Bool4 lt(@NotNull Float4 float4, float f) {
        Intrinsics.checkNotNullParameter(float4, "<this>");
        return new Bool4(float4.getX() < f, float4.getY() < f, float4.getZ() < f, float4.getW() < f);
    }

    @NotNull
    public static final Bool4 lte(@NotNull Float4 float4, float f) {
        Intrinsics.checkNotNullParameter(float4, "<this>");
        return new Bool4(float4.getX() <= f, float4.getY() <= f, float4.getZ() <= f, float4.getW() <= f);
    }

    public static final float max(@NotNull Float4 float4) {
        Intrinsics.checkNotNullParameter(float4, "v");
        return Math.max(float4.getX(), Math.max(float4.getY(), Math.max(float4.getZ(), float4.getW())));
    }

    public static final float min(@NotNull Float4 float4) {
        Intrinsics.checkNotNullParameter(float4, "v");
        return Math.min(float4.getX(), Math.min(float4.getY(), Math.min(float4.getZ(), float4.getW())));
    }

    @NotNull
    public static final Float2 mix(@NotNull Float2 float2, @NotNull Float2 float3, @NotNull Float2 float4) {
        Intrinsics.checkNotNullParameter(float2, "a");
        Intrinsics.checkNotNullParameter(float3, "b");
        Intrinsics.checkNotNullParameter(float4, "x");
        float x = float2.getX();
        float x2 = float3.getX();
        float x3 = float4.getX();
        float y = float2.getY();
        float y2 = float3.getY();
        float y3 = float4.getY();
        return new Float2((x * (1.0f - x3)) + (x2 * x3), (y * (1.0f - y3)) + (y2 * y3));
    }

    @NotNull
    public static final Bool4 neq(@NotNull Float4 float4, float f) {
        Intrinsics.checkNotNullParameter(float4, "<this>");
        return new Bool4(!(float4.getX() == f), !(float4.getY() == f), !(float4.getZ() == f), !(float4.getW() == f));
    }

    @NotNull
    public static final Float4 normalize(@NotNull Float4 float4) {
        Intrinsics.checkNotNullParameter(float4, "v");
        float fSqrt = 1.0f / ((float) Math.sqrt((((float4.getX() * float4.getX()) + (float4.getY() * float4.getY())) + (float4.getZ() * float4.getZ())) + (float4.getW() * float4.getW())));
        return new Float4(float4.getX() * fSqrt, float4.getY() * fSqrt, float4.getZ() * fSqrt, float4.getW() * fSqrt);
    }

    @NotNull
    public static final Bool4 notEqual(@NotNull Float4 float4, float f) {
        Intrinsics.checkNotNullParameter(float4, "a");
        return new Bool4(!(float4.getX() == f), !(float4.getY() == f), !(float4.getZ() == f), !(float4.getW() == f));
    }

    @NotNull
    public static final Bool4 eq(@NotNull Float4 float4, @NotNull Float4 float5) {
        Intrinsics.checkNotNullParameter(float4, "<this>");
        Intrinsics.checkNotNullParameter(float5, "b");
        return new Bool4(float4.getX() == float5.getX(), float4.getY() == float5.getY(), float4.getZ() == float5.getZ(), float4.getW() == float5.getW());
    }

    @NotNull
    public static final Bool4 equal(@NotNull Float4 float4, @NotNull Float4 float5) {
        Intrinsics.checkNotNullParameter(float4, "a");
        Intrinsics.checkNotNullParameter(float5, "b");
        return new Bool4(float4.getX() == float5.getX(), float4.getY() == float5.getY(), float4.getZ() == float5.getZ(), float4.getW() == float5.getW());
    }

    @NotNull
    public static final Bool4 greaterThan(@NotNull Float4 float4, @NotNull Float4 float5) {
        Intrinsics.checkNotNullParameter(float4, "a");
        Intrinsics.checkNotNullParameter(float5, "b");
        return new Bool4(float4.getX() > float5.getY(), float4.getY() > float5.getY(), float4.getZ() > float5.getZ(), float4.getW() > float5.getW());
    }

    @NotNull
    public static final Bool4 greaterThanEqual(@NotNull Float4 float4, @NotNull Float4 float5) {
        Intrinsics.checkNotNullParameter(float4, "a");
        Intrinsics.checkNotNullParameter(float5, "b");
        return new Bool4(float4.getX() >= float5.getX(), float4.getY() >= float5.getY(), float4.getZ() >= float5.getZ(), float4.getW() >= float5.getW());
    }

    @NotNull
    public static final Bool4 gt(@NotNull Float4 float4, @NotNull Float4 float5) {
        Intrinsics.checkNotNullParameter(float4, "<this>");
        Intrinsics.checkNotNullParameter(float5, "b");
        return new Bool4(float4.getX() > float5.getX(), float4.getY() > float5.getY(), float4.getZ() > float5.getZ(), float4.getW() > float5.getW());
    }

    @NotNull
    public static final Bool4 gte(@NotNull Float4 float4, @NotNull Float4 float5) {
        Intrinsics.checkNotNullParameter(float4, "<this>");
        Intrinsics.checkNotNullParameter(float5, "b");
        return new Bool4(float4.getX() >= float5.getX(), float4.getY() >= float5.getY(), float4.getZ() >= float5.getZ(), float4.getW() >= float5.getW());
    }

    @NotNull
    public static final Bool4 lessThan(@NotNull Float4 float4, @NotNull Float4 float5) {
        Intrinsics.checkNotNullParameter(float4, "a");
        Intrinsics.checkNotNullParameter(float5, "b");
        return new Bool4(float4.getX() < float5.getX(), float4.getY() < float5.getY(), float4.getZ() < float5.getZ(), float4.getW() < float5.getW());
    }

    @NotNull
    public static final Bool4 lessThanEqual(@NotNull Float4 float4, @NotNull Float4 float5) {
        Intrinsics.checkNotNullParameter(float4, "a");
        Intrinsics.checkNotNullParameter(float5, "b");
        return new Bool4(float4.getX() <= float5.getX(), float4.getY() <= float5.getY(), float4.getZ() <= float5.getZ(), float4.getW() <= float5.getW());
    }

    @NotNull
    public static final Bool4 lte(@NotNull Float4 float4, @NotNull Float4 float5) {
        Intrinsics.checkNotNullParameter(float4, "<this>");
        Intrinsics.checkNotNullParameter(float5, "b");
        return new Bool4(float4.getX() <= float5.getX(), float4.getY() <= float5.getY(), float4.getZ() <= float5.getZ(), float4.getW() <= float5.getW());
    }

    @NotNull
    public static final Float4 max(@NotNull Float4 float4, @NotNull Float4 float5) {
        Intrinsics.checkNotNullParameter(float4, "a");
        Intrinsics.checkNotNullParameter(float5, "b");
        return new Float4(Math.max(float4.getX(), float5.getX()), Math.max(float4.getY(), float5.getY()), Math.max(float4.getZ(), float5.getZ()), Math.max(float4.getW(), float5.getW()));
    }

    @NotNull
    public static final Float4 min(@NotNull Float4 float4, @NotNull Float4 float5) {
        Intrinsics.checkNotNullParameter(float4, "a");
        Intrinsics.checkNotNullParameter(float5, "b");
        return new Float4(Math.min(float4.getX(), float5.getX()), Math.min(float4.getY(), float5.getY()), Math.min(float4.getZ(), float5.getZ()), Math.min(float4.getW(), float5.getW()));
    }

    @NotNull
    public static final Bool4 neq(@NotNull Float4 float4, @NotNull Float4 float5) {
        Intrinsics.checkNotNullParameter(float4, "<this>");
        Intrinsics.checkNotNullParameter(float5, "b");
        return new Bool4(!(float4.getX() == float5.getX()), !(float4.getY() == float5.getY()), !(float4.getZ() == float5.getZ()), !(float4.getW() == float5.getW()));
    }

    @NotNull
    public static final Bool4 notEqual(@NotNull Float4 float4, @NotNull Float4 float5) {
        Intrinsics.checkNotNullParameter(float4, "a");
        Intrinsics.checkNotNullParameter(float5, "b");
        return new Bool4(!(float4.getX() == float5.getX()), !(float4.getY() == float5.getY()), !(float4.getZ() == float5.getZ()), !(float4.getW() == float5.getW()));
    }

    @NotNull
    public static final Float3 refract(@NotNull Float3 float3, @NotNull Float3 float4, float f) {
        Intrinsics.checkNotNullParameter(float3, "i");
        Intrinsics.checkNotNullParameter(float4, "n");
        float x = (float4.getX() * float3.getX()) + (float4.getY() * float3.getY()) + (float4.getZ() * float3.getZ());
        float f2 = 1.0f - ((f * f) * (1.0f - (x * x)));
        if (f2 < vr3.UNSET) {
            return new Float3(vr3.UNSET);
        }
        Float3 float5 = new Float3(float3.getX() * f, float3.getY() * f, float3.getZ() * f);
        float fSqrt = (f * x) + ((float) Math.sqrt(f2));
        Float3 float6 = new Float3(float4.getX() * fSqrt, float4.getY() * fSqrt, fSqrt * float4.getZ());
        return new Float3(float5.getX() - float6.getX(), float5.getY() - float6.getY(), float5.getZ() - float6.getZ());
    }

    @NotNull
    public static final Bool4 lt(@NotNull Float4 float4, @NotNull Float4 float5) {
        Intrinsics.checkNotNullParameter(float4, "<this>");
        Intrinsics.checkNotNullParameter(float5, "b");
        return new Bool4(float4.getX() < float5.getX(), float4.getY() < float5.getY(), float4.getZ() < float5.getZ(), float4.getW() < float5.getW());
    }

    @NotNull
    public static final Float4 transform(@NotNull Float4 float4, @NotNull Function1<? super Float, Float> function1) {
        Intrinsics.checkNotNullParameter(float4, "v");
        Intrinsics.checkNotNullParameter(function1, "block");
        Float4 float4Copy$default = Float4.copy$default(float4, vr3.UNSET, vr3.UNSET, vr3.UNSET, vr3.UNSET, 15, null);
        float4Copy$default.setX(((Number) function1.invoke(Float.valueOf(float4Copy$default.getX()))).floatValue());
        float4Copy$default.setY(((Number) function1.invoke(Float.valueOf(float4Copy$default.getY()))).floatValue());
        float4Copy$default.setZ(((Number) function1.invoke(Float.valueOf(float4Copy$default.getZ()))).floatValue());
        float4Copy$default.setW(((Number) function1.invoke(Float.valueOf(float4Copy$default.getW()))).floatValue());
        return float4Copy$default;
    }

    @NotNull
    public static final Float3 clamp(@NotNull Float3 float3, float f, float f2) {
        Intrinsics.checkNotNullParameter(float3, "v");
        float x = float3.getX();
        if (x < f) {
            x = f;
        } else if (x > f2) {
            x = f2;
        }
        float y = float3.getY();
        if (y < f) {
            y = f;
        } else if (y > f2) {
            y = f2;
        }
        float z = float3.getZ();
        if (z >= f) {
            f = z > f2 ? f2 : z;
        }
        return new Float3(x, y, f);
    }

    @NotNull
    public static final Float3 mix(@NotNull Float3 float3, @NotNull Float3 float4, float f) {
        Intrinsics.checkNotNullParameter(float3, "a");
        Intrinsics.checkNotNullParameter(float4, "b");
        float f2 = 1.0f - f;
        return new Float3((float3.getX() * f2) + (float4.getX() * f), (float3.getY() * f2) + (float4.getY() * f), (float3.getZ() * f2) + (float4.getZ() * f));
    }

    @NotNull
    public static final Float3 clamp(@NotNull Float3 float3, @NotNull Float3 float4, @NotNull Float3 float5) {
        Intrinsics.checkNotNullParameter(float3, "v");
        Intrinsics.checkNotNullParameter(float4, ParserTag.TAG_MIN);
        Intrinsics.checkNotNullParameter(float5, ParserTag.TAG_MAX);
        float x = float3.getX();
        float x2 = float4.getX();
        float x3 = float5.getX();
        if (x < x2) {
            x = x2;
        } else if (x > x3) {
            x = x3;
        }
        float y = float3.getY();
        float y2 = float4.getY();
        float y3 = float5.getY();
        if (y < y2) {
            y = y2;
        } else if (y > y3) {
            y = y3;
        }
        float z = float3.getZ();
        float z2 = float4.getZ();
        float z3 = float5.getZ();
        if (z < z2) {
            z = z2;
        } else if (z > z3) {
            z = z3;
        }
        return new Float3(x, y, z);
    }

    @NotNull
    public static final Float3 mix(@NotNull Float3 float3, @NotNull Float3 float4, @NotNull Float3 float5) {
        Intrinsics.checkNotNullParameter(float3, "a");
        Intrinsics.checkNotNullParameter(float4, "b");
        Intrinsics.checkNotNullParameter(float5, "x");
        float x = float3.getX();
        float x2 = float4.getX();
        float x3 = float5.getX();
        float f = (x * (1.0f - x3)) + (x2 * x3);
        float y = float3.getY();
        float y2 = float4.getY();
        float y3 = float5.getY();
        float z = float3.getZ();
        float z2 = float4.getZ();
        float z3 = float5.getZ();
        return new Float3(f, (y * (1.0f - y3)) + (y2 * y3), (z * (1.0f - z3)) + (z2 * z3));
    }

    @NotNull
    public static final Float4 clamp(@NotNull Float4 float4, float f, float f2) {
        Intrinsics.checkNotNullParameter(float4, "v");
        float x = float4.getX();
        if (x < f) {
            x = f;
        } else if (x > f2) {
            x = f2;
        }
        float y = float4.getY();
        if (y < f) {
            y = f;
        } else if (y > f2) {
            y = f2;
        }
        float z = float4.getZ();
        if (z < f) {
            z = f;
        } else if (z > f2) {
            z = f2;
        }
        float w = float4.getW();
        if (w >= f) {
            f = w > f2 ? f2 : w;
        }
        return new Float4(x, y, z, f);
    }

    @NotNull
    public static final Float4 mix(@NotNull Float4 float4, @NotNull Float4 float5, float f) {
        Intrinsics.checkNotNullParameter(float4, "a");
        Intrinsics.checkNotNullParameter(float5, "b");
        float f2 = 1.0f - f;
        return new Float4((float4.getX() * f2) + (float5.getX() * f), (float4.getY() * f2) + (float5.getY() * f), (float4.getZ() * f2) + (float5.getZ() * f), (float4.getW() * f2) + (float5.getW() * f));
    }

    @NotNull
    public static final Float4 clamp(@NotNull Float4 float4, @NotNull Float4 float5, @NotNull Float4 float6) {
        Intrinsics.checkNotNullParameter(float4, "v");
        Intrinsics.checkNotNullParameter(float5, ParserTag.TAG_MIN);
        Intrinsics.checkNotNullParameter(float6, ParserTag.TAG_MAX);
        float x = float4.getX();
        float x2 = float5.getX();
        float x3 = float6.getX();
        if (x < x2) {
            x = x2;
        } else if (x > x3) {
            x = x3;
        }
        float y = float4.getY();
        float y2 = float5.getY();
        float y3 = float6.getY();
        if (y < y2) {
            y = y2;
        } else if (y > y3) {
            y = y3;
        }
        float z = float4.getZ();
        float z2 = float5.getZ();
        float z3 = float6.getZ();
        if (z < z2) {
            z = z2;
        } else if (z > z3) {
            z = z3;
        }
        float w = float4.getW();
        float z4 = float5.getZ();
        float w2 = float6.getW();
        if (w < z4) {
            w = z4;
        } else if (w > w2) {
            w = w2;
        }
        return new Float4(x, y, z, w);
    }

    @NotNull
    public static final Float4 mix(@NotNull Float4 float4, @NotNull Float4 float5, @NotNull Float4 float6) {
        Intrinsics.checkNotNullParameter(float4, "a");
        Intrinsics.checkNotNullParameter(float5, "b");
        Intrinsics.checkNotNullParameter(float6, "x");
        float x = float4.getX();
        float x2 = float5.getX();
        float x3 = float6.getX();
        float f = (x * (1.0f - x3)) + (x2 * x3);
        float y = float4.getY();
        float y2 = float5.getY();
        float y3 = float6.getY();
        float f2 = (y * (1.0f - y3)) + (y2 * y3);
        float z = float4.getZ();
        float z2 = float5.getZ();
        float z3 = float6.getZ();
        float w = float4.getW();
        float w2 = float5.getW();
        float w3 = float6.getW();
        return new Float4(f, f2, (z * (1.0f - z3)) + (z2 * z3), (w * (1.0f - w3)) + (w2 * w3));
    }
}
