package jp.yokomac.android.sherlock.proton.app;

import android.os.Bundle;

import com.actionbarsherlock.app.SherlockListFragment;

import proton.inject.Proton;

/**
 * Proton injection integrated sherlock list fragment.
 *
 * @see SherlockListFragment
 * @author KeithYokoma.
 */
public class ProtonSherlockListFragment extends SherlockListFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Proton.getInjector(getActivity()).inject(this);
    }
}