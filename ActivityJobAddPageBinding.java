// Generated by view binder compiler. Do not edit!
package com.example.usersidelab.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.usersidelab.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityJobAddPageBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final EditText Entercompname;

  @NonNull
  public final Button backbutton;

  @NonNull
  public final EditText enterSalary;

  @NonNull
  public final EditText enterjobtitle;

  @NonNull
  public final EditText enterjobtype;

  @NonNull
  public final EditText entershift;

  @NonNull
  public final EditText jobbenifits;

  @NonNull
  public final EditText jobdescrip;

  @NonNull
  public final EditText joblocation;

  @NonNull
  public final Button submitbutton;

  private ActivityJobAddPageBinding(@NonNull ScrollView rootView, @NonNull EditText Entercompname,
      @NonNull Button backbutton, @NonNull EditText enterSalary, @NonNull EditText enterjobtitle,
      @NonNull EditText enterjobtype, @NonNull EditText entershift, @NonNull EditText jobbenifits,
      @NonNull EditText jobdescrip, @NonNull EditText joblocation, @NonNull Button submitbutton) {
    this.rootView = rootView;
    this.Entercompname = Entercompname;
    this.backbutton = backbutton;
    this.enterSalary = enterSalary;
    this.enterjobtitle = enterjobtitle;
    this.enterjobtype = enterjobtype;
    this.entershift = entershift;
    this.jobbenifits = jobbenifits;
    this.jobdescrip = jobdescrip;
    this.joblocation = joblocation;
    this.submitbutton = submitbutton;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityJobAddPageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityJobAddPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_job_add_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityJobAddPageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Entercompname;
      EditText Entercompname = ViewBindings.findChildViewById(rootView, id);
      if (Entercompname == null) {
        break missingId;
      }

      id = R.id.backbutton;
      Button backbutton = ViewBindings.findChildViewById(rootView, id);
      if (backbutton == null) {
        break missingId;
      }

      id = R.id.enterSalary;
      EditText enterSalary = ViewBindings.findChildViewById(rootView, id);
      if (enterSalary == null) {
        break missingId;
      }

      id = R.id.enterjobtitle;
      EditText enterjobtitle = ViewBindings.findChildViewById(rootView, id);
      if (enterjobtitle == null) {
        break missingId;
      }

      id = R.id.enterjobtype;
      EditText enterjobtype = ViewBindings.findChildViewById(rootView, id);
      if (enterjobtype == null) {
        break missingId;
      }

      id = R.id.entershift;
      EditText entershift = ViewBindings.findChildViewById(rootView, id);
      if (entershift == null) {
        break missingId;
      }

      id = R.id.jobbenifits;
      EditText jobbenifits = ViewBindings.findChildViewById(rootView, id);
      if (jobbenifits == null) {
        break missingId;
      }

      id = R.id.jobdescrip;
      EditText jobdescrip = ViewBindings.findChildViewById(rootView, id);
      if (jobdescrip == null) {
        break missingId;
      }

      id = R.id.joblocation;
      EditText joblocation = ViewBindings.findChildViewById(rootView, id);
      if (joblocation == null) {
        break missingId;
      }

      id = R.id.submitbutton;
      Button submitbutton = ViewBindings.findChildViewById(rootView, id);
      if (submitbutton == null) {
        break missingId;
      }

      return new ActivityJobAddPageBinding((ScrollView) rootView, Entercompname, backbutton,
          enterSalary, enterjobtitle, enterjobtype, entershift, jobbenifits, jobdescrip,
          joblocation, submitbutton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
