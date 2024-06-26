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

public final class ActivityProjectdetailPageBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Button addButton;

  @NonNull
  public final Button backbutton;

  @NonNull
  public final LinearLayout container;

  @NonNull
  public final Button experiencesave;

  @NonNull
  public final EditText projectdetails;

  @NonNull
  public final EditText projectname;

  @NonNull
  public final EditText skillsused;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final EditText url;

  private ActivityProjectdetailPageBinding(@NonNull ScrollView rootView, @NonNull Button addButton,
      @NonNull Button backbutton, @NonNull LinearLayout container, @NonNull Button experiencesave,
      @NonNull EditText projectdetails, @NonNull EditText projectname, @NonNull EditText skillsused,
      @NonNull TextView textView2, @NonNull EditText url) {
    this.rootView = rootView;
    this.addButton = addButton;
    this.backbutton = backbutton;
    this.container = container;
    this.experiencesave = experiencesave;
    this.projectdetails = projectdetails;
    this.projectname = projectname;
    this.skillsused = skillsused;
    this.textView2 = textView2;
    this.url = url;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityProjectdetailPageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityProjectdetailPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_projectdetail_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityProjectdetailPageBinding bind(@NonNull View rootView) {
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

      id = R.id.experiencesave;
      Button experiencesave = ViewBindings.findChildViewById(rootView, id);
      if (experiencesave == null) {
        break missingId;
      }

      id = R.id.projectdetails;
      EditText projectdetails = ViewBindings.findChildViewById(rootView, id);
      if (projectdetails == null) {
        break missingId;
      }

      id = R.id.projectname;
      EditText projectname = ViewBindings.findChildViewById(rootView, id);
      if (projectname == null) {
        break missingId;
      }

      id = R.id.skillsused;
      EditText skillsused = ViewBindings.findChildViewById(rootView, id);
      if (skillsused == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.url;
      EditText url = ViewBindings.findChildViewById(rootView, id);
      if (url == null) {
        break missingId;
      }

      return new ActivityProjectdetailPageBinding((ScrollView) rootView, addButton, backbutton,
          container, experiencesave, projectdetails, projectname, skillsused, textView2, url);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
