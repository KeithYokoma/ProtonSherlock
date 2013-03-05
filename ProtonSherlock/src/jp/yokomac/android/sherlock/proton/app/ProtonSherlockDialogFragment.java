package jp.yokomac.android.sherlock.proton.app;

import android.os.Bundle;

import com.actionbarsherlock.app.SherlockDialogFragment;

import proton.inject.Proton;

/**
 * Proton injection integrated sherlock dialog fragment.
 *
 * @see SherlockDialogFragment
 * @author KeithYokoma
 */
public class ProtonSherlockDialogFragment extends SherlockDialogFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Proton.getInjector(getActivity()).inject(this);
    }
}