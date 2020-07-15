package com.cos.myapplication;



import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

//FragmentPagerAdapter => 모든 프레그먼트 메모리에 미리 로딩시켜둠. 소멸 안시킴.
//FragmentStatePagerAdapter => default 3, 자기를 포함한 양 옆만 메모리에 로딩
public class FragmentAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragmentList = new ArrayList<>();




    public FragmentAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    // FragmentList에 아이템 추가하는 함수 필요
    public void addFragment(Fragment fragment){
        fragmentList.add(fragment);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    // new할때 콜백됨
    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
