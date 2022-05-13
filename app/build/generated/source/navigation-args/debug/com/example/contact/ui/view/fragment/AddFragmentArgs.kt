package com.example.contact.ui.view.fragment

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.jvm.JvmStatic

public data class AddFragmentArgs(
  public val id: Int = -1
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("id", this.id)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("id", this.id)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): AddFragmentArgs {
      bundle.setClassLoader(AddFragmentArgs::class.java.classLoader)
      val __id : Int
      if (bundle.containsKey("id")) {
        __id = bundle.getInt("id")
      } else {
        __id = -1
      }
      return AddFragmentArgs(__id)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): AddFragmentArgs {
      val __id : Int?
      if (savedStateHandle.contains("id")) {
        __id = savedStateHandle["id"]
        if (__id == null) {
          throw IllegalArgumentException("Argument \"id\" of type integer does not support null values")
        }
      } else {
        __id = -1
      }
      return AddFragmentArgs(__id)
    }
  }
}
