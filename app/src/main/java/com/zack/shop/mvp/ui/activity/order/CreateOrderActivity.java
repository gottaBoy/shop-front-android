package com.zack.shop.mvp.ui.activity.order;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.jess.arms.di.component.AppComponent;
import com.zack.shop.R;
import com.zack.shop.app.base.BaseSupportActivity;

public class CreateOrderActivity extends BaseSupportActivity {


    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {

    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_create_order;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

    }
}