package com.example.contact.ui.view.fragment

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.contact.R
import kotlin.Int

public class MainFragmentDirections private constructor() {
  private data class ActionMainFragmentToDetailsFragment(
    public val id: Int
  ) : NavDirections {
    public override val actionId: Int = R.id.action_mainFragment_to_detailsFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putInt("id", this.id)
        return result
      }
  }

  private data class ActionMainFragmentToAddFragment(
    public val id: Int = -1
  ) : NavDirections {
    public override val actionId: Int = R.id.action_mainFragment_to_addFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putInt("id", this.id)
        return result
      }
  }

  public companion object {
    public fun actionMainFragmentToDetailsFragment(id: Int): NavDirections =
        ActionMainFragmentToDetailsFragment(id)

    public fun actionMainFragmentToAddFragment(id: Int = -1): NavDirections =
        ActionMainFragmentToAddFragment(id)
  }
}
