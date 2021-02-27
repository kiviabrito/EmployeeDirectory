// Generated by view binder compiler. Do not edit!
package com.kiviabrito.employeedirectory.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.kiviabrito.employeedirectory.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MainFragmentEmployeeItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView employeeName;

  @NonNull
  public final ImageView employeePhoto;

  @NonNull
  public final TextView employeeTeam;

  private MainFragmentEmployeeItemBinding(@NonNull CardView rootView,
      @NonNull TextView employeeName, @NonNull ImageView employeePhoto,
      @NonNull TextView employeeTeam) {
    this.rootView = rootView;
    this.employeeName = employeeName;
    this.employeePhoto = employeePhoto;
    this.employeeTeam = employeeTeam;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static MainFragmentEmployeeItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MainFragmentEmployeeItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.main_fragment_employee_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MainFragmentEmployeeItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.employeeName;
      TextView employeeName = rootView.findViewById(id);
      if (employeeName == null) {
        break missingId;
      }

      id = R.id.employeePhoto;
      ImageView employeePhoto = rootView.findViewById(id);
      if (employeePhoto == null) {
        break missingId;
      }

      id = R.id.employeeTeam;
      TextView employeeTeam = rootView.findViewById(id);
      if (employeeTeam == null) {
        break missingId;
      }

      return new MainFragmentEmployeeItemBinding((CardView) rootView, employeeName, employeePhoto,
          employeeTeam);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}