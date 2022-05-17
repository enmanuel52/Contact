// Generated by view binder compiler. Do not edit!
package com.example.contact.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.contact.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAddBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Toolbar addToolbar;

  @NonNull
  public final TextInputLayout etLayoutName;

  @NonNull
  public final TextInputEditText etName;

  @NonNull
  public final TextInputEditText etNumber;

  private FragmentAddBinding(@NonNull ConstraintLayout rootView, @NonNull Toolbar addToolbar,
      @NonNull TextInputLayout etLayoutName, @NonNull TextInputEditText etName,
      @NonNull TextInputEditText etNumber) {
    this.rootView = rootView;
    this.addToolbar = addToolbar;
    this.etLayoutName = etLayoutName;
    this.etName = etName;
    this.etNumber = etNumber;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAddBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAddBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_add, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAddBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addToolbar;
      Toolbar addToolbar = ViewBindings.findChildViewById(rootView, id);
      if (addToolbar == null) {
        break missingId;
      }

      id = R.id.etLayoutName;
      TextInputLayout etLayoutName = ViewBindings.findChildViewById(rootView, id);
      if (etLayoutName == null) {
        break missingId;
      }

      id = R.id.etName;
      TextInputEditText etName = ViewBindings.findChildViewById(rootView, id);
      if (etName == null) {
        break missingId;
      }

      id = R.id.etNumber;
      TextInputEditText etNumber = ViewBindings.findChildViewById(rootView, id);
      if (etNumber == null) {
        break missingId;
      }

      return new FragmentAddBinding((ConstraintLayout) rootView, addToolbar, etLayoutName, etName,
          etNumber);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
