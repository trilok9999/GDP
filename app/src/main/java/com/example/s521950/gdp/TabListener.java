package com.example.s521950.gdp;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;

//import android.app.ActionBar;
//import android.app.Fragment;
//import android.app.FragmentTransaction;
//
///**
// * Created by S521950 on 2/26/2015.
// */
//public class TabListener implements ActionBar.TabListener {
//    private Fragment fragment;
//
//    public TabListener(Fragment fragment){
//        this.fragment = fragment;
//    }
////    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft){
////        switch(tab.getPosition()){
////            case 0:
////                ft.add(R.id.fragment,Cricket,null);
////            case 1:
////                ft.add(R.id.fragment2,BasketBall,null);
////
////
////        }
////
////    }
//public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft){
//    ft.add(R.id.fragment, fragment, null);
//}
//    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
//    }
//    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
//        ft.remove(fragment);
//    }
//}
public  class TabListener<T extends Fragment> implements ActionBar.TabListener {

    private Fragment mFragment;
    private final Activity mActivity;
    private final String mTag;
    private final Class<T> mClass;

    public TabListener(Activity activity, String tag, Class<T> clz) {
        mActivity = activity;
        mTag = tag;
        mClass = clz;
    }



    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        if (mFragment == null) {
            mFragment = Fragment.instantiate(mActivity, mClass.getName());
            ft.add(android.R.id.content, mFragment, mTag);
        } else {
            ft.attach(mFragment);
        }
    }

    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
        if (mFragment != null) {
            ft.detach(mFragment);
        }
    }

    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
    }
}
