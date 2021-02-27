// Generated by view binder compiler. Do not edit!
package com.kiviabrito.employeedirectory.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.kiviabrito.employeedirectory.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MainFragmentBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView employeeList;

  @NonNull
  public final ImageView emptyListIcon;

  @NonNull
  public final TextView emptyListMsg;

  @NonNull
  public final Group gpEmptyList;

  @NonNull
  public final ConstraintLayout main;

  private MainFragmentBinding(@NonNull ConstraintLayout rootView,
      @NonNull RecyclerView employeeList, @NonNull ImageView emptyListIcon,
      @NonNull TextView emptyListMsg, @NonNull Group gpEmptyList, @NonNull ConstraintLayout main) {
    this.rootView = rootView;
    this.employeeList = employeeList;
    this.emptyListIcon = emptyListIcon;
    this.emptyListMsg = emptyListMsg;
    this.gpEmptyList = gpEmptyList;
    this.main = main;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MainFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MainFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.main_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MainFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.employeeList;
      RecyclerView employeeList = rootView.findViewById(id);
      if (employeeList == null) {
        break missingId;
      }

      id = R.id.emptyListIcon;
      ImageView emptyListIcon = rootView.findViewById(id);
      if (emptyListIcon == null) {
        break missingId;
      }

      id = R.id.emptyListMsg;
      TextView emptyListMsg = rootView.findViewById(id);
      if (emptyListMsg == null) {
        break missingId;
      }

      id = R.id.gpEmptyList;
      Group gpEmptyList = rootView.findViewById(id);
      if (gpEmptyList == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      return new MainFragmentBinding((ConstraintLayout) rootView, employeeList, emptyListIcon,
          emptyListMsg, gpEmptyList, main);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}