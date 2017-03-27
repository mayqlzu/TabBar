package com.mayqlzu.android.customview.tabbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by mayq on 17-3-27.
 * this is a compound view demo, extends from LinearLayout.
 * todo: change tab background/image/textColor when click
 */
public class TabBar extends LinearLayout {
    private LinearLayout ll_tab0;
    private LinearLayout ll_tab1;
    private LinearLayout ll_tab2;

    public TabBar(Context context, AttributeSet attrs) {
        super(context, attrs);

        setOrientation(LinearLayout.HORIZONTAL);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.tab_bar, this);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

        ll_tab0 = (LinearLayout) getChildAt(0);
        ll_tab1 = (LinearLayout) getChildAt(1);
        ll_tab2 = (LinearLayout) getChildAt(2);


        ll_tab0.setOnClickListener(new OnClickListener(0));
        ll_tab1.setOnClickListener(new OnClickListener(1));
        ll_tab2.setOnClickListener(new OnClickListener(2));
    }

    private class OnClickListener implements View.OnClickListener {
        private int index;

        public OnClickListener(int index) {
            this.index = index;
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(v.getContext(), "you clicked tab" + index, Toast.LENGTH_SHORT).show();
        }
    }

}
