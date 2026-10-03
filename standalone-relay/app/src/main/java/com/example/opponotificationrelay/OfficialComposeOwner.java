package com.example.opponotificationrelay;
import android.app.Activity;
import androidx.lifecycle.*;
import androidx.savedstate.*;
/** Own the original Compose window recomposer at the Activity decor root. */
final class OfficialComposeOwner implements SavedStateRegistryOwner {
 private final LifecycleRegistry lifecycle=new LifecycleRegistry(this);
 private final SavedStateRegistryController controller=SavedStateRegistryController.create(this);
 OfficialComposeOwner(Activity activity){controller.performAttach();controller.performRestore(null);ViewTreeLifecycleOwner.set(activity.getWindow().getDecorView(),this);ViewTreeSavedStateRegistryOwner.set(activity.getWindow().getDecorView(),this);state("CREATED");}
 public Lifecycle getLifecycle(){return lifecycle;}
 public SavedStateRegistry getSavedStateRegistry(){return controller.getSavedStateRegistry();}
 void state(String state){OfficialChartSupport.enumOption(lifecycle,"setCurrentState","androidx.lifecycle.Lifecycle$State",state);}
}
