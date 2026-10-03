package androidx.recyclerview.widget;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public class MultipleChoiceDragSelectionProcessor implements MultipleChoiceDragSelectTouchListener.OnAdvancedDragSelectListener {
    private boolean firstWasSelected;
    private HashSet<Integer> originalSelection;
    private ISelectionHandler selectionHandler;
    private boolean checkSelectionState = false;
    private ModeType mModeType = ModeType.Simple;
    private ISelectionStartFinishedListener startFinishedListener = null;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.MultipleChoiceDragSelectionProcessor$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$recyclerview$widget$MultipleChoiceDragSelectionProcessor$ModeType;

        static {
            int[] iArr = new int[ModeType.values().length];
            $SwitchMap$androidx$recyclerview$widget$MultipleChoiceDragSelectionProcessor$ModeType = iArr;
            try {
                iArr[ModeType.Simple.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$recyclerview$widget$MultipleChoiceDragSelectionProcessor$ModeType[ModeType.ToggleAndUndo.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$recyclerview$widget$MultipleChoiceDragSelectionProcessor$ModeType[ModeType.FirstItemDependent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$recyclerview$widget$MultipleChoiceDragSelectionProcessor$ModeType[ModeType.FirstItemDependentToggleAndUndo.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface ISelectionHandler {
        Set<Integer> getSelection();

        boolean isSelected(int i);

        void updateSelection(int i, int i2, boolean z, boolean z2);
    }

    public interface ISelectionStartFinishedListener {
        void onSelectionFinished(int i);

        void onSelectionStarted(int i, boolean z);
    }

    public enum ModeType {
        Simple,
        ToggleAndUndo,
        FirstItemDependent,
        FirstItemDependentToggleAndUndo
    }

    public MultipleChoiceDragSelectionProcessor(ISelectionHandler iSelectionHandler) {
        this.selectionHandler = iSelectionHandler;
    }

    private void checkedUpdateSelection(int i, int i2, boolean z) {
        if (!this.checkSelectionState) {
            this.selectionHandler.updateSelection(i, i2, z, false);
            return;
        }
        while (i <= i2) {
            if (this.selectionHandler.isSelected(i) != z) {
                this.selectionHandler.updateSelection(i, i, z, false);
            }
            i++;
        }
    }

    @Override // androidx.recyclerview.widget.MultipleChoiceDragSelectTouchListener.OnDragSelectListener
    public void onSelectChange(int i, int i2, boolean z) {
        boolean zContains;
        int i3 = AnonymousClass1.$SwitchMap$androidx$recyclerview$widget$MultipleChoiceDragSelectionProcessor$ModeType[this.mModeType.ordinal()];
        boolean z2 = false;
        if (i3 == 1) {
            if (this.checkSelectionState) {
                checkedUpdateSelection(i, i2, z);
                return;
            } else {
                this.selectionHandler.updateSelection(i, i2, z, false);
                return;
            }
        }
        if (i3 == 2) {
            while (i <= i2) {
                boolean zContains2 = this.originalSelection.contains(Integer.valueOf(i));
                if (z) {
                    zContains2 = !zContains2;
                }
                checkedUpdateSelection(i, i, zContains2);
                i++;
            }
            return;
        }
        if (i3 == 3) {
            if (!z) {
                z2 = this.firstWasSelected;
            } else if (!this.firstWasSelected) {
                z2 = true;
            }
            checkedUpdateSelection(i, i2, z2);
            return;
        }
        if (i3 != 4) {
            return;
        }
        while (i <= i2) {
            if (z) {
                zContains = !this.firstWasSelected;
            } else {
                zContains = this.originalSelection.contains(Integer.valueOf(i));
            }
            checkedUpdateSelection(i, i, zContains);
            i++;
        }
    }

    @Override // androidx.recyclerview.widget.MultipleChoiceDragSelectTouchListener.OnAdvancedDragSelectListener
    public void onSelectionFinished(int i) {
        this.originalSelection = null;
        ISelectionStartFinishedListener iSelectionStartFinishedListener = this.startFinishedListener;
        if (iSelectionStartFinishedListener != null) {
            iSelectionStartFinishedListener.onSelectionFinished(i);
        }
    }

    @Override // androidx.recyclerview.widget.MultipleChoiceDragSelectTouchListener.OnAdvancedDragSelectListener
    public void onSelectionStarted(int i) {
        this.originalSelection = new HashSet<>();
        Set<Integer> selection = this.selectionHandler.getSelection();
        if (selection != null) {
            this.originalSelection.addAll(selection);
        }
        this.firstWasSelected = this.originalSelection.contains(Integer.valueOf(i));
        int i2 = AnonymousClass1.$SwitchMap$androidx$recyclerview$widget$MultipleChoiceDragSelectionProcessor$ModeType[this.mModeType.ordinal()];
        if (i2 == 1) {
            this.selectionHandler.updateSelection(i, i, true, true);
        } else if (i2 == 2) {
            this.selectionHandler.updateSelection(i, i, !this.originalSelection.contains(Integer.valueOf(i)), true);
        } else if (i2 == 3 || i2 == 4) {
            this.selectionHandler.updateSelection(i, i, !this.firstWasSelected, true);
        }
        ISelectionStartFinishedListener iSelectionStartFinishedListener = this.startFinishedListener;
        if (iSelectionStartFinishedListener != null) {
            iSelectionStartFinishedListener.onSelectionStarted(i, this.firstWasSelected);
        }
    }

    public MultipleChoiceDragSelectionProcessor setCheckSelectionState(boolean z) {
        this.checkSelectionState = z;
        return this;
    }

    public MultipleChoiceDragSelectionProcessor setModeType(ModeType modeType) {
        this.mModeType = modeType;
        return this;
    }

    public MultipleChoiceDragSelectionProcessor withStartFinishedListener(ISelectionStartFinishedListener iSelectionStartFinishedListener) {
        this.startFinishedListener = iSelectionStartFinishedListener;
        return this;
    }
}
