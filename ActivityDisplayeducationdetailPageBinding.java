// Generated by view binder compiler. Do not edit!
package com.example.usersidelab.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.usersidelab.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDisplayeducationdetailPageBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LinearLayout containereducation;

  @NonNull
  public final TextView displaycoursenamedetails;

  @NonNull
  public final TextView displaycoursespecificatindetails;

  @NonNull
  public final TextView displayend;

  @NonNull
  public final TextView displaygrades;

  @NonNull
  public final TextView displayinstitution;

  @NonNull
  public final TextView displaystart;

  private ActivityDisplayeducationdetailPageBinding(@NonNull ConstraintLayout rootView,
      @NonNull LinearLayout containereducation, @NonNull TextView displaycoursenamedetails,
      @NonNull TextView displaycoursespecificatindetails, @NonNull TextView displayend,
      @NonNull TextView displaygrades, @NonNull TextView displayinstitution,
      @NonNull TextView displaystart) {
    this.rootView = rootView;
    this.containereducation = containereducation;
    this.displaycoursenamedetails = displaycoursenamedetails;
    this.displaycoursespecificatindetails = displaycoursespecificatindetails;
    this.displayend = displayend;
    this.displaygrades = displaygrades;
    this.displayinstitution = displayinstitution;
    this.displaystart = displaystart;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDisplayeducationdetailPageBinding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDisplayeducationdetailPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_displayeducationdetail_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDisplayeducationdetailPageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.containereducation;
      LinearLayout containereducation = ViewBindings.findChildViewById(rootView, id);
      if (containereducation == null) {
        break missingId;
      }

      id = R.id.displaycoursenamedetails;
      TextView displaycoursenamedetails = ViewBindings.findChildViewById(rootView, id);
      if (displaycoursenamedetails == null) {
        break missingId;
      }

      id = R.id.displaycoursespecificatindetails;
      TextView displaycoursespecificatindetails = ViewBindings.findChildViewById(rootView, id);
      if (displaycoursespecificatindetails == null) {
        break missingId;
      }

      id = R.id.displayend;
      TextView displayend = ViewBindings.findChildViewById(rootView, id);
      if (displayend == null) {
        break missingId;
      }

      id = R.id.displaygrades;
      TextView displaygrades = ViewBindings.findChildViewById(rootView, id);
      if (displaygrades == null) {
        break missingId;
      }

      id = R.id.displayinstitution;
      TextView displayinstitution = ViewBindings.findChildViewById(rootView, id);
      if (displayinstitution == null) {
        break missingId;
      }

      id = R.id.displaystart;
      TextView displaystart = ViewBindings.findChildViewById(rootView, id);
      if (displaystart == null) {
        break missingId;
      }

      return new ActivityDisplayeducationdetailPageBinding((ConstraintLayout) rootView,
          containereducation, displaycoursenamedetails, displaycoursespecificatindetails,
          displayend, displaygrades, displayinstitution, displaystart);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}