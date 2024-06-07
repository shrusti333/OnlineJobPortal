// Generated by view binder compiler. Do not edit!
package com.example.usersidelab.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.usersidelab.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ExperiencedetailitemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LinearLayout container;

  @NonNull
  public final EditText experiencecompanybame;

  @NonNull
  public final EditText experiencededignation;

  @NonNull
  public final EditText totalwokexperience;

  @NonNull
  public final EditText working;

  private ExperiencedetailitemBinding(@NonNull ConstraintLayout rootView,
      @NonNull LinearLayout container, @NonNull EditText experiencecompanybame,
      @NonNull EditText experiencededignation, @NonNull EditText totalwokexperience,
      @NonNull EditText working) {
    this.rootView = rootView;
    this.container = container;
    this.experiencecompanybame = experiencecompanybame;
    this.experiencededignation = experiencededignation;
    this.totalwokexperience = totalwokexperience;
    this.working = working;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ExperiencedetailitemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ExperiencedetailitemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.experiencedetailitem, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ExperiencedetailitemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.container;
      LinearLayout container = ViewBindings.findChildViewById(rootView, id);
      if (container == null) {
        break missingId;
      }

      id = R.id.experiencecompanybame;
      EditText experiencecompanybame = ViewBindings.findChildViewById(rootView, id);
      if (experiencecompanybame == null) {
        break missingId;
      }

      id = R.id.experiencededignation;
      EditText experiencededignation = ViewBindings.findChildViewById(rootView, id);
      if (experiencededignation == null) {
        break missingId;
      }

      id = R.id.totalwokexperience;
      EditText totalwokexperience = ViewBindings.findChildViewById(rootView, id);
      if (totalwokexperience == null) {
        break missingId;
      }

      id = R.id.working;
      EditText working = ViewBindings.findChildViewById(rootView, id);
      if (working == null) {
        break missingId;
      }

      return new ExperiencedetailitemBinding((ConstraintLayout) rootView, container,
          experiencecompanybame, experiencededignation, totalwokexperience, working);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}