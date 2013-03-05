package jp.yokomac.android.sherlock.proton.app;

import android.os.Bundle;

import com.actionbarsherlock.app.SherlockFragment;

import proton.inject.Proton;

/**
 * Proton injection integrated sherlock fragment.
 *
 * @see ProtonSherlockFragment
 * @author KeithYokoma
 */
public class ProtonSherlockFragment extends SherlockFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Proton.getInjector(getActivity()).inject(this);
    }
}