package com.developers.hand.second.navigationdrawerexercise;

import android.content.Context;
import android.support.constraint.ConstraintLayout;

import butterknife.ButterKnife;


public class Profile extends ConstraintLayout {

    public Profile(Context context) {
        super(context);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.view_profile, this);

            }
}
