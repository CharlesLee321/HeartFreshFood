package com.charles.heartfreshfood.views;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.Fragment;

import com.charles.heartfreshfood.R;
import com.charles.heartfreshfood.views.cart.CartFragment;
import com.charles.heartfreshfood.views.community.CommunityFragment;
import com.charles.heartfreshfood.views.home.HomeFragment;
import com.charles.heartfreshfood.views.map.MapFragment;
import com.charles.heartfreshfood.views.user.UserFragment;

/**
 * 底部导航栏
 * 以此加载五个子页面
 */
public class MainButtomActivity extends FragmentActivity {
    /*首页*/
    private HomeFragment homeFragment;
    /*购物车*/
    private CartFragment cartFragment;
    /*地图*/
    private MapFragment mapFragment;
    /*社区*/
    private CommunityFragment communityFragment;
    /*用户*/
    private UserFragment userFragment;
    /*页面数组*/
    private Fragment[] fragmentSet = {homeFragment,cartFragment,mapFragment,
          communityFragment,userFragment};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_buttom);
    }
}
