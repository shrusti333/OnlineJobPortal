// Generated by view binder compiler. Do not edit!
package com.example.usersidelab.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.usersidelab.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityJobapplicantviewPageBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Button backbutton;

  @NonNull
  public final Button deletebutton;

  @NonNull
  public final TextView jobname;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final RecyclerView userRecycleView2;

  private ActivityJobapplicantviewPageBinding(@NonNull ScrollView rootView,
      @NonNull Button backbutton, @NonNull Button deletebutton, @NonNull TextView jobname,
      @NonNull LinearLayout linearLayout, @NonNull TextView textView2,
      @NonNull RecyclerView userRecycleView2) {
    this.rootView = rootView;
    this.backbutton = backbutton;
    this.deletebutton = deletebutton;
    this.jobname = jobname;
    this.linearLayout = linearLayout;
    this.textView2 = textView2;
    this.userRecycleView2 = userRecycleView2;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityJobapplicantviewPageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityJobapplicantviewPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_jobapplicantview_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityJobapplicantviewPageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backbutton;
      Button backbutton = ViewBindings.findChildViewById(rootView, id);
      if (backbutton == null) {
        break missingId;
      }

      id = R.id.deletebutton;
      Button deletebutton = ViewBindings.findChildViewById(rootView, id);
      if (deletebutton == null) {
        break missingId;
      }

      id = R.id.jobname;
      TextView jobname = ViewBindings.findChildViewById(rootView, id);
      if (jobname == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.userRecycleView2;
      RecyclerView userRecycleView2 = ViewBindings.findChildViewById(rootView, id);
      if (userRecycleView2 == null) {
        break missingId;
      }

      return new ActivityJobapplicantviewPageBinding((ScrollView) rootView, backbutton,
          deletebutton, jobname, linearLayout, textView2, userRecycleView2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
