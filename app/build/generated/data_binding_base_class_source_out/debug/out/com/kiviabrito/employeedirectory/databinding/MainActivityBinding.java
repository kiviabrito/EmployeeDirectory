// Generated by view binder compiler. Do not edit!
package com.kiviabrito.employeedirectory.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.kiviabrito.employeedirectory.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MainActivityBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final FrameLayout container;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final View progressBarBackground;

  private MainActivityBinding(@NonNull FrameLayout rootView, @NonNull FrameLayout container,
      @NonNull ProgressBar progressBar, @NonNull View progressBarBackground) {
    this.rootView = rootView;
    this.container = container;
    this.progressBar = progressBar;
    this.progressBarBackground = progressBarBackground;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MainActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MainActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.main_activity, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MainActivityBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.container;
      FrameLayout container = rootView.findViewById(id);
      if (container == null) {
        break missingId;
      }

      id = R.id.progress_bar;
      ProgressBar progressBar = rootView.findViewById(id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.progress_bar_background;
      View progressBarBackground = rootView.findViewById(id);
      if (progressBarBackground == null) {
        break missingId;
      }

      return new MainActivityBinding((FrameLayout) rootView, container, progressBar,
          progressBarBackground);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}