// Generated by view binder compiler. Do not edit!
package com.example.companylab.databinding;

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
import com.example.companylab.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class HomeitemlayoutBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView itemjobname;

  @NonNull
  public final TextView itemtype;

  @NonNull
  public final LinearLayout userviewjob;

  private HomeitemlayoutBinding(@NonNull CardView rootView, @NonNull TextView itemjobname,
      @NonNull TextView itemtype, @NonNull LinearLayout userviewjob) {
    this.rootView = rootView;
    this.itemjobname = itemjobname;
    this.itemtype = itemtype;
    this.userviewjob = userviewjob;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static HomeitemlayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static HomeitemlayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.homeitemlayout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static HomeitemlayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.itemjobname;
      TextView itemjobname = ViewBindings.findChildViewById(rootView, id);
      if (itemjobname == null) {
        break missingId;
      }

      id = R.id.itemtype;
      TextView itemtype = ViewBindings.findChildViewById(rootView, id);
      if (itemtype == null) {
        break missingId;
      }

      id = R.id.userviewjob;
      LinearLayout userviewjob = ViewBindings.findChildViewById(rootView, id);
      if (userviewjob == null) {
        break missingId;
      }

      return new HomeitemlayoutBinding((CardView) rootView, itemjobname, itemtype, userviewjob);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
