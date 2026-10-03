package androidx.compose.ui.geometry;

import androidx.compose.ui.util.MathHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.oplus.aiunit.vision.y04;
import com.oplus.channel.client.data.Action;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0019\u001a#\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001cø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001aC\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020\u001c2\b\b\u0002\u0010!\u001a\u00020\u001c2\b\b\u0002\u0010\"\u001a\u00020\u001cø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u001e\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0012\u001a;\u0010\u0019\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a6\u0010\u0019\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0012\u001a\u001e\u0010-\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u0012\u001a\u001f\u00101\u001a\u00020\u0002*\u00020\u00022\u0006\u00102\u001a\u00020\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u00104\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00028Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0015\u0010\t\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b\"\u0015\u0010\f\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000b\"\u0015\u0010\r\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b\"\u0015\u0010\u000e\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000b\"\u0015\u0010\u000f\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b\"\u0015\u0010\u0010\u001a\u00020\n*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000b\"\u0015\u0010\u0011\u001a\u00020\u0012*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u0015\u001a\u00020\u0012*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014\"\u0015\u0010\u0017\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0004\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"boundingRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/geometry/RoundRect;", "getBoundingRect", "(Landroidx/compose/ui/geometry/RoundRect;)Landroidx/compose/ui/geometry/Rect;", "center", "Landroidx/compose/ui/geometry/Offset;", "getCenter", "(Landroidx/compose/ui/geometry/RoundRect;)J", "isCircle", "", "(Landroidx/compose/ui/geometry/RoundRect;)Z", "isEllipse", "isEmpty", "isFinite", "isRect", "isSimple", "maxDimension", "", "getMaxDimension", "(Landroidx/compose/ui/geometry/RoundRect;)F", "minDimension", "getMinDimension", "safeInnerRect", "getSafeInnerRect", "RoundRect", "rect", ParserTag.TAG_CORNER_RADIUS, "Landroidx/compose/ui/geometry/CornerRadius;", "RoundRect-sniSvfs", "(Landroidx/compose/ui/geometry/Rect;J)Landroidx/compose/ui/geometry/RoundRect;", "topLeft", "topRight", "bottomRight", "bottomLeft", "RoundRect-ZAM2FJo", "(Landroidx/compose/ui/geometry/Rect;JJJJ)Landroidx/compose/ui/geometry/RoundRect;", "radiusX", "radiusY", y04.TIME_STYLE_LEFT_DIR_NAME, "top", y04.TIME_STYLE_RIGHT_DIR_NAME, "bottom", "RoundRect-gG7oq9Y", "(FFFFJ)Landroidx/compose/ui/geometry/RoundRect;", "lerp", "start", Action.LIFE_CIRCLE_VALUE_STOP, "fraction", "translate", TypedValues.CycleType.S_WAVE_OFFSET, "translate-Uv8p0NA", "(Landroidx/compose/ui/geometry/RoundRect;J)Landroidx/compose/ui/geometry/RoundRect;", "ui-geometry_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class RoundRectKt {
    @NotNull
    public static final RoundRect RoundRect(float f, float f2, float f3, float f4, float f5, float f6) {
        long jCornerRadius = CornerRadiusKt.CornerRadius(f5, f6);
        return new RoundRect(f, f2, f3, f4, jCornerRadius, jCornerRadius, jCornerRadius, jCornerRadius, null);
    }

    @NotNull
    /* JADX INFO: renamed from: RoundRect-ZAM2FJo, reason: not valid java name */
    public static final RoundRect m1432RoundRectZAM2FJo(@NotNull Rect rect, long j2, long j3, long j4, long j5) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return new RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), j2, j3, j4, j5, null);
    }

    @NotNull
    /* JADX INFO: renamed from: RoundRect-gG7oq9Y, reason: not valid java name */
    public static final RoundRect m1434RoundRectgG7oq9Y(float f, float f2, float f3, float f4, long j2) {
        return RoundRect(f, f2, f3, f4, CornerRadius.m1355getXimpl(j2), CornerRadius.m1356getYimpl(j2));
    }

    @NotNull
    /* JADX INFO: renamed from: RoundRect-sniSvfs, reason: not valid java name */
    public static final RoundRect m1435RoundRectsniSvfs(@NotNull Rect rect, long j2) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return RoundRect(rect, CornerRadius.m1355getXimpl(j2), CornerRadius.m1356getYimpl(j2));
    }

    @NotNull
    public static final Rect getBoundingRect(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return new Rect(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
    }

    public static final long getCenter(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return OffsetKt.Offset(roundRect.getLeft() + (roundRect.getWidth() / 2.0f), roundRect.getTop() + (roundRect.getHeight() / 2.0f));
    }

    public static final float getMaxDimension(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return Math.max(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    public static final float getMinDimension(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return Math.min(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    @NotNull
    public static final Rect getSafeInnerRect(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return new Rect(roundRect.getLeft() + (Math.max(CornerRadius.m1355getXimpl(roundRect.m1428getBottomLeftCornerRadiuskKHJgLs()), CornerRadius.m1355getXimpl(roundRect.m1430getTopLeftCornerRadiuskKHJgLs())) * 0.29289323f), roundRect.getTop() + (Math.max(CornerRadius.m1356getYimpl(roundRect.m1430getTopLeftCornerRadiuskKHJgLs()), CornerRadius.m1356getYimpl(roundRect.m1431getTopRightCornerRadiuskKHJgLs())) * 0.29289323f), roundRect.getRight() - (Math.max(CornerRadius.m1355getXimpl(roundRect.m1431getTopRightCornerRadiuskKHJgLs()), CornerRadius.m1355getXimpl(roundRect.m1429getBottomRightCornerRadiuskKHJgLs())) * 0.29289323f), roundRect.getBottom() - (Math.max(CornerRadius.m1356getYimpl(roundRect.m1429getBottomRightCornerRadiuskKHJgLs()), CornerRadius.m1356getYimpl(roundRect.m1428getBottomLeftCornerRadiuskKHJgLs())) * 0.29289323f));
    }

    public static final boolean isCircle(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return ((roundRect.getWidth() > roundRect.getHeight() ? 1 : (roundRect.getWidth() == roundRect.getHeight() ? 0 : -1)) == 0) && isEllipse(roundRect);
    }

    public static final boolean isEllipse(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        if (CornerRadius.m1355getXimpl(roundRect.m1430getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1355getXimpl(roundRect.m1431getTopRightCornerRadiuskKHJgLs())) {
            if (CornerRadius.m1356getYimpl(roundRect.m1430getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1356getYimpl(roundRect.m1431getTopRightCornerRadiuskKHJgLs())) {
                if (CornerRadius.m1355getXimpl(roundRect.m1431getTopRightCornerRadiuskKHJgLs()) == CornerRadius.m1355getXimpl(roundRect.m1429getBottomRightCornerRadiuskKHJgLs())) {
                    if (CornerRadius.m1356getYimpl(roundRect.m1431getTopRightCornerRadiuskKHJgLs()) == CornerRadius.m1356getYimpl(roundRect.m1429getBottomRightCornerRadiuskKHJgLs())) {
                        if (CornerRadius.m1355getXimpl(roundRect.m1429getBottomRightCornerRadiuskKHJgLs()) == CornerRadius.m1355getXimpl(roundRect.m1428getBottomLeftCornerRadiuskKHJgLs())) {
                            if ((CornerRadius.m1356getYimpl(roundRect.m1429getBottomRightCornerRadiuskKHJgLs()) == CornerRadius.m1356getYimpl(roundRect.m1428getBottomLeftCornerRadiuskKHJgLs())) && roundRect.getWidth() <= ((double) CornerRadius.m1355getXimpl(roundRect.m1430getTopLeftCornerRadiuskKHJgLs())) * 2.0d && roundRect.getHeight() <= ((double) CornerRadius.m1356getYimpl(roundRect.m1430getTopLeftCornerRadiuskKHJgLs())) * 2.0d) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean isEmpty(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        return roundRect.getLeft() >= roundRect.getRight() || roundRect.getTop() >= roundRect.getBottom();
    }

    public static final boolean isFinite(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        float left = roundRect.getLeft();
        if ((Float.isInfinite(left) || Float.isNaN(left)) ? false : true) {
            float top = roundRect.getTop();
            if ((Float.isInfinite(top) || Float.isNaN(top)) ? false : true) {
                float right = roundRect.getRight();
                if ((Float.isInfinite(right) || Float.isNaN(right)) ? false : true) {
                    float bottom = roundRect.getBottom();
                    if ((Float.isInfinite(bottom) || Float.isNaN(bottom)) ? false : true) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    /* JADX WARN: Code duplicated, block: B:20:0x0049  */
    /* JADX WARN: Code duplicated, block: B:22:0x004c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0058  */
    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0069  */
    /* JADX WARN: Code duplicated, block: B:30:0x006b  */
    /* JADX WARN: Code duplicated, block: B:32:0x006e  */
    /* JADX WARN: Code duplicated, block: B:34:0x007a  */
    /* JADX WARN: Code duplicated, block: B:35:0x007c  */
    /* JADX WARN: Code duplicated, block: B:37:0x007f  */
    /* JADX WARN: Code duplicated, block: B:39:0x008b  */
    /* JADX WARN: Code duplicated, block: B:40:0x008d  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    public static final boolean isRect(@NotNull RoundRect roundRect) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        if (CornerRadius.m1355getXimpl(roundRect.m1430getTopLeftCornerRadiuskKHJgLs()) == 0.0f) {
            if (CornerRadius.m1355getXimpl(roundRect.m1431getTopRightCornerRadiuskKHJgLs()) == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (CornerRadius.m1355getXimpl(roundRect.m1428getBottomLeftCornerRadiuskKHJgLs()) == 0.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (CornerRadius.m1355getXimpl(roundRect.m1429getBottomRightCornerRadiuskKHJgLs()) == 0.0f) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        return true;
                    }
                    if (CornerRadius.m1356getYimpl(roundRect.m1429getBottomRightCornerRadiuskKHJgLs()) == 0.0f) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        return true;
                    }
                } else {
                    if (CornerRadius.m1356getYimpl(roundRect.m1428getBottomLeftCornerRadiuskKHJgLs()) == 0.0f) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        if (CornerRadius.m1355getXimpl(roundRect.m1429getBottomRightCornerRadiuskKHJgLs()) == 0.0f) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!z3) {
                            return true;
                        }
                        if (CornerRadius.m1356getYimpl(roundRect.m1429getBottomRightCornerRadiuskKHJgLs()) == 0.0f) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            return true;
                        }
                    }
                }
            } else {
                if (CornerRadius.m1356getYimpl(roundRect.m1431getTopRightCornerRadiuskKHJgLs()) == 0.0f) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6) {
                    if (CornerRadius.m1355getXimpl(roundRect.m1428getBottomLeftCornerRadiuskKHJgLs()) == 0.0f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        if (CornerRadius.m1355getXimpl(roundRect.m1429getBottomRightCornerRadiuskKHJgLs()) == 0.0f) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!z3) {
                            return true;
                        }
                        if (CornerRadius.m1356getYimpl(roundRect.m1429getBottomRightCornerRadiuskKHJgLs()) == 0.0f) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            return true;
                        }
                    } else {
                        if (CornerRadius.m1356getYimpl(roundRect.m1428getBottomLeftCornerRadiuskKHJgLs()) == 0.0f) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            if (CornerRadius.m1355getXimpl(roundRect.m1429getBottomRightCornerRadiuskKHJgLs()) == 0.0f) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (!z3) {
                                return true;
                            }
                            if (CornerRadius.m1356getYimpl(roundRect.m1429getBottomRightCornerRadiuskKHJgLs()) == 0.0f) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                return true;
                            }
                        }
                    }
                }
            }
        } else {
            if (CornerRadius.m1356getYimpl(roundRect.m1430getTopLeftCornerRadiuskKHJgLs()) == 0.0f) {
                if (CornerRadius.m1355getXimpl(roundRect.m1431getTopRightCornerRadiuskKHJgLs()) == 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (CornerRadius.m1355getXimpl(roundRect.m1428getBottomLeftCornerRadiuskKHJgLs()) == 0.0f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        if (CornerRadius.m1355getXimpl(roundRect.m1429getBottomRightCornerRadiuskKHJgLs()) == 0.0f) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!z3) {
                            return true;
                        }
                        if (CornerRadius.m1356getYimpl(roundRect.m1429getBottomRightCornerRadiuskKHJgLs()) == 0.0f) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            return true;
                        }
                    } else {
                        if (CornerRadius.m1356getYimpl(roundRect.m1428getBottomLeftCornerRadiuskKHJgLs()) == 0.0f) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            if (CornerRadius.m1355getXimpl(roundRect.m1429getBottomRightCornerRadiuskKHJgLs()) == 0.0f) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (!z3) {
                                return true;
                            }
                            if (CornerRadius.m1356getYimpl(roundRect.m1429getBottomRightCornerRadiuskKHJgLs()) == 0.0f) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                return true;
                            }
                        }
                    }
                } else {
                    if (CornerRadius.m1356getYimpl(roundRect.m1431getTopRightCornerRadiuskKHJgLs()) == 0.0f) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (z6) {
                        if (CornerRadius.m1355getXimpl(roundRect.m1428getBottomLeftCornerRadiuskKHJgLs()) == 0.0f) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            if (CornerRadius.m1355getXimpl(roundRect.m1429getBottomRightCornerRadiuskKHJgLs()) == 0.0f) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (!z3) {
                                return true;
                            }
                            if (CornerRadius.m1356getYimpl(roundRect.m1429getBottomRightCornerRadiuskKHJgLs()) == 0.0f) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                return true;
                            }
                        } else {
                            if (CornerRadius.m1356getYimpl(roundRect.m1428getBottomLeftCornerRadiuskKHJgLs()) == 0.0f) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                                if (CornerRadius.m1355getXimpl(roundRect.m1429getBottomRightCornerRadiuskKHJgLs()) == 0.0f) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (!z3) {
                                    return true;
                                }
                                if (CornerRadius.m1356getYimpl(roundRect.m1429getBottomRightCornerRadiuskKHJgLs()) == 0.0f) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z4) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean isSimple(@NotNull RoundRect roundRect) {
        Intrinsics.checkNotNullParameter(roundRect, "<this>");
        if (CornerRadius.m1355getXimpl(roundRect.m1430getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1356getYimpl(roundRect.m1430getTopLeftCornerRadiuskKHJgLs())) {
            if (CornerRadius.m1355getXimpl(roundRect.m1430getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1355getXimpl(roundRect.m1431getTopRightCornerRadiuskKHJgLs())) {
                if (CornerRadius.m1355getXimpl(roundRect.m1430getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1356getYimpl(roundRect.m1431getTopRightCornerRadiuskKHJgLs())) {
                    if (CornerRadius.m1355getXimpl(roundRect.m1430getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1355getXimpl(roundRect.m1429getBottomRightCornerRadiuskKHJgLs())) {
                        if (CornerRadius.m1355getXimpl(roundRect.m1430getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1356getYimpl(roundRect.m1429getBottomRightCornerRadiuskKHJgLs())) {
                            if (CornerRadius.m1355getXimpl(roundRect.m1430getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1355getXimpl(roundRect.m1428getBottomLeftCornerRadiuskKHJgLs())) {
                                if (CornerRadius.m1355getXimpl(roundRect.m1430getTopLeftCornerRadiuskKHJgLs()) == CornerRadius.m1356getYimpl(roundRect.m1428getBottomLeftCornerRadiuskKHJgLs())) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @NotNull
    public static final RoundRect lerp(@NotNull RoundRect start, @NotNull RoundRect stop, float f) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        return new RoundRect(MathHelpersKt.lerp(start.getLeft(), stop.getLeft(), f), MathHelpersKt.lerp(start.getTop(), stop.getTop(), f), MathHelpersKt.lerp(start.getRight(), stop.getRight(), f), MathHelpersKt.lerp(start.getBottom(), stop.getBottom(), f), CornerRadiusKt.m1366lerp3Ry4LBc(start.m1430getTopLeftCornerRadiuskKHJgLs(), stop.m1430getTopLeftCornerRadiuskKHJgLs(), f), CornerRadiusKt.m1366lerp3Ry4LBc(start.m1431getTopRightCornerRadiuskKHJgLs(), stop.m1431getTopRightCornerRadiuskKHJgLs(), f), CornerRadiusKt.m1366lerp3Ry4LBc(start.m1429getBottomRightCornerRadiuskKHJgLs(), stop.m1429getBottomRightCornerRadiuskKHJgLs(), f), CornerRadiusKt.m1366lerp3Ry4LBc(start.m1428getBottomLeftCornerRadiuskKHJgLs(), stop.m1428getBottomLeftCornerRadiuskKHJgLs(), f), null);
    }

    @NotNull
    /* JADX INFO: renamed from: translate-Uv8p0NA, reason: not valid java name */
    public static final RoundRect m1436translateUv8p0NA(@NotNull RoundRect translate, long j2) {
        Intrinsics.checkNotNullParameter(translate, "$this$translate");
        return new RoundRect(translate.getLeft() + Offset.m1380getXimpl(j2), translate.getTop() + Offset.m1381getYimpl(j2), translate.getRight() + Offset.m1380getXimpl(j2), translate.getBottom() + Offset.m1381getYimpl(j2), translate.m1430getTopLeftCornerRadiuskKHJgLs(), translate.m1431getTopRightCornerRadiuskKHJgLs(), translate.m1429getBottomRightCornerRadiuskKHJgLs(), translate.m1428getBottomLeftCornerRadiuskKHJgLs(), null);
    }

    @NotNull
    public static final RoundRect RoundRect(@NotNull Rect rect, float f, float f2) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        return RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f, f2);
    }
}
