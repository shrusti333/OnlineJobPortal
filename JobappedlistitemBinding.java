// Generated by view binder compiler. Do not edit!
package com.example.usersidelab.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.usersidelab.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class JobappedlistitemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final LinearLayout companyjobview;

  @NonNull
  public final TextView itemjobname;

  @NonNull
  public final TextView itemjobplace;

  @NonNull
  public final TextView itemsalary;

  @NonNull
  public final TextView itemshift;

  @NonNull
  public final TextView itemtype;

  private JobappedlistitemBinding(@NonNull CardView rootView, @NonNull LinearLayout companyjobview,
      @NonNull TextView itemjobname, @NonNull TextView itemjobplace, @NonNull TextView itemsalary,
      @NonNull TextView itemshift, @NonNull TextView itemtype) {
    this.rootView = rootView;
    this.companyjobview = companyjobview;
    this.itemjobname = itemjobname;
    this.itemjobplace = itemjobplace;
    this.itemsalary = itemsalary;
    this.itemshift = itemshift;
    this.itemtype = itemtype;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static JobappedlistitemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static JobappedlistitemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.jobappedlistitem, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static JobappedlistitemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.companyjobview;
      LinearLayout companyjobview = ViewBindings.findChildViewById(rootView, id);
      if (companyjobview == null) {
        break missingId;
      }

      id = R.id.itemjobname;
      TextView itemjobname = ViewBindings.findChildViewById(rootView, id);
      if (itemjobname == null) {
        break missingId;
      }

      id = R.id.itemjobplace;
      TextView itemjobplace = ViewBindings.findChildViewById(rootView, id);
      if (itemjobplace == null) {
        break missingId;
      }

      id = R.id.itemsalary;
      TextView itemsalary = ViewBindings.findChildViewById(rootView, id);
      if (itemsalary == null) {
        break missingId;
      }

      id = R.id.itemshift;
      TextView itemshift = ViewBindings.findChildViewById(rootView, id);
      if (itemshift == null) {
        break missingId;
      }

      id = R.id.itemtype;
      TextView itemtype = ViewBindings.findChildViewById(rootView, id);
      if (itemtype == null) {
        break missingId;
      }

      return new JobappedlistitemBinding((CardView) rootView, companyjobview, itemjobname,
          itemjobplace, itemsalary, itemshift, itemtype);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
