package com.coui.appcompat.grid;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Size;
import com.coui.component.responsiveui.ResponsiveUIModel;
import com.coui.component.responsiveui.layoutgrid.MarginType;
import com.coui.component.responsiveui.unit.Dp;
import com.coui.component.responsiveui.window.WindowSizeClass;
import com.coui.component.responsiveui.window.WindowTotalSizeClass;
import com.coui.component.responsiveui.window.WindowWidthSizeClass;
import com.oplus.aiunit.vision.bj2;
import com.oplus.aiunit.vision.ifk;
import com.oplus.aiunit.vision.qa0;
import com.support.responsiveui.R$dimen;
import java.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class COUIResponsiveUtils {
    private static final int AUTO_GRID_NUMBER = -1;
    private static final int CARD_LIST_FLAG = 2;
    private static boolean DEBUG = false;
    private static final int DEFAULT_COLUMNS_FOR_CHILD = 8;
    private static final int DEFAULT_COLUMNS_FOR_COMPAT = 4;
    private static final int DEFAULT_COLUMNS_FOR_EXPANDED = 8;
    private static final int DEFAULT_COLUMNS_FOR_MEDIUM = 6;
    private static final int DEFAULT_FLAG = 0;
    private static final int LARGE_PADDING = 0;
    private static final int LIST_FLAG = 1;
    private static final int MARGIN_LARGE_DP_IN_LARGE_SCREEN = 40;
    private static final int MARGIN_LARGE_DP_IN_NON_LARGE_SCREEN = 24;
    private static final int PADDING_COUNT = 2;
    private static final int PADDING_MODE = 0;
    private static final int REMEASURE_MODE = 1;
    private static final int SMALL_PADDING = 1;
    private static final String TAG = "COUIResponsiveUtils";
    private static int sCouiFoldType;
    private static final Rect sRect = new Rect();
    private static final Point sPoint = new Point();

    static {
        DEBUG = bj2.LOG_DEBUG || bj2.e(TAG, 3);
        sCouiFoldType = -1;
    }

    public static void calculatePadding(ResponsiveUIModel responsiveUIModel, int i, int i2, boolean z, @NonNull @Size(2) float[] fArr) {
        int iMargin = responsiveUIModel.margin();
        int iGutter = responsiveUIModel.gutter();
        int iColumnCount = responsiveUIModel.columnCount();
        int[] iArrColumnWidth = responsiveUIModel.columnWidth();
        int i3 = (iColumnCount - i) / 2;
        if (z) {
            iMargin -= i2;
        }
        float f = iMargin;
        fArr[1] = f;
        fArr[0] = f;
        for (int i4 = 0; i4 < i3; i4++) {
            fArr[0] = fArr[0] + iArrColumnWidth[i4];
            fArr[1] = fArr[1] + iArrColumnWidth[(iColumnCount - i4) - 1];
        }
        float f2 = i3 * iGutter;
        fArr[0] = fArr[0] + f2;
        fArr[1] = fArr[1] + f2;
    }

    public static float calculateWidth(ResponsiveUIModel responsiveUIModel, int i, int i2, boolean z) {
        int iColumnCount = (responsiveUIModel.columnCount() - i) / 2;
        float fWidth = responsiveUIModel.width(iColumnCount, (i + iColumnCount) - 1);
        if (DEBUG) {
            Log.d(TAG, "calculateWidth: width = " + fWidth);
        }
        if (!z) {
            i2 = 0;
        }
        return fWidth + (i2 * 2);
    }

    public static int getChildLayerDefaultTypeMargin(Context context, int i) {
        return (int) ((isLargeScreen(context, i) ? 40 : 24) * context.getResources().getDisplayMetrics().density);
    }

    public static int getDefaultGridNumbers(ResponsiveUIModel responsiveUIModel) {
        WindowTotalSizeClass windowTotalSizeClass = responsiveUIModel.windowSizeClass().getWindowTotalSizeClass();
        if (windowTotalSizeClass.equals(WindowTotalSizeClass.Compact)) {
            return 4;
        }
        if (windowTotalSizeClass.equals(WindowTotalSizeClass.Expanded)) {
            return 8;
        }
        return (windowTotalSizeClass.equals(WindowTotalSizeClass.MediumLandScape) || windowTotalSizeClass.equals(WindowTotalSizeClass.MediumPortrait) || windowTotalSizeClass.equals(WindowTotalSizeClass.MediumSquare) || windowTotalSizeClass.equals(WindowTotalSizeClass.ExpandedLandPortrait) || windowTotalSizeClass.equals(WindowTotalSizeClass.ExpandedPortrait)) ? 6 : 4;
    }

    public static int getScreenPhysicalHeight(Activity activity) {
        if (Build.VERSION.SDK_INT >= 30) {
            return activity.getWindowManager().getMaximumWindowMetrics().getBounds().height();
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = sPoint;
        defaultDisplay.getRealSize(point);
        return point.y;
    }

    public static int getScreenPhysicalWidth(Activity activity) {
        if (Build.VERSION.SDK_INT >= 30) {
            return activity.getWindowManager().getMaximumWindowMetrics().getBounds().width();
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = sPoint;
        defaultDisplay.getRealSize(point);
        return point.x;
    }

    @Deprecated
    public static boolean isActivityEmbedded(Context context) {
        return false;
    }

    public static boolean isLargePadWindow(Context context, int i, int i2) {
        if (sCouiFoldType == -1) {
            sCouiFoldType = qa0.a(context) ? 1 : 0;
        }
        return (isLargeScreenDp(i, i2) || isLargeScreenDp(i2, i)) && sCouiFoldType != 1;
    }

    @Deprecated
    public static boolean isLargeScreen(Context context, int i) {
        return WindowWidthSizeClass.INSTANCE.fromWidth(context, i) == WindowWidthSizeClass.Expanded;
    }

    @Deprecated
    public static boolean isLargeScreenDp(int i) {
        return WindowWidthSizeClass.INSTANCE.fromWidth(new Dp((float) i)) == WindowWidthSizeClass.Expanded;
    }

    @Deprecated
    public static boolean isMediumScreen(Context context, int i) {
        return WindowWidthSizeClass.INSTANCE.fromWidth(context, i) == WindowWidthSizeClass.Medium;
    }

    @Deprecated
    public static boolean isMediumScreenDp(int i) {
        return WindowWidthSizeClass.INSTANCE.fromWidth(new Dp((float) i)) == WindowWidthSizeClass.Medium;
    }

    public static boolean isSmallScreen(Context context, int i) {
        return WindowWidthSizeClass.INSTANCE.fromWidth(context, i) == WindowWidthSizeClass.Compact;
    }

    public static boolean isSmallScreenDp(int i) {
        return WindowWidthSizeClass.INSTANCE.fromWidth(new Dp((float) i)) == WindowWidthSizeClass.Compact;
    }

    public static void measureChildWithPercent(Context context, View view, int i, int i2, int i3, int i4, int i5) {
        if (i4 != 0) {
            if (i5 != 0) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.width = (int) calculateWidth(View.MeasureSpec.getSize(i), i4, i2, i3, context);
                view.setLayoutParams(layoutParams);
            } else {
                int size = (View.MeasureSpec.getSize(i) - ((int) calculateWidth(View.MeasureSpec.getSize(i), i4, i2, i3, context))) / 2;
                if (view.getPaddingLeft() == size && view.getPaddingRight() == size) {
                    return;
                }
                view.setPaddingRelative(size, view.getPaddingTop(), size, view.getPaddingBottom());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:102:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:105:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:108:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:110:0x02f6 A[PHI: r0
  0x02f6: PHI (r0v10 int) = (r0v9 int), (r0v16 int), (r0v16 int) binds: [B:99:0x02c1, B:86:0x0282, B:97:0x02a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:112:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:114:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:117:0x030a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:83:0x0245  */
    /* JADX WARN: Code duplicated, block: B:85:0x0280  */
    /* JADX WARN: Code duplicated, block: B:87:0x0284  */
    /* JADX WARN: Code duplicated, block: B:89:0x0288  */
    /* JADX WARN: Code duplicated, block: B:92:0x0299  */
    /* JADX WARN: Code duplicated, block: B:95:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:96:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:98:0x02bd  */
    /* JADX WARN: Instruction removed from duplicated block: B:83:0x0245, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static int measureLayout(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, boolean z2) {
        int i9;
        int iColumnCount;
        ResponsiveUIModel responsiveUIModelChooseMargin;
        int dimensionPixelOffset;
        boolean z3;
        ?? r1;
        int i10;
        int i11;
        char c2;
        MarginType marginType = i4 == 1 ? MarginType.MARGIN_SMALL : MarginType.MARGIN_LARGE;
        Rect rect = sRect;
        view.getWindowVisibleDisplayFrame(rect);
        boolean z4 = i3 == 1 || i3 == 2;
        int iJ = ifk.j(view.getContext());
        int iMax = Math.max(i8, 0);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (size <= 0 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            if (DEBUG) {
                Log.d(TAG, "Skip measure because of parent measure unspecific: widthSize = " + size + "widthMode = " + mode);
            }
            return i;
        }
        if (DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("\npaddingFlag = ");
            sb.append(i4 == 0 ? "large margin" : "small margin");
            sb.append("\n isAddPadding = ");
            sb.append(z4);
            sb.append("\n typeFlag = ");
            sb.append(i3);
            sb.append("\n screen width = ");
            sb.append(iMax);
            sb.append("\n parent width = ");
            sb.append(size);
            sb.append("\n widthMode = ");
            sb.append(mode);
            sb.append("\n widthSize = ");
            sb.append(size);
            sb.append("\n getScreenHeightMetrics = ");
            sb.append(ifk.j(view.getContext()));
            sb.append("\n sRect.height() = ");
            sb.append(rect.height());
            sb.append("\n windowHeight = ");
            sb.append(iJ);
            sb.append("\n requestGridNumber = ");
            i9 = i2;
            sb.append(i9);
            Log.d(TAG, sb.toString());
        } else {
            i9 = i2;
        }
        boolean z5 = z || z2;
        if (z5 && isLargeScreen(view.getContext(), iMax, iJ)) {
            responsiveUIModelChooseMargin = new ResponsiveUIModel(view.getContext(), size, iJ).chooseMargin(marginType);
            iColumnCount = responsiveUIModelChooseMargin.columnCount();
        } else {
            ResponsiveUIModel responsiveUIModelChooseMargin2 = new ResponsiveUIModel(view.getContext(), size, iJ).chooseMargin(marginType);
            iColumnCount = i9;
            responsiveUIModelChooseMargin = responsiveUIModelChooseMargin2;
        }
        int iColumnCount2 = responsiveUIModelChooseMargin.columnCount();
        int childLayerDefaultTypeMargin = (z5 && i3 == 0) ? getChildLayerDefaultTypeMargin(view.getContext(), size, iJ) : responsiveUIModelChooseMargin.margin();
        int defaultGridNumbers = iColumnCount == -1 ? getDefaultGridNumbers(responsiveUIModelChooseMargin) : Math.min(iColumnCount, iColumnCount2);
        if (z4) {
            dimensionPixelOffset = i3 == 1 ? view.getContext().getResources().getDimensionPixelOffset(R$dimen.grid_list_special_padding) : view.getContext().getResources().getDimensionPixelOffset(R$dimen.grid_card_special_padding);
        } else {
            dimensionPixelOffset = 0;
        }
        if (DEBUG) {
            Log.d(TAG, "\nisParentChildHierarchy = " + z + "\n isActivityEmbedded = " + z2 + "\n isInPCMode = " + z5 + "\n isLargeScreen = " + isLargeScreen(view.getContext(), iMax, iJ) + "\n columnCount = " + iColumnCount2 + "\n margin = " + childLayerDefaultTypeMargin + "\n grid number = " + defaultGridNumbers + "\n special padding = " + dimensionPixelOffset);
        }
        float fCalculateWidth = calculateWidth(responsiveUIModelChooseMargin, defaultGridNumbers, dimensionPixelOffset, z4);
        float[] fArr = new float[2];
        calculatePadding(responsiveUIModelChooseMargin, defaultGridNumbers, dimensionPixelOffset, z4, fArr);
        if (DEBUG) {
            Log.d(TAG, "\nBefore verify, contentWidth = " + fCalculateWidth + "\n padding left = " + fArr[0] + " padding right = " + fArr[1]);
        }
        int i12 = childLayerDefaultTypeMargin * 2;
        float f = size - i12;
        if (fCalculateWidth > f || (z5 && i3 == 0)) {
            if (DEBUG) {
                Log.d(TAG, "measureLayoutWithPercent: " + size + " " + i12);
            }
            fCalculateWidth = f;
        }
        int i13 = (iColumnCount2 - defaultGridNumbers) / 2;
        if (!z5 || i3 != 2) {
            z3 = false;
            if (z5 && i3 == 0) {
                float f2 = childLayerDefaultTypeMargin;
                fArr[1] = f2;
                fArr[0] = f2;
            } else if (fArr[0] + fArr[1] + responsiveUIModelChooseMargin.width(i13, (i13 + defaultGridNumbers) - 1) > size) {
                if (z4) {
                    childLayerDefaultTypeMargin -= dimensionPixelOffset;
                }
                float f3 = childLayerDefaultTypeMargin;
                fArr[1] = f3;
                r1 = 0;
                fArr[0] = f3;
            } else {
                r1 = 0;
            }
            if (DEBUG) {
                Log.d(TAG, "\nAfter verify, contentWidth = " + fCalculateWidth + "\n padding left = " + fArr[r1] + " padding right = " + fArr[1] + "\n grid position from " + i13 + " to " + ((i13 + defaultGridNumbers) - 1));
            }
            if (defaultGridNumbers > 0) {
                i10 = i5;
                if (i10 != 0) {
                    i11 = 1;
                } else {
                    if (DEBUG) {
                        Log.d(TAG, "Padding mode");
                    }
                    if (view.getPaddingLeft() == fArr[0]) {
                        c2 = 1;
                        if (view.getPaddingRight() != fArr[1]) {
                            i11 = 1;
                        }
                    } else {
                        c2 = 1;
                    }
                    view.setPadding((int) fArr[0], view.getPaddingTop(), (int) fArr[c2], view.getPaddingBottom());
                    i11 = 1;
                }
            } else {
                i10 = i5;
                if (i10 == 0) {
                    if (DEBUG) {
                        Log.d(TAG, "Exception Padding mode");
                    }
                    if (view.getPaddingLeft() == fArr[0]) {
                        i11 = 1;
                        if (view.getPaddingRight() != fArr[1]) {
                        }
                    } else {
                        i11 = 1;
                    }
                    view.setPadding(i6, view.getPaddingTop(), i7, view.getPaddingBottom());
                } else {
                    i11 = 1;
                }
            }
            if (i10 == i11) {
                return i;
            }
            if (DEBUG) {
                Log.d(TAG, "Remeasure mode");
            }
            return View.MeasureSpec.makeMeasureSpec((int) fCalculateWidth, 1073741824);
        }
        float f4 = childLayerDefaultTypeMargin - dimensionPixelOffset;
        z3 = false;
        fArr[0] = f4;
        fArr[1] = f4;
        r1 = z3;
        if (DEBUG) {
            Log.d(TAG, "\nAfter verify, contentWidth = " + fCalculateWidth + "\n padding left = " + fArr[r1] + " padding right = " + fArr[1] + "\n grid position from " + i13 + " to " + ((i13 + defaultGridNumbers) - 1));
        }
        if (defaultGridNumbers > 0) {
            i10 = i5;
            if (i10 != 0) {
                i11 = 1;
            } else {
                if (DEBUG) {
                    Log.d(TAG, "Padding mode");
                }
                if (view.getPaddingLeft() == fArr[0]) {
                    c2 = 1;
                    if (view.getPaddingRight() != fArr[1]) {
                        i11 = 1;
                    }
                } else {
                    c2 = 1;
                }
                view.setPadding((int) fArr[0], view.getPaddingTop(), (int) fArr[c2], view.getPaddingBottom());
                i11 = 1;
            }
        } else {
            i10 = i5;
            if (i10 == 0) {
                if (DEBUG) {
                    Log.d(TAG, "Exception Padding mode");
                }
                if (view.getPaddingLeft() == fArr[0]) {
                    i11 = 1;
                    if (view.getPaddingRight() != fArr[1]) {
                    }
                } else {
                    i11 = 1;
                }
                view.setPadding(i6, view.getPaddingTop(), i7, view.getPaddingBottom());
            } else {
                i11 = 1;
            }
        }
        if (i10 == i11) {
            return i;
        }
        if (DEBUG) {
            Log.d(TAG, "Remeasure mode");
        }
        return View.MeasureSpec.makeMeasureSpec((int) fCalculateWidth, 1073741824);
    }

    public static void setDebug(boolean z) {
        DEBUG = z;
    }

    public static boolean isLargeScreen(Context context, int i, int i2) {
        return WindowTotalSizeClass.INSTANCE.fromWidthAndHeight(context, i, i2) == WindowTotalSizeClass.Expanded;
    }

    public static boolean isLargeScreenDp(int i, int i2) {
        return WindowTotalSizeClass.INSTANCE.fromWidthAndHeight(new Dp((float) i), new Dp((float) i2)) == WindowTotalSizeClass.Expanded;
    }

    public static boolean isMediumScreen(Context context, int i, int i2) {
        WindowTotalSizeClass windowTotalSizeClassFromWidthAndHeight = WindowTotalSizeClass.INSTANCE.fromWidthAndHeight(context, i, i2);
        return windowTotalSizeClassFromWidthAndHeight == WindowTotalSizeClass.MediumPortrait || windowTotalSizeClassFromWidthAndHeight == WindowTotalSizeClass.MediumLandScape || windowTotalSizeClassFromWidthAndHeight == WindowTotalSizeClass.MediumSquare || windowTotalSizeClassFromWidthAndHeight == WindowTotalSizeClass.ExpandedPortrait || windowTotalSizeClassFromWidthAndHeight == WindowTotalSizeClass.ExpandedLandPortrait;
    }

    @Deprecated
    public static boolean isMediumScreenDp(Context context, int i) {
        float f = i;
        return WindowSizeClass.INSTANCE.calculateFromSize(new Dp(f), new Dp(f)).getWindowWidthSizeClass() == WindowWidthSizeClass.Medium;
    }

    @Deprecated
    public static boolean isSmallScreenDp(Context context, int i) {
        float f = i;
        return WindowSizeClass.INSTANCE.calculateFromSize(new Dp(f), new Dp(f)).getWindowWidthSizeClass() == WindowWidthSizeClass.Compact;
    }

    public static int getChildLayerDefaultTypeMargin(Context context, int i, int i2) {
        float f;
        float f2;
        if (isLargeScreen(context, i, i2)) {
            f = context.getResources().getDisplayMetrics().density;
            f2 = 40.0f;
        } else {
            f = context.getResources().getDisplayMetrics().density;
            f2 = 24.0f;
        }
        return (int) (f * f2);
    }

    @Deprecated
    public static boolean isLargeScreenDp(Context context, int i) {
        float f = i;
        return WindowSizeClass.INSTANCE.calculateFromSize(new Dp(f), new Dp(f)).getWindowWidthSizeClass() == WindowWidthSizeClass.Expanded;
    }

    public static boolean isMediumScreenDp(int i, int i2) {
        WindowTotalSizeClass windowTotalSizeClassFromWidthAndHeight = WindowTotalSizeClass.INSTANCE.fromWidthAndHeight(new Dp(i), new Dp(i2));
        return windowTotalSizeClassFromWidthAndHeight == WindowTotalSizeClass.MediumPortrait || windowTotalSizeClassFromWidthAndHeight == WindowTotalSizeClass.MediumLandScape || windowTotalSizeClassFromWidthAndHeight == WindowTotalSizeClass.MediumSquare || windowTotalSizeClassFromWidthAndHeight == WindowTotalSizeClass.ExpandedPortrait;
    }

    @Deprecated
    public static float calculateWidth(float f, int i, int i2, int i3, Context context) {
        return calculateWidth(f, context instanceof Activity ? getScreenPhysicalHeight((Activity) context) : 0, i, i2, i3, context);
    }

    public static float calculateWidth(float f, float f2, int i, int i2, int i3, Context context) {
        int dimensionPixelOffset;
        MarginType marginType = i3 == 1 ? MarginType.MARGIN_SMALL : MarginType.MARGIN_LARGE;
        boolean z = i2 == 1 || i2 == 2;
        ResponsiveUIModel responsiveUIModelChooseMargin = new ResponsiveUIModel(context, (int) f, (int) f2).chooseMargin(marginType);
        int iMargin = responsiveUIModelChooseMargin.margin();
        int iColumnCount = responsiveUIModelChooseMargin.columnCount();
        if (DEBUG) {
            Log.d(TAG, "calculateWidth: responsiveUIProxy.columnCount() = " + responsiveUIModelChooseMargin.columnCount() + " gridNumber = " + i + " screenSize = " + f);
        }
        int defaultGridNumbers = i == -1 ? getDefaultGridNumbers(responsiveUIModelChooseMargin) : Math.min(i, iColumnCount);
        float fCalculateGridWidth = responsiveUIModelChooseMargin.calculateGridWidth(defaultGridNumbers);
        if (DEBUG) {
            Log.d(TAG, "calculateWidth = " + fCalculateGridWidth + " gridNumber = " + defaultGridNumbers + " getColumnsCount = " + responsiveUIModelChooseMargin.columnCount() + " width = " + fCalculateGridWidth + " margin = " + iMargin + " screenWidth = " + f + " columnWidth = " + Arrays.toString(responsiveUIModelChooseMargin.columnWidth()) + " typeFlag = " + i2 + "isAddPadding = " + z);
        }
        if (!z) {
            dimensionPixelOffset = 0;
        } else if (i2 == 1) {
            dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R$dimen.grid_list_special_padding);
        } else {
            dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R$dimen.grid_card_special_padding);
        }
        return fCalculateGridWidth + ((z ? dimensionPixelOffset : 0) * 2);
    }

    @Deprecated
    public static int measureLayout(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, boolean z2) {
        return measureLayout(view, i, i3, i4, i5, i6, i7, i8, i9, z, z2);
    }
}
