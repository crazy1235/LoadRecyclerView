package com.jacksen.loadrecyclerview;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by jacksen on 2016/4/12.
 */
public class JackRecyclerView extends RecyclerView {

    private Context context;

    public JackRecyclerView(Context context) {
        this(context, null);
    }

    public JackRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init(context);
    }

    private void init(Context context) {
        this.context = context;
    }


    public void setRefreshHeaderView(@LayoutRes int refreshHeaderView) {
//        View headerView = LayoutInflater.from(getContext()).inflate(refreshHeaderView, )
    }

    public void setRefreshHeaderView(View refreshHeaderView){

    }

    public void setRefreshFooterView(@LayoutRes int refreshFooterView) {

    }

    public void setRefreshFooterView(View refreshFooterView){

    }

}
