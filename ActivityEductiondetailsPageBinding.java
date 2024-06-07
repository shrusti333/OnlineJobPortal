// Generated by view binder compiler. Do not edit!
package com.example.usersidelab.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.usersidelab.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityEductiondetailsPageBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Button addButton;

  @NonNull
  public final Button backbutton;

  @NonNull
  public final LinearLayout container;

  @NonNull
  public final EditText courseNameEditText;

  @NonNull
  public final EditText courseendyearEditText;

  @NonNull
  public final EditText coursegradesEditText;

  @NonNull
  public final EditText courseinstituteNameEditText;

  @NonNull
  public final EditText coursespecificationEditText;

  @NonNull
  public final EditText coursestartrearEditText;

  @NonNull
  public final Button educationsave;

  @NonNull
  public final EditText graduationEditText;

  @NonNull
  public final TextView textView2;

  private ActivityEductiondetailsPageBinding(@NonNull ScrollView rootView,
      @NonNull Button addButton, @NonNull Button backbutton, @NonNull LinearLayout container,
      @NonNull EditText courseNameEditText, @NonNull EditText courseendyearEditText,
      @NonNull EditText coursegradesEditText, @NonNull EditText courseinstituteNameEditText,
      @NonNull EditText coursespecificationEditText, @NonNull EditText coursestartrearEditText,
      @NonNull Button educationsave, @NonNull EditText graduationEditText,
      @NonNull TextView textView2) {
    this.rootView = rootView;
    this.addButton = addButton;
    this.backbutton = backbutton;
    this.container = container;
    this.courseNameEditText = courseNameEditText;
    this.courseendyearEditText = courseendyearEditText;
    this.coursegradesEditText = coursegradesEditText;
    this.courseinstituteNameEditText = courseinstituteNameEditText;
    this.coursespecificationEditText = coursespecificationEditText;
    this.coursestartrearEditText = coursestartrearEditText;
    this.educationsave = educationsave;
    this.graduationEditText = graduationEditText;
    this.textView2 = textView2;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityEductiondetailsPageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityEductiondetailsPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_eductiondetails_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityEductiondetailsPageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addButton;
      Button addButton = ViewBindings.findChildViewById(rootView, id);
      if (addButton == null) {
        break missingId;
      }

      id = R.id.backbutton;
      Button backbutton = ViewBindings.findChildViewById(rootView, id);
      if (backbutton == null) {
        break missingId;
      }

      id = R.id.container;
      LinearLayout container = ViewBindings.findChildViewById(rootView, id);
      if (container == null) {
        break missingId;
      }

      id = R.id.courseNameEditText;
      EditText courseNameEditText = ViewBindings.findChildViewById(rootView, id);
      if (courseNameEditText == null) {
        break missingId;
      }

      id = R.id.courseendyearEditText;
      EditText courseendyearEditText = ViewBindings.findChildViewById(rootView, id);
      if (courseendyearEditText == null) {
        break missingId;
      }

      id = R.id.coursegradesEditText;
      EditText coursegradesEditText = ViewBindings.findChildViewById(rootView, id);
      if (coursegradesEditText == null) {
        break missingId;
      }

      id = R.id.courseinstituteNameEditText;
      EditText courseinstituteNameEditText = ViewBindings.findChildViewById(rootView, id);
      if (courseinstituteNameEditText == null) {
        break missingId;
      }

      id = R.id.coursespecificationEditText;
      EditText coursespecificationEditText = ViewBindings.findChildViewById(rootView, id);
      if (coursespecificationEditText == null) {
        break missingId;
      }

      id = R.id.coursestartrearEditText;
      EditText coursestartrearEditText = ViewBindings.findChildViewById(rootView, id);
      if (coursestartrearEditText == null) {
        break missingId;
      }

      id = R.id.educationsave;
      Button educationsave = ViewBindings.findChildViewById(rootView, id);
      if (educationsave == null) {
        break missingId;
      }

      id = R.id.graduationEditText;
      EditText graduationEditText = ViewBindings.findChildViewById(rootView, id);
      if (graduationEditText == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      return new ActivityEductiondetailsPageBinding((ScrollView) rootView, addButton, backbutton,
          container, courseNameEditText, courseendyearEditText, coursegradesEditText,
          courseinstituteNameEditText, coursespecificationEditText, coursestartrearEditText,
          educationsave, graduationEditText, textView2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
