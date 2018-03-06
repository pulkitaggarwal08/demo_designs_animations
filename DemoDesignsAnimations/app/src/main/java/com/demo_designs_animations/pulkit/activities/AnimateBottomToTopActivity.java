package com.demo_designs_animations.pulkit.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.demo_designs_animations.pulkit.R;

/**
 * Created by pulkit on 22/1/18.
 */

public class AnimateBottomToTopActivity extends AppCompatActivity {

    private RelativeLayout relativeLayout;
    private ImageView imageOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animate_bottom_to_top);

        findIds();
        init();

    }

    private void findIds() {

        relativeLayout = (RelativeLayout) findViewById(R.id.rl_layout);
        imageOne = (ImageView) findViewById(R.id.image_one);

    }

    private void init() {

        startAnimations();
    }

    private void startAnimations() {

        /*anim.alpha is used to fade the image in animation*/
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.alpha);
        anim.reset();

        /*Animate the full layout for looks good*/
        relativeLayout.clearAnimation();
        relativeLayout.startAnimation(anim);

        /*anim.bottom_to_top is used to animate the image from bottom to top*/
        anim = AnimationUtils.loadAnimation(this, R.anim.bottom_to_top);
        anim.reset();

        imageOne.clearAnimation();
        imageOne.startAnimation(anim);

    }

}
