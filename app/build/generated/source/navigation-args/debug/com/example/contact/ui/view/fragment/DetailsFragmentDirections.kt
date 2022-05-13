package com.example.contact.ui.view.fragment

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.contact.R
import kotlin.Int

public class DetailsFragmentDirections private constructor() {
  private data class ActionDetailsFragmentToAddFragment(
    public val id: Int = -1
  ) : NavDirections {
    public override val actionId: Int = R.id.action_detailsFragment_to_addFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putInt("id", this.id)
        return result
      }
  }

  public companion object {
    public fun actionDetailsFragmentToAddFragment(id: Int = -1): NavDirections =
        ActionDetailsFragmentToAddFragment(id)
  }
}
